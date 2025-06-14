package androidx.constraintlayout.helper.widget;

/* loaded from: classes.dex */
public class Carousel extends androidx.constraintlayout.motion.widget.MotionHelper {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "Carousel";
    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
    private int backwardTransition;
    private float dampening;
    private int emptyViewBehavior;
    private int firstViewReference;
    private int forwardTransition;
    private boolean infiniteCarousel;
    private androidx.constraintlayout.helper.widget.Carousel.Adapter mAdapter;
    private int mAnimateTargetDelay;
    private int mIndex;
    int mLastStartId;
    private final java.util.ArrayList<android.view.View> mList;
    private androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private int mPreviousIndex;
    private int mTargetIndex;
    java.lang.Runnable mUpdateRunnable;
    private int nextState;
    private int previousState;
    private int startIndex;
    private int touchUpMode;
    private float velocityThreshold;


    public interface Adapter {
        int count();

        void onNewItem(int r1);

        void populate(android.view.View r1, int r2);
    }

    public Carousel(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            r2.mAdapter = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mList = r3
            r3 = 0
            r2.mPreviousIndex = r3
            r2.mIndex = r3
            r0 = -1
            r2.firstViewReference = r0
            r2.infiniteCarousel = r3
            r2.backwardTransition = r0
            r2.forwardTransition = r0
            r2.previousState = r0
            r2.nextState = r0
            r1 = 1063675494(0x3f666666, float:0.9)
            r2.dampening = r1
            r2.startIndex = r3
            r3 = 4
            r2.emptyViewBehavior = r3
            r3 = 1
            r2.touchUpMode = r3
            r3 = 1073741824(0x40000000, float:2.0)
            r2.velocityThreshold = r3
            r2.mTargetIndex = r0
            r3 = 200(0xc8, float:2.8E-43)
            r2.mAnimateTargetDelay = r3
            r2.mLastStartId = r0
            androidx.constraintlayout.helper.widget.Carousel$1 r3 = new androidx.constraintlayout.helper.widget.Carousel$1
            r3.<init>(r2)
            r2.mUpdateRunnable = r3
            return
    }

    public Carousel(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r0 = 0
            r3.mAdapter = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mList = r0
            r0 = 0
            r3.mPreviousIndex = r0
            r3.mIndex = r0
            r1 = -1
            r3.firstViewReference = r1
            r3.infiniteCarousel = r0
            r3.backwardTransition = r1
            r3.forwardTransition = r1
            r3.previousState = r1
            r3.nextState = r1
            r2 = 1063675494(0x3f666666, float:0.9)
            r3.dampening = r2
            r3.startIndex = r0
            r0 = 4
            r3.emptyViewBehavior = r0
            r0 = 1
            r3.touchUpMode = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r3.velocityThreshold = r0
            r3.mTargetIndex = r1
            r0 = 200(0xc8, float:2.8E-43)
            r3.mAnimateTargetDelay = r0
            r3.mLastStartId = r1
            androidx.constraintlayout.helper.widget.Carousel$1 r0 = new androidx.constraintlayout.helper.widget.Carousel$1
            r0.<init>(r3)
            r3.mUpdateRunnable = r0
            r3.init(r4, r5)
            return
    }

    public Carousel(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r5 = 0
            r2.mAdapter = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.mList = r5
            r5 = 0
            r2.mPreviousIndex = r5
            r2.mIndex = r5
            r0 = -1
            r2.firstViewReference = r0
            r2.infiniteCarousel = r5
            r2.backwardTransition = r0
            r2.forwardTransition = r0
            r2.previousState = r0
            r2.nextState = r0
            r1 = 1063675494(0x3f666666, float:0.9)
            r2.dampening = r1
            r2.startIndex = r5
            r5 = 4
            r2.emptyViewBehavior = r5
            r5 = 1
            r2.touchUpMode = r5
            r5 = 1073741824(0x40000000, float:2.0)
            r2.velocityThreshold = r5
            r2.mTargetIndex = r0
            r5 = 200(0xc8, float:2.8E-43)
            r2.mAnimateTargetDelay = r5
            r2.mLastStartId = r0
            androidx.constraintlayout.helper.widget.Carousel$1 r5 = new androidx.constraintlayout.helper.widget.Carousel$1
            r5.<init>(r2)
            r2.mUpdateRunnable = r5
            r2.init(r3, r4)
            return
    }

    static /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout access$000(androidx.constraintlayout.helper.widget.Carousel r0) {
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r0.mMotionLayout
            return r0
    }

