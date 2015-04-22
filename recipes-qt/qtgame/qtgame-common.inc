DESCRIPTION = "Game from QT 4.4.3 tutorial 14"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://qtgame.pro;md5=810bba82c6d838c75a9c0ec6269c0c69"

PV = "0.0+gitr${SRCPV}"

SRCREV = "f898162b29b7185b55a1447a4af41eedd619d9f7"
SRC_URI = "git://github.com/baltoboard/qtgame.git;branch=master"

S = "${WORKDIR}/git"

do_install_append () {
    install -d ${D}${bindir}
    install -m 755 ${S}/qtgame ${D}${bindir}/qtgame${QT_LIBINFIX}
}

