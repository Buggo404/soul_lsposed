package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/LombokApp.SCL.lombok */
public abstract class LombokApp {
    public LombokApp() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public abstract int runApp(java.util.List<java.lang.String> r1) throws java.lang.Exception;

    public abstract java.lang.String getAppName();

    public abstract java.lang.String getAppDescription();

    public java.util.List<java.lang.String> getAppAliases() {
            r2 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public boolean isDebugTool() {
            r2 = this;
            r0 = 0
            return r0
    }
}
