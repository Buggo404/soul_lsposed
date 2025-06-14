package lombok.patcher;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/TargetMatcher.SCL.lombok */
public interface TargetMatcher {
    java.util.Collection<java.lang.String> getAffectedClasses();

    boolean matches(java.lang.String r1, java.lang.String r2, java.lang.String r3);

    java.lang.String describe();
}
