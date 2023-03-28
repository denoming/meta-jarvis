SUMMARY = "J.A.R.V.I.S executor service"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "a28c70494beccac536fe16c967bfc757c91b828a"
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

inherit pkgconfig cmake systemd

EXTRA_OECMAKE = "\
    -DJARVIS_ENABLE_TESTS=OFF \
"

SYSTEMD_SERVICE_${PN} = "jarvis-executor.service"

FILES:${PN} += "\
    ${systemd_system_unitdir}/* \
"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/${BPN}.service ${D}${systemd_system_unitdir}
}