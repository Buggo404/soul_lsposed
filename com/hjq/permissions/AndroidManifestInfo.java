package com.hjq.permissions;

/* loaded from: classes.dex */
final class AndroidManifestInfo {
    final java.util.List<com.hjq.permissions.AndroidManifestInfo.ActivityInfo> activityInfoList;
    com.hjq.permissions.AndroidManifestInfo.ApplicationInfo applicationInfo;
    java.lang.String packageName;
    final java.util.List<com.hjq.permissions.AndroidManifestInfo.PermissionInfo> permissionInfoList;
    final java.util.List<com.hjq.permissions.AndroidManifestInfo.ServiceInfo> serviceInfoList;
    com.hjq.permissions.AndroidManifestInfo.UsesSdkInfo usesSdkInfo;

    static final class ActivityInfo {
        public java.lang.String name;
        public boolean supportsPictureInPicture;

        ActivityInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static final class ApplicationInfo {
        public java.lang.String name;
        public boolean requestLegacyExternalStorage;

        ApplicationInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static final class PermissionInfo {
        private static final int REQUESTED_PERMISSION_NEVER_FOR_LOCATION = 65536;
        public int maxSdkVersion;
        public java.lang.String name;
        public int usesPermissionFlags;

        PermissionInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean neverForLocation() {
                r2 = this;
                int r0 = r2.usesPermissionFlags
                r1 = 65536(0x10000, float:9.18355E-41)
                r0 = r0 & r1
                if (r0 == 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }
    }

    static final class ServiceInfo {
        public java.lang.String name;
        public java.lang.String permission;

        ServiceInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static final class UsesSdkInfo {
        public int minSdkVersion;

        UsesSdkInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    AndroidManifestInfo() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.permissionInfoList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.activityInfoList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.serviceInfoList = r0
            return
    }
}
