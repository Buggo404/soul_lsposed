package androidx.core.view.accessibility;

/* loaded from: classes.dex */
public class AccessibilityNodeProviderCompat {
    public static final int HOST_VIEW_ID = -1;
    private final java.lang.Object mProvider;

    static class AccessibilityNodeProviderApi16 extends android.view.accessibility.AccessibilityNodeProvider {
        final androidx.core.view.accessibility.AccessibilityNodeProviderCompat mCompat;

        AccessibilityNodeProviderApi16(androidx.core.view.accessibility.AccessibilityNodeProviderCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mCompat = r1
                return
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r2) {
                r1 = this;
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = r1.mCompat
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = r0.createAccessibilityNodeInfo(r2)
                if (r2 != 0) goto La
                r2 = 0
                return r2
            La:
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.unwrap()
                return r2
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String r4, int r5) {
                r3 = this;
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = r3.mCompat
                java.util.List r4 = r0.findAccessibilityNodeInfosByText(r4, r5)
                if (r4 != 0) goto La
                r4 = 0
                return r4
            La:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                int r0 = r4.size()
                r1 = 0
            L14:
                if (r1 >= r0) goto L26
                java.lang.Object r2 = r4.get(r1)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r2
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.unwrap()
                r5.add(r2)
                int r1 = r1 + 1
                goto L14
            L26:
                return r5
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int r2, int r3, android.os.Bundle r4) {
                r1 = this;
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = r1.mCompat
                boolean r2 = r0.performAction(r2, r3, r4)
                return r2
        }
    }

    static class AccessibilityNodeProviderApi19 extends androidx.core.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi16 {
        AccessibilityNodeProviderApi19(androidx.core.view.accessibility.AccessibilityNodeProviderCompat r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
                r1 = this;
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = r1.mCompat
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = r0.findFocus(r2)
                if (r2 != 0) goto La
                r2 = 0
                return r2
            La:
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.unwrap()
                return r2
        }
    }

    static class AccessibilityNodeProviderApi26 extends androidx.core.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi19 {
        AccessibilityNodeProviderApi26(androidx.core.view.accessibility.AccessibilityNodeProviderCompat r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int r2, android.view.accessibility.AccessibilityNodeInfo r3, java.lang.String r4, android.os.Bundle r5) {
                r1 = this;
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = r1.mCompat
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r3)
                r0.addExtraDataToAccessibilityNodeInfo(r2, r3, r4, r5)
                return
        }
    }

    public AccessibilityNodeProviderCompat() {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L11
            androidx.core.view.accessibility.AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi26 r0 = new androidx.core.view.accessibility.AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi26
            r0.<init>(r2)
            r2.mProvider = r0
            goto L18
        L11:
            androidx.core.view.accessibility.AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi19 r0 = new androidx.core.view.accessibility.AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi19
            r0.<init>(r2)
            r2.mProvider = r0
        L18:
            return
    }

    public AccessibilityNodeProviderCompat(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.mProvider = r1
            return
    }

    public void addExtraDataToAccessibilityNodeInfo(int r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2, java.lang.String r3, android.os.Bundle r4) {
            r0 = this;
            return
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(java.lang.String r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat findFocus(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.lang.Object getProvider() {
            r1 = this;
            java.lang.Object r0 = r1.mProvider
            return r0
    }

    public boolean performAction(int r1, int r2, android.os.Bundle r3) {
            r0 = this;
            r1 = 0
            return r1
    }
}
