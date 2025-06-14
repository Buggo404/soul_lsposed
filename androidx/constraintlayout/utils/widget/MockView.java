package androidx.constraintlayout.utils.widget;

/* loaded from: classes.dex */
public class MockView extends android.view.View {
    private int mDiagonalsColor;
    private boolean mDrawDiagonals;
    private boolean mDrawLabel;
    private int mMargin;
    private android.graphics.Paint mPaintDiagonals;
    private android.graphics.Paint mPaintText;
    private android.graphics.Paint mPaintTextBackground;
    protected java.lang.String mText;
    private int mTextBackgroundColor;
    private android.graphics.Rect mTextBounds;
    private int mTextColor;

    public MockView(android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.mPaintDiagonals = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.mPaintText = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.mPaintTextBackground = r0
            r0 = 1
            r3.mDrawDiagonals = r0
            r3.mDrawLabel = r0
            r0 = 0
            r3.mText = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.mTextBounds = r1
            r1 = 0
            r2 = 255(0xff, float:3.57E-43)
            int r1 = android.graphics.Color.argb(r2, r1, r1, r1)
            r3.mDiagonalsColor = r1
            r1 = 200(0xc8, float:2.8E-43)
            int r1 = android.graphics.Color.argb(r2, r1, r1, r1)
            r3.mTextColor = r1
            r1 = 50
            int r1 = android.graphics.Color.argb(r2, r1, r1, r1)
            r3.mTextBackgroundColor = r1
            r1 = 4
            r3.mMargin = r1
            r3.init(r4, r0)
            return
    }

