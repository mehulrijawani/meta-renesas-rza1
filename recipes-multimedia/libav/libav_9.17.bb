require recipes-multimedia/libav/libav.inc

LIC_FILES_CHKSUM = "file://COPYING.GPLv2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://COPYING.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
                    file://COPYING.LGPLv2.1;md5=bd7a443320af8c812e4c18d1b79df004 \
                    file://COPYING.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "http://libav.org/releases/${BP}.tar.xz file://ipv6.patch"

SRC_URI[md5sum] = "697ce3faef1d9813bc1e7384b1089001"
SRC_URI[sha256sum] = "e32d5f152bce1de283c002a35eb6e71f265877633dee8a40db4d16381dd5d17c"
