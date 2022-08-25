DESCRIPTION = "Custom tools for target device"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

RDEPENDS:${PN} = "\
    e2fsprogs \
    e2fsprogs-e2fsck \
    e2fsprogs-mke2fs \
    e2fsprogs-tune2fs \
    e2fsprogs-badblocks \
    e2fsprogs-resize2fs \
"
