package okhttp3.internal.connection;

/* loaded from: classes.dex */
public final class RouteException extends java.lang.RuntimeException {
    private java.io.IOException firstException;
    private java.io.IOException lastException;

    RouteException(java.io.IOException r1) {
            r0 = this;
            r0.<init>(r1)
            r0.firstException = r1
            r0.lastException = r1
            return
    }

    void addConnectException(java.io.IOException r2) {
            r1 = this;
            java.io.IOException r0 = r1.firstException
            okhttp3.internal.Util.addSuppressedIfPossible(r0, r2)
            r1.lastException = r2
            return
    }

    public java.io.IOException getFirstConnectException() {
            r1 = this;
            java.io.IOException r0 = r1.firstException
            return r0
    }

    public java.io.IOException getLastConnectException() {
            r1 = this;
            java.io.IOException r0 = r1.lastException
            return r0
    }
}
