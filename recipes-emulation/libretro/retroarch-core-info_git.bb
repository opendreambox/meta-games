SUMMARY = "Core information files for RetroArch"
LICENSE = "CLOSED"
GITHUB_ORGANIZATION = "libretro"
GITHUB_PROJECT = "libretro-core-info"

SRCREV = "d285119cd58ec28bb4332eae523ed211399e94d1"

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


