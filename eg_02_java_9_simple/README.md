
### Idea

* `com.acme.bids.app` depends on `com.acme.bids.service`
* `com.acme.bids.service` depends on `com.acme.bids.db`
* `com.acme.bids.app` module defined [here](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/blob/master/eg_02_java_9_simple/src/com.acme.bids.app/module-info.java)
* `com.acme.bids.service` module defined [here](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/blob/master/eg_02_java_9_simple/src/com.acme.bids.service/module-info.java)
* `com.acme.bids.db` module defined [here](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/blob/master/eg_02_java_9_simple/src/com.acme.bids.db/module-info.java)

### Execution Steps

* `./build_and_run.sh`
* note: it is also instructive to run `jdeps` on the jars we intend to modularize
    * assuming `eg_01_java_8` is compiled:
    * `jdeps --list-reduced-deps ../eg_01_java_8/lib/com.acme.bids.db.jar`
