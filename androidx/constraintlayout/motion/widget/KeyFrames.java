package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class KeyFrames {
    private static final java.lang.String CUSTOM_ATTRIBUTE = "CustomAttribute";
    private static final java.lang.String CUSTOM_METHOD = "CustomMethod";
    private static final java.lang.String TAG = "KeyFrames";
    public static final int UNSET = -1;
    static java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> sKeyMakers;
    private java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> mFramesMap;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers = r0
            java.lang.String r1 = "KeyAttribute"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyAttributes> r2 = androidx.constraintlayout.motion.widget.KeyAttributes.class
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r0 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.String r1 = "KeyPosition"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyPosition> r2 = androidx.constraintlayout.motion.widget.KeyPosition.class
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r0 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.String r1 = "KeyCycle"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyCycle> r2 = androidx.constraintlayout.motion.widget.KeyCycle.class
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r0 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.String r1 = "KeyTimeCycle"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyTimeCycle> r2 = androidx.constraintlayout.motion.widget.KeyTimeCycle.class
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r0 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.String r1 = "KeyTrigger"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyTrigger> r2 = androidx.constraintlayout.motion.widget.KeyTrigger.class
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            goto L5a
        L52:
            r0 = move-exception
            java.lang.String r1 = "KeyFrames"
            java.lang.String r2 = "unable to load"
            android.util.Log.e(r1, r2, r0)
        L5a:
            return
    }

    public KeyFrames() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mFramesMap = r0
            return
    }

    public KeyFrames(android.content.Context r7, org.xmlpull.v1.XmlPullParser r8) {
            r6 = this;
            r6.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.mFramesMap = r0
            int r0 = r8.getEventType()     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            r1 = 0
        Lf:
            r2 = 1
            if (r0 == r2) goto Lb5
            r2 = 2
            if (r0 == r2) goto L27
            r2 = 3
            if (r0 == r2) goto L1a
            goto La6
        L1a:
            java.lang.String r0 = "KeyFrameSet"
            java.lang.String r2 = r8.getName()     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r0 == 0) goto La6
            return
        L27:
            java.lang.String r0 = r8.getName()     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r2 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            boolean r2 = r2.containsKey(r0)     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r2 == 0) goto L7f
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r2 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r2 == 0) goto L53
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            java.lang.Object r0 = r2.newInstance(r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            androidx.constraintlayout.motion.widget.Key r0 = (androidx.constraintlayout.motion.widget.Key) r0     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r8)     // Catch: java.lang.Exception -> L51 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            r0.load(r7, r1)     // Catch: java.lang.Exception -> L51 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            r6.addKey(r0)     // Catch: java.lang.Exception -> L51 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            goto L7d
        L51:
            r1 = move-exception
            goto L76
        L53:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            r3.<init>()     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            java.lang.String r4 = "Keymaker for "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            java.lang.String r3 = " not found"
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            r2.<init>(r0)     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            throw r2     // Catch: java.lang.Exception -> L72 java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
        L72:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L76:
            java.lang.String r2 = "KeyFrames"
            java.lang.String r3 = "unable to create "
            android.util.Log.e(r2, r3, r1)     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
        L7d:
            r1 = r0
            goto La6
        L7f:
            java.lang.String r2 = "CustomAttribute"
            boolean r2 = r0.equalsIgnoreCase(r2)     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r2 == 0) goto L93
            if (r1 == 0) goto La6
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mCustomConstraints     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r0 == 0) goto La6
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mCustomConstraints     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r7, r8, r0)     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            goto La6
        L93:
            java.lang.String r2 = "CustomMethod"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r0 == 0) goto La6
            if (r1 == 0) goto La6
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mCustomConstraints     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            if (r0 == 0) goto La6
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mCustomConstraints     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r7, r8, r0)     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
        La6:
            int r0 = r8.next()     // Catch: java.io.IOException -> Lac org.xmlpull.v1.XmlPullParserException -> Lb1
            goto Lf
        Lac:
            r7 = move-exception
            r7.printStackTrace()
            goto Lb5
        Lb1:
            r7 = move-exception
            r7.printStackTrace()
        Lb5:
            return
    }

    static java.lang.String name(int r0, android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r0 = r1.getResourceEntryName(r0)
            return r0
    }

    public void addAllFrames(androidx.constraintlayout.motion.widget.MotionController r3) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r2.mFramesMap
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L12
            r3.addKeys(r0)
        L12:
            return
    }

    public void addFrames(androidx.constraintlayout.motion.widget.MotionController r4) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            int r1 = r4.mId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L13
            r4.addKeys(r0)
        L13:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L46
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.Key r1 = (androidx.constraintlayout.motion.widget.Key) r1
            android.view.View r2 = r4.mView
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            java.lang.String r2 = r2.constraintTag
            boolean r2 = r1.matches(r2)
            if (r2 == 0) goto L26
            r4.addKey(r1)
            goto L26
        L46:
            return
    }

    public void addKey(androidx.constraintlayout.motion.widget.Key r4) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            int r1 = r4.mTargetId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1e
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            int r1 = r4.mTargetId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.put(r1, r2)
        L1e:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            int r1 = r4.mTargetId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L31
            r0.add(r4)
        L31:
            return
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> getKeyFramesForView(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r1.mFramesMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            return r2
    }

    public java.util.Set<java.lang.Integer> getKeys() {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r1.mFramesMap
            java.util.Set r0 = r0.keySet()
            return r0
    }
}
