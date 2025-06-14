package androidx.core.widget;

/* loaded from: classes.dex */
public final class TextViewCompat {
    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
    private static final int LINES = 1;
    private static final java.lang.String LOG_TAG = "TextViewCompat";
    private static java.lang.reflect.Field sMaxModeField;
    private static boolean sMaxModeFieldFetched;
    private static java.lang.reflect.Field sMaximumField;
    private static boolean sMaximumFieldFetched;
    private static java.lang.reflect.Field sMinModeField;
    private static boolean sMinModeFieldFetched;
    private static java.lang.reflect.Field sMinimumField;
    private static boolean sMinimumFieldFetched;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AutoSizeTextType {
    }

    private static class OreoCallback implements android.view.ActionMode.Callback {
        private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
        private final android.view.ActionMode.Callback mCallback;
        private boolean mCanUseMenuBuilderReferences;
        private boolean mInitializedMenuBuilderReferences;
        private java.lang.Class<?> mMenuBuilderClass;
        private java.lang.reflect.Method mMenuBuilderRemoveItemAtMethod;
        private final android.widget.TextView mTextView;

        OreoCallback(android.view.ActionMode.Callback r1, android.widget.TextView r2) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                r0.mTextView = r2
                r1 = 0
                r0.mInitializedMenuBuilderReferences = r1
                return
        }

        private android.content.Intent createProcessTextIntent() {
                r2 = this;
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "android.intent.action.PROCESS_TEXT"
                android.content.Intent r0 = r0.setAction(r1)
                java.lang.String r1 = "text/plain"
                android.content.Intent r0 = r0.setType(r1)
                return r0
        }

        private android.content.Intent createProcessTextIntentForResolveInfo(android.content.pm.ResolveInfo r3, android.widget.TextView r4) {
                r2 = this;
                android.content.Intent r0 = r2.createProcessTextIntent()
                boolean r4 = r2.isEditable(r4)
                r4 = r4 ^ 1
                java.lang.String r1 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r4 = r0.putExtra(r1, r4)
                android.content.pm.ActivityInfo r0 = r3.activityInfo
                java.lang.String r0 = r0.packageName
                android.content.pm.ActivityInfo r3 = r3.activityInfo
                java.lang.String r3 = r3.name
                android.content.Intent r3 = r4.setClassName(r0, r3)
                return r3
        }

