SUMMARY = "J.A.R.V.I.S executor service"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "588bda951bb438120b3ec18c74adea5c6745fd1f"

SRC_URI = "\
    git://git@github.com/karz0n/jarvis-executor.git;protocol=ssh;branch=master; \
    file://jarvis-executor.service \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    jarvis-common \
    jarvis-speaker \
    jarvis-weather \
    boost \
    spdlog \
    openssl \
    spdlog \
"

RDEPENDS:${PN} += "\
    jarvis-config \
"

inherit pkgconfig cmake systemd

EXTRA_OECMAKE = "\
    -DJARVIS_ENABLE_TESTS=OFF \
"

SYSTEMD_SERVICE:${PN} = "jarvis-executor.service"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/${BPN}.service ${D}${systemd_system_unitdir}
}
