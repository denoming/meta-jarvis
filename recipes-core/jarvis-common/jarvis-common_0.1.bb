SUMMARY = "J.A.R.V.I.S common library project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "e5ef428ad179d4f4dde379b0bb2c8432ed7137fd"
SRC_URI = "\
    git://git@github.com/karz0n/jarvis-common.git;protocol=ssh;branch=main; \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    openssl \
    boost \
    spdlog \
"

inherit pkgconfig cmake

EXTRA_OECMAKE = "\
    -DJARVIS_ENABLE_TESTS=OFF \
"
