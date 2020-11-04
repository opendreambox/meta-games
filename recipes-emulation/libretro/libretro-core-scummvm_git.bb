SUMMARY = "Libretro port of ScummVM"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=441c28d2cf86e15a37fa47e15a72fbac"

GITHUB_PROJECT = "scummvm"
LIBRETRO_CORE_NAME = "scummvm"
LIBRETRO_CORE_DIR = "backends/platform/libretro/build/"

include libretro-core.inc

SRCREV = "7b1e9299057a01a1defad6dbae4bdbeed36aa767"

do_compile() {
	oe_runmake -C ${LIBRETRO_CORE_DIR}
}

