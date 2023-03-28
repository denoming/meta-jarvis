SUMMARY = "J.A.R.V.I.S speaker service"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "9210c5651f0936cf2117ef9f2dc28c3e0e03c379"
SRC_URI = "\
    git://git@github.com/karz0n/jarvis-speaker.git;protocol=ssh;branch=main; \
    file://jarvis-speaker.service \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    jarvis-common \
    boost \
    openssl \
    spdlog \
    glibmm-2.68 \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    sdbus-c++ \
    libsigc++-3 \
    google-cloud-cpp \
"

inherit pkgconfig cmake systemd

EXTRA_OECMAKE = "\
    -DJARVIS_ENABLE_TESTS=OFF \
"

SYSTEMD_SERVICE_${PN} = "jarvis-speaker.service"

FILES:${PN} += "\
    ${systemd_system_unitdir}/* \
"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/${BPN}.service ${D}${systemd_system_unitdir}
}
