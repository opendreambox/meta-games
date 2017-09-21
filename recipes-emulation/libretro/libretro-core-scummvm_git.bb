SUMMARY = "Libretro port of ScummVM"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=441c28d2cf86e15a37fa47e15a72fbac"

GITHUB_PROJECT = "scummvm"
LIBRETRO_CORE_NAME = "scummvm"
LIBRETRO_CORE_DIR = "backends/platform/libretro/build/"

include libretro-core.inc

SRCREV = "e35edf9f1f853b9f0b1bd6b355ce2605ead7db95"

do_compile() {
	oe_runmake -C ${LIBRETRO_CORE_DIR}
}

