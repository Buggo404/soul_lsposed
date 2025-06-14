package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f43x;

    /* renamed from: y */
    public int f44y;

    public Rectangle() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean contains(int r3, int r4) {
            r2 = this;
            int r0 = r2.f43x
            if (r3 < r0) goto L14
            int r1 = r2.width
            int r0 = r0 + r1
            if (r3 >= r0) goto L14
            int r3 = r2.f44y
            if (r4 < r3) goto L14
            int r0 = r2.height
            int r3 = r3 + r0
            if (r4 >= r3) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            return r3
    }

    public int getCenterX() {
            r2 = this;
            int r0 = r2.f43x
            int r1 = r2.width
            int r0 = r0 + r1
            int r0 = r0 / 2
            return r0
    }

    public int getCenterY() {
            r2 = this;
            int r0 = r2.f44y
            int r1 = r2.height
            int r0 = r0 + r1
            int r0 = r0 / 2
            return r0
    }

    void grow(int r2, int r3) {
            r1 = this;
            int r0 = r1.f43x
            int r0 = r0 - r2
            r1.f43x = r0
            int r0 = r1.f44y
            int r0 = r0 - r3
            r1.f44y = r0
            int r0 = r1.width
            int r2 = r2 * 2
            int r0 = r0 + r2
            r1.width = r0
            int r2 = r1.height
            int r3 = r3 * 2
            int r2 = r2 + r3
            r1.height = r2
            return
    }

    boolean intersects(androidx.constraintlayout.core.widgets.Rectangle r4) {
            r3 = this;
            int r0 = r3.f43x
            int r1 = r4.f43x
            if (r0 < r1) goto L18
            int r2 = r4.width
            int r1 = r1 + r2
            if (r0 >= r1) goto L18
            int r0 = r3.f44y
            int r1 = r4.f44y
            if (r0 < r1) goto L18
            int r4 = r4.height
            int r1 = r1 + r4
            if (r0 >= r1) goto L18
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            return r4
    }

    public void setBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f43x = r1
            r0.f44y = r2
            r0.width = r3
            r0.height = r4
            return
    }
}
