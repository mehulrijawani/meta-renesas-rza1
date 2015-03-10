# Ship all kernel modules by default
MACHINE_EXTRA_RRECOMMENDS = " kernel-modules"

DEFAULTTUNE = "cortexa9thf-neon"
include conf/machine/include/tune-cortexa9.inc
include conf/machine/include/soc-family.inc

SOC_FAMILY = "rza1"

PREFERRED_PROVIDER_virtual/kernel ??= "linux-rza1"
PREFERRED_PROVIDER_u-boot ??= "u-boot-rza1"
PREFERRED_PROVIDER_jpeg ??= "libjpeg-turbo"
