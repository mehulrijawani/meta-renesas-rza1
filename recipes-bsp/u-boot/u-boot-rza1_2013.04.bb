require recipes-bsp/u-boot/u-boot.inc

COMPATIBLE_MACHINE = "rza1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PROVIDES += "u-boot"

PV = "v2013.04+git${SRCPV}"

SRCBRANCH = "u-boot-2013.04_baltoboard"
SRCREV="1edf07a35a914ddaf41eee2e7a1fcddf5a64e540"
SRC_URI = "git://github.com/baltoboard/u-boot-2013.04.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"
