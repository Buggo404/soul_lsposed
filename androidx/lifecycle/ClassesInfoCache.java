package androidx.lifecycle;

/* loaded from: classes.dex */
final class ClassesInfoCache {
    private static final int CALL_TYPE_NO_ARG = 0;
    private static final int CALL_TYPE_PROVIDER = 1;
    private static final int CALL_TYPE_PROVIDER_WITH_EVENT = 2;
    static androidx.lifecycle.ClassesInfoCache sInstance;
    private final java.util.Map<java.lang.Class<?>, androidx.lifecycle.ClassesInfoCache.CallbackInfo> mCallbackMap;
    private final java.util.Map<java.lang.Class<?>, java.lang.Boolean> mHasLifecycleMethods;

    static class CallbackInfo {
        final java.util.Map<androidx.lifecycle.Lifecycle.Event, java.util.List<androidx.lifecycle.ClassesInfoCache.MethodReference>> mEventToHandlers;
        final java.util.Map<androidx.lifecycle.ClassesInfoCache.MethodReference, androidx.lifecycle.Lifecycle.Event> mHandlerToEvent;

        CallbackInfo(java.util.Map<androidx.lifecycle.ClassesInfoCache.MethodReference, androidx.lifecycle.Lifecycle.Event> r5) {
                r4 = this;
                r4.<init>()
                r4.mHandlerToEvent = r5
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r4.mEventToHandlers = r0
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L14:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L42
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getValue()
                androidx.lifecycle.Lifecycle$Event r1 = (androidx.lifecycle.Lifecycle.Event) r1
                java.util.Map<androidx.lifecycle.Lifecycle$Event, java.util.List<androidx.lifecycle.ClassesInfoCache$MethodReference>> r2 = r4.mEventToHandlers
                java.lang.Object r2 = r2.get(r1)
                java.util.List r2 = (java.util.List) r2
                if (r2 != 0) goto L3a
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Map<androidx.lifecycle.Lifecycle$Event, java.util.List<androidx.lifecycle.ClassesInfoCache$MethodReference>> r3 = r4.mEventToHandlers
                r3.put(r1, r2)
            L3a:
                java.lang.Object r0 = r0.getKey()
                r2.add(r0)
                goto L14
            L42:
                return
        }

        private static void invokeMethodsForEvent(java.util.List<androidx.lifecycle.ClassesInfoCache.MethodReference> r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4, java.lang.Object r5) {
                if (r2 == 0) goto L16
                int r0 = r2.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L16
                java.lang.Object r1 = r2.get(r0)
                androidx.lifecycle.ClassesInfoCache$MethodReference r1 = (androidx.lifecycle.ClassesInfoCache.MethodReference) r1
                r1.invokeCallback(r3, r4, r5)
                int r0 = r0 + (-1)
                goto L8
            L16:
                return
        }

        void invokeCallbacks(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4, java.lang.Object r5) {
                r2 = this;
                java.util.Map<androidx.lifecycle.Lifecycle$Event, java.util.List<androidx.lifecycle.ClassesInfoCache$MethodReference>> r0 = r2.mEventToHandlers
                java.lang.Object r0 = r0.get(r4)
                java.util.List r0 = (java.util.List) r0
                invokeMethodsForEvent(r0, r3, r4, r5)
                java.util.Map<androidx.lifecycle.Lifecycle$Event, java.util.List<androidx.lifecycle.ClassesInfoCache$MethodReference>> r0 = r2.mEventToHandlers
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY
                java.lang.Object r0 = r0.get(r1)
                java.util.List r0 = (java.util.List) r0
                invokeMethodsForEvent(r0, r3, r4, r5)
                return
        }
    }

    static final class MethodReference {
        final int mCallType;
        final java.lang.reflect.Method mMethod;

