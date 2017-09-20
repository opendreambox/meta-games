LIC_FILES_CHKSUM = "file://COPYING.txt;md5=e4688d3bd5bf02dadaa3e5182fd9eda9"

BRANCH = "master"

SRC_URI = " \
        git://github.com/opendreambox/SDL-mirror.git;protocol=https;branch=${BRANCH} \
        file://linkage.patch \
"

SRCREV = "${@opendreambox_srcrev('e5c71d4525c515fb45b63467189fd8bc277bde6b', d)}"

PV = "2.0.5"

inherit opendreambox-srcrev git-project

EXTRA_OECONF += " --enable-video-dreambox "

LDFLAGS += "-lEGL -lGLESv2"

FILESEXTRAPATHS_prepend := "${THISDIR}/libsdl2:"
