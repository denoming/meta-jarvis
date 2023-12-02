SUMMARY = "J.A.R.V.I.S console-only development image"
LICENSE = "MIT"

require jarvis-image.bb

IMAGE_FEATURES:append = "\
    dev-pkgs \
    dbg-pkgs \
    tools-debug \
    tools-testapps \
    debug-tweaks \
"
