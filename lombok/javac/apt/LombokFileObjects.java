package lombok.javac.apt;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/apt/LombokFileObjects.SCL.lombok */
final class LombokFileObjects {
    private static final java.util.List<java.lang.String> KNOWN_JAVA9_FILE_MANAGERS = null;
    private static java.lang.reflect.Constructor<?> j9CompilerConstructor;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/apt/LombokFileObjects$Compiler.SCL.lombok */
    interface Compiler {
        public static final lombok.javac.apt.LombokFileObjects.Compiler JAVAC6 = null;
        public static final lombok.javac.apt.LombokFileObjects.Compiler JAVAC7 = null;



        static {
                lombok.javac.apt.LombokFileObjects$Compiler$1 r0 = new lombok.javac.apt.LombokFileObjects$Compiler$1
                r1 = r0
                r1.<init>()
                lombok.javac.apt.LombokFileObjects.Compiler.JAVAC6 = r0
                lombok.javac.apt.LombokFileObjects$Compiler$2 r0 = new lombok.javac.apt.LombokFileObjects$Compiler$2
                r1 = r0
                r1.<init>()
                lombok.javac.apt.LombokFileObjects.Compiler.JAVAC7 = r0
                return
        }

        javax.tools.JavaFileObject wrap(lombok.javac.apt.LombokFileObject r1);

        java.lang.reflect.Method getDecoderMethod();
    }

    static {
            r0 = 6
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "com.google.errorprone.MaskedClassLoader$MaskedFileManager"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "com.google.devtools.build.buildjar.javac.BlazeJavacMain$ClassloaderMaskingFileManager"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "com.google.devtools.build.java.turbine.javac.JavacTurbineCompiler$ClassloaderMaskingFileManager"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "org.netbeans.modules.java.source.parsing.ProxyFileManager"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "com.sun.tools.javac.api.ClientCodeWrapper$WrappedStandardJavaFileManager"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "com.sun.tools.javac.main.DelegatingJavaFileManager$DelegatingSJFM"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            lombok.javac.apt.LombokFileObjects.KNOWN_JAVA9_FILE_MANAGERS = r0
            r0 = 0
            lombok.javac.apt.LombokFileObjects.j9CompilerConstructor = r0
            return
    }

    static java.lang.reflect.Method getDecoderMethod(java.lang.String r7) {
            r0 = r7
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.NoSuchMethodException -> L14 java.lang.ClassNotFoundException -> L18
            java.lang.String r1 = "getDecoder"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L14 java.lang.ClassNotFoundException -> L18
            r3 = r2
            r4 = 0
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L14 java.lang.ClassNotFoundException -> L18
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L14 java.lang.ClassNotFoundException -> L18
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L14 java.lang.ClassNotFoundException -> L18
            return r0
        L14:
            goto L19
        L18:
        L19:
            r0 = 0
            return r0
    }

