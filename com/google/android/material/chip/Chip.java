package com.google.android.material.chip;

/* loaded from: classes.dex */
public class Chip extends androidx.appcompat.widget.AppCompatCheckBox implements com.google.android.material.chip.ChipDrawable.Delegate, com.google.android.material.shape.Shapeable {
    private static final java.lang.String BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.Button";
    private static final int[] CHECKABLE_STATE_SET = null;
    private static final int CHIP_BODY_VIRTUAL_ID = 0;
    private static final int CLOSE_ICON_VIRTUAL_ID = 1;
    private static final java.lang.String COMPOUND_BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.CompoundButton";
    private static final int DEF_STYLE_RES = 0;
    private static final android.graphics.Rect EMPTY_BOUNDS = null;
    private static final java.lang.String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final java.lang.String NAMESPACE_ANDROID = "http://schemas.android.com/apk/res/android";
    private static final int[] SELECTED_STATE = null;
    private static final java.lang.String TAG = "Chip";
    private com.google.android.material.chip.ChipDrawable chipDrawable;
    private boolean closeIconFocused;
    private boolean closeIconHovered;
    private boolean closeIconPressed;
    private boolean deferredCheckedValue;
    private boolean ensureMinTouchTargetSize;
    private final com.google.android.material.resources.TextAppearanceFontCallback fontCallback;
    private android.graphics.drawable.InsetDrawable insetBackgroundDrawable;
    private int lastLayoutDirection;
    private int minTouchTargetSize;
    private android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListenerInternal;
    private android.view.View.OnClickListener onCloseIconClickListener;
    private final android.graphics.Rect rect;
    private final android.graphics.RectF rectF;
    private android.graphics.drawable.RippleDrawable ripple;
    private final com.google.android.material.chip.Chip.ChipTouchHelper touchHelper;



    private class ChipTouchHelper extends androidx.customview.widget.ExploreByTouchHelper {
        final /* synthetic */ com.google.android.material.chip.Chip this$0;

