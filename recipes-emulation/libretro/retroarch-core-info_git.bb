SUMMARY = "Core information files for RetroArch"
LICENSE = "CLOSED"
GITHUB_ORGANIZATION = "libretro"
GITHUB_PROJECT = "libretro-core-info"

SRCREV = "fce7f7ab7eafe717df5972bdc797ab3f20d4364f"

inherit opendreambox-github

INFODIR = "${datadir}/libretro/info"

FILES_${PN} = " \
    ${INFODIR} \
"

EXTRA_OEMAKE = " \
    DESTDIR=${D} \
"

do_configure() {
}

do_install() {
    oe_runmake install
}


