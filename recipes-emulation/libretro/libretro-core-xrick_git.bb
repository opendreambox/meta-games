SUMMARY = "Libretro port of XRick"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README;beginline=25;endline=27;md5=51baf4e8f620191942384986e54f80e6"

GITHUB_PROJECT = "xrick-libretro"
LIBRETRO_CORE_NAME = "xrick"

include libretro-core.inc

SRCREV = "0aad6c601cb998c402ce6e0dccc4d4c3068995a5"
SRC_URI += " \
    file://0001-add-dreambox-platform.patch \
"

EXTRA_OEMAKE += " platform=dreambox"

do_compile() {
    oe_runmake
}