package androidx.core.text;

/* loaded from: classes.dex */
public class PrecomputedTextCompat implements android.text.Spannable {
    private static final char LINE_FEED = '\n';
    private static java.util.concurrent.Executor sExecutor;
    private static final java.lang.Object sLock = null;
    private final int[] mParagraphEnds;
    private final androidx.core.text.PrecomputedTextCompat.Params mParams;
    private final android.text.Spannable mText;
    private final android.text.PrecomputedText mWrapped;

    public static final class Params {
        private final int mBreakStrategy;
        private final int mHyphenationFrequency;
        private final android.text.TextPaint mPaint;
        private final android.text.TextDirectionHeuristic mTextDir;
        final android.text.PrecomputedText.Params mWrapped;

        public static class Builder {
            private int mBreakStrategy;
            private int mHyphenationFrequency;
            private final android.text.TextPaint mPaint;
            private android.text.TextDirectionHeuristic mTextDir;

            public Builder(android.text.TextPaint r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mPaint = r1
                    r1 = 1
                    r0.mBreakStrategy = r1
                    r0.mHyphenationFrequency = r1
                    android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                    r0.mTextDir = r1
                    return
            }

            public androidx.core.text.PrecomputedTextCompat.Params build() {
                    r5 = this;
                    androidx.core.text.PrecomputedTextCompat$Params r0 = new androidx.core.text.PrecomputedTextCompat$Params
                    android.text.TextPaint r1 = r5.mPaint
                    android.text.TextDirectionHeuristic r2 = r5.mTextDir
                    int r3 = r5.mBreakStrategy
                    int r4 = r5.mHyphenationFrequency
                    r0.<init>(r1, r2, r3, r4)
                    return r0
            }

            public androidx.core.text.PrecomputedTextCompat.Params.Builder setBreakStrategy(int r1) {
                    r0 = this;
                    r0.mBreakStrategy = r1
                    return r0
            }

            public androidx.core.text.PrecomputedTextCompat.Params.Builder setHyphenationFrequency(int r1) {
                    r0 = this;
                    r0.mHyphenationFrequency = r1
                    return r0
            }

            public androidx.core.text.PrecomputedTextCompat.Params.Builder setTextDirection(android.text.TextDirectionHeuristic r1) {
                    r0 = this;
                    r0.mTextDir = r1
                    return r0
            }
        }

        public Params(android.text.PrecomputedText.Params r3) {
                r2 = this;
                r2.<init>()
                android.text.TextPaint r0 = r3.getTextPaint()
                r2.mPaint = r0
                android.text.TextDirectionHeuristic r0 = r3.getTextDirection()
                r2.mTextDir = r0
                int r0 = r3.getBreakStrategy()
                r2.mBreakStrategy = r0
                int r0 = r3.getHyphenationFrequency()
                r2.mHyphenationFrequency = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L22
                goto L23
            L22:
                r3 = 0
            L23:
                r2.mWrapped = r3
                return
        }

