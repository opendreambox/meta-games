RRECOMMENDS_${PN} += "retroarch"
GITHUB_ORGANIZATION = "libretro"
inherit pkgconfig opendreambox-github

LIBRETRO_LIBDIR = "${libdir}/libretro/"
LIBRETRO_CORE_DIR ?= ""

FILES_${PN} = "${LIBRETRO_LIBDIR}${LIBRETRO_CORE_NAME}_libretro.so"

do_configure() {
}

do_compile() {
	oe_runmake -f Makefile.libretro
}

do_install() {
	install -d ${D}/${LIBRETRO_LIBDIR}
	install -m 0644 ${S}/${LIBRETRO_CORE_DIR}${LIBRETRO_CORE_NAME}_libretro.so ${D}/${LIBRETRO_LIBDIR}
}