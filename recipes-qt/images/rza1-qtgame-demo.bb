SUMMARY = "A demo image for RSKRZA1 board with QT4.8, ssh server and web server"
LICENSE = "MIT"

IMAGE_FEATURES += "ssh-server-dropbear"

inherit core-image

IMAGE_FSTYPES += "tar.bz2"

IMAGE_INSTALL += "\
	evtest \
	i2c-tools \
	iperf \
	packagegroup-core-boot \
	pointercal \
	qtgame-e \
	qt4-embedded-plugin-mousedriver-tslib \
	sthttpd \
	strace \
	tslib \
	tslib-tests \
"
