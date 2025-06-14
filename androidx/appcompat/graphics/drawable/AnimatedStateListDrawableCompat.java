package androidx.appcompat.graphics.drawable;

/* loaded from: classes.dex */
public class AnimatedStateListDrawableCompat extends androidx.appcompat.graphics.drawable.StateListDrawable implements androidx.core.graphics.drawable.TintAwareDrawable {
    private static final java.lang.String ELEMENT_ITEM = "item";
    private static final java.lang.String ELEMENT_TRANSITION = "transition";
    private static final java.lang.String ITEM_MISSING_DRAWABLE_ERROR = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final java.lang.String LOGTAG = "AnimatedStateListDrawableCompat";
    private static final java.lang.String TRANSITION_MISSING_DRAWABLE_ERROR = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final java.lang.String TRANSITION_MISSING_FROM_TO_ID = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private boolean mMutated;
    private androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState mState;
    private androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition mTransition;
    private int mTransitionFromIndex;
    private int mTransitionToIndex;

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$1 */
    static /* synthetic */ class C00441 {
    }

    private static class AnimatableTransition extends androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition {

        /* renamed from: mA */
        private final android.graphics.drawable.Animatable f12mA;

        AnimatableTransition(android.graphics.drawable.Animatable r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f12mA = r2
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
                r1 = this;
                android.graphics.drawable.Animatable r0 = r1.f12mA
                r0.start()
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
                r1 = this;
                android.graphics.drawable.Animatable r0 = r1.f12mA
                r0.stop()
                return
        }
    }

    static class AnimatedStateListState extends androidx.appcompat.graphics.drawable.StateListDrawable.StateListState {
        private static final long REVERSED_BIT = 4294967296L;
        private static final long REVERSIBLE_FLAG_BIT = 8589934592L;
        androidx.collection.SparseArrayCompat<java.lang.Integer> mStateIds;
        androidx.collection.LongSparseArray<java.lang.Long> mTransitions;

        AnimatedStateListState(androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState r1, androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r2, android.content.res.Resources r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                if (r1 == 0) goto Le
                androidx.collection.LongSparseArray<java.lang.Long> r2 = r1.mTransitions
                r0.mTransitions = r2
                androidx.collection.SparseArrayCompat<java.lang.Integer> r1 = r1.mStateIds
                r0.mStateIds = r1
                goto L1c
            Le:
                androidx.collection.LongSparseArray r1 = new androidx.collection.LongSparseArray
                r1.<init>()
                r0.mTransitions = r1
                androidx.collection.SparseArrayCompat r1 = new androidx.collection.SparseArrayCompat
                r1.<init>()
                r0.mStateIds = r1
            L1c:
                return
        }

        private static long generateTransitionKey(int r2, int r3) {
                long r0 = (long) r2
                r2 = 32
                long r0 = r0 << r2
                long r2 = (long) r3
                long r2 = r2 | r0
                return r2
        }

        int addStateSet(int[] r1, android.graphics.drawable.Drawable r2, int r3) {
                r0 = this;
                int r1 = super.addStateSet(r1, r2)
                androidx.collection.SparseArrayCompat<java.lang.Integer> r2 = r0.mStateIds
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.put(r1, r3)
                return r1
        }

        int addTransition(int r10, int r11, android.graphics.drawable.Drawable r12, boolean r13) {
                r9 = this;
                int r12 = super.addChild(r12)
                long r0 = generateTransitionKey(r10, r11)
                if (r13 == 0) goto L10
                r2 = 8589934592(0x200000000, double:4.243991582E-314)
                goto L12
            L10:
                r2 = 0
            L12:
                androidx.collection.LongSparseArray<java.lang.Long> r4 = r9.mTransitions
                long r5 = (long) r12
                long r7 = r5 | r2
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r4.append(r0, r7)
                if (r13 == 0) goto L34
                long r10 = generateTransitionKey(r11, r10)
                androidx.collection.LongSparseArray<java.lang.Long> r13 = r9.mTransitions
                r0 = 4294967296(0x100000000, double:2.121995791E-314)
                long r0 = r0 | r5
                long r0 = r0 | r2
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r13.append(r10, r0)
            L34:
                return r12
        }

        int getKeyframeIdAt(int r3) {
                r2 = this;
                r0 = 0
                if (r3 >= 0) goto L4
                goto L14
            L4:
                androidx.collection.SparseArrayCompat<java.lang.Integer> r1 = r2.mStateIds
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r3 = r1.get(r3, r0)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r0 = r3.intValue()
            L14:
                return r0
        }

