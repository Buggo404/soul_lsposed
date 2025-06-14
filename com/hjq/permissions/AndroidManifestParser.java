package com.hjq.permissions;

/* loaded from: classes.dex */
final class AndroidManifestParser {
    private static final java.lang.String ANDROID_MANIFEST_FILE_NAME = "AndroidManifest.xml";
    private static final java.lang.String ANDROID_NAMESPACE_URI = "http://schemas.android.com/apk/res/android";
    private static final java.lang.String ATTR_MAX_SDK_VERSION = "maxSdkVersion";
    private static final java.lang.String ATTR_MIN_SDK_VERSION = "minSdkVersion";
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.String ATTR_PACKAGE = "package";
    private static final java.lang.String ATTR_PERMISSION = "permission";
    private static final java.lang.String ATTR_REQUEST_LEGACY_EXTERNAL_STORAGE = "requestLegacyExternalStorage";
    private static final java.lang.String ATTR_SUPPORTS_PICTURE_IN_PICTURE = "supportsPictureInPicture";
    private static final java.lang.String ATTR_USES_PERMISSION_FLAGS = "usesPermissionFlags";
    private static final java.lang.String TAG_ACTIVITY = "activity";
    private static final java.lang.String TAG_ACTIVITY_ALIAS = "activity-alias";
    private static final java.lang.String TAG_APPLICATION = "application";
    private static final java.lang.String TAG_MANIFEST = "manifest";
    private static final java.lang.String TAG_SERVICE = "service";
    private static final java.lang.String TAG_USES_PERMISSION = "uses-permission";
    private static final java.lang.String TAG_USES_PERMISSION_SDK_23 = "uses-permission-sdk-23";
    private static final java.lang.String TAG_USES_PERMISSION_SDK_M = "uses-permission-sdk-m";
    private static final java.lang.String TAG_USES_SDK = "uses-sdk";

    AndroidManifestParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.hjq.permissions.AndroidManifestInfo.ActivityInfo parseActivityFromXml(android.content.res.XmlResourceParser r4) {
            com.hjq.permissions.AndroidManifestInfo$ActivityInfo r0 = new com.hjq.permissions.AndroidManifestInfo$ActivityInfo
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r4.getAttributeValue(r2, r1)
            r0.name = r1
            java.lang.String r1 = "supportsPictureInPicture"
            r3 = 0
            boolean r4 = r4.getAttributeBooleanValue(r2, r1, r3)
            r0.supportsPictureInPicture = r4
            return r0
    }

