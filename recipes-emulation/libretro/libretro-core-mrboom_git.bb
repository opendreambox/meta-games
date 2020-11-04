SUMMARY = "Libretro port of MrBoom (a Bomberman clone)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7d8cb796ca7b5ac0cdb18c3e2749d97"

GITHUB_PROJECT = "mrboom-libretro"
LIBRETRO_CORE_NAME = "mrboom"

include libretro-core.inc

SRCREV = "e074bafa1fe9480df1ba412752912a2c2c454958"
SRC_URI = " \
    gitsm://github.com/libretro/mrboom-libretro.git;protocol=https \
    file://0001-fix-build.patch \
"

do_compile() {
	oe_runmake
}