SUMMARY = "Libretro port of MrBoom (a Bomberman clone)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7d8cb796ca7b5ac0cdb18c3e2749d97"

GITHUB_PROJECT = "mrboom-libretro"
LIBRETRO_CORE_NAME = "mrboom"

include libretro-core.inc

SRCREV = "67b1b65633f67e79e0ff552f4571cbcf0969a535"
SRC_URI += " \
    file://0001-fix-build.patch \
"

do_compile() {
	oe_runmake
}