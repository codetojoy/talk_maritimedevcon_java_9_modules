
./clean.sh

javac -d build \
-sourcepath src \
`find src -name "*.java"`

jar cvf lib/com.acme.bids.db.jar -C build com/acme/bids/db

jar cvf lib/com.acme.bids.service.jar -C build com/acme/bids/service

jar cvf lib/com.acme.bids.app.jar -C build com/acme/bids/app
