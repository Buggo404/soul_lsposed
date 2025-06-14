package lombok.installer;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/IdeLocation.SCL.lombok */
public abstract class IdeLocation {
    boolean selected;

    public IdeLocation() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 1
            r0.selected = r1
            return
    }

    public abstract java.lang.String install() throws lombok.installer.InstallException;

    public abstract void uninstall() throws lombok.installer.UninstallException;

    public abstract java.lang.String getName();

    public abstract boolean hasLombok();

    public abstract java.net.URL getIdeIcon();

    public static java.io.File findOurJar() {
            java.io.File r0 = new java.io.File
            r1 = r0
            java.lang.Class<lombok.installer.OsUtils> r2 = lombok.installer.OsUtils.class
            java.lang.String r2 = lombok.patcher.ClassRootFinder.findClassRootOfClass(r2)
            r1.<init>(r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getName()
            return r0
    }

    public static java.lang.String canonical(java.io.File r2) {
            r0 = r2
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = r2
            java.lang.String r0 = r0.getAbsolutePath()
            r3 = r0
            r0 = r3
            if (r0 != 0) goto L16
            r0 = r2
            java.lang.String r0 = r0.getPath()
            goto L17
        L16:
            r0 = r3
        L17:
            return r0
    }
}
