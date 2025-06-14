package androidx.core.app;

/* loaded from: classes.dex */
public final class ShareCompat {
    public static final java.lang.String EXTRA_CALLING_ACTIVITY = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final java.lang.String EXTRA_CALLING_ACTIVITY_INTEROP = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final java.lang.String EXTRA_CALLING_PACKAGE = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final java.lang.String EXTRA_CALLING_PACKAGE_INTEROP = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    private static final java.lang.String HISTORY_FILENAME_PREFIX = ".sharecompat_";

    private static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void migrateExtraStreamToClipData(android.content.Intent r8, java.util.ArrayList<android.net.Uri> r9) {
                java.lang.String r0 = "android.intent.extra.TEXT"
                java.lang.CharSequence r0 = r8.getCharSequenceExtra(r0)
                java.lang.String r1 = "android.intent.extra.HTML_TEXT"
                java.lang.String r1 = r8.getStringExtra(r1)
                android.content.ClipData r2 = new android.content.ClipData
                r3 = 1
                java.lang.String[] r4 = new java.lang.String[r3]
                java.lang.String r5 = r8.getType()
                r6 = 0
                r4[r6] = r5
                android.content.ClipData$Item r5 = new android.content.ClipData$Item
                java.lang.Object r6 = r9.get(r6)
                android.net.Uri r6 = (android.net.Uri) r6
                r7 = 0
                r5.<init>(r0, r1, r7, r6)
                r2.<init>(r7, r4, r5)
                int r0 = r9.size()
                r1 = r3
            L2c:
                if (r1 >= r0) goto L3f
                java.lang.Object r4 = r9.get(r1)
                android.net.Uri r4 = (android.net.Uri) r4
                android.content.ClipData$Item r5 = new android.content.ClipData$Item
                r5.<init>(r4)
                r2.addItem(r5)
                int r1 = r1 + 1
                goto L2c
            L3f:
                r8.setClipData(r2)
                r8.addFlags(r3)
                return
        }

