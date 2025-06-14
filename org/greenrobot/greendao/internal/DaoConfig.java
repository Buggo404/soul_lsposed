package org.greenrobot.greendao.internal;

/* loaded from: classes.dex */
public final class DaoConfig implements java.lang.Cloneable {
    public final java.lang.String[] allColumns;

    /* renamed from: db */
    public final org.greenrobot.greendao.database.Database f618db;
    private org.greenrobot.greendao.identityscope.IdentityScope<?, ?> identityScope;
    public final boolean keyIsNumeric;
    public final java.lang.String[] nonPkColumns;
    public final java.lang.String[] pkColumns;
    public final org.greenrobot.greendao.Property pkProperty;
    public final org.greenrobot.greendao.Property[] properties;
    public final org.greenrobot.greendao.internal.TableStatements statements;
    public final java.lang.String tablename;

    public DaoConfig(org.greenrobot.greendao.database.Database r10, java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>> r11) {
            r9 = this;
            r9.<init>()
            r9.f618db = r10
            java.lang.String r0 = "TABLENAME"
            java.lang.reflect.Field r0 = r11.getField(r0)     // Catch: java.lang.Exception -> Lbf
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lbf
            r9.tablename = r0     // Catch: java.lang.Exception -> Lbf
            org.greenrobot.greendao.Property[] r11 = reflectProperties(r11)     // Catch: java.lang.Exception -> Lbf
            r9.properties = r11     // Catch: java.lang.Exception -> Lbf
            int r0 = r11.length     // Catch: java.lang.Exception -> Lbf
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Exception -> Lbf
            r9.allColumns = r0     // Catch: java.lang.Exception -> Lbf
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lbf
            r0.<init>()     // Catch: java.lang.Exception -> Lbf
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lbf
            r2.<init>()     // Catch: java.lang.Exception -> Lbf
            r3 = 0
            r5 = r1
            r4 = r3
        L2c:
            int r6 = r11.length     // Catch: java.lang.Exception -> Lbf
            if (r4 >= r6) goto L46
            r6 = r11[r4]     // Catch: java.lang.Exception -> Lbf
            java.lang.String r7 = r6.columnName     // Catch: java.lang.Exception -> Lbf
            java.lang.String[] r8 = r9.allColumns     // Catch: java.lang.Exception -> Lbf
            r8[r4] = r7     // Catch: java.lang.Exception -> Lbf
            boolean r8 = r6.primaryKey     // Catch: java.lang.Exception -> Lbf
            if (r8 == 0) goto L40
            r0.add(r7)     // Catch: java.lang.Exception -> Lbf
            r5 = r6
            goto L43
        L40:
            r2.add(r7)     // Catch: java.lang.Exception -> Lbf
        L43:
            int r4 = r4 + 1
            goto L2c
        L46:
            int r11 = r2.size()     // Catch: java.lang.Exception -> Lbf
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch: java.lang.Exception -> Lbf
            java.lang.Object[] r11 = r2.toArray(r11)     // Catch: java.lang.Exception -> Lbf
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch: java.lang.Exception -> Lbf
            r9.nonPkColumns = r11     // Catch: java.lang.Exception -> Lbf
            int r11 = r0.size()     // Catch: java.lang.Exception -> Lbf
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch: java.lang.Exception -> Lbf
            java.lang.Object[] r11 = r0.toArray(r11)     // Catch: java.lang.Exception -> Lbf
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch: java.lang.Exception -> Lbf
            r9.pkColumns = r11     // Catch: java.lang.Exception -> Lbf
            int r0 = r11.length     // Catch: java.lang.Exception -> Lbf
            r2 = 1
            if (r0 != r2) goto L67
            r1 = r5
        L67:
            r9.pkProperty = r1     // Catch: java.lang.Exception -> Lbf
            org.greenrobot.greendao.internal.TableStatements r0 = new org.greenrobot.greendao.internal.TableStatements     // Catch: java.lang.Exception -> Lbf
            java.lang.String r4 = r9.tablename     // Catch: java.lang.Exception -> Lbf
            java.lang.String[] r5 = r9.allColumns     // Catch: java.lang.Exception -> Lbf
            r0.<init>(r10, r4, r5, r11)     // Catch: java.lang.Exception -> Lbf
            r9.statements = r0     // Catch: java.lang.Exception -> Lbf
            if (r1 == 0) goto Lbc
            java.lang.Class<?> r10 = r1.type     // Catch: java.lang.Exception -> Lbf
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> Lbf
            boolean r11 = r10.equals(r11)     // Catch: java.lang.Exception -> Lbf
            if (r11 != 0) goto Lb8
            java.lang.Class<java.lang.Long> r11 = java.lang.Long.class
            boolean r11 = r10.equals(r11)     // Catch: java.lang.Exception -> Lbf
            if (r11 != 0) goto Lb8
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lbf
            boolean r11 = r10.equals(r11)     // Catch: java.lang.Exception -> Lbf
            if (r11 != 0) goto Lb8
            java.lang.Class<java.lang.Integer> r11 = java.lang.Integer.class
            boolean r11 = r10.equals(r11)     // Catch: java.lang.Exception -> Lbf
            if (r11 != 0) goto Lb8
            java.lang.Class r11 = java.lang.Short.TYPE     // Catch: java.lang.Exception -> Lbf
            boolean r11 = r10.equals(r11)     // Catch: java.lang.Exception -> Lbf
            if (r11 != 0) goto Lb8
            java.lang.Class<java.lang.Short> r11 = java.lang.Short.class
            boolean r11 = r10.equals(r11)     // Catch: java.lang.Exception -> Lbf
            if (r11 != 0) goto Lb8
            java.lang.Class r11 = java.lang.Byte.TYPE     // Catch: java.lang.Exception -> Lbf
            boolean r11 = r10.equals(r11)     // Catch: java.lang.Exception -> Lbf
            if (r11 != 0) goto Lb8
            java.lang.Class<java.lang.Byte> r11 = java.lang.Byte.class
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Exception -> Lbf
            if (r10 == 0) goto Lb9
        Lb8:
            r3 = r2
        Lb9:
            r9.keyIsNumeric = r3     // Catch: java.lang.Exception -> Lbf
            goto Lbe
        Lbc:
            r9.keyIsNumeric = r3     // Catch: java.lang.Exception -> Lbf
        Lbe:
            return
        Lbf:
            r10 = move-exception
            org.greenrobot.greendao.DaoException r11 = new org.greenrobot.greendao.DaoException
            java.lang.String r0 = "Could not init DAOConfig"
            r11.<init>(r0, r10)
            throw r11
    }

