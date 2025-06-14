package androidx.transition;

/* loaded from: classes.dex */
public class AutoTransition extends androidx.transition.TransitionSet {
    public AutoTransition() {
            r0 = this;
            r0.<init>()
            r0.init()
            return
    }

    public AutoTransition(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.init()
            return
    }

    private void init() {
            r3 = this;
            r0 = 1
            r3.setOrdering(r0)
            androidx.transition.Fade r1 = new androidx.transition.Fade
            r2 = 2
            r1.<init>(r2)
            androidx.transition.TransitionSet r1 = r3.addTransition(r1)
            androidx.transition.ChangeBounds r2 = new androidx.transition.ChangeBounds
            r2.<init>()
            androidx.transition.TransitionSet r1 = r1.addTransition(r2)
            androidx.transition.Fade r2 = new androidx.transition.Fade
            r2.<init>(r0)
            r1.addTransition(r2)
            return
    }
}
