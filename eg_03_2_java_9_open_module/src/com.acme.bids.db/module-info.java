
module com.acme.bids.db {
    exports com.acme.bids.db.api;
    opens com.acme.bids.db.impl;

    requires java.sql;
    requires java.base;
}