    static com.hjq.permissions.AndroidManifestInfo parseAndroidManifest(android.content.Context r3, int r4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            com.hjq.permissions.AndroidManifestInfo r0 = new com.hjq.permissions.AndroidManifestInfo
            r0.<init>()
            android.content.res.AssetManager r3 = r3.getAssets()
            java.lang.String r1 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r3 = r3.openXmlResourceParser(r4, r1)
        Lf:
            int r4 = r3.getEventType()
            r1 = 2
            if (r4 == r1) goto L18
            goto L94
        L18:
            java.lang.String r4 = r3.getName()
            java.lang.String r1 = "manifest"
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 == 0) goto L2d
            r1 = 0
            java.lang.String r2 = "package"
            java.lang.String r1 = r3.getAttributeValue(r1, r2)
            r0.packageName = r1
        L2d:
            java.lang.String r1 = "uses-sdk"
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 == 0) goto L3b
            com.hjq.permissions.AndroidManifestInfo$UsesSdkInfo r1 = parseUsesSdkFromXml(r3)
            r0.usesSdkInfo = r1
        L3b:
            java.lang.String r1 = "uses-permission"
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 != 0) goto L53
            java.lang.String r1 = "uses-permission-sdk-23"
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 != 0) goto L53
            java.lang.String r1 = "uses-permission-sdk-m"
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 == 0) goto L5c
        L53:
            com.hjq.permissions.AndroidManifestInfo$PermissionInfo r1 = parsePermissionFromXml(r3)
            java.util.List<com.hjq.permissions.AndroidManifestInfo$PermissionInfo> r2 = r0.permissionInfoList
            r2.add(r1)
        L5c:
            java.lang.String r1 = "application"
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 == 0) goto L6a
            com.hjq.permissions.AndroidManifestInfo$ApplicationInfo r1 = parseApplicationFromXml(r3)
            r0.applicationInfo = r1
        L6a:
            java.lang.String r1 = "activity"
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 != 0) goto L7a
            java.lang.String r1 = "activity-alias"
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 == 0) goto L83
        L7a:
            com.hjq.permissions.AndroidManifestInfo$ActivityInfo r1 = parseActivityFromXml(r3)
            java.util.List<com.hjq.permissions.AndroidManifestInfo$ActivityInfo> r2 = r0.activityInfoList
            r2.add(r1)
        L83:
            java.lang.String r1 = "service"
            boolean r4 = android.text.TextUtils.equals(r1, r4)
            if (r4 == 0) goto L94
            com.hjq.permissions.AndroidManifestInfo$ServiceInfo r4 = parseServerFromXml(r3)
            java.util.List<com.hjq.permissions.AndroidManifestInfo$ServiceInfo> r1 = r0.serviceInfoList
            r1.add(r4)
        L94:
            int r4 = r3.next()
            r1 = 1
            if (r4 != r1) goto Lf
            r3.close()
            return r0
    }

    private static com.hjq.permissions.AndroidManifestInfo.ApplicationInfo parseApplicationFromXml(android.content.res.XmlResourceParser r4) {
            com.hjq.permissions.AndroidManifestInfo$ApplicationInfo r0 = new com.hjq.permissions.AndroidManifestInfo$ApplicationInfo
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r4.getAttributeValue(r2, r1)
            r0.name = r1
            java.lang.String r1 = "requestLegacyExternalStorage"
            r3 = 0
            boolean r4 = r4.getAttributeBooleanValue(r2, r1, r3)
            r0.requestLegacyExternalStorage = r4
            return r0
    }

    private static com.hjq.permissions.AndroidManifestInfo.PermissionInfo parsePermissionFromXml(android.content.res.XmlResourceParser r4) {
            com.hjq.permissions.AndroidManifestInfo$PermissionInfo r0 = new com.hjq.permissions.AndroidManifestInfo$PermissionInfo
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r4.getAttributeValue(r2, r1)
            r0.name = r1
            java.lang.String r1 = "maxSdkVersion"
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r4.getAttributeIntValue(r2, r1, r3)
            r0.maxSdkVersion = r1
            java.lang.String r1 = "usesPermissionFlags"
            r3 = 0
            int r4 = r4.getAttributeIntValue(r2, r1, r3)
            r0.usesPermissionFlags = r4
            return r0
    }

    private static com.hjq.permissions.AndroidManifestInfo.ServiceInfo parseServerFromXml(android.content.res.XmlResourceParser r3) {
            com.hjq.permissions.AndroidManifestInfo$ServiceInfo r0 = new com.hjq.permissions.AndroidManifestInfo$ServiceInfo
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r3.getAttributeValue(r2, r1)
            r0.name = r1
            java.lang.String r1 = "permission"
            java.lang.String r3 = r3.getAttributeValue(r2, r1)
            r0.permission = r3
            return r0
    }

    private static com.hjq.permissions.AndroidManifestInfo.UsesSdkInfo parseUsesSdkFromXml(android.content.res.XmlResourceParser r4) {
            com.hjq.permissions.AndroidManifestInfo$UsesSdkInfo r0 = new com.hjq.permissions.AndroidManifestInfo$UsesSdkInfo
            r0.<init>()
            java.lang.String r1 = "minSdkVersion"
            r2 = 0
            java.lang.String r3 = "http://schemas.android.com/apk/res/android"
            int r4 = r4.getAttributeIntValue(r3, r1, r2)
            r0.minSdkVersion = r4
            return r0
    }
}
