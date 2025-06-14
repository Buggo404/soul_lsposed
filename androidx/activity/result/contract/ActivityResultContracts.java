package androidx.activity.result.contract;

/* loaded from: classes.dex */
public final class ActivityResultContracts {

    public static class CreateDocument extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, android.net.Uri> {
        public CreateDocument() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.CREATE_DOCUMENT"
                r2.<init>(r0)
                java.lang.String r0 = "*/*"
                android.content.Intent r2 = r2.setType(r0)
                java.lang.String r0 = "android.intent.extra.TITLE"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                if (r3 == 0) goto Lb
                r0 = -1
                if (r2 == r0) goto L6
                goto Lb
            L6:
                android.net.Uri r2 = r3.getData()
                return r2
            Lb:
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static class GetContent extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, android.net.Uri> {
        public GetContent() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.GET_CONTENT"
                r2.<init>(r0)
                java.lang.String r0 = "android.intent.category.OPENABLE"
                android.content.Intent r2 = r2.addCategory(r0)
                android.content.Intent r2 = r2.setType(r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                if (r3 == 0) goto Lb
                r0 = -1
                if (r2 == r0) goto L6
                goto Lb
            L6:
                android.net.Uri r2 = r3.getData()
                return r2
            Lb:
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static class GetMultipleContents extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.util.List<android.net.Uri>> {
        public GetMultipleContents() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.List<android.net.Uri> getClipDataUris(android.content.Intent r3) {
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                android.net.Uri r1 = r3.getData()
                if (r1 == 0) goto L12
                android.net.Uri r1 = r3.getData()
                r0.add(r1)
            L12:
                android.content.ClipData r3 = r3.getClipData()
                if (r3 != 0) goto L23
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L23
                java.util.List r3 = java.util.Collections.emptyList()
                return r3
            L23:
                if (r3 == 0) goto L3c
                r1 = 0
            L26:
                int r2 = r3.getItemCount()
                if (r1 >= r2) goto L3c
                android.content.ClipData$Item r2 = r3.getItemAt(r1)
                android.net.Uri r2 = r2.getUri()
                if (r2 == 0) goto L39
                r0.add(r2)
            L39:
                int r1 = r1 + 1
                goto L26
            L3c:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r0)
                return r3
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.GET_CONTENT"
                r2.<init>(r0)
                java.lang.String r0 = "android.intent.category.OPENABLE"
                android.content.Intent r2 = r2.addCategory(r0)
                android.content.Intent r2 = r2.setType(r3)
                java.lang.String r3 = "android.intent.extra.ALLOW_MULTIPLE"
                r0 = 1
                android.content.Intent r2 = r2.putExtra(r3, r0)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult2(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.List<android.net.Uri> parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.util.List r1 = r0.parseResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: parseResult, reason: avoid collision after fix types in other method */
        public final java.util.List<android.net.Uri> parseResult2(int r2, android.content.Intent r3) {
                r1 = this;
                if (r3 == 0) goto Lb
                r0 = -1
                if (r2 == r0) goto L6
                goto Lb
            L6:
                java.util.List r2 = getClipDataUris(r3)
                return r2
            Lb:
                java.util.List r2 = java.util.Collections.emptyList()
                return r2
        }
    }

    public static class OpenDocument extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], android.net.Uri> {
        public OpenDocument() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
                r2.<init>(r0)
                java.lang.String r0 = "android.intent.extra.MIME_TYPES"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "*/*"
                android.content.Intent r2 = r2.setType(r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                if (r3 == 0) goto Lb
                r0 = -1
                if (r2 == r0) goto L6
                goto Lb
            L6:
                android.net.Uri r2 = r3.getData()
                return r2
            Lb:
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static class OpenDocumentTree extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, android.net.Uri> {
        public OpenDocumentTree() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r3, android.net.Uri r4) {
                r2 = this;
                android.content.Intent r3 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT_TREE"
                r3.<init>(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto L14
                if (r4 == 0) goto L14
                java.lang.String r0 = "android.provider.extra.INITIAL_URI"
                r3.putExtra(r0, r4)
            L14:
                return r3
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                if (r3 == 0) goto Lb
                r0 = -1
                if (r2 == r0) goto L6
                goto Lb
            L6:
                android.net.Uri r2 = r3.getData()
                return r2
            Lb:
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static class OpenMultipleDocuments extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], java.util.List<android.net.Uri>> {
        public OpenMultipleDocuments() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
                r2.<init>(r0)
                java.lang.String r0 = "android.intent.extra.MIME_TYPES"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "android.intent.extra.ALLOW_MULTIPLE"
                r0 = 1
                android.content.Intent r2 = r2.putExtra(r3, r0)
                java.lang.String r3 = "*/*"
                android.content.Intent r2 = r2.setType(r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult2(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.List<android.net.Uri> parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.util.List r1 = r0.parseResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: parseResult, reason: avoid collision after fix types in other method */
        public final java.util.List<android.net.Uri> parseResult2(int r2, android.content.Intent r3) {
                r1 = this;
                r0 = -1
                if (r2 != r0) goto Lb
                if (r3 != 0) goto L6
                goto Lb
            L6:
                java.util.List r2 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.getClipDataUris(r3)
                return r2
            Lb:
                java.util.List r2 = java.util.Collections.emptyList()
                return r2
        }
    }

    public static final class PickContact extends androidx.activity.result.contract.ActivityResultContract<java.lang.Void, android.net.Uri> {
        public PickContact() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "android.intent.action.PICK"
                r1.<init>(r2)
                java.lang.String r2 = "vnd.android.cursor.dir/contact"
                android.content.Intent r1 = r1.setType(r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.net.Uri parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                if (r3 == 0) goto Lb
                r0 = -1
                if (r2 == r0) goto L6
                goto Lb
            L6:
                android.net.Uri r2 = r3.getData()
                return r2
            Lb:
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static final class RequestMultiplePermissions extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], java.util.Map<java.lang.String, java.lang.Boolean>> {
        public static final java.lang.String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        public static final java.lang.String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final java.lang.String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        public RequestMultiplePermissions() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.Intent createIntent(java.lang.String[] r2) {
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
                r0.<init>(r1)
                java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSIONS"
                android.content.Intent r2 = r0.putExtra(r1, r2)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                android.content.Intent r1 = createIntent(r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.Map<java.lang.String, java.lang.Boolean>> getSynchronousResult(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.Map<java.lang.String, java.lang.Boolean>> getSynchronousResult2(android.content.Context r10, java.lang.String[] r11) {
                r9 = this;
                if (r11 == 0) goto L34
                int r0 = r11.length
                if (r0 != 0) goto L6
                goto L34
            L6:
                androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                r0.<init>()
                int r1 = r11.length
                r2 = 0
                r3 = 1
                r4 = r2
                r5 = r3
            L10:
                if (r4 >= r1) goto L2a
                r6 = r11[r4]
                int r7 = androidx.core.content.ContextCompat.checkSelfPermission(r10, r6)
                if (r7 != 0) goto L1c
                r7 = r3
                goto L1d
            L1c:
                r7 = r2
            L1d:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
                r0.put(r6, r8)
                if (r7 != 0) goto L27
                r5 = r2
            L27:
                int r4 = r4 + 1
                goto L10
            L2a:
                if (r5 == 0) goto L32
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r10 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                r10.<init>(r0)
                return r10
            L32:
                r10 = 0
                return r10
            L34:
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r10 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                java.util.Map r11 = java.util.Collections.emptyMap()
                r10.<init>(r11)
                return r10
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.Map<java.lang.String, java.lang.Boolean> parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.util.Map r1 = r0.parseResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: parseResult, reason: avoid collision after fix types in other method */
        public java.util.Map<java.lang.String, java.lang.Boolean> parseResult2(int r7, android.content.Intent r8) {
                r6 = this;
                r0 = -1
                if (r7 == r0) goto L8
                java.util.Map r7 = java.util.Collections.emptyMap()
                return r7
            L8:
                if (r8 != 0) goto Lf
                java.util.Map r7 = java.util.Collections.emptyMap()
                return r7
            Lf:
                java.lang.String r7 = "androidx.activity.result.contract.extra.PERMISSIONS"
                java.lang.String[] r7 = r8.getStringArrayExtra(r7)
                java.lang.String r0 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
                int[] r8 = r8.getIntArrayExtra(r0)
                if (r8 == 0) goto L3e
                if (r7 != 0) goto L20
                goto L3e
            L20:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                int r1 = r7.length
                r2 = 0
                r3 = r2
            L28:
                if (r3 >= r1) goto L3d
                r4 = r7[r3]
                r5 = r8[r3]
                if (r5 != 0) goto L32
                r5 = 1
                goto L33
            L32:
                r5 = r2
            L33:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r0.put(r4, r5)
                int r3 = r3 + 1
                goto L28
            L3d:
                return r0
            L3e:
                java.util.Map r7 = java.util.Collections.emptyMap()
                return r7
        }
    }

    public static final class RequestPermission extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.lang.Boolean> {
        public RequestPermission() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r2 = 1
                java.lang.String[] r2 = new java.lang.String[r2]
                r0 = 0
                r2[r0] = r3
                android.content.Intent r2 = androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.createIntent(r2)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult2(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                if (r2 != 0) goto Ld
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                r2 = 0
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r1.<init>(r2)
                return r1
            Ld:
                int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r2)
                if (r1 != 0) goto L1e
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                r2 = 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r1.<init>(r2)
                return r1
            L1e:
                r1 = 0
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public java.lang.Boolean parseResult(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = 0
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                if (r5 == 0) goto L21
                r2 = -1
                if (r4 == r2) goto Lb
                goto L21
            Lb:
                java.lang.String r4 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
                int[] r4 = r5.getIntArrayExtra(r4)
                if (r4 == 0) goto L21
                int r5 = r4.length
                if (r5 != 0) goto L17
                goto L21
            L17:
                r4 = r4[r0]
                if (r4 != 0) goto L1c
                r0 = 1
            L1c:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
                return r4
            L21:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.lang.Boolean parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.lang.Boolean r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static final class StartActivityForResult extends androidx.activity.result.contract.ActivityResultContract<android.content.Intent, androidx.activity.result.ActivityResult> {
        public static final java.lang.String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        public StartActivityForResult() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                android.content.Intent r2 = (android.content.Intent) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                androidx.activity.result.ActivityResult r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static final class StartIntentSenderForResult extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> {
        public static final java.lang.String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final java.lang.String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final java.lang.String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        public StartIntentSenderForResult() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, androidx.activity.result.IntentSenderRequest r3) {
                r1 = this;
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r2.<init>(r0)
                java.lang.String r0 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, androidx.activity.result.IntentSenderRequest r2) {
                r0 = this;
                androidx.activity.result.IntentSenderRequest r2 = (androidx.activity.result.IntentSenderRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                androidx.activity.result.ActivityResult r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static class TakePicture extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, java.lang.Boolean> {
        public TakePicture() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
                r2.<init>(r0)
                java.lang.String r0 = "output"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult2(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final java.lang.Boolean parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                r2 = -1
                if (r1 != r2) goto L5
                r1 = 1
                goto L6
            L5:
                r1 = 0
            L6:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.lang.Boolean parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.lang.Boolean r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static class TakePicturePreview extends androidx.activity.result.contract.ActivityResultContract<java.lang.Void, android.graphics.Bitmap> {
        public TakePicturePreview() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "android.media.action.IMAGE_CAPTURE"
                r1.<init>(r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult2(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.graphics.Bitmap parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                if (r3 == 0) goto Lf
                r0 = -1
                if (r2 == r0) goto L6
                goto Lf
            L6:
                java.lang.String r2 = "data"
                android.os.Parcelable r2 = r3.getParcelableExtra(r2)
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.graphics.Bitmap parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.graphics.Bitmap r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static class TakeVideo extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, android.graphics.Bitmap> {
        public TakeVideo() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.media.action.VIDEO_CAPTURE"
                r2.<init>(r0)
                java.lang.String r0 = "output"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult2(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.graphics.Bitmap parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                if (r3 == 0) goto Lf
                r0 = -1
                if (r2 == r0) goto L6
                goto Lf
            L6:
                java.lang.String r2 = "data"
                android.os.Parcelable r2 = r3.getParcelableExtra(r2)
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.graphics.Bitmap parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.graphics.Bitmap r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    private ActivityResultContracts() {
            r0 = this;
            r0.<init>()
            return
    }
}
