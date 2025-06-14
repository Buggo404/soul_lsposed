package androidx.core.graphics;

/* loaded from: classes.dex */
public class TypefaceCompatApi29Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    public TypefaceCompatApi29Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r9, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r10, android.content.res.Resources r11, int r12) {
            r8 = this;
            r9 = 0
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r10 = r10.getEntries()     // Catch: java.lang.Exception -> L75
            int r0 = r10.length     // Catch: java.lang.Exception -> L75
            r1 = 0
            r3 = r9
            r2 = r1
        L9:
            r4 = 1
            if (r2 >= r0) goto L4e
            r5 = r10[r2]     // Catch: java.lang.Exception -> L75
            android.graphics.fonts.Font$Builder r6 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            int r7 = r5.getResourceId()     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            r6.<init>(r11, r7)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            int r7 = r5.getWeight()     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            android.graphics.fonts.Font$Builder r6 = r6.setWeight(r7)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            boolean r7 = r5.isItalic()     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            if (r7 == 0) goto L26
            goto L27
        L26:
            r4 = r1
        L27:
            android.graphics.fonts.Font$Builder r4 = r6.setSlant(r4)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            int r6 = r5.getTtcIndex()     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            android.graphics.fonts.Font$Builder r4 = r4.setTtcIndex(r6)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            java.lang.String r5 = r5.getVariationSettings()     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            android.graphics.fonts.Font$Builder r4 = r4.setFontVariationSettings(r5)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            android.graphics.fonts.Font r4 = r4.build()     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            if (r3 != 0) goto L48
            android.graphics.fonts.FontFamily$Builder r5 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            r5.<init>(r4)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
            r3 = r5
            goto L4b
        L48:
            r3.addFont(r4)     // Catch: java.io.IOException -> L4b java.lang.Exception -> L75
        L4b:
            int r2 = r2 + 1
            goto L9
        L4e:
            if (r3 != 0) goto L51
            return r9
        L51:
            android.graphics.fonts.FontStyle r10 = new android.graphics.fonts.FontStyle     // Catch: java.lang.Exception -> L75
            r11 = r12 & 1
            if (r11 == 0) goto L5a
            r11 = 700(0x2bc, float:9.81E-43)
            goto L5c
        L5a:
            r11 = 400(0x190, float:5.6E-43)
        L5c:
            r12 = r12 & 2
            if (r12 == 0) goto L61
            r1 = r4
        L61:
            r10.<init>(r11, r1)     // Catch: java.lang.Exception -> L75
            android.graphics.Typeface$CustomFallbackBuilder r11 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L75
            android.graphics.fonts.FontFamily r12 = r3.build()     // Catch: java.lang.Exception -> L75
            r11.<init>(r12)     // Catch: java.lang.Exception -> L75
            android.graphics.Typeface$CustomFallbackBuilder r10 = r11.setStyle(r10)     // Catch: java.lang.Exception -> L75
            android.graphics.Typeface r9 = r10.build()     // Catch: java.lang.Exception -> L75
        L75:
            return r9
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context r11, android.os.CancellationSignal r12, androidx.core.provider.FontsContractCompat.FontInfo[] r13, int r14) {
            r10 = this;
            android.content.ContentResolver r11 = r11.getContentResolver()
            r0 = 0
            int r1 = r13.length     // Catch: java.lang.Exception -> L8b
            r2 = 0
            r4 = r0
            r3 = r2
        L9:
            r5 = 1
            if (r3 >= r1) goto L63
            r6 = r13[r3]     // Catch: java.lang.Exception -> L8b
            android.net.Uri r7 = r6.getUri()     // Catch: java.io.IOException -> L60 java.lang.Exception -> L8b
            java.lang.String r8 = "r"
            android.os.ParcelFileDescriptor r7 = r11.openFileDescriptor(r7, r8, r12)     // Catch: java.io.IOException -> L60 java.lang.Exception -> L8b
            if (r7 != 0) goto L20
            if (r7 == 0) goto L60
        L1c:
            r7.close()     // Catch: java.io.IOException -> L60 java.lang.Exception -> L8b
            goto L60
        L20:
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L54
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L54
            int r9 = r6.getWeight()     // Catch: java.lang.Throwable -> L54
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r9)     // Catch: java.lang.Throwable -> L54
            boolean r9 = r6.isItalic()     // Catch: java.lang.Throwable -> L54
            if (r9 == 0) goto L34
            goto L35
        L34:
            r5 = r2
        L35:
            android.graphics.fonts.Font$Builder r5 = r8.setSlant(r5)     // Catch: java.lang.Throwable -> L54
            int r6 = r6.getTtcIndex()     // Catch: java.lang.Throwable -> L54
            android.graphics.fonts.Font$Builder r5 = r5.setTtcIndex(r6)     // Catch: java.lang.Throwable -> L54
            android.graphics.fonts.Font r5 = r5.build()     // Catch: java.lang.Throwable -> L54
            if (r4 != 0) goto L4e
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Throwable -> L54
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L54
            r4 = r6
            goto L51
        L4e:
            r4.addFont(r5)     // Catch: java.lang.Throwable -> L54
        L51:
            if (r7 == 0) goto L60
            goto L1c
        L54:
            r5 = move-exception
            if (r7 == 0) goto L5f
            r7.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.io.IOException -> L60 java.lang.Exception -> L8b
        L5f:
            throw r5     // Catch: java.io.IOException -> L60 java.lang.Exception -> L8b
        L60:
            int r3 = r3 + 1
            goto L9
        L63:
            if (r4 != 0) goto L66
            return r0
        L66:
            android.graphics.fonts.FontStyle r11 = new android.graphics.fonts.FontStyle     // Catch: java.lang.Exception -> L8b
            r12 = r14 & 1
            if (r12 == 0) goto L6f
            r12 = 700(0x2bc, float:9.81E-43)
            goto L71
        L6f:
            r12 = 400(0x190, float:5.6E-43)
        L71:
            r13 = r14 & 2
            if (r13 == 0) goto L76
            r2 = r5
        L76:
            r11.<init>(r12, r2)     // Catch: java.lang.Exception -> L8b
            android.graphics.Typeface$CustomFallbackBuilder r12 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L8b
            android.graphics.fonts.FontFamily r13 = r4.build()     // Catch: java.lang.Exception -> L8b
            r12.<init>(r13)     // Catch: java.lang.Exception -> L8b
            android.graphics.Typeface$CustomFallbackBuilder r11 = r12.setStyle(r11)     // Catch: java.lang.Exception -> L8b
            android.graphics.Typeface r11 = r11.build()     // Catch: java.lang.Exception -> L8b
            return r11
        L8b:
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected android.graphics.Typeface createFromInputStream(android.content.Context r1, java.io.InputStream r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Do not use this function in API 29 or later."
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            android.graphics.fonts.Font$Builder r1 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Exception -> L24
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.Font r1 = r1.build()     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontFamily$Builder r2 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Exception -> L24
            r2.<init>(r1)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontFamily r2 = r2.build()     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L24
            r3.<init>(r2)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontStyle r1 = r1.getStyle()     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface$CustomFallbackBuilder r1 = r3.setStyle(r1)     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface r1 = r1.build()     // Catch: java.lang.Exception -> L24
            return r1
        L24:
            r1 = 0
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected androidx.core.provider.FontsContractCompat.FontInfo findBestInfo(androidx.core.provider.FontsContractCompat.FontInfo[] r1, int r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Do not use this function in API 29 or later."
            r1.<init>(r2)
            throw r1
    }
}
