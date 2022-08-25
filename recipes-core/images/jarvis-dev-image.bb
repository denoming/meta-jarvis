SUMMARY = "J.A.R.V.I.S console-only development image"
LICENSE = "MIT"

IMAGE_FEATURES = "\
    splash \
    ssh-server-openssh \
    debug-tweaks \
"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += "\
    packagegroup-core-full-cmdline \
    packagegroup-self-hosted \
    packagegroup-custom-devtools \
"

CORE_IMAGE_EXTRA_INSTALL += "\
    googletest-dev \
    googletest-dbg \
    boost-dev \
    boost-dbg \
"

TOOLCHAIN_HOST_TASK:append = " \
    nativesdk-cmake \
"

require common.inc
