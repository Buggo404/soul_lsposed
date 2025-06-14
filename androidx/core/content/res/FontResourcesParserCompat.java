package androidx.core.content.res;

/* loaded from: classes.dex */
public class FontResourcesParserCompat {
    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    public interface FamilyResourceEntry {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class FontFamilyFilesResourceEntry implements androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry {
        private final androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] r1) {
                r0 = this;
                r0.<init>()
                r0.mEntries = r1
                return
        }

        public androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] getEntries() {
                r1 = this;
                androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r0 = r1.mEntries
                return r0
        }
    }

    public static final class FontFileResourceEntry {
        private final java.lang.String mFileName;
        private boolean mItalic;
        private int mResourceId;
        private int mTtcIndex;
        private java.lang.String mVariationSettings;
        private int mWeight;

        public FontFileResourceEntry(java.lang.String r1, int r2, boolean r3, java.lang.String r4, int r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.mFileName = r1
                r0.mWeight = r2
                r0.mItalic = r3
                r0.mVariationSettings = r4
                r0.mTtcIndex = r5
                r0.mResourceId = r6
                return
        }

        public java.lang.String getFileName() {
                r1 = this;
                java.lang.String r0 = r1.mFileName
                return r0
        }

        public int getResourceId() {
                r1 = this;
                int r0 = r1.mResourceId
                return r0
        }

        public int getTtcIndex() {
                r1 = this;
                int r0 = r1.mTtcIndex
                return r0
        }

        public java.lang.String getVariationSettings() {
                r1 = this;
                java.lang.String r0 = r1.mVariationSettings
                return r0
        }

        public int getWeight() {
                r1 = this;
                int r0 = r1.mWeight
                return r0
        }

        public boolean isItalic() {
                r1 = this;
                boolean r0 = r1.mItalic
                return r0
        }
    }

    public static final class ProviderResourceEntry implements androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry {
        private final androidx.core.provider.FontRequest mRequest;
        private final int mStrategy;
        private final java.lang.String mSystemFontFamilyName;
        private final int mTimeoutMs;

        public ProviderResourceEntry(androidx.core.provider.FontRequest r2, int r3, int r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r4, r0)
                return
        }

        public ProviderResourceEntry(androidx.core.provider.FontRequest r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.mRequest = r1
                r0.mStrategy = r2
                r0.mTimeoutMs = r3
                r0.mSystemFontFamilyName = r4
                return
        }

        public int getFetchStrategy() {
                r1 = this;
                int r0 = r1.mStrategy
                return r0
        }

        public androidx.core.provider.FontRequest getRequest() {
                r1 = this;
                androidx.core.provider.FontRequest r0 = r1.mRequest
                return r0
        }

        public java.lang.String getSystemFontFamilyName() {
                r1 = this;
                java.lang.String r0 = r1.mSystemFontFamilyName
                return r0
        }

        public int getTimeout() {
                r1 = this;
                int r0 = r1.mTimeoutMs
                return r0
        }
    }

    private FontResourcesParserCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getType(android.content.res.TypedArray r0, int r1) {
            int r0 = r0.getType(r1)
            return r0
    }

    public static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry parse(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        L0:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto Lb
            r2 = 1
            if (r0 == r2) goto Lb
            goto L0
        Lb:
            if (r0 != r1) goto L12
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r3 = readFamilies(r3, r4)
            return r3
        L12:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
    }

    public static java.util.List<java.util.List<byte[]>> readCerts(android.content.res.Resources r5, int r6) {
            if (r6 != 0) goto L7
            java.util.List r5 = java.util.Collections.emptyList()
            return r5
        L7:
            android.content.res.TypedArray r0 = r5.obtainTypedArray(r6)
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L19
            java.util.List r5 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L50
            r0.recycle()
            return r5
        L19:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50
            r1.<init>()     // Catch: java.lang.Throwable -> L50
            r2 = 0
            int r3 = getType(r0, r2)     // Catch: java.lang.Throwable -> L50
            r4 = 1
            if (r3 != r4) goto L41
            r6 = r2
        L27:
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L50
            if (r6 >= r3) goto L4c
            int r3 = r0.getResourceId(r6, r2)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L3e
            java.lang.String[] r3 = r5.getStringArray(r3)     // Catch: java.lang.Throwable -> L50
            java.util.List r3 = toByteArrayList(r3)     // Catch: java.lang.Throwable -> L50
            r1.add(r3)     // Catch: java.lang.Throwable -> L50
        L3e:
            int r6 = r6 + 1
            goto L27
        L41:
            java.lang.String[] r5 = r5.getStringArray(r6)     // Catch: java.lang.Throwable -> L50
            java.util.List r5 = toByteArrayList(r5)     // Catch: java.lang.Throwable -> L50
            r1.add(r5)     // Catch: java.lang.Throwable -> L50
        L4c:
            r0.recycle()
            return r1
        L50:
            r5 = move-exception
            r0.recycle()
            throw r5
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry readFamilies(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = 2
            r1 = 0
            java.lang.String r2 = "font-family"
            r3.require(r0, r1, r2)
            java.lang.String r0 = r3.getName()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r3 = readFamily(r3, r4)
            return r3
        L16:
            skip(r3)
            return r1
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry readFamily(org.xmlpull.v1.XmlPullParser r9, android.content.res.Resources r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r9)
            int[] r1 = androidx.core.C0160R.styleable.FontFamily
            android.content.res.TypedArray r0 = r10.obtainAttributes(r0, r1)
            int r1 = androidx.core.C0160R.styleable.FontFamily_fontProviderAuthority
            java.lang.String r1 = r0.getString(r1)
            int r2 = androidx.core.C0160R.styleable.FontFamily_fontProviderPackage
            java.lang.String r2 = r0.getString(r2)
            int r3 = androidx.core.C0160R.styleable.FontFamily_fontProviderQuery
            java.lang.String r3 = r0.getString(r3)
            int r4 = androidx.core.C0160R.styleable.FontFamily_fontProviderCerts
            r5 = 0
            int r4 = r0.getResourceId(r4, r5)
            int r5 = androidx.core.C0160R.styleable.FontFamily_fontProviderFetchStrategy
            r6 = 1
            int r5 = r0.getInteger(r5, r6)
            int r6 = androidx.core.C0160R.styleable.FontFamily_fontProviderFetchTimeout
            r7 = 500(0x1f4, float:7.0E-43)
            int r6 = r0.getInteger(r6, r7)
            int r7 = androidx.core.C0160R.styleable.FontFamily_fontProviderSystemFontFamily
            java.lang.String r7 = r0.getString(r7)
            r0.recycle()
            r0 = 3
            if (r1 == 0) goto L5b
            if (r2 == 0) goto L5b
            if (r3 == 0) goto L5b
        L42:
            int r8 = r9.next()
            if (r8 == r0) goto L4c
            skip(r9)
            goto L42
        L4c:
            java.util.List r9 = readCerts(r10, r4)
            androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry r10 = new androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry
            androidx.core.provider.FontRequest r0 = new androidx.core.provider.FontRequest
            r0.<init>(r1, r2, r3, r9)
            r10.<init>(r0, r5, r6, r7)
            return r10
        L5b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L60:
            int r2 = r9.next()
            if (r2 == r0) goto L86
            int r2 = r9.getEventType()
            r3 = 2
            if (r2 == r3) goto L6e
            goto L60
        L6e:
            java.lang.String r2 = r9.getName()
            java.lang.String r3 = "font"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L82
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r2 = readFont(r9, r10)
            r1.add(r2)
            goto L60
        L82:
            skip(r9)
            goto L60
        L86:
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L8e
            r9 = 0
            return r9
        L8e:
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r9 = new androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry
            int r10 = r1.size()
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r10 = new androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[r10]
            java.lang.Object[] r10 = r1.toArray(r10)
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r10 = (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[]) r10
            r9.<init>(r10)
            return r9
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry readFont(org.xmlpull.v1.XmlPullParser r9, android.content.res.Resources r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r9)
            int[] r1 = androidx.core.C0160R.styleable.FontFamilyFont
            android.content.res.TypedArray r10 = r10.obtainAttributes(r0, r1)
            int r0 = androidx.core.C0160R.styleable.FontFamilyFont_fontWeight
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L15
            int r0 = androidx.core.C0160R.styleable.FontFamilyFont_fontWeight
            goto L17
        L15:
            int r0 = androidx.core.C0160R.styleable.FontFamilyFont_android_fontWeight
        L17:
            r1 = 400(0x190, float:5.6E-43)
            int r4 = r10.getInt(r0, r1)
            int r0 = androidx.core.C0160R.styleable.FontFamilyFont_fontStyle
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L28
            int r0 = androidx.core.C0160R.styleable.FontFamilyFont_fontStyle
            goto L2a
        L28:
            int r0 = androidx.core.C0160R.styleable.FontFamilyFont_android_fontStyle
        L2a:
            r1 = 0
            int r0 = r10.getInt(r0, r1)
            r2 = 1
            if (r2 != r0) goto L34
            r5 = r2
            goto L35
        L34:
            r5 = r1
        L35:
            int r0 = androidx.core.C0160R.styleable.FontFamilyFont_ttcIndex
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L40
            int r0 = androidx.core.C0160R.styleable.FontFamilyFont_ttcIndex
            goto L42
        L40:
            int r0 = androidx.core.C0160R.styleable.FontFamilyFont_android_ttcIndex
        L42:
            int r2 = androidx.core.C0160R.styleable.FontFamilyFont_fontVariationSettings
            boolean r2 = r10.hasValue(r2)
            if (r2 == 0) goto L4d
            int r2 = androidx.core.C0160R.styleable.FontFamilyFont_fontVariationSettings
            goto L4f
        L4d:
            int r2 = androidx.core.C0160R.styleable.FontFamilyFont_android_fontVariationSettings
        L4f:
            java.lang.String r6 = r10.getString(r2)
            int r7 = r10.getInt(r0, r1)
            int r0 = androidx.core.C0160R.styleable.FontFamilyFont_font
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L62
            int r0 = androidx.core.C0160R.styleable.FontFamilyFont_font
            goto L64
        L62:
            int r0 = androidx.core.C0160R.styleable.FontFamilyFont_android_font
        L64:
            int r8 = r10.getResourceId(r0, r1)
            java.lang.String r3 = r10.getString(r0)
            r10.recycle()
        L6f:
            int r10 = r9.next()
            r0 = 3
            if (r10 == r0) goto L7a
            skip(r9)
            goto L6f
        L7a:
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r9 = new androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
    }

    private static void skip(org.xmlpull.v1.XmlPullParser r3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = 1
        L1:
            if (r0 <= 0) goto L14
            int r1 = r3.next()
            r2 = 2
            if (r1 == r2) goto L11
            r2 = 3
            if (r1 == r2) goto Le
            goto L1
        Le:
            int r0 = r0 + (-1)
            goto L1
        L11:
            int r0 = r0 + 1
            goto L1
        L14:
            return
    }

    private static java.util.List<byte[]> toByteArrayList(java.lang.String[] r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L16
            r4 = r5[r3]
            byte[] r4 = android.util.Base64.decode(r4, r2)
            r0.add(r4)
            int r3 = r3 + 1
            goto L8
        L16:
            return r0
    }
}
