package androidx.appcompat.widget;

/* loaded from: classes.dex */
class AppCompatHintHelper {
    private AppCompatHintHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.InputConnection r1, android.view.inputmethod.EditorInfo r2, android.view.View r3) {
            if (r1 == 0) goto L20
            java.lang.CharSequence r0 = r2.hintText
            if (r0 != 0) goto L20
            android.view.ViewParent r3 = r3.getParent()
        La:
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L20
            boolean r0 = r3 instanceof androidx.appcompat.widget.WithHint
            if (r0 == 0) goto L1b
            androidx.appcompat.widget.WithHint r3 = (androidx.appcompat.widget.WithHint) r3
            java.lang.CharSequence r3 = r3.getHint()
            r2.hintText = r3
            goto L20
        L1b:
            android.view.ViewParent r3 = r3.getParent()
            goto La
        L20:
            return r1
    }
}
