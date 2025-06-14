package com.google.android.material.progressindicator;

/* loaded from: classes.dex */
public final class CircularProgressIndicator extends com.google.android.material.progressindicator.BaseProgressIndicator<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = 0;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_CircularProgressIndicator
            com.google.android.material.progressindicator.CircularProgressIndicator.DEF_STYLE_RES = r0
            return
    }

    public CircularProgressIndicator(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CircularProgressIndicator(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.circularProgressIndicatorStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CircularProgressIndicator(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            int r0 = com.google.android.material.progressindicator.CircularProgressIndicator.DEF_STYLE_RES
            r1.<init>(r2, r3, r4, r0)
            r1.initializeDrawables()
            return
    }

    private void initializeDrawables() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r2.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            com.google.android.material.progressindicator.IndeterminateDrawable r0 = com.google.android.material.progressindicator.IndeterminateDrawable.createCircularDrawable(r0, r1)
            r2.setIndeterminateDrawable(r0)
            android.content.Context r0 = r2.getContext()
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r2.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            com.google.android.material.progressindicator.DeterminateDrawable r0 = com.google.android.material.progressindicator.DeterminateDrawable.createCircularDrawable(r0, r1)
            r2.setProgressDrawable(r0)
            return
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* bridge */ /* synthetic */ com.google.android.material.progressindicator.BaseProgressIndicatorSpec createSpec(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = r0.createSpec(r1, r2)
            return r1
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    com.google.android.material.progressindicator.CircularProgressIndicatorSpec createSpec(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = new com.google.android.material.progressindicator.CircularProgressIndicatorSpec
            r0.<init>(r2, r3)
            return r0
    }

    public int getIndicatorDirection() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorDirection
            return r0
    }

    public int getIndicatorInset() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorInset
            return r0
    }

    public int getIndicatorSize() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorSize
            return r0
    }

    public void setIndicatorDirection(int r2) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            r0.indicatorDirection = r2
            r1.invalidate()
            return
    }

    public void setIndicatorInset(int r2) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorInset
            if (r0 == r2) goto L11
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            r0.indicatorInset = r2
            r1.invalidate()
        L11:
            return
    }

    public void setIndicatorSize(int r2) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorSize
            if (r0 == r2) goto L18
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            r0.indicatorSize = r2
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r1.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r2 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r2
            r2.validateSpec()
            r1.invalidate()
        L18:
            return
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int r1) {
            r0 = this;
            super.setTrackThickness(r1)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r0.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            r1.validateSpec()
            return
    }
}
