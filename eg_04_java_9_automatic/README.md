
### Idea

* `com.acme.bids.app` depends on `com.acme.bids.service`
    * `com.acme.bids.app` depends on `spring.context` . That is, `spring.context` is used as an automatic module, with its dependencies residing on the classpath in the _unnamed module_.
* `com.acme.bids.service` depends on `com.acme.bids.db`
* `com.acme.bids.app` module defined [here](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/blob/master/eg_04_java_9_automatic/src/com.acme.bids.app/module-info.java)
* `com.acme.bids.service` module defined [here](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/blob/master/eg_04_java_9_automatic/src/com.acme.bids.service/module-info.java)
* `com.acme.bids.db` module defined [here](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/blob/master/eg_04_java_9_automatic/src/com.acme.bids.db/module-info.java)

### Validation

* 20-MAY-2017 - confirmed b170
* confirmed b169, b167

### Execution Steps

* `./prepare_build_run.sh`
    * `prepare` step will download jars from Maven Central
