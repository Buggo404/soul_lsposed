package com.xuexiang.xhttp2.subsciber;

/* loaded from: classes.dex */
public class ProgressDialogLoader implements com.xuexiang.xhttp2.subsciber.impl.IProgressLoader {
    private android.app.ProgressDialog mDialog;
    private com.xuexiang.xhttp2.subsciber.impl.OnProgressCancelListener mOnProgressCancelListener;


    public ProgressDialogLoader(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "请稍候..."
            r1.<init>(r2, r0)
            return
    }

    public ProgressDialogLoader(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            android.app.ProgressDialog r0 = new android.app.ProgressDialog
            r0.<init>(r2)
            r1.mDialog = r0
            r1.updateMessage(r3)
            return
    }

    static /* synthetic */ com.xuexiang.xhttp2.subsciber.impl.OnProgressCancelListener access$000(com.xuexiang.xhttp2.subsciber.ProgressDialogLoader r0) {
            com.xuexiang.xhttp2.subsciber.impl.OnProgressCancelListener r0 = r0.mOnProgressCancelListener
            return r0
    }

    @Override // com.xuexiang.xhttp2.subsciber.impl.IProgressLoader
    public void dismissLoading() {
            r1 = this;
            android.app.ProgressDialog r0 = r1.mDialog
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.impl.IProgressLoader
    public boolean isLoading() {
            r1 = this;
            android.app.ProgressDialog r0 = r1.mDialog
            if (r0 == 0) goto Lc
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // com.xuexiang.xhttp2.subsciber.impl.IProgressLoader
    public void setCancelable(boolean r2) {
            r1 = this;
            android.app.ProgressDialog r0 = r1.mDialog
            r0.setCancelable(r2)
            if (r2 == 0) goto L11
            android.app.ProgressDialog r2 = r1.mDialog
            com.xuexiang.xhttp2.subsciber.ProgressDialogLoader$1 r0 = new com.xuexiang.xhttp2.subsciber.ProgressDialogLoader$1
            r0.<init>(r1)
            r2.setOnCancelListener(r0)
        L11:
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.impl.IProgressLoader
    public void setOnProgressCancelListener(com.xuexiang.xhttp2.subsciber.impl.OnProgressCancelListener r1) {
            r0 = this;
            r0.mOnProgressCancelListener = r1
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.impl.IProgressLoader
    public void showLoading() {
            r1 = this;
            android.app.ProgressDialog r0 = r1.mDialog
            if (r0 == 0) goto L7
            r0.show()
        L7:
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.impl.IProgressLoader
    public void updateMessage(java.lang.String r2) {
            r1 = this;
            android.app.ProgressDialog r0 = r1.mDialog
            if (r0 == 0) goto L7
            r0.setMessage(r2)
        L7:
            return
    }
}
