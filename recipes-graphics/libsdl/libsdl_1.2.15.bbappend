BRANCH = "release-1.2.15"

SRC_URI = " \
        git://github.com/opendreambox/SDL-mirror.git;protocol=https;branch=${BRANCH} \
        file://libsdl-1.2.15-xdata32.patch \
        file://pkgconfig.patch \
"

SRCREV = "${@opendreambox_srcrev('132e1e1984267f316c587957fdd1315c67527ff3', d)}"

EXTRA_OECONF += "\
        --enable-video-bcmfb \
"

inherit opendreambox-srcrev git-project

PV = "1.2.15"
RECIPE_PR := "${PR}"
PR = "${RECIPE_PR}-dream2"
