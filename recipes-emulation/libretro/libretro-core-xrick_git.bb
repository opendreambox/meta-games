SUMMARY = "Libretro port of XRick"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README;beginline=25;endline=27;md5=51baf4e8f620191942384986e54f80e6"

GITHUB_PROJECT = "xrick-libretro"
LIBRETRO_CORE_NAME = "xrick"

include libretro-core.inc

SRCREV = "a083023e89d904c59be2be5559db30fada544a0b"
SRC_URI += " \
    file://0001-add-dreambox-platform.patch \
"

EXTRA_OEMAKE += " platform=dreambox"

do_compile() {
    oe_runmake
}