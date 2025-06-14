package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/ImportList.SCL.lombok */
public interface ImportList {
    java.lang.String getFullyQualifiedNameForSimpleName(java.lang.String r1);

    java.lang.String getFullyQualifiedNameForSimpleNameNoAliasing(java.lang.String r1);

    boolean hasStarImport(java.lang.String r1);

    java.util.Collection<java.lang.String> applyNameToStarImports(java.lang.String r1, java.lang.String r2);

    java.lang.String applyUnqualifiedNameToPackage(java.lang.String r1);
}
