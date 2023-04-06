SUMMARY = "J.A.R.V.I.S config"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRC_URI = "\
    file://${JAR_CONFIG_FILE} \
"

S = "${WORKDIR}"

FILES:${PN} += "\
    ${datadir}/* \
"

do_install() {
    # Create config dir
    install -d ${D}${datadir}/jarvis
    # Copy all config files into config dir
    cp ${S}${datadir}/jarvis/*.* ${D}${datadir}/jarvis
}

