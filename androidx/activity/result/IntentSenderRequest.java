package androidx.activity.result;

/* loaded from: classes.dex */
public final class IntentSenderRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.IntentSenderRequest> CREATOR = null;
    private final android.content.Intent mFillInIntent;
    private final int mFlagsMask;
    private final int mFlagsValues;
    private final android.content.IntentSender mIntentSender;


    public static final class Builder {
        private android.content.Intent mFillInIntent;
        private int mFlagsMask;
        private int mFlagsValues;
        private android.content.IntentSender mIntentSender;

        public Builder(android.app.PendingIntent r1) {
                r0 = this;
                android.content.IntentSender r1 = r1.getIntentSender()
                r0.<init>(r1)
                return
        }

        public Builder(android.content.IntentSender r1) {
                r0 = this;
                r0.<init>()
                r0.mIntentSender = r1
                return
        }

        public androidx.activity.result.IntentSenderRequest build() {
                r5 = this;
                androidx.activity.result.IntentSenderRequest r0 = new androidx.activity.result.IntentSenderRequest
                android.content.IntentSender r1 = r5.mIntentSender
                android.content.Intent r2 = r5.mFillInIntent
                int r3 = r5.mFlagsMask
                int r4 = r5.mFlagsValues
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public androidx.activity.result.IntentSenderRequest.Builder setFillInIntent(android.content.Intent r1) {
                r0 = this;
                r0.mFillInIntent = r1
                return r0
        }

        public androidx.activity.result.IntentSenderRequest.Builder setFlags(int r1, int r2) {
                r0 = this;
                r0.mFlagsValues = r1
                r0.mFlagsMask = r2
                return r0
        }
    }

    static {
            androidx.activity.result.IntentSenderRequest$1 r0 = new androidx.activity.result.IntentSenderRequest$1
            r0.<init>()
            androidx.activity.result.IntentSenderRequest.CREATOR = r0
            return
    }

    IntentSenderRequest(android.content.IntentSender r1, android.content.Intent r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.mIntentSender = r1
            r0.mFillInIntent = r2
            r0.mFlagsMask = r3
            r0.mFlagsValues = r4
            return
    }

    IntentSenderRequest(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            r1.mIntentSender = r0
            java.lang.Class<android.content.Intent> r0 = android.content.Intent.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r1.mFillInIntent = r0
            int r0 = r2.readInt()
            r1.mFlagsMask = r0
            int r2 = r2.readInt()
            r1.mFlagsValues = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.content.Intent getFillInIntent() {
            r1 = this;
            android.content.Intent r0 = r1.mFillInIntent
            return r0
    }

    public int getFlagsMask() {
            r1 = this;
            int r0 = r1.mFlagsMask
            return r0
    }

    public int getFlagsValues() {
            r1 = this;
            int r0 = r1.mFlagsValues
            return r0
    }

    public android.content.IntentSender getIntentSender() {
            r1 = this;
            android.content.IntentSender r0 = r1.mIntentSender
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            android.content.IntentSender r0 = r1.mIntentSender
            r2.writeParcelable(r0, r3)
            android.content.Intent r0 = r1.mFillInIntent
            r2.writeParcelable(r0, r3)
            int r3 = r1.mFlagsMask
            r2.writeInt(r3)
            int r3 = r1.mFlagsValues
            r2.writeInt(r3)
            return
    }
}
