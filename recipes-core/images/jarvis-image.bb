SUMMARY = "J.A.R.V.I.S console-only production image"
LICENSE = "MIT"

require recipes-core/images/core-image-base.bb

IMAGE_FEATURES:append = "\
	hwcodecs \
    ssh-server-openssh \
"

CORE_IMAGE_EXTRA_INSTALL:append = "\
    packagegroup-core-full-cmdline \
    packagegroup-system-tools \
    packagegroup-gstreamer \
"

CORE_IMAGE_EXTRA_INSTALL:append = "\
    dbus \
    tzdata \
    tzdata-europe \
    jarvis-executor \
    jarvis-weather \
    jarvis-speaker \
"
