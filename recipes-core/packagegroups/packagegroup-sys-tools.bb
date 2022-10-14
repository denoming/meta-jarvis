DESCRIPTION = "System tools"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

PACKAGES = "\
    packagegroup-sys-tools \
    packagegroup-sys-tools-hdd \
"

RDEPENDS:packagegroup-sys-tools = "\
    packagegroup-sys-tools-hdd \
"

RDEPENDS:packagegroup-sys-tools-hdd = "\
    e2fsprogs \
    e2fsprogs-e2fsck \
    e2fsprogs-mke2fs \
    e2fsprogs-tune2fs \
    e2fsprogs-badblocks \
    e2fsprogs-resize2fs \
"
