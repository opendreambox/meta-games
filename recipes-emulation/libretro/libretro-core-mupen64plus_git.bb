SUMMARY = "Libretro port of mupen64plus"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

GITHUB_PROJECT = "mupen64plus-libretro"
LIBRETRO_CORE_NAME = "mupen64plus"

include libretro-core.inc

COMPATIBLE_MACHINE = "^(dm900|dm920)$"

SRCREV = "938277abf18fcc3cc6fa991ba5d26c0aa9996116"
SRC_URI += " \
    file://0001-add-dreambox-platform.patch \
"

do_compile() {
	platform=dreambox oe_runmake
}
