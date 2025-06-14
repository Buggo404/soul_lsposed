package androidx.core.view;

/* loaded from: classes.dex */
public class WindowInsetsCompat {
    public static final androidx.core.view.WindowInsetsCompat CONSUMED = null;
    private static final java.lang.String TAG = "WindowInsetsCompat";
    private final androidx.core.view.WindowInsetsCompat.Impl mImpl;

    static class Api21ReflectionHolder {
        private static java.lang.reflect.Field sContentInsets;
        private static boolean sReflectionSucceeded;
        private static java.lang.reflect.Field sStableInsets;
        private static java.lang.reflect.Field sViewAttachInfoField;

        static {
                java.lang.Class<android.view.View> r0 = android.view.View.class
                java.lang.String r1 = "mAttachInfo"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sViewAttachInfoField = r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r0 = "android.view.View$AttachInfo"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r2 = "mStableInsets"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L2d
                androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sStableInsets = r2     // Catch: java.lang.ReflectiveOperationException -> L2d
                r2.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r2 = "mContentInsets"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L2d
                androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sContentInsets = r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sReflectionSucceeded = r1     // Catch: java.lang.ReflectiveOperationException -> L2d
                goto L46
            L2d:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Failed to get visible insets from AttachInfo "
                r1.<init>(r2)
                java.lang.String r2 = r0.getMessage()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "WindowInsetsCompat"
                android.util.Log.w(r2, r1, r0)
            L46:
                return
        }

