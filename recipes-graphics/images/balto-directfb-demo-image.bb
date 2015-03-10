SUMMARY = "A demo image for BALTO board with DirectFB, SDL 1.2, ssh server and web server"
LICENSE = "MIT"

IMAGE_FEATURES += "ssh-server-dropbear"

inherit core-image

IMAGE_FSTYPES += "tar.bz2"

IMAGE_INSTALL = "\
	balto-webdemo \
	dfb3d \
	dfbsee \
	directfb \
	directfb-examples \
	evtest \
	i2c-tools \
	iperf \
	packagegroup-core-boot \
	pointercal \
	sthttpd \
	strace \
	tslib \
	tslib-tests \
"
