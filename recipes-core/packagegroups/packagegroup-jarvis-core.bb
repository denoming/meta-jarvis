DESCRIPTION = "The J.A.R.V.I.S core package group"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

PACKAGES = "\
    packagegroup-jarvis-core \
    packagegroup-jarvis-core-disk \
    packagegroup-jarvis-core-network \
    packagegroup-jarvis-core-misc \
"

RDEPENDS:packagegroup-jarvis-core = "\
    packagegroup-jarvis-core-disk \
    packagegroup-jarvis-core-network \
    packagegroup-jarvis-core-misc \
"

RDEPENDS:packagegroup-jarvis-core-disk = "\
    e2fsprogs \
    e2fsprogs-e2fsck \
    e2fsprogs-mke2fs \
    e2fsprogs-tune2fs \
    e2fsprogs-badblocks \
    e2fsprogs-resize2fs \
"

RDEPENDS:packagegroup-jarvis-core-network = "\
    connman \
    connman-client \
    mosquitto \
"

RDEPENDS:packagegroup-jarvis-core-misc = "\
    tzdata \
    tzdata-europe \
"
