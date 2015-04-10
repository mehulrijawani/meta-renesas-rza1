require qtgame-common.inc

inherit qt4e

RDEPENDS_${PN} += "${QT_BASE_NAME}-fonts"
RCONFLICTS_${PN} = "qtgame"
