SUMMARY = "J.A.R.V.I.S common library project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "ed62b484187cd2c5e8b550bcbf7c98be1bd27d4f"
SRC_URI = "\
    git://git@github.com/karz0n/jarvis-common.git;protocol=ssh;branch=main; \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    boost \
    openssl \
    spdlog \
    dlt-daemon \
"

inherit pkgconfig cmake

EXTRA_OECMAKE = "\
    -DJARVIS_ENABLE_DLT=ON \
    -DJARVIS_ENABLE_TESTS=OFF \
"
