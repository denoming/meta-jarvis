SUMMARY = "Jarvisto common library project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "3338b0cd1e4698295490303919df8dcb6c6f6c6b"
SRC_URI = "\
    git://git@github.com/karz0n/jarvisto.git;protocol=ssh;branch=main; \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    boost \
    date \
    dlt-daemon \
    openssl \
    spdlog \
"

inherit pkgconfig cmake

EXTRA_OECMAKE = "\
    -DENABLE_DLT=ON \
    -DENABLE_TESTS=OFF \
"
