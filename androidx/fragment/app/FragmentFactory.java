package androidx.fragment.app;

/* loaded from: classes.dex */
public class FragmentFactory {
    private static final androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> sClassCacheMap = null;

    static {
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.fragment.app.FragmentFactory.sClassCacheMap = r0
            return
    }

    public FragmentFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean isFragmentClass(java.lang.ClassLoader r0, java.lang.String r1) {
            java.lang.Class r0 = loadClass(r0, r1)     // Catch: java.lang.ClassNotFoundException -> Lb
            java.lang.Class<androidx.fragment.app.Fragment> r1 = androidx.fragment.app.Fragment.class
            boolean r0 = r1.isAssignableFrom(r0)     // Catch: java.lang.ClassNotFoundException -> Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private static java.lang.Class<?> loadClass(java.lang.ClassLoader r2, java.lang.String r3) throws java.lang.ClassNotFoundException {
            androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> r0 = androidx.fragment.app.FragmentFactory.sClassCacheMap
            java.lang.Object r1 = r0.get(r2)
            androidx.collection.SimpleArrayMap r1 = (androidx.collection.SimpleArrayMap) r1
            if (r1 != 0) goto L12
            androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
            r1.<init>()
            r0.put(r2, r1)
        L12:
            java.lang.Object r0 = r1.get(r3)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L22
            r0 = 0
            java.lang.Class r0 = java.lang.Class.forName(r3, r0, r2)
            r1.put(r3, r0)
        L22:
            return r0
    }

    public static java.lang.Class<? extends androidx.fragment.app.Fragment> loadFragmentClass(java.lang.ClassLoader r3, java.lang.String r4) {
            java.lang.String r0 = "Unable to instantiate fragment "
            java.lang.Class r3 = loadClass(r3, r4)     // Catch: java.lang.ClassCastException -> L7 java.lang.ClassNotFoundException -> L21
            return r3
        L7:
            r3 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r1 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r0 = ": make sure class is a valid subclass of Fragment"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4, r3)
            throw r1
        L21:
            r3 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r1 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r0 = ": make sure class name exists"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4, r3)
            throw r1
    }

    public androidx.fragment.app.Fragment instantiate(java.lang.ClassLoader r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = ": make sure class name exists, is public, and has an empty constructor that is public"
            java.lang.String r1 = "Unable to instantiate fragment "
            java.lang.Class r5 = loadFragmentClass(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L64
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L64
            java.lang.reflect.Constructor r5 = r5.getConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L64
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L64
            java.lang.Object r5 = r5.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L64
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L64
            return r5
        L18:
            r5 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r0 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r1 = ": calling Fragment constructor caused an exception"
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6, r5)
            throw r0
        L32:
            r5 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r0 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r1 = ": could not find Fragment constructor"
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6, r5)
            throw r0
        L4c:
            r5 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.StringBuilder r6 = r3.append(r6)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r2.<init>(r6, r5)
            throw r2
        L64:
            r5 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.StringBuilder r6 = r3.append(r6)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r2.<init>(r6, r5)
            throw r2
    }
}
