MAINTAINER = "Andreas Boose <viceteam@t-online.de> \
Dag Lem <resid@nimrod.no> \
Tibor Biczo <crown@mail.matav.hu> \
Andreas Dehmel <zarquon@t-online.de> \
Thomas Bretz <tbretz@ph.tum.de> \
Andreas Matthies <andreas.matthies@gmx.net> \
Martin Pottendorfer <pottendo@gmx.net> \
Markus Brenner <markus@brenner.de> \
Spiro Trikaliotis <Spiro.Trikaliotis@gmx.de> \
David Hansel <david@hansels.net> \
Daniel Sladic <sladic@eecg.toronto.edu> \
Ettore Perazzoli <ettore@comm2000.it> \
Andre Fachat <fachat@physik.tu-chemnitz.de> \
Teemu Rantanen <tvr@cs.hut.fi> \
Marco van den Heuvel <blackystardust68@yahoo.com> \
Christian Vogelgsang <chris@vogelgsang.org> \
Fabrizio Gennari <fabrizio.ge@tiscali.it> \
M.Kiesel <mayne@users.sourceforge.net> \
Hannu Nuotio <hannu.nuotio@tut.fi> \
Daniel Kahlin <daniel@kahlin.net> \
Antti S. Lankila <alankila@bel.fi> \
Groepaz <groepaz@gmx.net> \
Ingo Korb <ikorb@users.sourceforge.net> \
Errol Smith <strobe@kludgesoft.com> \
Olaf Seibert <rhialto@falu.nl> \
Marcus Sutton <loggedoubt@gmail.com> \
Ulrich Schulz <peiselulli@t-online.de> \
Stefan Haubenthal <polluks@LONESTAR.ORG> \
Thomas Giesel <skoe@directbox.com> \
Kajtar Zsolt <soci@c64.rulez.org> \
Benjamin 'BeRo' Rosseaux <benjamin@rosseaux.com> \
Gemini Team <info@ihad.tv>"

SUMMARY = "VICE (SDL), the multi-platform C64, C128, VIC20, PET, PLUS4 and CBM-II emulator"
HOMEPAGE = "http://vice-emu.sourceforge.net/"
SECTION = "emulators"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=c93c0550bd3173f4504b2cbd8991e50b"
DEPENDS = " \
        virtual/libsdl \
        libjpeg-turbo \
        libav \
        libvorbis \
        flac \
        readline \
        zlib \
        giflib \
        libpng \
        mpg123 \
"
PRIORITY = "optional"

SRC_URI = " \
        ${SOURCEFORGE_MIRROR}/vice-emu/${BPN}-${PV}.tar.gz \
        file://fix-build.patch \
"
SRC_URI[md5sum] = "e4dd02494c38610718df9f4d4566a0c7"
SRC_URI[sha256sum] = "111bb26310bd660802767084f6840a75156158134689a23a3c8a0e0d817ee36d"

S = "${WORKDIR}/${PN}-${PV}"

inherit autotools-brokensep pkgconfig

EXTRA_OECONF = " \
        --disable-lame \
        --disable-option-checking \
        --enable-arch=sdl \
        --enable-external-ffmpeg \
        --enable-sdlui \
        --with-sdlsound \
        --with-uithreads \
        --without-pulse \
"
