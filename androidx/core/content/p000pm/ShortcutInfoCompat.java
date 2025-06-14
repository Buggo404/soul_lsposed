package androidx.core.content.p000pm;

/* loaded from: classes.dex */
public class ShortcutInfoCompat {
    private static final java.lang.String EXTRA_LOCUS_ID = "extraLocusId";
    private static final java.lang.String EXTRA_LONG_LIVED = "extraLongLived";
    private static final java.lang.String EXTRA_PERSON_ = "extraPerson_";
    private static final java.lang.String EXTRA_PERSON_COUNT = "extraPersonCount";
    android.content.ComponentName mActivity;
    java.util.Set<java.lang.String> mCategories;
    android.content.Context mContext;
    java.lang.CharSequence mDisabledMessage;
    int mDisabledReason;
    android.os.PersistableBundle mExtras;
    boolean mHasKeyFieldsOnly;
    androidx.core.graphics.drawable.IconCompat mIcon;
    java.lang.String mId;
    android.content.Intent[] mIntents;
    boolean mIsAlwaysBadged;
    boolean mIsCached;
    boolean mIsDeclaredInManifest;
    boolean mIsDynamic;
    boolean mIsEnabled;
    boolean mIsImmutable;
    boolean mIsLongLived;
    boolean mIsPinned;
    java.lang.CharSequence mLabel;
    long mLastChangedTimestamp;
    androidx.core.content.LocusIdCompat mLocusId;
    java.lang.CharSequence mLongLabel;
    java.lang.String mPackageName;
    androidx.core.app.Person[] mPersons;
    int mRank;
    android.os.UserHandle mUser;

    public static class Builder {
        private final androidx.core.content.p000pm.ShortcutInfoCompat mInfo;
        private boolean mIsConversation;

