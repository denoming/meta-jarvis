DESCRIPTION = "The J.A.R.V.I.S Raspberry Pi package group"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

COMPATIBLE_MACHINE = "^rpi$"

RDEPENDS:${PN} = "\
    libcamera \
    libcamera-apps \
    raspi-gpio \
    rpi-gpio \
    rpio \
    pi-blaster \
    python3-adafruit-circuitpython-register \
    python3-adafruit-platformdetect \
    python3-adafruit-pureio \
    python3-rtimu \
"

RRECOMMENDS:${PN} = "\
    ${MACHINE_EXTRA_RRECOMMENDS} \
"
