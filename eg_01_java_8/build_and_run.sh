
echo "compiling ..."
./compile.sh

CLASSPATH=lib/com.acme.bids.app.jar
CLASSPATH=$CLASSPATH:lib/com.acme.bids.service.jar
CLASSPATH=$CLASSPATH:lib/com.acme.bids.db.jar

java -cp $CLASSPATH com.acme.bids.app.App
