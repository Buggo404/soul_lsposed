package androidx.core.content.res;

/* loaded from: classes.dex */
public final class ResourcesCompat {
    public static final int ID_NULL = 0;
    private static final java.lang.String TAG = "ResourcesCompat";

    public static abstract class FontCallback {



        public FontCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.os.Handler getHandler(android.os.Handler r1) {
                if (r1 != 0) goto Lb
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
            Lb:
                return r1
        }

        public final void callbackFailAsync(int r2, android.os.Handler r3) {
                r1 = this;
                android.os.Handler r3 = getHandler(r3)
                androidx.core.content.res.ResourcesCompat$FontCallback$2 r0 = new androidx.core.content.res.ResourcesCompat$FontCallback$2
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }

        public final void callbackSuccessAsync(android.graphics.Typeface r2, android.os.Handler r3) {
                r1 = this;
                android.os.Handler r3 = getHandler(r3)
                androidx.core.content.res.ResourcesCompat$FontCallback$1 r0 = new androidx.core.content.res.ResourcesCompat$FontCallback$1
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }

        public abstract void onFontRetrievalFailed(int r1);

        public abstract void onFontRetrieved(android.graphics.Typeface r1);
    }

    public static final class ThemeCompat {

        static class ImplApi23 {
            private static java.lang.reflect.Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final java.lang.Object sRebaseMethodLock = null;

            static {
                    java.lang.Object r0 = new java.lang.Object
                    r0.<init>()
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.ImplApi23.sRebaseMethodLock = r0
                    return
            }

            private ImplApi23() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void rebase(android.content.res.Resources.Theme r6) {
                    java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.ThemeCompat.ImplApi23.sRebaseMethodLock
                    monitor-enter(r0)
                    boolean r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.ImplApi23.sRebaseMethodFetched     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.ImplApi23.sRebaseMethod = r3     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    goto L21
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3c
                L21:
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.ImplApi23.sRebaseMethodFetched = r1     // Catch: java.lang.Throwable -> L3c
                L23:
                    java.lang.reflect.Method r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.ImplApi23.sRebaseMethod     // Catch: java.lang.Throwable -> L3c
                    if (r1 == 0) goto L3a
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    goto L3a
                L2d:
                    r6 = move-exception
                    goto L30
                L2f:
                    r6 = move-exception
                L30:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3c
                    r6 = 0
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.ImplApi23.sRebaseMethod = r6     // Catch: java.lang.Throwable -> L3c
                L3a:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    return
                L3c:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r6
            }
        }

        static class ImplApi29 {
            private ImplApi29() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void rebase(android.content.res.Resources.Theme r0) {
                    r0.rebase()
                    return
            }
        }

        private ThemeCompat() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void rebase(android.content.res.Resources.Theme r2) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto La
                androidx.core.content.res.ResourcesCompat.ThemeCompat.ImplApi29.rebase(r2)
                goto Ld
            La:
                androidx.core.content.res.ResourcesCompat.ThemeCompat.ImplApi23.rebase(r2)
            Ld:
                return
        }
    }

    private ResourcesCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Typeface getCachedFont(android.content.Context r8, int r9) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r0 = r8
            r1 = r9
            android.graphics.Typeface r8 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static int getColor(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) throws android.content.res.Resources.NotFoundException {
            int r0 = r0.getColor(r1, r2)
            return r0
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) throws android.content.res.Resources.NotFoundException {
            android.content.res.ColorStateList r0 = r0.getColorStateList(r1, r2)
            return r0
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) throws android.content.res.Resources.NotFoundException {
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1, r2)
            return r0
    }

    public static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources r0, int r1, int r2, android.content.res.Resources.Theme r3) throws android.content.res.Resources.NotFoundException {
            android.graphics.drawable.Drawable r0 = r0.getDrawableForDensity(r1, r2, r3)
            return r0
    }

    public static float getFloat(android.content.res.Resources r3, int r4) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1 = 1
            r3.getValue(r4, r0, r1)
            int r3 = r0.type
            r1 = 4
            if (r3 != r1) goto L13
            float r3 = r0.getFloat()
            return r3
        L13:
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Resource ID #0x"
            r1.<init>(r2)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " type #0x"
            java.lang.StringBuilder r4 = r4.append(r1)
            int r0 = r0.type
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = " is not valid"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public static android.graphics.Typeface getFont(android.content.Context r8, int r9) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            android.graphics.Typeface r8 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static android.graphics.Typeface getFont(android.content.Context r8, int r9, android.util.TypedValue r10, int r11, androidx.core.content.res.ResourcesCompat.FontCallback r12) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            r5 = 0
            r6 = 1
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            android.graphics.Typeface r8 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static void getFont(android.content.Context r8, int r9, androidx.core.content.res.ResourcesCompat.FontCallback r10, android.os.Handler r11) throws android.content.res.Resources.NotFoundException {
            androidx.core.util.Preconditions.checkNotNull(r10)
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Le
            r8 = -4
            r10.callbackFailAsync(r8, r11)
            return
        Le:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r4 = r10
            r5 = r11
            loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private static android.graphics.Typeface loadFont(android.content.Context r10, int r11, android.util.TypedValue r12, int r13, androidx.core.content.res.ResourcesCompat.FontCallback r14, android.os.Handler r15, boolean r16, boolean r17) {
            android.content.res.Resources r1 = r10.getResources()
            r0 = 1
            r9 = r11
            r2 = r12
            r1.getValue(r11, r12, r0)
            r0 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            android.graphics.Typeface r0 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != 0) goto L3d
            if (r14 != 0) goto L3d
            if (r17 == 0) goto L1e
            goto L3d
        L1e:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Font resource ID #0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r11)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3d:
            return r0
    }

    private static android.graphics.Typeface loadFont(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.res.ResourcesCompat.FontCallback r20, android.os.Handler r21, boolean r22, boolean r23) {
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto La8
            java.lang.CharSequence r1 = r1.string
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L28
            if (r9 == 0) goto L27
            r9.callbackFailAsync(r13, r10)
        L27:
            return r14
        L28:
            android.graphics.Typeface r1 = androidx.core.graphics.TypefaceCompat.findFromCache(r0, r4, r5)
            if (r1 == 0) goto L34
            if (r9 == 0) goto L33
            r9.callbackSuccessAsync(r1, r10)
        L33:
            return r1
        L34:
            if (r23 == 0) goto L37
            return r14
        L37:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L8f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L8f
            if (r1 == 0) goto L6a
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L8f
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r2 = androidx.core.content.res.FontResourcesParserCompat.parse(r1, r0)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L8f
            if (r2 != 0) goto L58
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L57
            r9.callbackFailAsync(r13, r10)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L8f
        L57:
            return r14
        L58:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L8f
            return r0
        L6a:
            r1 = r15
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L7a
            if (r0 == 0) goto L77
            r9.callbackSuccessAsync(r0, r10)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L8f
            goto L7a
        L77:
            r9.callbackFailAsync(r13, r10)     // Catch: java.io.IOException -> L7b org.xmlpull.v1.XmlPullParserException -> L8f
        L7a:
            return r0
        L7b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to read xml resource "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto La2
        L8f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to parse xml resource "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        La2:
            if (r9 == 0) goto La7
            r9.callbackFailAsync(r13, r10)
        La7:
            return r14
        La8:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Resource \""
            r3.<init>(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = "\" ("
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r18)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = ") is not a Font: "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }
}
