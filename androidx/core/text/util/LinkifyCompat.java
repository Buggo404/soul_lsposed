package androidx.core.text.util;

/* loaded from: classes.dex */
public final class LinkifyCompat {
    private static final java.util.Comparator<androidx.core.text.util.LinkifyCompat.LinkSpec> COMPARATOR = null;
    private static final java.lang.String[] EMPTY_STRING = null;


    private static class LinkSpec {
        int end;
        android.text.style.URLSpan frameworkAddedSpan;
        int start;
        java.lang.String url;

        LinkSpec() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LinkifyMask {
    }

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.core.text.util.LinkifyCompat.EMPTY_STRING = r0
            androidx.core.text.util.LinkifyCompat$1 r0 = new androidx.core.text.util.LinkifyCompat$1
            r0.<init>()
            androidx.core.text.util.LinkifyCompat.COMPARATOR = r0
            return
    }

    private LinkifyCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addLinkMovementMethod(android.widget.TextView r1) {
            android.text.method.MovementMethod r0 = r1.getMovementMethod()
            boolean r0 = r0 instanceof android.text.method.LinkMovementMethod
            if (r0 != 0) goto L15
            boolean r0 = r1.getLinksClickable()
            if (r0 == 0) goto L15
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
        L15:
            return
    }

    public static void addLinks(android.widget.TextView r7, java.util.regex.Pattern r8, java.lang.String r9) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto La
            android.text.util.Linkify.addLinks(r7, r8, r9)
            return
        La:
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            addLinks(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void addLinks(android.widget.TextView r7, java.util.regex.Pattern r8, java.lang.String r9, android.text.util.Linkify.MatchFilter r10, android.text.util.Linkify.TransformFilter r11) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto La
            android.text.util.Linkify.addLinks(r7, r8, r9, r10, r11)
            return
        La:
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            addLinks(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void addLinks(android.widget.TextView r7, java.util.regex.Pattern r8, java.lang.String r9, java.lang.String[] r10, android.text.util.Linkify.MatchFilter r11, android.text.util.Linkify.TransformFilter r12) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto La
            android.text.util.Linkify.addLinks(r7, r8, r9, r10, r11, r12)
            return
        La:
            java.lang.CharSequence r0 = r7.getText()
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            boolean r8 = addLinks(r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L24
            r7.setText(r0)
            addLinkMovementMethod(r7)
        L24:
            return
    }

    public static boolean addLinks(android.text.Spannable r10, int r11) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r10 = android.text.util.Linkify.addLinks(r10, r11)
            return r10
        Lb:
            r0 = 0
            if (r11 != 0) goto Lf
            return r0
        Lf:
            int r1 = r10.length()
            java.lang.Class<android.text.style.URLSpan> r2 = android.text.style.URLSpan.class
            java.lang.Object[] r1 = r10.getSpans(r0, r1, r2)
            android.text.style.URLSpan[] r1 = (android.text.style.URLSpan[]) r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
        L1e:
            if (r2 < 0) goto L28
            r4 = r1[r2]
            r10.removeSpan(r4)
            int r2 = r2 + (-1)
            goto L1e
        L28:
            r1 = r11 & 4
            if (r1 == 0) goto L30
            r1 = 4
            android.text.util.Linkify.addLinks(r10, r1)
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r11 & 1
            if (r2 == 0) goto L4d
            java.util.regex.Pattern r6 = androidx.core.util.PatternsCompat.AUTOLINK_WEB_URL
            java.lang.String r2 = "https://"
            java.lang.String r4 = "rtsp://"
            java.lang.String r5 = "http://"
            java.lang.String[] r7 = new java.lang.String[]{r5, r2, r4}
            android.text.util.Linkify$MatchFilter r8 = android.text.util.Linkify.sUrlMatchFilter
            r9 = 0
            r4 = r1
            r5 = r10
            gatherLinks(r4, r5, r6, r7, r8, r9)
        L4d:
            r2 = r11 & 2
            if (r2 == 0) goto L60
            java.util.regex.Pattern r6 = androidx.core.util.PatternsCompat.AUTOLINK_EMAIL_ADDRESS
            java.lang.String r2 = "mailto:"
            java.lang.String[] r7 = new java.lang.String[]{r2}
            r8 = 0
            r9 = 0
            r4 = r1
            r5 = r10
            gatherLinks(r4, r5, r6, r7, r8, r9)
        L60:
            r11 = r11 & 8
            if (r11 == 0) goto L67
            gatherMapLinks(r1, r10)
        L67:
            pruneOverlaps(r1, r10)
            int r11 = r1.size()
            if (r11 != 0) goto L71
            return r0
        L71:
            java.util.Iterator r11 = r1.iterator()
        L75:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r11.next()
            androidx.core.text.util.LinkifyCompat$LinkSpec r0 = (androidx.core.text.util.LinkifyCompat.LinkSpec) r0
            android.text.style.URLSpan r1 = r0.frameworkAddedSpan
            if (r1 != 0) goto L75
            java.lang.String r1 = r0.url
            int r2 = r0.start
            int r0 = r0.end
            applyLink(r1, r2, r0, r10)
            goto L75
        L8f:
            return r3
    }

    public static boolean addLinks(android.text.Spannable r6, java.util.regex.Pattern r7, java.lang.String r8) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r6 = android.text.util.Linkify.addLinks(r6, r7, r8)
            return r6
        Lb:
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            boolean r6 = addLinks(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static boolean addLinks(android.text.Spannable r6, java.util.regex.Pattern r7, java.lang.String r8, android.text.util.Linkify.MatchFilter r9, android.text.util.Linkify.TransformFilter r10) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r6 = android.text.util.Linkify.addLinks(r6, r7, r8, r9, r10)
            return r6
        Lb:
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            boolean r6 = addLinks(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static boolean addLinks(android.text.Spannable r6, java.util.regex.Pattern r7, java.lang.String r8, java.lang.String[] r9, android.text.util.Linkify.MatchFilter r10, android.text.util.Linkify.TransformFilter r11) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r6 = android.text.util.Linkify.addLinks(r6, r7, r8, r9, r10, r11)
            return r6
        Lb:
            java.lang.String r0 = ""
            if (r8 != 0) goto L10
            r8 = r0
        L10:
            r1 = 1
            if (r9 == 0) goto L16
            int r2 = r9.length
            if (r2 >= r1) goto L18
        L16:
            java.lang.String[] r9 = androidx.core.text.util.LinkifyCompat.EMPTY_STRING
        L18:
            int r2 = r9.length
            int r2 = r2 + r1
            java.lang.String[] r2 = new java.lang.String[r2]
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r3)
            r3 = 0
            r2[r3] = r8
            r8 = r3
        L26:
            int r4 = r9.length
            if (r8 >= r4) goto L3a
            r4 = r9[r8]
            int r8 = r8 + 1
            if (r4 != 0) goto L31
            r4 = r0
            goto L37
        L31:
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
        L37:
            r2[r8] = r4
            goto L26
        L3a:
            java.util.regex.Matcher r7 = r7.matcher(r6)
            r8 = r3
        L3f:
            boolean r9 = r7.find()
            if (r9 == 0) goto L64
            int r9 = r7.start()
            int r0 = r7.end()
            if (r10 == 0) goto L54
            boolean r4 = r10.acceptMatch(r6, r9, r0)
            goto L55
        L54:
            r4 = r1
        L55:
            if (r4 == 0) goto L3f
            java.lang.String r8 = r7.group(r3)
            java.lang.String r8 = makeUrl(r8, r2, r7, r11)
            applyLink(r8, r9, r0, r6)
            r8 = r1
            goto L3f
        L64:
            return r8
    }

    public static boolean addLinks(android.widget.TextView r4, int r5) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r4 = android.text.util.Linkify.addLinks(r4, r5)
            return r4
        Lb:
            r0 = 0
            if (r5 != 0) goto Lf
            return r0
        Lf:
            java.lang.CharSequence r1 = r4.getText()
            boolean r2 = r1 instanceof android.text.Spannable
            r3 = 1
            if (r2 == 0) goto L25
            android.text.Spannable r1 = (android.text.Spannable) r1
            boolean r5 = addLinks(r1, r5)
            if (r5 == 0) goto L24
            addLinkMovementMethod(r4)
            return r3
        L24:
            return r0
        L25:
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r1)
            boolean r5 = addLinks(r1, r5)
            if (r5 == 0) goto L36
            addLinkMovementMethod(r4)
            r4.setText(r1)
            return r3
        L36:
            return r0
    }

    private static void applyLink(java.lang.String r1, int r2, int r3, android.text.Spannable r4) {
            android.text.style.URLSpan r0 = new android.text.style.URLSpan
            r0.<init>(r1)
            r1 = 33
            r4.setSpan(r0, r2, r3, r1)
            return
    }

    private static java.lang.String findAddress(java.lang.String r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r2 = android.webkit.WebView.findAddress(r2)
            return r2
        Lb:
            java.lang.String r2 = androidx.core.text.util.FindAddress.findAddress(r2)
            return r2
    }

    private static void gatherLinks(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> r4, android.text.Spannable r5, java.util.regex.Pattern r6, java.lang.String[] r7, android.text.util.Linkify.MatchFilter r8, android.text.util.Linkify.TransformFilter r9) {
            java.util.regex.Matcher r6 = r6.matcher(r5)
        L4:
            boolean r0 = r6.find()
            if (r0 == 0) goto L32
            int r0 = r6.start()
            int r1 = r6.end()
            if (r8 == 0) goto L1a
            boolean r2 = r8.acceptMatch(r5, r0, r1)
            if (r2 == 0) goto L4
        L1a:
            androidx.core.text.util.LinkifyCompat$LinkSpec r2 = new androidx.core.text.util.LinkifyCompat$LinkSpec
            r2.<init>()
            r3 = 0
            java.lang.String r3 = r6.group(r3)
            java.lang.String r3 = makeUrl(r3, r7, r6, r9)
            r2.url = r3
            r2.start = r0
            r2.end = r1
            r4.add(r2)
            goto L4
        L32:
            return
    }

    private static void gatherMapLinks(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> r5, android.text.Spannable r6) {
            java.lang.String r6 = r6.toString()
            r0 = 0
        L5:
            java.lang.String r1 = findAddress(r6)     // Catch: java.lang.UnsupportedOperationException -> L45
            if (r1 == 0) goto L45
            int r2 = r6.indexOf(r1)     // Catch: java.lang.UnsupportedOperationException -> L45
            if (r2 >= 0) goto L12
            goto L45
        L12:
            androidx.core.text.util.LinkifyCompat$LinkSpec r3 = new androidx.core.text.util.LinkifyCompat$LinkSpec     // Catch: java.lang.UnsupportedOperationException -> L45
            r3.<init>()     // Catch: java.lang.UnsupportedOperationException -> L45
            int r4 = r1.length()     // Catch: java.lang.UnsupportedOperationException -> L45
            int r4 = r4 + r2
            int r2 = r2 + r0
            r3.start = r2     // Catch: java.lang.UnsupportedOperationException -> L45
            int r0 = r0 + r4
            r3.end = r0     // Catch: java.lang.UnsupportedOperationException -> L45
            java.lang.String r6 = r6.substring(r4)     // Catch: java.lang.UnsupportedOperationException -> L45
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L5 java.lang.UnsupportedOperationException -> L45
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> L45
            r2.<init>()     // Catch: java.lang.UnsupportedOperationException -> L45
            java.lang.String r4 = "geo:0,0?q="
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.UnsupportedOperationException -> L45
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.UnsupportedOperationException -> L45
            java.lang.String r1 = r1.toString()     // Catch: java.lang.UnsupportedOperationException -> L45
            r3.url = r1     // Catch: java.lang.UnsupportedOperationException -> L45
            r5.add(r3)     // Catch: java.lang.UnsupportedOperationException -> L45
            goto L5
        L45:
            return
    }

    private static java.lang.String makeUrl(java.lang.String r6, java.lang.String[] r7, java.util.regex.Matcher r8, android.text.util.Linkify.TransformFilter r9) {
            if (r9 == 0) goto L6
            java.lang.String r6 = r9.transformUrl(r8, r6)
        L6:
            r8 = 0
            r9 = r8
        L8:
            int r0 = r7.length
            if (r9 >= r0) goto L4d
            r1 = 1
            r2 = 0
            r3 = r7[r9]
            r4 = 0
            int r5 = r3.length()
            r0 = r6
            boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L4a
            r1 = 0
            r2 = 0
            r3 = r7[r9]
            r4 = 0
            int r5 = r3.length()
            r0 = r6
            boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
            r1 = 1
            if (r0 != 0) goto L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = r7[r9]
            java.lang.StringBuilder r0 = r0.append(r2)
            r9 = r7[r9]
            int r9 = r9.length()
            java.lang.String r6 = r6.substring(r9)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            goto L4e
        L4a:
            int r9 = r9 + 1
            goto L8
        L4d:
            r1 = r8
        L4e:
            if (r1 != 0) goto L66
            int r9 = r7.length
            if (r9 <= 0) goto L66
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r7 = r7[r8]
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
        L66:
            return r6
    }

    private static void pruneOverlaps(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> r9, android.text.Spannable r10) {
            int r0 = r10.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            r2 = 0
            java.lang.Object[] r0 = r10.getSpans(r2, r0, r1)
            android.text.style.URLSpan[] r0 = (android.text.style.URLSpan[]) r0
            r1 = r2
        Le:
            int r3 = r0.length
            if (r1 >= r3) goto L30
            androidx.core.text.util.LinkifyCompat$LinkSpec r3 = new androidx.core.text.util.LinkifyCompat$LinkSpec
            r3.<init>()
            r4 = r0[r1]
            r3.frameworkAddedSpan = r4
            r4 = r0[r1]
            int r4 = r10.getSpanStart(r4)
            r3.start = r4
            r4 = r0[r1]
            int r4 = r10.getSpanEnd(r4)
            r3.end = r4
            r9.add(r3)
            int r1 = r1 + 1
            goto Le
        L30:
            java.util.Comparator<androidx.core.text.util.LinkifyCompat$LinkSpec> r0 = androidx.core.text.util.LinkifyCompat.COMPARATOR
            java.util.Collections.sort(r9, r0)
            int r0 = r9.size()
        L39:
            int r1 = r0 + (-1)
            if (r2 >= r1) goto L93
            java.lang.Object r1 = r9.get(r2)
            androidx.core.text.util.LinkifyCompat$LinkSpec r1 = (androidx.core.text.util.LinkifyCompat.LinkSpec) r1
            int r3 = r2 + 1
            java.lang.Object r4 = r9.get(r3)
            androidx.core.text.util.LinkifyCompat$LinkSpec r4 = (androidx.core.text.util.LinkifyCompat.LinkSpec) r4
            int r5 = r1.start
            int r6 = r4.start
            if (r5 > r6) goto L91
            int r5 = r1.end
            int r6 = r4.start
            if (r5 <= r6) goto L91
            int r5 = r4.end
            int r6 = r1.end
            r7 = -1
            if (r5 > r6) goto L60
        L5e:
            r1 = r3
            goto L7c
        L60:
            int r5 = r1.end
            int r6 = r1.start
            int r5 = r5 - r6
            int r6 = r4.end
            int r8 = r4.start
            int r6 = r6 - r8
            if (r5 <= r6) goto L6d
            goto L5e
        L6d:
            int r5 = r1.end
            int r1 = r1.start
            int r5 = r5 - r1
            int r1 = r4.end
            int r4 = r4.start
            int r1 = r1 - r4
            if (r5 >= r1) goto L7b
            r1 = r2
            goto L7c
        L7b:
            r1 = r7
        L7c:
            if (r1 == r7) goto L91
            java.lang.Object r3 = r9.get(r1)
            androidx.core.text.util.LinkifyCompat$LinkSpec r3 = (androidx.core.text.util.LinkifyCompat.LinkSpec) r3
            android.text.style.URLSpan r3 = r3.frameworkAddedSpan
            if (r3 == 0) goto L8b
            r10.removeSpan(r3)
        L8b:
            r9.remove(r1)
            int r0 = r0 + (-1)
            goto L39
        L91:
            r2 = r3
            goto L39
        L93:
            return
    }

    private static boolean shouldAddLinksFallbackToFramework() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
