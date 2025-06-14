package androidx.customview.widget;

/* loaded from: classes.dex */
public abstract class ExploreByTouchHelper extends androidx.core.view.AccessibilityDelegateCompat {
    private static final java.lang.String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final android.graphics.Rect INVALID_PARENT_BOUNDS = null;
    private static final androidx.customview.widget.FocusStrategy.BoundsAdapter<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> NODE_ADAPTER = null;
    private static final androidx.customview.widget.FocusStrategy.CollectionAdapter<androidx.collection.SparseArrayCompat<androidx.core.view.accessibility.AccessibilityNodeInfoCompat>, androidx.core.view.accessibility.AccessibilityNodeInfoCompat> SPARSE_VALUES_ADAPTER = null;
    int mAccessibilityFocusedVirtualViewId;
    private final android.view.View mHost;
    private int mHoveredVirtualViewId;
    int mKeyboardFocusedVirtualViewId;
    private final android.view.accessibility.AccessibilityManager mManager;
    private androidx.customview.widget.ExploreByTouchHelper.MyNodeProvider mNodeProvider;
    private final int[] mTempGlobalRect;
    private final android.graphics.Rect mTempParentRect;
    private final android.graphics.Rect mTempScreenRect;
    private final android.graphics.Rect mTempVisibleRect;



    private class MyNodeProvider extends androidx.core.view.accessibility.AccessibilityNodeProviderCompat {
        final /* synthetic */ androidx.customview.widget.ExploreByTouchHelper this$0;

        MyNodeProvider(androidx.customview.widget.ExploreByTouchHelper r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public androidx.core.view.accessibility.AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int r2) {
                r1 = this;
                androidx.customview.widget.ExploreByTouchHelper r0 = r1.this$0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = r0.obtainAccessibilityNodeInfo(r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain(r2)
                return r2
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public androidx.core.view.accessibility.AccessibilityNodeInfoCompat findFocus(int r2) {
                r1 = this;
                r0 = 2
                if (r2 != r0) goto L8
                androidx.customview.widget.ExploreByTouchHelper r2 = r1.this$0
                int r2 = r2.mAccessibilityFocusedVirtualViewId
                goto Lc
            L8:
                androidx.customview.widget.ExploreByTouchHelper r2 = r1.this$0
                int r2 = r2.mKeyboardFocusedVirtualViewId
            Lc:
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != r0) goto L12
                r2 = 0
                return r2
            L12:
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = r1.createAccessibilityNodeInfo(r2)
                return r2
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int r2, int r3, android.os.Bundle r4) {
                r1 = this;
                androidx.customview.widget.ExploreByTouchHelper r0 = r1.this$0
                boolean r2 = r0.performAction(r2, r3, r4)
                return r2
        }
    }

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.<init>(r1, r1, r2, r2)
            androidx.customview.widget.ExploreByTouchHelper.INVALID_PARENT_BOUNDS = r0
            androidx.customview.widget.ExploreByTouchHelper$1 r0 = new androidx.customview.widget.ExploreByTouchHelper$1
            r0.<init>()
            androidx.customview.widget.ExploreByTouchHelper.NODE_ADAPTER = r0
            androidx.customview.widget.ExploreByTouchHelper$2 r0 = new androidx.customview.widget.ExploreByTouchHelper$2
            r0.<init>()
            androidx.customview.widget.ExploreByTouchHelper.SPARSE_VALUES_ADAPTER = r0
            return
    }