        MethodReference(int r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.mCallType = r1
                r0.mMethod = r2
                r1 = 1
                r2.setAccessible(r1)
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.lifecycle.ClassesInfoCache.MethodReference
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.lifecycle.ClassesInfoCache$MethodReference r5 = (androidx.lifecycle.ClassesInfoCache.MethodReference) r5
                int r1 = r4.mCallType
                int r3 = r5.mCallType
                if (r1 != r3) goto L25
                java.lang.reflect.Method r1 = r4.mMethod
                java.lang.String r1 = r1.getName()
                java.lang.reflect.Method r5 = r5.mMethod
                java.lang.String r5 = r5.getName()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L25
                goto L26
            L25:
                r0 = r2
            L26:
                return r0
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.mCallType
                int r0 = r0 * 31
                java.lang.reflect.Method r1 = r2.mMethod
                java.lang.String r1 = r1.getName()
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        void invokeCallback(androidx.lifecycle.LifecycleOwner r5, androidx.lifecycle.Lifecycle.Event r6, java.lang.Object r7) {
                r4 = this;
                int r0 = r4.mCallType     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r1 = 0
                if (r0 == 0) goto L22
                r2 = 1
                if (r0 == r2) goto L18
                r3 = 2
                if (r0 == r3) goto Lc
                goto L29
            Lc:
                java.lang.reflect.Method r0 = r4.mMethod     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r3[r1] = r5     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r3[r2] = r6     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r0.invoke(r7, r3)     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                goto L29
            L18:
                java.lang.reflect.Method r6 = r4.mMethod     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r0[r1] = r5     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r6.invoke(r7, r0)     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                goto L29
            L22:
                java.lang.reflect.Method r5 = r4.mMethod     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r5.invoke(r7, r6)     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
            L29:
                return
            L2a:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                r6.<init>(r5)
                throw r6
            L31:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r7 = "Failed to call observer method"
                java.lang.Throwable r5 = r5.getCause()
                r6.<init>(r7, r5)
                throw r6
        }
    }

    static {
            androidx.lifecycle.ClassesInfoCache r0 = new androidx.lifecycle.ClassesInfoCache
            r0.<init>()
            androidx.lifecycle.ClassesInfoCache.sInstance = r0
            return
    }

    ClassesInfoCache() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCallbackMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mHasLifecycleMethods = r0
            return
    }

