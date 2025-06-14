package androidx.constraintlayout.motion.widget;

/* compiled from: DesignTool.java */
/* loaded from: classes.dex */
interface ProxyInterface {
    int designAccess(int r1, java.lang.String r2, java.lang.Object r3, float[] r4, int r5, float[] r6, int r7);

    float getKeyFramePosition(java.lang.Object r1, int r2, float r3, float r4);

    java.lang.Object getKeyframeAtLocation(java.lang.Object r1, float r2, float r3);

    java.lang.Boolean getPositionKeyframe(java.lang.Object r1, java.lang.Object r2, float r3, float r4, java.lang.String[] r5, float[] r6);

    long getTransitionTimeMs();

    void setAttributes(int r1, java.lang.String r2, java.lang.Object r3, java.lang.Object r4);

    void setKeyFrame(java.lang.Object r1, int r2, java.lang.String r3, java.lang.Object r4);

    boolean setKeyFramePosition(java.lang.Object r1, int r2, int r3, float r4, float r5);

    void setToolPosition(float r1);
}