    public DaoConfig(org.greenrobot.greendao.internal.DaoConfig r2) {
            r1 = this;
            r1.<init>()
            org.greenrobot.greendao.database.Database r0 = r2.f618db
            r1.f618db = r0
            java.lang.String r0 = r2.tablename
            r1.tablename = r0
            org.greenrobot.greendao.Property[] r0 = r2.properties
            r1.properties = r0
            java.lang.String[] r0 = r2.allColumns
            r1.allColumns = r0
            java.lang.String[] r0 = r2.pkColumns
            r1.pkColumns = r0
            java.lang.String[] r0 = r2.nonPkColumns
            r1.nonPkColumns = r0
            org.greenrobot.greendao.Property r0 = r2.pkProperty
            r1.pkProperty = r0
            org.greenrobot.greendao.internal.TableStatements r0 = r2.statements
            r1.statements = r0
            boolean r2 = r2.keyIsNumeric
            r1.keyIsNumeric = r2
            return
    }

    private static org.greenrobot.greendao.Property[] reflectProperties(java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>> r6) throws java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = r6.getName()
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = "$Properties"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.Class r6 = java.lang.Class.forName(r6)
            java.lang.reflect.Field[] r6 = r6.getDeclaredFields()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L26:
            if (r2 >= r1) goto L44
            r3 = r6[r2]
            int r4 = r3.getModifiers()
            r5 = 9
            r4 = r4 & r5
            if (r4 != r5) goto L41
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof org.greenrobot.greendao.Property
            if (r4 == 0) goto L41
            org.greenrobot.greendao.Property r3 = (org.greenrobot.greendao.Property) r3
            r0.add(r3)
        L41:
            int r2 = r2 + 1
            goto L26
        L44:
            int r6 = r0.size()
            org.greenrobot.greendao.Property[] r6 = new org.greenrobot.greendao.Property[r6]
            java.util.Iterator r0 = r0.iterator()
        L4e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            org.greenrobot.greendao.Property r1 = (org.greenrobot.greendao.Property) r1
            int r2 = r1.ordinal
            r2 = r6[r2]
            if (r2 != 0) goto L65
            int r2 = r1.ordinal
            r6[r2] = r1
            goto L4e
        L65:
            org.greenrobot.greendao.DaoException r6 = new org.greenrobot.greendao.DaoException
            java.lang.String r0 = "Duplicate property ordinals"
            r6.<init>(r0)
            throw r6
        L6d:
            return r6
    }

    public void clearIdentityScope() {
            r1 = this;
            org.greenrobot.greendao.identityscope.IdentityScope<?, ?> r0 = r1.identityScope
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            org.greenrobot.greendao.internal.DaoConfig r0 = r1.m358clone()
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public org.greenrobot.greendao.internal.DaoConfig m358clone() {
            r1 = this;
            org.greenrobot.greendao.internal.DaoConfig r0 = new org.greenrobot.greendao.internal.DaoConfig
            r0.<init>(r1)
            return r0
    }

    public org.greenrobot.greendao.identityscope.IdentityScope<?, ?> getIdentityScope() {
            r1 = this;
            org.greenrobot.greendao.identityscope.IdentityScope<?, ?> r0 = r1.identityScope
            return r0
    }

    public void initIdentityScope(org.greenrobot.greendao.identityscope.IdentityScopeType r4) {
            r3 = this;
            org.greenrobot.greendao.identityscope.IdentityScopeType r0 = org.greenrobot.greendao.identityscope.IdentityScopeType.None
            if (r4 != r0) goto L8
            r4 = 0
            r3.identityScope = r4
            goto L1f
        L8:
            org.greenrobot.greendao.identityscope.IdentityScopeType r0 = org.greenrobot.greendao.identityscope.IdentityScopeType.Session
            if (r4 != r0) goto L20
            boolean r4 = r3.keyIsNumeric
            if (r4 == 0) goto L18
            org.greenrobot.greendao.identityscope.IdentityScopeLong r4 = new org.greenrobot.greendao.identityscope.IdentityScopeLong
            r4.<init>()
            r3.identityScope = r4
            goto L1f
        L18:
            org.greenrobot.greendao.identityscope.IdentityScopeObject r4 = new org.greenrobot.greendao.identityscope.IdentityScopeObject
            r4.<init>()
            r3.identityScope = r4
        L1f:
            return
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported type: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setIdentityScope(org.greenrobot.greendao.identityscope.IdentityScope<?, ?> r1) {
            r0 = this;
            r0.identityScope = r1
            return
    }
}
