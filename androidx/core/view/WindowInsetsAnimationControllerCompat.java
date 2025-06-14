package androidx.core.view;

/* loaded from: classes.dex */
public final class WindowInsetsAnimationControllerCompat {
    private final androidx.core.view.WindowInsetsAnimationControllerCompat.Impl mImpl;

    private static class Impl {
        Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        void finish(boolean r1) {
                r0 = this;
                return
        }

        public float getCurrentAlpha() {
                r1 = this;
                r0 = 0
                return r0
        }

        public float getCurrentFraction() {
                r1 = this;
                r0 = 0
                return r0
        }

        public androidx.core.graphics.Insets getCurrentInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        public androidx.core.graphics.Insets getHiddenStateInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        public androidx.core.graphics.Insets getShownStateInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        public int getTypes() {
                r1 = this;
                r0 = 0
                return r0
        }

        boolean isCancelled() {
                r1 = this;
                r0 = 1
                return r0
        }

        boolean isFinished() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean isReady() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void setInsetsAndAlpha(androidx.core.graphics.Insets r1, float r2, float r3) {
                r0 = this;
                return
        }
    }

    private static class Impl30 extends androidx.core.view.WindowInsetsAnimationControllerCompat.Impl {
        private final android.view.WindowInsetsAnimationController mController;

        Impl30(android.view.WindowInsetsAnimationController r1) {
                r0 = this;
                r0.<init>()
                r0.mController = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        void finish(boolean r2) {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                r0.finish(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getCurrentAlpha() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                float r0 = r0.getCurrentAlpha()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getCurrentFraction() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                float r0 = r0.getCurrentFraction()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public androidx.core.graphics.Insets getCurrentInsets() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                android.graphics.Insets r0 = r0.getCurrentInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public androidx.core.graphics.Insets getHiddenStateInsets() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                android.graphics.Insets r0 = r0.getHiddenStateInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public androidx.core.graphics.Insets getShownStateInsets() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                android.graphics.Insets r0 = r0.getShownStateInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public int getTypes() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                int r0 = r0.getTypes()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        boolean isCancelled() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                boolean r0 = r0.isCancelled()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        boolean isFinished() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                boolean r0 = r0.isFinished()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public boolean isReady() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                boolean r0 = r0.isReady()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public void setInsetsAndAlpha(androidx.core.graphics.Insets r2, float r3, float r4) {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                if (r2 != 0) goto L6
                r2 = 0
                goto La
            L6:
                android.graphics.Insets r2 = r2.toPlatformInsets()
            La:
                r0.setInsetsAndAlpha(r2, r3, r4)
                return
        }
    }

    WindowInsetsAnimationControllerCompat() {
            r3 = this;
            r3.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L11
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = new androidx.core.view.WindowInsetsAnimationControllerCompat$Impl
            r0.<init>()
            r3.mImpl = r0
            return
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "On API 30+, the constructor taking a "
            r1.<init>(r2)
            java.lang.Class<android.view.WindowInsetsAnimationController> r2 = android.view.WindowInsetsAnimationController.class
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " as parameter"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    WindowInsetsAnimationControllerCompat(android.view.WindowInsetsAnimationController r2) {
            r1 = this;
            r1.<init>()
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl30 r0 = new androidx.core.view.WindowInsetsAnimationControllerCompat$Impl30
            r0.<init>(r2)
            r1.mImpl = r0
            return
    }

    public void finish(boolean r2) {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            r0.finish(r2)
            return
    }

    public float getCurrentAlpha() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            float r0 = r0.getCurrentAlpha()
            return r0
    }

    public float getCurrentFraction() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            float r0 = r0.getCurrentFraction()
            return r0
    }

    public androidx.core.graphics.Insets getCurrentInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getCurrentInsets()
            return r0
    }

    public androidx.core.graphics.Insets getHiddenStateInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getHiddenStateInsets()
            return r0
    }

    public androidx.core.graphics.Insets getShownStateInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getShownStateInsets()
            return r0
    }

    public int getTypes() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            int r0 = r0.getTypes()
            return r0
    }

    public boolean isCancelled() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isCancelled()
            return r0
    }

    public boolean isFinished() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isFinished()
            return r0
    }

    public boolean isReady() {
            r1 = this;
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto Le
            boolean r0 = r1.isCancelled()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public void setInsetsAndAlpha(androidx.core.graphics.Insets r2, float r3, float r4) {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            r0.setInsetsAndAlpha(r2, r3, r4)
            return
    }
}
