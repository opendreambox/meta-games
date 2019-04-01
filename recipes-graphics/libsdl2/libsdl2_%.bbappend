LIC_FILES_CHKSUM = "file://COPYING.txt;md5=02ee26814dd044bd7838ae24e05b880f"

BRANCH = "dreambox-2.0.9"

SRC_URI = "git://github.com/opendreambox/SDL-mirror.git;protocol=https;branch=${BRANCH}"

SRCREV = "${@opendreambox_srcrev('d30bd48659316277b42b58e728d5ea574923047c', d)}"

PV = "2.0.9"

inherit opendreambox-srcrev git-project

LDFLAGS += "-lEGL -lGLESv2"

FILESEXTRAPATHS_prepend := "${THISDIR}/libsdl2:"
