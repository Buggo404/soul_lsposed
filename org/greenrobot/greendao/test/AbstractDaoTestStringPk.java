package org.greenrobot.greendao.test;

import org.greenrobot.greendao.AbstractDao;

/* loaded from: classes.dex */
public abstract class AbstractDaoTestStringPk<D extends org.greenrobot.greendao.AbstractDao<T, java.lang.String>, T> extends org.greenrobot.greendao.test.AbstractDaoTestSinglePk<D, T, java.lang.String> {
    public AbstractDaoTestStringPk(java.lang.Class<D> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.greenrobot.greendao.test.AbstractDaoTestSinglePk
    protected /* bridge */ /* synthetic */ java.lang.String createRandomPk() {
            r1 = this;
            java.lang.String r0 = r1.createRandomPk2()
            return r0
    }

    @Override // org.greenrobot.greendao.test.AbstractDaoTestSinglePk
    /* renamed from: createRandomPk, reason: avoid collision after fix types in other method */
    protected java.lang.String createRandomPk2() {
            r5 = this;
            java.util.Random r0 = r5.random
            r1 = 30
            int r0 = r0.nextInt(r1)
            int r0 = r0 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        L10:
            if (r2 >= r0) goto L23
            java.util.Random r3 = r5.random
            r4 = 25
            int r3 = r3.nextInt(r4)
            int r3 = r3 + 97
            char r3 = (char) r3
            r1.append(r3)
            int r2 = r2 + 1
            goto L10
        L23:
            java.lang.String r0 = r1.toString()
            return r0
    }
}
