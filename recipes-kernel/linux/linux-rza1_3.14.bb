DESCRIPTION = "RZ/A1 Linux Kernel"
SECTION = "kernel"
LICENSE = "GPLv2"

inherit kernel
require recipes-kernel/linux/linux-dtb.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

COMPATIBLE_MACHINE = "rza1"

PROVIDES += "virtual/kernel"

PV = "3.14+git${SRCPV}"

SRCBRANCH = "linux-3.14_baltoboard"
SRCREV = "88952993bed8799781a29def514035deea8226d6"
SRC_URI = "git://github.com/baltoboard/linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"

S = "${WORKDIR}/git"
