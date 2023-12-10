SUMMARY = "J.A.R.V.I.S config"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PR = "r0"

SRC_URI = "\
    file://${JAR_CONFIG_FILE};subdir=files \
"

S = "${WORKDIR}/files"

FILES:${PN} += "\
    ${datadir} \
    ${sysconfdir} \
    ${localstatedir} \
"

do_install() {
    # Copy all config files into config dir
    cp -R ${S}/* ${D}
}

