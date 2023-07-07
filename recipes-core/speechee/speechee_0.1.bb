SUMMARY = "SpeeChee service"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRCREV = "06c647fa40cb2b8b945630feb2dbf16c8c4ee3ce"

SRC_URI = "\
    git://git@github.com/karz0n/speechee.git;protocol=ssh;branch=main; \
    file://speechee.service \
"

S = "${WORKDIR}/git"

DEPENDS += "\
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
    jarvisto \
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
