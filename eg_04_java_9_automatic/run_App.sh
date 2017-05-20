
MLIB=$PWD/mlib
MJARS=$PWD/mjars
JARS=$PWD/jars

CLASSPATH=$JARS/commons-logging-1.2.jar
CLASSPATH=$CLASSPATH:$JARS/spring-aop-4.3.8.RELEASE.jar
CLASSPATH=$CLASSPATH:$JARS/spring-beans-4.3.8.RELEASE.jar
CLASSPATH=$CLASSPATH:$JARS/spring-core-4.3.8.RELEASE.jar
CLASSPATH=$CLASSPATH:$JARS/spring-expression-4.3.8.RELEASE.jar

java \
--class-path $CLASSPATH \
--module-path mlib:$MJARS \
-m com.acme.bids.app
