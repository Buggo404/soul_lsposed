package androidx.core.graphics;

/* loaded from: classes.dex */
class TypefaceCompatApi21Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    private static final java.lang.String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final java.lang.String TAG = "TypefaceCompatApi21Impl";
    private static java.lang.reflect.Method sAddFontWeightStyle = null;
    private static java.lang.reflect.Method sCreateFromFamiliesWithDefault = null;
    private static java.lang.Class<?> sFontFamily = null;
    private static java.lang.reflect.Constructor<?> sFontFamilyCtor = null;
    private static boolean sHasInitBeenCalled = false;

    static {
            return
    }

    TypefaceCompatApi21Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean addFontWeightStyle(java.lang.Object r3, java.lang.String r4, int r5, boolean r6) {
            init()
            java.lang.reflect.Method r0 = androidx.core.graphics.TypefaceCompatApi21Impl.sAddFontWeightStyle     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r5 = 1
            r1[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r5 = 2
            r1[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            boolean r3 = r3.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            return r3
        L24:
            r3 = move-exception
            goto L27
        L26:
            r3 = move-exception
        L27:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    private static android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object r3) {
            init()
            java.lang.Class<?> r0 = androidx.core.graphics.TypefaceCompatApi21Impl.sFontFamily     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r2 = 0
            java.lang.reflect.Array.set(r0, r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.reflect.Method r3 = androidx.core.graphics.TypefaceCompatApi21Impl.sCreateFromFamiliesWithDefault     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r1[r2] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r0 = 0
            java.lang.Object r3 = r3.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            return r3
        L1c:
            r3 = move-exception
            goto L1f
        L1e:
            r3 = move-exception
        L1f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }

    private java.io.File getFile(android.os.ParcelFileDescriptor r4) {
            r3 = this;
            java.lang.String r0 = "/proc/self/fd/"
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.system.ErrnoException -> L2a
            r2.<init>(r0)     // Catch: android.system.ErrnoException -> L2a
            int r4 = r4.getFd()     // Catch: android.system.ErrnoException -> L2a
            java.lang.StringBuilder r4 = r2.append(r4)     // Catch: android.system.ErrnoException -> L2a
            java.lang.String r4 = r4.toString()     // Catch: android.system.ErrnoException -> L2a
            java.lang.String r4 = android.system.Os.readlink(r4)     // Catch: android.system.ErrnoException -> L2a
            android.system.StructStat r0 = android.system.Os.stat(r4)     // Catch: android.system.ErrnoException -> L2a
            int r0 = r0.st_mode     // Catch: android.system.ErrnoException -> L2a
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch: android.system.ErrnoException -> L2a
            if (r0 == 0) goto L2a
            java.io.File r0 = new java.io.File     // Catch: android.system.ErrnoException -> L2a
            r0.<init>(r4)     // Catch: android.system.ErrnoException -> L2a
            return r0
        L2a:
            return r1
    }

    private static void init() {
            boolean r0 = androidx.core.graphics.TypefaceCompatApi21Impl.sHasInitBeenCalled
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            androidx.core.graphics.TypefaceCompatApi21Impl.sHasInitBeenCalled = r0
            java.lang.String r1 = "android.graphics.FontFamily"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            java.lang.reflect.Constructor r3 = r1.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            java.lang.String r4 = "addFontWeightStyle"
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r2] = r6     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            r7 = 2
            r5[r7] = r6     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            java.lang.reflect.Method r4 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r1, r0)     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            java.lang.Class<android.graphics.Typeface> r6 = android.graphics.Typeface.class
            java.lang.String r7 = "createFromFamiliesWithDefault"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            r0[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            java.lang.reflect.Method r0 = r6.getMethod(r7, r0)     // Catch: java.lang.NoSuchMethodException -> L40 java.lang.ClassNotFoundException -> L42
            goto L54
        L40:
            r0 = move-exception
            goto L43
        L42:
            r0 = move-exception
        L43:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "TypefaceCompatApi21Impl"
            android.util.Log.e(r2, r1, r0)
            r1 = 0
            r0 = r1
            r3 = r0
            r4 = r3
        L54:
            androidx.core.graphics.TypefaceCompatApi21Impl.sFontFamilyCtor = r3
            androidx.core.graphics.TypefaceCompatApi21Impl.sFontFamily = r1
            androidx.core.graphics.TypefaceCompatApi21Impl.sAddFontWeightStyle = r4
            androidx.core.graphics.TypefaceCompatApi21Impl.sCreateFromFamiliesWithDefault = r0
            return
    }

    private static java.lang.Object newFamily() {
            init()
            java.lang.reflect.Constructor<?> r0 = androidx.core.graphics.TypefaceCompatApi21Impl.sFontFamilyCtor     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
            return r0
        Ld:
            r0 = move-exception
            goto L12
        Lf:
            r0 = move-exception
            goto L12
        L11:
            r0 = move-exception
        L12:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r8, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r9, android.content.res.Resources r10, int r11) {
            r7 = this;
            java.lang.Object r11 = newFamily()
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r9 = r9.getEntries()
            int r0 = r9.length
            r1 = 0
        La:
            if (r1 >= r0) goto L49
            r2 = r9[r1]
            java.io.File r3 = androidx.core.graphics.TypefaceCompatUtil.getTempFile(r8)
            r4 = 0
            if (r3 != 0) goto L16
            return r4
        L16:
            int r5 = r2.getResourceId()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            boolean r5 = androidx.core.graphics.TypefaceCompatUtil.copyToFile(r3, r10, r5)     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            if (r5 != 0) goto L24
            r3.delete()
            return r4
        L24:
            java.lang.String r5 = r3.getPath()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            int r6 = r2.getWeight()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            boolean r2 = r2.isItalic()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            boolean r2 = addFontWeightStyle(r11, r5, r6, r2)     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            if (r2 != 0) goto L3a
            r3.delete()
            return r4
        L3a:
            r3.delete()
            int r1 = r1 + 1
            goto La
        L40:
            r8 = move-exception
            r3.delete()
            throw r8
        L45:
            r3.delete()
            return r4
        L49:
            android.graphics.Typeface r8 = createFromFamiliesWithDefault(r11)
            return r8
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context r4, android.os.CancellationSignal r5, androidx.core.provider.FontsContractCompat.FontInfo[] r6, int r7) {
            r3 = this;
            int r0 = r6.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            androidx.core.provider.FontsContractCompat$FontInfo r6 = r3.findBestInfo(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.getUri()     // Catch: java.io.IOException -> L63
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch: java.io.IOException -> L63
            if (r5 != 0) goto L20
            if (r5 == 0) goto L1f
            r5.close()     // Catch: java.io.IOException -> L63
        L1f:
            return r2
        L20:
            java.io.File r6 = r3.getFile(r5)     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L37
            boolean r7 = r6.canRead()     // Catch: java.lang.Throwable -> L57
            if (r7 != 0) goto L2d
            goto L37
        L2d:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L36
            r5.close()     // Catch: java.io.IOException -> L63
        L36:
            return r4
        L37:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L57
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L57
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L57
            android.graphics.Typeface r4 = super.createFromInputStream(r4, r6)     // Catch: java.lang.Throwable -> L4d
            r6.close()     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L4c
            r5.close()     // Catch: java.io.IOException -> L63
        L4c:
            return r4
        L4d:
            r4 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch: java.lang.Throwable -> L57
        L56:
            throw r4     // Catch: java.lang.Throwable -> L57
        L57:
            r4 = move-exception
            if (r5 == 0) goto L62
            r5.close()     // Catch: java.lang.Throwable -> L5e
            goto L62
        L5e:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L63
        L62:
            throw r4     // Catch: java.io.IOException -> L63
        L63:
            return r2
    }
}
