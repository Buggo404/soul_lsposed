package com.google.gson.internal;

/* loaded from: classes.dex */
public abstract class UnsafeAllocator {





    public UnsafeAllocator() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(java.lang.Class r0) {
            assertInstantiable(r0)
            return
    }

    private static void assertInstantiable(java.lang.Class<?> r3) {
            java.lang.String r3 = checkInstantiable(r3)
            if (r3 != 0) goto L7
            return
        L7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "UnsafeAllocator is used for non-instantiable type: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    static java.lang.String checkInstantiable(java.lang.Class<?> r2) {
            int r0 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isInterface(r0)
            if (r1 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
        L1e:
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
        L38:
            r2 = 0
            return r2
    }

    public static com.google.gson.internal.UnsafeAllocator create() {
            java.lang.String r0 = "newInstance"
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r4 = "sun.misc.Unsafe"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L2a
            java.lang.String r5 = "theUnsafe"
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch: java.lang.Exception -> L2a
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L2a
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Exception -> L2a
            java.lang.String r6 = "allocateInstance"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2a
            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
            r7[r2] = r8     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Method r4 = r4.getMethod(r6, r7)     // Catch: java.lang.Exception -> L2a
            com.google.gson.internal.UnsafeAllocator$1 r6 = new com.google.gson.internal.UnsafeAllocator$1     // Catch: java.lang.Exception -> L2a
            r6.<init>(r4, r5)     // Catch: java.lang.Exception -> L2a
            return r6
        L2a:
            r4 = 2
            java.lang.Class<java.io.ObjectStreamClass> r5 = java.io.ObjectStreamClass.class
            java.lang.String r6 = "getConstructorId"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L65
            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
            r7[r2] = r8     // Catch: java.lang.Exception -> L65
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch: java.lang.Exception -> L65
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L65
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L65
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r2] = r7     // Catch: java.lang.Exception -> L65
            java.lang.Object r1 = r5.invoke(r1, r6)     // Catch: java.lang.Exception -> L65
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L65
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L65
            java.lang.Class<java.io.ObjectStreamClass> r5 = java.io.ObjectStreamClass.class
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L65
            java.lang.Class<java.lang.Class> r7 = java.lang.Class.class
            r6[r2] = r7     // Catch: java.lang.Exception -> L65
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L65
            r6[r3] = r7     // Catch: java.lang.Exception -> L65
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r0, r6)     // Catch: java.lang.Exception -> L65
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L65
            com.google.gson.internal.UnsafeAllocator$2 r6 = new com.google.gson.internal.UnsafeAllocator$2     // Catch: java.lang.Exception -> L65
            r6.<init>(r5, r1)     // Catch: java.lang.Exception -> L65
            return r6
        L65:
            java.lang.Class<java.io.ObjectInputStream> r1 = java.io.ObjectInputStream.class
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L7e
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r4[r2] = r5     // Catch: java.lang.Exception -> L7e
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r4[r3] = r2     // Catch: java.lang.Exception -> L7e
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r4)     // Catch: java.lang.Exception -> L7e
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> L7e
            com.google.gson.internal.UnsafeAllocator$3 r1 = new com.google.gson.internal.UnsafeAllocator$3     // Catch: java.lang.Exception -> L7e
            r1.<init>(r0)     // Catch: java.lang.Exception -> L7e
            return r1
        L7e:
            com.google.gson.internal.UnsafeAllocator$4 r0 = new com.google.gson.internal.UnsafeAllocator$4
            r0.<init>()
            return r0
    }

    public abstract <T> T newInstance(java.lang.Class<T> r1) throws java.lang.Exception;
}
