package androidx.appcompat.widget;

/* loaded from: classes.dex */
class AppCompatTextViewAutoSizeHelper {
    private static final int DEFAULT_AUTO_SIZE_GRANULARITY_IN_PX = 1;
    private static final int DEFAULT_AUTO_SIZE_MAX_TEXT_SIZE_IN_SP = 112;
    private static final int DEFAULT_AUTO_SIZE_MIN_TEXT_SIZE_IN_SP = 12;
    private static final java.lang.String TAG = "ACTVAutoSizeHelper";
    private static final android.graphics.RectF TEMP_RECTF = null;
    static final float UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE = -1.0f;
    private static final int VERY_WIDE = 1048576;
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Field> sTextViewFieldByNameCache;
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> sTextViewMethodByNameCache;
    private float mAutoSizeMaxTextSizeInPx;
    private float mAutoSizeMinTextSizeInPx;
    private float mAutoSizeStepGranularityInPx;
    private int[] mAutoSizeTextSizesInPx;
    private int mAutoSizeTextType;
    private final android.content.Context mContext;
    private boolean mHasPresetAutoSizeValues;
    private final androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl mImpl;
    private boolean mNeedsAutoSizeText;
    private android.text.TextPaint mTempTextPaint;
    private final android.widget.TextView mTextView;

    private static class Impl {
        Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        void computeAndSetTextDirection(android.text.StaticLayout.Builder r1, android.widget.TextView r2) {
                r0 = this;
                return
        }

        boolean isHorizontallyScrollable(android.widget.TextView r3) {
                r2 = this;
                r0 = 0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                java.lang.String r1 = "getHorizontallyScrolling"
                java.lang.Object r3 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(r3, r1, r0)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                return r3
        }
    }

    private static class Impl23 extends androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl {
        Impl23() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void computeAndSetTextDirection(android.text.StaticLayout.Builder r3, android.widget.TextView r4) {
                r2 = this;
                java.lang.String r0 = "getTextDirectionHeuristic"
                android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                java.lang.Object r4 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(r4, r0, r1)
                android.text.TextDirectionHeuristic r4 = (android.text.TextDirectionHeuristic) r4
                r3.setTextDirection(r4)
                return
        }
    }

    private static class Impl29 extends androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23 {
        Impl29() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void computeAndSetTextDirection(android.text.StaticLayout.Builder r1, android.widget.TextView r2) {
                r0 = this;
                android.text.TextDirectionHeuristic r2 = r2.getTextDirectionHeuristic()
                r1.setTextDirection(r2)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        boolean isHorizontallyScrollable(android.widget.TextView r1) {
                r0 = this;
                boolean r1 = r1.isHorizontallyScrollable()
                return r1
        }
    }

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.TEMP_RECTF = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewMethodByNameCache = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewFieldByNameCache = r0
            return
    }

