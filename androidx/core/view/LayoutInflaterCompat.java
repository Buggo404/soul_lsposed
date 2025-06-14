package androidx.core.view;

/* loaded from: classes.dex */
public final class LayoutInflaterCompat {
    private static final java.lang.String TAG = "LayoutInflaterCompatHC";
    private static boolean sCheckedField;
    private static java.lang.reflect.Field sLayoutInflaterFactory2Field;

    static class Factory2Wrapper implements android.view.LayoutInflater.Factory2 {
        final androidx.core.view.LayoutInflaterFactory mDelegateFactory;

        Factory2Wrapper(androidx.core.view.LayoutInflaterFactory r1) {
                r0 = this;
                r0.<init>()
                r0.mDelegateFactory = r1
                return
        }

        @Override // android.view.LayoutInflater.Factory2
        public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
                r1 = this;
                androidx.core.view.LayoutInflaterFactory r0 = r1.mDelegateFactory
                android.view.View r2 = r0.onCreateView(r2, r3, r4, r5)
                return r2
        }

        @Override // android.view.LayoutInflater.Factory
        public android.view.View onCreateView(java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
                r2 = this;
                androidx.core.view.LayoutInflaterFactory r0 = r2.mDelegateFactory
                r1 = 0
                android.view.View r3 = r0.onCreateView(r1, r3, r4, r5)
                return r3
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class r1 = r2.getClass()
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "{"
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.core.view.LayoutInflaterFactory r1 = r2.mDelegateFactory
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "}"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private LayoutInflaterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void forceSetFactory2(android.view.LayoutInflater r6, android.view.LayoutInflater.Factory2 r7) {
            boolean r0 = androidx.core.view.LayoutInflaterCompat.sCheckedField
            java.lang.String r1 = "; inflation may have unexpected results."
            java.lang.String r2 = "LayoutInflaterCompatHC"
            if (r0 != 0) goto L36
            r0 = 1
            java.lang.Class<android.view.LayoutInflater> r3 = android.view.LayoutInflater.class
            java.lang.String r4 = "mFactory2"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L17
            androidx.core.view.LayoutInflaterCompat.sLayoutInflaterFactory2Field = r3     // Catch: java.lang.NoSuchFieldException -> L17
            r3.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L17
            goto L34
        L17:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "forceSetFactory2 Could not find field 'mFactory2' on class "
            r4.<init>(r5)
            java.lang.Class<android.view.LayoutInflater> r5 = android.view.LayoutInflater.class
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r2, r4, r3)
        L34:
            androidx.core.view.LayoutInflaterCompat.sCheckedField = r0
        L36:
            java.lang.reflect.Field r0 = androidx.core.view.LayoutInflaterCompat.sLayoutInflaterFactory2Field
            if (r0 == 0) goto L55
            r0.set(r6, r7)     // Catch: java.lang.IllegalAccessException -> L3e
            goto L55
        L3e:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "forceSetFactory2 could not set the Factory2 on LayoutInflater "
            r0.<init>(r3)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r2, r6, r7)
        L55:
            return
    }

    @java.lang.Deprecated
    public static androidx.core.view.LayoutInflaterFactory getFactory(android.view.LayoutInflater r1) {
            android.view.LayoutInflater$Factory r1 = r1.getFactory()
            boolean r0 = r1 instanceof androidx.core.view.LayoutInflaterCompat.Factory2Wrapper
            if (r0 == 0) goto Ld
            androidx.core.view.LayoutInflaterCompat$Factory2Wrapper r1 = (androidx.core.view.LayoutInflaterCompat.Factory2Wrapper) r1
            androidx.core.view.LayoutInflaterFactory r1 = r1.mDelegateFactory
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @java.lang.Deprecated
    public static void setFactory(android.view.LayoutInflater r1, androidx.core.view.LayoutInflaterFactory r2) {
            if (r2 == 0) goto L8
            androidx.core.view.LayoutInflaterCompat$Factory2Wrapper r0 = new androidx.core.view.LayoutInflaterCompat$Factory2Wrapper
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.setFactory2(r0)
            return
    }

    public static void setFactory2(android.view.LayoutInflater r0, android.view.LayoutInflater.Factory2 r1) {
            r0.setFactory2(r1)
            return
    }
}
