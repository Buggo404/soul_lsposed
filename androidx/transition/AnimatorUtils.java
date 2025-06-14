package androidx.transition;

/* loaded from: classes.dex */
class AnimatorUtils {

    interface AnimatorPauseListenerCompat {
        void onAnimationPause(android.animation.Animator r1);

        void onAnimationResume(android.animation.Animator r1);
    }

    private AnimatorUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static void addPauseListener(android.animation.Animator r0, android.animation.AnimatorListenerAdapter r1) {
            r0.addPauseListener(r1)
            return
    }

    static void pause(android.animation.Animator r0) {
            r0.pause()
            return
    }

    static void resume(android.animation.Animator r0) {
            r0.resume()
            return
    }
}