        ChipTouchHelper(com.google.android.material.chip.Chip r1, com.google.android.material.chip.Chip r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected int getVirtualViewAt(float r2, float r3) {
                r1 = this;
                com.google.android.material.chip.Chip r0 = r1.this$0
                boolean r0 = com.google.android.material.chip.Chip.access$100(r0)
                if (r0 == 0) goto L16
                com.google.android.material.chip.Chip r0 = r1.this$0
                android.graphics.RectF r0 = com.google.android.material.chip.Chip.access$200(r0)
                boolean r2 = r0.contains(r2, r3)
                if (r2 == 0) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                return r2
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void getVisibleVirtualViews(java.util.List<java.lang.Integer> r2) {
                r1 = this;
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.add(r0)
                com.google.android.material.chip.Chip r0 = r1.this$0
                boolean r0 = com.google.android.material.chip.Chip.access$100(r0)
                if (r0 == 0) goto L28
                com.google.android.material.chip.Chip r0 = r1.this$0
                boolean r0 = r0.isCloseIconVisible()
                if (r0 == 0) goto L28
                com.google.android.material.chip.Chip r0 = r1.this$0
                android.view.View$OnClickListener r0 = com.google.android.material.chip.Chip.access$300(r0)
                if (r0 == 0) goto L28
                r0 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.add(r0)
            L28:
                return
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected boolean onPerformActionForVirtualView(int r1, int r2, android.os.Bundle r3) {
                r0 = this;
                r3 = 16
                if (r2 != r3) goto L17
                if (r1 != 0) goto Ld
                com.google.android.material.chip.Chip r1 = r0.this$0
                boolean r1 = r1.performClick()
                return r1
            Ld:
                r2 = 1
                if (r1 != r2) goto L17
                com.google.android.material.chip.Chip r1 = r0.this$0
                boolean r1 = r1.performCloseIconClick()
                return r1
            L17:
                r1 = 0
                return r1
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForHost(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
                r1 = this;
                com.google.android.material.chip.Chip r0 = r1.this$0
                boolean r0 = r0.isCheckable()
                r2.setCheckable(r0)
                com.google.android.material.chip.Chip r0 = r1.this$0
                boolean r0 = r0.isClickable()
                r2.setClickable(r0)
                com.google.android.material.chip.Chip r0 = r1.this$0
                boolean r0 = r0.isCheckable()
                if (r0 != 0) goto L29
                com.google.android.material.chip.Chip r0 = r1.this$0
                boolean r0 = r0.isClickable()
                if (r0 == 0) goto L23
                goto L29
            L23:
                java.lang.String r0 = "android.view.View"
                r2.setClassName(r0)
                goto L39
            L29:
                com.google.android.material.chip.Chip r0 = r1.this$0
                boolean r0 = r0.isCheckable()
                if (r0 == 0) goto L34
                java.lang.String r0 = "android.widget.CompoundButton"
                goto L36
            L34:
                java.lang.String r0 = "android.widget.Button"
            L36:
                r2.setClassName(r0)
            L39:
                com.google.android.material.chip.Chip r0 = r1.this$0
                java.lang.CharSequence r0 = r0.getText()
                r2.setText(r0)
                return
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForVirtualView(int r6, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7) {
                r5 = this;
                java.lang.String r0 = ""
                r1 = 1
                if (r6 != r1) goto L4e
                com.google.android.material.chip.Chip r6 = r5.this$0
                java.lang.CharSequence r6 = r6.getCloseIconContentDescription()
                if (r6 == 0) goto L11
                r7.setContentDescription(r6)
                goto L36
            L11:
                com.google.android.material.chip.Chip r6 = r5.this$0
                java.lang.CharSequence r6 = r6.getText()
                com.google.android.material.chip.Chip r2 = r5.this$0
                android.content.Context r2 = r2.getContext()
                int r3 = com.google.android.material.C0479R.string.mtrl_chip_close_icon_content_description
                java.lang.Object[] r1 = new java.lang.Object[r1]
                boolean r4 = android.text.TextUtils.isEmpty(r6)
                if (r4 != 0) goto L28
                r0 = r6
            L28:
                r6 = 0
                r1[r6] = r0
                java.lang.String r6 = r2.getString(r3, r1)
                java.lang.String r6 = r6.trim()
                r7.setContentDescription(r6)
            L36:
                com.google.android.material.chip.Chip r6 = r5.this$0
                android.graphics.Rect r6 = com.google.android.material.chip.Chip.access$500(r6)
                r7.setBoundsInParent(r6)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r6 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK
                r7.addAction(r6)
                com.google.android.material.chip.Chip r6 = r5.this$0
                boolean r6 = r6.isEnabled()
                r7.setEnabled(r6)
                goto L58
            L4e:
                r7.setContentDescription(r0)
                android.graphics.Rect r6 = com.google.android.material.chip.Chip.access$600()
                r7.setBoundsInParent(r6)
            L58:
                return
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onVirtualViewKeyboardFocusChanged(int r2, boolean r3) {
                r1 = this;
                r0 = 1
                if (r2 != r0) goto Ld
                com.google.android.material.chip.Chip r2 = r1.this$0
                com.google.android.material.chip.Chip.access$402(r2, r3)
                com.google.android.material.chip.Chip r2 = r1.this$0
                r2.refreshDrawableState()
            Ld:
                return
        }
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_Chip_Action
            com.google.android.material.chip.Chip.DEF_STYLE_RES = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.google.android.material.chip.Chip.EMPTY_BOUNDS = r0
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842913(0x10100a1, float:2.369401E-38)
            r3 = 0
            r1[r3] = r2
            com.google.android.material.chip.Chip.SELECTED_STATE = r1
            int[] r0 = new int[r0]
            r1 = 16842911(0x101009f, float:2.3694004E-38)
            r0[r3] = r1
            com.google.android.material.chip.Chip.CHECKABLE_STATE_SET = r0
            return
    }

    public Chip(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Chip(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.chipStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            int r4 = com.google.android.material.chip.Chip.DEF_STYLE_RES
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.rect = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.rectF = r7
            com.google.android.material.chip.Chip$1 r7 = new com.google.android.material.chip.Chip$1
            r7.<init>(r6)
            r6.fontCallback = r7
            android.content.Context r0 = r6.getContext()
            r6.validateAttributes(r8)
            com.google.android.material.chip.ChipDrawable r7 = com.google.android.material.chip.ChipDrawable.createFromAttributes(r0, r8, r9, r4)
            r6.initMinTouchTarget(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.ViewCompat.getElevation(r6)
            r7.setElevation(r1)
            int[] r2 = com.google.android.material.C0479R.styleable.Chip
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C0479R.styleable.Chip_shapeAppearance
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$ChipTouchHelper r8 = new com.google.android.material.chip.Chip$ChipTouchHelper
            r8.<init>(r6, r6)
            r6.touchHelper = r8
            r6.updateAccessibilityDelegate()
            if (r9 != 0) goto L59
            r6.initOutlineProvider()
        L59:
            boolean r8 = r6.deferredCheckedValue
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.getText()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.getEllipsize()
            r6.setEllipsize(r7)
            r6.updateTextPaintDrawState()
            com.google.android.material.chip.ChipDrawable r7 = r6.chipDrawable
            boolean r7 = r7.shouldDrawText()
            if (r7 != 0) goto L7e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L7e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.updatePaddingInternal()
            boolean r7 = r6.shouldEnsureMinTouchTargetSize()
            if (r7 == 0) goto L92
            int r7 = r6.minTouchTargetSize
            r6.setMinHeight(r7)
        L92:
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r6)
            r6.lastLayoutDirection = r7
            return
    }

    static /* synthetic */ com.google.android.material.chip.ChipDrawable access$000(com.google.android.material.chip.Chip r0) {
            com.google.android.material.chip.ChipDrawable r0 = r0.chipDrawable
            return r0
    }

    static /* synthetic */ boolean access$100(com.google.android.material.chip.Chip r0) {
            boolean r0 = r0.hasCloseIcon()
            return r0
    }

    static /* synthetic */ android.graphics.RectF access$200(com.google.android.material.chip.Chip r0) {
            android.graphics.RectF r0 = r0.getCloseIconTouchBounds()
            return r0
    }

    static /* synthetic */ android.view.View.OnClickListener access$300(com.google.android.material.chip.Chip r0) {
            android.view.View$OnClickListener r0 = r0.onCloseIconClickListener
            return r0
    }

    static /* synthetic */ boolean access$402(com.google.android.material.chip.Chip r0, boolean r1) {
            r0.closeIconFocused = r1
            return r1
    }

    static /* synthetic */ android.graphics.Rect access$500(com.google.android.material.chip.Chip r0) {
            android.graphics.Rect r0 = r0.getCloseIconTouchBoundsInt()
            return r0
    }

    static /* synthetic */ android.graphics.Rect access$600() {
            android.graphics.Rect r0 = com.google.android.material.chip.Chip.EMPTY_BOUNDS
            return r0
    }

    private void applyChipDrawable(com.google.android.material.chip.ChipDrawable r1) {
            r0 = this;
            r1.setDelegate(r0)
            return
    }

    private int[] createCloseIconDrawableState() {
            r3 = this;
            boolean r0 = r3.isEnabled()
            boolean r1 = r3.closeIconFocused
            if (r1 == 0) goto La
            int r0 = r0 + 1
        La:
            boolean r1 = r3.closeIconHovered
            if (r1 == 0) goto L10
            int r0 = r0 + 1
        L10:
            boolean r1 = r3.closeIconPressed
            if (r1 == 0) goto L16
            int r0 = r0 + 1
        L16:
            boolean r1 = r3.isChecked()
            if (r1 == 0) goto L1e
            int r0 = r0 + 1
        L1e:
            int[] r0 = new int[r0]
            boolean r1 = r3.isEnabled()
            r2 = 0
            if (r1 == 0) goto L2d
            r1 = 16842910(0x101009e, float:2.3694E-38)
            r0[r2] = r1
            r2 = 1
        L2d:
            boolean r1 = r3.closeIconFocused
            if (r1 == 0) goto L38
            r1 = 16842908(0x101009c, float:2.3693995E-38)
            r0[r2] = r1
            int r2 = r2 + 1
        L38:
            boolean r1 = r3.closeIconHovered
            if (r1 == 0) goto L43
            r1 = 16843623(0x1010367, float:2.3696E-38)
            r0[r2] = r1
            int r2 = r2 + 1
        L43:
            boolean r1 = r3.closeIconPressed
            if (r1 == 0) goto L4e
            r1 = 16842919(0x10100a7, float:2.3694026E-38)
            r0[r2] = r1
            int r2 = r2 + 1
        L4e:
            boolean r1 = r3.isChecked()
            if (r1 == 0) goto L59
            r1 = 16842913(0x10100a1, float:2.369401E-38)
            r0[r2] = r1
        L59:
            return r0
    }

    private void ensureChipDrawableHasCallback() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getBackgroundDrawable()
            android.graphics.drawable.InsetDrawable r1 = r2.insetBackgroundDrawable
            if (r0 != r1) goto L17
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            android.graphics.drawable.Drawable$Callback r0 = r0.getCallback()
            if (r0 != 0) goto L17
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            android.graphics.drawable.InsetDrawable r1 = r2.insetBackgroundDrawable
            r0.setCallback(r1)
        L17:
            return
    }

    private android.graphics.RectF getCloseIconTouchBounds() {
            r2 = this;
            android.graphics.RectF r0 = r2.rectF
            r0.setEmpty()
            boolean r0 = r2.hasCloseIcon()
            if (r0 == 0) goto L16
            android.view.View$OnClickListener r0 = r2.onCloseIconClickListener
            if (r0 == 0) goto L16
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            android.graphics.RectF r1 = r2.rectF
            r0.getCloseIconTouchBounds(r1)
        L16:
            android.graphics.RectF r0 = r2.rectF
            return r0
    }

    private android.graphics.Rect getCloseIconTouchBoundsInt() {
            r5 = this;
            android.graphics.RectF r0 = r5.getCloseIconTouchBounds()
            android.graphics.Rect r1 = r5.rect
            float r2 = r0.left
            int r2 = (int) r2
            float r3 = r0.top
            int r3 = (int) r3
            float r4 = r0.right
            int r4 = (int) r4
            float r0 = r0.bottom
            int r0 = (int) r0
            r1.set(r2, r3, r4, r0)
            android.graphics.Rect r0 = r5.rect
            return r0
    }

    private com.google.android.material.resources.TextAppearance getTextAppearance() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            com.google.android.material.resources.TextAppearance r0 = r0.getTextAppearance()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    private boolean handleAccessibilityExit(android.view.MotionEvent r9) {
            r8 = this;
            java.lang.String r0 = "Unable to send Accessibility Exit event"
            java.lang.String r1 = "Chip"
            int r9 = r9.getAction()
            r2 = 10
            r3 = 0
            if (r9 != r2) goto L5b
            java.lang.Class<androidx.customview.widget.ExploreByTouchHelper> r9 = androidx.customview.widget.ExploreByTouchHelper.class
            java.lang.String r2 = "mHoveredVirtualViewId"
            java.lang.reflect.Field r9 = r9.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            r2 = 1
            r9.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            com.google.android.material.chip.Chip$ChipTouchHelper r4 = r8.touchHelper     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            java.lang.Object r9 = r9.get(r4)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            int r9 = r9.intValue()     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r4) goto L5b
            java.lang.Class<androidx.customview.widget.ExploreByTouchHelper> r9 = androidx.customview.widget.ExploreByTouchHelper.class
            java.lang.String r5 = "updateHoveredVirtualView"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            r6[r3] = r7     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            r9.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            com.google.android.material.chip.Chip$ChipTouchHelper r5 = r8.touchHelper     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            r6[r3] = r4     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            r9.invoke(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.reflect.InvocationTargetException -> L4d java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L57
            return r2
        L48:
            r9 = move-exception
            android.util.Log.e(r1, r0, r9)
            goto L5b
        L4d:
            r9 = move-exception
            android.util.Log.e(r1, r0, r9)
            goto L5b
        L52:
            r9 = move-exception
            android.util.Log.e(r1, r0, r9)
            goto L5b
        L57:
            r9 = move-exception
            android.util.Log.e(r1, r0, r9)
        L5b:
            return r3
    }

    private boolean hasCloseIcon() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto Lc
            android.graphics.drawable.Drawable r0 = r0.getCloseIcon()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private void initMinTouchTarget(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            int[] r2 = com.google.android.material.C0479R.styleable.Chip
            int r4 = com.google.android.material.chip.Chip.DEF_STYLE_RES
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C0479R.styleable.Chip_ensureMinTouchTargetSize
            boolean r9 = r8.getBoolean(r9, r6)
            r7.ensureMinTouchTargetSize = r9
            android.content.Context r9 = r7.getContext()
            r10 = 48
            float r9 = com.google.android.material.internal.ViewUtils.dpToPx(r9, r10)
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            float r9 = (float) r9
            int r10 = com.google.android.material.C0479R.styleable.Chip_chipMinTouchTargetSize
            float r9 = r8.getDimension(r10, r9)
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
            r7.minTouchTargetSize = r9
            r8.recycle()
            return
    }

    private void initOutlineProvider() {
            r1 = this;
            com.google.android.material.chip.Chip$2 r0 = new com.google.android.material.chip.Chip$2
            r0.<init>(r1)
            r1.setOutlineProvider(r0)
            return
    }

    private void insetChipBackgroundDrawable(int r8, int r9, int r10, int r11) {
            r7 = this;
            android.graphics.drawable.InsetDrawable r6 = new android.graphics.drawable.InsetDrawable
            com.google.android.material.chip.ChipDrawable r1 = r7.chipDrawable
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r7.insetBackgroundDrawable = r6
            return
    }

    private void removeBackgroundInset() {
            r1 = this;
            android.graphics.drawable.InsetDrawable r0 = r1.insetBackgroundDrawable
            if (r0 == 0) goto L16
            r0 = 0
            r1.insetBackgroundDrawable = r0
            r0 = 0
            r1.setMinWidth(r0)
            float r0 = r1.getChipMinHeight()
            int r0 = (int) r0
            r1.setMinHeight(r0)
            r1.updateBackgroundDrawable()
        L16:
            return
    }

    private void setCloseIconHovered(boolean r2) {
            r1 = this;
            boolean r0 = r1.closeIconHovered
            if (r0 == r2) goto L9
            r1.closeIconHovered = r2
            r1.refreshDrawableState()
        L9:
            return
    }

    private void setCloseIconPressed(boolean r2) {
            r1 = this;
            boolean r0 = r1.closeIconPressed
            if (r0 == r2) goto L9
            r1.closeIconPressed = r2
            r1.refreshDrawableState()
        L9:
            return
    }

    private void unapplyChipDrawable(com.google.android.material.chip.ChipDrawable r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r0 = 0
            r2.setDelegate(r0)
        L6:
            return
    }

    private void updateAccessibilityDelegate() {
            r1 = this;
            boolean r0 = r1.hasCloseIcon()
            if (r0 == 0) goto L16
            boolean r0 = r1.isCloseIconVisible()
            if (r0 == 0) goto L16
            android.view.View$OnClickListener r0 = r1.onCloseIconClickListener
            if (r0 == 0) goto L16
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r1.touchHelper
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r1, r0)
            goto L1a
        L16:
            r0 = 0
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r1, r0)
        L1a:
            return
    }

    private void updateBackgroundDrawable() {
            r2 = this;
            boolean r0 = com.google.android.material.ripple.RippleUtils.USE_FRAMEWORK_RIPPLE
            if (r0 == 0) goto L8
            r2.updateFrameworkRippleBackground()
            goto L1b
        L8:
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            r1 = 1
            r0.setUseCompatRipple(r1)
            android.graphics.drawable.Drawable r0 = r2.getBackgroundDrawable()
            androidx.core.view.ViewCompat.setBackground(r2, r0)
            r2.updatePaddingInternal()
            r2.ensureChipDrawableHasCallback()
        L1b:
            return
    }

    private void updateFrameworkRippleBackground() {
            r4 = this;
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            com.google.android.material.chip.ChipDrawable r1 = r4.chipDrawable
            android.content.res.ColorStateList r1 = r1.getRippleColor()
            android.content.res.ColorStateList r1 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r1)
            android.graphics.drawable.Drawable r2 = r4.getBackgroundDrawable()
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.ripple = r0
            com.google.android.material.chip.ChipDrawable r0 = r4.chipDrawable
            r1 = 0
            r0.setUseCompatRipple(r1)
            android.graphics.drawable.RippleDrawable r0 = r4.ripple
            androidx.core.view.ViewCompat.setBackground(r4, r0)
            r4.updatePaddingInternal()
            return
    }

    private void updatePaddingInternal() {
            r4 = this;
            java.lang.CharSequence r0 = r4.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L56
            com.google.android.material.chip.ChipDrawable r0 = r4.chipDrawable
            if (r0 != 0) goto Lf
            goto L56
        Lf:
            float r0 = r0.getChipEndPadding()
            com.google.android.material.chip.ChipDrawable r1 = r4.chipDrawable
            float r1 = r1.getTextEndPadding()
            float r0 = r0 + r1
            com.google.android.material.chip.ChipDrawable r1 = r4.chipDrawable
            float r1 = r1.calculateCloseIconWidth()
            float r0 = r0 + r1
            int r0 = (int) r0
            com.google.android.material.chip.ChipDrawable r1 = r4.chipDrawable
            float r1 = r1.getChipStartPadding()
            com.google.android.material.chip.ChipDrawable r2 = r4.chipDrawable
            float r2 = r2.getTextStartPadding()
            float r1 = r1 + r2
            com.google.android.material.chip.ChipDrawable r2 = r4.chipDrawable
            float r2 = r2.calculateChipIconWidth()
            float r1 = r1 + r2
            int r1 = (int) r1
            android.graphics.drawable.InsetDrawable r2 = r4.insetBackgroundDrawable
            if (r2 == 0) goto L4b
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.drawable.InsetDrawable r3 = r4.insetBackgroundDrawable
            r3.getPadding(r2)
            int r3 = r2.left
            int r1 = r1 + r3
            int r2 = r2.right
            int r0 = r0 + r2
        L4b:
            int r2 = r4.getPaddingTop()
            int r3 = r4.getPaddingBottom()
            androidx.core.view.ViewCompat.setPaddingRelative(r4, r1, r2, r0, r3)
        L56:
            return
    }

    private void updateTextPaintDrawState() {
            r4 = this;
            android.text.TextPaint r0 = r4.getPaint()
            com.google.android.material.chip.ChipDrawable r1 = r4.chipDrawable
            if (r1 == 0) goto Le
            int[] r1 = r1.getState()
            r0.drawableState = r1
        Le:
            com.google.android.material.resources.TextAppearance r1 = r4.getTextAppearance()
            if (r1 == 0) goto L1d
            android.content.Context r2 = r4.getContext()
            com.google.android.material.resources.TextAppearanceFontCallback r3 = r4.fontCallback
            r1.updateDrawState(r2, r0, r3)
        L1d:
            return
    }

    private void validateAttributes(android.util.AttributeSet r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "background"
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = r5.getAttributeValue(r1, r0)
            java.lang.String r2 = "Chip"
            if (r0 == 0) goto L14
            java.lang.String r0 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
        L14:
            java.lang.String r0 = "drawableLeft"
            java.lang.String r0 = r5.getAttributeValue(r1, r0)
            if (r0 != 0) goto L84
            java.lang.String r0 = "drawableStart"
            java.lang.String r0 = r5.getAttributeValue(r1, r0)
            if (r0 != 0) goto L7c
            java.lang.String r0 = "drawableEnd"
            java.lang.String r0 = r5.getAttributeValue(r1, r0)
            java.lang.String r3 = "Please set end drawable using R.attr#closeIcon."
            if (r0 != 0) goto L76
            java.lang.String r0 = "drawableRight"
            java.lang.String r0 = r5.getAttributeValue(r1, r0)
            if (r0 != 0) goto L70
            java.lang.String r0 = "singleLine"
            r3 = 1
            boolean r0 = r5.getAttributeBooleanValue(r1, r0, r3)
            if (r0 == 0) goto L68
            java.lang.String r0 = "lines"
            int r0 = r5.getAttributeIntValue(r1, r0, r3)
            if (r0 != r3) goto L68
            java.lang.String r0 = "minLines"
            int r0 = r5.getAttributeIntValue(r1, r0, r3)
            if (r0 != r3) goto L68
            java.lang.String r0 = "maxLines"
            int r0 = r5.getAttributeIntValue(r1, r0, r3)
            if (r0 != r3) goto L68
            java.lang.String r0 = "gravity"
            r3 = 8388627(0x800013, float:1.175497E-38)
            int r5 = r5.getAttributeIntValue(r1, r0, r3)
            if (r5 == r3) goto L67
            java.lang.String r5 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r2, r5)
        L67:
            return
        L68:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r5.<init>(r0)
            throw r5
        L70:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            r5.<init>(r3)
            throw r5
        L76:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            r5.<init>(r3)
            throw r5
        L7c:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Please set start drawable using R.attr#chipIcon."
            r5.<init>(r0)
            throw r5
        L84:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Please set left drawable using R.attr#chipIcon."
            r5.<init>(r0)
            throw r5
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.handleAccessibilityExit(r2)
            if (r0 != 0) goto L17
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r1.touchHelper
            boolean r0 = r0.dispatchHoverEvent(r2)
            if (r0 != 0) goto L17
            boolean r2 = super.dispatchHoverEvent(r2)
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            return r2
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r2.touchHelper
            boolean r0 = r0.dispatchKeyEvent(r3)
            if (r0 == 0) goto L14
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r2.touchHelper
            int r0 = r0.getKeyboardFocusedVirtualViewId()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L14
            r3 = 1
            return r3
        L14:
            boolean r3 = super.dispatchKeyEvent(r3)
            return r3
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            if (r0 == 0) goto L18
            boolean r0 = r0.isCloseIconStateful()
            if (r0 == 0) goto L18
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            int[] r1 = r2.createCloseIconDrawableState()
            boolean r0 = r0.setCloseIconState(r1)
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L1e
            r2.invalidate()
        L1e:
            return
    }

    public boolean ensureAccessibleTouchTarget(int r6) {
            r5 = this;
            r5.minTouchTargetSize = r6
            boolean r0 = r5.shouldEnsureMinTouchTargetSize()
            r1 = 0
            if (r0 != 0) goto L15
            android.graphics.drawable.InsetDrawable r6 = r5.insetBackgroundDrawable
            if (r6 == 0) goto L11
            r5.removeBackgroundInset()
            goto L14
        L11:
            r5.updateBackgroundDrawable()
        L14:
            return r1
        L15:
            com.google.android.material.chip.ChipDrawable r0 = r5.chipDrawable
            int r0 = r0.getIntrinsicHeight()
            int r0 = r6 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.ChipDrawable r2 = r5.chipDrawable
            int r2 = r2.getIntrinsicWidth()
            int r2 = r6 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L3d
            if (r0 > 0) goto L3d
            android.graphics.drawable.InsetDrawable r6 = r5.insetBackgroundDrawable
            if (r6 == 0) goto L39
            r5.removeBackgroundInset()
            goto L3c
        L39:
            r5.updateBackgroundDrawable()
        L3c:
            return r1
        L3d:
            if (r2 <= 0) goto L42
            int r2 = r2 / 2
            goto L43
        L42:
            r2 = r1
        L43:
            if (r0 <= 0) goto L47
            int r1 = r0 / 2
        L47:
            android.graphics.drawable.InsetDrawable r0 = r5.insetBackgroundDrawable
            r3 = 1
            if (r0 == 0) goto L6a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r4 = r5.insetBackgroundDrawable
            r4.getPadding(r0)
            int r4 = r0.top
            if (r4 != r1) goto L6a
            int r4 = r0.bottom
            if (r4 != r1) goto L6a
            int r4 = r0.left
            if (r4 != r2) goto L6a
            int r0 = r0.right
            if (r0 != r2) goto L6a
            r5.updateBackgroundDrawable()
            return r3
        L6a:
            int r0 = r5.getMinHeight()
            if (r0 == r6) goto L73
            r5.setMinHeight(r6)
        L73:
            int r0 = r5.getMinWidth()
            if (r0 == r6) goto L7c
            r5.setMinWidth(r6)
        L7c:
            r5.insetChipBackgroundDrawable(r2, r1, r2, r1)
            r5.updateBackgroundDrawable()
            return r3
    }

    public android.graphics.drawable.Drawable getBackgroundDrawable() {
            r1 = this;
            android.graphics.drawable.InsetDrawable r0 = r1.insetBackgroundDrawable
            if (r0 != 0) goto L6
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
        L6:
            return r0
    }

    public android.graphics.drawable.Drawable getCheckedIcon() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getCheckedIcon()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.content.res.ColorStateList getCheckedIconTint() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getCheckedIconTint()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.content.res.ColorStateList getChipBackgroundColor() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getChipBackgroundColor()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getChipCornerRadius() {
            r2 = this;
            com.google.android.material.chip.ChipDrawable r0 = r2.chipDrawable
            r1 = 0
            if (r0 == 0) goto Ld
            float r0 = r0.getChipCornerRadius()
            float r1 = java.lang.Math.max(r1, r0)
        Ld:
            return r1
    }

    public android.graphics.drawable.Drawable getChipDrawable() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            return r0
    }

