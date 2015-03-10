SUMMARY = "DirectFB Wavefront .obj viewer"
DESCRIPTION = "DFB3D is a Wavefront .obj viewer, based on df_knuckles example."
DEPENDS = "directfb"
SECTION = "libs"
LICENSE = "MIT"

PV = "1.7.0+git${SRCPV}"

inherit autotools pkgconfig

SRCREV = "d41e0aeb10e248e68c2c04ab5e489937caf0d7e3"
SRC_URI = "git://github.com/baltoboard/dfb3d.git;branch=master"

LIC_FILES_CHKSUM = "file://COPYING;md5=3431578dfdfe0215a5da7fed88019210"

S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}/*"
