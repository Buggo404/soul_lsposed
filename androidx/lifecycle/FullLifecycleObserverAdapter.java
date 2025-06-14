package androidx.lifecycle;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements androidx.lifecycle.LifecycleEventObserver {
    private final androidx.lifecycle.FullLifecycleObserver mFullLifecycleObserver;
    private final androidx.lifecycle.LifecycleEventObserver mLifecycleEventObserver;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$1 */
    static /* synthetic */ class C03291 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event = null;

        static {
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.FullLifecycleObserverAdapter.C03291.$SwitchMap$androidx$lifecycle$Lifecycle$Event = r0
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C03291.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C03291.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C03291.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C03291.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C03291.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C03291.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    FullLifecycleObserverAdapter(androidx.lifecycle.FullLifecycleObserver r1, androidx.lifecycle.LifecycleEventObserver r2) {
            r0 = this;
            r0.<init>()
            r0.mFullLifecycleObserver = r1
            r0.mLifecycleEventObserver = r2
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            r2 = this;
            int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C03291.$SwitchMap$androidx$lifecycle$Lifecycle$Event
            int r1 = r4.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L32;
                case 2: goto L2c;
                case 3: goto L26;
                case 4: goto L20;
                case 5: goto L1a;
                case 6: goto L14;
                case 7: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L37
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "ON_ANY must not been send by anybody"
            r3.<init>(r4)
            throw r3
        L14:
            androidx.lifecycle.FullLifecycleObserver r0 = r2.mFullLifecycleObserver
            r0.onDestroy(r3)
            goto L37
        L1a:
            androidx.lifecycle.FullLifecycleObserver r0 = r2.mFullLifecycleObserver
            r0.onStop(r3)
            goto L37
        L20:
            androidx.lifecycle.FullLifecycleObserver r0 = r2.mFullLifecycleObserver
            r0.onPause(r3)
            goto L37
        L26:
            androidx.lifecycle.FullLifecycleObserver r0 = r2.mFullLifecycleObserver
            r0.onResume(r3)
            goto L37
        L2c:
            androidx.lifecycle.FullLifecycleObserver r0 = r2.mFullLifecycleObserver
            r0.onStart(r3)
            goto L37
        L32:
            androidx.lifecycle.FullLifecycleObserver r0 = r2.mFullLifecycleObserver
            r0.onCreate(r3)
        L37:
            androidx.lifecycle.LifecycleEventObserver r0 = r2.mLifecycleEventObserver
            if (r0 == 0) goto L3e
            r0.onStateChanged(r3, r4)
        L3e:
            return
    }
}
