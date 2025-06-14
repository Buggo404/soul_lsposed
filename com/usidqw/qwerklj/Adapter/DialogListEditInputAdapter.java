package com.usidqw.qwerklj.Adapter;

/* loaded from: classes.dex */
public class DialogListEditInputAdapter extends android.widget.BaseAdapter {
    private final android.app.Activity activity;
    private final java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> data;
    private final android.view.LayoutInflater inflater;

    public DialogListEditInputAdapter(android.app.Activity r1, java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r2) {
            r0 = this;
            r0.<init>()
            if (r2 != 0) goto La
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        La:
            r0.data = r2
            r0.activity = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.inflater = r1
            return
    }

    public void addItem() {
            r1 = this;
            java.lang.String r0 = ""
            r1.addItem(r0, r0)
            return
    }

    public void addItem(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.usidqw.qwerklj.Json.DialogListEdit r0 = new com.usidqw.qwerklj.Json.DialogListEdit
            r0.<init>(r2, r3)
            java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r2 = r1.data
            r2.add(r0)
            r1.notifyDataSetChanged()
            return
    }

    public java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> getAllData() {
            r1 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r0 = r1.data
            return r0
    }

    public java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> getAllDataHandle() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r1 = r4.data
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            com.usidqw.qwerklj.Json.DialogListEdit r2 = (com.usidqw.qwerklj.Json.DialogListEdit) r2
            java.lang.String r3 = r2.getKey()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Lb
            r0.add(r2)
            goto Lb
        L25:
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r0 = r1.data
            if (r0 == 0) goto L9
            int r0 = r0.size()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public com.usidqw.qwerklj.Json.DialogListEdit getItem(int r2) {
            r1 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r0 = r1.data
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r0.get(r2)
            com.usidqw.qwerklj.Json.DialogListEdit r2 = (com.usidqw.qwerklj.Json.DialogListEdit) r2
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            com.usidqw.qwerklj.Json.DialogListEdit r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            com.usidqw.qwerklj.Json.DialogListEdit r2 = r1.getItem(r2)
            if (r3 != 0) goto L14
            android.view.LayoutInflater r3 = r1.inflater
            com.usidqw.qwerklj.databinding.PlusDialogListEditInputItemBinding r3 = com.usidqw.qwerklj.databinding.PlusDialogListEditInputItemBinding.inflate(r3)
            android.widget.LinearLayout r4 = r3.getRoot()
            r4.setTag(r3)
            goto L1a
        L14:
            java.lang.Object r3 = r3.getTag()
            com.usidqw.qwerklj.databinding.PlusDialogListEditInputItemBinding r3 = (com.usidqw.qwerklj.databinding.PlusDialogListEditInputItemBinding) r3
        L1a:
            if (r2 == 0) goto L2f
            android.widget.TextView r4 = r3.dialogKey
            java.lang.String r0 = r2.getKey()
            r4.setText(r0)
            android.widget.TextView r4 = r3.delete
            com.usidqw.qwerklj.Adapter.DialogListEditInputAdapter$$ExternalSyntheticLambda0 r0 = new com.usidqw.qwerklj.Adapter.DialogListEditInputAdapter$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            r4.setOnClickListener(r0)
        L2f:
            android.widget.LinearLayout r2 = r3.getRoot()
            return r2
    }

    /* renamed from: lambda$getView$0$com-usidqw-qwerklj-Adapter-DialogListEditInputAdapter */
    /* synthetic */ void m16x2d114f72(com.usidqw.qwerklj.Json.DialogListEdit r1, android.view.View r2) {
            r0 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r2 = r0.data
            r2.remove(r1)
            r0.notifyDataSetChanged()
            return
    }

    public void saveData(int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r0 = r1.data
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get(r2)
            com.usidqw.qwerklj.Json.DialogListEdit r0 = (com.usidqw.qwerklj.Json.DialogListEdit) r0
            r0.setKey(r3)
            java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r3 = r1.data
            java.lang.Object r2 = r3.get(r2)
            com.usidqw.qwerklj.Json.DialogListEdit r2 = (com.usidqw.qwerklj.Json.DialogListEdit) r2
            r2.setValue(r4)
            r1.notifyDataSetChanged()
        L1b:
            return
    }
}
