package lombok.patcher;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/StackRequest.SCL.lombok */
public enum StackRequest extends java.lang.Enum<lombok.patcher.StackRequest> {
    public static final lombok.patcher.StackRequest RETURN_VALUE = null;
    public static final lombok.patcher.StackRequest THIS = null;
    public static final lombok.patcher.StackRequest PARAM1 = null;
    public static final lombok.patcher.StackRequest PARAM2 = null;
    public static final lombok.patcher.StackRequest PARAM3 = null;
    public static final lombok.patcher.StackRequest PARAM4 = null;
    public static final lombok.patcher.StackRequest PARAM5 = null;
    public static final lombok.patcher.StackRequest PARAM6 = null;
    private final int paramPos;
    public static final java.util.List<lombok.patcher.StackRequest> PARAMS_IN_ORDER = null;
    private static final /* synthetic */ lombok.patcher.StackRequest[] ENUM$VALUES = null;

    static {
            lombok.patcher.StackRequest r0 = new lombok.patcher.StackRequest
            r1 = r0
            java.lang.String r2 = "RETURN_VALUE"
            r3 = 0
            r4 = -1
            r1.<init>(r2, r3, r4)
            lombok.patcher.StackRequest.RETURN_VALUE = r0
            lombok.patcher.StackRequest r0 = new lombok.patcher.StackRequest
            r1 = r0
            java.lang.String r2 = "THIS"
            r3 = 1
            r4 = -1
            r1.<init>(r2, r3, r4)
            lombok.patcher.StackRequest.THIS = r0
            lombok.patcher.StackRequest r0 = new lombok.patcher.StackRequest
            r1 = r0
            java.lang.String r2 = "PARAM1"
            r3 = 2
            r4 = 0
            r1.<init>(r2, r3, r4)
            lombok.patcher.StackRequest.PARAM1 = r0
            lombok.patcher.StackRequest r0 = new lombok.patcher.StackRequest
            r1 = r0
            java.lang.String r2 = "PARAM2"
            r3 = 3
            r4 = 1
            r1.<init>(r2, r3, r4)
            lombok.patcher.StackRequest.PARAM2 = r0
            lombok.patcher.StackRequest r0 = new lombok.patcher.StackRequest
            r1 = r0
            java.lang.String r2 = "PARAM3"
            r3 = 4
            r4 = 2
            r1.<init>(r2, r3, r4)
            lombok.patcher.StackRequest.PARAM3 = r0
            lombok.patcher.StackRequest r0 = new lombok.patcher.StackRequest
            r1 = r0
            java.lang.String r2 = "PARAM4"
            r3 = 5
            r4 = 3
            r1.<init>(r2, r3, r4)
            lombok.patcher.StackRequest.PARAM4 = r0
            lombok.patcher.StackRequest r0 = new lombok.patcher.StackRequest
            r1 = r0
            java.lang.String r2 = "PARAM5"
            r3 = 6
            r4 = 4
            r1.<init>(r2, r3, r4)
            lombok.patcher.StackRequest.PARAM5 = r0
            lombok.patcher.StackRequest r0 = new lombok.patcher.StackRequest
            r1 = r0
            java.lang.String r2 = "PARAM6"
            r3 = 7
            r4 = 5
            r1.<init>(r2, r3, r4)
            lombok.patcher.StackRequest.PARAM6 = r0
            r0 = 8
            lombok.patcher.StackRequest[] r0 = new lombok.patcher.StackRequest[r0]
            r1 = r0
            r2 = 0
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.RETURN_VALUE
            r1[r2] = r3
            r1 = r0
            r2 = 1
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.THIS
            r1[r2] = r3
            r1 = r0
            r2 = 2
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.PARAM1
            r1[r2] = r3
            r1 = r0
            r2 = 3
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.PARAM2
            r1[r2] = r3
            r1 = r0
            r2 = 4
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.PARAM3
            r1[r2] = r3
            r1 = r0
            r2 = 5
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.PARAM4
            r1[r2] = r3
            r1 = r0
            r2 = 6
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.PARAM5
            r1[r2] = r3
            r1 = r0
            r2 = 7
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.PARAM6
            r1[r2] = r3
            lombok.patcher.StackRequest.ENUM$VALUES = r0
            r0 = 6
            lombok.patcher.StackRequest[] r0 = new lombok.patcher.StackRequest[r0]
            r1 = r0
            r2 = 0
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.PARAM1
            r1[r2] = r3
            r1 = r0
            r2 = 1
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.PARAM2
            r1[r2] = r3
            r1 = r0
            r2 = 2
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.PARAM3
            r1[r2] = r3
            r1 = r0
            r2 = 3
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.PARAM4
            r1[r2] = r3
            r1 = r0
            r2 = 4
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.PARAM5
            r1[r2] = r3
            r1 = r0
            r2 = 5
            lombok.patcher.StackRequest r3 = lombok.patcher.StackRequest.PARAM6
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            lombok.patcher.StackRequest.PARAMS_IN_ORDER = r0
            return
    }

    StackRequest(java.lang.String r5, int r6, int r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r7
            r0.paramPos = r1
            return
    }

    public int getParamPos() {
            r2 = this;
            r0 = r2
            int r0 = r0.paramPos
            return r0
    }

    public static lombok.patcher.StackRequest[] values() {
            lombok.patcher.StackRequest[] r0 = lombok.patcher.StackRequest.ENUM$VALUES
            r1 = r0
            r6 = r1
            r1 = 0
            r2 = r6
            int r2 = r2.length
            r3 = r2
            r7 = r3
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r8 = r3
            r3 = 0
            r4 = r7
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            return r0
    }

    public static lombok.patcher.StackRequest valueOf(java.lang.String r3) {
            java.lang.Class<lombok.patcher.StackRequest> r0 = lombok.patcher.StackRequest.class
            r1 = r3
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            lombok.patcher.StackRequest r0 = (lombok.patcher.StackRequest) r0
            return r0
    }
}
