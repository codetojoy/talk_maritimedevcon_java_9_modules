
echo "compiling ..."
./compile.sh

# this module is built with an implicit main method

java \
--add-opens com.acme.bids.db/com.acme.bids.db.impl=com.acme.bids.service \
--module-path mlib \
-m com.acme.bids.service

# OR this:
# java --permit-illegal-access --module-path mlib -m com.acme.bids.service
