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
SRCREV = "e2b2e8fb00fc4b9d6ac7bb723d510a3108b862a8"
SRC_URI = "git://github.com/baltoboard/linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"

S = "${WORKDIR}/git"
