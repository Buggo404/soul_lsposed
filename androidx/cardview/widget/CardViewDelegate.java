package androidx.cardview.widget;

/* loaded from: classes.dex */
interface CardViewDelegate {
    android.graphics.drawable.Drawable getCardBackground();

    android.view.View getCardView();

    boolean getPreventCornerOverlap();

    boolean getUseCompatPadding();

    void setCardBackground(android.graphics.drawable.Drawable r1);

    void setMinWidthHeightInternal(int r1, int r2);

    void setShadowPadding(int r1, int r2, int r3, int r4);
}
