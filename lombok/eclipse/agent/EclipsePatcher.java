package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/EclipsePatcher.SCL.lombok */
public class EclipsePatcher implements lombok.core.AgentLauncher.AgentLaunchable {





    public EclipsePatcher() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.core.AgentLauncher.AgentLaunchable
    public void runAgent(java.lang.String r5, java.lang.instrument.Instrumentation r6, boolean r7, java.lang.Class<?> r8) throws java.lang.Exception {
            r4 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            registerPatchScripts(r0, r1, r2)
            return
    }

    private static void registerPatchScripts(java.lang.instrument.Instrumentation r5, boolean r6, java.lang.Class<?> r7) {
            lombok.patcher.ScriptManager r0 = new lombok.patcher.ScriptManager
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r5
            r0.registerTransformer(r1)
            r0 = r8
            lombok.eclipse.agent.EclipsePatcher$1 r1 = new lombok.eclipse.agent.EclipsePatcher$1
            r2 = r1
            r2.<init>()
            r0.setFilter(r1)
            boolean r0 = shouldForceBaseResourceNames()
            r9 = r0
            r0 = r8
            lombok.eclipse.agent.EclipsePatcher$2 r1 = new lombok.eclipse.agent.EclipsePatcher$2
            r2 = r1
            r3 = r9
            r2.<init>(r3)
            r0.setTransplantMapper(r1)
            r0 = r8
            r1 = r7
            lombok.eclipse.agent.EclipseLoaderPatcher.patchEquinoxLoaders(r0, r1)
            r0 = r8
            patchCatchReparse(r0)
            r0 = r8
            patchIdentifierEndReparse(r0)
            r0 = r8
            patchRetrieveEllipsisStartPosition(r0)
            r0 = r8
            patchRetrieveRightBraceOrSemiColonPosition(r0)
            r0 = r8
            patchRetrieveProperRightBracketPosition(r0)
            r0 = r8
            patchRetrieveStartBlockPosition(r0)
            r0 = r8
            patchSetGeneratedFlag(r0)
            r0 = r8
            patchDomAstReparseIssues(r0)
            r0 = r8
            patchHideGeneratedNodes(r0)
            r0 = r8
            patchPostCompileHookEclipse(r0)
            r0 = r8
            patchFixSourceTypeConverter(r0)
            r0 = r8
            patchListRewriteHandleGeneratedMethods(r0)
            r0 = r8
            patchSyntaxAndOccurrencesHighlighting(r0)
            r0 = r8
            patchSortMembersOperation(r0)
            r0 = r8
            patchExtractInterfaceAndPullUp(r0)
            r0 = r8
            patchAboutDialog(r0)
            r0 = r8
            patchEclipseDebugPatches(r0)
            r0 = r8
            patchJavadoc(r0)
            r0 = r8
            patchASTConverterLiterals(r0)
            r0 = r8
            patchASTNodeSearchUtil(r0)
            r0 = r8
            patchPostCompileHookEcj(r0)
            r0 = r8
            patchAvoidReparsingGeneratedCode(r0)
            r0 = r8
            patchLombokizeAST(r0)
            r0 = r8
            patchEcjTransformers(r0)
            r0 = r8
            patchExtensionMethod(r0)
            r0 = r8
            patchRenameField(r0)
            r0 = r8
            patchNullCheck(r0)
            r0 = r8
            patchForTests(r0)
            r0 = r6
            if (r0 == 0) goto La8
            r0 = r8
            r1 = r5
            r0.reloadClasses(r1)
        La8:
            return
    }

    private static boolean shouldForceBaseResourceNames() {
            java.lang.String r0 = "shadow.override.lombok"
            java.lang.String r1 = ""
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L13
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "\\s*"
            r2.<init>(r3)
            char r2 = java.io.File.pathSeparatorChar
            r3 = 59
            if (r2 != r3) goto L2c
            java.lang.String r2 = ";"
            goto L2e
        L2c:
            java.lang.String r2 = ":"
        L2e:
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\\s*"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r0 = r0.split(r1)
            r1 = r0
            r9 = r1
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r7 = r0
            goto L59
        L46:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r6 = r0
            r0 = r6
            java.lang.String r1 = "lombok.jar"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L56
            r0 = 0
            return r0
        L56:
            int r7 = r7 + 1
        L59:
            r0 = r7
            r1 = r8
            if (r0 < r1) goto L46
            r0 = 1
            return r0
    }

