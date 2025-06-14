package com.xuexiang.xhttp2.cookie;

/* loaded from: classes.dex */
public class SerializableOkHttpCookies implements java.io.Serializable {
    private transient okhttp3.Cookie clientCookies;
    private final transient okhttp3.Cookie cookies;

    public SerializableOkHttpCookies(okhttp3.Cookie r1) {
            r0 = this;
            r0.<init>()
            r0.cookies = r1
            return
    }

    private void readObject(java.io.ObjectInputStream r10) throws java.io.IOException, java.lang.ClassNotFoundException {
            r9 = this;
            java.lang.Object r0 = r10.readObject()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r10.readObject()
            java.lang.String r1 = (java.lang.String) r1
            long r2 = r10.readLong()
            java.lang.Object r4 = r10.readObject()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.readObject()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r10.readBoolean()
            boolean r7 = r10.readBoolean()
            boolean r10 = r10.readBoolean()
            okhttp3.Cookie$Builder r8 = new okhttp3.Cookie$Builder
            r8.<init>()
            r8.name(r0)
            r8.value(r1)
            r8.expiresAt(r2)
            if (r10 == 0) goto L3d
            okhttp3.Cookie$Builder r10 = r8.hostOnlyDomain(r4)
            goto L41
        L3d:
            okhttp3.Cookie$Builder r10 = r8.domain(r4)
        L41:
            r10.path(r5)
            if (r6 == 0) goto L49
            r10.secure()
        L49:
            if (r7 == 0) goto L4e
            r10.httpOnly()
        L4e:
            okhttp3.Cookie r10 = r10.build()
            r9.clientCookies = r10
            return
    }

    private void writeObject(java.io.ObjectOutputStream r3) throws java.io.IOException {
            r2 = this;
            okhttp3.Cookie r0 = r2.cookies
            java.lang.String r0 = r0.name()
            r3.writeObject(r0)
            okhttp3.Cookie r0 = r2.cookies
            java.lang.String r0 = r0.value()
            r3.writeObject(r0)
            okhttp3.Cookie r0 = r2.cookies
            long r0 = r0.expiresAt()
            r3.writeLong(r0)
            okhttp3.Cookie r0 = r2.cookies
            java.lang.String r0 = r0.domain()
            r3.writeObject(r0)
            okhttp3.Cookie r0 = r2.cookies
            java.lang.String r0 = r0.path()
            r3.writeObject(r0)
            okhttp3.Cookie r0 = r2.cookies
            boolean r0 = r0.secure()
            r3.writeBoolean(r0)
            okhttp3.Cookie r0 = r2.cookies
            boolean r0 = r0.httpOnly()
            r3.writeBoolean(r0)
            okhttp3.Cookie r0 = r2.cookies
            boolean r0 = r0.hostOnly()
            r3.writeBoolean(r0)
            okhttp3.Cookie r0 = r2.cookies
            boolean r0 = r0.persistent()
            r3.writeBoolean(r0)
            return
    }

    public okhttp3.Cookie getCookies() {
            r2 = this;
            okhttp3.Cookie r0 = r2.cookies
            okhttp3.Cookie r1 = r2.clientCookies
            if (r1 == 0) goto L7
            r0 = r1
        L7:
            return r0
    }
}
