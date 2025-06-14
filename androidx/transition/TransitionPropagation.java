package androidx.transition;

/* loaded from: classes.dex */
public abstract class TransitionPropagation {
    public TransitionPropagation() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void captureValues(androidx.transition.TransitionValues r1);

    public abstract java.lang.String[] getPropagationProperties();

    public abstract long getStartDelay(android.view.ViewGroup r1, androidx.transition.Transition r2, androidx.transition.TransitionValues r3, androidx.transition.TransitionValues r4);
}