    public float getChipEndPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getChipEndPadding()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.graphics.drawable.Drawable getChipIcon() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getChipIcon()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getChipIconSize() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getChipIconSize()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.content.res.ColorStateList getChipIconTint() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getChipIconTint()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getChipMinHeight() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getChipMinHeight()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getChipStartPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getChipStartPadding()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.content.res.ColorStateList getChipStrokeColor() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getChipStrokeColor()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getChipStrokeWidth() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getChipStrokeWidth()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getChipText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            return r0
    }

    public android.graphics.drawable.Drawable getCloseIcon() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getCloseIcon()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public java.lang.CharSequence getCloseIconContentDescription() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getCloseIconContentDescription()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getCloseIconEndPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getCloseIconEndPadding()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getCloseIconSize() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getCloseIconSize()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getCloseIconStartPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getCloseIconStartPadding()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.content.res.ColorStateList getCloseIconTint() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getCloseIconTint()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.TextView
    public android.text.TextUtils.TruncateAt getEllipsize() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.text.TextUtils$TruncateAt r0 = r0.getEllipsize()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(android.graphics.Rect r3) {
            r2 = this;
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r2.touchHelper
            int r0 = r0.getKeyboardFocusedVirtualViewId()
            r1 = 1
            if (r0 == r1) goto L16
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r2.touchHelper
            int r0 = r0.getAccessibilityFocusedVirtualViewId()
            if (r0 != r1) goto L12
            goto L16
        L12:
            super.getFocusedRect(r3)
            goto L1d
        L16:
            android.graphics.Rect r0 = r2.getCloseIconTouchBoundsInt()
            r3.set(r0)
        L1d:
            return
    }

