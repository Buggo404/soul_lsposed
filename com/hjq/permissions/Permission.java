package com.hjq.permissions;

/* loaded from: classes.dex */
public final class Permission {
    public static final java.lang.String ACCEPT_HANDOVER = "android.permission.ACCEPT_HANDOVER";
    public static final java.lang.String ACCESS_BACKGROUND_LOCATION = "android.permission.ACCESS_BACKGROUND_LOCATION";
    public static final java.lang.String ACCESS_COARSE_LOCATION = "android.permission.ACCESS_COARSE_LOCATION";
    public static final java.lang.String ACCESS_FINE_LOCATION = "android.permission.ACCESS_FINE_LOCATION";
    public static final java.lang.String ACCESS_MEDIA_LOCATION = "android.permission.ACCESS_MEDIA_LOCATION";
    public static final java.lang.String ACCESS_NOTIFICATION_POLICY = "android.permission.ACCESS_NOTIFICATION_POLICY";
    public static final java.lang.String ACTIVITY_RECOGNITION = "android.permission.ACTIVITY_RECOGNITION";
    public static final java.lang.String ADD_VOICEMAIL = "com.android.voicemail.permission.ADD_VOICEMAIL";
    public static final java.lang.String ANSWER_PHONE_CALLS = "android.permission.ANSWER_PHONE_CALLS";
    public static final java.lang.String BIND_NOTIFICATION_LISTENER_SERVICE = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE";
    public static final java.lang.String BIND_VPN_SERVICE = "android.permission.BIND_VPN_SERVICE";
    public static final java.lang.String BLUETOOTH_ADVERTISE = "android.permission.BLUETOOTH_ADVERTISE";
    public static final java.lang.String BLUETOOTH_CONNECT = "android.permission.BLUETOOTH_CONNECT";
    public static final java.lang.String BLUETOOTH_SCAN = "android.permission.BLUETOOTH_SCAN";
    public static final java.lang.String BODY_SENSORS = "android.permission.BODY_SENSORS";
    public static final java.lang.String BODY_SENSORS_BACKGROUND = "android.permission.BODY_SENSORS_BACKGROUND";
    public static final java.lang.String CALL_PHONE = "android.permission.CALL_PHONE";
    public static final java.lang.String CAMERA = "android.permission.CAMERA";
    public static final java.lang.String GET_ACCOUNTS = "android.permission.GET_ACCOUNTS";
    public static final java.lang.String GET_INSTALLED_APPS = "com.android.permission.GET_INSTALLED_APPS";
    public static final java.lang.String MANAGE_EXTERNAL_STORAGE = "android.permission.MANAGE_EXTERNAL_STORAGE";
    public static final java.lang.String NEARBY_WIFI_DEVICES = "android.permission.NEARBY_WIFI_DEVICES";
    public static final java.lang.String NOTIFICATION_SERVICE = "android.permission.NOTIFICATION_SERVICE";
    public static final java.lang.String PACKAGE_USAGE_STATS = "android.permission.PACKAGE_USAGE_STATS";
    public static final java.lang.String PICTURE_IN_PICTURE = "android.permission.PICTURE_IN_PICTURE";
    public static final java.lang.String POST_NOTIFICATIONS = "android.permission.POST_NOTIFICATIONS";
    public static final java.lang.String PROCESS_OUTGOING_CALLS = "android.permission.PROCESS_OUTGOING_CALLS";
    public static final java.lang.String READ_CALENDAR = "android.permission.READ_CALENDAR";
    public static final java.lang.String READ_CALL_LOG = "android.permission.READ_CALL_LOG";
    public static final java.lang.String READ_CONTACTS = "android.permission.READ_CONTACTS";
    public static final java.lang.String READ_EXTERNAL_STORAGE = "android.permission.READ_EXTERNAL_STORAGE";
    public static final java.lang.String READ_MEDIA_AUDIO = "android.permission.READ_MEDIA_AUDIO";
    public static final java.lang.String READ_MEDIA_IMAGES = "android.permission.READ_MEDIA_IMAGES";
    public static final java.lang.String READ_MEDIA_VIDEO = "android.permission.READ_MEDIA_VIDEO";
    public static final java.lang.String READ_PHONE_NUMBERS = "android.permission.READ_PHONE_NUMBERS";
    public static final java.lang.String READ_PHONE_STATE = "android.permission.READ_PHONE_STATE";
    public static final java.lang.String READ_SMS = "android.permission.READ_SMS";
    public static final java.lang.String RECEIVE_MMS = "android.permission.RECEIVE_MMS";
    public static final java.lang.String RECEIVE_SMS = "android.permission.RECEIVE_SMS";
    public static final java.lang.String RECEIVE_WAP_PUSH = "android.permission.RECEIVE_WAP_PUSH";
    public static final java.lang.String RECORD_AUDIO = "android.permission.RECORD_AUDIO";
    public static final java.lang.String REQUEST_IGNORE_BATTERY_OPTIMIZATIONS = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
    public static final java.lang.String REQUEST_INSTALL_PACKAGES = "android.permission.REQUEST_INSTALL_PACKAGES";
    public static final java.lang.String SCHEDULE_EXACT_ALARM = "android.permission.SCHEDULE_EXACT_ALARM";
    public static final java.lang.String SEND_SMS = "android.permission.SEND_SMS";
    public static final java.lang.String SYSTEM_ALERT_WINDOW = "android.permission.SYSTEM_ALERT_WINDOW";
    public static final java.lang.String USE_SIP = "android.permission.USE_SIP";
    public static final java.lang.String WRITE_CALENDAR = "android.permission.WRITE_CALENDAR";
    public static final java.lang.String WRITE_CALL_LOG = "android.permission.WRITE_CALL_LOG";
    public static final java.lang.String WRITE_CONTACTS = "android.permission.WRITE_CONTACTS";
    public static final java.lang.String WRITE_EXTERNAL_STORAGE = "android.permission.WRITE_EXTERNAL_STORAGE";
    public static final java.lang.String WRITE_SETTINGS = "android.permission.WRITE_SETTINGS";

    public static final class Group {
        public static final java.lang.String[] BLUETOOTH = null;
        public static final java.lang.String[] CALENDAR = null;
        public static final java.lang.String[] CONTACTS = null;
        public static final java.lang.String[] STORAGE = null;

        static {
                java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
                java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1}
                com.hjq.permissions.Permission.Group.STORAGE = r0
                java.lang.String r0 = "android.permission.READ_CALENDAR"
                java.lang.String r1 = "android.permission.WRITE_CALENDAR"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1}
                com.hjq.permissions.Permission.Group.CALENDAR = r0
                java.lang.String r0 = "android.permission.WRITE_CONTACTS"
                java.lang.String r1 = "android.permission.GET_ACCOUNTS"
                java.lang.String r2 = "android.permission.READ_CONTACTS"
                java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
                com.hjq.permissions.Permission.Group.CONTACTS = r0
                java.lang.String r0 = "android.permission.BLUETOOTH_CONNECT"
                java.lang.String r1 = "android.permission.BLUETOOTH_ADVERTISE"
                java.lang.String r2 = "android.permission.BLUETOOTH_SCAN"
                java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
                com.hjq.permissions.Permission.Group.BLUETOOTH = r0
                return
        }

        public Group() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private Permission() {
            r0 = this;
            r0.<init>()
            return
    }
}
