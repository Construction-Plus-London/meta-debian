#
# Base recipe: meta/recipes-graphics/xorg-app/xkbcomp_1.2.4.bb
# Base branch: daisy
#

require xorg-app-common.inc

SUMMARY = "A program to compile XKB keyboard description"

DESCRIPTION = "The xkbcomp keymap compiler converts a description of an \
XKB keymap into one of several output formats. The most common use for \
xkbcomp is to create a compiled keymap file (.xkm extension) which can \
be read directly by XKB-capable X servers or utilities."

LIC_FILES_CHKSUM = "file://COPYING;md5=08436e4f4476964e2e2dd7e7e41e076a"

PR = "${INC_PR}.0"

DEPENDS += "libxkbfile"

BBCLASSEXTEND = "native"

DPN = "x11-xkb-utils"

# There is a patch in debian/patches/ but no patch in series
DEBIAN_PATCH_TYPE = "abnormal"
debian_patch_abnormal() {
	:
}

S = "${DEBIAN_UNPACK_DIR}/${PN}"
