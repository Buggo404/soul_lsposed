package androidx.viewpager.widget;

/* loaded from: classes.dex */
public abstract class PagerAdapter {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private final android.database.DataSetObservable mObservable;
    private android.database.DataSetObserver mViewPagerObserver;

    public PagerAdapter() {
            r1 = this;
            r1.<init>()
            android.database.DataSetObservable r0 = new android.database.DataSetObservable
            r0.<init>()
            r1.mObservable = r0
            return
    }

    @java.lang.Deprecated
    public void destroyItem(android.view.View r1, int r2, java.lang.Object r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Required method destroyItem was not overridden"
            r1.<init>(r2)
            throw r1
    }

    public void destroyItem(android.view.ViewGroup r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.destroyItem(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public void finishUpdate(android.view.View r1) {
            r0 = this;
            return
    }

    public void finishUpdate(android.view.ViewGroup r1) {
            r0 = this;
            r0.finishUpdate(r1)
            return
    }

    public abstract int getCount();

    public int getItemPosition(java.lang.Object r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    public java.lang.CharSequence getPageTitle(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public float getPageWidth(int r1) {
            r0 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
    }

    @java.lang.Deprecated
    public java.lang.Object instantiateItem(android.view.View r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Required method instantiateItem was not overridden"
            r1.<init>(r2)
            throw r1
    }

    public java.lang.Object instantiateItem(android.view.ViewGroup r1, int r2) {
            r0 = this;
            java.lang.Object r1 = r0.instantiateItem(r1, r2)
            return r1
    }

    public abstract boolean isViewFromObject(android.view.View r1, java.lang.Object r2);

    public void notifyDataSetChanged() {
            r1 = this;
            monitor-enter(r1)
            android.database.DataSetObserver r0 = r1.mViewPagerObserver     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L8
            r0.onChanged()     // Catch: java.lang.Throwable -> Lf
        L8:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            android.database.DataSetObservable r0 = r1.mObservable
            r0.notifyChanged()
            return
        Lf:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public void registerDataSetObserver(android.database.DataSetObserver r2) {
            r1 = this;
            android.database.DataSetObservable r0 = r1.mObservable
            r0.registerObserver(r2)
            return
    }

    public void restoreState(android.os.Parcelable r1, java.lang.ClassLoader r2) {
            r0 = this;
            return
    }

    public android.os.Parcelable saveState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public void setPrimaryItem(android.view.View r1, int r2, java.lang.Object r3) {
            r0 = this;
            return
    }

    public void setPrimaryItem(android.view.ViewGroup r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.setPrimaryItem(r1, r2, r3)
            return
    }

    void setViewPagerObserver(android.database.DataSetObserver r1) {
            r0 = this;
            monitor-enter(r0)
            r0.mViewPagerObserver = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    @java.lang.Deprecated
    public void startUpdate(android.view.View r1) {
            r0 = this;
            return
    }

    public void startUpdate(android.view.ViewGroup r1) {
            r0 = this;
            r0.startUpdate(r1)
            return
    }

    public void unregisterDataSetObserver(android.database.DataSetObserver r2) {
            r1 = this;
            android.database.DataSetObservable r0 = r1.mObservable
            r0.unregisterObserver(r2)
            return
    }
}
