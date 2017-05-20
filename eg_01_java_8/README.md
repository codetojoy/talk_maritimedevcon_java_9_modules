
### Idea

* simple example
* `com.acme.bids.app.App` uses `com.acme.bids.service.UserService`
    * `UserService` delegates to `UserServiceImpl`
* `com.acme.bids.service.UserService` uses `com.acme.bids.db.UserDao`
    * `UserDao` delegates to `UserDaoImpl`

### Execution Steps

* `./build_and_run.sh`
