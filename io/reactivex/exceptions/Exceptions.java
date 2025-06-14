package io.reactivex.exceptions;

/* loaded from: classes.dex */
public final class Exceptions {
    private Exceptions() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.RuntimeException propagate(java.lang.Throwable r0) {
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r0
    }

    public static void throwIfFatal(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof java.lang.VirtualMachineError
            if (r0 != 0) goto L13
            boolean r0 = r1 instanceof java.lang.ThreadDeath
            if (r0 != 0) goto L10
            boolean r0 = r1 instanceof java.lang.LinkageError
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.LinkageError r1 = (java.lang.LinkageError) r1
            throw r1
        L10:
            java.lang.ThreadDeath r1 = (java.lang.ThreadDeath) r1
            throw r1
        L13:
            java.lang.VirtualMachineError r1 = (java.lang.VirtualMachineError) r1
            throw r1
    }
}
