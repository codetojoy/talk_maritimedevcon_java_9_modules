
rm -rf bids.runtime 

jlink \
--module-path $JAVA_HOME/jmods:mlib \
--add-modules com.acme.bids.app,com.acme.bids.service,com.acme.bids.db \
--compress=2 \
--strip-debug \
--output bids.runtime

