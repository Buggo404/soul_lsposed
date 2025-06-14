package lombok.installer.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/MyEclipseLocationProvider.SCL.lombok */
public class MyEclipseLocationProvider extends lombok.installer.eclipse.EclipseProductLocationProvider {
    private static final lombok.installer.eclipse.EclipseProductDescriptor MY_ECLIPSE = null;

    static {
            lombok.installer.eclipse.StandardProductDescriptor r0 = new lombok.installer.eclipse.StandardProductDescriptor
            r1 = r0
            java.lang.String r2 = "MyEclipse"
            java.lang.String r3 = "myeclipse"
            java.lang.String r4 = "myeclipse"
            java.lang.Class<lombok.installer.eclipse.MyEclipseLocationProvider> r5 = lombok.installer.eclipse.MyEclipseLocationProvider.class
            java.lang.String r6 = "myeclipse.png"
            java.net.URL r5 = r5.getResource(r6)
            java.util.Set r6 = java.util.Collections.emptySet()
            r1.<init>(r2, r3, r4, r5, r6)
            lombok.installer.eclipse.MyEclipseLocationProvider.MY_ECLIPSE = r0
            return
    }

    public MyEclipseLocationProvider() {
            r3 = this;
            r0 = r3
            lombok.installer.eclipse.EclipseProductDescriptor r1 = lombok.installer.eclipse.MyEclipseLocationProvider.MY_ECLIPSE
            r0.<init>(r1)
            return
    }
}
