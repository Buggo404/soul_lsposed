package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public interface RegistryCallback {
    java.lang.String currentLayoutInformation();

    java.lang.String currentMotionScene();

    long getLastModified();

    void onDimensions(int r1, int r2);

    void onNewMotionScene(java.lang.String r1);

    void onProgress(float r1);

    void setDrawDebug(int r1);

    void setLayoutInformationMode(int r1);
}
