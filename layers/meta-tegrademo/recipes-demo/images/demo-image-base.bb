DESCRIPTION = "Tegra demo base image"

require demo-image-common.inc

IMAGE_INSTALL:append = " \
    mender-artifact-info \
    tegra-nvpmodel \
    tegra-nvstartup \
    util-linux \
    tegra-redundant-boot \
    exfat-utils \
        "