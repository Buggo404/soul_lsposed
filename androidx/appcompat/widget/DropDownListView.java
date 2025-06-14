package androidx.appcompat.widget;

/* loaded from: classes.dex */
class DropDownListView extends android.widget.ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private androidx.core.view.ViewPropertyAnimatorCompat mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private java.lang.reflect.Field mIsChildViewEnabled;
    private boolean mListSelectionHidden;
    private int mMotionPosition;
    androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable mResolveHoverRunnable;
    private androidx.core.widget.ListViewAutoScrollHelper mScrollHelper;
    private int mSelectionBottomPadding;
    private int mSelectionLeftPadding;
    private int mSelectionRightPadding;
    private int mSelectionTopPadding;
    private androidx.appcompat.widget.DropDownListView.GateKeeperDrawable mSelector;
    private final android.graphics.Rect mSelectorRect;

    private static class GateKeeperDrawable extends androidx.appcompat.graphics.drawable.DrawableWrapper {
        private boolean mEnabled;

        GateKeeperDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.mEnabled = r1
                return
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r2) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L7
                super.draw(r2)
            L7:
                return
        }

        void setEnabled(boolean r1) {
                r0 = this;
                r0.mEnabled = r1
                return
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void setHotspot(float r2, float r3) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L7
                super.setHotspot(r2, r3)
            L7:
                return
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void setHotspotBounds(int r2, int r3, int r4, int r5) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L7
                super.setHotspotBounds(r2, r3, r4, r5)
            L7:
                return
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean setState(int[] r2) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L9
                boolean r2 = super.setState(r2)
                return r2
            L9:
                r2 = 0
                return r2
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean setVisible(boolean r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L9
                boolean r2 = super.setVisible(r2, r3)
                return r2
            L9:
                r2 = 0
                return r2
        }
    }

    private class ResolveHoverRunnable implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.widget.DropDownListView this$0;

        ResolveHoverRunnable(androidx.appcompat.widget.DropDownListView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public void cancel() {
                r2 = this;
                androidx.appcompat.widget.DropDownListView r0 = r2.this$0
                r1 = 0
                r0.mResolveHoverRunnable = r1
                androidx.appcompat.widget.DropDownListView r0 = r2.this$0
                r0.removeCallbacks(r2)
                return
        }

        public void post() {
                r1 = this;
                androidx.appcompat.widget.DropDownListView r0 = r1.this$0
                r0.post(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.DropDownListView r0 = r2.this$0
                r1 = 0
                r0.mResolveHoverRunnable = r1
                androidx.appcompat.widget.DropDownListView r0 = r2.this$0
                r0.drawableStateChanged()
                return
        }
    }

    DropDownListView(android.content.Context r3, boolean r4) {
            r2 = this;
            r0 = 0
            int r1 = androidx.appcompat.C0015R.attr.dropDownListViewStyle
            r2.<init>(r3, r0, r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.mSelectorRect = r3
            r3 = 0
            r2.mSelectionLeftPadding = r3
            r2.mSelectionTopPadding = r3
            r2.mSelectionRightPadding = r3
            r2.mSelectionBottomPadding = r3
            r2.mHijackFocus = r4
            r2.setCacheColorHint(r3)
            java.lang.Class<android.widget.AbsListView> r3 = android.widget.AbsListView.class
            java.lang.String r4 = "mIsChildViewEnabled"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L2a
            r2.mIsChildViewEnabled = r3     // Catch: java.lang.NoSuchFieldException -> L2a
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.NoSuchFieldException -> L2a
            goto L2e
        L2a:
            r3 = move-exception
            r3.printStackTrace()
        L2e:
            return
    }

    private void clearPressedItem() {
            r3 = this;
            r0 = 0
            r3.mDrawsInPressedState = r0
            r3.setPressed(r0)
            r3.drawableStateChanged()
            int r1 = r3.mMotionPosition
            int r2 = r3.getFirstVisiblePosition()
            int r1 = r1 - r2
            android.view.View r1 = r3.getChildAt(r1)
            if (r1 == 0) goto L19
            r1.setPressed(r0)
        L19:
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mClickAnimation
            if (r0 == 0) goto L23
            r0.cancel()
            r0 = 0
            r3.mClickAnimation = r0
        L23:
            return
    }

    private void clickPressedItem(android.view.View r3, int r4) {
            r2 = this;
            long r0 = r2.getItemIdAtPosition(r4)
            r2.performItemClick(r3, r4, r0)
            return
    }

    private void drawSelectorCompat(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.mSelectorRect
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L16
            android.graphics.Rect r1 = r2.mSelectorRect
            r0.setBounds(r1)
            r0.draw(r3)
        L16:
            return
    }

    private void positionSelectorCompat(int r6, android.view.View r7) {
            r5 = this;
            android.graphics.Rect r0 = r5.mSelectorRect
            int r1 = r7.getLeft()
            int r2 = r7.getTop()
            int r3 = r7.getRight()
            int r4 = r7.getBottom()
            r0.set(r1, r2, r3, r4)
            int r1 = r0.left
            int r2 = r5.mSelectionLeftPadding
            int r1 = r1 - r2
            r0.left = r1
            int r1 = r0.top
            int r2 = r5.mSelectionTopPadding
            int r1 = r1 - r2
            r0.top = r1
            int r1 = r0.right
            int r2 = r5.mSelectionRightPadding
            int r1 = r1 + r2
            r0.right = r1
            int r1 = r0.bottom
            int r2 = r5.mSelectionBottomPadding
            int r1 = r1 + r2
            r0.bottom = r1
            java.lang.reflect.Field r0 = r5.mIsChildViewEnabled     // Catch: java.lang.IllegalAccessException -> L52
            boolean r0 = r0.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> L52
            boolean r7 = r7.isEnabled()     // Catch: java.lang.IllegalAccessException -> L52
            if (r7 == r0) goto L56
            java.lang.reflect.Field r7 = r5.mIsChildViewEnabled     // Catch: java.lang.IllegalAccessException -> L52
            if (r0 != 0) goto L43
            r0 = 1
            goto L44
        L43:
            r0 = 0
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.IllegalAccessException -> L52
            r7.set(r5, r0)     // Catch: java.lang.IllegalAccessException -> L52
            r7 = -1
            if (r6 == r7) goto L56
            r5.refreshDrawableState()     // Catch: java.lang.IllegalAccessException -> L52
            goto L56
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            return
    }

    private void positionSelectorLikeFocusCompat(int r5, android.view.View r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getSelector()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Ld
            r3 = -1
            if (r5 == r3) goto Ld
            r3 = r1
            goto Le
        Ld:
            r3 = r2
        Le:
            if (r3 == 0) goto L13
            r0.setVisible(r2, r2)
        L13:
            r4.positionSelectorCompat(r5, r6)
            if (r3 == 0) goto L30
            android.graphics.Rect r5 = r4.mSelectorRect
            float r6 = r5.exactCenterX()
            float r5 = r5.exactCenterY()
            int r3 = r4.getVisibility()
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            r0.setVisible(r1, r2)
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r6, r5)
        L30:
            return
    }

    private void positionSelectorLikeTouchCompat(int r2, android.view.View r3, float r4, float r5) {
            r1 = this;
            r1.positionSelectorLikeFocusCompat(r2, r3)
            android.graphics.drawable.Drawable r3 = r1.getSelector()
            if (r3 == 0) goto Lf
            r0 = -1
            if (r2 == r0) goto Lf
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r3, r4, r5)
        Lf:
            return
    }

    private void setPressedItem(android.view.View r5, int r6, float r7, float r8) {
            r4 = this;
            r0 = 1
            r4.mDrawsInPressedState = r0
            r4.drawableHotspotChanged(r7, r8)
            boolean r1 = r4.isPressed()
            if (r1 != 0) goto Lf
            r4.setPressed(r0)
        Lf:
            r4.layoutChildren()
            int r1 = r4.mMotionPosition
            r2 = -1
            r3 = 0
            if (r1 == r2) goto L2e
            int r2 = r4.getFirstVisiblePosition()
            int r1 = r1 - r2
            android.view.View r1 = r4.getChildAt(r1)
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L2e
            boolean r2 = r1.isPressed()
            if (r2 == 0) goto L2e
            r1.setPressed(r3)
        L2e:
            r4.mMotionPosition = r6
            int r1 = r5.getLeft()
            float r1 = (float) r1
            float r1 = r7 - r1
            int r2 = r5.getTop()
            float r2 = (float) r2
            float r2 = r8 - r2
            r5.drawableHotspotChanged(r1, r2)
            boolean r1 = r5.isPressed()
            if (r1 != 0) goto L4a
            r5.setPressed(r0)
        L4a:
            r4.positionSelectorLikeTouchCompat(r6, r5, r7, r8)
            r4.setSelectorEnabled(r3)
            r4.refreshDrawableState()
            return
    }

    private void setSelectorEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.DropDownListView$GateKeeperDrawable r0 = r1.mSelector
            if (r0 == 0) goto L7
            r0.setEnabled(r2)
        L7:
            return
    }

    private boolean touchModeDrawsInPressedStateCompat() {
            r1 = this;
            boolean r0 = r1.mDrawsInPressedState
            return r0
    }

    private void updateSelectorStateCompat() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L19
            boolean r1 = r2.touchModeDrawsInPressedStateCompat()
            if (r1 == 0) goto L19
            boolean r1 = r2.isPressed()
            if (r1 == 0) goto L19
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L19:
            return
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            r0.drawSelectorCompat(r1)
            super.dispatchDraw(r1)
            return
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r0 = r1.mResolveHoverRunnable
            if (r0 == 0) goto L5
            return
        L5:
            super.drawableStateChanged()
            r0 = 1
            r1.setSelectorEnabled(r0)
            r1.updateSelectorStateCompat()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
            r1 = this;
            boolean r0 = r1.mHijackFocus
            if (r0 != 0) goto Ld
            boolean r0 = super.hasFocus()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
            r1 = this;
            boolean r0 = r1.mHijackFocus
            if (r0 != 0) goto Ld
            boolean r0 = super.hasWindowFocus()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.view.View
    public boolean isFocused() {
            r1 = this;
            boolean r0 = r1.mHijackFocus
            if (r0 != 0) goto Ld
            boolean r0 = super.isFocused()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
            r1 = this;
            boolean r0 = r1.mHijackFocus
            if (r0 == 0) goto L8
            boolean r0 = r1.mListSelectionHidden
            if (r0 != 0) goto Le
        L8:
            boolean r0 = super.isInTouchMode()
            if (r0 == 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public int lookForSelectablePosition(int r5, boolean r6) {
            r4 = this;
            android.widget.ListAdapter r0 = r4.getAdapter()
            r1 = -1
            if (r0 == 0) goto L4c
            boolean r2 = r4.isInTouchMode()
            if (r2 == 0) goto Le
            goto L4c
        Le:
            int r2 = r0.getCount()
            android.widget.ListAdapter r3 = r4.getAdapter()
            boolean r3 = r3.areAllItemsEnabled()
            if (r3 != 0) goto L46
            if (r6 == 0) goto L2e
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
        L23:
            if (r5 >= r2) goto L3f
            boolean r6 = r0.isEnabled(r5)
            if (r6 != 0) goto L3f
            int r5 = r5 + 1
            goto L23
        L2e:
            int r6 = r2 + (-1)
            int r5 = java.lang.Math.min(r5, r6)
        L34:
            if (r5 < 0) goto L3f
            boolean r6 = r0.isEnabled(r5)
            if (r6 != 0) goto L3f
            int r5 = r5 + (-1)
            goto L34
        L3f:
            if (r5 < 0) goto L45
            if (r5 < r2) goto L44
            goto L45
        L44:
            return r5
        L45:
            return r1
        L46:
            if (r5 < 0) goto L4c
            if (r5 < r2) goto L4b
            goto L4c
        L4b:
            return r5
        L4c:
            return r1
    }

    public int measureHeightOfChildrenCompat(int r11, int r12, int r13, int r14, int r15) {
            r10 = this;
            int r12 = r10.getListPaddingTop()
            int r13 = r10.getListPaddingBottom()
            int r0 = r10.getDividerHeight()
            android.graphics.drawable.Drawable r1 = r10.getDivider()
            android.widget.ListAdapter r2 = r10.getAdapter()
            if (r2 != 0) goto L18
            int r12 = r12 + r13
            return r12
        L18:
            int r12 = r12 + r13
            r13 = 0
            if (r0 <= 0) goto L1f
            if (r1 == 0) goto L1f
            goto L20
        L1f:
            r0 = r13
        L20:
            int r1 = r2.getCount()
            r3 = 0
            r4 = r13
            r5 = r4
            r7 = r5
            r6 = r3
        L29:
            if (r4 >= r1) goto L77
            int r8 = r2.getItemViewType(r4)
            if (r8 == r5) goto L33
            r6 = r3
            r5 = r8
        L33:
            android.view.View r6 = r2.getView(r4, r6, r10)
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            if (r8 != 0) goto L44
            android.view.ViewGroup$LayoutParams r8 = r10.generateDefaultLayoutParams()
            r6.setLayoutParams(r8)
        L44:
            int r9 = r8.height
            if (r9 <= 0) goto L51
            int r8 = r8.height
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            goto L55
        L51:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)
        L55:
            r6.measure(r11, r8)
            r6.forceLayout()
            if (r4 <= 0) goto L5e
            int r12 = r12 + r0
        L5e:
            int r8 = r6.getMeasuredHeight()
            int r12 = r12 + r8
            if (r12 < r14) goto L6f
            if (r15 < 0) goto L6e
            if (r4 <= r15) goto L6e
            if (r7 <= 0) goto L6e
            if (r12 == r14) goto L6e
            r14 = r7
        L6e:
            return r14
        L6f:
            if (r15 < 0) goto L74
            if (r4 < r15) goto L74
            r7 = r12
        L74:
            int r4 = r4 + 1
            goto L29
        L77:
            return r12
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.mResolveHoverRunnable = r0
            super.onDetachedFromWindow()
            return
    }

    public boolean onForwardedEvent(android.view.MotionEvent r8, int r9) {
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.setPressedItem(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.clickPressedItem(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.clearPressedItem()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.mScrollHelper
            if (r9 != 0) goto L5a
            androidx.core.widget.ListViewAutoScrollHelper r9 = new androidx.core.widget.ListViewAutoScrollHelper
            r9.<init>(r7)
            r7.mScrollHelper = r9
        L5a:
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.mScrollHelper
            r9.setEnabled(r1)
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.mScrollHelper
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.ListViewAutoScrollHelper r8 = r7.mScrollHelper
            if (r8 == 0) goto L6c
            r8.setEnabled(r2)
        L6c:
            return r3
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto Lb
            boolean r5 = super.onHoverEvent(r5)
            return r5
        Lb:
            int r0 = r5.getActionMasked()
            r1 = 10
            if (r0 != r1) goto L21
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r1 = r4.mResolveHoverRunnable
            if (r1 != 0) goto L21
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r1 = new androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable
            r1.<init>(r4)
            r4.mResolveHoverRunnable = r1
            r1.post()
        L21:
            boolean r1 = super.onHoverEvent(r5)
            r2 = 9
            r3 = -1
            if (r0 == r2) goto L32
            r2 = 7
            if (r0 != r2) goto L2e
            goto L32
        L2e:
            r4.setSelection(r3)
            goto L67
        L32:
            float r0 = r5.getX()
            int r0 = (int) r0
            float r5 = r5.getY()
            int r5 = (int) r5
            int r5 = r4.pointToPosition(r0, r5)
            if (r5 == r3) goto L67
            int r0 = r4.getSelectedItemPosition()
            if (r5 == r0) goto L67
            int r0 = r4.getFirstVisiblePosition()
            int r0 = r5 - r0
            android.view.View r0 = r4.getChildAt(r0)
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L64
            int r0 = r0.getTop()
            int r2 = r4.getTop()
            int r0 = r0 - r2
            r4.setSelectionFromTop(r5, r0)
        L64:
            r4.updateSelectorStateCompat()
        L67:
            return r1
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            if (r0 == 0) goto L7
            goto L17
        L7:
            float r0 = r3.getX()
            int r0 = (int) r0
            float r1 = r3.getY()
            int r1 = (int) r1
            int r0 = r2.pointToPosition(r0, r1)
            r2.mMotionPosition = r0
        L17:
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r0 = r2.mResolveHoverRunnable
            if (r0 == 0) goto L1e
            r0.cancel()
        L1e:
            boolean r3 = super.onTouchEvent(r3)
            return r3
    }

    void setListSelectionHidden(boolean r1) {
            r0 = this;
            r0.mListSelectionHidden = r1
            return
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L8
            androidx.appcompat.widget.DropDownListView$GateKeeperDrawable r0 = new androidx.appcompat.widget.DropDownListView$GateKeeperDrawable
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.mSelector = r0
            super.setSelector(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            if (r2 == 0) goto L18
            r2.getPadding(r0)
        L18:
            int r2 = r0.left
            r1.mSelectionLeftPadding = r2
            int r2 = r0.top
            r1.mSelectionTopPadding = r2
            int r2 = r0.right
            r1.mSelectionRightPadding = r2
            int r2 = r0.bottom
            r1.mSelectionBottomPadding = r2
            return
    }
}
