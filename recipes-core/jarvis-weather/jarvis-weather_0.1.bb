SUMMARY = "J.A.R.V.I.S weather service project"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "a4c29302f4ea4a54a61e8ee13df80ddb7bf415c3"
SRC_URI = "\
    git://git@github.com/karz0n/jarvis-weather.git;protocol=ssh;branch=main; \
    file://jarvis-weather.service \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    jarvis-common \
    boost \
    openssl \
    sdbus-c++ \
"

inherit pkgconfig cmake systemd

EXTRA_OECMAKE = "\
    -DJARVIS_ENABLE_TESTS=OFF \
"

SYSTEMD_SERVICE_${PN} = "jarvis-weather.service"

FILES:${PN} += "\
    ${systemd_system_unitdir}/* \
"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/${BPN}.service ${D}${systemd_system_unitdir}
}
