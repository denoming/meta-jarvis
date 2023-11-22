SUMMARY = "Jarvisto common library project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "bf1e6ba6466b1cc9b08bdec3a03c2662409db8dd"
SRC_URI = "\
    git://git@github.com/karz0n/jarvisto.git;protocol=ssh;branch=main; \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    boost \
    date \
    dlt-daemon \
    libsigc++-3 \
    mosquitto \
    openssl \
    spdlog \
"

inherit pkgconfig cmake

EXTRA_OECMAKE = "\
    -DENABLE_DLT=ON \
    -DENABLE_TESTS=OFF \
"
