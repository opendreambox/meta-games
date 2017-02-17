SUMMARY = "Chocolate Doom is a Doom source port that is conservative and historically accurate."
HOMEPAGE = "https://www.chocolate-doom.org/"
SECTION = "emulators"
PRIORITY = "optional"

PROVIDES += "virtual/doom"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCREV = "0bf8754c813d2e3ca71a0a58dcee119d23486b2a"

PV = "3.5.0"

SRC_URI = " \
    git://github.com/fabiangreffrath/crispy-doom.git;protocol=https;branch=master; \
    file://0001-fix-build-and-drop-surface-options.patch \
"
DEPENDS = "virtual/libsdl libsdl-mixer libsdl-net libpng"

inherit autotools-brokensep git-project pkgconfig

