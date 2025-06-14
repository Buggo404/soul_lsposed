package com.usidqw.qwerklj.Json;

/* loaded from: classes.dex */
public class HookSetItemValue implements java.io.Serializable {
    private java.lang.Object data;
    private int ico;
    private java.lang.String title;
    private java.lang.String value;

    public HookSetItemValue() {
            r0 = this;
            r0.<init>()
            return
    }

    protected boolean canEqual(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.usidqw.qwerklj.Json.HookSetItemValue
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.usidqw.qwerklj.Json.HookSetItemValue
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.usidqw.qwerklj.Json.HookSetItemValue r5 = (com.usidqw.qwerklj.Json.HookSetItemValue) r5
            boolean r1 = r5.canEqual(r4)
            if (r1 != 0) goto L13
            return r2
        L13:
            int r1 = r4.getIco()
            int r3 = r5.getIco()
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.getTitle()
            java.lang.String r3 = r5.getTitle()
            if (r1 != 0) goto L2b
            if (r3 == 0) goto L32
            goto L31
        L2b:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L32
        L31:
            return r2
        L32:
            java.lang.String r1 = r4.getValue()
            java.lang.String r3 = r5.getValue()
            if (r1 != 0) goto L3f
            if (r3 == 0) goto L46
            goto L45
        L3f:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L46
        L45:
            return r2
        L46:
            java.lang.Object r1 = r4.getData()
            java.lang.Object r5 = r5.getData()
            if (r1 != 0) goto L53
            if (r5 == 0) goto L5a
            goto L59
        L53:
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L5a
        L59:
            return r2
        L5a:
            return r0
    }

    public java.lang.Object getData() {
            r1 = this;
            java.lang.Object r0 = r1.data
            return r0
    }

    public int getIco() {
            r1 = this;
            int r0 = r1.ico
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    public int hashCode() {
            r4 = this;
            int r0 = r4.getIco()
            r1 = 59
            int r0 = r0 + r1
            java.lang.String r2 = r4.getTitle()
            int r0 = r0 * r1
            r3 = 43
            if (r2 != 0) goto L12
            r2 = r3
            goto L16
        L12:
            int r2 = r2.hashCode()
        L16:
            int r0 = r0 + r2
            java.lang.String r2 = r4.getValue()
            int r0 = r0 * r1
            if (r2 != 0) goto L20
            r2 = r3
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            java.lang.Object r2 = r4.getData()
            int r0 = r0 * r1
            if (r2 != 0) goto L2d
            goto L31
        L2d:
            int r3 = r2.hashCode()
        L31:
            int r0 = r0 + r3
            return r0
    }

    public void setData(java.lang.Object r1) {
            r0 = this;
            r0.data = r1
            return
    }

    public void setIco(int r1) {
            r0 = this;
            r0.ico = r1
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.title = r1
            return
    }

    public void setValue(java.lang.String r1) {
            r0 = this;
            r0.value = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HookSetItemValue(title="
            r0.<init>(r1)
            java.lang.String r1 = r2.getTitle()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", ico="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.getIco()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", value="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getValue()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", data="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.getData()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
