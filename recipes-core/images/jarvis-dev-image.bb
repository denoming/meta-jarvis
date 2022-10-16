SUMMARY = "J.A.R.V.I.S development image"
LICENSE = "MIT"

IMAGE_FEATURES:append = "\
    dev-pkgs \
    doc-pkgs \
    dbg-pkgs \
    tools-debug \
    debug-tweaks \
    package-management \
"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL:append = "\
    packagegroup-self-hosted-sdk \
    packagegroup-self-hosted-extended \
    packagegroup-dev-tools \
    packagegroup-dev-packages \
"

TOOLCHAIN_HOST_TASK:append = " \
    nativesdk-cmake \
"

require common.inc
