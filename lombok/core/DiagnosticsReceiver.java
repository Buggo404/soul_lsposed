package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/DiagnosticsReceiver.SCL.lombok */
public interface DiagnosticsReceiver {
    public static final lombok.core.DiagnosticsReceiver CONSOLE = null;


    static {
            lombok.core.DiagnosticsReceiver$1 r0 = new lombok.core.DiagnosticsReceiver$1
            r1 = r0
            r1.<init>()
            lombok.core.DiagnosticsReceiver.CONSOLE = r0
            return
    }

    void addError(java.lang.String r1);

    void addWarning(java.lang.String r1);
}
