# Append path for RZA1 layer to allow uclibc build successfully
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " file://0001-optional-ipv6.patch"

EXTRA_OECONF_append += " ${@bb.utils.contains("DISTRO_FEATURES", "xattr", "", "--disable-xattr", d)}"

