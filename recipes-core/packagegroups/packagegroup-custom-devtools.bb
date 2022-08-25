DESCRIPTION = "Custom tools for target device"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

RDEPENDS:${PN} = "\
    cmake \
    ninja \
    dos2unix \
"
