package lombok.installer.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/AngularIDELocationProvider.SCL.lombok */
public class AngularIDELocationProvider extends lombok.installer.eclipse.EclipseProductLocationProvider {
    private static final lombok.installer.eclipse.EclipseProductDescriptor ANGULAR = null;

    static {
            lombok.installer.eclipse.StandardProductDescriptor r0 = new lombok.installer.eclipse.StandardProductDescriptor
            r1 = r0
            java.lang.String r2 = "Angular IDE"
            java.lang.String r3 = "angularide"
            java.lang.String r4 = "angular"
            java.lang.Class<lombok.installer.eclipse.AngularIDELocationProvider> r5 = lombok.installer.eclipse.AngularIDELocationProvider.class
            java.lang.String r6 = "angular.png"
            java.net.URL r5 = r5.getResource(r6)
            java.util.Set r6 = java.util.Collections.emptySet()
            r1.<init>(r2, r3, r4, r5, r6)
            lombok.installer.eclipse.AngularIDELocationProvider.ANGULAR = r0
            return
    }

    public AngularIDELocationProvider() {
            r3 = this;
            r0 = r3
            lombok.installer.eclipse.EclipseProductDescriptor r1 = lombok.installer.eclipse.AngularIDELocationProvider.ANGULAR
            r0.<init>(r1)
            return
    }
}