    public ExploreByTouchHelper(android.view.View r3) {
            r2 = this;
            r2.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTempScreenRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTempParentRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTempVisibleRect = r0
            r0 = 2
            int[] r0 = new int[r0]
            r2.mTempGlobalRect = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mAccessibilityFocusedVirtualViewId = r0
            r2.mKeyboardFocusedVirtualViewId = r0
            r2.mHoveredVirtualViewId = r0
            if (r3 == 0) goto L45
            r2.mHost = r3
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r2.mManager = r0
            r0 = 1
            r3.setFocusable(r0)
            int r1 = androidx.core.view.ViewCompat.getImportantForAccessibility(r3)
            if (r1 != 0) goto L44
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r0)
        L44:
            return
        L45:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "View may not be null"
            r3.<init>(r0)
            throw r3
    }

    private boolean clearAccessibilityFocus(int r2) {
            r1 = this;
            int r0 = r1.mAccessibilityFocusedVirtualViewId
            if (r0 != r2) goto L14
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mAccessibilityFocusedVirtualViewId = r0
            android.view.View r0 = r1.mHost
            r0.invalidate()
            r0 = 65536(0x10000, float:9.18355E-41)
            r1.sendEventForVirtualView(r2, r0)
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    private boolean clickKeyboardFocusedVirtualView() {
            r3 = this;
            int r0 = r3.mKeyboardFocusedVirtualViewId
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L11
            r1 = 16
            r2 = 0
            boolean r0 = r3.onPerformActionForVirtualView(r0, r1, r2)
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    private android.view.accessibility.AccessibilityEvent createEvent(int r2, int r3) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L8
            android.view.accessibility.AccessibilityEvent r2 = r1.createEventForChild(r2, r3)
            return r2
        L8:
            android.view.accessibility.AccessibilityEvent r2 = r1.createEventForHost(r3)
            return r2
    }

    private android.view.accessibility.AccessibilityEvent createEventForChild(int r4, int r5) {
            r3 = this;
            android.view.accessibility.AccessibilityEvent r5 = android.view.accessibility.AccessibilityEvent.obtain(r5)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r3.obtainAccessibilityNodeInfo(r4)
            java.util.List r1 = r5.getText()
            java.lang.CharSequence r2 = r0.getText()
            r1.add(r2)
            java.lang.CharSequence r1 = r0.getContentDescription()
            r5.setContentDescription(r1)
            boolean r1 = r0.isScrollable()
            r5.setScrollable(r1)
            boolean r1 = r0.isPassword()
            r5.setPassword(r1)
            boolean r1 = r0.isEnabled()
            r5.setEnabled(r1)
            boolean r1 = r0.isChecked()
            r5.setChecked(r1)
            r3.onPopulateEventForVirtualView(r4, r5)
            java.util.List r1 = r5.getText()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L52
            java.lang.CharSequence r1 = r5.getContentDescription()
            if (r1 == 0) goto L4a
            goto L52
        L4a:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r4.<init>(r5)
            throw r4
        L52:
            java.lang.CharSequence r0 = r0.getClassName()
            r5.setClassName(r0)
            android.view.View r0 = r3.mHost
            androidx.core.view.accessibility.AccessibilityRecordCompat.setSource(r5, r0, r4)
            android.view.View r4 = r3.mHost
            android.content.Context r4 = r4.getContext()
            java.lang.String r4 = r4.getPackageName()
            r5.setPackageName(r4)
            return r5
    }

    private android.view.accessibility.AccessibilityEvent createEventForHost(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain(r2)
            android.view.View r0 = r1.mHost
            r0.onInitializeAccessibilityEvent(r2)
            return r2
    }

    private androidx.core.view.accessibility.AccessibilityNodeInfoCompat createNodeForChild(int r8) {
            r7 = this;
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain()
            r1 = 1
            r0.setEnabled(r1)
            r0.setFocusable(r1)
            java.lang.String r2 = "android.view.View"
            r0.setClassName(r2)
            android.graphics.Rect r2 = androidx.customview.widget.ExploreByTouchHelper.INVALID_PARENT_BOUNDS
            r0.setBoundsInParent(r2)
            r0.setBoundsInScreen(r2)
            android.view.View r3 = r7.mHost
            r0.setParent(r3)
            r7.onPopulateNodeForVirtualView(r8, r0)
            java.lang.CharSequence r3 = r0.getText()
            if (r3 != 0) goto L35
            java.lang.CharSequence r3 = r0.getContentDescription()
            if (r3 == 0) goto L2d
            goto L35
        L2d:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must add text or a content description in populateNodeForVirtualViewId()"
            r8.<init>(r0)
            throw r8
        L35:
            android.graphics.Rect r3 = r7.mTempParentRect
            r0.getBoundsInParent(r3)
            android.graphics.Rect r3 = r7.mTempParentRect
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L145
            int r3 = r0.getActions()
            r4 = r3 & 64
            if (r4 != 0) goto L13d
            r4 = 128(0x80, float:1.794E-43)
            r3 = r3 & r4
            if (r3 != 0) goto L135
            android.view.View r3 = r7.mHost
            android.content.Context r3 = r3.getContext()
            java.lang.String r3 = r3.getPackageName()
            r0.setPackageName(r3)
            android.view.View r3 = r7.mHost
            r0.setSource(r3, r8)
            int r3 = r7.mAccessibilityFocusedVirtualViewId
            r5 = 0
            if (r3 != r8) goto L6d
            r0.setAccessibilityFocused(r1)
            r0.addAction(r4)
            goto L75
        L6d:
            r0.setAccessibilityFocused(r5)
            r3 = 64
            r0.addAction(r3)
        L75:
            int r3 = r7.mKeyboardFocusedVirtualViewId
            if (r3 != r8) goto L7b
            r8 = r1
            goto L7c
        L7b:
            r8 = r5
        L7c:
            if (r8 == 0) goto L83
            r3 = 2
            r0.addAction(r3)
            goto L8c
        L83:
            boolean r3 = r0.isFocusable()
            if (r3 == 0) goto L8c
            r0.addAction(r1)
        L8c:
            r0.setFocused(r8)
            android.view.View r8 = r7.mHost
            int[] r3 = r7.mTempGlobalRect
            r8.getLocationOnScreen(r3)
            android.graphics.Rect r8 = r7.mTempScreenRect
            r0.getBoundsInScreen(r8)
            android.graphics.Rect r8 = r7.mTempScreenRect
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto Lf5
            android.graphics.Rect r8 = r7.mTempScreenRect
            r0.getBoundsInParent(r8)
            int r8 = r0.mParentVirtualDescendantId
            r2 = -1
            if (r8 == r2) goto Lda
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r8 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain()
            int r3 = r0.mParentVirtualDescendantId
        Lb3:
            if (r3 == r2) goto Ld7
            android.view.View r4 = r7.mHost
            r8.setParent(r4, r2)
            android.graphics.Rect r4 = androidx.customview.widget.ExploreByTouchHelper.INVALID_PARENT_BOUNDS
            r8.setBoundsInParent(r4)
            r7.onPopulateNodeForVirtualView(r3, r8)
            android.graphics.Rect r3 = r7.mTempParentRect
            r8.getBoundsInParent(r3)
            android.graphics.Rect r3 = r7.mTempScreenRect
            android.graphics.Rect r4 = r7.mTempParentRect
            int r4 = r4.left
            android.graphics.Rect r6 = r7.mTempParentRect
            int r6 = r6.top
            r3.offset(r4, r6)
            int r3 = r8.mParentVirtualDescendantId
            goto Lb3
        Ld7:
            r8.recycle()
        Lda:
            android.graphics.Rect r8 = r7.mTempScreenRect
            int[] r2 = r7.mTempGlobalRect
            r2 = r2[r5]
            android.view.View r3 = r7.mHost
            int r3 = r3.getScrollX()
            int r2 = r2 - r3
            int[] r3 = r7.mTempGlobalRect
            r3 = r3[r1]
            android.view.View r4 = r7.mHost
            int r4 = r4.getScrollY()
            int r3 = r3 - r4
            r8.offset(r2, r3)
        Lf5:
            android.view.View r8 = r7.mHost
            android.graphics.Rect r2 = r7.mTempVisibleRect
            boolean r8 = r8.getLocalVisibleRect(r2)
            if (r8 == 0) goto L134
            android.graphics.Rect r8 = r7.mTempVisibleRect
            int[] r2 = r7.mTempGlobalRect
            r2 = r2[r5]
            android.view.View r3 = r7.mHost
            int r3 = r3.getScrollX()
            int r2 = r2 - r3
            int[] r3 = r7.mTempGlobalRect
            r3 = r3[r1]
            android.view.View r4 = r7.mHost
            int r4 = r4.getScrollY()
            int r3 = r3 - r4
            r8.offset(r2, r3)
            android.graphics.Rect r8 = r7.mTempScreenRect
            android.graphics.Rect r2 = r7.mTempVisibleRect
            boolean r8 = r8.intersect(r2)
            if (r8 == 0) goto L134
            android.graphics.Rect r8 = r7.mTempScreenRect
            r0.setBoundsInScreen(r8)
            android.graphics.Rect r8 = r7.mTempScreenRect
            boolean r8 = r7.isVisibleToUser(r8)
            if (r8 == 0) goto L134
            r0.setVisibleToUser(r1)
        L134:
            return r0
        L135:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            r8.<init>(r0)
            throw r8
        L13d:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            r8.<init>(r0)
            throw r8
        L145:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must set parent bounds in populateNodeForVirtualViewId()"
            r8.<init>(r0)
            throw r8
    }

    private androidx.core.view.accessibility.AccessibilityNodeInfoCompat createNodeForHost() {
            r6 = this;
            android.view.View r0 = r6.mHost
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain(r0)
            android.view.View r1 = r6.mHost
            androidx.core.view.ViewCompat.onInitializeAccessibilityNodeInfo(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.getVisibleVirtualViews(r1)
            int r2 = r0.getChildCount()
            if (r2 <= 0) goto L28
            int r2 = r1.size()
            if (r2 > 0) goto L20
            goto L28
        L20:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Views cannot have both real and virtual children"
            r0.<init>(r1)
            throw r0
        L28:
            int r2 = r1.size()
            r3 = 0
        L2d:
            if (r3 >= r2) goto L41
            android.view.View r4 = r6.mHost
            java.lang.Object r5 = r1.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0.addChild(r4, r5)
            int r3 = r3 + 1
            goto L2d
        L41:
            return r0
    }

    private androidx.collection.SparseArrayCompat<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> getAllNodes() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.getVisibleVirtualViews(r0)
            androidx.collection.SparseArrayCompat r1 = new androidx.collection.SparseArrayCompat
            r1.<init>()
            r2 = 0
        Le:
            int r3 = r0.size()
            if (r2 >= r3) goto L1e
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3 = r4.createNodeForChild(r2)
            r1.put(r2, r3)
            int r2 = r2 + 1
            goto Le
        L1e:
            return r1
    }

    private void getBoundsInParent(int r1, android.graphics.Rect r2) {
            r0 = this;
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = r0.obtainAccessibilityNodeInfo(r1)
            r1.getBoundsInParent(r2)
            return
    }

    private static android.graphics.Rect guessPreviouslyFocusedRect(android.view.View r4, int r5, android.graphics.Rect r6) {
            int r0 = r4.getWidth()
            int r4 = r4.getHeight()
            r1 = 17
            r2 = 0
            if (r5 == r1) goto L2e
            r1 = 33
            if (r5 == r1) goto L2a
            r1 = 66
            r3 = -1
            if (r5 == r1) goto L26
            r4 = 130(0x82, float:1.82E-43)
            if (r5 != r4) goto L1e
            r6.set(r2, r3, r0, r3)
            goto L31
        L1e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r4.<init>(r5)
            throw r4
        L26:
            r6.set(r3, r2, r3, r4)
            goto L31
        L2a:
            r6.set(r2, r4, r0, r4)
            goto L31
        L2e:
            r6.set(r0, r2, r0, r4)
        L31:
            return r6
    }

    private boolean isVisibleToUser(android.graphics.Rect r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L38
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto La
            goto L38
        La:
            android.view.View r4 = r3.mHost
            int r4 = r4.getWindowVisibility()
            if (r4 == 0) goto L13
            return r0
        L13:
            android.view.View r4 = r3.mHost
            android.view.ViewParent r4 = r4.getParent()
        L19:
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L35
            android.view.View r4 = (android.view.View) r4
            float r1 = r4.getAlpha()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L34
            int r1 = r4.getVisibility()
            if (r1 == 0) goto L2f
            goto L34
        L2f:
            android.view.ViewParent r4 = r4.getParent()
            goto L19
        L34:
            return r0
        L35:
            if (r4 == 0) goto L38
            r0 = 1
        L38:
            return r0
    }

    private static int keyToDirection(int r1) {
            r0 = 19
            if (r1 == r0) goto L15
            r0 = 21
            if (r1 == r0) goto L12
            r0 = 22
            if (r1 == r0) goto Lf
            r1 = 130(0x82, float:1.82E-43)
            return r1
        Lf:
            r1 = 66
            return r1
        L12:
            r1 = 17
            return r1
        L15:
            r1 = 33
            return r1
    }

    private boolean moveFocus(int r10, android.graphics.Rect r11) {
            r9 = this;
            androidx.collection.SparseArrayCompat r7 = r9.getAllNodes()
            int r0 = r9.mKeyboardFocusedVirtualViewId
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r8) goto Lc
            r0 = 0
            goto L12
        Lc:
            java.lang.Object r0 = r7.get(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r0
        L12:
            r3 = r0
            r0 = 1
            if (r10 == r0) goto L57
            r1 = 2
            if (r10 == r1) goto L57
            r0 = 17
            if (r10 == r0) goto L32
            r0 = 33
            if (r10 == r0) goto L32
            r0 = 66
            if (r10 == r0) goto L32
            r0 = 130(0x82, float:1.82E-43)
            if (r10 != r0) goto L2a
            goto L32
        L2a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r10.<init>(r11)
            throw r10
        L32:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            int r0 = r9.mKeyboardFocusedVirtualViewId
            if (r0 == r8) goto L3f
            r9.getBoundsInParent(r0, r4)
            goto L4a
        L3f:
            if (r11 == 0) goto L45
            r4.set(r11)
            goto L4a
        L45:
            android.view.View r11 = r9.mHost
            guessPreviouslyFocusedRect(r11, r10, r4)
        L4a:
            androidx.customview.widget.FocusStrategy$CollectionAdapter<androidx.collection.SparseArrayCompat<androidx.core.view.accessibility.AccessibilityNodeInfoCompat>, androidx.core.view.accessibility.AccessibilityNodeInfoCompat> r1 = androidx.customview.widget.ExploreByTouchHelper.SPARSE_VALUES_ADAPTER
            androidx.customview.widget.FocusStrategy$BoundsAdapter<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> r2 = androidx.customview.widget.ExploreByTouchHelper.NODE_ADAPTER
            r0 = r7
            r5 = r10
            java.lang.Object r10 = androidx.customview.widget.FocusStrategy.findNextFocusInAbsoluteDirection(r0, r1, r2, r3, r4, r5)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r10 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r10
            goto L70
        L57:
            android.view.View r11 = r9.mHost
            int r11 = androidx.core.view.ViewCompat.getLayoutDirection(r11)
            if (r11 != r0) goto L61
            r5 = r0
            goto L63
        L61:
            r11 = 0
            r5 = r11
        L63:
            androidx.customview.widget.FocusStrategy$CollectionAdapter<androidx.collection.SparseArrayCompat<androidx.core.view.accessibility.AccessibilityNodeInfoCompat>, androidx.core.view.accessibility.AccessibilityNodeInfoCompat> r1 = androidx.customview.widget.ExploreByTouchHelper.SPARSE_VALUES_ADAPTER
            androidx.customview.widget.FocusStrategy$BoundsAdapter<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> r2 = androidx.customview.widget.ExploreByTouchHelper.NODE_ADAPTER
            r6 = 0
            r0 = r7
            r4 = r10
            java.lang.Object r10 = androidx.customview.widget.FocusStrategy.findNextFocusInRelativeDirection(r0, r1, r2, r3, r4, r5, r6)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r10 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r10
        L70:
            if (r10 != 0) goto L73
            goto L7b
        L73:
            int r10 = r7.indexOfValue(r10)
            int r8 = r7.keyAt(r10)
        L7b:
            boolean r10 = r9.requestKeyboardFocusForVirtualView(r8)
            return r10
    }

    private boolean performActionForChild(int r2, int r3, android.os.Bundle r4) {
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L22
            r0 = 2
            if (r3 == r0) goto L1d
            r0 = 64
            if (r3 == r0) goto L18
            r0 = 128(0x80, float:1.794E-43)
            if (r3 == r0) goto L13
            boolean r2 = r1.onPerformActionForVirtualView(r2, r3, r4)
            return r2
        L13:
            boolean r2 = r1.clearAccessibilityFocus(r2)
            return r2
        L18:
            boolean r2 = r1.requestAccessibilityFocus(r2)
            return r2
        L1d:
            boolean r2 = r1.clearKeyboardFocusForVirtualView(r2)
            return r2
        L22:
            boolean r2 = r1.requestKeyboardFocusForVirtualView(r2)
            return r2
    }

    private boolean performActionForHost(int r2, android.os.Bundle r3) {
            r1 = this;
            android.view.View r0 = r1.mHost
            boolean r2 = androidx.core.view.ViewCompat.performAccessibilityAction(r0, r2, r3)
            return r2
    }

    private boolean requestAccessibilityFocus(int r3) {
            r2 = this;
            android.view.accessibility.AccessibilityManager r0 = r2.mManager
            boolean r0 = r0.isEnabled()
            r1 = 0
            if (r0 == 0) goto L2c
            android.view.accessibility.AccessibilityManager r0 = r2.mManager
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 != 0) goto L12
            goto L2c
        L12:
            int r0 = r2.mAccessibilityFocusedVirtualViewId
            if (r0 == r3) goto L2c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L1d
            r2.clearAccessibilityFocus(r0)
        L1d:
            r2.mAccessibilityFocusedVirtualViewId = r3
            android.view.View r0 = r2.mHost
            r0.invalidate()
            r0 = 32768(0x8000, float:4.5918E-41)
            r2.sendEventForVirtualView(r3, r0)
            r3 = 1
            return r3
        L2c:
            return r1
    }

    private void updateHoveredVirtualView(int r3) {
            r2 = this;
            int r0 = r2.mHoveredVirtualViewId
            if (r0 != r3) goto L5
            return
        L5:
            r2.mHoveredVirtualViewId = r3
            r1 = 128(0x80, float:1.794E-43)
            r2.sendEventForVirtualView(r3, r1)
            r3 = 256(0x100, float:3.59E-43)
            r2.sendEventForVirtualView(r0, r3)
            return
    }

    public final boolean clearKeyboardFocusForVirtualView(int r3) {
            r2 = this;
            int r0 = r2.mKeyboardFocusedVirtualViewId
            r1 = 0
            if (r0 == r3) goto L6
            return r1
        L6:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mKeyboardFocusedVirtualViewId = r0
            r2.onVirtualViewKeyboardFocusChanged(r3, r1)
            r0 = 8
            r2.sendEventForVirtualView(r3, r0)
            r3 = 1
            return r3
    }

    public final boolean dispatchHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            android.view.accessibility.AccessibilityManager r0 = r5.mManager
            boolean r0 = r0.isEnabled()
            r1 = 0
            if (r0 == 0) goto L40
            android.view.accessibility.AccessibilityManager r0 = r5.mManager
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 != 0) goto L12
            goto L40
        L12:
            int r0 = r6.getAction()
            r2 = 7
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L2e
            r2 = 9
            if (r0 == r2) goto L2e
            r6 = 10
            if (r0 == r6) goto L25
            return r1
        L25:
            int r6 = r5.mHoveredVirtualViewId
            if (r6 == r4) goto L2d
            r5.updateHoveredVirtualView(r4)
            return r3
        L2d:
            return r1
        L2e:
            float r0 = r6.getX()
            float r6 = r6.getY()
            int r6 = r5.getVirtualViewAt(r0, r6)
            r5.updateHoveredVirtualView(r6)
            if (r6 == r4) goto L40
            r1 = r3
        L40:
            return r1
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L5e
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L48
            r3 = 66
            if (r0 == r3) goto L37
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L37;
                default: goto L18;
            }
        L18:
            goto L5e
        L19:
            boolean r3 = r7.hasNoModifiers()
            if (r3 == 0) goto L5e
            int r0 = keyToDirection(r0)
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r3 = r1
        L29:
            if (r1 >= r7) goto L35
            boolean r5 = r6.moveFocus(r0, r4)
            if (r5 == 0) goto L35
            int r1 = r1 + 1
            r3 = r2
            goto L29
        L35:
            r1 = r3
            goto L5e
        L37:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L5e
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L5e
            r6.clickKeyboardFocusedVirtualView()
            r1 = r2
            goto L5e
        L48:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L54
            r7 = 2
            boolean r1 = r6.moveFocus(r7, r4)
            goto L5e
        L54:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L5e
            boolean r1 = r6.moveFocus(r2, r4)
        L5e:
            return r1
    }

    public final int getAccessibilityFocusedVirtualViewId() {
            r1 = this;
            int r0 = r1.mAccessibilityFocusedVirtualViewId
            return r0
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View r1) {
            r0 = this;
            androidx.customview.widget.ExploreByTouchHelper$MyNodeProvider r1 = r0.mNodeProvider
            if (r1 != 0) goto Lb
            androidx.customview.widget.ExploreByTouchHelper$MyNodeProvider r1 = new androidx.customview.widget.ExploreByTouchHelper$MyNodeProvider
            r1.<init>(r0)
            r0.mNodeProvider = r1
        Lb:
            androidx.customview.widget.ExploreByTouchHelper$MyNodeProvider r1 = r0.mNodeProvider
            return r1
    }

    @java.lang.Deprecated
    public int getFocusedVirtualView() {
            r1 = this;
            int r0 = r1.getAccessibilityFocusedVirtualViewId()
            return r0
    }

    public final int getKeyboardFocusedVirtualViewId() {
            r1 = this;
            int r0 = r1.mKeyboardFocusedVirtualViewId
            return r0
    }

    protected abstract int getVirtualViewAt(float r1, float r2);

    protected abstract void getVisibleVirtualViews(java.util.List<java.lang.Integer> r1);

    public final void invalidateRoot() {
            r2 = this;
            r0 = -1
            r1 = 1
            r2.invalidateVirtualView(r0, r1)
            return
    }

    public final void invalidateVirtualView(int r2) {
            r1 = this;
            r0 = 0
            r1.invalidateVirtualView(r2, r0)
            return
    }

    public final void invalidateVirtualView(int r3, int r4) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r0) goto L22
            android.view.accessibility.AccessibilityManager r0 = r2.mManager
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L22
            android.view.View r0 = r2.mHost
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L22
            r1 = 2048(0x800, float:2.87E-42)
            android.view.accessibility.AccessibilityEvent r3 = r2.createEvent(r3, r1)
            androidx.core.view.accessibility.AccessibilityEventCompat.setContentChangeTypes(r3, r4)
            android.view.View r4 = r2.mHost
            androidx.core.view.ViewParentCompat.requestSendAccessibilityEvent(r0, r4, r3)
        L22:
            return
    }

    androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int r2) {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L8
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = r1.createNodeForHost()
            return r2
        L8:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = r1.createNodeForChild(r2)
            return r2
    }

    public final void onFocusChanged(boolean r3, int r4, android.graphics.Rect r5) {
            r2 = this;
            int r0 = r2.mKeyboardFocusedVirtualViewId
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L9
            r2.clearKeyboardFocusForVirtualView(r0)
        L9:
            if (r3 == 0) goto Le
            r2.moveFocus(r4, r5)
        Le:
            return
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            super.onInitializeAccessibilityEvent(r1, r2)
            r0.onPopulateEventForHost(r2)
            return
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(android.view.View r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1, r2)
            r0.onPopulateNodeForHost(r2)
            return
    }

    protected abstract boolean onPerformActionForVirtualView(int r1, int r2, android.os.Bundle r3);

    protected void onPopulateEventForHost(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            return
    }

    protected void onPopulateEventForVirtualView(int r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            return
    }

    protected void onPopulateNodeForHost(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1) {
            r0 = this;
            return
    }

    protected abstract void onPopulateNodeForVirtualView(int r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2);

    protected void onVirtualViewKeyboardFocusChanged(int r1, boolean r2) {
            r0 = this;
            return
    }

    boolean performAction(int r2, int r3, android.os.Bundle r4) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L8
            boolean r2 = r1.performActionForChild(r2, r3, r4)
            return r2
        L8:
            boolean r2 = r1.performActionForHost(r3, r4)
            return r2
    }

    public final boolean requestKeyboardFocusForVirtualView(int r3) {
            r2 = this;
            android.view.View r0 = r2.mHost
            boolean r0 = r0.isFocused()
            r1 = 0
            if (r0 != 0) goto L12
            android.view.View r0 = r2.mHost
            boolean r0 = r0.requestFocus()
            if (r0 != 0) goto L12
            return r1
        L12:
            int r0 = r2.mKeyboardFocusedVirtualViewId
            if (r0 != r3) goto L17
            return r1
        L17:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L1e
            r2.clearKeyboardFocusForVirtualView(r0)
        L1e:
            r2.mKeyboardFocusedVirtualViewId = r3
            r0 = 1
            r2.onVirtualViewKeyboardFocusChanged(r3, r0)
            r1 = 8
            r2.sendEventForVirtualView(r3, r1)
            return r0
    }

    public final boolean sendEventForVirtualView(int r3, int r4) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            if (r3 == r0) goto L22
            android.view.accessibility.AccessibilityManager r0 = r2.mManager
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto Le
            goto L22
        Le:
            android.view.View r0 = r2.mHost
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L17
            return r1
        L17:
            android.view.accessibility.AccessibilityEvent r3 = r2.createEvent(r3, r4)
            android.view.View r4 = r2.mHost
            boolean r3 = androidx.core.view.ViewParentCompat.requestSendAccessibilityEvent(r0, r4, r3)
            return r3
        L22:
            return r1
    }
}
