FROM ubuntu
user root
add compile.sh /root/
run apt-get update && apt-get install -y \
	gcc scons pkg-config libglib2.0-0 glib2.0-dev \
	openjdk-8-jdk maven
