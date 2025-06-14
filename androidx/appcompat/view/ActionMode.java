package androidx.appcompat.view;

/* loaded from: classes.dex */
public abstract class ActionMode {
    private java.lang.Object mTag;
    private boolean mTitleOptionalHint;

    public interface Callback {
        boolean onActionItemClicked(androidx.appcompat.view.ActionMode r1, android.view.MenuItem r2);

        boolean onCreateActionMode(androidx.appcompat.view.ActionMode r1, android.view.Menu r2);

        void onDestroyActionMode(androidx.appcompat.view.ActionMode r1);

        boolean onPrepareActionMode(androidx.appcompat.view.ActionMode r1, android.view.Menu r2);
    }

    public ActionMode() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void finish();

    public abstract android.view.View getCustomView();

    public abstract android.view.Menu getMenu();

    public abstract android.view.MenuInflater getMenuInflater();

    public abstract java.lang.CharSequence getSubtitle();

    public java.lang.Object getTag() {
            r1 = this;
            java.lang.Object r0 = r1.mTag
            return r0
    }

    public abstract java.lang.CharSequence getTitle();

    public boolean getTitleOptionalHint() {
            r1 = this;
            boolean r0 = r1.mTitleOptionalHint
            return r0
    }

    public abstract void invalidate();

    public boolean isTitleOptional() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isUiFocusable() {
            r1 = this;
            r0 = 1
            return r0
    }

    public abstract void setCustomView(android.view.View r1);

    public abstract void setSubtitle(int r1);

    public abstract void setSubtitle(java.lang.CharSequence r1);

    public void setTag(java.lang.Object r1) {
            r0 = this;
            r0.mTag = r1
            return
    }

    public abstract void setTitle(int r1);

    public abstract void setTitle(java.lang.CharSequence r1);

    public void setTitleOptionalHint(boolean r1) {
            r0 = this;
            r0.mTitleOptionalHint = r1
            return
    }
}
