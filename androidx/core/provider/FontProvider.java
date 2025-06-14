package androidx.core.provider;

/* loaded from: classes.dex */
class FontProvider {
    private static final java.util.Comparator<byte[]> sByteArrayComparator = null;


    static {
            androidx.core.provider.FontProvider$1 r0 = new androidx.core.provider.FontProvider$1
            r0.<init>()
            androidx.core.provider.FontProvider.sByteArrayComparator = r0
            return
    }

    private FontProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.util.List<byte[]> convertToByteArrayList(android.content.pm.Signature[] r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r3.length
            if (r1 >= r2) goto L15
            r2 = r3[r1]
            byte[] r2 = r2.toByteArray()
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L15:
            return r0
    }

    private static boolean equalsByteArrayList(java.util.List<byte[]> r4, java.util.List<byte[]> r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = r2
        Ld:
            int r1 = r4.size()
            if (r0 >= r1) goto L29
            java.lang.Object r1 = r4.get(r0)
            byte[] r1 = (byte[]) r1
            java.lang.Object r3 = r5.get(r0)
            byte[] r3 = (byte[]) r3
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            int r0 = r0 + 1
            goto Ld
        L29:
            r4 = 1
            return r4
    }

    private static java.util.List<java.util.List<byte[]>> getCertificates(androidx.core.provider.FontRequest r1, android.content.res.Resources r2) {
            java.util.List r0 = r1.getCertificates()
            if (r0 == 0) goto Lb
            java.util.List r1 = r1.getCertificates()
            return r1
        Lb:
            int r1 = r1.getCertificatesArrayResId()
            java.util.List r1 = androidx.core.content.res.FontResourcesParserCompat.readCerts(r2, r1)
            return r1
    }

