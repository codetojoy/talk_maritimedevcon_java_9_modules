
echo "compiling ..."
./compile.sh 

# this module is built with an implicit main method

java  --module-path mlib -m com.acme.bids.service
