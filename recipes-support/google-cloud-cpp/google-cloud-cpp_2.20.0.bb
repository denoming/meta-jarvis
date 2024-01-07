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
    protobuf-c \
    protobuf-c-native \
    grpc \
    grpc-native \
"

PR = "r0"

S = "${WORKDIR}/git"
SRCREV = "d752a02f7a0647f62d0ecc3b8f947637f68ca9ee"
BRANCH = "v2.20.x"
SRC_URI = "\
    git://github.com/googleapis/google-cloud-cpp.git;protocol=https;branch=${BRANCH} \
"

inherit cmake

EXTRA_OECMAKE += "\
    -DCMAKE_CXX_STANDARD=17 \
    -DCMAKE_CROSSCOMPILING=ON \
    -DBUILD_TESTING=OFF \
    -DProtobuf_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/protoc \
    -DGOOGLE_CLOUD_CPP_ENABLE=texttospeech \
    -DGOOGLE_CLOUD_CPP_ENABLE_EXAMPLES=OFF \
    -DGOOGLE_CLOUD_CPP_GRPC_PLUGIN_EXECUTABLE=${STAGING_BINDIR_NATIVE}/grpc_cpp_plugin \
"

PACKAGECONFIG ??= "shared"
PACKAGECONFIG[shared] = "-DBUILD_SHARED_LIBS=ON,-DBUILD_SHARED_LIBS=OFF,,"
