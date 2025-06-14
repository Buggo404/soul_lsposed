package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010416667f;
    static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE = null;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667f;
    static final java.lang.String EXTRA_INT1 = "int1";
    static final java.lang.String EXTRA_INT2 = "int2";
    static final java.lang.String EXTRA_OBJ = "obj";
    static final java.lang.String EXTRA_STRING1 = "string1";
    static final java.lang.String EXTRA_TINT_LIST = "tint_list";
    static final java.lang.String EXTRA_TINT_MODE = "tint_mode";
    static final java.lang.String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.9166667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334f;
    private static final java.lang.String TAG = "IconCompat";
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
    public byte[] mData;
    public int mInt1;
    public int mInt2;
    java.lang.Object mObj1;
    public android.os.Parcelable mParcelable;
    public java.lang.String mString1;
    public android.content.res.ColorStateList mTintList;
    android.graphics.PorterDuff.Mode mTintMode;
    public java.lang.String mTintModeStr;
    public int mType;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE = r0
            return
    }

    public IconCompat() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mType = r0
            r0 = 0
            r2.mData = r0
            r2.mParcelable = r0
            r1 = 0
            r2.mInt1 = r1
            r2.mInt2 = r1
            r2.mTintList = r0
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            r2.mTintMode = r1
            r2.mTintModeStr = r0
            return
    }

    private IconCompat(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mData = r0
            r2.mParcelable = r0
            r1 = 0
            r2.mInt1 = r1
            r2.mInt2 = r1
            r2.mTintList = r0
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            r2.mTintMode = r1
            r2.mTintModeStr = r0
            r2.mType = r3
            return
    }

    public static androidx.core.graphics.drawable.IconCompat createFromBundle(android.os.Bundle r4) {
            java.lang.String r0 = "type"
            int r0 = r4.getInt(r0)
            androidx.core.graphics.drawable.IconCompat r1 = new androidx.core.graphics.drawable.IconCompat
            r1.<init>(r0)
            java.lang.String r2 = "int1"
            int r2 = r4.getInt(r2)
            r1.mInt1 = r2
            java.lang.String r2 = "int2"
            int r2 = r4.getInt(r2)
            r1.mInt2 = r2
            java.lang.String r2 = "string1"
            java.lang.String r2 = r4.getString(r2)
            r1.mString1 = r2
            java.lang.String r2 = "tint_list"
            boolean r3 = r4.containsKey(r2)
            if (r3 == 0) goto L33
            android.os.Parcelable r2 = r4.getParcelable(r2)
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r1.mTintList = r2
        L33:
            java.lang.String r2 = "tint_mode"
            boolean r3 = r4.containsKey(r2)
            if (r3 == 0) goto L45
            java.lang.String r2 = r4.getString(r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.valueOf(r2)
            r1.mTintMode = r2
        L45:
            java.lang.String r2 = "obj"
            switch(r0) {
                case -1: goto L6e;
                case 0: goto L4a;
                case 1: goto L6e;
                case 2: goto L67;
                case 3: goto L60;
                case 4: goto L67;
                case 5: goto L6e;
                case 6: goto L67;
                default: goto L4a;
            }
        L4a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown type "
            r4.<init>(r1)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "IconCompat"
            android.util.Log.w(r0, r4)
            r4 = 0
            return r4
        L60:
            byte[] r4 = r4.getByteArray(r2)
            r1.mObj1 = r4
            goto L74
        L67:
            java.lang.String r4 = r4.getString(r2)
            r1.mObj1 = r4
            goto L74
        L6e:
            android.os.Parcelable r4 = r4.getParcelable(r2)
            r1.mObj1 = r4
        L74:
            return r1
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIcon(android.content.Context r2, android.graphics.drawable.Icon r3) {
            androidx.core.util.Preconditions.checkNotNull(r3)
            int r0 = getType(r3)
            r1 = 2
            if (r0 == r1) goto L2b
            r2 = 4
            if (r0 == r2) goto L22
            r2 = 6
            if (r0 == r2) goto L19
            androidx.core.graphics.drawable.IconCompat r2 = new androidx.core.graphics.drawable.IconCompat
            r0 = -1
            r2.<init>(r0)
            r2.mObj1 = r3
            return r2
        L19:
            android.net.Uri r2 = getUri(r3)
            androidx.core.graphics.drawable.IconCompat r2 = createWithAdaptiveBitmapContentUri(r2)
            return r2
        L22:
            android.net.Uri r2 = getUri(r3)
            androidx.core.graphics.drawable.IconCompat r2 = createWithContentUri(r2)
            return r2
        L2b:
            java.lang.String r0 = getResPackage(r3)
            android.content.res.Resources r2 = getResources(r2, r0)     // Catch: android.content.res.Resources.NotFoundException -> L3c
            int r3 = getResId(r3)     // Catch: android.content.res.Resources.NotFoundException -> L3c
            androidx.core.graphics.drawable.IconCompat r2 = createWithResource(r2, r0, r3)     // Catch: android.content.res.Resources.NotFoundException -> L3c
            return r2
        L3c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Icon resource cannot be found"
            r2.<init>(r3)
            throw r2
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIcon(android.graphics.drawable.Icon r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = getType(r2)
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 4
            if (r0 == r1) goto L22
            r1 = 6
            if (r0 == r1) goto L19
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = -1
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
        L19:
            android.net.Uri r2 = getUri(r2)
            androidx.core.graphics.drawable.IconCompat r2 = createWithAdaptiveBitmapContentUri(r2)
            return r2
        L22:
            android.net.Uri r2 = getUri(r2)
            androidx.core.graphics.drawable.IconCompat r2 = createWithContentUri(r2)
            return r2
        L2b:
            java.lang.String r0 = getResPackage(r2)
            int r2 = getResId(r2)
            r1 = 0
            androidx.core.graphics.drawable.IconCompat r2 = createWithResource(r1, r0, r2)
            return r2
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIconOrNullIfZeroResId(android.graphics.drawable.Icon r2) {
            int r0 = getType(r2)
            r1 = 2
            if (r0 != r1) goto Lf
            int r0 = getResId(r2)
            if (r0 != 0) goto Lf
            r2 = 0
            return r2
        Lf:
            androidx.core.graphics.drawable.IconCompat r2 = createFromIcon(r2)
            return r2
    }

    static android.graphics.Bitmap createLegacyIconFromAdaptiveIcon(android.graphics.Bitmap r9, boolean r10) {
            int r0 = r9.getWidth()
            int r1 = r9.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            r1 = 1059760811(0x3f2aaaab, float:0.6666667)
            float r0 = r0 * r1
            int r0 = (int) r0
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r0, r1)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 3
            r3.<init>(r4)
            float r4 = (float) r0
            r5 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r4
            r6 = 1063955115(0x3f6aaaab, float:0.9166667)
            float r6 = r6 * r5
            if (r10 == 0) goto L4d
            r10 = 1009429163(0x3c2aaaab, float:0.010416667)
            float r10 = r10 * r4
            r7 = 0
            r3.setColor(r7)
            r7 = 1017817771(0x3caaaaab, float:0.020833334)
            float r4 = r4 * r7
            r7 = 1023410176(0x3d000000, float:0.03125)
            r8 = 0
            r3.setShadowLayer(r10, r8, r4, r7)
            r2.drawCircle(r5, r5, r6, r3)
            r4 = 503316480(0x1e000000, float:6.7762636E-21)
            r3.setShadowLayer(r10, r8, r8, r4)
            r2.drawCircle(r5, r5, r6, r3)
            r3.clearShadowLayer()
        L4d:
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r10)
            android.graphics.BitmapShader r10 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP
            r10.<init>(r9, r4, r7)
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            int r7 = r9.getWidth()
            int r7 = r7 - r0
            int r7 = -r7
            int r7 = r7 / 2
            float r7 = (float) r7
            int r9 = r9.getHeight()
            int r9 = r9 - r0
            int r9 = -r9
            int r9 = r9 / 2
            float r9 = (float) r9
            r4.setTranslate(r7, r9)
            r10.setLocalMatrix(r4)
            r3.setShader(r10)
            r2.drawCircle(r5, r5, r6, r3)
            r9 = 0
            r2.setBitmap(r9)
            return r1
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmap(android.graphics.Bitmap r2) {
            if (r2 == 0) goto Lb
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 5
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bitmap must not be null."
            r2.<init>(r0)
            throw r2
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(android.net.Uri r1) {
            if (r1 == 0) goto Lb
            java.lang.String r1 = r1.toString()
            androidx.core.graphics.drawable.IconCompat r1 = createWithAdaptiveBitmapContentUri(r1)
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Uri must not be null."
            r1.<init>(r0)
            throw r1
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(java.lang.String r2) {
            if (r2 == 0) goto Lb
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 6
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Uri must not be null."
            r2.<init>(r0)
            throw r2
    }

    public static androidx.core.graphics.drawable.IconCompat createWithBitmap(android.graphics.Bitmap r2) {
            if (r2 == 0) goto Lb
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 1
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bitmap must not be null."
            r2.<init>(r0)
            throw r2
    }

    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(android.net.Uri r1) {
            if (r1 == 0) goto Lb
            java.lang.String r1 = r1.toString()
            androidx.core.graphics.drawable.IconCompat r1 = createWithContentUri(r1)
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Uri must not be null."
            r1.<init>(r0)
            throw r1
    }

    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(java.lang.String r2) {
            if (r2 == 0) goto Lb
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 4
            r0.<init>(r1)
            r0.mObj1 = r2
            return r0
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Uri must not be null."
            r2.<init>(r0)
            throw r2
    }

    public static androidx.core.graphics.drawable.IconCompat createWithData(byte[] r2, int r3, int r4) {
            if (r2 == 0) goto Lf
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 3
            r0.<init>(r1)
            r0.mObj1 = r2
            r0.mInt1 = r3
            r0.mInt2 = r4
            return r0
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Data must not be null."
            r2.<init>(r3)
            throw r2
    }

    public static androidx.core.graphics.drawable.IconCompat createWithResource(android.content.Context r1, int r2) {
            if (r1 == 0) goto Lf
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r1 = r1.getPackageName()
            androidx.core.graphics.drawable.IconCompat r1 = createWithResource(r0, r1, r2)
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Context must not be null."
            r1.<init>(r2)
            throw r1
    }

    public static androidx.core.graphics.drawable.IconCompat createWithResource(android.content.res.Resources r2, java.lang.String r3, int r4) {
            if (r3 == 0) goto L2a
            if (r4 == 0) goto L22
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r1 = 2
            r0.<init>(r1)
            r0.mInt1 = r4
            if (r2 == 0) goto L1d
            java.lang.String r2 = r2.getResourceName(r4)     // Catch: android.content.res.Resources.NotFoundException -> L15
            r0.mObj1 = r2     // Catch: android.content.res.Resources.NotFoundException -> L15
            goto L1f
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Icon resource cannot be found"
            r2.<init>(r3)
            throw r2
        L1d:
            r0.mObj1 = r3
        L1f:
            r0.mString1 = r3
            return r0
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Drawable resource ID must not be 0"
            r2.<init>(r3)
            throw r2
        L2a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Package must not be null."
            r2.<init>(r3)
            throw r2
    }

    private static int getResId(android.graphics.drawable.Icon r6) {
            java.lang.String r0 = "Unable to get icon resource"
            java.lang.String r1 = "IconCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto Lf
            int r6 = r6.getResId()
            return r6
        Lf:
            r2 = 0
            java.lang.Class r3 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            java.lang.String r4 = "getResId"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            java.lang.Object r6 = r3.invoke(r6, r4)     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            int r6 = r6.intValue()     // Catch: java.lang.NoSuchMethodException -> L29 java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L33
            return r6
        L29:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return r2
        L2e:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return r2
        L33:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return r2
    }

    private static java.lang.String getResPackage(android.graphics.drawable.Icon r7) {
            java.lang.String r0 = "Unable to get icon package"
            java.lang.String r1 = "IconCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto Lf
            java.lang.String r7 = r7.getResPackage()
            return r7
        Lf:
            r2 = 0
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.String r4 = "getResPackage"
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.Object r7 = r3.invoke(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            return r7
        L26:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r2
        L2b:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r2
        L30:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r2
    }

    private static android.content.res.Resources getResources(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = "android"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto Ld
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            return r3
        Ld:
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1 = 0
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo(r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            if (r0 == 0) goto L1f
            android.content.res.Resources r3 = r3.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            return r3
        L1f:
            return r1
        L20:
            r3 = move-exception
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r4
            java.lang.String r4 = "Unable to find pkg=%s for icon"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            java.lang.String r0 = "IconCompat"
            android.util.Log.e(r0, r4, r3)
            return r1
    }

    private static int getType(android.graphics.drawable.Icon r7) {
            java.lang.String r0 = "Unable to get icon type "
            java.lang.String r1 = "IconCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto Lf
            int r7 = r7.getType()
            return r7
        Lf:
            r2 = -1
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3c java.lang.IllegalAccessException -> L4e
            java.lang.String r4 = "getType"
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3c java.lang.IllegalAccessException -> L4e
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3c java.lang.IllegalAccessException -> L4e
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3c java.lang.IllegalAccessException -> L4e
            java.lang.Object r3 = r3.invoke(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3c java.lang.IllegalAccessException -> L4e
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3c java.lang.IllegalAccessException -> L4e
            int r7 = r3.intValue()     // Catch: java.lang.NoSuchMethodException -> L2a java.lang.reflect.InvocationTargetException -> L3c java.lang.IllegalAccessException -> L4e
            return r7
        L2a:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.String r7 = r7.toString()
            android.util.Log.e(r1, r7, r3)
            return r2
        L3c:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.String r7 = r7.toString()
            android.util.Log.e(r1, r7, r3)
            return r2
        L4e:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.String r7 = r7.toString()
            android.util.Log.e(r1, r7, r3)
            return r2
    }

    private static android.net.Uri getUri(android.graphics.drawable.Icon r7) {
            java.lang.String r0 = "Unable to get icon uri"
            java.lang.String r1 = "IconCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto Lf
            android.net.Uri r7 = r7.getUri()
            return r7
        Lf:
            r2 = 0
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.String r4 = "getUri"
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            java.lang.Object r7 = r3.invoke(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            android.net.Uri r7 = (android.net.Uri) r7     // Catch: java.lang.NoSuchMethodException -> L26 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L30
            return r7
        L26:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r2
        L2b:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r2
        L30:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r2
    }

    private android.graphics.drawable.Drawable loadDrawableInner(android.content.Context r6) {
            r5 = this;
            int r0 = r5.mType
            r1 = 0
            r2 = 0
            switch(r0) {
                case 1: goto Lb0;
                case 2: goto L76;
                case 3: goto L60;
                case 4: goto L4c;
                case 5: goto L3a;
                case 6: goto L9;
                default: goto L7;
            }
        L7:
            goto Lbe
        L9:
            java.io.InputStream r0 = r5.getUriInputStream(r6)
            if (r0 == 0) goto Lbe
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L28
            android.graphics.drawable.AdaptiveIconDrawable r2 = new android.graphics.drawable.AdaptiveIconDrawable
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
            r3.<init>(r6, r0)
            r2.<init>(r1, r3)
            return r2
        L28:
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
            android.graphics.Bitmap r0 = createLegacyIconFromAdaptiveIcon(r0, r2)
            r1.<init>(r6, r0)
            return r1
        L3a:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            java.lang.Object r1 = r5.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.graphics.Bitmap r1 = createLegacyIconFromAdaptiveIcon(r1, r2)
            r0.<init>(r6, r1)
            return r0
        L4c:
            java.io.InputStream r0 = r5.getUriInputStream(r6)
            if (r0 == 0) goto Lbe
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
            r1.<init>(r6, r0)
            return r1
        L60:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            java.lang.Object r1 = r5.mObj1
            byte[] r1 = (byte[]) r1
            int r2 = r5.mInt1
            int r3 = r5.mInt2
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r3)
            r0.<init>(r6, r1)
            return r0
        L76:
            java.lang.String r0 = r5.getResPackage()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L84
            java.lang.String r0 = r6.getPackageName()
        L84:
            android.content.res.Resources r0 = getResources(r6, r0)
            int r3 = r5.mInt1     // Catch: java.lang.RuntimeException -> L93
            android.content.res.Resources$Theme r6 = r6.getTheme()     // Catch: java.lang.RuntimeException -> L93
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.ResourcesCompat.getDrawable(r0, r3, r6)     // Catch: java.lang.RuntimeException -> L93
            return r6
        L93:
            r6 = move-exception
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r3 = r5.mInt1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            r2 = 1
            java.lang.Object r3 = r5.mObj1
            r0[r2] = r3
            java.lang.String r2 = "Unable to load resource 0x%08x from pkg=%s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r2 = "IconCompat"
            android.util.Log.e(r2, r0, r6)
            goto Lbe
        Lb0:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            java.lang.Object r1 = r5.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.<init>(r6, r1)
            return r0
        Lbe:
            return r1
    }

    private static java.lang.String typeToString(int r0) {
            switch(r0) {
                case 1: goto L15;
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Lc;
                case 5: goto L9;
                case 6: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "UNKNOWN"
            return r0
        L6:
            java.lang.String r0 = "URI_MASKABLE"
            return r0
        L9:
            java.lang.String r0 = "BITMAP_MASKABLE"
            return r0
        Lc:
            java.lang.String r0 = "URI"
            return r0
        Lf:
            java.lang.String r0 = "DATA"
            return r0
        L12:
            java.lang.String r0 = "RESOURCE"
            return r0
        L15:
            java.lang.String r0 = "BITMAP"
            return r0
    }

    public void addToShortcutIntent(android.content.Intent r5, android.graphics.drawable.Drawable r6, android.content.Context r7) {
            r4 = this;
            r4.checkResource(r7)
            int r0 = r4.mType
            r1 = 1
            if (r0 == r1) goto L97
            r2 = 2
            if (r0 == r2) goto L20
            r7 = 5
            if (r0 != r7) goto L18
            java.lang.Object r7 = r4.mObj1
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            android.graphics.Bitmap r7 = createLegacyIconFromAdaptiveIcon(r7, r1)
            goto La5
        L18:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Icon type not supported for intent shortcuts"
            r5.<init>(r6)
            throw r5
        L20:
            java.lang.String r0 = r4.getResPackage()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            r1 = 0
            android.content.Context r7 = r7.createPackageContext(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            if (r6 != 0) goto L37
            java.lang.String r6 = "android.intent.extra.shortcut.ICON_RESOURCE"
            int r0 = r4.mInt1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            android.content.Intent$ShortcutIconResource r7 = android.content.Intent.ShortcutIconResource.fromContext(r7, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            r5.putExtra(r6, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            return
        L37:
            int r0 = r4.mInt1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r7, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            int r2 = r0.getIntrinsicWidth()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            if (r2 <= 0) goto L59
            int r2 = r0.getIntrinsicHeight()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            if (r2 > 0) goto L4a
            goto L59
        L4a:
            int r7 = r0.getIntrinsicWidth()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            int r2 = r0.getIntrinsicHeight()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            goto L6b
        L59:
            java.lang.String r2 = "activity"
            java.lang.Object r7 = r7.getSystemService(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            int r7 = r7.getLauncherLargeIconSize()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r7, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
        L6b:
            int r2 = r7.getWidth()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            int r3 = r7.getHeight()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            r0.setBounds(r1, r1, r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            r1.<init>(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            r0.draw(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            goto La5
        L7f:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Can't find package "
            r7.<init>(r0)
            java.lang.Object r0 = r4.mObj1
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7, r5)
            throw r6
        L97:
            java.lang.Object r7 = r4.mObj1
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r6 == 0) goto La5
            android.graphics.Bitmap$Config r0 = r7.getConfig()
            android.graphics.Bitmap r7 = r7.copy(r0, r1)
        La5:
            if (r6 == 0) goto Lbe
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            int r2 = r0 / 2
            int r3 = r1 / 2
            r6.setBounds(r2, r3, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r7)
            r6.draw(r0)
        Lbe:
            java.lang.String r6 = "android.intent.extra.shortcut.ICON"
            r5.putExtra(r6, r7)
            return
    }

    public void checkResource(android.content.Context r9) {
            r8 = this;
            int r0 = r8.mType
            r1 = 2
            if (r0 != r1) goto L6f
            java.lang.Object r0 = r8.mObj1
            if (r0 == 0) goto L6f
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ":"
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L14
            return
        L14:
            r2 = -1
            java.lang.String[] r3 = r0.split(r1, r2)
            r4 = 1
            r3 = r3[r4]
            java.lang.String r5 = "/"
            java.lang.String[] r6 = r3.split(r5, r2)
            r7 = 0
            r6 = r6[r7]
            java.lang.String[] r3 = r3.split(r5, r2)
            r3 = r3[r4]
            java.lang.String[] r1 = r0.split(r1, r2)
            r1 = r1[r7]
            java.lang.String r2 = "0_resource_name_obfuscated"
            boolean r2 = r2.equals(r3)
            java.lang.String r4 = "IconCompat"
            if (r2 == 0) goto L41
            java.lang.String r9 = "Found obfuscated resource, not trying to update resource id for it"
            android.util.Log.i(r4, r9)
            return
        L41:
            java.lang.String r2 = r8.getResPackage()
            android.content.res.Resources r9 = getResources(r9, r2)
            int r9 = r9.getIdentifier(r3, r6, r1)
            int r1 = r8.mInt1
            if (r1 == r9) goto L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Id has changed for "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r4, r0)
            r8.mInt1 = r9
        L6f:
            return
    }

    public android.graphics.Bitmap getBitmap() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto L10
            java.lang.Object r0 = r3.mObj1
            boolean r1 = r0 instanceof android.graphics.Bitmap
            if (r1 == 0) goto Le
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        Le:
            r0 = 0
            return r0
        L10:
            r1 = 1
            if (r0 != r1) goto L18
            java.lang.Object r0 = r3.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L18:
            r2 = 5
            if (r0 != r2) goto L24
            java.lang.Object r0 = r3.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r0 = createLegacyIconFromAdaptiveIcon(r0, r1)
            return r0
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "called getBitmap() on "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int getResId() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto Le
            java.lang.Object r0 = r3.mObj1
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            int r0 = getResId(r0)
            return r0
        Le:
            r1 = 2
            if (r0 != r1) goto L14
            int r0 = r3.mInt1
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "called getResId() on "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getResPackage() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto Le
            java.lang.Object r0 = r3.mObj1
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            java.lang.String r0 = getResPackage(r0)
            return r0
        Le:
            r2 = 2
            if (r0 != r2) goto L2a
            java.lang.String r0 = r3.mString1
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.mObj1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ":"
            java.lang.String[] r0 = r0.split(r2, r1)
            r1 = 0
            r0 = r0[r1]
            return r0
        L27:
            java.lang.String r0 = r3.mString1
            return r0
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "called getResPackage() on "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int getType() {
            r2 = this;
            int r0 = r2.mType
            r1 = -1
            if (r0 != r1) goto Ld
            java.lang.Object r0 = r2.mObj1
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            int r0 = getType(r0)
        Ld:
            return r0
    }

    public android.net.Uri getUri() {
            r3 = this;
            int r0 = r3.mType
            r1 = -1
            if (r0 != r1) goto Le
            java.lang.Object r0 = r3.mObj1
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            android.net.Uri r0 = getUri(r0)
            return r0
        Le:
            r1 = 4
            if (r0 == r1) goto L2a
            r1 = 6
            if (r0 != r1) goto L15
            goto L2a
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "called getUri() on "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2a:
            java.lang.Object r0 = r3.mObj1
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }

    public java.io.InputStream getUriInputStream(android.content.Context r5) {
            r4 = this;
            android.net.Uri r0 = r4.getUri()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            java.lang.String r3 = "IconCompat"
            if (r2 != 0) goto L3e
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1b
            goto L3e
        L1b:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L2a
            java.io.File r1 = new java.io.File     // Catch: java.io.FileNotFoundException -> L2a
            java.lang.Object r2 = r4.mObj1     // Catch: java.io.FileNotFoundException -> L2a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.FileNotFoundException -> L2a
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L2a
            r5.<init>(r1)     // Catch: java.io.FileNotFoundException -> L2a
            return r5
        L2a:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to load image from path: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0, r5)
            goto L5a
        L3e:
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> L47
            java.io.InputStream r5 = r5.openInputStream(r0)     // Catch: java.lang.Exception -> L47
            return r5
        L47:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to load image from URI: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0, r5)
        L5a:
            r5 = 0
            return r5
    }

    public android.graphics.drawable.Drawable loadDrawable(android.content.Context r2) {
            r1 = this;
            r1.checkResource(r2)
            android.graphics.drawable.Icon r0 = r1.toIcon(r2)
            android.graphics.drawable.Drawable r2 = r0.loadDrawable(r2)
            return r2
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
            r4 = this;
            java.lang.String r0 = r4.mTintModeStr
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.valueOf(r0)
            r4.mTintMode = r0
            int r0 = r4.mType
            r1 = 0
            switch(r0) {
                case -1: goto L4f;
                case 0: goto Le;
                case 1: goto L3b;
                case 2: goto L14;
                case 3: goto Lf;
                case 4: goto L14;
                case 5: goto L3b;
                case 6: goto L14;
                default: goto Le;
            }
        Le:
            goto L5e
        Lf:
            byte[] r0 = r4.mData
            r4.mObj1 = r0
            goto L5e
        L14:
            java.lang.String r0 = new java.lang.String
            byte[] r2 = r4.mData
            java.lang.String r3 = "UTF-16"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r0.<init>(r2, r3)
            r4.mObj1 = r0
            int r2 = r4.mType
            r3 = 2
            if (r2 != r3) goto L5e
            java.lang.String r2 = r4.mString1
            if (r2 != 0) goto L5e
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = ":"
            r3 = -1
            java.lang.String[] r0 = r0.split(r2, r3)
            r0 = r0[r1]
            r4.mString1 = r0
            goto L5e
        L3b:
            android.os.Parcelable r0 = r4.mParcelable
            if (r0 == 0) goto L42
            r4.mObj1 = r0
            goto L5e
        L42:
            byte[] r0 = r4.mData
            r4.mObj1 = r0
            r2 = 3
            r4.mType = r2
            r4.mInt1 = r1
            int r0 = r0.length
            r4.mInt2 = r0
            goto L5e
        L4f:
            android.os.Parcelable r0 = r4.mParcelable
            if (r0 == 0) goto L56
            r4.mObj1 = r0
            goto L5e
        L56:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L5e:
            return
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.mTintMode
            java.lang.String r0 = r0.name()
            r3.mTintModeStr = r0
            int r0 = r3.mType
            java.lang.String r1 = "UTF-16"
            switch(r0) {
                case -1: goto L57;
                case 0: goto Lf;
                case 1: goto L37;
                case 2: goto L28;
                case 3: goto L21;
                case 4: goto L10;
                case 5: goto L37;
                case 6: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L68
        L10:
            java.lang.Object r4 = r3.mObj1
            java.lang.String r4 = r4.toString()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r1)
            byte[] r4 = r4.getBytes(r0)
            r3.mData = r4
            goto L68
        L21:
            java.lang.Object r4 = r3.mObj1
            byte[] r4 = (byte[]) r4
            r3.mData = r4
            goto L68
        L28:
            java.lang.Object r4 = r3.mObj1
            java.lang.String r4 = (java.lang.String) r4
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r1)
            byte[] r4 = r4.getBytes(r0)
            r3.mData = r4
            goto L68
        L37:
            if (r4 == 0) goto L50
            java.lang.Object r4 = r3.mObj1
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r2 = 90
            r4.compress(r1, r2, r0)
            byte[] r4 = r0.toByteArray()
            r3.mData = r4
            goto L68
        L50:
            java.lang.Object r4 = r3.mObj1
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r3.mParcelable = r4
            goto L68
        L57:
            if (r4 != 0) goto L60
            java.lang.Object r4 = r3.mObj1
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r3.mParcelable = r4
            goto L68
        L60:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't serialize Icon created with IconCompat#createFromIcon"
            r4.<init>(r0)
            throw r4
        L68:
            return
    }

    public androidx.core.graphics.drawable.IconCompat setTint(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            androidx.core.graphics.drawable.IconCompat r1 = r0.setTintList(r1)
            return r1
    }

    public androidx.core.graphics.drawable.IconCompat setTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.mTintList = r1
            return r0
    }

    public androidx.core.graphics.drawable.IconCompat setTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.mTintMode = r1
            return r0
    }

    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r3.mType
            java.lang.String r2 = "obj"
            switch(r1) {
                case -1: goto L2c;
                case 0: goto Lc;
                case 1: goto L24;
                case 2: goto L1c;
                case 3: goto L14;
                case 4: goto L1c;
                case 5: goto L24;
                case 6: goto L1c;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.Object r1 = r3.mObj1
            byte[] r1 = (byte[]) r1
            r0.putByteArray(r2, r1)
            goto L33
        L1c:
            java.lang.Object r1 = r3.mObj1
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r2, r1)
            goto L33
        L24:
            java.lang.Object r1 = r3.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.putParcelable(r2, r1)
            goto L33
        L2c:
            java.lang.Object r1 = r3.mObj1
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r0.putParcelable(r2, r1)
        L33:
            java.lang.String r1 = "type"
            int r2 = r3.mType
            r0.putInt(r1, r2)
            java.lang.String r1 = "int1"
            int r2 = r3.mInt1
            r0.putInt(r1, r2)
            java.lang.String r1 = "int2"
            int r2 = r3.mInt2
            r0.putInt(r1, r2)
            java.lang.String r1 = "string1"
            java.lang.String r2 = r3.mString1
            r0.putString(r1, r2)
            android.content.res.ColorStateList r1 = r3.mTintList
            if (r1 == 0) goto L58
            java.lang.String r2 = "tint_list"
            r0.putParcelable(r2, r1)
        L58:
            android.graphics.PorterDuff$Mode r1 = r3.mTintMode
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            if (r1 == r2) goto L67
            java.lang.String r2 = "tint_mode"
            java.lang.String r1 = r1.name()
            r0.putString(r2, r1)
        L67:
            return r0
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Icon toIcon() {
            r1 = this;
            r0 = 0
            android.graphics.drawable.Icon r0 = r1.toIcon(r0)
            return r0
    }

    public android.graphics.drawable.Icon toIcon(android.content.Context r5) {
            r4 = this;
            int r0 = r4.mType
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto Lca;
                case 0: goto L8;
                case 1: goto Lb1;
                case 2: goto La6;
                case 3: goto L99;
                case 4: goto L90;
                case 5: goto L76;
                case 6: goto L10;
                default: goto L8;
            }
        L8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r5.<init>(r0)
            throw r5
        L10:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 < r3) goto L20
            android.net.Uri r5 = r4.getUri()
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r5)
            goto Lb9
        L20:
            if (r5 == 0) goto L5d
            java.io.InputStream r5 = r4.getUriInputStream(r5)
            if (r5 == 0) goto L44
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L36
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto Lb9
        L36:
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
            android.graphics.Bitmap r5 = createLegacyIconFromAdaptiveIcon(r5, r1)
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            goto Lb9
        L44:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.<init>(r1)
            android.net.Uri r1 = r4.getUri()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L5d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.<init>(r1)
            android.net.Uri r1 = r4.getUri()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L76:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L83
            java.lang.Object r5 = r4.mObj1
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto Lb9
        L83:
            java.lang.Object r5 = r4.mObj1
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            android.graphics.Bitmap r5 = createLegacyIconFromAdaptiveIcon(r5, r1)
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            goto Lb9
        L90:
            java.lang.Object r5 = r4.mObj1
            java.lang.String r5 = (java.lang.String) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
            goto Lb9
        L99:
            java.lang.Object r5 = r4.mObj1
            byte[] r5 = (byte[]) r5
            int r0 = r4.mInt1
            int r1 = r4.mInt2
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
            goto Lb9
        La6:
            java.lang.String r5 = r4.getResPackage()
            int r0 = r4.mInt1
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
            goto Lb9
        Lb1:
            java.lang.Object r5 = r4.mObj1
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
        Lb9:
            android.content.res.ColorStateList r0 = r4.mTintList
            if (r0 == 0) goto Lc0
            r5.setTintList(r0)
        Lc0:
            android.graphics.PorterDuff$Mode r0 = r4.mTintMode
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            if (r0 == r1) goto Lc9
            r5.setTintMode(r0)
        Lc9:
            return r5
        Lca:
            java.lang.Object r5 = r4.mObj1
            android.graphics.drawable.Icon r5 = (android.graphics.drawable.Icon) r5
            return r5
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.mType
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r5.mObj1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r5.mType
            java.lang.String r1 = typeToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r5.mType
            switch(r1) {
                case 1: goto L74;
                case 2: goto L4a;
                case 3: goto L2f;
                case 4: goto L23;
                case 5: goto L74;
                case 6: goto L23;
                default: goto L22;
            }
        L22:
            goto L97
        L23:
            java.lang.String r1 = " uri="
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.Object r2 = r5.mObj1
            r1.append(r2)
            goto L97
        L2f:
            java.lang.String r1 = " len="
            java.lang.StringBuilder r1 = r0.append(r1)
            int r2 = r5.mInt1
            r1.append(r2)
            int r1 = r5.mInt2
            if (r1 == 0) goto L97
            java.lang.String r1 = " off="
            java.lang.StringBuilder r1 = r0.append(r1)
            int r2 = r5.mInt2
            r1.append(r2)
            goto L97
        L4a:
            java.lang.String r1 = " pkg="
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = r5.mString1
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " id="
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r5.getResId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "0x%08x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.append(r2)
            goto L97
        L74:
            java.lang.String r1 = " size="
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.Object r2 = r5.mObj1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            int r2 = r2.getWidth()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "x"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Object r2 = r5.mObj1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            int r2 = r2.getHeight()
            r1.append(r2)
        L97:
            android.content.res.ColorStateList r1 = r5.mTintList
            if (r1 == 0) goto La5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r5.mTintList
            r0.append(r1)
        La5:
            android.graphics.PorterDuff$Mode r1 = r5.mTintMode
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            if (r1 == r2) goto Lb6
            java.lang.String r1 = " mode="
            java.lang.StringBuilder r1 = r0.append(r1)
            android.graphics.PorterDuff$Mode r2 = r5.mTintMode
            r1.append(r2)
        Lb6:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
