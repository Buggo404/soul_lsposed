package lombok.installer;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/AppleNativeLook.SCL.lombok */
class AppleNativeLook {
    AppleNativeLook() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    /* renamed from: go */
    public static void m79go() throws java.lang.Exception {
            java.lang.String r0 = "com.apple.eawt.Application"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r7 = r0
            r0 = r7
            java.lang.String r1 = "getApplication"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r1 = 0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            r8 = r0
            r0 = r7
            java.lang.String r1 = "removeAboutMenuItem"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r1 = r8
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            r0 = r7
            java.lang.String r1 = "removePreferencesMenuItem"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r1 = r8
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Class<lombok.installer.AppleNativeLook> r0 = lombok.installer.AppleNativeLook.class
            java.lang.String r1 = "lombokIcon.png"
            java.net.URL r0 = r0.getResource(r1)
            java.awt.image.BufferedImage r0 = javax.imageio.ImageIO.read(r0)
            r9 = r0
            r0 = r7
            java.lang.String r1 = "setDockIconImage"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<java.awt.Image> r5 = java.awt.Image.class
            r3[r4] = r5
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r1 = r8
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            return
    }
}
