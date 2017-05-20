
### Idea

* This example is similar to [eg_02_java_9_simple](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/tree/master/eg_02_java_9_simple) with the addition that we use the `jlink` tool to build a trimmed runtime.
* as before:
    * `com.acme.bids.app` depends on `com.acme.bids.service`
    * `com.acme.bids.service` depends on `com.acme.bids.db`
    * `com.acme.bids.app` module defined [here](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/blob/master/eg_05_java_9_jlink/src/com.acme.bids.app/module-info.java)
    * `com.acme.bids.service` module defined [here](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/blob/master/eg_05_java_9_jlink/src/com.acme.bids.service/module-info.java)
    * `com.acme.bids.db` module defined [here](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/blob/master/eg_05_java_9_jlink/src/com.acme.bids.db/module-info.java)

### Validation

* 20-MAY-2017 confirmed with b170

### Execution Steps

* `./build_link_run.sh`
* examine and celebrate the `bids.runtime` directory
