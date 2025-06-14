package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public interface MotionHelperInterface extends androidx.constraintlayout.motion.widget.Animatable, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener {
    boolean isDecorator();

    boolean isUseOnHide();

    boolean isUsedOnShow();

    void onFinishedMotionScene(androidx.constraintlayout.motion.widget.MotionLayout r1);

    void onPostDraw(android.graphics.Canvas r1);

    void onPreDraw(android.graphics.Canvas r1);

    void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout r1, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r2);
}
