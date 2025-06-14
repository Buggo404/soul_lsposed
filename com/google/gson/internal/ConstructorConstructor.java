package com.google.gson.internal;

/* loaded from: classes.dex */
public final class ConstructorConstructor {
    private final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    private final java.util.List<com.google.gson.ReflectionAccessFilter> reflectionFilters;
    private final boolean useJdkUnsafe;





















    public ConstructorConstructor(java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1, boolean r2, java.util.List<com.google.gson.ReflectionAccessFilter> r3) {
            r0 = this;
            r0.<init>()
            r0.instanceCreators = r1
            r0.useJdkUnsafe = r2
            r0.reflectionFilters = r3
            return
    }

    private static <T> com.google.gson.internal.ObjectConstructor<T> newDefaultConstructor(java.lang.Class<? super T> r4, com.google.gson.ReflectionAccessFilter.FilterResult r5) {
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            r0 = 0
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L5f
            java.lang.reflect.Constructor r2 = r4.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L5f
            com.google.gson.ReflectionAccessFilter$FilterResult r3 = com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW
            if (r5 == r3) goto L2b
            boolean r1 = com.google.gson.internal.ReflectionAccessFilterHelper.canAccess(r2, r1)
            if (r1 == 0) goto L2c
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL
            if (r5 != r1) goto L2b
            int r1 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L2c
        L2b:
            r0 = 1
        L2c:
            if (r0 != 0) goto L49
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to invoke no-args constructor of "
            r5.<init>(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.gson.internal.ConstructorConstructor$7 r5 = new com.google.gson.internal.ConstructorConstructor$7
            r5.<init>(r4)
            return r5
        L49:
            com.google.gson.ReflectionAccessFilter$FilterResult r4 = com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW
            if (r5 != r4) goto L59
            java.lang.String r4 = com.google.gson.internal.reflect.ReflectionHelper.tryMakeAccessible(r2)
            if (r4 == 0) goto L59
            com.google.gson.internal.ConstructorConstructor$8 r5 = new com.google.gson.internal.ConstructorConstructor$8
            r5.<init>(r4)
            return r5
        L59:
            com.google.gson.internal.ConstructorConstructor$9 r4 = new com.google.gson.internal.ConstructorConstructor$9
            r4.<init>(r2)
            return r4
        L5f:
            return r1
    }

    private static <T> com.google.gson.internal.ObjectConstructor<T> newDefaultImplementationConstructor(java.lang.reflect.Type r1, java.lang.Class<? super T> r2) {
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L38
            java.lang.Class<java.util.SortedSet> r1 = java.util.SortedSet.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L16
            com.google.gson.internal.ConstructorConstructor$10 r1 = new com.google.gson.internal.ConstructorConstructor$10
            r1.<init>()
            return r1
        L16:
            java.lang.Class<java.util.Set> r1 = java.util.Set.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L24
            com.google.gson.internal.ConstructorConstructor$11 r1 = new com.google.gson.internal.ConstructorConstructor$11
            r1.<init>()
            return r1
        L24:
            java.lang.Class<java.util.Queue> r1 = java.util.Queue.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L32
            com.google.gson.internal.ConstructorConstructor$12 r1 = new com.google.gson.internal.ConstructorConstructor$12
            r1.<init>()
            return r1
        L32:
            com.google.gson.internal.ConstructorConstructor$13 r1 = new com.google.gson.internal.ConstructorConstructor$13
            r1.<init>()
            return r1
        L38:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L93
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r0 = java.util.concurrent.ConcurrentNavigableMap.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L4e
            com.google.gson.internal.ConstructorConstructor$14 r1 = new com.google.gson.internal.ConstructorConstructor$14
            r1.<init>()
            return r1
        L4e:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r0 = java.util.concurrent.ConcurrentMap.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L5c
            com.google.gson.internal.ConstructorConstructor$15 r1 = new com.google.gson.internal.ConstructorConstructor$15
            r1.<init>()
            return r1
        L5c:
            java.lang.Class<java.util.SortedMap> r0 = java.util.SortedMap.class
            boolean r2 = r0.isAssignableFrom(r2)
            if (r2 == 0) goto L6a
            com.google.gson.internal.ConstructorConstructor$16 r1 = new com.google.gson.internal.ConstructorConstructor$16
            r1.<init>()
            return r1
        L6a:
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L8d
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r0 = 0
            r1 = r1[r0]
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            java.lang.Class r1 = r1.getRawType()
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 != 0) goto L8d
            com.google.gson.internal.ConstructorConstructor$17 r1 = new com.google.gson.internal.ConstructorConstructor$17
            r1.<init>()
            return r1
        L8d:
            com.google.gson.internal.ConstructorConstructor$18 r1 = new com.google.gson.internal.ConstructorConstructor$18
            r1.<init>()
            return r1
        L93:
            r1 = 0
            return r1
    }

