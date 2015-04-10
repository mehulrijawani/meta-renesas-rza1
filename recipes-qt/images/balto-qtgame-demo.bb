SUMMARY = "A demo image for BALTO board with QT4.8, ssh server and web server"
LICENSE = "MIT"

IMAGE_FEATURES += "ssh-server-dropbear"

inherit core-image

IMAGE_FSTYPES += "tar.bz2"

IMAGE_INSTALL += "\
	balto-webdemo \
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
