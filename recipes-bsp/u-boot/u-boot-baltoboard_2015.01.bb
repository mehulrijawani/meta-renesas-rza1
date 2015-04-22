require recipes-bsp/u-boot/u-boot.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"

COMPATIBLE_MACHINE = "rza1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PROVIDES += "u-boot"

PV = "v2015.01+git${SRCPV}"

SRCBRANCH = "2015.01-baltoboard"
SRCREV="13374b9f22bc761023e441eacd05ecf2ddfbe67c"
SRC_URI = "git://github.com/baltoboard/u-boot-2015.01.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"
