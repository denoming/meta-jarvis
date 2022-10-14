DESCRIPTION = "Google Cloud C++ client"
HOMEPAGE = "https://github.com/googleapis/google-cloud-cpp"
SECTION = "libs"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "\
    crc32c \
    nlohmann-json \
    protobuf \
    protobuf-native \
    grpc \
    grpc-native \
"

PR = "r0"

S = "${WORKDIR}/git"
SRCREV = "dfa5857a01191e064d3ffc831b330cf1aa5c0441"
BRANCH = "v2.2.x"
SRC_URI = "\
    git://github.com/googleapis/google-cloud-cpp.git;protocol=https;branch=${BRANCH} \
"

inherit cmake

EXTRA_OECMAKE += "\
    -DCMAKE_CXX_STANDARD=14 \
    -DBUILD_TESTING=OFF \
    -DGOOGLE_CLOUD_CPP_ENABLE=texttospeech \
    -DGOOGLE_CLOUD_CPP_ENABLE_EXAMPLES=OFF \
"

PACKAGECONFIG ??= "shared"
PACKAGECONFIG[shared] = "-DBUILD_SHARED_LIBS=ON,-DBUILD_SHARED_LIBS=OFF,,"
