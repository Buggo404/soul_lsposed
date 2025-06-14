package lombok.installer.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/RhcrLocationProvider.SCL.lombok */
public class RhcrLocationProvider extends lombok.installer.eclipse.EclipseProductLocationProvider {
    private static final lombok.installer.eclipse.EclipseProductDescriptor RHCR = null;

    static {
            lombok.installer.eclipse.StandardProductDescriptor r0 = new lombok.installer.eclipse.StandardProductDescriptor
            r1 = r0
            java.lang.String r2 = "Red Hat CodeReady Studio"
            java.lang.String r3 = "codereadystudio"
            java.lang.String r4 = "studio"
            java.lang.Class<lombok.installer.eclipse.RhcrLocationProvider> r5 = lombok.installer.eclipse.RhcrLocationProvider.class
            java.lang.String r6 = "rhds.png"
            java.net.URL r5 = r5.getResource(r6)
            java.util.Set r6 = java.util.Collections.emptySet()
            r1.<init>(r2, r3, r4, r5, r6)
            lombok.installer.eclipse.RhcrLocationProvider.RHCR = r0
            return
    }

    public RhcrLocationProvider() {
            r3 = this;
            r0 = r3
            lombok.installer.eclipse.EclipseProductDescriptor r1 = lombok.installer.eclipse.RhcrLocationProvider.RHCR
            r0.<init>(r1)
            return
    }
}
