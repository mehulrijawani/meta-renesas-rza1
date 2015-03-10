SUMMARY = "Balto web demo"
DESCRIPTION = "Balto web demo"
HOMEPAGE = ""
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=1da6a62a56f42d0f37c25f5d4dc6fa94"

SRCREV="18f48f2fabbe6c80e943af14aad3d12bdbcb7070"
SRC_URI = "git://github.com/baltoboard/webdemo.git;branch=master"
S = "${WORKDIR}/git"

SRV_DIR ?= "${servicedir}/www"

do_install_append () {
    install -d ${D}${SRV_DIR}
    cp -r ${S}/demo ${D}${SRV_DIR}
    cp -r ${S}/cgi-bin ${D}${SRV_DIR}
}

FILES_${PN} += "${SRV_DIR}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "balto"
