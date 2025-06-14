package androidx.core.view;

/* loaded from: classes.dex */
public class ViewCompat {
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = null;
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @java.lang.Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @java.lang.Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    private static final androidx.core.view.OnReceiveContentViewBehavior NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = null;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    private static final java.lang.String TAG = "ViewCompat";
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    private static boolean sAccessibilityDelegateCheckFailed;
    private static java.lang.reflect.Field sAccessibilityDelegateField;
    private static androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager;
    private static java.lang.reflect.Method sChildrenDrawingOrderMethod;
    private static java.lang.reflect.Method sDispatchFinishTemporaryDetach;
    private static java.lang.reflect.Method sDispatchStartTemporaryDetach;
    private static java.lang.reflect.Field sMinHeightField;
    private static boolean sMinHeightFieldFetched;
    private static java.lang.reflect.Field sMinWidthField;
    private static boolean sMinWidthFieldFetched;
    private static final java.util.concurrent.atomic.AtomicInteger sNextGeneratedId = null;
    private static boolean sTempDetachBound;
    private static java.lang.ThreadLocal<android.graphics.Rect> sThreadLocalRect;
    private static java.util.WeakHashMap<android.view.View, java.lang.String> sTransitionNameMap;
    private static java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> sViewPropertyAnimatorMap;






    static class AccessibilityPaneVisibilityManager implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {
        private java.util.WeakHashMap<android.view.View, java.lang.Boolean> mPanesToVisible;

        AccessibilityPaneVisibilityManager() {
                r1 = this;
                r1.<init>()
                java.util.WeakHashMap r0 = new java.util.WeakHashMap
                r0.<init>()
                r1.mPanesToVisible = r0
                return
        }

        private void checkPaneVisibility(android.view.View r2, boolean r3) {
                r1 = this;
                int r0 = r2.getVisibility()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                if (r3 == r0) goto L1e
                if (r0 == 0) goto L10
                r3 = 16
                goto L12
            L10:
                r3 = 32
            L12:
                androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(r2, r3)
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r3 = r1.mPanesToVisible
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r3.put(r2, r0)
            L1e:
                return
        }

        private void registerForLayoutCallback(android.view.View r1) {
                r0 = this;
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.addOnGlobalLayoutListener(r0)
                return
        }

        private void unregisterForLayoutCallback(android.view.View r1) {
                r0 = this;
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnGlobalLayoutListener(r0)
                return
        }

        void addAccessibilityPane(android.view.View r3) {
                r2 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r2.mPanesToVisible
                int r1 = r3.getVisibility()
                if (r1 != 0) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.put(r3, r1)
                r3.addOnAttachStateChangeListener(r2)
                boolean r0 = r3.isAttachedToWindow()
                if (r0 == 0) goto L1e
                r2.registerForLayoutCallback(r3)
            L1e:
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r3 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L30
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r3.mPanesToVisible
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L10:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L30
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                android.view.View r2 = (android.view.View) r2
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r3.checkPaneVisibility(r2, r1)
                goto L10
            L30:
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                r0.registerForLayoutCallback(r1)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }

        void removeAccessibilityPane(android.view.View r2) {
                r1 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r1.mPanesToVisible
                r0.remove(r2)
                r2.removeOnAttachStateChangeListener(r1)
                r1.unregisterForLayoutCallback(r2)
                return
        }
    }

    static abstract class AccessibilityViewProperty<T> {
        private final int mContentChangeType;
        private final int mFrameworkMinimumSdk;
        private final int mTagKey;
        private final java.lang.Class<T> mType;

        AccessibilityViewProperty(int r2, java.lang.Class<T> r3, int r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0, r4)
                return
        }

        AccessibilityViewProperty(int r1, java.lang.Class<T> r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.mTagKey = r1
                r0.mType = r2
                r0.mContentChangeType = r3
                r0.mFrameworkMinimumSdk = r4
                return
        }

        private boolean extrasAvailable() {
                r1 = this;
                r0 = 1
                return r0
        }

        private boolean frameworkAvailable() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                int r1 = r2.mFrameworkMinimumSdk
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        boolean booleanNullToFalseEquals(java.lang.Boolean r2, java.lang.Boolean r3) {
                r1 = this;
                r0 = 0
                if (r2 != 0) goto L5
                r2 = r0
                goto L9
            L5:
                boolean r2 = r2.booleanValue()
            L9:
                if (r3 != 0) goto Ld
                r3 = r0
                goto L11
            Ld:
                boolean r3 = r3.booleanValue()
            L11:
                if (r2 != r3) goto L14
                r0 = 1
            L14:
                return r0
        }

        abstract T frameworkGet(android.view.View r1);

        abstract void frameworkSet(android.view.View r1, T r2);

        T get(android.view.View r2) {
                r1 = this;
                boolean r0 = r1.frameworkAvailable()
                if (r0 == 0) goto Lb
                java.lang.Object r2 = r1.frameworkGet(r2)
                return r2
            Lb:
                boolean r0 = r1.extrasAvailable()
                if (r0 == 0) goto L20
                int r0 = r1.mTagKey
                java.lang.Object r2 = r2.getTag(r0)
                java.lang.Class<T> r0 = r1.mType
                boolean r0 = r0.isInstance(r2)
                if (r0 == 0) goto L20
                return r2
            L20:
                r2 = 0
                return r2
        }

        void set(android.view.View r2, T r3) {
                r1 = this;
                boolean r0 = r1.frameworkAvailable()
                if (r0 == 0) goto La
                r1.frameworkSet(r2, r3)
                goto L27
            La:
                boolean r0 = r1.extrasAvailable()
                if (r0 == 0) goto L27
                java.lang.Object r0 = r1.get(r2)
                boolean r0 = r1.shouldUpdate(r0, r3)
                if (r0 == 0) goto L27
                androidx.core.view.ViewCompat.getOrCreateAccessibilityDelegateCompat(r2)
                int r0 = r1.mTagKey
                r2.setTag(r0, r3)
                int r3 = r1.mContentChangeType
                androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(r2, r3)
            L27:
                return
        }

