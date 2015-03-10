# Append path for RZA1 layer to include rc.local
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " file://rc.local"

do_install_append () {
	install -d ${D}${sysconfdir}
	install -m 0755 ${WORKDIR}/rc.local ${D}${sysconfdir}
}

FILES_${PN} += "${sysconfdir}/rc.local"
