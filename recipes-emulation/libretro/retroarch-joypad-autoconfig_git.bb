SUMMARY = "Joypad autoconfig files for RetroArch"
LICENSE = "CLOSED"
GITHUB_ORGANIZATION = "libretro"
GITHUB_PROJECT = "retroarch-joypad-autoconfig"

SRCREV = "e35ea02c351bb00b49d2f039983da8336e9b66ff"

PACKAGES = " \
    ${PN}-hid \
    ${PN}-linuxraw \
    ${PN}-parport \
    ${PN}-sdl2 \
    ${PN}-udev \
"

AUTOCONFDIR = "${datadir}/libretro/autoconfig"

FILES_${PN}-hid = " \
     ${AUTOCONFDIR}/hid \
"

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

do_configure() {
}

do_install() {
    mkdir -p ${D}${AUTOCONFDIR}
    cp -r -t ${D}${AUTOCONFDIR} \
        hid \
        linuxraw \
        parport \
        sdl2 \
        udev
}

inherit opendreambox-github
