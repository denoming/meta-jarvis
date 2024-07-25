SUMMARY = "Jarvisto library with common building blocks for typical applications"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM ?= "file://LICENSE.md;md5=6898cb3ee19e03c282cebbcefe2b3e42"

PV = "0.3-git${SRCPV}"
PR = "r0"

SRCREV = "ffa83844f3c435c1c45053cce38b05c38964dcb9"

SRC_URI = "\
    git://git@github.com/denoming/jarvisto.git;protocol=ssh;branch=main; \
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
