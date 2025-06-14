package androidx.appcompat.app;

/* loaded from: classes.dex */
class LayoutIncludeDetector {
    private final java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> mXmlParserStack;

    LayoutIncludeDetector() {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.mXmlParserStack = r0
            return
    }

    private static boolean isParserOutdated(org.xmlpull.v1.XmlPullParser r3) {
            r0 = 1
            if (r3 == 0) goto L13
            int r1 = r3.getEventType()     // Catch: org.xmlpull.v1.XmlPullParserException -> L13
            r2 = 3
            if (r1 == r2) goto L13
            int r3 = r3.getEventType()     // Catch: org.xmlpull.v1.XmlPullParserException -> L13
            if (r3 != r0) goto L11
            goto L13
        L11:
            r0 = 0
        L13:
            return r0
    }

    private static org.xmlpull.v1.XmlPullParser popOutdatedAttrHolders(java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r2) {
        L0:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1d
            java.lang.Object r0 = r2.peek()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            boolean r1 = isParserOutdated(r0)
            if (r1 == 0) goto L1c
            r2.pop()
            goto L0
        L1c:
            return r0
        L1d:
            r2 = 0
            return r2
    }

    private static boolean shouldInheritContext(org.xmlpull.v1.XmlPullParser r1, org.xmlpull.v1.XmlPullParser r2) {
            if (r2 == 0) goto L16
            if (r1 == r2) goto L16
            int r1 = r2.getEventType()     // Catch: org.xmlpull.v1.XmlPullParserException -> L16
            r0 = 2
            if (r1 != r0) goto L16
            java.lang.String r1 = "include"
            java.lang.String r2 = r2.getName()     // Catch: org.xmlpull.v1.XmlPullParserException -> L16
            boolean r1 = r1.equals(r2)     // Catch: org.xmlpull.v1.XmlPullParserException -> L16
            return r1
        L16:
            r1 = 0
            return r1
    }

    boolean detect(android.util.AttributeSet r5) {
            r4 = this;
            boolean r0 = r5 instanceof org.xmlpull.v1.XmlPullParser
            if (r0 == 0) goto L24
            org.xmlpull.v1.XmlPullParser r5 = (org.xmlpull.v1.XmlPullParser) r5
            int r0 = r5.getDepth()
            r1 = 1
            if (r0 != r1) goto L24
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.mXmlParserStack
            org.xmlpull.v1.XmlPullParser r0 = popOutdatedAttrHolders(r0)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r2 = r4.mXmlParserStack
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r5)
            r2.push(r3)
            boolean r5 = shouldInheritContext(r5, r0)
            if (r5 == 0) goto L24
            return r1
        L24:
            r5 = 0
            return r5
    }
}
