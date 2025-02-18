# Copyright (C) 2011 The Android Open Source Project
# Copyright (C) 2018 CypherOS
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

LOCAL_PATH := $(call my-dir)

SUPPORT_PATH_LOTTIE := java/vortex/support/lottie

include $(CLEAR_VARS)

LOCAL_USE_AAPT2 := true
LOCAL_MODULE := vortex-support-lottie
LOCAL_SDK_VERSION := $(SUPPORT_CURRENT_SDK_VERSION)
LOCAL_SRC_FILES := $(call all-java-files-under, $(SUPPORT_PATH_LOTTIE))
LOCAL_RESOURCE_DIR := $(LOCAL_PATH)/res

LOCAL_STATIC_ANDROID_LIBRARIES := \
        android-support-v7-appcompat
		
LOCAL_SHARED_ANDROID_LIBRARIES := \
        android-support-v4 \
        android-support-annotations

LOCAL_JAVA_LANGUAGE_VERSION := 1.7
LOCAL_AAPT_FLAGS := --add-javadoc-annotation doconly
LOCAL_JAR_EXCLUDE_FILES := none

include $(BUILD_STATIC_JAVA_LIBRARY)