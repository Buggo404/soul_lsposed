package androidx.core.view.inputmethod;

/* loaded from: classes.dex */
public final class InputConnectionCompat {
    private static final java.lang.String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final java.lang.String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final java.lang.String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final java.lang.String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final java.lang.String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final java.lang.String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final java.lang.String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final java.lang.String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final java.lang.String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final java.lang.String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final java.lang.String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final java.lang.String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final java.lang.String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final java.lang.String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;



    public interface OnCommitContentListener {
        boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat r1, int r2, android.os.Bundle r3);
    }

    @java.lang.Deprecated
    public InputConnectionCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean commitContent(android.view.inputmethod.InputConnection r7, android.view.inputmethod.EditorInfo r8, androidx.core.view.inputmethod.InputContentInfoCompat r9, int r10, android.os.Bundle r11) {
            android.content.ClipDescription r0 = r9.getDescription()
            java.lang.String[] r1 = androidx.core.view.inputmethod.EditorInfoCompat.getContentMimeTypes(r8)
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lb:
            r5 = 1
            if (r4 >= r2) goto L1b
            r6 = r1[r4]
            boolean r6 = r0.hasMimeType(r6)
            if (r6 == 0) goto L18
            r0 = r5
            goto L1c
        L18:
            int r4 = r4 + 1
            goto Lb
        L1b:
            r0 = r3
        L1c:
            if (r0 != 0) goto L1f
            return r3
        L1f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L30
            java.lang.Object r8 = r9.unwrap()
            android.view.inputmethod.InputContentInfo r8 = (android.view.inputmethod.InputContentInfo) r8
            boolean r7 = r7.commitContent(r8, r10, r11)
            return r7
        L30:
            int r8 = androidx.core.view.inputmethod.EditorInfoCompat.getProtocol(r8)
            r0 = 2
            if (r8 == r0) goto L3e
            r0 = 3
            if (r8 == r0) goto L3f
            r0 = 4
            if (r8 == r0) goto L3f
            return r3
        L3e:
            r3 = r5
        L3f:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            if (r3 == 0) goto L49
            java.lang.String r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L4b
        L49:
            java.lang.String r0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L4b:
            android.net.Uri r1 = r9.getContentUri()
            r8.putParcelable(r0, r1)
            if (r3 == 0) goto L57
            java.lang.String r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L59
        L57:
            java.lang.String r0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L59:
            android.content.ClipDescription r1 = r9.getDescription()
            r8.putParcelable(r0, r1)
            if (r3 == 0) goto L65
            java.lang.String r0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L67
        L65:
            java.lang.String r0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L67:
            android.net.Uri r9 = r9.getLinkUri()
            r8.putParcelable(r0, r9)
            if (r3 == 0) goto L73
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L75
        L73:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L75:
            r8.putInt(r9, r10)
            if (r3 == 0) goto L7d
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L7f
        L7d:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L7f:
            r8.putParcelable(r9, r11)
            if (r3 == 0) goto L87
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            goto L89
        L87:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
        L89:
            boolean r7 = r7.performPrivateCommand(r9, r8)
            return r7
    }

    public static android.view.inputmethod.InputConnection createWrapper(android.view.inputmethod.InputConnection r3, android.view.inputmethod.EditorInfo r4, androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener r5) {
            if (r3 == 0) goto L31
            if (r4 == 0) goto L29
            if (r5 == 0) goto L21
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            r2 = 0
            if (r0 < r1) goto L13
            androidx.core.view.inputmethod.InputConnectionCompat$1 r4 = new androidx.core.view.inputmethod.InputConnectionCompat$1
            r4.<init>(r3, r2, r5)
            return r4
        L13:
            java.lang.String[] r4 = androidx.core.view.inputmethod.EditorInfoCompat.getContentMimeTypes(r4)
            int r4 = r4.length
            if (r4 != 0) goto L1b
            return r3
        L1b:
            androidx.core.view.inputmethod.InputConnectionCompat$2 r4 = new androidx.core.view.inputmethod.InputConnectionCompat$2
            r4.<init>(r3, r2, r5)
            return r4
        L21:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "onCommitContentListener must be non-null"
            r3.<init>(r4)
            throw r3
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "editorInfo must be non-null"
            r3.<init>(r4)
            throw r3
        L31:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "inputConnection must be non-null"
            r3.<init>(r4)
            throw r3
    }

    static boolean handlePerformPrivateCommand(java.lang.String r7, android.os.Bundle r8, androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener r9) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto Le
            r7 = r0
            goto L17
        Le:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L81
            r7 = 1
        L17:
            r1 = 0
            if (r7 == 0) goto L1d
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L1f
        L1d:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L1f:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch: java.lang.Throwable -> L79
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch: java.lang.Throwable -> L79
            if (r7 == 0) goto L2a
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L2c
        L2a:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L2c:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch: java.lang.Throwable -> L77
            android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L37
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L39
        L37:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L39:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch: java.lang.Throwable -> L77
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L44
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L46
        L44:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L46:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch: java.lang.Throwable -> L77
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L51
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L53
        L51:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L53:
            int r6 = r8.getInt(r6)     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L5c
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L5e
        L5c:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L5e:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch: java.lang.Throwable -> L77
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch: java.lang.Throwable -> L77
            if (r3 == 0) goto L71
            if (r4 == 0) goto L71
            androidx.core.view.inputmethod.InputContentInfoCompat r8 = new androidx.core.view.inputmethod.InputContentInfoCompat     // Catch: java.lang.Throwable -> L77
            r8.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L77
            boolean r0 = r9.onCommitContent(r8, r6, r7)     // Catch: java.lang.Throwable -> L77
        L71:
            if (r2 == 0) goto L76
            r2.send(r0, r1)
        L76:
            return r0
        L77:
            r7 = move-exception
            goto L7b
        L79:
            r7 = move-exception
            r2 = r1
        L7b:
            if (r2 == 0) goto L80
            r2.send(r0, r1)
        L80:
            throw r7
        L81:
            return r0
    }
}
