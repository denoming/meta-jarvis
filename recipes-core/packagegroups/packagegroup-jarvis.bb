DESCRIPTION = "The J.A.R.V.I.S core package group"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

PACKAGES = "\
    packagegroup-jarvis \
    packagegroup-jarvis-multimedia \
    packagegroup-jarvis-storage \
    packagegroup-jarvis-network \
    packagegroup-jarvis-misc \
"

RDEPENDS:packagegroup-jarvis = "\
    packagegroup-jarvis-multimedia \
    packagegroup-jarvis-storage \
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
"

RDEPENDS:packagegroup-jarvis-storage = "\
    blktool \
    e2fsprogs \
    e2fsprogs-e2fsck \
    e2fsprogs-mke2fs \
    e2fsprogs-tune2fs \
    e2fsprogs-badblocks \
    e2fsprogs-resize2fs \
"

RDEPENDS:packagegroup-jarvis-network = "\
    connman \
    connman-client \
    mosquitto \
"

RDEPENDS:packagegroup-jarvis-misc = "\
    tzdata \
    tzdata-europe \
"
