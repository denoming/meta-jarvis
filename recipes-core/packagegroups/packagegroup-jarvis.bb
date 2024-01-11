DESCRIPTION = "The J.A.R.V.I.S package group"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PACKAGES = "\
    packagegroup-jarvis \
    packagegroup-jarvis-multimedia \
    packagegroup-jarvis-utils \
    packagegroup-jarvis-connectivity \
    packagegroup-jarvis-ai \
    packagegroup-jarvis-misc \
"

RDEPENDS:packagegroup-jarvis = "\
    packagegroup-jarvis-multimedia \
    packagegroup-jarvis-utils \
    packagegroup-jarvis-connectivity \
    packagegroup-jarvis-ai \
    packagegroup-jarvis-misc \
"

RDEPENDS:packagegroup-jarvis-multimedia = "\
    ffmpeg \
    alsa-utils-amixer \
    alsa-utils-aplay \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    ${@bb.utils.contains_any('MACHINE', 'raspberrypi3 raspberrypi3-64', 'gstreamer1.0-omx', '', d)} \
"

RDEPENDS:packagegroup-jarvis-utils = "\
    pciutils \
    usbutils \
    e2fsprogs-e2fsck \
    e2fsprogs-tune2fs \
    e2fsprogs-badblocks \
    e2fsprogs-resize2fs \
"

RDEPENDS:packagegroup-jarvis-connectivity = "\
    dbus \
    mosquitto \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'wireless-regdb-static', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'bluetooth', 'bluez5', '', d)} \
"

RDEPENDS:packagegroup-jarvis-ai = "\
    opencv \
"

RDEPENDS:packagegroup-jarvis-misc = "\
    tzdata \
    tzdata-europe \
"
