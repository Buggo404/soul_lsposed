package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends android.widget.LinearLayout implements androidx.appcompat.widget.FitWindowsViewGroup {
    private androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener mListener;

    public FitWindowsLinearLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public FitWindowsLinearLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect r2) {
            r1 = this;
            androidx.appcompat.widget.FitWindowsViewGroup$OnFitSystemWindowsListener r0 = r1.mListener
            if (r0 == 0) goto L7
            r0.onFitSystemWindows(r2)
        L7:
            boolean r2 = super.fitSystemWindows(r2)
            return r2
    }

    @Override // androidx.appcompat.widget.FitWindowsViewGroup
    public void setOnFitSystemWindowsListener(androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener r1) {
            r0 = this;
            r0.mListener = r1
            return
    }
}
