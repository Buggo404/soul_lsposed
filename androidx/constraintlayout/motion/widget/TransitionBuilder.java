package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class TransitionBuilder {
    private static final java.lang.String TAG = "TransitionBuilder";

    public TransitionBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.constraintlayout.motion.widget.MotionScene.Transition buildTransition(androidx.constraintlayout.motion.widget.MotionScene r1, int r2, int r3, androidx.constraintlayout.widget.ConstraintSet r4, int r5, androidx.constraintlayout.widget.ConstraintSet r6) {
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            r0.<init>(r2, r1, r3, r5)
            updateConstraintSetInMotionScene(r1, r0, r4, r6)
            return r0
    }

    private static void updateConstraintSetInMotionScene(androidx.constraintlayout.motion.widget.MotionScene r1, androidx.constraintlayout.motion.widget.MotionScene.Transition r2, androidx.constraintlayout.widget.ConstraintSet r3, androidx.constraintlayout.widget.ConstraintSet r4) {
            int r0 = r2.getStartConstraintSetId()
            int r2 = r2.getEndConstraintSetId()
            r1.setConstraintSet(r0, r3)
            r1.setConstraintSet(r2, r4)
            return
    }

    public static void validate(androidx.constraintlayout.motion.widget.MotionLayout r1) {
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 == 0) goto L2b
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            boolean r1 = r0.validateLayout(r1)
            if (r1 == 0) goto L23
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r0.mCurrentTransition
            if (r1 == 0) goto L1b
            java.util.ArrayList r1 = r0.getDefinedTransitions()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1b
            return
        L1b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Invalid motion layout. Motion Scene doesn't have any transition."
            r1.<init>(r0)
            throw r1
        L23:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "MotionLayout doesn't have the right motion scene."
            r1.<init>(r0)
            throw r1
        L2b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Invalid motion layout. Layout missing Motion Scene."
            r1.<init>(r0)
            throw r1
    }
}
