package androidx.core.view.inputmethod;

/* loaded from: classes.dex */
public final class EditorInfoCompat {
    private static final java.lang.String CONTENT_MIME_TYPES_INTEROP_KEY = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final java.lang.String CONTENT_MIME_TYPES_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final java.lang.String CONTENT_SELECTION_END_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    private static final java.lang.String CONTENT_SELECTION_HEAD_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    private static final java.lang.String CONTENT_SURROUNDING_TEXT_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
    static final int MAX_INITIAL_SELECTION_LENGTH = 1024;
    static final int MEMORY_EFFICIENT_TEXT_LENGTH = 2048;

    private static class Impl30 {
        private Impl30() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.CharSequence getInitialSelectedText(android.view.inputmethod.EditorInfo r0, int r1) {
                java.lang.CharSequence r0 = r0.getInitialSelectedText(r1)
                return r0
        }

        static java.lang.CharSequence getInitialTextAfterCursor(android.view.inputmethod.EditorInfo r0, int r1, int r2) {
                java.lang.CharSequence r0 = r0.getInitialTextAfterCursor(r1, r2)
                return r0
        }

        static java.lang.CharSequence getInitialTextBeforeCursor(android.view.inputmethod.EditorInfo r0, int r1, int r2) {
                java.lang.CharSequence r0 = r0.getInitialTextBeforeCursor(r1, r2)
                return r0
        }

