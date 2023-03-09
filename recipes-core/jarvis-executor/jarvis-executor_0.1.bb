SUMMARY = "J.A.R.V.I.S executor service project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "b9a7ba01ff1869e0b027f0467971310aacc86b1a"
SRC_URI = "\
    git://git@github.com/karz0n/jarvis-executor.git;protocol=ssh;branch=master; \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    jarvis-common \
    boost \
    spdlog \
    openssl \
"

inherit pkgconfig cmake

EXTRA_OECMAKE = "\
    -DFETCHCONTENT_FULLY_DISCONNECTED=OFF \
    -DJARVIS_ENABLE_TESTS=OFF \
"