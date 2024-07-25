SUMMARY = "SpeeChee service"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "3b0fc566e4ad2d52a37b8a0c95a7b9387d3a09b9"

SRC_URI = "\
    git://git@github.com/denoming/speechee.git;protocol=ssh;branch=main; \
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
    -DENABLE_DBUS_SUPPORT=ON \
    -DENABLE_HTTP_SUPPORT=ON \
    -DENABLE_INTEGRATION=ON \
"

SYSTEMD_SERVICE:${PN} = "speechee.service"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/${BPN}.service ${D}${systemd_system_unitdir}
}