        int indexOfKeyframe(int[] r1) {
                r0 = this;
                int r1 = super.indexOfStateSet(r1)
                if (r1 < 0) goto L7
                return r1
            L7:
                int[] r1 = android.util.StateSet.WILD_CARD
                int r1 = super.indexOfStateSet(r1)
                return r1
        }

        int indexOfTransition(int r4, int r5) {
                r3 = this;
                long r4 = generateTransitionKey(r4, r5)
                androidx.collection.LongSparseArray<java.lang.Long> r0 = r3.mTransitions
                r1 = -1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.Object r4 = r0.get(r4, r1)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                int r4 = (int) r4
                return r4
        }

        boolean isTransitionReversed(int r4, int r5) {
                r3 = this;
                long r4 = generateTransitionKey(r4, r5)
                androidx.collection.LongSparseArray<java.lang.Long> r0 = r3.mTransitions
                r1 = -1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.Object r4 = r0.get(r4, r1)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r0 = 4294967296(0x100000000, double:2.121995791E-314)
                long r4 = r4 & r0
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 == 0) goto L24
                r4 = 1
                goto L25
            L24:
                r4 = 0
            L25:
                return r4
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawable.StateListState, androidx.appcompat.graphics.drawable.DrawableContainer.DrawableContainerState
        void mutate() {
                r1 = this;
                androidx.collection.LongSparseArray<java.lang.Long> r0 = r1.mTransitions
                androidx.collection.LongSparseArray r0 = r0.clone()
                r1.mTransitions = r0
                androidx.collection.SparseArrayCompat<java.lang.Integer> r0 = r1.mStateIds
                androidx.collection.SparseArrayCompat r0 = r0.clone()
                r1.mStateIds = r0
                return
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawable.StateListState, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r0 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawable.StateListState, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r0 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat
                r0.<init>(r1, r2)
                return r0
        }

