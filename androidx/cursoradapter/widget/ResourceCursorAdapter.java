package androidx.cursoradapter.widget;

/* loaded from: classes.dex */
public abstract class ResourceCursorAdapter extends androidx.cursoradapter.widget.CursorAdapter {
    private int mDropDownLayout;
    private android.view.LayoutInflater mInflater;
    private int mLayout;

    @java.lang.Deprecated
    public ResourceCursorAdapter(android.content.Context r1, int r2, android.database.Cursor r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.mDropDownLayout = r2
            r0.mLayout = r2
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r0.mInflater = r1
            return
    }

    public ResourceCursorAdapter(android.content.Context r1, int r2, android.database.Cursor r3, int r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0.mDropDownLayout = r2
            r0.mLayout = r2
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r0.mInflater = r1
            return
    }

    @java.lang.Deprecated
    public ResourceCursorAdapter(android.content.Context r1, int r2, android.database.Cursor r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0.mDropDownLayout = r2
            r0.mLayout = r2
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r0.mInflater = r1
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public android.view.View newDropDownView(android.content.Context r2, android.database.Cursor r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.LayoutInflater r2 = r1.mInflater
            int r3 = r1.mDropDownLayout
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r4, r0)
            return r2
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public android.view.View newView(android.content.Context r2, android.database.Cursor r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.LayoutInflater r2 = r1.mInflater
            int r3 = r1.mLayout
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r4, r0)
            return r2
    }

    public void setDropDownViewResource(int r1) {
            r0 = this;
            r0.mDropDownLayout = r1
            return
    }

    public void setViewResource(int r1) {
            r0 = this;
            r0.mLayout = r1
            return
    }
}
