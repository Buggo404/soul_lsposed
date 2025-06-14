package androidx.core.app;

/* loaded from: classes.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final java.lang.String CATEGORY_ALARM = "alarm";
    public static final java.lang.String CATEGORY_CALL = "call";
    public static final java.lang.String CATEGORY_EMAIL = "email";
    public static final java.lang.String CATEGORY_ERROR = "err";
    public static final java.lang.String CATEGORY_EVENT = "event";
    public static final java.lang.String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final java.lang.String CATEGORY_MESSAGE = "msg";
    public static final java.lang.String CATEGORY_MISSED_CALL = "missed_call";
    public static final java.lang.String CATEGORY_NAVIGATION = "navigation";
    public static final java.lang.String CATEGORY_PROGRESS = "progress";
    public static final java.lang.String CATEGORY_PROMO = "promo";
    public static final java.lang.String CATEGORY_RECOMMENDATION = "recommendation";
    public static final java.lang.String CATEGORY_REMINDER = "reminder";
    public static final java.lang.String CATEGORY_SERVICE = "service";
    public static final java.lang.String CATEGORY_SOCIAL = "social";
    public static final java.lang.String CATEGORY_STATUS = "status";
    public static final java.lang.String CATEGORY_STOPWATCH = "stopwatch";
    public static final java.lang.String CATEGORY_SYSTEM = "sys";
    public static final java.lang.String CATEGORY_TRANSPORT = "transport";
    public static final java.lang.String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final java.lang.String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final java.lang.String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final java.lang.String EXTRA_BIG_TEXT = "android.bigText";
    public static final java.lang.String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final java.lang.String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final java.lang.String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final java.lang.String EXTRA_COLORIZED = "android.colorized";
    public static final java.lang.String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final java.lang.String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final java.lang.String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final java.lang.String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final java.lang.String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final java.lang.String EXTRA_INFO_TEXT = "android.infoText";
    public static final java.lang.String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final java.lang.String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final java.lang.String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final java.lang.String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final java.lang.String EXTRA_MESSAGES = "android.messages";
    public static final java.lang.String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final java.lang.String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final java.lang.String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PEOPLE = "android.people";
    public static final java.lang.String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final java.lang.String EXTRA_PICTURE = "android.picture";
    public static final java.lang.String EXTRA_PROGRESS = "android.progress";
    public static final java.lang.String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final java.lang.String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final java.lang.String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final java.lang.String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final java.lang.String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final java.lang.String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final java.lang.String EXTRA_SMALL_ICON = "android.icon";
    public static final java.lang.String EXTRA_SUB_TEXT = "android.subText";
    public static final java.lang.String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final java.lang.String EXTRA_TEMPLATE = "android.template";
    public static final java.lang.String EXTRA_TEXT = "android.text";
    public static final java.lang.String EXTRA_TEXT_LINES = "android.textLines";
    public static final java.lang.String EXTRA_TITLE = "android.title";
    public static final java.lang.String EXTRA_TITLE_BIG = "android.title.big";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @java.lang.Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final java.lang.String GROUP_KEY_SILENT = "silent";
    public static final java.lang.String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    /* renamed from: androidx.core.app.NotificationCompat$1 */
    static /* synthetic */ class C01681 {
    }

    public static class Action {
        static final java.lang.String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
        static final java.lang.String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public android.app.PendingIntent actionIntent;

        @java.lang.Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private final androidx.core.app.RemoteInput[] mDataOnlyRemoteInputs;
        final android.os.Bundle mExtras;
        private androidx.core.graphics.drawable.IconCompat mIcon;
        private final boolean mIsContextual;
        private final androidx.core.app.RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        boolean mShowsUserInterface;
        public java.lang.CharSequence title;

        public static final class Builder {
            private boolean mAllowGeneratedReplies;
            private final android.os.Bundle mExtras;
            private final androidx.core.graphics.drawable.IconCompat mIcon;
            private final android.app.PendingIntent mIntent;
            private boolean mIsContextual;
            private java.util.ArrayList<androidx.core.app.RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final java.lang.CharSequence mTitle;

            public Builder(int r12, java.lang.CharSequence r13, android.app.PendingIntent r14) {
                    r11 = this;
                    r0 = 0
                    if (r12 != 0) goto L4
                    goto La
                L4:
                    java.lang.String r1 = ""
                    androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithResource(r0, r1, r12)
                La:
                    r2 = r0
                    android.os.Bundle r5 = new android.os.Bundle
                    r5.<init>()
                    r6 = 0
                    r7 = 1
                    r8 = 0
                    r9 = 1
                    r10 = 0
                    r1 = r11
                    r3 = r13
                    r4 = r14
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    return
            }

            public Builder(androidx.core.app.NotificationCompat.Action r11) {
                    r10 = this;
                    androidx.core.graphics.drawable.IconCompat r1 = r11.getIconCompat()
                    java.lang.CharSequence r2 = r11.title
                    android.app.PendingIntent r3 = r11.actionIntent
                    android.os.Bundle r4 = new android.os.Bundle
                    android.os.Bundle r0 = r11.mExtras
                    r4.<init>(r0)
                    androidx.core.app.RemoteInput[] r5 = r11.getRemoteInputs()
                    boolean r6 = r11.getAllowGeneratedReplies()
                    int r7 = r11.getSemanticAction()
                    boolean r8 = r11.mShowsUserInterface
                    boolean r9 = r11.isContextual()
                    r0 = r10
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    return
            }

            public Builder(androidx.core.graphics.drawable.IconCompat r11, java.lang.CharSequence r12, android.app.PendingIntent r13) {
                    r10 = this;
                    android.os.Bundle r4 = new android.os.Bundle
                    r4.<init>()
                    r5 = 0
                    r6 = 1
                    r7 = 0
                    r8 = 1
                    r9 = 0
                    r0 = r10
                    r1 = r11
                    r2 = r12
                    r3 = r13
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    return
            }

            private Builder(androidx.core.graphics.drawable.IconCompat r2, java.lang.CharSequence r3, android.app.PendingIntent r4, android.os.Bundle r5, androidx.core.app.RemoteInput[] r6, boolean r7, int r8, boolean r9, boolean r10) {
                    r1 = this;
                    r1.<init>()
                    r0 = 1
                    r1.mAllowGeneratedReplies = r0
                    r1.mShowsUserInterface = r0
                    r1.mIcon = r2
                    java.lang.CharSequence r2 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r3)
                    r1.mTitle = r2
                    r1.mIntent = r4
                    r1.mExtras = r5
                    if (r6 != 0) goto L18
                    r2 = 0
                    goto L21
                L18:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    java.util.List r3 = java.util.Arrays.asList(r6)
                    r2.<init>(r3)
                L21:
                    r1.mRemoteInputs = r2
                    r1.mAllowGeneratedReplies = r7
                    r1.mSemanticAction = r8
                    r1.mShowsUserInterface = r9
                    r1.mIsContextual = r10
                    return
            }

            private void checkContextualActionNullFields() {
                    r2 = this;
                    boolean r0 = r2.mIsContextual
                    if (r0 != 0) goto L5
                    return
                L5:
                    android.app.PendingIntent r0 = r2.mIntent
                    if (r0 == 0) goto La
                    return
                La:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException
                    java.lang.String r1 = "Contextual Actions must contain a valid PendingIntent"
                    r0.<init>(r1)
                    throw r0
            }

            public static androidx.core.app.NotificationCompat.Action.Builder fromAndroidAction(android.app.Notification.Action r5) {
                    android.graphics.drawable.Icon r0 = r5.getIcon()
                    if (r0 == 0) goto L18
                    android.graphics.drawable.Icon r0 = r5.getIcon()
                    androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r0)
                    androidx.core.app.NotificationCompat$Action$Builder r1 = new androidx.core.app.NotificationCompat$Action$Builder
                    java.lang.CharSequence r2 = r5.title
                    android.app.PendingIntent r3 = r5.actionIntent
                    r1.<init>(r0, r2, r3)
                    goto L23
                L18:
                    androidx.core.app.NotificationCompat$Action$Builder r1 = new androidx.core.app.NotificationCompat$Action$Builder
                    int r0 = r5.icon
                    java.lang.CharSequence r2 = r5.title
                    android.app.PendingIntent r3 = r5.actionIntent
                    r1.<init>(r0, r2, r3)
                L23:
                    android.app.RemoteInput[] r0 = r5.getRemoteInputs()
                    if (r0 == 0) goto L3c
                    int r2 = r0.length
                    if (r2 == 0) goto L3c
                    int r2 = r0.length
                    r3 = 0
                L2e:
                    if (r3 >= r2) goto L3c
                    r4 = r0[r3]
                    androidx.core.app.RemoteInput r4 = androidx.core.app.RemoteInput.fromPlatform(r4)
                    r1.addRemoteInput(r4)
                    int r3 = r3 + 1
                    goto L2e
                L3c:
                    boolean r0 = r5.getAllowGeneratedReplies()
                    r1.mAllowGeneratedReplies = r0
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r2 = 28
                    if (r0 < r2) goto L4f
                    int r0 = r5.getSemanticAction()
                    r1.setSemanticAction(r0)
                L4f:
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r2 = 29
                    if (r0 < r2) goto L5c
                    boolean r5 = r5.isContextual()
                    r1.setContextual(r5)
                L5c:
                    return r1
            }

            public androidx.core.app.NotificationCompat.Action.Builder addExtras(android.os.Bundle r2) {
                    r1 = this;
                    if (r2 == 0) goto L7
                    android.os.Bundle r0 = r1.mExtras
                    r0.putAll(r2)
                L7:
                    return r1
            }

            public androidx.core.app.NotificationCompat.Action.Builder addRemoteInput(androidx.core.app.RemoteInput r2) {
                    r1 = this;
                    java.util.ArrayList<androidx.core.app.RemoteInput> r0 = r1.mRemoteInputs
                    if (r0 != 0) goto Lb
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r1.mRemoteInputs = r0
                Lb:
                    if (r2 == 0) goto L12
                    java.util.ArrayList<androidx.core.app.RemoteInput> r0 = r1.mRemoteInputs
                    r0.add(r2)
                L12:
                    return r1
            }

            public androidx.core.app.NotificationCompat.Action build() {
                    r15 = this;
                    r15.checkContextualActionNullFields()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList<androidx.core.app.RemoteInput> r2 = r15.mRemoteInputs
                    if (r2 == 0) goto L2f
                    java.util.Iterator r2 = r2.iterator()
                L15:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L2f
                    java.lang.Object r3 = r2.next()
                    androidx.core.app.RemoteInput r3 = (androidx.core.app.RemoteInput) r3
                    boolean r4 = r3.isDataOnly()
                    if (r4 == 0) goto L2b
                    r0.add(r3)
                    goto L15
                L2b:
                    r1.add(r3)
                    goto L15
                L2f:
                    boolean r2 = r0.isEmpty()
                    r3 = 0
                    if (r2 == 0) goto L38
                    r10 = r3
                    goto L45
                L38:
                    int r2 = r0.size()
                    androidx.core.app.RemoteInput[] r2 = new androidx.core.app.RemoteInput[r2]
                    java.lang.Object[] r0 = r0.toArray(r2)
                    androidx.core.app.RemoteInput[] r0 = (androidx.core.app.RemoteInput[]) r0
                    r10 = r0
                L45:
                    boolean r0 = r1.isEmpty()
                    if (r0 == 0) goto L4c
                    goto L59
                L4c:
                    int r0 = r1.size()
                    androidx.core.app.RemoteInput[] r0 = new androidx.core.app.RemoteInput[r0]
                    java.lang.Object[] r0 = r1.toArray(r0)
                    r3 = r0
                    androidx.core.app.RemoteInput[] r3 = (androidx.core.app.RemoteInput[]) r3
                L59:
                    r9 = r3
                    androidx.core.app.NotificationCompat$Action r0 = new androidx.core.app.NotificationCompat$Action
                    androidx.core.graphics.drawable.IconCompat r5 = r15.mIcon
                    java.lang.CharSequence r6 = r15.mTitle
                    android.app.PendingIntent r7 = r15.mIntent
                    android.os.Bundle r8 = r15.mExtras
                    boolean r11 = r15.mAllowGeneratedReplies
                    int r12 = r15.mSemanticAction
                    boolean r13 = r15.mShowsUserInterface
                    boolean r14 = r15.mIsContextual
                    r4 = r0
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    return r0
            }

            public androidx.core.app.NotificationCompat.Action.Builder extend(androidx.core.app.NotificationCompat.Action.Extender r1) {
                    r0 = this;
                    r1.extend(r0)
                    return r0
            }

            public android.os.Bundle getExtras() {
                    r1 = this;
                    android.os.Bundle r0 = r1.mExtras
                    return r0
            }

            public androidx.core.app.NotificationCompat.Action.Builder setAllowGeneratedReplies(boolean r1) {
                    r0 = this;
                    r0.mAllowGeneratedReplies = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.Action.Builder setContextual(boolean r1) {
                    r0 = this;
                    r0.mIsContextual = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.Action.Builder setSemanticAction(int r1) {
                    r0 = this;
                    r0.mSemanticAction = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.Action.Builder setShowsUserInterface(boolean r1) {
                    r0 = this;
                    r0.mShowsUserInterface = r1
                    return r0
            }
        }

        public interface Extender {
            androidx.core.app.NotificationCompat.Action.Builder extend(androidx.core.app.NotificationCompat.Action.Builder r1);
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public static final class WearableExtender implements androidx.core.app.NotificationCompat.Action.Extender {
            private static final int DEFAULT_FLAGS = 1;
            private static final java.lang.String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final java.lang.String KEY_CANCEL_LABEL = "cancelLabel";
            private static final java.lang.String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final java.lang.String KEY_FLAGS = "flags";
            private static final java.lang.String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private java.lang.CharSequence mCancelLabel;
            private java.lang.CharSequence mConfirmLabel;
            private int mFlags;
            private java.lang.CharSequence mInProgressLabel;

            public WearableExtender() {
                    r1 = this;
                    r1.<init>()
                    r0 = 1
                    r1.mFlags = r0
                    return
            }

            public WearableExtender(androidx.core.app.NotificationCompat.Action r3) {
                    r2 = this;
                    r2.<init>()
                    r0 = 1
                    r2.mFlags = r0
                    android.os.Bundle r3 = r3.getExtras()
                    java.lang.String r1 = "android.wearable.EXTENSIONS"
                    android.os.Bundle r3 = r3.getBundle(r1)
                    if (r3 == 0) goto L32
                    java.lang.String r1 = "flags"
                    int r0 = r3.getInt(r1, r0)
                    r2.mFlags = r0
                    java.lang.String r0 = "inProgressLabel"
                    java.lang.CharSequence r0 = r3.getCharSequence(r0)
                    r2.mInProgressLabel = r0
                    java.lang.String r0 = "confirmLabel"
                    java.lang.CharSequence r0 = r3.getCharSequence(r0)
                    r2.mConfirmLabel = r0
                    java.lang.String r0 = "cancelLabel"
                    java.lang.CharSequence r3 = r3.getCharSequence(r0)
                    r2.mCancelLabel = r3
                L32:
                    return
            }

            private void setFlag(int r1, boolean r2) {
                    r0 = this;
                    if (r2 == 0) goto L8
                    int r2 = r0.mFlags
                    r1 = r1 | r2
                    r0.mFlags = r1
                    goto Le
                L8:
                    int r2 = r0.mFlags
                    int r1 = ~r1
                    r1 = r1 & r2
                    r0.mFlags = r1
                Le:
                    return
            }

            public androidx.core.app.NotificationCompat.Action.WearableExtender clone() {
                    r2 = this;
                    androidx.core.app.NotificationCompat$Action$WearableExtender r0 = new androidx.core.app.NotificationCompat$Action$WearableExtender
                    r0.<init>()
                    int r1 = r2.mFlags
                    r0.mFlags = r1
                    java.lang.CharSequence r1 = r2.mInProgressLabel
                    r0.mInProgressLabel = r1
                    java.lang.CharSequence r1 = r2.mConfirmLabel
                    r0.mConfirmLabel = r1
                    java.lang.CharSequence r1 = r2.mCancelLabel
                    r0.mCancelLabel = r1
                    return r0
            }

            /* renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ java.lang.Object m131clone() throws java.lang.CloneNotSupportedException {
                    r1 = this;
                    androidx.core.app.NotificationCompat$Action$WearableExtender r0 = r1.clone()
                    return r0
            }

            @Override // androidx.core.app.NotificationCompat.Action.Extender
            public androidx.core.app.NotificationCompat.Action.Builder extend(androidx.core.app.NotificationCompat.Action.Builder r4) {
                    r3 = this;
                    android.os.Bundle r0 = new android.os.Bundle
                    r0.<init>()
                    int r1 = r3.mFlags
                    r2 = 1
                    if (r1 == r2) goto Lf
                    java.lang.String r2 = "flags"
                    r0.putInt(r2, r1)
                Lf:
                    java.lang.CharSequence r1 = r3.mInProgressLabel
                    if (r1 == 0) goto L18
                    java.lang.String r2 = "inProgressLabel"
                    r0.putCharSequence(r2, r1)
                L18:
                    java.lang.CharSequence r1 = r3.mConfirmLabel
                    if (r1 == 0) goto L21
                    java.lang.String r2 = "confirmLabel"
                    r0.putCharSequence(r2, r1)
                L21:
                    java.lang.CharSequence r1 = r3.mCancelLabel
                    if (r1 == 0) goto L2a
                    java.lang.String r2 = "cancelLabel"
                    r0.putCharSequence(r2, r1)
                L2a:
                    android.os.Bundle r1 = r4.getExtras()
                    java.lang.String r2 = "android.wearable.EXTENSIONS"
                    r1.putBundle(r2, r0)
                    return r4
            }

            @java.lang.Deprecated
            public java.lang.CharSequence getCancelLabel() {
                    r1 = this;
                    java.lang.CharSequence r0 = r1.mCancelLabel
                    return r0
            }

            @java.lang.Deprecated
            public java.lang.CharSequence getConfirmLabel() {
                    r1 = this;
                    java.lang.CharSequence r0 = r1.mConfirmLabel
                    return r0
            }

            public boolean getHintDisplayActionInline() {
                    r1 = this;
                    int r0 = r1.mFlags
                    r0 = r0 & 4
                    if (r0 == 0) goto L8
                    r0 = 1
                    goto L9
                L8:
                    r0 = 0
                L9:
                    return r0
            }

            public boolean getHintLaunchesActivity() {
                    r1 = this;
                    int r0 = r1.mFlags
                    r0 = r0 & 2
                    if (r0 == 0) goto L8
                    r0 = 1
                    goto L9
                L8:
                    r0 = 0
                L9:
                    return r0
            }

            @java.lang.Deprecated
            public java.lang.CharSequence getInProgressLabel() {
                    r1 = this;
                    java.lang.CharSequence r0 = r1.mInProgressLabel
                    return r0
            }

            public boolean isAvailableOffline() {
                    r2 = this;
                    int r0 = r2.mFlags
                    r1 = 1
                    r0 = r0 & r1
                    if (r0 == 0) goto L7
                    goto L8
                L7:
                    r1 = 0
                L8:
                    return r1
            }

            public androidx.core.app.NotificationCompat.Action.WearableExtender setAvailableOffline(boolean r2) {
                    r1 = this;
                    r0 = 1
                    r1.setFlag(r0, r2)
                    return r1
            }

            @java.lang.Deprecated
            public androidx.core.app.NotificationCompat.Action.WearableExtender setCancelLabel(java.lang.CharSequence r1) {
                    r0 = this;
                    r0.mCancelLabel = r1
                    return r0
            }

            @java.lang.Deprecated
            public androidx.core.app.NotificationCompat.Action.WearableExtender setConfirmLabel(java.lang.CharSequence r1) {
                    r0 = this;
                    r0.mConfirmLabel = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.Action.WearableExtender setHintDisplayActionInline(boolean r2) {
                    r1 = this;
                    r0 = 4
                    r1.setFlag(r0, r2)
                    return r1
            }

            public androidx.core.app.NotificationCompat.Action.WearableExtender setHintLaunchesActivity(boolean r2) {
                    r1 = this;
                    r0 = 2
                    r1.setFlag(r0, r2)
                    return r1
            }

            @java.lang.Deprecated
            public androidx.core.app.NotificationCompat.Action.WearableExtender setInProgressLabel(java.lang.CharSequence r1) {
                    r0 = this;
                    r0.mInProgressLabel = r1
                    return r0
            }
        }

        public Action(int r3, java.lang.CharSequence r4, android.app.PendingIntent r5) {
                r2 = this;
                r0 = 0
                if (r3 != 0) goto L4
                goto La
            L4:
                java.lang.String r1 = ""
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithResource(r0, r1, r3)
            La:
                r2.<init>(r0, r4, r5)
                return
        }

        Action(int r14, java.lang.CharSequence r15, android.app.PendingIntent r16, android.os.Bundle r17, androidx.core.app.RemoteInput[] r18, androidx.core.app.RemoteInput[] r19, boolean r20, int r21, boolean r22, boolean r23) {
                r13 = this;
                r0 = r14
                r1 = 0
                if (r0 != 0) goto L5
                goto Lb
            L5:
                java.lang.String r2 = ""
                androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createWithResource(r1, r2, r14)
            Lb:
                r3 = r1
                r2 = r13
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r8 = r19
                r9 = r20
                r10 = r21
                r11 = r22
                r12 = r23
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
        }

        public Action(androidx.core.graphics.drawable.IconCompat r12, java.lang.CharSequence r13, android.app.PendingIntent r14) {
                r11 = this;
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 0
                r0 = r11
                r1 = r12
                r2 = r13
                r3 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return
        }

        Action(androidx.core.graphics.drawable.IconCompat r3, java.lang.CharSequence r4, android.app.PendingIntent r5, android.os.Bundle r6, androidx.core.app.RemoteInput[] r7, androidx.core.app.RemoteInput[] r8, boolean r9, int r10, boolean r11, boolean r12) {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.mShowsUserInterface = r0
                r2.mIcon = r3
                if (r3 == 0) goto L17
                int r0 = r3.getType()
                r1 = 2
                if (r0 != r1) goto L17
                int r3 = r3.getResId()
                r2.icon = r3
            L17:
                java.lang.CharSequence r3 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r4)
                r2.title = r3
                r2.actionIntent = r5
                if (r6 == 0) goto L22
                goto L27
            L22:
                android.os.Bundle r6 = new android.os.Bundle
                r6.<init>()
            L27:
                r2.mExtras = r6
                r2.mRemoteInputs = r7
                r2.mDataOnlyRemoteInputs = r8
                r2.mAllowGeneratedReplies = r9
                r2.mSemanticAction = r10
                r2.mShowsUserInterface = r11
                r2.mIsContextual = r12
                return
        }

        public android.app.PendingIntent getActionIntent() {
                r1 = this;
                android.app.PendingIntent r0 = r1.actionIntent
                return r0
        }

        public boolean getAllowGeneratedReplies() {
                r1 = this;
                boolean r0 = r1.mAllowGeneratedReplies
                return r0
        }

        public androidx.core.app.RemoteInput[] getDataOnlyRemoteInputs() {
                r1 = this;
                androidx.core.app.RemoteInput[] r0 = r1.mDataOnlyRemoteInputs
                return r0
        }

        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        @java.lang.Deprecated
        public int getIcon() {
                r1 = this;
                int r0 = r1.icon
                return r0
        }

        public androidx.core.graphics.drawable.IconCompat getIconCompat() {
                r3 = this;
                androidx.core.graphics.drawable.IconCompat r0 = r3.mIcon
                if (r0 != 0) goto L11
                int r0 = r3.icon
                if (r0 == 0) goto L11
                r1 = 0
                java.lang.String r2 = ""
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithResource(r1, r2, r0)
                r3.mIcon = r0
            L11:
                androidx.core.graphics.drawable.IconCompat r0 = r3.mIcon
                return r0
        }

        public androidx.core.app.RemoteInput[] getRemoteInputs() {
                r1 = this;
                androidx.core.app.RemoteInput[] r0 = r1.mRemoteInputs
                return r0
        }

        public int getSemanticAction() {
                r1 = this;
                int r0 = r1.mSemanticAction
                return r0
        }

        public boolean getShowsUserInterface() {
                r1 = this;
                boolean r0 = r1.mShowsUserInterface
                return r0
        }

        public java.lang.CharSequence getTitle() {
                r1 = this;
                java.lang.CharSequence r0 = r1.title
                return r0
        }

        public boolean isContextual() {
                r1 = this;
                boolean r0 = r1.mIsContextual
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    public static class BigPictureStyle extends androidx.core.app.NotificationCompat.Style {
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private androidx.core.graphics.drawable.IconCompat mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private android.graphics.Bitmap mPicture;

        private static class Api16Impl {
            private Api16Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void setBigLargeIcon(android.app.Notification.BigPictureStyle r0, android.graphics.Bitmap r1) {
                    r0.bigLargeIcon(r1)
                    return
            }

            static void setSummaryText(android.app.Notification.BigPictureStyle r0, java.lang.CharSequence r1) {
                    r0.setSummaryText(r1)
                    return
            }
        }

        private static class Api23Impl {
            private Api23Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void setBigLargeIcon(android.app.Notification.BigPictureStyle r0, android.graphics.drawable.Icon r1) {
                    r0.bigLargeIcon(r1)
                    return
            }
        }

        public BigPictureStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        public BigPictureStyle(androidx.core.app.NotificationCompat.Builder r1) {
                r0 = this;
                r0.<init>()
                r0.setBuilder(r1)
                return
        }

        private static androidx.core.graphics.drawable.IconCompat asIconCompat(android.os.Parcelable r1) {
                if (r1 == 0) goto L18
                boolean r0 = r1 instanceof android.graphics.drawable.Icon
                if (r0 == 0) goto Ld
                android.graphics.drawable.Icon r1 = (android.graphics.drawable.Icon) r1
                androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r1)
                return r1
            Ld:
                boolean r0 = r1 instanceof android.graphics.Bitmap
                if (r0 == 0) goto L18
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r1)
                return r1
            L18:
                r1 = 0
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r4) {
                r3 = this;
                android.app.Notification$BigPictureStyle r0 = new android.app.Notification$BigPictureStyle
                android.app.Notification$Builder r1 = r4.getBuilder()
                r0.<init>(r1)
                java.lang.CharSequence r1 = r3.mBigContentTitle
                android.app.Notification$BigPictureStyle r0 = r0.setBigContentTitle(r1)
                android.graphics.Bitmap r1 = r3.mPicture
                android.app.Notification$BigPictureStyle r0 = r0.bigPicture(r1)
                boolean r1 = r3.mBigLargeIconSet
                if (r1 == 0) goto L35
                androidx.core.graphics.drawable.IconCompat r1 = r3.mBigLargeIcon
                r2 = 0
                if (r1 != 0) goto L22
                androidx.core.app.NotificationCompat.BigPictureStyle.Api16Impl.setBigLargeIcon(r0, r2)
                goto L35
            L22:
                boolean r1 = r4 instanceof androidx.core.app.NotificationCompatBuilder
                if (r1 == 0) goto L2c
                androidx.core.app.NotificationCompatBuilder r4 = (androidx.core.app.NotificationCompatBuilder) r4
                android.content.Context r2 = r4.getContext()
            L2c:
                androidx.core.graphics.drawable.IconCompat r4 = r3.mBigLargeIcon
                android.graphics.drawable.Icon r4 = r4.toIcon(r2)
                androidx.core.app.NotificationCompat.BigPictureStyle.Api23Impl.setBigLargeIcon(r0, r4)
            L35:
                boolean r4 = r3.mSummaryTextSet
                if (r4 == 0) goto L3e
                java.lang.CharSequence r4 = r3.mSummaryText
                androidx.core.app.NotificationCompat.BigPictureStyle.Api16Impl.setSummaryText(r0, r4)
            L3e:
                return
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigLargeIcon(android.graphics.Bitmap r1) {
                r0 = this;
                if (r1 != 0) goto L4
                r1 = 0
                goto L8
            L4:
                androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r1)
            L8:
                r0.mBigLargeIcon = r1
                r1 = 1
                r0.mBigLargeIconSet = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigPicture(android.graphics.Bitmap r1) {
                r0 = this;
                r0.mPicture = r1
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle r2) {
                r1 = this;
                super.clearCompatExtraKeys(r2)
                java.lang.String r0 = "android.largeIcon.big"
                r2.remove(r0)
                java.lang.String r0 = "android.picture"
                r2.remove(r0)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigPictureStyle"
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle r3) {
                r2 = this;
                super.restoreFromCompatExtras(r3)
                java.lang.String r0 = "android.largeIcon.big"
                boolean r1 = r3.containsKey(r0)
                if (r1 == 0) goto L18
                android.os.Parcelable r0 = r3.getParcelable(r0)
                androidx.core.graphics.drawable.IconCompat r0 = asIconCompat(r0)
                r2.mBigLargeIcon = r0
                r0 = 1
                r2.mBigLargeIconSet = r0
            L18:
                java.lang.String r0 = "android.picture"
                android.os.Parcelable r3 = r3.getParcelable(r0)
                android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
                r2.mPicture = r3
                return
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle setBigContentTitle(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r1)
                r0.mBigContentTitle = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle setSummaryText(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r1)
                r0.mSummaryText = r1
                r1 = 1
                r0.mSummaryTextSet = r1
                return r0
        }
    }

    public static class BigTextStyle extends androidx.core.app.NotificationCompat.Style {
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
        private java.lang.CharSequence mBigText;

        public BigTextStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        public BigTextStyle(androidx.core.app.NotificationCompat.Builder r1) {
                r0 = this;
                r0.<init>()
                r0.setBuilder(r1)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle r1) {
                r0 = this;
                super.addCompatExtras(r1)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r2) {
                r1 = this;
                android.app.Notification$BigTextStyle r0 = new android.app.Notification$BigTextStyle
                android.app.Notification$Builder r2 = r2.getBuilder()
                r0.<init>(r2)
                java.lang.CharSequence r2 = r1.mBigContentTitle
                android.app.Notification$BigTextStyle r2 = r0.setBigContentTitle(r2)
                java.lang.CharSequence r0 = r1.mBigText
                android.app.Notification$BigTextStyle r2 = r2.bigText(r0)
                boolean r0 = r1.mSummaryTextSet
                if (r0 == 0) goto L1e
                java.lang.CharSequence r0 = r1.mSummaryText
                r2.setSummaryText(r0)
            L1e:
                return
        }

        public androidx.core.app.NotificationCompat.BigTextStyle bigText(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r1)
                r0.mBigText = r1
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle r2) {
                r1 = this;
                super.clearCompatExtraKeys(r2)
                java.lang.String r0 = "android.bigText"
                r2.remove(r0)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigTextStyle"
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle r2) {
                r1 = this;
                super.restoreFromCompatExtras(r2)
                java.lang.String r0 = "android.bigText"
                java.lang.CharSequence r2 = r2.getCharSequence(r0)
                r1.mBigText = r2
                return
        }

        public androidx.core.app.NotificationCompat.BigTextStyle setBigContentTitle(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r1)
                r0.mBigContentTitle = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.BigTextStyle setSummaryText(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r1)
                r0.mSummaryText = r1
                r1 = 1
                r0.mSummaryTextSet = r1
                return r0
        }
    }

    public static final class BubbleMetadata {
        private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        private android.app.PendingIntent mDeleteIntent;
        private int mDesiredHeight;
        private int mDesiredHeightResId;
        private int mFlags;
        private androidx.core.graphics.drawable.IconCompat mIcon;
        private android.app.PendingIntent mPendingIntent;
        private java.lang.String mShortcutId;

        private static class Api29Impl {
            private Api29Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static androidx.core.app.NotificationCompat.BubbleMetadata fromPlatform(android.app.Notification.BubbleMetadata r3) {
                    r0 = 0
                    if (r3 != 0) goto L4
                    return r0
                L4:
                    android.app.PendingIntent r1 = r3.getIntent()
                    if (r1 != 0) goto Lb
                    return r0
                Lb:
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r0 = new androidx.core.app.NotificationCompat$BubbleMetadata$Builder
                    android.app.PendingIntent r1 = r3.getIntent()
                    android.graphics.drawable.Icon r2 = r3.getIcon()
                    androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r2)
                    r0.<init>(r1, r2)
                    boolean r1 = r3.getAutoExpandBubble()
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r0 = r0.setAutoExpandBubble(r1)
                    android.app.PendingIntent r1 = r3.getDeleteIntent()
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r0 = r0.setDeleteIntent(r1)
                    boolean r1 = r3.isNotificationSuppressed()
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r0 = r0.setSuppressNotification(r1)
                    int r1 = r3.getDesiredHeight()
                    if (r1 == 0) goto L41
                    int r1 = r3.getDesiredHeight()
                    r0.setDesiredHeight(r1)
                L41:
                    int r1 = r3.getDesiredHeightResId()
                    if (r1 == 0) goto L4e
                    int r3 = r3.getDesiredHeightResId()
                    r0.setDesiredHeightResId(r3)
                L4e:
                    androidx.core.app.NotificationCompat$BubbleMetadata r3 = r0.build()
                    return r3
            }

            static android.app.Notification.BubbleMetadata toPlatform(androidx.core.app.NotificationCompat.BubbleMetadata r2) {
                    r0 = 0
                    if (r2 != 0) goto L4
                    return r0
                L4:
                    android.app.PendingIntent r1 = r2.getIntent()
                    if (r1 != 0) goto Lb
                    return r0
                Lb:
                    android.app.Notification$BubbleMetadata$Builder r0 = new android.app.Notification$BubbleMetadata$Builder
                    r0.<init>()
                    androidx.core.graphics.drawable.IconCompat r1 = r2.getIcon()
                    android.graphics.drawable.Icon r1 = r1.toIcon()
                    android.app.Notification$BubbleMetadata$Builder r0 = r0.setIcon(r1)
                    android.app.PendingIntent r1 = r2.getIntent()
                    android.app.Notification$BubbleMetadata$Builder r0 = r0.setIntent(r1)
                    android.app.PendingIntent r1 = r2.getDeleteIntent()
                    android.app.Notification$BubbleMetadata$Builder r0 = r0.setDeleteIntent(r1)
                    boolean r1 = r2.getAutoExpandBubble()
                    android.app.Notification$BubbleMetadata$Builder r0 = r0.setAutoExpandBubble(r1)
                    boolean r1 = r2.isNotificationSuppressed()
                    android.app.Notification$BubbleMetadata$Builder r0 = r0.setSuppressNotification(r1)
                    int r1 = r2.getDesiredHeight()
                    if (r1 == 0) goto L49
                    int r1 = r2.getDesiredHeight()
                    r0.setDesiredHeight(r1)
                L49:
                    int r1 = r2.getDesiredHeightResId()
                    if (r1 == 0) goto L56
                    int r2 = r2.getDesiredHeightResId()
                    r0.setDesiredHeightResId(r2)
                L56:
                    android.app.Notification$BubbleMetadata r2 = r0.build()
                    return r2
            }
        }

        private static class Api30Impl {
            private Api30Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static androidx.core.app.NotificationCompat.BubbleMetadata fromPlatform(android.app.Notification.BubbleMetadata r3) {
                    if (r3 != 0) goto L4
                    r3 = 0
                    return r3
                L4:
                    java.lang.String r0 = r3.getShortcutId()
                    if (r0 == 0) goto L14
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r0 = new androidx.core.app.NotificationCompat$BubbleMetadata$Builder
                    java.lang.String r1 = r3.getShortcutId()
                    r0.<init>(r1)
                    goto L25
                L14:
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r0 = new androidx.core.app.NotificationCompat$BubbleMetadata$Builder
                    android.app.PendingIntent r1 = r3.getIntent()
                    android.graphics.drawable.Icon r2 = r3.getIcon()
                    androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r2)
                    r0.<init>(r1, r2)
                L25:
                    boolean r1 = r3.getAutoExpandBubble()
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r1 = r0.setAutoExpandBubble(r1)
                    android.app.PendingIntent r2 = r3.getDeleteIntent()
                    androidx.core.app.NotificationCompat$BubbleMetadata$Builder r1 = r1.setDeleteIntent(r2)
                    boolean r2 = r3.isNotificationSuppressed()
                    r1.setSuppressNotification(r2)
                    int r1 = r3.getDesiredHeight()
                    if (r1 == 0) goto L49
                    int r1 = r3.getDesiredHeight()
                    r0.setDesiredHeight(r1)
                L49:
                    int r1 = r3.getDesiredHeightResId()
                    if (r1 == 0) goto L56
                    int r3 = r3.getDesiredHeightResId()
                    r0.setDesiredHeightResId(r3)
                L56:
                    androidx.core.app.NotificationCompat$BubbleMetadata r3 = r0.build()
                    return r3
            }

            static android.app.Notification.BubbleMetadata toPlatform(androidx.core.app.NotificationCompat.BubbleMetadata r3) {
                    if (r3 != 0) goto L4
                    r3 = 0
                    return r3
                L4:
                    java.lang.String r0 = r3.getShortcutId()
                    if (r0 == 0) goto L14
                    android.app.Notification$BubbleMetadata$Builder r0 = new android.app.Notification$BubbleMetadata$Builder
                    java.lang.String r1 = r3.getShortcutId()
                    r0.<init>(r1)
                    goto L25
                L14:
                    android.app.Notification$BubbleMetadata$Builder r0 = new android.app.Notification$BubbleMetadata$Builder
                    android.app.PendingIntent r1 = r3.getIntent()
                    androidx.core.graphics.drawable.IconCompat r2 = r3.getIcon()
                    android.graphics.drawable.Icon r2 = r2.toIcon()
                    r0.<init>(r1, r2)
                L25:
                    android.app.PendingIntent r1 = r3.getDeleteIntent()
                    android.app.Notification$BubbleMetadata$Builder r1 = r0.setDeleteIntent(r1)
                    boolean r2 = r3.getAutoExpandBubble()
                    android.app.Notification$BubbleMetadata$Builder r1 = r1.setAutoExpandBubble(r2)
                    boolean r2 = r3.isNotificationSuppressed()
                    r1.setSuppressNotification(r2)
                    int r1 = r3.getDesiredHeight()
                    if (r1 == 0) goto L49
                    int r1 = r3.getDesiredHeight()
                    r0.setDesiredHeight(r1)
                L49:
                    int r1 = r3.getDesiredHeightResId()
                    if (r1 == 0) goto L56
                    int r3 = r3.getDesiredHeightResId()
                    r0.setDesiredHeightResId(r3)
                L56:
                    android.app.Notification$BubbleMetadata r3 = r0.build()
                    return r3
            }
        }

        public static final class Builder {
            private android.app.PendingIntent mDeleteIntent;
            private int mDesiredHeight;
            private int mDesiredHeightResId;
            private int mFlags;
            private androidx.core.graphics.drawable.IconCompat mIcon;
            private android.app.PendingIntent mPendingIntent;
            private java.lang.String mShortcutId;

            @java.lang.Deprecated
            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public Builder(android.app.PendingIntent r1, androidx.core.graphics.drawable.IconCompat r2) {
                    r0 = this;
                    r0.<init>()
                    if (r1 == 0) goto L14
                    if (r2 == 0) goto Lc
                    r0.mPendingIntent = r1
                    r0.mIcon = r2
                    return
                Lc:
                    java.lang.NullPointerException r1 = new java.lang.NullPointerException
                    java.lang.String r2 = "Bubbles require non-null icon"
                    r1.<init>(r2)
                    throw r1
                L14:
                    java.lang.NullPointerException r1 = new java.lang.NullPointerException
                    java.lang.String r2 = "Bubble requires non-null pending intent"
                    r1.<init>(r2)
                    throw r1
            }

            public Builder(java.lang.String r2) {
                    r1 = this;
                    r1.<init>()
                    boolean r0 = android.text.TextUtils.isEmpty(r2)
                    if (r0 != 0) goto Lc
                    r1.mShortcutId = r2
                    return
                Lc:
                    java.lang.NullPointerException r2 = new java.lang.NullPointerException
                    java.lang.String r0 = "Bubble requires a non-null shortcut id"
                    r2.<init>(r0)
                    throw r2
            }

            private androidx.core.app.NotificationCompat.BubbleMetadata.Builder setFlag(int r1, boolean r2) {
                    r0 = this;
                    if (r2 == 0) goto L8
                    int r2 = r0.mFlags
                    r1 = r1 | r2
                    r0.mFlags = r1
                    goto Le
                L8:
                    int r2 = r0.mFlags
                    int r1 = ~r1
                    r1 = r1 & r2
                    r0.mFlags = r1
                Le:
                    return r0
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata build() {
                    r11 = this;
                    java.lang.String r0 = r11.mShortcutId
                    if (r0 != 0) goto L11
                    android.app.PendingIntent r1 = r11.mPendingIntent
                    if (r1 == 0) goto L9
                    goto L11
                L9:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException
                    java.lang.String r1 = "Must supply pending intent or shortcut to bubble"
                    r0.<init>(r1)
                    throw r0
                L11:
                    if (r0 != 0) goto L20
                    androidx.core.graphics.drawable.IconCompat r0 = r11.mIcon
                    if (r0 == 0) goto L18
                    goto L20
                L18:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException
                    java.lang.String r1 = "Must supply an icon or shortcut for the bubble"
                    r0.<init>(r1)
                    throw r0
                L20:
                    androidx.core.app.NotificationCompat$BubbleMetadata r0 = new androidx.core.app.NotificationCompat$BubbleMetadata
                    android.app.PendingIntent r3 = r11.mPendingIntent
                    android.app.PendingIntent r4 = r11.mDeleteIntent
                    androidx.core.graphics.drawable.IconCompat r5 = r11.mIcon
                    int r6 = r11.mDesiredHeight
                    int r7 = r11.mDesiredHeightResId
                    int r8 = r11.mFlags
                    java.lang.String r9 = r11.mShortcutId
                    r10 = 0
                    r2 = r0
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                    int r1 = r11.mFlags
                    r0.setFlags(r1)
                    return r0
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setAutoExpandBubble(boolean r2) {
                    r1 = this;
                    r0 = 1
                    r1.setFlag(r0, r2)
                    return r1
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDeleteIntent(android.app.PendingIntent r1) {
                    r0 = this;
                    r0.mDeleteIntent = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDesiredHeight(int r2) {
                    r1 = this;
                    r0 = 0
                    int r2 = java.lang.Math.max(r2, r0)
                    r1.mDesiredHeight = r2
                    r1.mDesiredHeightResId = r0
                    return r1
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDesiredHeightResId(int r1) {
                    r0 = this;
                    r0.mDesiredHeightResId = r1
                    r1 = 0
                    r0.mDesiredHeight = r1
                    return r0
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setIcon(androidx.core.graphics.drawable.IconCompat r2) {
                    r1 = this;
                    java.lang.String r0 = r1.mShortcutId
                    if (r0 != 0) goto L11
                    if (r2 == 0) goto L9
                    r1.mIcon = r2
                    return r1
                L9:
                    java.lang.NullPointerException r2 = new java.lang.NullPointerException
                    java.lang.String r0 = "Bubbles require non-null icon"
                    r2.<init>(r0)
                    throw r2
                L11:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead."
                    r2.<init>(r0)
                    throw r2
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setIntent(android.app.PendingIntent r2) {
                    r1 = this;
                    java.lang.String r0 = r1.mShortcutId
                    if (r0 != 0) goto L11
                    if (r2 == 0) goto L9
                    r1.mPendingIntent = r2
                    return r1
                L9:
                    java.lang.NullPointerException r2 = new java.lang.NullPointerException
                    java.lang.String r0 = "Bubble requires non-null pending intent"
                    r2.<init>(r0)
                    throw r2
                L11:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead."
                    r2.<init>(r0)
                    throw r2
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setSuppressNotification(boolean r2) {
                    r1 = this;
                    r0 = 2
                    r1.setFlag(r0, r2)
                    return r1
            }
        }

        private BubbleMetadata(android.app.PendingIntent r1, android.app.PendingIntent r2, androidx.core.graphics.drawable.IconCompat r3, int r4, int r5, int r6, java.lang.String r7) {
                r0 = this;
                r0.<init>()
                r0.mPendingIntent = r1
                r0.mIcon = r3
                r0.mDesiredHeight = r4
                r0.mDesiredHeightResId = r5
                r0.mDeleteIntent = r2
                r0.mFlags = r6
                r0.mShortcutId = r7
                return
        }

        /* synthetic */ BubbleMetadata(android.app.PendingIntent r1, android.app.PendingIntent r2, androidx.core.graphics.drawable.IconCompat r3, int r4, int r5, int r6, java.lang.String r7, androidx.core.app.NotificationCompat.C01681 r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public static androidx.core.app.NotificationCompat.BubbleMetadata fromPlatform(android.app.Notification.BubbleMetadata r3) {
                r0 = 0
                if (r3 != 0) goto L4
                return r0
            L4:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 < r2) goto Lf
                androidx.core.app.NotificationCompat$BubbleMetadata r3 = androidx.core.app.NotificationCompat.BubbleMetadata.Api30Impl.fromPlatform(r3)
                return r3
            Lf:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 != r2) goto L1a
                androidx.core.app.NotificationCompat$BubbleMetadata r3 = androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl.fromPlatform(r3)
                return r3
            L1a:
                return r0
        }

        public static android.app.Notification.BubbleMetadata toPlatform(androidx.core.app.NotificationCompat.BubbleMetadata r3) {
                r0 = 0
                if (r3 != 0) goto L4
                return r0
            L4:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 < r2) goto Lf
                android.app.Notification$BubbleMetadata r3 = androidx.core.app.NotificationCompat.BubbleMetadata.Api30Impl.toPlatform(r3)
                return r3
            Lf:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 != r2) goto L1a
                android.app.Notification$BubbleMetadata r3 = androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl.toPlatform(r3)
                return r3
            L1a:
                return r0
        }

        public boolean getAutoExpandBubble() {
                r2 = this;
                int r0 = r2.mFlags
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        public android.app.PendingIntent getDeleteIntent() {
                r1 = this;
                android.app.PendingIntent r0 = r1.mDeleteIntent
                return r0
        }

        public int getDesiredHeight() {
                r1 = this;
                int r0 = r1.mDesiredHeight
                return r0
        }

        public int getDesiredHeightResId() {
                r1 = this;
                int r0 = r1.mDesiredHeightResId
                return r0
        }

        public androidx.core.graphics.drawable.IconCompat getIcon() {
                r1 = this;
                androidx.core.graphics.drawable.IconCompat r0 = r1.mIcon
                return r0
        }

        public android.app.PendingIntent getIntent() {
                r1 = this;
                android.app.PendingIntent r0 = r1.mPendingIntent
                return r0
        }

        public java.lang.String getShortcutId() {
                r1 = this;
                java.lang.String r0 = r1.mShortcutId
                return r0
        }

        public boolean isNotificationSuppressed() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public void setFlags(int r1) {
                r0 = this;
                r0.mFlags = r1
                return
        }
    }

    public static class Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
        public java.util.ArrayList<androidx.core.app.NotificationCompat.Action> mActions;
        boolean mAllowSystemGeneratedContextualActions;
        int mBadgeIcon;
        android.widget.RemoteViews mBigContentView;
        androidx.core.app.NotificationCompat.BubbleMetadata mBubbleMetadata;
        java.lang.String mCategory;
        java.lang.String mChannelId;
        boolean mChronometerCountDown;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        java.lang.CharSequence mContentInfo;
        android.app.PendingIntent mContentIntent;
        java.lang.CharSequence mContentText;
        java.lang.CharSequence mContentTitle;
        android.widget.RemoteViews mContentView;
        public android.content.Context mContext;
        android.os.Bundle mExtras;
        android.app.PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        java.lang.String mGroupKey;
        boolean mGroupSummary;
        android.widget.RemoteViews mHeadsUpContentView;
        java.util.ArrayList<androidx.core.app.NotificationCompat.Action> mInvisibleActions;
        android.graphics.Bitmap mLargeIcon;
        boolean mLocalOnly;
        androidx.core.content.LocusIdCompat mLocusId;
        android.app.Notification mNotification;
        int mNumber;

        @java.lang.Deprecated
        public java.util.ArrayList<java.lang.String> mPeople;
        public java.util.ArrayList<androidx.core.app.Person> mPersonList;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        android.app.Notification mPublicVersion;
        java.lang.CharSequence[] mRemoteInputHistory;
        java.lang.CharSequence mSettingsText;
        java.lang.String mShortcutId;
        boolean mShowWhen;
        boolean mSilent;
        android.graphics.drawable.Icon mSmallIcon;
        java.lang.String mSortKey;
        androidx.core.app.NotificationCompat.Style mStyle;
        java.lang.CharSequence mSubText;
        android.widget.RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        @java.lang.Deprecated
        public Builder(android.content.Context r3) {
                r2 = this;
                r0 = 0
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                r2.<init>(r3, r0)
                return
        }

        public Builder(android.content.Context r6, android.app.Notification r7) {
                r5 = this;
                java.lang.String r0 = androidx.core.app.NotificationCompat.getChannelId(r7)
                r5.<init>(r6, r0)
                android.os.Bundle r6 = r7.extras
                androidx.core.app.NotificationCompat$Style r0 = androidx.core.app.NotificationCompat.Style.extractStyleFromNotification(r7)
                java.lang.CharSequence r1 = androidx.core.app.NotificationCompat.getContentTitle(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r5.setContentTitle(r1)
                java.lang.CharSequence r2 = androidx.core.app.NotificationCompat.getContentText(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setContentText(r2)
                java.lang.CharSequence r2 = androidx.core.app.NotificationCompat.getContentInfo(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setContentInfo(r2)
                java.lang.CharSequence r2 = androidx.core.app.NotificationCompat.getSubText(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setSubText(r2)
                java.lang.CharSequence r2 = androidx.core.app.NotificationCompat.getSettingsText(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setSettingsText(r2)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setStyle(r0)
                android.app.PendingIntent r2 = r7.contentIntent
                androidx.core.app.NotificationCompat$Builder r1 = r1.setContentIntent(r2)
                java.lang.String r2 = androidx.core.app.NotificationCompat.getGroup(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setGroup(r2)
                boolean r2 = androidx.core.app.NotificationCompat.isGroupSummary(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setGroupSummary(r2)
                androidx.core.content.LocusIdCompat r2 = androidx.core.app.NotificationCompat.getLocusId(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setLocusId(r2)
                long r2 = r7.when
                androidx.core.app.NotificationCompat$Builder r1 = r1.setWhen(r2)
                boolean r2 = androidx.core.app.NotificationCompat.getShowWhen(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setShowWhen(r2)
                boolean r2 = androidx.core.app.NotificationCompat.getUsesChronometer(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setUsesChronometer(r2)
                boolean r2 = androidx.core.app.NotificationCompat.getAutoCancel(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setAutoCancel(r2)
                boolean r2 = androidx.core.app.NotificationCompat.getOnlyAlertOnce(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setOnlyAlertOnce(r2)
                boolean r2 = androidx.core.app.NotificationCompat.getOngoing(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setOngoing(r2)
                boolean r2 = androidx.core.app.NotificationCompat.getLocalOnly(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setLocalOnly(r2)
                android.graphics.Bitmap r2 = r7.largeIcon
                androidx.core.app.NotificationCompat$Builder r1 = r1.setLargeIcon(r2)
                int r2 = androidx.core.app.NotificationCompat.getBadgeIconType(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setBadgeIconType(r2)
                java.lang.String r2 = androidx.core.app.NotificationCompat.getCategory(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setCategory(r2)
                androidx.core.app.NotificationCompat$BubbleMetadata r2 = androidx.core.app.NotificationCompat.getBubbleMetadata(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setBubbleMetadata(r2)
                int r2 = r7.number
                androidx.core.app.NotificationCompat$Builder r1 = r1.setNumber(r2)
                java.lang.CharSequence r2 = r7.tickerText
                androidx.core.app.NotificationCompat$Builder r1 = r1.setTicker(r2)
                android.app.PendingIntent r2 = r7.contentIntent
                androidx.core.app.NotificationCompat$Builder r1 = r1.setContentIntent(r2)
                android.app.PendingIntent r2 = r7.deleteIntent
                androidx.core.app.NotificationCompat$Builder r1 = r1.setDeleteIntent(r2)
                android.app.PendingIntent r2 = r7.fullScreenIntent
                boolean r3 = androidx.core.app.NotificationCompat.getHighPriority(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setFullScreenIntent(r2, r3)
                android.net.Uri r2 = r7.sound
                int r3 = r7.audioStreamType
                androidx.core.app.NotificationCompat$Builder r1 = r1.setSound(r2, r3)
                long[] r2 = r7.vibrate
                androidx.core.app.NotificationCompat$Builder r1 = r1.setVibrate(r2)
                int r2 = r7.ledARGB
                int r3 = r7.ledOnMS
                int r4 = r7.ledOffMS
                androidx.core.app.NotificationCompat$Builder r1 = r1.setLights(r2, r3, r4)
                int r2 = r7.defaults
                androidx.core.app.NotificationCompat$Builder r1 = r1.setDefaults(r2)
                int r2 = r7.priority
                androidx.core.app.NotificationCompat$Builder r1 = r1.setPriority(r2)
                int r2 = androidx.core.app.NotificationCompat.getColor(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setColor(r2)
                int r2 = androidx.core.app.NotificationCompat.getVisibility(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setVisibility(r2)
                android.app.Notification r2 = androidx.core.app.NotificationCompat.getPublicVersion(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setPublicVersion(r2)
                java.lang.String r2 = androidx.core.app.NotificationCompat.getSortKey(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setSortKey(r2)
                long r2 = androidx.core.app.NotificationCompat.getTimeoutAfter(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setTimeoutAfter(r2)
                java.lang.String r2 = androidx.core.app.NotificationCompat.getShortcutId(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setShortcutId(r2)
                java.lang.String r2 = "android.progressMax"
                int r2 = r6.getInt(r2)
                java.lang.String r3 = "android.progress"
                int r3 = r6.getInt(r3)
                java.lang.String r4 = "android.progressIndeterminate"
                boolean r4 = r6.getBoolean(r4)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setProgress(r2, r3, r4)
                boolean r2 = androidx.core.app.NotificationCompat.getAllowSystemGeneratedContextualActions(r7)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setAllowSystemGeneratedContextualActions(r2)
                int r2 = r7.icon
                int r3 = r7.iconLevel
                androidx.core.app.NotificationCompat$Builder r1 = r1.setSmallIcon(r2, r3)
                android.os.Bundle r0 = getExtrasWithoutDuplicateData(r7, r0)
                r1.addExtras(r0)
                android.graphics.drawable.Icon r0 = r7.getSmallIcon()
                r5.mSmallIcon = r0
                android.app.Notification$Action[] r0 = r7.actions
                r1 = 0
                if (r0 == 0) goto L174
                android.app.Notification$Action[] r0 = r7.actions
                int r0 = r0.length
                if (r0 == 0) goto L174
                android.app.Notification$Action[] r0 = r7.actions
                int r2 = r0.length
                r3 = r1
            L162:
                if (r3 >= r2) goto L174
                r4 = r0[r3]
                androidx.core.app.NotificationCompat$Action$Builder r4 = androidx.core.app.NotificationCompat.Action.Builder.fromAndroidAction(r4)
                androidx.core.app.NotificationCompat$Action r4 = r4.build()
                r5.addAction(r4)
                int r3 = r3 + 1
                goto L162
            L174:
                java.util.List r0 = androidx.core.app.NotificationCompat.getInvisibleActions(r7)
                boolean r2 = r0.isEmpty()
                if (r2 != 0) goto L192
                java.util.Iterator r0 = r0.iterator()
            L182:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L192
                java.lang.Object r2 = r0.next()
                androidx.core.app.NotificationCompat$Action r2 = (androidx.core.app.NotificationCompat.Action) r2
                r5.addInvisibleAction(r2)
                goto L182
            L192:
                android.os.Bundle r0 = r7.extras
                java.lang.String r2 = "android.people"
                java.lang.String[] r0 = r0.getStringArray(r2)
                if (r0 == 0) goto L1aa
                int r2 = r0.length
                if (r2 == 0) goto L1aa
                int r2 = r0.length
            L1a0:
                if (r1 >= r2) goto L1aa
                r3 = r0[r1]
                r5.addPerson(r3)
                int r1 = r1 + 1
                goto L1a0
            L1aa:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L1d8
                android.os.Bundle r7 = r7.extras
                java.lang.String r0 = "android.people.list"
                java.util.ArrayList r7 = r7.getParcelableArrayList(r0)
                if (r7 == 0) goto L1d8
                boolean r0 = r7.isEmpty()
                if (r0 != 0) goto L1d8
                java.util.Iterator r7 = r7.iterator()
            L1c4:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L1d8
                java.lang.Object r0 = r7.next()
                android.app.Person r0 = (android.app.Person) r0
                androidx.core.app.Person r0 = androidx.core.app.Person.fromAndroidPerson(r0)
                r5.addPerson(r0)
                goto L1c4
            L1d8:
                java.lang.String r7 = "android.chronometerCountDown"
                boolean r0 = r6.containsKey(r7)
                if (r0 == 0) goto L1e7
                boolean r7 = r6.getBoolean(r7)
                r5.setChronometerCountDown(r7)
            L1e7:
                int r7 = android.os.Build.VERSION.SDK_INT
                r0 = 26
                if (r7 < r0) goto L1fc
                java.lang.String r7 = "android.colorized"
                boolean r0 = r6.containsKey(r7)
                if (r0 == 0) goto L1fc
                boolean r6 = r6.getBoolean(r7)
                r5.setColorized(r6)
            L1fc:
                return
        }

        public Builder(android.content.Context r4, java.lang.String r5) {
                r3 = this;
                r3.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.mActions = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.mPersonList = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.mInvisibleActions = r0
                r0 = 1
                r3.mShowWhen = r0
                r1 = 0
                r3.mLocalOnly = r1
                r3.mColor = r1
                r3.mVisibility = r1
                r3.mBadgeIcon = r1
                r3.mGroupAlertBehavior = r1
                android.app.Notification r2 = new android.app.Notification
                r2.<init>()
                r3.mNotification = r2
                r3.mContext = r4
                r3.mChannelId = r5
                long r4 = java.lang.System.currentTimeMillis()
                r2.when = r4
                android.app.Notification r4 = r3.mNotification
                r5 = -1
                r4.audioStreamType = r5
                r3.mPriority = r1
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r3.mPeople = r4
                r3.mAllowSystemGeneratedContextualActions = r0
                return
        }

        private static android.os.Bundle getExtrasWithoutDuplicateData(android.app.Notification r3, androidx.core.app.NotificationCompat.Style r4) {
                android.os.Bundle r0 = r3.extras
                if (r0 != 0) goto L6
                r3 = 0
                return r3
            L6:
                android.os.Bundle r0 = new android.os.Bundle
                android.os.Bundle r3 = r3.extras
                r0.<init>(r3)
                java.lang.String r3 = "android.title"
                r0.remove(r3)
                java.lang.String r3 = "android.text"
                r0.remove(r3)
                java.lang.String r3 = "android.infoText"
                r0.remove(r3)
                java.lang.String r3 = "android.subText"
                r0.remove(r3)
                java.lang.String r3 = "android.intent.extra.CHANNEL_ID"
                r0.remove(r3)
                java.lang.String r3 = "android.intent.extra.CHANNEL_GROUP_ID"
                r0.remove(r3)
                java.lang.String r3 = "android.showWhen"
                r0.remove(r3)
                java.lang.String r3 = "android.progress"
                r0.remove(r3)
                java.lang.String r3 = "android.progressMax"
                r0.remove(r3)
                java.lang.String r3 = "android.progressIndeterminate"
                r0.remove(r3)
                java.lang.String r3 = "android.chronometerCountDown"
                r0.remove(r3)
                java.lang.String r3 = "android.colorized"
                r0.remove(r3)
                java.lang.String r3 = "android.people.list"
                r0.remove(r3)
                java.lang.String r3 = "android.people"
                r0.remove(r3)
                java.lang.String r3 = "android.support.sortKey"
                r0.remove(r3)
                java.lang.String r3 = "android.support.groupKey"
                r0.remove(r3)
                java.lang.String r3 = "android.support.isGroupSummary"
                r0.remove(r3)
                java.lang.String r3 = "android.support.localOnly"
                r0.remove(r3)
                java.lang.String r3 = "android.support.actionExtras"
                r0.remove(r3)
                java.lang.String r3 = "android.car.EXTENSIONS"
                android.os.Bundle r1 = r0.getBundle(r3)
                if (r1 == 0) goto L81
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>(r1)
                java.lang.String r1 = "invisible_actions"
                r2.remove(r1)
                r0.putBundle(r3, r2)
            L81:
                if (r4 == 0) goto L86
                r4.clearCompatExtraKeys(r0)
            L86:
                return r0
        }

        protected static java.lang.CharSequence limitCharSequenceLength(java.lang.CharSequence r2) {
                if (r2 != 0) goto L3
                return r2
            L3:
                int r0 = r2.length()
                r1 = 5120(0x1400, float:7.175E-42)
                if (r0 <= r1) goto L10
                r0 = 0
                java.lang.CharSequence r2 = r2.subSequence(r0, r1)
            L10:
                return r2
        }

        private android.graphics.Bitmap reduceLargeIconSize(android.graphics.Bitmap r10) {
                r9 = this;
                if (r10 == 0) goto L5d
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 27
                if (r0 < r1) goto L9
                goto L5d
            L9:
                android.content.Context r0 = r9.mContext
                android.content.res.Resources r0 = r0.getResources()
                int r1 = androidx.core.C0160R.dimen.compat_notification_large_icon_max_width
                int r1 = r0.getDimensionPixelSize(r1)
                int r2 = androidx.core.C0160R.dimen.compat_notification_large_icon_max_height
                int r0 = r0.getDimensionPixelSize(r2)
                int r2 = r10.getWidth()
                if (r2 > r1) goto L28
                int r2 = r10.getHeight()
                if (r2 > r0) goto L28
                return r10
            L28:
                double r1 = (double) r1
                int r3 = r10.getWidth()
                r4 = 1
                int r3 = java.lang.Math.max(r4, r3)
                double r5 = (double) r3
                double r1 = r1 / r5
                double r5 = (double) r0
                int r0 = r10.getHeight()
                int r0 = java.lang.Math.max(r4, r0)
                double r7 = (double) r0
                double r5 = r5 / r7
                double r0 = java.lang.Math.min(r1, r5)
                int r2 = r10.getWidth()
                double r2 = (double) r2
                double r2 = r2 * r0
                double r2 = java.lang.Math.ceil(r2)
                int r2 = (int) r2
                int r3 = r10.getHeight()
                double r5 = (double) r3
                double r5 = r5 * r0
                double r0 = java.lang.Math.ceil(r5)
                int r0 = (int) r0
                android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r10, r2, r0, r4)
            L5d:
                return r10
        }

        private void setFlag(int r2, boolean r3) {
                r1 = this;
                if (r3 == 0) goto La
                android.app.Notification r3 = r1.mNotification
                int r0 = r3.flags
                r2 = r2 | r0
                r3.flags = r2
                goto L12
            La:
                android.app.Notification r3 = r1.mNotification
                int r0 = r3.flags
                int r2 = ~r2
                r2 = r2 & r0
                r3.flags = r2
            L12:
                return
        }

        private boolean useExistingRemoteView() {
                r1 = this;
                androidx.core.app.NotificationCompat$Style r0 = r1.mStyle
                if (r0 == 0) goto Ld
                boolean r0 = r0.displayCustomViewInline()
                if (r0 != 0) goto Lb
                goto Ld
            Lb:
                r0 = 0
                goto Le
            Ld:
                r0 = 1
            Le:
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder addAction(int r3, java.lang.CharSequence r4, android.app.PendingIntent r5) {
                r2 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r2.mActions
                androidx.core.app.NotificationCompat$Action r1 = new androidx.core.app.NotificationCompat$Action
                r1.<init>(r3, r4, r5)
                r0.add(r1)
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder addAction(androidx.core.app.NotificationCompat.Action r2) {
                r1 = this;
                if (r2 == 0) goto L7
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mActions
                r0.add(r2)
            L7:
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder addExtras(android.os.Bundle r2) {
                r1 = this;
                if (r2 == 0) goto L11
                android.os.Bundle r0 = r1.mExtras
                if (r0 != 0) goto Le
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>(r2)
                r1.mExtras = r0
                goto L11
            Le:
                r0.putAll(r2)
            L11:
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder addInvisibleAction(int r3, java.lang.CharSequence r4, android.app.PendingIntent r5) {
                r2 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r2.mInvisibleActions
                androidx.core.app.NotificationCompat$Action r1 = new androidx.core.app.NotificationCompat$Action
                r1.<init>(r3, r4, r5)
                r0.add(r1)
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder addInvisibleAction(androidx.core.app.NotificationCompat.Action r2) {
                r1 = this;
                if (r2 == 0) goto L7
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mInvisibleActions
                r0.add(r2)
            L7:
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder addPerson(androidx.core.app.Person r2) {
                r1 = this;
                if (r2 == 0) goto L7
                java.util.ArrayList<androidx.core.app.Person> r0 = r1.mPersonList
                r0.add(r2)
            L7:
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.Builder addPerson(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto Ld
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto Ld
                java.util.ArrayList<java.lang.String> r0 = r1.mPeople
                r0.add(r2)
            Ld:
                return r1
        }

        public android.app.Notification build() {
                r1 = this;
                androidx.core.app.NotificationCompatBuilder r0 = new androidx.core.app.NotificationCompatBuilder
                r0.<init>(r1)
                android.app.Notification r0 = r0.build()
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder clearActions() {
                r1 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mActions
                r0.clear()
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder clearInvisibleActions() {
                r3 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r3.mInvisibleActions
                r0.clear()
                android.os.Bundle r0 = r3.mExtras
                java.lang.String r1 = "android.car.EXTENSIONS"
                android.os.Bundle r0 = r0.getBundle(r1)
                if (r0 == 0) goto L1e
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>(r0)
                java.lang.String r0 = "invisible_actions"
                r2.remove(r0)
                android.os.Bundle r0 = r3.mExtras
                r0.putBundle(r1, r2)
            L1e:
                return r3
        }

        public androidx.core.app.NotificationCompat.Builder clearPeople() {
                r1 = this;
                java.util.ArrayList<androidx.core.app.Person> r0 = r1.mPersonList
                r0.clear()
                java.util.ArrayList<java.lang.String> r0 = r1.mPeople
                r0.clear()
                return r1
        }

        public android.widget.RemoteViews createBigContentView() {
                r2 = this;
                android.widget.RemoteViews r0 = r2.mBigContentView
                if (r0 == 0) goto Ld
                boolean r0 = r2.useExistingRemoteView()
                if (r0 == 0) goto Ld
                android.widget.RemoteViews r0 = r2.mBigContentView
                return r0
            Ld:
                androidx.core.app.NotificationCompatBuilder r0 = new androidx.core.app.NotificationCompatBuilder
                r0.<init>(r2)
                androidx.core.app.NotificationCompat$Style r1 = r2.mStyle
                if (r1 == 0) goto L1d
                android.widget.RemoteViews r1 = r1.makeBigContentView(r0)
                if (r1 == 0) goto L1d
                return r1
            L1d:
                android.app.Notification r0 = r0.build()
                android.content.Context r1 = r2.mContext
                android.app.Notification$Builder r0 = android.app.Notification.Builder.recoverBuilder(r1, r0)
                android.widget.RemoteViews r0 = r0.createBigContentView()
                return r0
        }

        public android.widget.RemoteViews createContentView() {
                r2 = this;
                android.widget.RemoteViews r0 = r2.mContentView
                if (r0 == 0) goto Ld
                boolean r0 = r2.useExistingRemoteView()
                if (r0 == 0) goto Ld
                android.widget.RemoteViews r0 = r2.mContentView
                return r0
            Ld:
                androidx.core.app.NotificationCompatBuilder r0 = new androidx.core.app.NotificationCompatBuilder
                r0.<init>(r2)
                androidx.core.app.NotificationCompat$Style r1 = r2.mStyle
                if (r1 == 0) goto L1d
                android.widget.RemoteViews r1 = r1.makeContentView(r0)
                if (r1 == 0) goto L1d
                return r1
            L1d:
                android.app.Notification r0 = r0.build()
                android.content.Context r1 = r2.mContext
                android.app.Notification$Builder r0 = android.app.Notification.Builder.recoverBuilder(r1, r0)
                android.widget.RemoteViews r0 = r0.createContentView()
                return r0
        }

        public android.widget.RemoteViews createHeadsUpContentView() {
                r2 = this;
                android.widget.RemoteViews r0 = r2.mHeadsUpContentView
                if (r0 == 0) goto Ld
                boolean r0 = r2.useExistingRemoteView()
                if (r0 == 0) goto Ld
                android.widget.RemoteViews r0 = r2.mHeadsUpContentView
                return r0
            Ld:
                androidx.core.app.NotificationCompatBuilder r0 = new androidx.core.app.NotificationCompatBuilder
                r0.<init>(r2)
                androidx.core.app.NotificationCompat$Style r1 = r2.mStyle
                if (r1 == 0) goto L1d
                android.widget.RemoteViews r1 = r1.makeHeadsUpContentView(r0)
                if (r1 == 0) goto L1d
                return r1
            L1d:
                android.app.Notification r0 = r0.build()
                android.content.Context r1 = r2.mContext
                android.app.Notification$Builder r0 = android.app.Notification.Builder.recoverBuilder(r1, r0)
                android.widget.RemoteViews r0 = r0.createHeadsUpContentView()
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Extender r1) {
                r0 = this;
                r1.extend(r0)
                return r0
        }

        public android.widget.RemoteViews getBigContentView() {
                r1 = this;
                android.widget.RemoteViews r0 = r1.mBigContentView
                return r0
        }

        public androidx.core.app.NotificationCompat.BubbleMetadata getBubbleMetadata() {
                r1 = this;
                androidx.core.app.NotificationCompat$BubbleMetadata r0 = r1.mBubbleMetadata
                return r0
        }

        public int getColor() {
                r1 = this;
                int r0 = r1.mColor
                return r0
        }

        public android.widget.RemoteViews getContentView() {
                r1 = this;
                android.widget.RemoteViews r0 = r1.mContentView
                return r0
        }

        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                if (r0 != 0) goto Lb
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.mExtras = r0
            Lb:
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        public android.widget.RemoteViews getHeadsUpContentView() {
                r1 = this;
                android.widget.RemoteViews r0 = r1.mHeadsUpContentView
                return r0
        }

        @java.lang.Deprecated
        public android.app.Notification getNotification() {
                r1 = this;
                android.app.Notification r0 = r1.build()
                return r0
        }

        public int getPriority() {
                r1 = this;
                int r0 = r1.mPriority
                return r0
        }

        public long getWhenIfShowing() {
                r2 = this;
                boolean r0 = r2.mShowWhen
                if (r0 == 0) goto L9
                android.app.Notification r0 = r2.mNotification
                long r0 = r0.when
                goto Lb
            L9:
                r0 = 0
            Lb:
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setAllowSystemGeneratedContextualActions(boolean r1) {
                r0 = this;
                r0.mAllowSystemGeneratedContextualActions = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setAutoCancel(boolean r2) {
                r1 = this;
                r0 = 16
                r1.setFlag(r0, r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setBadgeIconType(int r1) {
                r0 = this;
                r0.mBadgeIcon = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setBubbleMetadata(androidx.core.app.NotificationCompat.BubbleMetadata r1) {
                r0 = this;
                r0.mBubbleMetadata = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setCategory(java.lang.String r1) {
                r0 = this;
                r0.mCategory = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setChannelId(java.lang.String r1) {
                r0 = this;
                r0.mChannelId = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setChronometerCountDown(boolean r3) {
                r2 = this;
                r2.mChronometerCountDown = r3
                android.os.Bundle r0 = r2.getExtras()
                java.lang.String r1 = "android.chronometerCountDown"
                r0.putBoolean(r1, r3)
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder setColor(int r1) {
                r0 = this;
                r0.mColor = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setColorized(boolean r1) {
                r0 = this;
                r0.mColorized = r1
                r1 = 1
                r0.mColorizedSet = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setContent(android.widget.RemoteViews r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.contentView = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setContentInfo(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = limitCharSequenceLength(r1)
                r0.mContentInfo = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setContentIntent(android.app.PendingIntent r1) {
                r0 = this;
                r0.mContentIntent = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setContentText(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = limitCharSequenceLength(r1)
                r0.mContentText = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setContentTitle(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = limitCharSequenceLength(r1)
                r0.mContentTitle = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setCustomBigContentView(android.widget.RemoteViews r1) {
                r0 = this;
                r0.mBigContentView = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setCustomContentView(android.widget.RemoteViews r1) {
                r0 = this;
                r0.mContentView = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setCustomHeadsUpContentView(android.widget.RemoteViews r1) {
                r0 = this;
                r0.mHeadsUpContentView = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setDefaults(int r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.defaults = r2
                r2 = r2 & 4
                if (r2 == 0) goto L10
                android.app.Notification r2 = r1.mNotification
                int r0 = r2.flags
                r0 = r0 | 1
                r2.flags = r0
            L10:
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setDeleteIntent(android.app.PendingIntent r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.deleteIntent = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setExtras(android.os.Bundle r1) {
                r0 = this;
                r0.mExtras = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setFullScreenIntent(android.app.PendingIntent r1, boolean r2) {
                r0 = this;
                r0.mFullScreenIntent = r1
                r1 = 128(0x80, float:1.794E-43)
                r0.setFlag(r1, r2)
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setGroup(java.lang.String r1) {
                r0 = this;
                r0.mGroupKey = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setGroupAlertBehavior(int r1) {
                r0 = this;
                r0.mGroupAlertBehavior = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setGroupSummary(boolean r1) {
                r0 = this;
                r0.mGroupSummary = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setLargeIcon(android.graphics.Bitmap r1) {
                r0 = this;
                android.graphics.Bitmap r1 = r0.reduceLargeIconSize(r1)
                r0.mLargeIcon = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setLights(int r2, int r3, int r4) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.ledARGB = r2
                android.app.Notification r2 = r1.mNotification
                r2.ledOnMS = r3
                android.app.Notification r2 = r1.mNotification
                r2.ledOffMS = r4
                android.app.Notification r2 = r1.mNotification
                int r2 = r2.ledOnMS
                if (r2 == 0) goto L1a
                android.app.Notification r2 = r1.mNotification
                int r2 = r2.ledOffMS
                if (r2 == 0) goto L1a
                r2 = 1
                goto L1b
            L1a:
                r2 = 0
            L1b:
                android.app.Notification r3 = r1.mNotification
                int r4 = r3.flags
                r4 = r4 & (-2)
                r2 = r2 | r4
                r3.flags = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setLocalOnly(boolean r1) {
                r0 = this;
                r0.mLocalOnly = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setLocusId(androidx.core.content.LocusIdCompat r1) {
                r0 = this;
                r0.mLocusId = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.Builder setNotificationSilent() {
                r1 = this;
                r0 = 1
                r1.mSilent = r0
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setNumber(int r1) {
                r0 = this;
                r0.mNumber = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setOngoing(boolean r2) {
                r1 = this;
                r0 = 2
                r1.setFlag(r0, r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setOnlyAlertOnce(boolean r2) {
                r1 = this;
                r0 = 8
                r1.setFlag(r0, r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setPriority(int r1) {
                r0 = this;
                r0.mPriority = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setProgress(int r1, int r2, boolean r3) {
                r0 = this;
                r0.mProgressMax = r1
                r0.mProgress = r2
                r0.mProgressIndeterminate = r3
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setPublicVersion(android.app.Notification r1) {
                r0 = this;
                r0.mPublicVersion = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setRemoteInputHistory(java.lang.CharSequence[] r1) {
                r0 = this;
                r0.mRemoteInputHistory = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setSettingsText(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = limitCharSequenceLength(r1)
                r0.mSettingsText = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setShortcutId(java.lang.String r1) {
                r0 = this;
                r0.mShortcutId = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setShortcutInfo(androidx.core.content.p000pm.ShortcutInfoCompat r3) {
                r2 = this;
                if (r3 != 0) goto L3
                return r2
            L3:
                java.lang.String r0 = r3.getId()
                r2.mShortcutId = r0
                androidx.core.content.LocusIdCompat r0 = r2.mLocusId
                if (r0 != 0) goto L2b
                androidx.core.content.LocusIdCompat r0 = r3.getLocusId()
                if (r0 == 0) goto L1a
                androidx.core.content.LocusIdCompat r0 = r3.getLocusId()
                r2.mLocusId = r0
                goto L2b
            L1a:
                java.lang.String r0 = r3.getId()
                if (r0 == 0) goto L2b
                androidx.core.content.LocusIdCompat r0 = new androidx.core.content.LocusIdCompat
                java.lang.String r1 = r3.getId()
                r0.<init>(r1)
                r2.mLocusId = r0
            L2b:
                java.lang.CharSequence r0 = r2.mContentTitle
                if (r0 != 0) goto L36
                java.lang.CharSequence r3 = r3.getShortLabel()
                r2.setContentTitle(r3)
            L36:
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder setShowWhen(boolean r1) {
                r0 = this;
                r0.mShowWhen = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setSilent(boolean r1) {
                r0 = this;
                r0.mSilent = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(int r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.icon = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(int r2, int r3) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.icon = r2
                android.app.Notification r2 = r1.mNotification
                r2.iconLevel = r3
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(androidx.core.graphics.drawable.IconCompat r2) {
                r1 = this;
                android.content.Context r0 = r1.mContext
                android.graphics.drawable.Icon r2 = r2.toIcon(r0)
                r1.mSmallIcon = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setSortKey(java.lang.String r1) {
                r0 = this;
                r0.mSortKey = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setSound(android.net.Uri r3) {
                r2 = this;
                android.app.Notification r0 = r2.mNotification
                r0.sound = r3
                android.app.Notification r3 = r2.mNotification
                r0 = -1
                r3.audioStreamType = r0
                android.app.Notification r3 = r2.mNotification
                android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                r0.<init>()
                r1 = 4
                android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
                r1 = 5
                android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
                android.media.AudioAttributes r0 = r0.build()
                r3.audioAttributes = r0
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder setSound(android.net.Uri r3, int r4) {
                r2 = this;
                android.app.Notification r0 = r2.mNotification
                r0.sound = r3
                android.app.Notification r3 = r2.mNotification
                r3.audioStreamType = r4
                android.app.Notification r3 = r2.mNotification
                android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                r0.<init>()
                r1 = 4
                android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
                android.media.AudioAttributes$Builder r4 = r0.setLegacyStreamType(r4)
                android.media.AudioAttributes r4 = r4.build()
                r3.audioAttributes = r4
                return r2
        }

        public androidx.core.app.NotificationCompat.Builder setStyle(androidx.core.app.NotificationCompat.Style r2) {
                r1 = this;
                androidx.core.app.NotificationCompat$Style r0 = r1.mStyle
                if (r0 == r2) goto Lb
                r1.mStyle = r2
                if (r2 == 0) goto Lb
                r2.setBuilder(r1)
            Lb:
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setSubText(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = limitCharSequenceLength(r1)
                r0.mSubText = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setTicker(java.lang.CharSequence r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                java.lang.CharSequence r2 = limitCharSequenceLength(r2)
                r0.tickerText = r2
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.Builder setTicker(java.lang.CharSequence r2, android.widget.RemoteViews r3) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                java.lang.CharSequence r2 = limitCharSequenceLength(r2)
                r0.tickerText = r2
                r1.mTickerView = r3
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setTimeoutAfter(long r1) {
                r0 = this;
                r0.mTimeout = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setUsesChronometer(boolean r1) {
                r0 = this;
                r0.mUseChronometer = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setVibrate(long[] r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.vibrate = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setVisibility(int r1) {
                r0 = this;
                r0.mVisibility = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setWhen(long r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.when = r2
                return r1
        }
    }

    public static final class CarExtender implements androidx.core.app.NotificationCompat.Extender {
        static final java.lang.String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final java.lang.String EXTRA_COLOR = "app_color";
        private static final java.lang.String EXTRA_CONVERSATION = "car_conversation";
        static final java.lang.String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final java.lang.String EXTRA_LARGE_ICON = "large_icon";
        private static final java.lang.String KEY_AUTHOR = "author";
        private static final java.lang.String KEY_MESSAGES = "messages";
        private static final java.lang.String KEY_ON_READ = "on_read";
        private static final java.lang.String KEY_ON_REPLY = "on_reply";
        private static final java.lang.String KEY_PARTICIPANTS = "participants";
        private static final java.lang.String KEY_REMOTE_INPUT = "remote_input";
        private static final java.lang.String KEY_TEXT = "text";
        private static final java.lang.String KEY_TIMESTAMP = "timestamp";
        private int mColor;
        private android.graphics.Bitmap mLargeIcon;
        private androidx.core.app.NotificationCompat.CarExtender.UnreadConversation mUnreadConversation;

        @java.lang.Deprecated
        public static class UnreadConversation {
            private final long mLatestTimestamp;
            private final java.lang.String[] mMessages;
            private final java.lang.String[] mParticipants;
            private final android.app.PendingIntent mReadPendingIntent;
            private final androidx.core.app.RemoteInput mRemoteInput;
            private final android.app.PendingIntent mReplyPendingIntent;

            public static class Builder {
                private long mLatestTimestamp;
                private final java.util.List<java.lang.String> mMessages;
                private final java.lang.String mParticipant;
                private android.app.PendingIntent mReadPendingIntent;
                private androidx.core.app.RemoteInput mRemoteInput;
                private android.app.PendingIntent mReplyPendingIntent;

                public Builder(java.lang.String r2) {
                        r1 = this;
                        r1.<init>()
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        r1.mMessages = r0
                        r1.mParticipant = r2
                        return
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder addMessage(java.lang.String r2) {
                        r1 = this;
                        if (r2 == 0) goto L7
                        java.util.List<java.lang.String> r0 = r1.mMessages
                        r0.add(r2)
                    L7:
                        return r1
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation build() {
                        r9 = this;
                        java.util.List<java.lang.String> r0 = r9.mMessages
                        int r1 = r0.size()
                        java.lang.String[] r1 = new java.lang.String[r1]
                        java.lang.Object[] r0 = r0.toArray(r1)
                        r2 = r0
                        java.lang.String[] r2 = (java.lang.String[]) r2
                        r0 = 1
                        java.lang.String[] r6 = new java.lang.String[r0]
                        r0 = 0
                        java.lang.String r1 = r9.mParticipant
                        r6[r0] = r1
                        androidx.core.app.NotificationCompat$CarExtender$UnreadConversation r0 = new androidx.core.app.NotificationCompat$CarExtender$UnreadConversation
                        androidx.core.app.RemoteInput r3 = r9.mRemoteInput
                        android.app.PendingIntent r4 = r9.mReplyPendingIntent
                        android.app.PendingIntent r5 = r9.mReadPendingIntent
                        long r7 = r9.mLatestTimestamp
                        r1 = r0
                        r1.<init>(r2, r3, r4, r5, r6, r7)
                        return r0
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setLatestTimestamp(long r1) {
                        r0 = this;
                        r0.mLatestTimestamp = r1
                        return r0
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setReadPendingIntent(android.app.PendingIntent r1) {
                        r0 = this;
                        r0.mReadPendingIntent = r1
                        return r0
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setReplyAction(android.app.PendingIntent r1, androidx.core.app.RemoteInput r2) {
                        r0 = this;
                        r0.mRemoteInput = r2
                        r0.mReplyPendingIntent = r1
                        return r0
                }
            }

            UnreadConversation(java.lang.String[] r1, androidx.core.app.RemoteInput r2, android.app.PendingIntent r3, android.app.PendingIntent r4, java.lang.String[] r5, long r6) {
                    r0 = this;
                    r0.<init>()
                    r0.mMessages = r1
                    r0.mRemoteInput = r2
                    r0.mReadPendingIntent = r4
                    r0.mReplyPendingIntent = r3
                    r0.mParticipants = r5
                    r0.mLatestTimestamp = r6
                    return
            }

            public long getLatestTimestamp() {
                    r2 = this;
                    long r0 = r2.mLatestTimestamp
                    return r0
            }

            public java.lang.String[] getMessages() {
                    r1 = this;
                    java.lang.String[] r0 = r1.mMessages
                    return r0
            }

            public java.lang.String getParticipant() {
                    r2 = this;
                    java.lang.String[] r0 = r2.mParticipants
                    int r1 = r0.length
                    if (r1 <= 0) goto L9
                    r1 = 0
                    r0 = r0[r1]
                    goto La
                L9:
                    r0 = 0
                La:
                    return r0
            }

            public java.lang.String[] getParticipants() {
                    r1 = this;
                    java.lang.String[] r0 = r1.mParticipants
                    return r0
            }

            public android.app.PendingIntent getReadPendingIntent() {
                    r1 = this;
                    android.app.PendingIntent r0 = r1.mReadPendingIntent
                    return r0
            }

            public androidx.core.app.RemoteInput getRemoteInput() {
                    r1 = this;
                    androidx.core.app.RemoteInput r0 = r1.mRemoteInput
                    return r0
            }

            public android.app.PendingIntent getReplyPendingIntent() {
                    r1 = this;
                    android.app.PendingIntent r0 = r1.mReplyPendingIntent
                    return r0
            }
        }

        public CarExtender() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mColor = r0
                return
        }

        public CarExtender(android.app.Notification r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mColor = r0
                android.os.Bundle r1 = androidx.core.app.NotificationCompat.getExtras(r3)
                if (r1 != 0) goto Le
                r3 = 0
                goto L18
            Le:
                android.os.Bundle r3 = androidx.core.app.NotificationCompat.getExtras(r3)
                java.lang.String r1 = "android.car.EXTENSIONS"
                android.os.Bundle r3 = r3.getBundle(r1)
            L18:
                if (r3 == 0) goto L38
                java.lang.String r1 = "large_icon"
                android.os.Parcelable r1 = r3.getParcelable(r1)
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                r2.mLargeIcon = r1
                java.lang.String r1 = "app_color"
                int r0 = r3.getInt(r1, r0)
                r2.mColor = r0
                java.lang.String r0 = "car_conversation"
                android.os.Bundle r3 = r3.getBundle(r0)
                androidx.core.app.NotificationCompat$CarExtender$UnreadConversation r3 = getUnreadConversationFromBundle(r3)
                r2.mUnreadConversation = r3
            L38:
                return
        }

        private static android.os.Bundle getBundleForUnreadConversation(androidx.core.app.NotificationCompat.CarExtender.UnreadConversation r8) {
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String[] r1 = r8.getParticipants()
                r2 = 0
                if (r1 == 0) goto L1b
                java.lang.String[] r1 = r8.getParticipants()
                int r1 = r1.length
                r3 = 1
                if (r1 <= r3) goto L1b
                java.lang.String[] r1 = r8.getParticipants()
                r1 = r1[r2]
                goto L1c
            L1b:
                r1 = 0
            L1c:
                java.lang.String[] r3 = r8.getMessages()
                int r3 = r3.length
                android.os.Parcelable[] r4 = new android.os.Parcelable[r3]
            L23:
                if (r2 >= r3) goto L3f
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                java.lang.String[] r6 = r8.getMessages()
                r6 = r6[r2]
                java.lang.String r7 = "text"
                r5.putString(r7, r6)
                java.lang.String r6 = "author"
                r5.putString(r6, r1)
                r4[r2] = r5
                int r2 = r2 + 1
                goto L23
            L3f:
                java.lang.String r1 = "messages"
                r0.putParcelableArray(r1, r4)
                androidx.core.app.RemoteInput r1 = r8.getRemoteInput()
                if (r1 == 0) goto L7c
                android.app.RemoteInput$Builder r2 = new android.app.RemoteInput$Builder
                java.lang.String r3 = r1.getResultKey()
                r2.<init>(r3)
                java.lang.CharSequence r3 = r1.getLabel()
                android.app.RemoteInput$Builder r2 = r2.setLabel(r3)
                java.lang.CharSequence[] r3 = r1.getChoices()
                android.app.RemoteInput$Builder r2 = r2.setChoices(r3)
                boolean r3 = r1.getAllowFreeFormInput()
                android.app.RemoteInput$Builder r2 = r2.setAllowFreeFormInput(r3)
                android.os.Bundle r1 = r1.getExtras()
                android.app.RemoteInput$Builder r1 = r2.addExtras(r1)
                android.app.RemoteInput r1 = r1.build()
                java.lang.String r2 = "remote_input"
                r0.putParcelable(r2, r1)
            L7c:
                java.lang.String r1 = "on_reply"
                android.app.PendingIntent r2 = r8.getReplyPendingIntent()
                r0.putParcelable(r1, r2)
                java.lang.String r1 = "on_read"
                android.app.PendingIntent r2 = r8.getReadPendingIntent()
                r0.putParcelable(r1, r2)
                java.lang.String r1 = "participants"
                java.lang.String[] r2 = r8.getParticipants()
                r0.putStringArray(r1, r2)
                java.lang.String r1 = "timestamp"
                long r2 = r8.getLatestTimestamp()
                r0.putLong(r1, r2)
                return r0
        }

        private static androidx.core.app.NotificationCompat.CarExtender.UnreadConversation getUnreadConversationFromBundle(android.os.Bundle r21) {
                r0 = r21
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.lang.String r2 = "messages"
                android.os.Parcelable[] r2 = r0.getParcelableArray(r2)
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L34
                int r5 = r2.length
                java.lang.String[] r6 = new java.lang.String[r5]
                r7 = r4
            L14:
                if (r7 >= r5) goto L2e
                r8 = r2[r7]
                boolean r9 = r8 instanceof android.os.Bundle
                if (r9 != 0) goto L1e
            L1c:
                r2 = r4
                goto L2f
            L1e:
                android.os.Bundle r8 = (android.os.Bundle) r8
                java.lang.String r9 = "text"
                java.lang.String r8 = r8.getString(r9)
                r6[r7] = r8
                if (r8 != 0) goto L2b
                goto L1c
            L2b:
                int r7 = r7 + 1
                goto L14
            L2e:
                r2 = r3
            L2f:
                if (r2 == 0) goto L33
                r8 = r6
                goto L35
            L33:
                return r1
            L34:
                r8 = r1
            L35:
                java.lang.String r2 = "on_read"
                android.os.Parcelable r2 = r0.getParcelable(r2)
                r11 = r2
                android.app.PendingIntent r11 = (android.app.PendingIntent) r11
                java.lang.String r2 = "on_reply"
                android.os.Parcelable r2 = r0.getParcelable(r2)
                r10 = r2
                android.app.PendingIntent r10 = (android.app.PendingIntent) r10
                java.lang.String r2 = "remote_input"
                android.os.Parcelable r2 = r0.getParcelable(r2)
                android.app.RemoteInput r2 = (android.app.RemoteInput) r2
                java.lang.String r5 = "participants"
                java.lang.String[] r12 = r0.getStringArray(r5)
                if (r12 == 0) goto L92
                int r5 = r12.length
                if (r5 == r3) goto L5b
                goto L92
            L5b:
                if (r2 == 0) goto L85
                androidx.core.app.RemoteInput r1 = new androidx.core.app.RemoteInput
                java.lang.String r14 = r2.getResultKey()
                java.lang.CharSequence r15 = r2.getLabel()
                java.lang.CharSequence[] r16 = r2.getChoices()
                boolean r17 = r2.getAllowFreeFormInput()
                int r3 = android.os.Build.VERSION.SDK_INT
                r5 = 29
                if (r3 < r5) goto L79
                int r4 = r2.getEditChoicesBeforeSending()
            L79:
                r18 = r4
                android.os.Bundle r19 = r2.getExtras()
                r20 = 0
                r13 = r1
                r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            L85:
                r9 = r1
                androidx.core.app.NotificationCompat$CarExtender$UnreadConversation r1 = new androidx.core.app.NotificationCompat$CarExtender$UnreadConversation
                java.lang.String r2 = "timestamp"
                long r13 = r0.getLong(r2)
                r7 = r1
                r7.<init>(r8, r9, r10, r11, r12, r13)
            L92:
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder r4) {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                android.graphics.Bitmap r1 = r3.mLargeIcon
                if (r1 == 0) goto Le
                java.lang.String r2 = "large_icon"
                r0.putParcelable(r2, r1)
            Le:
                int r1 = r3.mColor
                if (r1 == 0) goto L17
                java.lang.String r2 = "app_color"
                r0.putInt(r2, r1)
            L17:
                androidx.core.app.NotificationCompat$CarExtender$UnreadConversation r1 = r3.mUnreadConversation
                if (r1 == 0) goto L24
                android.os.Bundle r1 = getBundleForUnreadConversation(r1)
                java.lang.String r2 = "car_conversation"
                r0.putBundle(r2, r1)
            L24:
                android.os.Bundle r1 = r4.getExtras()
                java.lang.String r2 = "android.car.EXTENSIONS"
                r1.putBundle(r2, r0)
                return r4
        }

        public int getColor() {
                r1 = this;
                int r0 = r1.mColor
                return r0
        }

        public android.graphics.Bitmap getLargeIcon() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.mLargeIcon
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation getUnreadConversation() {
                r1 = this;
                androidx.core.app.NotificationCompat$CarExtender$UnreadConversation r0 = r1.mUnreadConversation
                return r0
        }

        public androidx.core.app.NotificationCompat.CarExtender setColor(int r1) {
                r0 = this;
                r0.mColor = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.CarExtender setLargeIcon(android.graphics.Bitmap r1) {
                r0 = this;
                r0.mLargeIcon = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.CarExtender setUnreadConversation(androidx.core.app.NotificationCompat.CarExtender.UnreadConversation r1) {
                r0 = this;
                r0.mUnreadConversation = r1
                return r0
        }
    }

    public static class DecoratedCustomViewStyle extends androidx.core.app.NotificationCompat.Style {
        private static final int MAX_ACTION_BUTTONS = 3;
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        public DecoratedCustomViewStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        private android.widget.RemoteViews createRemoteViews(android.widget.RemoteViews r8, boolean r9) {
                r7 = this;
                int r0 = androidx.core.C0160R.layout.notification_template_custom_big
                r1 = 1
                r2 = 0
                android.widget.RemoteViews r0 = r7.applyStandardTemplate(r1, r0, r2)
                int r3 = androidx.core.C0160R.id.actions
                r0.removeAllViews(r3)
                androidx.core.app.NotificationCompat$Builder r3 = r7.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r3 = r3.mActions
                java.util.List r3 = getNonContextualActions(r3)
                if (r9 == 0) goto L39
                if (r3 == 0) goto L39
                int r9 = r3.size()
                r4 = 3
                int r9 = java.lang.Math.min(r9, r4)
                if (r9 <= 0) goto L39
                r4 = r2
            L25:
                if (r4 >= r9) goto L3a
                java.lang.Object r5 = r3.get(r4)
                androidx.core.app.NotificationCompat$Action r5 = (androidx.core.app.NotificationCompat.Action) r5
                android.widget.RemoteViews r5 = r7.generateActionButton(r5)
                int r6 = androidx.core.C0160R.id.actions
                r0.addView(r6, r5)
                int r4 = r4 + 1
                goto L25
            L39:
                r1 = r2
            L3a:
                if (r1 == 0) goto L3d
                goto L3f
            L3d:
                r2 = 8
            L3f:
                int r9 = androidx.core.C0160R.id.actions
                r0.setViewVisibility(r9, r2)
                int r9 = androidx.core.C0160R.id.action_divider
                r0.setViewVisibility(r9, r2)
                r7.buildIntoRemoteViews(r0, r8)
                return r0
        }

        private android.widget.RemoteViews generateActionButton(androidx.core.app.NotificationCompat.Action r7) {
                r6 = this;
                android.app.PendingIntent r0 = r7.actionIntent
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                android.widget.RemoteViews r1 = new android.widget.RemoteViews
                androidx.core.app.NotificationCompat$Builder r2 = r6.mBuilder
                android.content.Context r2 = r2.mContext
                java.lang.String r2 = r2.getPackageName()
                if (r0 == 0) goto L16
                int r3 = androidx.core.C0160R.layout.notification_action_tombstone
                goto L18
            L16:
                int r3 = androidx.core.C0160R.layout.notification_action
            L18:
                r1.<init>(r2, r3)
                androidx.core.graphics.drawable.IconCompat r2 = r7.getIconCompat()
                if (r2 == 0) goto L38
                int r3 = androidx.core.C0160R.id.action_image
                androidx.core.app.NotificationCompat$Builder r4 = r6.mBuilder
                android.content.Context r4 = r4.mContext
                android.content.res.Resources r4 = r4.getResources()
                int r5 = androidx.core.C0160R.color.notification_action_color_filter
                int r4 = r4.getColor(r5)
                android.graphics.Bitmap r2 = r6.createColoredBitmap(r2, r4)
                r1.setImageViewBitmap(r3, r2)
            L38:
                int r2 = androidx.core.C0160R.id.action_text
                java.lang.CharSequence r3 = r7.title
                r1.setTextViewText(r2, r3)
                if (r0 != 0) goto L48
                int r0 = androidx.core.C0160R.id.action_container
                android.app.PendingIntent r2 = r7.actionIntent
                r1.setOnClickPendingIntent(r0, r2)
            L48:
                int r0 = androidx.core.C0160R.id.action_container
                java.lang.CharSequence r7 = r7.title
                r1.setContentDescription(r0, r7)
                return r1
        }

        private static java.util.List<androidx.core.app.NotificationCompat.Action> getNonContextualActions(java.util.List<androidx.core.app.NotificationCompat.Action> r3) {
                if (r3 != 0) goto L4
                r3 = 0
                return r3
            L4:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r3 = r3.iterator()
            Ld:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L23
                java.lang.Object r1 = r3.next()
                androidx.core.app.NotificationCompat$Action r1 = (androidx.core.app.NotificationCompat.Action) r1
                boolean r2 = r1.isContextual()
                if (r2 != 0) goto Ld
                r0.add(r1)
                goto Ld
            L23:
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r2) {
                r1 = this;
                android.app.Notification$Builder r2 = r2.getBuilder()
                android.app.Notification$DecoratedCustomViewStyle r0 = new android.app.Notification$DecoratedCustomViewStyle
                r0.<init>()
                r2.setStyle(r0)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public interface Extender {
        androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder r1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    public static class InboxStyle extends androidx.core.app.NotificationCompat.Style {
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
        private java.util.ArrayList<java.lang.CharSequence> mTexts;

        public InboxStyle() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mTexts = r0
                return
        }

        public InboxStyle(androidx.core.app.NotificationCompat.Builder r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mTexts = r0
                r1.setBuilder(r2)
                return
        }

        public androidx.core.app.NotificationCompat.InboxStyle addLine(java.lang.CharSequence r2) {
                r1 = this;
                if (r2 == 0) goto Lb
                java.util.ArrayList<java.lang.CharSequence> r0 = r1.mTexts
                java.lang.CharSequence r2 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r2)
                r0.add(r2)
            Lb:
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r3) {
                r2 = this;
                android.app.Notification$InboxStyle r0 = new android.app.Notification$InboxStyle
                android.app.Notification$Builder r3 = r3.getBuilder()
                r0.<init>(r3)
                java.lang.CharSequence r3 = r2.mBigContentTitle
                android.app.Notification$InboxStyle r3 = r0.setBigContentTitle(r3)
                boolean r0 = r2.mSummaryTextSet
                if (r0 == 0) goto L18
                java.lang.CharSequence r0 = r2.mSummaryText
                r3.setSummaryText(r0)
            L18:
                java.util.ArrayList<java.lang.CharSequence> r0 = r2.mTexts
                java.util.Iterator r0 = r0.iterator()
            L1e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r3.addLine(r1)
                goto L1e
            L2e:
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle r2) {
                r1 = this;
                super.clearCompatExtraKeys(r2)
                java.lang.String r0 = "android.textLines"
                r2.remove(r0)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$InboxStyle"
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle r3) {
                r2 = this;
                super.restoreFromCompatExtras(r3)
                java.util.ArrayList<java.lang.CharSequence> r0 = r2.mTexts
                r0.clear()
                java.lang.String r0 = "android.textLines"
                boolean r1 = r3.containsKey(r0)
                if (r1 == 0) goto L19
                java.util.ArrayList<java.lang.CharSequence> r1 = r2.mTexts
                java.lang.CharSequence[] r3 = r3.getCharSequenceArray(r0)
                java.util.Collections.addAll(r1, r3)
            L19:
                return
        }

        public androidx.core.app.NotificationCompat.InboxStyle setBigContentTitle(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r1)
                r0.mBigContentTitle = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.InboxStyle setSummaryText(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r1)
                r0.mSummaryText = r1
                r1 = 1
                r0.mSummaryTextSet = r1
                return r0
        }
    }

    public static class MessagingStyle extends androidx.core.app.NotificationCompat.Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";
        private java.lang.CharSequence mConversationTitle;
        private final java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> mHistoricMessages;
        private java.lang.Boolean mIsGroupConversation;
        private final java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> mMessages;
        private androidx.core.app.Person mUser;

        public static final class Message {
            static final java.lang.String KEY_DATA_MIME_TYPE = "type";
            static final java.lang.String KEY_DATA_URI = "uri";
            static final java.lang.String KEY_EXTRAS_BUNDLE = "extras";
            static final java.lang.String KEY_NOTIFICATION_PERSON = "sender_person";
            static final java.lang.String KEY_PERSON = "person";
            static final java.lang.String KEY_SENDER = "sender";
            static final java.lang.String KEY_TEXT = "text";
            static final java.lang.String KEY_TIMESTAMP = "time";
            private java.lang.String mDataMimeType;
            private android.net.Uri mDataUri;
            private android.os.Bundle mExtras;
            private final androidx.core.app.Person mPerson;
            private final java.lang.CharSequence mText;
            private final long mTimestamp;

            public Message(java.lang.CharSequence r2, long r3, androidx.core.app.Person r5) {
                    r1 = this;
                    r1.<init>()
                    android.os.Bundle r0 = new android.os.Bundle
                    r0.<init>()
                    r1.mExtras = r0
                    r1.mText = r2
                    r1.mTimestamp = r3
                    r1.mPerson = r5
                    return
            }

            @java.lang.Deprecated
            public Message(java.lang.CharSequence r2, long r3, java.lang.CharSequence r5) {
                    r1 = this;
                    androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
                    r0.<init>()
                    androidx.core.app.Person$Builder r5 = r0.setName(r5)
                    androidx.core.app.Person r5 = r5.build()
                    r1.<init>(r2, r3, r5)
                    return
            }

            static android.os.Bundle[] getBundleArrayForMessages(java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> r4) {
                    int r0 = r4.size()
                    android.os.Bundle[] r0 = new android.os.Bundle[r0]
                    int r1 = r4.size()
                    r2 = 0
                Lb:
                    if (r2 >= r1) goto L1c
                    java.lang.Object r3 = r4.get(r2)
                    androidx.core.app.NotificationCompat$MessagingStyle$Message r3 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r3
                    android.os.Bundle r3 = r3.toBundle()
                    r0[r2] = r3
                    int r2 = r2 + 1
                    goto Lb
                L1c:
                    return r0
            }

            static androidx.core.app.NotificationCompat.MessagingStyle.Message getMessageFromBundle(android.os.Bundle r10) {
                    java.lang.String r0 = "uri"
                    java.lang.String r1 = "extras"
                    java.lang.String r2 = "type"
                    java.lang.String r3 = "sender"
                    java.lang.String r4 = "sender_person"
                    java.lang.String r5 = "person"
                    java.lang.String r6 = "time"
                    java.lang.String r7 = "text"
                    r8 = 0
                    boolean r9 = r10.containsKey(r7)     // Catch: java.lang.ClassCastException -> L96
                    if (r9 == 0) goto L96
                    boolean r9 = r10.containsKey(r6)     // Catch: java.lang.ClassCastException -> L96
                    if (r9 != 0) goto L1f
                    goto L96
                L1f:
                    boolean r9 = r10.containsKey(r5)     // Catch: java.lang.ClassCastException -> L96
                    if (r9 == 0) goto L2e
                    android.os.Bundle r3 = r10.getBundle(r5)     // Catch: java.lang.ClassCastException -> L96
                    androidx.core.app.Person r3 = androidx.core.app.Person.fromBundle(r3)     // Catch: java.lang.ClassCastException -> L96
                    goto L5e
                L2e:
                    boolean r5 = r10.containsKey(r4)     // Catch: java.lang.ClassCastException -> L96
                    if (r5 == 0) goto L45
                    int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.ClassCastException -> L96
                    r9 = 28
                    if (r5 < r9) goto L45
                    android.os.Parcelable r3 = r10.getParcelable(r4)     // Catch: java.lang.ClassCastException -> L96
                    android.app.Person r3 = (android.app.Person) r3     // Catch: java.lang.ClassCastException -> L96
                    androidx.core.app.Person r3 = androidx.core.app.Person.fromAndroidPerson(r3)     // Catch: java.lang.ClassCastException -> L96
                    goto L5e
                L45:
                    boolean r4 = r10.containsKey(r3)     // Catch: java.lang.ClassCastException -> L96
                    if (r4 == 0) goto L5d
                    androidx.core.app.Person$Builder r4 = new androidx.core.app.Person$Builder     // Catch: java.lang.ClassCastException -> L96
                    r4.<init>()     // Catch: java.lang.ClassCastException -> L96
                    java.lang.CharSequence r3 = r10.getCharSequence(r3)     // Catch: java.lang.ClassCastException -> L96
                    androidx.core.app.Person$Builder r3 = r4.setName(r3)     // Catch: java.lang.ClassCastException -> L96
                    androidx.core.app.Person r3 = r3.build()     // Catch: java.lang.ClassCastException -> L96
                    goto L5e
                L5d:
                    r3 = r8
                L5e:
                    androidx.core.app.NotificationCompat$MessagingStyle$Message r4 = new androidx.core.app.NotificationCompat$MessagingStyle$Message     // Catch: java.lang.ClassCastException -> L96
                    java.lang.CharSequence r5 = r10.getCharSequence(r7)     // Catch: java.lang.ClassCastException -> L96
                    long r6 = r10.getLong(r6)     // Catch: java.lang.ClassCastException -> L96
                    r4.<init>(r5, r6, r3)     // Catch: java.lang.ClassCastException -> L96
                    boolean r3 = r10.containsKey(r2)     // Catch: java.lang.ClassCastException -> L96
                    if (r3 == 0) goto L84
                    boolean r3 = r10.containsKey(r0)     // Catch: java.lang.ClassCastException -> L96
                    if (r3 == 0) goto L84
                    java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.ClassCastException -> L96
                    android.os.Parcelable r0 = r10.getParcelable(r0)     // Catch: java.lang.ClassCastException -> L96
                    android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.ClassCastException -> L96
                    r4.setData(r2, r0)     // Catch: java.lang.ClassCastException -> L96
                L84:
                    boolean r0 = r10.containsKey(r1)     // Catch: java.lang.ClassCastException -> L96
                    if (r0 == 0) goto L95
                    android.os.Bundle r0 = r4.getExtras()     // Catch: java.lang.ClassCastException -> L96
                    android.os.Bundle r10 = r10.getBundle(r1)     // Catch: java.lang.ClassCastException -> L96
                    r0.putAll(r10)     // Catch: java.lang.ClassCastException -> L96
                L95:
                    return r4
                L96:
                    return r8
            }

            static java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getMessagesFromBundleArray(android.os.Parcelable[] r4) {
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r4.length
                    r0.<init>(r1)
                    r1 = 0
                L7:
                    int r2 = r4.length
                    if (r1 >= r2) goto L1e
                    r2 = r4[r1]
                    boolean r3 = r2 instanceof android.os.Bundle
                    if (r3 == 0) goto L1b
                    android.os.Bundle r2 = (android.os.Bundle) r2
                    androidx.core.app.NotificationCompat$MessagingStyle$Message r2 = getMessageFromBundle(r2)
                    if (r2 == 0) goto L1b
                    r0.add(r2)
                L1b:
                    int r1 = r1 + 1
                    goto L7
                L1e:
                    return r0
            }

            private android.os.Bundle toBundle() {
                    r4 = this;
                    android.os.Bundle r0 = new android.os.Bundle
                    r0.<init>()
                    java.lang.CharSequence r1 = r4.mText
                    if (r1 == 0) goto Le
                    java.lang.String r2 = "text"
                    r0.putCharSequence(r2, r1)
                Le:
                    java.lang.String r1 = "time"
                    long r2 = r4.mTimestamp
                    r0.putLong(r1, r2)
                    androidx.core.app.Person r1 = r4.mPerson
                    if (r1 == 0) goto L3f
                    java.lang.String r2 = "sender"
                    java.lang.CharSequence r1 = r1.getName()
                    r0.putCharSequence(r2, r1)
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 28
                    if (r1 < r2) goto L34
                    androidx.core.app.Person r1 = r4.mPerson
                    android.app.Person r1 = r1.toAndroidPerson()
                    java.lang.String r2 = "sender_person"
                    r0.putParcelable(r2, r1)
                    goto L3f
                L34:
                    androidx.core.app.Person r1 = r4.mPerson
                    android.os.Bundle r1 = r1.toBundle()
                    java.lang.String r2 = "person"
                    r0.putBundle(r2, r1)
                L3f:
                    java.lang.String r1 = r4.mDataMimeType
                    if (r1 == 0) goto L48
                    java.lang.String r2 = "type"
                    r0.putString(r2, r1)
                L48:
                    android.net.Uri r1 = r4.mDataUri
                    if (r1 == 0) goto L51
                    java.lang.String r2 = "uri"
                    r0.putParcelable(r2, r1)
                L51:
                    android.os.Bundle r1 = r4.mExtras
                    if (r1 == 0) goto L5a
                    java.lang.String r2 = "extras"
                    r0.putBundle(r2, r1)
                L5a:
                    return r0
            }

            public java.lang.String getDataMimeType() {
                    r1 = this;
                    java.lang.String r0 = r1.mDataMimeType
                    return r0
            }

            public android.net.Uri getDataUri() {
                    r1 = this;
                    android.net.Uri r0 = r1.mDataUri
                    return r0
            }

            public android.os.Bundle getExtras() {
                    r1 = this;
                    android.os.Bundle r0 = r1.mExtras
                    return r0
            }

            public androidx.core.app.Person getPerson() {
                    r1 = this;
                    androidx.core.app.Person r0 = r1.mPerson
                    return r0
            }

            @java.lang.Deprecated
            public java.lang.CharSequence getSender() {
                    r1 = this;
                    androidx.core.app.Person r0 = r1.mPerson
                    if (r0 != 0) goto L6
                    r0 = 0
                    goto La
                L6:
                    java.lang.CharSequence r0 = r0.getName()
                La:
                    return r0
            }

            public java.lang.CharSequence getText() {
                    r1 = this;
                    java.lang.CharSequence r0 = r1.mText
                    return r0
            }

            public long getTimestamp() {
                    r2 = this;
                    long r0 = r2.mTimestamp
                    return r0
            }

            public androidx.core.app.NotificationCompat.MessagingStyle.Message setData(java.lang.String r1, android.net.Uri r2) {
                    r0 = this;
                    r0.mDataMimeType = r1
                    r0.mDataUri = r2
                    return r0
            }

            android.app.Notification.MessagingStyle.Message toAndroidMessage() {
                    r6 = this;
                    androidx.core.app.Person r0 = r6.getPerson()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 28
                    r3 = 0
                    if (r1 < r2) goto L20
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r2 = r6.getText()
                    long r4 = r6.getTimestamp()
                    if (r0 != 0) goto L18
                    goto L1c
                L18:
                    android.app.Person r3 = r0.toAndroidPerson()
                L1c:
                    r1.<init>(r2, r4, r3)
                    goto L34
                L20:
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r2 = r6.getText()
                    long r4 = r6.getTimestamp()
                    if (r0 != 0) goto L2d
                    goto L31
                L2d:
                    java.lang.CharSequence r3 = r0.getName()
                L31:
                    r1.<init>(r2, r4, r3)
                L34:
                    java.lang.String r0 = r6.getDataMimeType()
                    if (r0 == 0) goto L45
                    java.lang.String r0 = r6.getDataMimeType()
                    android.net.Uri r2 = r6.getDataUri()
                    r1.setData(r0, r2)
                L45:
                    return r1
            }
        }

        MessagingStyle() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mMessages = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mHistoricMessages = r0
                return
        }

        public MessagingStyle(androidx.core.app.Person r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mMessages = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mHistoricMessages = r0
                java.lang.CharSequence r0 = r2.getName()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L1e
                r1.mUser = r2
                return
            L1e:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "User's name must not be empty."
                r2.<init>(r0)
                throw r2
        }

        @java.lang.Deprecated
        public MessagingStyle(java.lang.CharSequence r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mMessages = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mHistoricMessages = r0
                androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
                r0.<init>()
                androidx.core.app.Person$Builder r2 = r0.setName(r2)
                androidx.core.app.Person r2 = r2.build()
                r1.mUser = r2
                return
        }

        public static androidx.core.app.NotificationCompat.MessagingStyle extractMessagingStyleFromNotification(android.app.Notification r1) {
                androidx.core.app.NotificationCompat$Style r1 = androidx.core.app.NotificationCompat.Style.extractStyleFromNotification(r1)
                boolean r0 = r1 instanceof androidx.core.app.NotificationCompat.MessagingStyle
                if (r0 == 0) goto Lb
                androidx.core.app.NotificationCompat$MessagingStyle r1 = (androidx.core.app.NotificationCompat.MessagingStyle) r1
                return r1
            Lb:
                r1 = 0
                return r1
        }

        private androidx.core.app.NotificationCompat.MessagingStyle.Message findLatestIncomingMessage() {
                r3 = this;
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r3.mMessages
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L2a
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r1 = r3.mMessages
                java.lang.Object r1 = r1.get(r0)
                androidx.core.app.NotificationCompat$MessagingStyle$Message r1 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r1
                androidx.core.app.Person r2 = r1.getPerson()
                if (r2 == 0) goto L27
                androidx.core.app.Person r2 = r1.getPerson()
                java.lang.CharSequence r2 = r2.getName()
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L27
                return r1
            L27:
                int r0 = r0 + (-1)
                goto L8
            L2a:
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r3.mMessages
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L41
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r3.mMessages
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.get(r1)
                androidx.core.app.NotificationCompat$MessagingStyle$Message r0 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r0
                return r0
            L41:
                r0 = 0
                return r0
        }

        private boolean hasMessagesWithoutSender() {
                r4 = this;
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r4.mMessages
                int r0 = r0.size()
                r1 = 1
                int r0 = r0 - r1
            L8:
                if (r0 < 0) goto L26
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r2 = r4.mMessages
                java.lang.Object r2 = r2.get(r0)
                androidx.core.app.NotificationCompat$MessagingStyle$Message r2 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r2
                androidx.core.app.Person r3 = r2.getPerson()
                if (r3 == 0) goto L23
                androidx.core.app.Person r2 = r2.getPerson()
                java.lang.CharSequence r2 = r2.getName()
                if (r2 != 0) goto L23
                return r1
            L23:
                int r0 = r0 + (-1)
                goto L8
            L26:
                r0 = 0
                return r0
        }

        private android.text.style.TextAppearanceSpan makeFontColorSpan(int r8) {
                r7 = this;
                android.text.style.TextAppearanceSpan r6 = new android.text.style.TextAppearanceSpan
                r1 = 0
                r2 = 0
                r3 = 0
                android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r8)
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        private java.lang.CharSequence makeMessageLine(androidx.core.app.NotificationCompat.MessagingStyle.Message r8) {
                r7 = this;
                androidx.core.text.BidiFormatter r0 = androidx.core.text.BidiFormatter.getInstance()
                android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
                r1.<init>()
                androidx.core.app.Person r2 = r8.getPerson()
                java.lang.String r3 = ""
                if (r2 != 0) goto L13
                r2 = r3
                goto L1b
            L13:
                androidx.core.app.Person r2 = r8.getPerson()
                java.lang.CharSequence r2 = r2.getName()
            L1b:
                boolean r4 = android.text.TextUtils.isEmpty(r2)
                r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                if (r4 == 0) goto L38
                androidx.core.app.Person r2 = r7.mUser
                java.lang.CharSequence r2 = r2.getName()
                androidx.core.app.NotificationCompat$Builder r4 = r7.mBuilder
                int r4 = r4.getColor()
                if (r4 == 0) goto L38
                androidx.core.app.NotificationCompat$Builder r4 = r7.mBuilder
                int r4 = r4.getColor()
                r5 = r4
            L38:
                java.lang.CharSequence r2 = r0.unicodeWrap(r2)
                r1.append(r2)
                android.text.style.TextAppearanceSpan r4 = r7.makeFontColorSpan(r5)
                int r5 = r1.length()
                int r2 = r2.length()
                int r5 = r5 - r2
                int r2 = r1.length()
                r6 = 33
                r1.setSpan(r4, r5, r2, r6)
                java.lang.CharSequence r2 = r8.getText()
                if (r2 != 0) goto L5c
                goto L60
            L5c:
                java.lang.CharSequence r3 = r8.getText()
            L60:
                java.lang.String r8 = "  "
                android.text.SpannableStringBuilder r8 = r1.append(r8)
                java.lang.CharSequence r0 = r0.unicodeWrap(r3)
                r8.append(r0)
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle r3) {
                r2 = this;
                super.addCompatExtras(r3)
                androidx.core.app.Person r0 = r2.mUser
                java.lang.CharSequence r0 = r0.getName()
                java.lang.String r1 = "android.selfDisplayName"
                r3.putCharSequence(r1, r0)
                androidx.core.app.Person r0 = r2.mUser
                android.os.Bundle r0 = r0.toBundle()
                java.lang.String r1 = "android.messagingStyleUser"
                r3.putBundle(r1, r0)
                java.lang.String r0 = "android.hiddenConversationTitle"
                java.lang.CharSequence r1 = r2.mConversationTitle
                r3.putCharSequence(r0, r1)
                java.lang.CharSequence r0 = r2.mConversationTitle
                if (r0 == 0) goto L33
                java.lang.Boolean r0 = r2.mIsGroupConversation
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L33
                java.lang.String r0 = "android.conversationTitle"
                java.lang.CharSequence r1 = r2.mConversationTitle
                r3.putCharSequence(r0, r1)
            L33:
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mMessages
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L46
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mMessages
                android.os.Bundle[] r0 = androidx.core.app.NotificationCompat.MessagingStyle.Message.getBundleArrayForMessages(r0)
                java.lang.String r1 = "android.messages"
                r3.putParcelableArray(r1, r0)
            L46:
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mHistoricMessages
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L59
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mHistoricMessages
                android.os.Bundle[] r0 = androidx.core.app.NotificationCompat.MessagingStyle.Message.getBundleArrayForMessages(r0)
                java.lang.String r1 = "android.messages.historic"
                r3.putParcelableArray(r1, r0)
            L59:
                java.lang.Boolean r0 = r2.mIsGroupConversation
                if (r0 == 0) goto L66
                java.lang.String r1 = "android.isGroupConversation"
                boolean r0 = r0.booleanValue()
                r3.putBoolean(r1, r0)
            L66:
                return
        }

        public androidx.core.app.NotificationCompat.MessagingStyle addHistoricMessage(androidx.core.app.NotificationCompat.MessagingStyle.Message r2) {
                r1 = this;
                if (r2 == 0) goto L17
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r1.mHistoricMessages
                r0.add(r2)
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r2 = r1.mHistoricMessages
                int r2 = r2.size()
                r0 = 25
                if (r2 <= r0) goto L17
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r2 = r1.mHistoricMessages
                r0 = 0
                r2.remove(r0)
            L17:
                return r1
        }

        public androidx.core.app.NotificationCompat.MessagingStyle addMessage(androidx.core.app.NotificationCompat.MessagingStyle.Message r2) {
                r1 = this;
                if (r2 == 0) goto L17
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r1.mMessages
                r0.add(r2)
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r2 = r1.mMessages
                int r2 = r2.size()
                r0 = 25
                if (r2 <= r0) goto L17
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r2 = r1.mMessages
                r0 = 0
                r2.remove(r0)
            L17:
                return r1
        }

        public androidx.core.app.NotificationCompat.MessagingStyle addMessage(java.lang.CharSequence r2, long r3, androidx.core.app.Person r5) {
                r1 = this;
                androidx.core.app.NotificationCompat$MessagingStyle$Message r0 = new androidx.core.app.NotificationCompat$MessagingStyle$Message
                r0.<init>(r2, r3, r5)
                r1.addMessage(r0)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.MessagingStyle addMessage(java.lang.CharSequence r4, long r5, java.lang.CharSequence r7) {
                r3 = this;
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r3.mMessages
                androidx.core.app.NotificationCompat$MessagingStyle$Message r1 = new androidx.core.app.NotificationCompat$MessagingStyle$Message
                androidx.core.app.Person$Builder r2 = new androidx.core.app.Person$Builder
                r2.<init>()
                androidx.core.app.Person$Builder r7 = r2.setName(r7)
                androidx.core.app.Person r7 = r7.build()
                r1.<init>(r4, r5, r7)
                r0.add(r1)
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r4 = r3.mMessages
                int r4 = r4.size()
                r5 = 25
                if (r4 <= r5) goto L27
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r4 = r3.mMessages
                r5 = 0
                r4.remove(r5)
            L27:
                return r3
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r5) {
                r4 = this;
                boolean r0 = r4.isGroupConversation()
                r4.setGroupConversation(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L19
                android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                androidx.core.app.Person r2 = r4.mUser
                android.app.Person r2 = r2.toAndroidPerson()
                r0.<init>(r2)
                goto L24
            L19:
                android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                androidx.core.app.Person r2 = r4.mUser
                java.lang.CharSequence r2 = r2.getName()
                r0.<init>(r2)
            L24:
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r2 = r4.mMessages
                java.util.Iterator r2 = r2.iterator()
            L2a:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L3e
                java.lang.Object r3 = r2.next()
                androidx.core.app.NotificationCompat$MessagingStyle$Message r3 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r3
                android.app.Notification$MessagingStyle$Message r3 = r3.toAndroidMessage()
                r0.addMessage(r3)
                goto L2a
            L3e:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 26
                if (r2 < r3) goto L5e
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r2 = r4.mHistoricMessages
                java.util.Iterator r2 = r2.iterator()
            L4a:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L5e
                java.lang.Object r3 = r2.next()
                androidx.core.app.NotificationCompat$MessagingStyle$Message r3 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r3
                android.app.Notification$MessagingStyle$Message r3 = r3.toAndroidMessage()
                r0.addHistoricMessage(r3)
                goto L4a
            L5e:
                java.lang.Boolean r2 = r4.mIsGroupConversation
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L6a
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r1) goto L6f
            L6a:
                java.lang.CharSequence r2 = r4.mConversationTitle
                r0.setConversationTitle(r2)
            L6f:
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r1) goto L7c
                java.lang.Boolean r1 = r4.mIsGroupConversation
                boolean r1 = r1.booleanValue()
                r0.setGroupConversation(r1)
            L7c:
                android.app.Notification$Builder r5 = r5.getBuilder()
                r0.setBuilder(r5)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle r2) {
                r1 = this;
                super.clearCompatExtraKeys(r2)
                java.lang.String r0 = "android.messagingStyleUser"
                r2.remove(r0)
                java.lang.String r0 = "android.selfDisplayName"
                r2.remove(r0)
                java.lang.String r0 = "android.conversationTitle"
                r2.remove(r0)
                java.lang.String r0 = "android.hiddenConversationTitle"
                r2.remove(r0)
                java.lang.String r0 = "android.messages"
                r2.remove(r0)
                java.lang.String r0 = "android.messages.historic"
                r2.remove(r0)
                java.lang.String r0 = "android.isGroupConversation"
                r2.remove(r0)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$MessagingStyle"
                return r0
        }

        public java.lang.CharSequence getConversationTitle() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mConversationTitle
                return r0
        }

        public java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getHistoricMessages() {
                r1 = this;
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r1.mHistoricMessages
                return r0
        }

        public java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getMessages() {
                r1 = this;
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r1.mMessages
                return r0
        }

        public androidx.core.app.Person getUser() {
                r1 = this;
                androidx.core.app.Person r0 = r1.mUser
                return r0
        }

        @java.lang.Deprecated
        public java.lang.CharSequence getUserDisplayName() {
                r1 = this;
                androidx.core.app.Person r0 = r1.mUser
                java.lang.CharSequence r0 = r0.getName()
                return r0
        }

        public boolean isGroupConversation() {
                r3 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilder
                r1 = 0
                if (r0 == 0) goto L1d
                androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
                int r0 = r0.targetSdkVersion
                r2 = 28
                if (r0 >= r2) goto L1d
                java.lang.Boolean r0 = r3.mIsGroupConversation
                if (r0 != 0) goto L1d
                java.lang.CharSequence r0 = r3.mConversationTitle
                if (r0 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
            L1d:
                java.lang.Boolean r0 = r3.mIsGroupConversation
                if (r0 == 0) goto L25
                boolean r1 = r0.booleanValue()
            L25:
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle r3) {
                r2 = this;
                super.restoreFromCompatExtras(r3)
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r0 = r2.mMessages
                r0.clear()
                java.lang.String r0 = "android.messagingStyleUser"
                boolean r1 = r3.containsKey(r0)
                if (r1 == 0) goto L1b
                android.os.Bundle r0 = r3.getBundle(r0)
                androidx.core.app.Person r0 = androidx.core.app.Person.fromBundle(r0)
                r2.mUser = r0
                goto L30
            L1b:
                androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
                r0.<init>()
                java.lang.String r1 = "android.selfDisplayName"
                java.lang.String r1 = r3.getString(r1)
                androidx.core.app.Person$Builder r0 = r0.setName(r1)
                androidx.core.app.Person r0 = r0.build()
                r2.mUser = r0
            L30:
                java.lang.String r0 = "android.conversationTitle"
                java.lang.CharSequence r0 = r3.getCharSequence(r0)
                r2.mConversationTitle = r0
                if (r0 != 0) goto L42
                java.lang.String r0 = "android.hiddenConversationTitle"
                java.lang.CharSequence r0 = r3.getCharSequence(r0)
                r2.mConversationTitle = r0
            L42:
                java.lang.String r0 = "android.messages"
                android.os.Parcelable[] r0 = r3.getParcelableArray(r0)
                if (r0 == 0) goto L53
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r1 = r2.mMessages
                java.util.List r0 = androidx.core.app.NotificationCompat.MessagingStyle.Message.getMessagesFromBundleArray(r0)
                r1.addAll(r0)
            L53:
                java.lang.String r0 = "android.messages.historic"
                android.os.Parcelable[] r0 = r3.getParcelableArray(r0)
                if (r0 == 0) goto L64
                java.util.List<androidx.core.app.NotificationCompat$MessagingStyle$Message> r1 = r2.mHistoricMessages
                java.util.List r0 = androidx.core.app.NotificationCompat.MessagingStyle.Message.getMessagesFromBundleArray(r0)
                r1.addAll(r0)
            L64:
                java.lang.String r0 = "android.isGroupConversation"
                boolean r1 = r3.containsKey(r0)
                if (r1 == 0) goto L76
                boolean r3 = r3.getBoolean(r0)
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r2.mIsGroupConversation = r3
            L76:
                return
        }

        public androidx.core.app.NotificationCompat.MessagingStyle setConversationTitle(java.lang.CharSequence r1) {
                r0 = this;
                r0.mConversationTitle = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.MessagingStyle setGroupConversation(boolean r1) {
                r0 = this;
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.mIsGroupConversation = r1
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    public static abstract class Style {
        java.lang.CharSequence mBigContentTitle;
        protected androidx.core.app.NotificationCompat.Builder mBuilder;
        java.lang.CharSequence mSummaryText;
        boolean mSummaryTextSet;

        public Style() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mSummaryTextSet = r0
                return
        }

        private int calculateTopPadding() {
                r5 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r5.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                int r1 = androidx.core.C0160R.dimen.notification_top_pad
                int r1 = r0.getDimensionPixelSize(r1)
                int r2 = androidx.core.C0160R.dimen.notification_top_pad_large_text
                int r2 = r0.getDimensionPixelSize(r2)
                android.content.res.Configuration r0 = r0.getConfiguration()
                float r0 = r0.fontScale
                r3 = 1067869798(0x3fa66666, float:1.3)
                r4 = 1065353216(0x3f800000, float:1.0)
                float r0 = constrain(r0, r4, r3)
                float r0 = r0 - r4
                r3 = 1050253720(0x3e999998, float:0.29999995)
                float r0 = r0 / r3
                float r4 = r4 - r0
                float r1 = (float) r1
                float r4 = r4 * r1
                float r1 = (float) r2
                float r0 = r0 * r1
                float r4 = r4 + r0
                int r0 = java.lang.Math.round(r4)
                return r0
        }

        private static float constrain(float r1, float r2, float r3) {
                int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r0 >= 0) goto L6
                r1 = r2
                goto Lb
            L6:
                int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r2 <= 0) goto Lb
                r1 = r3
            Lb:
                return r1
        }

        static androidx.core.app.NotificationCompat.Style constructCompatStyleByName(java.lang.String r2) {
                if (r2 == 0) goto L66
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -716705180: goto L3a;
                    case -171946061: goto L2f;
                    case 912942987: goto L24;
                    case 919595044: goto L19;
                    case 2090799565: goto Le;
                    default: goto Ld;
                }
            Ld:
                goto L44
            Le:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$MessagingStyle"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L17
                goto L44
            L17:
                r1 = 4
                goto L44
            L19:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigTextStyle"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L22
                goto L44
            L22:
                r1 = 3
                goto L44
            L24:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$InboxStyle"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L2d
                goto L44
            L2d:
                r1 = 2
                goto L44
            L2f:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigPictureStyle"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L38
                goto L44
            L38:
                r1 = 1
                goto L44
            L3a:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L43
                goto L44
            L43:
                r1 = 0
            L44:
                switch(r1) {
                    case 0: goto L60;
                    case 1: goto L5a;
                    case 2: goto L54;
                    case 3: goto L4e;
                    case 4: goto L48;
                    default: goto L47;
                }
            L47:
                goto L66
            L48:
                androidx.core.app.NotificationCompat$MessagingStyle r2 = new androidx.core.app.NotificationCompat$MessagingStyle
                r2.<init>()
                return r2
            L4e:
                androidx.core.app.NotificationCompat$BigTextStyle r2 = new androidx.core.app.NotificationCompat$BigTextStyle
                r2.<init>()
                return r2
            L54:
                androidx.core.app.NotificationCompat$InboxStyle r2 = new androidx.core.app.NotificationCompat$InboxStyle
                r2.<init>()
                return r2
            L5a:
                androidx.core.app.NotificationCompat$BigPictureStyle r2 = new androidx.core.app.NotificationCompat$BigPictureStyle
                r2.<init>()
                return r2
            L60:
                androidx.core.app.NotificationCompat$DecoratedCustomViewStyle r2 = new androidx.core.app.NotificationCompat$DecoratedCustomViewStyle
                r2.<init>()
                return r2
            L66:
                r2 = 0
                return r2
        }

        private static androidx.core.app.NotificationCompat.Style constructCompatStyleByPlatformName(java.lang.String r2) {
                r0 = 0
                if (r2 != 0) goto L4
                return r0
            L4:
                java.lang.Class<android.app.Notification$BigPictureStyle> r1 = android.app.Notification.BigPictureStyle.class
                java.lang.String r1 = r1.getName()
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L16
                androidx.core.app.NotificationCompat$BigPictureStyle r2 = new androidx.core.app.NotificationCompat$BigPictureStyle
                r2.<init>()
                return r2
            L16:
                java.lang.Class<android.app.Notification$BigTextStyle> r1 = android.app.Notification.BigTextStyle.class
                java.lang.String r1 = r1.getName()
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L28
                androidx.core.app.NotificationCompat$BigTextStyle r2 = new androidx.core.app.NotificationCompat$BigTextStyle
                r2.<init>()
                return r2
            L28:
                java.lang.Class<android.app.Notification$InboxStyle> r1 = android.app.Notification.InboxStyle.class
                java.lang.String r1 = r1.getName()
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L3a
                androidx.core.app.NotificationCompat$InboxStyle r2 = new androidx.core.app.NotificationCompat$InboxStyle
                r2.<init>()
                return r2
            L3a:
                java.lang.Class<android.app.Notification$MessagingStyle> r1 = android.app.Notification.MessagingStyle.class
                java.lang.String r1 = r1.getName()
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L4c
                androidx.core.app.NotificationCompat$MessagingStyle r2 = new androidx.core.app.NotificationCompat$MessagingStyle
                r2.<init>()
                return r2
            L4c:
                java.lang.Class<android.app.Notification$DecoratedCustomViewStyle> r1 = android.app.Notification.DecoratedCustomViewStyle.class
                java.lang.String r1 = r1.getName()
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L5e
                androidx.core.app.NotificationCompat$DecoratedCustomViewStyle r2 = new androidx.core.app.NotificationCompat$DecoratedCustomViewStyle
                r2.<init>()
                return r2
            L5e:
                return r0
        }

        static androidx.core.app.NotificationCompat.Style constructCompatStyleForBundle(android.os.Bundle r1) {
                java.lang.String r0 = "androidx.core.app.extra.COMPAT_TEMPLATE"
                java.lang.String r0 = r1.getString(r0)
                androidx.core.app.NotificationCompat$Style r0 = constructCompatStyleByName(r0)
                if (r0 == 0) goto Ld
                return r0
            Ld:
                java.lang.String r0 = "android.selfDisplayName"
                boolean r0 = r1.containsKey(r0)
                if (r0 != 0) goto L53
                java.lang.String r0 = "android.messagingStyleUser"
                boolean r0 = r1.containsKey(r0)
                if (r0 == 0) goto L1e
                goto L53
            L1e:
                java.lang.String r0 = "android.picture"
                boolean r0 = r1.containsKey(r0)
                if (r0 == 0) goto L2c
                androidx.core.app.NotificationCompat$BigPictureStyle r1 = new androidx.core.app.NotificationCompat$BigPictureStyle
                r1.<init>()
                return r1
            L2c:
                java.lang.String r0 = "android.bigText"
                boolean r0 = r1.containsKey(r0)
                if (r0 == 0) goto L3a
                androidx.core.app.NotificationCompat$BigTextStyle r1 = new androidx.core.app.NotificationCompat$BigTextStyle
                r1.<init>()
                return r1
            L3a:
                java.lang.String r0 = "android.textLines"
                boolean r0 = r1.containsKey(r0)
                if (r0 == 0) goto L48
                androidx.core.app.NotificationCompat$InboxStyle r1 = new androidx.core.app.NotificationCompat$InboxStyle
                r1.<init>()
                return r1
            L48:
                java.lang.String r0 = "android.template"
                java.lang.String r1 = r1.getString(r0)
                androidx.core.app.NotificationCompat$Style r1 = constructCompatStyleByPlatformName(r1)
                return r1
            L53:
                androidx.core.app.NotificationCompat$MessagingStyle r1 = new androidx.core.app.NotificationCompat$MessagingStyle
                r1.<init>()
                return r1
        }

        static androidx.core.app.NotificationCompat.Style constructStyleForExtras(android.os.Bundle r2) {
                androidx.core.app.NotificationCompat$Style r0 = constructCompatStyleForBundle(r2)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                r0.restoreFromCompatExtras(r2)     // Catch: java.lang.ClassCastException -> Lc
                return r0
            Lc:
                return r1
        }

        private android.graphics.Bitmap createColoredBitmap(int r2, int r3, int r4) {
                r1 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r1.mBuilder
                android.content.Context r0 = r0.mContext
                androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.createWithResource(r0, r2)
                android.graphics.Bitmap r2 = r1.createColoredBitmap(r2, r3, r4)
                return r2
        }

        private android.graphics.Bitmap createColoredBitmap(androidx.core.graphics.drawable.IconCompat r4, int r5, int r6) {
                r3 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilder
                android.content.Context r0 = r0.mContext
                android.graphics.drawable.Drawable r4 = r4.loadDrawable(r0)
                if (r6 != 0) goto Lf
                int r0 = r4.getIntrinsicWidth()
                goto L10
            Lf:
                r0 = r6
            L10:
                if (r6 != 0) goto L16
                int r6 = r4.getIntrinsicHeight()
            L16:
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r6, r1)
                r2 = 0
                r4.setBounds(r2, r2, r0, r6)
                if (r5 == 0) goto L30
                android.graphics.drawable.Drawable r6 = r4.mutate()
                android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
                android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
                r0.<init>(r5, r2)
                r6.setColorFilter(r0)
            L30:
                android.graphics.Canvas r5 = new android.graphics.Canvas
                r5.<init>(r1)
                r4.draw(r5)
                return r1
        }

        private android.graphics.Bitmap createIconWithBackground(int r3, int r4, int r5, int r6) {
                r2 = this;
                int r0 = androidx.core.C0160R.drawable.notification_icon_background
                if (r6 != 0) goto L5
                r6 = 0
            L5:
                android.graphics.Bitmap r6 = r2.createColoredBitmap(r0, r6, r4)
                android.graphics.Canvas r0 = new android.graphics.Canvas
                r0.<init>(r6)
                androidx.core.app.NotificationCompat$Builder r1 = r2.mBuilder
                android.content.Context r1 = r1.mContext
                android.content.res.Resources r1 = r1.getResources()
                android.graphics.drawable.Drawable r3 = r1.getDrawable(r3)
                android.graphics.drawable.Drawable r3 = r3.mutate()
                r1 = 1
                r3.setFilterBitmap(r1)
                int r4 = r4 - r5
                int r4 = r4 / 2
                int r5 = r5 + r4
                r3.setBounds(r4, r4, r5, r5)
                android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
                r5 = -1
                android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
                r4.<init>(r5, r1)
                r3.setColorFilter(r4)
                r3.draw(r0)
                return r6
        }

        public static androidx.core.app.NotificationCompat.Style extractStyleFromNotification(android.app.Notification r0) {
                android.os.Bundle r0 = androidx.core.app.NotificationCompat.getExtras(r0)
                if (r0 != 0) goto L8
                r0 = 0
                return r0
            L8:
                androidx.core.app.NotificationCompat$Style r0 = constructStyleForExtras(r0)
                return r0
        }

        private void hideNormalContent(android.widget.RemoteViews r3) {
                r2 = this;
                int r0 = androidx.core.C0160R.id.title
                r1 = 8
                r3.setViewVisibility(r0, r1)
                int r0 = androidx.core.C0160R.id.text2
                r3.setViewVisibility(r0, r1)
                int r0 = androidx.core.C0160R.id.text
                r3.setViewVisibility(r0, r1)
                return
        }

        public void addCompatExtras(android.os.Bundle r3) {
                r2 = this;
                boolean r0 = r2.mSummaryTextSet
                if (r0 == 0) goto Lb
                java.lang.String r0 = "android.summaryText"
                java.lang.CharSequence r1 = r2.mSummaryText
                r3.putCharSequence(r0, r1)
            Lb:
                java.lang.CharSequence r0 = r2.mBigContentTitle
                if (r0 == 0) goto L14
                java.lang.String r1 = "android.title.big"
                r3.putCharSequence(r1, r0)
            L14:
                java.lang.String r0 = r2.getClassName()
                if (r0 == 0) goto L1f
                java.lang.String r1 = "androidx.core.app.extra.COMPAT_TEMPLATE"
                r3.putString(r1, r0)
            L1f:
                return
        }

        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                return
        }

        public android.widget.RemoteViews applyStandardTemplate(boolean r12, int r13, boolean r14) {
                r11 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r11.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                android.widget.RemoteViews r7 = new android.widget.RemoteViews
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                android.content.Context r1 = r1.mContext
                java.lang.String r1 = r1.getPackageName()
                r7.<init>(r1, r13)
                androidx.core.app.NotificationCompat$Builder r13 = r11.mBuilder
                r13.getPriority()
                androidx.core.app.NotificationCompat$Builder r13 = r11.mBuilder
                android.graphics.Bitmap r13 = r13.mLargeIcon
                r8 = 0
                if (r13 == 0) goto L64
                int r13 = androidx.core.C0160R.id.icon
                r7.setViewVisibility(r13, r8)
                int r13 = androidx.core.C0160R.id.icon
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                android.graphics.Bitmap r1 = r1.mLargeIcon
                r7.setImageViewBitmap(r13, r1)
                if (r12 == 0) goto L9b
                androidx.core.app.NotificationCompat$Builder r12 = r11.mBuilder
                android.app.Notification r12 = r12.mNotification
                int r12 = r12.icon
                if (r12 == 0) goto L9b
                int r12 = androidx.core.C0160R.dimen.notification_right_icon_size
                int r12 = r0.getDimensionPixelSize(r12)
                int r13 = androidx.core.C0160R.dimen.notification_small_icon_background_padding
                int r13 = r0.getDimensionPixelSize(r13)
                int r13 = r13 * 2
                int r13 = r12 - r13
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                android.app.Notification r1 = r1.mNotification
                int r1 = r1.icon
                androidx.core.app.NotificationCompat$Builder r2 = r11.mBuilder
                int r2 = r2.getColor()
                android.graphics.Bitmap r12 = r11.createIconWithBackground(r1, r12, r13, r2)
                int r13 = androidx.core.C0160R.id.right_icon
                r7.setImageViewBitmap(r13, r12)
                int r12 = androidx.core.C0160R.id.right_icon
                r7.setViewVisibility(r12, r8)
                goto L9b
            L64:
                if (r12 == 0) goto L9b
                androidx.core.app.NotificationCompat$Builder r12 = r11.mBuilder
                android.app.Notification r12 = r12.mNotification
                int r12 = r12.icon
                if (r12 == 0) goto L9b
                int r12 = androidx.core.C0160R.id.icon
                r7.setViewVisibility(r12, r8)
                int r12 = androidx.core.C0160R.dimen.notification_large_icon_width
                int r12 = r0.getDimensionPixelSize(r12)
                int r13 = androidx.core.C0160R.dimen.notification_big_circle_margin
                int r13 = r0.getDimensionPixelSize(r13)
                int r12 = r12 - r13
                int r13 = androidx.core.C0160R.dimen.notification_small_icon_size_as_large
                int r13 = r0.getDimensionPixelSize(r13)
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                android.app.Notification r1 = r1.mNotification
                int r1 = r1.icon
                androidx.core.app.NotificationCompat$Builder r2 = r11.mBuilder
                int r2 = r2.getColor()
                android.graphics.Bitmap r12 = r11.createIconWithBackground(r1, r12, r13, r2)
                int r13 = androidx.core.C0160R.id.icon
                r7.setImageViewBitmap(r13, r12)
            L9b:
                androidx.core.app.NotificationCompat$Builder r12 = r11.mBuilder
                java.lang.CharSequence r12 = r12.mContentTitle
                if (r12 == 0) goto Laa
                int r12 = androidx.core.C0160R.id.title
                androidx.core.app.NotificationCompat$Builder r13 = r11.mBuilder
                java.lang.CharSequence r13 = r13.mContentTitle
                r7.setTextViewText(r12, r13)
            Laa:
                androidx.core.app.NotificationCompat$Builder r12 = r11.mBuilder
                java.lang.CharSequence r12 = r12.mContentText
                r13 = 1
                if (r12 == 0) goto Lbc
                int r12 = androidx.core.C0160R.id.text
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                java.lang.CharSequence r1 = r1.mContentText
                r7.setTextViewText(r12, r1)
                r12 = r13
                goto Lbd
            Lbc:
                r12 = r8
            Lbd:
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                java.lang.CharSequence r1 = r1.mContentInfo
                r9 = 8
                if (r1 == 0) goto Ld6
                int r12 = androidx.core.C0160R.id.info
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                java.lang.CharSequence r1 = r1.mContentInfo
                r7.setTextViewText(r12, r1)
                int r12 = androidx.core.C0160R.id.info
                r7.setViewVisibility(r12, r8)
            Ld3:
                r12 = r13
                r10 = r12
                goto L112
            Ld6:
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                int r1 = r1.mNumber
                if (r1 <= 0) goto L10c
                int r12 = androidx.core.C0160R.integer.status_bar_notification_info_maxnum
                int r12 = r0.getInteger(r12)
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                int r1 = r1.mNumber
                if (r1 <= r12) goto Lf4
                int r12 = androidx.core.C0160R.id.info
                int r1 = androidx.core.C0160R.string.status_bar_notification_info_overflow
                java.lang.String r1 = r0.getString(r1)
                r7.setTextViewText(r12, r1)
                goto L106
            Lf4:
                java.text.NumberFormat r12 = java.text.NumberFormat.getIntegerInstance()
                int r1 = androidx.core.C0160R.id.info
                androidx.core.app.NotificationCompat$Builder r2 = r11.mBuilder
                int r2 = r2.mNumber
                long r2 = (long) r2
                java.lang.String r12 = r12.format(r2)
                r7.setTextViewText(r1, r12)
            L106:
                int r12 = androidx.core.C0160R.id.info
                r7.setViewVisibility(r12, r8)
                goto Ld3
            L10c:
                int r1 = androidx.core.C0160R.id.info
                r7.setViewVisibility(r1, r9)
                r10 = r8
            L112:
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                java.lang.CharSequence r1 = r1.mSubText
                if (r1 == 0) goto L13c
                int r1 = androidx.core.C0160R.id.text
                androidx.core.app.NotificationCompat$Builder r2 = r11.mBuilder
                java.lang.CharSequence r2 = r2.mSubText
                r7.setTextViewText(r1, r2)
                androidx.core.app.NotificationCompat$Builder r1 = r11.mBuilder
                java.lang.CharSequence r1 = r1.mContentText
                if (r1 == 0) goto L137
                int r1 = androidx.core.C0160R.id.text2
                androidx.core.app.NotificationCompat$Builder r2 = r11.mBuilder
                java.lang.CharSequence r2 = r2.mContentText
                r7.setTextViewText(r1, r2)
                int r1 = androidx.core.C0160R.id.text2
                r7.setViewVisibility(r1, r8)
                r1 = r13
                goto L13d
            L137:
                int r1 = androidx.core.C0160R.id.text2
                r7.setViewVisibility(r1, r9)
            L13c:
                r1 = r8
            L13d:
                if (r1 == 0) goto L157
                if (r14 == 0) goto L14d
                int r14 = androidx.core.C0160R.dimen.notification_subtext_size
                int r14 = r0.getDimensionPixelSize(r14)
                float r14 = (float) r14
                int r0 = androidx.core.C0160R.id.text
                r7.setTextViewTextSize(r0, r8, r14)
            L14d:
                int r2 = androidx.core.C0160R.id.line1
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r1 = r7
                r1.setViewPadding(r2, r3, r4, r5, r6)
            L157:
                androidx.core.app.NotificationCompat$Builder r14 = r11.mBuilder
                long r0 = r14.getWhenIfShowing()
                r2 = 0
                int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r14 == 0) goto L1af
                androidx.core.app.NotificationCompat$Builder r14 = r11.mBuilder
                boolean r14 = r14.mUseChronometer
                if (r14 == 0) goto L19c
                int r14 = androidx.core.C0160R.id.chronometer
                r7.setViewVisibility(r14, r8)
                int r14 = androidx.core.C0160R.id.chronometer
                androidx.core.app.NotificationCompat$Builder r0 = r11.mBuilder
                long r0 = r0.getWhenIfShowing()
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                long r0 = r0 + r2
                java.lang.String r2 = "setBase"
                r7.setLong(r14, r2, r0)
                int r14 = androidx.core.C0160R.id.chronometer
                java.lang.String r0 = "setStarted"
                r7.setBoolean(r14, r0, r13)
                androidx.core.app.NotificationCompat$Builder r14 = r11.mBuilder
                boolean r14 = r14.mChronometerCountDown
                if (r14 == 0) goto L1b0
                int r14 = androidx.core.C0160R.id.chronometer
                androidx.core.app.NotificationCompat$Builder r0 = r11.mBuilder
                boolean r0 = r0.mChronometerCountDown
                r7.setChronometerCountDown(r14, r0)
                goto L1b0
            L19c:
                int r14 = androidx.core.C0160R.id.time
                r7.setViewVisibility(r14, r8)
                int r14 = androidx.core.C0160R.id.time
                androidx.core.app.NotificationCompat$Builder r0 = r11.mBuilder
                long r0 = r0.getWhenIfShowing()
                java.lang.String r2 = "setTime"
                r7.setLong(r14, r2, r0)
                goto L1b0
            L1af:
                r13 = r10
            L1b0:
                int r14 = androidx.core.C0160R.id.right_side
                if (r13 == 0) goto L1b6
                r13 = r8
                goto L1b7
            L1b6:
                r13 = r9
            L1b7:
                r7.setViewVisibility(r14, r13)
                int r13 = androidx.core.C0160R.id.line3
                if (r12 == 0) goto L1bf
                goto L1c0
            L1bf:
                r8 = r9
            L1c0:
                r7.setViewVisibility(r13, r8)
                return r7
        }

        public android.app.Notification build() {
                r1 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r1.mBuilder
                if (r0 == 0) goto L9
                android.app.Notification r0 = r0.build()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        public void buildIntoRemoteViews(android.widget.RemoteViews r8, android.widget.RemoteViews r9) {
                r7 = this;
                r7.hideNormalContent(r8)
                int r0 = androidx.core.C0160R.id.notification_main_column
                r8.removeAllViews(r0)
                int r0 = androidx.core.C0160R.id.notification_main_column
                android.widget.RemoteViews r9 = r9.clone()
                r8.addView(r0, r9)
                int r9 = androidx.core.C0160R.id.notification_main_column
                r0 = 0
                r8.setViewVisibility(r9, r0)
                int r2 = androidx.core.C0160R.id.notification_main_column_container
                r3 = 0
                int r4 = r7.calculateTopPadding()
                r5 = 0
                r6 = 0
                r1 = r8
                r1.setViewPadding(r2, r3, r4, r5, r6)
                return
        }

        protected void clearCompatExtraKeys(android.os.Bundle r2) {
                r1 = this;
                java.lang.String r0 = "android.summaryText"
                r2.remove(r0)
                java.lang.String r0 = "android.title.big"
                r2.remove(r0)
                java.lang.String r0 = "androidx.core.app.extra.COMPAT_TEMPLATE"
                r2.remove(r0)
                return
        }

        public android.graphics.Bitmap createColoredBitmap(int r2, int r3) {
                r1 = this;
                r0 = 0
                android.graphics.Bitmap r2 = r1.createColoredBitmap(r2, r3, r0)
                return r2
        }

        android.graphics.Bitmap createColoredBitmap(androidx.core.graphics.drawable.IconCompat r2, int r3) {
                r1 = this;
                r0 = 0
                android.graphics.Bitmap r2 = r1.createColoredBitmap(r2, r3, r0)
                return r2
        }

        public boolean displayCustomViewInline() {
                r1 = this;
                r0 = 0
                return r0
        }

        protected java.lang.String getClassName() {
                r1 = this;
                r0 = 0
                return r0
        }

        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        protected void restoreFromCompatExtras(android.os.Bundle r3) {
                r2 = this;
                java.lang.String r0 = "android.summaryText"
                boolean r1 = r3.containsKey(r0)
                if (r1 == 0) goto L11
                java.lang.CharSequence r0 = r3.getCharSequence(r0)
                r2.mSummaryText = r0
                r0 = 1
                r2.mSummaryTextSet = r0
            L11:
                java.lang.String r0 = "android.title.big"
                java.lang.CharSequence r3 = r3.getCharSequence(r0)
                r2.mBigContentTitle = r3
                return
        }

        public void setBuilder(androidx.core.app.NotificationCompat.Builder r2) {
                r1 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r1.mBuilder
                if (r0 == r2) goto Lb
                r1.mBuilder = r2
                if (r2 == 0) goto Lb
                r2.setStyle(r1)
            Lb:
                return
        }
    }

    public static final class WearableExtender implements androidx.core.app.NotificationCompat.Extender {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final java.lang.String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final java.lang.String KEY_ACTIONS = "actions";
        private static final java.lang.String KEY_BACKGROUND = "background";
        private static final java.lang.String KEY_BRIDGE_TAG = "bridgeTag";
        private static final java.lang.String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final java.lang.String KEY_CONTENT_ICON = "contentIcon";
        private static final java.lang.String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final java.lang.String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final java.lang.String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final java.lang.String KEY_DISMISSAL_ID = "dismissalId";
        private static final java.lang.String KEY_DISPLAY_INTENT = "displayIntent";
        private static final java.lang.String KEY_FLAGS = "flags";
        private static final java.lang.String KEY_GRAVITY = "gravity";
        private static final java.lang.String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final java.lang.String KEY_PAGES = "pages";

        @java.lang.Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;

        @java.lang.Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;

        @java.lang.Deprecated
        public static final int SIZE_DEFAULT = 0;

        @java.lang.Deprecated
        public static final int SIZE_FULL_SCREEN = 5;

        @java.lang.Deprecated
        public static final int SIZE_LARGE = 4;

        @java.lang.Deprecated
        public static final int SIZE_MEDIUM = 3;

        @java.lang.Deprecated
        public static final int SIZE_SMALL = 2;

        @java.lang.Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private java.util.ArrayList<androidx.core.app.NotificationCompat.Action> mActions;
        private android.graphics.Bitmap mBackground;
        private java.lang.String mBridgeTag;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private java.lang.String mDismissalId;
        private android.app.PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private java.util.ArrayList<android.app.Notification> mPages;

        public WearableExtender() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mActions = r0
                r0 = 1
                r1.mFlags = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mPages = r0
                r0 = 8388613(0x800005, float:1.175495E-38)
                r1.mContentIconGravity = r0
                r0 = -1
                r1.mContentActionIndex = r0
                r0 = 0
                r1.mCustomSizePreset = r0
                r0 = 80
                r1.mGravity = r0
                return
        }

        public WearableExtender(android.app.Notification r11) {
                r10 = this;
                r10.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r10.mActions = r0
                r0 = 1
                r10.mFlags = r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r10.mPages = r1
                r1 = 8388613(0x800005, float:1.175495E-38)
                r10.mContentIconGravity = r1
                r2 = -1
                r10.mContentActionIndex = r2
                r3 = 0
                r10.mCustomSizePreset = r3
                r4 = 80
                r10.mGravity = r4
                android.os.Bundle r11 = androidx.core.app.NotificationCompat.getExtras(r11)
                if (r11 == 0) goto L30
                java.lang.String r5 = "android.wearable.EXTENSIONS"
                android.os.Bundle r11 = r11.getBundle(r5)
                goto L31
            L30:
                r11 = 0
            L31:
                if (r11 == 0) goto Lc9
                java.lang.String r5 = "actions"
                java.util.ArrayList r5 = r11.getParcelableArrayList(r5)
                if (r5 == 0) goto L58
                int r6 = r5.size()
                androidx.core.app.NotificationCompat$Action[] r7 = new androidx.core.app.NotificationCompat.Action[r6]
                r8 = r3
            L42:
                if (r8 >= r6) goto L53
                java.lang.Object r9 = r5.get(r8)
                android.app.Notification$Action r9 = (android.app.Notification.Action) r9
                androidx.core.app.NotificationCompat$Action r9 = androidx.core.app.NotificationCompat.getActionCompatFromAction(r9)
                r7[r8] = r9
                int r8 = r8 + 1
                goto L42
            L53:
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r5 = r10.mActions
                java.util.Collections.addAll(r5, r7)
            L58:
                java.lang.String r5 = "flags"
                int r0 = r11.getInt(r5, r0)
                r10.mFlags = r0
                java.lang.String r0 = "displayIntent"
                android.os.Parcelable r0 = r11.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r10.mDisplayIntent = r0
                java.lang.String r0 = "pages"
                android.app.Notification[] r0 = androidx.core.app.NotificationCompat.getNotificationArrayFromBundle(r11, r0)
                if (r0 == 0) goto L77
                java.util.ArrayList<android.app.Notification> r5 = r10.mPages
                java.util.Collections.addAll(r5, r0)
            L77:
                java.lang.String r0 = "background"
                android.os.Parcelable r0 = r11.getParcelable(r0)
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                r10.mBackground = r0
                java.lang.String r0 = "contentIcon"
                int r0 = r11.getInt(r0)
                r10.mContentIcon = r0
                java.lang.String r0 = "contentIconGravity"
                int r0 = r11.getInt(r0, r1)
                r10.mContentIconGravity = r0
                java.lang.String r0 = "contentActionIndex"
                int r0 = r11.getInt(r0, r2)
                r10.mContentActionIndex = r0
                java.lang.String r0 = "customSizePreset"
                int r0 = r11.getInt(r0, r3)
                r10.mCustomSizePreset = r0
                java.lang.String r0 = "customContentHeight"
                int r0 = r11.getInt(r0)
                r10.mCustomContentHeight = r0
                java.lang.String r0 = "gravity"
                int r0 = r11.getInt(r0, r4)
                r10.mGravity = r0
                java.lang.String r0 = "hintScreenTimeout"
                int r0 = r11.getInt(r0)
                r10.mHintScreenTimeout = r0
                java.lang.String r0 = "dismissalId"
                java.lang.String r0 = r11.getString(r0)
                r10.mDismissalId = r0
                java.lang.String r0 = "bridgeTag"
                java.lang.String r11 = r11.getString(r0)
                r10.mBridgeTag = r11
            Lc9:
                return
        }

        private static android.app.Notification.Action getActionFromActionCompat(androidx.core.app.NotificationCompat.Action r4) {
                androidx.core.graphics.drawable.IconCompat r0 = r4.getIconCompat()
                android.app.Notification$Action$Builder r1 = new android.app.Notification$Action$Builder
                if (r0 != 0) goto La
                r0 = 0
                goto Le
            La:
                android.graphics.drawable.Icon r0 = r0.toIcon()
            Le:
                java.lang.CharSequence r2 = r4.getTitle()
                android.app.PendingIntent r3 = r4.getActionIntent()
                r1.<init>(r0, r2, r3)
                android.os.Bundle r0 = r4.getExtras()
                if (r0 == 0) goto L29
                android.os.Bundle r0 = new android.os.Bundle
                android.os.Bundle r2 = r4.getExtras()
                r0.<init>(r2)
                goto L2e
            L29:
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
            L2e:
                java.lang.String r2 = "android.support.allowGeneratedReplies"
                boolean r3 = r4.getAllowGeneratedReplies()
                r0.putBoolean(r2, r3)
                boolean r2 = r4.getAllowGeneratedReplies()
                r1.setAllowGeneratedReplies(r2)
                r1.addExtras(r0)
                androidx.core.app.RemoteInput[] r4 = r4.getRemoteInputs()
                if (r4 == 0) goto L57
                android.app.RemoteInput[] r4 = androidx.core.app.RemoteInput.fromCompat(r4)
                int r0 = r4.length
                r2 = 0
            L4d:
                if (r2 >= r0) goto L57
                r3 = r4[r2]
                r1.addRemoteInput(r3)
                int r2 = r2 + 1
                goto L4d
            L57:
                android.app.Notification$Action r4 = r1.build()
                return r4
        }

        private void setFlag(int r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L8
                int r2 = r0.mFlags
                r1 = r1 | r2
                r0.mFlags = r1
                goto Le
            L8:
                int r2 = r0.mFlags
                int r1 = ~r1
                r1 = r1 & r2
                r0.mFlags = r1
            Le:
                return
        }

        public androidx.core.app.NotificationCompat.WearableExtender addAction(androidx.core.app.NotificationCompat.Action r2) {
                r1 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mActions
                r0.add(r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.WearableExtender addActions(java.util.List<androidx.core.app.NotificationCompat.Action> r2) {
                r1 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mActions
                r0.addAll(r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender addPage(android.app.Notification r2) {
                r1 = this;
                java.util.ArrayList<android.app.Notification> r0 = r1.mPages
                r0.add(r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender addPages(java.util.List<android.app.Notification> r2) {
                r1 = this;
                java.util.ArrayList<android.app.Notification> r0 = r1.mPages
                r0.addAll(r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.WearableExtender clearActions() {
                r1 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mActions
                r0.clear()
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender clearPages() {
                r1 = this;
                java.util.ArrayList<android.app.Notification> r0 = r1.mPages
                r0.clear()
                return r1
        }

        public androidx.core.app.NotificationCompat.WearableExtender clone() {
                r3 = this;
                androidx.core.app.NotificationCompat$WearableExtender r0 = new androidx.core.app.NotificationCompat$WearableExtender
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r2 = r3.mActions
                r1.<init>(r2)
                r0.mActions = r1
                int r1 = r3.mFlags
                r0.mFlags = r1
                android.app.PendingIntent r1 = r3.mDisplayIntent
                r0.mDisplayIntent = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.ArrayList<android.app.Notification> r2 = r3.mPages
                r1.<init>(r2)
                r0.mPages = r1
                android.graphics.Bitmap r1 = r3.mBackground
                r0.mBackground = r1
                int r1 = r3.mContentIcon
                r0.mContentIcon = r1
                int r1 = r3.mContentIconGravity
                r0.mContentIconGravity = r1
                int r1 = r3.mContentActionIndex
                r0.mContentActionIndex = r1
                int r1 = r3.mCustomSizePreset
                r0.mCustomSizePreset = r1
                int r1 = r3.mCustomContentHeight
                r0.mCustomContentHeight = r1
                int r1 = r3.mGravity
                r0.mGravity = r1
                int r1 = r3.mHintScreenTimeout
                r0.mHintScreenTimeout = r1
                java.lang.String r1 = r3.mDismissalId
                r0.mDismissalId = r1
                java.lang.String r1 = r3.mBridgeTag
                r0.mBridgeTag = r1
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m132clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                androidx.core.app.NotificationCompat$WearableExtender r0 = r1.clone()
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder r5) {
                r4 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r1 = r4.mActions
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L37
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r2 = r4.mActions
                int r2 = r2.size()
                r1.<init>(r2)
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r2 = r4.mActions
                java.util.Iterator r2 = r2.iterator()
            L1e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L32
                java.lang.Object r3 = r2.next()
                androidx.core.app.NotificationCompat$Action r3 = (androidx.core.app.NotificationCompat.Action) r3
                android.app.Notification$Action r3 = getActionFromActionCompat(r3)
                r1.add(r3)
                goto L1e
            L32:
                java.lang.String r2 = "actions"
                r0.putParcelableArrayList(r2, r1)
            L37:
                int r1 = r4.mFlags
                r2 = 1
                if (r1 == r2) goto L41
                java.lang.String r2 = "flags"
                r0.putInt(r2, r1)
            L41:
                android.app.PendingIntent r1 = r4.mDisplayIntent
                if (r1 == 0) goto L4a
                java.lang.String r2 = "displayIntent"
                r0.putParcelable(r2, r1)
            L4a:
                java.util.ArrayList<android.app.Notification> r1 = r4.mPages
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L65
                java.util.ArrayList<android.app.Notification> r1 = r4.mPages
                int r2 = r1.size()
                android.app.Notification[] r2 = new android.app.Notification[r2]
                java.lang.Object[] r1 = r1.toArray(r2)
                android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
                java.lang.String r2 = "pages"
                r0.putParcelableArray(r2, r1)
            L65:
                android.graphics.Bitmap r1 = r4.mBackground
                if (r1 == 0) goto L6e
                java.lang.String r2 = "background"
                r0.putParcelable(r2, r1)
            L6e:
                int r1 = r4.mContentIcon
                if (r1 == 0) goto L77
                java.lang.String r2 = "contentIcon"
                r0.putInt(r2, r1)
            L77:
                int r1 = r4.mContentIconGravity
                r2 = 8388613(0x800005, float:1.175495E-38)
                if (r1 == r2) goto L83
                java.lang.String r2 = "contentIconGravity"
                r0.putInt(r2, r1)
            L83:
                int r1 = r4.mContentActionIndex
                r2 = -1
                if (r1 == r2) goto L8d
                java.lang.String r2 = "contentActionIndex"
                r0.putInt(r2, r1)
            L8d:
                int r1 = r4.mCustomSizePreset
                if (r1 == 0) goto L96
                java.lang.String r2 = "customSizePreset"
                r0.putInt(r2, r1)
            L96:
                int r1 = r4.mCustomContentHeight
                if (r1 == 0) goto L9f
                java.lang.String r2 = "customContentHeight"
                r0.putInt(r2, r1)
            L9f:
                int r1 = r4.mGravity
                r2 = 80
                if (r1 == r2) goto Laa
                java.lang.String r2 = "gravity"
                r0.putInt(r2, r1)
            Laa:
                int r1 = r4.mHintScreenTimeout
                if (r1 == 0) goto Lb3
                java.lang.String r2 = "hintScreenTimeout"
                r0.putInt(r2, r1)
            Lb3:
                java.lang.String r1 = r4.mDismissalId
                if (r1 == 0) goto Lbc
                java.lang.String r2 = "dismissalId"
                r0.putString(r2, r1)
            Lbc:
                java.lang.String r1 = r4.mBridgeTag
                if (r1 == 0) goto Lc5
                java.lang.String r2 = "bridgeTag"
                r0.putString(r2, r1)
            Lc5:
                android.os.Bundle r1 = r5.getExtras()
                java.lang.String r2 = "android.wearable.EXTENSIONS"
                r1.putBundle(r2, r0)
                return r5
        }

        public java.util.List<androidx.core.app.NotificationCompat.Action> getActions() {
                r1 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r1.mActions
                return r0
        }

        @java.lang.Deprecated
        public android.graphics.Bitmap getBackground() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.mBackground
                return r0
        }

        public java.lang.String getBridgeTag() {
                r1 = this;
                java.lang.String r0 = r1.mBridgeTag
                return r0
        }

        public int getContentAction() {
                r1 = this;
                int r0 = r1.mContentActionIndex
                return r0
        }

        @java.lang.Deprecated
        public int getContentIcon() {
                r1 = this;
                int r0 = r1.mContentIcon
                return r0
        }

        @java.lang.Deprecated
        public int getContentIconGravity() {
                r1 = this;
                int r0 = r1.mContentIconGravity
                return r0
        }

        public boolean getContentIntentAvailableOffline() {
                r2 = this;
                int r0 = r2.mFlags
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        @java.lang.Deprecated
        public int getCustomContentHeight() {
                r1 = this;
                int r0 = r1.mCustomContentHeight
                return r0
        }

        @java.lang.Deprecated
        public int getCustomSizePreset() {
                r1 = this;
                int r0 = r1.mCustomSizePreset
                return r0
        }

        public java.lang.String getDismissalId() {
                r1 = this;
                java.lang.String r0 = r1.mDismissalId
                return r0
        }

        @java.lang.Deprecated
        public android.app.PendingIntent getDisplayIntent() {
                r1 = this;
                android.app.PendingIntent r0 = r1.mDisplayIntent
                return r0
        }

        @java.lang.Deprecated
        public int getGravity() {
                r1 = this;
                int r0 = r1.mGravity
                return r0
        }

        @java.lang.Deprecated
        public boolean getHintAmbientBigPicture() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 32
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @java.lang.Deprecated
        public boolean getHintAvoidBackgroundClipping() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 16
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean getHintContentIntentLaunchesActivity() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 64
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @java.lang.Deprecated
        public boolean getHintHideIcon() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @java.lang.Deprecated
        public int getHintScreenTimeout() {
                r1 = this;
                int r0 = r1.mHintScreenTimeout
                return r0
        }

        @java.lang.Deprecated
        public boolean getHintShowBackgroundOnly() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 4
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @java.lang.Deprecated
        public java.util.List<android.app.Notification> getPages() {
                r1 = this;
                java.util.ArrayList<android.app.Notification> r0 = r1.mPages
                return r0
        }

        public boolean getStartScrollBottom() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 8
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setBackground(android.graphics.Bitmap r1) {
                r0 = this;
                r0.mBackground = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.WearableExtender setBridgeTag(java.lang.String r1) {
                r0 = this;
                r0.mBridgeTag = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.WearableExtender setContentAction(int r1) {
                r0 = this;
                r0.mContentActionIndex = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setContentIcon(int r1) {
                r0 = this;
                r0.mContentIcon = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setContentIconGravity(int r1) {
                r0 = this;
                r0.mContentIconGravity = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.WearableExtender setContentIntentAvailableOffline(boolean r2) {
                r1 = this;
                r0 = 1
                r1.setFlag(r0, r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setCustomContentHeight(int r1) {
                r0 = this;
                r0.mCustomContentHeight = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setCustomSizePreset(int r1) {
                r0 = this;
                r0.mCustomSizePreset = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.WearableExtender setDismissalId(java.lang.String r1) {
                r0 = this;
                r0.mDismissalId = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setDisplayIntent(android.app.PendingIntent r1) {
                r0 = this;
                r0.mDisplayIntent = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setGravity(int r1) {
                r0 = this;
                r0.mGravity = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintAmbientBigPicture(boolean r2) {
                r1 = this;
                r0 = 32
                r1.setFlag(r0, r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintAvoidBackgroundClipping(boolean r2) {
                r1 = this;
                r0 = 16
                r1.setFlag(r0, r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.WearableExtender setHintContentIntentLaunchesActivity(boolean r2) {
                r1 = this;
                r0 = 64
                r1.setFlag(r0, r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintHideIcon(boolean r2) {
                r1 = this;
                r0 = 2
                r1.setFlag(r0, r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintScreenTimeout(int r1) {
                r0 = this;
                r0.mHintScreenTimeout = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintShowBackgroundOnly(boolean r2) {
                r1 = this;
                r0 = 4
                r1.setFlag(r0, r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.WearableExtender setStartScrollBottom(boolean r2) {
                r1 = this;
                r0 = 8
                r1.setFlag(r0, r2)
                return r1
        }
    }

    @java.lang.Deprecated
    public NotificationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.NotificationCompat.Action getAction(android.app.Notification r0, int r1) {
            android.app.Notification$Action[] r0 = r0.actions
            r0 = r0[r1]
            androidx.core.app.NotificationCompat$Action r0 = getActionCompatFromAction(r0)
            return r0
    }

    static androidx.core.app.NotificationCompat.Action getActionCompatFromAction(android.app.Notification.Action r18) {
            r0 = r18
            android.app.RemoteInput[] r1 = r18.getRemoteInputs()
            r2 = 29
            r3 = 0
            r4 = 0
            if (r1 != 0) goto Le
            r12 = r3
            goto L44
        Le:
            int r5 = r1.length
            androidx.core.app.RemoteInput[] r5 = new androidx.core.app.RemoteInput[r5]
            r6 = r4
        L12:
            int r7 = r1.length
            if (r6 >= r7) goto L43
            r7 = r1[r6]
            androidx.core.app.RemoteInput r16 = new androidx.core.app.RemoteInput
            java.lang.String r9 = r7.getResultKey()
            java.lang.CharSequence r10 = r7.getLabel()
            java.lang.CharSequence[] r11 = r7.getChoices()
            boolean r12 = r7.getAllowFreeFormInput()
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r2) goto L33
            int r8 = r7.getEditChoicesBeforeSending()
            r13 = r8
            goto L34
        L33:
            r13 = r4
        L34:
            android.os.Bundle r14 = r7.getExtras()
            r15 = 0
            r8 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r5[r6] = r16
            int r6 = r6 + 1
            goto L12
        L43:
            r12 = r5
        L44:
            android.os.Bundle r1 = r18.getExtras()
            java.lang.String r5 = "android.support.allowGeneratedReplies"
            boolean r1 = r1.getBoolean(r5)
            r5 = 1
            if (r1 != 0) goto L5a
            boolean r1 = r18.getAllowGeneratedReplies()
            if (r1 == 0) goto L58
            goto L5a
        L58:
            r14 = r4
            goto L5b
        L5a:
            r14 = r5
        L5b:
            android.os.Bundle r1 = r18.getExtras()
            java.lang.String r6 = "android.support.action.showsUserInterface"
            boolean r16 = r1.getBoolean(r6, r5)
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r1 < r5) goto L70
            int r1 = r18.getSemanticAction()
            goto L7a
        L70:
            android.os.Bundle r1 = r18.getExtras()
            java.lang.String r5 = "android.support.action.semanticAction"
            int r1 = r1.getInt(r5, r4)
        L7a:
            r15 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r2) goto L83
            boolean r4 = r18.isContextual()
        L83:
            r17 = r4
            android.graphics.drawable.Icon r1 = r18.getIcon()
            if (r1 != 0) goto La1
            int r1 = r0.icon
            if (r1 == 0) goto La1
            androidx.core.app.NotificationCompat$Action r1 = new androidx.core.app.NotificationCompat$Action
            int r8 = r0.icon
            java.lang.CharSequence r9 = r0.title
            android.app.PendingIntent r10 = r0.actionIntent
            android.os.Bundle r11 = r18.getExtras()
            r13 = 0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        La1:
            android.graphics.drawable.Icon r1 = r18.getIcon()
            if (r1 != 0) goto La8
            goto Lb0
        La8:
            android.graphics.drawable.Icon r1 = r18.getIcon()
            androidx.core.graphics.drawable.IconCompat r3 = androidx.core.graphics.drawable.IconCompat.createFromIconOrNullIfZeroResId(r1)
        Lb0:
            r8 = r3
            androidx.core.app.NotificationCompat$Action r1 = new androidx.core.app.NotificationCompat$Action
            java.lang.CharSequence r9 = r0.title
            android.app.PendingIntent r10 = r0.actionIntent
            android.os.Bundle r11 = r18.getExtras()
            r13 = 0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
    }

    public static int getActionCount(android.app.Notification r1) {
            android.app.Notification$Action[] r0 = r1.actions
            if (r0 == 0) goto L8
            android.app.Notification$Action[] r1 = r1.actions
            int r1 = r1.length
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public static boolean getAllowSystemGeneratedContextualActions(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r2 = r2.getAllowSystemGeneratedContextualActions()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean getAutoCancel(android.app.Notification r0) {
            int r0 = r0.flags
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static int getBadgeIconType(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            int r2 = r2.getBadgeIconType()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static androidx.core.app.NotificationCompat.BubbleMetadata getBubbleMetadata(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lf
            android.app.Notification$BubbleMetadata r2 = r2.getBubbleMetadata()
            androidx.core.app.NotificationCompat$BubbleMetadata r2 = androidx.core.app.NotificationCompat.BubbleMetadata.fromPlatform(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public static java.lang.String getCategory(android.app.Notification r0) {
            java.lang.String r0 = r0.category
            return r0
    }

    public static java.lang.String getChannelId(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            java.lang.String r2 = r2.getChannelId()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static int getColor(android.app.Notification r0) {
            int r0 = r0.color
            return r0
    }

    public static java.lang.CharSequence getContentInfo(android.app.Notification r1) {
            android.os.Bundle r1 = r1.extras
            java.lang.String r0 = "android.infoText"
            java.lang.CharSequence r1 = r1.getCharSequence(r0)
            return r1
    }

    public static java.lang.CharSequence getContentText(android.app.Notification r1) {
            android.os.Bundle r1 = r1.extras
            java.lang.String r0 = "android.text"
            java.lang.CharSequence r1 = r1.getCharSequence(r0)
            return r1
    }

    public static java.lang.CharSequence getContentTitle(android.app.Notification r1) {
            android.os.Bundle r1 = r1.extras
            java.lang.String r0 = "android.title"
            java.lang.CharSequence r1 = r1.getCharSequence(r0)
            return r1
    }

    public static android.os.Bundle getExtras(android.app.Notification r0) {
            android.os.Bundle r0 = r0.extras
            return r0
    }

    public static java.lang.String getGroup(android.app.Notification r0) {
            java.lang.String r0 = r0.getGroup()
            return r0
    }

    public static int getGroupAlertBehavior(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            int r2 = r2.getGroupAlertBehavior()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    static boolean getHighPriority(android.app.Notification r0) {
            int r0 = r0.flags
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static java.util.List<androidx.core.app.NotificationCompat.Action> getInvisibleActions(android.app.Notification r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Bundle r3 = r3.extras
            java.lang.String r1 = "android.car.EXTENSIONS"
            android.os.Bundle r3 = r3.getBundle(r1)
            if (r3 != 0) goto L10
            return r0
        L10:
            java.lang.String r1 = "invisible_actions"
            android.os.Bundle r3 = r3.getBundle(r1)
            if (r3 == 0) goto L31
            r1 = 0
        L19:
            int r2 = r3.size()
            if (r1 >= r2) goto L31
            java.lang.String r2 = java.lang.Integer.toString(r1)
            android.os.Bundle r2 = r3.getBundle(r2)
            androidx.core.app.NotificationCompat$Action r2 = androidx.core.app.NotificationCompatJellybean.getActionFromBundle(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto L19
        L31:
            return r0
    }

    public static boolean getLocalOnly(android.app.Notification r0) {
            int r0 = r0.flags
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static androidx.core.content.LocusIdCompat getLocusId(android.app.Notification r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L12
            android.content.LocusId r3 = r3.getLocusId()
            if (r3 != 0) goto Le
            goto L12
        Le:
            androidx.core.content.LocusIdCompat r2 = androidx.core.content.LocusIdCompat.toLocusIdCompat(r3)
        L12:
            return r2
    }

    static android.app.Notification[] getNotificationArrayFromBundle(android.os.Bundle r4, java.lang.String r5) {
            android.os.Parcelable[] r0 = r4.getParcelableArray(r5)
            boolean r1 = r0 instanceof android.app.Notification[]
            if (r1 != 0) goto L1f
            if (r0 != 0) goto Lb
            goto L1f
        Lb:
            int r1 = r0.length
            android.app.Notification[] r1 = new android.app.Notification[r1]
            r2 = 0
        Lf:
            int r3 = r0.length
            if (r2 >= r3) goto L1b
            r3 = r0[r2]
            android.app.Notification r3 = (android.app.Notification) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lf
        L1b:
            r4.putParcelableArray(r5, r1)
            return r1
        L1f:
            android.app.Notification[] r0 = (android.app.Notification[]) r0
            return r0
    }

    public static boolean getOngoing(android.app.Notification r0) {
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static boolean getOnlyAlertOnce(android.app.Notification r0) {
            int r0 = r0.flags
            r0 = r0 & 8
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static java.util.List<androidx.core.app.Person> getPeople(android.app.Notification r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L33
            android.os.Bundle r5 = r5.extras
            java.lang.String r1 = "android.people.list"
            java.util.ArrayList r5 = r5.getParcelableArrayList(r1)
            if (r5 == 0) goto L59
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L59
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r5.next()
            android.app.Person r1 = (android.app.Person) r1
            androidx.core.app.Person r1 = androidx.core.app.Person.fromAndroidPerson(r1)
            r0.add(r1)
            goto L1f
        L33:
            android.os.Bundle r5 = r5.extras
            java.lang.String r1 = "android.people"
            java.lang.String[] r5 = r5.getStringArray(r1)
            if (r5 == 0) goto L59
            int r1 = r5.length
            if (r1 == 0) goto L59
            int r1 = r5.length
            r2 = 0
        L42:
            if (r2 >= r1) goto L59
            r3 = r5[r2]
            androidx.core.app.Person$Builder r4 = new androidx.core.app.Person$Builder
            r4.<init>()
            androidx.core.app.Person$Builder r3 = r4.setUri(r3)
            androidx.core.app.Person r3 = r3.build()
            r0.add(r3)
            int r2 = r2 + 1
            goto L42
        L59:
            return r0
    }

    public static android.app.Notification getPublicVersion(android.app.Notification r0) {
            android.app.Notification r0 = r0.publicVersion
            return r0
    }

    public static java.lang.CharSequence getSettingsText(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            java.lang.CharSequence r2 = r2.getSettingsText()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static java.lang.String getShortcutId(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            java.lang.String r2 = r2.getShortcutId()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean getShowWhen(android.app.Notification r1) {
            android.os.Bundle r1 = r1.extras
            java.lang.String r0 = "android.showWhen"
            boolean r1 = r1.getBoolean(r0)
            return r1
    }

    public static java.lang.String getSortKey(android.app.Notification r0) {
            java.lang.String r0 = r0.getSortKey()
            return r0
    }

    public static java.lang.CharSequence getSubText(android.app.Notification r1) {
            android.os.Bundle r1 = r1.extras
            java.lang.String r0 = "android.subText"
            java.lang.CharSequence r1 = r1.getCharSequence(r0)
            return r1
    }

    public static long getTimeoutAfter(android.app.Notification r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            long r0 = r2.getTimeoutAfter()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean getUsesChronometer(android.app.Notification r1) {
            android.os.Bundle r1 = r1.extras
            java.lang.String r0 = "android.showChronometer"
            boolean r1 = r1.getBoolean(r0)
            return r1
    }

    public static int getVisibility(android.app.Notification r0) {
            int r0 = r0.visibility
            return r0
    }

    public static boolean isGroupSummary(android.app.Notification r0) {
            int r0 = r0.flags
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
