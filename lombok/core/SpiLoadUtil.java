package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/SpiLoadUtil.SCL.lombok */
public class SpiLoadUtil {


    private SpiLoadUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static <T> java.util.List<T> readAllFromIterator(java.lang.Iterable<T> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L24
        L12:
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.Object r0 = (java.lang.Object) r0
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = r0.add(r1)
        L24:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L12
            r0 = r4
            return r0
    }

    public static <C> java.lang.Iterable<C> findServices(java.lang.Class<C> r3) throws java.io.IOException {
            r0 = r3
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r1 = r1.getContextClassLoader()
            java.lang.Iterable r0 = findServices(r0, r1)
            return r0
    }

    public static <C> java.lang.Iterable<C> findServices(java.lang.Class<C> r6, java.lang.ClassLoader r7) throws java.io.IOException {
            r0 = r7
            if (r0 != 0) goto L8
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
            r7 = r0
        L8:
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "META-INF/services/"
            r2.<init>(r3)
            r2 = r6
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.Enumeration r0 = r0.getResources(r1)
            r8 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = r0
            r1.<init>()
            r9 = r0
            goto L3c
        L2b:
            r0 = r8
            java.lang.Object r0 = r0.nextElement()
            java.net.URL r0 = (java.net.URL) r0
            r10 = r0
            r0 = r9
            r1 = r10
            readServicesFromUrl(r0, r1)
        L3c:
            r0 = r8
            boolean r0 = r0.hasMoreElements()
            if (r0 != 0) goto L2b
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            r0 = r7
            r11 = r0
            lombok.core.SpiLoadUtil$1 r0 = new lombok.core.SpiLoadUtil$1
            r1 = r0
            r2 = r10
            r3 = r6
            r4 = r11
            r1.<init>(r2, r3, r4)
            return r0
    }

    private static void readServicesFromUrl(java.util.Collection<java.lang.String> r7, java.net.URL r8) throws java.io.IOException {
            r0 = r8
            java.io.InputStream r0 = r0.openStream()
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L20
            r0 = r10
            if (r0 == 0) goto L13
            r0 = r10
            r0.close()     // Catch: java.lang.Throwable -> L1e
        L13:
            r0 = r9
            if (r0 == 0) goto L1f
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
        L1f:
            return
        L20:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L77
            r1 = r0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L77
            r3 = r2
            r4 = r9
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L77
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L77
            r10 = r0
        L32:
            r0 = r10
            java.lang.String r0 = r0.readLine()     // Catch: java.lang.Throwable -> L77
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L40
            goto L90
        L40:
            r0 = r11
            r1 = 35
            int r0 = r0.indexOf(r1)     // Catch: java.lang.Throwable -> L77
            r12 = r0
            r0 = r12
            r1 = -1
            if (r0 == r1) goto L59
            r0 = r11
            r1 = 0
            r2 = r12
            java.lang.String r0 = r0.substring(r1, r2)     // Catch: java.lang.Throwable -> L77
            r11 = r0
        L59:
            r0 = r11
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L77
            r11 = r0
            r0 = r11
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L6b
            goto L32
        L6b:
            r0 = r7
            r1 = r11
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L77
            goto L32
        L77:
            r13 = move-exception
            r0 = r10
            if (r0 == 0) goto L81
            r0 = r10
            r0.close()     // Catch: java.lang.Throwable -> L8c
        L81:
            r0 = r9
            if (r0 == 0) goto L8d
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L8c
            goto L8d
        L8c:
        L8d:
            r0 = r13
            throw r0
        L90:
            r0 = r10
            if (r0 == 0) goto L98
            r0 = r10
            r0.close()     // Catch: java.lang.Throwable -> La3
        L98:
            r0 = r9
            if (r0 == 0) goto La4
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> La3
            goto La4
        La3:
        La4:
            return
    }

    public static java.lang.Class<? extends java.lang.annotation.Annotation> findAnnotationClass(java.lang.Class<?> r3, java.lang.Class<?> r4) {
            r0 = r3
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto La
            r0 = r3
            if (r0 != 0) goto Lc
        La:
            r0 = 0
            return r0
        Lc:
            r0 = 0
            r5 = r0
            r0 = r4
            r1 = r3
            java.lang.reflect.Type r1 = r1.getGenericSuperclass()
            java.lang.Class r0 = findAnnotationHelper(r0, r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1d
            r0 = r5
            return r0
        L1d:
            r0 = r3
            java.lang.reflect.Type[] r0 = r0.getGenericInterfaces()
            r1 = r0
            r9 = r1
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r7 = r0
            goto L42
        L2d:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r6 = r0
            r0 = r4
            r1 = r6
            java.lang.Class r0 = findAnnotationHelper(r0, r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L3f
            r0 = r5
            return r0
        L3f:
            int r7 = r7 + 1
        L42:
            r0 = r7
            r1 = r8
            if (r0 < r1) goto L2d
            r0 = r3
            java.lang.Class r0 = r0.getSuperclass()
            r1 = r4
            java.lang.Class r0 = findAnnotationClass(r0, r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L58
            r0 = r6
            return r0
        L58:
            r0 = r3
            java.lang.Class[] r0 = r0.getInterfaces()
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto L7f
        L68:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            r1 = r4
            java.lang.Class r0 = findAnnotationClass(r0, r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L7c
            r0 = r6
            return r0
        L7c:
            int r8 = r8 + 1
        L7f:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto L68
            r0 = 0
            return r0
    }

    private static java.lang.Class<? extends java.lang.annotation.Annotation> findAnnotationHelper(java.lang.Class<?> r6, java.lang.reflect.Type r7) {
            r0 = r7
            boolean r0 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L54
            r0 = r7
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r8 = r0
            r0 = r6
            r1 = r8
            java.lang.reflect.Type r1 = r1.getRawType()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b
            r0 = 0
            return r0
        L1b:
            r0 = r8
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L3c
            java.lang.Class<java.lang.annotation.Annotation> r0 = java.lang.annotation.Annotation.class
            r1 = r9
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L3c
            r0 = r9
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
        L3c:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Not an annotation type: "
            r3.<init>(r4)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L54:
            r0 = 0
            return r0
    }
}
