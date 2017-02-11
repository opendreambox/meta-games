SUMMARY = "Retro Gaming with Emulators for dreamboxes"
LICENSE = "CLOSED"
GITHUB_PROJECT = "enigma2-plugin-retrogamestation"
RDEPENDS = "enigma2"

SRCREV = "${@opendreambox_srcrev('c11fda3f48ec528caa1526be0232587c1dca1f46', d)}"

inherit autotools pkgconfig opendreambox-github

PACKAGES += "${PN}-meta"

FILES_${PN} += "${libdir}/enigma2"
FILES_${PN}-meta = "${datadir}/meta"

