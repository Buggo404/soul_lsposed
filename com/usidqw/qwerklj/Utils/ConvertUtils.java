package com.usidqw.qwerklj.Utils;

/* loaded from: classes.dex */
public class ConvertUtils {

    /* renamed from: GB */
    public static final long f158GB = 1073741824;

    /* renamed from: KB */
    public static final long f159KB = 1024;

    /* renamed from: MB */
    public static final long f160MB = 1048576;

    public ConvertUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String _queryPathFromMediaStore(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
            java.lang.String r0 = "_data"
            r1 = 0
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.IllegalArgumentException -> L23
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L23
            r7 = 0
            r3 = r9
            r5 = r10
            r6 = r11
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.IllegalArgumentException -> L23
            if (r8 == 0) goto L23
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L23
            r8.moveToFirst()     // Catch: java.lang.IllegalArgumentException -> L23
            java.lang.String r1 = r8.getString(r9)     // Catch: java.lang.IllegalArgumentException -> L23
            r8.close()     // Catch: java.lang.IllegalArgumentException -> L23
        L23:
            return r1
    }

    public static <T> T[] toArray(java.util.List<T> r0) {
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    public static java.lang.String toBinaryString(int r0) {
            java.lang.String r0 = java.lang.Integer.toBinaryString(r0)
            return r0
    }

    public static java.lang.String toBinaryString(byte... r7) {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x006e: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            int r1 = r7.length
            int r1 = r1 * 8
            char[] r1 = new char[r1]
            r2 = 0
            r3 = r2
        Le:
            int r4 = r7.length
            if (r2 >= r4) goto L68
            r4 = r7[r2]
            if (r4 >= 0) goto L17
            int r4 = r4 + 256
        L17:
            int r5 = r3 + 1
            int r6 = r4 >>> 7
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r3] = r6
            int r3 = r5 + 1
            int r6 = r4 >>> 6
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r5] = r6
            int r5 = r3 + 1
            int r6 = r4 >>> 5
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r3] = r6
            int r3 = r5 + 1
            int r6 = r4 >>> 4
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r5] = r6
            int r5 = r3 + 1
            int r6 = r4 >>> 3
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r3] = r6
            int r3 = r5 + 1
            int r6 = r4 >>> 2
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r5] = r6
            int r5 = r3 + 1
            int r6 = r4 >>> 1
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r3] = r6
            int r3 = r5 + 1
            r4 = r4 & 1
            char r4 = r0[r4]
            r1[r5] = r4
            int r2 = r2 + 1
            goto Le
        L68:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1)
            return r7
    }

    public static android.graphics.Bitmap toBitmap(android.graphics.drawable.Drawable r5) {
            boolean r0 = r5 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5
            android.graphics.Bitmap r5 = r5.getBitmap()
            return r5
        Lb:
            boolean r0 = r5 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L26
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1 = 32
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r1, r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.drawable.ColorDrawable r5 = (android.graphics.drawable.ColorDrawable) r5
            int r5 = r5.getColor()
            r1.drawColor(r5)
            return r0
        L26:
            boolean r0 = r5 instanceof android.graphics.drawable.NinePatchDrawable
            if (r0 == 0) goto L4d
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            int r2 = r5.getIntrinsicWidth()
            int r3 = r5.getIntrinsicHeight()
            r4 = 0
            r5.setBounds(r4, r4, r2, r3)
            r5.draw(r1)
            return r0
        L4d:
            r5 = 0
            return r5
    }

    public static android.graphics.Bitmap toBitmap(android.view.View r7) {
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            boolean r2 = r7 instanceof android.widget.ListView
            r3 = 0
            if (r2 == 0) goto L24
            r1 = r7
            android.widget.ListView r1 = (android.widget.ListView) r1
            r2 = r3
            r4 = r2
        L12:
            int r5 = r1.getChildCount()
            if (r4 >= r5) goto L3f
            android.view.View r5 = r1.getChildAt(r4)
            int r5 = r5.getHeight()
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L12
        L24:
            boolean r2 = r7 instanceof android.widget.ScrollView
            if (r2 == 0) goto L40
            r1 = r7
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r2 = r3
            r4 = r2
        L2d:
            int r5 = r1.getChildCount()
            if (r4 >= r5) goto L3f
            android.view.View r5 = r1.getChildAt(r4)
            int r5 = r5.getHeight()
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L2d
        L3f:
            r1 = r2
        L40:
            r2 = 1
            r7.setDrawingCacheEnabled(r2)
            r7.clearFocus()
            r7.setPressed(r3)
            boolean r2 = r7.willNotCacheDrawing()
            r7.setWillNotCacheDrawing(r3)
            int r3 = r7.getDrawingCacheBackgroundColor()
            r4 = -1
            r7.setDrawingCacheBackgroundColor(r4)
            if (r3 == r4) goto L5e
            r7.destroyDrawingCache()
        L5e:
            r7.buildDrawingCache()
            android.graphics.Bitmap r4 = r7.getDrawingCache()
            r5 = 0
            if (r4 != 0) goto L69
            return r5
        L69:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r6)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            r6 = 0
            r1.drawBitmap(r4, r6, r6, r5)
            r1.save()
            r1.restore()
            boolean r1 = r0.isRecycled()
            if (r1 != 0) goto L87
            r0.recycle()
        L87:
            r7.destroyDrawingCache()
            r7.setWillNotCacheDrawing(r2)
            r7.setDrawingCacheBackgroundColor(r3)
            return r0
    }

    public static android.graphics.Bitmap toBitmap(byte[] r1) {
            r0 = -1
            android.graphics.Bitmap r1 = toBitmap(r1, r0, r0)
            return r1
    }

    public static android.graphics.Bitmap toBitmap(byte[] r3, int r4, int r5) {
            int r0 = r3.length
            r1 = 0
            if (r0 == 0) goto L20
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L20
            r0.<init>()     // Catch: java.lang.Exception -> L20
            r2 = 0
            r0.inDither = r2     // Catch: java.lang.Exception -> L20
            r0.inPreferredConfig = r1     // Catch: java.lang.Exception -> L20
            if (r4 <= 0) goto L16
            if (r5 <= 0) goto L16
            r0.outWidth = r4     // Catch: java.lang.Exception -> L20
            r0.outHeight = r5     // Catch: java.lang.Exception -> L20
        L16:
            int r4 = r3.length     // Catch: java.lang.Exception -> L20
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r2, r4, r0)     // Catch: java.lang.Exception -> L20
            r3 = 96
            r1.setDensity(r3)     // Catch: java.lang.Exception -> L20
        L20:
            return r1
    }

    public static byte[] toByteArray(int r1) {
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r1 = r0.putInt(r1)
            byte[] r1 = r1.array()
            return r1
    }

    public static byte[] toByteArray(android.graphics.Bitmap r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r2 = 100
            r3.compress(r1, r2, r0)
            byte[] r3 = r0.toByteArray()
            r0.close()     // Catch: java.io.IOException -> L17
        L17:
            return r3
    }

    public static byte[] toByteArray(android.graphics.drawable.Drawable r0) {
            android.graphics.Bitmap r0 = toBitmap(r0)
            byte[] r0 = toByteArray(r0)
            return r0
    }

    public static byte[] toByteArray(java.io.InputStream r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L24
            r1.<init>()     // Catch: java.io.IOException -> L24
            r2 = 100
            byte[] r3 = new byte[r2]     // Catch: java.io.IOException -> L24
        Ld:
            r4 = 0
            int r5 = r7.read(r3, r4, r2)     // Catch: java.io.IOException -> L24
            r6 = -1
            if (r5 != r6) goto L20
            byte[] r2 = r1.toByteArray()     // Catch: java.io.IOException -> L24
            r1.close()     // Catch: java.io.IOException -> L24
            r7.close()     // Catch: java.io.IOException -> L24
            return r2
        L20:
            r1.write(r3, r4, r5)     // Catch: java.io.IOException -> L24
            goto Ld
        L24:
            return r0
    }

    public static byte[] toByteArray(java.lang.String r4, boolean r5) {
            if (r4 == 0) goto L4f
            java.lang.String r0 = ""
            boolean r1 = r4.equals(r0)
            if (r1 == 0) goto Lb
            goto L4f
        Lb:
            if (r5 != 0) goto L12
            byte[] r4 = r4.getBytes()
            return r4
        L12:
            java.lang.String r5 = "\\s+"
            java.lang.String r4 = r4.replaceAll(r5, r0)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            int r0 = r4.length()
            int r0 = r0 / 2
            r5.<init>(r0)
            r0 = 0
        L24:
            int r1 = r4.length()
            if (r0 >= r1) goto L47
            char r1 = r4.charAt(r0)
            java.lang.String r2 = "0123456789ABCDEF"
            int r1 = r2.indexOf(r1)
            int r1 = r1 << 4
            int r3 = r0 + 1
            char r3 = r4.charAt(r3)
            int r2 = r2.indexOf(r3)
            r1 = r1 | r2
            r5.write(r1)
            int r0 = r0 + 2
            goto L24
        L47:
            byte[] r4 = r5.toByteArray()
            r5.close()     // Catch: java.io.IOException -> L4e
        L4e:
            return r4
        L4f:
            r4 = 0
            return r4
    }

    public static android.content.res.ColorStateList toColorStateList(int r0, int r1) {
            android.content.res.ColorStateList r0 = toColorStateList(r0, r1, r1, r0)
            return r0
    }

    public static android.content.res.ColorStateList toColorStateList(int r6, int r7, int r8, int r9) {
            r0 = 6
            int[] r1 = new int[r0]
            r2 = 0
            r1[r2] = r7
            r7 = 1
            r1[r7] = r8
            r3 = 2
            r1[r3] = r6
            r4 = 3
            r1[r4] = r8
            r8 = 4
            r1[r8] = r9
            r9 = 5
            r1[r9] = r6
            int[][] r6 = new int[r0][]
            int[] r0 = new int[r3]
            r0 = {x004a: FILL_ARRAY_DATA , data: [16842919, 16842910} // fill-array
            r6[r2] = r0
            int[] r0 = new int[r3]
            r0 = {x0052: FILL_ARRAY_DATA , data: [16842910, 16842908} // fill-array
            r6[r7] = r0
            int[] r0 = new int[r7]
            r5 = 16842910(0x101009e, float:2.3694E-38)
            r0[r2] = r5
            r6[r3] = r0
            int[] r0 = new int[r7]
            r3 = 16842908(0x101009c, float:2.3693995E-38)
            r0[r2] = r3
            r6[r4] = r0
            int[] r7 = new int[r7]
            r0 = 16842909(0x101009d, float:2.3693998E-38)
            r7[r2] = r0
            r6[r8] = r7
            int[] r7 = new int[r2]
            r6[r9] = r7
            android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
            r7.<init>(r6, r1)
            return r7
    }

    public static java.lang.String toColorString(int r1) {
            r0 = 0
            java.lang.String r1 = toColorString(r1, r0)
            return r1
    }

    public static java.lang.String toColorString(int r6, boolean r7) {
            int r0 = android.graphics.Color.alpha(r6)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            int r1 = android.graphics.Color.red(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            int r2 = android.graphics.Color.green(r6)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r6 = android.graphics.Color.blue(r6)
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            int r3 = r0.length()
            java.lang.String r4 = "0"
            r5 = 1
            if (r3 != r5) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
        L36:
            int r3 = r1.length()
            if (r3 != r5) goto L49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
        L49:
            int r3 = r2.length()
            if (r3 != r5) goto L5c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
        L5c:
            int r3 = r6.length()
            if (r3 != r5) goto L6f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.StringBuilder r6 = r3.append(r6)
            java.lang.String r6 = r6.toString()
        L6f:
            if (r7 == 0) goto L8b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            goto La0
        L8b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
        La0:
            return r6
    }

    public static int toDarkenColor(int r1) {
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            int r1 = toDarkenColor(r1, r0)
            return r1
    }

    public static int toDarkenColor(int r2, float r3) {
            r0 = 3
            float[] r0 = new float[r0]
            android.graphics.Color.colorToHSV(r2, r0)
            r2 = 2
            r1 = r0[r2]
            float r1 = r1 * r3
            r0[r2] = r1
            int r2 = android.graphics.Color.HSVToColor(r0)
            return r2
    }

    public static int toDp(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static android.graphics.drawable.Drawable toDrawable(android.graphics.Bitmap r2) {
            if (r2 != 0) goto L4
            r2 = 0
            goto Le
        L4:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            r0.<init>(r1, r2)
            r2 = r0
        Le:
            return r2
    }

    public static android.graphics.drawable.Drawable toDrawable(byte[] r0) {
            android.graphics.Bitmap r0 = toBitmap(r0)
            android.graphics.drawable.Drawable r0 = toDrawable(r0)
            return r0
    }

    public static java.lang.String toFileSizeString(long r4) {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0.00"
            r0.<init>(r1)
            r1 = 1024(0x400, double:5.06E-321)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r5 = "B"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L82
        L21:
            r1 = 1048576(0x100000, double:5.180654E-318)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r4 = (double) r4
            r2 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r4 = r4 / r2
            java.lang.String r4 = r0.format(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r5 = "K"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L82
        L44:
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r4 = (double) r4
            r2 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r4 = r4 / r2
            java.lang.String r4 = r0.format(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r5 = "M"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L82
        L67:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r4 = (double) r4
            r2 = 4742290407621132288(0x41d0000000000000, double:1.073741824E9)
            double r4 = r4 / r2
            java.lang.String r4 = r0.format(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r5 = "G"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
        L82:
            return r4
    }

    public static float toFloat(java.lang.Object r0) {
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L9
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L9
            return r0
        L9:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
    }

    public static java.lang.String toGbk(java.lang.String r3) {
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Le
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.io.UnsupportedEncodingException -> Le
            byte[] r1 = r3.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> Le
            java.lang.String r2 = "gbk"
            r0.<init>(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> Le
            return r0
        Le:
            return r3
    }

    public static java.lang.String toHexString(int r0) {
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    public static java.lang.String toHexString(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L9
            java.lang.String r4 = ""
            return r4
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte[] r4 = r4.getBytes()
            int r1 = r4.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L29
            r3 = r4[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            int r2 = r2 + 1
            goto L14
        L29:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.lang.String toHexString(byte... r7) {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0030: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            int r1 = r7.length
            int r1 = r1 * 2
            char[] r1 = new char[r1]
            r2 = 0
            r3 = r2
        Le:
            int r4 = r7.length
            if (r2 >= r4) goto L2a
            r4 = r7[r2]
            if (r4 >= 0) goto L17
            int r4 = r4 + 256
        L17:
            int r5 = r3 + 1
            int r6 = r4 >>> 4
            char r6 = r0[r6]
            r1[r3] = r6
            int r3 = r5 + 1
            r4 = r4 & 15
            char r4 = r0[r4]
            r1[r5] = r4
            int r2 = r2 + 1
            goto Le
        L2a:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1)
            return r7
    }

    public static int toInt(java.lang.Object r0) {
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> Ld
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> Ld
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Ld
            return r0
        Ld:
            r0 = -1
            return r0
    }

    public static int toInt(byte[] r4) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.length
            if (r0 >= r2) goto L10
            r2 = r4[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 * 8
            int r2 = r2 << r3
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L10:
            return r1
    }

    public static <T> java.util.List<T> toList(T[] r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    public static long toLong(java.lang.Object r2) {
            java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> L9
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L9
            return r0
        L9:
            r0 = -1
            return r0
    }

    public static java.lang.String toPath(android.content.Context r9, android.net.Uri r10) {
            if (r10 != 0) goto L5
            java.lang.String r9 = ""
            return r9
        L5:
            java.lang.String r0 = r10.getPath()
            java.lang.String r1 = r10.getScheme()
            java.lang.String r2 = r10.getAuthority()
            boolean r3 = android.provider.DocumentsContract.isDocumentUri(r9, r10)
            r4 = 0
            if (r3 == 0) goto Lbd
            java.lang.String r10 = android.provider.DocumentsContract.getDocumentId(r10)
            java.lang.String r1 = ":"
            java.lang.String[] r1 = r10.split(r1)
            r3 = 0
            r5 = r1[r3]
            r2.hashCode()
            int r6 = r2.hashCode()
            r7 = 1
            r8 = -1
            switch(r6) {
                case 320699453: goto L48;
                case 596745902: goto L3d;
                case 1734583286: goto L32;
                default: goto L31;
            }
        L31:
            goto L52
        L32:
            java.lang.String r6 = "com.android.providers.media.documents"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L3b
            goto L52
        L3b:
            r8 = 2
            goto L52
        L3d:
            java.lang.String r6 = "com.android.externalstorage.documents"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L46
            goto L52
        L46:
            r8 = r7
            goto L52
        L48:
            java.lang.String r6 = "com.android.providers.downloads.documents"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L51
            goto L52
        L51:
            r8 = r3
        L52:
            switch(r8) {
                case 0: goto Laa;
                case 1: goto L84;
                case 2: goto L57;
                default: goto L55;
            }
        L55:
            goto Le4
        L57:
            java.lang.String r10 = "image"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L62
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L77
        L62:
            java.lang.String r10 = "video"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L6d
            android.net.Uri r4 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L77
        L6d:
            java.lang.String r10 = "audio"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L77
            android.net.Uri r4 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        L77:
            java.lang.String[] r10 = new java.lang.String[r7]
            r0 = r1[r7]
            r10[r3] = r0
            java.lang.String r0 = "_id=?"
            java.lang.String r9 = _queryPathFromMediaStore(r9, r4, r0, r10)
            return r9
        L84:
            java.lang.String r9 = "primary"
            boolean r9 = r9.equalsIgnoreCase(r5)
            if (r9 == 0) goto Le4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.io.File r10 = android.os.Environment.getExternalStorageDirectory()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = "/"
            java.lang.StringBuilder r9 = r9.append(r10)
            r10 = r1[r7]
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
        Laa:
            java.lang.String r0 = "content://downloads/public_downloads"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            long r1 = java.lang.Long.parseLong(r10)
            android.net.Uri r10 = android.content.ContentUris.withAppendedId(r0, r1)
            java.lang.String r9 = _queryPathFromMediaStore(r9, r10, r4, r4)
            return r9
        Lbd:
            java.lang.String r3 = "content"
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 == 0) goto Ld7
            java.lang.String r0 = "com.google.android.apps.photos.content"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Ld2
            java.lang.String r9 = r10.getLastPathSegment()
            return r9
        Ld2:
            java.lang.String r9 = _queryPathFromMediaStore(r9, r10, r4, r4)
            return r9
        Ld7:
            java.lang.String r9 = "file"
            boolean r9 = r9.equalsIgnoreCase(r1)
            if (r9 == 0) goto Le4
            java.lang.String r9 = r10.getPath()
            return r9
        Le4:
            return r0
    }

    public static int toPx(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static int toShort(byte r0, byte r1) {
            int r0 = r0 << 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r1
            return r0
    }

    public static java.lang.String toSlashString(java.lang.String r5) {
            char[] r5 = r5.toCharArray()
            int r0 = r5.length
            java.lang.String r1 = ""
            r2 = 0
        L8:
            if (r2 >= r0) goto L3f
            char r3 = r5[r2]
            r4 = 34
            if (r3 == r4) goto L18
            r4 = 39
            if (r3 == r4) goto L18
            r4 = 92
            if (r3 != r4) goto L2b
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r4 = "\\"
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            int r2 = r2 + 1
            goto L8
        L3f:
            return r1
    }

    public static int toSp(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.scaledDensity
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static java.lang.String toString(java.io.InputStream r1) {
            java.lang.String r0 = "utf-8"
            java.lang.String r1 = toString(r1, r0)
            return r1
    }

    public static java.lang.String toString(java.io.InputStream r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.io.IOException -> L26
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L26
            r2.<init>(r3, r4)     // Catch: java.io.IOException -> L26
            r1.<init>(r2)     // Catch: java.io.IOException -> L26
        Lf:
            java.lang.String r4 = r1.readLine()     // Catch: java.io.IOException -> L26
            if (r4 != 0) goto L1c
            r1.close()     // Catch: java.io.IOException -> L26
            r3.close()     // Catch: java.io.IOException -> L26
            goto L26
        L1c:
            java.lang.StringBuilder r4 = r0.append(r4)     // Catch: java.io.IOException -> L26
            java.lang.String r2 = "\n"
            r4.append(r2)     // Catch: java.io.IOException -> L26
            goto Lf
        L26:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String toString(java.lang.Object[] r0) {
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            return r0
    }

    public static java.lang.String toString(java.lang.Object[] r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L14
            r3 = r4[r2]
            r0.append(r3)
            r0.append(r5)
            int r2 = r2 + 1
            goto L7
        L14:
            java.lang.String r4 = r0.toString()
            return r4
    }
}
