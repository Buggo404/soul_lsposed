package androidx.core.location;

/* loaded from: classes.dex */
public abstract class GnssStatusCompat {
    public static final int CONSTELLATION_BEIDOU = 5;
    public static final int CONSTELLATION_GALILEO = 6;
    public static final int CONSTELLATION_GLONASS = 3;
    public static final int CONSTELLATION_GPS = 1;
    public static final int CONSTELLATION_IRNSS = 7;
    public static final int CONSTELLATION_QZSS = 4;
    public static final int CONSTELLATION_SBAS = 2;
    public static final int CONSTELLATION_UNKNOWN = 0;

    public static abstract class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onFirstFix(int r1) {
                r0 = this;
                return
        }

        public void onSatelliteStatusChanged(androidx.core.location.GnssStatusCompat r1) {
                r0 = this;
                return
        }

        public void onStarted() {
                r0 = this;
                return
        }

        public void onStopped() {
                r0 = this;
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ConstellationType {
    }

    GnssStatusCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.location.GnssStatusCompat wrap(android.location.GnssStatus r1) {
            androidx.core.location.GnssStatusWrapper r0 = new androidx.core.location.GnssStatusWrapper
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.location.GnssStatusCompat wrap(android.location.GpsStatus r1) {
            androidx.core.location.GpsStatusWrapper r0 = new androidx.core.location.GpsStatusWrapper
            r0.<init>(r1)
            return r0
    }

    public abstract float getAzimuthDegrees(int r1);

    public abstract float getBasebandCn0DbHz(int r1);

    public abstract float getCarrierFrequencyHz(int r1);

    public abstract float getCn0DbHz(int r1);

    public abstract int getConstellationType(int r1);

    public abstract float getElevationDegrees(int r1);

    public abstract int getSatelliteCount();

    public abstract int getSvid(int r1);

    public abstract boolean hasAlmanacData(int r1);

    public abstract boolean hasBasebandCn0DbHz(int r1);

    public abstract boolean hasCarrierFrequencyHz(int r1);

    public abstract boolean hasEphemerisData(int r1);

    public abstract boolean usedInFix(int r1);
}
