SUMMARY = "Multi-platform Atari 2600 VCS emulator"
HOMEPAGE = "http://stella.sourceforge.net/" 
SECTION = "emulators"
PRIORITY = "optional"

PR = "r1"


LICENSE = "GPLv2" 
LIC_FILES_CHKSUM = "file://License.txt;md5=878e3965c7b52d85827c75f5a2f3b314" 

SRC_URI = "https://launchpad.net/ubuntu/+archive/primary/+files/stella_3.9.3.orig.tar.gz \
           file://cross_compile_support.patch \
           file://0001-set-freq-48000.patch;patch=1 \
"

SRC_URI[md5sum] = "007d45faa46341763da31f87d55df2d8"
SRC_URI[sha256sum] = "8b343084c7aadb41e5aeada996c1c979c6e42d99aa10131e7870308e509362eb"

SRCREV = "8ab9090451a850b001bc102306ced492ee41c1ac"

DEPENDS = "virtual/libsdl zlib libpng"

FILES_${PN} += "${datadir}/icons"

inherit autotools-brokensep