        private Api21ReflectionHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View r4) {
                boolean r0 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sReflectionSucceeded
                r1 = 0
                if (r0 == 0) goto L69
                boolean r0 = r4.isAttachedToWindow()
                if (r0 != 0) goto Lc
                goto L69
            Lc:
                android.view.View r0 = r4.getRootView()
                java.lang.reflect.Field r2 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sViewAttachInfoField     // Catch: java.lang.IllegalAccessException -> L50
                java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L50
                if (r0 == 0) goto L69
                java.lang.reflect.Field r2 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sStableInsets     // Catch: java.lang.IllegalAccessException -> L50
                java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L50
                android.graphics.Rect r2 = (android.graphics.Rect) r2     // Catch: java.lang.IllegalAccessException -> L50
                java.lang.reflect.Field r3 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sContentInsets     // Catch: java.lang.IllegalAccessException -> L50
                java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.IllegalAccessException -> L50
                android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch: java.lang.IllegalAccessException -> L50
                if (r2 == 0) goto L69
                if (r0 == 0) goto L69
                androidx.core.view.WindowInsetsCompat$Builder r3 = new androidx.core.view.WindowInsetsCompat$Builder     // Catch: java.lang.IllegalAccessException -> L50
                r3.<init>()     // Catch: java.lang.IllegalAccessException -> L50
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.m8of(r2)     // Catch: java.lang.IllegalAccessException -> L50
                androidx.core.view.WindowInsetsCompat$Builder r2 = r3.setStableInsets(r2)     // Catch: java.lang.IllegalAccessException -> L50
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.m8of(r0)     // Catch: java.lang.IllegalAccessException -> L50
                androidx.core.view.WindowInsetsCompat$Builder r0 = r2.setSystemWindowInsets(r0)     // Catch: java.lang.IllegalAccessException -> L50
                androidx.core.view.WindowInsetsCompat r0 = r0.build()     // Catch: java.lang.IllegalAccessException -> L50
                r0.setRootWindowInsets(r0)     // Catch: java.lang.IllegalAccessException -> L50
                android.view.View r4 = r4.getRootView()     // Catch: java.lang.IllegalAccessException -> L50
                r0.copyRootViewBounds(r4)     // Catch: java.lang.IllegalAccessException -> L50
                return r0
            L50:
                r4 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Failed to get insets from AttachInfo. "
                r0.<init>(r2)
                java.lang.String r2 = r4.getMessage()
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "WindowInsetsCompat"
                android.util.Log.w(r2, r0, r4)
            L69:
                return r1
        }
    }

    public static final class Builder {
        private final androidx.core.view.WindowInsetsCompat.BuilderImpl mImpl;

        public Builder() {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto L11
                androidx.core.view.WindowInsetsCompat$BuilderImpl30 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl30
                r0.<init>()
                r2.mImpl = r0
                goto L26
            L11:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L1f
                androidx.core.view.WindowInsetsCompat$BuilderImpl29 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl29
                r0.<init>()
                r2.mImpl = r0
                goto L26
            L1f:
                androidx.core.view.WindowInsetsCompat$BuilderImpl20 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl20
                r0.<init>()
                r2.mImpl = r0
            L26:
                return
        }

        public Builder(androidx.core.view.WindowInsetsCompat r3) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto L11
                androidx.core.view.WindowInsetsCompat$BuilderImpl30 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl30
                r0.<init>(r3)
                r2.mImpl = r0
                goto L26
            L11:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L1f
                androidx.core.view.WindowInsetsCompat$BuilderImpl29 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl29
                r0.<init>(r3)
                r2.mImpl = r0
                goto L26
            L1f:
                androidx.core.view.WindowInsetsCompat$BuilderImpl20 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl20
                r0.<init>(r3)
                r2.mImpl = r0
            L26:
                return
        }

        public androidx.core.view.WindowInsetsCompat build() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                androidx.core.view.WindowInsetsCompat r0 = r0.build()
                return r0
        }

        public androidx.core.view.WindowInsetsCompat.Builder setDisplayCutout(androidx.core.view.DisplayCutoutCompat r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setDisplayCutout(r2)
                return r1
        }

        public androidx.core.view.WindowInsetsCompat.Builder setInsets(int r2, androidx.core.graphics.Insets r3) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setInsets(r2, r3)
                return r1
        }

        public androidx.core.view.WindowInsetsCompat.Builder setInsetsIgnoringVisibility(int r2, androidx.core.graphics.Insets r3) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setInsetsIgnoringVisibility(r2, r3)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setMandatorySystemGestureInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setMandatorySystemGestureInsets(r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setStableInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setStableInsets(r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setSystemGestureInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setSystemGestureInsets(r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setSystemWindowInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setSystemWindowInsets(r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setTappableElementInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setTappableElementInsets(r2)
                return r1
        }

        public androidx.core.view.WindowInsetsCompat.Builder setVisible(int r2, boolean r3) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setVisible(r2, r3)
                return r1
        }
    }

    private static class BuilderImpl {
        private final androidx.core.view.WindowInsetsCompat mInsets;
        androidx.core.graphics.Insets[] mInsetsTypeMask;

        BuilderImpl() {
                r3 = this;
                androidx.core.view.WindowInsetsCompat r0 = new androidx.core.view.WindowInsetsCompat
                r1 = 0
                r2 = r1
                androidx.core.view.WindowInsetsCompat r2 = (androidx.core.view.WindowInsetsCompat) r2
                r0.<init>(r1)
                r3.<init>(r0)
                return
        }

        BuilderImpl(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mInsets = r1
                return
        }

        protected final void applyInsetTypes() {
                r3 = this;
                androidx.core.graphics.Insets[] r0 = r3.mInsetsTypeMask
                if (r0 == 0) goto L58
                r1 = 1
                int r1 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r1)
                r0 = r0[r1]
                androidx.core.graphics.Insets[] r1 = r3.mInsetsTypeMask
                r2 = 2
                int r2 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r2)
                r1 = r1[r2]
                if (r0 == 0) goto L20
                if (r1 == 0) goto L20
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.max(r0, r1)
                r3.setSystemWindowInsets(r0)
                goto L2b
            L20:
                if (r0 == 0) goto L26
                r3.setSystemWindowInsets(r0)
                goto L2b
            L26:
                if (r1 == 0) goto L2b
                r3.setSystemWindowInsets(r1)
            L2b:
                androidx.core.graphics.Insets[] r0 = r3.mInsetsTypeMask
                r1 = 16
                int r1 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L3a
                r3.setSystemGestureInsets(r0)
            L3a:
                androidx.core.graphics.Insets[] r0 = r3.mInsetsTypeMask
                r1 = 32
                int r1 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L49
                r3.setMandatorySystemGestureInsets(r0)
            L49:
                androidx.core.graphics.Insets[] r0 = r3.mInsetsTypeMask
                r1 = 64
                int r1 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L58
                r3.setTappableElementInsets(r0)
            L58:
                return
        }

        androidx.core.view.WindowInsetsCompat build() {
                r1 = this;
                r1.applyInsetTypes()
                androidx.core.view.WindowInsetsCompat r0 = r1.mInsets
                return r0
        }

        void setDisplayCutout(androidx.core.view.DisplayCutoutCompat r1) {
                r0 = this;
                return
        }

        void setInsets(int r4, androidx.core.graphics.Insets r5) {
                r3 = this;
                androidx.core.graphics.Insets[] r0 = r3.mInsetsTypeMask
                if (r0 != 0) goto La
                r0 = 9
                androidx.core.graphics.Insets[] r0 = new androidx.core.graphics.Insets[r0]
                r3.mInsetsTypeMask = r0
            La:
                r0 = 1
            Lb:
                r1 = 256(0x100, float:3.59E-43)
                if (r0 > r1) goto L1f
                r1 = r4 & r0
                if (r1 != 0) goto L14
                goto L1c
            L14:
                androidx.core.graphics.Insets[] r1 = r3.mInsetsTypeMask
                int r2 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r0)
                r1[r2] = r5
            L1c:
                int r0 = r0 << 1
                goto Lb
            L1f:
                return
        }

        void setInsetsIgnoringVisibility(int r1, androidx.core.graphics.Insets r2) {
                r0 = this;
                r2 = 8
                if (r1 == r2) goto L5
                return
            L5:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Ignoring visibility inset not available for IME"
                r1.<init>(r2)
                throw r1
        }

        void setMandatorySystemGestureInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setStableInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setSystemGestureInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setSystemWindowInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setTappableElementInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setVisible(int r1, boolean r2) {
                r0 = this;
                return
        }
    }

    private static class BuilderImpl20 extends androidx.core.view.WindowInsetsCompat.BuilderImpl {
        private static java.lang.reflect.Constructor<android.view.WindowInsets> sConstructor = null;
        private static boolean sConstructorFetched = false;
        private static java.lang.reflect.Field sConsumedField = null;
        private static boolean sConsumedFieldFetched = false;
        private android.view.WindowInsets mInsets;
        private androidx.core.graphics.Insets mStableInsets;

        static {
                return
        }

        BuilderImpl20() {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets r0 = createWindowInsetsInstance()
                r1.mInsets = r0
                return
        }

        BuilderImpl20(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>()
                android.view.WindowInsets r1 = r1.toWindowInsets()
                r0.mInsets = r1
                return
        }

        private static android.view.WindowInsets createWindowInsetsInstance() {
                boolean r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedFieldFetched
                r1 = 1
                java.lang.String r2 = "WindowInsetsCompat"
                if (r0 != 0) goto L1a
                java.lang.Class<android.view.WindowInsets> r0 = android.view.WindowInsets.class
                java.lang.String r3 = "CONSUMED"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.ReflectiveOperationException -> L12
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedField = r0     // Catch: java.lang.ReflectiveOperationException -> L12
                goto L18
            L12:
                r0 = move-exception
                java.lang.String r3 = "Could not retrieve WindowInsets.CONSUMED field"
                android.util.Log.i(r2, r3, r0)
            L18:
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedFieldFetched = r1
            L1a:
                java.lang.reflect.Field r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedField
                r3 = 0
                if (r0 == 0) goto L33
                java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ReflectiveOperationException -> L2d
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                if (r0 == 0) goto L33
                android.view.WindowInsets r4 = new android.view.WindowInsets     // Catch: java.lang.ReflectiveOperationException -> L2d
                r4.<init>(r0)     // Catch: java.lang.ReflectiveOperationException -> L2d
                return r4
            L2d:
                r0 = move-exception
                java.lang.String r4 = "Could not get value from WindowInsets.CONSUMED field"
                android.util.Log.i(r2, r4, r0)
            L33:
                boolean r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructorFetched
                r4 = 0
                if (r0 != 0) goto L4f
                java.lang.Class<android.view.WindowInsets> r0 = android.view.WindowInsets.class
                java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L47
                java.lang.Class<android.graphics.Rect> r6 = android.graphics.Rect.class
                r5[r4] = r6     // Catch: java.lang.ReflectiveOperationException -> L47
                java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch: java.lang.ReflectiveOperationException -> L47
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructor = r0     // Catch: java.lang.ReflectiveOperationException -> L47
                goto L4d
            L47:
                r0 = move-exception
                java.lang.String r5 = "Could not retrieve WindowInsets(Rect) constructor"
                android.util.Log.i(r2, r5, r0)
            L4d:
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructorFetched = r1
            L4f:
                java.lang.reflect.Constructor<android.view.WindowInsets> r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructor
                if (r0 == 0) goto L69
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L63
                android.graphics.Rect r5 = new android.graphics.Rect     // Catch: java.lang.ReflectiveOperationException -> L63
                r5.<init>()     // Catch: java.lang.ReflectiveOperationException -> L63
                r1[r4] = r5     // Catch: java.lang.ReflectiveOperationException -> L63
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.ReflectiveOperationException -> L63
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L63
                return r0
            L63:
                r0 = move-exception
                java.lang.String r1 = "Could not invoke WindowInsets(Rect) constructor"
                android.util.Log.i(r2, r1, r0)
            L69:
                return r3
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        androidx.core.view.WindowInsetsCompat build() {
                r2 = this;
                r2.applyInsetTypes()
                android.view.WindowInsets r0 = r2.mInsets
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                androidx.core.graphics.Insets[] r1 = r2.mInsetsTypeMask
                r0.setOverriddenInsets(r1)
                androidx.core.graphics.Insets r1 = r2.mStableInsets
                r0.setStableInsets(r1)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setStableInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                r0.mStableInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemWindowInsets(androidx.core.graphics.Insets r5) {
                r4 = this;
                android.view.WindowInsets r0 = r4.mInsets
                if (r0 == 0) goto L12
                int r1 = r5.left
                int r2 = r5.top
                int r3 = r5.right
                int r5 = r5.bottom
                android.view.WindowInsets r5 = r0.replaceSystemWindowInsets(r1, r2, r3, r5)
                r4.mInsets = r5
            L12:
                return
        }
    }

    private static class BuilderImpl29 extends androidx.core.view.WindowInsetsCompat.BuilderImpl {
        final android.view.WindowInsets.Builder mPlatBuilder;

        BuilderImpl29() {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                r0.<init>()
                r1.mPlatBuilder = r0
                return
        }

        BuilderImpl29(androidx.core.view.WindowInsetsCompat r2) {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets r2 = r2.toWindowInsets()
                if (r2 == 0) goto Lf
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                r0.<init>(r2)
                goto L14
            Lf:
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                r0.<init>()
            L14:
                r1.mPlatBuilder = r0
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        androidx.core.view.WindowInsetsCompat build() {
                r2 = this;
                r2.applyInsetTypes()
                android.view.WindowInsets$Builder r0 = r2.mPlatBuilder
                android.view.WindowInsets r0 = r0.build()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                androidx.core.graphics.Insets[] r1 = r2.mInsetsTypeMask
                r0.setOverriddenInsets(r1)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setDisplayCutout(androidx.core.view.DisplayCutoutCompat r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                if (r2 == 0) goto L9
                android.view.DisplayCutout r2 = r2.unwrap()
                goto La
            L9:
                r2 = 0
            La:
                r0.setDisplayCutout(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setMandatorySystemGestureInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                android.graphics.Insets r2 = r2.toPlatformInsets()
                r0.setMandatorySystemGestureInsets(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setStableInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                android.graphics.Insets r2 = r2.toPlatformInsets()
                r0.setStableInsets(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemGestureInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                android.graphics.Insets r2 = r2.toPlatformInsets()
                r0.setSystemGestureInsets(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemWindowInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                android.graphics.Insets r2 = r2.toPlatformInsets()
                r0.setSystemWindowInsets(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setTappableElementInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                android.graphics.Insets r2 = r2.toPlatformInsets()
                r0.setTappableElementInsets(r2)
                return
        }
    }

    private static class BuilderImpl30 extends androidx.core.view.WindowInsetsCompat.BuilderImpl29 {
        BuilderImpl30() {
                r0 = this;
                r0.<init>()
                return
        }

        BuilderImpl30(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsets(int r2, androidx.core.graphics.Insets r3) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                int r2 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r2)
                android.graphics.Insets r3 = r3.toPlatformInsets()
                r0.setInsets(r2, r3)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsetsIgnoringVisibility(int r2, androidx.core.graphics.Insets r3) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                int r2 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r2)
                android.graphics.Insets r3 = r3.toPlatformInsets()
                r0.setInsetsIgnoringVisibility(r2, r3)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setVisible(int r2, boolean r3) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                int r2 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r2)
                r0.setVisible(r2, r3)
                return
        }
    }

    private static class Impl {
        static final androidx.core.view.WindowInsetsCompat CONSUMED = null;
        final androidx.core.view.WindowInsetsCompat mHost;

        static {
                androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
                r0.<init>()
                androidx.core.view.WindowInsetsCompat r0 = r0.build()
                androidx.core.view.WindowInsetsCompat r0 = r0.consumeDisplayCutout()
                androidx.core.view.WindowInsetsCompat r0 = r0.consumeStableInsets()
                androidx.core.view.WindowInsetsCompat r0 = r0.consumeSystemWindowInsets()
                androidx.core.view.WindowInsetsCompat.Impl.CONSUMED = r0
                return
        }

        Impl(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mHost = r1
                return
        }

        androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mHost
                return r0
        }

        androidx.core.view.WindowInsetsCompat consumeStableInsets() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mHost
                return r0
        }

        androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mHost
                return r0
        }

        void copyRootViewBounds(android.view.View r1) {
                r0 = this;
                return
        }

        void copyWindowDataInto(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.core.view.WindowInsetsCompat.Impl
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.core.view.WindowInsetsCompat$Impl r5 = (androidx.core.view.WindowInsetsCompat.Impl) r5
                boolean r1 = r4.isRound()
                boolean r3 = r5.isRound()
                if (r1 != r3) goto L4b
                boolean r1 = r4.isConsumed()
                boolean r3 = r5.isConsumed()
                if (r1 != r3) goto L4b
                androidx.core.graphics.Insets r1 = r4.getSystemWindowInsets()
                androidx.core.graphics.Insets r3 = r5.getSystemWindowInsets()
                boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r3)
                if (r1 == 0) goto L4b
                androidx.core.graphics.Insets r1 = r4.getStableInsets()
                androidx.core.graphics.Insets r3 = r5.getStableInsets()
                boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r3)
                if (r1 == 0) goto L4b
                androidx.core.view.DisplayCutoutCompat r1 = r4.getDisplayCutout()
                androidx.core.view.DisplayCutoutCompat r5 = r5.getDisplayCutout()
                boolean r5 = androidx.core.util.ObjectsCompat.equals(r1, r5)
                if (r5 == 0) goto L4b
                goto L4c
            L4b:
                r0 = r2
            L4c:
                return r0
        }

        androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
                r1 = this;
                r0 = 0
                return r0
        }

        androidx.core.graphics.Insets getInsets(int r1) {
                r0 = this;
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
                return r1
        }

        androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r2) {
                r1 = this;
                r2 = r2 & 8
                if (r2 != 0) goto L7
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.NONE
                return r2
            L7:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Unable to query the maximum insets for IME"
                r2.<init>(r0)
                throw r2
        }

        androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.getSystemWindowInsets()
                return r0
        }

        androidx.core.graphics.Insets getStableInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        androidx.core.graphics.Insets getSystemGestureInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.getSystemWindowInsets()
                return r0
        }

        androidx.core.graphics.Insets getSystemWindowInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        androidx.core.graphics.Insets getTappableElementInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.getSystemWindowInsets()
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                boolean r1 = r3.isRound()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                boolean r1 = r3.isConsumed()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                r1 = 2
                androidx.core.graphics.Insets r2 = r3.getSystemWindowInsets()
                r0[r1] = r2
                r1 = 3
                androidx.core.graphics.Insets r2 = r3.getStableInsets()
                r0[r1] = r2
                r1 = 4
                androidx.core.view.DisplayCutoutCompat r2 = r3.getDisplayCutout()
                r0[r1] = r2
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }

        androidx.core.view.WindowInsetsCompat inset(int r1, int r2, int r3, int r4) {
                r0 = this;
                androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.Impl.CONSUMED
                return r1
        }

        boolean isConsumed() {
                r1 = this;
                r0 = 0
                return r0
        }

        boolean isRound() {
                r1 = this;
                r0 = 0
                return r0
        }

        boolean isVisible(int r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        public void setOverriddenInsets(androidx.core.graphics.Insets[] r1) {
                r0 = this;
                return
        }

        void setRootViewData(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setRootWindowInsets(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                return
        }

        public void setStableInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }
    }

    private static class Impl20 extends androidx.core.view.WindowInsetsCompat.Impl {
        private static java.lang.Class<?> sAttachInfoClass = null;
        private static java.lang.reflect.Field sAttachInfoField = null;
        private static java.lang.reflect.Method sGetViewRootImplMethod = null;
        private static java.lang.Class<?> sViewRootImplClass = null;
        private static java.lang.reflect.Field sVisibleInsetsField = null;
        private static boolean sVisibleRectReflectionFetched = false;
        private androidx.core.graphics.Insets[] mOverriddenInsets;
        final android.view.WindowInsets mPlatformInsets;
        androidx.core.graphics.Insets mRootViewVisibleInsets;
        private androidx.core.view.WindowInsetsCompat mRootWindowInsets;
        private androidx.core.graphics.Insets mSystemWindowInsets;

        static {
                return
        }

        Impl20(androidx.core.view.WindowInsetsCompat r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.mSystemWindowInsets = r1
                r0.mPlatformInsets = r2
                return
        }

        Impl20(androidx.core.view.WindowInsetsCompat r2, androidx.core.view.WindowInsetsCompat.Impl20 r3) {
                r1 = this;
                android.view.WindowInsets r0 = new android.view.WindowInsets
                android.view.WindowInsets r3 = r3.mPlatformInsets
                r0.<init>(r3)
                r1.<init>(r2, r0)
                return
        }

        private androidx.core.graphics.Insets getInsets(int r4, boolean r5) {
                r3 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                r1 = 1
            L3:
                r2 = 256(0x100, float:3.59E-43)
                if (r1 > r2) goto L17
                r2 = r4 & r1
                if (r2 != 0) goto Lc
                goto L14
            Lc:
                androidx.core.graphics.Insets r2 = r3.getInsetsForType(r1, r5)
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.max(r0, r2)
            L14:
                int r1 = r1 << 1
                goto L3
            L17:
                return r0
        }

        private androidx.core.graphics.Insets getRootStableInsets() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mRootWindowInsets
                if (r0 == 0) goto L9
                androidx.core.graphics.Insets r0 = r0.getStableInsets()
                return r0
            L9:
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        private androidx.core.graphics.Insets getVisibleInsets(android.view.View r5) {
                r4 = this;
                java.lang.String r0 = "WindowInsetsCompat"
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 >= r2) goto L5e
                boolean r1 = androidx.core.view.WindowInsetsCompat.Impl20.sVisibleRectReflectionFetched
                if (r1 != 0) goto Lf
                loadReflectionField()
            Lf:
                java.lang.reflect.Method r1 = androidx.core.view.WindowInsetsCompat.Impl20.sGetViewRootImplMethod
                r2 = 0
                if (r1 == 0) goto L5d
                java.lang.Class<?> r3 = androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoClass
                if (r3 == 0) goto L5d
                java.lang.reflect.Field r3 = androidx.core.view.WindowInsetsCompat.Impl20.sVisibleInsetsField
                if (r3 != 0) goto L1d
                goto L5d
            L1d:
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.ReflectiveOperationException -> L46
                java.lang.Object r5 = r1.invoke(r5, r3)     // Catch: java.lang.ReflectiveOperationException -> L46
                if (r5 != 0) goto L31
                java.lang.String r5 = "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden"
                java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L46
                r1.<init>()     // Catch: java.lang.ReflectiveOperationException -> L46
                android.util.Log.w(r0, r5, r1)     // Catch: java.lang.ReflectiveOperationException -> L46
                return r2
            L31:
                java.lang.reflect.Field r1 = androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoField     // Catch: java.lang.ReflectiveOperationException -> L46
                java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.ReflectiveOperationException -> L46
                java.lang.reflect.Field r1 = androidx.core.view.WindowInsetsCompat.Impl20.sVisibleInsetsField     // Catch: java.lang.ReflectiveOperationException -> L46
                java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.ReflectiveOperationException -> L46
                android.graphics.Rect r5 = (android.graphics.Rect) r5     // Catch: java.lang.ReflectiveOperationException -> L46
                if (r5 == 0) goto L45
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.m8of(r5)     // Catch: java.lang.ReflectiveOperationException -> L46
            L45:
                return r2
            L46:
                r5 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "Failed to get visible insets. (Reflection error). "
                r1.<init>(r3)
                java.lang.String r3 = r5.getMessage()
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.e(r0, r1, r5)
            L5d:
                return r2
            L5e:
                java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
                r5.<init>(r0)
                throw r5
        }

        private static void loadReflectionField() {
                r0 = 1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                java.lang.String r2 = "getViewRootImpl"
                r3 = 0
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.ReflectiveOperationException -> L3b
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.ReflectiveOperationException -> L3b
                androidx.core.view.WindowInsetsCompat.Impl20.sGetViewRootImplMethod = r1     // Catch: java.lang.ReflectiveOperationException -> L3b
                java.lang.String r1 = "android.view.ViewRootImpl"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L3b
                androidx.core.view.WindowInsetsCompat.Impl20.sViewRootImplClass = r1     // Catch: java.lang.ReflectiveOperationException -> L3b
                java.lang.String r1 = "android.view.View$AttachInfo"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L3b
                androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoClass = r1     // Catch: java.lang.ReflectiveOperationException -> L3b
                java.lang.String r2 = "mVisibleInsets"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L3b
                androidx.core.view.WindowInsetsCompat.Impl20.sVisibleInsetsField = r1     // Catch: java.lang.ReflectiveOperationException -> L3b
                java.lang.Class<?> r1 = androidx.core.view.WindowInsetsCompat.Impl20.sViewRootImplClass     // Catch: java.lang.ReflectiveOperationException -> L3b
                java.lang.String r2 = "mAttachInfo"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L3b
                androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoField = r1     // Catch: java.lang.ReflectiveOperationException -> L3b
                java.lang.reflect.Field r1 = androidx.core.view.WindowInsetsCompat.Impl20.sVisibleInsetsField     // Catch: java.lang.ReflectiveOperationException -> L3b
                r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L3b
                java.lang.reflect.Field r1 = androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoField     // Catch: java.lang.ReflectiveOperationException -> L3b
                r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L3b
                goto L54
            L3b:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Failed to get visible insets. (Reflection error). "
                r2.<init>(r3)
                java.lang.String r3 = r1.getMessage()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "WindowInsetsCompat"
                android.util.Log.e(r3, r2, r1)
            L54:
                androidx.core.view.WindowInsetsCompat.Impl20.sVisibleRectReflectionFetched = r0
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyRootViewBounds(android.view.View r1) {
                r0 = this;
                androidx.core.graphics.Insets r1 = r0.getVisibleInsets(r1)
                if (r1 != 0) goto L8
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            L8:
                r0.setRootViewData(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyWindowDataInto(androidx.core.view.WindowInsetsCompat r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mRootWindowInsets
                r2.setRootWindowInsets(r0)
                androidx.core.graphics.Insets r0 = r1.mRootViewVisibleInsets
                r2.setRootViewData(r0)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = super.equals(r2)
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                androidx.core.view.WindowInsetsCompat$Impl20 r2 = (androidx.core.view.WindowInsetsCompat.Impl20) r2
                androidx.core.graphics.Insets r0 = r1.mRootViewVisibleInsets
                androidx.core.graphics.Insets r2 = r2.mRootViewVisibleInsets
                boolean r2 = java.util.Objects.equals(r0, r2)
                return r2
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsets(int r2) {
                r1 = this;
                r0 = 0
                androidx.core.graphics.Insets r2 = r1.getInsets(r2, r0)
                return r2
        }

        protected androidx.core.graphics.Insets getInsetsForType(int r5, boolean r6) {
                r4 = this;
                r0 = 1
                r1 = 0
                if (r5 == r0) goto Ldd
                r0 = 2
                r2 = 0
                if (r5 == r0) goto L97
                r6 = 8
                if (r5 == r6) goto L55
                r6 = 16
                if (r5 == r6) goto L50
                r6 = 32
                if (r5 == r6) goto L4b
                r6 = 64
                if (r5 == r6) goto L46
                r6 = 128(0x80, float:1.794E-43)
                if (r5 == r6) goto L1f
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.NONE
                return r5
            L1f:
                androidx.core.view.WindowInsetsCompat r5 = r4.mRootWindowInsets
                if (r5 == 0) goto L28
                androidx.core.view.DisplayCutoutCompat r5 = r5.getDisplayCutout()
                goto L2c
            L28:
                androidx.core.view.DisplayCutoutCompat r5 = r4.getDisplayCutout()
            L2c:
                if (r5 == 0) goto L43
                int r6 = r5.getSafeInsetLeft()
                int r0 = r5.getSafeInsetTop()
                int r1 = r5.getSafeInsetRight()
                int r5 = r5.getSafeInsetBottom()
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.m7of(r6, r0, r1, r5)
                return r5
            L43:
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.NONE
                return r5
            L46:
                androidx.core.graphics.Insets r5 = r4.getTappableElementInsets()
                return r5
            L4b:
                androidx.core.graphics.Insets r5 = r4.getMandatorySystemGestureInsets()
                return r5
            L50:
                androidx.core.graphics.Insets r5 = r4.getSystemGestureInsets()
                return r5
            L55:
                androidx.core.graphics.Insets[] r5 = r4.mOverriddenInsets
                if (r5 == 0) goto L5f
                int r6 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r6)
                r2 = r5[r6]
            L5f:
                if (r2 == 0) goto L62
                return r2
            L62:
                androidx.core.graphics.Insets r5 = r4.getSystemWindowInsets()
                androidx.core.graphics.Insets r6 = r4.getRootStableInsets()
                int r0 = r5.bottom
                int r2 = r6.bottom
                if (r0 <= r2) goto L77
                int r5 = r5.bottom
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.m7of(r1, r1, r1, r5)
                return r5
            L77:
                androidx.core.graphics.Insets r5 = r4.mRootViewVisibleInsets
                if (r5 == 0) goto L94
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L94
                androidx.core.graphics.Insets r5 = r4.mRootViewVisibleInsets
                int r5 = r5.bottom
                int r6 = r6.bottom
                if (r5 <= r6) goto L94
                androidx.core.graphics.Insets r5 = r4.mRootViewVisibleInsets
                int r5 = r5.bottom
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.m7of(r1, r1, r1, r5)
                return r5
            L94:
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.NONE
                return r5
            L97:
                if (r6 == 0) goto Lbe
                androidx.core.graphics.Insets r5 = r4.getRootStableInsets()
                androidx.core.graphics.Insets r6 = r4.getStableInsets()
                int r0 = r5.left
                int r2 = r6.left
                int r0 = java.lang.Math.max(r0, r2)
                int r2 = r5.right
                int r3 = r6.right
                int r2 = java.lang.Math.max(r2, r3)
                int r5 = r5.bottom
                int r6 = r6.bottom
                int r5 = java.lang.Math.max(r5, r6)
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.m7of(r0, r1, r2, r5)
                return r5
            Lbe:
                androidx.core.graphics.Insets r5 = r4.getSystemWindowInsets()
                androidx.core.view.WindowInsetsCompat r6 = r4.mRootWindowInsets
                if (r6 == 0) goto Lca
                androidx.core.graphics.Insets r2 = r6.getStableInsets()
            Lca:
                int r6 = r5.bottom
                if (r2 == 0) goto Ld4
                int r0 = r2.bottom
                int r6 = java.lang.Math.min(r6, r0)
            Ld4:
                int r0 = r5.left
                int r5 = r5.right
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.m7of(r0, r1, r5, r6)
                return r5
            Ldd:
                if (r6 == 0) goto Lf4
                androidx.core.graphics.Insets r5 = r4.getRootStableInsets()
                int r5 = r5.top
                androidx.core.graphics.Insets r6 = r4.getSystemWindowInsets()
                int r6 = r6.top
                int r5 = java.lang.Math.max(r5, r6)
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.m7of(r1, r5, r1, r1)
                return r5
            Lf4:
                androidx.core.graphics.Insets r5 = r4.getSystemWindowInsets()
                int r5 = r5.top
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.m7of(r1, r5, r1, r1)
                return r5
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r2) {
                r1 = this;
                r0 = 1
                androidx.core.graphics.Insets r2 = r1.getInsets(r2, r0)
                return r2
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final androidx.core.graphics.Insets getSystemWindowInsets() {
                r4 = this;
                androidx.core.graphics.Insets r0 = r4.mSystemWindowInsets
                if (r0 != 0) goto L22
                android.view.WindowInsets r0 = r4.mPlatformInsets
                int r0 = r0.getSystemWindowInsetLeft()
                android.view.WindowInsets r1 = r4.mPlatformInsets
                int r1 = r1.getSystemWindowInsetTop()
                android.view.WindowInsets r2 = r4.mPlatformInsets
                int r2 = r2.getSystemWindowInsetRight()
                android.view.WindowInsets r3 = r4.mPlatformInsets
                int r3 = r3.getSystemWindowInsetBottom()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.m7of(r0, r1, r2, r3)
                r4.mSystemWindowInsets = r0
            L22:
                androidx.core.graphics.Insets r0 = r4.mSystemWindowInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat inset(int r3, int r4, int r5, int r6) {
                r2 = this;
                androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
                android.view.WindowInsets r1 = r2.mPlatformInsets
                androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1)
                r0.<init>(r1)
                androidx.core.graphics.Insets r1 = r2.getSystemWindowInsets()
                androidx.core.graphics.Insets r1 = androidx.core.view.WindowInsetsCompat.insetInsets(r1, r3, r4, r5, r6)
                r0.setSystemWindowInsets(r1)
                androidx.core.graphics.Insets r1 = r2.getStableInsets()
                androidx.core.graphics.Insets r3 = androidx.core.view.WindowInsetsCompat.insetInsets(r1, r3, r4, r5, r6)
                r0.setStableInsets(r3)
                androidx.core.view.WindowInsetsCompat r3 = r0.build()
                return r3
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isRound() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                boolean r0 = r0.isRound()
                return r0
        }

        protected boolean isTypeVisible(int r4) {
                r3 = this;
                r0 = 0
                r1 = 1
                if (r4 == r1) goto L14
                r2 = 2
                if (r4 == r2) goto L14
                r2 = 4
                if (r4 == r2) goto L13
                r2 = 8
                if (r4 == r2) goto L14
                r2 = 128(0x80, float:1.794E-43)
                if (r4 == r2) goto L14
                return r1
            L13:
                return r0
            L14:
                androidx.core.graphics.Insets r4 = r3.getInsetsForType(r4, r0)
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                boolean r4 = r4.equals(r0)
                r4 = r4 ^ r1
                return r4
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isVisible(int r4) {
                r3 = this;
                r0 = 1
                r1 = r0
            L2:
                r2 = 256(0x100, float:3.59E-43)
                if (r1 > r2) goto L16
                r2 = r4 & r1
                if (r2 != 0) goto Lb
                goto L13
            Lb:
                boolean r2 = r3.isTypeVisible(r1)
                if (r2 != 0) goto L13
                r4 = 0
                return r4
            L13:
                int r1 = r1 << 1
                goto L2
            L16:
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(androidx.core.graphics.Insets[] r1) {
                r0 = this;
                r0.mOverriddenInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootViewData(androidx.core.graphics.Insets r1) {
                r0 = this;
                r0.mRootViewVisibleInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootWindowInsets(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.mRootWindowInsets = r1
                return
        }
    }

    private static class Impl21 extends androidx.core.view.WindowInsetsCompat.Impl20 {
        private androidx.core.graphics.Insets mStableInsets;

        Impl21(androidx.core.view.WindowInsetsCompat r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mStableInsets = r1
                return
        }

        Impl21(androidx.core.view.WindowInsetsCompat r1, androidx.core.view.WindowInsetsCompat.Impl21 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mStableInsets = r1
                androidx.core.graphics.Insets r1 = r2.mStableInsets
                r0.mStableInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat consumeStableInsets() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.WindowInsets r0 = r0.consumeStableInsets()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.WindowInsets r0 = r0.consumeSystemWindowInsets()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final androidx.core.graphics.Insets getStableInsets() {
                r4 = this;
                androidx.core.graphics.Insets r0 = r4.mStableInsets
                if (r0 != 0) goto L22
                android.view.WindowInsets r0 = r4.mPlatformInsets
                int r0 = r0.getStableInsetLeft()
                android.view.WindowInsets r1 = r4.mPlatformInsets
                int r1 = r1.getStableInsetTop()
                android.view.WindowInsets r2 = r4.mPlatformInsets
                int r2 = r2.getStableInsetRight()
                android.view.WindowInsets r3 = r4.mPlatformInsets
                int r3 = r3.getStableInsetBottom()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.m7of(r0, r1, r2, r3)
                r4.mStableInsets = r0
            L22:
                androidx.core.graphics.Insets r0 = r4.mStableInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isConsumed() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                boolean r0 = r0.isConsumed()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                r0.mStableInsets = r1
                return
        }
    }

    private static class Impl28 extends androidx.core.view.WindowInsetsCompat.Impl21 {
        Impl28(androidx.core.view.WindowInsetsCompat r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        Impl28(androidx.core.view.WindowInsetsCompat r1, androidx.core.view.WindowInsetsCompat.Impl28 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.WindowInsets r0 = r0.consumeDisplayCutout()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.core.view.WindowInsetsCompat.Impl28
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.core.view.WindowInsetsCompat$Impl28 r5 = (androidx.core.view.WindowInsetsCompat.Impl28) r5
                android.view.WindowInsets r1 = r4.mPlatformInsets
                android.view.WindowInsets r3 = r5.mPlatformInsets
                boolean r1 = java.util.Objects.equals(r1, r3)
                if (r1 == 0) goto L21
                androidx.core.graphics.Insets r1 = r4.mRootViewVisibleInsets
                androidx.core.graphics.Insets r5 = r5.mRootViewVisibleInsets
                boolean r5 = java.util.Objects.equals(r1, r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = r2
            L22:
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.DisplayCutout r0 = r0.getDisplayCutout()
                androidx.core.view.DisplayCutoutCompat r0 = androidx.core.view.DisplayCutoutCompat.wrap(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                int r0 = r0.hashCode()
                return r0
        }
    }

    private static class Impl29 extends androidx.core.view.WindowInsetsCompat.Impl28 {
        private androidx.core.graphics.Insets mMandatorySystemGestureInsets;
        private androidx.core.graphics.Insets mSystemGestureInsets;
        private androidx.core.graphics.Insets mTappableElementInsets;

        Impl29(androidx.core.view.WindowInsetsCompat r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mSystemGestureInsets = r1
                r0.mMandatorySystemGestureInsets = r1
                r0.mTappableElementInsets = r1
                return
        }

        Impl29(androidx.core.view.WindowInsetsCompat r1, androidx.core.view.WindowInsetsCompat.Impl29 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mSystemGestureInsets = r1
                r0.mMandatorySystemGestureInsets = r1
                r0.mTappableElementInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mMandatorySystemGestureInsets
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.graphics.Insets r0 = r0.getMandatorySystemGestureInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                r1.mMandatorySystemGestureInsets = r0
            L10:
                androidx.core.graphics.Insets r0 = r1.mMandatorySystemGestureInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.graphics.Insets getSystemGestureInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mSystemGestureInsets
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.graphics.Insets r0 = r0.getSystemGestureInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                r1.mSystemGestureInsets = r0
            L10:
                androidx.core.graphics.Insets r0 = r1.mSystemGestureInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.graphics.Insets getTappableElementInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mTappableElementInsets
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.graphics.Insets r0 = r0.getTappableElementInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                r1.mTappableElementInsets = r0
            L10:
                androidx.core.graphics.Insets r0 = r1.mTappableElementInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat inset(int r2, int r3, int r4, int r5) {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.WindowInsets r2 = r0.inset(r2, r3, r4, r5)
                androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r2)
                return r2
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }
    }

    private static class Impl30 extends androidx.core.view.WindowInsetsCompat.Impl29 {
        static final androidx.core.view.WindowInsetsCompat CONSUMED = null;

        static {
                android.view.WindowInsets r0 = android.view.WindowInsets.CONSUMED
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                androidx.core.view.WindowInsetsCompat.Impl30.CONSUMED = r0
                return
        }

        Impl30(androidx.core.view.WindowInsetsCompat r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        Impl30(androidx.core.view.WindowInsetsCompat r1, androidx.core.view.WindowInsetsCompat.Impl30 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        final void copyRootViewBounds(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsets(int r2) {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                int r2 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r2)
                android.graphics.Insets r2 = r0.getInsets(r2)
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.toCompatInsets(r2)
                return r2
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r2) {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                int r2 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r2)
                android.graphics.Insets r2 = r0.getInsetsIgnoringVisibility(r2)
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.toCompatInsets(r2)
                return r2
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int r2) {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                int r2 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r2)
                boolean r2 = r0.isVisible(r2)
                return r2
        }
    }

    public static final class Type {
        static final int CAPTION_BAR = 4;
        static final int DISPLAY_CUTOUT = 128;
        static final int FIRST = 1;
        static final int IME = 8;
        static final int LAST = 256;
        static final int MANDATORY_SYSTEM_GESTURES = 32;
        static final int NAVIGATION_BARS = 2;
        static final int SIZE = 9;
        static final int STATUS_BARS = 1;
        static final int SYSTEM_GESTURES = 16;
        static final int TAPPABLE_ELEMENT = 64;
        static final int WINDOW_DECOR = 256;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InsetsType {
        }

        private Type() {
                r0 = this;
                r0.<init>()
                return
        }

        static int all() {
                r0 = -1
                return r0
        }

        public static int captionBar() {
                r0 = 4
                return r0
        }

        public static int displayCutout() {
                r0 = 128(0x80, float:1.794E-43)
                return r0
        }

        public static int ime() {
                r0 = 8
                return r0
        }

        static int indexOf(int r3) {
                r0 = 1
                if (r3 == r0) goto L42
                r1 = 2
                if (r3 == r1) goto L41
                r0 = 4
                if (r3 == r0) goto L40
                r1 = 8
                if (r3 == r1) goto L3e
                r2 = 16
                if (r3 == r2) goto L3d
                r0 = 32
                if (r3 == r0) goto L3b
                r0 = 64
                if (r3 == r0) goto L39
                r0 = 128(0x80, float:1.794E-43)
                if (r3 == r0) goto L37
                r0 = 256(0x100, float:3.59E-43)
                if (r3 != r0) goto L22
                return r1
            L22:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "type needs to be >= FIRST and <= LAST, type="
                r1.<init>(r2)
                java.lang.StringBuilder r3 = r1.append(r3)
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
            L37:
                r3 = 7
                return r3
            L39:
                r3 = 6
                return r3
            L3b:
                r3 = 5
                return r3
            L3d:
                return r0
            L3e:
                r3 = 3
                return r3
            L40:
                return r1
            L41:
                return r0
            L42:
                r3 = 0
                return r3
        }

        public static int mandatorySystemGestures() {
                r0 = 32
                return r0
        }

        public static int navigationBars() {
                r0 = 2
                return r0
        }

        public static int statusBars() {
                r0 = 1
                return r0
        }

        public static int systemBars() {
                r0 = 7
                return r0
        }

        public static int systemGestures() {
                r0 = 16
                return r0
        }

        public static int tappableElement() {
                r0 = 64
                return r0
        }
    }

    private static final class TypeImpl30 {
        private TypeImpl30() {
                r0 = this;
                r0.<init>()
                return
        }

        static int toPlatformType(int r4) {
                r0 = 0
                r1 = 1
                r2 = r1
            L3:
                r3 = 256(0x100, float:3.59E-43)
                if (r2 > r3) goto L53
                r3 = r4 & r2
                if (r3 == 0) goto L50
                if (r2 == r1) goto L4b
                r3 = 2
                if (r2 == r3) goto L46
                r3 = 4
                if (r2 == r3) goto L41
                r3 = 8
                if (r2 == r3) goto L3c
                r3 = 16
                if (r2 == r3) goto L37
                r3 = 32
                if (r2 == r3) goto L32
                r3 = 64
                if (r2 == r3) goto L2d
                r3 = 128(0x80, float:1.794E-43)
                if (r2 == r3) goto L28
                goto L50
            L28:
                int r3 = android.view.WindowInsets.Type.displayCutout()
                goto L4f
            L2d:
                int r3 = android.view.WindowInsets.Type.tappableElement()
                goto L4f
            L32:
                int r3 = android.view.WindowInsets.Type.mandatorySystemGestures()
                goto L4f
            L37:
                int r3 = android.view.WindowInsets.Type.systemGestures()
                goto L4f
            L3c:
                int r3 = android.view.WindowInsets.Type.ime()
                goto L4f
            L41:
                int r3 = android.view.WindowInsets.Type.captionBar()
                goto L4f
            L46:
                int r3 = android.view.WindowInsets.Type.navigationBars()
                goto L4f
            L4b:
                int r3 = android.view.WindowInsets.Type.statusBars()
            L4f:
                r0 = r0 | r3
            L50:
                int r2 = r2 << 1
                goto L3
            L53:
                return r0
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Impl30.CONSUMED
            androidx.core.view.WindowInsetsCompat.CONSUMED = r0
            goto Lf
        Lb:
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Impl.CONSUMED
            androidx.core.view.WindowInsetsCompat.CONSUMED = r0
        Lf:
            return
    }

    private WindowInsetsCompat(android.view.WindowInsets r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            androidx.core.view.WindowInsetsCompat$Impl30 r0 = new androidx.core.view.WindowInsetsCompat$Impl30
            r0.<init>(r2, r3)
            r2.mImpl = r0
            goto L34
        L11:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1f
            androidx.core.view.WindowInsetsCompat$Impl29 r0 = new androidx.core.view.WindowInsetsCompat$Impl29
            r0.<init>(r2, r3)
            r2.mImpl = r0
            goto L34
        L1f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L2d
            androidx.core.view.WindowInsetsCompat$Impl28 r0 = new androidx.core.view.WindowInsetsCompat$Impl28
            r0.<init>(r2, r3)
            r2.mImpl = r0
            goto L34
        L2d:
            androidx.core.view.WindowInsetsCompat$Impl21 r0 = new androidx.core.view.WindowInsetsCompat$Impl21
            r0.<init>(r2, r3)
            r2.mImpl = r0
        L34:
            return
    }

    public WindowInsetsCompat(androidx.core.view.WindowInsetsCompat r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L6f
            androidx.core.view.WindowInsetsCompat$Impl r3 = r3.mImpl
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            boolean r0 = r3 instanceof androidx.core.view.WindowInsetsCompat.Impl30
            if (r0 == 0) goto L1c
            androidx.core.view.WindowInsetsCompat$Impl30 r0 = new androidx.core.view.WindowInsetsCompat$Impl30
            r1 = r3
            androidx.core.view.WindowInsetsCompat$Impl30 r1 = (androidx.core.view.WindowInsetsCompat.Impl30) r1
            r0.<init>(r2, r1)
            r2.mImpl = r0
            goto L6b
        L1c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L31
            boolean r0 = r3 instanceof androidx.core.view.WindowInsetsCompat.Impl29
            if (r0 == 0) goto L31
            androidx.core.view.WindowInsetsCompat$Impl29 r0 = new androidx.core.view.WindowInsetsCompat$Impl29
            r1 = r3
            androidx.core.view.WindowInsetsCompat$Impl29 r1 = (androidx.core.view.WindowInsetsCompat.Impl29) r1
            r0.<init>(r2, r1)
            r2.mImpl = r0
            goto L6b
        L31:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L46
            boolean r0 = r3 instanceof androidx.core.view.WindowInsetsCompat.Impl28
            if (r0 == 0) goto L46
            androidx.core.view.WindowInsetsCompat$Impl28 r0 = new androidx.core.view.WindowInsetsCompat$Impl28
            r1 = r3
            androidx.core.view.WindowInsetsCompat$Impl28 r1 = (androidx.core.view.WindowInsetsCompat.Impl28) r1
            r0.<init>(r2, r1)
            r2.mImpl = r0
            goto L6b
        L46:
            boolean r0 = r3 instanceof androidx.core.view.WindowInsetsCompat.Impl21
            if (r0 == 0) goto L55
            androidx.core.view.WindowInsetsCompat$Impl21 r0 = new androidx.core.view.WindowInsetsCompat$Impl21
            r1 = r3
            androidx.core.view.WindowInsetsCompat$Impl21 r1 = (androidx.core.view.WindowInsetsCompat.Impl21) r1
            r0.<init>(r2, r1)
            r2.mImpl = r0
            goto L6b
        L55:
            boolean r0 = r3 instanceof androidx.core.view.WindowInsetsCompat.Impl20
            if (r0 == 0) goto L64
            androidx.core.view.WindowInsetsCompat$Impl20 r0 = new androidx.core.view.WindowInsetsCompat$Impl20
            r1 = r3
            androidx.core.view.WindowInsetsCompat$Impl20 r1 = (androidx.core.view.WindowInsetsCompat.Impl20) r1
            r0.<init>(r2, r1)
            r2.mImpl = r0
            goto L6b
        L64:
            androidx.core.view.WindowInsetsCompat$Impl r0 = new androidx.core.view.WindowInsetsCompat$Impl
            r0.<init>(r2)
            r2.mImpl = r0
        L6b:
            r3.copyWindowDataInto(r2)
            goto L76
        L6f:
            androidx.core.view.WindowInsetsCompat$Impl r3 = new androidx.core.view.WindowInsetsCompat$Impl
            r3.<init>(r2)
            r2.mImpl = r3
        L76:
            return
    }

    static androidx.core.graphics.Insets insetInsets(androidx.core.graphics.Insets r5, int r6, int r7, int r8, int r9) {
            int r0 = r5.left
            int r0 = r0 - r6
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r5.top
            int r2 = r2 - r7
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r5.right
            int r3 = r3 - r8
            int r3 = java.lang.Math.max(r1, r3)
            int r4 = r5.bottom
            int r4 = r4 - r9
            int r1 = java.lang.Math.max(r1, r4)
            if (r0 != r6) goto L26
            if (r2 != r7) goto L26
            if (r3 != r8) goto L26
            if (r1 != r9) goto L26
            return r5
        L26:
            androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.m7of(r0, r2, r3, r1)
            return r5
    }

    public static androidx.core.view.WindowInsetsCompat toWindowInsetsCompat(android.view.WindowInsets r1) {
            r0 = 0
            androidx.core.view.WindowInsetsCompat r1 = toWindowInsetsCompat(r1, r0)
            return r1
    }

    public static androidx.core.view.WindowInsetsCompat toWindowInsetsCompat(android.view.WindowInsets r1, android.view.View r2) {
            androidx.core.view.WindowInsetsCompat r0 = new androidx.core.view.WindowInsetsCompat
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            android.view.WindowInsets r1 = (android.view.WindowInsets) r1
            r0.<init>(r1)
            if (r2 == 0) goto L21
            boolean r1 = r2.isAttachedToWindow()
            if (r1 == 0) goto L21
            androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.ViewCompat.getRootWindowInsets(r2)
            r0.setRootWindowInsets(r1)
            android.view.View r1 = r2.getRootView()
            r0.copyRootViewBounds(r1)
        L21:
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat r0 = r0.consumeDisplayCutout()
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeStableInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat r0 = r0.consumeStableInsets()
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat r0 = r0.consumeSystemWindowInsets()
            return r0
    }

    void copyRootViewBounds(android.view.View r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.copyRootViewBounds(r2)
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.core.view.WindowInsetsCompat
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            androidx.core.view.WindowInsetsCompat r2 = (androidx.core.view.WindowInsetsCompat) r2
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat$Impl r2 = r2.mImpl
            boolean r2 = androidx.core.util.ObjectsCompat.equals(r0, r2)
            return r2
    }

    public androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.DisplayCutoutCompat r0 = r0.getDisplayCutout()
            return r0
    }

    public androidx.core.graphics.Insets getInsets(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r2 = r0.getInsets(r2)
            return r2
    }

    public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r2 = r0.getInsetsIgnoringVisibility(r2)
            return r2
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getMandatorySystemGestureInsets()
            return r0
    }

    @java.lang.Deprecated
    public int getStableInsetBottom() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            int r0 = r0.bottom
            return r0
    }

    @java.lang.Deprecated
    public int getStableInsetLeft() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            int r0 = r0.left
            return r0
    }

    @java.lang.Deprecated
    public int getStableInsetRight() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            int r0 = r0.right
            return r0
    }

    @java.lang.Deprecated
    public int getStableInsetTop() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            int r0 = r0.top
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getStableInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getSystemGestureInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemGestureInsets()
            return r0
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetBottom() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            int r0 = r0.bottom
            return r0
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetLeft() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            int r0 = r0.left
            return r0
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetRight() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            int r0 = r0.right
            return r0
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetTop() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            int r0 = r0.top
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getSystemWindowInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getTappableElementInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getTappableElementInsets()
            return r0
    }

    public boolean hasInsets() {
            r2 = this;
            int r0 = androidx.core.view.WindowInsetsCompat.Type.all()
            androidx.core.graphics.Insets r0 = r2.getInsets(r0)
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            int r0 = androidx.core.view.WindowInsetsCompat.Type.all()
            int r1 = androidx.core.view.WindowInsetsCompat.Type.ime()
            r0 = r0 ^ r1
            androidx.core.graphics.Insets r0 = r2.getInsetsIgnoringVisibility(r0)
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            androidx.core.view.DisplayCutoutCompat r0 = r2.getDisplayCutout()
            if (r0 == 0) goto L2c
            goto L2e
        L2c:
            r0 = 0
            goto L2f
        L2e:
            r0 = 1
        L2f:
            return r0
    }

    @java.lang.Deprecated
    public boolean hasStableInsets() {
            r2 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r2.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    @java.lang.Deprecated
    public boolean hasSystemWindowInsets() {
            r2 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r2.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public androidx.core.view.WindowInsetsCompat inset(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat r2 = r0.inset(r2, r3, r4, r5)
            return r2
    }

    public androidx.core.view.WindowInsetsCompat inset(androidx.core.graphics.Insets r4) {
            r3 = this;
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            androidx.core.view.WindowInsetsCompat r4 = r3.inset(r0, r1, r2, r4)
            return r4
    }

    public boolean isConsumed() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isConsumed()
            return r0
    }

    public boolean isRound() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isRound()
            return r0
    }

    public boolean isVisible(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            boolean r2 = r0.isVisible(r2)
            return r2
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat replaceSystemWindowInsets(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
            r0.<init>(r1)
            androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.m7of(r2, r3, r4, r5)
            androidx.core.view.WindowInsetsCompat$Builder r2 = r0.setSystemWindowInsets(r2)
            androidx.core.view.WindowInsetsCompat r2 = r2.build()
            return r2
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat replaceSystemWindowInsets(android.graphics.Rect r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
            r0.<init>(r1)
            androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.m8of(r2)
            androidx.core.view.WindowInsetsCompat$Builder r2 = r0.setSystemWindowInsets(r2)
            androidx.core.view.WindowInsetsCompat r2 = r2.build()
            return r2
    }

    void setOverriddenInsets(androidx.core.graphics.Insets[] r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setOverriddenInsets(r2)
            return
    }

    void setRootViewData(androidx.core.graphics.Insets r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setRootViewData(r2)
            return
    }

    void setRootWindowInsets(androidx.core.view.WindowInsetsCompat r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setRootWindowInsets(r2)
            return
    }

    void setStableInsets(androidx.core.graphics.Insets r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setStableInsets(r2)
            return
    }

    public android.view.WindowInsets toWindowInsets() {
            r2 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r2.mImpl
            boolean r1 = r0 instanceof androidx.core.view.WindowInsetsCompat.Impl20
            if (r1 == 0) goto Lb
            androidx.core.view.WindowInsetsCompat$Impl20 r0 = (androidx.core.view.WindowInsetsCompat.Impl20) r0
            android.view.WindowInsets r0 = r0.mPlatformInsets
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }
}