    public MockView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.mPaintDiagonals = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.mPaintText = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.mPaintTextBackground = r0
            r0 = 1
            r2.mDrawDiagonals = r0
            r2.mDrawLabel = r0
            r0 = 0
            r2.mText = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTextBounds = r0
            r0 = 0
            r1 = 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.argb(r1, r0, r0, r0)
            r2.mDiagonalsColor = r0
            r0 = 200(0xc8, float:2.8E-43)
            int r0 = android.graphics.Color.argb(r1, r0, r0, r0)
            r2.mTextColor = r0
            r0 = 50
            int r0 = android.graphics.Color.argb(r1, r0, r0, r0)
            r2.mTextBackgroundColor = r0
            r0 = 4
            r2.mMargin = r0
            r2.init(r3, r4)
            return
    }

    public MockView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r1.mPaintDiagonals = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r1.mPaintText = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r1.mPaintTextBackground = r4
            r4 = 1
            r1.mDrawDiagonals = r4
            r1.mDrawLabel = r4
            r4 = 0
            r1.mText = r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r1.mTextBounds = r4
            r4 = 0
            r0 = 255(0xff, float:3.57E-43)
            int r4 = android.graphics.Color.argb(r0, r4, r4, r4)
            r1.mDiagonalsColor = r4
            r4 = 200(0xc8, float:2.8E-43)
            int r4 = android.graphics.Color.argb(r0, r4, r4, r4)
            r1.mTextColor = r4
            r4 = 50
            int r4 = android.graphics.Color.argb(r0, r4, r4, r4)
            r1.mTextBackgroundColor = r4
            r4 = 4
            r1.mMargin = r4
            r1.init(r2, r3)
            return
    }

    private void init(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            if (r6 == 0) goto L64
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.MockView
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r0)
            int r0 = r6.getIndexCount()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L61
            int r2 = r6.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MockView_mock_label
            if (r2 != r3) goto L1e
            java.lang.String r2 = r6.getString(r2)
            r4.mText = r2
            goto L5e
        L1e:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MockView_mock_showDiagonals
            if (r2 != r3) goto L2b
            boolean r3 = r4.mDrawDiagonals
            boolean r2 = r6.getBoolean(r2, r3)
            r4.mDrawDiagonals = r2
            goto L5e
        L2b:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MockView_mock_diagonalsColor
            if (r2 != r3) goto L38
            int r3 = r4.mDiagonalsColor
            int r2 = r6.getColor(r2, r3)
            r4.mDiagonalsColor = r2
            goto L5e
        L38:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MockView_mock_labelBackgroundColor
            if (r2 != r3) goto L45
            int r3 = r4.mTextBackgroundColor
            int r2 = r6.getColor(r2, r3)
            r4.mTextBackgroundColor = r2
            goto L5e
        L45:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MockView_mock_labelColor
            if (r2 != r3) goto L52
            int r3 = r4.mTextColor
            int r2 = r6.getColor(r2, r3)
            r4.mTextColor = r2
            goto L5e
        L52:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MockView_mock_showLabel
            if (r2 != r3) goto L5e
            boolean r3 = r4.mDrawLabel
            boolean r2 = r6.getBoolean(r2, r3)
            r4.mDrawLabel = r2
        L5e:
            int r1 = r1 + 1
            goto Ld
        L61:
            r6.recycle()
        L64:
            java.lang.String r6 = r4.mText
            if (r6 != 0) goto L76
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Exception -> L76
            int r6 = r4.getId()     // Catch: java.lang.Exception -> L76
            java.lang.String r5 = r5.getResourceEntryName(r6)     // Catch: java.lang.Exception -> L76
            r4.mText = r5     // Catch: java.lang.Exception -> L76
        L76:
            android.graphics.Paint r5 = r4.mPaintDiagonals
            int r6 = r4.mDiagonalsColor
            r5.setColor(r6)
            android.graphics.Paint r5 = r4.mPaintDiagonals
            r6 = 1
            r5.setAntiAlias(r6)
            android.graphics.Paint r5 = r4.mPaintText
            int r0 = r4.mTextColor
            r5.setColor(r0)
            android.graphics.Paint r5 = r4.mPaintText
            r5.setAntiAlias(r6)
            android.graphics.Paint r5 = r4.mPaintTextBackground
            int r6 = r4.mTextBackgroundColor
            r5.setColor(r6)
            int r5 = r4.mMargin
            float r5 = (float) r5
            android.content.res.Resources r6 = r4.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.xdpi
            r0 = 1126170624(0x43200000, float:160.0)
            float r6 = r6 / r0
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            r4.mMargin = r5
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            super.onDraw(r14)
            int r0 = r13.getWidth()
            int r1 = r13.getHeight()
            boolean r2 = r13.mDrawDiagonals
            if (r2 == 0) goto L44
            int r0 = r0 + (-1)
            int r1 = r1 + (-1)
            r3 = 0
            r4 = 0
            float r11 = (float) r0
            float r12 = (float) r1
            android.graphics.Paint r7 = r13.mPaintDiagonals
            r2 = r14
            r5 = r11
            r6 = r12
            r2.drawLine(r3, r4, r5, r6, r7)
            r6 = 0
            r9 = 0
            android.graphics.Paint r10 = r13.mPaintDiagonals
            r5 = r14
            r7 = r12
            r8 = r11
            r5.drawLine(r6, r7, r8, r9, r10)
            r7 = 0
            android.graphics.Paint r10 = r13.mPaintDiagonals
            r5.drawLine(r6, r7, r8, r9, r10)
            android.graphics.Paint r10 = r13.mPaintDiagonals
            r6 = r11
            r9 = r12
            r5.drawLine(r6, r7, r8, r9, r10)
            r8 = 0
            android.graphics.Paint r10 = r13.mPaintDiagonals
            r7 = r12
            r5.drawLine(r6, r7, r8, r9, r10)
            r6 = 0
            r9 = 0
            android.graphics.Paint r10 = r13.mPaintDiagonals
            r5.drawLine(r6, r7, r8, r9, r10)
        L44:
            java.lang.String r2 = r13.mText
            if (r2 == 0) goto La8
            boolean r3 = r13.mDrawLabel
            if (r3 == 0) goto La8
            android.graphics.Paint r3 = r13.mPaintText
            int r4 = r2.length()
            android.graphics.Rect r5 = r13.mTextBounds
            r6 = 0
            r3.getTextBounds(r2, r6, r4, r5)
            android.graphics.Rect r2 = r13.mTextBounds
            int r2 = r2.width()
            int r0 = r0 - r2
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            android.graphics.Rect r3 = r13.mTextBounds
            int r3 = r3.height()
            int r1 = r1 - r3
            float r1 = (float) r1
            float r1 = r1 / r2
            android.graphics.Rect r2 = r13.mTextBounds
            int r2 = r2.height()
            float r2 = (float) r2
            float r1 = r1 + r2
            android.graphics.Rect r2 = r13.mTextBounds
            int r3 = (int) r0
            int r4 = (int) r1
            r2.offset(r3, r4)
            android.graphics.Rect r2 = r13.mTextBounds
            int r3 = r2.left
            int r4 = r13.mMargin
            int r3 = r3 - r4
            android.graphics.Rect r4 = r13.mTextBounds
            int r4 = r4.top
            int r5 = r13.mMargin
            int r4 = r4 - r5
            android.graphics.Rect r5 = r13.mTextBounds
            int r5 = r5.right
            int r6 = r13.mMargin
            int r5 = r5 + r6
            android.graphics.Rect r6 = r13.mTextBounds
            int r6 = r6.bottom
            int r7 = r13.mMargin
            int r6 = r6 + r7
            r2.set(r3, r4, r5, r6)
            android.graphics.Rect r2 = r13.mTextBounds
            android.graphics.Paint r3 = r13.mPaintTextBackground
            r14.drawRect(r2, r3)
            java.lang.String r2 = r13.mText
            android.graphics.Paint r3 = r13.mPaintText
            r14.drawText(r2, r0, r1, r3)
        La8:
            return
    }
}
