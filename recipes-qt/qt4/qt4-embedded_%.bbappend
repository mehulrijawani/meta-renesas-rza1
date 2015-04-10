# Append path for RZA1 layer to allow uclibc build successfully
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# save space for uclibc
QT_WEBKIT_libc-uclibc = "-no-webkit"
QT_XML_libc-uclibc = "-no-xmlpatterns"
QT_QT3SUPPORT_libc-uclibc = "-no-qt3support"

SRC_URI += " ${@bb.utils.contains("DISTRO_FEATURES", "ipv6", "", "file://disable-ipv6.patch", d)}"

