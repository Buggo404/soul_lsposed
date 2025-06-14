package androidx.core.app;

/* loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static final java.lang.String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final java.lang.String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final java.lang.String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final java.lang.String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final java.lang.String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final java.lang.String TAG = "NotifManCompat";
    private static java.util.Set<java.lang.String> sEnabledNotificationListenerPackages;
    private static java.lang.String sEnabledNotificationListeners;
    private static final java.lang.Object sEnabledNotificationListenersLock = null;
    private static final java.lang.Object sLock = null;
    private static androidx.core.app.NotificationManagerCompat.SideChannelManager sSideChannelManager;
    private final android.content.Context mContext;
    private final android.app.NotificationManager mNotificationManager;

    private static class CancelTask implements androidx.core.app.NotificationManagerCompat.Task {
        final boolean all;

        /* renamed from: id */
        final int f63id;
        final java.lang.String packageName;
        final java.lang.String tag;

        CancelTask(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.packageName = r1
                r1 = 0
                r0.f63id = r1
                r1 = 0
                r0.tag = r1
                r1 = 1
                r0.all = r1
                return
        }

        CancelTask(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.packageName = r1
                r0.f63id = r2
                r0.tag = r3
                r1 = 0
                r0.all = r1
                return
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(android.support.v4.app.INotificationSideChannel r4) throws android.os.RemoteException {
                r3 = this;
                boolean r0 = r3.all
                if (r0 == 0) goto La
                java.lang.String r0 = r3.packageName
                r4.cancelAll(r0)
                goto L13
            La:
                java.lang.String r0 = r3.packageName
                int r1 = r3.f63id
                java.lang.String r2 = r3.tag
                r4.cancel(r0, r1, r2)
            L13:
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CancelTask[packageName:"
                r0.<init>(r1)
                java.lang.String r1 = r3.packageName
                r0.append(r1)
                java.lang.String r1 = ", id:"
                java.lang.StringBuilder r1 = r0.append(r1)
                int r2 = r3.f63id
                r1.append(r2)
                java.lang.String r1 = ", tag:"
                java.lang.StringBuilder r1 = r0.append(r1)
                java.lang.String r2 = r3.tag
                r1.append(r2)
                java.lang.String r1 = ", all:"
                java.lang.StringBuilder r1 = r0.append(r1)
                boolean r2 = r3.all
                r1.append(r2)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class NotifyTask implements androidx.core.app.NotificationManagerCompat.Task {

        /* renamed from: id */
        final int f64id;
        final android.app.Notification notif;
        final java.lang.String packageName;
        final java.lang.String tag;

        NotifyTask(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) {
                r0 = this;
                r0.<init>()
                r0.packageName = r1
                r0.f64id = r2
                r0.tag = r3
                r0.notif = r4
                return
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(android.support.v4.app.INotificationSideChannel r5) throws android.os.RemoteException {
                r4 = this;
                java.lang.String r0 = r4.packageName
                int r1 = r4.f64id
                java.lang.String r2 = r4.tag
                android.app.Notification r3 = r4.notif
                r5.notify(r0, r1, r2, r3)
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "NotifyTask[packageName:"
                r0.<init>(r1)
                java.lang.String r1 = r3.packageName
                r0.append(r1)
                java.lang.String r1 = ", id:"
                java.lang.StringBuilder r1 = r0.append(r1)
                int r2 = r3.f64id
                r1.append(r2)
                java.lang.String r1 = ", tag:"
                java.lang.StringBuilder r1 = r0.append(r1)
                java.lang.String r2 = r3.tag
                r1.append(r2)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class ServiceConnectedEvent {
        final android.content.ComponentName componentName;
        final android.os.IBinder iBinder;

        ServiceConnectedEvent(android.content.ComponentName r1, android.os.IBinder r2) {
                r0 = this;
                r0.<init>()
                r0.componentName = r1
                r0.iBinder = r2
                return
        }
    }

    private static class SideChannelManager implements android.os.Handler.Callback, android.content.ServiceConnection {
        private static final int MSG_QUEUE_TASK = 0;
        private static final int MSG_RETRY_LISTENER_QUEUE = 3;
        private static final int MSG_SERVICE_CONNECTED = 1;
        private static final int MSG_SERVICE_DISCONNECTED = 2;
        private java.util.Set<java.lang.String> mCachedEnabledPackages;
        private final android.content.Context mContext;
        private final android.os.Handler mHandler;
        private final android.os.HandlerThread mHandlerThread;
        private final java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord> mRecordMap;

        private static class ListenerRecord {
            boolean bound;
            final android.content.ComponentName componentName;
            int retryCount;
            android.support.v4.app.INotificationSideChannel service;
            java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat.Task> taskQueue;

            ListenerRecord(android.content.ComponentName r3) {
                    r2 = this;
                    r2.<init>()
                    r0 = 0
                    r2.bound = r0
                    java.util.ArrayDeque r1 = new java.util.ArrayDeque
                    r1.<init>()
                    r2.taskQueue = r1
                    r2.retryCount = r0
                    r2.componentName = r3
                    return
            }
        }

        SideChannelManager(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mRecordMap = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mCachedEnabledPackages = r0
                r1.mContext = r2
                android.os.HandlerThread r2 = new android.os.HandlerThread
                java.lang.String r0 = "NotificationManagerCompat"
                r2.<init>(r0)
                r1.mHandlerThread = r2
                r2.start()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r2 = r2.getLooper()
                r0.<init>(r2, r1)
                r1.mHandler = r0
                return
        }

        private boolean ensureServiceBound(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r4) {
                r3 = this;
                boolean r0 = r4.bound
                if (r0 == 0) goto L6
                r4 = 1
                return r4
            L6:
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
                r0.<init>(r1)
                android.content.ComponentName r1 = r4.componentName
                android.content.Intent r0 = r0.setComponent(r1)
                android.content.Context r1 = r3.mContext
                r2 = 33
                boolean r0 = r1.bindService(r0, r3, r2)
                r4.bound = r0
                boolean r0 = r4.bound
                if (r0 == 0) goto L25
                r0 = 0
                r4.retryCount = r0
                goto L40
            L25:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unable to bind to listener "
                r0.<init>(r1)
                android.content.ComponentName r1 = r4.componentName
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "NotifManCompat"
                android.util.Log.w(r1, r0)
                android.content.Context r0 = r3.mContext
                r0.unbindService(r3)
            L40:
                boolean r4 = r4.bound
                return r4
        }

        private void ensureServiceUnbound(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r2) {
                r1 = this;
                boolean r0 = r2.bound
                if (r0 == 0) goto Lc
                android.content.Context r0 = r1.mContext
                r0.unbindService(r1)
                r0 = 0
                r2.bound = r0
            Lc:
                r0 = 0
                r2.service = r0
                return
        }

        private void handleQueueTask(androidx.core.app.NotificationManagerCompat.Task r4) {
                r3 = this;
                r3.updateListenerMap()
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r3.mRecordMap
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            Ld:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r0.next()
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r1 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r1
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r1.taskQueue
                r2.add(r4)
                r3.processListenerQueue(r1)
                goto Ld
            L22:
                return
        }

        private void handleRetryListenerQueue(android.content.ComponentName r2) {
                r1 = this;
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r1.mRecordMap
                java.lang.Object r2 = r0.get(r2)
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r2 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r2
                if (r2 == 0) goto Ld
                r1.processListenerQueue(r2)
            Ld:
                return
        }

        private void handleServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
                r1 = this;
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r1.mRecordMap
                java.lang.Object r2 = r0.get(r2)
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r2 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r2
                if (r2 == 0) goto L16
                android.support.v4.app.INotificationSideChannel r3 = android.support.v4.app.INotificationSideChannel.Stub.asInterface(r3)
                r2.service = r3
                r3 = 0
                r2.retryCount = r3
                r1.processListenerQueue(r2)
            L16:
                return
        }

        private void handleServiceDisconnected(android.content.ComponentName r2) {
                r1 = this;
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r1.mRecordMap
                java.lang.Object r2 = r0.get(r2)
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r2 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r2
                if (r2 == 0) goto Ld
                r1.ensureServiceUnbound(r2)
            Ld:
                return
        }

        private void processListenerQueue(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r6) {
                r5 = this;
                java.lang.String r0 = "NotifManCompat"
                r1 = 3
                boolean r2 = android.util.Log.isLoggable(r0, r1)
                if (r2 == 0) goto L33
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Processing component "
                r2.<init>(r3)
                android.content.ComponentName r3 = r6.componentName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = ", "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r3 = r6.taskQueue
                int r3 = r3.size()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " queued tasks"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.d(r0, r2)
            L33:
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r6.taskQueue
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L3c
                return
            L3c:
                boolean r2 = r5.ensureServiceBound(r6)
                if (r2 == 0) goto Lb5
                android.support.v4.app.INotificationSideChannel r2 = r6.service
                if (r2 != 0) goto L47
                goto Lb5
            L47:
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r6.taskQueue
                java.lang.Object r2 = r2.peek()
                androidx.core.app.NotificationManagerCompat$Task r2 = (androidx.core.app.NotificationManagerCompat.Task) r2
                if (r2 != 0) goto L52
                goto La9
            L52:
                boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch: android.os.RemoteException -> L79 android.os.DeadObjectException -> L8f
                if (r3 == 0) goto L6e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L79 android.os.DeadObjectException -> L8f
                r3.<init>()     // Catch: android.os.RemoteException -> L79 android.os.DeadObjectException -> L8f
                java.lang.String r4 = "Sending task "
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch: android.os.RemoteException -> L79 android.os.DeadObjectException -> L8f
                java.lang.StringBuilder r3 = r3.append(r2)     // Catch: android.os.RemoteException -> L79 android.os.DeadObjectException -> L8f
                java.lang.String r3 = r3.toString()     // Catch: android.os.RemoteException -> L79 android.os.DeadObjectException -> L8f
                android.util.Log.d(r0, r3)     // Catch: android.os.RemoteException -> L79 android.os.DeadObjectException -> L8f
            L6e:
                android.support.v4.app.INotificationSideChannel r3 = r6.service     // Catch: android.os.RemoteException -> L79 android.os.DeadObjectException -> L8f
                r2.send(r3)     // Catch: android.os.RemoteException -> L79 android.os.DeadObjectException -> L8f
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r2 = r6.taskQueue     // Catch: android.os.RemoteException -> L79 android.os.DeadObjectException -> L8f
                r2.remove()     // Catch: android.os.RemoteException -> L79 android.os.DeadObjectException -> L8f
                goto L47
            L79:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "RemoteException communicating with "
                r2.<init>(r3)
                android.content.ComponentName r3 = r6.componentName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.w(r0, r2, r1)
                goto La9
            L8f:
                boolean r1 = android.util.Log.isLoggable(r0, r1)
                if (r1 == 0) goto La9
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Remote service has died: "
                r1.<init>(r2)
                android.content.ComponentName r2 = r6.componentName
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
            La9:
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r0 = r6.taskQueue
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto Lb4
                r5.scheduleListenerRetry(r6)
            Lb4:
                return
            Lb5:
                r5.scheduleListenerRetry(r6)
                return
        }

        private void scheduleListenerRetry(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r6) {
                r5 = this;
                android.os.Handler r0 = r5.mHandler
                android.content.ComponentName r1 = r6.componentName
                r2 = 3
                boolean r0 = r0.hasMessages(r2, r1)
                if (r0 == 0) goto Lc
                return
            Lc:
                int r0 = r6.retryCount
                r1 = 1
                int r0 = r0 + r1
                r6.retryCount = r0
                int r0 = r6.retryCount
                r3 = 6
                java.lang.String r4 = "NotifManCompat"
                if (r0 <= r3) goto L55
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Giving up on delivering "
                r0.<init>(r1)
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r1 = r6.taskQueue
                int r1 = r1.size()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " tasks to "
                java.lang.StringBuilder r0 = r0.append(r1)
                android.content.ComponentName r1 = r6.componentName
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " after "
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r6.retryCount
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " retries"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.w(r4, r0)
                java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat$Task> r6 = r6.taskQueue
                r6.clear()
                return
            L55:
                int r0 = r6.retryCount
                int r0 = r0 - r1
                int r0 = r1 << r0
                int r0 = r0 * 1000
                boolean r1 = android.util.Log.isLoggable(r4, r2)
                if (r1 == 0) goto L7a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "Scheduling retry for "
                r1.<init>(r3)
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r3 = " ms"
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r4, r1)
            L7a:
                android.os.Handler r1 = r5.mHandler
                android.content.ComponentName r6 = r6.componentName
                android.os.Message r6 = r1.obtainMessage(r2, r6)
                android.os.Handler r1 = r5.mHandler
                long r2 = (long) r0
                r1.sendMessageDelayed(r6, r2)
                return
        }

        private void updateListenerMap() {
                r8 = this;
                android.content.Context r0 = r8.mContext
                java.util.Set r0 = androidx.core.app.NotificationManagerCompat.getEnabledListenerPackages(r0)
                java.util.Set<java.lang.String> r1 = r8.mCachedEnabledPackages
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto Lf
                return
            Lf:
                r8.mCachedEnabledPackages = r0
                android.content.Context r1 = r8.mContext
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                java.lang.String r3 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
                android.content.Intent r2 = r2.setAction(r3)
                r3 = 0
                java.util.List r1 = r1.queryIntentServices(r2, r3)
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                java.util.Iterator r1 = r1.iterator()
            L30:
                boolean r3 = r1.hasNext()
                java.lang.String r4 = "NotifManCompat"
                if (r3 == 0) goto L79
                java.lang.Object r3 = r1.next()
                android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
                android.content.pm.ServiceInfo r5 = r3.serviceInfo
                java.lang.String r5 = r5.packageName
                boolean r5 = r0.contains(r5)
                if (r5 != 0) goto L49
                goto L30
            L49:
                android.content.ComponentName r5 = new android.content.ComponentName
                android.content.pm.ServiceInfo r6 = r3.serviceInfo
                java.lang.String r6 = r6.packageName
                android.content.pm.ServiceInfo r7 = r3.serviceInfo
                java.lang.String r7 = r7.name
                r5.<init>(r6, r7)
                android.content.pm.ServiceInfo r3 = r3.serviceInfo
                java.lang.String r3 = r3.permission
                if (r3 == 0) goto L75
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r6 = "Permission present on component "
                r3.<init>(r6)
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.String r5 = ", not adding listener record."
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.String r3 = r3.toString()
                android.util.Log.w(r4, r3)
                goto L30
            L75:
                r2.add(r5)
                goto L30
            L79:
                java.util.Iterator r0 = r2.iterator()
            L7d:
                boolean r1 = r0.hasNext()
                r3 = 3
                if (r1 == 0) goto Lb5
                java.lang.Object r1 = r0.next()
                android.content.ComponentName r1 = (android.content.ComponentName) r1
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r5 = r8.mRecordMap
                boolean r5 = r5.containsKey(r1)
                if (r5 != 0) goto L7d
                boolean r3 = android.util.Log.isLoggable(r4, r3)
                if (r3 == 0) goto Laa
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r5 = "Adding listener record for "
                r3.<init>(r5)
                java.lang.StringBuilder r3 = r3.append(r1)
                java.lang.String r3 = r3.toString()
                android.util.Log.d(r4, r3)
            Laa:
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r3 = r8.mRecordMap
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r5 = new androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord
                r5.<init>(r1)
                r3.put(r1, r5)
                goto L7d
            Lb5:
                java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord> r0 = r8.mRecordMap
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            Lbf:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto Lfe
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r5 = r1.getKey()
                boolean r5 = r2.contains(r5)
                if (r5 != 0) goto Lbf
                boolean r5 = android.util.Log.isLoggable(r4, r3)
                if (r5 == 0) goto Lf1
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Removing listener record for "
                r5.<init>(r6)
                java.lang.Object r6 = r1.getKey()
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.String r5 = r5.toString()
                android.util.Log.d(r4, r5)
            Lf1:
                java.lang.Object r1 = r1.getValue()
                androidx.core.app.NotificationManagerCompat$SideChannelManager$ListenerRecord r1 = (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord) r1
                r8.ensureServiceUnbound(r1)
                r0.remove()
                goto Lbf
            Lfe:
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 1
                if (r0 == 0) goto L2b
                if (r0 == r1) goto L1f
                r2 = 2
                if (r0 == r2) goto L17
                r2 = 3
                if (r0 == r2) goto Lf
                r4 = 0
                return r4
            Lf:
                java.lang.Object r4 = r4.obj
                android.content.ComponentName r4 = (android.content.ComponentName) r4
                r3.handleRetryListenerQueue(r4)
                return r1
            L17:
                java.lang.Object r4 = r4.obj
                android.content.ComponentName r4 = (android.content.ComponentName) r4
                r3.handleServiceDisconnected(r4)
                return r1
            L1f:
                java.lang.Object r4 = r4.obj
                androidx.core.app.NotificationManagerCompat$ServiceConnectedEvent r4 = (androidx.core.app.NotificationManagerCompat.ServiceConnectedEvent) r4
                android.content.ComponentName r0 = r4.componentName
                android.os.IBinder r4 = r4.iBinder
                r3.handleServiceConnected(r0, r4)
                return r1
            L2b:
                java.lang.Object r4 = r4.obj
                androidx.core.app.NotificationManagerCompat$Task r4 = (androidx.core.app.NotificationManagerCompat.Task) r4
                r3.handleQueueTask(r4)
                return r1
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
                r3 = this;
                r0 = 3
                java.lang.String r1 = "NotifManCompat"
                boolean r0 = android.util.Log.isLoggable(r1, r0)
                if (r0 == 0) goto L1b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Connected to service "
                r0.<init>(r2)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r1, r0)
            L1b:
                android.os.Handler r0 = r3.mHandler
                androidx.core.app.NotificationManagerCompat$ServiceConnectedEvent r1 = new androidx.core.app.NotificationManagerCompat$ServiceConnectedEvent
                r1.<init>(r4, r5)
                r4 = 1
                android.os.Message r4 = r0.obtainMessage(r4, r1)
                r4.sendToTarget()
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName r4) {
                r3 = this;
                r0 = 3
                java.lang.String r1 = "NotifManCompat"
                boolean r0 = android.util.Log.isLoggable(r1, r0)
                if (r0 == 0) goto L1b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Disconnected from service "
                r0.<init>(r2)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r1, r0)
            L1b:
                android.os.Handler r0 = r3.mHandler
                r1 = 2
                android.os.Message r4 = r0.obtainMessage(r1, r4)
                r4.sendToTarget()
                return
        }

        public void queueTask(androidx.core.app.NotificationManagerCompat.Task r3) {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                r1 = 0
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
        }
    }

    private interface Task {
        void send(android.support.v4.app.INotificationSideChannel r1) throws android.os.RemoteException;
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenersLock = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenerPackages = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.NotificationManagerCompat.sLock = r0
            return
    }

    private NotificationManagerCompat(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.mContext = r2
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            r1.mNotificationManager = r2
            return
    }

    public static androidx.core.app.NotificationManagerCompat from(android.content.Context r1) {
            androidx.core.app.NotificationManagerCompat r0 = new androidx.core.app.NotificationManagerCompat
            r0.<init>(r1)
            return r0
    }

    public static java.util.Set<java.lang.String> getEnabledListenerPackages(android.content.Context r6) {
            android.content.ContentResolver r6 = r6.getContentResolver()
            java.lang.String r0 = "enabled_notification_listeners"
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r0)
            java.lang.Object r0 = androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenersLock
            monitor-enter(r0)
            if (r6 == 0) goto L3e
            java.lang.String r1 = androidx.core.app.NotificationManagerCompat.sEnabledNotificationListeners     // Catch: java.lang.Throwable -> L42
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L3e
            java.lang.String r1 = ":"
            r2 = -1
            java.lang.String[] r1 = r6.split(r1, r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L42
            int r3 = r1.length     // Catch: java.lang.Throwable -> L42
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42
            int r3 = r1.length     // Catch: java.lang.Throwable -> L42
            r4 = 0
        L26:
            if (r4 >= r3) goto L3a
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L42
            android.content.ComponentName r5 = android.content.ComponentName.unflattenFromString(r5)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L37
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L42
            r2.add(r5)     // Catch: java.lang.Throwable -> L42
        L37:
            int r4 = r4 + 1
            goto L26
        L3a:
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenerPackages = r2     // Catch: java.lang.Throwable -> L42
            androidx.core.app.NotificationManagerCompat.sEnabledNotificationListeners = r6     // Catch: java.lang.Throwable -> L42
        L3e:
            java.util.Set<java.lang.String> r6 = androidx.core.app.NotificationManagerCompat.sEnabledNotificationListenerPackages     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            return r6
        L42:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r6
    }

    private void pushSideChannelQueue(androidx.core.app.NotificationManagerCompat.Task r4) {
            r3 = this;
            java.lang.Object r0 = androidx.core.app.NotificationManagerCompat.sLock
            monitor-enter(r0)
            androidx.core.app.NotificationManagerCompat$SideChannelManager r1 = androidx.core.app.NotificationManagerCompat.sSideChannelManager     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L14
            androidx.core.app.NotificationManagerCompat$SideChannelManager r1 = new androidx.core.app.NotificationManagerCompat$SideChannelManager     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = r3.mContext     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            androidx.core.app.NotificationManagerCompat.sSideChannelManager = r1     // Catch: java.lang.Throwable -> L1b
        L14:
            androidx.core.app.NotificationManagerCompat$SideChannelManager r1 = androidx.core.app.NotificationManagerCompat.sSideChannelManager     // Catch: java.lang.Throwable -> L1b
            r1.queueTask(r4)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    private static boolean useSideChannelForNotification(android.app.Notification r1) {
            android.os.Bundle r1 = androidx.core.app.NotificationCompat.getExtras(r1)
            if (r1 == 0) goto L10
            java.lang.String r0 = "android.support.useSideChannel"
            boolean r1 = r1.getBoolean(r0)
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public boolean areNotificationsEnabled() {
            r1 = this;
            android.app.NotificationManager r0 = r1.mNotificationManager
            boolean r0 = r0.areNotificationsEnabled()
            return r0
    }

    public void cancel(int r2) {
            r1 = this;
            r0 = 0
            r1.cancel(r0, r2)
            return
    }

    public void cancel(java.lang.String r2, int r3) {
            r1 = this;
            android.app.NotificationManager r0 = r1.mNotificationManager
            r0.cancel(r2, r3)
            return
    }

    public void cancelAll() {
            r1 = this;
            android.app.NotificationManager r0 = r1.mNotificationManager
            r0.cancelAll()
            return
    }

    public void createNotificationChannel(android.app.NotificationChannel r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            r0.createNotificationChannel(r3)
        Lb:
            return
    }

    public void createNotificationChannel(androidx.core.app.NotificationChannelCompat r1) {
            r0 = this;
            android.app.NotificationChannel r1 = r1.getNotificationChannel()
            r0.createNotificationChannel(r1)
            return
    }

    public void createNotificationChannelGroup(android.app.NotificationChannelGroup r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            r0.createNotificationChannelGroup(r3)
        Lb:
            return
    }

    public void createNotificationChannelGroup(androidx.core.app.NotificationChannelGroupCompat r1) {
            r0 = this;
            android.app.NotificationChannelGroup r1 = r1.getNotificationChannelGroup()
            r0.createNotificationChannelGroup(r1)
            return
    }

    public void createNotificationChannelGroups(java.util.List<android.app.NotificationChannelGroup> r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            r0.createNotificationChannelGroups(r3)
        Lb:
            return
    }

    public void createNotificationChannelGroupsCompat(java.util.List<androidx.core.app.NotificationChannelGroupCompat> r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L32
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L32
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r3.next()
            androidx.core.app.NotificationChannelGroupCompat r1 = (androidx.core.app.NotificationChannelGroupCompat) r1
            android.app.NotificationChannelGroup r1 = r1.getNotificationChannelGroup()
            r0.add(r1)
            goto L19
        L2d:
            android.app.NotificationManager r3 = r2.mNotificationManager
            r3.createNotificationChannelGroups(r0)
        L32:
            return
    }

    public void createNotificationChannels(java.util.List<android.app.NotificationChannel> r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            r0.createNotificationChannels(r3)
        Lb:
            return
    }

    public void createNotificationChannelsCompat(java.util.List<androidx.core.app.NotificationChannelCompat> r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L32
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L32
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r3.next()
            androidx.core.app.NotificationChannelCompat r1 = (androidx.core.app.NotificationChannelCompat) r1
            android.app.NotificationChannel r1 = r1.getNotificationChannel()
            r0.add(r1)
            goto L19
        L2d:
            android.app.NotificationManager r3 = r2.mNotificationManager
            r3.createNotificationChannels(r0)
        L32:
            return
    }

    public void deleteNotificationChannel(java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            r0.deleteNotificationChannel(r3)
        Lb:
            return
    }

    public void deleteNotificationChannelGroup(java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.app.NotificationManager r0 = r2.mNotificationManager
            r0.deleteNotificationChannelGroup(r3)
        Lb:
            return
    }

    public void deleteUnlistedNotificationChannels(java.util.Collection<java.lang.String> r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L42
            android.app.NotificationManager r0 = r4.mNotificationManager
            java.util.List r0 = r0.getNotificationChannels()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            android.app.NotificationChannel r1 = (android.app.NotificationChannel) r1
            java.lang.String r2 = r1.getId()
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L27
            goto L10
        L27:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L38
            java.lang.String r2 = r1.getParentChannelId()
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L38
            goto L10
        L38:
            android.app.NotificationManager r2 = r4.mNotificationManager
            java.lang.String r1 = r1.getId()
            r2.deleteNotificationChannel(r1)
            goto L10
        L42:
            return
    }

    public int getImportance() {
            r1 = this;
            android.app.NotificationManager r0 = r1.mNotificationManager
            int r0 = r0.getImportance()
            return r0
    }

    public android.app.NotificationChannel getNotificationChannel(java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            android.app.NotificationChannel r3 = r0.getNotificationChannel(r3)
            return r3
        Ld:
            r3 = 0
            return r3
    }

    public android.app.NotificationChannel getNotificationChannel(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            android.app.NotificationChannel r3 = r0.getNotificationChannel(r3, r4)
            return r3
        Ld:
            android.app.NotificationChannel r3 = r2.getNotificationChannel(r3)
            return r3
    }

    public androidx.core.app.NotificationChannelCompat getNotificationChannelCompat(java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L12
            android.app.NotificationChannel r3 = r2.getNotificationChannel(r3)
            if (r3 == 0) goto L12
            androidx.core.app.NotificationChannelCompat r0 = new androidx.core.app.NotificationChannelCompat
            r0.<init>(r3)
            return r0
        L12:
            r3 = 0
            return r3
    }

    public androidx.core.app.NotificationChannelCompat getNotificationChannelCompat(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L12
            android.app.NotificationChannel r3 = r2.getNotificationChannel(r3, r4)
            if (r3 == 0) goto L12
            androidx.core.app.NotificationChannelCompat r4 = new androidx.core.app.NotificationChannelCompat
            r4.<init>(r3)
            return r4
        L12:
            r3 = 0
            return r3
    }

    public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r4.mNotificationManager
            android.app.NotificationChannelGroup r5 = r0.getNotificationChannelGroup(r5)
            return r5
        Ld:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 < r1) goto L33
            java.util.List r0 = r4.getNotificationChannelGroups()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            android.app.NotificationChannelGroup r1 = (android.app.NotificationChannelGroup) r1
            java.lang.String r3 = r1.getId()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1c
            return r1
        L33:
            return r2
    }

    public androidx.core.app.NotificationChannelGroupCompat getNotificationChannelGroupCompat(java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L12
            android.app.NotificationChannelGroup r3 = r2.getNotificationChannelGroup(r3)
            if (r3 == 0) goto L28
            androidx.core.app.NotificationChannelGroupCompat r0 = new androidx.core.app.NotificationChannelGroupCompat
            r0.<init>(r3)
            return r0
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L28
            android.app.NotificationChannelGroup r3 = r2.getNotificationChannelGroup(r3)
            if (r3 == 0) goto L28
            androidx.core.app.NotificationChannelGroupCompat r0 = new androidx.core.app.NotificationChannelGroupCompat
            java.util.List r1 = r2.getNotificationChannels()
            r0.<init>(r3, r1)
            return r0
        L28:
            r3 = 0
            return r3
    }

    public java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            java.util.List r0 = r0.getNotificationChannelGroups()
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public java.util.List<androidx.core.app.NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L4f
            java.util.List r0 = r6.getNotificationChannelGroups()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L4f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L1b
            java.util.List r1 = java.util.Collections.emptyList()
            goto L1f
        L1b:
            java.util.List r1 = r6.getNotificationChannels()
        L1f:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.size()
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r0.next()
            android.app.NotificationChannelGroup r4 = (android.app.NotificationChannelGroup) r4
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L45
            androidx.core.app.NotificationChannelGroupCompat r5 = new androidx.core.app.NotificationChannelGroupCompat
            r5.<init>(r4)
            r3.add(r5)
            goto L2c
        L45:
            androidx.core.app.NotificationChannelGroupCompat r5 = new androidx.core.app.NotificationChannelGroupCompat
            r5.<init>(r4, r1)
            r3.add(r5)
            goto L2c
        L4e:
            return r3
        L4f:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public java.util.List<android.app.NotificationChannel> getNotificationChannels() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.app.NotificationManager r0 = r2.mNotificationManager
            java.util.List r0 = r0.getNotificationChannels()
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public java.util.List<androidx.core.app.NotificationChannelCompat> getNotificationChannelsCompat() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L33
            java.util.List r0 = r4.getNotificationChannels()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L33
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            android.app.NotificationChannel r2 = (android.app.NotificationChannel) r2
            androidx.core.app.NotificationChannelCompat r3 = new androidx.core.app.NotificationChannelCompat
            r3.<init>(r2)
            r1.add(r3)
            goto L1d
        L32:
            return r1
        L33:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public void notify(int r2, android.app.Notification r3) {
            r1 = this;
            r0 = 0
            r1.notify(r0, r2, r3)
            return
    }

    public void notify(java.lang.String r3, int r4, android.app.Notification r5) {
            r2 = this;
            boolean r0 = useSideChannelForNotification(r5)
            if (r0 == 0) goto L1a
            androidx.core.app.NotificationManagerCompat$NotifyTask r0 = new androidx.core.app.NotificationManagerCompat$NotifyTask
            android.content.Context r1 = r2.mContext
            java.lang.String r1 = r1.getPackageName()
            r0.<init>(r1, r4, r3, r5)
            r2.pushSideChannelQueue(r0)
            android.app.NotificationManager r5 = r2.mNotificationManager
            r5.cancel(r3, r4)
            goto L1f
        L1a:
            android.app.NotificationManager r0 = r2.mNotificationManager
            r0.notify(r3, r4, r5)
        L1f:
            return
    }
}
