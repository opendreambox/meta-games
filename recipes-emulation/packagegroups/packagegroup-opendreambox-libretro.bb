SUMMARY = "OpenDreambox: libretro task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "CLOSED"

PR = "r1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RRECOMMENDS_${PN}_append = " \
    retroarch \
    libretro-core-2048 \
    libretro-core-dosbox \
    libretro-core-fceumm \
    libretro-core-gambatte \
    libretro-core-genesis-plus-gx \
    libretro-core-hatari \
    libretro-core-mrboom \
    libretro-core-scummvm \
    libretro-core-snes9x2010 \
    libretro-core-vba-next \
    libretro-core-vice-x64 \
    libretro-core-xrick \
"
RRECOMMENDS_${PN}_arm = " \
    libretro-core-mupen64plus \
    libretro-core-pcsx-rearmed \
"