        Params(android.text.TextPaint r3, android.text.TextDirectionHeuristic r4, int r5, int r6) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L21
                android.text.PrecomputedText$Params$Builder r0 = new android.text.PrecomputedText$Params$Builder
                r0.<init>(r3)
                android.text.PrecomputedText$Params$Builder r0 = r0.setBreakStrategy(r5)
                android.text.PrecomputedText$Params$Builder r0 = r0.setHyphenationFrequency(r6)
                android.text.PrecomputedText$Params$Builder r0 = r0.setTextDirection(r4)
                android.text.PrecomputedText$Params r0 = r0.build()
                r2.mWrapped = r0
                goto L24
            L21:
                r0 = 0
                r2.mWrapped = r0
            L24:
                r2.mPaint = r3
                r2.mTextDir = r4
                r2.mBreakStrategy = r5
                r2.mHyphenationFrequency = r6
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r4 != r3) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof androidx.core.text.PrecomputedTextCompat.Params
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.core.text.PrecomputedTextCompat$Params r4 = (androidx.core.text.PrecomputedTextCompat.Params) r4
                boolean r1 = r3.equalsWithoutTextDirection(r4)
                if (r1 != 0) goto L13
                return r2
            L13:
                android.text.TextDirectionHeuristic r1 = r3.mTextDir
                android.text.TextDirectionHeuristic r4 = r4.getTextDirection()
                if (r1 == r4) goto L1c
                return r2
            L1c:
                return r0
        }

        public boolean equalsWithoutTextDirection(androidx.core.text.PrecomputedTextCompat.Params r4) {
                r3 = this;
                int r0 = r3.mBreakStrategy
                int r1 = r4.getBreakStrategy()
                r2 = 0
                if (r0 == r1) goto La
                return r2
            La:
                int r0 = r3.mHyphenationFrequency
                int r1 = r4.getHyphenationFrequency()
                if (r0 == r1) goto L13
                return r2
            L13:
                android.text.TextPaint r0 = r3.mPaint
                float r0 = r0.getTextSize()
                android.text.TextPaint r1 = r4.getTextPaint()
                float r1 = r1.getTextSize()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L26
                return r2
            L26:
                android.text.TextPaint r0 = r3.mPaint
                float r0 = r0.getTextScaleX()
                android.text.TextPaint r1 = r4.getTextPaint()
                float r1 = r1.getTextScaleX()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L39
                return r2
            L39:
                android.text.TextPaint r0 = r3.mPaint
                float r0 = r0.getTextSkewX()
                android.text.TextPaint r1 = r4.getTextPaint()
                float r1 = r1.getTextSkewX()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L4c
                return r2
            L4c:
                android.text.TextPaint r0 = r3.mPaint
                float r0 = r0.getLetterSpacing()
                android.text.TextPaint r1 = r4.getTextPaint()
                float r1 = r1.getLetterSpacing()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L5f
                return r2
            L5f:
                android.text.TextPaint r0 = r3.mPaint
                java.lang.String r0 = r0.getFontFeatureSettings()
                android.text.TextPaint r1 = r4.getTextPaint()
                java.lang.String r1 = r1.getFontFeatureSettings()
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 != 0) goto L74
                return r2
            L74:
                android.text.TextPaint r0 = r3.mPaint
                int r0 = r0.getFlags()
                android.text.TextPaint r1 = r4.getTextPaint()
                int r1 = r1.getFlags()
                if (r0 == r1) goto L85
                return r2
            L85:
                android.text.TextPaint r0 = r3.mPaint
                android.os.LocaleList r0 = r0.getTextLocales()
                android.text.TextPaint r1 = r4.getTextPaint()
                android.os.LocaleList r1 = r1.getTextLocales()
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L9a
                return r2
            L9a:
                android.text.TextPaint r0 = r3.mPaint
                android.graphics.Typeface r0 = r0.getTypeface()
                if (r0 != 0) goto Lad
                android.text.TextPaint r4 = r4.getTextPaint()
                android.graphics.Typeface r4 = r4.getTypeface()
                if (r4 == 0) goto Lc2
                return r2
            Lad:
                android.text.TextPaint r0 = r3.mPaint
                android.graphics.Typeface r0 = r0.getTypeface()
                android.text.TextPaint r4 = r4.getTextPaint()
                android.graphics.Typeface r4 = r4.getTypeface()
                boolean r4 = r0.equals(r4)
                if (r4 != 0) goto Lc2
                return r2
            Lc2:
                r4 = 1
                return r4
        }

        public int getBreakStrategy() {
                r1 = this;
                int r0 = r1.mBreakStrategy
                return r0
        }

        public int getHyphenationFrequency() {
                r1 = this;
                int r0 = r1.mHyphenationFrequency
                return r0
        }

        public android.text.TextDirectionHeuristic getTextDirection() {
                r1 = this;
                android.text.TextDirectionHeuristic r0 = r1.mTextDir
                return r0
        }

        public android.text.TextPaint getTextPaint() {
                r1 = this;
                android.text.TextPaint r0 = r1.mPaint
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 11
                java.lang.Object[] r0 = new java.lang.Object[r0]
                android.text.TextPaint r1 = r3.mPaint
                float r1 = r1.getTextSize()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                android.text.TextPaint r1 = r3.mPaint
                float r1 = r1.getTextScaleX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                android.text.TextPaint r1 = r3.mPaint
                float r1 = r1.getTextSkewX()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r2 = 2
                r0[r2] = r1
                android.text.TextPaint r1 = r3.mPaint
                float r1 = r1.getLetterSpacing()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r2 = 3
                r0[r2] = r1
                android.text.TextPaint r1 = r3.mPaint
                int r1 = r1.getFlags()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 4
                r0[r2] = r1
                android.text.TextPaint r1 = r3.mPaint
                android.os.LocaleList r1 = r1.getTextLocales()
                r2 = 5
                r0[r2] = r1
                android.text.TextPaint r1 = r3.mPaint
                android.graphics.Typeface r1 = r1.getTypeface()
                r2 = 6
                r0[r2] = r1
                android.text.TextPaint r1 = r3.mPaint
                boolean r1 = r1.isElegantTextHeight()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 7
                r0[r2] = r1
                r1 = 8
                android.text.TextDirectionHeuristic r2 = r3.mTextDir
                r0[r1] = r2
                int r1 = r3.mBreakStrategy
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 9
                r0[r2] = r1
                int r1 = r3.mHyphenationFrequency
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 10
                r0[r2] = r1
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "textSize="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.mPaint
                float r2 = r2.getTextSize()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", textScaleX="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.mPaint
                float r2 = r2.getTextScaleX()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", textSkewX="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.mPaint
                float r2 = r2.getTextSkewX()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", letterSpacing="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.mPaint
                float r2 = r2.getLetterSpacing()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", elegantTextHeight="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.mPaint
                boolean r2 = r2.isElegantTextHeight()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", textLocale="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.mPaint
                android.os.LocaleList r2 = r2.getTextLocales()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", typeface="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.mPaint
                android.graphics.Typeface r2 = r2.getTypeface()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto Lcd
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", variationSettings="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.mPaint
                java.lang.String r2 = r2.getFontVariationSettings()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            Lcd:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", textDir="
                r1.<init>(r2)
                android.text.TextDirectionHeuristic r2 = r3.mTextDir
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", breakStrategy="
                r1.<init>(r2)
                int r2 = r3.mBreakStrategy
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", hyphenationFrequency="
                r1.<init>(r2)
                int r2 = r3.mHyphenationFrequency
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class PrecomputedTextFutureTask extends java.util.concurrent.FutureTask<androidx.core.text.PrecomputedTextCompat> {

        private static class PrecomputedTextCallback implements java.util.concurrent.Callable<androidx.core.text.PrecomputedTextCompat> {
            private androidx.core.text.PrecomputedTextCompat.Params mParams;
            private java.lang.CharSequence mText;

            PrecomputedTextCallback(androidx.core.text.PrecomputedTextCompat.Params r1, java.lang.CharSequence r2) {
                    r0 = this;
                    r0.<init>()
                    r0.mParams = r1
                    r0.mText = r2
                    return
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public androidx.core.text.PrecomputedTextCompat call() throws java.lang.Exception {
                    r2 = this;
                    java.lang.CharSequence r0 = r2.mText
                    androidx.core.text.PrecomputedTextCompat$Params r1 = r2.mParams
                    androidx.core.text.PrecomputedTextCompat r0 = androidx.core.text.PrecomputedTextCompat.create(r0, r1)
                    return r0
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ androidx.core.text.PrecomputedTextCompat call() throws java.lang.Exception {
                    r1 = this;
                    androidx.core.text.PrecomputedTextCompat r0 = r1.call()
                    return r0
            }
        }

        PrecomputedTextFutureTask(androidx.core.text.PrecomputedTextCompat.Params r2, java.lang.CharSequence r3) {
                r1 = this;
                androidx.core.text.PrecomputedTextCompat$PrecomputedTextFutureTask$PrecomputedTextCallback r0 = new androidx.core.text.PrecomputedTextCompat$PrecomputedTextFutureTask$PrecomputedTextCallback
                r0.<init>(r2, r3)
                r1.<init>(r0)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.text.PrecomputedTextCompat.sLock = r0
            return
    }

    private PrecomputedTextCompat(android.text.PrecomputedText r3, androidx.core.text.PrecomputedTextCompat.Params r4) {
            r2 = this;
            r2.<init>()
            r2.mText = r3
            r2.mParams = r4
            r4 = 0
            r2.mParagraphEnds = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L11
            goto L12
        L11:
            r3 = r4
        L12:
            r2.mWrapped = r3
            return
    }

    private PrecomputedTextCompat(java.lang.CharSequence r2, androidx.core.text.PrecomputedTextCompat.Params r3, int[] r4) {
            r1 = this;
            r1.<init>()
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r1.mText = r0
            r1.mParams = r3
            r1.mParagraphEnds = r4
            r2 = 0
            r1.mWrapped = r2
            return
    }

    public static androidx.core.text.PrecomputedTextCompat create(java.lang.CharSequence r5, androidx.core.text.PrecomputedTextCompat.Params r6) {
            androidx.core.util.Preconditions.checkNotNull(r5)
            androidx.core.util.Preconditions.checkNotNull(r6)
            java.lang.String r0 = "PrecomputedText"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L94
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L94
            r1 = 29
            if (r0 < r1) goto L24
            android.text.PrecomputedText$Params r0 = r6.mWrapped     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L24
            androidx.core.text.PrecomputedTextCompat r0 = new androidx.core.text.PrecomputedTextCompat     // Catch: java.lang.Throwable -> L94
            android.text.PrecomputedText$Params r1 = r6.mWrapped     // Catch: java.lang.Throwable -> L94
            android.text.PrecomputedText r5 = android.text.PrecomputedText.create(r5, r1)     // Catch: java.lang.Throwable -> L94
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L94
            androidx.core.os.TraceCompat.endSection()
            return r0
        L24:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L94
            r0.<init>()     // Catch: java.lang.Throwable -> L94
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L94
            r2 = 0
            r3 = r2
        L2f:
            if (r3 >= r1) goto L45
            r4 = 10
            int r3 = android.text.TextUtils.indexOf(r5, r4, r3, r1)     // Catch: java.lang.Throwable -> L94
            if (r3 >= 0) goto L3b
            r3 = r1
            goto L3d
        L3b:
            int r3 = r3 + 1
        L3d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L94
            r0.add(r4)     // Catch: java.lang.Throwable -> L94
            goto L2f
        L45:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L94
            int[] r1 = new int[r1]     // Catch: java.lang.Throwable -> L94
            r3 = r2
        L4c:
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L94
            if (r3 >= r4) goto L61
            java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.Throwable -> L94
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L94
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L94
            r1[r3] = r4     // Catch: java.lang.Throwable -> L94
            int r3 = r3 + 1
            goto L4c
        L61:
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L94
            android.text.TextPaint r3 = r6.getTextPaint()     // Catch: java.lang.Throwable -> L94
            r4 = 2147483647(0x7fffffff, float:NaN)
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r5, r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L94
            int r2 = r6.getBreakStrategy()     // Catch: java.lang.Throwable -> L94
            android.text.StaticLayout$Builder r0 = r0.setBreakStrategy(r2)     // Catch: java.lang.Throwable -> L94
            int r2 = r6.getHyphenationFrequency()     // Catch: java.lang.Throwable -> L94
            android.text.StaticLayout$Builder r0 = r0.setHyphenationFrequency(r2)     // Catch: java.lang.Throwable -> L94
            android.text.TextDirectionHeuristic r2 = r6.getTextDirection()     // Catch: java.lang.Throwable -> L94
            android.text.StaticLayout$Builder r0 = r0.setTextDirection(r2)     // Catch: java.lang.Throwable -> L94
            r0.build()     // Catch: java.lang.Throwable -> L94
            androidx.core.text.PrecomputedTextCompat r0 = new androidx.core.text.PrecomputedTextCompat     // Catch: java.lang.Throwable -> L94
            r0.<init>(r5, r6, r1)     // Catch: java.lang.Throwable -> L94
            androidx.core.os.TraceCompat.endSection()
            return r0
        L94:
            r5 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r5
    }

    public static java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> getTextFuture(java.lang.CharSequence r1, androidx.core.text.PrecomputedTextCompat.Params r2, java.util.concurrent.Executor r3) {
            androidx.core.text.PrecomputedTextCompat$PrecomputedTextFutureTask r0 = new androidx.core.text.PrecomputedTextCompat$PrecomputedTextFutureTask
            r0.<init>(r2, r1)
            if (r3 != 0) goto L1c
            java.lang.Object r1 = androidx.core.text.PrecomputedTextCompat.sLock
            monitor-enter(r1)
            java.util.concurrent.Executor r2 = androidx.core.text.PrecomputedTextCompat.sExecutor     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L15
            r2 = 1
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newFixedThreadPool(r2)     // Catch: java.lang.Throwable -> L19
            androidx.core.text.PrecomputedTextCompat.sExecutor = r2     // Catch: java.lang.Throwable -> L19
        L15:
            java.util.concurrent.Executor r3 = androidx.core.text.PrecomputedTextCompat.sExecutor     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r2
        L1c:
            r3.execute(r0)
            return r0
    }

    @Override // java.lang.CharSequence
    public char charAt(int r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            char r2 = r0.charAt(r2)
            return r2
    }

    public int getParagraphCount() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            android.text.PrecomputedText r0 = r2.mWrapped
            int r0 = r0.getParagraphCount()
            return r0
        Ld:
            int[] r0 = r2.mParagraphEnds
            int r0 = r0.length
            return r0
    }

    public int getParagraphEnd(int r4) {
            r3 = this;
            int r0 = r3.getParagraphCount()
            java.lang.String r1 = "paraIndex"
            r2 = 0
            androidx.core.util.Preconditions.checkArgumentInRange(r4, r2, r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L17
            android.text.PrecomputedText r0 = r3.mWrapped
            int r4 = r0.getParagraphEnd(r4)
            return r4
        L17:
            int[] r0 = r3.mParagraphEnds
            r4 = r0[r4]
            return r4
    }

    public int getParagraphStart(int r4) {
            r3 = this;
            int r0 = r3.getParagraphCount()
            java.lang.String r1 = "paraIndex"
            r2 = 0
            androidx.core.util.Preconditions.checkArgumentInRange(r4, r2, r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L17
            android.text.PrecomputedText r0 = r3.mWrapped
            int r4 = r0.getParagraphStart(r4)
            return r4
        L17:
            if (r4 != 0) goto L1a
            goto L20
        L1a:
            int[] r0 = r3.mParagraphEnds
            int r4 = r4 + (-1)
            r2 = r0[r4]
        L20:
            return r2
    }

    public androidx.core.text.PrecomputedTextCompat.Params getParams() {
            r1 = this;
            androidx.core.text.PrecomputedTextCompat$Params r0 = r1.mParams
            return r0
    }

    public android.text.PrecomputedText getPrecomputedText() {
            r2 = this;
            android.text.Spannable r0 = r2.mText
            boolean r1 = r0 instanceof android.text.PrecomputedText
            if (r1 == 0) goto L9
            android.text.PrecomputedText r0 = (android.text.PrecomputedText) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r2 = r0.getSpanEnd(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r2 = r0.getSpanFlags(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r2 = r0.getSpanStart(r2)
            return r2
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int r3, int r4, java.lang.Class<T> r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            android.text.PrecomputedText r0 = r2.mWrapped
            java.lang.Object[] r3 = r0.getSpans(r3, r4, r5)
            return r3
        Ld:
            android.text.Spannable r0 = r2.mText
            java.lang.Object[] r3 = r0.getSpans(r3, r4, r5)
            return r3
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r2 = r0.nextSpanTransition(r2, r3, r4)
            return r2
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            android.text.PrecomputedText r0 = r2.mWrapped
            r0.removeSpan(r3)
            goto L15
        L10:
            android.text.Spannable r0 = r2.mText
            r0.removeSpan(r3)
        L15:
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "MetricAffectingSpan can not be removed from PrecomputedText."
            r3.<init>(r0)
            throw r3
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object r3, int r4, int r5, int r6) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            android.text.PrecomputedText r0 = r2.mWrapped
            r0.setSpan(r3, r4, r5, r6)
            goto L15
        L10:
            android.text.Spannable r0 = r2.mText
            r0.setSpan(r3, r4, r5, r6)
        L15:
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "MetricAffectingSpan can not be set to PrecomputedText."
            r3.<init>(r4)
            throw r3
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            java.lang.CharSequence r2 = r0.subSequence(r2, r3)
            return r2
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            java.lang.String r0 = r0.toString()
            return r0
    }
}
