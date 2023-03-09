SUMMARY = "J.A.R.V.I.S common library project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "3c7c18d1a746b1792bfda63c723c2384534a532f"
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