    private androidx.lifecycle.ClassesInfoCache.CallbackInfo createInfo(java.lang.Class<?> r12, java.lang.reflect.Method[] r13) {
            r11 = this;
            java.lang.Class r0 = r12.getSuperclass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            if (r0 == 0) goto L16
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r0 = r11.getInfo(r0)
            if (r0 == 0) goto L16
            java.util.Map<androidx.lifecycle.ClassesInfoCache$MethodReference, androidx.lifecycle.Lifecycle$Event> r0 = r0.mHandlerToEvent
            r1.putAll(r0)
        L16:
            java.lang.Class[] r0 = r12.getInterfaces()
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L1d:
            if (r4 >= r2) goto L4e
            r5 = r0[r4]
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r5 = r11.getInfo(r5)
            java.util.Map<androidx.lifecycle.ClassesInfoCache$MethodReference, androidx.lifecycle.Lifecycle$Event> r5 = r5.mHandlerToEvent
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L2f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            androidx.lifecycle.ClassesInfoCache$MethodReference r7 = (androidx.lifecycle.ClassesInfoCache.MethodReference) r7
            java.lang.Object r6 = r6.getValue()
            androidx.lifecycle.Lifecycle$Event r6 = (androidx.lifecycle.Lifecycle.Event) r6
            r11.verifyAndPutHandler(r1, r7, r6, r12)
            goto L2f
        L4b:
            int r4 = r4 + 1
            goto L1d
        L4e:
            if (r13 == 0) goto L51
            goto L55
        L51:
            java.lang.reflect.Method[] r13 = r11.getDeclaredMethods(r12)
        L55:
            int r0 = r13.length
            r2 = r3
            r4 = r2
        L58:
            if (r2 >= r0) goto Lc3
            r5 = r13[r2]
            java.lang.Class<androidx.lifecycle.OnLifecycleEvent> r6 = androidx.lifecycle.OnLifecycleEvent.class
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r6)
            androidx.lifecycle.OnLifecycleEvent r6 = (androidx.lifecycle.OnLifecycleEvent) r6
            if (r6 != 0) goto L67
            goto Lb8
        L67:
            java.lang.Class[] r4 = r5.getParameterTypes()
            int r7 = r4.length
            r8 = 1
            if (r7 <= 0) goto L83
            r7 = r4[r3]
            java.lang.Class<androidx.lifecycle.LifecycleOwner> r9 = androidx.lifecycle.LifecycleOwner.class
            boolean r7 = r7.isAssignableFrom(r9)
            if (r7 == 0) goto L7b
            r7 = r8
            goto L84
        L7b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "invalid parameter type. Must be one and instanceof LifecycleOwner"
            r12.<init>(r13)
            throw r12
        L83:
            r7 = r3
        L84:
            androidx.lifecycle.Lifecycle$Event r6 = r6.value()
            int r9 = r4.length
            r10 = 2
            if (r9 <= r8) goto Lac
            r7 = r4[r8]
            java.lang.Class<androidx.lifecycle.Lifecycle$Event> r9 = androidx.lifecycle.Lifecycle.Event.class
            boolean r7 = r7.isAssignableFrom(r9)
            if (r7 == 0) goto La4
            androidx.lifecycle.Lifecycle$Event r7 = androidx.lifecycle.Lifecycle.Event.ON_ANY
            if (r6 != r7) goto L9c
            r7 = r10
            goto Lac
        L9c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Second arg is supported only for ON_ANY value"
            r12.<init>(r13)
            throw r12
        La4:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "invalid parameter type. second arg must be an event"
            r12.<init>(r13)
            throw r12
        Lac:
            int r4 = r4.length
            if (r4 > r10) goto Lbb
            androidx.lifecycle.ClassesInfoCache$MethodReference r4 = new androidx.lifecycle.ClassesInfoCache$MethodReference
            r4.<init>(r7, r5)
            r11.verifyAndPutHandler(r1, r4, r6, r12)
            r4 = r8
        Lb8:
            int r2 = r2 + 1
            goto L58
        Lbb:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "cannot have more than 2 params"
            r12.<init>(r13)
            throw r12
        Lc3:
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r13 = new androidx.lifecycle.ClassesInfoCache$CallbackInfo
            r13.<init>(r1)
            java.util.Map<java.lang.Class<?>, androidx.lifecycle.ClassesInfoCache$CallbackInfo> r0 = r11.mCallbackMap
            r0.put(r12, r13)
            java.util.Map<java.lang.Class<?>, java.lang.Boolean> r0 = r11.mHasLifecycleMethods
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.put(r12, r1)
            return r13
    }

    private java.lang.reflect.Method[] getDeclaredMethods(java.lang.Class<?> r3) {
            r2 = this;
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> L5
            return r3
        L5:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r0.<init>(r1, r3)
            throw r0
    }

    private void verifyAndPutHandler(java.util.Map<androidx.lifecycle.ClassesInfoCache.MethodReference, androidx.lifecycle.Lifecycle.Event> r4, androidx.lifecycle.ClassesInfoCache.MethodReference r5, androidx.lifecycle.Lifecycle.Event r6, java.lang.Class<?> r7) {
            r3 = this;
            java.lang.Object r0 = r4.get(r5)
            androidx.lifecycle.Lifecycle$Event r0 = (androidx.lifecycle.Lifecycle.Event) r0
            if (r0 == 0) goto L48
            if (r6 != r0) goto Lb
            goto L48
        Lb:
            java.lang.reflect.Method r4 = r5.mMethod
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Method "
            r1.<init>(r2)
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " in "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r7 = r7.getName()
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r7 = " already declared with different @OnLifecycleEvent value: previous value "
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r7 = ", new value "
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L48:
            if (r0 != 0) goto L4d
            r4.put(r5, r6)
        L4d:
            return
    }

    androidx.lifecycle.ClassesInfoCache.CallbackInfo getInfo(java.lang.Class<?> r2) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, androidx.lifecycle.ClassesInfoCache$CallbackInfo> r0 = r1.mCallbackMap
            java.lang.Object r0 = r0.get(r2)
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r0 = (androidx.lifecycle.ClassesInfoCache.CallbackInfo) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r0 = 0
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r2 = r1.createInfo(r2, r0)
            return r2
    }

    boolean hasLifecycleMethods(java.lang.Class<?> r7) {
            r6 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Boolean> r0 = r6.mHasLifecycleMethods
            java.lang.Object r0 = r0.get(r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto Lf
            boolean r7 = r0.booleanValue()
            return r7
        Lf:
            java.lang.reflect.Method[] r0 = r6.getDeclaredMethods(r7)
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L2c
            r4 = r0[r3]
            java.lang.Class<androidx.lifecycle.OnLifecycleEvent> r5 = androidx.lifecycle.OnLifecycleEvent.class
            java.lang.annotation.Annotation r4 = r4.getAnnotation(r5)
            androidx.lifecycle.OnLifecycleEvent r4 = (androidx.lifecycle.OnLifecycleEvent) r4
            if (r4 == 0) goto L29
            r6.createInfo(r7, r0)
            r7 = 1
            return r7
        L29:
            int r3 = r3 + 1
            goto L16
        L2c:
            java.util.Map<java.lang.Class<?>, java.lang.Boolean> r0 = r6.mHasLifecycleMethods
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.put(r7, r1)
            return r2
    }
}
