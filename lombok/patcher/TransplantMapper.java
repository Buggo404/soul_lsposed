package lombok.patcher;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/TransplantMapper.SCL.lombok */
public interface TransplantMapper {
    public static final lombok.patcher.TransplantMapper IDENTITY_MAPPER = null;


    static {
            lombok.patcher.TransplantMapper$1 r0 = new lombok.patcher.TransplantMapper$1
            r1 = r0
            r1.<init>()
            lombok.patcher.TransplantMapper.IDENTITY_MAPPER = r0
            return
    }

    java.lang.String mapResourceName(int r1, java.lang.String r2);
}
