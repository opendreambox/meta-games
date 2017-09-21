SUMMARY = "Joypad autoconfig files for RetroArch"
LICENSE = "CLOSED"
GITHUB_ORGANIZATION = "libretro"
GITHUB_PROJECT = "retroarch-joypad-autoconfig"

SRCREV = "06c23c482ac189900d5cf2961cc8e0d2d5e56059"

PACKAGES = " \
    ${PN}-linuxraw \
    ${PN}-parport \
    ${PN}-sdl2 \
    ${PN}-udev \
"

AUTOCONFDIR = "${datadir}/libretro/autoconfig"

FILES_${PN}-linuxraw = " \
     ${AUTOCONFDIR}/linuxraw \
"

FILES_${PN}-parport = " \
     ${AUTOCONFDIR}/parport \
"

FILES_${PN}-sdl2 = " \
     ${AUTOCONFDIR}/sdl2 \
"

FILES_${PN}-udev = " \
     ${AUTOCONFDIR}/udev \
"


EXTRA_OEMAKE = " \
    DESTDIR=${D} \
"

do_install() {
    oe_runmake install
}

inherit opendreambox-github
