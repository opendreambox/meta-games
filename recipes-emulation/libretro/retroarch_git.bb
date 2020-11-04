SUMMARY = "Retro Gaming with Emulators"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
GITHUB_ORGANIZATION = "libretro"
GITHUB_PROJECT = "retroarch"
DEPENDS = " \
    alsa-lib \
    libass \
    libdrm \
    libusb1 \
    libsdl2 \
    libxml2 \
    p7zip \
    ffmpeg \
    freetype \
    dbus \
    zlib \
    qtbase \
"
RDEPENDS_${PN} = " \
    retroarch-assets-branding \
    retroarch-assets-ozone \
    retroarch-core-info \
    retroarch-database-rdb \
    retroarch-joypad-autoconfig-sdl2 \
    retroarch-joypad-autoconfig-udev \
"

SRCREV = "5e551dd92b79d8127e66939835ea3c2a140c4078"

PV = "1.9.0"

inherit pkgconfig opendreambox-github

SRC_URI += " \
    file://0002-improve-defaults.patch \
    file://retroarch-core-options.cfg \
"

EXTRA_OECONF = " \
    --enable-egl \
    --enable-opengles \
    --enable-sdl2 \
    --disable-jack \
    --disable-pulse \
    --disable-oss \
    --disable-x11 \
"

EXTRA_OECONF_append_arm = " \
    --enable-floathard \
    --enable-neon \
"

do_configure_append() {
    cd ../git
    ./configure --prefix=${prefix} ${EXTRA_OECONF}
}

FILES_${PN} = " \
    ${sysconfdir}/retroarch.cfg \
    ${sysconfdir}/retroarch-core-options.cfg \
    ${bindir} \
    ${datadir} \
"

CONFFILES_${PN} = " \
    ${sysconfdir}/retroarch.cfg \
    ${sysconfdir}/retroarch-core-options.cfg \
"


EXTRA_OEMAKE = " \
    DESTDIR=${D} \
"

do_install() {
    oe_runmake install
    install -d ${D}/${sysconfdir}
    install -m 0644 ${WORKDIR}/retroarch-core-options.cfg ${D}${sysconfdir}/retroarch-core-options.cfg
}
