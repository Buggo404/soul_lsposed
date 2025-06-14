package com.google.gson.internal.reflect;

/* loaded from: classes.dex */
public class ReflectionHelper {
    private ReflectionHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String constructorToString(java.lang.reflect.Constructor<?> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r3.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.<init>(r1)
            r1 = 35
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Class r1 = r3.getDeclaringClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Class[] r3 = r3.getParameterTypes()
            r1 = 0
        L2a:
            int r2 = r3.length
            if (r1 >= r2) goto L40
            if (r1 <= 0) goto L34
            java.lang.String r2 = ", "
            r0.append(r2)
        L34:
            r2 = r3[r1]
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            int r1 = r1 + 1
            goto L2a
        L40:
            r3 = 41
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static java.lang.RuntimeException createExceptionForUnexpectedIllegalAccess(java.lang.IllegalAccessException r2) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            r0.<init>(r1, r2)
            throw r0
    }

    public static void makeAccessible(java.lang.reflect.Field r4) throws com.google.gson.JsonIOException {
            r0 = 1
            r4.setAccessible(r0)     // Catch: java.lang.Exception -> L5
            return
        L5:
            r0 = move-exception
            com.google.gson.JsonIOException r1 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed making field '"
            r2.<init>(r3)
            java.lang.Class r3 = r4.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "#"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r2 = "' accessible; either change its visibility or write a custom TypeAdapter for its declaring type"
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    public static java.lang.String tryMakeAccessible(java.lang.reflect.Constructor<?> r3) {
            r0 = 1
            r3.setAccessible(r0)     // Catch: java.lang.Exception -> L6
            r3 = 0
            return r3
        L6:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed making constructor '"
            r1.<init>(r2)
            java.lang.String r3 = constructorToString(r3)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = "' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }
}
