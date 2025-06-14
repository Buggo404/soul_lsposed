package com.usidqw.qwerklj.Utils;

/* loaded from: classes.dex */
public class ToastPlus {
    private static android.widget.Toast staticToast;
    private final android.app.Activity activity;

    /* renamed from: bg */
    private int f161bg;
    private int duration;
    private int gravity;
    private boolean isSync;
    private float radius;
    private int textColor;
    private android.widget.Toast toast;

    public ToastPlus() {
            r2 = this;
            r2.<init>()
            r0 = 48
            r2.gravity = r0
            r0 = -1
            r2.f161bg = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.textColor = r0
            r0 = 0
            r2.radius = r0
            r0 = 1
            r2.isSync = r0
            com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Tools.Static.App
            android.app.Activity r1 = r1.getActivity()
            r2.activity = r1
            r2.duration = r0
            return
    }

    public ToastPlus(android.app.Activity r2) {
            r1 = this;
            r1.<init>()
            r0 = 48
            r1.gravity = r0
            r0 = -1
            r1.f161bg = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.textColor = r0
            r0 = 0
            r1.radius = r0
            r0 = 1
            r1.isSync = r0
            r1.activity = r2
            r1.duration = r0
            return
    }

    public ToastPlus(android.app.Activity r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 48
            r1.gravity = r0
            r0 = -1
            r1.f161bg = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.textColor = r0
            r0 = 0
            r1.radius = r0
            r0 = 1
            r1.isSync = r0
            r1.activity = r2
            r1.duration = r3
            return
    }

    public static com.usidqw.qwerklj.Utils.ToastPlus init() {
            com.usidqw.qwerklj.Utils.ToastPlus r0 = new com.usidqw.qwerklj.Utils.ToastPlus
            com.usidqw.qwerklj.Tools.JsonMain r1 = com.usidqw.qwerklj.Tools.Static.App
            android.app.Activity r1 = r1.getActivity()
            r0.<init>(r1)
            return r0
    }

    public static com.usidqw.qwerklj.Utils.ToastPlus init(android.app.Activity r1) {
            com.usidqw.qwerklj.Utils.ToastPlus r0 = new com.usidqw.qwerklj.Utils.ToastPlus
            r0.<init>(r1)
            return r0
    }

    public static com.usidqw.qwerklj.Utils.ToastPlus init(android.app.Activity r1, int r2) {
            com.usidqw.qwerklj.Utils.ToastPlus r0 = new com.usidqw.qwerklj.Utils.ToastPlus
            r0.<init>(r1, r2)
            return r0
    }

    public com.usidqw.qwerklj.Utils.ToastPlus error() {
            r1 = this;
            java.lang.String r0 = "#F0553D"
            int r0 = android.graphics.Color.parseColor(r0)
            r1.f161bg = r0
            r0 = -1
            r1.textColor = r0
            return r1
    }

    public android.widget.Toast getToast() {
            r1 = this;
            android.widget.Toast r0 = r1.toast
            return r0
    }

    public com.usidqw.qwerklj.Utils.ToastPlus info() {
            r1 = this;
            java.lang.String r0 = "#3B9BFA"
            int r0 = android.graphics.Color.parseColor(r0)
            r1.f161bg = r0
            r0 = -1
            r1.textColor = r0
            return r1
    }