        private java.util.List<android.content.pm.ResolveInfo> getSupportedActivities(android.content.Context r4, android.content.pm.PackageManager r5) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                boolean r1 = r4 instanceof android.app.Activity
                if (r1 != 0) goto La
                return r0
            La:
                android.content.Intent r1 = r3.createProcessTextIntent()
                r2 = 0
                java.util.List r5 = r5.queryIntentActivities(r1, r2)
                java.util.Iterator r5 = r5.iterator()
            L17:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L2d
                java.lang.Object r1 = r5.next()
                android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
                boolean r2 = r3.isSupportedActivity(r1, r4)
                if (r2 == 0) goto L17
                r0.add(r1)
                goto L17
            L2d:
                return r0
        }

        private boolean isEditable(android.widget.TextView r2) {
                r1 = this;
                boolean r0 = r2 instanceof android.text.Editable
                if (r0 == 0) goto L12
                boolean r0 = r2.onCheckIsTextEditor()
                if (r0 == 0) goto L12
                boolean r2 = r2.isEnabled()
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        private boolean isSupportedActivity(android.content.pm.ResolveInfo r4, android.content.Context r5) {
                r3 = this;
                java.lang.String r0 = r5.getPackageName()
                android.content.pm.ActivityInfo r1 = r4.activityInfo
                java.lang.String r1 = r1.packageName
                boolean r0 = r0.equals(r1)
                r1 = 1
                if (r0 == 0) goto L10
                return r1
            L10:
                android.content.pm.ActivityInfo r0 = r4.activityInfo
                boolean r0 = r0.exported
                r2 = 0
                if (r0 != 0) goto L18
                return r2
            L18:
                android.content.pm.ActivityInfo r0 = r4.activityInfo
                java.lang.String r0 = r0.permission
                if (r0 == 0) goto L2a
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                java.lang.String r4 = r4.permission
                int r4 = r5.checkSelfPermission(r4)
                if (r4 != 0) goto L29
                goto L2a
            L29:
                r1 = r2
            L2a:
                return r1
        }

        private void recomputeProcessTextMenuItems(android.view.Menu r9) {
                r8 = this;
                android.widget.TextView r0 = r8.mTextView
                android.content.Context r0 = r0.getContext()
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                boolean r2 = r8.mInitializedMenuBuilderReferences
                java.lang.String r3 = "removeItemAt"
                r4 = 0
                r5 = 1
                if (r2 != 0) goto L32
                r8.mInitializedMenuBuilderReferences = r5
                java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L2b
                r8.mMenuBuilderClass = r2     // Catch: java.lang.Throwable -> L2b
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L2b
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L2b
                r6[r4] = r7     // Catch: java.lang.Throwable -> L2b
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch: java.lang.Throwable -> L2b
                r8.mMenuBuilderRemoveItemAtMethod = r2     // Catch: java.lang.Throwable -> L2b
                r8.mCanUseMenuBuilderReferences = r5     // Catch: java.lang.Throwable -> L2b
                goto L32
            L2b:
                r2 = 0
                r8.mMenuBuilderClass = r2
                r8.mMenuBuilderRemoveItemAtMethod = r2
                r8.mCanUseMenuBuilderReferences = r4
            L32:
                boolean r2 = r8.mCanUseMenuBuilderReferences     // Catch: java.lang.Throwable -> La9
                if (r2 == 0) goto L41
                java.lang.Class<?> r2 = r8.mMenuBuilderClass     // Catch: java.lang.Throwable -> La9
                boolean r2 = r2.isInstance(r9)     // Catch: java.lang.Throwable -> La9
                if (r2 == 0) goto L41
                java.lang.reflect.Method r2 = r8.mMenuBuilderRemoveItemAtMethod     // Catch: java.lang.Throwable -> La9
                goto L4f
            L41:
                java.lang.Class r2 = r9.getClass()     // Catch: java.lang.Throwable -> La9
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> La9
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> La9
                r6[r4] = r7     // Catch: java.lang.Throwable -> La9
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch: java.lang.Throwable -> La9
            L4f:
                int r3 = r9.size()     // Catch: java.lang.Throwable -> La9
                int r3 = r3 - r5
            L54:
                if (r3 < 0) goto L7e
                android.view.MenuItem r6 = r9.getItem(r3)     // Catch: java.lang.Throwable -> La9
                android.content.Intent r7 = r6.getIntent()     // Catch: java.lang.Throwable -> La9
                if (r7 == 0) goto L7b
                java.lang.String r7 = "android.intent.action.PROCESS_TEXT"
                android.content.Intent r6 = r6.getIntent()     // Catch: java.lang.Throwable -> La9
                java.lang.String r6 = r6.getAction()     // Catch: java.lang.Throwable -> La9
                boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> La9
                if (r6 == 0) goto L7b
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> La9
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> La9
                r6[r4] = r7     // Catch: java.lang.Throwable -> La9
                r2.invoke(r9, r6)     // Catch: java.lang.Throwable -> La9
            L7b:
                int r3 = r3 + (-1)
                goto L54
            L7e:
                java.util.List r0 = r8.getSupportedActivities(r0, r1)
                r2 = r4
            L83:
                int r3 = r0.size()
                if (r2 >= r3) goto La9
                java.lang.Object r3 = r0.get(r2)
                android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
                int r6 = r2 + 100
                java.lang.CharSequence r7 = r3.loadLabel(r1)
                android.view.MenuItem r6 = r9.add(r4, r4, r6, r7)
                android.widget.TextView r7 = r8.mTextView
                android.content.Intent r3 = r8.createProcessTextIntentForResolveInfo(r3, r7)
                android.view.MenuItem r3 = r6.setIntent(r3)
                r3.setShowAsAction(r5)
                int r2 = r2 + 1
                goto L83
            La9:
                return
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(android.view.ActionMode r2, android.view.MenuItem r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.mCallback
                boolean r2 = r0.onActionItemClicked(r2, r3)
                return r2
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(android.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.mCallback
                boolean r2 = r0.onCreateActionMode(r2, r3)
                return r2
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(android.view.ActionMode r2) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.mCallback
                r0.onDestroyActionMode(r2)
                return
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(android.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                r1.recomputeProcessTextMenuItems(r3)
                android.view.ActionMode$Callback r0 = r1.mCallback
                boolean r2 = r0.onPrepareActionMode(r2, r3)
                return r2
        }
    }

    private TextViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getAutoSizeMaxTextSize(android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int r2 = r2.getAutoSizeMaxTextSize()
            return r2
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L16
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            int r2 = r2.getAutoSizeMaxTextSize()
            return r2
        L16:
            r2 = -1
            return r2
    }

    public static int getAutoSizeMinTextSize(android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int r2 = r2.getAutoSizeMinTextSize()
            return r2
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L16
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            int r2 = r2.getAutoSizeMinTextSize()
            return r2
        L16:
            r2 = -1
            return r2
    }

    public static int getAutoSizeStepGranularity(android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int r2 = r2.getAutoSizeStepGranularity()
            return r2
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L16
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            int r2 = r2.getAutoSizeStepGranularity()
            return r2
        L16:
            r2 = -1
            return r2
    }

    public static int[] getAutoSizeTextAvailableSizes(android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int[] r2 = r2.getAutoSizeTextAvailableSizes()
            return r2
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L16
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            int[] r2 = r2.getAutoSizeTextAvailableSizes()
            return r2
        L16:
            r2 = 0
            int[] r2 = new int[r2]
            return r2
    }

    public static int getAutoSizeTextType(android.widget.TextView r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Lb
            int r2 = r2.getAutoSizeTextType()
            return r2
        Lb:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L16
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            int r2 = r2.getAutoSizeTextType()
            return r2
        L16:
            r2 = 0
            return r2
    }

    public static android.content.res.ColorStateList getCompoundDrawableTintList(android.widget.TextView r0) {
            androidx.core.util.Preconditions.checkNotNull(r0)
            android.content.res.ColorStateList r0 = r0.getCompoundDrawableTintList()
            return r0
    }

    public static android.graphics.PorterDuff.Mode getCompoundDrawableTintMode(android.widget.TextView r0) {
            androidx.core.util.Preconditions.checkNotNull(r0)
            android.graphics.PorterDuff$Mode r0 = r0.getCompoundDrawableTintMode()
            return r0
    }

    public static android.graphics.drawable.Drawable[] getCompoundDrawablesRelative(android.widget.TextView r0) {
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            return r0
    }

    public static int getFirstBaselineToTopHeight(android.widget.TextView r1) {
            int r0 = r1.getPaddingTop()
            android.text.TextPaint r1 = r1.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.top
            int r0 = r0 - r1
            return r0
    }

    public static int getLastBaselineToBottomHeight(android.widget.TextView r1) {
            int r0 = r1.getPaddingBottom()
            android.text.TextPaint r1 = r1.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.bottom
            int r0 = r0 + r1
            return r0
    }

    public static int getMaxLines(android.widget.TextView r0) {
            int r0 = r0.getMaxLines()
            return r0
    }

    public static int getMinLines(android.widget.TextView r0) {
            int r0 = r0.getMinLines()
            return r0
    }

    private static int getTextDirection(android.text.TextDirectionHeuristic r2) {
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            r1 = 1
            if (r2 != r0) goto L6
            return r1
        L6:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r2 != r0) goto Lb
            return r1
        Lb:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r2 != r0) goto L11
            r2 = 2
            return r2
        L11:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            if (r2 != r0) goto L17
            r2 = 3
            return r2
        L17:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL
            if (r2 != r0) goto L1d
            r2 = 4
            return r2
        L1d:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LOCALE
            if (r2 != r0) goto L23
            r2 = 5
            return r2
        L23:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r2 != r0) goto L29
            r2 = 6
            return r2
        L29:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r2 != r0) goto L2f
            r2 = 7
            return r2
        L2f:
            return r1
    }

    private static android.text.TextDirectionHeuristic getTextDirectionHeuristic(android.widget.TextView r4) {
            android.text.method.TransformationMethod r0 = r4.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto Lb
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            return r4
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L3e
            int r0 = r4.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L3e
            java.util.Locale r4 = r4.getTextLocale()
            android.icu.text.DecimalFormatSymbols r4 = android.icu.text.DecimalFormatSymbols.getInstance(r4)
            java.lang.String[] r4 = r4.getDigitStrings()
            r4 = r4[r2]
            int r4 = r4.codePointAt(r2)
            byte r4 = java.lang.Character.getDirectionality(r4)
            if (r4 == r3) goto L3b
            r0 = 2
            if (r4 != r0) goto L38
            goto L3b
        L38:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            return r4
        L3b:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.RTL
            return r4
        L3e:
            int r0 = r4.getLayoutDirection()
            if (r0 != r3) goto L45
            r2 = r3
        L45:
            int r4 = r4.getTextDirection()
            switch(r4) {
                case 2: goto L60;
                case 3: goto L5d;
                case 4: goto L5a;
                case 5: goto L57;
                case 6: goto L54;
                case 7: goto L51;
                default: goto L4c;
            }
        L4c:
            if (r2 == 0) goto L63
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L65
        L51:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            return r4
        L54:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            return r4
        L57:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LOCALE
            return r4
        L5a:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.RTL
            return r4
        L5d:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            return r4
        L60:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            return r4
        L63:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L65:
            return r4
    }

    public static androidx.core.text.PrecomputedTextCompat.Params getTextMetricsParams(android.widget.TextView r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            androidx.core.text.PrecomputedTextCompat$Params r0 = new androidx.core.text.PrecomputedTextCompat$Params
            android.text.PrecomputedText$Params r3 = r3.getTextMetricsParams()
            r0.<init>(r3)
            return r0
        L10:
            androidx.core.text.PrecomputedTextCompat$Params$Builder r0 = new androidx.core.text.PrecomputedTextCompat$Params$Builder
            android.text.TextPaint r1 = new android.text.TextPaint
            android.text.TextPaint r2 = r3.getPaint()
            r1.<init>(r2)
            r0.<init>(r1)
            int r1 = r3.getBreakStrategy()
            r0.setBreakStrategy(r1)
            int r1 = r3.getHyphenationFrequency()
            r0.setHyphenationFrequency(r1)
            android.text.TextDirectionHeuristic r3 = getTextDirectionHeuristic(r3)
            r0.setTextDirection(r3)
            androidx.core.text.PrecomputedTextCompat$Params r3 = r0.build()
            return r3
    }

    private static java.lang.reflect.Field retrieveField(java.lang.String r3) {
            r0 = 0
            java.lang.Class<android.widget.TextView> r1 = android.widget.TextView.class
            java.lang.reflect.Field r0 = r1.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> Lc
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> Lc
            goto L26
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not retrieve "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " field."
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "TextViewCompat"
            android.util.Log.e(r1, r3)
        L26:
            return r0
    }

    private static int retrieveIntFromField(java.lang.reflect.Field r1, android.widget.TextView r2) {
            int r1 = r1.getInt(r2)     // Catch: java.lang.IllegalAccessException -> L5
            return r1
        L5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not retrieve value of "
            r2.<init>(r0)
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " field."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextViewCompat"
            android.util.Log.d(r2, r1)
            r1 = -1
            return r1
    }

    public static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView r2, int r3, int r4, int r5, int r6) throws java.lang.IllegalArgumentException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto La
            r2.setAutoSizeTextTypeUniformWithConfiguration(r3, r4, r5, r6)
            goto L13
        La:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L13
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            r2.setAutoSizeTextTypeUniformWithConfiguration(r3, r4, r5, r6)
        L13:
            return
    }

    public static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView r2, int[] r3, int r4) throws java.lang.IllegalArgumentException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto La
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r3, r4)
            goto L13
        La:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L13
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r3, r4)
        L13:
            return
    }

    public static void setAutoSizeTextTypeWithDefaults(android.widget.TextView r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto La
            r2.setAutoSizeTextTypeWithDefaults(r3)
            goto L13
        La:
            boolean r0 = r2 instanceof androidx.core.widget.AutoSizeableTextView
            if (r0 == 0) goto L13
            androidx.core.widget.AutoSizeableTextView r2 = (androidx.core.widget.AutoSizeableTextView) r2
            r2.setAutoSizeTextTypeWithDefaults(r3)
        L13:
            return
    }

    public static void setCompoundDrawableTintList(android.widget.TextView r0, android.content.res.ColorStateList r1) {
            androidx.core.util.Preconditions.checkNotNull(r0)
            r0.setCompoundDrawableTintList(r1)
            return
    }

    public static void setCompoundDrawableTintMode(android.widget.TextView r0, android.graphics.PorterDuff.Mode r1) {
            androidx.core.util.Preconditions.checkNotNull(r0)
            r0.setCompoundDrawableTintMode(r1)
            return
    }

    public static void setCompoundDrawablesRelative(android.widget.TextView r0, android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0.setCompoundDrawablesRelative(r1, r2, r3, r4)
            return
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView r0, android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
    }

    public static void setCustomSelectionActionModeCallback(android.widget.TextView r0, android.view.ActionMode.Callback r1) {
            android.view.ActionMode$Callback r1 = wrapCustomSelectionActionModeCallback(r0, r1)
            r0.setCustomSelectionActionModeCallback(r1)
            return
    }

    public static void setFirstBaselineToTopHeight(android.widget.TextView r3, int r4) {
            androidx.core.util.Preconditions.checkArgumentNonnegative(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            r3.setFirstBaselineToTopHeight(r4)
            return
        Ld:
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r3.getIncludeFontPadding()
            if (r1 == 0) goto L1e
            int r0 = r0.top
            goto L20
        L1e:
            int r0 = r0.ascent
        L20:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L36
            int r4 = r4 + r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r2 = r3.getPaddingBottom()
            r3.setPadding(r0, r4, r1, r2)
        L36:
            return
    }

    public static void setLastBaselineToBottomHeight(android.widget.TextView r3, int r4) {
            androidx.core.util.Preconditions.checkArgumentNonnegative(r4)
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r3.getIncludeFontPadding()
            if (r1 == 0) goto L14
            int r0 = r0.bottom
            goto L16
        L14:
            int r0 = r0.descent
        L16:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L2c
            int r4 = r4 - r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingRight()
            r3.setPadding(r0, r1, r2, r4)
        L2c:
            return
    }

    public static void setLineHeight(android.widget.TextView r2, int r3) {
            androidx.core.util.Preconditions.checkArgumentNonnegative(r3)
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r3 == r0) goto L15
            int r3 = r3 - r0
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r0)
        L15:
            return
    }

    public static void setPrecomputedText(android.widget.TextView r2, androidx.core.text.PrecomputedTextCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            android.text.PrecomputedText r3 = r3.getPrecomputedText()
            r2.setText(r3)
            goto L1f
        Le:
            androidx.core.text.PrecomputedTextCompat$Params r0 = getTextMetricsParams(r2)
            androidx.core.text.PrecomputedTextCompat$Params r1 = r3.getParams()
            boolean r0 = r0.equalsWithoutTextDirection(r1)
            if (r0 == 0) goto L20
            r2.setText(r3)
        L1f:
            return
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Given text can not be applied to TextView."
            r2.<init>(r3)
            throw r2
    }

    public static void setTextAppearance(android.widget.TextView r0, int r1) {
            r0.setTextAppearance(r1)
            return
    }

    public static void setTextMetricsParams(android.widget.TextView r2, androidx.core.text.PrecomputedTextCompat.Params r3) {
            android.text.TextDirectionHeuristic r0 = r3.getTextDirection()
            int r0 = getTextDirection(r0)
            r2.setTextDirection(r0)
            android.text.TextPaint r0 = r2.getPaint()
            android.text.TextPaint r1 = r3.getTextPaint()
            r0.set(r1)
            int r0 = r3.getBreakStrategy()
            r2.setBreakStrategy(r0)
            int r3 = r3.getHyphenationFrequency()
            r2.setHyphenationFrequency(r3)
            return
    }

    public static android.view.ActionMode.Callback wrapCustomSelectionActionModeCallback(android.widget.TextView r2, android.view.ActionMode.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 > r1) goto L17
            boolean r0 = r3 instanceof androidx.core.widget.TextViewCompat.OreoCallback
            if (r0 == 0) goto L11
            goto L17
        L11:
            androidx.core.widget.TextViewCompat$OreoCallback r0 = new androidx.core.widget.TextViewCompat$OreoCallback
            r0.<init>(r3, r2)
            return r0
        L17:
            return r3
    }
}
