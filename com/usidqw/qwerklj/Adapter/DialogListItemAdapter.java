package com.usidqw.qwerklj.Adapter;

/* loaded from: classes.dex */
public class DialogListItemAdapter extends android.widget.BaseAdapter {
    private final android.app.Activity activity;
    private final java.util.List<com.usidqw.qwerklj.Json.DialogListItem> data;
    private final android.view.LayoutInflater inflater;
    private final com.usidqw.qwerklj.Dialog.PlusDialog.ListOnClick listOnClickCall;
    private final boolean showOpenButton;

    public DialogListItemAdapter(android.app.Activity r2, java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r3, com.usidqw.qwerklj.Dialog.PlusDialog.ListOnClick r4, boolean r5) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.data = r0
            r0.addAll(r3)
            r1.listOnClickCall = r4
            r1.activity = r2
            r1.showOpenButton = r5
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.inflater = r2
            return
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r0 = r1.data
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public com.usidqw.qwerklj.Json.DialogListItem getItem(int r2) {
            r1 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r0 = r1.data
            java.lang.Object r2 = r0.get(r2)
            com.usidqw.qwerklj.Json.DialogListItem r2 = (com.usidqw.qwerklj.Json.DialogListItem) r2
            return r2
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            com.usidqw.qwerklj.Json.DialogListItem r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
            r4 = this;
            com.usidqw.qwerklj.Json.DialogListItem r7 = r4.getItem(r5)
            if (r6 != 0) goto L14
            android.view.LayoutInflater r6 = r4.inflater
            com.usidqw.qwerklj.databinding.PlusDialogListItemBinding r6 = com.usidqw.qwerklj.databinding.PlusDialogListItemBinding.inflate(r6)
            android.widget.LinearLayout r0 = r6.getRoot()
            r0.setTag(r6)
            goto L1a
        L14:
            java.lang.Object r6 = r6.getTag()
            com.usidqw.qwerklj.databinding.PlusDialogListItemBinding r6 = (com.usidqw.qwerklj.databinding.PlusDialogListItemBinding) r6
        L1a:
            if (r7 == 0) goto Lbc
            android.widget.TextView r0 = r6.title
            java.lang.String r1 = r7.getTitle()
            android.text.Spanned r1 = com.usidqw.qwerklj.Utils.Tools.toHtml(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r6.title
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            android.widget.TextView r0 = r6.title
            r1 = 1
            r0.setLinksClickable(r1)
            android.widget.TextView r0 = r6.desc
            java.lang.String r2 = r7.getDesc()
            android.text.Spanned r2 = com.usidqw.qwerklj.Utils.Tools.toHtml(r2)
            r0.setText(r2)
            android.widget.TextView r0 = r6.desc
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r2)
            android.widget.TextView r0 = r6.desc
            r0.setLinksClickable(r1)
            android.widget.TextView r0 = r6.desc
            java.lang.String r1 = r7.getDesc()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            r3 = 8
            if (r1 == 0) goto L64
            r1 = r3
            goto L65
        L64:
            r1 = r2
        L65:
            r0.setVisibility(r1)
            boolean r0 = r7.isSwitch()
            if (r0 == 0) goto L79
            android.widget.Switch r0 = r6.switchOpen
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r6.open
            r0.setVisibility(r3)
            goto L89
        L79:
            android.widget.Switch r0 = r6.switchOpen
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r6.open
            boolean r1 = r4.showOpenButton
            if (r1 == 0) goto L85
            goto L86
        L85:
            r2 = r3
        L86:
            r0.setVisibility(r2)
        L89:
            android.widget.Switch r0 = r6.switchOpen
            r1 = 0
            r0.setOnCheckedChangeListener(r1)
            boolean r0 = r7.isSwitch()
            if (r0 == 0) goto L9e
            android.widget.Switch r0 = r6.switchOpen
            boolean r1 = r7.isSelected()
            r0.setChecked(r1)
        L9e:
            android.widget.Switch r0 = r6.switchOpen
            com.usidqw.qwerklj.Adapter.DialogListItemAdapter$$ExternalSyntheticLambda0 r1 = new com.usidqw.qwerklj.Adapter.DialogListItemAdapter$$ExternalSyntheticLambda0
            r1.<init>(r4, r7, r5)
            r0.setOnCheckedChangeListener(r1)
            com.usidqw.qwerklj.Adapter.DialogListItemAdapter$$ExternalSyntheticLambda1 r0 = new com.usidqw.qwerklj.Adapter.DialogListItemAdapter$$ExternalSyntheticLambda1
            r0.<init>(r4, r7, r5)
            android.widget.TextView r5 = r6.title
            r5.setOnClickListener(r0)
            android.widget.TextView r5 = r6.desc
            r5.setOnClickListener(r0)
            android.widget.LinearLayout r5 = r6.dialogMain
            r5.setOnClickListener(r0)
        Lbc:
            android.widget.LinearLayout r5 = r6.getRoot()
            return r5
    }

