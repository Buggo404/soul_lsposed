package androidx.core.app;

/* loaded from: classes.dex */
public final class RemoteInput {
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    private static final java.lang.String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
    public static final java.lang.String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    private static final java.lang.String EXTRA_RESULTS_SOURCE = "android.remoteinput.resultsSource";
    public static final java.lang.String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;
    private static final java.lang.String TAG = "RemoteInput";
    private final boolean mAllowFreeFormTextInput;
    private final java.util.Set<java.lang.String> mAllowedDataTypes;
    private final java.lang.CharSequence[] mChoices;
    private final int mEditChoicesBeforeSending;
    private final android.os.Bundle mExtras;
    private final java.lang.CharSequence mLabel;
    private final java.lang.String mResultKey;

    public static final class Builder {
        private boolean mAllowFreeFormTextInput;
        private final java.util.Set<java.lang.String> mAllowedDataTypes;
        private java.lang.CharSequence[] mChoices;
        private int mEditChoicesBeforeSending;
        private final android.os.Bundle mExtras;
        private java.lang.CharSequence mLabel;
        private final java.lang.String mResultKey;

        public Builder(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mAllowedDataTypes = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.mExtras = r0
                r0 = 1
                r1.mAllowFreeFormTextInput = r0
                r0 = 0
                r1.mEditChoicesBeforeSending = r0
                if (r2 == 0) goto L1c
                r1.mResultKey = r2
                return
            L1c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Result key can't be null"
                r2.<init>(r0)
                throw r2
        }

        public androidx.core.app.RemoteInput.Builder addExtras(android.os.Bundle r2) {
                r1 = this;
                if (r2 == 0) goto L7
                android.os.Bundle r0 = r1.mExtras
                r0.putAll(r2)
            L7:
                return r1
        }

