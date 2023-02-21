SUMMARY = "Libretro port of ScummVM"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=441c28d2cf86e15a37fa47e15a72fbac"

GITHUB_ORGANIZATION = "libretro-mirrors"
GITHUB_PROJECT = "scummvm"
LIBRETRO_CORE_NAME = "scummvm"
LIBRETRO_CORE_DIR = "backends/platform/libretro/build/"

include libretro-core.inc

SRCREV = "2fb2e4c551c9c1510c56f6e890ee0300b7b3fca3"

do_compile() {
	oe_runmake -C ${LIBRETRO_CORE_DIR}
}
