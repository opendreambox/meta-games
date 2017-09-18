DESCRIPTION = "AdvanceMame Arcade emulator"
LICENSE = "GPLv2"
RDEPENDS_${PN} = " \
    libsdl \
    alsa-lib \
    ncurses-terminfo \
    zlib \
    expat \
"
DEPENDS = " \
    libsdl \
    freetype \
"
HOMEPAGE = "http://www.advancemame.it"

LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRCREV = "0d4333b032ec388aa42b5f034f611556d01d0357"

PN = "advancemame"
PV = "3.3"

SRC_URI = " \
    git://github.com/amadvance/advancemame.git;protocol=https \
	file://configure.patch \
"

inherit autotools-brokensep pkgconfig git-project

CFLAGS =+ " -I${STAGING_INCDIR}/SDL/ -I${STAGING_INCDIR}/ -DUSE_SMP"
LDFLAGS =+ " -lSDL -lpthread"

do_configure_prepend() {
	${S}/autogen.sh
}

EXTRA_OECONF = " \
        --enable-pthread \
        --docdir=${docdir}/advance/ \
        --enable-sdl \
        --disable-kevent \
        --disable-mevent \
        --disable-jevent \
"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/advmame ${D}${bindir}/advmame
	install -m 0755 ${S}/advmenu ${D}${bindir}/advmenu
	install -m 0755 ${S}/advmess ${D}${bindir}/advmess
	install -m 0755 ${S}/advcfg ${D}${bindir}/advcfg
	install -m 0755 ${S}/advv ${D}${bindir}/advv
	install -m 0755 ${S}/advs ${D}${bindir}/advs
	install -m 0755 ${S}/advj ${D}${bindir}/advj
	install -m 0755 ${S}/advk ${D}${bindir}/advk
	install -m 0755 ${S}/advm ${D}${bindir}/advm
	
	install -d ${D}/${datadir}/advance/
	install -d ${D}/${datadir}/advance/sample
	install -d ${D}/${datadir}/advance/artwork
	install -d ${D}/${datadir}/advance/image
	install -d ${D}/${datadir}/advance/crc
	install -d ${D}/${datadir}/advance/snap
	install -d ${D}/${datadir}/advance/rom
	
	install -d ${D}/${docdir}/advance
	install -m 0644 ${S}/doc/*.txt ${D}${docdir}/advance
	install -m 0644 ${S}/doc/*.html ${D}${docdir}/advance
}

FILES_${PN} += " \
    ${datadir}/advance/* \
    /usr/bin/* \
"

