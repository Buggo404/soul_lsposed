package androidx.core.widget;

/* loaded from: classes.dex */
public interface AutoSizeableTextView {
    public static final boolean PLATFORM_SUPPORTS_AUTOSIZE = false;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.core.widget.AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE = r0
            return
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int r1, int r2, int r3, int r4) throws java.lang.IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] r1, int r2) throws java.lang.IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int r1);
}
