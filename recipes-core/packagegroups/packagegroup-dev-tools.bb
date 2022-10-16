DESCRIPTION = "Development tools package group"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

RDEPENDS:${PN} = "\
    cmake \
    ninja \
    dos2unix \
    ldd \
"
