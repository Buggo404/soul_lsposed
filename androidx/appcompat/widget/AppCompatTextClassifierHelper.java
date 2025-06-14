package androidx.appcompat.widget;

/* loaded from: classes.dex */
final class AppCompatTextClassifierHelper {
    private android.view.textclassifier.TextClassifier mTextClassifier;
    private android.widget.TextView mTextView;

    AppCompatTextClassifierHelper(android.widget.TextView r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.mTextView = r1
            return
    }

    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r2 = this;
            android.view.textclassifier.TextClassifier r0 = r2.mTextClassifier
            if (r0 != 0) goto L1b
            android.widget.TextView r0 = r2.mTextView
            android.content.Context r0 = r0.getContext()
            java.lang.Class<android.view.textclassifier.TextClassificationManager> r1 = android.view.textclassifier.TextClassificationManager.class
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.textclassifier.TextClassificationManager r0 = (android.view.textclassifier.TextClassificationManager) r0
            if (r0 == 0) goto L19
            android.view.textclassifier.TextClassifier r0 = r0.getTextClassifier()
            return r0
        L19:
            android.view.textclassifier.TextClassifier r0 = android.view.textclassifier.TextClassifier.NO_OP
        L1b:
            return r0
    }

    public void setTextClassifier(android.view.textclassifier.TextClassifier r1) {
            r0 = this;
            r0.mTextClassifier = r1
            return
    }
}
