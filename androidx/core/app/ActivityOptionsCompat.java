package androidx.core.app;

/* loaded from: classes.dex */
public class ActivityOptionsCompat {
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    private static class ActivityOptionsCompatImpl extends androidx.core.app.ActivityOptionsCompat {
        private final android.app.ActivityOptions mActivityOptions;

        ActivityOptionsCompatImpl(android.app.ActivityOptions r1) {
                r0 = this;
                r0.<init>()
                r0.mActivityOptions = r1
                return
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.graphics.Rect getLaunchBounds() {
                r1 = this;
                android.app.ActivityOptions r0 = r1.mActivityOptions
                android.graphics.Rect r0 = r0.getLaunchBounds()
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(android.app.PendingIntent r2) {
                r1 = this;
                android.app.ActivityOptions r0 = r1.mActivityOptions
                r0.requestUsageTimeReport(r2)
                return
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setLaunchBounds(android.graphics.Rect r3) {
                r2 = this;
                androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
                android.app.ActivityOptions r1 = r2.mActivityOptions
                android.app.ActivityOptions r3 = r1.setLaunchBounds(r3)
                r0.<init>(r3)
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.os.Bundle toBundle() {
                r1 = this;
                android.app.ActivityOptions r0 = r1.mActivityOptions
                android.os.Bundle r0 = r0.toBundle()
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(androidx.core.app.ActivityOptionsCompat r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl
                if (r0 == 0) goto Ld
                androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r2 = (androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl) r2
                android.app.ActivityOptions r0 = r1.mActivityOptions
                android.app.ActivityOptions r2 = r2.mActivityOptions
                r0.update(r2)
            Ld:
                return
        }
    }

    protected ActivityOptionsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.ActivityOptionsCompat makeBasic() {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeBasic()
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeClipRevealAnimation(android.view.View r1, int r2, int r3, int r4, int r5) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeClipRevealAnimation(r1, r2, r3, r4, r5)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeCustomAnimation(android.content.Context r1, int r2, int r3) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeCustomAnimation(r1, r2, r3)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeScaleUpAnimation(android.view.View r1, int r2, int r3, int r4, int r5) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeScaleUpAnimation(r1, r2, r3, r4, r5)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(android.app.Activity r1, android.view.View r2, java.lang.String r3) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeSceneTransitionAnimation(r1, r2, r3)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(android.app.Activity r4, androidx.core.util.Pair<android.view.View, java.lang.String>... r5) {
            if (r5 == 0) goto L1a
            int r0 = r5.length
            android.util.Pair[] r0 = new android.util.Pair[r0]
            r1 = 0
        L6:
            int r2 = r5.length
            if (r1 >= r2) goto L1b
            r2 = r5[r1]
            F r2 = r2.first
            r3 = r5[r1]
            S r3 = r3.second
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L6
        L1a:
            r0 = 0
        L1b:
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r5 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r4 = android.app.ActivityOptions.makeSceneTransitionAnimation(r4, r0)
            r5.<init>(r4)
            return r5
    }

    public static androidx.core.app.ActivityOptionsCompat makeTaskLaunchBehind() {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeTaskLaunchBehind()
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeThumbnailScaleUpAnimation(android.view.View r1, android.graphics.Bitmap r2, int r3, int r4) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeThumbnailScaleUpAnimation(r1, r2, r3, r4)
            r0.<init>(r1)
            return r0
    }

    public android.graphics.Rect getLaunchBounds() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void requestUsageTimeReport(android.app.PendingIntent r1) {
            r0 = this;
            return
    }

    public androidx.core.app.ActivityOptionsCompat setLaunchBounds(android.graphics.Rect r1) {
            r0 = this;
            return r0
    }

    public android.os.Bundle toBundle() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void update(androidx.core.app.ActivityOptionsCompat r1) {
            r0 = this;
            return
    }
}
