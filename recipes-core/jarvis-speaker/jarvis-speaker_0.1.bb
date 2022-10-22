SUMMARY = "J.A.R.V.I.S speaker service project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "f8a5f13d5840783a1a4c17a65a8df9f47200a369"
SRC_URI = "\
    git://git@github.com/karz0n/jarvis-speaker.git;protocol=ssh;branch=main; \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    jarvis-common \
    boost \
    spdlog \
    sdbus-c++ \
    sdbus-c++-tools-native \
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
