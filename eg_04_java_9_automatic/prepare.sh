
# jars

rm -r jars
mkdir -p jars
cd jars

wget http://central.maven.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar 

wget http://central.maven.org/maven2/org/springframework/spring-aop/4.3.8.RELEASE/spring-aop-4.3.8.RELEASE.jar
wget http://central.maven.org/maven2/org/springframework/spring-beans/4.3.8.RELEASE/spring-beans-4.3.8.RELEASE.jar
wget http://central.maven.org/maven2/org/springframework/spring-core/4.3.8.RELEASE/spring-core-4.3.8.RELEASE.jar
wget http://central.maven.org/maven2/org/springframework/spring-expression/4.3.8.RELEASE/spring-expression-4.3.8.RELEASE.jar

# automatic modules

cd ..
rm -r mjars
mkdir -p mjars
cd mjars

wget http://central.maven.org/maven2/org/springframework/spring-context/4.3.8.RELEASE/spring-context-4.3.8.RELEASE.jar 
mv spring-context-4.3.8.RELEASE.jar spring.context.jar

cd ..
echo "Ready."