    static /* synthetic */ void access$100(androidx.constraintlayout.helper.widget.Carousel r0) {
            r0.updateItems()
            return
    }

    static /* synthetic */ int access$200(androidx.constraintlayout.helper.widget.Carousel r0) {
            int r0 = r0.mIndex
            return r0
    }

    static /* synthetic */ androidx.constraintlayout.helper.widget.Carousel.Adapter access$300(androidx.constraintlayout.helper.widget.Carousel r0) {
            androidx.constraintlayout.helper.widget.Carousel$Adapter r0 = r0.mAdapter
            return r0
    }

    static /* synthetic */ int access$400(androidx.constraintlayout.helper.widget.Carousel r0) {
            int r0 = r0.touchUpMode
            return r0
    }

    static /* synthetic */ float access$500(androidx.constraintlayout.helper.widget.Carousel r0) {
            float r0 = r0.velocityThreshold
            return r0
    }

    static /* synthetic */ float access$600(androidx.constraintlayout.helper.widget.Carousel r0) {
            float r0 = r0.dampening
            return r0
    }

    static /* synthetic */ int access$700(androidx.constraintlayout.helper.widget.Carousel r0) {
            int r0 = r0.mPreviousIndex
            return r0
    }

    private void enableAllTransitions(boolean r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            java.util.ArrayList r0 = r0.getDefinedTransitions()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            r1.setEnabled(r3)
            goto La
        L1a:
            return
    }

    private boolean enableTransition(int r3, boolean r4) {
            r2 = this;
            r0 = -1
            r1 = 0
            if (r3 != r0) goto L5
            return r1
        L5:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            if (r0 != 0) goto La
            return r1
        La:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r0.getTransition(r3)
            if (r3 != 0) goto L11
            return r1
        L11:
            boolean r0 = r3.isEnabled()
            if (r4 != r0) goto L18
            return r1
        L18:
            r3.setEnabled(r4)
            r3 = 1
            return r3
    }

    private void init(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            if (r5 == 0) goto L9d
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.Carousel
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            int r5 = r4.getIndexCount()
            r0 = 0
        Ld:
            if (r0 >= r5) goto L9a
            int r1 = r4.getIndex(r0)
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.Carousel_carousel_firstView
            if (r1 != r2) goto L21
            int r2 = r3.firstViewReference
            int r1 = r4.getResourceId(r1, r2)
            r3.firstViewReference = r1
            goto L96
        L21:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.Carousel_carousel_backwardTransition
            if (r1 != r2) goto L2f
            int r2 = r3.backwardTransition
            int r1 = r4.getResourceId(r1, r2)
            r3.backwardTransition = r1
            goto L96
        L2f:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.Carousel_carousel_forwardTransition
            if (r1 != r2) goto L3c
            int r2 = r3.forwardTransition
            int r1 = r4.getResourceId(r1, r2)
            r3.forwardTransition = r1
            goto L96
        L3c:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.Carousel_carousel_emptyViewsBehavior
            if (r1 != r2) goto L49
            int r2 = r3.emptyViewBehavior
            int r1 = r4.getInt(r1, r2)
            r3.emptyViewBehavior = r1
            goto L96
        L49:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.Carousel_carousel_previousState
            if (r1 != r2) goto L56
            int r2 = r3.previousState
            int r1 = r4.getResourceId(r1, r2)
            r3.previousState = r1
            goto L96
        L56:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.Carousel_carousel_nextState
            if (r1 != r2) goto L63
            int r2 = r3.nextState
            int r1 = r4.getResourceId(r1, r2)
            r3.nextState = r1
            goto L96
        L63:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.Carousel_carousel_touchUp_dampeningFactor
            if (r1 != r2) goto L70
            float r2 = r3.dampening
            float r1 = r4.getFloat(r1, r2)
            r3.dampening = r1
            goto L96
        L70:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.Carousel_carousel_touchUpMode
            if (r1 != r2) goto L7d
            int r2 = r3.touchUpMode
            int r1 = r4.getInt(r1, r2)
            r3.touchUpMode = r1
            goto L96
        L7d:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.Carousel_carousel_touchUp_velocityThreshold
            if (r1 != r2) goto L8a
            float r2 = r3.velocityThreshold
            float r1 = r4.getFloat(r1, r2)
            r3.velocityThreshold = r1
            goto L96
        L8a:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.Carousel_carousel_infinite
            if (r1 != r2) goto L96
            boolean r2 = r3.infiniteCarousel
            boolean r1 = r4.getBoolean(r1, r2)
            r3.infiniteCarousel = r1
        L96:
            int r0 = r0 + 1
            goto Ld
        L9a:
            r4.recycle()
        L9d:
            return
    }