    private LombokFileObjects() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static lombok.javac.apt.LombokFileObjects.Compiler getCompiler(javax.tools.JavaFileManager r4) {
            r0 = r4
            if (r0 == 0) goto Le
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            goto L10
        Le:
            java.lang.String r0 = "null"
        L10:
            r5 = r0
            r0 = r5
            java.lang.String r1 = "com.sun.tools.javac.util.DefaultFileManager"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            lombok.javac.apt.LombokFileObjects$Compiler r0 = lombok.javac.apt.LombokFileObjects.Compiler.JAVAC6
            return r0
        L1e:
            r0 = r5
            java.lang.String r1 = "com.sun.tools.javac.util.JavacFileManager"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
            lombok.javac.apt.LombokFileObjects$Compiler r0 = lombok.javac.apt.LombokFileObjects.Compiler.JAVAC6
            return r0
        L2b:
            r0 = r5
            java.lang.String r1 = "com.sun.tools.javac.file.JavacFileManager"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            java.lang.String r0 = "com.sun.tools.javac.file.BaseFileManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L47
            r6 = r0
            r0 = r6
            r1 = r4
            boolean r0 = r0.isInstance(r1)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L48
            r0 = r4
            lombok.javac.apt.LombokFileObjects$Compiler r0 = java9Compiler(r0)     // Catch: java.lang.Throwable -> L47
            return r0
        L47:
        L48:
            lombok.javac.apt.LombokFileObjects$Compiler r0 = lombok.javac.apt.LombokFileObjects.Compiler.JAVAC7
            return r0
        L4c:
            java.util.List<java.lang.String> r0 = lombok.javac.apt.LombokFileObjects.KNOWN_JAVA9_FILE_MANAGERS
            r1 = r5
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5e
            r0 = r4
            lombok.javac.apt.LombokFileObjects$Compiler r0 = java9Compiler(r0)     // Catch: java.lang.Throwable -> L5d
            return r0
        L5d:
        L5e:
            java.lang.String r0 = "com.sun.tools.javac.file.PathFileObject"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L6e
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L73
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L73
            throw r0     // Catch: java.lang.Throwable -> L73
        L6e:
            r0 = r4
            lombok.javac.apt.LombokFileObjects$Compiler r0 = java9Compiler(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L73:
            java.lang.String r0 = "com.sun.tools.javac.file.BaseFileObject"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L84
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L88
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L88
            throw r0     // Catch: java.lang.Throwable -> L88
        L84:
            lombok.javac.apt.LombokFileObjects$Compiler r0 = lombok.javac.apt.LombokFileObjects.Compiler.JAVAC7     // Catch: java.lang.Throwable -> L88
            return r0
        L88:
            java.lang.String r0 = "com.sun.tools.javac.util.BaseFileObject"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 != 0) goto L99
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9d
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L9d
        L99:
            lombok.javac.apt.LombokFileObjects$Compiler r0 = lombok.javac.apt.LombokFileObjects.Compiler.JAVAC6     // Catch: java.lang.Throwable -> L9d
            return r0
        L9d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r4
            if (r0 == 0) goto Lf0
            r0 = r6
            java.lang.String r1 = " extends "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.Class r1 = r1.getClass()
            java.lang.Class r1 = r1.getSuperclass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            java.lang.Class[] r0 = r0.getInterfaces()
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto Le9
        Ld2:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = r6
            java.lang.String r1 = " implements "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            int r8 = r8 + 1
        Le9:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto Ld2
        Lf0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    static javax.tools.JavaFileObject createIntercepting(lombok.javac.apt.LombokFileObjects.Compiler r8, javax.tools.JavaFileObject r9, java.lang.String r10, lombok.core.DiagnosticsReceiver r11) {
            r0 = r8
            lombok.javac.apt.InterceptingJavaFileObject r1 = new lombok.javac.apt.InterceptingJavaFileObject
            r2 = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r8
            java.lang.reflect.Method r6 = r6.getDecoderMethod()
            r2.<init>(r3, r4, r5, r6)
            javax.tools.JavaFileObject r0 = r0.wrap(r1)
            return r0
    }

    private static lombok.javac.apt.LombokFileObjects.Compiler java9Compiler(javax.tools.JavaFileManager r6) {
            java.lang.reflect.Constructor<?> r0 = lombok.javac.apt.LombokFileObjects.j9CompilerConstructor     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L59 java.lang.InstantiationException -> L63
            if (r0 != 0) goto L1a
            java.lang.String r0 = "lombok.javac.apt.Java9Compiler"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L59 java.lang.InstantiationException -> L63
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L59 java.lang.InstantiationException -> L63
            r2 = r1
            r3 = 0
            java.lang.Class<javax.tools.JavaFileManager> r4 = javax.tools.JavaFileManager.class
            r2[r3] = r4     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L59 java.lang.InstantiationException -> L63
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L59 java.lang.InstantiationException -> L63
            lombok.javac.apt.LombokFileObjects.j9CompilerConstructor = r0     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L59 java.lang.InstantiationException -> L63
        L1a:
            java.lang.reflect.Constructor<?> r0 = lombok.javac.apt.LombokFileObjects.j9CompilerConstructor     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L59 java.lang.InstantiationException -> L63
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L59 java.lang.InstantiationException -> L63
            r2 = r1
            r3 = 0
            r4 = r6
            r2[r3] = r4     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L59 java.lang.InstantiationException -> L63
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L59 java.lang.InstantiationException -> L63
            lombok.javac.apt.LombokFileObjects$Compiler r0 = (lombok.javac.apt.LombokFileObjects.Compiler) r0     // Catch: java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L59 java.lang.InstantiationException -> L63
            return r0
        L2c:
            r0 = 0
            return r0
        L2f:
            r0 = 0
            return r0
        L32:
            r7 = move-exception
            r0 = r7
            java.lang.Throwable r0 = r0.getCause()
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L44
            r0 = r8
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L44:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Error
            if (r0 == 0) goto L50
            r0 = r8
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L50:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            throw r0
        L59:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L63:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
    }
}
