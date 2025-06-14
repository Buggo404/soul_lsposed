package org.greenrobot.greendao;

/* loaded from: classes.dex */
public class Property {
    public final java.lang.String columnName;
    public final java.lang.String name;
    public final int ordinal;
    public final boolean primaryKey;
    public final java.lang.Class<?> type;

    public Property(int r1, java.lang.Class<?> r2, java.lang.String r3, boolean r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.ordinal = r1
            r0.type = r2
            r0.name = r3
            r0.primaryKey = r4
            r0.columnName = r5
            return
    }

    public org.greenrobot.greendao.query.WhereCondition between(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r3 = new org.greenrobot.greendao.query.WhereCondition$PropertyCondition
            java.lang.String r4 = " BETWEEN ? AND ?"
            r3.<init>(r2, r4, r0)
            return r3
    }

    /* renamed from: eq */
    public org.greenrobot.greendao.query.WhereCondition m111eq(java.lang.Object r3) {
            r2 = this;
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r0 = new org.greenrobot.greendao.query.WhereCondition$PropertyCondition
            java.lang.String r1 = "=?"
            r0.<init>(r2, r1, r3)
            return r0
    }

    /* renamed from: ge */
    public org.greenrobot.greendao.query.WhereCondition m112ge(java.lang.Object r3) {
            r2 = this;
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r0 = new org.greenrobot.greendao.query.WhereCondition$PropertyCondition
            java.lang.String r1 = ">=?"
            r0.<init>(r2, r1, r3)
            return r0
    }

    /* renamed from: gt */
    public org.greenrobot.greendao.query.WhereCondition m113gt(java.lang.Object r3) {
            r2 = this;
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r0 = new org.greenrobot.greendao.query.WhereCondition$PropertyCondition
            java.lang.String r1 = ">?"
            r0.<init>(r2, r1, r3)
            return r0
    }

    /* renamed from: in */
    public org.greenrobot.greendao.query.WhereCondition m114in(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.Object[] r1 = r1.toArray()
            org.greenrobot.greendao.query.WhereCondition r1 = r0.m115in(r1)
            return r1
    }

    /* renamed from: in */
    public org.greenrobot.greendao.query.WhereCondition m115in(java.lang.Object... r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " IN ("
            r0.<init>(r1)
            int r1 = r4.length
            java.lang.StringBuilder r1 = org.greenrobot.greendao.internal.SqlUtils.appendPlaceholders(r0, r1)
            r2 = 41
            r1.append(r2)
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r1 = new org.greenrobot.greendao.query.WhereCondition$PropertyCondition
            java.lang.String r0 = r0.toString()
            r1.<init>(r3, r0, r4)
            return r1
    }

    public org.greenrobot.greendao.query.WhereCondition isNotNull() {
            r2 = this;
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r0 = new org.greenrobot.greendao.query.WhereCondition$PropertyCondition
            java.lang.String r1 = " IS NOT NULL"
            r0.<init>(r2, r1)
            return r0
    }

    public org.greenrobot.greendao.query.WhereCondition isNull() {
            r2 = this;
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r0 = new org.greenrobot.greendao.query.WhereCondition$PropertyCondition
            java.lang.String r1 = " IS NULL"
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: le */
    public org.greenrobot.greendao.query.WhereCondition m116le(java.lang.Object r3) {
            r2 = this;
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r0 = new org.greenrobot.greendao.query.WhereCondition$PropertyCondition
            java.lang.String r1 = "<=?"
            r0.<init>(r2, r1, r3)
            return r0
    }

    public org.greenrobot.greendao.query.WhereCondition like(java.lang.String r3) {
            r2 = this;
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r0 = new org.greenrobot.greendao.query.WhereCondition$PropertyCondition
            java.lang.String r1 = " LIKE ?"
            r0.<init>(r2, r1, r3)
            return r0
    }

    /* renamed from: lt */
    public org.greenrobot.greendao.query.WhereCondition m117lt(java.lang.Object r3) {
            r2 = this;
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r0 = new org.greenrobot.greendao.query.WhereCondition$PropertyCondition
            java.lang.String r1 = "<?"
            r0.<init>(r2, r1, r3)
            return r0
    }

    public org.greenrobot.greendao.query.WhereCondition notEq(java.lang.Object r3) {
            r2 = this;
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r0 = new org.greenrobot.greendao.query.WhereCondition$PropertyCondition
            java.lang.String r1 = "<>?"
            r0.<init>(r2, r1, r3)
            return r0
    }

    public org.greenrobot.greendao.query.WhereCondition notIn(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.Object[] r1 = r1.toArray()
            org.greenrobot.greendao.query.WhereCondition r1 = r0.notIn(r1)
            return r1
    }

    public org.greenrobot.greendao.query.WhereCondition notIn(java.lang.Object... r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " NOT IN ("
            r0.<init>(r1)
            int r1 = r4.length
            java.lang.StringBuilder r1 = org.greenrobot.greendao.internal.SqlUtils.appendPlaceholders(r0, r1)
            r2 = 41
            r1.append(r2)
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r1 = new org.greenrobot.greendao.query.WhereCondition$PropertyCondition
            java.lang.String r0 = r0.toString()
            r1.<init>(r3, r0, r4)
            return r1
    }
}
