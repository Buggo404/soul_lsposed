package androidx.appcompat.widget;

/* loaded from: classes.dex */
final class AppCompatReceiveContentHelper {
    private static final java.lang.String EXTRA_INPUT_CONTENT_INFO = "androidx.core.view.extra.INPUT_CONTENT_INFO";
    private static final java.lang.String LOG_TAG = "ReceiveContent";


    private static final class OnDropApi24Impl {
        private OnDropApi24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean onDropForTextView(android.view.DragEvent r1, android.widget.TextView r2, android.app.Activity r3) {
                r3.requestDragAndDropPermissions(r1)
                float r3 = r1.getX()
                float r0 = r1.getY()
                int r3 = r2.getOffsetForPosition(r3, r0)
                r2.beginBatchEdit()
                java.lang.CharSequence r0 = r2.getText()     // Catch: java.lang.Throwable -> L31
                android.text.Spannable r0 = (android.text.Spannable) r0     // Catch: java.lang.Throwable -> L31
                android.text.Selection.setSelection(r0, r3)     // Catch: java.lang.Throwable -> L31
                androidx.core.view.ContentInfoCompat$Builder r3 = new androidx.core.view.ContentInfoCompat$Builder     // Catch: java.lang.Throwable -> L31
                android.content.ClipData r1 = r1.getClipData()     // Catch: java.lang.Throwable -> L31
                r0 = 3
                r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L31
                androidx.core.view.ContentInfoCompat r1 = r3.build()     // Catch: java.lang.Throwable -> L31
                androidx.core.view.ViewCompat.performReceiveContent(r2, r1)     // Catch: java.lang.Throwable -> L31
                r2.endBatchEdit()
                r1 = 1
                return r1
            L31:
                r1 = move-exception
                r2.endBatchEdit()
                throw r1
        }

        static boolean onDropForView(android.view.DragEvent r1, android.view.View r2, android.app.Activity r3) {
                r3.requestDragAndDropPermissions(r1)
                androidx.core.view.ContentInfoCompat$Builder r3 = new androidx.core.view.ContentInfoCompat$Builder
                android.content.ClipData r1 = r1.getClipData()
                r0 = 3
                r3.<init>(r1, r0)
                androidx.core.view.ContentInfoCompat r1 = r3.build()
                androidx.core.view.ViewCompat.performReceiveContent(r2, r1)
                r1 = 1
                return r1
        }
    }

    private AppCompatReceiveContentHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener createOnCommitContentListener(android.view.View r1) {
            androidx.appcompat.widget.AppCompatReceiveContentHelper$1 r0 = new androidx.appcompat.widget.AppCompatReceiveContentHelper$1
            r0.<init>(r1)
            return r0
    }

    static boolean maybeHandleDragEventViaPerformReceiveContent(android.view.View r4, android.view.DragEvent r5) {
            java.lang.Object r0 = r5.getLocalState()
            r1 = 0
            if (r0 != 0) goto L4b
            java.lang.String[] r0 = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(r4)
            if (r0 != 0) goto Le
            goto L4b
        Le:
            android.app.Activity r0 = tryGetActivity(r4)
            if (r0 != 0) goto L29
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Can't handle drop: no activity: view="
            r5.<init>(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "ReceiveContent"
            android.util.Log.i(r5, r4)
            return r1
        L29:
            int r2 = r5.getAction()
            r3 = 1
            if (r2 != r3) goto L34
            boolean r4 = r4 instanceof android.widget.TextView
            r4 = r4 ^ r3
            return r4
        L34:
            int r2 = r5.getAction()
            r3 = 3
            if (r2 != r3) goto L4b
            boolean r1 = r4 instanceof android.widget.TextView
            if (r1 == 0) goto L46
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r4 = androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl.onDropForTextView(r5, r4, r0)
            goto L4a
        L46:
            boolean r4 = androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl.onDropForView(r5, r4, r0)
        L4a:
            return r4
        L4b:
            return r1
    }

    static boolean maybeHandleMenuActionViaPerformReceiveContent(android.widget.TextView r5, int r6) {
            r0 = 0
            r1 = 16908322(0x1020022, float:2.3877324E-38)
            if (r6 == r1) goto Lb
            r2 = 16908337(0x1020031, float:2.3877366E-38)
            if (r6 != r2) goto L11
        Lb:
            java.lang.String[] r2 = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(r5)
            if (r2 != 0) goto L12
        L11:
            return r0
        L12:
            android.content.Context r2 = r5.getContext()
            java.lang.String r3 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            if (r2 != 0) goto L22
            r2 = 0
            goto L26
        L22:
            android.content.ClipData r2 = r2.getPrimaryClip()
        L26:
            r3 = 1
            if (r2 == 0) goto L43
            int r4 = r2.getItemCount()
            if (r4 <= 0) goto L43
            androidx.core.view.ContentInfoCompat$Builder r4 = new androidx.core.view.ContentInfoCompat$Builder
            r4.<init>(r2, r3)
            if (r6 != r1) goto L37
            goto L38
        L37:
            r0 = r3
        L38:
            androidx.core.view.ContentInfoCompat$Builder r6 = r4.setFlags(r0)
            androidx.core.view.ContentInfoCompat r6 = r6.build()
            androidx.core.view.ViewCompat.performReceiveContent(r5, r6)
        L43:
            return r3
    }

    static android.app.Activity tryGetActivity(android.view.View r1) {
            android.content.Context r1 = r1.getContext()
        L4:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L16
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto Lf
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        Lf:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L4
        L16:
            r1 = 0
            return r1
    }
}
