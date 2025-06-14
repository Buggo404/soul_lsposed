package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/PostCompiler.SCL.lombok */
public final class PostCompiler {
    private static java.util.List<lombok.core.PostCompilerTransformation> transformations;


    private PostCompiler() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static byte[] applyTransformations(byte[] r7, java.lang.String r8, lombok.core.DiagnosticsReceiver r9) {
            java.lang.String r0 = "lombok.disablePostCompiler"
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            if (r0 == 0) goto Lb
            r0 = r7
            return r0
        Lb:
            r0 = r9
            init(r0)
            r0 = r7
            r10 = r0
            java.util.List<lombok.core.PostCompilerTransformation> r0 = lombok.core.PostCompiler.transformations
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L7e
        L1e:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.core.PostCompilerTransformation r0 = (lombok.core.PostCompilerTransformation) r0
            r11 = r0
            r0 = r11
            r1 = r10
            r2 = r8
            r3 = r9
            byte[] r0 = r0.applyTransformations(r1, r2, r3)     // Catch: java.lang.Exception -> L41
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L7e
            r0 = r13
            r10 = r0
            goto L7e
        L41:
            r13 = move-exception
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r13
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r2 = r1
            r3 = r14
            r4 = 1
            r2.<init>(r3, r4)
            r0.printStackTrace(r1)
            r0 = r9
            java.lang.String r1 = "Error during the transformation of '%s'; post-compiler '%s' caused an exception: %s"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r11
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r14
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addError(r1)
        L7e:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1e
            r0 = r10
            return r0
    }

    private static synchronized void init(lombok.core.DiagnosticsReceiver r6) {
            java.util.List<lombok.core.PostCompilerTransformation> r0 = lombok.core.PostCompiler.transformations
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Class<lombok.core.PostCompilerTransformation> r0 = lombok.core.PostCompilerTransformation.class
            java.lang.Class<lombok.core.PostCompilerTransformation> r1 = lombok.core.PostCompilerTransformation.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.io.IOException -> L1a
            java.lang.Iterable r0 = lombok.core.SpiLoadUtil.findServices(r0, r1)     // Catch: java.io.IOException -> L1a
            java.util.List r0 = lombok.core.SpiLoadUtil.readAllFromIterator(r0)     // Catch: java.io.IOException -> L1a
            lombok.core.PostCompiler.transformations = r0     // Catch: java.io.IOException -> L1a
            goto L5b
        L1a:
            r7 = move-exception
            java.util.List r0 = java.util.Collections.emptyList()
            lombok.core.PostCompiler.transformations = r0
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r7
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r2 = r1
            r3 = r8
            r4 = 1
            r2.<init>(r3, r4)
            r0.printStackTrace(r1)
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Could not load post-compile transformers: "
            r2.<init>(r3)
            r2 = r7
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
        L5b:
            return
    }

    public static java.io.OutputStream wrapOutputStream(java.io.OutputStream r7, java.lang.String r8, lombok.core.DiagnosticsReceiver r9) throws java.io.IOException {
            java.lang.String r0 = "lombok.disablePostCompiler"
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            if (r0 == 0) goto Lb
            r0 = r7
            return r0
        Lb:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = r0
            r1.<init>()
            r10 = r0
            lombok.core.PostCompiler$1 r0 = new lombok.core.PostCompiler$1
            r1 = r0
            r2 = r10
            r3 = r7
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            return r0
    }
}
