SUMMARY = "Libretro port of mupen64plus"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

GITHUB_PROJECT = "mupen64plus-libretro"
LIBRETRO_CORE_NAME = "mupen64plus"

include libretro-core.inc

COMPATIBLE_MACHINE = "^(dm900|dm920)$"

SRCREV = "563565dea05b6b205cfadfb1bb3b73522938916b"
SRC_URI += " \
    file://0001-add-dreambox-platform.patch \
"

EXTRA_OEMAKE += " platform=dreambox"

do_compile() {
	oe_runmake
}
