SUMMARY = "J.A.R.V.I.S speaker project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "6dfc6d6425464485da5211da67cbec78fda86733"
SRC_URI = "\
    git://git@github.com/karz0n/jarvis-speaker.git;protocol=ssh;branch=main; \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    boost \
    spdlog \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    google-cloud-cpp \
    libsigc++-3 \
    glibmm-2.68 \
"

inherit pkgconfig cmake

EXTRA_OECMAKE = "\
    -DJARVIS_ENABLE_TESTS=OFF \
"
