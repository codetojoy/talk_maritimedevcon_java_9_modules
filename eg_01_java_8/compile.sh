
./clean.sh

javac -d build \
-sourcepath src \
`find src -name "*.java"`

jar cf lib/com.acme.bids.db.jar -C build com/acme/bids/db

jar cf lib/com.acme.bids.service.jar -C build com/acme/bids/service

jar cf lib/com.acme.bids.app.jar -C build com/acme/bids/app
