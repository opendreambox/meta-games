SUMMARY = "Libretro port of MrBoom (a Bomberman clone)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7d8cb796ca7b5ac0cdb18c3e2749d97"

GITHUB_PROJECT = "mrboom-libretro"
LIBRETRO_CORE_NAME = "mrboom"

include libretro-core.inc

SRCREV = "175151ad106e5d98eb20a39256077e7344cf099d"
SRC_URI += " \
    file://0001-dont-include-from-host.patch \
"

do_compile() {
	oe_runmake
}