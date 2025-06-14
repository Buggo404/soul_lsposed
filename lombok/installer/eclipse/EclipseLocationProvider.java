package lombok.installer.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/EclipseLocationProvider.SCL.lombok */
public class EclipseLocationProvider extends lombok.installer.eclipse.EclipseProductLocationProvider {
    private static final lombok.installer.eclipse.EclipseProductDescriptor ECLIPSE = null;

    static {
            lombok.installer.eclipse.StandardProductDescriptor r0 = new lombok.installer.eclipse.StandardProductDescriptor
            r1 = r0
            java.lang.String r2 = "Eclipse"
            java.lang.String r3 = "eclipse"
            java.lang.String r4 = "eclipse"
            java.lang.Class<lombok.installer.eclipse.EclipseLocationProvider> r5 = lombok.installer.eclipse.EclipseLocationProvider.class
            java.lang.String r6 = "eclipse.png"
            java.net.URL r5 = r5.getResource(r6)
            java.util.Set r6 = java.util.Collections.emptySet()
            r1.<init>(r2, r3, r4, r5, r6)
            lombok.installer.eclipse.EclipseLocationProvider.ECLIPSE = r0
            return
    }

    public EclipseLocationProvider() {
            r3 = this;
            r0 = r3
            lombok.installer.eclipse.EclipseProductDescriptor r1 = lombok.installer.eclipse.EclipseLocationProvider.ECLIPSE
            r0.<init>(r1)
            return
    }
}
