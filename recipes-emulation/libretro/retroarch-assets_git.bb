SUMMARY = "Assets for RetroArch"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
GITHUB_ORGANIZATION = "libretro"
GITHUB_PROJECT = "retroarch-assets"

SRCREV = "4eb7ba537a7f6afae77a9767912881a6e8e464c2"

inherit opendreambox-github

PACKAGES = " \
    ${PN}-branding \
    ${PN}-glui \
    ${PN}-ozone \
    ${PN}-wallpapers \
    ${PN}-xmb-automatic \
    ${PN}-xmb-dot-art \
    ${PN}-xmb-flatui \
    ${PN}-xmb-monochrome \
    ${PN}-xmb-monochrome-inverted \
    ${PN}-xmb-neoactive \
    ${PN}-xmb-pixel \
    ${PN}-xmb-retroactive \
    ${PN}-xmb-retrosystem \
    ${PN}-xmb-systematic \
"

ASSETDIR = "${datadir}/libretro/assets"

FILES_${PN}-branding = " \
     ${ASSETDIR}/branding \
"

FILES_${PN}-glui = " \
     ${ASSETDIR}/glui \
"

FILES_${PN}-ozone = " \
     ${ASSETDIR}/ozone \
"

FILES_${PN}-wallpapers = " \
     ${ASSETDIR}/wallpapers \
"

FILES_${PN}-xmb-automatic = " \
     ${ASSETDIR}/xmb/automatic \
"

FILES_${PN}-xmb-dot-art = " \
     ${ASSETDIR}/xmb/dot-art \
"

FILES_${PN}-xmb-flatui = " \
     ${ASSETDIR}/xmb/flatui \
"

FILES_${PN}-xmb-monochrome = " \
     ${ASSETDIR}/xmb/monochrome \
"

FILES_${PN}-xmb-monochrome-inverted = " \
     ${ASSETDIR}/xmb/monochrome-inverted \
"

FILES_${PN}-xmb-neoactive = " \
     ${ASSETDIR}/xmb/neoactive \
"

FILES_${PN}-xmb-pixel = " \
     ${ASSETDIR}/xmb/pixel \
"

FILES_${PN}-xmb-retroactive = " \
     ${ASSETDIR}/xmb/retroactive \
"

FILES_${PN}-xmb-retrosystem = " \
     ${ASSETDIR}/xmb/retrosystem \
"

FILES_${PN}-xmb-systematic = " \
     ${ASSETDIR}/xmb/systematic \
"

do_configure() {
}

do_install() {
    mkdir -p ${D}${ASSETDIR}
    cp -r -t ${D}${ASSETDIR} \
        branding \
        glui \
        ozone \
        wallpapers \
        xmb
    rm -rf \
        ${D}${ASSETDIR}/xmb/NPMApng2PMApng.py \
        ${D}${ASSETDIR}/xmb/convert.sh \
        ${D}${ASSETDIR}/xmb/monochrome/src \
        ${D}${ASSETDIR}/xmb/flatui/src \
        ${D}${ASSETDIR}/xmb/dot-art/src
}
