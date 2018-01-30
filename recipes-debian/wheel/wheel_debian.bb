PR = "${INC_PR}.0"

require wheel.inc

inherit setuptools pythonnative

DEPENDS += "python-setuptools-native"

do_install_append() {
	# Remove unwanted files
	find ${D}${PYTHON_SITEPACKAGES_DIR} -type f -name "*.pyc" -exec rm -f {} \;
	rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/wheel-0.24.0-py2.7.egg-info/SOURCES.txt
}

PKG_${PN} = "python-${PN}"

BBCLASSEXTEND = "native"