    private void updateItems() {
            r8 = this;
            androidx.constraintlayout.helper.widget.Carousel$Adapter r0 = r8.mAdapter
            if (r0 != 0) goto L5
            return
        L5:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r8.mMotionLayout
            if (r1 != 0) goto La
            return
        La:
            int r0 = r0.count()
            if (r0 != 0) goto L11
            return
        L11:
            java.util.ArrayList<android.view.View> r0 = r8.mList
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L19:
            if (r2 >= r0) goto Lbb
            java.util.ArrayList<android.view.View> r3 = r8.mList
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            int r4 = r8.mIndex
            int r4 = r4 + r2
            int r5 = r8.startIndex
            int r4 = r4 - r5
            boolean r5 = r8.infiniteCarousel
            if (r5 == 0) goto L99
            r5 = 4
            if (r4 >= 0) goto L5e
            int r6 = r8.emptyViewBehavior
            if (r6 == r5) goto L38
            r8.updateViewVisibility(r3, r6)
            goto L3b
        L38:
            r8.updateViewVisibility(r3, r1)
        L3b:
            androidx.constraintlayout.helper.widget.Carousel$Adapter r5 = r8.mAdapter
            int r5 = r5.count()
            int r5 = r4 % r5
            if (r5 != 0) goto L4c
            androidx.constraintlayout.helper.widget.Carousel$Adapter r4 = r8.mAdapter
            r4.populate(r3, r1)
            goto Lb7
        L4c:
            androidx.constraintlayout.helper.widget.Carousel$Adapter r5 = r8.mAdapter
            int r6 = r5.count()
            androidx.constraintlayout.helper.widget.Carousel$Adapter r7 = r8.mAdapter
            int r7 = r7.count()
            int r4 = r4 % r7
            int r6 = r6 + r4
            r5.populate(r3, r6)
            goto Lb7
        L5e:
            androidx.constraintlayout.helper.widget.Carousel$Adapter r6 = r8.mAdapter
            int r6 = r6.count()
            if (r4 < r6) goto L90
            androidx.constraintlayout.helper.widget.Carousel$Adapter r6 = r8.mAdapter
            int r6 = r6.count()
            if (r4 != r6) goto L70
            r4 = r1
            goto L7f
        L70:
            androidx.constraintlayout.helper.widget.Carousel$Adapter r6 = r8.mAdapter
            int r6 = r6.count()
            if (r4 <= r6) goto L7f
            androidx.constraintlayout.helper.widget.Carousel$Adapter r6 = r8.mAdapter
            int r6 = r6.count()
            int r4 = r4 % r6
        L7f:
            int r6 = r8.emptyViewBehavior
            if (r6 == r5) goto L87
            r8.updateViewVisibility(r3, r6)
            goto L8a
        L87:
            r8.updateViewVisibility(r3, r1)
        L8a:
            androidx.constraintlayout.helper.widget.Carousel$Adapter r5 = r8.mAdapter
            r5.populate(r3, r4)
            goto Lb7
        L90:
            r8.updateViewVisibility(r3, r1)
            androidx.constraintlayout.helper.widget.Carousel$Adapter r5 = r8.mAdapter
            r5.populate(r3, r4)
            goto Lb7
        L99:
            if (r4 >= 0) goto La1
            int r4 = r8.emptyViewBehavior
            r8.updateViewVisibility(r3, r4)
            goto Lb7
        La1:
            androidx.constraintlayout.helper.widget.Carousel$Adapter r5 = r8.mAdapter
            int r5 = r5.count()
            if (r4 < r5) goto Laf
            int r4 = r8.emptyViewBehavior
            r8.updateViewVisibility(r3, r4)
            goto Lb7
        Laf:
            r8.updateViewVisibility(r3, r1)
            androidx.constraintlayout.helper.widget.Carousel$Adapter r5 = r8.mAdapter
            r5.populate(r3, r4)
        Lb7:
            int r2 = r2 + 1
            goto L19
        Lbb:
            int r0 = r8.mTargetIndex
            r2 = -1
            if (r0 == r2) goto Lcf
            int r3 = r8.mIndex
            if (r0 == r3) goto Lcf
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r8.mMotionLayout
            androidx.constraintlayout.helper.widget.Carousel$$ExternalSyntheticLambda0 r3 = new androidx.constraintlayout.helper.widget.Carousel$$ExternalSyntheticLambda0
            r3.<init>(r8)
            r0.post(r3)
            goto Ld5
        Lcf:
            int r3 = r8.mIndex
            if (r0 != r3) goto Ld5
            r8.mTargetIndex = r2
        Ld5:
            int r0 = r8.backwardTransition
            if (r0 == r2) goto L118
            int r0 = r8.forwardTransition
            if (r0 != r2) goto Lde
            goto L118
        Lde:
            boolean r0 = r8.infiniteCarousel
            if (r0 == 0) goto Le3
            return
        Le3:
            androidx.constraintlayout.helper.widget.Carousel$Adapter r0 = r8.mAdapter
            int r0 = r0.count()
            int r2 = r8.mIndex
            r3 = 1
            if (r2 != 0) goto Lf4
            int r2 = r8.backwardTransition
            r8.enableTransition(r2, r1)
            goto L100
        Lf4:
            int r2 = r8.backwardTransition
            r8.enableTransition(r2, r3)
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r8.mMotionLayout
            int r4 = r8.backwardTransition
            r2.setTransition(r4)
        L100:
            int r2 = r8.mIndex
            int r0 = r0 - r3
            if (r2 != r0) goto L10b
            int r0 = r8.forwardTransition
            r8.enableTransition(r0, r1)
            goto L117
        L10b:
            int r0 = r8.forwardTransition
            r8.enableTransition(r0, r3)
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r8.mMotionLayout
            int r1 = r8.forwardTransition
            r0.setTransition(r1)
        L117:
            return
        L118:
            java.lang.String r0 = "Carousel"
            java.lang.String r1 = "No backward or forward transitions defined for Carousel!"
            android.util.Log.w(r0, r1)
            return
    }

