SUMMARY = "J.A.R.V.I.S console-only production image"
LICENSE = "MIT"

require recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES:append = "\
    splash \
    ssh-server-dropbear \
    read-only-rootfs \
    hwcodecs \
    package-management \
"

CORE_IMAGE_EXTRA_INSTALL:append = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    packagegroup-jarvis \
"

CORE_IMAGE_EXTRA_INSTALL:append = "\
    jarvisto \
    speechee \
    rintento \
"
