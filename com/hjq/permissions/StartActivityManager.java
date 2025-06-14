package com.hjq.permissions;

/* loaded from: classes.dex */
final class StartActivityManager {
    private static final java.lang.String SUB_INTENT_KEY = "sub_intent_key";

    /* renamed from: com.hjq.permissions.StartActivityManager$1 */
    static /* synthetic */ class C08641 {
    }

    private interface IStartActivityDelegate {
        void startActivity(android.content.Intent r1);

        void startActivityForResult(android.content.Intent r1, int r2);
    }

    private static class StartActivityDelegateActivityImpl implements com.hjq.permissions.StartActivityManager.IStartActivityDelegate {
        private final android.app.Activity mActivity;

        private StartActivityDelegateActivityImpl(android.app.Activity r1) {
                r0 = this;
                r0.<init>()
                r0.mActivity = r1
                return
        }

        /* synthetic */ StartActivityDelegateActivityImpl(android.app.Activity r1, com.hjq.permissions.StartActivityManager.C08641 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivity(android.content.Intent r2) {
                r1 = this;
                android.app.Activity r0 = r1.mActivity
                r0.startActivity(r2)
                return
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivityForResult(android.content.Intent r2, int r3) {
                r1 = this;
                android.app.Activity r0 = r1.mActivity
                r0.startActivityForResult(r2, r3)
                return
        }
    }

    private static class StartActivityDelegateContextImpl implements com.hjq.permissions.StartActivityManager.IStartActivityDelegate {
        private final android.content.Context mContext;

        private StartActivityDelegateContextImpl(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.mContext = r1
                return
        }

        /* synthetic */ StartActivityDelegateContextImpl(android.content.Context r1, com.hjq.permissions.StartActivityManager.C08641 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivity(android.content.Intent r2) {
                r1 = this;
                android.content.Context r0 = r1.mContext
                r0.startActivity(r2)
                return
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivityForResult(android.content.Intent r2, int r3) {
                r1 = this;
                android.content.Context r0 = r1.mContext
                android.app.Activity r0 = com.hjq.permissions.PermissionUtils.findActivity(r0)
                if (r0 == 0) goto Lc
                r0.startActivityForResult(r2, r3)
                return
            Lc:
                r1.startActivity(r2)
                return
        }
    }

    private static class StartActivityDelegateFragmentImpl implements com.hjq.permissions.StartActivityManager.IStartActivityDelegate {
        private final android.app.Fragment mFragment;

        private StartActivityDelegateFragmentImpl(android.app.Fragment r1) {
                r0 = this;
                r0.<init>()
                r0.mFragment = r1
                return
        }

        /* synthetic */ StartActivityDelegateFragmentImpl(android.app.Fragment r1, com.hjq.permissions.StartActivityManager.C08641 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivity(android.content.Intent r2) {
                r1 = this;
                android.app.Fragment r0 = r1.mFragment
                r0.startActivity(r2)
                return
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivityForResult(android.content.Intent r2, int r3) {
                r1 = this;
                android.app.Fragment r0 = r1.mFragment
                r0.startActivityForResult(r2, r3)
                return
        }
    }

    private static class StartActivityDelegateSupportFragmentImpl implements com.hjq.permissions.StartActivityManager.IStartActivityDelegate {
        private final androidx.fragment.app.Fragment mFragment;

        private StartActivityDelegateSupportFragmentImpl(androidx.fragment.app.Fragment r1) {
                r0 = this;
                r0.<init>()
                r0.mFragment = r1
                return
        }

        /* synthetic */ StartActivityDelegateSupportFragmentImpl(androidx.fragment.app.Fragment r1, com.hjq.permissions.StartActivityManager.C08641 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivity(android.content.Intent r2) {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.mFragment
                r0.startActivity(r2)
                return
        }

        @Override // com.hjq.permissions.StartActivityManager.IStartActivityDelegate
        public void startActivityForResult(android.content.Intent r2, int r3) {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.mFragment
                r0.startActivityForResult(r2, r3)
                return
        }
    }

    StartActivityManager() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.content.Intent addSubIntentToMainIntent(android.content.Intent r2, android.content.Intent r3) {
            if (r2 != 0) goto L5
            if (r3 == 0) goto L5
            return r3
        L5:
            if (r3 != 0) goto L8
            return r2
        L8:
            android.content.Intent r0 = getDeepSubIntent(r2)
            java.lang.String r1 = "sub_intent_key"
            r0.putExtra(r1, r3)
            return r2
    }

    static android.content.Intent getDeepSubIntent(android.content.Intent r1) {
            android.content.Intent r0 = getSubIntentInMainIntent(r1)
            if (r0 == 0) goto La
            android.content.Intent r1 = getDeepSubIntent(r0)
        La:
            return r1
    }

    static android.content.Intent getSubIntentInMainIntent(android.content.Intent r2) {
            boolean r0 = com.hjq.permissions.AndroidVersion.isAndroid13()
            java.lang.String r1 = "sub_intent_key"
            if (r0 == 0) goto L11
            java.lang.Class<android.content.Intent> r0 = android.content.Intent.class
            java.lang.Object r2 = r2.getParcelableExtra(r1, r0)
            android.content.Intent r2 = (android.content.Intent) r2
            goto L17
        L11:
            android.os.Parcelable r2 = r2.getParcelableExtra(r1)
            android.content.Intent r2 = (android.content.Intent) r2
        L17:
            return r2
    }

    static boolean startActivity(android.app.Activity r2, android.content.Intent r3) {
            com.hjq.permissions.StartActivityManager$StartActivityDelegateActivityImpl r0 = new com.hjq.permissions.StartActivityManager$StartActivityDelegateActivityImpl
            r1 = 0
            r0.<init>(r2, r1)
            boolean r2 = startActivity(r0, r3)
            return r2
    }

    static boolean startActivity(android.app.Fragment r2, android.content.Intent r3) {
            com.hjq.permissions.StartActivityManager$StartActivityDelegateFragmentImpl r0 = new com.hjq.permissions.StartActivityManager$StartActivityDelegateFragmentImpl
            r1 = 0
            r0.<init>(r2, r1)
            boolean r2 = startActivity(r0, r3)
            return r2
    }

    static boolean startActivity(android.content.Context r2, android.content.Intent r3) {
            com.hjq.permissions.StartActivityManager$StartActivityDelegateContextImpl r0 = new com.hjq.permissions.StartActivityManager$StartActivityDelegateContextImpl
            r1 = 0
            r0.<init>(r2, r1)
            boolean r2 = startActivity(r0, r3)
            return r2
    }

    static boolean startActivity(androidx.fragment.app.Fragment r2, android.content.Intent r3) {
            com.hjq.permissions.StartActivityManager$StartActivityDelegateSupportFragmentImpl r0 = new com.hjq.permissions.StartActivityManager$StartActivityDelegateSupportFragmentImpl
            r1 = 0
            r0.<init>(r2, r1)
            boolean r2 = startActivity(r0, r3)
            return r2
    }

    static boolean startActivity(com.hjq.permissions.StartActivityManager.IStartActivityDelegate r1, android.content.Intent r2) {
            r1.startActivity(r2)     // Catch: java.lang.Exception -> L5
            r1 = 1
            return r1
        L5:
            r0 = move-exception
            r0.printStackTrace()
            android.content.Intent r2 = getSubIntentInMainIntent(r2)
            if (r2 != 0) goto L11
            r1 = 0
            return r1
        L11:
            boolean r1 = startActivity(r1, r2)
            return r1
    }

    static boolean startActivityForResult(android.app.Activity r2, android.content.Intent r3, int r4) {
            com.hjq.permissions.StartActivityManager$StartActivityDelegateActivityImpl r0 = new com.hjq.permissions.StartActivityManager$StartActivityDelegateActivityImpl
            r1 = 0
            r0.<init>(r2, r1)
            boolean r2 = startActivityForResult(r0, r3, r4)
            return r2
    }

    static boolean startActivityForResult(android.app.Fragment r2, android.content.Intent r3, int r4) {
            com.hjq.permissions.StartActivityManager$StartActivityDelegateFragmentImpl r0 = new com.hjq.permissions.StartActivityManager$StartActivityDelegateFragmentImpl
            r1 = 0
            r0.<init>(r2, r1)
            boolean r2 = startActivityForResult(r0, r3, r4)
            return r2
    }

    static boolean startActivityForResult(androidx.fragment.app.Fragment r2, android.content.Intent r3, int r4) {
            com.hjq.permissions.StartActivityManager$StartActivityDelegateSupportFragmentImpl r0 = new com.hjq.permissions.StartActivityManager$StartActivityDelegateSupportFragmentImpl
            r1 = 0
            r0.<init>(r2, r1)
            boolean r2 = startActivityForResult(r0, r3, r4)
            return r2
    }

    static boolean startActivityForResult(com.hjq.permissions.StartActivityManager.IStartActivityDelegate r1, android.content.Intent r2, int r3) {
            r1.startActivityForResult(r2, r3)     // Catch: java.lang.Exception -> L5
            r1 = 1
            return r1
        L5:
            r0 = move-exception
            r0.printStackTrace()
            android.content.Intent r2 = getSubIntentInMainIntent(r2)
            if (r2 != 0) goto L11
            r1 = 0
            return r1
        L11:
            boolean r1 = startActivityForResult(r1, r2, r3)
            return r1
    }
}
