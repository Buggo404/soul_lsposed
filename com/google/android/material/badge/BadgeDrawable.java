package com.google.android.material.badge;

/* loaded from: classes.dex */
public class BadgeDrawable extends android.graphics.drawable.Drawable implements com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate {
    private static final int BADGE_NUMBER_NONE = -1;
    public static final int BOTTOM_END = 8388693;
    public static final int BOTTOM_START = 8388691;
    static final java.lang.String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;
    private static final int DEFAULT_STYLE = 0;
    private static final int DEFAULT_THEME_ATTR = 0;
    private static final int MAX_CIRCULAR_BADGE_NUMBER_COUNT = 9;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    private java.lang.ref.WeakReference<android.view.View> anchorViewRef;
    private final android.graphics.Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;
    private final float badgeRadius;
    private final float badgeWidePadding;
    private final float badgeWithTextRadius;
    private final java.lang.ref.WeakReference<android.content.Context> contextRef;
    private float cornerRadius;
    private java.lang.ref.WeakReference<android.widget.FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    private final com.google.android.material.badge.BadgeDrawable.SavedState savedState;
    private final com.google.android.material.shape.MaterialShapeDrawable shapeDrawable;
    private final com.google.android.material.internal.TextDrawableHelper textDrawableHelper;


    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    public static final class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.material.badge.BadgeDrawable.SavedState> CREATOR = null;
        private int alpha;
        private int backgroundColor;
        private int badgeGravity;
        private int badgeTextColor;
        private int contentDescriptionExceedsMaxBadgeNumberRes;
        private java.lang.CharSequence contentDescriptionNumberless;
        private int contentDescriptionQuantityStrings;
        private int horizontalOffset;
        private boolean isVisible;
        private int maxCharacterCount;
        private int number;
        private int verticalOffset;


        static {
                com.google.android.material.badge.BadgeDrawable$SavedState$1 r0 = new com.google.android.material.badge.BadgeDrawable$SavedState$1
                r0.<init>()
                com.google.android.material.badge.BadgeDrawable.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.content.Context r3) {
                r2 = this;
                r2.<init>()
                r0 = 255(0xff, float:3.57E-43)
                r2.alpha = r0
                r0 = -1
                r2.number = r0
                com.google.android.material.resources.TextAppearance r0 = new com.google.android.material.resources.TextAppearance
                int r1 = com.google.android.material.C0479R.style.TextAppearance_MaterialComponents_Badge
                r0.<init>(r3, r1)
                android.content.res.ColorStateList r0 = r0.textColor
                int r0 = r0.getDefaultColor()
                r2.badgeTextColor = r0
                int r0 = com.google.android.material.C0479R.string.mtrl_badge_numberless_content_description
                java.lang.String r3 = r3.getString(r0)
                r2.contentDescriptionNumberless = r3
                int r3 = com.google.android.material.C0479R.plurals.mtrl_badge_content_description
                r2.contentDescriptionQuantityStrings = r3
                int r3 = com.google.android.material.C0479R.string.mtrl_exceed_max_badge_number_content_description
                r2.contentDescriptionExceedsMaxBadgeNumberRes = r3
                r3 = 1
                r2.isVisible = r3
                return
        }