    public com.google.android.material.animation.MotionSpec getHideMotionSpec() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            com.google.android.material.animation.MotionSpec r0 = r0.getHideMotionSpec()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getIconEndPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getIconEndPadding()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getIconStartPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getIconStartPadding()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getRippleColor()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // com.google.android.material.shape.Shapeable
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearanceModel()
            return r0
    }

    public com.google.android.material.animation.MotionSpec getShowMotionSpec() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            com.google.android.material.animation.MotionSpec r0 = r0.getShowMotionSpec()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getTextEndPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getTextEndPadding()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public float getTextStartPadding() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L9
            float r0 = r0.getTextStartPadding()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean isCheckable() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto Lc
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @java.lang.Deprecated
    public boolean isCheckedIconEnabled() {
            r1 = this;
            boolean r0 = r1.isCheckedIconVisible()
            return r0
    }

    public boolean isCheckedIconVisible() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto Lc
            boolean r0 = r0.isCheckedIconVisible()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @java.lang.Deprecated
    public boolean isChipIconEnabled() {
            r1 = this;
            boolean r0 = r1.isChipIconVisible()
            return r0
    }

    public boolean isChipIconVisible() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto Lc
            boolean r0 = r0.isChipIconVisible()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @java.lang.Deprecated
    public boolean isCloseIconEnabled() {
            r1 = this;
            boolean r0 = r1.isCloseIconVisible()
            return r0
    }

    public boolean isCloseIconVisible() {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto Lc
            boolean r0 = r0.isCloseIconVisible()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r1, r0)
            return
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    public void onChipDrawableSizeChange() {
            r1 = this;
            int r0 = r1.minTouchTargetSize
            r1.ensureAccessibleTouchTarget(r0)
            r1.requestLayout()
            r1.invalidateOutline()
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.chip.Chip.SELECTED_STATE
            mergeDrawableStates(r2, r0)
        L11:
            boolean r0 = r1.isCheckable()
            if (r0 == 0) goto L1c
            int[] r0 = com.google.android.material.chip.Chip.CHECKABLE_STATE_SET
            mergeDrawableStates(r2, r0)
        L1c:
            return r2
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean r2, int r3, android.graphics.Rect r4) {
            r1 = this;
            super.onFocusChanged(r2, r3, r4)
            com.google.android.material.chip.Chip$ChipTouchHelper r0 = r1.touchHelper
            r0.onFocusChanged(r2, r3, r4)
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 7
            if (r0 == r1) goto L11
            r1 = 10
            if (r0 == r1) goto Lc
            goto L24
        Lc:
            r0 = 0
            r3.setCloseIconHovered(r0)
            goto L24
        L11:
            android.graphics.RectF r0 = r3.getCloseIconTouchBounds()
            float r1 = r4.getX()
            float r2 = r4.getY()
            boolean r0 = r0.contains(r1, r2)
            r3.setCloseIconHovered(r0)
        L24:
            boolean r4 = super.onHoverEvent(r4)
            return r4
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r9) {
            r8 = this;
            super.onInitializeAccessibilityNodeInfo(r9)
            boolean r0 = r8.isCheckable()
            if (r0 != 0) goto L16
            boolean r0 = r8.isClickable()
            if (r0 == 0) goto L10
            goto L16
        L10:
            java.lang.String r0 = "android.view.View"
            r9.setClassName(r0)
            goto L24
        L16:
            boolean r0 = r8.isCheckable()
            if (r0 == 0) goto L1f
            java.lang.String r0 = "android.widget.CompoundButton"
            goto L21
        L1f:
            java.lang.String r0 = "android.widget.Button"
        L21:
            r9.setClassName(r0)
        L24:
            boolean r0 = r8.isCheckable()
            r9.setCheckable(r0)
            boolean r0 = r8.isClickable()
            r9.setClickable(r0)
            android.view.ViewParent r0 = r8.getParent()
            boolean r0 = r0 instanceof com.google.android.material.chip.ChipGroup
            if (r0 == 0) goto L63
            android.view.ViewParent r0 = r8.getParent()
            com.google.android.material.chip.ChipGroup r0 = (com.google.android.material.chip.ChipGroup) r0
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r9 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r9)
            boolean r1 = r0.isSingleLine()
            if (r1 == 0) goto L4f
            int r1 = r0.getIndexOfChip(r8)
            goto L50
        L4f:
            r1 = -1
        L50:
            r4 = r1
            int r2 = r0.getRowIndex(r8)
            r3 = 1
            r5 = 1
            r6 = 0
            boolean r7 = r8.isChecked()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r2, r3, r4, r5, r6, r7)
            r9.setCollectionItemInfo(r0)
        L63:
            return
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent r2, int r3) {
            r1 = this;
            android.graphics.RectF r3 = r1.getCloseIconTouchBounds()
            float r0 = r2.getX()
            float r2 = r2.getY()
            boolean r2 = r3.contains(r0, r2)
            if (r2 == 0) goto L23
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L23
            android.content.Context r2 = r1.getContext()
            r3 = 1002(0x3ea, float:1.404E-42)
            android.view.PointerIcon r2 = android.view.PointerIcon.getSystemIcon(r2, r3)
            return r2
        L23:
            r2 = 0
            return r2
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int r2) {
            r1 = this;
            super.onRtlPropertiesChanged(r2)
            int r0 = r1.lastLayoutDirection
            if (r0 == r2) goto Lc
            r1.lastLayoutDirection = r2
            r1.updatePaddingInternal()
        Lc:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L39
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.closeIconPressed
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r3)
            goto L3e
        L2b:
            boolean r0 = r5.closeIconPressed
            if (r0 == 0) goto L34
            r5.performCloseIconClick()
            r0 = r2
            goto L35
        L34:
            r0 = r3
        L35:
            r5.setCloseIconPressed(r3)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
        L3e:
            r0 = r2
            goto L41
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = r3
        L4b:
            return r2
    }

    public boolean performCloseIconClick() {
            r3 = this;
            r0 = 0
            r3.playSoundEffect(r0)
            android.view.View$OnClickListener r1 = r3.onCloseIconClickListener
            r2 = 1
            if (r1 == 0) goto Ld
            r1.onClick(r3)
            r0 = r2
        Ld:
            com.google.android.material.chip.Chip$ChipTouchHelper r1 = r3.touchHelper
            r1.sendEventForVirtualView(r2, r2)
            return r0
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackgroundDrawable()
            if (r2 == r0) goto L12
            android.graphics.drawable.RippleDrawable r0 = r1.ripple
            if (r2 == r0) goto L12
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            goto L15
        L12:
            super.setBackground(r2)
        L15:
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background color; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackgroundDrawable()
            if (r2 == r0) goto L12
            android.graphics.drawable.RippleDrawable r0 = r1.ripple
            if (r2 == r0) goto L12
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background drawable; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            goto L15
        L12:
            super.setBackgroundDrawable(r2)
        L15:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background resource; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background tint list; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background tint mode; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckable(r2)
        L7:
            return
    }

    public void setCheckableResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckableResource(r2)
        L7:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 != 0) goto L7
            r1.deferredCheckedValue = r2
            goto L1d
        L7:
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto L1d
            boolean r0 = r1.isChecked()
            super.setChecked(r2)
            if (r0 == r2) goto L1d
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r1.onCheckedChangeListenerInternal
            if (r0 == 0) goto L1d
            r0.onCheckedChanged(r1, r2)
        L1d:
            return
    }

    public void setCheckedIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckedIcon(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabled(boolean r1) {
            r0 = this;
            r0.setCheckedIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabledResource(int r1) {
            r0 = this;
            r0.setCheckedIconVisible(r1)
            return
    }

    public void setCheckedIconResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckedIconResource(r2)
        L7:
            return
    }

    public void setCheckedIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckedIconTint(r2)
        L7:
            return
    }

    public void setCheckedIconTintResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckedIconTintResource(r2)
        L7:
            return
    }

    public void setCheckedIconVisible(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckedIconVisible(r2)
        L7:
            return
    }

    public void setCheckedIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCheckedIconVisible(r2)
        L7:
            return
    }

    public void setChipBackgroundColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipBackgroundColor(r2)
        L7:
            return
    }

    public void setChipBackgroundColorResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipBackgroundColorResource(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadius(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipCornerRadius(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadiusResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipCornerRadiusResource(r2)
        L7:
            return
    }

    public void setChipDrawable(com.google.android.material.chip.ChipDrawable r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == r2) goto L17
            r1.unapplyChipDrawable(r0)
            r1.chipDrawable = r2
            r0 = 0
            r2.setShouldDrawText(r0)
            com.google.android.material.chip.ChipDrawable r2 = r1.chipDrawable
            r1.applyChipDrawable(r2)
            int r2 = r1.minTouchTargetSize
            r1.ensureAccessibleTouchTarget(r2)
        L17:
            return
    }

    public void setChipEndPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipEndPadding(r2)
        L7:
            return
    }

    public void setChipEndPaddingResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipEndPaddingResource(r2)
        L7:
            return
    }

    public void setChipIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIcon(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipIconEnabled(boolean r1) {
            r0 = this;
            r0.setChipIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setChipIconEnabledResource(int r1) {
            r0 = this;
            r0.setChipIconVisible(r1)
            return
    }

    public void setChipIconResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconResource(r2)
        L7:
            return
    }

    public void setChipIconSize(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconSize(r2)
        L7:
            return
    }

    public void setChipIconSizeResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconSizeResource(r2)
        L7:
            return
    }

    public void setChipIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconTint(r2)
        L7:
            return
    }

    public void setChipIconTintResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconTintResource(r2)
        L7:
            return
    }

    public void setChipIconVisible(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconVisible(r2)
        L7:
            return
    }

    public void setChipIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipIconVisible(r2)
        L7:
            return
    }

    public void setChipMinHeight(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipMinHeight(r2)
        L7:
            return
    }

    public void setChipMinHeightResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipMinHeightResource(r2)
        L7:
            return
    }

    public void setChipStartPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipStartPadding(r2)
        L7:
            return
    }

    public void setChipStartPaddingResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipStartPaddingResource(r2)
        L7:
            return
    }

    public void setChipStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipStrokeColor(r2)
        L7:
            return
    }

    public void setChipStrokeColorResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipStrokeColorResource(r2)
        L7:
            return
    }

    public void setChipStrokeWidth(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipStrokeWidth(r2)
        L7:
            return
    }

    public void setChipStrokeWidthResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setChipStrokeWidthResource(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.setText(r1)
            return
    }

    @java.lang.Deprecated
    public void setChipTextResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            return
    }

    public void setCloseIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIcon(r2)
        L7:
            r1.updateAccessibilityDelegate()
            return
    }

    public void setCloseIconContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconContentDescription(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setCloseIconEnabled(boolean r1) {
            r0 = this;
            r0.setCloseIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setCloseIconEnabledResource(int r1) {
            r0 = this;
            r0.setCloseIconVisible(r1)
            return
    }

    public void setCloseIconEndPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconEndPadding(r2)
        L7:
            return
    }

    public void setCloseIconEndPaddingResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconEndPaddingResource(r2)
        L7:
            return
    }

    public void setCloseIconResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconResource(r2)
        L7:
            r1.updateAccessibilityDelegate()
            return
    }

    public void setCloseIconSize(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconSize(r2)
        L7:
            return
    }

    public void setCloseIconSizeResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconSizeResource(r2)
        L7:
            return
    }

    public void setCloseIconStartPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconStartPadding(r2)
        L7:
            return
    }

    public void setCloseIconStartPaddingResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconStartPaddingResource(r2)
        L7:
            return
    }

    public void setCloseIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconTint(r2)
        L7:
            return
    }

    public void setCloseIconTintResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconTintResource(r2)
        L7:
            return
    }

    public void setCloseIconVisible(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setCloseIconVisible(r2)
            return
    }

    public void setCloseIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setCloseIconVisible(r2)
        L7:
            r1.updateAccessibilityDelegate()
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawables(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set right drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.View
    public void setElevation(float r2) {
            r1 = this;
            super.setElevation(r2)
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto La
            r0.setElevation(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setEllipsize(android.text.TextUtils.TruncateAt r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 != 0) goto L5
            return
        L5:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MARQUEE
            if (r2 == r0) goto L14
            super.setEllipsize(r2)
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L13
            r0.setEllipsize(r2)
        L13:
            return
        L14:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Text within a chip are not allowed to scroll."
            r2.<init>(r0)
            throw r2
    }

    public void setEnsureMinTouchTargetSize(boolean r1) {
            r0 = this;
            r0.ensureMinTouchTargetSize = r1
            int r1 = r0.minTouchTargetSize
            r0.ensureAccessibleTouchTarget(r1)
            return
    }

    @Override // android.widget.TextView
    public void setGravity(int r2) {
            r1 = this;
            r0 = 8388627(0x800013, float:1.175497E-38)
            if (r2 == r0) goto Ld
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r2, r0)
            goto L10
        Ld:
            super.setGravity(r2)
        L10:
            return
    }

    public void setHideMotionSpec(com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setHideMotionSpec(r2)
        L7:
            return
    }

    public void setHideMotionSpecResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setHideMotionSpecResource(r2)
        L7:
            return
    }

    public void setIconEndPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setIconEndPadding(r2)
        L7:
            return
    }

    public void setIconEndPaddingResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setIconEndPaddingResource(r2)
        L7:
            return
    }

    public void setIconStartPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setIconStartPadding(r2)
        L7:
            return
    }

    public void setIconStartPaddingResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setIconStartPaddingResource(r2)
        L7:
            return
    }

    @Override // android.view.View
    public void setLayoutDirection(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 != 0) goto L5
            return
        L5:
            super.setLayoutDirection(r2)
            return
    }

    @Override // android.widget.TextView
    public void setLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super.setLines(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.widget.TextView
    public void setMaxLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super.setMaxLines(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int r2) {
            r1 = this;
            super.setMaxWidth(r2)
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto La
            r0.setMaxWidth(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setMinLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super.setMinLines(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    void setOnCheckedChangeListenerInternal(android.widget.CompoundButton.OnCheckedChangeListener r1) {
            r0 = this;
            r0.onCheckedChangeListenerInternal = r1
            return
    }

    public void setOnCloseIconClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.onCloseIconClickListener = r1
            r0.updateAccessibilityDelegate()
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setRippleColor(r2)
        L7:
            com.google.android.material.chip.ChipDrawable r2 = r1.chipDrawable
            boolean r2 = r2.getUseCompatRipple()
            if (r2 != 0) goto L12
            r1.updateFrameworkRippleBackground()
        L12:
            return
    }

    public void setRippleColorResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L12
            r0.setRippleColorResource(r2)
            com.google.android.material.chip.ChipDrawable r2 = r1.chipDrawable
            boolean r2 = r2.getUseCompatRipple()
            if (r2 != 0) goto L12
            r1.updateFrameworkRippleBackground()
        L12:
            return
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            r0.setShapeAppearanceModel(r2)
            return
    }

    public void setShowMotionSpec(com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setShowMotionSpec(r2)
        L7:
            return
    }

    public void setShowMotionSpecResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setShowMotionSpecResource(r2)
        L7:
            return
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L6
            super.setSingleLine(r2)
            return
        L6:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence r2, android.widget.TextView.BufferType r3) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 != 0) goto L5
            return
        L5:
            if (r2 != 0) goto L9
            java.lang.String r2 = ""
        L9:
            boolean r0 = r0.shouldDrawText()
            if (r0 == 0) goto L11
            r0 = 0
            goto L12
        L11:
            r0 = r2
        L12:
            super.setText(r0, r3)
            com.google.android.material.chip.ChipDrawable r3 = r1.chipDrawable
            if (r3 == 0) goto L1c
            r3.setText(r2)
        L1c:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int r2) {
            r1 = this;
            super.setTextAppearance(r2)
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto La
            r0.setTextAppearanceResource(r2)
        La:
            r1.updateTextPaintDrawState()
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            com.google.android.material.chip.ChipDrawable r1 = r0.chipDrawable
            if (r1 == 0) goto La
            r1.setTextAppearanceResource(r2)
        La:
            r0.updateTextPaintDrawState()
            return
    }

    public void setTextAppearance(com.google.android.material.resources.TextAppearance r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setTextAppearance(r2)
        L7:
            r1.updateTextPaintDrawState()
            return
    }

    public void setTextAppearanceResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            r1.setTextAppearance(r0, r2)
            return
    }

    public void setTextEndPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setTextEndPadding(r2)
        L7:
            return
    }

    public void setTextEndPaddingResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setTextEndPaddingResource(r2)
        L7:
            return
    }

    public void setTextStartPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setTextStartPadding(r2)
        L7:
            return
    }

    public void setTextStartPaddingResource(int r2) {
            r1 = this;
            com.google.android.material.chip.ChipDrawable r0 = r1.chipDrawable
            if (r0 == 0) goto L7
            r0.setTextStartPaddingResource(r2)
        L7:
            return
    }

    public boolean shouldEnsureMinTouchTargetSize() {
            r1 = this;
            boolean r0 = r1.ensureMinTouchTargetSize
            return r0
    }
}
