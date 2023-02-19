SUMMARY = "J.A.R.V.I.S common library project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "2e0b37f1323b78be585e41f630a9d9c2659080a7"
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
