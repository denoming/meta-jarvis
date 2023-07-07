SUMMARY = "Jarvisto common library project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "f770f3b1906433fd07c4bfafd27e4696b7af4580"
SRC_URI = "\
    git://git@github.com/karz0n/jarvisto.git;protocol=ssh;branch=main; \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    boost \
    date \
    openssl \
    spdlog \
    dlt-daemon \
"

inherit pkgconfig cmake

EXTRA_OECMAKE = "\
    -DENABLE_DLT=ON \
    -DENABLE_TESTS=OFF \
"