    /* renamed from: lambda$show$0$com-usidqw-qwerklj-Utils-ToastPlus, reason: not valid java name */
    /* synthetic */ void m172lambda$show$0$comusidqwqwerkljUtilsToastPlus(java.lang.String r5) {
            r4 = this;
            boolean r0 = r4.isSync
            if (r0 == 0) goto Lb
            android.widget.Toast r0 = com.usidqw.qwerklj.Utils.ToastPlus.staticToast
            if (r0 == 0) goto Lb
            r0.cancel()
        Lb:
            android.widget.Toast r0 = r4.toast
            if (r0 == 0) goto L12
            r0.cancel()
        L12:
            android.app.Activity r0 = r4.activity
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[PlusNE]"
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            int r3 = r4.duration
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r3)
            r4.toast = r0
            com.usidqw.qwerklj.Utils.ToastPlus.staticToast = r0
            android.widget.TextView r0 = new android.widget.TextView
            android.app.Activity r1 = r4.activity
            r0.<init>(r1)
            r1 = 1111111111(0x423a35c7, float:46.552517)
            r0.setId(r1)
            r1 = 17
            r0.setGravity(r1)
            r1 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.setText(r5)
            android.app.Activity r5 = r4.activity
            r1 = 1092616192(0x41200000, float:10.0)
            int r5 = com.usidqw.qwerklj.Utils.Tools.dip2px(r5, r1)
            android.app.Activity r2 = r4.activity
            int r1 = com.usidqw.qwerklj.Utils.Tools.dip2px(r2, r1)
            r2 = 60
            r0.setPadding(r2, r5, r2, r1)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            android.app.Activity r1 = r4.activity
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r2 = 1
            r3 = 1077936128(0x40400000, float:3.0)
            float r1 = android.util.TypedValue.applyDimension(r2, r3, r1)
            r0.setZ(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.defaultFromStyle(r2)
            r0.setTypeface(r1)
            int r1 = r4.f161bg
            r5.setColor(r1)
            int r1 = r4.textColor
            r0.setTextColor(r1)
            float r1 = r4.radius
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L9f
            r1 = 1120403456(0x42c80000, float:100.0)
            r5.setCornerRadius(r1)
            goto La2
        L9f:
            r5.setCornerRadius(r1)
        La2:
            r0.setBackground(r5)
            android.widget.Toast r5 = r4.toast
            r5.setView(r0)
            int r5 = r4.gravity
            r0 = 48
            r1 = 0
            if (r5 == r0) goto Lba
            r0 = 80
            if (r5 == r0) goto Lb7
            r0 = r1
            goto Lbc
        Lb7:
            r0 = 200(0xc8, float:2.8E-43)
            goto Lbc
        Lba:
            r0 = 100
        Lbc:
            android.widget.Toast r2 = r4.toast
            r2.setGravity(r5, r1, r0)
            android.widget.Toast r5 = r4.toast
            r5.show()
            return
    }

    public com.usidqw.qwerklj.Utils.ToastPlus setColor(int r2) {
            r1 = this;
            r0 = -1
            com.usidqw.qwerklj.Utils.ToastPlus r2 = r1.setColor(r2, r0)
            return r2
    }

    public com.usidqw.qwerklj.Utils.ToastPlus setColor(int r1, int r2) {
            r0 = this;
            r0.f161bg = r1
            r0.textColor = r2
            return r0
    }

    public com.usidqw.qwerklj.Utils.ToastPlus setDuration(int r1) {
            r0 = this;
            r0.duration = r1
            return r0
    }

    public com.usidqw.qwerklj.Utils.ToastPlus setGravity(int r1) {
            r0 = this;
            r0.gravity = r1
            return r0
    }

    public com.usidqw.qwerklj.Utils.ToastPlus setRadius(float r1) {
            r0 = this;
            r0.radius = r1
            return r0
    }

    public com.usidqw.qwerklj.Utils.ToastPlus setSync() {
            r1 = this;
            r0 = 1
            r1.setSync(r0)
            return r1
    }

    public com.usidqw.qwerklj.Utils.ToastPlus setSync(boolean r1) {
            r0 = this;
            r0.isSync = r1
            return r0
    }

    public android.widget.Toast show(java.lang.Object r2) {
            r1 = this;
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r2 = r0.toJson(r2)
            android.widget.Toast r2 = r1.show(r2)
            return r2
    }

    public synchronized android.widget.Toast show(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            android.app.Activity r0 = r2.activity     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L8
            monitor-exit(r2)
            r3 = 0
            return r3
        L8:
            com.usidqw.qwerklj.Utils.ToastPlus$$ExternalSyntheticLambda0 r1 = new com.usidqw.qwerklj.Utils.ToastPlus$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L14
            r0.runOnUiThread(r1)     // Catch: java.lang.Throwable -> L14
            android.widget.Toast r3 = r2.toast     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return r3
        L14:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public com.usidqw.qwerklj.Utils.ToastPlus success() {
            r1 = this;
            java.lang.String r0 = "#38B549"
            int r0 = android.graphics.Color.parseColor(r0)
            r1.f161bg = r0
            r0 = -1
            r1.textColor = r0
            return r1
    }
}
