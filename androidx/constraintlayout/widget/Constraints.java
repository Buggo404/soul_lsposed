package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class Constraints extends android.view.ViewGroup {
    public static final java.lang.String TAG = "Constraints";
    androidx.constraintlayout.widget.ConstraintSet myConstraintSet;

    public static class LayoutParams extends androidx.constraintlayout.widget.ConstraintLayout.LayoutParams {
        public float alpha;
        public boolean applyElevation;
        public float elevation;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.alpha = r1
                r2 = 0
                r0.applyElevation = r2
                r2 = 0
                r0.elevation = r2
                r0.rotation = r2
                r0.rotationX = r2
                r0.rotationY = r2
                r0.scaleX = r1
                r0.scaleY = r1
                r0.transformPivotX = r2
                r0.transformPivotY = r2
                r0.translationX = r2
                r0.translationY = r2
                r0.translationZ = r2
                return
        }

        public LayoutParams(android.content.Context r4, android.util.AttributeSet r5) {
                r3 = this;
                r3.<init>(r4, r5)
                r0 = 1065353216(0x3f800000, float:1.0)
                r3.alpha = r0
                r1 = 0
                r3.applyElevation = r1
                r2 = 0
                r3.elevation = r2
                r3.rotation = r2
                r3.rotationX = r2
                r3.rotationY = r2
                r3.scaleX = r0
                r3.scaleY = r0
                r3.transformPivotX = r2
                r3.transformPivotY = r2
                r3.translationX = r2
                r3.translationY = r2
                r3.translationZ = r2
                int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet
                android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
                int r5 = r4.getIndexCount()
            L2b:
                if (r1 >= r5) goto Ld7
                int r0 = r4.getIndex(r1)
                int r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet_android_alpha
                if (r0 != r2) goto L3f
                float r2 = r3.alpha
                float r0 = r4.getFloat(r0, r2)
                r3.alpha = r0
                goto Ld3
            L3f:
                int r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet_android_elevation
                if (r0 != r2) goto L50
                float r2 = r3.elevation
                float r0 = r4.getFloat(r0, r2)
                r3.elevation = r0
                r0 = 1
                r3.applyElevation = r0
                goto Ld3
            L50:
                int r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet_android_rotationX
                if (r0 != r2) goto L5e
                float r2 = r3.rotationX
                float r0 = r4.getFloat(r0, r2)
                r3.rotationX = r0
                goto Ld3
            L5e:
                int r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet_android_rotationY
                if (r0 != r2) goto L6c
                float r2 = r3.rotationY
                float r0 = r4.getFloat(r0, r2)
                r3.rotationY = r0
                goto Ld3
            L6c:
                int r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet_android_rotation
                if (r0 != r2) goto L79
                float r2 = r3.rotation
                float r0 = r4.getFloat(r0, r2)
                r3.rotation = r0
                goto Ld3
            L79:
                int r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet_android_scaleX
                if (r0 != r2) goto L86
                float r2 = r3.scaleX
                float r0 = r4.getFloat(r0, r2)
                r3.scaleX = r0
                goto Ld3
            L86:
                int r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet_android_scaleY
                if (r0 != r2) goto L93
                float r2 = r3.scaleY
                float r0 = r4.getFloat(r0, r2)
                r3.scaleY = r0
                goto Ld3
            L93:
                int r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet_android_transformPivotX
                if (r0 != r2) goto La0
                float r2 = r3.transformPivotX
                float r0 = r4.getFloat(r0, r2)
                r3.transformPivotX = r0
                goto Ld3
            La0:
                int r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet_android_transformPivotY
                if (r0 != r2) goto Lad
                float r2 = r3.transformPivotY
                float r0 = r4.getFloat(r0, r2)
                r3.transformPivotY = r0
                goto Ld3
            Lad:
                int r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet_android_translationX
                if (r0 != r2) goto Lba
                float r2 = r3.translationX
                float r0 = r4.getFloat(r0, r2)
                r3.translationX = r0
                goto Ld3
            Lba:
                int r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet_android_translationY
                if (r0 != r2) goto Lc7
                float r2 = r3.translationY
                float r0 = r4.getFloat(r0, r2)
                r3.translationY = r0
                goto Ld3
            Lc7:
                int r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintSet_android_translationZ
                if (r0 != r2) goto Ld3
                float r2 = r3.translationZ
                float r0 = r4.getFloat(r0, r2)
                r3.translationZ = r0
            Ld3:
                int r1 = r1 + 1
                goto L2b
            Ld7:
                r4.recycle()
                return
        }

        public LayoutParams(androidx.constraintlayout.widget.Constraints.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 1065353216(0x3f800000, float:1.0)
                r1.alpha = r2
                r0 = 0
                r1.applyElevation = r0
                r0 = 0
                r1.elevation = r0
                r1.rotation = r0
                r1.rotationX = r0
                r1.rotationY = r0
                r1.scaleX = r2
                r1.scaleY = r2
                r1.transformPivotX = r0
                r1.transformPivotY = r0
                r1.translationX = r0
                r1.translationY = r0
                r1.translationZ = r0
                return
        }
    }

    public Constraints(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public Constraints(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.init(r2)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public Constraints(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.init(r2)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    private void init(android.util.AttributeSet r2) {
            r1 = this;
            java.lang.String r2 = "Constraints"
            java.lang.String r0 = " ################# init"
            android.util.Log.v(r2, r0)
            return
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.constraintlayout.widget.Constraints$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.constraintlayout.widget.Constraints.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.constraintlayout.widget.Constraints$LayoutParams r0 = new androidx.constraintlayout.widget.Constraints$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.constraintlayout.widget.Constraints$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.Constraints.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.constraintlayout.widget.Constraints$LayoutParams r0 = new androidx.constraintlayout.widget.Constraints$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public androidx.constraintlayout.widget.ConstraintSet getConstraintSet() {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet r0 = r1.myConstraintSet
            if (r0 != 0) goto Lb
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            r1.myConstraintSet = r0
        Lb:
            androidx.constraintlayout.widget.ConstraintSet r0 = r1.myConstraintSet
            r0.clone(r1)
            androidx.constraintlayout.widget.ConstraintSet r0 = r1.myConstraintSet
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }
}
