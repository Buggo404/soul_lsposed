package lombok.javac.apt;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/apt/MessagerDiagnosticsReceiver.SCL.lombok */
public class MessagerDiagnosticsReceiver implements lombok.core.DiagnosticsReceiver {
    private final javax.annotation.processing.Messager messager;

    public MessagerDiagnosticsReceiver(javax.annotation.processing.Messager r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.messager = r1
            return
    }

    @Override // lombok.core.DiagnosticsReceiver
    public void addWarning(java.lang.String r5) {
            r4 = this;
            r0 = r4
            javax.annotation.processing.Messager r0 = r0.messager
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.WARNING
            r2 = r5
            r0.printMessage(r1, r2)
            return
    }

    @Override // lombok.core.DiagnosticsReceiver
    public void addError(java.lang.String r5) {
            r4 = this;
            r0 = r4
            javax.annotation.processing.Messager r0 = r0.messager
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.ERROR
            r2 = r5
            r0.printMessage(r1, r2)
            return
    }
}
