package androidx.core.content.p000pm;

/* loaded from: classes.dex */
public abstract class ShortcutInfoCompatSaver<T> {

    public static class NoopImpl extends androidx.core.content.p000pm.ShortcutInfoCompatSaver<java.lang.Void> {
        public NoopImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.core.content.p000pm.ShortcutInfoCompatSaver
        public /* bridge */ /* synthetic */ java.lang.Void addShortcuts(java.util.List r1) {
                r0 = this;
                java.lang.Void r1 = r0.addShortcuts2(r1)
                return r1
        }

        @Override // androidx.core.content.p000pm.ShortcutInfoCompatSaver
        /* renamed from: addShortcuts, reason: avoid collision after fix types in other method */
        public java.lang.Void addShortcuts2(java.util.List<androidx.core.content.p000pm.ShortcutInfoCompat> r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.core.content.p000pm.ShortcutInfoCompatSaver
        public /* bridge */ /* synthetic */ java.lang.Void removeAllShortcuts() {
                r1 = this;
                java.lang.Void r0 = r1.removeAllShortcuts2()
                return r0
        }

        @Override // androidx.core.content.p000pm.ShortcutInfoCompatSaver
        /* renamed from: removeAllShortcuts, reason: avoid collision after fix types in other method */
        public java.lang.Void removeAllShortcuts2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.core.content.p000pm.ShortcutInfoCompatSaver
        public /* bridge */ /* synthetic */ java.lang.Void removeShortcuts(java.util.List r1) {
                r0 = this;
                java.lang.Void r1 = r0.removeShortcuts2(r1)
                return r1
        }

        @Override // androidx.core.content.p000pm.ShortcutInfoCompatSaver
        /* renamed from: removeShortcuts, reason: avoid collision after fix types in other method */
        public java.lang.Void removeShortcuts2(java.util.List<java.lang.String> r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public ShortcutInfoCompatSaver() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract T addShortcuts(java.util.List<androidx.core.content.p000pm.ShortcutInfoCompat> r1);

    public java.util.List<androidx.core.content.p000pm.ShortcutInfoCompat> getShortcuts() throws java.lang.Exception {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public abstract T removeAllShortcuts();

    public abstract T removeShortcuts(java.util.List<java.lang.String> r1);
}