        boolean shouldUpdate(T r1, T r2) {
                r0 = this;
                boolean r1 = r2.equals(r1)
                r1 = r1 ^ 1
                return r1
        }
    }

    private static class Api21Impl {


        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void callCompatInsetAnimationCallback(android.view.WindowInsets r1, android.view.View r2) {
                int r0 = androidx.core.C0160R.id.tag_window_insets_animation_callback
                java.lang.Object r0 = r2.getTag(r0)
                android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
                if (r0 == 0) goto Ld
                r0.onApplyWindowInsets(r2, r1)
            Ld:
                return
        }

        static androidx.core.view.WindowInsetsCompat computeSystemWindowInsets(android.view.View r1, androidx.core.view.WindowInsetsCompat r2, android.graphics.Rect r3) {
                android.view.WindowInsets r0 = r2.toWindowInsets()
                if (r0 == 0) goto Lf
                android.view.WindowInsets r2 = r1.computeSystemWindowInsets(r0, r3)
                androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r2, r1)
                return r1
            Lf:
                r3.setEmpty()
                return r2
        }

        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View r0) {
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(r0)
                return r0
        }

        static void setOnApplyWindowInsetsListener(android.view.View r2, androidx.core.view.OnApplyWindowInsetsListener r3) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 >= r1) goto Lb
                int r0 = androidx.core.C0160R.id.tag_on_apply_window_listener
                r2.setTag(r0, r3)
            Lb:
                if (r3 != 0) goto L19
                int r3 = androidx.core.C0160R.id.tag_window_insets_animation_callback
                java.lang.Object r3 = r2.getTag(r3)
                android.view.View$OnApplyWindowInsetsListener r3 = (android.view.View.OnApplyWindowInsetsListener) r3
                r2.setOnApplyWindowInsetsListener(r3)
                return
            L19:
                androidx.core.view.ViewCompat$Api21Impl$1 r0 = new androidx.core.view.ViewCompat$Api21Impl$1
                r0.<init>(r2, r3)
                r2.setOnApplyWindowInsetsListener(r0)
                return
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View r1) {
                android.view.WindowInsets r0 = r1.getRootWindowInsets()
                if (r0 != 0) goto L8
                r1 = 0
                return r1
            L8:
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                r0.setRootWindowInsets(r0)
                android.view.View r1 = r1.getRootView()
                r0.copyRootViewBounds(r1)
                return r0
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void saveAttributeDataForStyleable(android.view.View r0, android.content.Context r1, int[] r2, android.util.AttributeSet r3, android.content.res.TypedArray r4, int r5, int r6) {
                r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.core.view.WindowInsetsControllerCompat getWindowInsetsController(android.view.View r0) {
                android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
                if (r0 == 0) goto Lb
                androidx.core.view.WindowInsetsControllerCompat r0 = androidx.core.view.WindowInsetsControllerCompat.toWindowInsetsControllerCompat(r0)
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }
    }

    static class CompatImplApi28 {


        private CompatImplApi28() {
                r0 = this;
                r0.<init>()
                return
        }

        static void addOnUnhandledKeyEventListener(android.view.View r2, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
                int r0 = androidx.core.C0160R.id.tag_unhandled_key_listeners
                java.lang.Object r0 = r2.getTag(r0)
                androidx.collection.SimpleArrayMap r0 = (androidx.collection.SimpleArrayMap) r0
                if (r0 != 0) goto L14
                androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
                r0.<init>()
                int r1 = androidx.core.C0160R.id.tag_unhandled_key_listeners
                r2.setTag(r1, r0)
            L14:
                androidx.core.view.ViewCompat$CompatImplApi28$1 r1 = new androidx.core.view.ViewCompat$CompatImplApi28$1
                r1.<init>(r3)
                r0.put(r3, r1)
                r2.addOnUnhandledKeyEventListener(r1)
                return
        }

        static void removeOnUnhandledKeyEventListener(android.view.View r1, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r2) {
                int r0 = androidx.core.C0160R.id.tag_unhandled_key_listeners
                java.lang.Object r0 = r1.getTag(r0)
                androidx.collection.SimpleArrayMap r0 = (androidx.collection.SimpleArrayMap) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                java.lang.Object r2 = r0.get(r2)
                android.view.View$OnUnhandledKeyEventListener r2 = (android.view.View.OnUnhandledKeyEventListener) r2
                if (r2 == 0) goto L16
                r1.removeOnUnhandledKeyEventListener(r2)
            L16:
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(android.view.View r1, android.view.KeyEvent r2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    static class UnhandledKeyEventManager {
        private static final java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> sViewsWithListeners = null;
        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> mCapturedKeys;
        private java.lang.ref.WeakReference<android.view.KeyEvent> mLastDispatchedPreViewKeyEvent;
        private java.util.WeakHashMap<android.view.View, java.lang.Boolean> mViewsContainingListeners;

        static {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners = r0
                return
        }

        UnhandledKeyEventManager() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mViewsContainingListeners = r0
                r1.mCapturedKeys = r0
                r1.mLastDispatchedPreViewKeyEvent = r0
                return
        }

        /* renamed from: at */
        static androidx.core.view.ViewCompat.UnhandledKeyEventManager m9at(android.view.View r2) {
                int r0 = androidx.core.C0160R.id.tag_unhandled_key_event_manager
                java.lang.Object r0 = r2.getTag(r0)
                androidx.core.view.ViewCompat$UnhandledKeyEventManager r0 = (androidx.core.view.ViewCompat.UnhandledKeyEventManager) r0
                if (r0 != 0) goto L14
                androidx.core.view.ViewCompat$UnhandledKeyEventManager r0 = new androidx.core.view.ViewCompat$UnhandledKeyEventManager
                r0.<init>()
                int r1 = androidx.core.C0160R.id.tag_unhandled_key_event_manager
                r2.setTag(r1, r0)
            L14:
                return r0
        }

        private android.view.View dispatchInOrder(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r4.mViewsContainingListeners
                r1 = 0
                if (r0 == 0) goto L30
                boolean r0 = r0.containsKey(r5)
                if (r0 != 0) goto Lc
                goto L30
            Lc:
                boolean r0 = r5 instanceof android.view.ViewGroup
                if (r0 == 0) goto L29
                r0 = r5
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                int r2 = r0.getChildCount()
                int r2 = r2 + (-1)
            L19:
                if (r2 < 0) goto L29
                android.view.View r3 = r0.getChildAt(r2)
                android.view.View r3 = r4.dispatchInOrder(r3, r6)
                if (r3 == 0) goto L26
                return r3
            L26:
                int r2 = r2 + (-1)
                goto L19
            L29:
                boolean r6 = r4.onUnhandledKeyEvent(r5, r6)
                if (r6 == 0) goto L30
                return r5
            L30:
                return r1
        }

        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> getCapturedKeys() {
                r1 = this;
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.mCapturedKeys
                if (r0 != 0) goto Lb
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mCapturedKeys = r0
            Lb:
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.mCapturedKeys
                return r0
        }

        private boolean onUnhandledKeyEvent(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                int r0 = androidx.core.C0160R.id.tag_unhandled_key_listeners
                java.lang.Object r0 = r5.getTag(r0)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                if (r0 == 0) goto L22
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
            L10:
                if (r1 < 0) goto L22
                java.lang.Object r3 = r0.get(r1)
                androidx.core.view.ViewCompat$OnUnhandledKeyEventListenerCompat r3 = (androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat) r3
                boolean r3 = r3.onUnhandledKeyEvent(r5, r6)
                if (r3 == 0) goto L1f
                return r2
            L1f:
                int r1 = r1 + (-1)
                goto L10
            L22:
                r5 = 0
                return r5
        }

        private void recalcViewsWithUnhandled() {
                r6 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r6.mViewsContainingListeners
                if (r0 == 0) goto L7
                r0.clear()
            L7:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L10
                return
            L10:
                monitor-enter(r0)
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r1 = r6.mViewsContainingListeners     // Catch: java.lang.Throwable -> L5b
                if (r1 != 0) goto L1c
                java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L5b
                r1.<init>()     // Catch: java.lang.Throwable -> L5b
                r6.mViewsContainingListeners = r1     // Catch: java.lang.Throwable -> L5b
            L1c:
                int r1 = r0.size()     // Catch: java.lang.Throwable -> L5b
                int r1 = r1 + (-1)
            L22:
                if (r1 < 0) goto L59
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Throwable -> L5b
                java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L5b
                android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L5b
                if (r3 != 0) goto L38
                r2.remove(r1)     // Catch: java.lang.Throwable -> L5b
                goto L56
            L38:
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r2 = r6.mViewsContainingListeners     // Catch: java.lang.Throwable -> L5b
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5b
                r2.put(r3, r4)     // Catch: java.lang.Throwable -> L5b
                android.view.ViewParent r2 = r3.getParent()     // Catch: java.lang.Throwable -> L5b
            L43:
                boolean r3 = r2 instanceof android.view.View     // Catch: java.lang.Throwable -> L5b
                if (r3 == 0) goto L56
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r3 = r6.mViewsContainingListeners     // Catch: java.lang.Throwable -> L5b
                r4 = r2
                android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L5b
                java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5b
                r3.put(r4, r5)     // Catch: java.lang.Throwable -> L5b
                android.view.ViewParent r2 = r2.getParent()     // Catch: java.lang.Throwable -> L5b
                goto L43
            L56:
                int r1 = r1 + (-1)
                goto L22
            L59:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
                return
            L5b:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
                throw r1
        }

        static void registerListeningView(android.view.View r3) {
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                monitor-enter(r0)
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L27
            L7:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L27
                if (r2 == 0) goto L1b
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L27
                java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L27
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L27
                if (r2 != r3) goto L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                return
            L1b:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r1 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L27
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L27
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L27
                r1.add(r2)     // Catch: java.lang.Throwable -> L27
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                return
            L27:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                throw r3
        }

        static void unregisterListeningView(android.view.View r4) {
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                monitor-enter(r0)
                r1 = 0
            L4:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L22
                int r3 = r2.size()     // Catch: java.lang.Throwable -> L22
                if (r1 >= r3) goto L20
                java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Throwable -> L22
                java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L22
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L22
                if (r3 != r4) goto L1d
                r2.remove(r1)     // Catch: java.lang.Throwable -> L22
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                return
            L1d:
                int r1 = r1 + 1
                goto L4
            L20:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                return
            L22:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                throw r4
        }

        boolean dispatch(android.view.View r3, android.view.KeyEvent r4) {
                r2 = this;
                int r0 = r4.getAction()
                if (r0 != 0) goto L9
                r2.recalcViewsWithUnhandled()
            L9:
                android.view.View r3 = r2.dispatchInOrder(r3, r4)
                int r0 = r4.getAction()
                if (r0 != 0) goto L2b
                int r4 = r4.getKeyCode()
                if (r3 == 0) goto L2b
                boolean r0 = android.view.KeyEvent.isModifierKey(r4)
                if (r0 != 0) goto L2b
                android.util.SparseArray r0 = r2.getCapturedKeys()
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r3)
                r0.put(r4, r1)
            L2b:
                if (r3 == 0) goto L2f
                r3 = 1
                goto L30
            L2f:
                r3 = 0
            L30:
                return r3
        }

        boolean preDispatch(android.view.KeyEvent r6) {
                r5 = this;
                java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r5.mLastDispatchedPreViewKeyEvent
                r1 = 0
                if (r0 == 0) goto Lc
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto Lc
                return r1
            Lc:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.mLastDispatchedPreViewKeyEvent = r0
                android.util.SparseArray r0 = r5.getCapturedKeys()
                int r2 = r6.getAction()
                r3 = 1
                if (r2 != r3) goto L32
                int r2 = r6.getKeyCode()
                int r2 = r0.indexOfKey(r2)
                if (r2 < 0) goto L32
                java.lang.Object r4 = r0.valueAt(r2)
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
                r0.removeAt(r2)
                goto L33
            L32:
                r4 = 0
            L33:
                if (r4 != 0) goto L40
                int r2 = r6.getKeyCode()
                java.lang.Object r0 = r0.get(r2)
                r4 = r0
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            L40:
                if (r4 == 0) goto L54
                java.lang.Object r0 = r4.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L53
                boolean r1 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
                if (r1 == 0) goto L53
                r5.onUnhandledKeyEvent(r0, r6)
            L53:
                return r3
            L54:
                return r1
        }
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            androidx.core.view.ViewCompat.sNextGeneratedId = r0
            r0 = 0
            androidx.core.view.ViewCompat.sViewPropertyAnimatorMap = r0
            r0 = 0
            androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed = r0
            r2 = 32
            int[] r2 = new int[r2]
            int r3 = androidx.core.C0160R.id.accessibility_custom_action_0
            r2[r0] = r3
            int r0 = androidx.core.C0160R.id.accessibility_custom_action_1
            r2[r1] = r0
            r0 = 2
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_2
            r2[r0] = r1
            r0 = 3
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_3
            r2[r0] = r1
            r0 = 4
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_4
            r2[r0] = r1
            r0 = 5
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_5
            r2[r0] = r1
            r0 = 6
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_6
            r2[r0] = r1
            r0 = 7
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_7
            r2[r0] = r1
            r0 = 8
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_8
            r2[r0] = r1
            r0 = 9
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_9
            r2[r0] = r1
            r0 = 10
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_10
            r2[r0] = r1
            r0 = 11
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_11
            r2[r0] = r1
            r0 = 12
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_12
            r2[r0] = r1
            r0 = 13
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_13
            r2[r0] = r1
            r0 = 14
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_14
            r2[r0] = r1
            r0 = 15
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_15
            r2[r0] = r1
            r0 = 16
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_16
            r2[r0] = r1
            r0 = 17
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_17
            r2[r0] = r1
            r0 = 18
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_18
            r2[r0] = r1
            r0 = 19
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_19
            r2[r0] = r1
            r0 = 20
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_20
            r2[r0] = r1
            r0 = 21
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_21
            r2[r0] = r1
            r0 = 22
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_22
            r2[r0] = r1
            r0 = 23
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_23
            r2[r0] = r1
            r0 = 24
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_24
            r2[r0] = r1
            r0 = 25
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_25
            r2[r0] = r1
            r0 = 26
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_26
            r2[r0] = r1
            r0 = 27
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_27
            r2[r0] = r1
            r0 = 28
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_28
            r2[r0] = r1
            r0 = 29
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_29
            r2[r0] = r1
            r0 = 30
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_30
            r2[r0] = r1
            r0 = 31
            int r1 = androidx.core.C0160R.id.accessibility_custom_action_31
            r2[r0] = r1
            androidx.core.view.ViewCompat.ACCESSIBILITY_ACTIONS_RESOURCE_IDS = r2
            androidx.core.view.ViewCompat$1 r0 = new androidx.core.view.ViewCompat$1
            r0.<init>()
            androidx.core.view.ViewCompat.NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = r0
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r0 = new androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager
            r0.<init>()
            androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager = r0
            return
    }

    @java.lang.Deprecated
    protected ViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> accessibilityHeadingProperty() {
            androidx.core.view.ViewCompat$5 r0 = new androidx.core.view.ViewCompat$5
            int r1 = androidx.core.C0160R.id.tag_accessibility_heading
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r3 = 28
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static int addAccessibilityAction(android.view.View r2, java.lang.CharSequence r3, androidx.core.view.accessibility.AccessibilityViewCommand r4) {
            int r0 = getAvailableActionIdFromResources(r2)
            r1 = -1
            if (r0 == r1) goto Lf
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
            r1.<init>(r0, r3, r4)
            addAccessibilityAction(r2, r1)
        Lf:
            return r0
    }

    private static void addAccessibilityAction(android.view.View r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r2) {
            getOrCreateAccessibilityDelegateCompat(r1)
            int r0 = r2.getId()
            removeActionWithId(r0, r1)
            java.util.List r0 = getActionList(r1)
            r0.add(r2)
            r2 = 0
            notifyViewAccessibilityStateChangedIfNeeded(r1, r2)
            return
    }

    public static void addKeyboardNavigationClusters(android.view.View r2, java.util.Collection<android.view.View> r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            r2.addKeyboardNavigationClusters(r3, r4)
        L9:
            return
    }

    public static void addOnUnhandledKeyEventListener(android.view.View r2, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.CompatImplApi28.addOnUnhandledKeyEventListener(r2, r3)
            return
        La:
            int r0 = androidx.core.C0160R.id.tag_unhandled_key_listeners
            java.lang.Object r0 = r2.getTag(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L1e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = androidx.core.C0160R.id.tag_unhandled_key_listeners
            r2.setTag(r1, r0)
        L1e:
            r0.add(r3)
            int r3 = r0.size()
            r0 = 1
            if (r3 != r0) goto L2b
            androidx.core.view.ViewCompat.UnhandledKeyEventManager.registerListeningView(r2)
        L2b:
            return
    }

    public static androidx.core.view.ViewPropertyAnimatorCompat animate(android.view.View r2) {
            java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> r0 = androidx.core.view.ViewCompat.sViewPropertyAnimatorMap
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.core.view.ViewCompat.sViewPropertyAnimatorMap = r0
        Lb:
            java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> r0 = androidx.core.view.ViewCompat.sViewPropertyAnimatorMap
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.ViewPropertyAnimatorCompat r0 = (androidx.core.view.ViewPropertyAnimatorCompat) r0
            if (r0 != 0) goto L1f
            androidx.core.view.ViewPropertyAnimatorCompat r0 = new androidx.core.view.ViewPropertyAnimatorCompat
            r0.<init>(r2)
            java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> r1 = androidx.core.view.ViewCompat.sViewPropertyAnimatorMap
            r1.put(r2, r0)
        L1f:
            return r0
    }

    private static void bindTempDetach() {
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "dispatchStartTemporaryDetach"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L1a
            androidx.core.view.ViewCompat.sDispatchStartTemporaryDetach = r0     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "dispatchFinishTemporaryDetach"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1a
            androidx.core.view.ViewCompat.sDispatchFinishTemporaryDetach = r0     // Catch: java.lang.NoSuchMethodException -> L1a
            goto L22
        L1a:
            r0 = move-exception
            java.lang.String r1 = "ViewCompat"
            java.lang.String r2 = "Couldn't find method"
            android.util.Log.e(r1, r2, r0)
        L22:
            r0 = 1
            androidx.core.view.ViewCompat.sTempDetachBound = r0
            return
    }

    @java.lang.Deprecated
    public static boolean canScrollHorizontally(android.view.View r0, int r1) {
            boolean r0 = r0.canScrollHorizontally(r1)
            return r0
    }

    @java.lang.Deprecated
    public static boolean canScrollVertically(android.view.View r0, int r1) {
            boolean r0 = r0.canScrollVertically(r1)
            return r0
    }

    public static void cancelDragAndDrop(android.view.View r0) {
            r0.cancelDragAndDrop()
            return
    }

    @java.lang.Deprecated
    public static int combineMeasuredStates(int r0, int r1) {
            int r0 = android.view.View.combineMeasuredStates(r0, r1)
            return r0
    }

    private static void compatOffsetLeftAndRight(android.view.View r0, int r1) {
            r0.offsetLeftAndRight(r1)
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L19
            tickleInvalidationFlag(r0)
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L19
            android.view.View r0 = (android.view.View) r0
            tickleInvalidationFlag(r0)
        L19:
            return
    }

    private static void compatOffsetTopAndBottom(android.view.View r0, int r1) {
            r0.offsetTopAndBottom(r1)
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L19
            tickleInvalidationFlag(r0)
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L19
            android.view.View r0 = (android.view.View) r0
            tickleInvalidationFlag(r0)
        L19:
            return
    }

    public static androidx.core.view.WindowInsetsCompat computeSystemWindowInsets(android.view.View r0, androidx.core.view.WindowInsetsCompat r1, android.graphics.Rect r2) {
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.Api21Impl.computeSystemWindowInsets(r0, r1, r2)
            return r0
    }

    public static androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsets(android.view.View r2, androidx.core.view.WindowInsetsCompat r3) {
            android.view.WindowInsets r0 = r3.toWindowInsets()
            if (r0 == 0) goto L15
            android.view.WindowInsets r1 = r2.dispatchApplyWindowInsets(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1, r2)
            return r2
        L15:
            return r3
    }

    public static void dispatchFinishTemporaryDetach(android.view.View r0) {
            r0.dispatchFinishTemporaryDetach()
            return
    }

    public static boolean dispatchNestedFling(android.view.View r0, float r1, float r2, boolean r3) {
            boolean r0 = r0.dispatchNestedFling(r1, r2, r3)
            return r0
    }

    public static boolean dispatchNestedPreFling(android.view.View r0, float r1, float r2) {
            boolean r0 = r0.dispatchNestedPreFling(r1, r2)
            return r0
    }

    public static boolean dispatchNestedPreScroll(android.view.View r0, int r1, int r2, int[] r3, int[] r4) {
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4)
            return r0
    }

    public static boolean dispatchNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10, int[] r11, int r12) {
            boolean r0 = r7 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto L11
            r1 = r7
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            boolean r7 = r1.dispatchNestedPreScroll(r2, r3, r4, r5, r6)
            return r7
        L11:
            if (r12 != 0) goto L18
            boolean r7 = dispatchNestedPreScroll(r7, r8, r9, r10, r11)
            return r7
        L18:
            r7 = 0
            return r7
    }

    public static void dispatchNestedScroll(android.view.View r10, int r11, int r12, int r13, int r14, int[] r15, int r16, int[] r17) {
            r0 = r10
            boolean r1 = r0 instanceof androidx.core.view.NestedScrollingChild3
            if (r1 == 0) goto L15
            r2 = r0
            androidx.core.view.NestedScrollingChild3 r2 = (androidx.core.view.NestedScrollingChild3) r2
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r2.dispatchNestedScroll(r3, r4, r5, r6, r7, r8, r9)
            goto L18
        L15:
            dispatchNestedScroll(r10, r11, r12, r13, r14, r15, r16)
        L18:
            return
    }

    public static boolean dispatchNestedScroll(android.view.View r0, int r1, int r2, int r3, int r4, int[] r5) {
            boolean r0 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            return r0
    }

    public static boolean dispatchNestedScroll(android.view.View r8, int r9, int r10, int r11, int r12, int[] r13, int r14) {
            boolean r0 = r8 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto L12
            r1 = r8
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            boolean r8 = r1.dispatchNestedScroll(r2, r3, r4, r5, r6, r7)
            return r8
        L12:
            if (r14 != 0) goto L19
            boolean r8 = dispatchNestedScroll(r8, r9, r10, r11, r12, r13)
            return r8
        L19:
            r8 = 0
            return r8
    }

    public static void dispatchStartTemporaryDetach(android.view.View r0) {
            r0.dispatchStartTemporaryDetach()
            return
    }

    static boolean dispatchUnhandledKeyEventBeforeCallback(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r2 = 0
            return r2
        L8:
            androidx.core.view.ViewCompat$UnhandledKeyEventManager r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.m9at(r2)
            boolean r2 = r0.dispatch(r2, r3)
            return r2
    }

    static boolean dispatchUnhandledKeyEventBeforeHierarchy(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r2 = 0
            return r2
        L8:
            androidx.core.view.ViewCompat$UnhandledKeyEventManager r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.m9at(r2)
            boolean r2 = r2.preDispatch(r3)
            return r2
    }

    public static void enableAccessibleClickableSpanSupport(android.view.View r0) {
            getOrCreateAccessibilityDelegateCompat(r0)
            return
    }

    public static int generateViewId() {
            int r0 = android.view.View.generateViewId()
            return r0
    }

    public static androidx.core.view.AccessibilityDelegateCompat getAccessibilityDelegate(android.view.View r1) {
            android.view.View$AccessibilityDelegate r1 = getAccessibilityDelegateInternal(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r0 = r1 instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter
            if (r0 == 0) goto L11
            androidx.core.view.AccessibilityDelegateCompat$AccessibilityDelegateAdapter r1 = (androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter) r1
            androidx.core.view.AccessibilityDelegateCompat r1 = r1.mCompat
            return r1
        L11:
            androidx.core.view.AccessibilityDelegateCompat r0 = new androidx.core.view.AccessibilityDelegateCompat
            r0.<init>(r1)
            return r0
    }

    private static android.view.View.AccessibilityDelegate getAccessibilityDelegateInternal(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            android.view.View$AccessibilityDelegate r2 = r2.getAccessibilityDelegate()
            return r2
        Lb:
            android.view.View$AccessibilityDelegate r2 = getAccessibilityDelegateThroughReflection(r2)
            return r2
    }

    private static android.view.View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(android.view.View r4) {
            boolean r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.reflect.Field r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateField
            r2 = 1
            if (r0 != 0) goto L1c
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r3 = "mAccessibilityDelegate"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L19
            androidx.core.view.ViewCompat.sAccessibilityDelegateField = r0     // Catch: java.lang.Throwable -> L19
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed = r2
            return r1
        L1c:
            java.lang.reflect.Field r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateField     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r4 instanceof android.view.View.AccessibilityDelegate     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L29
            android.view.View$AccessibilityDelegate r4 = (android.view.View.AccessibilityDelegate) r4     // Catch: java.lang.Throwable -> L2a
            return r4
        L29:
            return r1
        L2a:
            androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed = r2
            return r1
    }

    public static int getAccessibilityLiveRegion(android.view.View r0) {
            int r0 = r0.getAccessibilityLiveRegion()
            return r0
    }

    public static androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View r1) {
            android.view.accessibility.AccessibilityNodeProvider r1 = r1.getAccessibilityNodeProvider()
            if (r1 == 0) goto Lc
            androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeProviderCompat
            r0.<init>(r1)
            return r0
        Lc:
            r1 = 0
            return r1
    }

    public static java.lang.CharSequence getAccessibilityPaneTitle(android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = paneTitleProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            return r1
    }

    private static java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(android.view.View r2) {
            int r0 = androidx.core.C0160R.id.tag_accessibility_actions
            java.lang.Object r0 = r2.getTag(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = androidx.core.C0160R.id.tag_accessibility_actions
            r2.setTag(r1, r0)
        L14:
            return r0
    }

    @java.lang.Deprecated
    public static float getAlpha(android.view.View r0) {
            float r0 = r0.getAlpha()
            return r0
    }

    private static int getAvailableActionIdFromResources(android.view.View r9) {
            java.util.List r9 = getActionList(r9)
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L8:
            int[] r4 = androidx.core.view.ViewCompat.ACCESSIBILITY_ACTIONS_RESOURCE_IDS
            int r5 = r4.length
            if (r2 >= r5) goto L33
            if (r3 != r0) goto L33
            r4 = r4[r2]
            r5 = 1
            r6 = r1
            r7 = r5
        L14:
            int r8 = r9.size()
            if (r6 >= r8) goto L2d
            java.lang.Object r8 = r9.get(r6)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r8 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r8
            int r8 = r8.getId()
            if (r8 == r4) goto L28
            r8 = r5
            goto L29
        L28:
            r8 = r1
        L29:
            r7 = r7 & r8
            int r6 = r6 + 1
            goto L14
        L2d:
            if (r7 == 0) goto L30
            r3 = r4
        L30:
            int r2 = r2 + 1
            goto L8
        L33:
            return r3
    }

    public static android.content.res.ColorStateList getBackgroundTintList(android.view.View r0) {
            android.content.res.ColorStateList r0 = r0.getBackgroundTintList()
            return r0
    }

    public static android.graphics.PorterDuff.Mode getBackgroundTintMode(android.view.View r0) {
            android.graphics.PorterDuff$Mode r0 = r0.getBackgroundTintMode()
            return r0
    }

    public static android.graphics.Rect getClipBounds(android.view.View r0) {
            android.graphics.Rect r0 = r0.getClipBounds()
            return r0
    }

    public static android.view.Display getDisplay(android.view.View r0) {
            android.view.Display r0 = r0.getDisplay()
            return r0
    }

    public static float getElevation(android.view.View r0) {
            float r0 = r0.getElevation()
            return r0
    }

    private static android.graphics.Rect getEmptyTempRect() {
            java.lang.ThreadLocal<android.graphics.Rect> r0 = androidx.core.view.ViewCompat.sThreadLocalRect
            if (r0 != 0) goto Lb
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.view.ViewCompat.sThreadLocalRect = r0
        Lb:
            java.lang.ThreadLocal<android.graphics.Rect> r0 = androidx.core.view.ViewCompat.sThreadLocalRect
            java.lang.Object r0 = r0.get()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto L1f
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.ThreadLocal<android.graphics.Rect> r1 = androidx.core.view.ViewCompat.sThreadLocalRect
            r1.set(r0)
        L1f:
            r0.setEmpty()
            return r0
    }

    private static androidx.core.view.OnReceiveContentViewBehavior getFallback(android.view.View r1) {
            boolean r0 = r1 instanceof androidx.core.view.OnReceiveContentViewBehavior
            if (r0 == 0) goto L7
            androidx.core.view.OnReceiveContentViewBehavior r1 = (androidx.core.view.OnReceiveContentViewBehavior) r1
            return r1
        L7:
            androidx.core.view.OnReceiveContentViewBehavior r1 = androidx.core.view.ViewCompat.NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR
            return r1
    }

    public static boolean getFitsSystemWindows(android.view.View r0) {
            boolean r0 = r0.getFitsSystemWindows()
            return r0
    }

    public static int getImportantForAccessibility(android.view.View r0) {
            int r0 = r0.getImportantForAccessibility()
            return r0
    }

    public static int getImportantForAutofill(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            int r2 = r2.getImportantForAutofill()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static int getLabelFor(android.view.View r0) {
            int r0 = r0.getLabelFor()
            return r0
    }

    @java.lang.Deprecated
    public static int getLayerType(android.view.View r0) {
            int r0 = r0.getLayerType()
            return r0
    }

    public static int getLayoutDirection(android.view.View r0) {
            int r0 = r0.getLayoutDirection()
            return r0
    }

    @java.lang.Deprecated
    public static android.graphics.Matrix getMatrix(android.view.View r0) {
            android.graphics.Matrix r0 = r0.getMatrix()
            return r0
    }

    @java.lang.Deprecated
    public static int getMeasuredHeightAndState(android.view.View r0) {
            int r0 = r0.getMeasuredHeightAndState()
            return r0
    }

    @java.lang.Deprecated
    public static int getMeasuredState(android.view.View r0) {
            int r0 = r0.getMeasuredState()
            return r0
    }

    @java.lang.Deprecated
    public static int getMeasuredWidthAndState(android.view.View r0) {
            int r0 = r0.getMeasuredWidthAndState()
            return r0
    }

    public static int getMinimumHeight(android.view.View r0) {
            int r0 = r0.getMinimumHeight()
            return r0
    }

    public static int getMinimumWidth(android.view.View r0) {
            int r0 = r0.getMinimumWidth()
            return r0
    }

    public static int getNextClusterForwardId(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            int r2 = r2.getNextClusterForwardId()
            return r2
        Lb:
            r2 = -1
            return r2
    }

    public static java.lang.String[] getOnReceiveContentMimeTypes(android.view.View r1) {
            int r0 = androidx.core.C0160R.id.tag_on_receive_content_mime_types
            java.lang.Object r1 = r1.getTag(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            return r1
    }

    static androidx.core.view.AccessibilityDelegateCompat getOrCreateAccessibilityDelegateCompat(android.view.View r1) {
            androidx.core.view.AccessibilityDelegateCompat r0 = getAccessibilityDelegate(r1)
            if (r0 != 0) goto Lb
            androidx.core.view.AccessibilityDelegateCompat r0 = new androidx.core.view.AccessibilityDelegateCompat
            r0.<init>()
        Lb:
            setAccessibilityDelegate(r1, r0)
            return r0
    }

    @java.lang.Deprecated
    public static int getOverScrollMode(android.view.View r0) {
            int r0 = r0.getOverScrollMode()
            return r0
    }

    public static int getPaddingEnd(android.view.View r0) {
            int r0 = r0.getPaddingEnd()
            return r0
    }

    public static int getPaddingStart(android.view.View r0) {
            int r0 = r0.getPaddingStart()
            return r0
    }

    public static android.view.ViewParent getParentForAccessibility(android.view.View r0) {
            android.view.ViewParent r0 = r0.getParentForAccessibility()
            return r0
    }

    @java.lang.Deprecated
    public static float getPivotX(android.view.View r0) {
            float r0 = r0.getPivotX()
            return r0
    }

    @java.lang.Deprecated
    public static float getPivotY(android.view.View r0) {
            float r0 = r0.getPivotY()
            return r0
    }

    public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View r0) {
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.Api23Impl.getRootWindowInsets(r0)
            return r0
    }

    @java.lang.Deprecated
    public static float getRotation(android.view.View r0) {
            float r0 = r0.getRotation()
            return r0
    }

    @java.lang.Deprecated
    public static float getRotationX(android.view.View r0) {
            float r0 = r0.getRotationX()
            return r0
    }

    @java.lang.Deprecated
    public static float getRotationY(android.view.View r0) {
            float r0 = r0.getRotationY()
            return r0
    }

    @java.lang.Deprecated
    public static float getScaleX(android.view.View r0) {
            float r0 = r0.getScaleX()
            return r0
    }

    @java.lang.Deprecated
    public static float getScaleY(android.view.View r0) {
            float r0 = r0.getScaleY()
            return r0
    }

    public static int getScrollIndicators(android.view.View r0) {
            int r0 = r0.getScrollIndicators()
            return r0
    }

    public static final java.lang.CharSequence getStateDescription(android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = stateDescriptionProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            return r1
    }

    public static java.util.List<android.graphics.Rect> getSystemGestureExclusionRects(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            java.util.List r2 = r2.getSystemGestureExclusionRects()
            return r2
        Lb:
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
    }

    public static java.lang.String getTransitionName(android.view.View r0) {
            java.lang.String r0 = r0.getTransitionName()
            return r0
    }

    @java.lang.Deprecated
    public static float getTranslationX(android.view.View r0) {
            float r0 = r0.getTranslationX()
            return r0
    }

    @java.lang.Deprecated
    public static float getTranslationY(android.view.View r0) {
            float r0 = r0.getTranslationY()
            return r0
    }

    public static float getTranslationZ(android.view.View r0) {
            float r0 = r0.getTranslationZ()
            return r0
    }

    public static androidx.core.view.WindowInsetsControllerCompat getWindowInsetsController(android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            androidx.core.view.WindowInsetsControllerCompat r3 = androidx.core.view.ViewCompat.Api30Impl.getWindowInsetsController(r3)
            return r3
        Lb:
            android.content.Context r0 = r3.getContext()
        Lf:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            r2 = 0
            if (r1 == 0) goto L2c
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L25
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L24
            androidx.core.view.WindowInsetsControllerCompat r2 = androidx.core.view.WindowCompat.getInsetsController(r0, r3)
        L24:
            return r2
        L25:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto Lf
        L2c:
            return r2
    }

    public static int getWindowSystemUiVisibility(android.view.View r0) {
            int r0 = r0.getWindowSystemUiVisibility()
            return r0
    }

    @java.lang.Deprecated
    public static float getX(android.view.View r0) {
            float r0 = r0.getX()
            return r0
    }

    @java.lang.Deprecated
    public static float getY(android.view.View r0) {
            float r0 = r0.getY()
            return r0
    }

    public static float getZ(android.view.View r0) {
            float r0 = r0.getZ()
            return r0
    }

    public static boolean hasAccessibilityDelegate(android.view.View r0) {
            android.view.View$AccessibilityDelegate r0 = getAccessibilityDelegateInternal(r0)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static boolean hasExplicitFocusable(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = r2.hasExplicitFocusable()
            return r2
        Lb:
            boolean r2 = r2.hasFocusable()
            return r2
    }

    public static boolean hasNestedScrollingParent(android.view.View r0) {
            boolean r0 = r0.hasNestedScrollingParent()
            return r0
    }

    public static boolean hasNestedScrollingParent(android.view.View r1, int r2) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            r1.hasNestedScrollingParent(r2)
            goto L11
        La:
            if (r2 != 0) goto L11
            boolean r1 = hasNestedScrollingParent(r1)
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static boolean hasOnClickListeners(android.view.View r0) {
            boolean r0 = r0.hasOnClickListeners()
            return r0
    }

    public static boolean hasOverlappingRendering(android.view.View r0) {
            boolean r0 = r0.hasOverlappingRendering()
            return r0
    }

    public static boolean hasTransientState(android.view.View r0) {
            boolean r0 = r0.hasTransientState()
            return r0
    }

    public static boolean isAccessibilityHeading(android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = accessibilityHeadingProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            boolean r1 = r1.booleanValue()
        L12:
            return r1
    }

    public static boolean isAttachedToWindow(android.view.View r0) {
            boolean r0 = r0.isAttachedToWindow()
            return r0
    }

    public static boolean isFocusedByDefault(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = r2.isFocusedByDefault()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean isImportantForAccessibility(android.view.View r0) {
            boolean r0 = r0.isImportantForAccessibility()
            return r0
    }

    public static boolean isImportantForAutofill(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = r2.isImportantForAutofill()
            return r2
        Lb:
            r2 = 1
            return r2
    }

    public static boolean isInLayout(android.view.View r0) {
            boolean r0 = r0.isInLayout()
            return r0
    }

    public static boolean isKeyboardNavigationCluster(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = r2.isKeyboardNavigationCluster()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean isLaidOut(android.view.View r0) {
            boolean r0 = r0.isLaidOut()
            return r0
    }

    public static boolean isLayoutDirectionResolved(android.view.View r0) {
            boolean r0 = r0.isLayoutDirectionResolved()
            return r0
    }

    public static boolean isNestedScrollingEnabled(android.view.View r0) {
            boolean r0 = r0.isNestedScrollingEnabled()
            return r0
    }

    @java.lang.Deprecated
    public static boolean isOpaque(android.view.View r0) {
            boolean r0 = r0.isOpaque()
            return r0
    }

    public static boolean isPaddingRelative(android.view.View r0) {
            boolean r0 = r0.isPaddingRelative()
            return r0
    }

    public static boolean isScreenReaderFocusable(android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = screenReaderFocusableProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            boolean r1 = r1.booleanValue()
        L12:
            return r1
    }

    @java.lang.Deprecated
    public static void jumpDrawablesToCurrentState(android.view.View r0) {
            r0.jumpDrawablesToCurrentState()
            return
    }

    public static android.view.View keyboardNavigationClusterSearch(android.view.View r2, android.view.View r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.view.View r2 = r2.keyboardNavigationClusterSearch(r3, r4)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    static void notifyViewAccessibilityStateChangedIfNeeded(android.view.View r4, int r5) {
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r1 = r0.isEnabled()
            if (r1 != 0) goto L13
            return
        L13:
            java.lang.CharSequence r1 = getAccessibilityPaneTitle(r4)
            if (r1 == 0) goto L21
            int r1 = r4.getVisibility()
            if (r1 != 0) goto L21
            r1 = 1
            goto L22
        L21:
            r1 = 0
        L22:
            int r2 = getAccessibilityLiveRegion(r4)
            r3 = 32
            if (r2 != 0) goto L85
            if (r1 == 0) goto L2d
            goto L85
        L2d:
            if (r5 != r3) goto L51
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r4.onInitializeAccessibilityEvent(r1)
            r1.setEventType(r3)
            r1.setContentChangeTypes(r5)
            r1.setSource(r4)
            r4.onPopulateAccessibilityEvent(r1)
            java.util.List r5 = r1.getText()
            java.lang.CharSequence r4 = getAccessibilityPaneTitle(r4)
            r5.add(r4)
            r0.sendAccessibilityEvent(r1)
            goto La7
        L51:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto La7
            android.view.ViewParent r0 = r4.getParent()     // Catch: java.lang.AbstractMethodError -> L5f
            r0.notifySubtreeAccessibilityStateChanged(r4, r4, r5)     // Catch: java.lang.AbstractMethodError -> L5f
            goto La7
        L5f:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.view.ViewParent r4 = r4.getParent()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " does not fully implement ViewParent"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r4, r5)
            goto La7
        L85:
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r1 == 0) goto L8c
            goto L8e
        L8c:
            r3 = 2048(0x800, float:2.87E-42)
        L8e:
            r0.setEventType(r3)
            r0.setContentChangeTypes(r5)
            if (r1 == 0) goto La4
            java.util.List r5 = r0.getText()
            java.lang.CharSequence r1 = getAccessibilityPaneTitle(r4)
            r5.add(r1)
            setViewImportanceForAccessibilityIfNeeded(r4)
        La4:
            r4.sendAccessibilityEventUnchecked(r0)
        La7:
            return
    }

    public static void offsetLeftAndRight(android.view.View r0, int r1) {
            r0.offsetLeftAndRight(r1)
            return
    }

    public static void offsetTopAndBottom(android.view.View r0, int r1) {
            r0.offsetTopAndBottom(r1)
            return
    }

    public static androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r2, androidx.core.view.WindowInsetsCompat r3) {
            android.view.WindowInsets r0 = r3.toWindowInsets()
            if (r0 == 0) goto L15
            android.view.WindowInsets r1 = r2.onApplyWindowInsets(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1, r2)
            return r2
        L15:
            return r3
    }

    @java.lang.Deprecated
    public static void onInitializeAccessibilityEvent(android.view.View r0, android.view.accessibility.AccessibilityEvent r1) {
            r0.onInitializeAccessibilityEvent(r1)
            return
    }

    public static void onInitializeAccessibilityNodeInfo(android.view.View r0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1) {
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.unwrap()
            r0.onInitializeAccessibilityNodeInfo(r1)
            return
    }

    @java.lang.Deprecated
    public static void onPopulateAccessibilityEvent(android.view.View r0, android.view.accessibility.AccessibilityEvent r1) {
            r0.onPopulateAccessibilityEvent(r1)
            return
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> paneTitleProperty() {
            androidx.core.view.ViewCompat$3 r0 = new androidx.core.view.ViewCompat$3
            int r1 = androidx.core.C0160R.id.tag_accessibility_pane_title
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r3 = 8
            r4 = 28
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static boolean performAccessibilityAction(android.view.View r0, int r1, android.os.Bundle r2) {
            boolean r0 = r0.performAccessibilityAction(r1, r2)
            return r0
    }

    public static androidx.core.view.ContentInfoCompat performReceiveContent(android.view.View r3, androidx.core.view.ContentInfoCompat r4) {
            r0 = 3
            java.lang.String r1 = "ViewCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "performReceiveContent: "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r2 = ", view="
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = "["
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r3.getId()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = "]"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L41:
            int r0 = androidx.core.C0160R.id.tag_on_receive_content_listener
            java.lang.Object r0 = r3.getTag(r0)
            androidx.core.view.OnReceiveContentListener r0 = (androidx.core.view.OnReceiveContentListener) r0
            if (r0 == 0) goto L5c
            androidx.core.view.ContentInfoCompat r4 = r0.onReceiveContent(r3, r4)
            if (r4 != 0) goto L53
            r3 = 0
            goto L5b
        L53:
            androidx.core.view.OnReceiveContentViewBehavior r3 = getFallback(r3)
            androidx.core.view.ContentInfoCompat r3 = r3.onReceiveContent(r4)
        L5b:
            return r3
        L5c:
            androidx.core.view.OnReceiveContentViewBehavior r3 = getFallback(r3)
            androidx.core.view.ContentInfoCompat r3 = r3.onReceiveContent(r4)
            return r3
    }

    public static void postInvalidateOnAnimation(android.view.View r0) {
            r0.postInvalidateOnAnimation()
            return
    }

    public static void postInvalidateOnAnimation(android.view.View r0, int r1, int r2, int r3, int r4) {
            r0.postInvalidateOnAnimation(r1, r2, r3, r4)
            return
    }

    public static void postOnAnimation(android.view.View r0, java.lang.Runnable r1) {
            r0.postOnAnimation(r1)
            return
    }

    public static void postOnAnimationDelayed(android.view.View r0, java.lang.Runnable r1, long r2) {
            r0.postOnAnimationDelayed(r1, r2)
            return
    }

    public static void removeAccessibilityAction(android.view.View r0, int r1) {
            removeActionWithId(r1, r0)
            r1 = 0
            notifyViewAccessibilityStateChangedIfNeeded(r0, r1)
            return
    }

    private static void removeActionWithId(int r2, android.view.View r3) {
            java.util.List r3 = getActionList(r3)
            r0 = 0
        L5:
            int r1 = r3.size()
            if (r0 >= r1) goto L1e
            java.lang.Object r1 = r3.get(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r1
            int r1 = r1.getId()
            if (r1 != r2) goto L1b
            r3.remove(r0)
            goto L1e
        L1b:
            int r0 = r0 + 1
            goto L5
        L1e:
            return
    }

    public static void removeOnUnhandledKeyEventListener(android.view.View r2, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.CompatImplApi28.removeOnUnhandledKeyEventListener(r2, r3)
            return
        La:
            int r0 = androidx.core.C0160R.id.tag_unhandled_key_listeners
            java.lang.Object r0 = r2.getTag(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L20
            r0.remove(r3)
            int r3 = r0.size()
            if (r3 != 0) goto L20
            androidx.core.view.ViewCompat.UnhandledKeyEventManager.unregisterListeningView(r2)
        L20:
            return
    }

    public static void replaceAccessibilityAction(android.view.View r0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r1, java.lang.CharSequence r2, androidx.core.view.accessibility.AccessibilityViewCommand r3) {
            if (r3 != 0) goto Lc
            if (r2 != 0) goto Lc
            int r1 = r1.getId()
            removeAccessibilityAction(r0, r1)
            goto L13
        Lc:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = r1.createReplacementAction(r2, r3)
            addAccessibilityAction(r0, r1)
        L13:
            return
    }

    public static void requestApplyInsets(android.view.View r0) {
            r0.requestApplyInsets()
            return
    }

    public static <T extends android.view.View> T requireViewById(android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.view.View r2 = r2.requireViewById(r3)
            return r2
        Lb:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L12
            return r2
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this View"
            r2.<init>(r3)
            throw r2
    }

    @java.lang.Deprecated
    public static int resolveSizeAndState(int r0, int r1, int r2) {
            int r0 = android.view.View.resolveSizeAndState(r0, r1, r2)
            return r0
    }

    public static boolean restoreDefaultFocus(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = r2.restoreDefaultFocus()
            return r2
        Lb:
            boolean r2 = r2.requestFocus()
            return r2
    }

    public static void saveAttributeDataForStyleable(android.view.View r2, android.content.Context r3, int[] r4, android.util.AttributeSet r5, android.content.res.TypedArray r6, int r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api29Impl.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, r7, r8)
        L9:
            return
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> screenReaderFocusableProperty() {
            androidx.core.view.ViewCompat$2 r0 = new androidx.core.view.ViewCompat$2
            int r1 = androidx.core.C0160R.id.tag_screen_reader_focusable
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r3 = 28
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static void setAccessibilityDelegate(android.view.View r1, androidx.core.view.AccessibilityDelegateCompat r2) {
            if (r2 != 0) goto Lf
            android.view.View$AccessibilityDelegate r0 = getAccessibilityDelegateInternal(r1)
            boolean r0 = r0 instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter
            if (r0 == 0) goto Lf
            androidx.core.view.AccessibilityDelegateCompat r2 = new androidx.core.view.AccessibilityDelegateCompat
            r2.<init>()
        Lf:
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            android.view.View$AccessibilityDelegate r2 = r2.getBridge()
        L17:
            r1.setAccessibilityDelegate(r2)
            return
    }

    public static void setAccessibilityHeading(android.view.View r1, boolean r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = accessibilityHeadingProperty()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.set(r1, r2)
            return
    }

    public static void setAccessibilityLiveRegion(android.view.View r0, int r1) {
            r0.setAccessibilityLiveRegion(r1)
            return
    }

    public static void setAccessibilityPaneTitle(android.view.View r1, java.lang.CharSequence r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = paneTitleProperty()
            r0.set(r1, r2)
            if (r2 == 0) goto Lf
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r2 = androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager
            r2.addAccessibilityPane(r1)
            goto L14
        Lf:
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r2 = androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager
            r2.removeAccessibilityPane(r1)
        L14:
            return
    }

    @java.lang.Deprecated
    public static void setActivated(android.view.View r0, boolean r1) {
            r0.setActivated(r1)
            return
    }

    @java.lang.Deprecated
    public static void setAlpha(android.view.View r0, float r1) {
            r0.setAlpha(r1)
            return
    }

    public static void setAutofillHints(android.view.View r2, java.lang.String... r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            r2.setAutofillHints(r3)
        L9:
            return
    }

    public static void setBackground(android.view.View r0, android.graphics.drawable.Drawable r1) {
            r0.setBackground(r1)
            return
    }

    public static void setBackgroundTintList(android.view.View r0, android.content.res.ColorStateList r1) {
            r0.setBackgroundTintList(r1)
            return
    }

    public static void setBackgroundTintMode(android.view.View r0, android.graphics.PorterDuff.Mode r1) {
            r0.setBackgroundTintMode(r1)
            return
    }

    @java.lang.Deprecated
    public static void setChildrenDrawingOrderEnabled(android.view.ViewGroup r8, boolean r9) {
            java.lang.String r0 = "Unable to invoke childrenDrawingOrderEnabled"
            java.lang.reflect.Method r1 = androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod
            r2 = 0
            r3 = 1
            java.lang.String r4 = "ViewCompat"
            if (r1 != 0) goto L26
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            java.lang.String r5 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L1b
            r6[r2] = r7     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L1b
            androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod = r1     // Catch: java.lang.NoSuchMethodException -> L1b
            goto L21
        L1b:
            r1 = move-exception
            java.lang.String r5 = "Unable to find childrenDrawingOrderEnabled"
            android.util.Log.e(r4, r5, r1)
        L21:
            java.lang.reflect.Method r1 = androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod
            r1.setAccessible(r3)
        L26:
            java.lang.reflect.Method r1 = androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalArgumentException -> L39 java.lang.IllegalAccessException -> L3e
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalArgumentException -> L39 java.lang.IllegalAccessException -> L3e
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalArgumentException -> L39 java.lang.IllegalAccessException -> L3e
            r3[r2] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalArgumentException -> L39 java.lang.IllegalAccessException -> L3e
            r1.invoke(r8, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalArgumentException -> L39 java.lang.IllegalAccessException -> L3e
            goto L42
        L34:
            r8 = move-exception
            android.util.Log.e(r4, r0, r8)
            goto L42
        L39:
            r8 = move-exception
            android.util.Log.e(r4, r0, r8)
            goto L42
        L3e:
            r8 = move-exception
            android.util.Log.e(r4, r0, r8)
        L42:
            return
    }

    public static void setClipBounds(android.view.View r0, android.graphics.Rect r1) {
            r0.setClipBounds(r1)
            return
    }

    public static void setElevation(android.view.View r0, float r1) {
            r0.setElevation(r1)
            return
    }

    @java.lang.Deprecated
    public static void setFitsSystemWindows(android.view.View r0, boolean r1) {
            r0.setFitsSystemWindows(r1)
            return
    }

    public static void setFocusedByDefault(android.view.View r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            r2.setFocusedByDefault(r3)
        L9:
            return
    }

    public static void setHasTransientState(android.view.View r0, boolean r1) {
            r0.setHasTransientState(r1)
            return
    }

    public static void setImportantForAccessibility(android.view.View r0, int r1) {
            r0.setImportantForAccessibility(r1)
            return
    }

    public static void setImportantForAutofill(android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            r2.setImportantForAutofill(r3)
        L9:
            return
    }

    public static void setKeyboardNavigationCluster(android.view.View r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            r2.setKeyboardNavigationCluster(r3)
        L9:
            return
    }

    public static void setLabelFor(android.view.View r0, int r1) {
            r0.setLabelFor(r1)
            return
    }

    public static void setLayerPaint(android.view.View r0, android.graphics.Paint r1) {
            r0.setLayerPaint(r1)
            return
    }

    @java.lang.Deprecated
    public static void setLayerType(android.view.View r0, int r1, android.graphics.Paint r2) {
            r0.setLayerType(r1, r2)
            return
    }

    public static void setLayoutDirection(android.view.View r0, int r1) {
            r0.setLayoutDirection(r1)
            return
    }

    public static void setNestedScrollingEnabled(android.view.View r0, boolean r1) {
            r0.setNestedScrollingEnabled(r1)
            return
    }

    public static void setNextClusterForwardId(android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            r2.setNextClusterForwardId(r3)
        L9:
            return
    }

    public static void setOnApplyWindowInsetsListener(android.view.View r0, androidx.core.view.OnApplyWindowInsetsListener r1) {
            androidx.core.view.ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(r0, r1)
            return
    }

    public static void setOnReceiveContentListener(android.view.View r6, java.lang.String[] r7, androidx.core.view.OnReceiveContentListener r8) {
            if (r7 == 0) goto L5
            int r0 = r7.length
            if (r0 != 0) goto L6
        L5:
            r7 = 0
        L6:
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L14
            if (r7 == 0) goto Le
            r2 = r1
            goto Lf
        Le:
            r2 = r0
        Lf:
            java.lang.String r3 = "When the listener is set, MIME types must also be set"
            androidx.core.util.Preconditions.checkArgument(r2, r3)
        L14:
            if (r7 == 0) goto L40
            int r2 = r7.length
            r3 = r0
        L18:
            if (r3 >= r2) goto L29
            r4 = r7[r3]
            java.lang.String r5 = "*"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L26
            r0 = r1
            goto L29
        L26:
            int r3 = r3 + 1
            goto L18
        L29:
            r0 = r0 ^ r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "A MIME type set here must not start with *: "
            r1.<init>(r2)
            java.lang.String r2 = java.util.Arrays.toString(r7)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r1)
        L40:
            int r0 = androidx.core.C0160R.id.tag_on_receive_content_mime_types
            r6.setTag(r0, r7)
            int r7 = androidx.core.C0160R.id.tag_on_receive_content_listener
            r6.setTag(r7, r8)
            return
    }

    @java.lang.Deprecated
    public static void setOverScrollMode(android.view.View r0, int r1) {
            r0.setOverScrollMode(r1)
            return
    }

    public static void setPaddingRelative(android.view.View r0, int r1, int r2, int r3, int r4) {
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public static void setPivotX(android.view.View r0, float r1) {
            r0.setPivotX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setPivotY(android.view.View r0, float r1) {
            r0.setPivotY(r1)
            return
    }

    public static void setPointerIcon(android.view.View r0, androidx.core.view.PointerIconCompat r1) {
            if (r1 == 0) goto L7
            java.lang.Object r1 = r1.getPointerIcon()
            goto L8
        L7:
            r1 = 0
        L8:
            android.view.PointerIcon r1 = (android.view.PointerIcon) r1
            r0.setPointerIcon(r1)
            return
    }

    @java.lang.Deprecated
    public static void setRotation(android.view.View r0, float r1) {
            r0.setRotation(r1)
            return
    }

    @java.lang.Deprecated
    public static void setRotationX(android.view.View r0, float r1) {
            r0.setRotationX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setRotationY(android.view.View r0, float r1) {
            r0.setRotationY(r1)
            return
    }

    @java.lang.Deprecated
    public static void setSaveFromParentEnabled(android.view.View r0, boolean r1) {
            r0.setSaveFromParentEnabled(r1)
            return
    }

    @java.lang.Deprecated
    public static void setScaleX(android.view.View r0, float r1) {
            r0.setScaleX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setScaleY(android.view.View r0, float r1) {
            r0.setScaleY(r1)
            return
    }

    public static void setScreenReaderFocusable(android.view.View r1, boolean r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = screenReaderFocusableProperty()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.set(r1, r2)
            return
    }

    public static void setScrollIndicators(android.view.View r0, int r1) {
            r0.setScrollIndicators(r1)
            return
    }

    public static void setScrollIndicators(android.view.View r0, int r1, int r2) {
            r0.setScrollIndicators(r1, r2)
            return
    }

    public static void setStateDescription(android.view.View r1, java.lang.CharSequence r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = stateDescriptionProperty()
            r0.set(r1, r2)
            return
    }

    public static void setSystemGestureExclusionRects(android.view.View r2, java.util.List<android.graphics.Rect> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            r2.setSystemGestureExclusionRects(r3)
        L9:
            return
    }

    public static void setTooltipText(android.view.View r2, java.lang.CharSequence r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            r2.setTooltipText(r3)
        L9:
            return
    }

    public static void setTransitionName(android.view.View r0, java.lang.String r1) {
            r0.setTransitionName(r1)
            return
    }

    @java.lang.Deprecated
    public static void setTranslationX(android.view.View r0, float r1) {
            r0.setTranslationX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setTranslationY(android.view.View r0, float r1) {
            r0.setTranslationY(r1)
            return
    }

    public static void setTranslationZ(android.view.View r0, float r1) {
            r0.setTranslationZ(r1)
            return
    }

    private static void setViewImportanceForAccessibilityIfNeeded(android.view.View r3) {
            int r0 = getImportantForAccessibility(r3)
            if (r0 != 0) goto La
            r0 = 1
            setImportantForAccessibility(r3, r0)
        La:
            android.view.ViewParent r0 = r3.getParent()
        Le:
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L26
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            int r1 = getImportantForAccessibility(r1)
            r2 = 4
            if (r1 != r2) goto L21
            r0 = 2
            setImportantForAccessibility(r3, r0)
            goto L26
        L21:
            android.view.ViewParent r0 = r0.getParent()
            goto Le
        L26:
            return
    }

    public static void setWindowInsetsAnimationCallback(android.view.View r0, androidx.core.view.WindowInsetsAnimationCompat.Callback r1) {
            androidx.core.view.WindowInsetsAnimationCompat.setCallback(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setX(android.view.View r0, float r1) {
            r0.setX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setY(android.view.View r0, float r1) {
            r0.setY(r1)
            return
    }

    public static void setZ(android.view.View r0, float r1) {
            r0.setZ(r1)
            return
    }

    public static boolean startDragAndDrop(android.view.View r0, android.content.ClipData r1, android.view.View.DragShadowBuilder r2, java.lang.Object r3, int r4) {
            boolean r0 = r0.startDragAndDrop(r1, r2, r3, r4)
            return r0
    }

    public static boolean startNestedScroll(android.view.View r0, int r1) {
            boolean r0 = r0.startNestedScroll(r1)
            return r0
    }

    public static boolean startNestedScroll(android.view.View r1, int r2, int r3) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto Lb
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            boolean r1 = r1.startNestedScroll(r2, r3)
            return r1
        Lb:
            if (r3 != 0) goto L12
            boolean r1 = startNestedScroll(r1, r2)
            return r1
        L12:
            r1 = 0
            return r1
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> stateDescriptionProperty() {
            androidx.core.view.ViewCompat$4 r0 = new androidx.core.view.ViewCompat$4
            int r1 = androidx.core.C0160R.id.tag_state_description
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r3 = 64
            r4 = 30
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static void stopNestedScroll(android.view.View r0) {
            r0.stopNestedScroll()
            return
    }

    public static void stopNestedScroll(android.view.View r1, int r2) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            r1.stopNestedScroll(r2)
            goto Lf
        La:
            if (r2 != 0) goto Lf
            stopNestedScroll(r1)
        Lf:
            return
    }

    private static void tickleInvalidationFlag(android.view.View r2) {
            float r0 = r2.getTranslationY()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r2.setTranslationY(r1)
            r2.setTranslationY(r0)
            return
    }

    public static void updateDragShadow(android.view.View r0, android.view.View.DragShadowBuilder r1) {
            r0.updateDragShadow(r1)
            return
    }
}
