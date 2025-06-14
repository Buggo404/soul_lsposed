package com.usidqw.qwerklj.Json;

/* loaded from: classes.dex */
public class DialogListEdit implements java.io.Serializable {
    private java.lang.String key;
    private java.lang.String value;

    public DialogListEdit(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            r0.value = r2
            return
    }

    protected boolean canEqual(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.usidqw.qwerklj.Json.DialogListEdit
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.usidqw.qwerklj.Json.DialogListEdit
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.usidqw.qwerklj.Json.DialogListEdit r5 = (com.usidqw.qwerklj.Json.DialogListEdit) r5
            boolean r1 = r5.canEqual(r4)
            if (r1 != 0) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.getKey()
            java.lang.String r3 = r5.getKey()
            if (r1 != 0) goto L20
            if (r3 == 0) goto L27
            goto L26
        L20:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L27
        L26:
            return r2
        L27:
            java.lang.String r1 = r4.getValue()
            java.lang.String r5 = r5.getValue()
            if (r1 != 0) goto L34
            if (r5 == 0) goto L3b
            goto L3a
        L34:
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L3b
        L3a:
            return r2
        L3b:
            return r0
    }

    public java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    public java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.getKey()
            r1 = 43
            if (r0 != 0) goto La
            r0 = r1
            goto Le
        La:
            int r0 = r0.hashCode()
        Le:
            r2 = 59
            int r0 = r0 + r2
            java.lang.String r3 = r4.getValue()
            int r0 = r0 * r2
            if (r3 != 0) goto L19
            goto L1d
        L19:
            int r1 = r3.hashCode()
        L1d:
            int r0 = r0 + r1
            return r0
    }

    public void setKey(java.lang.String r1) {
            r0 = this;
            r0.key = r1
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
            java.lang.String r1 = "DialogListEdit(key="
            r0.<init>(r1)
            java.lang.String r1 = r2.getKey()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", value="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getValue()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
