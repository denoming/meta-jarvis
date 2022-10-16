DESCRIPTION = "Development packages package group"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

RDEPENDS:${PN} = "\
    googletest \
"
