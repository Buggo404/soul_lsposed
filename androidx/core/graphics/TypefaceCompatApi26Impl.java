package androidx.core.graphics;

/* loaded from: classes.dex */
public class TypefaceCompatApi26Impl extends androidx.core.graphics.TypefaceCompatApi21Impl {
    private static final java.lang.String ABORT_CREATION_METHOD = "abortCreation";
    private static final java.lang.String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
    private static final java.lang.String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final java.lang.String FREEZE_METHOD = "freeze";
    private static final int RESOLVE_BY_FONT_TABLE = -1;
    private static final java.lang.String TAG = "TypefaceCompatApi26Impl";
    protected final java.lang.reflect.Method mAbortCreation;
    protected final java.lang.reflect.Method mAddFontFromAssetManager;
    protected final java.lang.reflect.Method mAddFontFromBuffer;
    protected final java.lang.reflect.Method mCreateFromFamiliesWithDefault;
    protected final java.lang.Class<?> mFontFamily;
    protected final java.lang.reflect.Constructor<?> mFontFamilyCtor;
    protected final java.lang.reflect.Method mFreeze;

    public TypefaceCompatApi26Impl() {
            r7 = this;
            r7.<init>()
            java.lang.Class r0 = r7.obtainFontFamily()     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Constructor r1 = r7.obtainFontFamilyCtor(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r2 = r7.obtainAddFontFromAssetManagerMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r3 = r7.obtainAddFontFromBufferMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r4 = r7.obtainFreezeMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r5 = r7.obtainAbortCreationMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r6 = r7.obtainCreateFromFamiliesWithDefaultMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            goto L46
        L20:
            r0 = move-exception
            goto L23
        L22:
            r0 = move-exception
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to collect necessary methods for class "
            r1.<init>(r2)
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TypefaceCompatApi26Impl"
            android.util.Log.e(r2, r1, r0)
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L46:
            r7.mFontFamily = r0
            r7.mFontFamilyCtor = r1
            r7.mAddFontFromAssetManager = r2
            r7.mAddFontFromBuffer = r3
            r7.mFreeze = r4
            r7.mAbortCreation = r5
            r7.mCreateFromFamiliesWithDefault = r6
            return
    }

    private void abortCreation(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.mAbortCreation     // Catch: java.lang.Throwable -> L8
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L8
            r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    private boolean addFontFromAssetManager(android.content.Context r4, java.lang.Object r5, java.lang.String r6, int r7, int r8, int r9, android.graphics.fonts.FontVariationAxis[] r10) {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.mAddFontFromAssetManager     // Catch: java.lang.Throwable -> L41
            r2 = 8
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L41
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L41
            r2[r0] = r4     // Catch: java.lang.Throwable -> L41
            r4 = 1
            r2[r4] = r6     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L41
            r6 = 2
            r2[r6] = r4     // Catch: java.lang.Throwable -> L41
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L41
            r6 = 3
            r2[r6] = r4     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L41
            r6 = 4
            r2[r6] = r4     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L41
            r6 = 5
            r2[r6] = r4     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L41
            r6 = 6
            r2[r6] = r4     // Catch: java.lang.Throwable -> L41
            r4 = 7
            r2[r4] = r10     // Catch: java.lang.Throwable -> L41
            java.lang.Object r4 = r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L41
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L41
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L41
            return r4
        L41:
            return r0
    }

    private boolean addFontFromBuffer(java.lang.Object r4, java.nio.ByteBuffer r5, int r6, int r7, int r8) {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.mAddFontFromBuffer     // Catch: java.lang.Throwable -> L2c
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2c
            r2[r0] = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L2c
            r6 = 1
            r2[r6] = r5     // Catch: java.lang.Throwable -> L2c
            r5 = 2
            r6 = 0
            r2[r5] = r6     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2c
            r6 = 3
            r2[r6] = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2c
            r6 = 4
            r2[r6] = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r1.invoke(r4, r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L2c
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L2c
            return r4
        L2c:
            return r0
    }

    private boolean freeze(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.mFreeze     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L10
            java.lang.Object r4 = r1.invoke(r4, r2)     // Catch: java.lang.Throwable -> L10
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L10
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L10
            return r4
        L10:
            return r0
    }

    private boolean isFontFamilyPrivateAPIAvailable() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.mAddFontFromAssetManager
            if (r0 != 0) goto Lb
            java.lang.String r0 = "TypefaceCompatApi26Impl"
            java.lang.String r1 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r0, r1)
        Lb:
            java.lang.reflect.Method r0 = r2.mAddFontFromAssetManager
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    private java.lang.Object newFamily() {
            r2 = this;
            java.lang.reflect.Constructor<?> r0 = r2.mFontFamilyCtor     // Catch: java.lang.Throwable -> La
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = 0
            return r0
    }

    protected android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            java.lang.Class<?> r1 = r5.mFontFamily     // Catch: java.lang.Throwable -> L28
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L28
            r3 = 0
            java.lang.reflect.Array.set(r1, r3, r6)     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r6 = r5.mCreateFromFamiliesWithDefault     // Catch: java.lang.Throwable -> L28
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L28
            r4[r3] = r1     // Catch: java.lang.Throwable -> L28
            r1 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L28
            r4[r2] = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L28
            r2 = 2
            r4[r2] = r1     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r6.invoke(r0, r4)     // Catch: java.lang.Throwable -> L28
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6     // Catch: java.lang.Throwable -> L28
            return r6
        L28:
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r11, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r12, android.content.res.Resources r13, int r14) {
            r10 = this;
            boolean r0 = r10.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r11 = super.createFromFontFamilyFilesResourceEntry(r11, r12, r13, r14)
            return r11
        Lb:
            java.lang.Object r13 = r10.newFamily()
            r14 = 0
            if (r13 != 0) goto L13
            return r14
        L13:
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r12 = r12.getEntries()
            int r8 = r12.length
            r0 = 0
            r9 = r0
        L1a:
            if (r9 >= r8) goto L46
            r0 = r12[r9]
            java.lang.String r3 = r0.getFileName()
            int r4 = r0.getTtcIndex()
            int r5 = r0.getWeight()
            boolean r6 = r0.isItalic()
            java.lang.String r0 = r0.getVariationSettings()
            android.graphics.fonts.FontVariationAxis[] r7 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r0)
            r0 = r10
            r1 = r11
            r2 = r13
            boolean r0 = r0.addFontFromAssetManager(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L43
            r10.abortCreation(r13)
            return r14
        L43:
            int r9 = r9 + 1
            goto L1a
        L46:
            boolean r11 = r10.freeze(r13)
            if (r11 != 0) goto L4d
            return r14
        L4d:
            android.graphics.Typeface r11 = r10.createFromFamiliesWithDefault(r13)
            return r11
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context r11, android.os.CancellationSignal r12, androidx.core.provider.FontsContractCompat.FontInfo[] r13, int r14) {
            r10 = this;
            int r0 = r13.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L6
            return r1
        L6:
            boolean r0 = r10.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto L56
            androidx.core.provider.FontsContractCompat$FontInfo r13 = r10.findBestInfo(r13, r14)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r14 = r13.getUri()     // Catch: java.io.IOException -> L55
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r14, r0, r12)     // Catch: java.io.IOException -> L55
            if (r11 != 0) goto L26
            if (r11 == 0) goto L25
            r11.close()     // Catch: java.io.IOException -> L55
        L25:
            return r1
        L26:
            android.graphics.Typeface$Builder r12 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> L49
            java.io.FileDescriptor r14 = r11.getFileDescriptor()     // Catch: java.lang.Throwable -> L49
            r12.<init>(r14)     // Catch: java.lang.Throwable -> L49
            int r14 = r13.getWeight()     // Catch: java.lang.Throwable -> L49
            android.graphics.Typeface$Builder r12 = r12.setWeight(r14)     // Catch: java.lang.Throwable -> L49
            boolean r13 = r13.isItalic()     // Catch: java.lang.Throwable -> L49
            android.graphics.Typeface$Builder r12 = r12.setItalic(r13)     // Catch: java.lang.Throwable -> L49
            android.graphics.Typeface r12 = r12.build()     // Catch: java.lang.Throwable -> L49
            if (r11 == 0) goto L48
            r11.close()     // Catch: java.io.IOException -> L55
        L48:
            return r12
        L49:
            r12 = move-exception
            if (r11 == 0) goto L54
            r11.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r11 = move-exception
            r12.addSuppressed(r11)     // Catch: java.io.IOException -> L55
        L54:
            throw r12     // Catch: java.io.IOException -> L55
        L55:
            return r1
        L56:
            java.util.Map r11 = androidx.core.graphics.TypefaceCompatUtil.readFontInfoIntoByteBuffer(r11, r13, r12)
            java.lang.Object r12 = r10.newFamily()
            if (r12 != 0) goto L61
            return r1
        L61:
            int r0 = r13.length
            r3 = 0
            r9 = r3
        L64:
            if (r9 >= r0) goto L91
            r4 = r13[r9]
            android.net.Uri r5 = r4.getUri()
            java.lang.Object r5 = r11.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L75
            goto L8e
        L75:
            int r6 = r4.getTtcIndex()
            int r7 = r4.getWeight()
            boolean r8 = r4.isItalic()
            r3 = r10
            r4 = r12
            boolean r3 = r3.addFontFromBuffer(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L8d
            r10.abortCreation(r12)
            return r1
        L8d:
            r3 = r2
        L8e:
            int r9 = r9 + 1
            goto L64
        L91:
            if (r3 != 0) goto L97
            r10.abortCreation(r12)
            return r1
        L97:
            boolean r11 = r10.freeze(r12)
            if (r11 != 0) goto L9e
            return r1
        L9e:
            android.graphics.Typeface r11 = r10.createFromFamiliesWithDefault(r12)
            if (r11 != 0) goto La5
            return r1
        La5:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r14)
            return r11
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context r9, android.content.res.Resources r10, int r11, java.lang.String r12, int r13) {
            r8 = this;
            boolean r0 = r8.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r9 = super.createFromResourcesFontFile(r9, r10, r11, r12, r13)
            return r9
        Lb:
            java.lang.Object r10 = r8.newFamily()
            r11 = 0
            if (r10 != 0) goto L13
            return r11
        L13:
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            boolean r9 = r0.addFontFromAssetManager(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L25
            r8.abortCreation(r10)
            return r11
        L25:
            boolean r9 = r8.freeze(r10)
            if (r9 != 0) goto L2c
            return r11
        L2c:
            android.graphics.Typeface r9 = r8.createFromFamiliesWithDefault(r10)
            return r9
    }

    protected java.lang.reflect.Method obtainAbortCreationMethod(java.lang.Class<?> r3) throws java.lang.NoSuchMethodException {
            r2 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.String r1 = "abortCreation"
            java.lang.reflect.Method r3 = r3.getMethod(r1, r0)
            return r3
    }

    protected java.lang.reflect.Method obtainAddFontFromAssetManagerMethod(java.lang.Class<?> r4) throws java.lang.NoSuchMethodException {
            r3 = this;
            r0 = 8
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.res.AssetManager> r2 = android.content.res.AssetManager.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r1] = r2
            r1 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 3
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r0[r1] = r2
            r1 = 4
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 5
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 6
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 7
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r2 = android.graphics.fonts.FontVariationAxis[].class
            r0[r1] = r2
            java.lang.String r1 = "addFontFromAssetManager"
            java.lang.reflect.Method r4 = r4.getMethod(r1, r0)
            return r4
    }

