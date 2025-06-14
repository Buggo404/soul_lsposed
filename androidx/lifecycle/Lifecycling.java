package androidx.lifecycle;

/* loaded from: classes.dex */
public class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;
    private static java.util.Map<java.lang.Class<?>, java.lang.Integer> sCallbackCache;
    private static java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> sClassToAdapters;


    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.Lifecycling.sCallbackCache = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.Lifecycling.sClassToAdapters = r0
            return
    }

    private Lifecycling() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.lifecycle.GeneratedAdapter createGeneratedAdapter(java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> r2, java.lang.Object r3) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
            java.lang.Object r2 = r2.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
            androidx.lifecycle.GeneratedAdapter r2 = (androidx.lifecycle.GeneratedAdapter) r2     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
            return r2
        Ld:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L14:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L1b:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    private static java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> generatedConstructor(java.lang.Class<?> r4) {
            java.lang.Package r0 = r4.getPackage()     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            java.lang.String r1 = r4.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.getName()     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            goto L11
        Lf:
            java.lang.String r0 = ""
        L11:
            boolean r2 = r0.isEmpty()     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            r3 = 1
            if (r2 == 0) goto L19
            goto L22
        L19:
            int r2 = r0.length()     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
        L22:
            java.lang.String r1 = getAdapterName(r1)     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            boolean r2 = r0.isEmpty()     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            if (r2 == 0) goto L2d
            goto L44
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            r2.<init>()     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            java.lang.String r2 = "."
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            java.lang.String r1 = r0.toString()     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
        L44:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            java.lang.reflect.Constructor r4 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            boolean r0 = r4.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
            if (r0 != 0) goto L5a
            r4.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L5b java.lang.ClassNotFoundException -> L62
        L5a:
            return r4
        L5b:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
        L62:
            r4 = 0
            return r4
    }

    public static java.lang.String getAdapterName(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "."
            java.lang.String r2 = "_"
            java.lang.String r3 = r3.replace(r1, r2)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "_LifecycleAdapter"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    @java.lang.Deprecated
    static androidx.lifecycle.GenericLifecycleObserver getCallback(java.lang.Object r1) {
            androidx.lifecycle.LifecycleEventObserver r1 = lifecycleEventObserver(r1)
            androidx.lifecycle.Lifecycling$1 r0 = new androidx.lifecycle.Lifecycling$1
            r0.<init>(r1)
            return r0
    }

    private static int getObserverConstructorType(java.lang.Class<?> r3) {
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r0 = androidx.lifecycle.Lifecycling.sCallbackCache
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r3 = r0.intValue()
            return r3
        Lf:
            int r0 = resolveObserverCallbackType(r3)
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r1 = androidx.lifecycle.Lifecycling.sCallbackCache
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r3, r2)
            return r0
    }

    private static boolean isLifecycleParent(java.lang.Class<?> r1) {
            if (r1 == 0) goto Lc
            java.lang.Class<androidx.lifecycle.LifecycleObserver> r0 = androidx.lifecycle.LifecycleObserver.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    static androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver(java.lang.Object r4) {
            boolean r0 = r4 instanceof androidx.lifecycle.LifecycleEventObserver
            boolean r1 = r4 instanceof androidx.lifecycle.FullLifecycleObserver
            if (r0 == 0) goto L13
            if (r1 == 0) goto L13
            androidx.lifecycle.FullLifecycleObserverAdapter r0 = new androidx.lifecycle.FullLifecycleObserverAdapter
            r1 = r4
            androidx.lifecycle.FullLifecycleObserver r1 = (androidx.lifecycle.FullLifecycleObserver) r1
            androidx.lifecycle.LifecycleEventObserver r4 = (androidx.lifecycle.LifecycleEventObserver) r4
            r0.<init>(r1, r4)
            return r0
        L13:
            if (r1 == 0) goto L1e
            androidx.lifecycle.FullLifecycleObserverAdapter r0 = new androidx.lifecycle.FullLifecycleObserverAdapter
            androidx.lifecycle.FullLifecycleObserver r4 = (androidx.lifecycle.FullLifecycleObserver) r4
            r1 = 0
            r0.<init>(r4, r1)
            return r0
        L1e:
            if (r0 == 0) goto L23
            androidx.lifecycle.LifecycleEventObserver r4 = (androidx.lifecycle.LifecycleEventObserver) r4
            return r4
        L23:
            java.lang.Class r0 = r4.getClass()
            int r1 = getObserverConstructorType(r0)
            r2 = 2
            if (r1 != r2) goto L6f
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r1 = androidx.lifecycle.Lifecycling.sClassToAdapters
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L4e
            java.lang.Object r0 = r0.get(r2)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            androidx.lifecycle.GeneratedAdapter r4 = createGeneratedAdapter(r0, r4)
            androidx.lifecycle.SingleGeneratedAdapterObserver r0 = new androidx.lifecycle.SingleGeneratedAdapterObserver
            r0.<init>(r4)
            return r0
        L4e:
            int r1 = r0.size()
            androidx.lifecycle.GeneratedAdapter[] r1 = new androidx.lifecycle.GeneratedAdapter[r1]
        L54:
            int r3 = r0.size()
            if (r2 >= r3) goto L69
            java.lang.Object r3 = r0.get(r2)
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            androidx.lifecycle.GeneratedAdapter r3 = createGeneratedAdapter(r3, r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L54
        L69:
            androidx.lifecycle.CompositeGeneratedAdaptersObserver r4 = new androidx.lifecycle.CompositeGeneratedAdaptersObserver
            r4.<init>(r1)
            return r4
        L6f:
            androidx.lifecycle.ReflectiveGenericLifecycleObserver r0 = new androidx.lifecycle.ReflectiveGenericLifecycleObserver
            r0.<init>(r4)
            return r0
    }

    private static int resolveObserverCallbackType(java.lang.Class<?> r8) {
            java.lang.String r0 = r8.getCanonicalName()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.reflect.Constructor r0 = generatedConstructor(r8)
            r2 = 2
            if (r0 == 0) goto L19
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r1 = androidx.lifecycle.Lifecycling.sClassToAdapters
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.put(r8, r0)
            return r2
        L19:
            androidx.lifecycle.ClassesInfoCache r0 = androidx.lifecycle.ClassesInfoCache.sInstance
            boolean r0 = r0.hasLifecycleMethods(r8)
            if (r0 == 0) goto L22
            return r1
        L22:
            java.lang.Class r0 = r8.getSuperclass()
            boolean r3 = isLifecycleParent(r0)
            if (r3 == 0) goto L41
            int r3 = getObserverConstructorType(r0)
            if (r3 != r1) goto L33
            return r1
        L33:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r4 = androidx.lifecycle.Lifecycling.sClassToAdapters
            java.lang.Object r0 = r4.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r3.<init>(r0)
            goto L42
        L41:
            r3 = 0
        L42:
            java.lang.Class[] r0 = r8.getInterfaces()
            int r4 = r0.length
            r5 = 0
        L48:
            if (r5 >= r4) goto L6f
            r6 = r0[r5]
            boolean r7 = isLifecycleParent(r6)
            if (r7 != 0) goto L53
            goto L6c
        L53:
            int r7 = getObserverConstructorType(r6)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            if (r3 != 0) goto L61
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L61:
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r7 = androidx.lifecycle.Lifecycling.sClassToAdapters
            java.lang.Object r6 = r7.get(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            r3.addAll(r6)
        L6c:
            int r5 = r5 + 1
            goto L48
        L6f:
            if (r3 == 0) goto L77
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r0 = androidx.lifecycle.Lifecycling.sClassToAdapters
            r0.put(r8, r3)
            return r2
        L77:
            return r1
    }
}
