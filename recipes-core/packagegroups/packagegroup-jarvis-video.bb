DESCRIPTION = "The J.A.R.V.I.S video package group"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

RDEPENDS:${PN} = "\
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
"