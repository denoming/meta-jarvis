IMAGE_FEATURES:append = "\
    splash \
    ssh-server-openssh \
"

CORE_IMAGE_EXTRA_INSTALL:append = "\
    packagegroup-core-full-cmdline \
    packagegroup-system-tools \
    packagegroup-gstreamer \
    packagegroup-audio \
"

CORE_IMAGE_EXTRA_INSTALL:append = "\
    dbus \
    sdbus-c++ \
    sdbus-c++-tools \
    jarvis-executor \
    jarvis-speaker \
    jarvis-weather \
"
