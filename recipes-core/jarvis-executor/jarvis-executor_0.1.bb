SUMMARY = "J.A.R.V.I.S executor project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "38c54e4b7bdee5e5083bdc913e77c56139e237fc"
SRC_URI = "\
    git://git@github.com/karz0n/jarvis-executor.git;protocol=ssh;branch=master; \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    boost \
    spdlog \
    openssl \
"

inherit pkgconfig cmake

EXTRA_OECMAKE = "\
    -DFETCHCONTENT_FULLY_DISCONNECTED=OFF \
    -DJARVIS_ENABLE_TESTS=OFF \
"