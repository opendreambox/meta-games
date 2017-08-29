SUMMARY = "Retro Gaming with Emulators for dreamboxes"
LICENSE = "CLOSED"
GITHUB_PROJECT = "enigma2-plugin-retrogamestation"
RDEPENDS_${PN} = "enigma2"
SRCREV = "${@opendreambox_srcrev('c6ec727b75435001ec8b896c0f03830753cc2bbb', d)}"

inherit autotools pkgconfig opendreambox-github

PACKAGES += "${PN}-meta"

FILES_${PN} += "${libdir}/enigma2"
FILES_${PN}-meta = "${datadir}/meta"
