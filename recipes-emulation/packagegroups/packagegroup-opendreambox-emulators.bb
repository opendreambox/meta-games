SUMMARY = "OpenDreambox: Emulators Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "CLOSED"

PR = "r1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} += ""

RRECOMMENDS_${PN} += " \
    advancemame \
    dgen \
    dosbox \
    fbzx \
    gngeo \
    gnuboy \
    pcsx \
    scummvm \
    snes9x-sdl \
    stella \
    vice \
"
