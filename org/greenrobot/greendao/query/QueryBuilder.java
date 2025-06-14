package org.greenrobot.greendao.query;

/* loaded from: classes.dex */
public class QueryBuilder<T> {
    public static boolean LOG_SQL;
    public static boolean LOG_VALUES;
    private final org.greenrobot.greendao.AbstractDao<T, ?> dao;
    private boolean distinct;
    private final java.util.List<org.greenrobot.greendao.query.Join<T, ?>> joins;
    private java.lang.Integer limit;
    private java.lang.Integer offset;
    private java.lang.StringBuilder orderBuilder;
    private java.lang.String stringOrderCollation;
    private final java.lang.String tablePrefix;
    private final java.util.List<java.lang.Object> values;
    private final org.greenrobot.greendao.query.WhereCollector<T> whereCollector;

    protected QueryBuilder(org.greenrobot.greendao.AbstractDao<T, ?> r2) {
            r1 = this;
            java.lang.String r0 = "T"
            r1.<init>(r2, r0)
            return
    }

    protected QueryBuilder(org.greenrobot.greendao.AbstractDao<T, ?> r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r1.dao = r2
            r1.tablePrefix = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.values = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.joins = r0
            org.greenrobot.greendao.query.WhereCollector r0 = new org.greenrobot.greendao.query.WhereCollector
            r0.<init>(r2, r3)
            r1.whereCollector = r0
            java.lang.String r2 = " COLLATE NOCASE"
            r1.stringOrderCollation = r2
            return
    }

