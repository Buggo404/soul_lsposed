package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class Registry {
    private static final androidx.constraintlayout.core.state.Registry sRegistry = null;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> mCallbacks;

    static {
            androidx.constraintlayout.core.state.Registry r0 = new androidx.constraintlayout.core.state.Registry
            r0.<init>()
            androidx.constraintlayout.core.state.Registry.sRegistry = r0
            return
    }

    public Registry() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCallbacks = r0
            return
    }

    public static androidx.constraintlayout.core.state.Registry getInstance() {
            androidx.constraintlayout.core.state.Registry r0 = androidx.constraintlayout.core.state.Registry.sRegistry
            return r0
    }

    public java.lang.String currentContent(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> r0 = r1.mCallbacks
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.RegistryCallback r2 = (androidx.constraintlayout.core.state.RegistryCallback) r2
            if (r2 == 0) goto Lf
            java.lang.String r2 = r2.currentMotionScene()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public java.lang.String currentLayoutInformation(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> r0 = r1.mCallbacks
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.RegistryCallback r2 = (androidx.constraintlayout.core.state.RegistryCallback) r2
            if (r2 == 0) goto Lf
            java.lang.String r2 = r2.currentLayoutInformation()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public long getLastModified(java.lang.String r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> r0 = r2.mCallbacks
            java.lang.Object r3 = r0.get(r3)
            androidx.constraintlayout.core.state.RegistryCallback r3 = (androidx.constraintlayout.core.state.RegistryCallback) r3
            if (r3 == 0) goto Lf
            long r0 = r3.getLastModified()
            return r0
        Lf:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
    }

    public java.util.Set<java.lang.String> getLayoutList() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> r0 = r1.mCallbacks
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public void register(java.lang.String r2, androidx.constraintlayout.core.state.RegistryCallback r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> r0 = r1.mCallbacks
            r0.put(r2, r3)
            return
    }

    public void setDrawDebug(java.lang.String r2, int r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> r0 = r1.mCallbacks
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.RegistryCallback r2 = (androidx.constraintlayout.core.state.RegistryCallback) r2
            if (r2 == 0) goto Ld
            r2.setDrawDebug(r3)
        Ld:
            return
    }

    public void setLayoutInformationMode(java.lang.String r2, int r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> r0 = r1.mCallbacks
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.RegistryCallback r2 = (androidx.constraintlayout.core.state.RegistryCallback) r2
            if (r2 == 0) goto Ld
            r2.setLayoutInformationMode(r3)
        Ld:
            return
    }

    public void unregister(java.lang.String r1, androidx.constraintlayout.core.state.RegistryCallback r2) {
            r0 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> r2 = r0.mCallbacks
            r2.remove(r1)
            return
    }

    public void updateContent(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> r0 = r1.mCallbacks
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.RegistryCallback r2 = (androidx.constraintlayout.core.state.RegistryCallback) r2
            if (r2 == 0) goto Ld
            r2.onNewMotionScene(r3)
        Ld:
            return
    }

    public void updateDimensions(java.lang.String r2, int r3, int r4) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> r0 = r1.mCallbacks
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.RegistryCallback r2 = (androidx.constraintlayout.core.state.RegistryCallback) r2
            if (r2 == 0) goto Ld
            r2.onDimensions(r3, r4)
        Ld:
            return
    }

    public void updateProgress(java.lang.String r2, float r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> r0 = r1.mCallbacks
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.RegistryCallback r2 = (androidx.constraintlayout.core.state.RegistryCallback) r2
            if (r2 == 0) goto Ld
            r2.onProgress(r3)
        Ld:
            return
    }
}
