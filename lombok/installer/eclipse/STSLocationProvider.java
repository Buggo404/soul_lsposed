package lombok.installer.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/STSLocationProvider.SCL.lombok */
public class STSLocationProvider extends lombok.installer.eclipse.EclipseProductLocationProvider {
    private static final lombok.installer.eclipse.EclipseProductDescriptor STS = null;

    static {
            lombok.installer.eclipse.StandardProductDescriptor r0 = new lombok.installer.eclipse.StandardProductDescriptor
            r1 = r0
            java.lang.String r2 = "STS"
            java.lang.String r3 = "STS"
            java.lang.String r4 = "sts"
            java.lang.Class<lombok.installer.eclipse.STSLocationProvider> r5 = lombok.installer.eclipse.STSLocationProvider.class
            java.lang.String r6 = "STS.png"
            java.net.URL r5 = r5.getResource(r6)
            java.lang.String r6 = "springsource"
            java.util.Set r6 = java.util.Collections.singleton(r6)
            r1.<init>(r2, r3, r4, r5, r6)
            lombok.installer.eclipse.STSLocationProvider.STS = r0
            return
    }

    public STSLocationProvider() {
            r3 = this;
            r0 = r3
            lombok.installer.eclipse.EclipseProductDescriptor r1 = lombok.installer.eclipse.STSLocationProvider.STS
            r0.<init>(r1)
            return
    }
}