    private static <T> com.google.gson.internal.ObjectConstructor<T> newSpecialCollectionConstructor(java.lang.reflect.Type r1, java.lang.Class<? super T> r2) {
            java.lang.Class<java.util.EnumSet> r0 = java.util.EnumSet.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto Le
            com.google.gson.internal.ConstructorConstructor$5 r2 = new com.google.gson.internal.ConstructorConstructor$5
            r2.<init>(r1)
            return r2
        Le:
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r2 != r0) goto L18
            com.google.gson.internal.ConstructorConstructor$6 r2 = new com.google.gson.internal.ConstructorConstructor$6
            r2.<init>(r1)
            return r2
        L18:
            r1 = 0
            return r1
    }

    private <T> com.google.gson.internal.ObjectConstructor<T> newUnsafeAllocator(java.lang.Class<? super T> r3) {
            r2 = this;
            boolean r0 = r2.useJdkUnsafe
            if (r0 == 0) goto La
            com.google.gson.internal.ConstructorConstructor$19 r0 = new com.google.gson.internal.ConstructorConstructor$19
            r0.<init>(r2, r3)
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create instance of "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.google.gson.internal.ConstructorConstructor$20 r0 = new com.google.gson.internal.ConstructorConstructor$20
            r0.<init>(r2, r3)
            return r0
    }

    public <T> com.google.gson.internal.ObjectConstructor<T> get(com.google.gson.reflect.TypeToken<T> r4) {
            r3 = this;
            java.lang.reflect.Type r0 = r4.getType()
            java.lang.Class r4 = r4.getRawType()
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1 = r3.instanceCreators
            java.lang.Object r1 = r1.get(r0)
            com.google.gson.InstanceCreator r1 = (com.google.gson.InstanceCreator) r1
            if (r1 == 0) goto L18
            com.google.gson.internal.ConstructorConstructor$1 r4 = new com.google.gson.internal.ConstructorConstructor$1
            r4.<init>(r3, r1, r0)
            return r4
        L18:
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1 = r3.instanceCreators
            java.lang.Object r1 = r1.get(r4)
            com.google.gson.InstanceCreator r1 = (com.google.gson.InstanceCreator) r1
            if (r1 == 0) goto L28
            com.google.gson.internal.ConstructorConstructor$2 r4 = new com.google.gson.internal.ConstructorConstructor$2
            r4.<init>(r3, r1, r0)
            return r4
        L28:
            com.google.gson.internal.ObjectConstructor r1 = newSpecialCollectionConstructor(r0, r4)
            if (r1 == 0) goto L2f
            return r1
        L2f:
            java.util.List<com.google.gson.ReflectionAccessFilter> r1 = r3.reflectionFilters
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.internal.ReflectionAccessFilterHelper.getFilterResult(r1, r4)
            com.google.gson.internal.ObjectConstructor r2 = newDefaultConstructor(r4, r1)
            if (r2 == 0) goto L3c
            return r2
        L3c:
            com.google.gson.internal.ObjectConstructor r0 = newDefaultImplementationConstructor(r0, r4)
            if (r0 == 0) goto L43
            return r0
        L43:
            java.lang.String r0 = com.google.gson.internal.UnsafeAllocator.checkInstantiable(r4)
            if (r0 == 0) goto L4f
            com.google.gson.internal.ConstructorConstructor$3 r4 = new com.google.gson.internal.ConstructorConstructor$3
            r4.<init>(r3, r0)
            return r4
        L4f:
            com.google.gson.ReflectionAccessFilter$FilterResult r0 = com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW
            if (r1 != r0) goto L58
            com.google.gson.internal.ObjectConstructor r4 = r3.newUnsafeAllocator(r4)
            return r4
        L58:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create instance of "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.google.gson.internal.ConstructorConstructor$4 r0 = new com.google.gson.internal.ConstructorConstructor$4
            r0.<init>(r3, r4)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r0 = r1.instanceCreators
            java.lang.String r0 = r0.toString()
            return r0
    }
}
