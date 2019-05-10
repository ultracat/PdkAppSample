
LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)

LOCAL_PACKAGE_NAME := PdkAppSample
LOCAL_PRIVATE_PLATFORM_APIS := true
LOCAL_SRC_FILES := $(call all-java-files-under, src) $(call all-Iaidl-files-under, src/aidl)
LOCAL_AIDL_INCLUDES := \
	$(LOCAL_PATH)/src/aidl	
LOCAL_USE_AAPT2 := true
LOCAL_PROGUARD_ENABLED := disabled
LOCAL_CERTIFICATE := platform
LOCAL_MODULE_TAGS := optional
LOCAL_PRIVILEGED_MODULE := true
LOCAL_DEX_PREOPT := false
LOCAL_RESOURCE_DIR := $(LOCAL_PATH)/res
LOCAL_MANIFEST_FILE := AndroidManifest.xml

LOCAL_JAVA_LIBRARIES :=

LOCAL_STATIC_JAVA_LIBRARIES := com-google-zxing-core-3-2-1

LOCAL_STATIC_ANDROID_LIBRARIES := \
    android-support-v4 \
    android-support-v13 \
    android-support-dynamic-animation \
    android-support-v7-recyclerview \
    android-support-v7-preference \
    android-support-v7-appcompat \
    android-support-transition \
    android-support-v14-preference \
		car-media-common \
		SettingLib

include $(BUILD_PACKAGE)

include $(CLEAR_VARS)

LOCAL_PREBUILT_STATIC_JAVA_LIBRARIES := \
	com-google-zxing-core-3-2-1:libs/com.google.zxing.core.3.2.1.jar

include $(BUILD_MULTI_PREBUILT)
