SUMMARY = "DirectFB image viewer and video player"
DESCRIPTION = "DFBSee is an image viewer and video player. \
      The current version is a quick hack but nice though."
DEPENDS = "directfb"
SECTION = "libs"
LICENSE = "MIT"

PV = "0.7.4+git${SRCPV}"

inherit autotools pkgconfig

SRCREV = "f47543fd1b821f8f60e77aff3ab8e6f2fdc21595"
SRC_URI = "git://git.directfb.org/git/directfb/programs/DFBSee.git;branch=master \
	   file://volume-tables.patch"

LIC_FILES_CHKSUM = "file://README;md5=5e5662b96956e5c826de5cfc283c30aa"

S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}/DFBSee/decker.ttf"
