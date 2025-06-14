package androidx.core.widget;

/* loaded from: classes.dex */
public final class TextViewOnReceiveContentListener implements androidx.core.view.OnReceiveContentListener {
    private static final java.lang.String LOG_TAG = "ReceiveContent";

    private static final class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.CharSequence coerce(android.content.Context r0, android.content.ClipData.Item r1, int r2) {
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.lang.CharSequence r0 = r1.coerceToText(r0)
                boolean r1 = r0 instanceof android.text.Spanned
                if (r1 == 0) goto L10
                java.lang.String r0 = r0.toString()
            L10:
                return r0
            L11:
                java.lang.CharSequence r0 = r1.coerceToStyledText(r0)
                return r0
        }
    }

    private static final class ApiImpl {
        private ApiImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.CharSequence coerce(android.content.Context r0, android.content.ClipData.Item r1, int r2) {
                java.lang.CharSequence r0 = r1.coerceToText(r0)
                r1 = r2 & 1
                if (r1 == 0) goto L10
                boolean r1 = r0 instanceof android.text.Spanned
                if (r1 == 0) goto L10
                java.lang.String r0 = r0.toString()
            L10:
                return r0
        }
    }

    public TextViewOnReceiveContentListener() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.CharSequence coerceToText(android.content.ClipData r3, android.content.Context r4, int r5) {
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r3.getItemCount()
            if (r1 >= r2) goto L1c
            android.content.ClipData$Item r2 = r3.getItemAt(r1)
            java.lang.CharSequence r2 = coerceToText(r4, r2, r5)
            if (r2 == 0) goto L19
            r0.append(r2)
        L19:
            int r1 = r1 + 1
            goto L6
        L1c:
            return r0
    }

    private static java.lang.CharSequence coerceToText(android.content.Context r0, android.content.ClipData.Item r1, int r2) {
            java.lang.CharSequence r0 = androidx.core.widget.TextViewOnReceiveContentListener.Api16Impl.coerce(r0, r1, r2)
            return r0
    }

    private static void onReceiveForDragAndDrop(android.widget.TextView r2, androidx.core.view.ContentInfoCompat r3) {
            android.content.ClipData r0 = r3.getClip()
            android.content.Context r1 = r2.getContext()
            int r3 = r3.getFlags()
            java.lang.CharSequence r3 = coerceToText(r0, r1, r3)
            java.lang.CharSequence r2 = r2.getText()
            android.text.Editable r2 = (android.text.Editable) r2
            replaceSelection(r2, r3)
            return
    }

    private static void replaceSelection(android.text.Editable r4, java.lang.CharSequence r5) {
            int r0 = android.text.Selection.getSelectionStart(r4)
            int r1 = android.text.Selection.getSelectionEnd(r4)
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = java.lang.Math.max(r3, r0)
            android.text.Selection.setSelection(r4, r0)
            r4.replace(r2, r0, r5)
            return
    }

    @Override // androidx.core.view.OnReceiveContentListener
    public androidx.core.view.ContentInfoCompat onReceiveContent(android.view.View r9, androidx.core.view.ContentInfoCompat r10) {
            r8 = this;
            java.lang.String r0 = "ReceiveContent"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onReceive: "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
        L1b:
            int r0 = r10.getSource()
            r2 = 2
            if (r0 != r2) goto L23
            return r10
        L23:
            r2 = 0
            if (r0 != r1) goto L2c
            android.widget.TextView r9 = (android.widget.TextView) r9
            onReceiveForDragAndDrop(r9, r10)
            return r2
        L2c:
            android.content.ClipData r0 = r10.getClip()
            int r10 = r10.getFlags()
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.CharSequence r1 = r9.getText()
            android.text.Editable r1 = (android.text.Editable) r1
            android.content.Context r9 = r9.getContext()
            r3 = 0
            r4 = r3
        L42:
            int r5 = r0.getItemCount()
            if (r3 >= r5) goto L6c
            android.content.ClipData$Item r5 = r0.getItemAt(r3)
            java.lang.CharSequence r5 = coerceToText(r9, r5, r10)
            if (r5 == 0) goto L69
            if (r4 != 0) goto L59
            replaceSelection(r1, r5)
            r4 = 1
            goto L69
        L59:
            int r6 = android.text.Selection.getSelectionEnd(r1)
            java.lang.String r7 = "\n"
            r1.insert(r6, r7)
            int r6 = android.text.Selection.getSelectionEnd(r1)
            r1.insert(r6, r5)
        L69:
            int r3 = r3 + 1
            goto L42
        L6c:
            return r2
    }
}
