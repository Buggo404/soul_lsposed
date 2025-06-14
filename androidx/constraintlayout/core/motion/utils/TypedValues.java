package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public interface TypedValues {
    public static final int BOOLEAN_MASK = 1;
    public static final int FLOAT_MASK = 4;
    public static final int INT_MASK = 2;
    public static final int STRING_MASK = 8;
    public static final java.lang.String S_CUSTOM = "CUSTOM";
    public static final int TYPE_FRAME_POSITION = 100;
    public static final int TYPE_TARGET = 101;

    public interface AttributesType {
        public static final java.lang.String[] KEY_WORDS = null;
        public static final java.lang.String NAME = "KeyAttributes";
        public static final java.lang.String S_ALPHA = "alpha";
        public static final java.lang.String S_CURVE_FIT = "curveFit";
        public static final java.lang.String S_CUSTOM = "CUSTOM";
        public static final java.lang.String S_EASING = "easing";
        public static final java.lang.String S_ELEVATION = "elevation";
        public static final java.lang.String S_FRAME = "frame";
        public static final java.lang.String S_PATH_ROTATE = "pathRotate";
        public static final java.lang.String S_PIVOT_TARGET = "pivotTarget";
        public static final java.lang.String S_PIVOT_X = "pivotX";
        public static final java.lang.String S_PIVOT_Y = "pivotY";
        public static final java.lang.String S_PROGRESS = "progress";
        public static final java.lang.String S_ROTATION_X = "rotationX";
        public static final java.lang.String S_ROTATION_Y = "rotationY";
        public static final java.lang.String S_ROTATION_Z = "rotationZ";
        public static final java.lang.String S_SCALE_X = "scaleX";
        public static final java.lang.String S_SCALE_Y = "scaleY";
        public static final java.lang.String S_TARGET = "target";
        public static final java.lang.String S_TRANSLATION_X = "translationX";
        public static final java.lang.String S_TRANSLATION_Y = "translationY";
        public static final java.lang.String S_TRANSLATION_Z = "translationZ";
        public static final java.lang.String S_VISIBILITY = "visibility";
        public static final int TYPE_ALPHA = 303;
        public static final int TYPE_CURVE_FIT = 301;
        public static final int TYPE_EASING = 317;
        public static final int TYPE_ELEVATION = 307;
        public static final int TYPE_PATH_ROTATE = 316;
        public static final int TYPE_PIVOT_TARGET = 318;
        public static final int TYPE_PIVOT_X = 313;
        public static final int TYPE_PIVOT_Y = 314;
        public static final int TYPE_PROGRESS = 315;
        public static final int TYPE_ROTATION_X = 308;
        public static final int TYPE_ROTATION_Y = 309;
        public static final int TYPE_ROTATION_Z = 310;
        public static final int TYPE_SCALE_X = 311;
        public static final int TYPE_SCALE_Y = 312;
        public static final int TYPE_TRANSLATION_X = 304;
        public static final int TYPE_TRANSLATION_Y = 305;
        public static final int TYPE_TRANSLATION_Z = 306;
        public static final int TYPE_VISIBILITY = 302;

        static {
                java.lang.String r0 = "curveFit"
                java.lang.String r1 = "visibility"
                java.lang.String r2 = "alpha"
                java.lang.String r3 = "translationX"
                java.lang.String r4 = "translationY"
                java.lang.String r5 = "translationZ"
                java.lang.String r6 = "elevation"
                java.lang.String r7 = "rotationX"
                java.lang.String r8 = "rotationY"
                java.lang.String r9 = "rotationZ"
                java.lang.String r10 = "scaleX"
                java.lang.String r11 = "scaleY"
                java.lang.String r12 = "pivotX"
                java.lang.String r13 = "pivotY"
                java.lang.String r14 = "progress"
                java.lang.String r15 = "pathRotate"
                java.lang.String r16 = "easing"
                java.lang.String r17 = "CUSTOM"
                java.lang.String r18 = "frame"
                java.lang.String r19 = "target"
                java.lang.String r20 = "pivotTarget"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
                androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.KEY_WORDS = r0
                return
        }

        static int getId(java.lang.String r2) {
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1310311125: goto L101;
                    case -1249320806: goto Lf5;
                    case -1249320805: goto Le9;
                    case -1249320804: goto Ldd;
                    case -1225497657: goto Ld1;
                    case -1225497656: goto Lc5;
                    case -1225497655: goto Lb9;
                    case -1001078227: goto Lad;
                    case -987906986: goto L9f;
                    case -987906985: goto L91;
                    case -908189618: goto L83;
                    case -908189617: goto L76;
                    case -880905839: goto L69;
                    case -4379043: goto L5c;
                    case 92909918: goto L4f;
                    case 97692013: goto L42;
                    case 579057826: goto L35;
                    case 803192288: goto L28;
                    case 1167159411: goto L1b;
                    case 1941332754: goto Le;
                    default: goto Lb;
                }
            Lb:
                r2 = r1
                goto L10c
            Le:
                java.lang.String r0 = "visibility"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L17
                goto Lb
            L17:
                r2 = 19
                goto L10c
            L1b:
                java.lang.String r0 = "pivotTarget"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L24
                goto Lb
            L24:
                r2 = 18
                goto L10c
            L28:
                java.lang.String r0 = "pathRotate"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L31
                goto Lb
            L31:
                r2 = 17
                goto L10c
            L35:
                java.lang.String r0 = "curveFit"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L3e
                goto Lb
            L3e:
                r2 = 16
                goto L10c
            L42:
                java.lang.String r0 = "frame"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L4b
                goto Lb
            L4b:
                r2 = 15
                goto L10c
            L4f:
                java.lang.String r0 = "alpha"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L58
                goto Lb
            L58:
                r2 = 14
                goto L10c
            L5c:
                java.lang.String r0 = "elevation"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L65
                goto Lb
            L65:
                r2 = 13
                goto L10c
            L69:
                java.lang.String r0 = "target"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L72
                goto Lb
            L72:
                r2 = 12
                goto L10c
            L76:
                java.lang.String r0 = "scaleY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L7f
                goto Lb
            L7f:
                r2 = 11
                goto L10c
            L83:
                java.lang.String r0 = "scaleX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L8d
                goto Lb
            L8d:
                r2 = 10
                goto L10c
            L91:
                java.lang.String r0 = "pivotY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L9b
                goto Lb
            L9b:
                r2 = 9
                goto L10c
            L9f:
                java.lang.String r0 = "pivotX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto La9
                goto Lb
            La9:
                r2 = 8
                goto L10c
            Lad:
                java.lang.String r0 = "progress"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto Lb7
                goto Lb
            Lb7:
                r2 = 7
                goto L10c
            Lb9:
                java.lang.String r0 = "translationZ"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto Lc3
                goto Lb
            Lc3:
                r2 = 6
                goto L10c
            Lc5:
                java.lang.String r0 = "translationY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto Lcf
                goto Lb
            Lcf:
                r2 = 5
                goto L10c
            Ld1:
                java.lang.String r0 = "translationX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto Ldb
                goto Lb
            Ldb:
                r2 = 4
                goto L10c
            Ldd:
                java.lang.String r0 = "rotationZ"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto Le7
                goto Lb
            Le7:
                r2 = 3
                goto L10c
            Le9:
                java.lang.String r0 = "rotationY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto Lf3
                goto Lb
            Lf3:
                r2 = 2
                goto L10c
            Lf5:
                java.lang.String r0 = "rotationX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto Lff
                goto Lb
            Lff:
                r2 = 1
                goto L10c
            L101:
                java.lang.String r0 = "easing"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L10b
                goto Lb
            L10b:
                r2 = 0
            L10c:
                switch(r2) {
                    case 0: goto L149;
                    case 1: goto L146;
                    case 2: goto L143;
                    case 3: goto L140;
                    case 4: goto L13d;
                    case 5: goto L13a;
                    case 6: goto L137;
                    case 7: goto L134;
                    case 8: goto L131;
                    case 9: goto L12e;
                    case 10: goto L12b;
                    case 11: goto L128;
                    case 12: goto L125;
                    case 13: goto L122;
                    case 14: goto L11f;
                    case 15: goto L11c;
                    case 16: goto L119;
                    case 17: goto L116;
                    case 18: goto L113;
                    case 19: goto L110;
                    default: goto L10f;
                }
            L10f:
                return r1
            L110:
                r2 = 302(0x12e, float:4.23E-43)
                return r2
            L113:
                r2 = 318(0x13e, float:4.46E-43)
                return r2
            L116:
                r2 = 316(0x13c, float:4.43E-43)
                return r2
            L119:
                r2 = 301(0x12d, float:4.22E-43)
                return r2
            L11c:
                r2 = 100
                return r2
            L11f:
                r2 = 303(0x12f, float:4.25E-43)
                return r2
            L122:
                r2 = 307(0x133, float:4.3E-43)
                return r2
            L125:
                r2 = 101(0x65, float:1.42E-43)
                return r2
            L128:
                r2 = 312(0x138, float:4.37E-43)
                return r2
            L12b:
                r2 = 311(0x137, float:4.36E-43)
                return r2
            L12e:
                r2 = 314(0x13a, float:4.4E-43)
                return r2
            L131:
                r2 = 313(0x139, float:4.39E-43)
                return r2
            L134:
                r2 = 315(0x13b, float:4.41E-43)
                return r2
            L137:
                r2 = 306(0x132, float:4.29E-43)
                return r2
            L13a:
                r2 = 305(0x131, float:4.27E-43)
                return r2
            L13d:
                r2 = 304(0x130, float:4.26E-43)
                return r2
            L140:
                r2 = 310(0x136, float:4.34E-43)
                return r2
            L143:
                r2 = 309(0x135, float:4.33E-43)
                return r2
            L146:
                r2 = 308(0x134, float:4.32E-43)
                return r2
            L149:
                r2 = 317(0x13d, float:4.44E-43)
                return r2
        }

        static int getType(int r1) {
                r0 = 100
                if (r1 == r0) goto L12
                r0 = 101(0x65, float:1.42E-43)
                if (r1 == r0) goto Lf
                switch(r1) {
                    case 301: goto L12;
                    case 302: goto L12;
                    case 303: goto Ld;
                    case 304: goto Ld;
                    case 305: goto Ld;
                    case 306: goto Ld;
                    case 307: goto Ld;
                    case 308: goto Ld;
                    case 309: goto Ld;
                    case 310: goto Ld;
                    case 311: goto Ld;
                    case 312: goto Ld;
                    case 313: goto Ld;
                    case 314: goto Ld;
                    case 315: goto Ld;
                    case 316: goto Ld;
                    case 317: goto Lf;
                    case 318: goto Lf;
                    default: goto Lb;
                }
            Lb:
                r1 = -1
                return r1
            Ld:
                r1 = 4
                return r1
            Lf:
                r1 = 8
                return r1
            L12:
                r1 = 2
                return r1
        }
    }

    public interface Custom {
        public static final java.lang.String[] KEY_WORDS = null;
        public static final java.lang.String NAME = "Custom";
        public static final java.lang.String S_BOOLEAN = "boolean";
        public static final java.lang.String S_COLOR = "color";
        public static final java.lang.String S_DIMENSION = "dimension";
        public static final java.lang.String S_FLOAT = "float";
        public static final java.lang.String S_INT = "integer";
        public static final java.lang.String S_REFERENCE = "refrence";
        public static final java.lang.String S_STRING = "string";
        public static final int TYPE_BOOLEAN = 904;
        public static final int TYPE_COLOR = 902;
        public static final int TYPE_DIMENSION = 905;
        public static final int TYPE_FLOAT = 901;
        public static final int TYPE_INT = 900;
        public static final int TYPE_REFERENCE = 906;
        public static final int TYPE_STRING = 903;

        static {
                java.lang.String r0 = "float"
                java.lang.String r1 = "color"
                java.lang.String r2 = "string"
                java.lang.String r3 = "boolean"
                java.lang.String r4 = "dimension"
                java.lang.String r5 = "refrence"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
                androidx.constraintlayout.core.motion.utils.TypedValues.Custom.KEY_WORDS = r0
                return
        }

        static int getId(java.lang.String r2) {
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1095013018: goto L4f;
                    case -891985903: goto L44;
                    case -710953590: goto L39;
                    case 64711720: goto L2e;
                    case 94842723: goto L23;
                    case 97526364: goto L18;
                    case 1958052158: goto Ld;
                    default: goto Lb;
                }
            Lb:
                r2 = r1
                goto L59
            Ld:
                java.lang.String r0 = "integer"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L16
                goto Lb
            L16:
                r2 = 6
                goto L59
            L18:
                java.lang.String r0 = "float"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L21
                goto Lb
            L21:
                r2 = 5
                goto L59
            L23:
                java.lang.String r0 = "color"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L2c
                goto Lb
            L2c:
                r2 = 4
                goto L59
            L2e:
                java.lang.String r0 = "boolean"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L37
                goto Lb
            L37:
                r2 = 3
                goto L59
            L39:
                java.lang.String r0 = "refrence"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L42
                goto Lb
            L42:
                r2 = 2
                goto L59
            L44:
                java.lang.String r0 = "string"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L4d
                goto Lb
            L4d:
                r2 = 1
                goto L59
            L4f:
                java.lang.String r0 = "dimension"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L58
                goto Lb
            L58:
                r2 = 0
            L59:
                switch(r2) {
                    case 0: goto L6f;
                    case 1: goto L6c;
                    case 2: goto L69;
                    case 3: goto L66;
                    case 4: goto L63;
                    case 5: goto L60;
                    case 6: goto L5d;
                    default: goto L5c;
                }
            L5c:
                return r1
            L5d:
                r2 = 900(0x384, float:1.261E-42)
                return r2
            L60:
                r2 = 901(0x385, float:1.263E-42)
                return r2
            L63:
                r2 = 902(0x386, float:1.264E-42)
                return r2
            L66:
                r2 = 904(0x388, float:1.267E-42)
                return r2
            L69:
                r2 = 906(0x38a, float:1.27E-42)
                return r2
            L6c:
                r2 = 903(0x387, float:1.265E-42)
                return r2
            L6f:
                r2 = 905(0x389, float:1.268E-42)
                return r2
        }
    }

    public interface CycleType {
        public static final java.lang.String[] KEY_WORDS = null;
        public static final java.lang.String NAME = "KeyCycle";
        public static final java.lang.String S_ALPHA = "alpha";
        public static final java.lang.String S_CURVE_FIT = "curveFit";
        public static final java.lang.String S_CUSTOM_WAVE_SHAPE = "customWave";
        public static final java.lang.String S_EASING = "easing";
        public static final java.lang.String S_ELEVATION = "elevation";
        public static final java.lang.String S_PATH_ROTATE = "pathRotate";
        public static final java.lang.String S_PIVOT_X = "pivotX";
        public static final java.lang.String S_PIVOT_Y = "pivotY";
        public static final java.lang.String S_PROGRESS = "progress";
        public static final java.lang.String S_ROTATION_X = "rotationX";
        public static final java.lang.String S_ROTATION_Y = "rotationY";
        public static final java.lang.String S_ROTATION_Z = "rotationZ";
        public static final java.lang.String S_SCALE_X = "scaleX";
        public static final java.lang.String S_SCALE_Y = "scaleY";
        public static final java.lang.String S_TRANSLATION_X = "translationX";
        public static final java.lang.String S_TRANSLATION_Y = "translationY";
        public static final java.lang.String S_TRANSLATION_Z = "translationZ";
        public static final java.lang.String S_VISIBILITY = "visibility";
        public static final java.lang.String S_WAVE_OFFSET = "offset";
        public static final java.lang.String S_WAVE_PERIOD = "period";
        public static final java.lang.String S_WAVE_PHASE = "phase";
        public static final java.lang.String S_WAVE_SHAPE = "waveShape";
        public static final int TYPE_ALPHA = 403;
        public static final int TYPE_CURVE_FIT = 401;
        public static final int TYPE_CUSTOM_WAVE_SHAPE = 422;
        public static final int TYPE_EASING = 420;
        public static final int TYPE_ELEVATION = 307;
        public static final int TYPE_PATH_ROTATE = 416;
        public static final int TYPE_PIVOT_X = 313;
        public static final int TYPE_PIVOT_Y = 314;
        public static final int TYPE_PROGRESS = 315;
        public static final int TYPE_ROTATION_X = 308;
        public static final int TYPE_ROTATION_Y = 309;
        public static final int TYPE_ROTATION_Z = 310;
        public static final int TYPE_SCALE_X = 311;
        public static final int TYPE_SCALE_Y = 312;
        public static final int TYPE_TRANSLATION_X = 304;
        public static final int TYPE_TRANSLATION_Y = 305;
        public static final int TYPE_TRANSLATION_Z = 306;
        public static final int TYPE_VISIBILITY = 402;
        public static final int TYPE_WAVE_OFFSET = 424;
        public static final int TYPE_WAVE_PERIOD = 423;
        public static final int TYPE_WAVE_PHASE = 425;
        public static final int TYPE_WAVE_SHAPE = 421;

        static {
                java.lang.String r0 = "curveFit"
                java.lang.String r1 = "visibility"
                java.lang.String r2 = "alpha"
                java.lang.String r3 = "translationX"
                java.lang.String r4 = "translationY"
                java.lang.String r5 = "translationZ"
                java.lang.String r6 = "elevation"
                java.lang.String r7 = "rotationX"
                java.lang.String r8 = "rotationY"
                java.lang.String r9 = "rotationZ"
                java.lang.String r10 = "scaleX"
                java.lang.String r11 = "scaleY"
                java.lang.String r12 = "pivotX"
                java.lang.String r13 = "pivotY"
                java.lang.String r14 = "progress"
                java.lang.String r15 = "pathRotate"
                java.lang.String r16 = "easing"
                java.lang.String r17 = "waveShape"
                java.lang.String r18 = "customWave"
                java.lang.String r19 = "period"
                java.lang.String r20 = "offset"
                java.lang.String r21 = "phase"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
                androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.KEY_WORDS = r0
                return
        }

        static int getId(java.lang.String r2) {
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1310311125: goto Lc8;
                    case -1249320806: goto Lbc;
                    case -1249320805: goto Lb0;
                    case -1249320804: goto La4;
                    case -1225497657: goto L98;
                    case -1225497656: goto L8c;
                    case -1225497655: goto L81;
                    case -1001078227: goto L76;
                    case -987906986: goto L69;
                    case -987906985: goto L5c;
                    case -908189618: goto L4f;
                    case -908189617: goto L42;
                    case 92909918: goto L35;
                    case 579057826: goto L28;
                    case 803192288: goto L1b;
                    case 1941332754: goto Le;
                    default: goto Lb;
                }
            Lb:
                r2 = r1
                goto Ld3
            Le:
                java.lang.String r0 = "visibility"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L17
                goto Lb
            L17:
                r2 = 15
                goto Ld3
            L1b:
                java.lang.String r0 = "pathRotate"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L24
                goto Lb
            L24:
                r2 = 14
                goto Ld3
            L28:
                java.lang.String r0 = "curveFit"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L31
                goto Lb
            L31:
                r2 = 13
                goto Ld3
            L35:
                java.lang.String r0 = "alpha"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L3e
                goto Lb
            L3e:
                r2 = 12
                goto Ld3
            L42:
                java.lang.String r0 = "scaleY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L4b
                goto Lb
            L4b:
                r2 = 11
                goto Ld3
            L4f:
                java.lang.String r0 = "scaleX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L58
                goto Lb
            L58:
                r2 = 10
                goto Ld3
            L5c:
                java.lang.String r0 = "pivotY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L65
                goto Lb
            L65:
                r2 = 9
                goto Ld3
            L69:
                java.lang.String r0 = "pivotX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L72
                goto Lb
            L72:
                r2 = 8
                goto Ld3
            L76:
                java.lang.String r0 = "progress"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L7f
                goto Lb
            L7f:
                r2 = 7
                goto Ld3
            L81:
                java.lang.String r0 = "translationZ"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L8a
                goto Lb
            L8a:
                r2 = 6
                goto Ld3
            L8c:
                java.lang.String r0 = "translationY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L96
                goto Lb
            L96:
                r2 = 5
                goto Ld3
            L98:
                java.lang.String r0 = "translationX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto La2
                goto Lb
            La2:
                r2 = 4
                goto Ld3
            La4:
                java.lang.String r0 = "rotationZ"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto Lae
                goto Lb
            Lae:
                r2 = 3
                goto Ld3
            Lb0:
                java.lang.String r0 = "rotationY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto Lba
                goto Lb
            Lba:
                r2 = 2
                goto Ld3
            Lbc:
                java.lang.String r0 = "rotationX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto Lc6
                goto Lb
            Lc6:
                r2 = 1
                goto Ld3
            Lc8:
                java.lang.String r0 = "easing"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto Ld2
                goto Lb
            Ld2:
                r2 = 0
            Ld3:
                switch(r2) {
                    case 0: goto L104;
                    case 1: goto L101;
                    case 2: goto Lfe;
                    case 3: goto Lfb;
                    case 4: goto Lf8;
                    case 5: goto Lf5;
                    case 6: goto Lf2;
                    case 7: goto Lef;
                    case 8: goto Lec;
                    case 9: goto Le9;
                    case 10: goto Le6;
                    case 11: goto Le3;
                    case 12: goto Le0;
                    case 13: goto Ldd;
                    case 14: goto Lda;
                    case 15: goto Ld7;
                    default: goto Ld6;
                }
            Ld6:
                return r1
            Ld7:
                r2 = 402(0x192, float:5.63E-43)
                return r2
            Lda:
                r2 = 416(0x1a0, float:5.83E-43)
                return r2
            Ldd:
                r2 = 401(0x191, float:5.62E-43)
                return r2
            Le0:
                r2 = 403(0x193, float:5.65E-43)
                return r2
            Le3:
                r2 = 312(0x138, float:4.37E-43)
                return r2
            Le6:
                r2 = 311(0x137, float:4.36E-43)
                return r2
            Le9:
                r2 = 314(0x13a, float:4.4E-43)
                return r2
            Lec:
                r2 = 313(0x139, float:4.39E-43)
                return r2
            Lef:
                r2 = 315(0x13b, float:4.41E-43)
                return r2
            Lf2:
                r2 = 306(0x132, float:4.29E-43)
                return r2
            Lf5:
                r2 = 305(0x131, float:4.27E-43)
                return r2
            Lf8:
                r2 = 304(0x130, float:4.26E-43)
                return r2
            Lfb:
                r2 = 310(0x136, float:4.34E-43)
                return r2
            Lfe:
                r2 = 309(0x135, float:4.33E-43)
                return r2
            L101:
                r2 = 308(0x134, float:4.32E-43)
                return r2
            L104:
                r2 = 420(0x1a4, float:5.89E-43)
                return r2
        }

        static int getType(int r1) {
                r0 = 100
                if (r1 == r0) goto L24
                r0 = 101(0x65, float:1.42E-43)
                if (r1 == r0) goto L21
                r0 = 416(0x1a0, float:5.83E-43)
                if (r1 == r0) goto L1f
                r0 = 420(0x1a4, float:5.89E-43)
                if (r1 == r0) goto L21
                r0 = 421(0x1a5, float:5.9E-43)
                if (r1 == r0) goto L21
                switch(r1) {
                    case 304: goto L1f;
                    case 305: goto L1f;
                    case 306: goto L1f;
                    case 307: goto L1f;
                    case 308: goto L1f;
                    case 309: goto L1f;
                    case 310: goto L1f;
                    case 311: goto L1f;
                    case 312: goto L1f;
                    case 313: goto L1f;
                    case 314: goto L1f;
                    case 315: goto L1f;
                    default: goto L17;
                }
            L17:
                switch(r1) {
                    case 401: goto L24;
                    case 402: goto L24;
                    case 403: goto L1f;
                    default: goto L1a;
                }
            L1a:
                switch(r1) {
                    case 423: goto L1f;
                    case 424: goto L1f;
                    case 425: goto L1f;
                    default: goto L1d;
                }
            L1d:
                r1 = -1
                return r1
            L1f:
                r1 = 4
                return r1
            L21:
                r1 = 8
                return r1
            L24:
                r1 = 2
                return r1
        }
    }

    public interface MotionScene {
        public static final java.lang.String[] KEY_WORDS = null;
        public static final java.lang.String NAME = "MotionScene";
        public static final java.lang.String S_DEFAULT_DURATION = "defaultDuration";
        public static final java.lang.String S_LAYOUT_DURING_TRANSITION = "layoutDuringTransition";
        public static final int TYPE_DEFAULT_DURATION = 600;
        public static final int TYPE_LAYOUT_DURING_TRANSITION = 601;

        static {
                java.lang.String r0 = "defaultDuration"
                java.lang.String r1 = "layoutDuringTransition"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1}
                androidx.constraintlayout.core.motion.utils.TypedValues.MotionScene.KEY_WORDS = r0
                return
        }

        static int getId(java.lang.String r1) {
                r1.hashCode()
                java.lang.String r0 = "defaultDuration"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L18
                java.lang.String r0 = "layoutDuringTransition"
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L15
                r1 = -1
                return r1
            L15:
                r1 = 601(0x259, float:8.42E-43)
                return r1
            L18:
                r1 = 600(0x258, float:8.41E-43)
                return r1
        }

        static int getType(int r1) {
                r0 = 600(0x258, float:8.41E-43)
                if (r1 == r0) goto Lc
                r0 = 601(0x259, float:8.42E-43)
                if (r1 == r0) goto La
                r1 = -1
                return r1
            La:
                r1 = 1
                return r1
            Lc:
                r1 = 2
                return r1
        }
    }

    public interface MotionType {
        public static final java.lang.String[] KEY_WORDS = null;
        public static final java.lang.String NAME = "Motion";
        public static final java.lang.String S_ANIMATE_CIRCLEANGLE_TO = "AnimateCircleAngleTo";
        public static final java.lang.String S_ANIMATE_RELATIVE_TO = "AnimateRelativeTo";
        public static final java.lang.String S_DRAW_PATH = "DrawPath";
        public static final java.lang.String S_EASING = "TransitionEasing";
        public static final java.lang.String S_PATHMOTION_ARC = "PathMotionArc";
        public static final java.lang.String S_PATH_ROTATE = "PathRotate";
        public static final java.lang.String S_POLAR_RELATIVETO = "PolarRelativeTo";
        public static final java.lang.String S_QUANTIZE_INTERPOLATOR = "QuantizeInterpolator";
        public static final java.lang.String S_QUANTIZE_INTERPOLATOR_ID = "QuantizeInterpolatorID";
        public static final java.lang.String S_QUANTIZE_INTERPOLATOR_TYPE = "QuantizeInterpolatorType";
        public static final java.lang.String S_QUANTIZE_MOTIONSTEPS = "QuantizeMotionSteps";
        public static final java.lang.String S_QUANTIZE_MOTION_PHASE = "QuantizeMotionPhase";
        public static final java.lang.String S_STAGGER = "Stagger";
        public static final int TYPE_ANIMATE_CIRCLEANGLE_TO = 606;
        public static final int TYPE_ANIMATE_RELATIVE_TO = 605;
        public static final int TYPE_DRAW_PATH = 608;
        public static final int TYPE_EASING = 603;
        public static final int TYPE_PATHMOTION_ARC = 607;
        public static final int TYPE_PATH_ROTATE = 601;
        public static final int TYPE_POLAR_RELATIVETO = 609;
        public static final int TYPE_QUANTIZE_INTERPOLATOR = 604;
        public static final int TYPE_QUANTIZE_INTERPOLATOR_ID = 612;
        public static final int TYPE_QUANTIZE_INTERPOLATOR_TYPE = 611;
        public static final int TYPE_QUANTIZE_MOTIONSTEPS = 610;
        public static final int TYPE_QUANTIZE_MOTION_PHASE = 602;
        public static final int TYPE_STAGGER = 600;

        static {
                java.lang.String r0 = "Stagger"
                java.lang.String r1 = "PathRotate"
                java.lang.String r2 = "QuantizeMotionPhase"
                java.lang.String r3 = "TransitionEasing"
                java.lang.String r4 = "QuantizeInterpolator"
                java.lang.String r5 = "AnimateRelativeTo"
                java.lang.String r6 = "AnimateCircleAngleTo"
                java.lang.String r7 = "PathMotionArc"
                java.lang.String r8 = "DrawPath"
                java.lang.String r9 = "PolarRelativeTo"
                java.lang.String r10 = "QuantizeMotionSteps"
                java.lang.String r11 = "QuantizeInterpolatorType"
                java.lang.String r12 = "QuantizeInterpolatorID"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
                androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.KEY_WORDS = r0
                return
        }

        static int getId(java.lang.String r2) {
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -2033446275: goto L9e;
                    case -1532277420: goto L92;
                    case -1529145600: goto L86;
                    case -1498310144: goto L7b;
                    case -1030753096: goto L70;
                    case -762370135: goto L65;
                    case -232872051: goto L5a;
                    case 1138491429: goto L4f;
                    case 1539234834: goto L42;
                    case 1583722451: goto L35;
                    case 1639368448: goto L28;
                    case 1900899336: goto L1b;
                    case 2109694967: goto Le;
                    default: goto Lb;
                }
            Lb:
                r2 = r1
                goto La9
            Le:
                java.lang.String r0 = "PathMotionArc"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L17
                goto Lb
            L17:
                r2 = 12
                goto La9
            L1b:
                java.lang.String r0 = "AnimateRelativeTo"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L24
                goto Lb
            L24:
                r2 = 11
                goto La9
            L28:
                java.lang.String r0 = "TransitionEasing"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L31
                goto Lb
            L31:
                r2 = 10
                goto La9
            L35:
                java.lang.String r0 = "QuantizeInterpolatorID"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L3e
                goto Lb
            L3e:
                r2 = 9
                goto La9
            L42:
                java.lang.String r0 = "QuantizeInterpolatorType"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L4b
                goto Lb
            L4b:
                r2 = 8
                goto La9
            L4f:
                java.lang.String r0 = "PolarRelativeTo"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L58
                goto Lb
            L58:
                r2 = 7
                goto La9
            L5a:
                java.lang.String r0 = "Stagger"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L63
                goto Lb
            L63:
                r2 = 6
                goto La9
            L65:
                java.lang.String r0 = "DrawPath"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L6e
                goto Lb
            L6e:
                r2 = 5
                goto La9
            L70:
                java.lang.String r0 = "QuantizeInterpolator"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L79
                goto Lb
            L79:
                r2 = 4
                goto La9
            L7b:
                java.lang.String r0 = "PathRotate"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L84
                goto Lb
            L84:
                r2 = 3
                goto La9
            L86:
                java.lang.String r0 = "QuantizeMotionSteps"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L90
                goto Lb
            L90:
                r2 = 2
                goto La9
            L92:
                java.lang.String r0 = "QuantizeMotionPhase"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L9c
                goto Lb
            L9c:
                r2 = 1
                goto La9
            L9e:
                java.lang.String r0 = "AnimateCircleAngleTo"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto La8
                goto Lb
            La8:
                r2 = 0
            La9:
                switch(r2) {
                    case 0: goto Ld1;
                    case 1: goto Lce;
                    case 2: goto Lcb;
                    case 3: goto Lc8;
                    case 4: goto Lc5;
                    case 5: goto Lc2;
                    case 6: goto Lbf;
                    case 7: goto Lbc;
                    case 8: goto Lb9;
                    case 9: goto Lb6;
                    case 10: goto Lb3;
                    case 11: goto Lb0;
                    case 12: goto Lad;
                    default: goto Lac;
                }
            Lac:
                return r1
            Lad:
                r2 = 607(0x25f, float:8.5E-43)
                return r2
            Lb0:
                r2 = 605(0x25d, float:8.48E-43)
                return r2
            Lb3:
                r2 = 603(0x25b, float:8.45E-43)
                return r2
            Lb6:
                r2 = 612(0x264, float:8.58E-43)
                return r2
            Lb9:
                r2 = 611(0x263, float:8.56E-43)
                return r2
            Lbc:
                r2 = 609(0x261, float:8.53E-43)
                return r2
            Lbf:
                r2 = 600(0x258, float:8.41E-43)
                return r2
            Lc2:
                r2 = 608(0x260, float:8.52E-43)
                return r2
            Lc5:
                r2 = 604(0x25c, float:8.46E-43)
                return r2
            Lc8:
                r2 = 601(0x259, float:8.42E-43)
                return r2
            Lcb:
                r2 = 610(0x262, float:8.55E-43)
                return r2
            Lce:
                r2 = 602(0x25a, float:8.44E-43)
                return r2
            Ld1:
                r2 = 606(0x25e, float:8.49E-43)
                return r2
        }
    }

    public interface OnSwipe {
        public static final java.lang.String AUTOCOMPLETE_MODE = "autocompletemode";
        public static final java.lang.String[] AUTOCOMPLETE_MODE_ENUM = null;
        public static final java.lang.String DRAG_DIRECTION = "dragdirection";
        public static final java.lang.String DRAG_SCALE = "dragscale";
        public static final java.lang.String DRAG_THRESHOLD = "dragthreshold";
        public static final java.lang.String LIMIT_BOUNDS_TO = "limitboundsto";
        public static final java.lang.String MAX_ACCELERATION = "maxacceleration";
        public static final java.lang.String MAX_VELOCITY = "maxvelocity";
        public static final java.lang.String MOVE_WHEN_SCROLLAT_TOP = "movewhenscrollattop";
        public static final java.lang.String NESTED_SCROLL_FLAGS = "nestedscrollflags";
        public static final java.lang.String[] NESTED_SCROLL_FLAGS_ENUM = null;
        public static final java.lang.String ON_TOUCH_UP = "ontouchup";
        public static final java.lang.String[] ON_TOUCH_UP_ENUM = null;
        public static final java.lang.String ROTATION_CENTER_ID = "rotationcenterid";
        public static final java.lang.String SPRINGS_TOP_THRESHOLD = "springstopthreshold";
        public static final java.lang.String SPRING_BOUNDARY = "springboundary";
        public static final java.lang.String[] SPRING_BOUNDARY_ENUM = null;
        public static final java.lang.String SPRING_DAMPING = "springdamping";
        public static final java.lang.String SPRING_MASS = "springmass";
        public static final java.lang.String SPRING_STIFFNESS = "springstiffness";
        public static final java.lang.String TOUCH_ANCHOR_ID = "touchanchorid";
        public static final java.lang.String TOUCH_ANCHOR_SIDE = "touchanchorside";
        public static final java.lang.String TOUCH_REGION_ID = "touchregionid";

        static {
                java.lang.String r0 = "autoComplete"
                java.lang.String r1 = "autoCompleteToStart"
                java.lang.String r2 = "autoCompleteToEnd"
                java.lang.String r3 = "stop"
                java.lang.String r4 = "decelerate"
                java.lang.String r5 = "decelerateAndComplete"
                java.lang.String r6 = "neverCompleteToStart"
                java.lang.String r7 = "neverCompleteToEnd"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7}
                androidx.constraintlayout.core.motion.utils.TypedValues.OnSwipe.ON_TOUCH_UP_ENUM = r0
                java.lang.String r0 = "bounceEnd"
                java.lang.String r1 = "bounceBoth"
                java.lang.String r2 = "overshoot"
                java.lang.String r3 = "bounceStart"
                java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
                androidx.constraintlayout.core.motion.utils.TypedValues.OnSwipe.SPRING_BOUNDARY_ENUM = r0
                java.lang.String r0 = "continuousVelocity"
                java.lang.String r1 = "spring"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1}
                androidx.constraintlayout.core.motion.utils.TypedValues.OnSwipe.AUTOCOMPLETE_MODE_ENUM = r0
                java.lang.String r0 = "disableScroll"
                java.lang.String r1 = "supportScrollUp"
                java.lang.String r2 = "none"
                java.lang.String r3 = "disablePostScroll"
                java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
                androidx.constraintlayout.core.motion.utils.TypedValues.OnSwipe.NESTED_SCROLL_FLAGS_ENUM = r0
                return
        }
    }

    public interface PositionType {
        public static final java.lang.String[] KEY_WORDS = null;
        public static final java.lang.String NAME = "KeyPosition";
        public static final java.lang.String S_DRAWPATH = "drawPath";
        public static final java.lang.String S_PERCENT_HEIGHT = "percentHeight";
        public static final java.lang.String S_PERCENT_WIDTH = "percentWidth";
        public static final java.lang.String S_PERCENT_X = "percentX";
        public static final java.lang.String S_PERCENT_Y = "percentY";
        public static final java.lang.String S_SIZE_PERCENT = "sizePercent";
        public static final java.lang.String S_TRANSITION_EASING = "transitionEasing";
        public static final int TYPE_CURVE_FIT = 508;
        public static final int TYPE_DRAWPATH = 502;
        public static final int TYPE_PATH_MOTION_ARC = 509;
        public static final int TYPE_PERCENT_HEIGHT = 504;
        public static final int TYPE_PERCENT_WIDTH = 503;
        public static final int TYPE_PERCENT_X = 506;
        public static final int TYPE_PERCENT_Y = 507;
        public static final int TYPE_POSITION_TYPE = 510;
        public static final int TYPE_SIZE_PERCENT = 505;
        public static final int TYPE_TRANSITION_EASING = 501;

        static {
                java.lang.String r0 = "transitionEasing"
                java.lang.String r1 = "drawPath"
                java.lang.String r2 = "percentWidth"
                java.lang.String r3 = "percentHeight"
                java.lang.String r4 = "sizePercent"
                java.lang.String r5 = "percentX"
                java.lang.String r6 = "percentY"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
                androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.KEY_WORDS = r0
                return
        }

        static int getId(java.lang.String r2) {
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1812823328: goto L4f;
                    case -1127236479: goto L44;
                    case -1017587252: goto L39;
                    case -827014263: goto L2e;
                    case -200259324: goto L23;
                    case 428090547: goto L18;
                    case 428090548: goto Ld;
                    default: goto Lb;
                }
            Lb:
                r2 = r1
                goto L59
            Ld:
                java.lang.String r0 = "percentY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L16
                goto Lb
            L16:
                r2 = 6
                goto L59
            L18:
                java.lang.String r0 = "percentX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L21
                goto Lb
            L21:
                r2 = 5
                goto L59
            L23:
                java.lang.String r0 = "sizePercent"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L2c
                goto Lb
            L2c:
                r2 = 4
                goto L59
            L2e:
                java.lang.String r0 = "drawPath"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L37
                goto Lb
            L37:
                r2 = 3
                goto L59
            L39:
                java.lang.String r0 = "percentHeight"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L42
                goto Lb
            L42:
                r2 = 2
                goto L59
            L44:
                java.lang.String r0 = "percentWidth"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L4d
                goto Lb
            L4d:
                r2 = 1
                goto L59
            L4f:
                java.lang.String r0 = "transitionEasing"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L58
                goto Lb
            L58:
                r2 = 0
            L59:
                switch(r2) {
                    case 0: goto L6f;
                    case 1: goto L6c;
                    case 2: goto L69;
                    case 3: goto L66;
                    case 4: goto L63;
                    case 5: goto L60;
                    case 6: goto L5d;
                    default: goto L5c;
                }
            L5c:
                return r1
            L5d:
                r2 = 507(0x1fb, float:7.1E-43)
                return r2
            L60:
                r2 = 506(0x1fa, float:7.09E-43)
                return r2
            L63:
                r2 = 505(0x1f9, float:7.08E-43)
                return r2
            L66:
                r2 = 502(0x1f6, float:7.03E-43)
                return r2
            L69:
                r2 = 504(0x1f8, float:7.06E-43)
                return r2
            L6c:
                r2 = 503(0x1f7, float:7.05E-43)
                return r2
            L6f:
                r2 = 501(0x1f5, float:7.02E-43)
                return r2
        }

        static int getType(int r1) {
                r0 = 100
                if (r1 == r0) goto L12
                r0 = 101(0x65, float:1.42E-43)
                if (r1 == r0) goto Lf
                switch(r1) {
                    case 501: goto Lf;
                    case 502: goto Lf;
                    case 503: goto Ld;
                    case 504: goto Ld;
                    case 505: goto Ld;
                    case 506: goto Ld;
                    case 507: goto Ld;
                    case 508: goto L12;
                    default: goto Lb;
                }
            Lb:
                r1 = -1
                return r1
            Ld:
                r1 = 4
                return r1
            Lf:
                r1 = 8
                return r1
            L12:
                r1 = 2
                return r1
        }
    }

    public interface TransitionType {
        public static final java.lang.String[] KEY_WORDS = null;
        public static final java.lang.String NAME = "Transitions";
        public static final java.lang.String S_AUTO_TRANSITION = "autoTransition";
        public static final java.lang.String S_DURATION = "duration";
        public static final java.lang.String S_FROM = "from";
        public static final java.lang.String S_INTERPOLATOR = "motionInterpolator";
        public static final java.lang.String S_PATH_MOTION_ARC = "pathMotionArc";
        public static final java.lang.String S_STAGGERED = "staggered";
        public static final java.lang.String S_TO = "to";
        public static final java.lang.String S_TRANSITION_FLAGS = "transitionFlags";
        public static final int TYPE_AUTO_TRANSITION = 704;
        public static final int TYPE_DURATION = 700;
        public static final int TYPE_FROM = 701;
        public static final int TYPE_INTERPOLATOR = 705;
        public static final int TYPE_PATH_MOTION_ARC = 509;
        public static final int TYPE_STAGGERED = 706;
        public static final int TYPE_TO = 702;
        public static final int TYPE_TRANSITION_FLAGS = 707;

        static {
                java.lang.String r0 = "duration"
                java.lang.String r1 = "from"
                java.lang.String r2 = "to"
                java.lang.String r3 = "pathMotionArc"
                java.lang.String r4 = "autoTransition"
                java.lang.String r5 = "motionInterpolator"
                java.lang.String r6 = "staggered"
                java.lang.String r7 = "from"
                java.lang.String r8 = "transitionFlags"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
                androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.KEY_WORDS = r0
                return
        }

        static int getId(java.lang.String r2) {
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1996906958: goto L5b;
                    case -1992012396: goto L50;
                    case -1357874275: goto L45;
                    case -1298065308: goto L3a;
                    case 3707: goto L2f;
                    case 3151786: goto L24;
                    case 1310733335: goto L19;
                    case 1839260940: goto Le;
                    default: goto Lb;
                }
            Lb:
                r2 = r1
                goto L65
            Le:
                java.lang.String r0 = "staggered"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L17
                goto Lb
            L17:
                r2 = 7
                goto L65
            L19:
                java.lang.String r0 = "pathMotionArc"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L22
                goto Lb
            L22:
                r2 = 6
                goto L65
            L24:
                java.lang.String r0 = "from"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L2d
                goto Lb
            L2d:
                r2 = 5
                goto L65
            L2f:
                java.lang.String r0 = "to"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L38
                goto Lb
            L38:
                r2 = 4
                goto L65
            L3a:
                java.lang.String r0 = "autoTransition"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L43
                goto Lb
            L43:
                r2 = 3
                goto L65
            L45:
                java.lang.String r0 = "motionInterpolator"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L4e
                goto Lb
            L4e:
                r2 = 2
                goto L65
            L50:
                java.lang.String r0 = "duration"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L59
                goto Lb
            L59:
                r2 = 1
                goto L65
            L5b:
                java.lang.String r0 = "transitionFlags"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L64
                goto Lb
            L64:
                r2 = 0
            L65:
                switch(r2) {
                    case 0: goto L7e;
                    case 1: goto L7b;
                    case 2: goto L78;
                    case 3: goto L75;
                    case 4: goto L72;
                    case 5: goto L6f;
                    case 6: goto L6c;
                    case 7: goto L69;
                    default: goto L68;
                }
            L68:
                return r1
            L69:
                r2 = 706(0x2c2, float:9.9E-43)
                return r2
            L6c:
                r2 = 509(0x1fd, float:7.13E-43)
                return r2
            L6f:
                r2 = 701(0x2bd, float:9.82E-43)
                return r2
            L72:
                r2 = 702(0x2be, float:9.84E-43)
                return r2
            L75:
                r2 = 704(0x2c0, float:9.87E-43)
                return r2
            L78:
                r2 = 705(0x2c1, float:9.88E-43)
                return r2
            L7b:
                r2 = 700(0x2bc, float:9.81E-43)
                return r2
            L7e:
                r2 = 707(0x2c3, float:9.91E-43)
                return r2
        }

        static int getType(int r1) {
                r0 = 509(0x1fd, float:7.13E-43)
                if (r1 == r0) goto L11
                switch(r1) {
                    case 700: goto L11;
                    case 701: goto Le;
                    case 702: goto Le;
                    default: goto L7;
                }
            L7:
                switch(r1) {
                    case 705: goto Le;
                    case 706: goto Lc;
                    case 707: goto Le;
                    default: goto La;
                }
            La:
                r1 = -1
                return r1
            Lc:
                r1 = 4
                return r1
            Le:
                r1 = 8
                return r1
            L11:
                r1 = 2
                return r1
        }
    }

    public interface TriggerType {
        public static final java.lang.String CROSS = "CROSS";
        public static final java.lang.String[] KEY_WORDS = null;
        public static final java.lang.String NAME = "KeyTrigger";
        public static final java.lang.String NEGATIVE_CROSS = "negativeCross";
        public static final java.lang.String POSITIVE_CROSS = "positiveCross";
        public static final java.lang.String POST_LAYOUT = "postLayout";
        public static final java.lang.String TRIGGER_COLLISION_ID = "triggerCollisionId";
        public static final java.lang.String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
        public static final java.lang.String TRIGGER_ID = "triggerID";
        public static final java.lang.String TRIGGER_RECEIVER = "triggerReceiver";
        public static final java.lang.String TRIGGER_SLACK = "triggerSlack";
        public static final int TYPE_CROSS = 312;
        public static final int TYPE_NEGATIVE_CROSS = 310;
        public static final int TYPE_POSITIVE_CROSS = 309;
        public static final int TYPE_POST_LAYOUT = 304;
        public static final int TYPE_TRIGGER_COLLISION_ID = 307;
        public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
        public static final int TYPE_TRIGGER_ID = 308;
        public static final int TYPE_TRIGGER_RECEIVER = 311;
        public static final int TYPE_TRIGGER_SLACK = 305;
        public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
        public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
        public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
        public static final java.lang.String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
        public static final java.lang.String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
        public static final java.lang.String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";

        static {
                java.lang.String r0 = "viewTransitionOnCross"
                java.lang.String r1 = "viewTransitionOnPositiveCross"
                java.lang.String r2 = "viewTransitionOnNegativeCross"
                java.lang.String r3 = "postLayout"
                java.lang.String r4 = "triggerSlack"
                java.lang.String r5 = "triggerCollisionView"
                java.lang.String r6 = "triggerCollisionId"
                java.lang.String r7 = "triggerID"
                java.lang.String r8 = "positiveCross"
                java.lang.String r9 = "negativeCross"
                java.lang.String r10 = "triggerReceiver"
                java.lang.String r11 = "CROSS"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
                androidx.constraintlayout.core.motion.utils.TypedValues.TriggerType.KEY_WORDS = r0
                return
        }

        static int getId(java.lang.String r2) {
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1594793529: goto L90;
                    case -966421266: goto L84;
                    case -786670827: goto L79;
                    case -648752941: goto L6e;
                    case -638126837: goto L63;
                    case -76025313: goto L58;
                    case -9754574: goto L4d;
                    case 64397344: goto L42;
                    case 364489912: goto L35;
                    case 1301930599: goto L28;
                    case 1401391082: goto L1b;
                    case 1535404999: goto Le;
                    default: goto Lb;
                }
            Lb:
                r2 = r1
                goto L9b
            Le:
                java.lang.String r0 = "triggerReceiver"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L17
                goto Lb
            L17:
                r2 = 11
                goto L9b
            L1b:
                java.lang.String r0 = "postLayout"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L24
                goto Lb
            L24:
                r2 = 10
                goto L9b
            L28:
                java.lang.String r0 = "viewTransitionOnCross"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L31
                goto Lb
            L31:
                r2 = 9
                goto L9b
            L35:
                java.lang.String r0 = "triggerSlack"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L3e
                goto Lb
            L3e:
                r2 = 8
                goto L9b
            L42:
                java.lang.String r0 = "CROSS"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L4b
                goto Lb
            L4b:
                r2 = 7
                goto L9b
            L4d:
                java.lang.String r0 = "viewTransitionOnNegativeCross"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L56
                goto Lb
            L56:
                r2 = 6
                goto L9b
            L58:
                java.lang.String r0 = "triggerCollisionView"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L61
                goto Lb
            L61:
                r2 = 5
                goto L9b
            L63:
                java.lang.String r0 = "negativeCross"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L6c
                goto Lb
            L6c:
                r2 = 4
                goto L9b
            L6e:
                java.lang.String r0 = "triggerID"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L77
                goto Lb
            L77:
                r2 = 3
                goto L9b
            L79:
                java.lang.String r0 = "triggerCollisionId"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L82
                goto Lb
            L82:
                r2 = 2
                goto L9b
            L84:
                java.lang.String r0 = "viewTransitionOnPositiveCross"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L8e
                goto Lb
            L8e:
                r2 = 1
                goto L9b
            L90:
                java.lang.String r0 = "positiveCross"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L9a
                goto Lb
            L9a:
                r2 = 0
            L9b:
                switch(r2) {
                    case 0: goto Lc0;
                    case 1: goto Lbd;
                    case 2: goto Lba;
                    case 3: goto Lb7;
                    case 4: goto Lb4;
                    case 5: goto Lb1;
                    case 6: goto Lae;
                    case 7: goto Lab;
                    case 8: goto La8;
                    case 9: goto La5;
                    case 10: goto La2;
                    case 11: goto L9f;
                    default: goto L9e;
                }
            L9e:
                return r1
            L9f:
                r2 = 311(0x137, float:4.36E-43)
                return r2
            La2:
                r2 = 304(0x130, float:4.26E-43)
                return r2
            La5:
                r2 = 301(0x12d, float:4.22E-43)
                return r2
            La8:
                r2 = 305(0x131, float:4.27E-43)
                return r2
            Lab:
                r2 = 312(0x138, float:4.37E-43)
                return r2
            Lae:
                r2 = 303(0x12f, float:4.25E-43)
                return r2
            Lb1:
                r2 = 306(0x132, float:4.29E-43)
                return r2
            Lb4:
                r2 = 310(0x136, float:4.34E-43)
                return r2
            Lb7:
                r2 = 308(0x134, float:4.32E-43)
                return r2
            Lba:
                r2 = 307(0x133, float:4.3E-43)
                return r2
            Lbd:
                r2 = 302(0x12e, float:4.23E-43)
                return r2
            Lc0:
                r2 = 309(0x135, float:4.33E-43)
                return r2
        }
    }

    int getId(java.lang.String r1);

    boolean setValue(int r1, float r2);

    boolean setValue(int r1, int r2);

    boolean setValue(int r1, java.lang.String r2);

    boolean setValue(int r1, boolean r2);
}
