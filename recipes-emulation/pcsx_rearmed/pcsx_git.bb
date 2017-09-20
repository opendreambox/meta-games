SUMMARY = "Sony Playstation Emulator"
SECTION = "emulators"
PRIORITY = "optional"
HOMEPAGE="https://github.com/notaz/pcsx_rearmed"
AUTHOR = "GeminiTeam"
DEPENDS = " \
	libsdl \
	zlib \
	libpng \
"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5dd99a4a14d516c44d0779c1e819f963"
GITHUB_ORGANIZATION = "notaz"
GITHUB_PROJECT = "pcsx_rearmed"

COMPATIBLE_MACHINE = "^(dm900)$"
SRCREV = "${@opendreambox_srcrev('25e52b2c51afd3609aa2a0e218036d27520af510', d)}"
PV = "1.9"

inherit opendreambox-github autotools-brokensep pkgconfig

SRC_URI += " \
	file://0001-move-homedir.patch \
	file://0002-fix-configure.patch \
"

FILES_${PN} += " \
	/usr/games/ \
	/usr/games/plugins/ \
"

EXTRA_OECONF += " \
	--gpu=neon \
	--enable-neon \
	--sound-drivers=alsa sdl \
"

do_configure_prepend() {
	git submodule init && git submodule update
	CFLAGS="${TUNE_CCARGS}"
}

do_install() {
	install -d ${D}/usr/games
	install -m 0755 ${S}/pcsx ${D}/usr/games/pcsx
	install -d ${D}/usr/games/plugins 
	install -m 0755 ${S}/plugins/gpu_peops.so ${D}/usr/games/plugins/gpu_peops.so
	install -m 0755 ${S}/plugins/gpu_unai.so ${D}/usr/games/plugins/gpu_unai.so
	install -m 0755 ${S}/plugins/spunull.so ${D}/usr/games/plugins/spunull.so
}
