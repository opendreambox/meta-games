SUMMARY = "Databases for RetroArch"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
GITHUB_ORGANIZATION = "libretro"
GITHUB_PROJECT = "libretro-database"

SRCREV = "d14346d5c849e5a449159294d001bb3ba8647b9c"

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

EXTRA_OEMAKE = " \
    DESTDIR=${D} \
"

do_install() {
    oe_runmake install
}
