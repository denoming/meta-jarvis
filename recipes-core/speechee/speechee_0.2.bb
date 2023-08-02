SUMMARY = "SpeeChee service"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "ba45c757f2df36a7ea64fd61fc0dc6009ec8313e"

SRC_URI = "\
    git://git@github.com/karz0n/speechee.git;protocol=ssh;branch=main; \
    file://speechee.service \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    boost \
    glibmm-2.68 \
    google-cloud-cpp \
    gstreamer1.0 \
    gstreamer1.0-plugins-bad \    
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    jarvisto \
    libconfig \
    libsigc++-3 \
    mosquitto \
    openssl \
    sdbus-c++ \
    spdlog \
"

RDEPENDS:${PN} += "\
    jarvis-config \
"

inherit pkgconfig cmake systemd

EXTRA_OECMAKE = "\
    -DENABLE_TESTS=OFF \
    -DENABLE_DLT=ON \
    -DENABLE_CLI=ON \
"

SYSTEMD_SERVICE:${PN} = "speechee.service"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/${BPN}.service ${D}${systemd_system_unitdir}
}
