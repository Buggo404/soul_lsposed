package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class TintInfo {
    public boolean mHasTintList;
    public boolean mHasTintMode;
    public android.content.res.ColorStateList mTintList;
    public android.graphics.PorterDuff.Mode mTintMode;

    public TintInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    void clear() {
            r2 = this;
            r0 = 0
            r2.mTintList = r0
            r1 = 0
            r2.mHasTintList = r1
            r2.mTintMode = r0
            r2.mHasTintMode = r1
            return
    }
}
