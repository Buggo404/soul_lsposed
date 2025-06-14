package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class AppCompatTextView extends android.widget.TextView implements androidx.core.view.TintableBackgroundView, androidx.core.widget.TintableCompoundDrawablesView, androidx.core.widget.AutoSizeableTextView {
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private boolean mIsSetTypefaceProcessing;
    private java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> mPrecomputedTextFuture;
    private final androidx.appcompat.widget.AppCompatTextClassifierHelper mTextClassifierHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    public AppCompatTextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatTextView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = androidx.appcompat.widget.TintContextWrapper.wrap(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mIsSetTypefaceProcessing = r1
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r0, r1)
            androidx.appcompat.widget.AppCompatBackgroundHelper r1 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r1.<init>(r0)
            r0.mBackgroundTintHelper = r1
            r1.loadFromAttributes(r2, r3)
            androidx.appcompat.widget.AppCompatTextHelper r1 = new androidx.appcompat.widget.AppCompatTextHelper
            r1.<init>(r0)
            r0.mTextHelper = r1
            r1.loadFromAttributes(r2, r3)
            r1.applyCompoundDrawablesTints()
            androidx.appcompat.widget.AppCompatTextClassifierHelper r1 = new androidx.appcompat.widget.AppCompatTextClassifierHelper
            r1.<init>(r0)
            r0.mTextClassifierHelper = r1
            return
    }

    private void consumeTextFutureAndSetBlocking() {
            r2 = this;
            java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> r0 = r2.mPrecomputedTextFuture
            if (r0 == 0) goto L10
            r1 = 0
            r2.mPrecomputedTextFuture = r1     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L10
            androidx.core.text.PrecomputedTextCompat r0 = (androidx.core.text.PrecomputedTextCompat) r0     // Catch: java.lang.Throwable -> L10
            androidx.core.widget.TextViewCompat.setPrecomputedText(r2, r0)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.applySupportBackgroundTint()
        La:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L11
            r0.applyCompoundDrawablesTints()
        L11:
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatTextView.PLATFORM_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
        L9:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L12
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
        L12:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatTextView.PLATFORM_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeMinTextSize()
            return r0
        L9:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L12
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
        L12:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatTextView.PLATFORM_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeStepGranularity()
            return r0
        L9:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L12
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
        L12:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatTextView.PLATFORM_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L9
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
        L9:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L12
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
        L12:
            r0 = 0
            int[] r0 = new int[r0]
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeTextType() {
            r3 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatTextView.PLATFORM_SUPPORTS_AUTOSIZE
            r1 = 0
            if (r0 == 0) goto Le
            int r0 = super.getAutoSizeTextType()
            r2 = 1
            if (r0 != r2) goto Ld
            r1 = r2
        Ld:
            return r1
        Le:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r3.mTextHelper
            if (r0 == 0) goto L17
            int r0 = r0.getAutoSizeTextType()
            return r0
        L17:
            return r1
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
            r1 = this;
            int r0 = androidx.core.widget.TextViewCompat.getFirstBaselineToTopHeight(r1)
            return r0
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
            r1 = this;
            int r0 = androidx.core.widget.TextViewCompat.getLastBaselineToBottomHeight(r1)
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getSupportBackgroundTintList()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.getSupportBackgroundTintMode()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            android.content.res.ColorStateList r0 = r0.getCompoundDrawableTintList()
            return r0
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            android.graphics.PorterDuff$Mode r0 = r0.getCompoundDrawableTintMode()
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r1 = this;
            r1.consumeTextFutureAndSetBlocking()
            java.lang.CharSequence r0 = super.getText()
            return r0
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L10
            androidx.appcompat.widget.AppCompatTextClassifierHelper r0 = r2.mTextClassifierHelper
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            android.view.textclassifier.TextClassifier r0 = r0.getTextClassifier()
            return r0
        L10:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    public androidx.core.text.PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
            r1 = this;
            androidx.core.text.PrecomputedTextCompat$Params r0 = androidx.core.widget.TextViewCompat.getTextMetricsParams(r1)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r2.mTextHelper
            r1.populateSurroundingTextIfNeeded(r2, r0, r3)
            android.view.inputmethod.InputConnection r3 = androidx.appcompat.widget.AppCompatHintHelper.onCreateInputConnection(r0, r3, r2)
            return r3
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            androidx.appcompat.widget.AppCompatTextHelper r0 = r6.mTextHelper
            if (r0 == 0) goto Lf
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.onLayout(r1, r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r0.consumeTextFutureAndSetBlocking()
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto L18
            boolean r1 = androidx.appcompat.widget.AppCompatTextView.PLATFORM_SUPPORTS_AUTOSIZE
            if (r1 != 0) goto L18
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            boolean r1 = r1.isAutoSizeEnabled()
            if (r1 == 0) goto L18
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            r1.autoSizeText()
        L18:
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatTextView.PLATFORM_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto Lf
        L8:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto Lf
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatTextView.PLATFORM_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            goto Lf
        L8:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto Lf
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
        Lf:
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatTextView.PLATFORM_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeWithDefaults(r2)
            goto Lf
        L8:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto Lf
            r0.setAutoSizeTextTypeWithDefaults(r2)
        Lf:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.onSetBackgroundDrawable(r2)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.onSetBackgroundResource(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.onSetCompoundDrawables()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.onSetCompoundDrawables()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r6)
        L23:
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r4, r5, r1)
            androidx.appcompat.widget.AppCompatTextHelper r3 = r2.mTextHelper
            if (r3 == 0) goto L2d
            r3.onSetCompoundDrawables()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.onSetCompoundDrawables()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r6)
        L23:
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, r1)
            androidx.appcompat.widget.AppCompatTextHelper r3 = r2.mTextHelper
            if (r3 == 0) goto L2d
            r3.onSetCompoundDrawables()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.onSetCompoundDrawables()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            super.setFirstBaselineToTopHeight(r3)
            goto Ld
        La:
            androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(r2, r3)
        Ld:
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            super.setLastBaselineToBottomHeight(r3)
            goto Ld
        La:
            androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(r2, r3)
        Ld:
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r1) {
            r0 = this;
            androidx.core.widget.TextViewCompat.setLineHeight(r0, r1)
            return
    }

    public void setPrecomputedText(androidx.core.text.PrecomputedTextCompat r1) {
            r0 = this;
            androidx.core.widget.TextViewCompat.setPrecomputedText(r0, r1)
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.setSupportBackgroundTintList(r2)
        L7:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.setSupportBackgroundTintMode(r2)
        L7:
            return
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setCompoundDrawableTintList(r2)
            androidx.appcompat.widget.AppCompatTextHelper r2 = r1.mTextHelper
            r2.applyCompoundDrawablesTints()
            return
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setCompoundDrawableTintMode(r2)
            androidx.appcompat.widget.AppCompatTextHelper r2 = r1.mTextHelper
            r2.applyCompoundDrawablesTints()
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto La
            r0.onSetTextAppearance(r2, r3)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Lf
            androidx.appcompat.widget.AppCompatTextClassifierHelper r0 = r2.mTextClassifierHelper
            if (r0 != 0) goto Lb
            goto Lf
        Lb:
            r0.setTextClassifier(r3)
            return
        Lf:
            super.setTextClassifier(r3)
            return
    }

    public void setTextFuture(java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> r1) {
            r0 = this;
            r0.mPrecomputedTextFuture = r1
            if (r1 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public void setTextMetricsParamsCompat(androidx.core.text.PrecomputedTextCompat.Params r1) {
            r0 = this;
            androidx.core.widget.TextViewCompat.setTextMetricsParams(r0, r1)
            return
    }

    @Override // android.widget.TextView
    public void setTextSize(int r2, float r3) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatTextView.PLATFORM_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L8
            super.setTextSize(r2, r3)
            goto Lf
        L8:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto Lf
            r0.setTextSize(r2, r3)
        Lf:
            return
    }

    @Override // android.widget.TextView
    public void setTypeface(android.graphics.Typeface r3, int r4) {
            r2 = this;
            boolean r0 = r2.mIsSetTypefaceProcessing
            if (r0 == 0) goto L5
            return
        L5:
            if (r3 == 0) goto L12
            if (r4 <= 0) goto L12
            android.content.Context r0 = r2.getContext()
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.create(r0, r3, r4)
            goto L13
        L12:
            r0 = 0
        L13:
            r1 = 1
            r2.mIsSetTypefaceProcessing = r1
            if (r0 == 0) goto L19
            r3 = r0
        L19:
            r0 = 0
            super.setTypeface(r3, r4)     // Catch: java.lang.Throwable -> L20
            r2.mIsSetTypefaceProcessing = r0
            return
        L20:
            r3 = move-exception
            r2.mIsSetTypefaceProcessing = r0
            throw r3
    }
}
