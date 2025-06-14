package androidx.fragment.app;

/* loaded from: classes.dex */
public abstract class FragmentContainer {
    public FragmentContainer() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public androidx.fragment.app.Fragment instantiate(android.content.Context r1, java.lang.String r2, android.os.Bundle r3) {
            r0 = this;
            androidx.fragment.app.Fragment r1 = androidx.fragment.app.Fragment.instantiate(r1, r2, r3)
            return r1
    }

    public abstract android.view.View onFindViewById(int r1);

    public abstract boolean onHasView();
}