    /* renamed from: lambda$getView$0$com-usidqw-qwerklj-Adapter-DialogListItemAdapter */
    /* synthetic */ void m17xd46b0ab9(com.usidqw.qwerklj.Json.DialogListItem r1, int r2, android.widget.CompoundButton r3, boolean r4) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$ListOnClick r3 = r0.listOnClickCall
            if (r3 == 0) goto Lc
            r1.setSelected(r4)
            com.usidqw.qwerklj.Dialog.PlusDialog$ListOnClick r3 = r0.listOnClickCall
            r3.onClick(r1, r2)
        Lc:
            return
    }

    /* renamed from: lambda$getView$1$com-usidqw-qwerklj-Adapter-DialogListItemAdapter */
    /* synthetic */ void m18xc614b0d8(com.usidqw.qwerklj.Json.DialogListItem r1, int r2, android.view.View r3) {
            r0 = this;
            boolean r3 = r1.isSwitch()
            if (r3 == 0) goto L12
            boolean r3 = r1.isSelected()
            r3 = r3 ^ 1
            r1.setSelected(r3)
            r0.notifyDataSetChanged()
        L12:
            com.usidqw.qwerklj.Dialog.PlusDialog$ListOnClick r3 = r0.listOnClickCall
            if (r3 == 0) goto L19
            r3.onClick(r1, r2)
        L19:
            return
    }

    public void setItemDesc(int r2, java.lang.String r3) {
            r1 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r0 = r1.data
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L16
            java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r0 = r1.data
            java.lang.Object r2 = r0.get(r2)
            com.usidqw.qwerklj.Json.DialogListItem r2 = (com.usidqw.qwerklj.Json.DialogListItem) r2
            r2.setDesc(r3)
            r1.notifyDataSetChanged()
        L16:
            return
    }

    public void setItemDesc(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r0 = r3.data
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.usidqw.qwerklj.Json.DialogListItem r1 = (com.usidqw.qwerklj.Json.DialogListItem) r1
            java.lang.String r2 = r1.getTitle()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            r1.setDesc(r5)
            r3.notifyDataSetChanged()
            goto L6
        L23:
            return
    }

    public void setItemDescNoNotifyDataSetChanged(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r0 = r3.data
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.usidqw.qwerklj.Json.DialogListItem r1 = (com.usidqw.qwerklj.Json.DialogListItem) r1
            java.lang.String r2 = r1.getTitle()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            r1.setDesc(r5)
            goto L6
        L20:
            return
    }

    public void setItemSwitch(int r2, boolean r3) {
            r1 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r0 = r1.data
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L16
            java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r0 = r1.data
            java.lang.Object r2 = r0.get(r2)
            com.usidqw.qwerklj.Json.DialogListItem r2 = (com.usidqw.qwerklj.Json.DialogListItem) r2
            r2.setSelected(r3)
            r1.notifyDataSetChanged()
        L16:
            return
    }

    public void setItemSwitchNoNotifyDataSetChanged(java.lang.String r4, boolean r5) {
            r3 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r0 = r3.data
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.usidqw.qwerklj.Json.DialogListItem r1 = (com.usidqw.qwerklj.Json.DialogListItem) r1
            java.lang.String r2 = r1.getTitle()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            r1.setSelected(r5)
            goto L6
        L20:
            return
    }
}