    static androidx.core.provider.FontsContractCompat.FontFamilyResult getFontFamilyResult(android.content.Context r2, androidx.core.provider.FontRequest r3, android.os.CancellationSignal r4) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            android.content.res.Resources r1 = r2.getResources()
            android.content.pm.ProviderInfo r0 = getProvider(r0, r3, r1)
            if (r0 != 0) goto L15
            r2 = 1
            r3 = 0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r2 = androidx.core.provider.FontsContractCompat.FontFamilyResult.create(r2, r3)
            return r2
        L15:
            java.lang.String r0 = r0.authority
            androidx.core.provider.FontsContractCompat$FontInfo[] r2 = query(r2, r3, r0, r4)
            r3 = 0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r2 = androidx.core.provider.FontsContractCompat.FontFamilyResult.create(r3, r2)
            return r2
    }

    static android.content.pm.ProviderInfo getProvider(android.content.pm.PackageManager r5, androidx.core.provider.FontRequest r6, android.content.res.Resources r7) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = r6.getProviderAuthority()
            r1 = 0
            android.content.pm.ProviderInfo r2 = r5.resolveContentProvider(r0, r1)
            if (r2 == 0) goto L73
            java.lang.String r3 = r2.packageName
            java.lang.String r4 = r6.getProviderPackage()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L50
            java.lang.String r0 = r2.packageName
            r3 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r0, r3)
            android.content.pm.Signature[] r5 = r5.signatures
            java.util.List r5 = convertToByteArrayList(r5)
            java.util.Comparator<byte[]> r0 = androidx.core.provider.FontProvider.sByteArrayComparator
            java.util.Collections.sort(r5, r0)
            java.util.List r6 = getCertificates(r6, r7)
        L2e:
            int r7 = r6.size()
            if (r1 >= r7) goto L4e
            java.util.ArrayList r7 = new java.util.ArrayList
            java.lang.Object r0 = r6.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.<init>(r0)
            java.util.Comparator<byte[]> r0 = androidx.core.provider.FontProvider.sByteArrayComparator
            java.util.Collections.sort(r7, r0)
            boolean r7 = equalsByteArrayList(r5, r7)
            if (r7 == 0) goto L4b
            return r2
        L4b:
            int r1 = r1 + 1
            goto L2e
        L4e:
            r5 = 0
            return r5
        L50:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Found content provider "
            r7.<init>(r1)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = ", but package was not "
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r6 = r6.getProviderPackage()
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L73:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "No package found for authority: "
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    static androidx.core.provider.FontsContractCompat.FontInfo[] query(android.content.Context r16, androidx.core.provider.FontRequest r17, java.lang.String r18, android.os.CancellationSignal r19) {
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r2 = r2.build()
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            android.net.Uri$Builder r3 = r4.scheme(r3)
            android.net.Uri$Builder r0 = r3.authority(r0)
            java.lang.String r3 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            android.net.Uri r0 = r0.build()
            r3 = 0
            java.lang.String r4 = "_id"
            java.lang.String r5 = "file_id"
            java.lang.String r6 = "font_ttc_index"
            java.lang.String r7 = "font_variation_settings"
            java.lang.String r8 = "font_weight"
            java.lang.String r9 = "font_italic"
            java.lang.String r10 = "result_code"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10}     // Catch: java.lang.Throwable -> Lec
            android.content.ContentResolver r4 = r16.getContentResolver()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r7 = "query = ?"
            r11 = 1
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> Lec
            java.lang.String r5 = r17.getQuery()     // Catch: java.lang.Throwable -> Lec
            r12 = 0
            r8[r12] = r5     // Catch: java.lang.Throwable -> Lec
            r9 = 0
            r5 = r2
            r10 = r19
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lec
            if (r3 == 0) goto Ldd
            int r4 = r3.getCount()     // Catch: java.lang.Throwable -> Lec
            if (r4 <= 0) goto Ldd
            java.lang.String r1 = "result_code"
            int r1 = r3.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lec
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lec
            r4.<init>()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r5 = "_id"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r6 = "file_id"
            int r6 = r3.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r7 = "font_ttc_index"
            int r7 = r3.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r8 = "font_weight"
            int r8 = r3.getColumnIndex(r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r9 = "font_italic"
            int r9 = r3.getColumnIndex(r9)     // Catch: java.lang.Throwable -> Lec
        L8d:
            boolean r10 = r3.moveToNext()     // Catch: java.lang.Throwable -> Lec
            if (r10 == 0) goto Ldc
            r10 = -1
            if (r1 == r10) goto L9b
            int r13 = r3.getInt(r1)     // Catch: java.lang.Throwable -> Lec
            goto L9c
        L9b:
            r13 = r12
        L9c:
            if (r7 == r10) goto La3
            int r14 = r3.getInt(r7)     // Catch: java.lang.Throwable -> Lec
            goto La4
        La3:
            r14 = r12
        La4:
            if (r6 != r10) goto Lb1
            r17 = r13
            long r12 = r3.getLong(r5)     // Catch: java.lang.Throwable -> Lec
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r2, r12)     // Catch: java.lang.Throwable -> Lec
            goto Lbb
        Lb1:
            r17 = r13
            long r12 = r3.getLong(r6)     // Catch: java.lang.Throwable -> Lec
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r0, r12)     // Catch: java.lang.Throwable -> Lec
        Lbb:
            if (r8 == r10) goto Lc2
            int r13 = r3.getInt(r8)     // Catch: java.lang.Throwable -> Lec
            goto Lc4
        Lc2:
            r13 = 400(0x190, float:5.6E-43)
        Lc4:
            if (r9 == r10) goto Ld0
            int r10 = r3.getInt(r9)     // Catch: java.lang.Throwable -> Lec
            if (r10 != r11) goto Ld0
            r10 = r17
            r15 = r11
            goto Ld3
        Ld0:
            r10 = r17
            r15 = 0
        Ld3:
            androidx.core.provider.FontsContractCompat$FontInfo r10 = androidx.core.provider.FontsContractCompat.FontInfo.create(r12, r14, r13, r15, r10)     // Catch: java.lang.Throwable -> Lec
            r4.add(r10)     // Catch: java.lang.Throwable -> Lec
            r12 = 0
            goto L8d
        Ldc:
            r1 = r4
        Ldd:
            if (r3 == 0) goto Le2
            r3.close()
        Le2:
            r0 = 0
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = new androidx.core.provider.FontsContractCompat.FontInfo[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = (androidx.core.provider.FontsContractCompat.FontInfo[]) r0
            return r0
        Lec:
            r0 = move-exception
            if (r3 == 0) goto Lf2
            r3.close()
        Lf2:
            throw r0
    }
}
