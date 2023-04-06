SUMMARY = "J.A.R.V.I.S weather service"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "714e09d6f5c34c12687fc90634612e21ab533169"

SRC_URI = "\
    git://git@github.com/karz0n/jarvis-weather.git;protocol=ssh;branch=main; \
    file://jarvis-weather.service \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    jarvis-common \
    boost \
    openssl \
    spdlog \
    sdbus-c++ \
"

RDEPENDS:${PN} += "\
    jarvis-config \
"

inherit pkgconfig cmake systemd

EXTRA_OECMAKE = "\
    -DJARVIS_ENABLE_TESTS=OFF \
"

SYSTEMD_SERVICE:${PN} = "jarvis-weather.service"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/${BPN}.service ${D}${systemd_system_unitdir}
}
