SUMMARY = "J.A.R.V.I.S speaker service"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "741e6c0fb3e879a2965a283f088ec2d50e55bdc4"
SRC_URI = "\
    git://git@github.com/karz0n/jarvis-speaker.git;protocol=ssh;branch=main; \
    file://jarvis-speaker.service \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    jarvis-common \
    boost \
    sdbus-c++ \
    sdbus-c++-tools-native \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    google-cloud-cpp \
    libsigc++-3 \
    glibmm-2.68 \
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
