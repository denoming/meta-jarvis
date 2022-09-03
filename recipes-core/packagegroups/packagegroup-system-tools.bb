DESCRIPTION = "System tools for target device"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

PACKAGES = "\
    packagegroup-system-tools \
    packagegroup-system-tools-disk \
    packagegroup-system-tools-network \
"

RDEPENDS:packagegroup-system-tools = "\
    packagegroup-system-tools-disk \
    packagegroup-system-tools-network \
"

RDEPENDS:packagegroup-system-tools-disk = "\
    e2fsprogs \
    e2fsprogs-e2fsck \
    e2fsprogs-mke2fs \
    e2fsprogs-tune2fs \
    e2fsprogs-badblocks \
    e2fsprogs-resize2fs \
"

RDEPENDS:packagegroup-system-tools-network = "\
    connman \
    connman-client \
"
