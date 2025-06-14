package lombok.installer.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/JbdsLocationProvider.SCL.lombok */
public class JbdsLocationProvider extends lombok.installer.eclipse.EclipseProductLocationProvider {
    private static final lombok.installer.eclipse.EclipseProductDescriptor JBDS = null;

    static {
            lombok.installer.eclipse.StandardProductDescriptor r0 = new lombok.installer.eclipse.StandardProductDescriptor
            r1 = r0
            java.lang.String r2 = "JBoss Developer Studio"
            java.lang.String r3 = "jbdevstudio"
            java.lang.String r4 = "studio"
            java.lang.Class<lombok.installer.eclipse.JbdsLocationProvider> r5 = lombok.installer.eclipse.JbdsLocationProvider.class
            java.lang.String r6 = "jbds.png"
            java.net.URL r5 = r5.getResource(r6)
            java.util.Set r6 = java.util.Collections.emptySet()
            r1.<init>(r2, r3, r4, r5, r6)
            lombok.installer.eclipse.JbdsLocationProvider.JBDS = r0
            return
    }

    public JbdsLocationProvider() {
            r3 = this;
            r0 = r3
            lombok.installer.eclipse.EclipseProductDescriptor r1 = lombok.installer.eclipse.JbdsLocationProvider.JBDS
            r0.<init>(r1)
            return
    }
}
