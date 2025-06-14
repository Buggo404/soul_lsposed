package lombok.installer.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/STS4LocationProvider.SCL.lombok */
public class STS4LocationProvider extends lombok.installer.eclipse.EclipseProductLocationProvider {
    private static final lombok.installer.eclipse.EclipseProductDescriptor STS4 = null;

    static {
            lombok.installer.eclipse.StandardProductDescriptor r0 = new lombok.installer.eclipse.StandardProductDescriptor
            r1 = r0
            java.lang.String r2 = "Spring Tools Suite 4"
            java.lang.String r3 = "SpringToolSuite4"
            java.lang.String r4 = "sts"
            java.lang.Class<lombok.installer.eclipse.STS4LocationProvider> r5 = lombok.installer.eclipse.STS4LocationProvider.class
            java.lang.String r6 = "STS.png"
            java.net.URL r5 = r5.getResource(r6)
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]
            r7 = r6
            r8 = 0
            java.lang.String r9 = "springsource"
            r7[r8] = r9
            r7 = r6
            r8 = 1
            java.lang.String r9 = "spring-tool-suite"
            r7[r8] = r9
            java.util.List r6 = java.util.Arrays.asList(r6)
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)
            r1.<init>(r2, r3, r4, r5, r6)
            lombok.installer.eclipse.STS4LocationProvider.STS4 = r0
            return
    }

    public STS4LocationProvider() {
            r3 = this;
            r0 = r3
            lombok.installer.eclipse.EclipseProductDescriptor r1 = lombok.installer.eclipse.STS4LocationProvider.STS4
            r0.<init>(r1)
            return
    }
}
