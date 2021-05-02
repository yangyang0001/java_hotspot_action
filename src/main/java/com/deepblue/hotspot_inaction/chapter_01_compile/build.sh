#!/bin/bash
export LANG=C

#导入JDK路径
export ALT_BOOTDIR="/home/jdk1.7.0_79"
export ALT_JDK_IMPORT_PATH="/home/jdk1.7.0_79"

#导入ANT路径
export ANT_HOME="/home/apache-ant-1.8.4"

#导入PATH
export PATH="/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games"

#其他配置
export HOTSPOT_BUILD_JOBS=5

#编译后的输出目录
export ALT_OUTPUTDIR=/home/openjdk/hotspot/build_jvm

#编译模式jvm采用64位
export ARCH_DATA_MODEL=64

cd make
make jvmg jvmg1 2>&1 | tee /home/openjdk/hotspot/build_jvm/hotspot_debug.log
