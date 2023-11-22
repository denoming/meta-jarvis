SUMMARY = "J.A.R.V.I.S console-only production image"
LICENSE = "MIT"

require recipes-core/images/core-image-base.bb

IMAGE_FEATURES:append = "\
	hwcodecs \
    ssh-server-openssh \
"

CORE_IMAGE_EXTRA_INSTALL:append = "\
    packagegroup-core-full-cmdline \
    packagegroup-jarvis-core \
    packagegroup-jarvis-video \
"

CORE_IMAGE_EXTRA_INSTALL:append = "\
    dbus \
"

CORE_IMAGE_EXTRA_INSTALL:append = "\
    jarvisto \
    speechee \
    rintento \
"
