package com.usidqw.qwerklj.Json;

/* loaded from: classes.dex */
public class DialogListItem implements java.io.Serializable {
    private java.lang.String desc;
    private boolean isSwitch;
    private java.lang.String key;
    private boolean selected;
    private java.lang.String title;

    public DialogListItem() {
            r0 = this;
            r0.<init>()
            return
    }

    protected boolean canEqual(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.usidqw.qwerklj.Json.DialogListItem
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.usidqw.qwerklj.Json.DialogListItem
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.usidqw.qwerklj.Json.DialogListItem r5 = (com.usidqw.qwerklj.Json.DialogListItem) r5
            boolean r1 = r5.canEqual(r4)
            if (r1 != 0) goto L13
            return r2
        L13:
            boolean r1 = r4.isSwitch()
            boolean r3 = r5.isSwitch()
            if (r1 == r3) goto L1e
            return r2
        L1e:
            boolean r1 = r4.isSelected()
            boolean r3 = r5.isSelected()
            if (r1 == r3) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.getKey()
            java.lang.String r3 = r5.getKey()
            if (r1 != 0) goto L36
            if (r3 == 0) goto L3d
            goto L3c
        L36:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3d
        L3c:
            return r2
        L3d:
            java.lang.String r1 = r4.getTitle()
            java.lang.String r3 = r5.getTitle()
            if (r1 != 0) goto L4a
            if (r3 == 0) goto L51
            goto L50
        L4a:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L51
        L50:
            return r2
        L51:
            java.lang.String r1 = r4.getDesc()
            java.lang.String r5 = r5.getDesc()
            if (r1 != 0) goto L5e
            if (r5 == 0) goto L65
            goto L64
        L5e:
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L65
        L64:
            return r2
        L65:
            return r0
    }

    public java.lang.String getDesc() {
            r1 = this;
            java.lang.String r0 = r1.desc
            return r0
    }

    public java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public int hashCode() {
            r5 = this;
            boolean r0 = r5.isSwitch()
            r1 = 79
            r2 = 97
            if (r0 == 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r3 = 59
            int r0 = r0 + r3
            int r0 = r0 * r3
            boolean r4 = r5.isSelected()
            if (r4 == 0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            int r0 = r0 + r1
            java.lang.String r1 = r5.getKey()
            int r0 = r0 * r3
            r2 = 43
            if (r1 != 0) goto L25
            r1 = r2
            goto L29
        L25:
            int r1 = r1.hashCode()
        L29:
            int r0 = r0 + r1
            java.lang.String r1 = r5.getTitle()
            int r0 = r0 * r3
            if (r1 != 0) goto L33
            r1 = r2
            goto L37
        L33:
            int r1 = r1.hashCode()
        L37:
            int r0 = r0 + r1
            java.lang.String r1 = r5.getDesc()
            int r0 = r0 * r3
            if (r1 != 0) goto L40
            goto L44
        L40:
            int r2 = r1.hashCode()
        L44:
            int r0 = r0 + r2
            return r0
    }

    public boolean isSelected() {
            r1 = this;
            boolean r0 = r1.selected
            return r0
    }

    public boolean isSwitch() {
            r1 = this;
            boolean r0 = r1.isSwitch
            return r0
    }

    public void setDesc(java.lang.String r1) {
            r0 = this;
            r0.desc = r1
            return
    }

    public void setKey(java.lang.String r1) {
            r0 = this;
            r0.key = r1
            return
    }

    public void setSelected(boolean r1) {
            r0 = this;
            r0.selected = r1
            return
    }

    public void setSwitch(boolean r1) {
            r0 = this;
            r0.isSwitch = r1
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
            java.lang.String r1 = "DialogListItem(key="
            r0.<init>(r1)
            java.lang.String r1 = r2.getKey()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", title="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getTitle()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", desc="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getDesc()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", isSwitch="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.isSwitch()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", selected="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.isSelected()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
