SUMMARY = "J.A.R.V.I.S common library project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "11979450845fc7555cfa2d173e2af9734ef99954"
SRC_URI = "\
    git://git@github.com/karz0n/jarvis-common.git;protocol=ssh;branch=main; \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    boost \
    spdlog \
"

inherit pkgconfig cmake

EXTRA_OECMAKE = "\
    -DJARVIS_ENABLE_TESTS=OFF \
"
