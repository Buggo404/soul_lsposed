package com.usidqw.qwerklj.Base;

/* loaded from: classes.dex */
public abstract class Base extends com.usidqw.qwerklj.Tools.Static {
    public Base() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void delRecord(java.lang.String r4, int r5) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            com.usidqw.qwerklj.GreenDao.dao.RecordLogDao r0 = r0.getRecordLogDao()
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.queryBuilder()
            org.greenrobot.greendao.Property r1 = com.usidqw.qwerklj.GreenDao.dao.RecordLogDao.Properties.Key
            org.greenrobot.greendao.query.WhereCondition r4 = r1.m111eq(r4)
            r1 = 1
            org.greenrobot.greendao.query.WhereCondition[] r2 = new org.greenrobot.greendao.query.WhereCondition[r1]
            org.greenrobot.greendao.Property r3 = com.usidqw.qwerklj.GreenDao.dao.RecordLogDao.Properties.Type
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            org.greenrobot.greendao.query.WhereCondition r5 = r3.m111eq(r5)
            r3 = 0
            r2[r3] = r5
            org.greenrobot.greendao.query.QueryBuilder r4 = r0.where(r4, r2)
            org.greenrobot.greendao.query.QueryBuilder r4 = r4.limit(r1)
            java.lang.Object r4 = r4.unique()
            com.usidqw.qwerklj.GreenDao.db.RecordLog r4 = (com.usidqw.qwerklj.GreenDao.p001db.RecordLog) r4
            if (r4 == 0) goto L3d
            com.usidqw.qwerklj.Tools.JsonMain r5 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r5 = r5.getDb()
            r5.delete(r4)
        L3d:
            return
    }

    public static com.usidqw.qwerklj.GreenDao.p001db.RecordLog getRecord(java.lang.String r4, int r5) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            com.usidqw.qwerklj.GreenDao.dao.RecordLogDao r0 = r0.getRecordLogDao()
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.queryBuilder()
            org.greenrobot.greendao.Property r1 = com.usidqw.qwerklj.GreenDao.dao.RecordLogDao.Properties.Key
            org.greenrobot.greendao.query.WhereCondition r4 = r1.m111eq(r4)
            r1 = 1
            org.greenrobot.greendao.query.WhereCondition[] r2 = new org.greenrobot.greendao.query.WhereCondition[r1]
            org.greenrobot.greendao.Property r3 = com.usidqw.qwerklj.GreenDao.dao.RecordLogDao.Properties.Type
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            org.greenrobot.greendao.query.WhereCondition r5 = r3.m111eq(r5)
            r3 = 0
            r2[r3] = r5
            org.greenrobot.greendao.query.QueryBuilder r4 = r0.where(r4, r2)
            org.greenrobot.greendao.query.QueryBuilder r4 = r4.limit(r1)
            java.lang.Object r4 = r4.unique()
            com.usidqw.qwerklj.GreenDao.db.RecordLog r4 = (com.usidqw.qwerklj.GreenDao.p001db.RecordLog) r4
            return r4
    }

    public static double getValue(java.lang.String r3, double r4) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L13
            java.lang.Double r0 = (java.lang.Double) r0
            double r3 = r0.doubleValue()
            return r3
        L13:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            if (r0 != 0) goto L1c
            return r4
        L1c:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao r0 = r0.getConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.queryBuilder()
            org.greenrobot.greendao.Property r1 = com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.Key
            org.greenrobot.greendao.query.WhereCondition r1 = r1.m111eq(r3)
            r2 = 0
            org.greenrobot.greendao.query.WhereCondition[] r2 = new org.greenrobot.greendao.query.WhereCondition[r2]
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.where(r1, r2)
            r1 = 1
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.limit(r1)
            java.lang.Object r0 = r0.unique()
            com.usidqw.qwerklj.GreenDao.db.Config r0 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r0
            if (r0 == 0) goto L52
            java.lang.String r0 = r0.getValue()     // Catch: java.lang.NumberFormatException -> L4d
            double r4 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L4d
            goto L52
        L4d:
            r3 = move-exception
            r3.printStackTrace()
            return r4
        L52:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            java.lang.Double r1 = java.lang.Double.valueOf(r4)
            r0.put(r3, r1)
            return r4
    }

    public static float getValue(java.lang.String r3, float r4) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L13
            java.lang.Float r0 = (java.lang.Float) r0
            float r3 = r0.floatValue()
            return r3
        L13:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            if (r0 != 0) goto L1c
            return r4
        L1c:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao r0 = r0.getConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.queryBuilder()
            org.greenrobot.greendao.Property r1 = com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.Key
            org.greenrobot.greendao.query.WhereCondition r1 = r1.m111eq(r3)
            r2 = 0
            org.greenrobot.greendao.query.WhereCondition[] r2 = new org.greenrobot.greendao.query.WhereCondition[r2]
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.where(r1, r2)
            r1 = 1
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.limit(r1)
            java.lang.Object r0 = r0.unique()
            com.usidqw.qwerklj.GreenDao.db.Config r0 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r0
            if (r0 == 0) goto L52
            java.lang.String r0 = r0.getValue()     // Catch: java.lang.NumberFormatException -> L4d
            float r4 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L4d
            goto L52
        L4d:
            r3 = move-exception
            r3.printStackTrace()
            return r4
        L52:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            r0.put(r3, r1)
            return r4
    }

    public static int getValue(java.lang.String r3, int r4) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L13
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r3 = r0.intValue()
            return r3
        L13:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            if (r0 != 0) goto L1c
            return r4
        L1c:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao r0 = r0.getConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.queryBuilder()
            org.greenrobot.greendao.Property r1 = com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.Key
            org.greenrobot.greendao.query.WhereCondition r1 = r1.m111eq(r3)
            r2 = 0
            org.greenrobot.greendao.query.WhereCondition[] r2 = new org.greenrobot.greendao.query.WhereCondition[r2]
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.where(r1, r2)
            r1 = 1
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.limit(r1)
            java.lang.Object r0 = r0.unique()
            com.usidqw.qwerklj.GreenDao.db.Config r0 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r0
            if (r0 == 0) goto L5c
            java.lang.String r1 = r0.getValue()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L5c
            java.lang.String r0 = r0.getValue()     // Catch: java.lang.NumberFormatException -> L57
            int r4 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L57
            goto L5c
        L57:
            r3 = move-exception
            r3.printStackTrace()
            return r4
        L5c:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.put(r3, r1)
            return r4
    }

    public static long getValue(java.lang.String r3, long r4) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L13
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            return r3
        L13:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            if (r0 != 0) goto L1c
            return r4
        L1c:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao r0 = r0.getConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.queryBuilder()
            org.greenrobot.greendao.Property r1 = com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.Key
            org.greenrobot.greendao.query.WhereCondition r1 = r1.m111eq(r3)
            r2 = 0
            org.greenrobot.greendao.query.WhereCondition[] r2 = new org.greenrobot.greendao.query.WhereCondition[r2]
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.where(r1, r2)
            r1 = 1
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.limit(r1)
            java.lang.Object r0 = r0.unique()
            com.usidqw.qwerklj.GreenDao.db.Config r0 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r0
            if (r0 == 0) goto L4c
            java.lang.String r4 = r0.getValue()
            long r4 = java.lang.Long.parseLong(r4)
        L4c:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.put(r3, r1)
            return r4
    }

    public static java.lang.String getValue(java.lang.String r3, java.lang.String r4) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto Lf
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Lf:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            if (r0 != 0) goto L18
            return r4
        L18:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao r0 = r0.getConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.queryBuilder()
            org.greenrobot.greendao.Property r1 = com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.Key
            org.greenrobot.greendao.query.WhereCondition r1 = r1.m111eq(r3)
            r2 = 0
            org.greenrobot.greendao.query.WhereCondition[] r2 = new org.greenrobot.greendao.query.WhereCondition[r2]
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.where(r1, r2)
            r1 = 1
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.limit(r1)
            java.lang.Object r0 = r0.unique()
            com.usidqw.qwerklj.GreenDao.db.Config r0 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r0
            if (r0 == 0) goto L44
            java.lang.String r4 = r0.getValue()
        L44:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            r0.put(r3, r4)
            return r4
    }

    public static boolean getValue(java.lang.String r3, boolean r4) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L1e
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L17
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = java.lang.Boolean.parseBoolean(r0)
            return r3
        L17:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            return r3
        L1e:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            if (r0 != 0) goto L27
            return r4
        L27:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao r0 = r0.getConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.queryBuilder()
            org.greenrobot.greendao.Property r1 = com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.Key
            org.greenrobot.greendao.query.WhereCondition r1 = r1.m111eq(r3)
            r2 = 0
            org.greenrobot.greendao.query.WhereCondition[] r2 = new org.greenrobot.greendao.query.WhereCondition[r2]
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.where(r1, r2)
            r1 = 1
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.limit(r1)
            java.lang.Object r0 = r0.unique()
            com.usidqw.qwerklj.GreenDao.db.Config r0 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r0
            if (r0 == 0) goto L57
            java.lang.String r4 = r0.getValue()
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
        L57:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.put(r3, r1)
            return r4
    }

    public static java.lang.String getValueSet(java.lang.String r2, java.lang.String r3) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            if (r0 != 0) goto L9
            return r3
        L9:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao r0 = r0.getConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.queryBuilder()
            org.greenrobot.greendao.Property r1 = com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.Key
            org.greenrobot.greendao.query.WhereCondition r2 = r1.m111eq(r2)
            r1 = 0
            org.greenrobot.greendao.query.WhereCondition[] r1 = new org.greenrobot.greendao.query.WhereCondition[r1]
            org.greenrobot.greendao.query.QueryBuilder r2 = r0.where(r2, r1)
            r0 = 1
            org.greenrobot.greendao.query.QueryBuilder r2 = r2.limit(r0)
            java.lang.Object r2 = r2.unique()
            com.usidqw.qwerklj.GreenDao.db.Config r2 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r2
            if (r2 == 0) goto L35
            java.lang.String r3 = r2.getValue()
        L35:
            return r3
    }

    public static boolean isAllOpen() {
            java.lang.String r0 = "allOpen"
            r1 = 1
            boolean r0 = getValue(r0, r1)
            return r0
    }

    public static void setRecord(java.lang.String r6, int r7, java.lang.String r8, java.lang.String r9) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            com.usidqw.qwerklj.GreenDao.dao.RecordLogDao r0 = r0.getRecordLogDao()
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.queryBuilder()
            org.greenrobot.greendao.Property r1 = com.usidqw.qwerklj.GreenDao.dao.RecordLogDao.Properties.Key
            org.greenrobot.greendao.query.WhereCondition r1 = r1.m111eq(r6)
            r2 = 1
            org.greenrobot.greendao.query.WhereCondition[] r3 = new org.greenrobot.greendao.query.WhereCondition[r2]
            org.greenrobot.greendao.Property r4 = com.usidqw.qwerklj.GreenDao.dao.RecordLogDao.Properties.Type
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            org.greenrobot.greendao.query.WhereCondition r4 = r4.m111eq(r5)
            r5 = 0
            r3[r5] = r4
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.where(r1, r3)
            org.greenrobot.greendao.query.QueryBuilder r0 = r0.limit(r2)
            java.lang.Object r0 = r0.unique()
            com.usidqw.qwerklj.GreenDao.db.RecordLog r0 = (com.usidqw.qwerklj.GreenDao.p001db.RecordLog) r0
            if (r0 != 0) goto L4f
            com.usidqw.qwerklj.GreenDao.db.RecordLog r0 = new com.usidqw.qwerklj.GreenDao.db.RecordLog
            r0.<init>()
            r0.setKey(r6)
            r0.setValue(r8)
            r0.setType(r7)
            r0.setText(r9)
            com.usidqw.qwerklj.Tools.JsonMain r6 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r6 = r6.getDb()
            r6.insert(r0)
            goto L64
        L4f:
            r0.setKey(r6)
            r0.setValue(r8)
            r0.setType(r7)
            r0.setText(r9)
            com.usidqw.qwerklj.Tools.JsonMain r6 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r6 = r6.getDb()
            r6.update(r0)
        L64:
            return
    }

    public static void setValue(java.lang.String r4, java.lang.Object r5) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r0 = r0.getDb()
            if (r0 != 0) goto L9
            return
        L9:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L90
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L3c
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L27
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            r0.put(r4, r5)
            goto L90
        L27:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r4, r1)
            goto L90
        L3c:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L55
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
            float r1 = java.lang.Float.parseFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.put(r4, r1)
            goto L90
        L55:
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L6e
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
            long r1 = java.lang.Long.parseLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.put(r4, r1)
            goto L90
        L6e:
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L87
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
            double r1 = java.lang.Double.parseDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.put(r4, r1)
            goto L90
        L87:
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Base.Base.App
            java.util.HashMap r0 = r0.getSetList()
            r0.put(r4, r5)
        L90:
            r0 = 1
            r1 = 0
            if (r5 == 0) goto Lfa
            com.usidqw.qwerklj.Tools.JsonMain r2 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r2 = r2.getDb()
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao r2 = r2.getConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r2 = r2.queryBuilder()
            org.greenrobot.greendao.Property r3 = com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.Key
            org.greenrobot.greendao.query.WhereCondition r3 = r3.m111eq(r4)
            org.greenrobot.greendao.query.WhereCondition[] r1 = new org.greenrobot.greendao.query.WhereCondition[r1]
            org.greenrobot.greendao.query.QueryBuilder r1 = r2.where(r3, r1)
            org.greenrobot.greendao.query.QueryBuilder r0 = r1.limit(r0)
            java.lang.Object r0 = r0.unique()
            com.usidqw.qwerklj.GreenDao.db.Config r0 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r0
            if (r0 != 0) goto Lde
            com.usidqw.qwerklj.GreenDao.db.Config r0 = new com.usidqw.qwerklj.GreenDao.db.Config
            r0.<init>()
            r0.setKey(r4)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            r0.setValue(r4)
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            r0.setType(r4)
            com.usidqw.qwerklj.Tools.JsonMain r4 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r4 = r4.getDb()
            r4.insert(r0)
            goto L129
        Lde:
            java.lang.String r4 = java.lang.String.valueOf(r5)
            r0.setValue(r4)
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            r0.setType(r4)
            com.usidqw.qwerklj.Tools.JsonMain r4 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r4 = r4.getDb()
            r4.update(r0)
            goto L129
        Lfa:
            com.usidqw.qwerklj.Tools.JsonMain r5 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r5 = r5.getDb()
            com.usidqw.qwerklj.GreenDao.dao.ConfigDao r5 = r5.getConfigDao()
            org.greenrobot.greendao.query.QueryBuilder r5 = r5.queryBuilder()
            org.greenrobot.greendao.Property r2 = com.usidqw.qwerklj.GreenDao.dao.ConfigDao.Properties.Key
            org.greenrobot.greendao.query.WhereCondition r4 = r2.m111eq(r4)
            org.greenrobot.greendao.query.WhereCondition[] r1 = new org.greenrobot.greendao.query.WhereCondition[r1]
            org.greenrobot.greendao.query.QueryBuilder r4 = r5.where(r4, r1)
            org.greenrobot.greendao.query.QueryBuilder r4 = r4.limit(r0)
            java.lang.Object r4 = r4.unique()
            com.usidqw.qwerklj.GreenDao.db.Config r4 = (com.usidqw.qwerklj.GreenDao.p001db.Config) r4
            if (r4 == 0) goto L129
            com.usidqw.qwerklj.Tools.JsonMain r5 = com.usidqw.qwerklj.Base.Base.App
            com.usidqw.qwerklj.GreenDao.dao.DaoSession r5 = r5.getDb()
            r5.delete(r4)
        L129:
            return
    }

    public static int shakeNum() {
            java.lang.String r0 = "shakeNum"
            r1 = 10
            int r0 = getValue(r0, r1)
            return r0
    }

    public abstract void onENHook() throws java.lang.NoSuchFieldException;

    public abstract void onLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r1);
}
