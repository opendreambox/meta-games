BRANCH = "release-1.2.15"

SRC_URI = " \
        git://github.com/opendreambox/SDL-mirror.git;protocol=https;branch=${BRANCH} \
        file://libsdl-1.2.15-xdata32.patch \
        file://pkgconfig.patch \
"

SRCREV = "${@opendreambox_srcrev('c29300c76ca5bca53423659b855f78829a23d5cd', d)}"

EXTRA_OECONF += "\
        --enable-video-bcmfb \
"

inherit opendreambox-srcrev git-project

PV = "1.2.15"
