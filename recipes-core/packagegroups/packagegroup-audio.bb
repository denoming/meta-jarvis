DESCRIPTION = "Audio tools package group"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

RDEPENDS:${PN} = "\
    alsa-utils \
    pulseaudio-misc \
"
