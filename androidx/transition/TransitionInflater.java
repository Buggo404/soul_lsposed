package androidx.transition;

/* loaded from: classes.dex */
public class TransitionInflater {
    private static final androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Constructor<?>> CONSTRUCTORS = null;
    private static final java.lang.Class<?>[] CONSTRUCTOR_SIGNATURE = null;
    private final android.content.Context mContext;

    static {
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            androidx.transition.TransitionInflater.CONSTRUCTOR_SIGNATURE = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            androidx.transition.TransitionInflater.CONSTRUCTORS = r0
            return
    }

    private TransitionInflater(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    private java.lang.Object createCustom(android.util.AttributeSet r7, java.lang.Class<?> r8, java.lang.String r9) {
            r6 = this;
            r0 = 0
            java.lang.String r1 = "class"
            java.lang.String r0 = r7.getAttributeValue(r0, r1)
            if (r0 == 0) goto L64
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Constructor<?>> r9 = androidx.transition.TransitionInflater.CONSTRUCTORS     // Catch: java.lang.Exception -> L44
            monitor-enter(r9)     // Catch: java.lang.Exception -> L44
            java.lang.Object r1 = r9.get(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1     // Catch: java.lang.Throwable -> L41
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L32
            android.content.Context r4 = r6.mContext     // Catch: java.lang.Throwable -> L41
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L41
            java.lang.Class r4 = java.lang.Class.forName(r0, r3, r4)     // Catch: java.lang.Throwable -> L41
            java.lang.Class r4 = r4.asSubclass(r8)     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L32
            java.lang.Class<?>[] r1 = androidx.transition.TransitionInflater.CONSTRUCTOR_SIGNATURE     // Catch: java.lang.Throwable -> L41
            java.lang.reflect.Constructor r1 = r4.getConstructor(r1)     // Catch: java.lang.Throwable -> L41
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L41
            r9.put(r0, r1)     // Catch: java.lang.Throwable -> L41
        L32:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L41
            android.content.Context r5 = r6.mContext     // Catch: java.lang.Throwable -> L41
            r4[r3] = r5     // Catch: java.lang.Throwable -> L41
            r4[r2] = r7     // Catch: java.lang.Throwable -> L41
            java.lang.Object r7 = r1.newInstance(r4)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L41
            return r7
        L41:
            r7 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L41
            throw r7     // Catch: java.lang.Exception -> L44
        L44:
            r7 = move-exception
            android.view.InflateException r9 = new android.view.InflateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not instantiate "
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r1 = " class "
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8, r7)
            throw r9
        L64:
            android.view.InflateException r7 = new android.view.InflateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " tag must have a 'class' attribute"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    private androidx.transition.Transition createTransitionFromXml(org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, androidx.transition.Transition r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r7 = this;
            int r0 = r8.getDepth()
            boolean r1 = r10 instanceof androidx.transition.TransitionSet
            r2 = 0
            if (r1 == 0) goto Ld
            r1 = r10
            androidx.transition.TransitionSet r1 = (androidx.transition.TransitionSet) r1
            goto Le
        Ld:
            r1 = r2
        Le:
            r3 = r2
        Lf:
            int r4 = r8.next()
            r5 = 3
            if (r4 != r5) goto L1c
            int r5 = r8.getDepth()
            if (r5 <= r0) goto L17b
        L1c:
            r5 = 1
            if (r4 == r5) goto L17b
            r5 = 2
            if (r4 == r5) goto L23
            goto Lf
        L23:
            java.lang.String r4 = r8.getName()
            java.lang.String r5 = "fade"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L38
            androidx.transition.Fade r3 = new androidx.transition.Fade
            android.content.Context r4 = r7.mContext
            r3.<init>(r4, r9)
            goto L13c
        L38:
            java.lang.String r5 = "changeBounds"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L49
            androidx.transition.ChangeBounds r3 = new androidx.transition.ChangeBounds
            android.content.Context r4 = r7.mContext
            r3.<init>(r4, r9)
            goto L13c
        L49:
            java.lang.String r5 = "slide"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L5a
            androidx.transition.Slide r3 = new androidx.transition.Slide
            android.content.Context r4 = r7.mContext
            r3.<init>(r4, r9)
            goto L13c
        L5a:
            java.lang.String r5 = "explode"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L6b
            androidx.transition.Explode r3 = new androidx.transition.Explode
            android.content.Context r4 = r7.mContext
            r3.<init>(r4, r9)
            goto L13c
        L6b:
            java.lang.String r5 = "changeImageTransform"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L7c
            androidx.transition.ChangeImageTransform r3 = new androidx.transition.ChangeImageTransform
            android.content.Context r4 = r7.mContext
            r3.<init>(r4, r9)
            goto L13c
        L7c:
            java.lang.String r5 = "changeTransform"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L8d
            androidx.transition.ChangeTransform r3 = new androidx.transition.ChangeTransform
            android.content.Context r4 = r7.mContext
            r3.<init>(r4, r9)
            goto L13c
        L8d:
            java.lang.String r5 = "changeClipBounds"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L9e
            androidx.transition.ChangeClipBounds r3 = new androidx.transition.ChangeClipBounds
            android.content.Context r4 = r7.mContext
            r3.<init>(r4, r9)
            goto L13c
        L9e:
            java.lang.String r5 = "autoTransition"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto Laf
            androidx.transition.AutoTransition r3 = new androidx.transition.AutoTransition
            android.content.Context r4 = r7.mContext
            r3.<init>(r4, r9)
            goto L13c
        Laf:
            java.lang.String r5 = "changeScroll"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto Lc0
            androidx.transition.ChangeScroll r3 = new androidx.transition.ChangeScroll
            android.content.Context r4 = r7.mContext
            r3.<init>(r4, r9)
            goto L13c
        Lc0:
            java.lang.String r5 = "transitionSet"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto Ld0
            androidx.transition.TransitionSet r3 = new androidx.transition.TransitionSet
            android.content.Context r4 = r7.mContext
            r3.<init>(r4, r9)
            goto L13c
        Ld0:
            java.lang.String r5 = "transition"
            boolean r6 = r5.equals(r4)
            if (r6 == 0) goto Le1
            java.lang.Class<androidx.transition.Transition> r3 = androidx.transition.Transition.class
            java.lang.Object r3 = r7.createCustom(r9, r3, r5)
            androidx.transition.Transition r3 = (androidx.transition.Transition) r3
            goto L13c
        Le1:
            java.lang.String r5 = "targets"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto Led
            r7.getTargetIds(r8, r9, r10)
            goto L13c
        Led:
            java.lang.String r5 = "arcMotion"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L10a
            if (r10 == 0) goto L102
            androidx.transition.ArcMotion r4 = new androidx.transition.ArcMotion
            android.content.Context r5 = r7.mContext
            r4.<init>(r5, r9)
            r10.setPathMotion(r4)
            goto L13c
        L102:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Invalid use of arcMotion element"
            r8.<init>(r9)
            throw r8
        L10a:
            java.lang.String r5 = "pathMotion"
            boolean r6 = r5.equals(r4)
            if (r6 == 0) goto L128
            if (r10 == 0) goto L120
            java.lang.Class<androidx.transition.PathMotion> r4 = androidx.transition.PathMotion.class
            java.lang.Object r4 = r7.createCustom(r9, r4, r5)
            androidx.transition.PathMotion r4 = (androidx.transition.PathMotion) r4
            r10.setPathMotion(r4)
            goto L13c
        L120:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Invalid use of pathMotion element"
            r8.<init>(r9)
            throw r8
        L128:
            java.lang.String r5 = "patternPathMotion"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L162
            if (r10 == 0) goto L15a
            androidx.transition.PatternPathMotion r4 = new androidx.transition.PatternPathMotion
            android.content.Context r5 = r7.mContext
            r4.<init>(r5, r9)
            r10.setPathMotion(r4)
        L13c:
            if (r3 == 0) goto Lf
            boolean r4 = r8.isEmptyElementTag()
            if (r4 != 0) goto L147
            r7.createTransitionFromXml(r8, r9, r3)
        L147:
            if (r1 == 0) goto L14e
            r1.addTransition(r3)
            goto Le
        L14e:
            if (r10 != 0) goto L152
            goto Lf
        L152:
            android.view.InflateException r8 = new android.view.InflateException
            java.lang.String r9 = "Could not add transition to another transition."
            r8.<init>(r9)
            throw r8
        L15a:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Invalid use of patternPathMotion element"
            r8.<init>(r9)
            throw r8
        L162:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown scene name: "
            r10.<init>(r0)
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r8 = r10.append(r8)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L17b:
            return r3
    }

    private androidx.transition.TransitionManager createTransitionManagerFromXml(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r4 = this;
            int r0 = r5.getDepth()
            r1 = 0
        L5:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r5.getDepth()
            if (r3 <= r0) goto L52
        L12:
            r3 = 1
            if (r2 == r3) goto L52
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "transitionManager"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2b
            androidx.transition.TransitionManager r1 = new androidx.transition.TransitionManager
            r1.<init>()
            goto L5
        L2b:
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L39
            if (r1 == 0) goto L39
            r4.loadTransition(r6, r5, r7, r1)
            goto L5
        L39:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown scene name: "
            r7.<init>(r0)
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L52:
            return r1
    }

    public static androidx.transition.TransitionInflater from(android.content.Context r1) {
            androidx.transition.TransitionInflater r0 = new androidx.transition.TransitionInflater
            r0.<init>(r1)
            return r0
    }

    private void getTargetIds(org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, androidx.transition.Transition r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r7 = this;
            int r0 = r8.getDepth()
        L4:
            int r1 = r8.next()
            r2 = 3
            if (r1 != r2) goto L11
            int r3 = r8.getDepth()
            if (r3 <= r0) goto Lb4
        L11:
            r3 = 1
            if (r1 == r3) goto Lb4
            r4 = 2
            if (r1 == r4) goto L18
            goto L4
        L18:
            java.lang.String r1 = r8.getName()
            java.lang.String r5 = "target"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L9b
            android.content.Context r1 = r7.mContext
            int[] r5 = androidx.transition.Styleable.TRANSITION_TARGET
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r9, r5)
            java.lang.String r5 = "targetId"
            r6 = 0
            int r5 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r1, r8, r5, r3, r6)
            if (r5 == 0) goto L39
            r10.addTarget(r5)
            goto L7e
        L39:
            java.lang.String r5 = "excludeId"
            int r4 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r1, r8, r5, r4, r6)
            if (r4 == 0) goto L45
            r10.excludeTarget(r4, r3)
            goto L7e
        L45:
            java.lang.String r4 = "targetName"
            r5 = 4
            java.lang.String r4 = androidx.core.content.res.TypedArrayUtils.getNamedString(r1, r8, r4, r5)
            if (r4 == 0) goto L52
            r10.addTarget(r4)
            goto L7e
        L52:
            java.lang.String r4 = "excludeName"
            r5 = 5
            java.lang.String r4 = androidx.core.content.res.TypedArrayUtils.getNamedString(r1, r8, r4, r5)
            if (r4 == 0) goto L5f
            r10.excludeTarget(r4, r3)
            goto L7e
        L5f:
            java.lang.String r4 = "excludeClass"
            java.lang.String r2 = androidx.core.content.res.TypedArrayUtils.getNamedString(r1, r8, r4, r2)
            if (r2 == 0) goto L6f
            java.lang.Class r4 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L82
            r10.excludeTarget(r4, r3)     // Catch: java.lang.ClassNotFoundException -> L82
            goto L7e
        L6f:
            java.lang.String r3 = "targetClass"
            java.lang.String r2 = androidx.core.content.res.TypedArrayUtils.getNamedString(r1, r8, r3, r6)     // Catch: java.lang.ClassNotFoundException -> L82
            if (r2 == 0) goto L7e
            java.lang.Class r3 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L82
            r10.addTarget(r3)     // Catch: java.lang.ClassNotFoundException -> L82
        L7e:
            r1.recycle()
            goto L4
        L82:
            r8 = move-exception
            r1.recycle()
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not create "
            r10.<init>(r0)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10, r8)
            throw r9
        L9b:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown scene name: "
            r10.<init>(r0)
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r8 = r10.append(r8)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        Lb4:
            return
    }

    private void loadTransition(android.util.AttributeSet r7, org.xmlpull.v1.XmlPullParser r8, android.view.ViewGroup r9, androidx.transition.TransitionManager r10) throws android.content.res.Resources.NotFoundException {
            r6 = this;
            android.content.Context r0 = r6.mContext
            int[] r1 = androidx.transition.Styleable.TRANSITION_MANAGER
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            java.lang.String r0 = "transition"
            r1 = 2
            r2 = -1
            int r0 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r7, r8, r0, r1, r2)
            java.lang.String r1 = "fromScene"
            r3 = 0
            int r1 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r7, r8, r1, r3, r2)
            r3 = 0
            if (r1 >= 0) goto L1c
            r1 = r3
            goto L22
        L1c:
            android.content.Context r4 = r6.mContext
            androidx.transition.Scene r1 = androidx.transition.Scene.getSceneForLayout(r9, r1, r4)
        L22:
            java.lang.String r4 = "toScene"
            r5 = 1
            int r8 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r7, r8, r4, r5, r2)
            if (r8 >= 0) goto L2c
            goto L32
        L2c:
            android.content.Context r2 = r6.mContext
            androidx.transition.Scene r3 = androidx.transition.Scene.getSceneForLayout(r9, r8, r2)
        L32:
            if (r0 < 0) goto L5b
            androidx.transition.Transition r8 = r6.inflateTransition(r0)
            if (r8 == 0) goto L5b
            if (r3 == 0) goto L46
            if (r1 != 0) goto L42
            r10.setTransition(r3, r8)
            goto L5b
        L42:
            r10.setTransition(r1, r3, r8)
            goto L5b
        L46:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "No toScene for transition ID "
            r8.<init>(r9)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5b:
            r7.recycle()
            return
    }

    public androidx.transition.Transition inflateTransition(int r5) {
            r4 = this;
            android.content.Context r0 = r4.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r5 = r0.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19 org.xmlpull.v1.XmlPullParserException -> L3f
            r1 = 0
            androidx.transition.Transition r0 = r4.createTransitionFromXml(r5, r0, r1)     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19 org.xmlpull.v1.XmlPullParserException -> L3f
            r5.close()
            return r0
        L17:
            r0 = move-exception
            goto L4a
        L19:
            r0 = move-exception
            android.view.InflateException r1 = new android.view.InflateException     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r2.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = r5.getPositionDescription()     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L17
        L3f:
            r0 = move-exception
            android.view.InflateException r1 = new android.view.InflateException     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L17
        L4a:
            r5.close()
            throw r0
    }

    public androidx.transition.TransitionManager inflateTransitionManager(int r4, android.view.ViewGroup r5) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r4 = r0.getXml(r4)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r4)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18 org.xmlpull.v1.XmlPullParserException -> L41
            androidx.transition.TransitionManager r5 = r3.createTransitionManagerFromXml(r4, r0, r5)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18 org.xmlpull.v1.XmlPullParserException -> L41
            r4.close()
            return r5
        L16:
            r5 = move-exception
            goto L4f
        L18:
            r5 = move-exception
            android.view.InflateException r0 = new android.view.InflateException     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r4.getPositionDescription()     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r5.getMessage()     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            r0.initCause(r5)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L41:
            r5 = move-exception
            android.view.InflateException r0 = new android.view.InflateException     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r5.getMessage()     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            r0.initCause(r5)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L4f:
            r4.close()
            throw r5
    }
}