    AppCompatTextViewAutoSizeHelper(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mAutoSizeTextType = r0
            r2.mNeedsAutoSizeText = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mAutoSizeStepGranularityInPx = r1
            r2.mAutoSizeMinTextSizeInPx = r1
            r2.mAutoSizeMaxTextSizeInPx = r1
            int[] r1 = new int[r0]
            r2.mAutoSizeTextSizesInPx = r1
            r2.mHasPresetAutoSizeValues = r0
            r2.mTextView = r3
            android.content.Context r3 = r3.getContext()
            r2.mContext = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 < r0) goto L2c
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl29 r3 = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl29
            r3.<init>()
            r2.mImpl = r3
            goto L33
        L2c:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl23 r3 = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl23
            r3.<init>()
            r2.mImpl = r3
        L33:
            return
    }

    private static <T> T accessAndReturnWithDefault(java.lang.Object r2, java.lang.String r3, T r4) {
            java.lang.reflect.Field r0 = getTextViewField(r3)     // Catch: java.lang.IllegalAccessException -> Lc
            if (r0 != 0) goto L7
            return r4
        L7:
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.IllegalAccessException -> Lc
            return r2
        Lc:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to access TextView#"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " member"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "ACTVAutoSizeHelper"
            android.util.Log.w(r0, r3, r2)
            return r4
    }

    private int[] cleanupAutoSizePresetSizes(int[] r7) {
            r6 = this;
            int r0 = r7.length
            if (r0 != 0) goto L4
            return r7
        L4:
            java.util.Arrays.sort(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r0) goto L28
            r4 = r7[r3]
            if (r4 <= 0) goto L25
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            int r5 = java.util.Collections.binarySearch(r1, r5)
            if (r5 >= 0) goto L25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L25:
            int r3 = r3 + 1
            goto Le
        L28:
            int r3 = r1.size()
            if (r0 != r3) goto L2f
            return r7
        L2f:
            int r7 = r1.size()
            int[] r0 = new int[r7]
        L35:
            if (r2 >= r7) goto L46
            java.lang.Object r3 = r1.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L35
        L46:
            return r0
    }

    private void clearAutoSizeConfiguration() {
            r2 = this;
            r0 = 0
            r2.mAutoSizeTextType = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mAutoSizeMinTextSizeInPx = r1
            r2.mAutoSizeMaxTextSizeInPx = r1
            r2.mAutoSizeStepGranularityInPx = r1
            int[] r1 = new int[r0]
            r2.mAutoSizeTextSizesInPx = r1
            r2.mNeedsAutoSizeText = r0
            return
    }

    private android.text.StaticLayout createStaticLayoutForMeasuring(java.lang.CharSequence r4, android.text.Layout.Alignment r5, int r6, int r7) {
            r3 = this;
            int r0 = r4.length()
            android.text.TextPaint r1 = r3.mTempTextPaint
            r2 = 0
            android.text.StaticLayout$Builder r4 = android.text.StaticLayout.Builder.obtain(r4, r2, r0, r1, r6)
            android.text.StaticLayout$Builder r5 = r4.setAlignment(r5)
            android.widget.TextView r6 = r3.mTextView
            float r6 = r6.getLineSpacingExtra()
            android.widget.TextView r0 = r3.mTextView
            float r0 = r0.getLineSpacingMultiplier()
            android.text.StaticLayout$Builder r5 = r5.setLineSpacing(r6, r0)
            android.widget.TextView r6 = r3.mTextView
            boolean r6 = r6.getIncludeFontPadding()
            android.text.StaticLayout$Builder r5 = r5.setIncludePad(r6)
            android.widget.TextView r6 = r3.mTextView
            int r6 = r6.getBreakStrategy()
            android.text.StaticLayout$Builder r5 = r5.setBreakStrategy(r6)
            android.widget.TextView r6 = r3.mTextView
            int r6 = r6.getHyphenationFrequency()
            android.text.StaticLayout$Builder r5 = r5.setHyphenationFrequency(r6)
            r6 = -1
            if (r7 != r6) goto L43
            r7 = 2147483647(0x7fffffff, float:NaN)
        L43:
            r5.setMaxLines(r7)
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl r5 = r3.mImpl     // Catch: java.lang.ClassCastException -> L4e
            android.widget.TextView r6 = r3.mTextView     // Catch: java.lang.ClassCastException -> L4e
            r5.computeAndSetTextDirection(r4, r6)     // Catch: java.lang.ClassCastException -> L4e
            goto L55
        L4e:
            java.lang.String r5 = "ACTVAutoSizeHelper"
            java.lang.String r6 = "Failed to obtain TextDirectionHeuristic, auto size may be incorrect"
            android.util.Log.w(r5, r6)
        L55:
            android.text.StaticLayout r4 = r4.build()
            return r4
    }

    private android.text.StaticLayout createStaticLayoutForMeasuringPre16(java.lang.CharSequence r10, android.text.Layout.Alignment r11, int r12) {
            r9 = this;
            android.widget.TextView r0 = r9.mTextView
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "mSpacingMult"
            java.lang.Object r0 = accessAndReturnWithDefault(r0, r2, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r6 = r0.floatValue()
            android.widget.TextView r0 = r9.mTextView
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "mSpacingAdd"
            java.lang.Object r0 = accessAndReturnWithDefault(r0, r2, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r7 = r0.floatValue()
            android.widget.TextView r0 = r9.mTextView
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "mIncludePad"
            java.lang.Object r0 = accessAndReturnWithDefault(r0, r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            android.text.StaticLayout r0 = new android.text.StaticLayout
            android.text.TextPaint r3 = r9.mTempTextPaint
            r1 = r0
            r2 = r10
            r4 = r12
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private android.text.StaticLayout createStaticLayoutForMeasuringPre23(java.lang.CharSequence r10, android.text.Layout.Alignment r11, int r12) {
            r9 = this;
            android.widget.TextView r0 = r9.mTextView
            float r6 = r0.getLineSpacingMultiplier()
            android.widget.TextView r0 = r9.mTextView
            float r7 = r0.getLineSpacingExtra()
            android.widget.TextView r0 = r9.mTextView
            boolean r8 = r0.getIncludeFontPadding()
            android.text.StaticLayout r0 = new android.text.StaticLayout
            android.text.TextPaint r3 = r9.mTempTextPaint
            r1 = r0
            r2 = r10
            r4 = r12
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private int findLargestTextSizeWhichFits(android.graphics.RectF r6) {
            r5 = this;
            int[] r0 = r5.mAutoSizeTextSizesInPx
            int r0 = r0.length
            if (r0 == 0) goto L27
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L8:
            if (r1 > r0) goto L22
            int r2 = r1 + r0
            int r2 = r2 / 2
            int[] r3 = r5.mAutoSizeTextSizesInPx
            r3 = r3[r2]
            boolean r3 = r5.suggestedSizeFitsInSpace(r3, r6)
            if (r3 == 0) goto L1e
            int r2 = r2 + 1
            r4 = r2
            r2 = r1
            r1 = r4
            goto L8
        L1e:
            int r2 = r2 + (-1)
            r0 = r2
            goto L8
        L22:
            int[] r6 = r5.mAutoSizeTextSizesInPx
            r6 = r6[r2]
            return r6
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "No available text sizes to choose from."
            r6.<init>(r0)
            throw r6
    }

    private static java.lang.reflect.Field getTextViewField(java.lang.String r3) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Field> r0 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewFieldByNameCache     // Catch: java.lang.NoSuchFieldException -> L1c
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.NoSuchFieldException -> L1c
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.NoSuchFieldException -> L1c
            if (r0 != 0) goto L1b
            java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L1c
            if (r0 == 0) goto L1b
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L1c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Field> r1 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewFieldByNameCache     // Catch: java.lang.NoSuchFieldException -> L1c
            r1.put(r3, r0)     // Catch: java.lang.NoSuchFieldException -> L1c
        L1b:
            return r0
        L1c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to access TextView#"
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " member"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "ACTVAutoSizeHelper"
            android.util.Log.w(r1, r3, r0)
            r3 = 0
            return r3
    }

    private static java.lang.reflect.Method getTextViewMethod(java.lang.String r3) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r0 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewMethodByNameCache     // Catch: java.lang.Exception -> L1f
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L1f
            if (r0 != 0) goto L1e
            java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r1)     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L1e
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L1f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r1 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewMethodByNameCache     // Catch: java.lang.Exception -> L1f
            r1.put(r3, r0)     // Catch: java.lang.Exception -> L1f
        L1e:
            return r0
        L1f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to retrieve TextView#"
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = "() method"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "ACTVAutoSizeHelper"
            android.util.Log.w(r1, r3, r0)
            r3 = 0
            return r3
    }

    static <T> T invokeAndReturnWithDefault(java.lang.Object r3, java.lang.String r4, T r5) {
            java.lang.String r0 = "Failed to invoke TextView#"
            java.lang.reflect.Method r1 = getTextViewMethod(r4)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10
            java.lang.Object r5 = r1.invoke(r3, r2)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10
            goto L29
        Le:
            r3 = move-exception
            goto L2a
        L10:
            r3 = move-exception
            java.lang.String r1 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.StringBuilder r4 = r2.append(r4)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "() method"
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Le
            android.util.Log.w(r1, r4, r3)     // Catch: java.lang.Throwable -> Le
        L29:
            return r5
        L2a:
            throw r3
    }

    private void setRawTextSize(float r4) {
            r3 = this;
            android.widget.TextView r0 = r3.mTextView
            android.text.TextPaint r0 = r0.getPaint()
            float r0 = r0.getTextSize()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L52
            android.widget.TextView r0 = r3.mTextView
            android.text.TextPaint r0 = r0.getPaint()
            r0.setTextSize(r4)
            android.widget.TextView r4 = r3.mTextView
            boolean r4 = r4.isInLayout()
            android.widget.TextView r0 = r3.mTextView
            android.text.Layout r0 = r0.getLayout()
            if (r0 == 0) goto L52
            r0 = 0
            r3.mNeedsAutoSizeText = r0
            java.lang.String r1 = "nullLayouts"
            java.lang.reflect.Method r1 = getTextViewMethod(r1)     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto L40
            android.widget.TextView r2 = r3.mTextView     // Catch: java.lang.Exception -> L38
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L38
            r1.invoke(r2, r0)     // Catch: java.lang.Exception -> L38
            goto L40
        L38:
            r0 = move-exception
            java.lang.String r1 = "ACTVAutoSizeHelper"
            java.lang.String r2 = "Failed to invoke TextView#nullLayouts() method"
            android.util.Log.w(r1, r2, r0)
        L40:
            if (r4 != 0) goto L48
            android.widget.TextView r4 = r3.mTextView
            r4.requestLayout()
            goto L4d
        L48:
            android.widget.TextView r4 = r3.mTextView
            r4.forceLayout()
        L4d:
            android.widget.TextView r4 = r3.mTextView
            r4.invalidate()
        L52:
            return
    }

    private boolean setupAutoSizeText() {
            r7 = this;
            boolean r0 = r7.supportsAutoSizeText()
            r1 = 0
            if (r0 == 0) goto L41
            int r0 = r7.mAutoSizeTextType
            r2 = 1
            if (r0 != r2) goto L41
            boolean r0 = r7.mHasPresetAutoSizeValues
            if (r0 == 0) goto L15
            int[] r0 = r7.mAutoSizeTextSizesInPx
            int r0 = r0.length
            if (r0 != 0) goto L3e
        L15:
            float r0 = r7.mAutoSizeMaxTextSizeInPx
            float r3 = r7.mAutoSizeMinTextSizeInPx
            float r0 = r0 - r3
            float r3 = r7.mAutoSizeStepGranularityInPx
            float r0 = r0 / r3
            double r3 = (double) r0
            double r3 = java.lang.Math.floor(r3)
            int r0 = (int) r3
            int r0 = r0 + r2
            int[] r3 = new int[r0]
        L26:
            if (r1 >= r0) goto L38
            float r4 = r7.mAutoSizeMinTextSizeInPx
            float r5 = (float) r1
            float r6 = r7.mAutoSizeStepGranularityInPx
            float r5 = r5 * r6
            float r4 = r4 + r5
            int r4 = java.lang.Math.round(r4)
            r3[r1] = r4
            int r1 = r1 + 1
            goto L26
        L38:
            int[] r0 = r7.cleanupAutoSizePresetSizes(r3)
            r7.mAutoSizeTextSizesInPx = r0
        L3e:
            r7.mNeedsAutoSizeText = r2
            goto L43
        L41:
            r7.mNeedsAutoSizeText = r1
        L43:
            boolean r0 = r7.mNeedsAutoSizeText
            return r0
    }

    private void setupAutoSizeUniformPresetSizes(android.content.res.TypedArray r5) {
            r4 = this;
            int r0 = r5.length()
            int[] r1 = new int[r0]
            if (r0 <= 0) goto L1e
            r2 = 0
        L9:
            if (r2 >= r0) goto L15
            r3 = -1
            int r3 = r5.getDimensionPixelSize(r2, r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L15:
            int[] r5 = r4.cleanupAutoSizePresetSizes(r1)
            r4.mAutoSizeTextSizesInPx = r5
            r4.setupAutoSizeUniformPresetSizesConfiguration()
        L1e:
            return
    }

    private boolean setupAutoSizeUniformPresetSizesConfiguration() {
            r5 = this;
            int[] r0 = r5.mAutoSizeTextSizesInPx
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L9
            r4 = r3
            goto La
        L9:
            r4 = r2
        La:
            r5.mHasPresetAutoSizeValues = r4
            if (r4 == 0) goto L1f
            r5.mAutoSizeTextType = r3
            r2 = r0[r2]
            float r2 = (float) r2
            r5.mAutoSizeMinTextSizeInPx = r2
            int r1 = r1 - r3
            r0 = r0[r1]
            float r0 = (float) r0
            r5.mAutoSizeMaxTextSizeInPx = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.mAutoSizeStepGranularityInPx = r0
        L1f:
            return r4
    }

    private boolean suggestedSizeFitsInSpace(int r6, android.graphics.RectF r7) {
            r5 = this;
            android.widget.TextView r0 = r5.mTextView
            java.lang.CharSequence r0 = r0.getText()
            android.widget.TextView r1 = r5.mTextView
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            if (r1 == 0) goto L17
            android.widget.TextView r2 = r5.mTextView
            java.lang.CharSequence r1 = r1.getTransformation(r0, r2)
            if (r1 == 0) goto L17
            r0 = r1
        L17:
            android.widget.TextView r1 = r5.mTextView
            int r1 = r1.getMaxLines()
            r5.initTempTextPaint(r6)
            android.widget.TextView r6 = r5.mTextView
            java.lang.String r2 = "getLayoutAlignment"
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.Object r6 = invokeAndReturnWithDefault(r6, r2, r3)
            android.text.Layout$Alignment r6 = (android.text.Layout.Alignment) r6
            float r2 = r7.right
            int r2 = java.lang.Math.round(r2)
            android.text.StaticLayout r6 = r5.createLayout(r0, r6, r2, r1)
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L51
            int r2 = r6.getLineCount()
            if (r2 > r1) goto L50
            int r1 = r6.getLineCount()
            int r1 = r1 - r4
            int r1 = r6.getLineEnd(r1)
            int r0 = r0.length()
            if (r1 == r0) goto L51
        L50:
            return r3
        L51:
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r7 = r7.bottom
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L5d
            return r3
        L5d:
            return r4
    }

    private boolean supportsAutoSizeText() {
            r1 = this;
            android.widget.TextView r0 = r1.mTextView
            boolean r0 = r0 instanceof androidx.appcompat.widget.AppCompatEditText
            r0 = r0 ^ 1
            return r0
    }

    private void validateAndSetAutoSizeTextTypeUniformConfiguration(float r4, float r5, float r6) throws java.lang.IllegalArgumentException {
            r3 = this;
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String r2 = "px) is less or equal to (0px)"
            if (r1 <= 0) goto L5a
            int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r1 <= 0) goto L35
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1c
            r0 = 1
            r3.mAutoSizeTextType = r0
            r3.mAutoSizeMinTextSizeInPx = r4
            r3.mAutoSizeMaxTextSizeInPx = r5
            r3.mAutoSizeStepGranularityInPx = r6
            r4 = 0
            r3.mHasPresetAutoSizeValues = r4
            return
        L1c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "The auto-size step granularity ("
            r5.<init>(r0)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L35:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Maximum auto-size text size ("
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = "px) is less or equal to minimum auto-size text size ("
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = "px)"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r6.<init>(r4)
            throw r6
        L5a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Minimum auto-size text size ("
            r6.<init>(r0)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    void autoSizeText() {
            r3 = this;
            boolean r0 = r3.isAutoSizeEnabled()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r3.mNeedsAutoSizeText
            if (r0 == 0) goto L7b
            android.widget.TextView r0 = r3.mTextView
            int r0 = r0.getMeasuredHeight()
            if (r0 <= 0) goto L7a
            android.widget.TextView r0 = r3.mTextView
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L1c
            goto L7a
        L1c:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl r0 = r3.mImpl
            android.widget.TextView r1 = r3.mTextView
            boolean r0 = r0.isHorizontallyScrollable(r1)
            if (r0 == 0) goto L29
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L3d
        L29:
            android.widget.TextView r0 = r3.mTextView
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r3.mTextView
            int r1 = r1.getTotalPaddingLeft()
            int r0 = r0 - r1
            android.widget.TextView r1 = r3.mTextView
            int r1 = r1.getTotalPaddingRight()
            int r0 = r0 - r1
        L3d:
            android.widget.TextView r1 = r3.mTextView
            int r1 = r1.getHeight()
            android.widget.TextView r2 = r3.mTextView
            int r2 = r2.getCompoundPaddingBottom()
            int r1 = r1 - r2
            android.widget.TextView r2 = r3.mTextView
            int r2 = r2.getCompoundPaddingTop()
            int r1 = r1 - r2
            if (r0 <= 0) goto L7a
            if (r1 > 0) goto L56
            goto L7a
        L56:
            android.graphics.RectF r2 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.TEMP_RECTF
            monitor-enter(r2)
            r2.setEmpty()     // Catch: java.lang.Throwable -> L77
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L77
            r2.right = r0     // Catch: java.lang.Throwable -> L77
            float r0 = (float) r1     // Catch: java.lang.Throwable -> L77
            r2.bottom = r0     // Catch: java.lang.Throwable -> L77
            int r0 = r3.findLargestTextSizeWhichFits(r2)     // Catch: java.lang.Throwable -> L77
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L77
            android.widget.TextView r1 = r3.mTextView     // Catch: java.lang.Throwable -> L77
            float r1 = r1.getTextSize()     // Catch: java.lang.Throwable -> L77
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L75
            r1 = 0
            r3.setTextSizeInternal(r1, r0)     // Catch: java.lang.Throwable -> L77
        L75:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
            goto L7b
        L77:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
            throw r0
        L7a:
            return
        L7b:
            r0 = 1
            r3.mNeedsAutoSizeText = r0
            return
    }

    android.text.StaticLayout createLayout(java.lang.CharSequence r1, android.text.Layout.Alignment r2, int r3, int r4) {
            r0 = this;
            android.text.StaticLayout r1 = r0.createStaticLayoutForMeasuring(r1, r2, r3, r4)
            return r1
    }

    int getAutoSizeMaxTextSize() {
            r1 = this;
            float r0 = r1.mAutoSizeMaxTextSizeInPx
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    int getAutoSizeMinTextSize() {
            r1 = this;
            float r0 = r1.mAutoSizeMinTextSizeInPx
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    int getAutoSizeStepGranularity() {
            r1 = this;
            float r0 = r1.mAutoSizeStepGranularityInPx
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            int[] r0 = r1.mAutoSizeTextSizesInPx
            return r0
    }

    int getAutoSizeTextType() {
            r1 = this;
            int r0 = r1.mAutoSizeTextType
            return r0
    }

    void initTempTextPaint(int r3) {
            r2 = this;
            android.text.TextPaint r0 = r2.mTempTextPaint
            if (r0 != 0) goto Lc
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r2.mTempTextPaint = r0
            goto Lf
        Lc:
            r0.reset()
        Lf:
            android.text.TextPaint r0 = r2.mTempTextPaint
            android.widget.TextView r1 = r2.mTextView
            android.text.TextPaint r1 = r1.getPaint()
            r0.set(r1)
            android.text.TextPaint r0 = r2.mTempTextPaint
            float r3 = (float) r3
            r0.setTextSize(r3)
            return
    }

    boolean isAutoSizeEnabled() {
            r1 = this;
            boolean r0 = r1.supportsAutoSizeText()
            if (r0 == 0) goto Lc
            int r0 = r1.mAutoSizeTextType
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r11, int r12) {
            r10 = this;
            android.content.Context r0 = r10.mContext
            int[] r1 = androidx.appcompat.C0015R.styleable.AppCompatTextView
            r2 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r11, r1, r12, r2)
            android.widget.TextView r3 = r10.mTextView
            android.content.Context r4 = r3.getContext()
            int[] r5 = androidx.appcompat.C0015R.styleable.AppCompatTextView
            r9 = 0
            r6 = r11
            r7 = r0
            r8 = r12
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8, r9)
            int r11 = androidx.appcompat.C0015R.styleable.AppCompatTextView_autoSizeTextType
            boolean r11 = r0.hasValue(r11)
            if (r11 == 0) goto L28
            int r11 = androidx.appcompat.C0015R.styleable.AppCompatTextView_autoSizeTextType
            int r11 = r0.getInt(r11, r2)
            r10.mAutoSizeTextType = r11
        L28:
            int r11 = androidx.appcompat.C0015R.styleable.AppCompatTextView_autoSizeStepGranularity
            boolean r11 = r0.hasValue(r11)
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 == 0) goto L39
            int r11 = androidx.appcompat.C0015R.styleable.AppCompatTextView_autoSizeStepGranularity
            float r11 = r0.getDimension(r11, r12)
            goto L3a
        L39:
            r11 = r12
        L3a:
            int r1 = androidx.appcompat.C0015R.styleable.AppCompatTextView_autoSizeMinTextSize
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L49
            int r1 = androidx.appcompat.C0015R.styleable.AppCompatTextView_autoSizeMinTextSize
            float r1 = r0.getDimension(r1, r12)
            goto L4a
        L49:
            r1 = r12
        L4a:
            int r3 = androidx.appcompat.C0015R.styleable.AppCompatTextView_autoSizeMaxTextSize
            boolean r3 = r0.hasValue(r3)
            if (r3 == 0) goto L59
            int r3 = androidx.appcompat.C0015R.styleable.AppCompatTextView_autoSizeMaxTextSize
            float r3 = r0.getDimension(r3, r12)
            goto L5a
        L59:
            r3 = r12
        L5a:
            int r4 = androidx.appcompat.C0015R.styleable.AppCompatTextView_autoSizePresetSizes
            boolean r4 = r0.hasValue(r4)
            if (r4 == 0) goto L78
            int r4 = androidx.appcompat.C0015R.styleable.AppCompatTextView_autoSizePresetSizes
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L78
            android.content.res.Resources r5 = r0.getResources()
            android.content.res.TypedArray r4 = r5.obtainTypedArray(r4)
            r10.setupAutoSizeUniformPresetSizes(r4)
            r4.recycle()
        L78:
            r0.recycle()
            boolean r0 = r10.supportsAutoSizeText()
            if (r0 == 0) goto Lb6
            int r0 = r10.mAutoSizeTextType
            r2 = 1
            if (r0 != r2) goto Lb8
            boolean r0 = r10.mHasPresetAutoSizeValues
            if (r0 != 0) goto Lb2
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r2 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            r4 = 2
            if (r2 != 0) goto L9f
            r1 = 1094713344(0x41400000, float:12.0)
            float r1 = android.util.TypedValue.applyDimension(r4, r1, r0)
        L9f:
            int r2 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r2 != 0) goto La9
            r2 = 1121976320(0x42e00000, float:112.0)
            float r3 = android.util.TypedValue.applyDimension(r4, r2, r0)
        La9:
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 != 0) goto Laf
            r11 = 1065353216(0x3f800000, float:1.0)
        Laf:
            r10.validateAndSetAutoSizeTextTypeUniformConfiguration(r1, r3, r11)
        Lb2:
            r10.setupAutoSizeText()
            goto Lb8
        Lb6:
            r10.mAutoSizeTextType = r2
        Lb8:
            return
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = r1.supportsAutoSizeText()
            if (r0 == 0) goto L2b
            android.content.Context r0 = r1.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = (float) r2
            float r2 = android.util.TypedValue.applyDimension(r5, r2, r0)
            float r3 = (float) r3
            float r3 = android.util.TypedValue.applyDimension(r5, r3, r0)
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r5, r4, r0)
            r1.validateAndSetAutoSizeTextTypeUniformConfiguration(r2, r3, r4)
            boolean r2 = r1.setupAutoSizeText()
            if (r2 == 0) goto L2b
            r1.autoSizeText()
        L2b:
            return
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] r6, int r7) throws java.lang.IllegalArgumentException {
            r5 = this;
            boolean r0 = r5.supportsAutoSizeText()
            if (r0 == 0) goto L60
            int r0 = r6.length
            r1 = 0
            if (r0 <= 0) goto L55
            int[] r2 = new int[r0]
            if (r7 != 0) goto L13
            int[] r2 = java.util.Arrays.copyOf(r6, r0)
            goto L2f
        L13:
            android.content.Context r3 = r5.mContext
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
        L1d:
            if (r1 >= r0) goto L2f
            r4 = r6[r1]
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r7, r4, r3)
            int r4 = java.lang.Math.round(r4)
            r2[r1] = r4
            int r1 = r1 + 1
            goto L1d
        L2f:
            int[] r7 = r5.cleanupAutoSizePresetSizes(r2)
            r5.mAutoSizeTextSizesInPx = r7
            boolean r7 = r5.setupAutoSizeUniformPresetSizesConfiguration()
            if (r7 == 0) goto L3c
            goto L57
        L3c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "None of the preset sizes is valid: "
            r0.<init>(r1)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L55:
            r5.mHasPresetAutoSizeValues = r1
        L57:
            boolean r6 = r5.setupAutoSizeText()
            if (r6 == 0) goto L60
            r5.autoSizeText()
        L60:
            return
    }

    void setAutoSizeTextTypeWithDefaults(int r4) {
            r3 = this;
            boolean r0 = r3.supportsAutoSizeText()
            if (r0 == 0) goto L49
            if (r4 == 0) goto L46
            r0 = 1
            if (r4 != r0) goto L31
            android.content.Context r4 = r3.mContext
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r0 = 1094713344(0x41400000, float:12.0)
            r1 = 2
            float r0 = android.util.TypedValue.applyDimension(r1, r0, r4)
            r2 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r1, r2, r4)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.validateAndSetAutoSizeTextTypeUniformConfiguration(r0, r4, r1)
            boolean r4 = r3.setupAutoSizeText()
            if (r4 == 0) goto L49
            r3.autoSizeText()
            goto L49
        L31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown auto-size text type: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L46:
            r3.clearAutoSizeConfiguration()
        L49:
            return
    }

    void setTextSizeInternal(int r2, float r3) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            if (r0 != 0) goto L9
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            goto Ld
        L9:
            android.content.res.Resources r0 = r0.getResources()
        Ld:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r2, r3, r0)
            r1.setRawTextSize(r2)
            return
    }
}
