package lombok.installer;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/CorruptedIdeLocationException.SCL.lombok */
public class CorruptedIdeLocationException extends java.lang.Exception {
    private final java.lang.String ideType;

    public CorruptedIdeLocationException(java.lang.String r5, java.lang.String r6, java.lang.Throwable r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r0.ideType = r1
            return
    }

    public java.lang.String getIdeType() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.ideType
            return r0
    }

    void showDialog(javax.swing.JFrame r7) {
            r6 = this;
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Cannot configure "
            r3.<init>(r4)
            r3 = r6
            java.lang.String r3 = r3.ideType
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " installation"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 2
            javax.swing.JOptionPane.showMessageDialog(r0, r1, r2, r3)
            return
    }
}
