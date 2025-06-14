package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class KeyCache {
    java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> map;

    public KeyCache() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.map = r0
            return
    }

    public float getFloatValue(java.lang.Object r3, java.lang.String r4, int r5) {
            r2 = this;
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> r0 = r2.map
            boolean r0 = r0.containsKey(r3)
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> r0 = r2.map
            java.lang.Object r3 = r0.get(r3)
            java.util.HashMap r3 = (java.util.HashMap) r3
            if (r3 == 0) goto L2b
            boolean r0 = r3.containsKey(r4)
            if (r0 != 0) goto L1c
            goto L2b
        L1c:
            java.lang.Object r3 = r3.get(r4)
            float[] r3 = (float[]) r3
            if (r3 != 0) goto L25
            return r1
        L25:
            int r4 = r3.length
            if (r4 <= r5) goto L2b
            r3 = r3[r5]
            return r3
        L2b:
            return r1
    }

    public void setFloatValue(java.lang.Object r3, java.lang.String r4, int r5, float r6) {
            r2 = this;
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> r0 = r2.map
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L1c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r5 + 1
            float[] r1 = new float[r1]
            r1[r5] = r6
            r0.put(r4, r1)
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> r4 = r2.map
            r4.put(r3, r0)
            goto L59
        L1c:
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> r0 = r2.map
            java.lang.Object r0 = r0.get(r3)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 != 0) goto L2b
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L2b:
            boolean r1 = r0.containsKey(r4)
            if (r1 != 0) goto L40
            int r1 = r5 + 1
            float[] r1 = new float[r1]
            r1[r5] = r6
            r0.put(r4, r1)
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> r4 = r2.map
            r4.put(r3, r0)
            goto L59
        L40:
            java.lang.Object r3 = r0.get(r4)
            float[] r3 = (float[]) r3
            if (r3 != 0) goto L4b
            r3 = 0
            float[] r3 = new float[r3]
        L4b:
            int r1 = r3.length
            if (r1 > r5) goto L54
            int r1 = r5 + 1
            float[] r3 = java.util.Arrays.copyOf(r3, r1)
        L54:
            r3[r5] = r6
            r0.put(r4, r3)
        L59:
            return
    }
}
