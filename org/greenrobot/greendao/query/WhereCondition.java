package org.greenrobot.greendao.query;

/* loaded from: classes.dex */
public interface WhereCondition {

    public static abstract class AbstractCondition implements org.greenrobot.greendao.query.WhereCondition {
        protected final boolean hasSingleValue;
        protected final java.lang.Object value;
        protected final java.lang.Object[] values;

        public AbstractCondition() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.hasSingleValue = r0
                r0 = 0
                r1.value = r0
                r1.values = r0
                return
        }

        public AbstractCondition(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r1 = 1
                r0.hasSingleValue = r1
                r1 = 0
                r0.values = r1
                return
        }

        public AbstractCondition(java.lang.Object[] r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.value = r0
                r0 = 0
                r1.hasSingleValue = r0
                r1.values = r2
                return
        }

        @Override // org.greenrobot.greendao.query.WhereCondition
        public void appendValuesTo(java.util.List<java.lang.Object> r5) {
                r4 = this;
                boolean r0 = r4.hasSingleValue
                if (r0 == 0) goto La
                java.lang.Object r0 = r4.value
                r5.add(r0)
                goto L1a
            La:
                java.lang.Object[] r0 = r4.values
                if (r0 == 0) goto L1a
                int r1 = r0.length
                r2 = 0
            L10:
                if (r2 >= r1) goto L1a
                r3 = r0[r2]
                r5.add(r3)
                int r2 = r2 + 1
                goto L10
            L1a:
                return
        }
    }

    public static class PropertyCondition extends org.greenrobot.greendao.query.WhereCondition.AbstractCondition {

        /* renamed from: op */
        public final java.lang.String f620op;
        public final org.greenrobot.greendao.Property property;

        public PropertyCondition(org.greenrobot.greendao.Property r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.property = r1
                r0.f620op = r2
                return
        }

        public PropertyCondition(org.greenrobot.greendao.Property r1, java.lang.String r2, java.lang.Object r3) {
                r0 = this;
                java.lang.Object r3 = checkValueForType(r1, r3)
                r0.<init>(r3)
                r0.property = r1
                r0.f620op = r2
                return
        }

        public PropertyCondition(org.greenrobot.greendao.Property r1, java.lang.String r2, java.lang.Object[] r3) {
                r0 = this;
                java.lang.Object[] r3 = checkValuesForType(r1, r3)
                r0.<init>(r3)
                r0.property = r1
                r0.f620op = r2
                return
        }

        private static java.lang.Object checkValueForType(org.greenrobot.greendao.Property r2, java.lang.Object r3) {
                if (r3 == 0) goto L15
                java.lang.Class r0 = r3.getClass()
                boolean r0 = r0.isArray()
                if (r0 != 0) goto Ld
                goto L15
            Ld:
                org.greenrobot.greendao.DaoException r2 = new org.greenrobot.greendao.DaoException
                java.lang.String r3 = "Illegal value: found array, but simple object required"
                r2.<init>(r3)
                throw r2
            L15:
                java.lang.Class<?> r0 = r2.type
                java.lang.Class<java.util.Date> r1 = java.util.Date.class
                if (r0 != r1) goto L44
                boolean r2 = r3 instanceof java.util.Date
                if (r2 == 0) goto L2a
                java.util.Date r3 = (java.util.Date) r3
                long r2 = r3.getTime()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                return r2
            L2a:
                boolean r2 = r3 instanceof java.lang.Long
                if (r2 == 0) goto L2f
                return r3
            L2f:
                org.greenrobot.greendao.DaoException r2 = new org.greenrobot.greendao.DaoException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Illegal date value: expected java.util.Date or Long for value "
                r0.<init>(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L44:
                java.lang.Class<?> r0 = r2.type
                java.lang.Class r1 = java.lang.Boolean.TYPE
                if (r0 == r1) goto L50
                java.lang.Class<?> r2 = r2.type
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                if (r2 != r0) goto Lbc
            L50:
                boolean r2 = r3 instanceof java.lang.Boolean
                if (r2 == 0) goto L5f
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r2 = r3.booleanValue()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
            L5f:
                boolean r2 = r3 instanceof java.lang.Number
                r0 = 1
                if (r2 == 0) goto L85
                r2 = r3
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                if (r2 == 0) goto Lbc
                if (r2 != r0) goto L70
                goto Lbc
            L70:
                org.greenrobot.greendao.DaoException r2 = new org.greenrobot.greendao.DaoException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Illegal boolean value: numbers must be 0 or 1, but was "
                r0.<init>(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L85:
                boolean r2 = r3 instanceof java.lang.String
                if (r2 == 0) goto Lbc
                r2 = r3
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r1 = "TRUE"
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 == 0) goto L99
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                return r2
            L99:
                java.lang.String r0 = "FALSE"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto La7
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
            La7:
                org.greenrobot.greendao.DaoException r2 = new org.greenrobot.greendao.DaoException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Illegal boolean value: Strings must be \"TRUE\" or \"FALSE\" (case insensitive), but was "
                r0.<init>(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            Lbc:
                return r3
        }

        private static java.lang.Object[] checkValuesForType(org.greenrobot.greendao.Property r2, java.lang.Object[] r3) {
                r0 = 0
            L1:
                int r1 = r3.length
                if (r0 >= r1) goto Lf
                r1 = r3[r0]
                java.lang.Object r1 = checkValueForType(r2, r1)
                r3[r0] = r1
                int r0 = r0 + 1
                goto L1
            Lf:
                return r3
        }

        @Override // org.greenrobot.greendao.query.WhereCondition
        public void appendTo(java.lang.StringBuilder r2, java.lang.String r3) {
                r1 = this;
                org.greenrobot.greendao.Property r0 = r1.property
                java.lang.StringBuilder r2 = org.greenrobot.greendao.internal.SqlUtils.appendProperty(r2, r3, r0)
                java.lang.String r3 = r1.f620op
                r2.append(r3)
                return
        }
    }

    public static class StringCondition extends org.greenrobot.greendao.query.WhereCondition.AbstractCondition {
        protected final java.lang.String string;

        public StringCondition(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.string = r1
                return
        }

        public StringCondition(java.lang.String r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>(r2)
                r0.string = r1
                return
        }

        public StringCondition(java.lang.String r1, java.lang.Object... r2) {
                r0 = this;
                r0.<init>(r2)
                r0.string = r1
                return
        }

        @Override // org.greenrobot.greendao.query.WhereCondition
        public void appendTo(java.lang.StringBuilder r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = r0.string
                r1.append(r2)
                return
        }
    }

    void appendTo(java.lang.StringBuilder r1, java.lang.String r2);

    void appendValuesTo(java.util.List<java.lang.Object> r1);
}
