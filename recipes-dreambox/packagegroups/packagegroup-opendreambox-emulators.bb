SUMMARY = "Emulator meta package"
SECTION = "opendreambox/games"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RRECOMMENDS_${PN} += " \
  enigma2-plugin-extensions-retrogamestation \
  dgen \
  crispy-doom \
  dosbox \
  fbzx \
  gngeo \
  gnuboy \
  advancemame \
  pcsx \
  sdlquake \
  scummvm \
  snes9x-sdl \
  stella \
  vice \
"