    protected java.lang.reflect.Method obtainAddFontFromBufferMethod(java.lang.Class<?> r4) throws java.lang.NoSuchMethodException {
            r3 = this;
            r0 = 5
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<java.nio.ByteBuffer> r2 = java.nio.ByteBuffer.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 2
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r2 = android.graphics.fonts.FontVariationAxis[].class
            r0[r1] = r2
            r1 = 3
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 4
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            java.lang.String r1 = "addFontFromBuffer"
            java.lang.reflect.Method r4 = r4.getMethod(r1, r0)
            return r4
    }

    protected java.lang.reflect.Method obtainCreateFromFamiliesWithDefaultMethod(java.lang.Class<?> r5) throws java.lang.NoSuchMethodException {
            r4 = this;
            r0 = 1
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r0)
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = 0
            java.lang.Class r5 = r5.getClass()
            r2[r3] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r2[r0] = r5
            r5 = 2
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r5] = r3
            java.lang.String r5 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r2)
            r5.setAccessible(r0)
            return r5
    }

    protected java.lang.Class<?> obtainFontFamily() throws java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            return r0
    }

    protected java.lang.reflect.Constructor<?> obtainFontFamilyCtor(java.lang.Class<?> r2) throws java.lang.NoSuchMethodException {
            r1 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r2 = r2.getConstructor(r0)
            return r2
    }

    protected java.lang.reflect.Method obtainFreezeMethod(java.lang.Class<?> r3) throws java.lang.NoSuchMethodException {
            r2 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.String r1 = "freeze"
            java.lang.reflect.Method r3 = r3.getMethod(r1, r0)
            return r3
    }
}