    private <J> org.greenrobot.greendao.query.Join<T, J> addJoin(java.lang.String r8, org.greenrobot.greendao.Property r9, org.greenrobot.greendao.AbstractDao<J, ?> r10, org.greenrobot.greendao.Property r11) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "J"
            r0.<init>(r1)
            java.util.List<org.greenrobot.greendao.query.Join<T, ?>> r1 = r7.joins
            int r1 = r1.size()
            int r1 = r1 + 1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r6 = r0.toString()
            org.greenrobot.greendao.query.Join r0 = new org.greenrobot.greendao.query.Join
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.List<org.greenrobot.greendao.query.Join<T, ?>> r8 = r7.joins
            r8.add(r0)
            return r0
    }

    private void appendJoinsAndWheres(java.lang.StringBuilder r7, java.lang.String r8) {
            r6 = this;
            java.util.List<java.lang.Object> r0 = r6.values
            r0.clear()
            java.util.List<org.greenrobot.greendao.query.Join<T, ?>> r0 = r6.joins
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r0.next()
            org.greenrobot.greendao.query.Join r1 = (org.greenrobot.greendao.query.Join) r1
            java.lang.String r2 = " JOIN "
            r7.append(r2)
            r2 = 34
            java.lang.StringBuilder r3 = r7.append(r2)
            org.greenrobot.greendao.AbstractDao<DST, ?> r4 = r1.daoDestination
            java.lang.String r4 = r4.getTablename()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            r3 = 32
            r2.append(r3)
            java.lang.String r2 = r1.tablePrefix
            java.lang.StringBuilder r2 = r7.append(r2)
            java.lang.String r3 = " ON "
            r2.append(r3)
            java.lang.String r2 = r1.sourceTablePrefix
            org.greenrobot.greendao.Property r3 = r1.joinPropertySource
            java.lang.StringBuilder r2 = org.greenrobot.greendao.internal.SqlUtils.appendProperty(r7, r2, r3)
            r3 = 61
            r2.append(r3)
            java.lang.String r2 = r1.tablePrefix
            org.greenrobot.greendao.Property r1 = r1.joinPropertyDestination
            org.greenrobot.greendao.internal.SqlUtils.appendProperty(r7, r2, r1)
            goto Lb
        L55:
            org.greenrobot.greendao.query.WhereCollector<T> r0 = r6.whereCollector
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = " WHERE "
            if (r0 == 0) goto L6b
            r7.append(r2)
            org.greenrobot.greendao.query.WhereCollector<T> r3 = r6.whereCollector
            java.util.List<java.lang.Object> r4 = r6.values
            r3.appendWhereClause(r7, r8, r4)
        L6b:
            java.util.List<org.greenrobot.greendao.query.Join<T, ?>> r8 = r6.joins
            java.util.Iterator r8 = r8.iterator()
        L71:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r8.next()
            org.greenrobot.greendao.query.Join r3 = (org.greenrobot.greendao.query.Join) r3
            org.greenrobot.greendao.query.WhereCollector<DST> r4 = r3.whereCollector
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L71
            if (r0 != 0) goto L8c
            r7.append(r2)
            r0 = r1
            goto L91
        L8c:
            java.lang.String r4 = " AND "
            r7.append(r4)
        L91:
            org.greenrobot.greendao.query.WhereCollector<DST> r4 = r3.whereCollector
            java.lang.String r3 = r3.tablePrefix
            java.util.List<java.lang.Object> r5 = r6.values
            r4.appendWhereClause(r7, r3, r5)
            goto L71
        L9b:
            return
    }

    private int checkAddLimit(java.lang.StringBuilder r2) {
            r1 = this;
            java.lang.Integer r0 = r1.limit
            if (r0 == 0) goto L19
            java.lang.String r0 = " LIMIT ?"
            r2.append(r0)
            java.util.List<java.lang.Object> r2 = r1.values
            java.lang.Integer r0 = r1.limit
            r2.add(r0)
            java.util.List<java.lang.Object> r2 = r1.values
            int r2 = r2.size()
            int r2 = r2 + (-1)
            goto L1a
        L19:
            r2 = -1
        L1a:
            return r2
    }

    private int checkAddOffset(java.lang.StringBuilder r2) {
            r1 = this;
            java.lang.Integer r0 = r1.offset
            if (r0 == 0) goto L25
            java.lang.Integer r0 = r1.limit
            if (r0 == 0) goto L1d
            java.lang.String r0 = " OFFSET ?"
            r2.append(r0)
            java.util.List<java.lang.Object> r2 = r1.values
            java.lang.Integer r0 = r1.offset
            r2.add(r0)
            java.util.List<java.lang.Object> r2 = r1.values
            int r2 = r2.size()
            int r2 = r2 + (-1)
            goto L26
        L1d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Offset cannot be set without limit"
            r2.<init>(r0)
            throw r2
        L25:
            r2 = -1
        L26:
            return r2
    }

    private void checkLog(java.lang.String r3) {
            r2 = this;
            boolean r0 = org.greenrobot.greendao.query.QueryBuilder.LOG_SQL
            if (r0 == 0) goto L16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Built SQL for query: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            org.greenrobot.greendao.DaoLog.m100d(r3)
        L16:
            boolean r3 = org.greenrobot.greendao.query.QueryBuilder.LOG_VALUES
            if (r3 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Values for query: "
            r3.<init>(r0)
            java.util.List<java.lang.Object> r0 = r2.values
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            org.greenrobot.greendao.DaoLog.m100d(r3)
        L2e:
            return
    }

    private void checkOrderBuilder() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.orderBuilder
            if (r0 != 0) goto Lc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2.orderBuilder = r0
            goto L19
        Lc:
            int r0 = r0.length()
            if (r0 <= 0) goto L19
            java.lang.StringBuilder r0 = r2.orderBuilder
            java.lang.String r1 = ","
            r0.append(r1)
        L19:
            return
    }

    private java.lang.StringBuilder createSelectBuilder() {
            r4 = this;
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r4.dao
            java.lang.String r0 = r0.getTablename()
            java.lang.String r1 = r4.tablePrefix
            org.greenrobot.greendao.AbstractDao<T, ?> r2 = r4.dao
            java.lang.String[] r2 = r2.getAllColumns()
            boolean r3 = r4.distinct
            java.lang.String r0 = org.greenrobot.greendao.internal.SqlUtils.createSqlSelect(r0, r1, r2, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r4.tablePrefix
            r4.appendJoinsAndWheres(r1, r0)
            java.lang.StringBuilder r0 = r4.orderBuilder
            if (r0 == 0) goto L33
            int r0 = r0.length()
            if (r0 <= 0) goto L33
            java.lang.String r0 = " ORDER BY "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r2 = r4.orderBuilder
            r0.append(r2)
        L33:
            return r1
    }

    public static <T2> org.greenrobot.greendao.query.QueryBuilder<T2> internalCreate(org.greenrobot.greendao.AbstractDao<T2, ?> r1) {
            org.greenrobot.greendao.query.QueryBuilder r0 = new org.greenrobot.greendao.query.QueryBuilder
            r0.<init>(r1)
            return r0
    }

    private void orderAscOrDesc(java.lang.String r5, org.greenrobot.greendao.Property... r6) {
            r4 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L29
            r2 = r6[r1]
            r4.checkOrderBuilder()
            java.lang.StringBuilder r3 = r4.orderBuilder
            r4.append(r3, r2)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class<?> r2 = r2.type
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L21
            java.lang.String r2 = r4.stringOrderCollation
            if (r2 == 0) goto L21
            java.lang.StringBuilder r3 = r4.orderBuilder
            r3.append(r2)
        L21:
            java.lang.StringBuilder r2 = r4.orderBuilder
            r2.append(r5)
            int r1 = r1 + 1
            goto L2
        L29:
            return
    }

    public org.greenrobot.greendao.query.WhereCondition and(org.greenrobot.greendao.query.WhereCondition r3, org.greenrobot.greendao.query.WhereCondition r4, org.greenrobot.greendao.query.WhereCondition... r5) {
            r2 = this;
            org.greenrobot.greendao.query.WhereCollector<T> r0 = r2.whereCollector
            java.lang.String r1 = " AND "
            org.greenrobot.greendao.query.WhereCondition r3 = r0.combineWhereConditions(r1, r3, r4, r5)
            return r3
    }

    protected java.lang.StringBuilder append(java.lang.StringBuilder r3, org.greenrobot.greendao.Property r4) {
            r2 = this;
            org.greenrobot.greendao.query.WhereCollector<T> r0 = r2.whereCollector
            r0.checkProperty(r4)
            java.lang.String r0 = r2.tablePrefix
            java.lang.StringBuilder r0 = r3.append(r0)
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 39
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r4 = r4.columnName
            java.lang.StringBuilder r4 = r0.append(r4)
            r4.append(r1)
            return r3
    }

    public org.greenrobot.greendao.query.Query<T> build() {
            r5 = this;
            java.lang.StringBuilder r0 = r5.createSelectBuilder()
            int r1 = r5.checkAddLimit(r0)
            int r2 = r5.checkAddOffset(r0)
            java.lang.String r0 = r0.toString()
            r5.checkLog(r0)
            org.greenrobot.greendao.AbstractDao<T, ?> r3 = r5.dao
            java.util.List<java.lang.Object> r4 = r5.values
            java.lang.Object[] r4 = r4.toArray()
            org.greenrobot.greendao.query.Query r0 = org.greenrobot.greendao.query.Query.create(r3, r0, r4, r1, r2)
            return r0
    }

    public org.greenrobot.greendao.query.CountQuery<T> buildCount() {
            r3 = this;
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r3.dao
            java.lang.String r0 = r0.getTablename()
            java.lang.String r1 = r3.tablePrefix
            java.lang.String r0 = org.greenrobot.greendao.internal.SqlUtils.createSqlSelectCountStar(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r3.tablePrefix
            r3.appendJoinsAndWheres(r1, r0)
            java.lang.String r0 = r1.toString()
            r3.checkLog(r0)
            org.greenrobot.greendao.AbstractDao<T, ?> r1 = r3.dao
            java.util.List<java.lang.Object> r2 = r3.values
            java.lang.Object[] r2 = r2.toArray()
            org.greenrobot.greendao.query.CountQuery r0 = org.greenrobot.greendao.query.CountQuery.create(r1, r0, r2)
            return r0
    }

    public org.greenrobot.greendao.query.CursorQuery buildCursor() {
            r5 = this;
            java.lang.StringBuilder r0 = r5.createSelectBuilder()
            int r1 = r5.checkAddLimit(r0)
            int r2 = r5.checkAddOffset(r0)
            java.lang.String r0 = r0.toString()
            r5.checkLog(r0)
            org.greenrobot.greendao.AbstractDao<T, ?> r3 = r5.dao
            java.util.List<java.lang.Object> r4 = r5.values
            java.lang.Object[] r4 = r4.toArray()
            org.greenrobot.greendao.query.CursorQuery r0 = org.greenrobot.greendao.query.CursorQuery.create(r3, r0, r4, r1, r2)
            return r0
    }

    public org.greenrobot.greendao.query.DeleteQuery<T> buildDelete() {
            r5 = this;
            java.util.List<org.greenrobot.greendao.query.Join<T, ?>> r0 = r5.joins
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5f
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r5.dao
            java.lang.String r0 = r0.getTablename()
            r1 = 0
            java.lang.String r1 = org.greenrobot.greendao.internal.SqlUtils.createSqlDelete(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r5.tablePrefix
            r5.appendJoinsAndWheres(r2, r1)
            java.lang.String r1 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r5.tablePrefix
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".\""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = "\".\""
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r1.replace(r2, r0)
            r5.checkLog(r0)
            org.greenrobot.greendao.AbstractDao<T, ?> r1 = r5.dao
            java.util.List<java.lang.Object> r2 = r5.values
            java.lang.Object[] r2 = r2.toArray()
            org.greenrobot.greendao.query.DeleteQuery r0 = org.greenrobot.greendao.query.DeleteQuery.create(r1, r0, r2)
            return r0
        L5f:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException
            java.lang.String r1 = "JOINs are not supported for DELETE queries"
            r0.<init>(r1)
            throw r0
    }

    public long count() {
            r2 = this;
            org.greenrobot.greendao.query.CountQuery r0 = r2.buildCount()
            long r0 = r0.count()
            return r0
    }

    public org.greenrobot.greendao.query.QueryBuilder<T> distinct() {
            r1 = this;
            r0 = 1
            r1.distinct = r0
            return r1
    }

    public <J> org.greenrobot.greendao.query.Join<T, J> join(java.lang.Class<J> r2, org.greenrobot.greendao.Property r3) {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r1.dao
            org.greenrobot.greendao.Property r0 = r0.getPkProperty()
            org.greenrobot.greendao.query.Join r2 = r1.join(r0, r2, r3)
            return r2
    }

    public <J> org.greenrobot.greendao.query.Join<T, J> join(org.greenrobot.greendao.Property r3, java.lang.Class<J> r4) {
            r2 = this;
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r2.dao
            org.greenrobot.greendao.AbstractDaoSession r0 = r0.getSession()
            org.greenrobot.greendao.AbstractDao r4 = r0.getDao(r4)
            org.greenrobot.greendao.Property r0 = r4.getPkProperty()
            java.lang.String r1 = r2.tablePrefix
            org.greenrobot.greendao.query.Join r3 = r2.addJoin(r1, r3, r4, r0)
            return r3
    }

    public <J> org.greenrobot.greendao.query.Join<T, J> join(org.greenrobot.greendao.Property r2, java.lang.Class<J> r3, org.greenrobot.greendao.Property r4) {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r1.dao
            org.greenrobot.greendao.AbstractDaoSession r0 = r0.getSession()
            org.greenrobot.greendao.AbstractDao r3 = r0.getDao(r3)
            java.lang.String r0 = r1.tablePrefix
            org.greenrobot.greendao.query.Join r2 = r1.addJoin(r0, r2, r3, r4)
            return r2
    }

    public <J> org.greenrobot.greendao.query.Join<T, J> join(org.greenrobot.greendao.query.Join<?, T> r2, org.greenrobot.greendao.Property r3, java.lang.Class<J> r4, org.greenrobot.greendao.Property r5) {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r1.dao
            org.greenrobot.greendao.AbstractDaoSession r0 = r0.getSession()
            org.greenrobot.greendao.AbstractDao r4 = r0.getDao(r4)
            java.lang.String r2 = r2.tablePrefix
            org.greenrobot.greendao.query.Join r2 = r1.addJoin(r2, r3, r4, r5)
            return r2
    }

    public org.greenrobot.greendao.query.QueryBuilder<T> limit(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.limit = r1
            return r0
    }

    public java.util.List<T> list() {
            r1 = this;
            org.greenrobot.greendao.query.Query r0 = r1.build()
            java.util.List r0 = r0.list()
            return r0
    }

    public org.greenrobot.greendao.query.CloseableListIterator<T> listIterator() {
            r1 = this;
            org.greenrobot.greendao.query.Query r0 = r1.build()
            org.greenrobot.greendao.query.CloseableListIterator r0 = r0.listIterator()
            return r0
    }

    public org.greenrobot.greendao.query.LazyList<T> listLazy() {
            r1 = this;
            org.greenrobot.greendao.query.Query r0 = r1.build()
            org.greenrobot.greendao.query.LazyList r0 = r0.listLazy()
            return r0
    }

    public org.greenrobot.greendao.query.LazyList<T> listLazyUncached() {
            r1 = this;
            org.greenrobot.greendao.query.Query r0 = r1.build()
            org.greenrobot.greendao.query.LazyList r0 = r0.listLazyUncached()
            return r0
    }

    public org.greenrobot.greendao.query.QueryBuilder<T> offset(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.offset = r1
            return r0
    }

    /* renamed from: or */
    public org.greenrobot.greendao.query.WhereCondition m120or(org.greenrobot.greendao.query.WhereCondition r3, org.greenrobot.greendao.query.WhereCondition r4, org.greenrobot.greendao.query.WhereCondition... r5) {
            r2 = this;
            org.greenrobot.greendao.query.WhereCollector<T> r0 = r2.whereCollector
            java.lang.String r1 = " OR "
            org.greenrobot.greendao.query.WhereCondition r3 = r0.combineWhereConditions(r1, r3, r4, r5)
            return r3
    }

    public org.greenrobot.greendao.query.QueryBuilder<T> orderAsc(org.greenrobot.greendao.Property... r2) {
            r1 = this;
            java.lang.String r0 = " ASC"
            r1.orderAscOrDesc(r0, r2)
            return r1
    }

    public org.greenrobot.greendao.query.QueryBuilder<T> orderCustom(org.greenrobot.greendao.Property r2, java.lang.String r3) {
            r1 = this;
            r1.checkOrderBuilder()
            java.lang.StringBuilder r0 = r1.orderBuilder
            java.lang.StringBuilder r2 = r1.append(r0, r2)
            r0 = 32
            r2.append(r0)
            java.lang.StringBuilder r2 = r1.orderBuilder
            r2.append(r3)
            return r1
    }

    public org.greenrobot.greendao.query.QueryBuilder<T> orderDesc(org.greenrobot.greendao.Property... r2) {
            r1 = this;
            java.lang.String r0 = " DESC"
            r1.orderAscOrDesc(r0, r2)
            return r1
    }

    public org.greenrobot.greendao.query.QueryBuilder<T> orderRaw(java.lang.String r2) {
            r1 = this;
            r1.checkOrderBuilder()
            java.lang.StringBuilder r0 = r1.orderBuilder
            r0.append(r2)
            return r1
    }

    public org.greenrobot.greendao.query.QueryBuilder<T> preferLocalizedStringOrder() {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r1.dao
            org.greenrobot.greendao.database.Database r0 = r0.getDatabase()
            java.lang.Object r0 = r0.getRawDatabase()
            boolean r0 = r0 instanceof android.database.sqlite.SQLiteDatabase
            if (r0 == 0) goto L12
            java.lang.String r0 = " COLLATE LOCALIZED"
            r1.stringOrderCollation = r0
        L12:
            return r1
    }

    /* renamed from: rx */
    public org.greenrobot.greendao.p004rx.RxQuery<T> m121rx() {
            r1 = this;
            org.greenrobot.greendao.query.Query r0 = r1.build()
            org.greenrobot.greendao.rx.RxQuery r0 = r0.__InternalRx()
            return r0
    }

    public org.greenrobot.greendao.p004rx.RxQuery<T> rxPlain() {
            r1 = this;
            org.greenrobot.greendao.query.Query r0 = r1.build()
            org.greenrobot.greendao.rx.RxQuery r0 = r0.__internalRxPlain()
            return r0
    }

    public org.greenrobot.greendao.query.QueryBuilder<T> stringOrderCollation(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L18
            java.lang.String r0 = " "
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto Lb
            goto L18
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
        L18:
            r2.stringOrderCollation = r3
            return r2
    }

    public T unique() {
            r1 = this;
            org.greenrobot.greendao.query.Query r0 = r1.build()
            java.lang.Object r0 = r0.unique()
            return r0
    }

    public T uniqueOrThrow() {
            r1 = this;
            org.greenrobot.greendao.query.Query r0 = r1.build()
            java.lang.Object r0 = r0.uniqueOrThrow()
            return r0
    }

    public org.greenrobot.greendao.query.QueryBuilder<T> where(org.greenrobot.greendao.query.WhereCondition r2, org.greenrobot.greendao.query.WhereCondition... r3) {
            r1 = this;
            org.greenrobot.greendao.query.WhereCollector<T> r0 = r1.whereCollector
            r0.add(r2, r3)
            return r1
    }

    public org.greenrobot.greendao.query.QueryBuilder<T> whereOr(org.greenrobot.greendao.query.WhereCondition r2, org.greenrobot.greendao.query.WhereCondition r3, org.greenrobot.greendao.query.WhereCondition... r4) {
            r1 = this;
            org.greenrobot.greendao.query.WhereCollector<T> r0 = r1.whereCollector
            org.greenrobot.greendao.query.WhereCondition r2 = r1.m120or(r2, r3, r4)
            r3 = 0
            org.greenrobot.greendao.query.WhereCondition[] r3 = new org.greenrobot.greendao.query.WhereCondition[r3]
            r0.add(r2, r3)
            return r1
    }
}
