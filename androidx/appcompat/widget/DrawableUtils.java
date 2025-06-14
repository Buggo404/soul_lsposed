package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class DrawableUtils {
    private static final int[] CHECKED_STATE_SET = null;
    private static final int[] EMPTY_STATE_SET = null;
    public static final android.graphics.Rect INSETS_NONE = null;
    private static final java.lang.String TAG = "DrawableUtils";
    private static final java.lang.String VECTOR_DRAWABLE_CLAZZ_NAME = "android.graphics.drawable.VectorDrawable";
    private static java.lang.Class<?> sInsetsClazz;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            r2 = 0
            r0[r2] = r1
            androidx.appcompat.widget.DrawableUtils.CHECKED_STATE_SET = r0
            int[] r0 = new int[r2]
            androidx.appcompat.widget.DrawableUtils.EMPTY_STATE_SET = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.appcompat.widget.DrawableUtils.INSETS_NONE = r0
            java.lang.String r0 = "android.graphics.Insets"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L1e
            androidx.appcompat.widget.DrawableUtils.sInsetsClazz = r0     // Catch: java.lang.ClassNotFoundException -> L1e
        L1e:
            return
    }

    private DrawableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canSafelyMutateDrawable(android.graphics.drawable.Drawable r4) {
            boolean r0 = r4 instanceof android.graphics.drawable.DrawableContainer
            if (r0 == 0) goto L23
            android.graphics.drawable.Drawable$ConstantState r4 = r4.getConstantState()
            boolean r0 = r4 instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState
            if (r0 == 0) goto L50
            android.graphics.drawable.DrawableContainer$DrawableContainerState r4 = (android.graphics.drawable.DrawableContainer.DrawableContainerState) r4
            android.graphics.drawable.Drawable[] r4 = r4.getChildren()
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L15:
            if (r2 >= r0) goto L50
            r3 = r4[r2]
            boolean r3 = canSafelyMutateDrawable(r3)
            if (r3 != 0) goto L20
            return r1
        L20:
            int r2 = r2 + 1
            goto L15
        L23:
            boolean r0 = r4 instanceof androidx.core.graphics.drawable.WrappedDrawable
            if (r0 == 0) goto L32
            androidx.core.graphics.drawable.WrappedDrawable r4 = (androidx.core.graphics.drawable.WrappedDrawable) r4
            android.graphics.drawable.Drawable r4 = r4.getWrappedDrawable()
            boolean r4 = canSafelyMutateDrawable(r4)
            return r4
        L32:
            boolean r0 = r4 instanceof androidx.appcompat.graphics.drawable.DrawableWrapper
            if (r0 == 0) goto L41
            androidx.appcompat.graphics.drawable.DrawableWrapper r4 = (androidx.appcompat.graphics.drawable.DrawableWrapper) r4
            android.graphics.drawable.Drawable r4 = r4.getWrappedDrawable()
            boolean r4 = canSafelyMutateDrawable(r4)
            return r4
        L41:
            boolean r0 = r4 instanceof android.graphics.drawable.ScaleDrawable
            if (r0 == 0) goto L50
            android.graphics.drawable.ScaleDrawable r4 = (android.graphics.drawable.ScaleDrawable) r4
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            boolean r4 = canSafelyMutateDrawable(r4)
            return r4
        L50:
            r4 = 1
            return r4
    }

    static void fixDrawable(android.graphics.drawable.Drawable r0) {
            return
    }

    private static void fixVectorDrawableTinting(android.graphics.drawable.Drawable r2) {
            int[] r0 = r2.getState()
            if (r0 == 0) goto L10
            int r1 = r0.length
            if (r1 != 0) goto La
            goto L10
        La:
            int[] r1 = androidx.appcompat.widget.DrawableUtils.EMPTY_STATE_SET
            r2.setState(r1)
            goto L15
        L10:
            int[] r1 = androidx.appcompat.widget.DrawableUtils.CHECKED_STATE_SET
            r2.setState(r1)
        L15:
            r2.setState(r0)
            return
    }

    public static android.graphics.Rect getOpticalBounds(android.graphics.drawable.Drawable r11) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L20
            android.graphics.Insets r11 = r11.getOpticalInsets()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r1 = r11.left
            r0.left = r1
            int r1 = r11.right
            r0.right = r1
            int r1 = r11.top
            r0.top = r1
            int r11 = r11.bottom
            r0.bottom = r11
            return r0
        L20:
            java.lang.Class<?> r0 = androidx.appcompat.widget.DrawableUtils.sInsetsClazz
            if (r0 == 0) goto Lb5
            android.graphics.drawable.Drawable r11 = androidx.core.graphics.drawable.DrawableCompat.unwrap(r11)     // Catch: java.lang.Exception -> Lae
            java.lang.Class r0 = r11.getClass()     // Catch: java.lang.Exception -> Lae
            java.lang.String r1 = "getOpticalInsets"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lae
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> Lae
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lae
            java.lang.Object r11 = r0.invoke(r11, r1)     // Catch: java.lang.Exception -> Lae
            if (r11 == 0) goto Lb5
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Exception -> Lae
            r0.<init>()     // Catch: java.lang.Exception -> Lae
            java.lang.Class<?> r1 = androidx.appcompat.widget.DrawableUtils.sInsetsClazz     // Catch: java.lang.Exception -> Lae
            java.lang.reflect.Field[] r1 = r1.getFields()     // Catch: java.lang.Exception -> Lae
            int r3 = r1.length     // Catch: java.lang.Exception -> Lae
            r4 = r2
        L4a:
            if (r4 >= r3) goto Lad
            r5 = r1[r4]     // Catch: java.lang.Exception -> Lae
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Exception -> Lae
            int r7 = r6.hashCode()     // Catch: java.lang.Exception -> Lae
            r8 = 3
            r9 = 2
            r10 = 1
            switch(r7) {
                case -1383228885: goto L7b;
                case 115029: goto L71;
                case 3317767: goto L67;
                case 108511772: goto L5d;
                default: goto L5c;
            }     // Catch: java.lang.Exception -> Lae
        L5c:
            goto L85
        L5d:
            java.lang.String r7 = "right"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lae
            if (r6 == 0) goto L85
            r6 = r9
            goto L86
        L67:
            java.lang.String r7 = "left"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lae
            if (r6 == 0) goto L85
            r6 = r2
            goto L86
        L71:
            java.lang.String r7 = "top"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lae
            if (r6 == 0) goto L85
            r6 = r10
            goto L86
        L7b:
            java.lang.String r7 = "bottom"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lae
            if (r6 == 0) goto L85
            r6 = r8
            goto L86
        L85:
            r6 = -1
        L86:
            if (r6 == 0) goto La4
            if (r6 == r10) goto L9d
            if (r6 == r9) goto L96
            if (r6 == r8) goto L8f
            goto Laa
        L8f:
            int r5 = r5.getInt(r11)     // Catch: java.lang.Exception -> Lae
            r0.bottom = r5     // Catch: java.lang.Exception -> Lae
            goto Laa
        L96:
            int r5 = r5.getInt(r11)     // Catch: java.lang.Exception -> Lae
            r0.right = r5     // Catch: java.lang.Exception -> Lae
            goto Laa
        L9d:
            int r5 = r5.getInt(r11)     // Catch: java.lang.Exception -> Lae
            r0.top = r5     // Catch: java.lang.Exception -> Lae
            goto Laa
        La4:
            int r5 = r5.getInt(r11)     // Catch: java.lang.Exception -> Lae
            r0.left = r5     // Catch: java.lang.Exception -> Lae
        Laa:
            int r4 = r4 + 1
            goto L4a
        Lad:
            return r0
        Lae:
            java.lang.String r11 = "DrawableUtils"
            java.lang.String r0 = "Couldn't obtain the optical insets. Ignoring."
            android.util.Log.e(r11, r0)
        Lb5:
            android.graphics.Rect r11 = androidx.appcompat.widget.DrawableUtils.INSETS_NONE
            return r11
    }

    public static android.graphics.PorterDuff.Mode parseTintMode(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }
}
