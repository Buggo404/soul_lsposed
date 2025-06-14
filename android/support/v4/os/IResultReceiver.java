package android.support.v4.os;

/* loaded from: classes.dex */
public interface IResultReceiver extends android.os.IInterface {

    public static class Default implements android.support.v4.os.IResultReceiver {
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

        @Override // android.support.v4.os.IResultReceiver
        public void send(int r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.support.v4.os.IResultReceiver {
        private static final java.lang.String DESCRIPTOR = "android.support.v4.os.IResultReceiver";
        static final int TRANSACTION_send = 1;

        private static class Proxy implements android.support.v4.os.IResultReceiver {
            public static android.support.v4.os.IResultReceiver sDefaultImpl;
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

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "android.support.v4.os.IResultReceiver"
                    return r0
            }

            @Override // android.support.v4.os.IResultReceiver
            public void send(int r5, android.os.Bundle r6) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.os.IResultReceiver"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L38
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L38
                    r1 = 0
                    r2 = 1
                    if (r6 == 0) goto L17
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L38
                    r6.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L38
                    goto L1a
                L17:
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L38
                L1a:
                    android.os.IBinder r1 = r4.mRemote     // Catch: java.lang.Throwable -> L38
                    r3 = 0
                    boolean r1 = r1.transact(r2, r0, r3, r2)     // Catch: java.lang.Throwable -> L38
                    if (r1 != 0) goto L34
                    android.support.v4.os.IResultReceiver r1 = android.support.v4.os.IResultReceiver.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L38
                    if (r1 == 0) goto L34
                    android.support.v4.os.IResultReceiver r1 = android.support.v4.os.IResultReceiver.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L38
                    r1.send(r5, r6)     // Catch: java.lang.Throwable -> L38
                    r0.recycle()
                    return
                L34:
                    r0.recycle()
                    return
                L38:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "android.support.v4.os.IResultReceiver"
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.v4.os.IResultReceiver asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "android.support.v4.os.IResultReceiver"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.v4.os.IResultReceiver
                if (r1 == 0) goto L13
                android.support.v4.os.IResultReceiver r0 = (android.support.v4.os.IResultReceiver) r0
                return r0
            L13:
                android.support.v4.os.IResultReceiver$Stub$Proxy r0 = new android.support.v4.os.IResultReceiver$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static android.support.v4.os.IResultReceiver getDefaultImpl() {
                android.support.v4.os.IResultReceiver r0 = android.support.v4.os.IResultReceiver.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(android.support.v4.os.IResultReceiver r1) {
                android.support.v4.os.IResultReceiver r0 = android.support.v4.os.IResultReceiver.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                android.support.v4.os.IResultReceiver.Stub.Proxy.sDefaultImpl = r1
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
                java.lang.String r1 = "android.support.v4.os.IResultReceiver"
                if (r4 == r0) goto L13
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto Lf
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            Lf:
                r6.writeString(r1)
                return r0
            L13:
                r5.enforceInterface(r1)
                int r4 = r5.readInt()
                int r6 = r5.readInt()
                if (r6 == 0) goto L29
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r6.createFromParcel(r5)
                android.os.Bundle r5 = (android.os.Bundle) r5
                goto L2a
            L29:
                r5 = 0
            L2a:
                r3.send(r4, r5)
                return r0
        }
    }

    void send(int r1, android.os.Bundle r2) throws android.os.RemoteException;
}
