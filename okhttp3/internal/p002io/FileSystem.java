package okhttp3.internal.p002io;

/* loaded from: classes.dex */
public interface FileSystem {
    public static final okhttp3.internal.p002io.FileSystem SYSTEM = null;


    static {
            okhttp3.internal.io.FileSystem$1 r0 = new okhttp3.internal.io.FileSystem$1
            r0.<init>()
            okhttp3.internal.p002io.FileSystem.SYSTEM = r0
            return
    }

    okio.Sink appendingSink(java.io.File r1) throws java.io.FileNotFoundException;

    void delete(java.io.File r1) throws java.io.IOException;

    void deleteContents(java.io.File r1) throws java.io.IOException;

    boolean exists(java.io.File r1);

    void rename(java.io.File r1, java.io.File r2) throws java.io.IOException;

    okio.Sink sink(java.io.File r1) throws java.io.FileNotFoundException;

    long size(java.io.File r1);

    okio.Source source(java.io.File r1) throws java.io.FileNotFoundException;
}
