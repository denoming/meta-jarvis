DESCRIPTION = "The J.A.R.V.I.S core package group"
LICENSE = "MIT"
PR = "r0"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PACKAGES = "\
    packagegroup-jarvis \
    packagegroup-jarvis-multimedia \
    packagegroup-jarvis-utils \
    packagegroup-jarvis-network \
    packagegroup-jarvis-misc \
"

RDEPENDS:packagegroup-jarvis = "\
    packagegroup-jarvis-multimedia \
    packagegroup-jarvis-utils \
    packagegroup-jarvis-network \
    packagegroup-jarvis-misc \
"

RDEPENDS:packagegroup-jarvis-multimedia = "\
    alsa-utils-amixer \
    alsa-utils-aplay \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    ${@bb.utils.contains('MACHINE', 'raspberrypi3', 'gstreamer1.0-omx', '', d)} \
"

RDEPENDS:packagegroup-jarvis-utils = "\
    pciutils \
    usbutils \
    e2fsprogs-e2fsck \
    e2fsprogs-tune2fs \
    e2fsprogs-badblocks \
    e2fsprogs-resize2fs \
"

RDEPENDS:packagegroup-jarvis-network = "\
    dbus \
    mosquitto \
"

RDEPENDS:packagegroup-jarvis-misc = "\
    tzdata \
    tzdata-europe \
"
