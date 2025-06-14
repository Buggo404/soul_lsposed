package com.usidqw.qwerklj.Utils;

/* loaded from: classes.dex */
public final class FileUtils {
    public static final int BY_EXTENSION_ASC = 6;
    public static final int BY_EXTENSION_DESC = 7;
    public static final int BY_NAME_ASC = 0;
    public static final int BY_NAME_DESC = 1;
    public static final int BY_SIZE_ASC = 4;
    public static final int BY_SIZE_DESC = 5;
    public static final int BY_TIME_ASC = 2;
    public static final int BY_TIME_DESC = 3;



    public static class SortByExtension implements java.util.Comparator<java.io.File> {
        public SortByExtension() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(java.io.File r4, java.io.File r5) {
                r3 = this;
                r0 = -1
                r1 = 1
                if (r4 == 0) goto L2e
                if (r5 != 0) goto L7
                goto L2e
            L7:
                boolean r2 = r4.isDirectory()
                if (r2 == 0) goto L14
                boolean r2 = r5.isFile()
                if (r2 == 0) goto L14
                return r0
            L14:
                boolean r0 = r4.isFile()
                if (r0 == 0) goto L21
                boolean r0 = r5.isDirectory()
                if (r0 == 0) goto L21
                return r1
            L21:
                java.lang.String r4 = r4.getName()
                java.lang.String r5 = r5.getName()
                int r4 = r4.compareToIgnoreCase(r5)
                return r4
            L2e:
                if (r4 != 0) goto L31
                return r0
            L31:
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.io.File r1, java.io.File r2) {
                r0 = this;
                java.io.File r1 = (java.io.File) r1
                java.io.File r2 = (java.io.File) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    public static class SortByName implements java.util.Comparator<java.io.File> {
        private final boolean caseSensitive;

        public SortByName() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.caseSensitive = r0
                return
        }

        public SortByName(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.caseSensitive = r1
                return
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(java.io.File r4, java.io.File r5) {
                r3 = this;
                r0 = -1
                r1 = 1
                if (r4 == 0) goto L37
                if (r5 != 0) goto L7
                goto L37
            L7:
                boolean r2 = r4.isDirectory()
                if (r2 == 0) goto L14
                boolean r2 = r5.isFile()
                if (r2 == 0) goto L14
                return r0
            L14:
                boolean r0 = r4.isFile()
                if (r0 == 0) goto L21
                boolean r0 = r5.isDirectory()
                if (r0 == 0) goto L21
                return r1
            L21:
                java.lang.String r4 = r4.getName()
                java.lang.String r5 = r5.getName()
                boolean r0 = r3.caseSensitive
                if (r0 == 0) goto L32
                int r4 = r4.compareTo(r5)
                return r4
            L32:
                int r4 = r4.compareToIgnoreCase(r5)
                return r4
            L37:
                if (r4 != 0) goto L3a
                return r0
            L3a:
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.io.File r1, java.io.File r2) {
                r0 = this;
                java.io.File r1 = (java.io.File) r1
                java.io.File r2 = (java.io.File) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    public static class SortBySize implements java.util.Comparator<java.io.File> {
        public SortBySize() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(java.io.File r5, java.io.File r6) {
                r4 = this;
                r0 = -1
                r1 = 1
                if (r5 == 0) goto L2f
                if (r6 != 0) goto L7
                goto L2f
            L7:
                boolean r2 = r5.isDirectory()
                if (r2 == 0) goto L14
                boolean r2 = r6.isFile()
                if (r2 == 0) goto L14
                return r0
            L14:
                boolean r2 = r5.isFile()
                if (r2 == 0) goto L21
                boolean r2 = r6.isDirectory()
                if (r2 == 0) goto L21
                return r1
            L21:
                long r2 = r5.length()
                long r5 = r6.length()
                int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r5 >= 0) goto L2e
                return r0
            L2e:
                return r1
            L2f:
                if (r5 != 0) goto L32
                return r0
            L32:
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.io.File r1, java.io.File r2) {
                r0 = this;
                java.io.File r1 = (java.io.File) r1
                java.io.File r2 = (java.io.File) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    public static class SortByTime implements java.util.Comparator<java.io.File> {
        public SortByTime() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(java.io.File r5, java.io.File r6) {
                r4 = this;
                r0 = -1
                r1 = 1
                if (r5 == 0) goto L2f
                if (r6 != 0) goto L7
                goto L2f
            L7:
                boolean r2 = r5.isDirectory()
                if (r2 == 0) goto L14
                boolean r2 = r6.isFile()
                if (r2 == 0) goto L14
                return r0
            L14:
                boolean r2 = r5.isFile()
                if (r2 == 0) goto L21
                boolean r2 = r6.isDirectory()
                if (r2 == 0) goto L21
                return r1
            L21:
                long r2 = r5.lastModified()
                long r5 = r6.lastModified()
                int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r5 <= 0) goto L2e
                return r0
            L2e:
                return r1
            L2f:
                if (r5 != 0) goto L32
                return r0
            L32:
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.io.File r1, java.io.File r2) {
                r0 = this;
                java.io.File r1 = (java.io.File) r1
                java.io.File r2 = (java.io.File) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SortType {
    }

    public FileUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean appendText(java.lang.String r3, java.lang.String r4) {
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r3 = 0
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
            if (r1 != 0) goto Lf
            r0.createNewFile()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
        Lf:
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
            r2 = 1
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
            r1.write(r4)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1f
            closeSilently(r1)
            return r2
        L1c:
            r4 = move-exception
            r3 = r1
            goto L22
        L1f:
            r3 = r1
            goto L26
        L21:
            r4 = move-exception
        L22:
            closeSilently(r3)
            throw r4
        L26:
            closeSilently(r3)
            r3 = 0
            return r3
    }

    public static boolean canBackParent(java.lang.String r2, java.util.List<java.lang.String> r3) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = java.io.File.separator
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4
            r2 = 0
            return r2
        L2b:
            r2 = 1
            return r2
    }

    public static void closeSilently(java.io.Closeable r0) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.close()     // Catch: java.io.IOException -> L6
        L6:
            return
    }

    public static int compareLastModified(java.lang.String r2, java.lang.String r3) {
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            long r0 = r0.lastModified()
            java.io.File r2 = new java.io.File
            r2.<init>(r3)
            long r2 = r2.lastModified()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L18
            r2 = 1
            return r2
        L18:
            if (r2 >= 0) goto L1c
            r2 = -1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public static boolean copy(java.io.File r7, java.io.File r8) {
            r0 = 0
            boolean r1 = r7.isFile()     // Catch: java.lang.Exception -> L5d
            if (r1 == 0) goto L31
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L5d
            r1.<init>(r7)     // Catch: java.lang.Exception -> L5d
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L5d
            r7.<init>(r8)     // Catch: java.lang.Exception -> L5d
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L5d
            r8.<init>(r1)     // Catch: java.lang.Exception -> L5d
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L5d
            r1.<init>(r7)     // Catch: java.lang.Exception -> L5d
            r7 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Exception -> L5d
        L1f:
            int r2 = r8.read(r7)     // Catch: java.lang.Exception -> L5d
            r3 = -1
            if (r2 != r3) goto L2d
            r8.close()     // Catch: java.lang.Exception -> L5d
            r1.close()     // Catch: java.lang.Exception -> L5d
            goto L5b
        L2d:
            r1.write(r7, r0, r2)     // Catch: java.lang.Exception -> L5d
            goto L1f
        L31:
            boolean r1 = r7.isDirectory()     // Catch: java.lang.Exception -> L5d
            if (r1 == 0) goto L5b
            java.io.File[] r7 = r7.listFiles()     // Catch: java.lang.Exception -> L5d
            r8.mkdirs()     // Catch: java.lang.Exception -> L5d
            int r1 = r7.length     // Catch: java.lang.Exception -> L5d
            r2 = r0
        L40:
            if (r2 >= r1) goto L5b
            r3 = r7[r2]     // Catch: java.lang.Exception -> L5d
            java.io.File r4 = r3.getAbsoluteFile()     // Catch: java.lang.Exception -> L5d
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L5d
            java.io.File r6 = r8.getAbsoluteFile()     // Catch: java.lang.Exception -> L5d
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L5d
            r5.<init>(r6, r3)     // Catch: java.lang.Exception -> L5d
            copy(r4, r5)     // Catch: java.lang.Exception -> L5d
            int r2 = r2 + 1
            goto L40
        L5b:
            r7 = 1
            return r7
        L5d:
            return r0
    }

    public static boolean copy(java.lang.String r1, java.lang.String r2) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L18
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            boolean r1 = copy(r0, r1)
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    public static boolean delete(java.io.File r1) {
            r0 = 0
            boolean r1 = delete(r1, r0)
            return r1
    }

    public static boolean delete(java.io.File r4, boolean r5) {
            boolean r0 = r4.isFile()
            if (r0 == 0) goto Lb
            boolean r4 = deleteResolveEBUSY(r4)
            goto L39
        Lb:
            java.io.File[] r0 = r4.listFiles()
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            int r2 = r0.length
            if (r2 != 0) goto L20
            if (r5 == 0) goto L31
            boolean r0 = deleteResolveEBUSY(r4)
            if (r0 == 0) goto L31
            r1 = 1
            goto L31
        L20:
            int r2 = r0.length
            r3 = r1
        L22:
            if (r1 >= r2) goto L30
            r3 = r0[r1]
            delete(r3, r5)
            boolean r3 = deleteResolveEBUSY(r3)
            int r1 = r1 + 1
            goto L22
        L30:
            r1 = r3
        L31:
            if (r5 == 0) goto L38
            boolean r4 = deleteResolveEBUSY(r4)
            goto L39
        L38:
            r4 = r1
        L39:
            return r4
    }

    public static boolean delete(java.lang.String r1) {
            r0 = 0
            boolean r1 = delete(r1, r0)
            return r1
    }

    public static boolean delete(java.lang.String r1, boolean r2) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L10
            boolean r1 = delete(r0, r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    private static boolean deleteResolveEBUSY(java.io.File r4) {
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r4.renameTo(r0)
            boolean r4 = r0.delete()
            return r4
    }

    public static boolean exist(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            return r1
    }

    public static java.lang.String formatDate(java.util.Date r2, java.lang.String r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.PRC
            r0.<init>(r3, r1)
            java.lang.String r2 = r0.format(r2)
            return r2
    }

    public static java.util.List<java.lang.String> getAllSdCardList(java.util.List<java.lang.String> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.size()
            if (r1 >= r2) goto L29
            if (r1 != 0) goto L14
            java.lang.String r2 = "内部存储设备"
            r0.add(r2)
            goto L26
        L14:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SD卡"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.add(r2)
        L26:
            int r1 = r1 + 1
            goto L6
        L29:
            return r0
    }

    public static java.util.List<java.lang.String> getAllSdPaths(android.content.Context r4) {
            java.lang.String r0 = "storage"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.os.storage.StorageManager r4 = (android.os.storage.StorageManager) r4
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Exception -> L1e
            java.lang.String r1 = "getVolumePaths"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1e
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L1e
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1e
            java.lang.Object r4 = r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L1e
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.Exception -> L1e
            goto L23
        L1e:
            r4 = move-exception
            r4.printStackTrace()
            r4 = 0
        L23:
            if (r4 == 0) goto L2a
            java.util.List r4 = java.util.Arrays.asList(r4)
            return r4
        L2a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
    }

    public static java.lang.String getChangeSdCard(java.lang.String r2, java.util.List<java.lang.String> r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L22:
            java.lang.String r0 = "内部存储设备"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L45
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L45:
            java.lang.String r0 = "SD卡"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L78
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 3
            char r2 = r2.charAt(r1)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r2.intValue()
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L78:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static java.lang.String getDateTime(java.io.File r3, java.lang.String r4) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r1 = r3.lastModified()
            r0.setTimeInMillis(r1)
            java.util.Date r3 = r0.getTime()
            java.lang.String r3 = formatDate(r3, r4)
            return r3
    }

    public static java.lang.String getDateTime(java.lang.String r1) {
            java.lang.String r0 = "yyyy-MM-dd HH:mm"
            java.lang.String r1 = getDateTime(r1, r0)
            return r1
    }

    public static java.lang.String getDateTime(java.lang.String r1, java.lang.String r2) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.lang.String r1 = getDateTime(r0, r2)
            return r1
    }

    public static java.lang.String getExtension(java.lang.String r1) {
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 < 0) goto Lf
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            return r1
        Lf:
            java.lang.String r1 = "ext"
            return r1
    }

    public static long getLength(java.lang.String r2) {
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L17
            boolean r2 = r0.exists()
            if (r2 != 0) goto L12
            goto L17
        L12:
            long r0 = r0.length()
            return r0
        L17:
            r0 = 0
            return r0
    }

    public static java.lang.String getMimeType(java.lang.String r2) {
            java.lang.String r2 = getExtension(r2)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            boolean r1 = r0.hasExtension(r2)
            if (r1 == 0) goto L13
            java.lang.String r2 = r0.getMimeTypeFromExtension(r2)
            goto L15
        L13:
            java.lang.String r2 = "*/*"
        L15:
            return r2
    }

    public static java.lang.String getName(java.lang.String r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            r0 = 47
            int r0 = r3.lastIndexOf(r0)
            if (r0 < 0) goto L14
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            return r3
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r3 = getExtension(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static java.lang.String getNameExcludeExtension(java.lang.String r2) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L18
            r0.<init>(r2)     // Catch: java.lang.Exception -> L18
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Exception -> L18
            java.lang.String r0 = "."
            int r0 = r2.lastIndexOf(r0)     // Catch: java.lang.Exception -> L18
            r1 = -1
            if (r0 == r1) goto L17
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)     // Catch: java.lang.Exception -> L18
        L17:
            return r2
        L18:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String getSize(java.lang.String r2) {
            long r0 = getLength(r2)
            java.lang.String r2 = com.usidqw.qwerklj.Utils.ConvertUtils.toFileSizeString(r0)
            return r2
    }

    static /* synthetic */ boolean lambda$listFiles$0(java.lang.String[] r0, java.io.File r1, java.lang.String r2) {
            java.lang.String r1 = getExtension(r2)
            java.lang.String r0 = com.usidqw.qwerklj.Utils.ConvertUtils.toString(r0)
            boolean r0 = r0.contains(r1)
            return r0
    }

    static /* synthetic */ int lambda$listFiles$1(java.io.File r2, java.io.File r3) {
            long r0 = r2.lastModified()
            long r2 = r3.lastModified()
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L11
            r2 = 1
            return r2
        L11:
            if (r2 != 0) goto L15
            r2 = 0
            return r2
        L15:
            r2 = -1
            return r2
    }

    public static java.io.File[] listDirs(java.lang.String r2) {
            r0 = 0
            r1 = 0
            java.io.File[] r2 = listDirs(r2, r0, r1)
            return r2
    }

    public static java.io.File[] listDirs(java.lang.String r1, java.lang.String[] r2) {
            r0 = 3
            java.io.File[] r1 = listDirs(r1, r2, r0)
            return r1
    }

    public static java.io.File[] listDirs(java.lang.String r6, java.lang.String[] r7, int r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = new java.io.File
            r1.<init>(r6)
            boolean r6 = r1.isDirectory()
            r2 = 0
            if (r6 != 0) goto L14
            java.io.File[] r6 = new java.io.File[r2]
            return r6
        L14:
            com.usidqw.qwerklj.Utils.FileUtils$1 r6 = new com.usidqw.qwerklj.Utils.FileUtils$1
            r6.<init>()
            java.io.File[] r6 = r1.listFiles(r6)
            if (r6 != 0) goto L22
            java.io.File[] r6 = new java.io.File[r2]
            return r6
        L22:
            if (r7 != 0) goto L26
            java.lang.String[] r7 = new java.lang.String[r2]
        L26:
            int r1 = r6.length
        L27:
            if (r2 >= r1) goto L43
            r3 = r6[r2]
            java.io.File r3 = r3.getAbsoluteFile()
            java.lang.String r4 = com.usidqw.qwerklj.Utils.ConvertUtils.toString(r7)
            java.lang.String r5 = r3.getName()
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L40
            r0.add(r3)
        L40:
            int r2 = r2 + 1
            goto L27
        L43:
            if (r8 != 0) goto L4e
            com.usidqw.qwerklj.Utils.FileUtils$SortByName r6 = new com.usidqw.qwerklj.Utils.FileUtils$SortByName
            r6.<init>()
            java.util.Collections.sort(r0, r6)
            goto Lad
        L4e:
            r6 = 1
            if (r8 != r6) goto L5d
            com.usidqw.qwerklj.Utils.FileUtils$SortByName r6 = new com.usidqw.qwerklj.Utils.FileUtils$SortByName
            r6.<init>()
            java.util.Collections.sort(r0, r6)
            java.util.Collections.reverse(r0)
            goto Lad
        L5d:
            r6 = 2
            if (r8 != r6) goto L69
            com.usidqw.qwerklj.Utils.FileUtils$SortByTime r6 = new com.usidqw.qwerklj.Utils.FileUtils$SortByTime
            r6.<init>()
            java.util.Collections.sort(r0, r6)
            goto Lad
        L69:
            r6 = 3
            if (r8 != r6) goto L78
            com.usidqw.qwerklj.Utils.FileUtils$SortByTime r6 = new com.usidqw.qwerklj.Utils.FileUtils$SortByTime
            r6.<init>()
            java.util.Collections.sort(r0, r6)
            java.util.Collections.reverse(r0)
            goto Lad
        L78:
            r6 = 4
            if (r8 != r6) goto L84
            com.usidqw.qwerklj.Utils.FileUtils$SortBySize r6 = new com.usidqw.qwerklj.Utils.FileUtils$SortBySize
            r6.<init>()
            java.util.Collections.sort(r0, r6)
            goto Lad
        L84:
            r6 = 5
            if (r8 != r6) goto L93
            com.usidqw.qwerklj.Utils.FileUtils$SortBySize r6 = new com.usidqw.qwerklj.Utils.FileUtils$SortBySize
            r6.<init>()
            java.util.Collections.sort(r0, r6)
            java.util.Collections.reverse(r0)
            goto Lad
        L93:
            r6 = 6
            if (r8 != r6) goto L9f
            com.usidqw.qwerklj.Utils.FileUtils$SortByExtension r6 = new com.usidqw.qwerklj.Utils.FileUtils$SortByExtension
            r6.<init>()
            java.util.Collections.sort(r0, r6)
            goto Lad
        L9f:
            r6 = 7
            if (r8 != r6) goto Lad
            com.usidqw.qwerklj.Utils.FileUtils$SortByExtension r6 = new com.usidqw.qwerklj.Utils.FileUtils$SortByExtension
            r6.<init>()
            java.util.Collections.sort(r0, r6)
            java.util.Collections.reverse(r0)
        Lad:
            int r6 = r0.size()
            java.io.File[] r6 = new java.io.File[r6]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.io.File[] r6 = (java.io.File[]) r6
            return r6
    }

    public static java.io.File[] listDirsAndFiles(java.lang.String r1) {
            r0 = 0
            java.io.File[] r1 = listDirsAndFiles(r1, r0)
            return r1
    }

    public static java.io.File[] listDirsAndFiles(java.lang.String r3, java.lang.String[] r4) {
            java.io.File[] r0 = listDirs(r3)
            if (r4 != 0) goto Lb
            java.io.File[] r3 = listFiles(r3)
            goto Lf
        Lb:
            java.io.File[] r3 = listFiles(r3, r4)
        Lf:
            if (r3 != 0) goto L13
            r3 = 0
            return r3
        L13:
            int r4 = r0.length
            int r1 = r3.length
            int r4 = r4 + r1
            java.io.File[] r4 = new java.io.File[r4]
            int r1 = r0.length
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r0 = r0.length
            int r1 = r3.length
            java.lang.System.arraycopy(r3, r2, r4, r0, r1)
            return r4
    }

    public static java.io.File[] listFiles(java.lang.String r2) {
            r0 = 0
            r1 = 0
            java.io.File[] r2 = listFiles(r2, r0, r1)
            return r2
    }

    public static java.io.File[] listFiles(java.lang.String r2, java.lang.String r3) {
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            java.io.File[] r2 = listFiles(r2, r0)
            return r2
    }

    public static java.io.File[] listFiles(java.lang.String r1, java.util.regex.Pattern r2) {
            r0 = 0
            java.io.File[] r1 = listFiles(r1, r2, r0)
            return r1
    }

    public static java.io.File[] listFiles(java.lang.String r3, java.util.regex.Pattern r4, int r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            boolean r3 = r1.isDirectory()
            r2 = 0
            if (r3 != 0) goto L14
            java.io.File[] r3 = new java.io.File[r2]
            return r3
        L14:
            com.usidqw.qwerklj.Utils.FileUtils$2 r3 = new com.usidqw.qwerklj.Utils.FileUtils$2
            r3.<init>(r4)
            java.io.File[] r3 = r1.listFiles(r3)
            if (r3 != 0) goto L22
            java.io.File[] r3 = new java.io.File[r2]
            return r3
        L22:
            int r4 = r3.length
        L23:
            if (r2 >= r4) goto L31
            r1 = r3[r2]
            java.io.File r1 = r1.getAbsoluteFile()
            r0.add(r1)
            int r2 = r2 + 1
            goto L23
        L31:
            if (r5 != 0) goto L3c
            com.usidqw.qwerklj.Utils.FileUtils$SortByName r3 = new com.usidqw.qwerklj.Utils.FileUtils$SortByName
            r3.<init>()
            java.util.Collections.sort(r0, r3)
            goto L9b
        L3c:
            r3 = 1
            if (r5 != r3) goto L4b
            com.usidqw.qwerklj.Utils.FileUtils$SortByName r3 = new com.usidqw.qwerklj.Utils.FileUtils$SortByName
            r3.<init>()
            java.util.Collections.sort(r0, r3)
            java.util.Collections.reverse(r0)
            goto L9b
        L4b:
            r3 = 2
            if (r5 != r3) goto L57
            com.usidqw.qwerklj.Utils.FileUtils$SortByTime r3 = new com.usidqw.qwerklj.Utils.FileUtils$SortByTime
            r3.<init>()
            java.util.Collections.sort(r0, r3)
            goto L9b
        L57:
            r3 = 3
            if (r5 != r3) goto L66
            com.usidqw.qwerklj.Utils.FileUtils$SortByTime r3 = new com.usidqw.qwerklj.Utils.FileUtils$SortByTime
            r3.<init>()
            java.util.Collections.sort(r0, r3)
            java.util.Collections.reverse(r0)
            goto L9b
        L66:
            r3 = 4
            if (r5 != r3) goto L72
            com.usidqw.qwerklj.Utils.FileUtils$SortBySize r3 = new com.usidqw.qwerklj.Utils.FileUtils$SortBySize
            r3.<init>()
            java.util.Collections.sort(r0, r3)
            goto L9b
        L72:
            r3 = 5
            if (r5 != r3) goto L81
            com.usidqw.qwerklj.Utils.FileUtils$SortBySize r3 = new com.usidqw.qwerklj.Utils.FileUtils$SortBySize
            r3.<init>()
            java.util.Collections.sort(r0, r3)
            java.util.Collections.reverse(r0)
            goto L9b
        L81:
            r3 = 6
            if (r5 != r3) goto L8d
            com.usidqw.qwerklj.Utils.FileUtils$SortByExtension r3 = new com.usidqw.qwerklj.Utils.FileUtils$SortByExtension
            r3.<init>()
            java.util.Collections.sort(r0, r3)
            goto L9b
        L8d:
            r3 = 7
            if (r5 != r3) goto L9b
            com.usidqw.qwerklj.Utils.FileUtils$SortByExtension r3 = new com.usidqw.qwerklj.Utils.FileUtils$SortByExtension
            r3.<init>()
            java.util.Collections.sort(r0, r3)
            java.util.Collections.reverse(r0)
        L9b:
            int r3 = r0.size()
            java.io.File[] r3 = new java.io.File[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            java.io.File[] r3 = (java.io.File[]) r3
            return r3
    }

    public static java.io.File[] listFiles(java.lang.String r1, java.lang.String[] r2) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            com.usidqw.qwerklj.Utils.FileUtils$$ExternalSyntheticLambda0 r1 = new com.usidqw.qwerklj.Utils.FileUtils$$ExternalSyntheticLambda0
            r1.<init>(r2)
            java.io.File[] r1 = r0.listFiles(r1)
            if (r1 == 0) goto L18
            com.usidqw.qwerklj.Utils.FileUtils$$ExternalSyntheticLambda1 r2 = new com.usidqw.qwerklj.Utils.FileUtils$$ExternalSyntheticLambda1
            r2.<init>()
            java.util.Arrays.sort(r1, r2)
        L18:
            return r1
    }

    public static boolean makeDirs(java.io.File r0) {
            boolean r0 = r0.mkdirs()
            return r0
    }

    public static boolean makeDirs(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = makeDirs(r0)
            return r1
    }

    public static boolean move(java.io.File r0, java.io.File r1) {
            boolean r0 = rename(r0, r1)
            return r0
    }

    public static boolean move(java.lang.String r1, java.lang.String r2) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            boolean r1 = move(r0, r1)
            return r1
    }

    public static void orderByDate(java.lang.String r5) {
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            java.io.File[] r5 = r0.listFiles()
            int r0 = r5.length
            int r0 = r0 + (-1)
        Lc:
            r1 = -1
            if (r0 <= r1) goto L2d
            java.io.PrintStream r1 = java.lang.System.out
            r2 = r5[r0]
            java.lang.String r2 = r2.getName()
            r1.println(r2)
            java.io.PrintStream r1 = java.lang.System.out
            java.util.Date r2 = new java.util.Date
            r3 = r5[r0]
            long r3 = r3.lastModified()
            r2.<init>(r3)
            r1.println(r2)
            int r0 = r0 + (-1)
            goto Lc
        L2d:
            return
    }

    public static byte[] readBytes(java.lang.String r7) {
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            r1 = 1
            r2 = 0
            r0.setReadable(r1, r2)
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L37
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L37
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            r7.<init>()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
        L19:
            int r5 = r1.read(r4, r2, r3)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            r6 = -1
            if (r5 != r6) goto L2b
            byte[] r2 = r7.toByteArray()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            r7.close()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            closeSilently(r1)
            return r2
        L2b:
            r7.write(r4, r2, r5)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            goto L19
        L2f:
            r7 = move-exception
            r0 = r1
            goto L33
        L32:
            r7 = move-exception
        L33:
            closeSilently(r0)
            throw r7
        L37:
            r1 = r0
        L38:
            closeSilently(r1)
            return r0
    }

    public static java.lang.String readText(java.lang.String r1) {
            java.lang.String r0 = "utf-8"
            java.lang.String r1 = readText(r1, r0)
            return r1
    }

    public static java.lang.String readText(java.lang.String r1, java.lang.String r2) {
            byte[] r1 = readBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L10
            if (r1 == 0) goto L10
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L10
            r0.<init>(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L10
            java.lang.String r1 = r0.trim()     // Catch: java.io.UnsupportedEncodingException -> L10
            return r1
        L10:
            java.lang.String r1 = ""
            return r1
    }

    public static boolean rename(java.io.File r0, java.io.File r1) {
            boolean r0 = r0.renameTo(r1)
            return r0
    }

    public static boolean rename(java.lang.String r1, java.lang.String r2) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            boolean r1 = rename(r0, r1)
            return r1
    }

    public static java.lang.String separator(java.lang.String r2) {
            java.lang.String r0 = java.io.File.separator
            java.lang.String r1 = "\\"
            java.lang.String r2 = r2.replace(r1, r0)
            boolean r1 = r2.endsWith(r0)
            if (r1 != 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
        L1f:
            return r2
    }

    public static boolean writeBytes(java.lang.String r3, byte[] r4) {
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r1 = 0
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2d
            if (r2 != 0) goto L16
            java.io.File r2 = r0.getParentFile()     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2d
            r2.mkdirs()     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2d
            r0.createNewFile()     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2d
        L16:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2d
            r0.write(r4)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L26
            closeSilently(r0)
            r3 = 1
            return r3
        L23:
            r3 = move-exception
            r1 = r0
            goto L29
        L26:
            r1 = r0
            goto L2d
        L28:
            r3 = move-exception
        L29:
            closeSilently(r1)
            throw r3
        L2d:
            closeSilently(r1)
            r3 = 0
            return r3
    }

    public static boolean writeInputStream(java.lang.String r4, java.io.InputStream r5) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L22
            r1.<init>(r4)     // Catch: java.io.IOException -> L22
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L22
            r4.<init>(r1)     // Catch: java.io.IOException -> L22
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L22
        Lf:
            int r2 = r5.read(r1)     // Catch: java.io.IOException -> L22
            r3 = -1
            if (r2 == r3) goto L1a
            r4.write(r1, r0, r2)     // Catch: java.io.IOException -> L22
            goto Lf
        L1a:
            r4.close()     // Catch: java.io.IOException -> L22
            r5.close()     // Catch: java.io.IOException -> L22
            r4 = 1
            return r4
        L22:
            return r0
    }

    public static boolean writeText(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "utf-8"
            boolean r1 = writeText(r1, r2, r0)
            return r1
    }

    public static boolean writeText(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            byte[] r1 = r1.getBytes(r2)     // Catch: java.io.UnsupportedEncodingException -> L9
            writeBytes(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }
}
