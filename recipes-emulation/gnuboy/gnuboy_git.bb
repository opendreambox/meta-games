SUMMARY = "Gameboy Emulator based on SDL"
MAINTAINER = "GeminiTeam"
HOMEPAGE = "http://www.i-have-a-dreambox.com"
PACKAGE_ARCH = "${DEFAULTTUNE}"
SECTION = "emulators"
PRIORITY = "optional"

LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"
LICENSE = "GPLv2"

DEPENDS = " \
    virtual/libsdl \
    zlib \
"

SRCREV = "${@opendreambox_srcrev('1a4b6693b1438fbc90778d42a9db709844e2ff91', d)}"

inherit autotools-brokensep pkgconfig opendreambox-github

EXTRA_OECONF = " \
	--with-sdl \
	--with-fb=no \
"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/sdlgnuboy ${D}${bindir}/sdlgnuboy
	install -d ${D}${docdir}/gnuboy
	install -m 0644 ${S}/docs/CONFIG ${D}${docdir}/gnuboy/CONFIG
	install -m 0644 ${S}/docs/FAQ ${D}${docdir}/gnuboy/FAQ
	install -m 0644 ${S}/etc/classic.rc ${D}${docdir}/gnuboy/classic.rc
	install -m 0644 ${S}/etc/sample.rc ${D}${docdir}/gnuboy/sample.rc
	install -m 0644 ${S}/etc/filters.rc ${D}${docdir}/gnuboy/filters.rc
}
