SUMMARY = "J.A.R.V.I.S console-only development image"
LICENSE = "MIT"

require jarvis-image.bb

IMAGE_FEATURES:append = "\
    dev-pkgs \
    dbg-pkgs \
    tools-debug \
    tools-testapps \
    debug-tweaks \
    package-management \
"

CORE_IMAGE_EXTRA_INSTALL:append = "\
    packagegroup-core-buildessential \
    packagegroup-core-sdk \
    packagegroup-core-tools-debug \
    packagegroup-core-tools-profile \
    packagegroup-dev-tools \
    packagegroup-dev-packages \
"

TOOLCHAIN_HOST_TASK:append = "\
    nativesdk-cmake \
"

TOOLCHAIN_HOST_TASK_ESDK:append = "\
    nativesdk-cmake \
"