        static void removeClipData(android.content.Intent r1) {
                r0 = 0
                r1.setClipData(r0)
                int r0 = r1.getFlags()
                r0 = r0 & (-2)
                r1.setFlags(r0)
                return
        }
    }

    public static class IntentBuilder {
        private java.util.ArrayList<java.lang.String> mBccAddresses;
        private java.util.ArrayList<java.lang.String> mCcAddresses;
        private java.lang.CharSequence mChooserTitle;
        private final android.content.Context mContext;
        private final android.content.Intent mIntent;
        private java.util.ArrayList<android.net.Uri> mStreams;
        private java.util.ArrayList<java.lang.String> mToAddresses;

        public IntentBuilder(android.content.Context r4) {
                r3 = this;
                r3.<init>()
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r4)
                android.content.Context r0 = (android.content.Context) r0
                r3.mContext = r0
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "android.intent.action.SEND"
                android.content.Intent r0 = r0.setAction(r1)
                r3.mIntent = r0
                java.lang.String r1 = "androidx.core.app.EXTRA_CALLING_PACKAGE"
                java.lang.String r2 = r4.getPackageName()
                r0.putExtra(r1, r2)
                java.lang.String r1 = "android.support.v4.app.EXTRA_CALLING_PACKAGE"
                java.lang.String r2 = r4.getPackageName()
                r0.putExtra(r1, r2)
                r1 = 524288(0x80000, float:7.34684E-40)
                r0.addFlags(r1)
            L2f:
                boolean r0 = r4 instanceof android.content.ContextWrapper
                if (r0 == 0) goto L41
                boolean r0 = r4 instanceof android.app.Activity
                if (r0 == 0) goto L3a
                android.app.Activity r4 = (android.app.Activity) r4
                goto L42
            L3a:
                android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
                android.content.Context r4 = r4.getBaseContext()
                goto L2f
            L41:
                r4 = 0
            L42:
                if (r4 == 0) goto L56
                android.content.ComponentName r4 = r4.getComponentName()
                android.content.Intent r0 = r3.mIntent
                java.lang.String r1 = "androidx.core.app.EXTRA_CALLING_ACTIVITY"
                r0.putExtra(r1, r4)
                android.content.Intent r0 = r3.mIntent
                java.lang.String r1 = "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
                r0.putExtra(r1, r4)
            L56:
                return
        }

        private void combineArrayExtra(java.lang.String r5, java.util.ArrayList<java.lang.String> r6) {
                r4 = this;
                android.content.Intent r0 = r4.mIntent
                java.lang.String[] r0 = r0.getStringArrayExtra(r5)
                r1 = 0
                if (r0 == 0) goto Lb
                int r2 = r0.length
                goto Lc
            Lb:
                r2 = r1
            Lc:
                int r3 = r6.size()
                int r3 = r3 + r2
                java.lang.String[] r3 = new java.lang.String[r3]
                r6.toArray(r3)
                if (r0 == 0) goto L1f
                int r6 = r6.size()
                java.lang.System.arraycopy(r0, r1, r3, r6, r2)
            L1f:
                android.content.Intent r6 = r4.mIntent
                r6.putExtra(r5, r3)
                return
        }

        private void combineArrayExtra(java.lang.String r6, java.lang.String[] r7) {
                r5 = this;
                android.content.Intent r0 = r5.getIntent()
                java.lang.String[] r1 = r0.getStringArrayExtra(r6)
                r2 = 0
                if (r1 == 0) goto Ld
                int r3 = r1.length
                goto Le
            Ld:
                r3 = r2
            Le:
                int r4 = r7.length
                int r4 = r4 + r3
                java.lang.String[] r4 = new java.lang.String[r4]
                if (r1 == 0) goto L17
                java.lang.System.arraycopy(r1, r2, r4, r2, r3)
            L17:
                int r1 = r7.length
                java.lang.System.arraycopy(r7, r2, r4, r3, r1)
                r0.putExtra(r6, r4)
                return
        }

        @java.lang.Deprecated
        public static androidx.core.app.ShareCompat.IntentBuilder from(android.app.Activity r1) {
                androidx.core.app.ShareCompat$IntentBuilder r0 = new androidx.core.app.ShareCompat$IntentBuilder
                r0.<init>(r1)
                return r0
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailBcc(java.lang.String r2) {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.mBccAddresses
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mBccAddresses = r0
            Lb:
                java.util.ArrayList<java.lang.String> r0 = r1.mBccAddresses
                r0.add(r2)
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailBcc(java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "android.intent.extra.BCC"
                r1.combineArrayExtra(r0, r2)
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailCc(java.lang.String r2) {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.mCcAddresses
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCcAddresses = r0
            Lb:
                java.util.ArrayList<java.lang.String> r0 = r1.mCcAddresses
                r0.add(r2)
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailCc(java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "android.intent.extra.CC"
                r1.combineArrayExtra(r0, r2)
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailTo(java.lang.String r2) {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.mToAddresses
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mToAddresses = r0
            Lb:
                java.util.ArrayList<java.lang.String> r0 = r1.mToAddresses
                r0.add(r2)
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailTo(java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "android.intent.extra.EMAIL"
                r1.combineArrayExtra(r0, r2)
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder addStream(android.net.Uri r2) {
                r1 = this;
                java.util.ArrayList<android.net.Uri> r0 = r1.mStreams
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mStreams = r0
            Lb:
                java.util.ArrayList<android.net.Uri> r0 = r1.mStreams
                r0.add(r2)
                return r1
        }

        public android.content.Intent createChooserIntent() {
                r2 = this;
                android.content.Intent r0 = r2.getIntent()
                java.lang.CharSequence r1 = r2.mChooserTitle
                android.content.Intent r0 = android.content.Intent.createChooser(r0, r1)
                return r0
        }

        android.content.Context getContext() {
                r1 = this;
                android.content.Context r0 = r1.mContext
                return r0
        }

        public android.content.Intent getIntent() {
                r4 = this;
                java.util.ArrayList<java.lang.String> r0 = r4.mToAddresses
                r1 = 0
                if (r0 == 0) goto Lc
                java.lang.String r2 = "android.intent.extra.EMAIL"
                r4.combineArrayExtra(r2, r0)
                r4.mToAddresses = r1
            Lc:
                java.util.ArrayList<java.lang.String> r0 = r4.mCcAddresses
                if (r0 == 0) goto L17
                java.lang.String r2 = "android.intent.extra.CC"
                r4.combineArrayExtra(r2, r0)
                r4.mCcAddresses = r1
            L17:
                java.util.ArrayList<java.lang.String> r0 = r4.mBccAddresses
                if (r0 == 0) goto L22
                java.lang.String r2 = "android.intent.extra.BCC"
                r4.combineArrayExtra(r2, r0)
                r4.mBccAddresses = r1
            L22:
                java.util.ArrayList<android.net.Uri> r0 = r4.mStreams
                r1 = 0
                if (r0 == 0) goto L2f
                int r0 = r0.size()
                r2 = 1
                if (r0 <= r2) goto L2f
                goto L30
            L2f:
                r2 = r1
            L30:
                java.lang.String r0 = "android.intent.extra.STREAM"
                if (r2 != 0) goto L65
                android.content.Intent r2 = r4.mIntent
                java.lang.String r3 = "android.intent.action.SEND"
                r2.setAction(r3)
                java.util.ArrayList<android.net.Uri> r2 = r4.mStreams
                if (r2 == 0) goto L5a
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L5a
                android.content.Intent r2 = r4.mIntent
                java.util.ArrayList<android.net.Uri> r3 = r4.mStreams
                java.lang.Object r1 = r3.get(r1)
                android.os.Parcelable r1 = (android.os.Parcelable) r1
                r2.putExtra(r0, r1)
                android.content.Intent r0 = r4.mIntent
                java.util.ArrayList<android.net.Uri> r1 = r4.mStreams
                androidx.core.app.ShareCompat.Api16Impl.migrateExtraStreamToClipData(r0, r1)
                goto L7a
            L5a:
                android.content.Intent r1 = r4.mIntent
                r1.removeExtra(r0)
                android.content.Intent r0 = r4.mIntent
                androidx.core.app.ShareCompat.Api16Impl.removeClipData(r0)
                goto L7a
            L65:
                android.content.Intent r1 = r4.mIntent
                java.lang.String r2 = "android.intent.action.SEND_MULTIPLE"
                r1.setAction(r2)
                android.content.Intent r1 = r4.mIntent
                java.util.ArrayList<android.net.Uri> r2 = r4.mStreams
                r1.putParcelableArrayListExtra(r0, r2)
                android.content.Intent r0 = r4.mIntent
                java.util.ArrayList<android.net.Uri> r1 = r4.mStreams
                androidx.core.app.ShareCompat.Api16Impl.migrateExtraStreamToClipData(r0, r1)
            L7a:
                android.content.Intent r0 = r4.mIntent
                return r0
        }

        public androidx.core.app.ShareCompat.IntentBuilder setChooserTitle(int r2) {
                r1 = this;
                android.content.Context r0 = r1.mContext
                java.lang.CharSequence r2 = r0.getText(r2)
                androidx.core.app.ShareCompat$IntentBuilder r2 = r1.setChooserTitle(r2)
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setChooserTitle(java.lang.CharSequence r1) {
                r0 = this;
                r0.mChooserTitle = r1
                return r0
        }

        public androidx.core.app.ShareCompat.IntentBuilder setEmailBcc(java.lang.String[] r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.BCC"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setEmailCc(java.lang.String[] r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.CC"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setEmailTo(java.lang.String[] r3) {
                r2 = this;
                java.util.ArrayList<java.lang.String> r0 = r2.mToAddresses
                if (r0 == 0) goto L7
                r0 = 0
                r2.mToAddresses = r0
            L7:
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.EMAIL"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setHtmlText(java.lang.String r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.HTML_TEXT"
                r0.putExtra(r1, r3)
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.TEXT"
                boolean r0 = r0.hasExtra(r1)
                if (r0 != 0) goto L18
                android.text.Spanned r3 = android.text.Html.fromHtml(r3)
                r2.setText(r3)
            L18:
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setStream(android.net.Uri r2) {
                r1 = this;
                r0 = 0
                r1.mStreams = r0
                if (r2 == 0) goto L8
                r1.addStream(r2)
            L8:
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder setSubject(java.lang.String r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.SUBJECT"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setText(java.lang.CharSequence r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.TEXT"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setType(java.lang.String r2) {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                r0.setType(r2)
                return r1
        }

        public void startChooser() {
                r2 = this;
                android.content.Context r0 = r2.mContext
                android.content.Intent r1 = r2.createChooserIntent()
                r0.startActivity(r1)
                return
        }
    }

    public static class IntentReader {
        private static final java.lang.String TAG = "IntentReader";
        private final android.content.ComponentName mCallingActivity;
        private final java.lang.String mCallingPackage;
        private final android.content.Context mContext;
        private final android.content.Intent mIntent;
        private java.util.ArrayList<android.net.Uri> mStreams;

        public IntentReader(android.app.Activity r2) {
                r1 = this;
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r2)
                android.content.Context r0 = (android.content.Context) r0
                android.content.Intent r2 = r2.getIntent()
                r1.<init>(r0, r2)
                return
        }

        public IntentReader(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
                android.content.Context r1 = (android.content.Context) r1
                r0.mContext = r1
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r2)
                android.content.Intent r1 = (android.content.Intent) r1
                r0.mIntent = r1
                java.lang.String r1 = androidx.core.app.ShareCompat.getCallingPackage(r2)
                r0.mCallingPackage = r1
                android.content.ComponentName r1 = androidx.core.app.ShareCompat.getCallingActivity(r2)
                r0.mCallingActivity = r1
                return
        }

        @java.lang.Deprecated
        public static androidx.core.app.ShareCompat.IntentReader from(android.app.Activity r1) {
                androidx.core.app.ShareCompat$IntentReader r0 = new androidx.core.app.ShareCompat$IntentReader
                r0.<init>(r1)
                return r0
        }

        private static void withinStyle(java.lang.StringBuilder r3, java.lang.CharSequence r4, int r5, int r6) {
            L0:
                if (r5 >= r6) goto L5a
                char r0 = r4.charAt(r5)
                r1 = 60
                if (r0 != r1) goto L10
                java.lang.String r0 = "&lt;"
                r3.append(r0)
                goto L57
            L10:
                r1 = 62
                if (r0 != r1) goto L1a
                java.lang.String r0 = "&gt;"
                r3.append(r0)
                goto L57
            L1a:
                r1 = 38
                if (r0 != r1) goto L24
                java.lang.String r0 = "&amp;"
                r3.append(r0)
                goto L57
            L24:
                r1 = 126(0x7e, float:1.77E-43)
                if (r0 > r1) goto L48
                r1 = 32
                if (r0 >= r1) goto L2d
                goto L48
            L2d:
                if (r0 != r1) goto L44
            L2f:
                int r0 = r5 + 1
                if (r0 >= r6) goto L40
                char r2 = r4.charAt(r0)
                if (r2 != r1) goto L40
                java.lang.String r5 = "&nbsp;"
                r3.append(r5)
                r5 = r0
                goto L2f
            L40:
                r3.append(r1)
                goto L57
            L44:
                r3.append(r0)
                goto L57
            L48:
                java.lang.String r1 = "&#"
                java.lang.StringBuilder r1 = r3.append(r1)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r1 = ";"
                r0.append(r1)
            L57:
                int r5 = r5 + 1
                goto L0
            L5a:
                return
        }

        public android.content.ComponentName getCallingActivity() {
                r1 = this;
                android.content.ComponentName r0 = r1.mCallingActivity
                return r0
        }

        public android.graphics.drawable.Drawable getCallingActivityIcon() {
                r4 = this;
                android.content.ComponentName r0 = r4.mCallingActivity
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.content.Context r0 = r4.mContext
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                android.content.ComponentName r2 = r4.mCallingActivity     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
                android.graphics.drawable.Drawable r0 = r0.getActivityIcon(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
                return r0
            L13:
                r0 = move-exception
                java.lang.String r2 = "IntentReader"
                java.lang.String r3 = "Could not retrieve icon for calling activity"
                android.util.Log.e(r2, r3, r0)
                return r1
        }

        public android.graphics.drawable.Drawable getCallingApplicationIcon() {
                r4 = this;
                java.lang.String r0 = r4.mCallingPackage
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.content.Context r0 = r4.mContext
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                java.lang.String r2 = r4.mCallingPackage     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
                android.graphics.drawable.Drawable r0 = r0.getApplicationIcon(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
                return r0
            L13:
                r0 = move-exception
                java.lang.String r2 = "IntentReader"
                java.lang.String r3 = "Could not retrieve icon for calling application"
                android.util.Log.e(r2, r3, r0)
                return r1
        }

        public java.lang.CharSequence getCallingApplicationLabel() {
                r4 = this;
                java.lang.String r0 = r4.mCallingPackage
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.content.Context r0 = r4.mContext
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                java.lang.String r2 = r4.mCallingPackage     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
                r3 = 0
                android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
                java.lang.CharSequence r0 = r0.getApplicationLabel(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
                return r0
            L18:
                r0 = move-exception
                java.lang.String r2 = "IntentReader"
                java.lang.String r3 = "Could not retrieve label for calling application"
                android.util.Log.e(r2, r3, r0)
                return r1
        }

        public java.lang.String getCallingPackage() {
                r1 = this;
                java.lang.String r0 = r1.mCallingPackage
                return r0
        }

        public java.lang.String[] getEmailBcc() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.BCC"
                java.lang.String[] r0 = r0.getStringArrayExtra(r1)
                return r0
        }

        public java.lang.String[] getEmailCc() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.CC"
                java.lang.String[] r0 = r0.getStringArrayExtra(r1)
                return r0
        }

        public java.lang.String[] getEmailTo() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.EMAIL"
                java.lang.String[] r0 = r0.getStringArrayExtra(r1)
                return r0
        }

        public java.lang.String getHtmlText() {
                r3 = this;
                android.content.Intent r0 = r3.mIntent
                java.lang.String r1 = "android.intent.extra.HTML_TEXT"
                java.lang.String r0 = r0.getStringExtra(r1)
                if (r0 != 0) goto L1f
                java.lang.CharSequence r1 = r3.getText()
                boolean r2 = r1 instanceof android.text.Spanned
                if (r2 == 0) goto L19
                android.text.Spanned r1 = (android.text.Spanned) r1
                java.lang.String r0 = android.text.Html.toHtml(r1)
                goto L1f
            L19:
                if (r1 == 0) goto L1f
                java.lang.String r0 = android.text.Html.escapeHtml(r1)
            L1f:
                return r0
        }

        public android.net.Uri getStream() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.STREAM"
                android.os.Parcelable r0 = r0.getParcelableExtra(r1)
                android.net.Uri r0 = (android.net.Uri) r0
                return r0
        }

        public android.net.Uri getStream(int r4) {
                r3 = this;
                java.util.ArrayList<android.net.Uri> r0 = r3.mStreams
                java.lang.String r1 = "android.intent.extra.STREAM"
                if (r0 != 0) goto L14
                boolean r0 = r3.isMultipleShare()
                if (r0 == 0) goto L14
                android.content.Intent r0 = r3.mIntent
                java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r1)
                r3.mStreams = r0
            L14:
                java.util.ArrayList<android.net.Uri> r0 = r3.mStreams
                if (r0 == 0) goto L1f
                java.lang.Object r4 = r0.get(r4)
                android.net.Uri r4 = (android.net.Uri) r4
                return r4
            L1f:
                if (r4 != 0) goto L2a
                android.content.Intent r4 = r3.mIntent
                android.os.Parcelable r4 = r4.getParcelableExtra(r1)
                android.net.Uri r4 = (android.net.Uri) r4
                return r4
            L2a:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Stream items available: "
                r1.<init>(r2)
                int r2 = r3.getStreamCount()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " index requested: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        public int getStreamCount() {
                r2 = this;
                java.util.ArrayList<android.net.Uri> r0 = r2.mStreams
                java.lang.String r1 = "android.intent.extra.STREAM"
                if (r0 != 0) goto L14
                boolean r0 = r2.isMultipleShare()
                if (r0 == 0) goto L14
                android.content.Intent r0 = r2.mIntent
                java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r1)
                r2.mStreams = r0
            L14:
                java.util.ArrayList<android.net.Uri> r0 = r2.mStreams
                if (r0 == 0) goto L1d
                int r0 = r0.size()
                return r0
            L1d:
                android.content.Intent r0 = r2.mIntent
                boolean r0 = r0.hasExtra(r1)
                return r0
        }

        public java.lang.String getSubject() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.SUBJECT"
                java.lang.String r0 = r0.getStringExtra(r1)
                return r0
        }

        public java.lang.CharSequence getText() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.TEXT"
                java.lang.CharSequence r0 = r0.getCharSequenceExtra(r1)
                return r0
        }

        public java.lang.String getType() {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                java.lang.String r0 = r0.getType()
                return r0
        }

        public boolean isMultipleShare() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r0 = r0.getAction()
                java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
                boolean r0 = r1.equals(r0)
                return r0
        }

        public boolean isShareIntent() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r0 = r0.getAction()
                java.lang.String r1 = "android.intent.action.SEND"
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L19
                java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L17
                goto L19
            L17:
                r0 = 0
                goto L1a
            L19:
                r0 = 1
            L1a:
                return r0
        }

        public boolean isSingleShare() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r0 = r0.getAction()
                java.lang.String r1 = "android.intent.action.SEND"
                boolean r0 = r1.equals(r0)
                return r0
        }
    }

    private ShareCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void configureMenuItem(android.view.Menu r1, int r2, androidx.core.app.ShareCompat.IntentBuilder r3) {
            android.view.MenuItem r1 = r1.findItem(r2)
            if (r1 == 0) goto La
            configureMenuItem(r1, r3)
            return
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find menu item with id "
            r3.<init>(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = " in the supplied menu"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @java.lang.Deprecated
    public static void configureMenuItem(android.view.MenuItem r3, androidx.core.app.ShareCompat.IntentBuilder r4) {
            android.view.ActionProvider r0 = r3.getActionProvider()
            boolean r1 = r0 instanceof android.widget.ShareActionProvider
            if (r1 != 0) goto L12
            android.widget.ShareActionProvider r0 = new android.widget.ShareActionProvider
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            goto L14
        L12:
            android.widget.ShareActionProvider r0 = (android.widget.ShareActionProvider) r0
        L14:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".sharecompat_"
            r1.<init>(r2)
            android.content.Context r2 = r4.getContext()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setShareHistoryFileName(r1)
            android.content.Intent r4 = r4.getIntent()
            r0.setShareIntent(r4)
            r3.setActionProvider(r0)
            return
    }

    public static android.content.ComponentName getCallingActivity(android.app.Activity r1) {
            android.content.Intent r0 = r1.getIntent()
            android.content.ComponentName r1 = r1.getCallingActivity()
            if (r1 != 0) goto Le
            android.content.ComponentName r1 = getCallingActivity(r0)
        Le:
            return r1
    }

    static android.content.ComponentName getCallingActivity(android.content.Intent r1) {
            java.lang.String r0 = "androidx.core.app.EXTRA_CALLING_ACTIVITY"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            android.content.ComponentName r0 = (android.content.ComponentName) r0
            if (r0 != 0) goto L13
            java.lang.String r0 = "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
            android.os.Parcelable r1 = r1.getParcelableExtra(r0)
            r0 = r1
            android.content.ComponentName r0 = (android.content.ComponentName) r0
        L13:
            return r0
    }

    public static java.lang.String getCallingPackage(android.app.Activity r1) {
            android.content.Intent r0 = r1.getIntent()
            java.lang.String r1 = r1.getCallingPackage()
            if (r1 != 0) goto L10
            if (r0 == 0) goto L10
            java.lang.String r1 = getCallingPackage(r0)
        L10:
            return r1
    }

    static java.lang.String getCallingPackage(android.content.Intent r1) {
            java.lang.String r0 = "androidx.core.app.EXTRA_CALLING_PACKAGE"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto Le
            java.lang.String r0 = "android.support.v4.app.EXTRA_CALLING_PACKAGE"
            java.lang.String r0 = r1.getStringExtra(r0)
        Le:
            return r0
    }
}
