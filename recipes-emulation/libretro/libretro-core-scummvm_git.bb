SUMMARY = "Libretro port of ScummVM"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=441c28d2cf86e15a37fa47e15a72fbac"

GITHUB_PROJECT = "scummvm"
LIBRETRO_CORE_NAME = "scummvm"
LIBRETRO_CORE_DIR = "backends/platform/libretro/build/"

include libretro-core.inc

SRCREV = "373756e3663bc5aee0c96fe582fd749a8a95c4c9"

do_compile() {
	oe_runmake -C ${LIBRETRO_CORE_DIR}
}