        protected SavedState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                r0 = 255(0xff, float:3.57E-43)
                r1.alpha = r0
                r0 = -1
                r1.number = r0
                int r0 = r2.readInt()
                r1.backgroundColor = r0
                int r0 = r2.readInt()
                r1.badgeTextColor = r0
                int r0 = r2.readInt()
                r1.alpha = r0
                int r0 = r2.readInt()
                r1.number = r0
                int r0 = r2.readInt()
                r1.maxCharacterCount = r0
                java.lang.String r0 = r2.readString()
                r1.contentDescriptionNumberless = r0
                int r0 = r2.readInt()
                r1.contentDescriptionQuantityStrings = r0
                int r0 = r2.readInt()
                r1.badgeGravity = r0
                int r0 = r2.readInt()
                r1.horizontalOffset = r0
                int r0 = r2.readInt()
                r1.verticalOffset = r0
                int r2 = r2.readInt()
                if (r2 == 0) goto L4e
                r2 = 1
                goto L4f
            L4e:
                r2 = 0
            L4f:
                r1.isVisible = r2
                return
        }

        static /* synthetic */ boolean access$000(com.google.android.material.badge.BadgeDrawable.SavedState r0) {
                boolean r0 = r0.isVisible
                return r0
        }

        static /* synthetic */ boolean access$002(com.google.android.material.badge.BadgeDrawable.SavedState r0, boolean r1) {
                r0.isVisible = r1
                return r1
        }

        static /* synthetic */ int access$100(com.google.android.material.badge.BadgeDrawable.SavedState r0) {
                int r0 = r0.maxCharacterCount
                return r0
        }

        static /* synthetic */ int access$1000(com.google.android.material.badge.BadgeDrawable.SavedState r0) {
                int r0 = r0.contentDescriptionQuantityStrings
                return r0
        }

        static /* synthetic */ int access$1002(com.google.android.material.badge.BadgeDrawable.SavedState r0, int r1) {
                r0.contentDescriptionQuantityStrings = r1
                return r1
        }

        static /* synthetic */ int access$102(com.google.android.material.badge.BadgeDrawable.SavedState r0, int r1) {
                r0.maxCharacterCount = r1
                return r1
        }

        static /* synthetic */ int access$1100(com.google.android.material.badge.BadgeDrawable.SavedState r0) {
                int r0 = r0.contentDescriptionExceedsMaxBadgeNumberRes
                return r0
        }

        static /* synthetic */ int access$1102(com.google.android.material.badge.BadgeDrawable.SavedState r0, int r1) {
                r0.contentDescriptionExceedsMaxBadgeNumberRes = r1
                return r1
        }

        static /* synthetic */ int access$200(com.google.android.material.badge.BadgeDrawable.SavedState r0) {
                int r0 = r0.number
                return r0
        }

        static /* synthetic */ int access$202(com.google.android.material.badge.BadgeDrawable.SavedState r0, int r1) {
                r0.number = r1
                return r1
        }

        static /* synthetic */ int access$300(com.google.android.material.badge.BadgeDrawable.SavedState r0) {
                int r0 = r0.backgroundColor
                return r0
        }

        static /* synthetic */ int access$302(com.google.android.material.badge.BadgeDrawable.SavedState r0, int r1) {
                r0.backgroundColor = r1
                return r1
        }

        static /* synthetic */ int access$400(com.google.android.material.badge.BadgeDrawable.SavedState r0) {
                int r0 = r0.badgeTextColor
                return r0
        }

        static /* synthetic */ int access$402(com.google.android.material.badge.BadgeDrawable.SavedState r0, int r1) {
                r0.badgeTextColor = r1
                return r1
        }

        static /* synthetic */ int access$500(com.google.android.material.badge.BadgeDrawable.SavedState r0) {
                int r0 = r0.badgeGravity
                return r0
        }

        static /* synthetic */ int access$502(com.google.android.material.badge.BadgeDrawable.SavedState r0, int r1) {
                r0.badgeGravity = r1
                return r1
        }

        static /* synthetic */ int access$600(com.google.android.material.badge.BadgeDrawable.SavedState r0) {
                int r0 = r0.horizontalOffset
                return r0
        }

        static /* synthetic */ int access$602(com.google.android.material.badge.BadgeDrawable.SavedState r0, int r1) {
                r0.horizontalOffset = r1
                return r1
        }

        static /* synthetic */ int access$700(com.google.android.material.badge.BadgeDrawable.SavedState r0) {
                int r0 = r0.verticalOffset
                return r0
        }

        static /* synthetic */ int access$702(com.google.android.material.badge.BadgeDrawable.SavedState r0, int r1) {
                r0.verticalOffset = r1
                return r1
        }

        static /* synthetic */ int access$800(com.google.android.material.badge.BadgeDrawable.SavedState r0) {
                int r0 = r0.alpha
                return r0
        }

        static /* synthetic */ int access$802(com.google.android.material.badge.BadgeDrawable.SavedState r0, int r1) {
                r0.alpha = r1
                return r1
        }

        static /* synthetic */ java.lang.CharSequence access$900(com.google.android.material.badge.BadgeDrawable.SavedState r0) {
                java.lang.CharSequence r0 = r0.contentDescriptionNumberless
                return r0
        }

        static /* synthetic */ java.lang.CharSequence access$902(com.google.android.material.badge.BadgeDrawable.SavedState r0, java.lang.CharSequence r1) {
                r0.contentDescriptionNumberless = r1
                return r1
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.backgroundColor
                r1.writeInt(r2)
                int r2 = r0.badgeTextColor
                r1.writeInt(r2)
                int r2 = r0.alpha
                r1.writeInt(r2)
                int r2 = r0.number
                r1.writeInt(r2)
                int r2 = r0.maxCharacterCount
                r1.writeInt(r2)
                java.lang.CharSequence r2 = r0.contentDescriptionNumberless
                java.lang.String r2 = r2.toString()
                r1.writeString(r2)
                int r2 = r0.contentDescriptionQuantityStrings
                r1.writeInt(r2)
                int r2 = r0.badgeGravity
                r1.writeInt(r2)
                int r2 = r0.horizontalOffset
                r1.writeInt(r2)
                int r2 = r0.verticalOffset
                r1.writeInt(r2)
                boolean r2 = r0.isVisible
                r1.writeInt(r2)
                return
        }
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_Badge
            com.google.android.material.badge.BadgeDrawable.DEFAULT_STYLE = r0
            int r0 = com.google.android.material.C0479R.attr.badgeStyle
            com.google.android.material.badge.BadgeDrawable.DEFAULT_THEME_ATTR = r0
            return
    }

    private BadgeDrawable(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.contextRef = r0
            com.google.android.material.internal.ThemeEnforcement.checkMaterialTheme(r3)
            android.content.res.Resources r0 = r3.getResources()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.badgeBounds = r1
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>()
            r2.shapeDrawable = r1
            int r1 = com.google.android.material.C0479R.dimen.mtrl_badge_radius
            int r1 = r0.getDimensionPixelSize(r1)
            float r1 = (float) r1
            r2.badgeRadius = r1
            int r1 = com.google.android.material.C0479R.dimen.mtrl_badge_long_text_horizontal_padding
            int r1 = r0.getDimensionPixelSize(r1)
            float r1 = (float) r1
            r2.badgeWidePadding = r1
            int r1 = com.google.android.material.C0479R.dimen.mtrl_badge_with_text_radius
            int r0 = r0.getDimensionPixelSize(r1)
            float r0 = (float) r0
            r2.badgeWithTextRadius = r0
            com.google.android.material.internal.TextDrawableHelper r0 = new com.google.android.material.internal.TextDrawableHelper
            r0.<init>(r2)
            r2.textDrawableHelper = r0
            android.text.TextPaint r0 = r0.getTextPaint()
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = new com.google.android.material.badge.BadgeDrawable$SavedState
            r0.<init>(r3)
            r2.savedState = r0
            int r3 = com.google.android.material.C0479R.style.TextAppearance_MaterialComponents_Badge
            r2.setTextAppearanceResource(r3)
            return
    }

    private void calculateCenterAndBounds(android.content.Context r4, android.graphics.Rect r5, android.view.View r6) {
            r3 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r3.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$500(r0)
            r1 = 8388691(0x800053, float:1.175506E-38)
            if (r0 == r1) goto L1d
            r2 = 8388693(0x800055, float:1.1755063E-38)
            if (r0 == r2) goto L1d
            int r0 = r5.top
            com.google.android.material.badge.BadgeDrawable$SavedState r2 = r3.savedState
            int r2 = com.google.android.material.badge.BadgeDrawable.SavedState.access$700(r2)
            int r0 = r0 + r2
            float r0 = (float) r0
            r3.badgeCenterY = r0
            goto L29
        L1d:
            int r0 = r5.bottom
            com.google.android.material.badge.BadgeDrawable$SavedState r2 = r3.savedState
            int r2 = com.google.android.material.badge.BadgeDrawable.SavedState.access$700(r2)
            int r0 = r0 - r2
            float r0 = (float) r0
            r3.badgeCenterY = r0
        L29:
            int r0 = r3.getNumber()
            r2 = 9
            if (r0 > r2) goto L43
            boolean r0 = r3.hasNumber()
            if (r0 != 0) goto L3a
            float r0 = r3.badgeRadius
            goto L3c
        L3a:
            float r0 = r3.badgeWithTextRadius
        L3c:
            r3.cornerRadius = r0
            r3.halfBadgeHeight = r0
            r3.halfBadgeWidth = r0
            goto L5b
        L43:
            float r0 = r3.badgeWithTextRadius
            r3.cornerRadius = r0
            r3.halfBadgeHeight = r0
            java.lang.String r0 = r3.getBadgeText()
            com.google.android.material.internal.TextDrawableHelper r2 = r3.textDrawableHelper
            float r0 = r2.getTextWidth(r0)
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r2 = r3.badgeWidePadding
            float r0 = r0 + r2
            r3.halfBadgeWidth = r0
        L5b:
            android.content.res.Resources r4 = r4.getResources()
            boolean r0 = r3.hasNumber()
            if (r0 == 0) goto L68
            int r0 = com.google.android.material.C0479R.dimen.mtrl_badge_text_horizontal_edge_offset
            goto L6a
        L68:
            int r0 = com.google.android.material.C0479R.dimen.mtrl_badge_horizontal_edge_offset
        L6a:
            int r4 = r4.getDimensionPixelSize(r0)
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r3.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$500(r0)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            if (r0 == r2) goto La5
            if (r0 == r1) goto La5
            int r6 = androidx.core.view.ViewCompat.getLayoutDirection(r6)
            if (r6 != 0) goto L92
            int r5 = r5.right
            float r5 = (float) r5
            float r6 = r3.halfBadgeWidth
            float r5 = r5 + r6
            float r4 = (float) r4
            float r5 = r5 - r4
            com.google.android.material.badge.BadgeDrawable$SavedState r4 = r3.savedState
            int r4 = com.google.android.material.badge.BadgeDrawable.SavedState.access$600(r4)
            float r4 = (float) r4
            float r5 = r5 - r4
            goto La2
        L92:
            int r5 = r5.left
            float r5 = (float) r5
            float r6 = r3.halfBadgeWidth
            float r5 = r5 - r6
            float r4 = (float) r4
            float r5 = r5 + r4
            com.google.android.material.badge.BadgeDrawable$SavedState r4 = r3.savedState
            int r4 = com.google.android.material.badge.BadgeDrawable.SavedState.access$600(r4)
            float r4 = (float) r4
            float r5 = r5 + r4
        La2:
            r3.badgeCenterX = r5
            goto Lce
        La5:
            int r6 = androidx.core.view.ViewCompat.getLayoutDirection(r6)
            if (r6 != 0) goto Lbc
            int r5 = r5.left
            float r5 = (float) r5
            float r6 = r3.halfBadgeWidth
            float r5 = r5 - r6
            float r4 = (float) r4
            float r5 = r5 + r4
            com.google.android.material.badge.BadgeDrawable$SavedState r4 = r3.savedState
            int r4 = com.google.android.material.badge.BadgeDrawable.SavedState.access$600(r4)
            float r4 = (float) r4
            float r5 = r5 + r4
            goto Lcc
        Lbc:
            int r5 = r5.right
            float r5 = (float) r5
            float r6 = r3.halfBadgeWidth
            float r5 = r5 + r6
            float r4 = (float) r4
            float r5 = r5 - r4
            com.google.android.material.badge.BadgeDrawable$SavedState r4 = r3.savedState
            int r4 = com.google.android.material.badge.BadgeDrawable.SavedState.access$600(r4)
            float r4 = (float) r4
            float r5 = r5 - r4
        Lcc:
            r3.badgeCenterX = r5
        Lce:
            return
    }

    public static com.google.android.material.badge.BadgeDrawable create(android.content.Context r3) {
            int r0 = com.google.android.material.badge.BadgeDrawable.DEFAULT_THEME_ATTR
            int r1 = com.google.android.material.badge.BadgeDrawable.DEFAULT_STYLE
            r2 = 0
            com.google.android.material.badge.BadgeDrawable r3 = createFromAttributes(r3, r2, r0, r1)
            return r3
    }

    private static com.google.android.material.badge.BadgeDrawable createFromAttributes(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            com.google.android.material.badge.BadgeDrawable r0 = new com.google.android.material.badge.BadgeDrawable
            r0.<init>(r1)
            r0.loadDefaultStateFromAttributes(r1, r2, r3, r4)
            return r0
    }

    public static com.google.android.material.badge.BadgeDrawable createFromResource(android.content.Context r2, int r3) {
            java.lang.String r0 = "badge"
            android.util.AttributeSet r3 = com.google.android.material.drawable.DrawableUtils.parseDrawableXml(r2, r3, r0)
            int r0 = r3.getStyleAttribute()
            if (r0 != 0) goto Le
            int r0 = com.google.android.material.badge.BadgeDrawable.DEFAULT_STYLE
        Le:
            int r1 = com.google.android.material.badge.BadgeDrawable.DEFAULT_THEME_ATTR
            com.google.android.material.badge.BadgeDrawable r2 = createFromAttributes(r2, r3, r1, r0)
            return r2
    }

    static com.google.android.material.badge.BadgeDrawable createFromSavedState(android.content.Context r1, com.google.android.material.badge.BadgeDrawable.SavedState r2) {
            com.google.android.material.badge.BadgeDrawable r0 = new com.google.android.material.badge.BadgeDrawable
            r0.<init>(r1)
            r0.restoreFromSavedState(r2)
            return r0
    }

    private void drawText(android.graphics.Canvas r6) {
            r5 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.String r1 = r5.getBadgeText()
            com.google.android.material.internal.TextDrawableHelper r2 = r5.textDrawableHelper
            android.text.TextPaint r2 = r2.getTextPaint()
            r3 = 0
            int r4 = r1.length()
            r2.getTextBounds(r1, r3, r4, r0)
            float r2 = r5.badgeCenterX
            float r3 = r5.badgeCenterY
            int r0 = r0.height()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r3 = r3 + r0
            com.google.android.material.internal.TextDrawableHelper r0 = r5.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            r6.drawText(r1, r2, r3, r0)
            return
    }

    private java.lang.String getBadgeText() {
            r5 = this;
            int r0 = r5.getNumber()
            int r1 = r5.maxBadgeNumber
            if (r0 > r1) goto L16
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance()
            int r1 = r5.getNumber()
            long r1 = (long) r1
            java.lang.String r0 = r0.format(r1)
            return r0
        L16:
            java.lang.ref.WeakReference<android.content.Context> r0 = r5.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L23
            java.lang.String r0 = ""
            return r0
        L23:
            int r1 = com.google.android.material.C0479R.string.mtrl_exceed_max_badge_number_suffix
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r5.maxBadgeNumber
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            r3 = 1
            java.lang.String r4 = "+"
            r2[r3] = r4
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    private void loadDefaultStateFromAttributes(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11) {
            r7 = this;
            int[] r2 = com.google.android.material.C0479R.styleable.Badge
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C0479R.styleable.Badge_maxCharacterCount
            r11 = 4
            int r10 = r9.getInt(r10, r11)
            r7.setMaxCharacterCount(r10)
            int r10 = com.google.android.material.C0479R.styleable.Badge_number
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L28
            int r10 = com.google.android.material.C0479R.styleable.Badge_number
            int r10 = r9.getInt(r10, r6)
            r7.setNumber(r10)
        L28:
            int r10 = com.google.android.material.C0479R.styleable.Badge_backgroundColor
            int r10 = readColorFromAttributes(r8, r9, r10)
            r7.setBackgroundColor(r10)
            int r10 = com.google.android.material.C0479R.styleable.Badge_badgeTextColor
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L42
            int r10 = com.google.android.material.C0479R.styleable.Badge_badgeTextColor
            int r8 = readColorFromAttributes(r8, r9, r10)
            r7.setBadgeTextColor(r8)
        L42:
            int r8 = com.google.android.material.C0479R.styleable.Badge_badgeGravity
            r10 = 8388661(0x800035, float:1.1755018E-38)
            int r8 = r9.getInt(r8, r10)
            r7.setBadgeGravity(r8)
            int r8 = com.google.android.material.C0479R.styleable.Badge_horizontalOffset
            int r8 = r9.getDimensionPixelOffset(r8, r6)
            r7.setHorizontalOffset(r8)
            int r8 = com.google.android.material.C0479R.styleable.Badge_verticalOffset
            int r8 = r9.getDimensionPixelOffset(r8, r6)
            r7.setVerticalOffset(r8)
            r9.recycle()
            return
    }

    private static int readColorFromAttributes(android.content.Context r0, android.content.res.TypedArray r1, int r2) {
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r1, r2)
            int r0 = r0.getDefaultColor()
            return r0
    }

    private void restoreFromSavedState(com.google.android.material.badge.BadgeDrawable.SavedState r3) {
            r2 = this;
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$100(r3)
            r2.setMaxCharacterCount(r0)
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$200(r3)
            r1 = -1
            if (r0 == r1) goto L15
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$200(r3)
            r2.setNumber(r0)
        L15:
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$300(r3)
            r2.setBackgroundColor(r0)
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$400(r3)
            r2.setBadgeTextColor(r0)
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$500(r3)
            r2.setBadgeGravity(r0)
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$600(r3)
            r2.setHorizontalOffset(r0)
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$700(r3)
            r2.setVerticalOffset(r0)
            boolean r3 = com.google.android.material.badge.BadgeDrawable.SavedState.access$000(r3)
            r2.setVisible(r3)
            return
    }

    private void setTextAppearance(com.google.android.material.resources.TextAppearance r3) {
            r2 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r2.textDrawableHelper
            com.google.android.material.resources.TextAppearance r0 = r0.getTextAppearance()
            if (r0 != r3) goto L9
            return
        L9:
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L14
            return
        L14:
            com.google.android.material.internal.TextDrawableHelper r1 = r2.textDrawableHelper
            r1.setTextAppearance(r3, r0)
            r2.updateCenterAndBounds()
            return
    }

    private void setTextAppearanceResource(int r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            com.google.android.material.resources.TextAppearance r1 = new com.google.android.material.resources.TextAppearance
            r1.<init>(r0, r3)
            r2.setTextAppearance(r1)
            return
    }

    private void tryWrapAnchorInCompatParent(android.view.View r6) {
            r5 = this;
            android.view.ViewParent r0 = r6.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L10
            int r1 = r0.getId()
            int r2 = com.google.android.material.C0479R.id.mtrl_anchor_parent
            if (r1 == r2) goto L1a
        L10:
            java.lang.ref.WeakReference<android.widget.FrameLayout> r1 = r5.customBadgeParentRef
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r1.get()
            if (r1 != r0) goto L1b
        L1a:
            return
        L1b:
            updateAnchorParentToNotClip(r6)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            android.content.Context r2 = r6.getContext()
            r1.<init>(r2)
            int r2 = com.google.android.material.C0479R.id.mtrl_anchor_parent
            r1.setId(r2)
            r2 = 0
            r1.setClipChildren(r2)
            r1.setClipToPadding(r2)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            r1.setLayoutParams(r2)
            int r2 = r6.getWidth()
            r1.setMinimumWidth(r2)
            int r2 = r6.getHeight()
            r1.setMinimumHeight(r2)
            int r2 = r0.indexOfChild(r6)
            r0.removeViewAt(r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r6.setLayoutParams(r3)
            r1.addView(r6)
            r0.addView(r1, r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r5.customBadgeParentRef = r0
            com.google.android.material.badge.BadgeDrawable$1 r0 = new com.google.android.material.badge.BadgeDrawable$1
            r0.<init>(r5, r6, r1)
            r1.post(r0)
            return
    }

    private static void updateAnchorParentToNotClip(android.view.View r1) {
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 0
            r1.setClipChildren(r0)
            r1.setClipToPadding(r0)
            return
    }

    private void updateCenterAndBounds() {
            r6 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r6.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.ref.WeakReference<android.view.View> r1 = r6.anchorViewRef
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            goto L15
        L14:
            r1 = r2
        L15:
            if (r0 == 0) goto L6d
            if (r1 != 0) goto L1a
            goto L6d
        L1a:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r4 = r6.badgeBounds
            r3.set(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r1.getDrawingRect(r4)
            java.lang.ref.WeakReference<android.widget.FrameLayout> r5 = r6.customBadgeParentRef
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.get()
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
        L36:
            if (r2 != 0) goto L3c
            boolean r5 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r5 == 0) goto L47
        L3c:
            if (r2 != 0) goto L44
            android.view.ViewParent r2 = r1.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L44:
            r2.offsetDescendantRectToMyCoords(r1, r4)
        L47:
            r6.calculateCenterAndBounds(r0, r4, r1)
            android.graphics.Rect r0 = r6.badgeBounds
            float r1 = r6.badgeCenterX
            float r2 = r6.badgeCenterY
            float r4 = r6.halfBadgeWidth
            float r5 = r6.halfBadgeHeight
            com.google.android.material.badge.BadgeUtils.updateBadgeBounds(r0, r1, r2, r4, r5)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.shapeDrawable
            float r1 = r6.cornerRadius
            r0.setCornerSize(r1)
            android.graphics.Rect r0 = r6.badgeBounds
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6d
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.shapeDrawable
            android.graphics.Rect r1 = r6.badgeBounds
            r0.setBounds(r1)
        L6d:
            return
    }

    private void updateMaxBadgeNumber() {
            r4 = this;
            int r0 = r4.getMaxCharacterCount()
            double r0 = (double) r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r2
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = java.lang.Math.pow(r2, r0)
            int r0 = (int) r0
            int r0 = r0 + (-1)
            r4.maxBadgeNumber = r0
            return
    }

    public void clearNumber() {
            r2 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r2.savedState
            r1 = -1
            com.google.android.material.badge.BadgeDrawable.SavedState.access$202(r0, r1)
            r2.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.getBounds()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            int r0 = r1.getAlpha()
            if (r0 == 0) goto L25
            boolean r0 = r1.isVisible()
            if (r0 != 0) goto L17
            goto L25
        L17:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            r0.draw(r2)
            boolean r0 = r1.hasNumber()
            if (r0 == 0) goto L25
            r1.drawText(r2)
        L25:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$800(r0)
            return r0
    }

    public int getBackgroundColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            int r0 = r0.getDefaultColor()
            return r0
    }

    public int getBadgeGravity() {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$500(r0)
            return r0
    }

    public int getBadgeTextColor() {
            r1 = this;
            com.google.android.material.internal.TextDrawableHelper r0 = r1.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            int r0 = r0.getColor()
            return r0
    }

    public java.lang.CharSequence getContentDescription() {
            r6 = this;
            boolean r0 = r6.isVisible()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r6.hasNumber()
            if (r0 == 0) goto L60
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r6.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$1000(r0)
            if (r0 <= 0) goto L5f
            java.lang.ref.WeakReference<android.content.Context> r0 = r6.contextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L21
            return r1
        L21:
            int r1 = r6.getNumber()
            int r2 = r6.maxBadgeNumber
            r3 = 0
            r4 = 1
            if (r1 > r2) goto L4a
            android.content.res.Resources r0 = r0.getResources()
            com.google.android.material.badge.BadgeDrawable$SavedState r1 = r6.savedState
            int r1 = com.google.android.material.badge.BadgeDrawable.SavedState.access$1000(r1)
            int r2 = r6.getNumber()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r6.getNumber()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            java.lang.String r0 = r0.getQuantityString(r1, r2, r4)
            return r0
        L4a:
            com.google.android.material.badge.BadgeDrawable$SavedState r1 = r6.savedState
            int r1 = com.google.android.material.badge.BadgeDrawable.SavedState.access$1100(r1)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r4 = r6.maxBadgeNumber
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
        L5f:
            return r1
        L60:
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r6.savedState
            java.lang.CharSequence r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$900(r0)
            return r0
    }

    public android.widget.FrameLayout getCustomBadgeParent() {
            r1 = this;
            java.lang.ref.WeakReference<android.widget.FrameLayout> r0 = r1.customBadgeParentRef
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getHorizontalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$600(r0)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.Rect r0 = r1.badgeBounds
            int r0 = r0.height()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.Rect r0 = r1.badgeBounds
            int r0 = r0.width()
            return r0
    }

    public int getMaxCharacterCount() {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$100(r0)
            return r0
    }

    public int getNumber() {
            r1 = this;
            boolean r0 = r1.hasNumber()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$200(r0)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    public com.google.android.material.badge.BadgeDrawable.SavedState getSavedState() {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            return r0
    }

    public int getVerticalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$700(r0)
            return r0
    }

    public boolean hasNumber() {
            r2 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r2.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$200(r0)
            r1 = -1
            if (r0 == r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] r1) {
            r0 = this;
            boolean r1 = super.onStateChange(r1)
            return r1
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            com.google.android.material.badge.BadgeDrawable.SavedState.access$802(r0, r2)
            com.google.android.material.internal.TextDrawableHelper r0 = r1.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            r0.setAlpha(r2)
            r1.invalidateSelf()
            return
    }

    public void setBackgroundColor(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            com.google.android.material.badge.BadgeDrawable.SavedState.access$302(r0, r2)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            if (r0 == r2) goto L19
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            r0.setFillColor(r2)
            r1.invalidateSelf()
        L19:
            return
    }

    public void setBadgeGravity(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$500(r0)
            if (r0 == r2) goto L2e
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            com.google.android.material.badge.BadgeDrawable.SavedState.access$502(r0, r2)
            java.lang.ref.WeakReference<android.view.View> r2 = r1.anchorViewRef
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L2e
            java.lang.ref.WeakReference<android.view.View> r2 = r1.anchorViewRef
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            java.lang.ref.WeakReference<android.widget.FrameLayout> r0 = r1.customBadgeParentRef
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r0.get()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L2b
        L2a:
            r0 = 0
        L2b:
            r1.updateBadgeCoordinates(r2, r0)
        L2e:
            return
    }

    public void setBadgeTextColor(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            com.google.android.material.badge.BadgeDrawable.SavedState.access$402(r0, r2)
            com.google.android.material.internal.TextDrawableHelper r0 = r1.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            int r0 = r0.getColor()
            if (r0 == r2) goto L1d
            com.google.android.material.internal.TextDrawableHelper r0 = r1.textDrawableHelper
            android.text.TextPaint r0 = r0.getTextPaint()
            r0.setColor(r2)
            r1.invalidateSelf()
        L1d:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            com.google.android.material.badge.BadgeDrawable.SavedState.access$1102(r0, r2)
            return
    }

    public void setContentDescriptionNumberless(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            com.google.android.material.badge.BadgeDrawable.SavedState.access$902(r0, r2)
            return
    }

    public void setContentDescriptionQuantityStringsResource(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            com.google.android.material.badge.BadgeDrawable.SavedState.access$1002(r0, r2)
            return
    }

    public void setHorizontalOffset(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            com.google.android.material.badge.BadgeDrawable.SavedState.access$602(r0, r2)
            r1.updateCenterAndBounds()
            return
    }

    public void setMaxCharacterCount(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$100(r0)
            if (r0 == r2) goto L1c
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            com.google.android.material.badge.BadgeDrawable.SavedState.access$102(r0, r2)
            r1.updateMaxBadgeNumber()
            com.google.android.material.internal.TextDrawableHelper r2 = r1.textDrawableHelper
            r0 = 1
            r2.setTextWidthDirty(r0)
            r1.updateCenterAndBounds()
            r1.invalidateSelf()
        L1c:
            return
    }

    public void setNumber(int r2) {
            r1 = this;
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            int r0 = com.google.android.material.badge.BadgeDrawable.SavedState.access$200(r0)
            if (r0 == r2) goto L1e
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            com.google.android.material.badge.BadgeDrawable.SavedState.access$202(r0, r2)
            com.google.android.material.internal.TextDrawableHelper r2 = r1.textDrawableHelper
            r0 = 1
            r2.setTextWidthDirty(r0)
            r1.updateCenterAndBounds()
            r1.invalidateSelf()
        L1e:
            return
    }

    public void setVerticalOffset(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            com.google.android.material.badge.BadgeDrawable.SavedState.access$702(r0, r2)
            r1.updateCenterAndBounds()
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            r0 = 0
            r1.setVisible(r2, r0)
            com.google.android.material.badge.BadgeDrawable$SavedState r0 = r1.savedState
            com.google.android.material.badge.BadgeDrawable.SavedState.access$002(r0, r2)
            boolean r0 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r0 == 0) goto L22
            android.widget.FrameLayout r0 = r1.getCustomBadgeParent()
            if (r0 == 0) goto L22
            if (r2 != 0) goto L22
            android.widget.FrameLayout r2 = r1.getCustomBadgeParent()
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.invalidate()
        L22:
            return
    }

    public void updateBadgeCoordinates(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.updateBadgeCoordinates(r2, r0)
            return
    }

    @java.lang.Deprecated
    public void updateBadgeCoordinates(android.view.View r2, android.view.ViewGroup r3) {
            r1 = this;
            boolean r0 = r3 instanceof android.widget.FrameLayout
            if (r0 == 0) goto La
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r1.updateBadgeCoordinates(r2, r3)
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "customBadgeParent must be a FrameLayout"
            r2.<init>(r3)
            throw r2
    }

    public void updateBadgeCoordinates(android.view.View r2, android.widget.FrameLayout r3) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.anchorViewRef = r0
            boolean r0 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r0 == 0) goto L11
            if (r3 != 0) goto L11
            r1.tryWrapAnchorInCompatParent(r2)
            goto L18
        L11:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r1.customBadgeParentRef = r0
        L18:
            boolean r3 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r3 != 0) goto L1f
            updateAnchorParentToNotClip(r2)
        L1f:
            r1.updateCenterAndBounds()
            r1.invalidateSelf()
            return
    }
}
