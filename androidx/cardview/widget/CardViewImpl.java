package androidx.cardview.widget;

/* loaded from: classes.dex */
interface CardViewImpl {
    android.content.res.ColorStateList getBackgroundColor(androidx.cardview.widget.CardViewDelegate r1);

    float getElevation(androidx.cardview.widget.CardViewDelegate r1);

    float getMaxElevation(androidx.cardview.widget.CardViewDelegate r1);

    float getMinHeight(androidx.cardview.widget.CardViewDelegate r1);

    float getMinWidth(androidx.cardview.widget.CardViewDelegate r1);

    float getRadius(androidx.cardview.widget.CardViewDelegate r1);

    void initStatic();

    void initialize(androidx.cardview.widget.CardViewDelegate r1, android.content.Context r2, android.content.res.ColorStateList r3, float r4, float r5, float r6);

    void onCompatPaddingChanged(androidx.cardview.widget.CardViewDelegate r1);

    void onPreventCornerOverlapChanged(androidx.cardview.widget.CardViewDelegate r1);

    void setBackgroundColor(androidx.cardview.widget.CardViewDelegate r1, android.content.res.ColorStateList r2);

    void setElevation(androidx.cardview.widget.CardViewDelegate r1, float r2);

    void setMaxElevation(androidx.cardview.widget.CardViewDelegate r1, float r2);

    void setRadius(androidx.cardview.widget.CardViewDelegate r1, float r2);

    void updatePadding(androidx.cardview.widget.CardViewDelegate r1);
}
