 
open module com.acme.bids.service {
    exports com.acme.bids.service.api;

    requires com.acme.bids.db;
    requires java.rmi;
    requires java.base;
}

