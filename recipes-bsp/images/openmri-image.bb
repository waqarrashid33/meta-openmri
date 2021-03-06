inherit core-image

SUMMARY = "An image to support the OCRA OpenMRI project."

IMAGE_INSTALL = "${CORE_IMAGE_BASE_INSTALL} zynq-fsbl git curl rsync cmake"

IMAGE_FEATURES += "splash package-management ssh-server-openssh empty-root-password tools-sdk tools-debug dev-pkgs doc-pkgs staticdev-pkgs"
PACKAGE_CLASSES = "package_deb"

LICENSE = "MIT"