        public Builder(android.content.Context r4, android.content.pm.ShortcutInfo r5) {
                r3 = this;
                r3.<init>()
                androidx.core.content.pm.ShortcutInfoCompat r0 = new androidx.core.content.pm.ShortcutInfoCompat
                r0.<init>()
                r3.mInfo = r0
                r0.mContext = r4
                java.lang.String r4 = r5.getId()
                r0.mId = r4
                java.lang.String r4 = r5.getPackage()
                r0.mPackageName = r4
                android.content.Intent[] r4 = r5.getIntents()
                int r1 = r4.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
                android.content.Intent[] r4 = (android.content.Intent[]) r4
                r0.mIntents = r4
                android.content.ComponentName r4 = r5.getActivity()
                r0.mActivity = r4
                java.lang.CharSequence r4 = r5.getShortLabel()
                r0.mLabel = r4
                java.lang.CharSequence r4 = r5.getLongLabel()
                r0.mLongLabel = r4
                java.lang.CharSequence r4 = r5.getDisabledMessage()
                r0.mDisabledMessage = r4
                int r4 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r4 < r1) goto L4a
                int r4 = r5.getDisabledReason()
                r0.mDisabledReason = r4
                goto L55
            L4a:
                boolean r4 = r5.isEnabled()
                if (r4 == 0) goto L52
                r4 = 0
                goto L53
            L52:
                r4 = 3
            L53:
                r0.mDisabledReason = r4
            L55:
                java.util.Set r4 = r5.getCategories()
                r0.mCategories = r4
                android.os.PersistableBundle r4 = r5.getExtras()
                androidx.core.app.Person[] r4 = androidx.core.content.p000pm.ShortcutInfoCompat.getPersonsFromExtra(r4)
                r0.mPersons = r4
                android.os.UserHandle r4 = r5.getUserHandle()
                r0.mUser = r4
                long r1 = r5.getLastChangedTimestamp()
                r0.mLastChangedTimestamp = r1
                int r4 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r4 < r1) goto L7d
                boolean r4 = r5.isCached()
                r0.mIsCached = r4
            L7d:
                boolean r4 = r5.isDynamic()
                r0.mIsDynamic = r4
                boolean r4 = r5.isPinned()
                r0.mIsPinned = r4
                boolean r4 = r5.isDeclaredInManifest()
                r0.mIsDeclaredInManifest = r4
                boolean r4 = r5.isImmutable()
                r0.mIsImmutable = r4
                boolean r4 = r5.isEnabled()
                r0.mIsEnabled = r4
                boolean r4 = r5.hasKeyFieldsOnly()
                r0.mHasKeyFieldsOnly = r4
                androidx.core.content.LocusIdCompat r4 = androidx.core.content.p000pm.ShortcutInfoCompat.getLocusId(r5)
                r0.mLocusId = r4
                int r4 = r5.getRank()
                r0.mRank = r4
                android.os.PersistableBundle r4 = r5.getExtras()
                r0.mExtras = r4
                return
        }

        public Builder(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                androidx.core.content.pm.ShortcutInfoCompat r0 = new androidx.core.content.pm.ShortcutInfoCompat
                r0.<init>()
                r1.mInfo = r0
                r0.mContext = r2
                r0.mId = r3
                return
        }

        public Builder(androidx.core.content.p000pm.ShortcutInfoCompat r4) {
                r3 = this;
                r3.<init>()
                androidx.core.content.pm.ShortcutInfoCompat r0 = new androidx.core.content.pm.ShortcutInfoCompat
                r0.<init>()
                r3.mInfo = r0
                android.content.Context r1 = r4.mContext
                r0.mContext = r1
                java.lang.String r1 = r4.mId
                r0.mId = r1
                java.lang.String r1 = r4.mPackageName
                r0.mPackageName = r1
                android.content.Intent[] r1 = r4.mIntents
                android.content.Intent[] r2 = r4.mIntents
                int r2 = r2.length
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
                android.content.Intent[] r1 = (android.content.Intent[]) r1
                r0.mIntents = r1
                android.content.ComponentName r1 = r4.mActivity
                r0.mActivity = r1
                java.lang.CharSequence r1 = r4.mLabel
                r0.mLabel = r1
                java.lang.CharSequence r1 = r4.mLongLabel
                r0.mLongLabel = r1
                java.lang.CharSequence r1 = r4.mDisabledMessage
                r0.mDisabledMessage = r1
                int r1 = r4.mDisabledReason
                r0.mDisabledReason = r1
                androidx.core.graphics.drawable.IconCompat r1 = r4.mIcon
                r0.mIcon = r1
                boolean r1 = r4.mIsAlwaysBadged
                r0.mIsAlwaysBadged = r1
                android.os.UserHandle r1 = r4.mUser
                r0.mUser = r1
                long r1 = r4.mLastChangedTimestamp
                r0.mLastChangedTimestamp = r1
                boolean r1 = r4.mIsCached
                r0.mIsCached = r1
                boolean r1 = r4.mIsDynamic
                r0.mIsDynamic = r1
                boolean r1 = r4.mIsPinned
                r0.mIsPinned = r1
                boolean r1 = r4.mIsDeclaredInManifest
                r0.mIsDeclaredInManifest = r1
                boolean r1 = r4.mIsImmutable
                r0.mIsImmutable = r1
                boolean r1 = r4.mIsEnabled
                r0.mIsEnabled = r1
                androidx.core.content.LocusIdCompat r1 = r4.mLocusId
                r0.mLocusId = r1
                boolean r1 = r4.mIsLongLived
                r0.mIsLongLived = r1
                boolean r1 = r4.mHasKeyFieldsOnly
                r0.mHasKeyFieldsOnly = r1
                int r1 = r4.mRank
                r0.mRank = r1
                androidx.core.app.Person[] r1 = r4.mPersons
                if (r1 == 0) goto L80
                androidx.core.app.Person[] r1 = r4.mPersons
                androidx.core.app.Person[] r2 = r4.mPersons
                int r2 = r2.length
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
                androidx.core.app.Person[] r1 = (androidx.core.app.Person[]) r1
                r0.mPersons = r1
            L80:
                java.util.Set<java.lang.String> r1 = r4.mCategories
                if (r1 == 0) goto L8d
                java.util.HashSet r1 = new java.util.HashSet
                java.util.Set<java.lang.String> r2 = r4.mCategories
                r1.<init>(r2)
                r0.mCategories = r1
            L8d:
                android.os.PersistableBundle r1 = r4.mExtras
                if (r1 == 0) goto L95
                android.os.PersistableBundle r4 = r4.mExtras
                r0.mExtras = r4
            L95:
                return
        }

        public androidx.core.content.p000pm.ShortcutInfoCompat build() {
                r3 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                java.lang.CharSequence r0 = r0.mLabel
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L3e
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                android.content.Intent[] r0 = r0.mIntents
                if (r0 == 0) goto L36
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                android.content.Intent[] r0 = r0.mIntents
                int r0 = r0.length
                if (r0 == 0) goto L36
                boolean r0 = r3.mIsConversation
                if (r0 == 0) goto L33
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                androidx.core.content.LocusIdCompat r0 = r0.mLocusId
                if (r0 != 0) goto L2e
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                androidx.core.content.LocusIdCompat r1 = new androidx.core.content.LocusIdCompat
                androidx.core.content.pm.ShortcutInfoCompat r2 = r3.mInfo
                java.lang.String r2 = r2.mId
                r1.<init>(r2)
                r0.mLocusId = r1
            L2e:
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                r1 = 1
                r0.mIsLongLived = r1
            L33:
                androidx.core.content.pm.ShortcutInfoCompat r0 = r3.mInfo
                return r0
            L36:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Shortcut must have an intent"
                r0.<init>(r1)
                throw r0
            L3e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Shortcut must have a non-empty label"
                r0.<init>(r1)
                throw r0
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setActivity(android.content.ComponentName r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mActivity = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setAlwaysBadged() {
                r2 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r2.mInfo
                r1 = 1
                r0.mIsAlwaysBadged = r1
                return r2
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setCategories(java.util.Set<java.lang.String> r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mCategories = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setDisabledMessage(java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mDisabledMessage = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setExtras(android.os.PersistableBundle r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mExtras = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIcon(androidx.core.graphics.drawable.IconCompat r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mIcon = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIntent(android.content.Intent r3) {
                r2 = this;
                r0 = 1
                android.content.Intent[] r0 = new android.content.Intent[r0]
                r1 = 0
                r0[r1] = r3
                androidx.core.content.pm.ShortcutInfoCompat$Builder r3 = r2.setIntents(r0)
                return r3
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIntents(android.content.Intent[] r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mIntents = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIsConversation() {
                r1 = this;
                r0 = 1
                r1.mIsConversation = r0
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLocusId(androidx.core.content.LocusIdCompat r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mLocusId = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLabel(java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mLongLabel = r2
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLived() {
                r2 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r2.mInfo
                r1 = 1
                r0.mIsLongLived = r1
                return r2
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLived(boolean r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mIsLongLived = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setPerson(androidx.core.app.Person r3) {
                r2 = this;
                r0 = 1
                androidx.core.app.Person[] r0 = new androidx.core.app.Person[r0]
                r1 = 0
                r0[r1] = r3
                androidx.core.content.pm.ShortcutInfoCompat$Builder r3 = r2.setPersons(r0)
                return r3
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setPersons(androidx.core.app.Person[] r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mPersons = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setRank(int r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mRank = r2
                return r1
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setShortLabel(java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mLabel = r2
                return r1
        }
    }

    ShortcutInfoCompat() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mIsEnabled = r0
            return
    }

    private android.os.PersistableBundle buildLegacyExtrasBundle() {
            r5 = this;
            android.os.PersistableBundle r0 = r5.mExtras
            if (r0 != 0) goto Lb
            android.os.PersistableBundle r0 = new android.os.PersistableBundle
            r0.<init>()
            r5.mExtras = r0
        Lb:
            androidx.core.app.Person[] r0 = r5.mPersons
            if (r0 == 0) goto L40
            int r1 = r0.length
            if (r1 <= 0) goto L40
            android.os.PersistableBundle r1 = r5.mExtras
            java.lang.String r2 = "extraPersonCount"
            int r0 = r0.length
            r1.putInt(r2, r0)
            r0 = 0
        L1b:
            androidx.core.app.Person[] r1 = r5.mPersons
            int r1 = r1.length
            if (r0 >= r1) goto L40
            android.os.PersistableBundle r1 = r5.mExtras
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "extraPerson_"
            r2.<init>(r3)
            int r3 = r0 + 1
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            androidx.core.app.Person[] r4 = r5.mPersons
            r0 = r4[r0]
            android.os.PersistableBundle r0 = r0.toPersistableBundle()
            r1.putPersistableBundle(r2, r0)
            r0 = r3
            goto L1b
        L40:
            androidx.core.content.LocusIdCompat r0 = r5.mLocusId
            if (r0 == 0) goto L4f
            android.os.PersistableBundle r1 = r5.mExtras
            java.lang.String r2 = "extraLocusId"
            java.lang.String r0 = r0.getId()
            r1.putString(r2, r0)
        L4f:
            android.os.PersistableBundle r0 = r5.mExtras
            java.lang.String r1 = "extraLongLived"
            boolean r2 = r5.mIsLongLived
            r0.putBoolean(r1, r2)
            android.os.PersistableBundle r0 = r5.mExtras
            return r0
    }

    static java.util.List<androidx.core.content.p000pm.ShortcutInfoCompat> fromShortcuts(android.content.Context r3, java.util.List<android.content.pm.ShortcutInfo> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r4.next()
            android.content.pm.ShortcutInfo r1 = (android.content.pm.ShortcutInfo) r1
            androidx.core.content.pm.ShortcutInfoCompat$Builder r2 = new androidx.core.content.pm.ShortcutInfoCompat$Builder
            r2.<init>(r3, r1)
            androidx.core.content.pm.ShortcutInfoCompat r1 = r2.build()
            r0.add(r1)
            goto Ld
        L26:
            return r0
    }

    static androidx.core.content.LocusIdCompat getLocusId(android.content.pm.ShortcutInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L17
            android.content.LocusId r0 = r2.getLocusId()
            if (r0 != 0) goto Le
            r2 = 0
            return r2
        Le:
            android.content.LocusId r2 = r2.getLocusId()
            androidx.core.content.LocusIdCompat r2 = androidx.core.content.LocusIdCompat.toLocusIdCompat(r2)
            return r2
        L17:
            android.os.PersistableBundle r2 = r2.getExtras()
            androidx.core.content.LocusIdCompat r2 = getLocusIdFromExtra(r2)
            return r2
    }

    private static androidx.core.content.LocusIdCompat getLocusIdFromExtra(android.os.PersistableBundle r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "extraLocusId"
            java.lang.String r2 = r2.getString(r1)
            if (r2 != 0) goto Ld
            goto L12
        Ld:
            androidx.core.content.LocusIdCompat r0 = new androidx.core.content.LocusIdCompat
            r0.<init>(r2)
        L12:
            return r0
    }

    static boolean getLongLivedFromExtra(android.os.PersistableBundle r2) {
            if (r2 == 0) goto L10
            java.lang.String r0 = "extraLongLived"
            boolean r1 = r2.containsKey(r0)
            if (r1 != 0) goto Lb
            goto L10
        Lb:
            boolean r2 = r2.getBoolean(r0)
            return r2
        L10:
            r2 = 0
            return r2
    }

    static androidx.core.app.Person[] getPersonsFromExtra(android.os.PersistableBundle r5) {
            if (r5 == 0) goto L32
            java.lang.String r0 = "extraPersonCount"
            boolean r1 = r5.containsKey(r0)
            if (r1 != 0) goto Lb
            goto L32
        Lb:
            int r0 = r5.getInt(r0)
            androidx.core.app.Person[] r1 = new androidx.core.app.Person[r0]
            r2 = 0
        L12:
            if (r2 >= r0) goto L31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "extraPerson_"
            r3.<init>(r4)
            int r4 = r2 + 1
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.os.PersistableBundle r3 = r5.getPersistableBundle(r3)
            androidx.core.app.Person r3 = androidx.core.app.Person.fromPersistableBundle(r3)
            r1[r2] = r3
            r2 = r4
            goto L12
        L31:
            return r1
        L32:
            r5 = 0
            return r5
    }

    android.content.Intent addToIntent(android.content.Intent r4) {
            r3 = this;
            android.content.Intent[] r0 = r3.mIntents
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            java.lang.String r1 = "android.intent.extra.shortcut.INTENT"
            android.content.Intent r0 = r4.putExtra(r1, r0)
            java.lang.CharSequence r1 = r3.mLabel
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "android.intent.extra.shortcut.NAME"
            r0.putExtra(r2, r1)
            androidx.core.graphics.drawable.IconCompat r0 = r3.mIcon
            if (r0 == 0) goto L42
            boolean r0 = r3.mIsAlwaysBadged
            r1 = 0
            if (r0 == 0) goto L3b
            android.content.Context r0 = r3.mContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r2 = r3.mActivity
            if (r2 == 0) goto L2f
            android.graphics.drawable.Drawable r1 = r0.getActivityIcon(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
        L2f:
            if (r1 != 0) goto L3b
            android.content.Context r1 = r3.mContext
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            android.graphics.drawable.Drawable r1 = r1.loadIcon(r0)
        L3b:
            androidx.core.graphics.drawable.IconCompat r0 = r3.mIcon
            android.content.Context r2 = r3.mContext
            r0.addToShortcutIntent(r4, r1, r2)
        L42:
            return r4
    }

    public android.content.ComponentName getActivity() {
            r1 = this;
            android.content.ComponentName r0 = r1.mActivity
            return r0
    }

    public java.util.Set<java.lang.String> getCategories() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.mCategories
            return r0
    }

    public java.lang.CharSequence getDisabledMessage() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mDisabledMessage
            return r0
    }

    public int getDisabledReason() {
            r1 = this;
            int r0 = r1.mDisabledReason
            return r0
    }

    public android.os.PersistableBundle getExtras() {
            r1 = this;
            android.os.PersistableBundle r0 = r1.mExtras
            return r0
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
            r1 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r1.mIcon
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mId
            return r0
    }

    public android.content.Intent getIntent() {
            r2 = this;
            android.content.Intent[] r0 = r2.mIntents
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    public android.content.Intent[] getIntents() {
            r2 = this;
            android.content.Intent[] r0 = r2.mIntents
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            return r0
    }

    public long getLastChangedTimestamp() {
            r2 = this;
            long r0 = r2.mLastChangedTimestamp
            return r0
    }

    public androidx.core.content.LocusIdCompat getLocusId() {
            r1 = this;
            androidx.core.content.LocusIdCompat r0 = r1.mLocusId
            return r0
    }

    public java.lang.CharSequence getLongLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mLongLabel
            return r0
    }

    public java.lang.String getPackage() {
            r1 = this;
            java.lang.String r0 = r1.mPackageName
            return r0
    }

    public int getRank() {
            r1 = this;
            int r0 = r1.mRank
            return r0
    }

    public java.lang.CharSequence getShortLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mLabel
            return r0
    }

    public android.os.UserHandle getUserHandle() {
            r1 = this;
            android.os.UserHandle r0 = r1.mUser
            return r0
    }

    public boolean hasKeyFieldsOnly() {
            r1 = this;
            boolean r0 = r1.mHasKeyFieldsOnly
            return r0
    }

    public boolean isCached() {
            r1 = this;
            boolean r0 = r1.mIsCached
            return r0
    }

    public boolean isDeclaredInManifest() {
            r1 = this;
            boolean r0 = r1.mIsDeclaredInManifest
            return r0
    }

    public boolean isDynamic() {
            r1 = this;
            boolean r0 = r1.mIsDynamic
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mIsEnabled
            return r0
    }

    public boolean isImmutable() {
            r1 = this;
            boolean r0 = r1.mIsImmutable
            return r0
    }

    public boolean isPinned() {
            r1 = this;
            boolean r0 = r1.mIsPinned
            return r0
    }

    public android.content.pm.ShortcutInfo toShortcutInfo() {
            r5 = this;
            android.content.pm.ShortcutInfo$Builder r0 = new android.content.pm.ShortcutInfo$Builder
            android.content.Context r1 = r5.mContext
            java.lang.String r2 = r5.mId
            r0.<init>(r1, r2)
            java.lang.CharSequence r1 = r5.mLabel
            android.content.pm.ShortcutInfo$Builder r0 = r0.setShortLabel(r1)
            android.content.Intent[] r1 = r5.mIntents
            android.content.pm.ShortcutInfo$Builder r0 = r0.setIntents(r1)
            androidx.core.graphics.drawable.IconCompat r1 = r5.mIcon
            if (r1 == 0) goto L22
            android.content.Context r2 = r5.mContext
            android.graphics.drawable.Icon r1 = r1.toIcon(r2)
            r0.setIcon(r1)
        L22:
            java.lang.CharSequence r1 = r5.mLongLabel
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2f
            java.lang.CharSequence r1 = r5.mLongLabel
            r0.setLongLabel(r1)
        L2f:
            java.lang.CharSequence r1 = r5.mDisabledMessage
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3c
            java.lang.CharSequence r1 = r5.mDisabledMessage
            r0.setDisabledMessage(r1)
        L3c:
            android.content.ComponentName r1 = r5.mActivity
            if (r1 == 0) goto L43
            r0.setActivity(r1)
        L43:
            java.util.Set<java.lang.String> r1 = r5.mCategories
            if (r1 == 0) goto L4a
            r0.setCategories(r1)
        L4a:
            int r1 = r5.mRank
            r0.setRank(r1)
            android.os.PersistableBundle r1 = r5.mExtras
            if (r1 == 0) goto L56
            r0.setExtras(r1)
        L56:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L8a
            androidx.core.app.Person[] r1 = r5.mPersons
            if (r1 == 0) goto L79
            int r2 = r1.length
            if (r2 <= 0) goto L79
            int r1 = r1.length
            android.app.Person[] r2 = new android.app.Person[r1]
            r3 = 0
        L67:
            if (r3 >= r1) goto L76
            androidx.core.app.Person[] r4 = r5.mPersons
            r4 = r4[r3]
            android.app.Person r4 = r4.toAndroidPerson()
            r2[r3] = r4
            int r3 = r3 + 1
            goto L67
        L76:
            r0.setPersons(r2)
        L79:
            androidx.core.content.LocusIdCompat r1 = r5.mLocusId
            if (r1 == 0) goto L84
            android.content.LocusId r1 = r1.toLocusId()
            r0.setLocusId(r1)
        L84:
            boolean r1 = r5.mIsLongLived
            r0.setLongLived(r1)
            goto L91
        L8a:
            android.os.PersistableBundle r1 = r5.buildLegacyExtrasBundle()
            r0.setExtras(r1)
        L91:
            android.content.pm.ShortcutInfo r0 = r0.build()
            return r0
    }
}
