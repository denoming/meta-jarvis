SUMMARY = "Rintento service"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM ?= "file://LICENSE.md;md5=6898cb3ee19e03c282cebbcefe2b3e42"

PV = "1.0-git${SRCPV}"
PR = "r0"

SRCREV = "1873bb683308902e06e75e8de443b04268ab81b2"

SRC_URI = "\
    git://git@github.com/denoming/rintento.git;protocol=ssh;branch=main; \
    file://rintento.service \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    boost \
    jarvisto \
    libconfig \
    libsndfile1 \
    openssl \
    spdlog \
"

RDEPENDS:${PN} += "\
    jarvis-config \
"

inherit pkgconfig cmake systemd

EXTRA_OECMAKE = "\
    -DENABLE_CODE_FORMAT=OFF \
    -DENABLE_TESTS=OFF \
    -DENABLE_DLT=ON \
    -DENABLE_CLI=ON \
    -DENABLE_WIT_SUPPORT=ON \
"

SYSTEMD_SERVICE:${PN} = "rintento.service"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/${BPN}.service ${D}${systemd_system_unitdir}
}
