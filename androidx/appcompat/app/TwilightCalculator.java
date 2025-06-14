package androidx.appcompat.app;

/* loaded from: classes.dex */
class TwilightCalculator {
    private static final float ALTIDUTE_CORRECTION_CIVIL_TWILIGHT = -0.10471976f;

    /* renamed from: C1 */
    private static final float f8C1 = 0.0334196f;

    /* renamed from: C2 */
    private static final float f9C2 = 3.49066E-4f;

    /* renamed from: C3 */
    private static final float f10C3 = 5.236E-6f;
    public static final int DAY = 0;
    private static final float DEGREES_TO_RADIANS = 0.017453292f;

    /* renamed from: J0 */
    private static final float f11J0 = 9.0E-4f;
    public static final int NIGHT = 1;
    private static final float OBLIQUITY = 0.4092797f;
    private static final long UTC_2000 = 946728000000L;
    private static androidx.appcompat.app.TwilightCalculator sInstance;
    public int state;
    public long sunrise;
    public long sunset;

    TwilightCalculator() {
            r0 = this;
            r0.<init>()
            return
    }

    static androidx.appcompat.app.TwilightCalculator getInstance() {
            androidx.appcompat.app.TwilightCalculator r0 = androidx.appcompat.app.TwilightCalculator.sInstance
            if (r0 != 0) goto Lb
            androidx.appcompat.app.TwilightCalculator r0 = new androidx.appcompat.app.TwilightCalculator
            r0.<init>()
            androidx.appcompat.app.TwilightCalculator.sInstance = r0
        Lb:
            androidx.appcompat.app.TwilightCalculator r0 = androidx.appcompat.app.TwilightCalculator.sInstance
            return r0
    }

    public void calculateTwilight(long r16, double r18, double r20) {
            r15 = this;
            r0 = r15
            r1 = 946728000000(0xdc6d62da00, double:4.67745780756E-312)
            long r3 = r16 - r1
            float r3 = (float) r3
            r4 = 1285868416(0x4ca4cb80, float:8.64E7)
            float r3 = r3 / r4
            r4 = 1015868197(0x3c8ceb25, float:0.01720197)
            float r4 = r4 * r3
            r5 = 1086828178(0x40c7ae92, float:6.24006)
            float r4 = r4 + r5
            double r5 = (double) r4
            r7 = 4584977093208571904(0x3fa11c5fc0000000, double:0.03341960161924362)
            double r9 = java.lang.Math.sin(r5)
            double r9 = r9 * r7
            double r9 = r9 + r5
            r7 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r4
            double r7 = (double) r7
            double r7 = java.lang.Math.sin(r7)
            r11 = 4555074754578481152(0x3f36e05b00000000, double:3.4906598739326E-4)
            double r7 = r7 * r11
            double r9 = r9 + r7
            r7 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 * r7
            double r7 = (double) r4
            double r7 = java.lang.Math.sin(r7)
            r11 = 4527795603731644416(0x3ed5f61cc0000000, double:5.236000106378924E-6)
            double r7 = r7 * r11
            double r9 = r9 + r7
            r7 = 4610769955021710130(0x3ffcbed85e1ce332, double:1.796593063)
            double r9 = r9 + r7
            r7 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r9 = r9 + r7
            r7 = r20
            double r7 = -r7
            r11 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r7 = r7 / r11
            r4 = 980151802(0x3a6bedfa, float:9.0E-4)
            float r3 = r3 - r4
            double r11 = (double) r3
            double r11 = r11 - r7
            long r11 = java.lang.Math.round(r11)
            float r3 = (float) r11
            float r3 = r3 + r4
            double r3 = (double) r3
            double r3 = r3 + r7
            r7 = 4572760506128099233(0x3f75b573eab367a1, double:0.0053)
            double r5 = java.lang.Math.sin(r5)
            double r5 = r5 * r7
            double r3 = r3 + r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r9
            double r5 = java.lang.Math.sin(r5)
            r7 = -4648766856319305620(0xbf7c432ca57a786c, double:-0.0069)
            double r5 = r5 * r7
            double r3 = r3 + r5
            double r5 = java.lang.Math.sin(r9)
            r7 = 4601044547609296896(0x3fda31a380000000, double:0.4092797040939331)
            double r7 = java.lang.Math.sin(r7)
            double r5 = r5 * r7
            double r5 = java.lang.Math.asin(r5)
            r7 = 4580687790437564416(0x3f91df46a0000000, double:0.01745329238474369)
            double r7 = r7 * r18
            r9 = -4631161762379464704(0xbfbaceea00000000, double:-0.10471975803375244)
            double r9 = java.lang.Math.sin(r9)
            double r11 = java.lang.Math.sin(r7)
            double r13 = java.lang.Math.sin(r5)
            double r11 = r11 * r13
            double r9 = r9 - r11
            double r7 = java.lang.Math.cos(r7)
            double r5 = java.lang.Math.cos(r5)
            double r7 = r7 * r5
            double r9 = r9 / r7
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            r6 = 1
            r7 = -1
            if (r5 < 0) goto Lc1
            r0.state = r6
            r0.sunset = r7
            r0.sunrise = r7
            return
        Lc1:
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r11 = 0
            if (r5 > 0) goto Lcf
            r0.state = r11
            r0.sunset = r7
            r0.sunrise = r7
            return
        Lcf:
            double r7 = java.lang.Math.acos(r9)
            r9 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r7 = r7 / r9
            float r5 = (float) r7
            double r7 = (double) r5
            double r9 = r3 + r7
            r12 = 4725570615333879808(0x4194997000000000, double:8.64E7)
            double r9 = r9 * r12
            long r9 = java.lang.Math.round(r9)
            long r9 = r9 + r1
            r0.sunset = r9
            double r3 = r3 - r7
            double r3 = r3 * r12
            long r3 = java.lang.Math.round(r3)
            long r3 = r3 + r1
            r0.sunrise = r3
            int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r1 >= 0) goto L100
            long r1 = r0.sunset
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 <= 0) goto L100
            r0.state = r11
            goto L102
        L100:
            r0.state = r6
        L102:
            return
    }
}
