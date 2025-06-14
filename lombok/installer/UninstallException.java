package lombok.installer;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/UninstallException.SCL.lombok */
public class UninstallException extends java.lang.Exception {
    private boolean warning;

    public UninstallException(java.lang.String r5, java.lang.Throwable r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public UninstallException(boolean r5, java.lang.String r6, java.lang.Throwable r7) {
            r4 = this;
            r0 = r4
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.warning = r1
            return
    }

    public boolean isWarning() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.warning
            return r0
    }
}
