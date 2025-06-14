package com.usidqw.qwerklj.GreenDao.dao;

/* loaded from: classes.dex */
public class ConfigDao extends org.greenrobot.greendao.AbstractDao<com.usidqw.qwerklj.GreenDao.p001db.Config, java.lang.Long> {
    public static final java.lang.String TABLENAME = "CONFIG";

    public static class Properties {

        /* renamed from: Id */
        public static final org.greenrobot.greendao.Property f130Id = null;
        public static final org.greenrobot.greendao.Property Key = null;
        public static final org.greenrobot.greendao.Property Type = null;
        public static final org.greenrobot.greendao.Property Value = null;

        static {
                org.greenrobot.greendao.Property r6 = new org.greenrobot.greendao.Property
                r1 = 0
                java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
                java.lang.String r3 = "id"
                r4 = 1
                java.lang.String r5 = "_id"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.f130Id = r6
                org.greenrobot.greendao.Property r0 = new org.greenrobot.greendao.Property
                r8 = 1
                java.lang.Class<java.lang.String> r9 = java.lang.String.class
                java.lang.String r10 = "key"
                r11 = 0
                java.lang.String r12 = "KEY"
                r7 = r0
                r7.<init>(r8, r9, r10, r11, r12)
                com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.Key = r0
                org.greenrobot.greendao.Property r0 = new org.greenrobot.greendao.Property
                r2 = 2
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                java.lang.String r4 = "value"
                r5 = 0
                java.lang.String r6 = "VALUE"
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.Value = r0
                org.greenrobot.greendao.Property r0 = new org.greenrobot.greendao.Property
                r8 = 3
                java.lang.Class<java.lang.String> r9 = java.lang.String.class
                java.lang.String r10 = "type"
                java.lang.String r12 = "TYPE"
                r7 = r0
                r7.<init>(r8, r9, r10, r11, r12)
                com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.Type = r0
                return
        }

