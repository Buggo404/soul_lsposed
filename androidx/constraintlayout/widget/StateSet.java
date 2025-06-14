package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class StateSet {
    private static final boolean DEBUG = false;
    public static final java.lang.String TAG = "ConstraintLayoutStates";
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> mConstraintSetMap;
    private androidx.constraintlayout.widget.ConstraintsChangedListener mConstraintsChangedListener;
    int mCurrentConstraintNumber;
    int mCurrentStateId;
    androidx.constraintlayout.widget.ConstraintSet mDefaultConstraintSet;
    int mDefaultState;
    private android.util.SparseArray<androidx.constraintlayout.widget.StateSet.State> mStateList;

    static class State {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        java.util.ArrayList<androidx.constraintlayout.widget.StateSet.Variant> mVariants;

        public State(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mVariants = r0
                r0 = -1
                r5.mConstraintID = r0
                r0 = 0
                r5.mIsLayout = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.State
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1)
                int r1 = r7.getIndexCount()
            L1e:
                if (r0 >= r1) goto L5e
                int r2 = r7.getIndex(r0)
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.State_android_id
                if (r2 != r3) goto L31
                int r3 = r5.mId
                int r2 = r7.getResourceId(r2, r3)
                r5.mId = r2
                goto L5b
            L31:
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.State_constraints
                if (r2 != r3) goto L5b
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
                if (r2 == 0) goto L5b
                r2 = 1
                r5.mIsLayout = r2
            L5b:
                int r0 = r0 + 1
                goto L1e
            L5e:
                r7.recycle()
                return
        }

        void add(androidx.constraintlayout.widget.StateSet.Variant r2) {
                r1 = this;
                java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r0 = r1.mVariants
                r0.add(r2)
                return
        }

        public int findMatch(float r3, float r4) {
                r2 = this;
                r0 = 0
            L1:
                java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r1 = r2.mVariants
                int r1 = r1.size()
                if (r0 >= r1) goto L1b
                java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r1 = r2.mVariants
                java.lang.Object r1 = r1.get(r0)
                androidx.constraintlayout.widget.StateSet$Variant r1 = (androidx.constraintlayout.widget.StateSet.Variant) r1
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
        int mId;
        boolean mIsLayout;
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
                r0 = 0
                r5.mIsLayout = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.Variant
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1)
                int r1 = r7.getIndexCount()
            L21:
                if (r0 >= r1) goto L90
                int r2 = r7.getIndex(r0)
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.Variant_constraints
                if (r2 != r3) goto L52
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
                if (r2 == 0) goto L8d
                r2 = 1
                r5.mIsLayout = r2
                goto L8d
            L52:
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.Variant_region_heightLessThan
                if (r2 != r3) goto L5f
                float r3 = r5.mMaxHeight
                float r2 = r7.getDimension(r2, r3)
                r5.mMaxHeight = r2
                goto L8d
            L5f:
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.Variant_region_heightMoreThan
                if (r2 != r3) goto L6c
                float r3 = r5.mMinHeight
                float r2 = r7.getDimension(r2, r3)
                r5.mMinHeight = r2
                goto L8d
            L6c:
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.Variant_region_widthLessThan
                if (r2 != r3) goto L79
                float r3 = r5.mMaxWidth
                float r2 = r7.getDimension(r2, r3)
                r5.mMaxWidth = r2
                goto L8d
            L79:
                int r3 = androidx.constraintlayout.widget.C0156R.styleable.Variant_region_widthMoreThan
                if (r2 != r3) goto L86
                float r3 = r5.mMinWidth
                float r2 = r7.getDimension(r2, r3)
                r5.mMinWidth = r2
                goto L8d
            L86:
                java.lang.String r2 = "ConstraintLayoutStates"
                java.lang.String r3 = "Unknown tag"
                android.util.Log.v(r2, r3)
            L8d:
                int r0 = r0 + 1
                goto L21
            L90:
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

    public StateSet(android.content.Context r2, org.xmlpull.v1.XmlPullParser r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mDefaultState = r0
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
            r1.load(r2, r3)
            return
    }

    private void load(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
            r8 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)
            int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.StateSet
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L25
            int r4 = r0.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.C0156R.styleable.StateSet_defaultState
            if (r4 != r5) goto L22
            int r5 = r8.mDefaultState
            int r4 = r0.getResourceId(r4, r5)
            r8.mDefaultState = r4
        L22:
            int r3 = r3 + 1
            goto L10
        L25:
            r0.recycle()
            int r0 = r10.getEventType()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            r1 = 0
        L2d:
            r3 = 1
            if (r0 == r3) goto La6
            if (r0 == 0) goto L95
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L46
            if (r0 == r5) goto L3b
            goto L98
        L3b:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            boolean r0 = r4.equals(r0)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            if (r0 == 0) goto L98
            return
        L46:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            int r7 = r0.hashCode()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            switch(r7) {
                case 80204913: goto L6d;
                case 1301459538: goto L63;
                case 1382829617: goto L5c;
                case 1901439077: goto L52;
                default: goto L51;
            }     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
        L51:
            goto L77
        L52:
            java.lang.String r3 = "Variant"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            if (r0 == 0) goto L77
            r3 = r5
            goto L78
        L5c:
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            if (r0 == 0) goto L77
            goto L78
        L63:
            java.lang.String r3 = "LayoutDescription"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            if (r0 == 0) goto L77
            r3 = r2
            goto L78
        L6d:
            java.lang.String r3 = "State"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            if (r0 == 0) goto L77
            r3 = r6
            goto L78
        L77:
            r3 = -1
        L78:
            if (r3 == r6) goto L88
            if (r3 == r5) goto L7d
            goto L98
        L7d:
            androidx.constraintlayout.widget.StateSet$Variant r0 = new androidx.constraintlayout.widget.StateSet$Variant     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            if (r1 == 0) goto L98
            r1.add(r0)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            goto L98
        L88:
            androidx.constraintlayout.widget.StateSet$State r1 = new androidx.constraintlayout.widget.StateSet$State     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            r1.<init>(r9, r10)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r0 = r8.mStateList     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            int r3 = r1.mId     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            r0.put(r3, r1)     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            goto L98
        L95:
            r10.getName()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
        L98:
            int r0 = r10.next()     // Catch: java.io.IOException -> L9d org.xmlpull.v1.XmlPullParserException -> La2
            goto L2d
        L9d:
            r9 = move-exception
            r9.printStackTrace()
            goto La6
        La2:
            r9 = move-exception
            r9.printStackTrace()
        La6:
            return
    }

    public int convertToConstraintSet(int r5, int r6, float r7, float r8) {
            r4 = this;
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r0 = r4.mStateList
            java.lang.Object r0 = r0.get(r6)
            androidx.constraintlayout.widget.StateSet$State r0 = (androidx.constraintlayout.widget.StateSet.State) r0
            if (r0 != 0) goto Lb
            return r6
        Lb:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r1 == 0) goto L3e
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L16
            goto L3e
        L16:
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r6 = r0.mVariants
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        L1d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r6.next()
            androidx.constraintlayout.widget.StateSet$Variant r2 = (androidx.constraintlayout.widget.StateSet.Variant) r2
            boolean r3 = r2.match(r7, r8)
            if (r3 == 0) goto L1d
            int r1 = r2.mConstraintID
            if (r5 != r1) goto L34
            return r5
        L34:
            r1 = r2
            goto L1d
        L36:
            if (r1 == 0) goto L3b
            int r5 = r1.mConstraintID
            return r5
        L3b:
            int r5 = r0.mConstraintID
            return r5
        L3e:
            int r6 = r0.mConstraintID
            if (r6 != r5) goto L43
            return r5
        L43:
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r6 = r0.mVariants
            java.util.Iterator r6 = r6.iterator()
        L49:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5a
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.widget.StateSet$Variant r7 = (androidx.constraintlayout.widget.StateSet.Variant) r7
            int r7 = r7.mConstraintID
            if (r5 != r7) goto L49
            return r5
        L5a:
            int r5 = r0.mConstraintID
            return r5
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
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r5 = r4.mStateList
            java.lang.Object r5 = r5.valueAt(r3)
            goto L17
        L11:
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r5 = r4.mStateList
            java.lang.Object r5 = r5.get(r0)
        L17:
            androidx.constraintlayout.widget.StateSet$State r5 = (androidx.constraintlayout.widget.StateSet.State) r5
            int r0 = r4.mCurrentConstraintNumber
            if (r0 == r2) goto L2e
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r0 = r5.mVariants
            int r2 = r4.mCurrentConstraintNumber
            java.lang.Object r0 = r0.get(r2)
            androidx.constraintlayout.widget.StateSet$Variant r0 = (androidx.constraintlayout.widget.StateSet.Variant) r0
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

    public int stateGetConstraintID(int r2, int r3, int r4) {
            r1 = this;
            float r3 = (float) r3
            float r4 = (float) r4
            r0 = -1
            int r2 = r1.updateConstraints(r0, r2, r3, r4)
            return r2
    }

    public int updateConstraints(int r3, int r4, float r5, float r6) {
            r2 = this;
            r0 = -1
            if (r3 != r4) goto L46
            if (r4 != r0) goto Lf
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r4 = r2.mStateList
            r1 = 0
            java.lang.Object r4 = r4.valueAt(r1)
            androidx.constraintlayout.widget.StateSet$State r4 = (androidx.constraintlayout.widget.StateSet.State) r4
            goto L19
        Lf:
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r4 = r2.mStateList
            int r1 = r2.mCurrentStateId
            java.lang.Object r4 = r4.get(r1)
            androidx.constraintlayout.widget.StateSet$State r4 = (androidx.constraintlayout.widget.StateSet.State) r4
        L19:
            if (r4 != 0) goto L1c
            return r0
        L1c:
            int r1 = r2.mCurrentConstraintNumber
            if (r1 == r0) goto L2f
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r1 = r4.mVariants
            java.lang.Object r1 = r1.get(r3)
            androidx.constraintlayout.widget.StateSet$Variant r1 = (androidx.constraintlayout.widget.StateSet.Variant) r1
            boolean r1 = r1.match(r5, r6)
            if (r1 == 0) goto L2f
            return r3
        L2f:
            int r5 = r4.findMatch(r5, r6)
            if (r3 != r5) goto L36
            return r3
        L36:
            if (r5 != r0) goto L3b
            int r3 = r4.mConstraintID
            goto L45
        L3b:
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r3 = r4.mVariants
            java.lang.Object r3 = r3.get(r5)
            androidx.constraintlayout.widget.StateSet$Variant r3 = (androidx.constraintlayout.widget.StateSet.Variant) r3
            int r3 = r3.mConstraintID
        L45:
            return r3
        L46:
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r3 = r2.mStateList
            java.lang.Object r3 = r3.get(r4)
            androidx.constraintlayout.widget.StateSet$State r3 = (androidx.constraintlayout.widget.StateSet.State) r3
            if (r3 != 0) goto L51
            return r0
        L51:
            int r4 = r3.findMatch(r5, r6)
            if (r4 != r0) goto L5a
            int r3 = r3.mConstraintID
            goto L64
        L5a:
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r3 = r3.mVariants
            java.lang.Object r3 = r3.get(r4)
            androidx.constraintlayout.widget.StateSet$Variant r3 = (androidx.constraintlayout.widget.StateSet.Variant) r3
            int r3 = r3.mConstraintID
        L64:
            return r3
    }
}
