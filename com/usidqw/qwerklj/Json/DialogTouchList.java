package com.usidqw.qwerklj.Json;

/* loaded from: classes.dex */
public class DialogTouchList implements java.io.Serializable {

    /* renamed from: id */
    int f136id;
    java.lang.String title;

    public DialogTouchList() {
            r0 = this;
            r0.<init>()
            return
    }

    protected boolean canEqual(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.usidqw.qwerklj.Json.DialogTouchList
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.usidqw.qwerklj.Json.DialogTouchList
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.usidqw.qwerklj.Json.DialogTouchList r5 = (com.usidqw.qwerklj.Json.DialogTouchList) r5
            boolean r1 = r5.canEqual(r4)
            if (r1 != 0) goto L13
            return r2
        L13:
            int r1 = r4.getId()
            int r3 = r5.getId()
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.getTitle()
            java.lang.String r5 = r5.getTitle()
            if (r1 != 0) goto L2b
            if (r5 == 0) goto L32
            goto L31
        L2b:
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L32
        L31:
            return r2
        L32:
            return r0
    }

    public int getId() {
            r1 = this;
            int r0 = r1.f136id
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.getId()
            r1 = 59
            int r0 = r0 + r1
            java.lang.String r2 = r3.getTitle()
            int r0 = r0 * r1
            if (r2 != 0) goto L11
            r1 = 43
            goto L15
        L11:
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            return r0
    }

    public void setId(int r1) {
            r0 = this;
            r0.f136id = r1
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.title = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DialogTouchList(title="
            r0.<init>(r1)
            java.lang.String r1 = r2.getTitle()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", id="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.getId()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
