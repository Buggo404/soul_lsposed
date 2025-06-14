package androidx.customview.view;

/* loaded from: classes.dex */
public abstract class AbsSavedState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.customview.view.AbsSavedState> CREATOR = null;
    public static final androidx.customview.view.AbsSavedState EMPTY_STATE = null;
    private final android.os.Parcelable mSuperState;



    static {
            androidx.customview.view.AbsSavedState$1 r0 = new androidx.customview.view.AbsSavedState$1
            r0.<init>()
            androidx.customview.view.AbsSavedState.EMPTY_STATE = r0
            androidx.customview.view.AbsSavedState$2 r0 = new androidx.customview.view.AbsSavedState$2
            r0.<init>()
            androidx.customview.view.AbsSavedState.CREATOR = r0
            return
    }

    private AbsSavedState() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mSuperState = r0
            return
    }

    protected AbsSavedState(android.os.Parcel r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    protected AbsSavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            if (r1 == 0) goto La
            goto Lc
        La:
            androidx.customview.view.AbsSavedState r1 = androidx.customview.view.AbsSavedState.EMPTY_STATE
        Lc:
            r0.mSuperState = r1
            return
    }

    protected AbsSavedState(android.os.Parcelable r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Le
            androidx.customview.view.AbsSavedState r0 = androidx.customview.view.AbsSavedState.EMPTY_STATE
            if (r2 == r0) goto La
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.mSuperState = r2
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "superState must not be null"
            r2.<init>(r0)
            throw r2
    }

    /* synthetic */ AbsSavedState(androidx.customview.view.AbsSavedState.C02221 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final android.os.Parcelable getSuperState() {
            r1 = this;
            android.os.Parcelable r0 = r1.mSuperState
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            android.os.Parcelable r0 = r1.mSuperState
            r2.writeParcelable(r0, r3)
            return
    }
}
