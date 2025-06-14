package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParsingException extends java.lang.Exception {
    private final java.lang.String mElementClass;
    private final int mLineNumber;
    private final java.lang.String mReason;

    public CLParsingException(java.lang.String r1, androidx.constraintlayout.core.parser.CLElement r2) {
            r0 = this;
            r0.<init>()
            r0.mReason = r1
            if (r2 == 0) goto L14
            java.lang.String r1 = r2.getStrClass()
            r0.mElementClass = r1
            int r1 = r2.getLine()
            r0.mLineNumber = r1
            goto L1b
        L14:
            java.lang.String r1 = "unknown"
            r0.mElementClass = r1
            r1 = 0
            r0.mLineNumber = r1
        L1b:
            return
    }

    public java.lang.String reason() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.mReason
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " ("
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.mElementClass
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " at line "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.mLineNumber
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CLParsingException ("
            r0.<init>(r1)
            int r1 = r2.hashCode()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ") : "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.reason()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
