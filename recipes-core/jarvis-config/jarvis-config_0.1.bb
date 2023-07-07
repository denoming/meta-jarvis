SUMMARY = "J.A.R.V.I.S config"
SECTION = "examples"
LICENSE = "CLOSED"

PR = "r0"

SRC_URI = "\
    file://${JAR_CONFIG_FILE} \
"

S = "${WORKDIR}"

FILES:${PN} += "\
    ${datadir} \
    ${sysconfdir} \
    ${localstatedir} \
"

do_install() {
    # Copy all config files into config dir
    cp -R ${S}/files/* ${D}
}

