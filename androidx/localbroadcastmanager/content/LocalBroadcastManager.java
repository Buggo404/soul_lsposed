package androidx.localbroadcastmanager.content;

/* loaded from: classes.dex */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final java.lang.String TAG = "LocalBroadcastManager";
    private static androidx.localbroadcastmanager.content.LocalBroadcastManager mInstance;
    private static final java.lang.Object mLock = null;
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord>> mActions;
    private final android.content.Context mAppContext;
    private final android.os.Handler mHandler;
    private final java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord> mPendingBroadcasts;
    private final java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord>> mReceivers;


    private static final class BroadcastRecord {
        final android.content.Intent intent;
        final java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> receivers;

        BroadcastRecord(android.content.Intent r1, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> r2) {
                r0 = this;
                r0.<init>()
                r0.intent = r1
                r0.receivers = r2
                return
        }
    }

    private static final class ReceiverRecord {
        boolean broadcasting;
        boolean dead;
        final android.content.IntentFilter filter;
        final android.content.BroadcastReceiver receiver;

        ReceiverRecord(android.content.IntentFilter r1, android.content.BroadcastReceiver r2) {
                r0 = this;
                r0.<init>()
                r0.filter = r1
                r0.receiver = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.794E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Receiver{"
                r0.append(r1)
                android.content.BroadcastReceiver r1 = r2.receiver
                r0.append(r1)
                java.lang.String r1 = " filter="
                r0.append(r1)
                android.content.IntentFilter r1 = r2.filter
                r0.append(r1)
                boolean r1 = r2.dead
                if (r1 == 0) goto L24
                java.lang.String r1 = " DEAD"
                r0.append(r1)
            L24:
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.localbroadcastmanager.content.LocalBroadcastManager.mLock = r0
            return
    }

    private LocalBroadcastManager(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mReceivers = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mActions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPendingBroadcasts = r0
            r1.mAppContext = r2
            androidx.localbroadcastmanager.content.LocalBroadcastManager$1 r0 = new androidx.localbroadcastmanager.content.LocalBroadcastManager$1
            android.os.Looper r2 = r2.getMainLooper()
            r0.<init>(r1, r2)
            r1.mHandler = r0
            return
    }

    public static androidx.localbroadcastmanager.content.LocalBroadcastManager getInstance(android.content.Context r2) {
            java.lang.Object r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.mLock
            monitor-enter(r0)
            androidx.localbroadcastmanager.content.LocalBroadcastManager r1 = androidx.localbroadcastmanager.content.LocalBroadcastManager.mInstance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L12
            androidx.localbroadcastmanager.content.LocalBroadcastManager r1 = new androidx.localbroadcastmanager.content.LocalBroadcastManager     // Catch: java.lang.Throwable -> L16
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            androidx.localbroadcastmanager.content.LocalBroadcastManager.mInstance = r1     // Catch: java.lang.Throwable -> L16
        L12:
            androidx.localbroadcastmanager.content.LocalBroadcastManager r2 = androidx.localbroadcastmanager.content.LocalBroadcastManager.mInstance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    void executePendingBroadcasts() {
            r10 = this;
        L0:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r0 = r10.mReceivers
            monitor-enter(r0)
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord> r1 = r10.mPendingBroadcasts     // Catch: java.lang.Throwable -> L44
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L44
            if (r1 > 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        Ld:
            androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord[] r2 = new androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord[r1]     // Catch: java.lang.Throwable -> L44
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord> r3 = r10.mPendingBroadcasts     // Catch: java.lang.Throwable -> L44
            r3.toArray(r2)     // Catch: java.lang.Throwable -> L44
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord> r3 = r10.mPendingBroadcasts     // Catch: java.lang.Throwable -> L44
            r3.clear()     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            r0 = 0
            r3 = r0
        L1c:
            if (r3 >= r1) goto L0
            r4 = r2[r3]
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord> r5 = r4.receivers
            int r5 = r5.size()
            r6 = r0
        L27:
            if (r6 >= r5) goto L41
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord> r7 = r4.receivers
            java.lang.Object r7 = r7.get(r6)
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r7 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r7
            boolean r8 = r7.dead
            if (r8 != 0) goto L3e
            android.content.BroadcastReceiver r7 = r7.receiver
            android.content.Context r8 = r10.mAppContext
            android.content.Intent r9 = r4.intent
            r7.onReceive(r8, r9)
        L3e:
            int r6 = r6 + 1
            goto L27
        L41:
            int r3 = r3 + 1
            goto L1c
        L44:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r1
    }

    public void registerReceiver(android.content.BroadcastReceiver r7, android.content.IntentFilter r8) {
            r6 = this;
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r0 = r6.mReceivers
            monitor-enter(r0)
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r1 = new androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord     // Catch: java.lang.Throwable -> L47
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L47
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r2 = r6.mReceivers     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L47
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L47
            r3 = 1
            if (r2 != 0) goto L1d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L47
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L47
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r4 = r6.mReceivers     // Catch: java.lang.Throwable -> L47
            r4.put(r7, r2)     // Catch: java.lang.Throwable -> L47
        L1d:
            r2.add(r1)     // Catch: java.lang.Throwable -> L47
            r7 = 0
        L21:
            int r2 = r8.countActions()     // Catch: java.lang.Throwable -> L47
            if (r7 >= r2) goto L45
            java.lang.String r2 = r8.getAction(r7)     // Catch: java.lang.Throwable -> L47
            java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r4 = r6.mActions     // Catch: java.lang.Throwable -> L47
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L47
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L47
            if (r4 != 0) goto L3f
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L47
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L47
            java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r5 = r6.mActions     // Catch: java.lang.Throwable -> L47
            r5.put(r2, r4)     // Catch: java.lang.Throwable -> L47
        L3f:
            r4.add(r1)     // Catch: java.lang.Throwable -> L47
            int r7 = r7 + 1
            goto L21
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L47:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r7
    }

    public boolean sendBroadcast(android.content.Intent r23) {
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "Action list: "
            java.lang.String r3 = "Resolving type "
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r4 = r1.mReceivers
            monitor-enter(r4)
            java.lang.String r12 = r23.getAction()     // Catch: java.lang.Throwable -> L176
            android.content.Context r5 = r1.mAppContext     // Catch: java.lang.Throwable -> L176
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L176
            java.lang.String r13 = r0.resolveTypeIfNeeded(r5)     // Catch: java.lang.Throwable -> L176
            android.net.Uri r14 = r23.getData()     // Catch: java.lang.Throwable -> L176
            java.lang.String r15 = r23.getScheme()     // Catch: java.lang.Throwable -> L176
            java.util.Set r16 = r23.getCategories()     // Catch: java.lang.Throwable -> L176
            int r5 = r23.getFlags()     // Catch: java.lang.Throwable -> L176
            r5 = r5 & 8
            r11 = 0
            r10 = 1
            if (r5 == 0) goto L32
            r17 = r10
            goto L34
        L32:
            r17 = r11
        L34:
            if (r17 == 0) goto L5c
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L176
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L176
            java.lang.StringBuilder r3 = r6.append(r13)     // Catch: java.lang.Throwable -> L176
            java.lang.String r6 = " scheme "
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> L176
            java.lang.StringBuilder r3 = r3.append(r15)     // Catch: java.lang.Throwable -> L176
            java.lang.String r6 = " of intent "
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> L176
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L176
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L176
            android.util.Log.v(r5, r3)     // Catch: java.lang.Throwable -> L176
        L5c:
            java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r3 = r1.mActions     // Catch: java.lang.Throwable -> L176
            java.lang.String r5 = r23.getAction()     // Catch: java.lang.Throwable -> L176
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Throwable -> L176
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> L176
            if (r3 == 0) goto L173
            if (r17 == 0) goto L7e
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L176
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L176
            java.lang.StringBuilder r2 = r6.append(r3)     // Catch: java.lang.Throwable -> L176
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L176
            android.util.Log.v(r5, r2)     // Catch: java.lang.Throwable -> L176
        L7e:
            r2 = 0
            r9 = r11
        L80:
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L176
            if (r9 >= r5) goto L142
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L176
            r8 = r5
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r8 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r8     // Catch: java.lang.Throwable -> L176
            if (r17 == 0) goto La9
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L176
            r6.<init>()     // Catch: java.lang.Throwable -> L176
            java.lang.String r7 = "Matching against filter "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L176
            android.content.IntentFilter r7 = r8.filter     // Catch: java.lang.Throwable -> L176
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L176
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L176
            android.util.Log.v(r5, r6)     // Catch: java.lang.Throwable -> L176
        La9:
            boolean r5 = r8.broadcasting     // Catch: java.lang.Throwable -> L176
            if (r5 == 0) goto Lbf
            if (r17 == 0) goto Lb6
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.String r6 = "  Filter's target already added"
            android.util.Log.v(r5, r6)     // Catch: java.lang.Throwable -> L176
        Lb6:
            r19 = r3
            r20 = r9
            r21 = r12
            r12 = r10
            goto L138
        Lbf:
            android.content.IntentFilter r5 = r8.filter     // Catch: java.lang.Throwable -> L176
            java.lang.String r18 = "LocalBroadcastManager"
            r6 = r12
            r7 = r13
            r19 = r3
            r3 = r8
            r8 = r15
            r20 = r9
            r9 = r14
            r21 = r12
            r12 = r10
            r10 = r16
            r11 = r18
            int r5 = r5.match(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L176
            if (r5 < 0) goto L104
            if (r17 == 0) goto Lf7
            java.lang.String r6 = "LocalBroadcastManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L176
            r7.<init>()     // Catch: java.lang.Throwable -> L176
            java.lang.String r8 = "  Filter matched!  match=0x"
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L176
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L176
            java.lang.StringBuilder r5 = r7.append(r5)     // Catch: java.lang.Throwable -> L176
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L176
            android.util.Log.v(r6, r5)     // Catch: java.lang.Throwable -> L176
        Lf7:
            if (r2 != 0) goto Lfe
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L176
            r2.<init>()     // Catch: java.lang.Throwable -> L176
        Lfe:
            r2.add(r3)     // Catch: java.lang.Throwable -> L176
            r3.broadcasting = r12     // Catch: java.lang.Throwable -> L176
            goto L138
        L104:
            if (r17 == 0) goto L138
            r3 = -4
            if (r5 == r3) goto L11e
            r3 = -3
            if (r5 == r3) goto L11b
            r3 = -2
            if (r5 == r3) goto L118
            r3 = -1
            if (r5 == r3) goto L115
            java.lang.String r3 = "unknown reason"
            goto L120
        L115:
            java.lang.String r3 = "type"
            goto L120
        L118:
            java.lang.String r3 = "data"
            goto L120
        L11b:
            java.lang.String r3 = "action"
            goto L120
        L11e:
            java.lang.String r3 = "category"
        L120:
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L176
            r6.<init>()     // Catch: java.lang.Throwable -> L176
            java.lang.String r7 = "  Filter did not match: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L176
            java.lang.StringBuilder r3 = r6.append(r3)     // Catch: java.lang.Throwable -> L176
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L176
            android.util.Log.v(r5, r3)     // Catch: java.lang.Throwable -> L176
        L138:
            int r9 = r20 + 1
            r10 = r12
            r3 = r19
            r12 = r21
            r11 = 0
            goto L80
        L142:
            r12 = r10
            if (r2 == 0) goto L171
            r11 = 0
        L146:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L176
            if (r11 >= r3) goto L158
            java.lang.Object r3 = r2.get(r11)     // Catch: java.lang.Throwable -> L176
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r3 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r3     // Catch: java.lang.Throwable -> L176
            r5 = 0
            r3.broadcasting = r5     // Catch: java.lang.Throwable -> L176
            int r11 = r11 + 1
            goto L146
        L158:
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord> r3 = r1.mPendingBroadcasts     // Catch: java.lang.Throwable -> L176
            androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord r5 = new androidx.localbroadcastmanager.content.LocalBroadcastManager$BroadcastRecord     // Catch: java.lang.Throwable -> L176
            r5.<init>(r0, r2)     // Catch: java.lang.Throwable -> L176
            r3.add(r5)     // Catch: java.lang.Throwable -> L176
            android.os.Handler r0 = r1.mHandler     // Catch: java.lang.Throwable -> L176
            boolean r0 = r0.hasMessages(r12)     // Catch: java.lang.Throwable -> L176
            if (r0 != 0) goto L16f
            android.os.Handler r0 = r1.mHandler     // Catch: java.lang.Throwable -> L176
            r0.sendEmptyMessage(r12)     // Catch: java.lang.Throwable -> L176
        L16f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L176
            return r12
        L171:
            r5 = 0
            goto L174
        L173:
            r5 = r11
        L174:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L176
            return r5
        L176:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L176
            throw r0
    }

    public void sendBroadcastSync(android.content.Intent r1) {
            r0 = this;
            boolean r1 = r0.sendBroadcast(r1)
            if (r1 == 0) goto L9
            r0.executePendingBroadcasts()
        L9:
            return
    }

    public void unregisterReceiver(android.content.BroadcastReceiver r12) {
            r11 = this;
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r0 = r11.mReceivers
            monitor-enter(r0)
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r1 = r11.mReceivers     // Catch: java.lang.Throwable -> L64
            java.lang.Object r1 = r1.remove(r12)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
            return
        Lf:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L64
            r3 = 1
            int r2 = r2 - r3
        L15:
            if (r2 < 0) goto L62
            java.lang.Object r4 = r1.get(r2)     // Catch: java.lang.Throwable -> L64
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r4 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r4     // Catch: java.lang.Throwable -> L64
            r4.dead = r3     // Catch: java.lang.Throwable -> L64
            r5 = 0
        L20:
            android.content.IntentFilter r6 = r4.filter     // Catch: java.lang.Throwable -> L64
            int r6 = r6.countActions()     // Catch: java.lang.Throwable -> L64
            if (r5 >= r6) goto L5f
            android.content.IntentFilter r6 = r4.filter     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = r6.getAction(r5)     // Catch: java.lang.Throwable -> L64
            java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r7 = r11.mActions     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> L64
            if (r7 == 0) goto L5c
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L64
            int r8 = r8 - r3
        L3d:
            if (r8 < 0) goto L51
            java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> L64
            androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord r9 = (androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) r9     // Catch: java.lang.Throwable -> L64
            android.content.BroadcastReceiver r10 = r9.receiver     // Catch: java.lang.Throwable -> L64
            if (r10 != r12) goto L4e
            r9.dead = r3     // Catch: java.lang.Throwable -> L64
            r7.remove(r8)     // Catch: java.lang.Throwable -> L64
        L4e:
            int r8 = r8 + (-1)
            goto L3d
        L51:
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L64
            if (r7 > 0) goto L5c
            java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager$ReceiverRecord>> r7 = r11.mActions     // Catch: java.lang.Throwable -> L64
            r7.remove(r6)     // Catch: java.lang.Throwable -> L64
        L5c:
            int r5 = r5 + 1
            goto L20
        L5f:
            int r2 = r2 + (-1)
            goto L15
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
            return
        L64:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
            throw r12
    }
}
