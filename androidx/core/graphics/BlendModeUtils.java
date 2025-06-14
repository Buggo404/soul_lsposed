package androidx.core.graphics;

/* loaded from: classes.dex */
class BlendModeUtils {

    /* renamed from: androidx.core.graphics.BlendModeUtils$1 */
    static /* synthetic */ class C01721 {
        static final /* synthetic */ int[] $SwitchMap$androidx$core$graphics$BlendModeCompat = null;

        static {
                androidx.core.graphics.BlendModeCompat[] r0 = androidx.core.graphics.BlendModeCompat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat = r0
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.CLEAR     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.SRC     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.DST     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.SRC_OVER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.DST_OVER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.SRC_IN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.DST_IN     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.SRC_OUT     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L6c
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.DST_OUT     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L78
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.SRC_ATOP     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L84
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.DST_ATOP     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L90
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.XOR     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L9c
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.PLUS     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> La8
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.MODULATE     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> Lb4
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.SCREEN     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> Lc0
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.OVERLAY     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> Lcc
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.DARKEN     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> Ld8
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.LIGHTEN     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> Le4
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.COLOR_DODGE     // Catch: java.lang.NoSuchFieldError -> Le4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le4
                r2 = 19
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le4
            Le4:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> Lf0
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.COLOR_BURN     // Catch: java.lang.NoSuchFieldError -> Lf0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf0
                r2 = 20
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf0
            Lf0:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> Lfc
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.HARD_LIGHT     // Catch: java.lang.NoSuchFieldError -> Lfc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfc
                r2 = 21
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lfc
            Lfc:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L108
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.SOFT_LIGHT     // Catch: java.lang.NoSuchFieldError -> L108
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L108
                r2 = 22
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L108
            L108:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L114
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.DIFFERENCE     // Catch: java.lang.NoSuchFieldError -> L114
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L114
                r2 = 23
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L114
            L114:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L120
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.EXCLUSION     // Catch: java.lang.NoSuchFieldError -> L120
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L120
                r2 = 24
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L120
            L120:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L12c
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.MULTIPLY     // Catch: java.lang.NoSuchFieldError -> L12c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12c
                r2 = 25
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12c
            L12c:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L138
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.HUE     // Catch: java.lang.NoSuchFieldError -> L138
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L138
                r2 = 26
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L138
            L138:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L144
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.SATURATION     // Catch: java.lang.NoSuchFieldError -> L144
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L144
                r2 = 27
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L144
            L144:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L150
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.COLOR     // Catch: java.lang.NoSuchFieldError -> L150
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L150
                r2 = 28
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L150
            L150:
                int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat     // Catch: java.lang.NoSuchFieldError -> L15c
                androidx.core.graphics.BlendModeCompat r1 = androidx.core.graphics.BlendModeCompat.LUMINOSITY     // Catch: java.lang.NoSuchFieldError -> L15c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15c
                r2 = 29
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15c
            L15c:
                return
        }
    }

    private BlendModeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.graphics.BlendMode obtainBlendModeFromCompat(androidx.core.graphics.BlendModeCompat r1) {
            int[] r0 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L61;
                case 2: goto L5e;
                case 3: goto L5b;
                case 4: goto L58;
                case 5: goto L55;
                case 6: goto L52;
                case 7: goto L4f;
                case 8: goto L4c;
                case 9: goto L49;
                case 10: goto L46;
                case 11: goto L43;
                case 12: goto L40;
                case 13: goto L3d;
                case 14: goto L3a;
                case 15: goto L37;
                case 16: goto L34;
                case 17: goto L31;
                case 18: goto L2e;
                case 19: goto L2b;
                case 20: goto L28;
                case 21: goto L25;
                case 22: goto L22;
                case 23: goto L1f;
                case 24: goto L1c;
                case 25: goto L19;
                case 26: goto L16;
                case 27: goto L13;
                case 28: goto L10;
                case 29: goto Ld;
                default: goto Lb;
            }
        Lb:
            r1 = 0
            return r1
        Ld:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.LUMINOSITY
            return r1
        L10:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.COLOR
            return r1
        L13:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SATURATION
            return r1
        L16:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.HUE
            return r1
        L19:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.MULTIPLY
            return r1
        L1c:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.EXCLUSION
            return r1
        L1f:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DIFFERENCE
            return r1
        L22:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SOFT_LIGHT
            return r1
        L25:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.HARD_LIGHT
            return r1
        L28:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.COLOR_BURN
            return r1
        L2b:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.COLOR_DODGE
            return r1
        L2e:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.LIGHTEN
            return r1
        L31:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DARKEN
            return r1
        L34:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.OVERLAY
            return r1
        L37:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SCREEN
            return r1
        L3a:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.MODULATE
            return r1
        L3d:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.PLUS
            return r1
        L40:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.XOR
            return r1
        L43:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_ATOP
            return r1
        L46:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_ATOP
            return r1
        L49:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_OUT
            return r1
        L4c:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_OUT
            return r1
        L4f:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_IN
            return r1
        L52:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_IN
            return r1
        L55:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_OVER
            return r1
        L58:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_OVER
            return r1
        L5b:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST
            return r1
        L5e:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC
            return r1
        L61:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.CLEAR
            return r1
    }

    static android.graphics.PorterDuff.Mode obtainPorterDuffFromCompat(androidx.core.graphics.BlendModeCompat r2) {
            r0 = 0
            if (r2 == 0) goto L45
            int[] r1 = androidx.core.graphics.BlendModeUtils.C01721.$SwitchMap$androidx$core$graphics$BlendModeCompat
            int r2 = r2.ordinal()
            r2 = r1[r2]
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L30;
                case 8: goto L2d;
                case 9: goto L2a;
                case 10: goto L27;
                case 11: goto L24;
                case 12: goto L21;
                case 13: goto L1e;
                case 14: goto L1b;
                case 15: goto L18;
                case 16: goto L15;
                case 17: goto L12;
                case 18: goto Lf;
                default: goto Le;
            }
        Le:
            return r0
        Lf:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.LIGHTEN
            return r2
        L12:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DARKEN
            return r2
        L15:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.OVERLAY
            return r2
        L18:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SCREEN
            return r2
        L1b:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r2
        L1e:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.ADD
            return r2
        L21:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.XOR
            return r2
        L24:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_ATOP
            return r2
        L27:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r2
        L2a:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_OUT
            return r2
        L2d:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_OUT
            return r2
        L30:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_IN
            return r2
        L33:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            return r2
        L36:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_OVER
            return r2
        L39:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r2
        L3c:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST
            return r2
        L3f:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC
            return r2
        L42:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR
            return r2
        L45:
            return r0
    }
}
