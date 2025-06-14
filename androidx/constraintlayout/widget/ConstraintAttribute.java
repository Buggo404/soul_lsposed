package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class ConstraintAttribute {
    private static final java.lang.String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    java.lang.String mName;
    private java.lang.String mStringValue;
    private androidx.constraintlayout.widget.ConstraintAttribute.AttributeType mType;

    /* renamed from: androidx.constraintlayout.widget.ConstraintAttribute$1 */
    static /* synthetic */ class C01541 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType */
        static final /* synthetic */ int[] f57x66adad53 = null;

        static {
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53 = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.REFERENCE_TYPE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }
    }

    public enum AttributeType extends java.lang.Enum<androidx.constraintlayout.widget.ConstraintAttribute.AttributeType> {
        private static final /* synthetic */ androidx.constraintlayout.widget.ConstraintAttribute.AttributeType[] $VALUES = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType BOOLEAN_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType COLOR_DRAWABLE_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType COLOR_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType DIMENSION_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType FLOAT_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType INT_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType REFERENCE_TYPE = null;
        public static final androidx.constraintlayout.widget.ConstraintAttribute.AttributeType STRING_TYPE = null;

        private static /* synthetic */ androidx.constraintlayout.widget.ConstraintAttribute.AttributeType[] $values() {
                r0 = 8
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = new androidx.constraintlayout.widget.ConstraintAttribute.AttributeType[r0]
                r1 = 0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE
                r0[r1] = r2
                r1 = 1
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
                r0[r1] = r2
                r1 = 2
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE
                r0[r1] = r2
                r1 = 3
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE
                r0[r1] = r2
                r1 = 4
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE
                r0[r1] = r2
                r1 = 5
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE
                r0[r1] = r2
                r1 = 6
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE
                r0[r1] = r2
                r1 = 7
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.REFERENCE_TYPE
                r0[r1] = r2
                return r0
        }

        static {
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r1 = "INT_TYPE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r1 = "FLOAT_TYPE"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r1 = "COLOR_TYPE"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r1 = "COLOR_DRAWABLE_TYPE"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r1 = "STRING_TYPE"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r1 = "BOOLEAN_TYPE"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r1 = "DIMENSION_TYPE"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = new androidx.constraintlayout.widget.ConstraintAttribute$AttributeType
                java.lang.String r1 = "REFERENCE_TYPE"
                r2 = 7
                r0.<init>(r1, r2)
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.REFERENCE_TYPE = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = $values()
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.$VALUES = r0
                return
        }

        AttributeType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.widget.ConstraintAttribute.AttributeType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.widget.ConstraintAttribute$AttributeType> r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = (androidx.constraintlayout.widget.ConstraintAttribute.AttributeType) r1
                return r1
        }

        public static androidx.constraintlayout.widget.ConstraintAttribute.AttributeType[] values() {
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = (androidx.constraintlayout.widget.ConstraintAttribute.AttributeType[]) r0
                return r0
        }
    }

    public ConstraintAttribute(androidx.constraintlayout.widget.ConstraintAttribute r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMethod = r0
            java.lang.String r0 = r2.mName
            r1.mName = r0
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = r2.mType
            r1.mType = r2
            r1.setValue(r3)
            return
    }

    public ConstraintAttribute(java.lang.String r2, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMethod = r0
            r1.mName = r2
            r1.mType = r3
            return
    }

    public ConstraintAttribute(java.lang.String r1, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.mName = r1
            r0.mType = r2
            r0.mMethod = r4
            r0.setValue(r3)
            return
    }

    private static int clamp(int r1) {
            int r0 = r1 >> 31
            int r0 = ~r0
            r1 = r1 & r0
            int r1 = r1 + (-255)
            int r0 = r1 >> 31
            r1 = r1 & r0
            int r1 = r1 + 255
            return r1
    }

    public static java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> extractAttributes(java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r8, android.view.View r9) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class r1 = r9.getClass()
            java.util.Set r2 = r8.keySet()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r8.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r4 = (androidx.constraintlayout.widget.ConstraintAttribute) r4
            java.lang.String r5 = "BackgroundColor"
            boolean r5 = r3.equals(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            if (r5 == 0) goto L42
            android.graphics.drawable.Drawable r5 = r9.getBackground()     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            android.graphics.drawable.ColorDrawable r5 = (android.graphics.drawable.ColorDrawable) r5     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            int r5 = r5.getColor()     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            androidx.constraintlayout.widget.ConstraintAttribute r6 = new androidx.constraintlayout.widget.ConstraintAttribute     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            r6.<init>(r4, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            r0.put(r3, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            goto L11
        L42:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            r5.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            java.lang.String r6 = "getMap"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            java.lang.StringBuilder r5 = r5.append(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            java.lang.String r5 = r5.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            java.lang.reflect.Method r5 = r1.getMethod(r5, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            java.lang.Object r5 = r5.invoke(r9, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            androidx.constraintlayout.widget.ConstraintAttribute r6 = new androidx.constraintlayout.widget.ConstraintAttribute     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            r6.<init>(r4, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            r0.put(r3, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L70 java.lang.NoSuchMethodException -> L75
            goto L11
        L6b:
            r3 = move-exception
            r3.printStackTrace()
            goto L11
        L70:
            r3 = move-exception
            r3.printStackTrace()
            goto L11
        L75:
            r3 = move-exception
            r3.printStackTrace()
            goto L11
        L7a:
            return r0
    }

    public static void parse(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13, java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14) {
            android.util.AttributeSet r13 = android.util.Xml.asAttributeSet(r13)
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.CustomAttribute
            android.content.res.TypedArray r13 = r12.obtainStyledAttributes(r13, r0)
            int r0 = r13.getIndexCount()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r3
            r5 = r2
            r6 = r5
        L14:
            if (r5 >= r0) goto Lf7
            int r7 = r13.getIndex(r5)
            int r8 = androidx.constraintlayout.widget.C0156R.styleable.CustomAttribute_attributeName
            r9 = 1
            if (r7 != r8) goto L4a
            java.lang.String r1 = r13.getString(r7)
            if (r1 == 0) goto Lf3
            int r7 = r1.length()
            if (r7 <= 0) goto Lf3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            char r8 = r1.charAt(r2)
            char r8 = java.lang.Character.toUpperCase(r8)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r1 = r1.substring(r9)
            java.lang.StringBuilder r1 = r7.append(r1)
            java.lang.String r1 = r1.toString()
            goto Lf3
        L4a:
            int r8 = androidx.constraintlayout.widget.C0156R.styleable.CustomAttribute_methodName
            if (r7 != r8) goto L55
            java.lang.String r1 = r13.getString(r7)
            r6 = r9
            goto Lf3
        L55:
            int r8 = androidx.constraintlayout.widget.C0156R.styleable.CustomAttribute_customBoolean
            if (r7 != r8) goto L65
            boolean r3 = r13.getBoolean(r7, r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r4 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE
            goto Lf3
        L65:
            int r8 = androidx.constraintlayout.widget.C0156R.styleable.CustomAttribute_customColorValue
            if (r7 != r8) goto L78
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE
            int r4 = r13.getColor(r7, r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L73:
            r11 = r4
            r4 = r3
            r3 = r11
            goto Lf3
        L78:
            int r8 = androidx.constraintlayout.widget.C0156R.styleable.CustomAttribute_customColorDrawableValue
            if (r7 != r8) goto L87
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE
            int r4 = r13.getColor(r7, r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L73
        L87:
            int r8 = androidx.constraintlayout.widget.C0156R.styleable.CustomAttribute_customPixelDimension
            r10 = 0
            if (r7 != r8) goto La3
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE
            float r4 = r13.getDimension(r7, r10)
            android.content.res.Resources r7 = r12.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r4 = android.util.TypedValue.applyDimension(r9, r4, r7)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L73
        La3:
            int r8 = androidx.constraintlayout.widget.C0156R.styleable.CustomAttribute_customDimension
            if (r7 != r8) goto Lb2
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE
            float r4 = r13.getDimension(r7, r10)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L73
        Lb2:
            int r8 = androidx.constraintlayout.widget.C0156R.styleable.CustomAttribute_customFloatValue
            if (r7 != r8) goto Lc3
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
            r4 = 2143289344(0x7fc00000, float:NaN)
            float r4 = r13.getFloat(r7, r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L73
        Lc3:
            int r8 = androidx.constraintlayout.widget.C0156R.styleable.CustomAttribute_customIntegerValue
            r9 = -1
            if (r7 != r8) goto Ld3
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE
            int r4 = r13.getInteger(r7, r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L73
        Ld3:
            int r8 = androidx.constraintlayout.widget.C0156R.styleable.CustomAttribute_customStringValue
            if (r7 != r8) goto Lde
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE
            java.lang.String r4 = r13.getString(r7)
            goto L73
        Lde:
            int r8 = androidx.constraintlayout.widget.C0156R.styleable.CustomAttribute_customReference
            if (r7 != r8) goto Lf3
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.REFERENCE_TYPE
            int r4 = r13.getResourceId(r7, r9)
            if (r4 != r9) goto Lee
            int r4 = r13.getInt(r7, r9)
        Lee:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L73
        Lf3:
            int r5 = r5 + 1
            goto L14
        Lf7:
            if (r1 == 0) goto L103
            if (r3 == 0) goto L103
            androidx.constraintlayout.widget.ConstraintAttribute r12 = new androidx.constraintlayout.widget.ConstraintAttribute
            r12.<init>(r1, r4, r3, r6)
            r14.put(r1, r12)
        L103:
            r13.recycle()
            return
    }

    public static void setAttributes(android.view.View r12, java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13) {
            java.lang.String r0 = "\" not found on "
            java.lang.String r1 = " Custom Attribute \""
            java.lang.String r2 = "TransitionLayout"
            java.lang.Class r3 = r12.getClass()
            java.util.Set r4 = r13.keySet()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L196
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r13.get(r5)
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            boolean r7 = r6.mMethod
            if (r7 != 0) goto L38
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "set"
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r7 = r7.toString()
            goto L39
        L38:
            r7 = r5
        L39:
            int[] r8 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r9 = r6.mType     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            int r9 = r9.ordinal()     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8 = r8[r9]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r9 = 0
            r10 = 1
            switch(r8) {
                case 1: goto Lf5;
                case 2: goto Ldc;
                case 3: goto Lc7;
                case 4: goto Lae;
                case 5: goto L91;
                case 6: goto L79;
                case 7: goto L61;
                case 8: goto L49;
                default: goto L48;
            }     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
        L48:
            goto L12
        L49:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Class r11 = java.lang.Float.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            float r6 = r6.mFloatValue     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            goto L12
        L61:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Class r11 = java.lang.Float.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            float r6 = r6.mFloatValue     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            goto L12
        L79:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            int r6 = r6.mIntegerValue     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            goto L12
        L91:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Class<android.graphics.drawable.Drawable> r11 = android.graphics.drawable.Drawable.class
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            android.graphics.drawable.ColorDrawable r11 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r11.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            int r6 = r6.mColorValue     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r11.setColor(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r6[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8.invoke(r12, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            goto L12
        Lae:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            int r6 = r6.mColorValue     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            goto L12
        Lc7:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Class<java.lang.CharSequence> r11 = java.lang.CharSequence.class
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.String r6 = r6.mStringValue     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            goto L12
        Ldc:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Class r11 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            boolean r6 = r6.mBooleanValue     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            goto L12
        Lf5:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            int r6 = r6.mIntegerValue     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L10e java.lang.IllegalAccessException -> L130 java.lang.NoSuchMethodException -> L152
            goto L12
        L10e:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r7 = r3.getName()
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            r6.printStackTrace()
            goto L12
        L130:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r7 = r3.getName()
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            r6.printStackTrace()
            goto L12
        L152:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            android.util.Log.e(r2, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r6 = r3.getName()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r3.getName()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " must have a method "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            goto L12
        L196:
            return
    }

    public void applyCustom(android.view.View r12) {
            r11 = this;
            java.lang.String r0 = "\" not found on "
            java.lang.String r1 = " Custom Attribute \""
            java.lang.String r2 = "TransitionLayout"
            java.lang.Class r3 = r12.getClass()
            java.lang.String r4 = r11.mName
            boolean r5 = r11.mMethod
            if (r5 != 0) goto L20
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "set"
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r5 = r5.toString()
            goto L21
        L20:
            r5 = r4
        L21:
            int[] r6 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r7 = r11.mType     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            int r7 = r7.ordinal()     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6 = r6[r7]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r7 = 0
            r8 = 1
            switch(r6) {
                case 1: goto Lc8;
                case 2: goto Laf;
                case 3: goto L9a;
                case 4: goto L81;
                case 5: goto L64;
                case 6: goto Lc8;
                case 7: goto L4b;
                case 8: goto L32;
                default: goto L30;
            }     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
        L30:
            goto L165
        L32:
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.reflect.Method r6 = r3.getMethod(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            float r9 = r11.mFloatValue     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r8[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6.invoke(r12, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            goto L165
        L4b:
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.reflect.Method r6 = r3.getMethod(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            float r9 = r11.mFloatValue     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r8[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6.invoke(r12, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            goto L165
        L64:
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Class<android.graphics.drawable.Drawable> r9 = android.graphics.drawable.Drawable.class
            r6[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.reflect.Method r6 = r3.getMethod(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            android.graphics.drawable.ColorDrawable r9 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r9.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            int r10 = r11.mColorValue     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r9.setColor(r10)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r8[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6.invoke(r12, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            goto L165
        L81:
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.reflect.Method r6 = r3.getMethod(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            int r9 = r11.mColorValue     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r8[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6.invoke(r12, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            goto L165
        L9a:
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Class<java.lang.CharSequence> r9 = java.lang.CharSequence.class
            r6[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.reflect.Method r6 = r3.getMethod(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.String r9 = r11.mStringValue     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r8[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6.invoke(r12, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            goto L165
        Laf:
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.reflect.Method r6 = r3.getMethod(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            boolean r9 = r11.mBooleanValue     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r8[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6.invoke(r12, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            goto L165
        Lc8:
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.reflect.Method r6 = r3.getMethod(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            int r9 = r11.mIntegerValue     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r8[r7] = r9     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            r6.invoke(r12, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le1 java.lang.IllegalAccessException -> L102 java.lang.NoSuchMethodException -> L123
            goto L165
        Le1:
            r12 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            java.lang.StringBuilder r1 = r5.append(r4)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r3.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r2, r0)
            r12.printStackTrace()
            goto L165
        L102:
            r12 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            java.lang.StringBuilder r1 = r5.append(r4)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r3.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r2, r0)
            r12.printStackTrace()
            goto L165
        L123:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()
            android.util.Log.e(r2, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r1)
            java.lang.StringBuilder r12 = r12.append(r4)
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r0 = r3.getName()
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r2, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = r3.getName()
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r0 = " must have a method "
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.StringBuilder r12 = r12.append(r5)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r2, r12)
        L165:
            return
    }

    public boolean diff(androidx.constraintlayout.widget.ConstraintAttribute r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L4c
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r3.mType
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = r4.mType
            if (r1 == r2) goto La
            goto L4c
        La:
            int[] r1 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = r3.mType
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            switch(r1) {
                case 1: goto L45;
                case 2: goto L3d;
                case 3: goto L35;
                case 4: goto L2d;
                case 5: goto L2d;
                case 6: goto L45;
                case 7: goto L23;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            return r0
        L19:
            float r1 = r3.mFloatValue
            float r4 = r4.mFloatValue
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L22
            r0 = r2
        L22:
            return r0
        L23:
            float r1 = r3.mFloatValue
            float r4 = r4.mFloatValue
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L2c
            r0 = r2
        L2c:
            return r0
        L2d:
            int r1 = r3.mColorValue
            int r4 = r4.mColorValue
            if (r1 != r4) goto L34
            r0 = r2
        L34:
            return r0
        L35:
            int r1 = r3.mIntegerValue
            int r4 = r4.mIntegerValue
            if (r1 != r4) goto L3c
            r0 = r2
        L3c:
            return r0
        L3d:
            boolean r1 = r3.mBooleanValue
            boolean r4 = r4.mBooleanValue
            if (r1 != r4) goto L44
            r0 = r2
        L44:
            return r0
        L45:
            int r1 = r3.mIntegerValue
            int r4 = r4.mIntegerValue
            if (r1 != r4) goto L4c
            r0 = r2
        L4c:
            return r0
    }

    public int getColorValue() {
            r1 = this;
            int r0 = r1.mColorValue
            return r0
    }

    public float getFloatValue() {
            r1 = this;
            float r0 = r1.mFloatValue
            return r0
    }

    public int getIntegerValue() {
            r1 = this;
            int r0 = r1.mIntegerValue
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public java.lang.String getStringValue() {
            r1 = this;
            java.lang.String r0 = r1.mStringValue
            return r0
    }

    public androidx.constraintlayout.widget.ConstraintAttribute.AttributeType getType() {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = r1.mType
            return r0
    }

    public float getValueToInterpolate() {
            r2 = this;
            int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r2.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L2a;
                case 3: goto L22;
                case 4: goto L1a;
                case 5: goto L1a;
                case 6: goto L16;
                case 7: goto L13;
                case 8: goto L10;
                default: goto Ld;
            }
        Ld:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        L10:
            float r0 = r2.mFloatValue
            return r0
        L13:
            float r0 = r2.mFloatValue
            return r0
        L16:
            int r0 = r2.mIntegerValue
            float r0 = (float) r0
            return r0
        L1a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Color does not have a single color to interpolate"
            r0.<init>(r1)
            throw r0
        L22:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot interpolate String"
            r0.<init>(r1)
            throw r0
        L2a:
            boolean r0 = r2.mBooleanValue
            if (r0 == 0) goto L31
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
    }

    public void getValuesToInterpolate(float[] r11) {
            r10 = this;
            int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r10.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 2: goto L64;
                case 3: goto L5c;
                case 4: goto L1f;
                case 5: goto L1f;
                case 6: goto L19;
                case 7: goto L14;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L6e
        Lf:
            float r0 = r10.mFloatValue
            r11[r1] = r0
            goto L6e
        L14:
            float r0 = r10.mFloatValue
            r11[r1] = r0
            goto L6e
        L19:
            int r0 = r10.mIntegerValue
            float r0 = (float) r0
            r11[r1] = r0
            goto L6e
        L1f:
            int r0 = r10.mColorValue
            int r2 = r0 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            r5 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r5
            double r6 = (double) r3
            r8 = 4612136378390124954(0x400199999999999a, double:2.2)
            double r6 = java.lang.Math.pow(r6, r8)
            float r3 = (float) r6
            float r4 = (float) r4
            float r4 = r4 / r5
            double r6 = (double) r4
            double r6 = java.lang.Math.pow(r6, r8)
            float r4 = (float) r6
            float r0 = (float) r0
            float r0 = r0 / r5
            double r6 = (double) r0
            double r6 = java.lang.Math.pow(r6, r8)
            float r0 = (float) r6
            r11[r1] = r3
            r1 = 1
            r11[r1] = r4
            r1 = 2
            r11[r1] = r0
            float r0 = (float) r2
            float r0 = r0 / r5
            r1 = 3
            r11[r1] = r0
            goto L6e
        L5c:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Color does not have a single color to interpolate"
            r11.<init>(r0)
            throw r11
        L64:
            boolean r0 = r10.mBooleanValue
            if (r0 == 0) goto L6b
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L6c
        L6b:
            r0 = 0
        L6c:
            r11[r1] = r0
        L6e:
            return
    }

    public boolean isBooleanValue() {
            r1 = this;
            boolean r0 = r1.mBooleanValue
            return r0
    }

    public boolean isContinuous() {
            r3 = this;
            int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r3.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L14
            r2 = 2
            if (r0 == r2) goto L14
            r2 = 3
            if (r0 == r2) goto L14
            return r1
        L14:
            r0 = 0
            return r0
    }

    public boolean isMethod() {
            r1 = this;
            boolean r0 = r1.mMethod
            return r0
    }

    public int numberOfInterpolatedValues() {
            r3 = this;
            int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r3.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 4
            if (r0 == r1) goto L12
            r2 = 5
            if (r0 == r2) goto L12
            r0 = 1
            return r0
        L12:
            return r1
    }

    public void setColorValue(int r1) {
            r0 = this;
            r0.mColorValue = r1
            return
    }

    public void setFloatValue(float r1) {
            r0 = this;
            r0.mFloatValue = r1
            return
    }

    public void setIntValue(int r1) {
            r0 = this;
            r0.mIntegerValue = r1
            return
    }

    public void setStringValue(java.lang.String r1) {
            r0 = this;
            r0.mStringValue = r1
            return
    }

    public void setValue(java.lang.Object r3) {
            r2 = this;
            int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r2.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L37;
                case 2: goto L2e;
                case 3: goto L29;
                case 4: goto L20;
                case 5: goto L20;
                case 6: goto L37;
                case 7: goto L17;
                case 8: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L3f
        Le:
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.mFloatValue = r3
            goto L3f
        L17:
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.mFloatValue = r3
            goto L3f
        L20:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.mColorValue = r3
            goto L3f
        L29:
            java.lang.String r3 = (java.lang.String) r3
            r2.mStringValue = r3
            goto L3f
        L2e:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.mBooleanValue = r3
            goto L3f
        L37:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.mIntegerValue = r3
        L3f:
            return
    }

    public void setValue(float[] r7) {
            r6 = this;
            int[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.C01541.f57x66adad53
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = r6.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L49;
                case 2: goto L3c;
                case 3: goto L34;
                case 4: goto L19;
                case 5: goto L19;
                case 6: goto L49;
                case 7: goto L14;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L4e
        Lf:
            r7 = r7[r1]
            r6.mFloatValue = r7
            goto L4e
        L14:
            r7 = r7[r1]
            r6.mFloatValue = r7
            goto L4e
        L19:
            int r0 = android.graphics.Color.HSVToColor(r7)
            r6.mColorValue = r0
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            r1 = 3
            r7 = r7[r1]
            r1 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7 * r1
            int r7 = (int) r7
            int r7 = clamp(r7)
            int r7 = r7 << 24
            r7 = r7 | r0
            r6.mColorValue = r7
            goto L4e
        L34:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Color does not have a single color to interpolate"
            r7.<init>(r0)
            throw r7
        L3c:
            r7 = r7[r1]
            double r2 = (double) r7
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L46
            r1 = 1
        L46:
            r6.mBooleanValue = r1
            goto L4e
        L49:
            r7 = r7[r1]
            int r7 = (int) r7
            r6.mIntegerValue = r7
        L4e:
            return
    }
}
