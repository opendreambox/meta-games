SUMMARY = "Retro Gaming with Emulators for dreamboxes"
LICENSE = "CLOSED"
GITHUB_PROJECT = "enigma2-plugin-retrogamestation"
RDEPENDS_${PN} = "enigma2"

SRCREV = "${@opendreambox_srcrev('b74a414c068928b2544263c3117705c49b400196', d)}"

inherit autotools pkgconfig opendreambox-github

PACKAGES += "${PN}-meta"

FILES_${PN} += "${libdir}/enigma2"
FILES_${PN}-meta = "${datadir}/meta"

