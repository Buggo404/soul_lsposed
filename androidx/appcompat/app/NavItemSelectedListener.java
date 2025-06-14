package androidx.appcompat.app;

/* loaded from: classes.dex */
class NavItemSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
    private final androidx.appcompat.app.ActionBar.OnNavigationListener mListener;

    public NavItemSelectedListener(androidx.appcompat.app.ActionBar.OnNavigationListener r1) {
            r0 = this;
            r0.<init>()
            r0.mListener = r1
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.app.ActionBar$OnNavigationListener r1 = r0.mListener
            if (r1 == 0) goto L7
            r1.onNavigationItemSelected(r3, r4)
        L7:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }
}
