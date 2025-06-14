package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class ClockFaceView extends com.google.android.material.timepicker.RadialViewGroup implements com.google.android.material.timepicker.ClockHandView.OnRotateListener {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final java.lang.String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final com.google.android.material.timepicker.ClockHandView clockHandView;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final android.graphics.RectF scratch;
    private final android.content.res.ColorStateList textColor;
    private final android.util.SparseArray<android.widget.TextView> textViewPool;
    private final android.graphics.Rect textViewRect;
    private final androidx.core.view.AccessibilityDelegateCompat valueAccessibilityDelegate;
    private java.lang.String[] values;



    public ClockFaceView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ClockFaceView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.materialClockStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ClockFaceView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.textViewRect = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r6.scratch = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r6.textViewPool = r0
            r0 = 3
            float[] r1 = new float[r0]
            r1 = {x00b2: FILL_ARRAY_DATA , data: [0, 1063675494, 1065353216} // fill-array
            r6.gradientPositions = r1
            int[] r1 = com.google.android.material.C0479R.styleable.ClockFaceView
            int r2 = com.google.android.material.C0479R.style.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r1, r9, r2)
            android.content.res.Resources r9 = r6.getResources()
            int r1 = com.google.android.material.C0479R.styleable.ClockFaceView_clockNumberTextColor
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r8, r1)
            r6.textColor = r1
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)
            int r3 = com.google.android.material.C0479R.layout.material_clockface_view
            r4 = 1
            r2.inflate(r3, r6, r4)
            int r2 = com.google.android.material.C0479R.id.material_clock_hand
            android.view.View r2 = r6.findViewById(r2)
            com.google.android.material.timepicker.ClockHandView r2 = (com.google.android.material.timepicker.ClockHandView) r2
            r6.clockHandView = r2
            int r3 = com.google.android.material.C0479R.dimen.material_clock_hand_padding
            int r9 = r9.getDimensionPixelSize(r3)
            r6.clockHandPadding = r9
            int[] r9 = new int[r4]
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            r5 = 0
            r9[r5] = r3
            int r3 = r1.getDefaultColor()
            int r9 = r1.getColorForState(r9, r3)
            int[] r0 = new int[r0]
            r0[r5] = r9
            r0[r4] = r9
            r9 = 2
            int r1 = r1.getDefaultColor()
            r0[r9] = r1
            r6.gradientColors = r0
            r2.addOnRotateListener(r6)
            int r9 = com.google.android.material.C0479R.color.material_timepicker_clockface
            android.content.res.ColorStateList r9 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r7, r9)
            int r9 = r9.getDefaultColor()
            int r0 = com.google.android.material.C0479R.styleable.ClockFaceView_clockFaceBackgroundColor
            android.content.res.ColorStateList r7 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r8, r0)
            if (r7 != 0) goto L85
            goto L89
        L85:
            int r9 = r7.getDefaultColor()
        L89:
            r6.setBackgroundColor(r9)
            android.view.ViewTreeObserver r7 = r6.getViewTreeObserver()
            com.google.android.material.timepicker.ClockFaceView$1 r9 = new com.google.android.material.timepicker.ClockFaceView$1
            r9.<init>(r6)
            r7.addOnPreDrawListener(r9)
            r6.setFocusable(r4)
            r8.recycle()
            com.google.android.material.timepicker.ClockFaceView$2 r7 = new com.google.android.material.timepicker.ClockFaceView$2
            r7.<init>(r6)
            r6.valueAccessibilityDelegate = r7
            r7 = 12
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.String r8 = ""
            java.util.Arrays.fill(r7, r8)
            r6.setValues(r7, r5)
            return
    }

    static /* synthetic */ com.google.android.material.timepicker.ClockHandView access$000(com.google.android.material.timepicker.ClockFaceView r0) {
            com.google.android.material.timepicker.ClockHandView r0 = r0.clockHandView
            return r0
    }

    static /* synthetic */ int access$100(com.google.android.material.timepicker.ClockFaceView r0) {
            int r0 = r0.clockHandPadding
            return r0
    }

    static /* synthetic */ android.util.SparseArray access$200(com.google.android.material.timepicker.ClockFaceView r0) {
            android.util.SparseArray<android.widget.TextView> r0 = r0.textViewPool
            return r0
    }

    private void findIntersectingTextView() {
            r6 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r6.clockHandView
            android.graphics.RectF r0 = r0.getCurrentSelectorBox()
            r1 = 0
        L7:
            android.util.SparseArray<android.widget.TextView> r2 = r6.textViewPool
            int r2 = r2.size()
            if (r1 >= r2) goto L4b
            android.util.SparseArray<android.widget.TextView> r2 = r6.textViewPool
            java.lang.Object r2 = r2.get(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 != 0) goto L1a
            goto L48
        L1a:
            android.graphics.Rect r3 = r6.textViewRect
            r2.getDrawingRect(r3)
            android.graphics.Rect r3 = r6.textViewRect
            int r4 = r2.getPaddingLeft()
            int r5 = r2.getPaddingTop()
            r3.offset(r4, r5)
            android.graphics.Rect r3 = r6.textViewRect
            r6.offsetDescendantRectToMyCoords(r2, r3)
            android.graphics.RectF r3 = r6.scratch
            android.graphics.Rect r4 = r6.textViewRect
            r3.set(r4)
            android.graphics.RectF r3 = r6.scratch
            android.graphics.RadialGradient r3 = r6.getGradientForTextView(r0, r3)
            android.text.TextPaint r4 = r2.getPaint()
            r4.setShader(r3)
            r2.invalidate()
        L48:
            int r1 = r1 + 1
            goto L7
        L4b:
            return
    }

    private android.graphics.RadialGradient getGradientForTextView(android.graphics.RectF r8, android.graphics.RectF r9) {
            r7 = this;
            boolean r9 = android.graphics.RectF.intersects(r8, r9)
            if (r9 != 0) goto L8
            r8 = 0
            return r8
        L8:
            android.graphics.RadialGradient r9 = new android.graphics.RadialGradient
            float r0 = r8.centerX()
            android.graphics.RectF r1 = r7.scratch
            float r1 = r1.left
            float r1 = r0 - r1
            float r0 = r8.centerY()
            android.graphics.RectF r2 = r7.scratch
            float r2 = r2.top
            float r2 = r0 - r2
            float r8 = r8.width()
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r8 * r0
            int[] r4 = r7.gradientColors
            float[] r5 = r7.gradientPositions
            android.graphics.Shader$TileMode r6 = android.graphics.Shader.TileMode.CLAMP
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
    }

    private void updateTextViews(int r9) {
            r8 = this;
            android.content.Context r0 = r8.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.util.SparseArray<android.widget.TextView> r1 = r8.textViewPool
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L10:
            java.lang.String[] r4 = r8.values
            int r4 = r4.length
            int r4 = java.lang.Math.max(r4, r1)
            if (r3 >= r4) goto L77
            android.util.SparseArray<android.widget.TextView> r4 = r8.textViewPool
            java.lang.Object r4 = r4.get(r3)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String[] r5 = r8.values
            int r5 = r5.length
            if (r3 < r5) goto L2f
            r8.removeView(r4)
            android.util.SparseArray<android.widget.TextView> r4 = r8.textViewPool
            r4.remove(r3)
            goto L74
        L2f:
            if (r4 != 0) goto L41
            int r4 = com.google.android.material.C0479R.layout.material_clockface_textview
            android.view.View r4 = r0.inflate(r4, r8, r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.util.SparseArray<android.widget.TextView> r5 = r8.textViewPool
            r5.put(r3, r4)
            r8.addView(r4)
        L41:
            r4.setVisibility(r2)
            java.lang.String[] r5 = r8.values
            r5 = r5[r3]
            r4.setText(r5)
            int r5 = com.google.android.material.C0479R.id.material_value_index
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r4.setTag(r5, r6)
            androidx.core.view.AccessibilityDelegateCompat r5 = r8.valueAccessibilityDelegate
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r4, r5)
            android.content.res.ColorStateList r5 = r8.textColor
            r4.setTextColor(r5)
            if (r9 == 0) goto L74
            android.content.res.Resources r5 = r8.getResources()
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String[] r7 = r8.values
            r7 = r7[r3]
            r6[r2] = r7
            java.lang.String r5 = r5.getString(r9, r6)
            r4.setContentDescription(r5)
        L74:
            int r3 = r3 + 1
            goto L10
        L77:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r4)
            java.lang.String[] r0 = r3.values
            int r0 = r0.length
            r1 = 0
            r2 = 1
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r2, r0, r1, r2)
            r4.setCollectionInfo(r0)
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.findIntersectingTextView()
            return
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float r2, boolean r3) {
            r1 = this;
            float r3 = r1.currentHandRotation
            float r3 = r3 - r2
            float r3 = java.lang.Math.abs(r3)
            r0 = 981668463(0x3a83126f, float:0.001)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L13
            r1.currentHandRotation = r2
            r1.findIntersectingTextView()
        L13:
            return
    }

    public void setHandRotation(float r2) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.setHandRotation(r2)
            r1.findIntersectingTextView()
            return
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int r2) {
            r1 = this;
            int r0 = r1.getRadius()
            if (r2 == r0) goto L12
            super.setRadius(r2)
            com.google.android.material.timepicker.ClockHandView r2 = r1.clockHandView
            int r0 = r1.getRadius()
            r2.setCircleRadius(r0)
        L12:
            return
    }

    public void setValues(java.lang.String[] r1, int r2) {
            r0 = this;
            r0.values = r1
            r0.updateTextViews(r2)
            return
    }
}
