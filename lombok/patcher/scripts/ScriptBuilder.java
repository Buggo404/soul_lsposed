package lombok.patcher.scripts;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/ScriptBuilder.SCL.lombok */
public class ScriptBuilder {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/ScriptBuilder$AddFieldBuilder.SCL.lombok */
    public static class AddFieldBuilder {
        private int accessFlags;
        private java.util.List<java.lang.String> targetClasses;
        private java.lang.String fieldName;
        private java.lang.String fieldType;
        private java.lang.Object value;
        private static final int NO_ACCESS_LEVELS = -4;

        public AddFieldBuilder() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.targetClasses = r1
                return
        }

        public lombok.patcher.scripts.AddFieldScript build() {
                r8 = this;
                r0 = r8
                java.util.List<java.lang.String> r0 = r0.targetClasses
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L16
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set at least one targetClass."
                r1.<init>(r2)
                throw r0
            L16:
                r0 = r8
                java.lang.String r0 = r0.fieldName
                if (r0 != 0) goto L27
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set a fieldName"
                r1.<init>(r2)
                throw r0
            L27:
                r0 = r8
                java.lang.String r0 = r0.fieldType
                if (r0 != 0) goto L38
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set the new field's type by calling fieldType"
                r1.<init>(r2)
                throw r0
            L38:
                r0 = r8
                java.lang.Object r0 = r0.value
                if (r0 == 0) goto L49
                r0 = r8
                lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r0 = r0.setStatic()
                r0 = r8
                lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r0 = r0.setFinal()
            L49:
                lombok.patcher.scripts.AddFieldScript r0 = new lombok.patcher.scripts.AddFieldScript
                r1 = r0
                r2 = r8
                java.util.List<java.lang.String> r2 = r2.targetClasses
                r3 = r8
                int r3 = r3.accessFlags
                r4 = r8
                java.lang.String r4 = r4.fieldName
                r5 = r8
                java.lang.String r5 = r5.fieldType
                r6 = r8
                java.lang.Object r6 = r6.value
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder targetClass(java.lang.String r4) {
                r3 = this;
                r0 = r4
                lombok.patcher.scripts.ScriptBuilder.access$0(r0)
                r0 = r3
                java.util.List<java.lang.String> r0 = r0.targetClasses
                r1 = r4
                boolean r0 = r0.add(r1)
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder value(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.value = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder fieldName(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.fieldName = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder fieldType(java.lang.String r4) {
                r3 = this;
                r0 = r4
                lombok.patcher.scripts.ScriptBuilder.access$1(r0)
                r0 = r3
                r1 = r4
                r0.fieldType = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder setPublic() {
                r4 = this;
                r0 = r4
                r1 = r4
                int r1 = r1.accessFlags
                r2 = -4
                r1 = r1 & r2
                r2 = 1
                r1 = r1 | r2
                r0.accessFlags = r1
                r0 = r4
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder setPrivate() {
                r4 = this;
                r0 = r4
                r1 = r4
                int r1 = r1.accessFlags
                r2 = -4
                r1 = r1 & r2
                r2 = 2
                r1 = r1 | r2
                r0.accessFlags = r1
                r0 = r4
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder setProtected() {
                r4 = this;
                r0 = r4
                r1 = r4
                int r1 = r1.accessFlags
                r2 = -4
                r1 = r1 & r2
                r2 = 4
                r1 = r1 | r2
                r0.accessFlags = r1
                r0 = r4
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder setPackageAccess() {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.accessFlags
                r2 = -4
                r1 = r1 & r2
                r0.accessFlags = r1
                r0 = r4
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder setStatic() {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.accessFlags
                r2 = 8
                r1 = r1 | r2
                r0.accessFlags = r1
                r0 = r4
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder setFinal() {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.accessFlags
                r2 = 16
                r1 = r1 | r2
                r0.accessFlags = r1
                r0 = r4
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder setVolatile() {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.accessFlags
                r2 = 64
                r1 = r1 | r2
                r0.accessFlags = r1
                r0 = r4
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder setTransient() {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.accessFlags
                r2 = 128(0x80, float:1.794E-43)
                r1 = r1 | r2
                r0.accessFlags = r1
                r0 = r4
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/ScriptBuilder$ExitEarlyBuilder.SCL.lombok */
    public static class ExitEarlyBuilder {
        private java.util.List<lombok.patcher.TargetMatcher> matchers;
        private lombok.patcher.Hook decisionMethod;
        private lombok.patcher.Hook valueMethod;
        private java.util.Set<lombok.patcher.StackRequest> requests;
        private boolean transplant;
        private boolean insert;

        public ExitEarlyBuilder() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.matchers = r1
                r0 = r4
                java.util.HashSet r1 = new java.util.HashSet
                r2 = r1
                r2.<init>()
                r0.requests = r1
                return
        }

        public lombok.patcher.scripts.ExitFromMethodEarlyScript build() {
                r9 = this;
                r0 = r9
                java.util.List<lombok.patcher.TargetMatcher> r0 = r0.matchers
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L16
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set a target method matcher"
                r1.<init>(r2)
                throw r0
            L16:
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = new lombok.patcher.scripts.ExitFromMethodEarlyScript
                r1 = r0
                r2 = r9
                java.util.List<lombok.patcher.TargetMatcher> r2 = r2.matchers
                r3 = r9
                lombok.patcher.Hook r3 = r3.decisionMethod
                r4 = r9
                lombok.patcher.Hook r4 = r4.valueMethod
                r5 = r9
                boolean r5 = r5.transplant
                r6 = r9
                boolean r6 = r6.insert
                r7 = r9
                java.util.Set<lombok.patcher.StackRequest> r7 = r7.requests
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.ExitEarlyBuilder target(lombok.patcher.TargetMatcher r4) {
                r3 = this;
                r0 = r3
                java.util.List<lombok.patcher.TargetMatcher> r0 = r0.matchers
                r1 = r4
                boolean r0 = r0.add(r1)
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.ExitEarlyBuilder decisionMethod(lombok.patcher.Hook r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.decisionMethod = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.ExitEarlyBuilder valueMethod(lombok.patcher.Hook r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.valueMethod = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.ExitEarlyBuilder transplant() {
                r3 = this;
                r0 = r3
                r1 = 1
                r0.transplant = r1
                r0 = r3
                r1 = 0
                r0.insert = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.ExitEarlyBuilder insert() {
                r3 = this;
                r0 = r3
                r1 = 0
                r0.transplant = r1
                r0 = r3
                r1 = 1
                r0.insert = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.ExitEarlyBuilder request(lombok.patcher.StackRequest... r5) {
                r4 = this;
                r0 = r5
                r1 = r0
                r9 = r1
                int r0 = r0.length
                r8 = r0
                r0 = 0
                r7 = r0
                goto L30
            Lc:
                r0 = r9
                r1 = r7
                r0 = r0[r1]
                r6 = r0
                r0 = r6
                lombok.patcher.StackRequest r1 = lombok.patcher.StackRequest.RETURN_VALUE
                if (r0 != r1) goto L22
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "You cannot ask for the tentative return value in ExitFromMethodEarlyScript"
                r1.<init>(r2)
                throw r0
            L22:
                r0 = r4
                java.util.Set<lombok.patcher.StackRequest> r0 = r0.requests
                r1 = r6
                boolean r0 = r0.add(r1)
                int r7 = r7 + 1
            L30:
                r0 = r7
                r1 = r8
                if (r0 < r1) goto Lc
                r0 = r4
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/ScriptBuilder$ReplaceMethodCallBuilder.SCL.lombok */
    public static class ReplaceMethodCallBuilder {
        private java.util.List<lombok.patcher.TargetMatcher> matchers;
        private lombok.patcher.Hook replacementMethod;
        private lombok.patcher.Hook methodToReplace;
        private java.util.Set<lombok.patcher.StackRequest> extraRequests;
        private boolean transplant;
        private boolean insert;

        public ReplaceMethodCallBuilder() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.matchers = r1
                r0 = r4
                java.util.HashSet r1 = new java.util.HashSet
                r2 = r1
                r2.<init>()
                r0.extraRequests = r1
                return
        }

        public lombok.patcher.scripts.ReplaceMethodCallScript build() {
                r9 = this;
                r0 = r9
                java.util.List<lombok.patcher.TargetMatcher> r0 = r0.matchers
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L16
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set a target method matcher"
                r1.<init>(r2)
                throw r0
            L16:
                r0 = r9
                lombok.patcher.Hook r0 = r0.replacementMethod
                if (r0 != 0) goto L27
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set a replacement method"
                r1.<init>(r2)
                throw r0
            L27:
                r0 = r9
                lombok.patcher.Hook r0 = r0.methodToReplace
                if (r0 != 0) goto L38
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set a method call to replace"
                r1.<init>(r2)
                throw r0
            L38:
                lombok.patcher.scripts.ReplaceMethodCallScript r0 = new lombok.patcher.scripts.ReplaceMethodCallScript
                r1 = r0
                r2 = r9
                java.util.List<lombok.patcher.TargetMatcher> r2 = r2.matchers
                r3 = r9
                lombok.patcher.Hook r3 = r3.methodToReplace
                r4 = r9
                lombok.patcher.Hook r4 = r4.replacementMethod
                r5 = r9
                boolean r5 = r5.transplant
                r6 = r9
                boolean r6 = r6.insert
                r7 = r9
                java.util.Set<lombok.patcher.StackRequest> r7 = r7.extraRequests
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.ReplaceMethodCallBuilder target(lombok.patcher.TargetMatcher r4) {
                r3 = this;
                r0 = r3
                java.util.List<lombok.patcher.TargetMatcher> r0 = r0.matchers
                r1 = r4
                boolean r0 = r0.add(r1)
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.ReplaceMethodCallBuilder replacementMethod(lombok.patcher.Hook r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.replacementMethod = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.ReplaceMethodCallBuilder methodToReplace(lombok.patcher.Hook r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.methodToReplace = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.ReplaceMethodCallBuilder transplant() {
                r3 = this;
                r0 = r3
                r1 = 1
                r0.transplant = r1
                r0 = r3
                r1 = 0
                r0.insert = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.ReplaceMethodCallBuilder insert() {
                r3 = this;
                r0 = r3
                r1 = 0
                r0.transplant = r1
                r0 = r3
                r1 = 1
                r0.insert = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.ReplaceMethodCallBuilder requestExtra(lombok.patcher.StackRequest... r5) {
                r4 = this;
                r0 = r5
                r1 = r0
                r9 = r1
                int r0 = r0.length
                r8 = r0
                r0 = 0
                r7 = r0
                goto L30
            Lc:
                r0 = r9
                r1 = r7
                r0 = r0[r1]
                r6 = r0
                r0 = r6
                lombok.patcher.StackRequest r1 = lombok.patcher.StackRequest.RETURN_VALUE
                if (r0 != r1) goto L22
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "You cannot ask for the tentative return value in ReplaceMethodCallScript"
                r1.<init>(r2)
                throw r0
            L22:
                r0 = r4
                java.util.Set<lombok.patcher.StackRequest> r0 = r0.extraRequests
                r1 = r6
                boolean r0 = r0.add(r1)
                int r7 = r7 + 1
            L30:
                r0 = r7
                r1 = r8
                if (r0 < r1) goto Lc
                r0 = r4
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/ScriptBuilder$SetSymbolDuringMethodCallBuilder.SCL.lombok */
    public static class SetSymbolDuringMethodCallBuilder {
        private java.util.List<lombok.patcher.TargetMatcher> matchers;
        private lombok.patcher.Hook callToWrap;
        private java.lang.String symbol;
        private boolean report;

        public SetSymbolDuringMethodCallBuilder() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.matchers = r1
                return
        }

        public lombok.patcher.scripts.SetSymbolDuringMethodCallScript build() {
                r7 = this;
                r0 = r7
                java.util.List<lombok.patcher.TargetMatcher> r0 = r0.matchers
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L16
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set a target method matcher"
                r1.<init>(r2)
                throw r0
            L16:
                r0 = r7
                lombok.patcher.Hook r0 = r0.callToWrap
                if (r0 != 0) goto L27
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set a method that needs to set the symbol during its invocation"
                r1.<init>(r2)
                throw r0
            L27:
                r0 = r7
                java.lang.String r0 = r0.symbol
                if (r0 != 0) goto L38
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to specify the symbol that is on the stack during callToWrap's invocation"
                r1.<init>(r2)
                throw r0
            L38:
                lombok.patcher.scripts.SetSymbolDuringMethodCallScript r0 = new lombok.patcher.scripts.SetSymbolDuringMethodCallScript
                r1 = r0
                r2 = r7
                java.util.List<lombok.patcher.TargetMatcher> r2 = r2.matchers
                r3 = r7
                lombok.patcher.Hook r3 = r3.callToWrap
                r4 = r7
                java.lang.String r4 = r4.symbol
                r5 = r7
                boolean r5 = r5.report
                r1.<init>(r2, r3, r4, r5)
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.SetSymbolDuringMethodCallBuilder target(lombok.patcher.TargetMatcher r4) {
                r3 = this;
                r0 = r3
                java.util.List<lombok.patcher.TargetMatcher> r0 = r0.matchers
                r1 = r4
                boolean r0 = r0.add(r1)
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.SetSymbolDuringMethodCallBuilder callToWrap(lombok.patcher.Hook r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.callToWrap = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.SetSymbolDuringMethodCallBuilder symbol(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.symbol = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.SetSymbolDuringMethodCallBuilder report() {
                r3 = this;
                r0 = r3
                r1 = 1
                r0.report = r1
                r0 = r3
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/ScriptBuilder$WrapMethodCallBuilder.SCL.lombok */
    public static class WrapMethodCallBuilder {
        private java.util.List<lombok.patcher.TargetMatcher> matchers;
        private lombok.patcher.Hook wrapMethod;
        private lombok.patcher.Hook methodToWrap;
        private java.util.Set<lombok.patcher.StackRequest> extraRequests;
        private boolean transplant;
        private boolean insert;

        public WrapMethodCallBuilder() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.matchers = r1
                r0 = r4
                java.util.HashSet r1 = new java.util.HashSet
                r2 = r1
                r2.<init>()
                r0.extraRequests = r1
                return
        }

        public lombok.patcher.scripts.WrapMethodCallScript build() {
                r9 = this;
                r0 = r9
                java.util.List<lombok.patcher.TargetMatcher> r0 = r0.matchers
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L16
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set a target method matcher"
                r1.<init>(r2)
                throw r0
            L16:
                r0 = r9
                lombok.patcher.Hook r0 = r0.wrapMethod
                if (r0 != 0) goto L27
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set method to wrap with"
                r1.<init>(r2)
                throw r0
            L27:
                r0 = r9
                lombok.patcher.Hook r0 = r0.methodToWrap
                if (r0 != 0) goto L38
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set a method call to wrap"
                r1.<init>(r2)
                throw r0
            L38:
                lombok.patcher.scripts.WrapMethodCallScript r0 = new lombok.patcher.scripts.WrapMethodCallScript
                r1 = r0
                r2 = r9
                java.util.List<lombok.patcher.TargetMatcher> r2 = r2.matchers
                r3 = r9
                lombok.patcher.Hook r3 = r3.methodToWrap
                r4 = r9
                lombok.patcher.Hook r4 = r4.wrapMethod
                r5 = r9
                boolean r5 = r5.transplant
                r6 = r9
                boolean r6 = r6.insert
                r7 = r9
                java.util.Set<lombok.patcher.StackRequest> r7 = r7.extraRequests
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.WrapMethodCallBuilder target(lombok.patcher.TargetMatcher r4) {
                r3 = this;
                r0 = r3
                java.util.List<lombok.patcher.TargetMatcher> r0 = r0.matchers
                r1 = r4
                boolean r0 = r0.add(r1)
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.WrapMethodCallBuilder wrapMethod(lombok.patcher.Hook r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.wrapMethod = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.WrapMethodCallBuilder methodToWrap(lombok.patcher.Hook r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.methodToWrap = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.WrapMethodCallBuilder transplant() {
                r3 = this;
                r0 = r3
                r1 = 1
                r0.transplant = r1
                r0 = r3
                r1 = 0
                r0.insert = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.WrapMethodCallBuilder insert() {
                r3 = this;
                r0 = r3
                r1 = 0
                r0.transplant = r1
                r0 = r3
                r1 = 1
                r0.insert = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.WrapMethodCallBuilder requestExtra(lombok.patcher.StackRequest... r5) {
                r4 = this;
                r0 = r5
                r1 = r0
                r9 = r1
                int r0 = r0.length
                r8 = r0
                r0 = 0
                r7 = r0
                goto L30
            Lc:
                r0 = r9
                r1 = r7
                r0 = r0[r1]
                r6 = r0
                r0 = r6
                lombok.patcher.StackRequest r1 = lombok.patcher.StackRequest.RETURN_VALUE
                if (r0 != r1) goto L22
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "You cannot ask for the tentative return value in WrapMethodCallBuilder"
                r1.<init>(r2)
                throw r0
            L22:
                r0 = r4
                java.util.Set<lombok.patcher.StackRequest> r0 = r0.extraRequests
                r1 = r6
                boolean r0 = r0.add(r1)
                int r7 = r7 + 1
            L30:
                r0 = r7
                r1 = r8
                if (r0 < r1) goto Lc
                r0 = r4
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/ScriptBuilder$WrapReturnValueBuilder.SCL.lombok */
    public static class WrapReturnValueBuilder {
        private java.util.List<lombok.patcher.TargetMatcher> matchers;
        private lombok.patcher.Hook wrapMethod;
        private java.util.Set<lombok.patcher.StackRequest> requests;
        private boolean transplant;
        private boolean insert;
        private boolean cast;

        public WrapReturnValueBuilder() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.matchers = r1
                r0 = r4
                java.util.HashSet r1 = new java.util.HashSet
                r2 = r1
                r2.<init>()
                r0.requests = r1
                return
        }

        public lombok.patcher.scripts.WrapReturnValuesScript build() {
                r9 = this;
                r0 = r9
                java.util.List<lombok.patcher.TargetMatcher> r0 = r0.matchers
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L16
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set a target method matcher"
                r1.<init>(r2)
                throw r0
            L16:
                r0 = r9
                lombok.patcher.Hook r0 = r0.wrapMethod
                if (r0 != 0) goto L27
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "You have to set a method you'd like to wrap the return values with"
                r1.<init>(r2)
                throw r0
            L27:
                lombok.patcher.scripts.WrapReturnValuesScript r0 = new lombok.patcher.scripts.WrapReturnValuesScript
                r1 = r0
                r2 = r9
                java.util.List<lombok.patcher.TargetMatcher> r2 = r2.matchers
                r3 = r9
                lombok.patcher.Hook r3 = r3.wrapMethod
                r4 = r9
                boolean r4 = r4.transplant
                r5 = r9
                boolean r5 = r5.insert
                r6 = r9
                boolean r6 = r6.cast
                r7 = r9
                java.util.Set<lombok.patcher.StackRequest> r7 = r7.requests
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.WrapReturnValueBuilder target(lombok.patcher.TargetMatcher r4) {
                r3 = this;
                r0 = r3
                java.util.List<lombok.patcher.TargetMatcher> r0 = r0.matchers
                r1 = r4
                boolean r0 = r0.add(r1)
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.WrapReturnValueBuilder wrapMethod(lombok.patcher.Hook r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.wrapMethod = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.WrapReturnValueBuilder transplant() {
                r3 = this;
                r0 = r3
                r1 = 1
                r0.transplant = r1
                r0 = r3
                r1 = 0
                r0.insert = r1
                r0 = r3
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.WrapReturnValueBuilder insert() {
                r4 = this;
                r0 = r4
                boolean r0 = r0.cast
                if (r0 == 0) goto L11
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "cast and insert are mutually exlusive"
                r1.<init>(r2)
                throw r0
            L11:
                r0 = r4
                r1 = 0
                r0.transplant = r1
                r0 = r4
                r1 = 1
                r0.insert = r1
                r0 = r4
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.WrapReturnValueBuilder cast() {
                r4 = this;
                r0 = r4
                boolean r0 = r0.insert
                if (r0 == 0) goto L11
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "insert and cast are mutually exlusive"
                r1.<init>(r2)
                throw r0
            L11:
                r0 = r4
                r1 = 1
                r0.cast = r1
                r0 = r4
                return r0
        }

        public lombok.patcher.scripts.ScriptBuilder.WrapReturnValueBuilder request(lombok.patcher.StackRequest... r4) {
                r3 = this;
                r0 = r4
                r1 = r0
                r8 = r1
                int r0 = r0.length
                r7 = r0
                r0 = 0
                r6 = r0
                goto L1f
            Lc:
                r0 = r8
                r1 = r6
                r0 = r0[r1]
                r5 = r0
                r0 = r3
                java.util.Set<lombok.patcher.StackRequest> r0 = r0.requests
                r1 = r5
                boolean r0 = r0.add(r1)
                int r6 = r6 + 1
            L1f:
                r0 = r6
                r1 = r7
                if (r0 < r1) goto Lc
                r0 = r3
                return r0
        }
    }

    private ScriptBuilder() throws java.lang.NoSuchMethodException {
            r4 = this;
            r0 = r4
            r0.<init>()
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            r1 = r0
            java.lang.String r2 = "ScriptBuilder cannot be instantiated - just use the static methods."
            r1.<init>(r2)
            throw r0
    }

    private static void checkTypeSyntaxSlash(java.lang.String r4) {
            r0 = r4
            r1 = 46
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 <= r1) goto L14
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Your type specification includes a dot, but this method wants a slash-separated type specification"
            r1.<init>(r2)
            throw r0
        L14:
            return
    }

    private static void checkTypeSyntaxDot(java.lang.String r4) {
            r0 = r4
            r1 = 47
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 <= r1) goto L14
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Your type specification includes a slash, but this method wants a dot-separated type specification"
            r1.<init>(r2)
            throw r0
        L14:
            return
    }

    public static lombok.patcher.scripts.ScriptBuilder.AddFieldBuilder addField() {
            lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder r0 = new lombok.patcher.scripts.ScriptBuilder$AddFieldBuilder
            r1 = r0
            r1.<init>()
            return r0
    }

    public static lombok.patcher.scripts.ScriptBuilder.ExitEarlyBuilder exitEarly() {
            lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder r0 = new lombok.patcher.scripts.ScriptBuilder$ExitEarlyBuilder
            r1 = r0
            r1.<init>()
            return r0
    }

    public static lombok.patcher.scripts.ScriptBuilder.ReplaceMethodCallBuilder replaceMethodCall() {
            lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder r0 = new lombok.patcher.scripts.ScriptBuilder$ReplaceMethodCallBuilder
            r1 = r0
            r1.<init>()
            return r0
    }

    public static lombok.patcher.scripts.ScriptBuilder.WrapMethodCallBuilder wrapMethodCall() {
            lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder r0 = new lombok.patcher.scripts.ScriptBuilder$WrapMethodCallBuilder
            r1 = r0
            r1.<init>()
            return r0
    }

    public static lombok.patcher.scripts.ScriptBuilder.WrapReturnValueBuilder wrapReturnValue() {
            lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder r0 = new lombok.patcher.scripts.ScriptBuilder$WrapReturnValueBuilder
            r1 = r0
            r1.<init>()
            return r0
    }

    public static lombok.patcher.scripts.ScriptBuilder.SetSymbolDuringMethodCallBuilder setSymbolDuringMethodCall() {
            lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder r0 = new lombok.patcher.scripts.ScriptBuilder$SetSymbolDuringMethodCallBuilder
            r1 = r0
            r1.<init>()
            return r0
    }

    static /* synthetic */ void access$0(java.lang.String r2) {
            r0 = r2
            checkTypeSyntaxDot(r0)
            return
    }

    static /* synthetic */ void access$1(java.lang.String r2) {
            r0 = r2
            checkTypeSyntaxSlash(r0)
            return
    }
}
