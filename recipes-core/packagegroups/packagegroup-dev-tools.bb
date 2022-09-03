DESCRIPTION = "Development tools for target device"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

RDEPENDS:packagegroup-dev-tools = "\
    cmake \
    ninja \
    dos2unix \
"
