package com.usidqw.qwerklj.Json;

/* loaded from: classes.dex */
public class JsonHookSettingList implements java.io.Serializable {
    private long AppVersion;
    private java.lang.String app;
    private java.util.List<com.usidqw.qwerklj.Json.JsonHookSettingList.DataBean> data;
    private java.util.List<com.usidqw.qwerklj.Json.JsonHookSettingList.GroupBean> group;
    private int toDay;
    private long version;

    public static class DataBean implements java.io.Serializable {
        private java.lang.String desc;
        private java.lang.String edittitle;
        private java.lang.String group;
        private java.lang.String help;
        private int inputType;
        private java.lang.String itemvalue;
        private java.lang.String key;
        private int level;
        private long limitVersion;
        private int restart;
        private java.lang.String title;
        private int type;
        private java.lang.String value;
        private int version;
        private int vipType;

        public DataBean() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.inputType = r0
                return
        }

        protected boolean canEqual(java.lang.Object r1) {
                r0 = this;
                boolean r1 = r1 instanceof com.usidqw.qwerklj.Json.JsonHookSettingList.DataBean
                return r1
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r8 != r7) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.usidqw.qwerklj.Json.JsonHookSettingList.DataBean
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.usidqw.qwerklj.Json.JsonHookSettingList$DataBean r8 = (com.usidqw.qwerklj.Json.JsonHookSettingList.DataBean) r8
                boolean r1 = r8.canEqual(r7)
                if (r1 != 0) goto L13
                return r2
            L13:
                int r1 = r7.getType()
                int r3 = r8.getType()
                if (r1 == r3) goto L1e
                return r2
            L1e:
                int r1 = r7.getLevel()
                int r3 = r8.getLevel()
                if (r1 == r3) goto L29
                return r2
            L29:
                int r1 = r7.getVipType()
                int r3 = r8.getVipType()
                if (r1 == r3) goto L34
                return r2
            L34:
                int r1 = r7.getInputType()
                int r3 = r8.getInputType()
                if (r1 == r3) goto L3f
                return r2
            L3f:
                int r1 = r7.getRestart()
                int r3 = r8.getRestart()
                if (r1 == r3) goto L4a
                return r2
            L4a:
                long r3 = r7.getLimitVersion()
                long r5 = r8.getLimitVersion()
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 == 0) goto L57
                return r2
            L57:
                int r1 = r7.getVersion()
                int r3 = r8.getVersion()
                if (r1 == r3) goto L62
                return r2
            L62:
                java.lang.String r1 = r7.getTitle()
                java.lang.String r3 = r8.getTitle()
                if (r1 != 0) goto L6f
                if (r3 == 0) goto L76
                goto L75
            L6f:
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L76
            L75:
                return r2
            L76:
                java.lang.String r1 = r7.getDesc()
                java.lang.String r3 = r8.getDesc()
                if (r1 != 0) goto L83
                if (r3 == 0) goto L8a
                goto L89
            L83:
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L8a
            L89:
                return r2
            L8a:
                java.lang.String r1 = r7.getHelp()
                java.lang.String r3 = r8.getHelp()
                if (r1 != 0) goto L97
                if (r3 == 0) goto L9e
                goto L9d
            L97:
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L9e
            L9d:
                return r2
            L9e:
                java.lang.String r1 = r7.getKey()
                java.lang.String r3 = r8.getKey()
                if (r1 != 0) goto Lab
                if (r3 == 0) goto Lb2
                goto Lb1
            Lab:
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto Lb2
            Lb1:
                return r2
            Lb2:
                java.lang.String r1 = r7.getValue()
                java.lang.String r3 = r8.getValue()
                if (r1 != 0) goto Lbf
                if (r3 == 0) goto Lc6
                goto Lc5
            Lbf:
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto Lc6
            Lc5:
                return r2
            Lc6:
                java.lang.String r1 = r7.getEdittitle()
                java.lang.String r3 = r8.getEdittitle()
                if (r1 != 0) goto Ld3
                if (r3 == 0) goto Lda
                goto Ld9
            Ld3:
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto Lda
            Ld9:
                return r2
            Lda:
                java.lang.String r1 = r7.getGroup()
                java.lang.String r3 = r8.getGroup()
                if (r1 != 0) goto Le7
                if (r3 == 0) goto Lee
                goto Led
            Le7:
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto Lee
            Led:
                return r2
            Lee:
                java.lang.String r1 = r7.getItemvalue()
                java.lang.String r8 = r8.getItemvalue()
                if (r1 != 0) goto Lfb
                if (r8 == 0) goto L102
                goto L101
            Lfb:
                boolean r8 = r1.equals(r8)
                if (r8 != 0) goto L102
            L101:
                return r2
            L102:
                return r0
        }

        public java.lang.String getDesc() {
                r1 = this;
                java.lang.String r0 = r1.desc
                return r0
        }

        public java.lang.String getEdittitle() {
                r1 = this;
                java.lang.String r0 = r1.edittitle
                return r0
        }

        public java.lang.String getGroup() {
                r1 = this;
                java.lang.String r0 = r1.group
                return r0
        }

        public java.lang.String getHelp() {
                r1 = this;
                java.lang.String r0 = r1.help
                return r0
        }

        public int getInputType() {
                r1 = this;
                int r0 = r1.inputType
                return r0
        }

        public java.lang.String getItemvalue() {
                r1 = this;
                java.lang.String r0 = r1.itemvalue
                return r0
        }

        public java.lang.String getKey() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        public int getLevel() {
                r1 = this;
                int r0 = r1.level
                return r0
        }

        public long getLimitVersion() {
                r2 = this;
                long r0 = r2.limitVersion
                return r0
        }

        public int getRestart() {
                r1 = this;
                int r0 = r1.restart
                return r0
        }

        public java.lang.String getTitle() {
                r1 = this;
                java.lang.String r0 = r1.title
                return r0
        }

        public int getType() {
                r1 = this;
                int r0 = r1.type
                return r0
        }

        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }

        public int getVersion() {
                r1 = this;
                int r0 = r1.version
                return r0
        }

        public int getVipType() {
                r1 = this;
                int r0 = r1.vipType
                return r0
        }

        public int hashCode() {
                r6 = this;
                int r0 = r6.getType()
                r1 = 59
                int r0 = r0 + r1
                int r0 = r0 * r1
                int r2 = r6.getLevel()
                int r0 = r0 + r2
                int r0 = r0 * r1
                int r2 = r6.getVipType()
                int r0 = r0 + r2
                int r0 = r0 * r1
                int r2 = r6.getInputType()
                int r0 = r0 + r2
                int r0 = r0 * r1
                int r2 = r6.getRestart()
                int r0 = r0 + r2
                long r2 = r6.getLimitVersion()
                int r0 = r0 * r1
                r4 = 32
                long r4 = r2 >>> r4
                long r2 = r2 ^ r4
                int r2 = (int) r2
                int r0 = r0 + r2
                int r0 = r0 * r1
                int r2 = r6.getVersion()
                int r0 = r0 + r2
                java.lang.String r2 = r6.getTitle()
                int r0 = r0 * r1
                r3 = 43
                if (r2 != 0) goto L3c
                r2 = r3
                goto L40
            L3c:
                int r2 = r2.hashCode()
            L40:
                int r0 = r0 + r2
                java.lang.String r2 = r6.getDesc()
                int r0 = r0 * r1
                if (r2 != 0) goto L4a
                r2 = r3
                goto L4e
            L4a:
                int r2 = r2.hashCode()
            L4e:
                int r0 = r0 + r2
                java.lang.String r2 = r6.getHelp()
                int r0 = r0 * r1
                if (r2 != 0) goto L58
                r2 = r3
                goto L5c
            L58:
                int r2 = r2.hashCode()
            L5c:
                int r0 = r0 + r2
                java.lang.String r2 = r6.getKey()
                int r0 = r0 * r1
                if (r2 != 0) goto L66
                r2 = r3
                goto L6a
            L66:
                int r2 = r2.hashCode()
            L6a:
                int r0 = r0 + r2
                java.lang.String r2 = r6.getValue()
                int r0 = r0 * r1
                if (r2 != 0) goto L74
                r2 = r3
                goto L78
            L74:
                int r2 = r2.hashCode()
            L78:
                int r0 = r0 + r2
                java.lang.String r2 = r6.getEdittitle()
                int r0 = r0 * r1
                if (r2 != 0) goto L82
                r2 = r3
                goto L86
            L82:
                int r2 = r2.hashCode()
            L86:
                int r0 = r0 + r2
                java.lang.String r2 = r6.getGroup()
                int r0 = r0 * r1
                if (r2 != 0) goto L90
                r2 = r3
                goto L94
            L90:
                int r2 = r2.hashCode()
            L94:
                int r0 = r0 + r2
                java.lang.String r2 = r6.getItemvalue()
                int r0 = r0 * r1
                if (r2 != 0) goto L9d
                goto La1
            L9d:
                int r3 = r2.hashCode()
            La1:
                int r0 = r0 + r3
                return r0
        }

        public void setDesc(java.lang.String r1) {
                r0 = this;
                r0.desc = r1
                return
        }

        public void setEdittitle(java.lang.String r1) {
                r0 = this;
                r0.edittitle = r1
                return
        }

        public void setGroup(java.lang.String r1) {
                r0 = this;
                r0.group = r1
                return
        }

        public void setHelp(java.lang.String r1) {
                r0 = this;
                r0.help = r1
                return
        }

        public void setInputType(int r1) {
                r0 = this;
                r0.inputType = r1
                return
        }

        public void setItemvalue(java.lang.String r1) {
                r0 = this;
                r0.itemvalue = r1
                return
        }

        public void setKey(java.lang.String r1) {
                r0 = this;
                r0.key = r1
                return
        }

        public void setLevel(int r1) {
                r0 = this;
                r0.level = r1
                return
        }

        public void setLimitVersion(long r1) {
                r0 = this;
                r0.limitVersion = r1
                return
        }

        public void setRestart(int r1) {
                r0 = this;
                r0.restart = r1
                return
        }

        public void setTitle(java.lang.String r1) {
                r0 = this;
                r0.title = r1
                return
        }

        public void setType(int r1) {
                r0 = this;
                r0.type = r1
                return
        }

        public void setValue(java.lang.String r1) {
                r0 = this;
                r0.value = r1
                return
        }

        public void setVersion(int r1) {
                r0 = this;
                r0.version = r1
                return
        }

        public void setVipType(int r1) {
                r0 = this;
                r0.vipType = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "JsonHookSettingList.DataBean(title="
                r0.<init>(r1)
                java.lang.String r1 = r3.getTitle()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", desc="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r3.getDesc()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", help="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r3.getHelp()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", key="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r3.getKey()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", value="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r3.getValue()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", edittitle="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r3.getEdittitle()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", type="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r3.getType()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", level="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r3.getLevel()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", group="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r3.getGroup()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", itemvalue="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r3.getItemvalue()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", vipType="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r3.getVipType()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", inputType="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r3.getInputType()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", restart="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r3.getRestart()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", limitVersion="
                java.lang.StringBuilder r0 = r0.append(r1)
                long r1 = r3.getLimitVersion()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", version="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r3.getVersion()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class GroupBean implements java.io.Serializable {
        private java.lang.String key;
        private java.lang.String title;

        public GroupBean() {
                r0 = this;
                r0.<init>()
                return
        }

        protected boolean canEqual(java.lang.Object r1) {
                r0 = this;
                boolean r1 = r1 instanceof com.usidqw.qwerklj.Json.JsonHookSettingList.GroupBean
                return r1
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.usidqw.qwerklj.Json.JsonHookSettingList.GroupBean
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.usidqw.qwerklj.Json.JsonHookSettingList$GroupBean r5 = (com.usidqw.qwerklj.Json.JsonHookSettingList.GroupBean) r5
                boolean r1 = r5.canEqual(r4)
                if (r1 != 0) goto L13
                return r2
            L13:
                java.lang.String r1 = r4.getTitle()
                java.lang.String r3 = r5.getTitle()
                if (r1 != 0) goto L20
                if (r3 == 0) goto L27
                goto L26
            L20:
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L27
            L26:
                return r2
            L27:
                java.lang.String r1 = r4.getKey()
                java.lang.String r5 = r5.getKey()
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

        public java.lang.String getTitle() {
                r1 = this;
                java.lang.String r0 = r1.title
                return r0
        }

        public int hashCode() {
                r4 = this;
                java.lang.String r0 = r4.getTitle()
                r1 = 43
                if (r0 != 0) goto La
                r0 = r1
                goto Le
            La:
                int r0 = r0.hashCode()
            Le:
                r2 = 59
                int r0 = r0 + r2
                java.lang.String r3 = r4.getKey()
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

        public void setTitle(java.lang.String r1) {
                r0 = this;
                r0.title = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "JsonHookSettingList.GroupBean(title="
                r0.<init>(r1)
                java.lang.String r1 = r2.getTitle()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", key="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r2.getKey()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public JsonHookSettingList() {
            r0 = this;
            r0.<init>()
            return
    }

    protected boolean canEqual(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.usidqw.qwerklj.Json.JsonHookSettingList
            return r1
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.usidqw.qwerklj.Json.JsonHookSettingList
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.usidqw.qwerklj.Json.JsonHookSettingList r8 = (com.usidqw.qwerklj.Json.JsonHookSettingList) r8
            boolean r1 = r8.canEqual(r7)
            if (r1 != 0) goto L13
            return r2
        L13:
            int r1 = r7.getToDay()
            int r3 = r8.getToDay()
            if (r1 == r3) goto L1e
            return r2
        L1e:
            long r3 = r7.getVersion()
            long r5 = r8.getVersion()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2b
            return r2
        L2b:
            long r3 = r7.getAppVersion()
            long r5 = r8.getAppVersion()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r7.getApp()
            java.lang.String r3 = r8.getApp()
            if (r1 != 0) goto L45
            if (r3 == 0) goto L4c
            goto L4b
        L45:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4c
        L4b:
            return r2
        L4c:
            java.util.List r1 = r7.getData()
            java.util.List r3 = r8.getData()
            if (r1 != 0) goto L59
            if (r3 == 0) goto L60
            goto L5f
        L59:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L60
        L5f:
            return r2
        L60:
            java.util.List r1 = r7.getGroup()
            java.util.List r8 = r8.getGroup()
            if (r1 != 0) goto L6d
            if (r8 == 0) goto L74
            goto L73
        L6d:
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L74
        L73:
            return r2
        L74:
            return r0
    }

    public java.lang.String getApp() {
            r1 = this;
            java.lang.String r0 = r1.app
            return r0
    }

    public long getAppVersion() {
            r2 = this;
            long r0 = r2.AppVersion
            return r0
    }

    public java.util.List<com.usidqw.qwerklj.Json.JsonHookSettingList.DataBean> getData() {
            r1 = this;
            java.util.List<com.usidqw.qwerklj.Json.JsonHookSettingList$DataBean> r0 = r1.data
            return r0
    }

    public java.util.List<com.usidqw.qwerklj.Json.JsonHookSettingList.GroupBean> getGroup() {
            r1 = this;
            java.util.List<com.usidqw.qwerklj.Json.JsonHookSettingList$GroupBean> r0 = r1.group
            return r0
    }

    public int getToDay() {
            r1 = this;
            int r0 = r1.toDay
            return r0
    }

    public long getVersion() {
            r2 = this;
            long r0 = r2.version
            return r0
    }

    public int hashCode() {
            r7 = this;
            int r0 = r7.getToDay()
            r1 = 59
            int r0 = r0 + r1
            long r2 = r7.getVersion()
            int r0 = r0 * r1
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r2 = (int) r2
            int r0 = r0 + r2
            long r2 = r7.getAppVersion()
            int r0 = r0 * r1
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            int r2 = (int) r2
            int r0 = r0 + r2
            java.lang.String r2 = r7.getApp()
            int r0 = r0 * r1
            r3 = 43
            if (r2 != 0) goto L28
            r2 = r3
            goto L2c
        L28:
            int r2 = r2.hashCode()
        L2c:
            int r0 = r0 + r2
            java.util.List r2 = r7.getData()
            int r0 = r0 * r1
            if (r2 != 0) goto L36
            r2 = r3
            goto L3a
        L36:
            int r2 = r2.hashCode()
        L3a:
            int r0 = r0 + r2
            java.util.List r2 = r7.getGroup()
            int r0 = r0 * r1
            if (r2 != 0) goto L43
            goto L47
        L43:
            int r3 = r2.hashCode()
        L47:
            int r0 = r0 + r3
            return r0
    }

    public void setApp(java.lang.String r1) {
            r0 = this;
            r0.app = r1
            return
    }

    public void setAppVersion(long r1) {
            r0 = this;
            r0.AppVersion = r1
            return
    }

    public void setData(java.util.List<com.usidqw.qwerklj.Json.JsonHookSettingList.DataBean> r1) {
            r0 = this;
            r0.data = r1
            return
    }

    public void setGroup(java.util.List<com.usidqw.qwerklj.Json.JsonHookSettingList.GroupBean> r1) {
            r0 = this;
            r0.group = r1
            return
    }

    public void setToDay(int r1) {
            r0 = this;
            r0.toDay = r1
            return
    }

    public void setVersion(long r1) {
            r0 = this;
            r0.version = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "JsonHookSettingList(app="
            r0.<init>(r1)
            java.lang.String r1 = r3.getApp()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", data="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List r1 = r3.getData()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", group="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List r1 = r3.getGroup()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", toDay="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.getToDay()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", version="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.getVersion()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", AppVersion="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.getAppVersion()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