        static void setInitialSurroundingSubText(android.view.inputmethod.EditorInfo r0, java.lang.CharSequence r1, int r2) {
                r0.setInitialSurroundingSubText(r1, r2)
                return
        }
    }

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.core.view.inputmethod.EditorInfoCompat.EMPTY_STRING_ARRAY = r0
            return
    }

    @java.lang.Deprecated
    public EditorInfoCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String[] getContentMimeTypes(android.view.inputmethod.EditorInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto Le
            java.lang.String[] r2 = r2.contentMimeTypes
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            java.lang.String[] r2 = androidx.core.view.inputmethod.EditorInfoCompat.EMPTY_STRING_ARRAY
        Ld:
            return r2
        Le:
            android.os.Bundle r0 = r2.extras
            if (r0 != 0) goto L15
            java.lang.String[] r2 = androidx.core.view.inputmethod.EditorInfoCompat.EMPTY_STRING_ARRAY
            return r2
        L15:
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String[] r0 = r0.getStringArray(r1)
            if (r0 != 0) goto L27
            android.os.Bundle r2 = r2.extras
            java.lang.String r0 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String[] r0 = r2.getStringArray(r0)
        L27:
            if (r0 == 0) goto L2a
            goto L2c
        L2a:
            java.lang.String[] r0 = androidx.core.view.inputmethod.EditorInfoCompat.EMPTY_STRING_ARRAY
        L2c:
            return r0
    }

    public static java.lang.CharSequence getInitialSelectedText(android.view.inputmethod.EditorInfo r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.CharSequence r6 = androidx.core.view.inputmethod.EditorInfoCompat.Impl30.getInitialSelectedText(r6, r7)
            return r6
        Lb:
            android.os.Bundle r0 = r6.extras
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            int r0 = r6.initialSelStart
            int r2 = r6.initialSelEnd
            if (r0 <= r2) goto L1a
            int r0 = r6.initialSelEnd
            goto L1c
        L1a:
            int r0 = r6.initialSelStart
        L1c:
            int r2 = r6.initialSelStart
            int r3 = r6.initialSelEnd
            if (r2 <= r3) goto L25
            int r2 = r6.initialSelStart
            goto L27
        L25:
            int r2 = r6.initialSelEnd
        L27:
            android.os.Bundle r3 = r6.extras
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            int r3 = r3.getInt(r4)
            android.os.Bundle r4 = r6.extras
            java.lang.String r5 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            int r4 = r4.getInt(r5)
            int r2 = r2 - r0
            int r0 = r6.initialSelStart
            if (r0 < 0) goto L5e
            int r0 = r6.initialSelEnd
            if (r0 < 0) goto L5e
            int r0 = r4 - r3
            if (r0 == r2) goto L45
            goto L5e
        L45:
            android.os.Bundle r6 = r6.extras
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            java.lang.CharSequence r6 = r6.getCharSequence(r0)
            if (r6 != 0) goto L50
            return r1
        L50:
            r7 = r7 & 1
            if (r7 == 0) goto L59
            java.lang.CharSequence r6 = r6.subSequence(r3, r4)
            goto L5d
        L59:
            java.lang.String r6 = android.text.TextUtils.substring(r6, r3, r4)
        L5d:
            return r6
        L5e:
            return r1
    }

    public static java.lang.CharSequence getInitialTextAfterCursor(android.view.inputmethod.EditorInfo r3, int r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.CharSequence r3 = androidx.core.view.inputmethod.EditorInfoCompat.Impl30.getInitialTextAfterCursor(r3, r4, r5)
            return r3
        Lb:
            android.os.Bundle r0 = r3.extras
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            android.os.Bundle r0 = r3.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            java.lang.CharSequence r0 = r0.getCharSequence(r2)
            if (r0 != 0) goto L1c
            return r1
        L1c:
            android.os.Bundle r3 = r3.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            int r3 = r3.getInt(r1)
            int r1 = r0.length()
            int r1 = r1 - r3
            int r4 = java.lang.Math.min(r4, r1)
            r5 = r5 & 1
            if (r5 == 0) goto L37
            int r4 = r4 + r3
            java.lang.CharSequence r3 = r0.subSequence(r3, r4)
            goto L3c
        L37:
            int r4 = r4 + r3
            java.lang.String r3 = android.text.TextUtils.substring(r0, r3, r4)
        L3c:
            return r3
    }

    public static java.lang.CharSequence getInitialTextBeforeCursor(android.view.inputmethod.EditorInfo r3, int r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.CharSequence r3 = androidx.core.view.inputmethod.EditorInfoCompat.Impl30.getInitialTextBeforeCursor(r3, r4, r5)
            return r3
        Lb:
            android.os.Bundle r0 = r3.extras
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            android.os.Bundle r0 = r3.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            java.lang.CharSequence r0 = r0.getCharSequence(r2)
            if (r0 != 0) goto L1c
            return r1
        L1c:
            android.os.Bundle r3 = r3.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            int r3 = r3.getInt(r1)
            int r4 = java.lang.Math.min(r4, r3)
            r5 = r5 & 1
            if (r5 == 0) goto L33
            int r4 = r3 - r4
            java.lang.CharSequence r3 = r0.subSequence(r4, r3)
            goto L39
        L33:
            int r4 = r3 - r4
            java.lang.String r3 = android.text.TextUtils.substring(r0, r4, r3)
        L39:
            return r3
    }

    static int getProtocol(android.view.inputmethod.EditorInfo r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L8
            r3 = 1
            return r3
        L8:
            android.os.Bundle r0 = r3.extras
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            android.os.Bundle r0 = r3.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            boolean r0 = r0.containsKey(r2)
            android.os.Bundle r3 = r3.extras
            java.lang.String r2 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            boolean r3 = r3.containsKey(r2)
            if (r0 == 0) goto L24
            if (r3 == 0) goto L24
            r3 = 4
            return r3
        L24:
            if (r0 == 0) goto L28
            r3 = 3
            return r3
        L28:
            if (r3 == 0) goto L2c
            r3 = 2
            return r3
        L2c:
            return r1
    }

    private static boolean isCutOnSurrogate(java.lang.CharSequence r1, int r2, int r3) {
            if (r3 == 0) goto L10
            r0 = 1
            if (r3 == r0) goto L7
            r1 = 0
            return r1
        L7:
            char r1 = r1.charAt(r2)
            boolean r1 = java.lang.Character.isHighSurrogate(r1)
            return r1
        L10:
            char r1 = r1.charAt(r2)
            boolean r1 = java.lang.Character.isLowSurrogate(r1)
            return r1
    }

    private static boolean isPasswordInputType(int r1) {
            r1 = r1 & 4095(0xfff, float:5.738E-42)
            r0 = 129(0x81, float:1.81E-43)
            if (r1 == r0) goto L11
            r0 = 225(0xe1, float:3.15E-43)
            if (r1 == r0) goto L11
            r0 = 18
            if (r1 != r0) goto Lf
            goto L11
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            return r1
    }

    public static void setContentMimeTypes(android.view.inputmethod.EditorInfo r2, java.lang.String[] r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L9
            r2.contentMimeTypes = r3
            goto L22
        L9:
            android.os.Bundle r0 = r2.extras
            if (r0 != 0) goto L14
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.extras = r0
        L14:
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r0.putStringArray(r1, r3)
            android.os.Bundle r2 = r2.extras
            java.lang.String r0 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r2.putStringArray(r0, r3)
        L22:
            return
    }

    public static void setInitialSurroundingSubText(android.view.inputmethod.EditorInfo r5, java.lang.CharSequence r6, int r7) {
            androidx.core.util.Preconditions.checkNotNull(r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            androidx.core.view.inputmethod.EditorInfoCompat.Impl30.setInitialSurroundingSubText(r5, r6, r7)
            return
        Ld:
            int r0 = r5.initialSelStart
            int r1 = r5.initialSelEnd
            if (r0 <= r1) goto L16
            int r0 = r5.initialSelEnd
            goto L18
        L16:
            int r0 = r5.initialSelStart
        L18:
            int r0 = r0 - r7
            int r1 = r5.initialSelStart
            int r2 = r5.initialSelEnd
            if (r1 <= r2) goto L22
            int r1 = r5.initialSelStart
            goto L24
        L22:
            int r1 = r5.initialSelEnd
        L24:
            int r1 = r1 - r7
            int r2 = r6.length()
            r3 = 0
            r4 = 0
            if (r7 < 0) goto L4a
            if (r0 < 0) goto L4a
            if (r1 <= r2) goto L32
            goto L4a
        L32:
            int r7 = r5.inputType
            boolean r7 = isPasswordInputType(r7)
            if (r7 == 0) goto L3e
            setSurroundingText(r5, r3, r4, r4)
            return
        L3e:
            r7 = 2048(0x800, float:2.87E-42)
            if (r2 > r7) goto L46
            setSurroundingText(r5, r6, r0, r1)
            return
        L46:
            trimLongSurroundingText(r5, r6, r0, r1)
            return
        L4a:
            setSurroundingText(r5, r3, r4, r4)
            return
    }

    public static void setInitialSurroundingText(android.view.inputmethod.EditorInfo r3, java.lang.CharSequence r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto Lb
            androidx.core.view.inputmethod.EditorInfoCompat.Impl30.setInitialSurroundingSubText(r3, r4, r2)
            goto Le
        Lb:
            setInitialSurroundingSubText(r3, r4, r2)
        Le:
            return
    }

    private static void setSurroundingText(android.view.inputmethod.EditorInfo r2, java.lang.CharSequence r3, int r4, int r5) {
            android.os.Bundle r0 = r2.extras
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.extras = r0
        Lb:
            if (r3 == 0) goto L13
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r3)
            goto L14
        L13:
            r0 = 0
        L14:
            android.os.Bundle r3 = r2.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            r3.putCharSequence(r1, r0)
            android.os.Bundle r3 = r2.extras
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            r3.putInt(r0, r4)
            android.os.Bundle r2 = r2.extras
            java.lang.String r3 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            r2.putInt(r3, r5)
            return
    }

    private static void trimLongSurroundingText(android.view.inputmethod.EditorInfo r9, java.lang.CharSequence r10, int r11, int r12) {
            int r0 = r12 - r11
            r1 = 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r0 <= r1) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r0
        La:
            int r3 = r10.length()
            int r3 = r3 - r12
            int r4 = 2048 - r1
            r5 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r7 = (double) r4
            double r7 = r7 * r5
            int r5 = (int) r7
            int r5 = java.lang.Math.min(r11, r5)
            int r5 = r4 - r5
            int r3 = java.lang.Math.min(r3, r5)
            int r4 = r4 - r3
            int r4 = java.lang.Math.min(r11, r4)
            int r11 = r11 - r4
            boolean r5 = isCutOnSurrogate(r10, r11, r2)
            if (r5 == 0) goto L33
            int r11 = r11 + 1
            int r4 = r4 + (-1)
        L33:
            int r5 = r12 + r3
            r6 = 1
            int r5 = r5 - r6
            boolean r5 = isCutOnSurrogate(r10, r5, r6)
            if (r5 == 0) goto L3f
            int r3 = r3 + (-1)
        L3f:
            int r5 = r4 + r1
            int r5 = r5 + r3
            if (r1 == r0) goto L5b
            int r0 = r11 + r4
            java.lang.CharSequence r11 = r10.subSequence(r11, r0)
            int r3 = r3 + r12
            java.lang.CharSequence r10 = r10.subSequence(r12, r3)
            r12 = 2
            java.lang.CharSequence[] r12 = new java.lang.CharSequence[r12]
            r12[r2] = r11
            r12[r6] = r10
            java.lang.CharSequence r10 = android.text.TextUtils.concat(r12)
            goto L60
        L5b:
            int r5 = r5 + r11
            java.lang.CharSequence r10 = r10.subSequence(r11, r5)
        L60:
            int r4 = r4 + r2
            int r1 = r1 + r4
            setSurroundingText(r9, r10, r4, r1)
            return
    }
}