        boolean transitionHasReversibleFlag(int r4, int r5) {
                r3 = this;
                long r4 = generateTransitionKey(r4, r5)
                androidx.collection.LongSparseArray<java.lang.Long> r0 = r3.mTransitions
                r1 = -1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.Object r4 = r0.get(r4, r1)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r0 = 8589934592(0x200000000, double:4.243991582E-314)
                long r4 = r4 & r0
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 == 0) goto L24
                r4 = 1
                goto L25
            L24:
                r4 = 0
            L25:
                return r4
        }
    }

    private static class AnimatedVectorDrawableTransition extends androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition {
        private final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat mAvd;

        AnimatedVectorDrawableTransition(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mAvd = r2
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
                r1 = this;
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = r1.mAvd
                r0.start()
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
                r1 = this;
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = r1.mAvd
                r0.stop()
                return
        }
    }

    private static class AnimationDrawableTransition extends androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition {
        private final android.animation.ObjectAnimator mAnim;
        private final boolean mHasReversibleFlag;

        AnimationDrawableTransition(android.graphics.drawable.AnimationDrawable r6, boolean r7, boolean r8) {
                r5 = this;
                r0 = 0
                r5.<init>(r0)
                int r0 = r6.getNumberOfFrames()
                r1 = 0
                if (r7 == 0) goto Le
                int r2 = r0 + (-1)
                goto Lf
            Le:
                r2 = r1
            Lf:
                r3 = 1
                if (r7 == 0) goto L14
                r0 = r1
                goto L15
            L14:
                int r0 = r0 - r3
            L15:
                androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$FrameInterpolator r4 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$FrameInterpolator
                r4.<init>(r6, r7)
                r7 = 2
                int[] r7 = new int[r7]
                r7[r1] = r2
                r7[r3] = r0
                java.lang.String r0 = "currentIndex"
                android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofInt(r6, r0, r7)
                r6.setAutoCancel(r3)
                int r7 = r4.getTotalDuration()
                long r0 = (long) r7
                r6.setDuration(r0)
                r6.setInterpolator(r4)
                r5.mHasReversibleFlag = r8
                r5.mAnim = r6
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public boolean canReverse() {
                r1 = this;
                boolean r0 = r1.mHasReversibleFlag
                return r0
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void reverse() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.mAnim
                r0.reverse()
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.mAnim
                r0.start()
                return
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.mAnim
                r0.cancel()
                return
        }
    }

    private static class FrameInterpolator implements android.animation.TimeInterpolator {
        private int[] mFrameTimes;
        private int mFrames;
        private int mTotalDuration;

        FrameInterpolator(android.graphics.drawable.AnimationDrawable r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.updateFrames(r1, r2)
                return
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float r5) {
                r4 = this;
                int r0 = r4.mTotalDuration
                float r0 = (float) r0
                float r5 = r5 * r0
                r0 = 1056964608(0x3f000000, float:0.5)
                float r5 = r5 + r0
                int r5 = (int) r5
                int r0 = r4.mFrames
                int[] r1 = r4.mFrameTimes
                r2 = 0
            Ld:
                if (r2 >= r0) goto L17
                r3 = r1[r2]
                if (r5 < r3) goto L17
                int r5 = r5 - r3
                int r2 = r2 + 1
                goto Ld
            L17:
                if (r2 >= r0) goto L1f
                float r5 = (float) r5
                int r1 = r4.mTotalDuration
                float r1 = (float) r1
                float r5 = r5 / r1
                goto L20
            L1f:
                r5 = 0
            L20:
                float r1 = (float) r2
                float r0 = (float) r0
                float r1 = r1 / r0
                float r1 = r1 + r5
                return r1
        }

        int getTotalDuration() {
                r1 = this;
                int r0 = r1.mTotalDuration
                return r0
        }

        int updateFrames(android.graphics.drawable.AnimationDrawable r6, boolean r7) {
                r5 = this;
                int r0 = r6.getNumberOfFrames()
                r5.mFrames = r0
                int[] r1 = r5.mFrameTimes
                if (r1 == 0) goto Ld
                int r1 = r1.length
                if (r1 >= r0) goto L11
            Ld:
                int[] r1 = new int[r0]
                r5.mFrameTimes = r1
            L11:
                int[] r1 = r5.mFrameTimes
                r2 = 0
                r3 = r2
            L15:
                if (r2 >= r0) goto L29
                if (r7 == 0) goto L1e
                int r4 = r0 - r2
                int r4 = r4 + (-1)
                goto L1f
            L1e:
                r4 = r2
            L1f:
                int r4 = r6.getDuration(r4)
                r1[r2] = r4
                int r3 = r3 + r4
                int r2 = r2 + 1
                goto L15
            L29:
                r5.mTotalDuration = r3
                return r3
        }
    }

    private static abstract class Transition {
        private Transition() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Transition(androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.C00441 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean canReverse() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void reverse() {
                r0 = this;
                return
        }

        public abstract void start();

        public abstract void stop();
    }

    static {
            return
    }

    public AnimatedStateListDrawableCompat() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    AnimatedStateListDrawableCompat(androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState r2, android.content.res.Resources r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = -1
            r1.mTransitionToIndex = r0
            r1.mTransitionFromIndex = r0
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState
            r0.<init>(r2, r1, r3)
            r1.setConstantState(r0)
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
            r1.jumpToCurrentState()
            return
    }

    public static androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat create(android.content.Context r6, int r7, android.content.res.Resources.Theme r8) {
            java.lang.String r0 = "parser error"
            android.content.res.Resources r1 = r6.getResources()     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2f
            android.content.res.XmlResourceParser r7 = r1.getXml(r7)     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2f
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2f
        Le:
            int r3 = r7.next()     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2f
            r4 = 2
            if (r3 == r4) goto L19
            r5 = 1
            if (r3 == r5) goto L19
            goto Le
        L19:
            if (r3 != r4) goto L20
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r6 = createFromXmlInner(r6, r1, r7, r2, r8)     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2f
            return r6
        L20:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2f
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2f
            throw r6     // Catch: java.io.IOException -> L28 org.xmlpull.v1.XmlPullParserException -> L2f
        L28:
            r6 = move-exception
            java.lang.String r7 = androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.LOGTAG
            android.util.Log.e(r7, r0, r6)
            goto L35
        L2f:
            r6 = move-exception
            java.lang.String r7 = androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.LOGTAG
            android.util.Log.e(r7, r0, r6)
        L35:
            r6 = 0
            return r6
    }

    public static androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat createFromXmlInner(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            java.lang.String r0 = r10.getName()
            java.lang.String r1 = "animated-selector"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1b
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r0 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat
            r0.<init>()
            r2 = r0
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2.inflate(r3, r4, r5, r6, r7)
            return r0
        L1b:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = ": invalid animated-selector tag "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    private void inflateChildElements(android.content.Context r6, android.content.res.Resources r7, org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, android.content.res.Resources.Theme r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r5 = this;
            int r0 = r8.getDepth()
            r1 = 1
            int r0 = r0 + r1
        L6:
            int r2 = r8.next()
            if (r2 == r1) goto L3c
            int r3 = r8.getDepth()
            if (r3 >= r0) goto L15
            r4 = 3
            if (r2 == r4) goto L3c
        L15:
            r4 = 2
            if (r2 == r4) goto L19
            goto L6
        L19:
            if (r3 <= r0) goto L1c
            goto L6
        L1c:
            java.lang.String r2 = r8.getName()
            java.lang.String r3 = "item"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2c
            r5.parseItem(r6, r7, r8, r9, r10)
            goto L6
        L2c:
            java.lang.String r2 = r8.getName()
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6
            r5.parseTransition(r6, r7, r8, r9, r10)
            goto L6
        L3c:
            return
    }

    private void init() {
            r1 = this;
            int[] r0 = r1.getState()
            r1.onStateChange(r0)
            return
    }

    private int parseItem(android.content.Context r5, android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r4 = this;
            int[] r0 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableItem
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r6, r9, r8, r0)
            int r1 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableItem_android_id
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableItem_android_drawable
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1f
            androidx.appcompat.widget.ResourceManagerInternal r3 = androidx.appcompat.widget.ResourceManagerInternal.get()
            android.graphics.drawable.Drawable r5 = r3.getDrawable(r5, r2)
            goto L20
        L1f:
            r5 = 0
        L20:
            r0.recycle()
            int[] r0 = r4.extractStateSet(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L67
        L2b:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L33
            goto L2b
        L33:
            r3 = 2
            if (r5 != r3) goto L4c
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L47
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r5 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.createFromXmlInner(r6, r7, r8, r9)
            goto L67
        L47:
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9)
            goto L67
        L4c:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L67:
            if (r5 == 0) goto L70
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r6 = r4.mState
            int r5 = r6.addStateSet(r0, r5, r1)
            return r5
        L70:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    private int parseTransition(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r7 = this;
            int[] r0 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableTransition
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r9, r12, r11, r0)
            int r1 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableTransition_android_fromId
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableTransition_android_toId
            int r3 = r0.getResourceId(r3, r2)
            int r4 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableTransition_android_drawable
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L24
            androidx.appcompat.widget.ResourceManagerInternal r5 = androidx.appcompat.widget.ResourceManagerInternal.get()
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r8, r4)
            goto L25
        L24:
            r4 = 0
        L25:
            int r5 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableTransition_android_reversible
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L6f
        L33:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L3b
            goto L33
        L3b:
            r6 = 2
            if (r4 != r6) goto L54
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4f
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r4 = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.createFromXmlInner(r8, r9, r10, r11, r12)
            goto L6f
        L4f:
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12)
            goto L6f
        L54:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L6f:
            if (r4 == 0) goto L99
            if (r1 == r2) goto L7c
            if (r3 == r2) goto L7c
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r8 = r7.mState
            int r8 = r8.addTransition(r1, r3, r4, r5)
            return r8
        L7c:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L99:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    private boolean selectTransition(int r10) {
            r9 = this;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition r0 = r9.mTransition
            r1 = 1
            if (r0 == 0) goto L24
            int r2 = r9.mTransitionToIndex
            if (r10 != r2) goto La
            return r1
        La:
            int r2 = r9.mTransitionFromIndex
            if (r10 != r2) goto L1e
            boolean r2 = r0.canReverse()
            if (r2 == 0) goto L1e
            r0.reverse()
            int r0 = r9.mTransitionFromIndex
            r9.mTransitionToIndex = r0
            r9.mTransitionFromIndex = r10
            return r1
        L1e:
            int r2 = r9.mTransitionToIndex
            r0.stop()
            goto L28
        L24:
            int r2 = r9.getCurrentIndex()
        L28:
            r0 = 0
            r9.mTransition = r0
            r0 = -1
            r9.mTransitionFromIndex = r0
            r9.mTransitionToIndex = r0
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r9.mState
            int r3 = r0.getKeyframeIdAt(r2)
            int r4 = r0.getKeyframeIdAt(r10)
            r5 = 0
            if (r4 == 0) goto L83
            if (r3 != 0) goto L40
            goto L83
        L40:
            int r6 = r0.indexOfTransition(r3, r4)
            if (r6 >= 0) goto L47
            return r5
        L47:
            boolean r7 = r0.transitionHasReversibleFlag(r3, r4)
            r9.selectDrawable(r6)
            android.graphics.drawable.Drawable r6 = r9.getCurrent()
            boolean r8 = r6 instanceof android.graphics.drawable.AnimationDrawable
            if (r8 == 0) goto L62
            boolean r0 = r0.isTransitionReversed(r3, r4)
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimationDrawableTransition r3 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimationDrawableTransition
            android.graphics.drawable.AnimationDrawable r6 = (android.graphics.drawable.AnimationDrawable) r6
            r3.<init>(r6, r0, r7)
            goto L79
        L62:
            boolean r0 = r6 instanceof androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
            if (r0 == 0) goto L6e
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition r3 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r6 = (androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) r6
            r3.<init>(r6)
            goto L79
        L6e:
            boolean r0 = r6 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L83
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatableTransition r3 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatableTransition
            android.graphics.drawable.Animatable r6 = (android.graphics.drawable.Animatable) r6
            r3.<init>(r6)
        L79:
            r3.start()
            r9.mTransition = r3
            r9.mTransitionFromIndex = r2
            r9.mTransitionToIndex = r10
            return r1
        L83:
            return r5
    }

    private void updateStateFromTypedArray(android.content.res.TypedArray r4) {
            r3 = this;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r3.mState
            int r1 = r0.mChangingConfigurations
            int r2 = r4.getChangingConfigurations()
            r1 = r1 | r2
            r0.mChangingConfigurations = r1
            int r1 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableCompat_android_variablePadding
            boolean r2 = r0.mVariablePadding
            boolean r1 = r4.getBoolean(r1, r2)
            r0.setVariablePadding(r1)
            int r1 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableCompat_android_constantSize
            boolean r2 = r0.mConstantSize
            boolean r1 = r4.getBoolean(r1, r2)
            r0.setConstantSize(r1)
            int r1 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration
            int r2 = r0.mEnterFadeDuration
            int r1 = r4.getInt(r1, r2)
            r0.setEnterFadeDuration(r1)
            int r1 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration
            int r2 = r0.mExitFadeDuration
            int r1 = r4.getInt(r1, r2)
            r0.setExitFadeDuration(r1)
            int r1 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableCompat_android_dither
            boolean r0 = r0.mDither
            boolean r4 = r4.getBoolean(r1, r0)
            r3.setDither(r4)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable
    public /* bridge */ /* synthetic */ void addState(int[] r1, android.graphics.drawable.Drawable r2) {
            r0 = this;
            super.addState(r1, r2)
            return
    }

    public void addState(int[] r2, android.graphics.drawable.Drawable r3, int r4) {
            r1 = this;
            if (r3 == 0) goto Lf
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r1.mState
            r0.addStateSet(r2, r3, r4)
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
            return
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Drawable must not be null"
            r2.<init>(r3)
            throw r2
    }

    public <T extends android.graphics.drawable.Drawable & android.graphics.drawable.Animatable> void addTransition(int r2, int r3, T r4, boolean r5) {
            r1 = this;
            if (r4 == 0) goto L8
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r1.mState
            r0.addTransition(r2, r3, r4, r5)
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Transition drawable must not be null"
            r2.<init>(r3)
            throw r2
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(android.content.res.Resources.Theme r1) {
            r0 = this;
            super.applyTheme(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
            r1 = this;
            boolean r0 = super.canApplyTheme()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer
    void clearMutated() {
            r1 = this;
            super.clearMutated()
            r0 = 0
            r1.mMutated = r0
            return
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer
    androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState cloneConstantState() {
            r3 = this;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r1 = r3.mState
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer
    /* bridge */ /* synthetic */ androidx.appcompat.graphics.drawable.DrawableContainer.DrawableContainerState cloneConstantState() {
            r1 = this;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r1.cloneConstantState()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer
    /* bridge */ /* synthetic */ androidx.appcompat.graphics.drawable.StateListDrawable.StateListState cloneConstantState() {
            r1 = this;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r1.cloneConstantState()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(android.graphics.Canvas r1) {
            r0 = this;
            super.draw(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
            r1 = this;
            int r0 = super.getAlpha()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
            r1 = this;
            int r0 = super.getChangingConfigurations()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = super.getCurrent()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(android.graphics.Rect r1) {
            r0 = this;
            super.getHotspotBounds(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
            r1 = this;
            int r0 = super.getIntrinsicHeight()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
            r1 = this;
            int r0 = super.getIntrinsicWidth()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
            r1 = this;
            int r0 = super.getMinimumHeight()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
            r1 = this;
            int r0 = super.getMinimumWidth()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
            r1 = this;
            int r0 = super.getOpacity()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(android.graphics.Outline r1) {
            r0 = this;
            super.getOutline(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect r1) {
            r0 = this;
            boolean r1 = super.getPadding(r1)
            return r1
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable
    public void inflate(android.content.Context r4, android.content.res.Resources r5, org.xmlpull.v1.XmlPullParser r6, android.util.AttributeSet r7, android.content.res.Resources.Theme r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r3 = this;
            int[] r0 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableCompat
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r5, r8, r7, r0)
            int r1 = androidx.appcompat.resources.C0046R.styleable.AnimatedStateListDrawableCompat_android_visible
            r2 = 1
            boolean r1 = r0.getBoolean(r1, r2)
            r3.setVisible(r1, r2)
            r3.updateStateFromTypedArray(r0)
            r3.updateDensity(r5)
            r0.recycle()
            r3.inflateChildElements(r4, r5, r6, r7, r8)
            r3.init()
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.invalidateDrawable(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
            r1 = this;
            boolean r0 = super.isAutoMirrored()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            super.jumpToCurrentState()
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition r0 = r1.mTransition
            if (r0 == 0) goto L17
            r0.stop()
            r0 = 0
            r1.mTransition = r0
            int r0 = r1.mTransitionToIndex
            r1.selectDrawable(r0)
            r0 = -1
            r1.mTransitionToIndex = r0
            r1.mTransitionFromIndex = r0
        L17:
            return
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.mMutated
            if (r0 != 0) goto L12
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r1) goto L12
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r1.mState
            r0.mutate()
            r0 = 1
            r1.mMutated = r0
        L12:
            return r1
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int r1) {
            r0 = this;
            boolean r1 = super.onLayoutDirectionChanged(r1)
            return r1
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r0 = r2.mState
            int r0 = r0.indexOfKeyframe(r3)
            int r1 = r2.getCurrentIndex()
            if (r0 == r1) goto L1a
            boolean r1 = r2.selectTransition(r0)
            if (r1 != 0) goto L18
            boolean r0 = r2.selectDrawable(r0)
            if (r0 == 0) goto L1a
        L18:
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            android.graphics.drawable.Drawable r1 = r2.getCurrent()
            if (r1 == 0) goto L26
            boolean r3 = r1.setState(r3)
            r0 = r0 | r3
        L26:
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            super.scheduleDrawable(r1, r2, r3)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int r1) {
            r0 = this;
            super.setAlpha(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean r1) {
            r0 = this;
            super.setAutoMirrored(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            super.setColorFilter(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer
    void setConstantState(androidx.appcompat.graphics.drawable.DrawableContainer.DrawableContainerState r2) {
            r1 = this;
            super.setConstantState(r2)
            boolean r0 = r2 instanceof androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState
            if (r0 == 0) goto Lb
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r2 = (androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState) r2
            r1.mState = r2
        Lb:
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean r1) {
            r0 = this;
            super.setDither(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer
    public /* bridge */ /* synthetic */ void setEnterFadeDuration(int r1) {
            r0 = this;
            super.setEnterFadeDuration(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer
    public /* bridge */ /* synthetic */ void setExitFadeDuration(int r1) {
            r0 = this;
            super.setExitFadeDuration(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float r1, float r2) {
            r0 = this;
            super.setHotspot(r1, r2)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setHotspotBounds(r1, r2, r3, r4)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public /* bridge */ /* synthetic */ void setTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTintList(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public /* bridge */ /* synthetic */ void setTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            super.setTintMode(r1)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$Transition r1 = r2.mTransition
            if (r1 == 0) goto L15
            if (r0 != 0) goto Lc
            if (r4 == 0) goto L15
        Lc:
            if (r3 == 0) goto L12
            r1.start()
            goto L15
        L12:
            r2.jumpToCurrentState()
        L15:
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            super.unscheduleDrawable(r1, r2)
            return
    }
}
