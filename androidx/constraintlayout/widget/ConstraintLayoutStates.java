package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final java.lang.String TAG = "ConstraintLayoutStates";
    private final androidx.constraintlayout.widget.ConstraintLayout mConstraintLayout;
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> mConstraintSetMap;
    private androidx.constraintlayout.widget.ConstraintsChangedListener mConstraintsChangedListener;
    int mCurrentConstraintNumber;
    int mCurrentStateId;
    androidx.constraintlayout.widget.ConstraintSet mDefaultConstraintSet;
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates.State> mStateList;

    static class State {
        int mConstraintID;
        androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
        int mId;
        java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates.Variant> mVariants;

        public State(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mVariants = r0
                r0 = -1
                r5.mConstraintID = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.State
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
                int r0 = r7.getIndexCount()
                r1 = 0
            L1c:
                if (r1 >= r0) goto L65
                int r2 = r7.getIndex(r1)
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.State_android_id
                if (r2 != r3) goto L2f
                int r3 = r5.mId
                int r2 = r7.getResourceId(r2, r3)
                r5.mId = r2
                goto L62
            L2f:
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.State_constraints
                if (r2 != r3) goto L62
                int r3 = r5.mConstraintID
                int r2 = r7.getResourceId(r2, r3)
                r5.mConstraintID = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.mConstraintID
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.mConstraintID
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L62
                androidx.constraintlayout.widget.ConstraintSet r2 = new androidx.constraintlayout.widget.ConstraintSet
                r2.<init>()
                r5.mConstraintSet = r2
                int r3 = r5.mConstraintID
                r2.clone(r6, r3)
            L62:
                int r1 = r1 + 1
                goto L1c
            L65:
                r7.recycle()
                return
        }

        void add(androidx.constraintlayout.widget.ConstraintLayoutStates.Variant r2) {
                r1 = this;
                java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r0 = r1.mVariants
                r0.add(r2)
                return
        }

        public int findMatch(float r3, float r4) {
                r2 = this;
                r0 = 0
            L1:
                java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r1 = r2.mVariants
                int r1 = r1.size()
                if (r0 >= r1) goto L1b
                java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r1 = r2.mVariants
                java.lang.Object r1 = r1.get(r0)
                androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r1 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r1
                boolean r1 = r1.match(r3, r4)
                if (r1 == 0) goto L18
                return r0
            L18:
                int r0 = r0 + 1
                goto L1
            L1b:
                r3 = -1
                return r3
        }
    }

    static class Variant {
        int mConstraintID;
        androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
        int mId;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                r0 = 2143289344(0x7fc00000, float:NaN)
                r5.mMinWidth = r0
                r5.mMinHeight = r0
                r5.mMaxWidth = r0
                r5.mMaxHeight = r0
                r0 = -1
                r5.mConstraintID = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.Variant
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
                int r0 = r7.getIndexCount()
                r1 = 0
            L1f:
                if (r1 >= r0) goto L97
                int r2 = r7.getIndex(r1)
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.Variant_constraints
                if (r2 != r3) goto L59
                int r3 = r5.mConstraintID
                int r2 = r7.getResourceId(r2, r3)
                r5.mConstraintID = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.mConstraintID
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.mConstraintID
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L94
                androidx.constraintlayout.widget.ConstraintSet r2 = new androidx.constraintlayout.widget.ConstraintSet
                r2.<init>()
                r5.mConstraintSet = r2
                int r3 = r5.mConstraintID
                r2.clone(r6, r3)
                goto L94
            L59:
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.Variant_region_heightLessThan
                if (r2 != r3) goto L66
                float r3 = r5.mMaxHeight
                float r2 = r7.getDimension(r2, r3)
                r5.mMaxHeight = r2
                goto L94
            L66:
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.Variant_region_heightMoreThan
                if (r2 != r3) goto L73
                float r3 = r5.mMinHeight
                float r2 = r7.getDimension(r2, r3)
                r5.mMinHeight = r2
                goto L94
            L73:
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.Variant_region_widthLessThan
                if (r2 != r3) goto L80
                float r3 = r5.mMaxWidth
                float r2 = r7.getDimension(r2, r3)
                r5.mMaxWidth = r2
                goto L94
            L80:
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.Variant_region_widthMoreThan
                if (r2 != r3) goto L8d
                float r3 = r5.mMinWidth
                float r2 = r7.getDimension(r2, r3)
                r5.mMinWidth = r2
                goto L94
            L8d:
                java.lang.String r2 = "ConstraintLayoutStates"
                java.lang.String r3 = "Unknown tag"
                android.util.Log.v(r2, r3)
            L94:
                int r1 = r1 + 1
                goto L1f
            L97:
                r7.recycle()
                return
        }

        boolean match(float r3, float r4) {
                r2 = this;
                float r0 = r2.mMinWidth
                boolean r0 = java.lang.Float.isNaN(r0)
                r1 = 0
                if (r0 != 0) goto L10
                float r0 = r2.mMinWidth
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 >= 0) goto L10
                return r1
            L10:
                float r0 = r2.mMinHeight
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L1f
                float r0 = r2.mMinHeight
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 >= 0) goto L1f
                return r1
            L1f:
                float r0 = r2.mMaxWidth
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L2e
                float r0 = r2.mMaxWidth
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 <= 0) goto L2e
                return r1
            L2e:
                float r3 = r2.mMaxHeight
                boolean r3 = java.lang.Float.isNaN(r3)
                if (r3 != 0) goto L3d
                float r3 = r2.mMaxHeight
                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r3 <= 0) goto L3d
                return r1
            L3d:
                r3 = 1
                return r3
        }
    }

    ConstraintLayoutStates(android.content.Context r2, androidx.constraintlayout.widget.ConstraintLayout r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mCurrentStateId = r0
            r1.mCurrentConstraintNumber = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.mStateList = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.mConstraintSetMap = r0
            r0 = 0
            r1.mConstraintsChangedListener = r0
            r1.mConstraintLayout = r3
            r1.load(r2, r4)
            return
    }

    private void load(android.content.Context r8, int r9) {
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto L8b
            if (r0 == 0) goto L7a
            r3 = 2
            if (r0 == r3) goto L17
            goto L7d
        L17:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L4c;
                case 80204913: goto L42;
                case 1382829617: goto L39;
                case 1657696882: goto L2f;
                case 1901439077: goto L25;
                default: goto L24;
            }     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
        L24:
            goto L56
        L25:
            java.lang.String r2 = "Variant"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            if (r0 == 0) goto L56
            r2 = r6
            goto L57
        L2f:
            java.lang.String r2 = "layoutDescription"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            if (r0 == 0) goto L56
            r2 = 0
            goto L57
        L39:
            java.lang.String r4 = "StateSet"
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            if (r0 == 0) goto L56
            goto L57
        L42:
            java.lang.String r2 = "State"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            if (r0 == 0) goto L56
            r2 = r3
            goto L57
        L4c:
            java.lang.String r2 = "ConstraintSet"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            if (r0 == 0) goto L56
            r2 = r5
            goto L57
        L56:
            r2 = -1
        L57:
            if (r2 == r3) goto L6d
            if (r2 == r6) goto L62
            if (r2 == r5) goto L5e
            goto L7d
        L5e:
            r7.parseConstraintSet(r8, r9)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            goto L7d
        L62:
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r0 = new androidx.constraintlayout.widget.ConstraintLayoutStates$Variant     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            if (r1 == 0) goto L7d
            r1.add(r0)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            goto L7d
        L6d:
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r1 = new androidx.constraintlayout.widget.ConstraintLayoutStates$State     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r0 = r7.mStateList     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            int r2 = r1.mId     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            r0.put(r2, r1)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            goto L7d
        L7a:
            r9.getName()     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
        L7d:
            int r0 = r9.next()     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            goto Ld
        L82:
            r8 = move-exception
            r8.printStackTrace()
            goto L8b
        L87:
            r8 = move-exception
            r8.printStackTrace()
        L8b:
            return
    }

    private void parseConstraintSet(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
            r8 = this;
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            int r1 = r10.getAttributeCount()
            r2 = 0
        La:
            if (r2 >= r1) goto L68
            java.lang.String r3 = r10.getAttributeName(r2)
            java.lang.String r4 = r10.getAttributeValue(r2)
            if (r3 == 0) goto L65
            if (r4 != 0) goto L19
            goto L65
        L19:
            java.lang.String r5 = "id"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L65
            java.lang.String r1 = "/"
            boolean r1 = r4.contains(r1)
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L43
            r1 = 47
            int r1 = r4.indexOf(r1)
            int r1 = r1 + r3
            java.lang.String r1 = r4.substring(r1)
            android.content.res.Resources r6 = r9.getResources()
            java.lang.String r7 = r9.getPackageName()
            int r1 = r6.getIdentifier(r1, r5, r7)
            goto L44
        L43:
            r1 = r2
        L44:
            if (r1 != r2) goto L5c
            int r2 = r4.length()
            if (r2 <= r3) goto L55
            java.lang.String r1 = r4.substring(r3)
            int r1 = java.lang.Integer.parseInt(r1)
            goto L5c
        L55:
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.String r3 = "error in parsing id"
            android.util.Log.e(r2, r3)
        L5c:
            r0.load(r9, r10)
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r9 = r8.mConstraintSetMap
            r9.put(r1, r0)
            goto L68
        L65:
            int r2 = r2 + 1
            goto La
        L68:
            return
    }

    public boolean needsToChange(int r5, float r6, float r7) {
            r4 = this;
            int r0 = r4.mCurrentStateId
            r1 = 1
            if (r0 == r5) goto L6
            return r1
        L6:
            r2 = -1
            r3 = 0
            if (r5 != r2) goto L11
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r5 = r4.mStateList
            java.lang.Object r5 = r5.valueAt(r3)
            goto L17
        L11:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r5 = r4.mStateList
            java.lang.Object r5 = r5.get(r0)
        L17:
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r5 = (androidx.constraintlayout.widget.ConstraintLayoutStates.State) r5
            int r0 = r4.mCurrentConstraintNumber
            if (r0 == r2) goto L2e
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r0 = r5.mVariants
            int r2 = r4.mCurrentConstraintNumber
            java.lang.Object r0 = r0.get(r2)
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r0 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r0
            boolean r0 = r0.match(r6, r7)
            if (r0 == 0) goto L2e
            return r3
        L2e:
            int r0 = r4.mCurrentConstraintNumber
            int r5 = r5.findMatch(r6, r7)
            if (r0 != r5) goto L37
            return r3
        L37:
            return r1
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener r1) {
            r0 = this;
            r0.mConstraintsChangedListener = r1
            return
    }

    public void updateConstraints(int r5, float r6, float r7) {
            r4 = this;
            int r0 = r4.mCurrentStateId
            r1 = -1
            if (r0 != r5) goto L6e
            if (r5 != r1) goto L11
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r5 = r4.mStateList
            r0 = 0
            java.lang.Object r5 = r5.valueAt(r0)
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r5 = (androidx.constraintlayout.widget.ConstraintLayoutStates.State) r5
            goto L19
        L11:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r5 = r4.mStateList
            java.lang.Object r5 = r5.get(r0)
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r5 = (androidx.constraintlayout.widget.ConstraintLayoutStates.State) r5
        L19:
            int r0 = r4.mCurrentConstraintNumber
            if (r0 == r1) goto L2e
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r0 = r5.mVariants
            int r2 = r4.mCurrentConstraintNumber
            java.lang.Object r0 = r0.get(r2)
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r0 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r0
            boolean r0 = r0.match(r6, r7)
            if (r0 == 0) goto L2e
            return
        L2e:
            int r6 = r5.findMatch(r6, r7)
            int r7 = r4.mCurrentConstraintNumber
            if (r7 != r6) goto L37
            return
        L37:
            if (r6 != r1) goto L3c
            androidx.constraintlayout.widget.ConstraintSet r7 = r4.mDefaultConstraintSet
            goto L46
        L3c:
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r7 = r5.mVariants
            java.lang.Object r7 = r7.get(r6)
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r7 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r7
            androidx.constraintlayout.widget.ConstraintSet r7 = r7.mConstraintSet
        L46:
            if (r6 != r1) goto L4b
            int r5 = r5.mConstraintID
            goto L55
        L4b:
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r5 = r5.mVariants
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r5 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r5
            int r5 = r5.mConstraintID
        L55:
            if (r7 != 0) goto L58
            return
        L58:
            r4.mCurrentConstraintNumber = r6
            androidx.constraintlayout.widget.ConstraintsChangedListener r6 = r4.mConstraintsChangedListener
            if (r6 == 0) goto L61
            r6.preLayoutChange(r1, r5)
        L61:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r4.mConstraintLayout
            r7.applyTo(r6)
            androidx.constraintlayout.widget.ConstraintsChangedListener r6 = r4.mConstraintsChangedListener
            if (r6 == 0) goto Lda
            r6.postLayoutChange(r1, r5)
            goto Lda
        L6e:
            r4.mCurrentStateId = r5
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r0 = r4.mStateList
            java.lang.Object r0 = r0.get(r5)
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r0 = (androidx.constraintlayout.widget.ConstraintLayoutStates.State) r0
            int r2 = r0.findMatch(r6, r7)
            if (r2 != r1) goto L81
            androidx.constraintlayout.widget.ConstraintSet r3 = r0.mConstraintSet
            goto L8b
        L81:
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r3 = r0.mVariants
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r3 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r3
            androidx.constraintlayout.widget.ConstraintSet r3 = r3.mConstraintSet
        L8b:
            if (r2 != r1) goto L90
            int r0 = r0.mConstraintID
            goto L9a
        L90:
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r0 = r0.mVariants
            java.lang.Object r0 = r0.get(r2)
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r0 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r0
            int r0 = r0.mConstraintID
        L9a:
            if (r3 != 0) goto Lc5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NO Constraint set found ! id="
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = ", dim ="
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = ", "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ConstraintLayoutStates"
            android.util.Log.v(r6, r5)
            return
        Lc5:
            r4.mCurrentConstraintNumber = r2
            androidx.constraintlayout.widget.ConstraintsChangedListener r6 = r4.mConstraintsChangedListener
            if (r6 == 0) goto Lce
            r6.preLayoutChange(r5, r0)
        Lce:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r4.mConstraintLayout
            r3.applyTo(r6)
            androidx.constraintlayout.widget.ConstraintsChangedListener r6 = r4.mConstraintsChangedListener
            if (r6 == 0) goto Lda
            r6.postLayoutChange(r5, r0)
        Lda:
            return
    }
}
