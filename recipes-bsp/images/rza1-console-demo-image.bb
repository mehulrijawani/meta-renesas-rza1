SUMMARY = "A demo image for RSKRZA1 board with ssh server and web server"
LICENSE = "MIT"

IMAGE_FEATURES += "ssh-server-dropbear"

inherit core-image

IMAGE_FSTYPES += "tar.bz2 squashfs"

IMAGE_INSTALL = "\
	evtest \
	i2c-tools \
	iperf \
	packagegroup-core-boot \
	sthttpd \
	strace \
"
