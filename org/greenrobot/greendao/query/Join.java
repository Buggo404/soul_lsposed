package org.greenrobot.greendao.query;

/* loaded from: classes.dex */
public class Join<SRC, DST> {
    final org.greenrobot.greendao.AbstractDao<DST, ?> daoDestination;
    final org.greenrobot.greendao.Property joinPropertyDestination;
    final org.greenrobot.greendao.Property joinPropertySource;
    final java.lang.String sourceTablePrefix;
    final java.lang.String tablePrefix;
    final org.greenrobot.greendao.query.WhereCollector<DST> whereCollector;

    public Join(java.lang.String r1, org.greenrobot.greendao.Property r2, org.greenrobot.greendao.AbstractDao<DST, ?> r3, org.greenrobot.greendao.Property r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.sourceTablePrefix = r1
            r0.joinPropertySource = r2
            r0.daoDestination = r3
            r0.joinPropertyDestination = r4
            r0.tablePrefix = r5
            org.greenrobot.greendao.query.WhereCollector r1 = new org.greenrobot.greendao.query.WhereCollector
            r1.<init>(r3, r5)
            r0.whereCollector = r1
            return
    }

    public org.greenrobot.greendao.query.WhereCondition and(org.greenrobot.greendao.query.WhereCondition r3, org.greenrobot.greendao.query.WhereCondition r4, org.greenrobot.greendao.query.WhereCondition... r5) {
            r2 = this;
            org.greenrobot.greendao.query.WhereCollector<DST> r0 = r2.whereCollector
            java.lang.String r1 = " AND "
            org.greenrobot.greendao.query.WhereCondition r3 = r0.combineWhereConditions(r1, r3, r4, r5)
            return r3
    }

    public java.lang.String getTablePrefix() {
            r1 = this;
            java.lang.String r0 = r1.tablePrefix
            return r0
    }

    /* renamed from: or */
    public org.greenrobot.greendao.query.WhereCondition m119or(org.greenrobot.greendao.query.WhereCondition r3, org.greenrobot.greendao.query.WhereCondition r4, org.greenrobot.greendao.query.WhereCondition... r5) {
            r2 = this;
            org.greenrobot.greendao.query.WhereCollector<DST> r0 = r2.whereCollector
            java.lang.String r1 = " OR "
            org.greenrobot.greendao.query.WhereCondition r3 = r0.combineWhereConditions(r1, r3, r4, r5)
            return r3
    }

    public org.greenrobot.greendao.query.Join<SRC, DST> where(org.greenrobot.greendao.query.WhereCondition r2, org.greenrobot.greendao.query.WhereCondition... r3) {
            r1 = this;
            org.greenrobot.greendao.query.WhereCollector<DST> r0 = r1.whereCollector
            r0.add(r2, r3)
            return r1
    }

    public org.greenrobot.greendao.query.Join<SRC, DST> whereOr(org.greenrobot.greendao.query.WhereCondition r2, org.greenrobot.greendao.query.WhereCondition r3, org.greenrobot.greendao.query.WhereCondition... r4) {
            r1 = this;
            org.greenrobot.greendao.query.WhereCollector<DST> r0 = r1.whereCollector
            org.greenrobot.greendao.query.WhereCondition r2 = r1.m119or(r2, r3, r4)
            r3 = 0
            org.greenrobot.greendao.query.WhereCondition[] r3 = new org.greenrobot.greendao.query.WhereCondition[r3]
            r0.add(r2, r3)
            return r1
    }
}
