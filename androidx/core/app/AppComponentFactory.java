package androidx.core.app;

/* loaded from: classes.dex */
public class AppComponentFactory extends android.app.AppComponentFactory {
    public AppComponentFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.AppComponentFactory
    public final android.app.Activity instantiateActivity(java.lang.ClassLoader r1, java.lang.String r2, android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.app.Activity r1 = r0.instantiateActivityCompat(r1, r2, r3)
            java.lang.Object r1 = androidx.core.app.CoreComponentFactory.checkCompatWrapper(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
    }

    public android.app.Activity instantiateActivityCompat(java.lang.ClassLoader r1, java.lang.String r2, android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r3, r1)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            return r1
        L1a:
            r1 = move-exception
            goto L1d
        L1c:
            r1 = move-exception
        L1d:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Couldn't call constructor"
            r2.<init>(r3, r1)
            throw r2
    }

    @Override // android.app.AppComponentFactory
    public final android.app.Application instantiateApplication(java.lang.ClassLoader r1, java.lang.String r2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.app.Application r1 = r0.instantiateApplicationCompat(r1, r2)
            java.lang.Object r1 = androidx.core.app.CoreComponentFactory.checkCompatWrapper(r1)
            android.app.Application r1 = (android.app.Application) r1
            return r1
    }

    public android.app.Application instantiateApplicationCompat(java.lang.ClassLoader r2, java.lang.String r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r3, r0, r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class<android.app.Application> r3 = android.app.Application.class
            java.lang.Class r2 = r2.asSubclass(r3)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            android.app.Application r2 = (android.app.Application) r2     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            return r2
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r2 = move-exception
        L1d:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Couldn't call constructor"
            r3.<init>(r0, r2)
            throw r3
    }

    @Override // android.app.AppComponentFactory
    public final android.content.ContentProvider instantiateProvider(java.lang.ClassLoader r1, java.lang.String r2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.content.ContentProvider r1 = r0.instantiateProviderCompat(r1, r2)
            java.lang.Object r1 = androidx.core.app.CoreComponentFactory.checkCompatWrapper(r1)
            android.content.ContentProvider r1 = (android.content.ContentProvider) r1
            return r1
    }

    public android.content.ContentProvider instantiateProviderCompat(java.lang.ClassLoader r2, java.lang.String r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r3, r0, r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class<android.content.ContentProvider> r3 = android.content.ContentProvider.class
            java.lang.Class r2 = r2.asSubclass(r3)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            android.content.ContentProvider r2 = (android.content.ContentProvider) r2     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            return r2
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r2 = move-exception
        L1d:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Couldn't call constructor"
            r3.<init>(r0, r2)
            throw r3
    }

    @Override // android.app.AppComponentFactory
    public final android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader r1, java.lang.String r2, android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.content.BroadcastReceiver r1 = r0.instantiateReceiverCompat(r1, r2, r3)
            java.lang.Object r1 = androidx.core.app.CoreComponentFactory.checkCompatWrapper(r1)
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1
            return r1
    }

    public android.content.BroadcastReceiver instantiateReceiverCompat(java.lang.ClassLoader r1, java.lang.String r2, android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r3, r1)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class<android.content.BroadcastReceiver> r2 = android.content.BroadcastReceiver.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            return r1
        L1a:
            r1 = move-exception
            goto L1d
        L1c:
            r1 = move-exception
        L1d:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Couldn't call constructor"
            r2.<init>(r3, r1)
            throw r2
    }

    @Override // android.app.AppComponentFactory
    public final android.app.Service instantiateService(java.lang.ClassLoader r1, java.lang.String r2, android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.app.Service r1 = r0.instantiateServiceCompat(r1, r2, r3)
            java.lang.Object r1 = androidx.core.app.CoreComponentFactory.checkCompatWrapper(r1)
            android.app.Service r1 = (android.app.Service) r1
            return r1
    }

    public android.app.Service instantiateServiceCompat(java.lang.ClassLoader r1, java.lang.String r2, android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r3, r1)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class<android.app.Service> r2 = android.app.Service.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            android.app.Service r1 = (android.app.Service) r1     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.reflect.InvocationTargetException -> L1c
            return r1
        L1a:
            r1 = move-exception
            goto L1d
        L1c:
            r1 = move-exception
        L1d:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Couldn't call constructor"
            r2.<init>(r3, r1)
            throw r2
    }
}
