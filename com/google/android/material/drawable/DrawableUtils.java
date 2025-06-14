package com.google.android.material.drawable;

/* loaded from: classes.dex */
public final class DrawableUtils {
    private DrawableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.util.AttributeSet parseDrawableXml(android.content.Context r3, int r4, java.lang.CharSequence r5) {
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            android.content.res.XmlResourceParser r3 = r3.getXml(r4)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
        L8:
            int r0 = r3.next()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            r1 = 2
            if (r0 == r1) goto L12
            r2 = 1
            if (r0 != r2) goto L8
        L12:
            if (r0 != r1) goto L42
            java.lang.String r0 = r3.getName()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            boolean r0 = android.text.TextUtils.equals(r0, r5)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            if (r0 == 0) goto L23
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r3)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            return r3
        L23:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            r0.<init>()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.String r1 = "Must have a <"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.StringBuilder r5 = r0.append(r5)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.String r0 = "> start tag"
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            r3.<init>(r5)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            throw r3     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
        L42:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.String r5 = "No start tag found"
            r3.<init>(r5)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            throw r3     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
        L4a:
            r3 = move-exception
            goto L4d
        L4c:
            r3 = move-exception
        L4d:
            android.content.res.Resources$NotFoundException r5 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't load badge resource ID #0x"
            r0.<init>(r1)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            r5.initCause(r3)
            throw r5
    }

    public static void setRippleDrawableRadius(android.graphics.drawable.RippleDrawable r0, int r1) {
            r0.setRadius(r1)
            return
    }

    public static android.graphics.PorterDuffColorFilter updateTintFilter(android.graphics.drawable.Drawable r1, android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3) {
            if (r2 == 0) goto L14
            if (r3 != 0) goto L5
            goto L14
        L5:
            int[] r1 = r1.getState()
            r0 = 0
            int r1 = r2.getColorForState(r1, r0)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r1, r3)
            return r2
        L14:
            r1 = 0
            return r1
    }
}
