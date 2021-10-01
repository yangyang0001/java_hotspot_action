#!/bin/bash
export LANG=C

export ALT_BOOTDIR="/home/jdk1.6.0_35"
export ALT_JDK_IMPORT_PATH="/home/jdk1.6.0_35"

export ANT_HOME="/home/apache-ant-1.8.4"
export PATH="/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/root/bin"

export HOTSPOT_BUILD_JOBS=5
export ALT_OUTPUTDIR=/home/openjdk/hotspot/build_jvm
export ARCH_DATA_MODEL=64

cd make
make jvmg jvmg1 2>&1 | tee /home/openjdk/hotspot/build_jvm/hotspot_debug.log
