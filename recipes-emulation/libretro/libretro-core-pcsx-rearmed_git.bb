SUMMARY = "Libretro port of pcsx_rearmed"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5dd99a4a14d516c44d0779c1e819f963"

GITHUB_PROJECT = "pcsx_rearmed"
LIBRETRO_CORE_NAME = "pcsx_rearmed"

include libretro-core.inc

COMPATIBLE_MACHINE = "^(dm900|dm920)$"

SRCREV = "96b0d7854b486457c3af6180ebf5560c94df9158"
SRC_URI += " \
    file://0001-add-dreambox-platform.patch \
"

EXTRA_OEMAKE += " platform=dreambox"

do_compile() {
	oe_runmake -f Makefile.libretro
}
