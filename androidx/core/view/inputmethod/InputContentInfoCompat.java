package androidx.core.view.inputmethod;

/* loaded from: classes.dex */
public final class InputContentInfoCompat {
    private final androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl mImpl;

    private static final class InputContentInfoCompatApi25Impl implements androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl {
        final android.view.inputmethod.InputContentInfo mObject;

        InputContentInfoCompatApi25Impl(android.net.Uri r2, android.content.ClipDescription r3, android.net.Uri r4) {
                r1 = this;
                r1.<init>()
                android.view.inputmethod.InputContentInfo r0 = new android.view.inputmethod.InputContentInfo
                r0.<init>(r2, r3, r4)
                r1.mObject = r0
                return
        }

        InputContentInfoCompatApi25Impl(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                android.view.inputmethod.InputContentInfo r1 = (android.view.inputmethod.InputContentInfo) r1
                r0.mObject = r1
                return
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public android.net.Uri getContentUri() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.mObject
                android.net.Uri r0 = r0.getContentUri()
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public android.content.ClipDescription getDescription() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.mObject
                android.content.ClipDescription r0 = r0.getDescription()
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public java.lang.Object getInputContentInfo() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.mObject
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public android.net.Uri getLinkUri() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.mObject
                android.net.Uri r0 = r0.getLinkUri()
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void releasePermission() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.mObject
                r0.releasePermission()
                return
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void requestPermission() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.mObject
                r0.requestPermission()
                return
        }
    }

    private static final class InputContentInfoCompatBaseImpl implements androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl {
        private final android.net.Uri mContentUri;
        private final android.content.ClipDescription mDescription;
        private final android.net.Uri mLinkUri;

        InputContentInfoCompatBaseImpl(android.net.Uri r1, android.content.ClipDescription r2, android.net.Uri r3) {
                r0 = this;
                r0.<init>()
                r0.mContentUri = r1
                r0.mDescription = r2
                r0.mLinkUri = r3
                return
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public android.net.Uri getContentUri() {
                r1 = this;
                android.net.Uri r0 = r1.mContentUri
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public android.content.ClipDescription getDescription() {
                r1 = this;
                android.content.ClipDescription r0 = r1.mDescription
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public java.lang.Object getInputContentInfo() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public android.net.Uri getLinkUri() {
                r1 = this;
                android.net.Uri r0 = r1.mLinkUri
                return r0
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void releasePermission() {
                r0 = this;
                return
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void requestPermission() {
                r0 = this;
                return
        }
    }

    private interface InputContentInfoCompatImpl {
        android.net.Uri getContentUri();

        android.content.ClipDescription getDescription();

        java.lang.Object getInputContentInfo();

        android.net.Uri getLinkUri();

        void releasePermission();

        void requestPermission();
    }

    public InputContentInfoCompat(android.net.Uri r3, android.content.ClipDescription r4, android.net.Uri r5) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L11
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatApi25Impl r0 = new androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatApi25Impl
            r0.<init>(r3, r4, r5)
            r2.mImpl = r0
            goto L18
        L11:
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatBaseImpl r0 = new androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatBaseImpl
            r0.<init>(r3, r4, r5)
            r2.mImpl = r0
        L18:
            return
    }

    private InputContentInfoCompat(androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    public static androidx.core.view.inputmethod.InputContentInfoCompat wrap(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 25
            if (r1 >= r2) goto Lb
            return r0
        Lb:
            androidx.core.view.inputmethod.InputContentInfoCompat r0 = new androidx.core.view.inputmethod.InputContentInfoCompat
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatApi25Impl r1 = new androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatApi25Impl
            r1.<init>(r3)
            r0.<init>(r1)
            return r0
    }

    public android.net.Uri getContentUri() {
            r1 = this;
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl r0 = r1.mImpl
            android.net.Uri r0 = r0.getContentUri()
            return r0
    }

    public android.content.ClipDescription getDescription() {
            r1 = this;
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl r0 = r1.mImpl
            android.content.ClipDescription r0 = r0.getDescription()
            return r0
    }

    public android.net.Uri getLinkUri() {
            r1 = this;
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl r0 = r1.mImpl
            android.net.Uri r0 = r0.getLinkUri()
            return r0
    }

    public void releasePermission() {
            r1 = this;
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl r0 = r1.mImpl
            r0.releasePermission()
            return
    }

    public void requestPermission() {
            r1 = this;
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl r0 = r1.mImpl
            r0.requestPermission()
            return
    }

    public java.lang.Object unwrap() {
            r1 = this;
            androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl r0 = r1.mImpl
            java.lang.Object r0 = r0.getInputContentInfo()
            return r0
    }
}
