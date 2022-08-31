SUMMARY = "J.A.R.V.I.S console-only development image"
LICENSE = "MIT"

IMAGE_FEATURES:append = "\
    ssh-server-openssh \
    tools-debug \
    debug-tweaks \
"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL:append = "\
    packagegroup-core-full-cmdline \
    packagegroup-dev-tools \
"

TOOLCHAIN_HOST_TASK:append = " \
    nativesdk-cmake \
"

require common.inc
