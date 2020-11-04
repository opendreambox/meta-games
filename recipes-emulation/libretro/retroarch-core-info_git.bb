SUMMARY = "Core information files for RetroArch"
LICENSE = "CLOSED"
GITHUB_ORGANIZATION = "libretro"
GITHUB_PROJECT = "libretro-core-info"

SRCREV = "f8c1149c628c13be63a6ea605f49f0a94fec1421"

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


