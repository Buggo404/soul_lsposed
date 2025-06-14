package com.usidqw.qwerklj.Adapter;

/* loaded from: classes.dex */
public class DialogSelectFileAdapter extends android.widget.BaseAdapter {
    private final android.app.Activity activity;
    private java.io.File[] files;
    private final android.view.LayoutInflater inflater;
    private java.lang.String path;

    public DialogSelectFileAdapter(android.app.Activity r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.activity = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.inflater = r1
            r0.path = r2
            return
    }

    private java.lang.String pathGetName(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "/"
            java.lang.String[] r2 = r2.split(r0)
            int r0 = r2.length
            int r0 = r0 + (-1)
            r2 = r2[r0]
            return r2
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r2 = this;
            java.io.File[] r0 = r2.files
            r1 = 1
            if (r0 == 0) goto L8
            int r0 = r0.length
            int r0 = r0 + r1
            return r0
        L8:
            return r1
    }

    @Override // android.widget.Adapter
    public java.io.File getItem(int r2) {
            r1 = this;
            java.io.File[] r0 = r1.files
            if (r0 == 0) goto L7
            r2 = r0[r2]
            return r2
        L7:
            r2 = 0
            return r2
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            java.io.File r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
            r9 = this;
            if (r11 != 0) goto L10
            android.view.LayoutInflater r11 = r9.inflater
            com.usidqw.qwerklj.databinding.PlusDialogFileItemBinding r11 = com.usidqw.qwerklj.databinding.PlusDialogFileItemBinding.inflate(r11)
            android.widget.LinearLayout r12 = r11.getRoot()
            r12.setTag(r11)
            goto L16
        L10:
            java.lang.Object r11 = r11.getTag()
            com.usidqw.qwerklj.databinding.PlusDialogFileItemBinding r11 = (com.usidqw.qwerklj.databinding.PlusDialogFileItemBinding) r11
        L16:
            android.widget.TextView r12 = r11.fileName
            java.lang.String r0 = ""
            r12.setText(r0)
            r12 = -2046295941(0xffffffff8608007b, float:-2.557911E-35)
            r0 = 8
            if (r10 == 0) goto L1b8
            java.io.File[] r1 = r9.files
            r2 = 1
            int r10 = r10 - r2
            r10 = r1[r10]
            android.widget.TextView r1 = r11.fileName
            r3 = 0
            r1.setVisibility(r3)
            if (r10 == 0) goto L20a
            android.widget.TextView r1 = r11.fileName
            java.lang.String r4 = r10.getPath()
            java.lang.String r4 = r9.pathGetName(r4)
            r1.setText(r4)
            android.widget.ImageView r1 = r11.fileImg
            r1.setImageResource(r12)
            boolean r12 = r10.isDirectory()
            java.lang.String r1 = "    "
            java.lang.String r4 = "yyyy-MM-dd HH:mm"
            if (r12 == 0) goto L91
            android.widget.ImageView r12 = r11.fileOpen
            r12.setVisibility(r3)
            java.io.File[] r12 = r10.listFiles()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r12 == 0) goto L69
            int r12 = r12.length
            java.lang.StringBuilder r12 = r0.append(r12)
            java.lang.String r2 = "  项"
            r12.append(r2)
            goto L6e
        L69:
            java.lang.String r12 = "0  项"
            r0.append(r12)
        L6e:
            java.util.Date r12 = new java.util.Date
            long r2 = r10.lastModified()
            r12.<init>(r2)
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat
            r10.<init>(r4)
            r0.append(r1)
            java.lang.String r10 = r10.format(r12)
            r0.append(r10)
            android.widget.TextView r10 = r11.fileTime
            java.lang.String r12 = r0.toString()
            r10.setText(r12)
            goto L20a
        L91:
            android.widget.ImageView r12 = r11.fileOpen
            r12.setVisibility(r0)
            java.lang.String r12 = r10.getPath()
            java.lang.String r12 = com.usidqw.qwerklj.Utils.Tools.pathGetType(r12)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = com.usidqw.qwerklj.Utils.FileSizeUtil.getAutoFileOrFilesSize(r10)
            r5.append(r6)
            java.util.Date r6 = new java.util.Date
            long r7 = r10.lastModified()
            r6.<init>(r7)
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
            r7.<init>(r4)
            r5.append(r1)
            java.lang.String r1 = r7.format(r6)
            r5.append(r1)
            android.widget.TextView r1 = r11.fileTime
            java.lang.String r4 = r5.toString()
            r1.setText(r4)
            r12.hashCode()
            int r1 = r12.hashCode()
            r4 = -1
            switch(r1) {
                case 52316: goto L164;
                case 102340: goto L158;
                case 105441: goto L14d;
                case 106458: goto L142;
                case 106479: goto L137;
                case 108184: goto L12c;
                case 108272: goto L121;
                case 108273: goto L116;
                case 111145: goto L10d;
                case 115312: goto L100;
                case 117484: goto Lf3;
                case 120609: goto Le6;
                case 3268712: goto Ld9;
                default: goto Ld6;
            }
        Ld6:
            r0 = r4
            goto L16f
        Ld9:
            java.lang.String r0 = "jpeg"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto Le2
            goto Ld6
        Le2:
            r0 = 12
            goto L16f
        Le6:
            java.lang.String r0 = "zip"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto Lef
            goto Ld6
        Lef:
            r0 = 11
            goto L16f
        Lf3:
            java.lang.String r0 = "wav"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto Lfc
            goto Ld6
        Lfc:
            r0 = 10
            goto L16f
        L100:
            java.lang.String r0 = "txt"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L109
            goto Ld6
        L109:
            r0 = 9
            goto L16f
        L10d:
            java.lang.String r1 = "png"
            boolean r12 = r12.equals(r1)
            if (r12 != 0) goto L16f
            goto Ld6
        L116:
            java.lang.String r0 = "mp4"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L11f
            goto Ld6
        L11f:
            r0 = 7
            goto L16f
        L121:
            java.lang.String r0 = "mp3"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L12a
            goto Ld6
        L12a:
            r0 = 6
            goto L16f
        L12c:
            java.lang.String r0 = "mkv"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L135
            goto Ld6
        L135:
            r0 = 5
            goto L16f
        L137:
            java.lang.String r0 = "m4v"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L140
            goto Ld6
        L140:
            r0 = 4
            goto L16f
        L142:
            java.lang.String r0 = "m4a"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L14b
            goto Ld6
        L14b:
            r0 = 3
            goto L16f
        L14d:
            java.lang.String r0 = "jpg"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L156
            goto Ld6
        L156:
            r0 = 2
            goto L16f
        L158:
            java.lang.String r0 = "gif"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L162
            goto Ld6
        L162:
            r0 = r2
            goto L16f
        L164:
            java.lang.String r0 = "3gp"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L16e
            goto Ld6
        L16e:
            r0 = r3
        L16f:
            switch(r0) {
                case 0: goto L1af;
                case 1: goto L199;
                case 2: goto L199;
                case 3: goto L190;
                case 4: goto L1af;
                case 5: goto L1af;
                case 6: goto L190;
                case 7: goto L1af;
                case 8: goto L199;
                case 9: goto L186;
                case 10: goto L190;
                case 11: goto L17c;
                case 12: goto L199;
                default: goto L172;
            }
        L172:
            android.widget.ImageView r10 = r11.fileImg
            r12 = -2046295953(0xffffffff8608006f, float:-2.5579076E-35)
            r10.setImageResource(r12)
            goto L20a
        L17c:
            android.widget.ImageView r10 = r11.fileImg
            r12 = -2046295957(0xffffffff8608006b, float:-2.5579064E-35)
            r10.setImageResource(r12)
            goto L20a
        L186:
            android.widget.ImageView r10 = r11.fileImg
            r12 = -2046295942(0xffffffff8608007a, float:-2.5579107E-35)
            r10.setImageResource(r12)
            goto L20a
        L190:
            android.widget.ImageView r10 = r11.fileImg
            r12 = -2046295971(0xffffffff8608005d, float:-2.5579024E-35)
            r10.setImageResource(r12)
            goto L20a
        L199:
            android.app.Activity r12 = r9.activity
            com.squareup.picasso.Picasso r12 = com.squareup.picasso.Picasso.with(r12)
            com.squareup.picasso.RequestCreator r10 = r12.load(r10)
            r12 = 100
            com.squareup.picasso.RequestCreator r10 = r10.resize(r12, r12)
            android.widget.ImageView r12 = r11.fileImg
            r10.into(r12)
            goto L20a
        L1af:
            android.widget.ImageView r10 = r11.fileImg
            r12 = -2046295940(0xffffffff8608007c, float:-2.5579113E-35)
            r10.setImageResource(r12)
            goto L20a
        L1b8:
            android.widget.ImageView r10 = r11.fileImg
            r10.setImageResource(r12)
            java.io.File r10 = new java.io.File
            java.lang.String r12 = r9.path
            r10.<init>(r12)
            android.widget.TextView r12 = r11.fileName
            r12.setVisibility(r0)
            boolean r12 = r10.isDirectory()
            java.lang.String r1 = "....."
            if (r12 != 0) goto L1e8
            android.widget.TextView r12 = r11.fileTime
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r10 = r10.getParent()
            java.lang.StringBuilder r10 = r2.append(r10)
            java.lang.String r10 = r10.toString()
            r12.setText(r10)
            goto L205
        L1e8:
            android.widget.TextView r10 = r11.fileTime
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r9.path
            r1.<init>(r2)
            java.lang.String r1 = r1.getParent()
            java.lang.StringBuilder r12 = r12.append(r1)
            java.lang.String r12 = r12.toString()
            r10.setText(r12)
        L205:
            android.widget.ImageView r10 = r11.fileOpen
            r10.setVisibility(r0)
        L20a:
            android.widget.LinearLayout r10 = r11.getRoot()
            return r10
    }

    public void setData(java.io.File[] r1) {
            r0 = this;
            r0.files = r1
            return
    }

    public void setPath(java.lang.String r1) {
            r0 = this;
            r0.path = r1
            return
    }
}