        public androidx.core.app.RemoteInput build() {
                r9 = this;
                androidx.core.app.RemoteInput r8 = new androidx.core.app.RemoteInput
                java.lang.String r1 = r9.mResultKey
                java.lang.CharSequence r2 = r9.mLabel
                java.lang.CharSequence[] r3 = r9.mChoices
                boolean r4 = r9.mAllowFreeFormTextInput
                int r5 = r9.mEditChoicesBeforeSending
                android.os.Bundle r6 = r9.mExtras
                java.util.Set<java.lang.String> r7 = r9.mAllowedDataTypes
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setAllowDataType(java.lang.String r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L8
                java.util.Set<java.lang.String> r2 = r0.mAllowedDataTypes
                r2.add(r1)
                goto Ld
            L8:
                java.util.Set<java.lang.String> r2 = r0.mAllowedDataTypes
                r2.remove(r1)
            Ld:
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setAllowFreeFormInput(boolean r1) {
                r0 = this;
                r0.mAllowFreeFormTextInput = r1
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setChoices(java.lang.CharSequence[] r1) {
                r0 = this;
                r0.mChoices = r1
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setEditChoicesBeforeSending(int r1) {
                r0 = this;
                r0.mEditChoicesBeforeSending = r1
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setLabel(java.lang.CharSequence r1) {
                r0 = this;
                r0.mLabel = r1
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Source {
    }

    RemoteInput(java.lang.String r1, java.lang.CharSequence r2, java.lang.CharSequence[] r3, boolean r4, int r5, android.os.Bundle r6, java.util.Set<java.lang.String> r7) {
            r0 = this;
            r0.<init>()
            r0.mResultKey = r1
            r0.mLabel = r2
            r0.mChoices = r3
            r0.mAllowFreeFormTextInput = r4
            r0.mEditChoicesBeforeSending = r5
            r0.mExtras = r6
            r0.mAllowedDataTypes = r7
            int r1 = r0.getEditChoicesBeforeSending()
            r2 = 2
            if (r1 != r2) goto L27
            boolean r1 = r0.getAllowFreeFormInput()
            if (r1 == 0) goto L1f
            goto L27
        L1f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "setEditChoicesBeforeSending requires setAllowFreeFormInput"
            r1.<init>(r2)
            throw r1
        L27:
            return
    }

    public static void addDataResultToIntent(androidx.core.app.RemoteInput r5, android.content.Intent r6, java.util.Map<java.lang.String, android.net.Uri> r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Le
            android.app.RemoteInput r5 = fromCompat(r5)
            android.app.RemoteInput.addDataResultToIntent(r5, r6, r7)
            goto L67
        Le:
            android.content.Intent r0 = getClipDataIntentFromIntent(r6)
            if (r0 != 0) goto L19
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
        L19:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L21:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            android.net.Uri r1 = (android.net.Uri) r1
            if (r2 != 0) goto L3c
            goto L21
        L3c:
            java.lang.String r3 = getExtraResultsKeyForData(r2)
            android.os.Bundle r3 = r0.getBundleExtra(r3)
            if (r3 != 0) goto L4b
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        L4b:
            java.lang.String r4 = r5.getResultKey()
            java.lang.String r1 = r1.toString()
            r3.putString(r4, r1)
            java.lang.String r1 = getExtraResultsKeyForData(r2)
            r0.putExtra(r1, r3)
            goto L21
        L5e:
            java.lang.String r5 = "android.remoteinput.results"
            android.content.ClipData r5 = android.content.ClipData.newIntent(r5, r0)
            r6.setClipData(r5)
        L67:
            return
    }

    public static void addResultsToIntent(androidx.core.app.RemoteInput[] r7, android.content.Intent r8, android.os.Bundle r9) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Le
            android.app.RemoteInput[] r7 = fromCompat(r7)
            android.app.RemoteInput.addResultsToIntent(r7, r8, r9)
            goto L43
        Le:
            android.os.Bundle r0 = getResultsFromIntent(r8)
            int r1 = getResultsSource(r8)
            if (r0 != 0) goto L19
            goto L1d
        L19:
            r0.putAll(r9)
            r9 = r0
        L1d:
            int r0 = r7.length
            r2 = 0
            r3 = r2
        L20:
            if (r3 >= r0) goto L40
            r4 = r7[r3]
            java.lang.String r5 = r4.getResultKey()
            java.util.Map r5 = getDataResultsFromIntent(r8, r5)
            r6 = 1
            androidx.core.app.RemoteInput[] r6 = new androidx.core.app.RemoteInput[r6]
            r6[r2] = r4
            android.app.RemoteInput[] r6 = fromCompat(r6)
            android.app.RemoteInput.addResultsToIntent(r6, r8, r9)
            if (r5 == 0) goto L3d
            addDataResultToIntent(r4, r8, r5)
        L3d:
            int r3 = r3 + 1
            goto L20
        L40:
            setResultsSource(r8, r1)
        L43:
            return
    }

    static android.app.RemoteInput fromCompat(androidx.core.app.RemoteInput r3) {
            android.app.RemoteInput$Builder r0 = new android.app.RemoteInput$Builder
            java.lang.String r1 = r3.getResultKey()
            r0.<init>(r1)
            java.lang.CharSequence r1 = r3.getLabel()
            android.app.RemoteInput$Builder r0 = r0.setLabel(r1)
            java.lang.CharSequence[] r1 = r3.getChoices()
            android.app.RemoteInput$Builder r0 = r0.setChoices(r1)
            boolean r1 = r3.getAllowFreeFormInput()
            android.app.RemoteInput$Builder r0 = r0.setAllowFreeFormInput(r1)
            android.os.Bundle r1 = r3.getExtras()
            android.app.RemoteInput$Builder r0 = r0.addExtras(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L36
            int r3 = r3.getEditChoicesBeforeSending()
            r0.setEditChoicesBeforeSending(r3)
        L36:
            android.app.RemoteInput r3 = r0.build()
            return r3
    }

    static android.app.RemoteInput[] fromCompat(androidx.core.app.RemoteInput[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            android.app.RemoteInput[] r0 = new android.app.RemoteInput[r0]
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            android.app.RemoteInput r2 = fromCompat(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L16:
            return r0
    }

    static androidx.core.app.RemoteInput fromPlatform(android.app.RemoteInput r3) {
            androidx.core.app.RemoteInput$Builder r0 = new androidx.core.app.RemoteInput$Builder
            java.lang.String r1 = r3.getResultKey()
            r0.<init>(r1)
            java.lang.CharSequence r1 = r3.getLabel()
            androidx.core.app.RemoteInput$Builder r0 = r0.setLabel(r1)
            java.lang.CharSequence[] r1 = r3.getChoices()
            androidx.core.app.RemoteInput$Builder r0 = r0.setChoices(r1)
            boolean r1 = r3.getAllowFreeFormInput()
            androidx.core.app.RemoteInput$Builder r0 = r0.setAllowFreeFormInput(r1)
            android.os.Bundle r1 = r3.getExtras()
            androidx.core.app.RemoteInput$Builder r0 = r0.addExtras(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L36
            int r3 = r3.getEditChoicesBeforeSending()
            r0.setEditChoicesBeforeSending(r3)
        L36:
            androidx.core.app.RemoteInput r3 = r0.build()
            return r3
    }

    private static android.content.Intent getClipDataIntentFromIntent(android.content.Intent r3) {
            android.content.ClipData r3 = r3.getClipData()
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            android.content.ClipDescription r1 = r3.getDescription()
            java.lang.String r2 = "text/vnd.android.intent"
            boolean r2 = r1.hasMimeType(r2)
            if (r2 != 0) goto L15
            return r0
        L15:
            java.lang.CharSequence r1 = r1.getLabel()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "android.remoteinput.results"
            boolean r1 = r1.contentEquals(r2)
            if (r1 != 0) goto L26
            return r0
        L26:
            r0 = 0
            android.content.ClipData$Item r3 = r3.getItemAt(r0)
            android.content.Intent r3 = r3.getIntent()
            return r3
    }

    public static java.util.Map<java.lang.String, android.net.Uri> getDataResultsFromIntent(android.content.Intent r6, java.lang.String r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            java.util.Map r6 = android.app.RemoteInput.getDataResultsFromIntent(r6, r7)
            return r6
        Lb:
            android.content.Intent r6 = getClipDataIntentFromIntent(r6)
            r0 = 0
            if (r6 != 0) goto L13
            return r0
        L13:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.os.Bundle r2 = r6.getExtras()
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "android.remoteinput.dataTypeResultsData"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L24
            r4 = 39
            java.lang.String r4 = r3.substring(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L45
            goto L24
        L45:
            android.os.Bundle r3 = r6.getBundleExtra(r3)
            java.lang.String r3 = r3.getString(r7)
            if (r3 == 0) goto L24
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L56
            goto L24
        L56:
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r1.put(r4, r3)
            goto L24
        L5e:
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L65
            goto L66
        L65:
            r0 = r1
        L66:
            return r0
    }

    private static java.lang.String getExtraResultsKeyForData(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "android.remoteinput.dataTypeResultsData"
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static android.os.Bundle getResultsFromIntent(android.content.Intent r0) {
            android.os.Bundle r0 = android.app.RemoteInput.getResultsFromIntent(r0)
            return r0
    }

    public static int getResultsSource(android.content.Intent r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = android.app.RemoteInput.getResultsSource(r2)
            return r2
        Lb:
            android.content.Intent r2 = getClipDataIntentFromIntent(r2)
            r0 = 0
            if (r2 != 0) goto L13
            return r0
        L13:
            android.os.Bundle r2 = r2.getExtras()
            java.lang.String r1 = "android.remoteinput.resultsSource"
            int r2 = r2.getInt(r1, r0)
            return r2
    }

    public static void setResultsSource(android.content.Intent r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            android.app.RemoteInput.setResultsSource(r2, r3)
            goto L23
        La:
            android.content.Intent r0 = getClipDataIntentFromIntent(r2)
            if (r0 != 0) goto L15
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
        L15:
            java.lang.String r1 = "android.remoteinput.resultsSource"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "android.remoteinput.results"
            android.content.ClipData r3 = android.content.ClipData.newIntent(r3, r0)
            r2.setClipData(r3)
        L23:
            return
    }

    public boolean getAllowFreeFormInput() {
            r1 = this;
            boolean r0 = r1.mAllowFreeFormTextInput
            return r0
    }

    public java.util.Set<java.lang.String> getAllowedDataTypes() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.mAllowedDataTypes
            return r0
    }

    public java.lang.CharSequence[] getChoices() {
            r1 = this;
            java.lang.CharSequence[] r0 = r1.mChoices
            return r0
    }

    public int getEditChoicesBeforeSending() {
            r1 = this;
            int r0 = r1.mEditChoicesBeforeSending
            return r0
    }

    public android.os.Bundle getExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.mExtras
            return r0
    }

    public java.lang.CharSequence getLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mLabel
            return r0
    }

    public java.lang.String getResultKey() {
            r1 = this;
            java.lang.String r0 = r1.mResultKey
            return r0
    }

    public boolean isDataOnly() {
            r1 = this;
            boolean r0 = r1.getAllowFreeFormInput()
            if (r0 != 0) goto L25
            java.lang.CharSequence[] r0 = r1.getChoices()
            if (r0 == 0) goto L13
            java.lang.CharSequence[] r0 = r1.getChoices()
            int r0 = r0.length
            if (r0 != 0) goto L25
        L13:
            java.util.Set r0 = r1.getAllowedDataTypes()
            if (r0 == 0) goto L25
            java.util.Set r0 = r1.getAllowedDataTypes()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }
}
