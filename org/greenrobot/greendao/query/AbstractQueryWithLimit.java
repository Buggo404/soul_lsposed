package org.greenrobot.greendao.query;

/* loaded from: classes.dex */
abstract class AbstractQueryWithLimit<T> extends org.greenrobot.greendao.query.AbstractQuery<T> {
    protected final int limitPosition;
    protected final int offsetPosition;

    protected AbstractQueryWithLimit(org.greenrobot.greendao.AbstractDao<T, ?> r1, java.lang.String r2, java.lang.String[] r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.limitPosition = r4
            r0.offsetPosition = r5
            return
    }

    public void setLimit(int r3) {
            r2 = this;
            r2.checkThread()
            int r0 = r2.limitPosition
            r1 = -1
            if (r0 == r1) goto L13
            java.lang.String[] r0 = r2.parameters
            int r1 = r2.limitPosition
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r0[r1] = r3
            return
        L13:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Limit must be set with QueryBuilder before it can be used here"
            r3.<init>(r0)
            throw r3
    }

    public void setOffset(int r3) {
            r2 = this;
            r2.checkThread()
            int r0 = r2.offsetPosition
            r1 = -1
            if (r0 == r1) goto L13
            java.lang.String[] r0 = r2.parameters
            int r1 = r2.offsetPosition
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r0[r1] = r3
            return
        L13:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Offset must be set with QueryBuilder before it can be used here"
            r3.<init>(r0)
            throw r3
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public /* bridge */ /* synthetic */ org.greenrobot.greendao.query.AbstractQuery setParameter(int r1, java.lang.Object r2) {
            r0 = this;
            org.greenrobot.greendao.query.AbstractQueryWithLimit r1 = r0.setParameter(r1, r2)
            return r1
    }

    @Override // org.greenrobot.greendao.query.AbstractQuery
    public org.greenrobot.greendao.query.AbstractQueryWithLimit<T> setParameter(int r3, java.lang.Object r4) {
            r2 = this;
            if (r3 < 0) goto L20
            int r0 = r2.limitPosition
            if (r3 == r0) goto Lb
            int r0 = r2.offsetPosition
            if (r3 == r0) goto Lb
            goto L20
        Lb:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal parameter index: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L20:
            org.greenrobot.greendao.query.AbstractQuery r3 = super.setParameter(r3, r4)
            org.greenrobot.greendao.query.AbstractQueryWithLimit r3 = (org.greenrobot.greendao.query.AbstractQueryWithLimit) r3
            return r3
    }
}