    private static void patchRenameField(lombok.patcher.ScriptManager r12) {
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.corext.refactoring.rename.RenameFieldProcessor"
            java.lang.String r5 = "checkAccessorDeclarations"
            java.lang.String r6 = "org.eclipse.ltk.core.refactoring.RefactoringStatus"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.core.runtime.IProgressMonitor"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.core.IMethod"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.corext.refactoring.RefactoringSearchEngine"
            java.lang.String r5 = "search"
            java.lang.String r6 = "org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup[]"
            r7 = 4
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.core.search.SearchPattern"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.core.search.IJavaSearchScope"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "org.eclipse.core.runtime.IProgressMonitor"
            r8[r9] = r10
            r8 = r7
            r9 = 3
            java.lang.String r10 = "org.eclipse.ltk.core.refactoring.RefactoringStatus"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.methodToWrap(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r5 = "createFakeSearchResult"
            java.lang.String r6 = "org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup[]"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup[]"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.wrapMethod(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.THIS
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.requestExtra(r2)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.corext.refactoring.rename.RenameFieldProcessor"
            java.lang.String r5 = "addAccessorOccurrences"
            java.lang.String r6 = "void"
            r7 = 5
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.core.runtime.IProgressMonitor"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.core.IMethod"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "java.lang.String"
            r8[r9] = r10
            r8 = r7
            r9 = 3
            java.lang.String r10 = "java.lang.String"
            r8[r9] = r10
            r8 = r7
            r9 = 4
            java.lang.String r10 = "org.eclipse.ltk.core.refactoring.RefactoringStatus"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup"
            java.lang.String r5 = "getSearchResults"
            java.lang.String r6 = "org.eclipse.jdt.core.search.SearchMatch[]"
            r7 = 0
            java.lang.String[] r7 = new java.lang.String[r7]
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.methodToWrap(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r5 = "removeGenerated"
            java.lang.String r6 = "org.eclipse.jdt.core.search.SearchMatch[]"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.core.search.SearchMatch[]"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.wrapMethod(r2)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r1 = r1.build()
            r0.addScript(r1)
            return
    }

    private static void patchExtractInterfaceAndPullUp(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.compiler.SourceElementNotifier"
            java.lang.String r6 = "notifySourceElementRequestor"
            java.lang.String r7 = "void"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.TypeDeclaration"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ImportReference"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.compiler.util.HashtableOfObjectToInt"
            java.lang.String r6 = "get"
            java.lang.String r7 = "int"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "getSourceEndFixed"
            java.lang.String r7 = "int"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.refactoring.structure.ExtractInterfaceProcessor"
            java.lang.String r6 = "createMethodDeclaration"
            java.lang.String r7 = "void"
            r8 = 4
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.corext.refactoring.structure.CompilationUnitRewrite"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.dom.rewrite.ASTRewrite"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AbstractTypeDeclaration"
            r9[r10] = r11
            r9 = r8
            r10 = 3
            java.lang.String r11 = "org.eclipse.jdt.core.dom.MethodDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jface.text.IDocument"
            java.lang.String r6 = "get"
            java.lang.String r7 = "java.lang.String"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "getRealMethodDeclarationSource"
            java.lang.String r7 = "java.lang.String"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.String"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "org.eclipse.jdt.core.dom.MethodDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            r3 = 2
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.THIS
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM4
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.refactoring.structure.HierarchyProcessor"
            java.lang.String r6 = "createPlaceholderForSingleVariableDeclaration"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.SingleVariableDeclaration"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.SingleVariableDeclaration"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.ICompilationUnit"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "org.eclipse.jdt.core.dom.rewrite.ASTRewrite"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.refactoring.structure.HierarchyProcessor"
            java.lang.String r6 = "createPlaceholderForType"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.Type"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Type"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.ICompilationUnit"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "org.eclipse.jdt.core.dom.rewrite.ASTRewrite"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.IBuffer"
            java.lang.String r6 = "getText"
            java.lang.String r7 = "java.lang.String"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "getRealNodeSource"
            java.lang.String r7 = "java.lang.String"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.String"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.rewrite.ListRewrite"
            java.lang.String r6 = "insertFirst"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "isListRewriteOnGeneratedNode"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.rewrite.ListRewrite"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.decisionMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.THIS
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.transplant()
            lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.refactoring.structure.ExtractInterfaceProcessor"
            java.lang.String r6 = "createMethodComment"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "isGenerated"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.decisionMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.transplant()
            lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.refactoring.structure.MemberVisibilityAdjustor$IncomingMemberVisibilityAdjustment"
            java.lang.String r6 = "rewriteVisibility"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "skipRewriteVisibility"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.corext.refactoring.structure.MemberVisibilityAdjustor$IncomingMemberVisibilityAdjustment"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.decisionMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.THIS
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.transplant()
            lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.refactoring.structure.ImportRemover"
            java.lang.String r6 = "registerRemovedNode"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "isGenerated"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.decisionMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.transplant()
            lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchAboutDialog(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.core.internal.runtime.Product"
            java.lang.String r6 = "getProperty"
            java.lang.String r7 = "java.lang.String"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.String"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$LombokDeps"
            java.lang.String r6 = "addLombokNotesToEclipseAboutDialog"
            java.lang.String r7 = "java.lang.String"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.String"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.String"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            r3 = 2
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchSyntaxAndOccurrencesHighlighting(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.ui.search.OccurrencesFinder"
            java.lang.String r6 = "addUsage"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.ui.search.OccurrencesFinder"
            java.lang.String r6 = "addWrite"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.ui.javaeditor.SemanticHighlightingReconciler$PositionCollector"
            java.lang.String r6 = "visit"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.SimpleName"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.ui.javaeditor.SemanticHighlightingReconciler$PositionCollector"
            java.lang.String r6 = "visitLiteral"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Expression"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "isGenerated"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.decisionMethod(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "returnFalse"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.valueMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchListRewriteHandleGeneratedMethods(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.replaceMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.dom.rewrite.ASTRewriteAnalyzer$ListRewriter"
            java.lang.String r6 = "rewriteList"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent"
            java.lang.String r6 = "getChildren"
            java.lang.String r7 = "org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[]"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r2 = r2.methodToReplace(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "listRewriteHandleGeneratedMethods"
            java.lang.String r7 = "org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[]"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r2 = r2.replacementMethod(r3)
            lombok.patcher.scripts.ReplaceMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchSortMembersOperation(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.SortElementsOperation$2"
            java.lang.String r6 = "visit"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.CompilationUnit"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.CompilationUnit"
            java.lang.String r6 = "types"
            java.lang.String r7 = "java.util.List"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "removeGeneratedNodes"
            java.lang.String r7 = "java.util.List"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.util.List"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.SortElementsOperation$2"
            java.lang.String r6 = "visit"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AnnotationTypeDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.AnnotationTypeDeclaration"
            java.lang.String r6 = "bodyDeclarations"
            java.lang.String r7 = "java.util.List"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "removeGeneratedNodes"
            java.lang.String r7 = "java.util.List"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.util.List"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.SortElementsOperation$2"
            java.lang.String r6 = "visit"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AnonymousClassDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.AnonymousClassDeclaration"
            java.lang.String r6 = "bodyDeclarations"
            java.lang.String r7 = "java.util.List"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "removeGeneratedNodes"
            java.lang.String r7 = "java.util.List"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.util.List"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.SortElementsOperation$2"
            java.lang.String r6 = "visit"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.TypeDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.TypeDeclaration"
            java.lang.String r6 = "bodyDeclarations"
            java.lang.String r7 = "java.util.List"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "removeGeneratedNodes"
            java.lang.String r7 = "java.util.List"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.util.List"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.SortElementsOperation$2"
            java.lang.String r6 = "visit"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.EnumDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.EnumDeclaration"
            java.lang.String r6 = "bodyDeclarations"
            java.lang.String r7 = "java.util.List"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "removeGeneratedNodes"
            java.lang.String r7 = "java.util.List"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.util.List"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.SortElementsOperation$2"
            java.lang.String r6 = "visit"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.EnumDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.EnumDeclaration"
            java.lang.String r6 = "enumConstants"
            java.lang.String r7 = "java.util.List"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "removeGeneratedNodes"
            java.lang.String r7 = "java.util.List"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.util.List"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchDomAstReparseIssues(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.replaceMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.dom.rewrite.ASTRewriteAnalyzer"
            java.lang.String r6 = "visit"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.dom.rewrite.TokenScanner"
            java.lang.String r6 = "getTokenEndOffset"
            java.lang.String r7 = "int"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r2 = r2.methodToReplace(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "getTokenEndOffsetFixed"
            java.lang.String r7 = "int"
            r8 = 4
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.core.dom.rewrite.TokenScanner"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 3
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r2 = r2.replacementMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.ReplaceMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchPostCompileHookEclipse(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.builder.IncrementalImageBuilder"
            java.lang.String r6 = "writeClassFileContents"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.builder.AbstractImageBuilder"
            java.lang.String r6 = "writeClassFileContents"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.compiler.ClassFile"
            java.lang.String r6 = "getBytes"
            java.lang.String r7 = "byte[]"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$LombokDeps"
            java.lang.String r6 = "runPostCompiler"
            java.lang.String r7 = "byte[]"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "byte[]"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.String"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM3
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchPostCompileHookEcj(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.compiler.tool.EclipseCompilerImpl"
            java.lang.String r6 = "outputClassFiles"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "javax.tools.JavaFileObject"
            java.lang.String r6 = "openOutputStream"
            java.lang.String r7 = "java.io.OutputStream"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$LombokDeps"
            java.lang.String r6 = "runPostCompiler"
            java.lang.String r7 = "java.io.OutputStream"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.io.OutputStream"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfNotWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.compiler.util.Util"
            java.lang.String r6 = "writeToDisk"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "java.io.BufferedOutputStream"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.io.OutputStream"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$LombokDeps"
            java.lang.String r6 = "runPostCompiler"
            java.lang.String r7 = "java.io.BufferedOutputStream"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.io.BufferedOutputStream"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.String"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "java.lang.String"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            r3 = 2
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM3
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfNotWitness(r1, r2)
            return
    }

    private static void patchHideGeneratedNodes(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.dom.LinkedNodeFinder"
            java.lang.String r6 = "findByNode"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.SimpleName[]"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.dom.SimpleName"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.dom.LinkedNodeFinder"
            java.lang.String r6 = "findByBinding"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "removeGeneratedSimpleNames"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.SimpleName[]"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.SimpleName[]"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.dom.LinkedNodeFinder"
            java.lang.String r6 = "findByNode"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.Name[]"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Name"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "removeGeneratedNames"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.Name[]"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Name[]"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTNode"
            java.lang.String r6 = "accept"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTVisitor"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "isBlockedVisitorAndGenerated"
            java.lang.String r7 = "boolean"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTVisitor"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.decisionMethod(r3)
            r3 = 2
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.THIS
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            patchRefactorScripts(r0)
            r0 = r13
            patchFormatters(r0)
            return
    }

    private static void patchFormatters(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.setSymbolDuringMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.formatter.DefaultCodeFormatter"
            java.lang.String r6 = "formatCompilationUnit"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.util.CodeSnippetParsingUtil"
            java.lang.String r6 = "parseCompilationUnit"
            java.lang.String r7 = "org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "char[]"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.util.Map"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "boolean"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r2 = r2.callToWrap(r3)
            java.lang.String r3 = "lombok.disable"
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r2 = r2.symbol(r3)
            lombok.patcher.scripts.SetSymbolDuringMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.setSymbolDuringMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.formatter.DefaultCodeFormatter"
            java.lang.String r6 = "parseSourceCode"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTParser"
            java.lang.String r6 = "createAST"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.ASTNode"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.core.runtime.IProgressMonitor"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r2 = r2.callToWrap(r3)
            java.lang.String r3 = "lombok.disable"
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r2 = r2.symbol(r3)
            lombok.patcher.scripts.SetSymbolDuringMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchRefactorScripts(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.rewrite.ASTRewrite"
            java.lang.String r6 = "replace"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.rewrite.ASTRewrite"
            java.lang.String r6 = "remove"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "skipRewritingGeneratedNodes"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.decisionMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.transplant()
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.refactoring.rename.RenameTypeProcessor"
            java.lang.String r6 = "addConstructorRenames"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.IType"
            java.lang.String r6 = "getMethods"
            java.lang.String r7 = "org.eclipse.jdt.core.IMethod[]"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "removeGeneratedMethods"
            java.lang.String r7 = "org.eclipse.jdt.core.IMethod[]"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.IMethod[]"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.refactoring.rename.TempOccurrenceAnalyzer"
            java.lang.String r6 = "visit"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.SimpleName"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.refactoring.rename.RenameAnalyzeUtil$ProblemNodeFinder$NameNodeVisitor"
            java.lang.String r6 = "visit"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.SimpleName"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.refactoring.rename.RenameTypeParameterProcessor$RenameTypeParameterVisitor"
            java.lang.String r6 = "visit"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.SimpleName"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "isGenerated"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.decisionMethod(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "returnTrue"
            java.lang.String r7 = "boolean"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.valueMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.transplant()
            lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchCatchReparse(lombok.patcher.ScriptManager r12) {
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r5 = "retrieveStartingCatchPosition"
            r3.<init>(r4, r5)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r5 = "fixRetrieveStartingCatchPosition"
            java.lang.String r6 = "int"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "int"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "int"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.wrapMethod(r2)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.transplant()
            r2 = 2
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.RETURN_VALUE
            r3[r4] = r5
            r3 = r2
            r4 = 1
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.request(r2)
            lombok.patcher.scripts.WrapReturnValuesScript r1 = r1.build()
            r0.addScript(r1)
            return
    }

    private static void patchIdentifierEndReparse(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "retrieveIdentifierEndPosition"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "fixRetrieveIdentifierEndPosition"
            java.lang.String r7 = "int"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.transplant()
            r3 = 3
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            r4 = r3
            r5 = 2
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchRetrieveEllipsisStartPosition(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "retrieveEllipsisStartPosition"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "fixRetrieveEllipsisStartPosition"
            java.lang.String r7 = "int"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.transplant()
            r3 = 2
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchRetrieveStartBlockPosition(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "retrieveStartBlockPosition"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "fixRetrieveStartBlockPosition"
            java.lang.String r7 = "int"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.transplant()
            r3 = 2
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchRetrieveRightBraceOrSemiColonPosition(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.ASTNode"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "boolean"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "retrieveRightBraceOrSemiColonPosition"
            java.lang.String r7 = "int"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "fixRetrieveRightBraceOrSemiColonPosition"
            java.lang.String r7 = "int"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r5 = "convert"
            java.lang.String r6 = "org.eclipse.jdt.core.dom.ASTNode"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "boolean"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r5 = "retrieveRightBrace"
            java.lang.String r6 = "int"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "int"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "int"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.methodToWrap(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r5 = "fixRetrieveRightBraceOrSemiColonPosition"
            java.lang.String r6 = "int"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "int"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.wrapMethod(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM2
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.requestExtra(r2)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r13
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r5 = "convert"
            java.lang.String r6 = "org.eclipse.jdt.core.dom.ASTNode"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.FieldDeclaration"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r5 = "retrieveRightBrace"
            java.lang.String r6 = "int"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "int"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "int"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.methodToWrap(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r5 = "fixRetrieveRightBraceOrSemiColonPosition"
            java.lang.String r6 = "int"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "int"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.FieldDeclaration"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.wrapMethod(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.requestExtra(r2)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r1 = r1.build()
            r0.addScript(r1)
            return
    }

    private static void patchRetrieveProperRightBracketPosition(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "extractSubArrayType"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.ArrayType"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ArrayType"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "retrieveProperRightBracketPosition"
            java.lang.String r7 = "int"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "fixRetrieveProperRightBracketPosition"
            java.lang.String r7 = "int"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Type"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertToArray"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.ArrayType"
            r8 = 5
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Type"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 3
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 4
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.Annotation[][]"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "retrieveProperRightBracketPosition"
            java.lang.String r7 = "int"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "fixRetrieveProperRightBracketPosition"
            java.lang.String r7 = "int"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Type"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchSetGeneratedFlag(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = lombok.patcher.scripts.ScriptBuilder.addField()
            java.lang.String r3 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.targetClass(r3)
            java.lang.String r3 = "$generatedBy"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.fieldName(r3)
            java.lang.String r3 = "Lorg/eclipse/jdt/internal/compiler/ast/ASTNode;"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.fieldType(r3)
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.setPublic()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.setTransient()
            lombok.patcher.scripts.AddFieldScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = lombok.patcher.scripts.ScriptBuilder.addField()
            java.lang.String r3 = "org.eclipse.jdt.core.dom.ASTNode"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.targetClass(r3)
            java.lang.String r3 = "$isGenerated"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.fieldName(r3)
            java.lang.String r3 = "Z"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.fieldType(r3)
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.setPublic()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.setTransient()
            lombok.patcher.scripts.AddFieldScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.eclipse.agent.EclipsePatcher$3 r3 = new lombok.eclipse.agent.EclipsePatcher$3
            r4 = r3
            r4.<init>()
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            r3 = 2
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlag"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.ASTNode"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "boolean"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            r3 = 2
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlag"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertToFieldDeclaration"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.FieldDeclaration"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.FieldDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertToType"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.Type"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.NameReference"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertType"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.Type"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.TypeReference"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertToVariableDeclarationExpression"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.VariableDeclarationExpression"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertToSingleVariableDeclaration"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.SingleVariableDeclaration"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertToVariableDeclarationFragment"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.VariableDeclarationFragment"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.FieldDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertToVariableDeclarationFragment"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.VariableDeclarationFragment"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertToVariableDeclarationStatement"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.VariableDeclarationStatement"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "createBaseType"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.Type"
            r8 = 7
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.TypeReference"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "long[]"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.Annotation[][]"
            r9[r10] = r11
            r9 = r8
            r10 = 3
            java.lang.String r11 = "char[][]"
            r9[r10] = r11
            r9 = r8
            r10 = 4
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 5
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 6
            java.lang.String r11 = "boolean"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "createQualifiedType"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.QualifiedType"
            r8 = 6
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.TypeReference"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "long[]"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.Annotation[][]"
            r9[r10] = r11
            r9 = r8
            r10 = 3
            java.lang.String r11 = "char[][]"
            r9[r10] = r11
            r9 = r8
            r10 = 4
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 5
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Type"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            r3 = 2
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlag"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.eclipse.agent.EclipsePatcher$4 r3 = new lombok.eclipse.agent.EclipsePatcher$4
            r4 = r3
            r4.<init>()
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.SimpleName"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlagForName"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Name"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.ASTNode"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "boolean"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.SimpleName"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlagForName"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Name"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.ASTNode"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "boolean"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.Block"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlag"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertType"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.Type"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.TypeReference"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.PrimitiveType"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlag"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertType"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.Type"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.TypeReference"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.SimpleType"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlag"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertType"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.Type"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.TypeReference"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ParameterizedType"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlag"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convertType"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.Type"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.TypeReference"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.QualifiedType"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlag"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.ASTNode"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "setQualifiedNameNameAndSourceRanges"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.QualifiedName"
            r8 = 4
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "char[][]"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "long[]"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 3
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "setQualifiedNameNameAndSourceRanges"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.QualifiedName"
            r8 = 4
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "char[][]"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "long[]"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 3
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.TypeReference"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.SimpleName"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM4
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlagForName"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Name"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "setQualifiedNameNameAndSourceRanges"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.QualifiedName"
            r8 = 4
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "char[][]"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "long[]"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 3
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "setQualifiedNameNameAndSourceRanges"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.QualifiedName"
            r8 = 4
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "char[][]"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "long[]"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 3
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.TypeReference"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.QualifiedName"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM4
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlagForName"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Name"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "setQualifiedNameNameAndSourceRanges"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.QualifiedName"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "char[][]"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "long[]"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.SimpleName"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM3
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlagForName"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Name"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "setQualifiedNameNameAndSourceRanges"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.QualifiedName"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "char[][]"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "long[]"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.QualifiedName"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM3
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlagForName"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Name"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "setTypeNameForAnnotation"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.Annotation"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Annotation"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.SimpleName"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlagForName"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Name"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "setTypeNameForAnnotation"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.Annotation"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Annotation"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.QualifiedName"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.AST"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "setIsGeneratedFlagForName"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.Name"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchAvoidReparsingGeneratedCode(lombok.patcher.ScriptManager r12) {
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.parser.Parser"
            java.lang.String r5 = "parse"
            java.lang.String r6 = "void"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.MethodDeclaration"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r5 = "checkBit24"
            java.lang.String r6 = "boolean"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.decisionMethod(r2)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.transplant()
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.request(r2)
            lombok.patcher.scripts.ExitFromMethodEarlyScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.parser.Parser"
            java.lang.String r5 = "parse"
            java.lang.String r6 = "void"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "boolean"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r5 = "checkBit24"
            java.lang.String r6 = "boolean"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.decisionMethod(r2)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.transplant()
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.request(r2)
            lombok.patcher.scripts.ExitFromMethodEarlyScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.parser.Parser"
            java.lang.String r5 = "parse"
            java.lang.String r6 = "void"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.Initializer"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.TypeDeclaration"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r5 = "checkBit24"
            java.lang.String r6 = "boolean"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.decisionMethod(r2)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.transplant()
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.request(r2)
            lombok.patcher.scripts.ExitFromMethodEarlyScript r1 = r1.build()
            r0.addScript(r1)
            return
    }

    private static void patchLombokizeAST(lombok.patcher.ScriptManager r12) {
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = lombok.patcher.scripts.ScriptBuilder.addField()
            java.lang.String r2 = "org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.targetClass(r2)
            java.lang.String r2 = "$lombokAST"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.fieldName(r2)
            java.lang.String r2 = "Ljava/lang/Object;"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.fieldType(r2)
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.setPublic()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r1 = r1.setTransient()
            lombok.patcher.scripts.AddFieldScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.parser.Parser"
            java.lang.String r5 = "getMethodBodies"
            java.lang.String r6 = "void"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$Transform"
            java.lang.String r5 = "transform"
            java.lang.String r6 = "void"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.wrapMethod(r2)
            r2 = 2
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.THIS
            r3[r4] = r5
            r3 = r2
            r4 = 1
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.request(r2)
            lombok.patcher.scripts.WrapReturnValuesScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.parser.Parser"
            java.lang.String r5 = "endParse"
            java.lang.String r6 = "org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "int"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$Transform"
            java.lang.String r5 = "transform_swapped"
            java.lang.String r6 = "void"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.wrapMethod(r2)
            r2 = 2
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.THIS
            r3[r4] = r5
            r3 = r2
            r4 = 1
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.RETURN_VALUE
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.request(r2)
            lombok.patcher.scripts.WrapReturnValuesScript r1 = r1.build()
            r0.addScript(r1)
            return
    }

    private static void patchEcjTransformers(lombok.patcher.ScriptManager r2) {
            r0 = r2
            addPatchesForDelegate(r0)
            r0 = r2
            addPatchesForVal(r0)
            r0 = r2
            addPatchesForValEclipse(r0)
            return
    }

    private static void addPatchesForDelegate(lombok.patcher.ScriptManager r13) {
            r0 = r13
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.lookup.ClassScope"
            java.lang.String r5 = "buildFieldsAndMethods"
            java.lang.String r6 = "void"
            r7 = 0
            java.lang.String[] r7 = new java.lang.String[r7]
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.target(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.THIS
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.request(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$Delegate"
            java.lang.String r5 = "handleDelegateForType"
            java.lang.String r6 = "boolean"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.decisionMethod(r2)
            lombok.patcher.scripts.ExitFromMethodEarlyScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.setSymbolDuringMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.SelectionRequestor"
            java.lang.String r6 = "acceptSourceMethod"
            r4.<init>(r5, r6)
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.IType"
            java.lang.String r6 = "getMethods"
            java.lang.String r7 = "org.eclipse.jdt.core.IMethod[]"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r2 = r2.callToWrap(r3)
            java.lang.String r3 = "lombok.skipdelegates"
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r2 = r2.symbol(r3)
            lombok.patcher.scripts.SetSymbolDuringMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = lombok.patcher.scripts.ScriptBuilder.addField()
            java.lang.String r3 = "$delegateMethods"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.fieldName(r3)
            java.lang.String r3 = "Ljava/util/Map;"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.fieldType(r3)
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.setPublic()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.setTransient()
            java.lang.String r3 = "org.eclipse.jdt.internal.core.CompilationUnit"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.targetClass(r3)
            lombok.patcher.scripts.AddFieldScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.core.SourceTypeElementInfo"
            java.lang.String r6 = "getChildren"
            java.lang.String r7 = "org.eclipse.jdt.core.IJavaElement[]"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            r3 = 2
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.THIS
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$Delegate"
            java.lang.String r6 = "addGeneratedDelegateMethods"
            java.lang.String r7 = "java.lang.Object[]"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void addPatchesForValEclipse(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = lombok.patcher.scripts.ScriptBuilder.addField()
            java.lang.String r3 = "$initCopy"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.fieldName(r3)
            java.lang.String r3 = "Lorg/eclipse/jdt/internal/compiler/ast/ASTNode;"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.fieldType(r3)
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.setPublic()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.setTransient()
            java.lang.String r3 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.targetClass(r3)
            lombok.patcher.scripts.AddFieldScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = lombok.patcher.scripts.ScriptBuilder.addField()
            java.lang.String r3 = "$iterableCopy"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.fieldName(r3)
            java.lang.String r3 = "Lorg/eclipse/jdt/internal/compiler/ast/ASTNode;"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.fieldType(r3)
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.setPublic()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.setTransient()
            java.lang.String r3 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.targetClass(r3)
            lombok.patcher.scripts.AddFieldScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.compiler.parser.Parser"
            java.lang.String r6 = "consumeExitVariableWithInitialization"
            java.lang.String r7 = "void"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.THIS
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$ValPortal"
            java.lang.String r6 = "copyInitializationOfLocalDeclaration"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.compiler.parser.Parser"
            java.lang.String r6 = "consumeEnhancedForStatementHeader"
            java.lang.String r7 = "void"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.THIS
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$ValPortal"
            java.lang.String r6 = "copyInitializationOfForEachIterable"
            java.lang.String r7 = "void"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "setModifiers"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.VariableDeclarationStatement"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$ValPortal"
            java.lang.String r6 = "addFinalAndValAnnotationToVariableDeclarationStatement"
            java.lang.String r7 = "void"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            r3 = 3
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.THIS
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            r4 = r3
            r5 = 2
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "setModifiers"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.SingleVariableDeclaration"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$ValPortal"
            java.lang.String r6 = "addFinalAndValAnnotationToSingleVariableDeclaration"
            java.lang.String r7 = "void"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            r3 = 3
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.THIS
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            r4 = r3
            r5 = 2
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void addPatchesForVal(lombok.patcher.ScriptManager r12) {
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            java.lang.String r5 = "resolve"
            java.lang.String r6 = "void"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.target(r2)
            r2 = 2
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.THIS
            r3[r4] = r5
            r3 = r2
            r4 = 1
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.request(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$Val"
            java.lang.String r5 = "handleValForLocalDeclaration"
            java.lang.String r6 = "boolean"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.decisionMethod(r2)
            lombok.patcher.scripts.ExitFromMethodEarlyScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = lombok.patcher.scripts.ScriptBuilder.replaceMethodCall()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            java.lang.String r5 = "resolve"
            java.lang.String r6 = "void"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            java.lang.String r5 = "resolve"
            java.lang.String r6 = "void"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "boolean"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.Expression"
            java.lang.String r5 = "resolveType"
            java.lang.String r6 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.methodToReplace(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.THIS
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.requestExtra(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$Val"
            java.lang.String r5 = "skipResolveInitializerIfAlreadyCalled2"
            java.lang.String r6 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.Expression"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.replacementMethod(r2)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.transplant()
            lombok.patcher.scripts.ReplaceMethodCallScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = lombok.patcher.scripts.ScriptBuilder.replaceMethodCall()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.ForeachStatement"
            java.lang.String r5 = "resolve"
            java.lang.String r6 = "void"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.Expression"
            java.lang.String r5 = "resolveType"
            java.lang.String r6 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.methodToReplace(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$Val"
            java.lang.String r5 = "skipResolveInitializerIfAlreadyCalled"
            java.lang.String r6 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.Expression"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.replacementMethod(r2)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.transplant()
            lombok.patcher.scripts.ReplaceMethodCallScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.ForeachStatement"
            java.lang.String r5 = "resolve"
            java.lang.String r6 = "void"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.target(r2)
            r2 = 2
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.THIS
            r3[r4] = r5
            r3 = r2
            r4 = 1
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.request(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$Val"
            java.lang.String r5 = "handleValForForEach"
            java.lang.String r6 = "boolean"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.decisionMethod(r2)
            lombok.patcher.scripts.ExitFromMethodEarlyScript r1 = r1.build()
            r0.addScript(r1)
            return
    }

    private static void patchFixSourceTypeConverter(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.compiler.parser.SourceTypeConverter"
            java.lang.String r6 = "convertAnnotations"
            java.lang.String r7 = "org.eclipse.jdt.internal.compiler.ast.Annotation[]"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.IAnnotatable"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "convertAnnotations"
            java.lang.String r7 = "org.eclipse.jdt.internal.compiler.ast.Annotation[]"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.Annotation[]"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.IAnnotatable"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            r3 = 2
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchEclipseDebugPatches(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTNode"
            java.lang.String r6 = "setSourceRange"
            java.lang.String r7 = "void"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.target(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.THIS
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.request(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.request(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.request(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.eclipse.agent.PatchDiagnostics"
            java.lang.String r6 = "setSourceRangeCheck"
            java.lang.String r7 = "boolean"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r2 = r2.decisionMethod(r3)
            lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchExtensionMethod(lombok.patcher.ScriptManager r13) {
            r0 = r13
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
            java.lang.String r5 = "resolveType"
            java.lang.String r6 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.target(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.RETURN_VALUE
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.request(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.THIS
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.request(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.request(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$ExtensionMethod"
            java.lang.String r5 = "resolveType"
            java.lang.String r6 = "java.lang.Object"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.wrapMethod(r2)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r1 = r1.cast()
            lombok.patcher.scripts.WrapReturnValuesScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r13
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = lombok.patcher.scripts.ScriptBuilder.replaceMethodCall()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
            java.lang.String r5 = "resolveType"
            java.lang.String r6 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter"
            java.lang.String r5 = "errorNoMethodFor"
            java.lang.String r6 = "void"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding[]"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.methodToReplace(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$ExtensionMethod"
            java.lang.String r5 = "errorNoMethodFor"
            java.lang.String r6 = "void"
            r7 = 4
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 3
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.replacementMethod(r2)
            lombok.patcher.scripts.ReplaceMethodCallScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r13
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = lombok.patcher.scripts.ScriptBuilder.replaceMethodCall()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
            java.lang.String r5 = "resolveType"
            java.lang.String r6 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter"
            java.lang.String r5 = "invalidMethod"
            java.lang.String r6 = "void"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.MethodBinding"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.methodToReplace(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$ExtensionMethod"
            java.lang.String r5 = "invalidMethod"
            java.lang.String r6 = "void"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.replacementMethod(r2)
            lombok.patcher.scripts.ReplaceMethodCallScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r13
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = lombok.patcher.scripts.ScriptBuilder.replaceMethodCall()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
            java.lang.String r5 = "resolveType"
            java.lang.String r6 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter"
            java.lang.String r5 = "invalidMethod"
            java.lang.String r6 = "void"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.MethodBinding"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.Scope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.methodToReplace(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$ExtensionMethod"
            java.lang.String r5 = "invalidMethod"
            java.lang.String r6 = "void"
            r7 = 4
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 3
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.replacementMethod(r2)
            lombok.patcher.scripts.ReplaceMethodCallScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r13
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = lombok.patcher.scripts.ScriptBuilder.replaceMethodCall()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
            java.lang.String r5 = "resolveType"
            java.lang.String r6 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter"
            java.lang.String r5 = "nonStaticAccessToStaticMethod"
            java.lang.String r6 = "void"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.lookup.MethodBinding"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.methodToReplace(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$ExtensionMethod"
            java.lang.String r5 = "nonStaticAccessToStaticMethod"
            java.lang.String r6 = "void"
            r7 = 4
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r8 = r7
            r9 = 3
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.replacementMethod(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.THIS
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.requestExtra(r2)
            lombok.patcher.scripts.ReplaceMethodCallScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.ui.text.java.CompletionProposalCollector"
            java.lang.String r6 = "getJavaCompletionProposals"
            java.lang.String r7 = "org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[]"
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.THIS
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.eclipse.agent.PatchExtensionMethodCompletionProposalPortal"
            java.lang.String r6 = "getJavaCompletionProposals"
            java.lang.String r7 = "org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[]"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.Object[]"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchNullCheck(lombok.patcher.ScriptManager r12) {
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter"
            java.lang.String r5 = "expressionNonNullComparison"
            java.lang.String r6 = "boolean"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.Expression"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "boolean"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r5 = "isGenerated"
            java.lang.String r6 = "boolean"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.decisionMethod(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r5 = "returnTrue"
            java.lang.String r6 = "boolean"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.Object"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.valueMethod(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.request(r2)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.transplant()
            lombok.patcher.scripts.ExitFromMethodEarlyScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r12
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = lombok.patcher.scripts.ScriptBuilder.exitEarly()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter"
            java.lang.String r5 = "fakeReachable"
            java.lang.String r6 = "void"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r5 = "isGenerated"
            java.lang.String r6 = "boolean"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.decisionMethod(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.request(r2)
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r1 = r1.transplant()
            lombok.patcher.scripts.ExitFromMethodEarlyScript r1 = r1.build()
            r0.addScript(r1)
            return
    }

    private static void patchJavadoc(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.ui.text.javadoc.JavadocContentAccess2"
            java.lang.String r6 = "getHTMLContent"
            java.lang.String r7 = "java.lang.String"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.IJavaElement"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "boolean"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.ui.text.javadoc.JavadocContentAccess2"
            java.lang.String r6 = "getHTMLContentFromSource"
            java.lang.String r7 = "java.lang.String"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.IJavaElement"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$Javadoc"
            java.lang.String r6 = "getHTMLContentFromSource"
            java.lang.String r7 = "java.lang.String"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.String"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.IJavaElement"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.ls.core.internal.javadoc.JavadocContentAccess2"
            java.lang.String r5 = "getHTMLContent"
            java.lang.String r6 = "java.lang.String"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.core.IJavaElement"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "boolean"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.ls.core.internal.javadoc.JavadocContentAccess2"
            java.lang.String r5 = "getHTMLContentFromSource"
            java.lang.String r6 = "java.lang.String"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.core.IJavaElement"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.methodToWrap(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$Javadoc"
            java.lang.String r5 = "getHTMLContentFromSource"
            java.lang.String r6 = "java.lang.String"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "java.lang.String"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "org.eclipse.jdt.core.IJavaElement"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.wrapMethod(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.PARAM1
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r1 = r1.requestExtra(r2)
            lombok.patcher.scripts.WrapMethodCallScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.ui.text.javadoc.JavadocContentAccess2"
            java.lang.String r6 = "getHTMLContent"
            java.lang.String r7 = "java.lang.String"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.IMember"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "boolean"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.ui.text.javadoc.JavadocContentAccess2"
            java.lang.String r6 = "getHTMLContentFromSource"
            java.lang.String r7 = "java.lang.String"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.IMember"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$Javadoc"
            java.lang.String r6 = "getHTMLContentFromSource"
            java.lang.String r7 = "java.lang.String"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.String"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.IJavaElement"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            r0 = r13
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = lombok.patcher.scripts.ScriptBuilder.replaceMethodCall()
            lombok.patcher.MethodTarget r2 = new lombok.patcher.MethodTarget
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.TypeDeclaration"
            java.lang.String r5 = "printBody"
            java.lang.String r6 = "java.lang.StringBuffer"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "int"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.StringBuffer"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.target(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration"
            java.lang.String r5 = "print"
            java.lang.String r6 = "java.lang.StringBuffer"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "int"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "java.lang.StringBuffer"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.methodToReplace(r2)
            lombok.patcher.Hook r2 = new lombok.patcher.Hook
            r3 = r2
            java.lang.String r4 = "lombok.launch.PatchFixesHider$Javadoc"
            java.lang.String r5 = "printMethod"
            java.lang.String r6 = "java.lang.StringBuffer"
            r7 = 4
            java.lang.String[] r7 = new java.lang.String[r7]
            r8 = r7
            r9 = 0
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration"
            r8[r9] = r10
            r8 = r7
            r9 = 1
            java.lang.String r10 = "int"
            r8[r9] = r10
            r8 = r7
            r9 = 2
            java.lang.String r10 = "java.lang.StringBuffer"
            r8[r9] = r10
            r8 = r7
            r9 = 3
            java.lang.String r10 = "org.eclipse.jdt.internal.compiler.ast.TypeDeclaration"
            r8[r9] = r10
            r3.<init>(r4, r5, r6, r7)
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.replacementMethod(r2)
            r2 = 1
            lombok.patcher.StackRequest[] r2 = new lombok.patcher.StackRequest[r2]
            r3 = r2
            r4 = 0
            lombok.patcher.StackRequest r5 = lombok.patcher.StackRequest.THIS
            r3[r4] = r5
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r1 = r1.requestExtra(r2)
            lombok.patcher.scripts.ReplaceMethodCallScript r1 = r1.build()
            r0.addScript(r1)
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = lombok.patcher.scripts.ScriptBuilder.addField()
            java.lang.String r3 = "$javadoc"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.fieldName(r3)
            java.lang.String r3 = "Ljava/util/Map;"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.fieldType(r3)
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.setPublic()
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.setTransient()
            java.lang.String r3 = "org.eclipse.jdt.internal.core.CompilationUnit"
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r2 = r2.targetClass(r3)
            lombok.patcher.scripts.AddFieldScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchASTConverterLiterals(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapMethodCall()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.Expression"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.StringLiteral"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.Expression"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.TextBlock"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.CharacterLiteral"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.CharLiteral"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.NumberLiteral"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.DoubleLiteral"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.NumberLiteral"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.FloatLiteral"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.NumberLiteral"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.LongLiteral"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.NumberLiteral"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.LongLiteralMinValue"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.NumberLiteral"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.IntLiteral"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.core.dom.ASTConverter"
            java.lang.String r6 = "convert"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.NumberLiteral"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.IntLiteralMinValue"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "java.lang.String"
            java.lang.String r6 = "<init>"
            java.lang.String r7 = "void"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "char[]"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "int"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "int"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.methodToWrap(r3)
            r3 = 1
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.requestExtra(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "getRealNodeSource"
            java.lang.String r7 = "java.lang.String"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.String"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapMethodCallScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchASTNodeSearchUtil(lombok.patcher.ScriptManager r13) {
            r0 = r13
            java.lang.String[] r1 = lombok.eclipse.agent.EclipseLoaderPatcher.OSGI_TYPES
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.eclipse.jdt.internal.corext.refactoring.structure.ASTNodeSearchUtil"
            java.lang.String r6 = "getMethodDeclarationNode"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.MethodDeclaration"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.IMethod"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.dom.CompilationUnit"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$PatchFixes"
            java.lang.String r6 = "getRealMethodDeclarationNode"
            java.lang.String r7 = "org.eclipse.jdt.core.dom.MethodDeclaration"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "org.eclipse.jdt.core.dom.MethodDeclaration"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "org.eclipse.jdt.core.IMethod"
            r9[r10] = r11
            r9 = r8
            r10 = 2
            java.lang.String r11 = "org.eclipse.jdt.core.dom.CompilationUnit"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            r3 = 3
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            r4 = r3
            r5 = 2
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM2
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.transplant()
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }

    private static void patchForTests(lombok.patcher.ScriptManager r13) {
            r0 = r13
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "lombok/eclipse/EclipseTests"
            r2[r3] = r4
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = lombok.patcher.scripts.ScriptBuilder.wrapReturnValue()
            lombok.patcher.MethodTarget r3 = new lombok.patcher.MethodTarget
            r4 = r3
            java.lang.String r5 = "org.osgi.framework.FrameworkUtil"
            java.lang.String r6 = "getBundle"
            java.lang.String r7 = "org.osgi.framework.Bundle"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.Class"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.target(r3)
            r3 = 2
            lombok.patcher.StackRequest[] r3 = new lombok.patcher.StackRequest[r3]
            r4 = r3
            r5 = 0
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.RETURN_VALUE
            r4[r5] = r6
            r4 = r3
            r5 = 1
            lombok.patcher.StackRequest r6 = lombok.patcher.StackRequest.PARAM1
            r4[r5] = r6
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.request(r3)
            lombok.patcher.Hook r3 = new lombok.patcher.Hook
            r4 = r3
            java.lang.String r5 = "lombok.launch.PatchFixesHider$Tests"
            java.lang.String r6 = "getBundle"
            java.lang.String r7 = "java.lang.Object"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = r8
            r10 = 0
            java.lang.String r11 = "java.lang.Object"
            r9[r10] = r11
            r9 = r8
            r10 = 1
            java.lang.String r11 = "java.lang.Class"
            r9[r10] = r11
            r4.<init>(r5, r6, r7, r8)
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r2 = r2.wrapMethod(r3)
            lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.build()
            r0.addScriptIfWitness(r1, r2)
            return
    }
}
