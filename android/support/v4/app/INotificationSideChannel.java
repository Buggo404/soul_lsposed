package android.support.v4.app;

/* loaded from: classes.dex */
public interface INotificationSideChannel extends android.os.IInterface {

    public static class Default implements android.support.v4.app.INotificationSideChannel {
        public Default() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(java.lang.String r1, int r2, java.lang.String r3) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(java.lang.String r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.support.v4.app.INotificationSideChannel {
        private static final java.lang.String DESCRIPTOR = "android.support.v4.app.INotificationSideChannel";
        static final int TRANSACTION_cancel = 2;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_notify = 1;

        private static class Proxy implements android.support.v4.app.INotificationSideChannel {
            public static android.support.v4.app.INotificationSideChannel sDefaultImpl;
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mRemote = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.mRemote
                    return r0
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancel(java.lang.String r6, int r7, java.lang.String r8) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.app.INotificationSideChannel"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L32
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L32
                    r0.writeString(r8)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r1 = r5.mRemote     // Catch: java.lang.Throwable -> L32
                    r2 = 0
                    r3 = 1
                    r4 = 2
                    boolean r1 = r1.transact(r4, r0, r2, r3)     // Catch: java.lang.Throwable -> L32
                    if (r1 != 0) goto L2e
                    android.support.v4.app.INotificationSideChannel r1 = android.support.v4.app.INotificationSideChannel.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L32
                    if (r1 == 0) goto L2e
                    android.support.v4.app.INotificationSideChannel r1 = android.support.v4.app.INotificationSideChannel.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L32
                    r1.cancel(r6, r7, r8)     // Catch: java.lang.Throwable -> L32
                    r0.recycle()
                    return
                L2e:
                    r0.recycle()
                    return
                L32:
                    r6 = move-exception
                    r0.recycle()
                    throw r6
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancelAll(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.app.INotificationSideChannel"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L2c
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r1 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r2 = 0
                    r3 = 1
                    r4 = 3
                    boolean r1 = r1.transact(r4, r0, r2, r3)     // Catch: java.lang.Throwable -> L2c
                    if (r1 != 0) goto L28
                    android.support.v4.app.INotificationSideChannel r1 = android.support.v4.app.INotificationSideChannel.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r1 == 0) goto L28
                    android.support.v4.app.INotificationSideChannel r1 = android.support.v4.app.INotificationSideChannel.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    r1.cancelAll(r6)     // Catch: java.lang.Throwable -> L2c
                    r0.recycle()
                    return
                L28:
                    r0.recycle()
                    return
                L2c:
                    r6 = move-exception
                    r0.recycle()
                    throw r6
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "android.support.v4.app.INotificationSideChannel"
                    return r0
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void notify(java.lang.String r5, int r6, java.lang.String r7, android.app.Notification r8) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.app.INotificationSideChannel"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L3e
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L3e
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L3e
                    r0.writeString(r7)     // Catch: java.lang.Throwable -> L3e
                    r1 = 0
                    r2 = 1
                    if (r8 == 0) goto L1d
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L3e
                    r8.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L3e
                    goto L20
                L1d:
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L3e
                L20:
                    android.os.IBinder r1 = r4.mRemote     // Catch: java.lang.Throwable -> L3e
                    r3 = 0
                    boolean r1 = r1.transact(r2, r0, r3, r2)     // Catch: java.lang.Throwable -> L3e
                    if (r1 != 0) goto L3a
                    android.support.v4.app.INotificationSideChannel r1 = android.support.v4.app.INotificationSideChannel.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L3e
                    if (r1 == 0) goto L3a
                    android.support.v4.app.INotificationSideChannel r1 = android.support.v4.app.INotificationSideChannel.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L3e
                    r1.notify(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3e
                    r0.recycle()
                    return
                L3a:
                    r0.recycle()
                    return
                L3e:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "android.support.v4.app.INotificationSideChannel"
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.v4.app.INotificationSideChannel asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "android.support.v4.app.INotificationSideChannel"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.v4.app.INotificationSideChannel
                if (r1 == 0) goto L13
                android.support.v4.app.INotificationSideChannel r0 = (android.support.v4.app.INotificationSideChannel) r0
                return r0
            L13:
                android.support.v4.app.INotificationSideChannel$Stub$Proxy r0 = new android.support.v4.app.INotificationSideChannel$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static android.support.v4.app.INotificationSideChannel getDefaultImpl() {
                android.support.v4.app.INotificationSideChannel r0 = android.support.v4.app.INotificationSideChannel.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(android.support.v4.app.INotificationSideChannel r1) {
                android.support.v4.app.INotificationSideChannel r0 = android.support.v4.app.INotificationSideChannel.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                android.support.v4.app.INotificationSideChannel.Stub.Proxy.sDefaultImpl = r1
                r1 = 1
                return r1
            La:
                r1 = 0
                return r1
            Lc:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "setDefaultImpl() called twice"
                r1.<init>(r0)
                throw r1
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
                r3 = this;
                r0 = 1
                java.lang.String r1 = "android.support.v4.app.INotificationSideChannel"
                if (r4 == r0) goto L37
                r2 = 2
                if (r4 == r2) goto L24
                r2 = 3
                if (r4 == r2) goto L19
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L15
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L15:
                r6.writeString(r1)
                return r0
            L19:
                r5.enforceInterface(r1)
                java.lang.String r4 = r5.readString()
                r3.cancelAll(r4)
                return r0
            L24:
                r5.enforceInterface(r1)
                java.lang.String r4 = r5.readString()
                int r6 = r5.readInt()
                java.lang.String r5 = r5.readString()
                r3.cancel(r4, r6, r5)
                return r0
            L37:
                r5.enforceInterface(r1)
                java.lang.String r4 = r5.readString()
                int r6 = r5.readInt()
                java.lang.String r7 = r5.readString()
                int r1 = r5.readInt()
                if (r1 == 0) goto L55
                android.os.Parcelable$Creator r1 = android.app.Notification.CREATOR
                java.lang.Object r5 = r1.createFromParcel(r5)
                android.app.Notification r5 = (android.app.Notification) r5
                goto L56
            L55:
                r5 = 0
            L56:
                r3.notify(r4, r6, r7, r5)
                return r0
        }
    }

    void cancel(java.lang.String r1, int r2, java.lang.String r3) throws android.os.RemoteException;

    void cancelAll(java.lang.String r1) throws android.os.RemoteException;

    void notify(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) throws android.os.RemoteException;
}
