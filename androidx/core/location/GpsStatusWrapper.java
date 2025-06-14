package androidx.core.location;

/* loaded from: classes.dex */
class GpsStatusWrapper extends androidx.core.location.GnssStatusCompat {
    private static final int BEIDOU_PRN_COUNT = 35;
    private static final int BEIDOU_PRN_OFFSET = 200;
    private static final int GLONASS_PRN_COUNT = 24;
    private static final int GLONASS_PRN_OFFSET = 64;
    private static final int GPS_PRN_COUNT = 32;
    private static final int GPS_PRN_OFFSET = 0;
    private static final int QZSS_SVID_MAX = 200;
    private static final int QZSS_SVID_MIN = 193;
    private static final int SBAS_PRN_MAX = 64;
    private static final int SBAS_PRN_MIN = 33;
    private static final int SBAS_PRN_OFFSET = -87;
    private java.util.Iterator<android.location.GpsSatellite> mCachedIterator;
    private int mCachedIteratorPosition;
    private android.location.GpsSatellite mCachedSatellite;
    private int mCachedSatelliteCount;
    private final android.location.GpsStatus mWrapped;

    GpsStatusWrapper(android.location.GpsStatus r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            android.location.GpsStatus r2 = (android.location.GpsStatus) r2
            r1.mWrapped = r2
            r0 = -1
            r1.mCachedSatelliteCount = r0
            java.lang.Iterable r2 = r2.getSatellites()
            java.util.Iterator r2 = r2.iterator()
            r1.mCachedIterator = r2
            r1.mCachedIteratorPosition = r0
            r2 = 0
            r1.mCachedSatellite = r2
            return
    }

    private static int getConstellationFromPrn(int r2) {
            if (r2 <= 0) goto L8
            r0 = 32
            if (r2 > r0) goto L8
            r2 = 1
            return r2
        L8:
            r0 = 33
            r1 = 64
            if (r2 < r0) goto L12
            if (r2 > r1) goto L12
            r2 = 2
            return r2
        L12:
            if (r2 <= r1) goto L1a
            r0 = 88
            if (r2 > r0) goto L1a
            r2 = 3
            return r2
        L1a:
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 <= r0) goto L24
            r1 = 235(0xeb, float:3.3E-43)
            if (r2 > r1) goto L24
            r2 = 5
            return r2
        L24:
            r1 = 193(0xc1, float:2.7E-43)
            if (r2 < r1) goto L2c
            if (r2 > r0) goto L2c
            r2 = 4
            return r2
        L2c:
            r2 = 0
            return r2
    }

    private android.location.GpsSatellite getSatellite(int r3) {
            r2 = this;
            android.location.GpsStatus r0 = r2.mWrapped
            monitor-enter(r0)
            int r1 = r2.mCachedIteratorPosition     // Catch: java.lang.Throwable -> L3f
            if (r3 >= r1) goto L16
            android.location.GpsStatus r1 = r2.mWrapped     // Catch: java.lang.Throwable -> L3f
            java.lang.Iterable r1 = r1.getSatellites()     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3f
            r2.mCachedIterator = r1     // Catch: java.lang.Throwable -> L3f
            r1 = -1
            r2.mCachedIteratorPosition = r1     // Catch: java.lang.Throwable -> L3f
        L16:
            int r1 = r2.mCachedIteratorPosition     // Catch: java.lang.Throwable -> L3f
            if (r1 >= r3) goto L35
            int r1 = r1 + 1
            r2.mCachedIteratorPosition = r1     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator<android.location.GpsSatellite> r1 = r2.mCachedIterator     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r1.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L2a
            r3 = 0
            r2.mCachedSatellite = r3     // Catch: java.lang.Throwable -> L3f
            goto L35
        L2a:
            java.util.Iterator<android.location.GpsSatellite> r1 = r2.mCachedIterator     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L3f
            android.location.GpsSatellite r1 = (android.location.GpsSatellite) r1     // Catch: java.lang.Throwable -> L3f
            r2.mCachedSatellite = r1     // Catch: java.lang.Throwable -> L3f
            goto L16
        L35:
            android.location.GpsSatellite r3 = r2.mCachedSatellite     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
            android.location.GpsSatellite r3 = (android.location.GpsSatellite) r3
            return r3
        L3f:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r3
    }

    private static int getSvidFromPrn(int r2) {
            int r0 = getConstellationFromPrn(r2)
            r1 = 2
            if (r0 == r1) goto L14
            r1 = 3
            if (r0 == r1) goto L11
            r1 = 5
            if (r0 == r1) goto Le
            goto L16
        Le:
            int r2 = r2 + (-200)
            goto L16
        L11:
            int r2 = r2 + (-64)
            goto L16
        L14:
            int r2 = r2 + 87
        L16:
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.core.location.GpsStatusWrapper
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            androidx.core.location.GpsStatusWrapper r2 = (androidx.core.location.GpsStatusWrapper) r2
            android.location.GpsStatus r0 = r1.mWrapped
            android.location.GpsStatus r2 = r2.mWrapped
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            float r1 = r1.getAzimuth()
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            float r1 = r1.getSnr()
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            int r1 = r1.getPrn()
            int r1 = getConstellationFromPrn(r1)
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            float r1 = r1.getElevation()
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
            r3 = this;
            android.location.GpsStatus r0 = r3.mWrapped
            monitor-enter(r0)
            int r1 = r3.mCachedSatelliteCount     // Catch: java.lang.Throwable -> L2f
            r2 = -1
            if (r1 != r2) goto L2b
            android.location.GpsStatus r1 = r3.mWrapped     // Catch: java.lang.Throwable -> L2f
            java.lang.Iterable r1 = r1.getSatellites()     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2f
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2f
            android.location.GpsSatellite r2 = (android.location.GpsSatellite) r2     // Catch: java.lang.Throwable -> L2f
            int r2 = r3.mCachedSatelliteCount     // Catch: java.lang.Throwable -> L2f
            int r2 = r2 + 1
            r3.mCachedSatelliteCount = r2     // Catch: java.lang.Throwable -> L2f
            goto L12
        L25:
            int r1 = r3.mCachedSatelliteCount     // Catch: java.lang.Throwable -> L2f
            int r1 = r1 + 1
            r3.mCachedSatelliteCount = r1     // Catch: java.lang.Throwable -> L2f
        L2b:
            int r1 = r3.mCachedSatelliteCount     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r1
        L2f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            int r1 = r1.getPrn()
            int r1 = getSvidFromPrn(r1)
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            boolean r1 = r1.hasAlmanac()
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            boolean r1 = r1.hasEphemeris()
            return r1
    }

    public int hashCode() {
            r1 = this;
            android.location.GpsStatus r0 = r1.mWrapped
            int r0 = r0.hashCode()
            return r0
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int r1) {
            r0 = this;
            android.location.GpsSatellite r1 = r0.getSatellite(r1)
            boolean r1 = r1.usedInFix()
            return r1
    }
}
