package com.xuexiang.xhttp2.model;

/* loaded from: classes.dex */
public enum SchedulerType extends java.lang.Enum<com.xuexiang.xhttp2.model.SchedulerType> {
    private static final /* synthetic */ com.xuexiang.xhttp2.model.SchedulerType[] $VALUES = null;
    public static final com.xuexiang.xhttp2.model.SchedulerType _io = null;
    public static final com.xuexiang.xhttp2.model.SchedulerType _io_io = null;
    public static final com.xuexiang.xhttp2.model.SchedulerType _io_main = null;
    public static final com.xuexiang.xhttp2.model.SchedulerType _main = null;

    static {
            com.xuexiang.xhttp2.model.SchedulerType r0 = new com.xuexiang.xhttp2.model.SchedulerType
            java.lang.String r1 = "_main"
            r2 = 0
            r0.<init>(r1, r2)
            com.xuexiang.xhttp2.model.SchedulerType._main = r0
            com.xuexiang.xhttp2.model.SchedulerType r1 = new com.xuexiang.xhttp2.model.SchedulerType
            java.lang.String r3 = "_io"
            r4 = 1
            r1.<init>(r3, r4)
            com.xuexiang.xhttp2.model.SchedulerType._io = r1
            com.xuexiang.xhttp2.model.SchedulerType r3 = new com.xuexiang.xhttp2.model.SchedulerType
            java.lang.String r5 = "_io_main"
            r6 = 2
            r3.<init>(r5, r6)
            com.xuexiang.xhttp2.model.SchedulerType._io_main = r3
            com.xuexiang.xhttp2.model.SchedulerType r5 = new com.xuexiang.xhttp2.model.SchedulerType
            java.lang.String r7 = "_io_io"
            r8 = 3
            r5.<init>(r7, r8)
            com.xuexiang.xhttp2.model.SchedulerType._io_io = r5
            r7 = 4
            com.xuexiang.xhttp2.model.SchedulerType[] r7 = new com.xuexiang.xhttp2.model.SchedulerType[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.xuexiang.xhttp2.model.SchedulerType.$VALUES = r7
            return
    }

    SchedulerType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.xuexiang.xhttp2.model.SchedulerType valueOf(java.lang.String r1) {
            java.lang.Class<com.xuexiang.xhttp2.model.SchedulerType> r0 = com.xuexiang.xhttp2.model.SchedulerType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.xuexiang.xhttp2.model.SchedulerType r1 = (com.xuexiang.xhttp2.model.SchedulerType) r1
            return r1
    }

    public static com.xuexiang.xhttp2.model.SchedulerType[] values() {
            com.xuexiang.xhttp2.model.SchedulerType[] r0 = com.xuexiang.xhttp2.model.SchedulerType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.xuexiang.xhttp2.model.SchedulerType[] r0 = (com.xuexiang.xhttp2.model.SchedulerType[]) r0
            return r0
    }
}
