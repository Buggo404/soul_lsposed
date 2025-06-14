package io.reactivex.disposables;

/* loaded from: classes.dex */
final class ActionDisposable extends io.reactivex.disposables.ReferenceDisposable<io.reactivex.functions.Action> {
    private static final long serialVersionUID = -8219729196779211169L;

    ActionDisposable(io.reactivex.functions.Action r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: onDisposed, reason: avoid collision after fix types in other method */
    protected void onDisposed2(io.reactivex.functions.Action r1) {
            r0 = this;
            r1.run()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r1 = move-exception
            java.lang.RuntimeException r1 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r1)
            throw r1
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    protected /* bridge */ /* synthetic */ void onDisposed(io.reactivex.functions.Action r1) {
            r0 = this;
            io.reactivex.functions.Action r1 = (io.reactivex.functions.Action) r1
            r0.onDisposed2(r1)
            return
    }
}