        public Properties() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ConfigDao(org.greenrobot.greendao.internal.DaoConfig r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ConfigDao(org.greenrobot.greendao.internal.DaoConfig r1, com.usidqw.qwerklj.GreenDao.dao.DaoSession r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static void createTable(org.greenrobot.greendao.database.Database r2, boolean r3) {
            if (r3 == 0) goto L5
            java.lang.String r3 = "IF NOT EXISTS "
            goto L7
        L5:
            java.lang.String r3 = ""
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CREATE TABLE "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "\"CONFIG\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"KEY\" TEXT,\"VALUE\" TEXT,\"TYPE\" TEXT);"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.execSQL(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CREATE INDEX "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "idKey ON \"CONFIG\" (\"KEY\" ASC);"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.execSQL(r3)
            return
    }

    public static void dropTable(org.greenrobot.greendao.database.Database r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DROP TABLE "
            r0.<init>(r1)
            if (r3 == 0) goto Lc
            java.lang.String r3 = "IF EXISTS "
            goto Le
        Lc:
            java.lang.String r3 = ""
        Le:
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\"CONFIG\""
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.execSQL(r3)
            return
    }

    /* renamed from: bindValues, reason: avoid collision after fix types in other method */
    protected final void bindValues2(android.database.sqlite.SQLiteStatement r5, com.usidqw.qwerklj.GreenDao.p001db.Config r6) {
            r4 = this;
            r5.clearBindings()
            java.lang.Long r0 = r6.getId()
            if (r0 == 0) goto L11
            r1 = 1
            long r2 = r0.longValue()
            r5.bindLong(r1, r2)
        L11:
            java.lang.String r0 = r6.getKey()
            if (r0 == 0) goto L1b
            r1 = 2
            r5.bindString(r1, r0)
        L1b:
            java.lang.String r0 = r6.getValue()
            if (r0 == 0) goto L25
            r1 = 3
            r5.bindString(r1, r0)
        L25:
            java.lang.String r6 = r6.getType()
            if (r6 == 0) goto L2f
            r0 = 4
            r5.bindString(r0, r6)
        L2f:
            return
    }

    @Override // org.greenrobot.greendao.AbstractDao
    protected /* bridge */ /* synthetic */ void bindValues(android.database.sqlite.SQLiteStatement r1, com.usidqw.qwerklj.GreenDao.p001db.Config r2) {
            r0 = this;
            com.usidqw.qwerklj.GreenDao.db.Config r2 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r2
            r0.bindValues2(r1, r2)
            return
    }

    /* renamed from: bindValues, reason: avoid collision after fix types in other method */
    protected final void bindValues2(org.greenrobot.greendao.database.DatabaseStatement r5, com.usidqw.qwerklj.GreenDao.p001db.Config r6) {
            r4 = this;
            r5.clearBindings()
            java.lang.Long r0 = r6.getId()
            if (r0 == 0) goto L11
            r1 = 1
            long r2 = r0.longValue()
            r5.bindLong(r1, r2)
        L11:
            java.lang.String r0 = r6.getKey()
            if (r0 == 0) goto L1b
            r1 = 2
            r5.bindString(r1, r0)
        L1b:
            java.lang.String r0 = r6.getValue()
            if (r0 == 0) goto L25
            r1 = 3
            r5.bindString(r1, r0)
        L25:
            java.lang.String r6 = r6.getType()
            if (r6 == 0) goto L2f
            r0 = 4
            r5.bindString(r0, r6)
        L2f:
            return
    }

    @Override // org.greenrobot.greendao.AbstractDao
    protected /* bridge */ /* synthetic */ void bindValues(org.greenrobot.greendao.database.DatabaseStatement r1, com.usidqw.qwerklj.GreenDao.p001db.Config r2) {
            r0 = this;
            com.usidqw.qwerklj.GreenDao.db.Config r2 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r2
            r0.bindValues2(r1, r2)
            return
    }

    /* renamed from: getKey, reason: avoid collision after fix types in other method */
    public java.lang.Long getKey2(com.usidqw.qwerklj.GreenDao.p001db.Config r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.lang.Long r1 = r1.getId()
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public /* bridge */ /* synthetic */ java.lang.Long getKey(com.usidqw.qwerklj.GreenDao.p001db.Config r1) {
            r0 = this;
            com.usidqw.qwerklj.GreenDao.db.Config r1 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r1
            java.lang.Long r1 = r0.getKey2(r1)
            return r1
    }

    /* renamed from: hasKey, reason: avoid collision after fix types in other method */
    public boolean hasKey2(com.usidqw.qwerklj.GreenDao.p001db.Config r1) {
            r0 = this;
            java.lang.Long r1 = r1.getId()
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public /* bridge */ /* synthetic */ boolean hasKey(com.usidqw.qwerklj.GreenDao.p001db.Config r1) {
            r0 = this;
            com.usidqw.qwerklj.GreenDao.db.Config r1 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r1
            boolean r1 = r0.hasKey2(r1)
            return r1
    }

    @Override // org.greenrobot.greendao.AbstractDao
    protected final boolean isEntityUpdateable() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public com.usidqw.qwerklj.GreenDao.p001db.Config readEntity(android.database.Cursor r7, int r8) {
            r6 = this;
            com.usidqw.qwerklj.GreenDao.db.Config r0 = new com.usidqw.qwerklj.GreenDao.db.Config
            int r1 = r8 + 0
            boolean r2 = r7.isNull(r1)
            r3 = 0
            if (r2 == 0) goto Ld
            r1 = r3
            goto L15
        Ld:
            long r1 = r7.getLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L15:
            int r2 = r8 + 1
            boolean r4 = r7.isNull(r2)
            if (r4 == 0) goto L1f
            r2 = r3
            goto L23
        L1f:
            java.lang.String r2 = r7.getString(r2)
        L23:
            int r4 = r8 + 2
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L2d
            r4 = r3
            goto L31
        L2d:
            java.lang.String r4 = r7.getString(r4)
        L31:
            int r8 = r8 + 3
            boolean r5 = r7.isNull(r8)
            if (r5 == 0) goto L3a
            goto L3e
        L3a:
            java.lang.String r3 = r7.getString(r8)
        L3e:
            r0.<init>(r1, r2, r4, r3)
            return r0
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public /* bridge */ /* synthetic */ com.usidqw.qwerklj.GreenDao.p001db.Config readEntity(android.database.Cursor r1, int r2) {
            r0 = this;
            com.usidqw.qwerklj.GreenDao.db.Config r1 = r0.readEntity(r1, r2)
            return r1
    }

    /* renamed from: readEntity, reason: avoid collision after fix types in other method */
    public void readEntity2(android.database.Cursor r4, com.usidqw.qwerklj.GreenDao.p001db.Config r5, int r6) {
            r3 = this;
            int r0 = r6 + 0
            boolean r1 = r4.isNull(r0)
            r2 = 0
            if (r1 == 0) goto Lb
            r0 = r2
            goto L13
        Lb:
            long r0 = r4.getLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L13:
            r5.setId(r0)
            int r0 = r6 + 1
            boolean r1 = r4.isNull(r0)
            if (r1 == 0) goto L20
            r0 = r2
            goto L24
        L20:
            java.lang.String r0 = r4.getString(r0)
        L24:
            r5.setKey(r0)
            int r0 = r6 + 2
            boolean r1 = r4.isNull(r0)
            if (r1 == 0) goto L31
            r0 = r2
            goto L35
        L31:
            java.lang.String r0 = r4.getString(r0)
        L35:
            r5.setValue(r0)
            int r6 = r6 + 3
            boolean r0 = r4.isNull(r6)
            if (r0 == 0) goto L41
            goto L45
        L41:
            java.lang.String r2 = r4.getString(r6)
        L45:
            r5.setType(r2)
            return
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public /* bridge */ /* synthetic */ void readEntity(android.database.Cursor r1, com.usidqw.qwerklj.GreenDao.p001db.Config r2, int r3) {
            r0 = this;
            com.usidqw.qwerklj.GreenDao.db.Config r2 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r2
            r0.readEntity2(r1, r2, r3)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public java.lang.Long readKey(android.database.Cursor r2, int r3) {
            r1 = this;
            int r3 = r3 + 0
            boolean r0 = r2.isNull(r3)
            if (r0 == 0) goto La
            r2 = 0
            goto L12
        La:
            long r2 = r2.getLong(r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L12:
            return r2
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public /* bridge */ /* synthetic */ java.lang.Long readKey(android.database.Cursor r1, int r2) {
            r0 = this;
            java.lang.Long r1 = r0.readKey(r1, r2)
            return r1
    }

    /* renamed from: updateKeyAfterInsert, reason: avoid collision after fix types in other method */
    protected final java.lang.Long updateKeyAfterInsert2(com.usidqw.qwerklj.GreenDao.p001db.Config r2, long r3) {
            r1 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.setId(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            return r2
    }

    @Override // org.greenrobot.greendao.AbstractDao
    protected /* bridge */ /* synthetic */ java.lang.Long updateKeyAfterInsert(com.usidqw.qwerklj.GreenDao.p001db.Config r1, long r2) {
            r0 = this;
            com.usidqw.qwerklj.GreenDao.db.Config r1 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r1
            java.lang.Long r1 = r0.updateKeyAfterInsert2(r1, r2)
            return r1
    }
}
