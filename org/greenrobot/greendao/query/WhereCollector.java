package org.greenrobot.greendao.query;

/* loaded from: classes.dex */
class WhereCollector<T> {
    private final org.greenrobot.greendao.AbstractDao<T, ?> dao;
    private final java.lang.String tablePrefix;
    private final java.util.List<org.greenrobot.greendao.query.WhereCondition> whereConditions;

    WhereCollector(org.greenrobot.greendao.AbstractDao<T, ?> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.dao = r1
            r0.tablePrefix = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.whereConditions = r1
            return
    }

    void add(org.greenrobot.greendao.query.WhereCondition r4, org.greenrobot.greendao.query.WhereCondition... r5) {
            r3 = this;
            r3.checkCondition(r4)
            java.util.List<org.greenrobot.greendao.query.WhereCondition> r0 = r3.whereConditions
            r0.add(r4)
            int r4 = r5.length
            r0 = 0
        La:
            if (r0 >= r4) goto L19
            r1 = r5[r0]
            r3.checkCondition(r1)
            java.util.List<org.greenrobot.greendao.query.WhereCondition> r2 = r3.whereConditions
            r2.add(r1)
            int r0 = r0 + 1
            goto La
        L19:
            return
    }

    void addCondition(java.lang.StringBuilder r2, java.util.List<java.lang.Object> r3, org.greenrobot.greendao.query.WhereCondition r4) {
            r1 = this;
            r1.checkCondition(r4)
            java.lang.String r0 = r1.tablePrefix
            r4.appendTo(r2, r0)
            r4.appendValuesTo(r3)
            return
    }

    void appendWhereClause(java.lang.StringBuilder r3, java.lang.String r4, java.util.List<java.lang.Object> r5) {
            r2 = this;
            java.util.List<org.greenrobot.greendao.query.WhereCondition> r0 = r2.whereConditions
            java.util.ListIterator r0 = r0.listIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L17
            java.lang.String r1 = " AND "
            r3.append(r1)
        L17:
            java.lang.Object r1 = r0.next()
            org.greenrobot.greendao.query.WhereCondition r1 = (org.greenrobot.greendao.query.WhereCondition) r1
            r1.appendTo(r3, r4)
            r1.appendValuesTo(r5)
            goto L6
        L24:
            return
    }

    void checkCondition(org.greenrobot.greendao.query.WhereCondition r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.greenrobot.greendao.query.WhereCondition.PropertyCondition
            if (r0 == 0) goto Lb
            org.greenrobot.greendao.query.WhereCondition$PropertyCondition r2 = (org.greenrobot.greendao.query.WhereCondition.PropertyCondition) r2
            org.greenrobot.greendao.Property r2 = r2.property
            r1.checkProperty(r2)
        Lb:
            return
    }

    void checkProperty(org.greenrobot.greendao.Property r6) {
            r5 = this;
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r5.dao
            if (r0 == 0) goto L3c
            org.greenrobot.greendao.Property[] r0 = r0.getProperties()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L16
            r4 = r0[r3]
            if (r6 != r4) goto L13
            r2 = 1
            goto L16
        L13:
            int r3 = r3 + 1
            goto Lb
        L16:
            if (r2 == 0) goto L19
            goto L3c
        L19:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Property '"
            r1.<init>(r2)
            java.lang.String r6 = r6.name
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r1 = "' is not part of "
            java.lang.StringBuilder r6 = r6.append(r1)
            org.greenrobot.greendao.AbstractDao<T, ?> r1 = r5.dao
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L3c:
            return
    }

    org.greenrobot.greendao.query.WhereCondition combineWhereConditions(java.lang.String r4, org.greenrobot.greendao.query.WhereCondition r5, org.greenrobot.greendao.query.WhereCondition r6, org.greenrobot.greendao.query.WhereCondition... r7) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.addCondition(r0, r1, r5)
            r0.append(r4)
            r3.addCondition(r0, r1, r6)
            int r5 = r7.length
            r6 = 0
        L17:
            if (r6 >= r5) goto L24
            r2 = r7[r6]
            r0.append(r4)
            r3.addCondition(r0, r1, r2)
            int r6 = r6 + 1
            goto L17
        L24:
            r4 = 41
            r0.append(r4)
            org.greenrobot.greendao.query.WhereCondition$StringCondition r4 = new org.greenrobot.greendao.query.WhereCondition$StringCondition
            java.lang.String r5 = r0.toString()
            java.lang.Object[] r6 = r1.toArray()
            r4.<init>(r5, r6)
            return r4
    }

    boolean isEmpty() {
            r1 = this;
            java.util.List<org.greenrobot.greendao.query.WhereCondition> r0 = r1.whereConditions
            boolean r0 = r0.isEmpty()
            return r0
    }
}
