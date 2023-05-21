SUMMARY = "J.A.R.V.I.S weather service"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "f2c75de52f75014cb80e79abd1539afc7deeb252"

SRC_URI = "\
    git://git@github.com/karz0n/jarvis-weather.git;protocol=ssh;branch=main; \
    file://jarvis-weather.service \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    jarvis-common \
    boost \
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
