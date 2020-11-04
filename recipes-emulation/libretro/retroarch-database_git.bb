SUMMARY = "Databases for RetroArch"
LICENSE = "CLOSED"
GITHUB_ORGANIZATION = "libretro"
GITHUB_PROJECT = "libretro-database"

SRCREV = "a8a44fc1c8de622d21a40eed8a799691b5995ae9"

inherit opendreambox-github

DBDIR = "${datadir}/libretro/database"

PACKAGES_append = " \
    ${PN}-rdb \
    ${PN}-cheats \
    ${PN}-cursors \
"
FILES_${PN}-rdb = " \
     ${DBDIR}/rdb \
"

FILES_${PN}-cheats = " \
     ${DBDIR}/cht \
"
FILES_${PN}-cursors = " \
     ${DBDIR}/cursors \
"

do_configure() {
}

do_install() {
    mkdir -p ${D}${DBDIR}
    cp -r -t ${D}${DBDIR} \
        cht \
        cursors \
        rdb
}
