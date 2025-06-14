package lombok.installer.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/eclipse/EclipseProductDescriptor.SCL.lombok */
public interface EclipseProductDescriptor {
    java.lang.String getProductName();

    java.lang.String getWindowsExecutableName();

    java.lang.String getUnixAppName();

    java.lang.String getMacAppName();

    java.lang.String getDirectoryName();

    java.util.List<java.lang.String> getExecutableNames();

    java.util.List<java.lang.String> getSourceDirsOnWindows();

    java.util.List<java.lang.String> getSourceDirsOnMac();

    java.util.List<java.lang.String> getSourceDirsOnUnix();

    java.lang.String getIniFileName();

    java.util.regex.Pattern getLocationSelectors();

    java.net.URL getIdeIcon();
}
