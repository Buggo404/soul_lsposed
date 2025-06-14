package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class TintTypedArray {
    private final android.content.Context mContext;
    private android.util.TypedValue mTypedValue;
    private final android.content.res.TypedArray mWrapped;

    private TintTypedArray(android.content.Context r1, android.content.res.TypedArray r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mWrapped = r2
            return
    }

    public static androidx.appcompat.widget.TintTypedArray obtainStyledAttributes(android.content.Context r1, int r2, int[] r3) {
            androidx.appcompat.widget.TintTypedArray r0 = new androidx.appcompat.widget.TintTypedArray
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.appcompat.widget.TintTypedArray obtainStyledAttributes(android.content.Context r1, android.util.AttributeSet r2, int[] r3) {
            androidx.appcompat.widget.TintTypedArray r0 = new androidx.appcompat.widget.TintTypedArray
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.appcompat.widget.TintTypedArray obtainStyledAttributes(android.content.Context r1, android.util.AttributeSet r2, int[] r3, int r4, int r5) {
            androidx.appcompat.widget.TintTypedArray r0 = new androidx.appcompat.widget.TintTypedArray
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r0.<init>(r1, r2)
            return r0
    }

    public boolean getBoolean(int r2, boolean r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            boolean r2 = r0.getBoolean(r2, r3)
            return r2
    }

    public int getChangingConfigurations() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.getChangingConfigurations()
            return r0
    }

    public int getColor(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r2 = r0.getColor(r2, r3)
            return r2
    }

    public android.content.res.ColorStateList getColorStateList(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.mWrapped
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L1a
            android.content.res.TypedArray r0 = r2.mWrapped
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L1a
            android.content.Context r1 = r2.mContext
            android.content.res.ColorStateList r0 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r1, r0)
            if (r0 == 0) goto L1a
            return r0
        L1a:
            android.content.res.TypedArray r0 = r2.mWrapped
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
    }

    public float getDimension(int r2, float r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            float r2 = r0.getDimension(r2, r3)
            return r2
    }

    public int getDimensionPixelOffset(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r2 = r0.getDimensionPixelOffset(r2, r3)
            return r2
    }

    public int getDimensionPixelSize(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r2 = r0.getDimensionPixelSize(r2, r3)
            return r2
    }

    public android.graphics.drawable.Drawable getDrawable(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.mWrapped
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L18
            android.content.res.TypedArray r0 = r2.mWrapped
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L18
            android.content.Context r3 = r2.mContext
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r3, r0)
            return r3
        L18:
            android.content.res.TypedArray r0 = r2.mWrapped
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
    }

    public android.graphics.drawable.Drawable getDrawableIfKnown(int r4) {
            r3 = this;
            android.content.res.TypedArray r0 = r3.mWrapped
            boolean r0 = r0.hasValue(r4)
            if (r0 == 0) goto L1d
            android.content.res.TypedArray r0 = r3.mWrapped
            r1 = 0
            int r4 = r0.getResourceId(r4, r1)
            if (r4 == 0) goto L1d
            androidx.appcompat.widget.AppCompatDrawableManager r0 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            android.content.Context r1 = r3.mContext
            r2 = 1
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r1, r4, r2)
            return r4
        L1d:
            r4 = 0
            return r4
    }

    public float getFloat(int r2, float r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            float r2 = r0.getFloat(r2, r3)
            return r2
    }

    public android.graphics.Typeface getFont(int r3, int r4, androidx.core.content.res.ResourcesCompat.FontCallback r5) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.mWrapped
            r1 = 0
            int r3 = r0.getResourceId(r3, r1)
            if (r3 != 0) goto Lb
            r3 = 0
            return r3
        Lb:
            android.util.TypedValue r0 = r2.mTypedValue
            if (r0 != 0) goto L16
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r2.mTypedValue = r0
        L16:
            android.content.Context r0 = r2.mContext
            android.util.TypedValue r1 = r2.mTypedValue
            android.graphics.Typeface r3 = androidx.core.content.res.ResourcesCompat.getFont(r0, r3, r1, r4, r5)
            return r3
    }

    public float getFraction(int r2, int r3, int r4, float r5) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            float r2 = r0.getFraction(r2, r3, r4, r5)
            return r2
    }

    public int getIndex(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r2 = r0.getIndex(r2)
            return r2
    }

    public int getIndexCount() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.getIndexCount()
            return r0
    }

    public int getInt(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r2 = r0.getInt(r2, r3)
            return r2
    }

    public int getInteger(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r2 = r0.getInteger(r2, r3)
            return r2
    }

    public int getLayoutDimension(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r2 = r0.getLayoutDimension(r2, r3)
            return r2
    }

    public int getLayoutDimension(int r2, java.lang.String r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r2 = r0.getLayoutDimension(r2, r3)
            return r2
    }

    public java.lang.String getNonResourceString(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            java.lang.String r2 = r0.getNonResourceString(r2)
            return r2
    }

    public java.lang.String getPositionDescription() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            java.lang.String r0 = r0.getPositionDescription()
            return r0
    }

    public int getResourceId(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r2 = r0.getResourceId(r2, r3)
            return r2
    }

    public android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            android.content.res.Resources r0 = r0.getResources()
            return r0
    }

    public java.lang.String getString(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    public java.lang.CharSequence getText(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            java.lang.CharSequence r2 = r0.getText(r2)
            return r2
    }

    public java.lang.CharSequence[] getTextArray(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            java.lang.CharSequence[] r2 = r0.getTextArray(r2)
            return r2
    }

    public int getType(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r2 = r0.getType(r2)
            return r2
    }

    public boolean getValue(int r2, android.util.TypedValue r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            boolean r2 = r0.getValue(r2, r3)
            return r2
    }

    public android.content.res.TypedArray getWrappedTypeArray() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            return r0
    }

    public boolean hasValue(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            boolean r2 = r0.hasValue(r2)
            return r2
    }

    public int length() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            int r0 = r0.length()
            return r0
    }

    public android.util.TypedValue peekValue(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            android.util.TypedValue r2 = r0.peekValue(r2)
            return r2
    }

    public void recycle() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.mWrapped
            r0.recycle()
            return
    }
}