    private boolean updateViewVisibility(int r3, android.view.View r4, int r5) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            androidx.constraintlayout.widget.ConstraintSet r3 = r0.getConstraintSet(r3)
            r0 = 0
            if (r3 != 0) goto La
            return r0
        La:
            int r1 = r4.getId()
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = r3.getConstraint(r1)
            if (r3 != 0) goto L15
            return r0
        L15:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r3.propertySet
            r0 = 1
            r3.mVisibilityMode = r0
            r4.setVisibility(r5)
            return r0
    }

    private boolean updateViewVisibility(android.view.View r5, int r6) {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.mMotionLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int[] r0 = r0.getConstraintSetIds()
            r2 = r1
        Lb:
            int r3 = r0.length
            if (r1 >= r3) goto L18
            r3 = r0[r1]
            boolean r3 = r4.updateViewVisibility(r3, r5, r6)
            r2 = r2 | r3
            int r1 = r1 + 1
            goto Lb
        L18:
            return r2
    }

    public int getCount() {
            r1 = this;
            androidx.constraintlayout.helper.widget.Carousel$Adapter r0 = r1.mAdapter
            if (r0 == 0) goto L9
            int r0 = r0.count()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int getCurrentIndex() {
            r1 = this;
            int r0 = r1.mIndex
            return r0
    }

    public void jumpToIndex(int r2) {
            r1 = this;
            int r0 = r1.getCount()
            int r0 = r0 + (-1)
            int r2 = java.lang.Math.min(r0, r2)
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r1.mIndex = r2
            r1.refresh()
            return
    }

    /* renamed from: lambda$updateItems$0$androidx-constraintlayout-helper-widget-Carousel */
    /* synthetic */ void m5xc943cdea() {
            r3 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.mMotionLayout
            int r1 = r3.mAnimateTargetDelay
            r0.setTransitionDuration(r1)
            int r0 = r3.mTargetIndex
            int r1 = r3.mIndex
            if (r0 >= r1) goto L17
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.mMotionLayout
            int r1 = r3.previousState
            int r2 = r3.mAnimateTargetDelay
            r0.transitionToState(r1, r2)
            goto L20
        L17:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.mMotionLayout
            int r1 = r3.nextState
            int r2 = r3.mAnimateTargetDelay
            r0.transitionToState(r1, r2)
        L20:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.motion.widget.MotionLayout
            if (r0 == 0) goto L4f
            android.view.ViewParent r0 = r5.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r0 = (androidx.constraintlayout.motion.widget.MotionLayout) r0
            r1 = 0
        L12:
            int r2 = r5.mCount
            if (r1 >= r2) goto L2c
            int[] r2 = r5.mIds
            r2 = r2[r1]
            android.view.View r3 = r0.getViewById(r2)
            int r4 = r5.firstViewReference
            if (r4 != r2) goto L24
            r5.startIndex = r1
        L24:
            java.util.ArrayList<android.view.View> r2 = r5.mList
            r2.add(r3)
            int r1 = r1 + 1
            goto L12
        L2c:
            r5.mMotionLayout = r0
            int r1 = r5.touchUpMode
            r2 = 2
            if (r1 != r2) goto L4c
            int r1 = r5.forwardTransition
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.getTransition(r1)
            r1 = 5
            if (r0 == 0) goto L3f
            r0.setOnTouchUp(r1)
        L3f:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r5.mMotionLayout
            int r2 = r5.backwardTransition
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.getTransition(r2)
            if (r0 == 0) goto L4c
            r0.setOnTouchUp(r1)
        L4c:
            r5.updateItems()
        L4f:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3, float r4) {
            r0 = this;
            r0.mLastStartId = r2
            return
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout r2, int r3) {
            r1 = this;
            int r2 = r1.mIndex
            r1.mPreviousIndex = r2
            int r0 = r1.nextState
            if (r3 != r0) goto Ld
            int r2 = r2 + 1
            r1.mIndex = r2
            goto L15
        Ld:
            int r0 = r1.previousState
            if (r3 != r0) goto L15
            int r2 = r2 + (-1)
            r1.mIndex = r2
        L15:
            boolean r2 = r1.infiniteCarousel
            r3 = 0
            if (r2 == 0) goto L35
            int r2 = r1.mIndex
            androidx.constraintlayout.helper.widget.Carousel$Adapter r0 = r1.mAdapter
            int r0 = r0.count()
            if (r2 < r0) goto L26
            r1.mIndex = r3
        L26:
            int r2 = r1.mIndex
            if (r2 >= 0) goto L4f
            androidx.constraintlayout.helper.widget.Carousel$Adapter r2 = r1.mAdapter
            int r2 = r2.count()
            int r2 = r2 + (-1)
            r1.mIndex = r2
            goto L4f
        L35:
            int r2 = r1.mIndex
            androidx.constraintlayout.helper.widget.Carousel$Adapter r0 = r1.mAdapter
            int r0 = r0.count()
            if (r2 < r0) goto L49
            androidx.constraintlayout.helper.widget.Carousel$Adapter r2 = r1.mAdapter
            int r2 = r2.count()
            int r2 = r2 + (-1)
            r1.mIndex = r2
        L49:
            int r2 = r1.mIndex
            if (r2 >= 0) goto L4f
            r1.mIndex = r3
        L4f:
            int r2 = r1.mPreviousIndex
            int r3 = r1.mIndex
            if (r2 == r3) goto L5c
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            java.lang.Runnable r3 = r1.mUpdateRunnable
            r2.post(r3)
        L5c:
            return
    }

    public void refresh() {
            r5 = this;
            java.util.ArrayList<android.view.View> r0 = r5.mList
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L26
            java.util.ArrayList<android.view.View> r3 = r5.mList
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            androidx.constraintlayout.helper.widget.Carousel$Adapter r4 = r5.mAdapter
            int r4 = r4.count()
            if (r4 != 0) goto L20
            int r4 = r5.emptyViewBehavior
            r5.updateViewVisibility(r3, r4)
            goto L23
        L20:
            r5.updateViewVisibility(r3, r1)
        L23:
            int r2 = r2 + 1
            goto L8
        L26:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r5.mMotionLayout
            r0.rebuildScene()
            r5.updateItems()
            return
    }

    public void setAdapter(androidx.constraintlayout.helper.widget.Carousel.Adapter r1) {
            r0 = this;
            r0.mAdapter = r1
            return
    }

    public void transitionToIndex(int r3, int r4) {
            r2 = this;
            int r0 = r2.getCount()
            int r0 = r0 + (-1)
            int r0 = java.lang.Math.min(r0, r3)
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            r2.mTargetIndex = r0
            int r4 = java.lang.Math.max(r1, r4)
            r2.mAnimateTargetDelay = r4
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            r0.setTransitionDuration(r4)
            int r4 = r2.mIndex
            if (r3 >= r4) goto L2a
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.mMotionLayout
            int r4 = r2.previousState
            int r0 = r2.mAnimateTargetDelay
            r3.transitionToState(r4, r0)
            goto L33
        L2a:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.mMotionLayout
            int r4 = r2.nextState
            int r0 = r2.mAnimateTargetDelay
            r3.transitionToState(r4, r0)
        L33:
            return
    }
}
