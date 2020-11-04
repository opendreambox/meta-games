SUMMARY = "Libretro port of Snes9X (HEAD)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=67f2d33d40332031b2f10beb78eac382"

GITHUB_PROJECT = "snes9x"
LIBRETRO_CORE_NAME = "snes9x"
LIBRETRO_CORE_DIR = "libretro/"

include libretro-core.inc

do_compile() {
	cd libretro
	oe_runmake
}

SRCREV = "975aecb88830e6719e267e38144da47eb707fbac"
