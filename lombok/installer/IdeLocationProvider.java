package lombok.installer;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/IdeLocationProvider.SCL.lombok */
public interface IdeLocationProvider {
    lombok.installer.IdeLocation create(java.lang.String r1) throws lombok.installer.CorruptedIdeLocationException;

    java.util.regex.Pattern getLocationSelectors();

    void findIdes(java.util.List<lombok.installer.IdeLocation> r1, java.util.List<lombok.installer.CorruptedIdeLocationException> r2);
}
