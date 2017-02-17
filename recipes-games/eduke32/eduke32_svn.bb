LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://source/duke3d/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = " \
    svn://svn.eduke32.com/;module=eduke32;protocol=http;scmdata=keep \
    file://0001-fix-build.patch;striplevel=0 \
"
SRCREV = "r6061"

DEPENDS = " \
    virtual/libsdl \
    flac \
    libpng \
    libvorbis \
    libsdl-mixer \
    libvpx \
    libxml2 \
"

S = "${WORKDIR}/eduke32"

EXTRA_OEMAKE = " SDL_TARGET=1 USE_OPENGL=0 POLYMER=0 WITHOUT_GTK=1 DEBUGANYWAY=1"

inherit pkgconfig

do_configure () {
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/eduke32 ${D}${bindir}/eduke32
    install -m 0755 ${S}/mapster32 ${D}${bindir}/eduke32-mapster
}

