# Exception Mapper library for jersey (server)
this plugins contains bunch of custom exceptions and **_`javax.ws.rs.ext.Provider`_**s for handling them for using in creating
REST APIs with `jersey` implementation of jax-rs.

### What problems will this library solve?
I always have two problems with creating REST APIs:

  * we have different situations which have same status response code.
    
    look at this example which the response status can be `401 (Unauthorized)` for all of them:
    * user forgot to send authorization token
    * the format of the token is wrong
    * the token is wrong
    * the token has been expired
    * the user is banned
    * other reasons
    
    with this library you have **_`types`_** align with status codes which helps you and client side developers to understand what went wrong. 
   
  * in some cases neither the client nor server developers knows for which property the error showed up.
  
    let me explain it with an example:
    consider the client side has to sent a JSON with this attributes:
    ```json
    {
        "json_value": `int`,
        "json_name": `String`,
        "json_id": `long`
    }
    ``` 
    
    what if your client keep getting 400 because of a wrong value he sending over and over?
    
    if you have a busy life and **"find what you need mostly when ever you need"** you probably have to simulate the 
    deployment environment to and debug your codes to find out it's not your fault.
    
    with this library you can tell your client which field(s) is/are wrong, needed, already existed and etc, you choose.
    
### Quick start
first you need to add this library as an dependency to your `org.glassfish.jersey` project:

  * for maven projects:
  ```xml
  <dependency>
      <groupId>com.github.metair.jersey</groupId>
      <artifactId>exception-mapper</artifactId>
      <version>1.0.1</version>
  </dependency>
  ```

  * for gradle projects:
  ```
  compile group: 'com.github.metair.jersey', name: 'exception-mapper', version: '1.0.1'
  ```

> **Note:** this library needs this to add runtime:
 `org.glassfish.jersey.core.jersey-server`
 `org.glassfish.jersey.media.jersey-media-json-jackson` <br>
 it does not contains this dependencies by it self so you have to provide them some how. <br>
 the thing is u probably have this dependencies already if you are creating some REST APIs by jersey (no matter if you are creating it with `spring-boot-starter-jersey` or `org.glassfish.jersey.bundle.jaxrs-ri`)
 
 
then you have to register the mapper classes in your `JereyConfigure.class` file (maybe your file has a different name) like below:

```java
@ApplicationPath("api")
public class JerseyConfiguration extends ResourceConfig {

    private final String packName = JerseyConfiguration.class.getPackage().getName();

    public JerseyConfiguration() {
        List<Class> list = new MapperBuilder()
                             // .all() this will add mappers to the list
                             // .except(Mappers.ALREADY_EXIST) this will remove AlreadyExisted exception mapper from the list
                                .fetch();
        
        for (Class klass : list) {
            register(klass);
        }
        
        /**
         * this to are also needed but you usually have them already
         * if your server works with JSONs
        */
        register(JacksonJaxbJsonProvider.class);
        register(JacksonFeature.class);
        

        packages(true, packName);
    }

}
```
 