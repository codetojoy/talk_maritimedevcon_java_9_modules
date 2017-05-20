
### Idea

* normal db module
    * can create exported public type User
    * *can* create internal UserDaoImpl because of `opens` in [module-info.java](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/blob/master/eg_03_2_java_9_open_module/src/com.acme.bids.db/module-info.java)

* main code [here](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/blob/master/eg_03_2_java_9_open_module/src/com.acme.bids.service/com/acme/bids/service/impl/UserServiceImpl.java)

### Validation

* 20-MAY-2017 - confirmed b170
* confirmed, b169, b167

### Execution Steps

* `./build_and_run.sh`
