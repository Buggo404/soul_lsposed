package com.usidqw.qwerklj.Dialog;

/* loaded from: classes.dex */
public final class PlusDialog {
    private static android.app.Dialog staticDialog;
    private int InputType;
    private int WaitBackgroundType;
    private final android.app.Activity activity;
    private android.widget.BaseAdapter adapter;
    private java.lang.Object bind;
    private java.lang.String buttonCancelTitle;
    private java.lang.String buttonSuccessTitle;
    private boolean cancelable;
    private boolean canceledOnTouchOutside;
    private java.lang.String desc;
    private int descGravity;
    private android.app.Dialog dialog;
    private java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> dialogListEdit;
    private com.usidqw.qwerklj.Adapter.DialogListEditAdapter dialogListEditAdapter;
    private com.usidqw.qwerklj.Adapter.DialogListEditInputAdapter dialogListEditInputAdapter;
    private final java.util.List<com.usidqw.qwerklj.Json.DialogListItem> dialogListItem;
    private com.usidqw.qwerklj.Adapter.DialogListItemAdapter dialogListItemAdapter;
    private com.usidqw.qwerklj.Adapter.DialogSelectFileAdapter dialogSelectFileAdapter;
    private java.lang.String[] fileTypes;
    private java.io.File[] files;
    private int gravity;
    private java.lang.String hint;
    private java.lang.String hintValue;
    private android.view.LayoutInflater inflater;
    private com.usidqw.qwerklj.Dialog.PlusDialog.InputClick inputClickCall;
    private com.usidqw.qwerklj.Dialog.PlusDialog.InputClickKeyValue inputClickKeyValueCall;
    private boolean isDismiss;
    private boolean isSetInputSelectImg;
    private java.lang.String key;
    private final java.util.Map<java.lang.String, java.lang.Integer> lastPosition;
    private com.usidqw.qwerklj.Dialog.PlusDialog.ListOnClick listOnClickCall;
    private final java.lang.String mainPath;
    private com.usidqw.qwerklj.Dialog.PlusDialog.Message messageCall;
    private com.usidqw.qwerklj.Dialog.PlusDialog.OnCancel onCancelCall;
    private android.view.WindowManager.LayoutParams params;
    private com.usidqw.qwerklj.databinding.PlusDialogMessageBinding plusDialogMessageBinding;
    private com.usidqw.qwerklj.Dialog.PlusDialog.SelectFile selectFileCall;
    private boolean showCancelButton;
    private boolean showOpenButton;
    private boolean showSuccessButton;
    private java.lang.String startDirPath;
    private java.lang.String title;
    private com.usidqw.qwerklj.Json.JsonHookSettingList.DataBean touchItemList;
    private java.lang.String touchValue;
    private java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> touch_list;
    private com.usidqw.qwerklj.Dialog.DialogType type;
    private java.lang.String value;
    private android.view.View view;
    private int viewHeight;
    private int viewWidth;
    private android.view.Window window;

    /* renamed from: com.usidqw.qwerklj.Dialog.PlusDialog$1 */
    class C08971 implements com.hjq.permissions.OnPermissionCallback {
        final /* synthetic */ com.usidqw.qwerklj.Dialog.PlusDialog this$0;

        C08971(com.usidqw.qwerklj.Dialog.PlusDialog r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* renamed from: lambda$onDenied$0$com-usidqw-qwerklj-Dialog-PlusDialog$1, reason: not valid java name */
        /* synthetic */ void m171lambda$onDenied$0$comusidqwqwerkljDialogPlusDialog$1(java.util.List r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto Lc
                com.usidqw.qwerklj.Dialog.PlusDialog r2 = r0.this$0
                android.app.Activity r2 = com.usidqw.qwerklj.Dialog.PlusDialog.access$200(r2)
                com.hjq.permissions.XXPermissions.startPermissionActivity(r2, r1)
                goto L28
            Lc:
                com.usidqw.qwerklj.Dialog.PlusDialog r1 = new com.usidqw.qwerklj.Dialog.PlusDialog
                com.usidqw.qwerklj.Dialog.PlusDialog r2 = r0.this$0
                android.app.Activity r2 = com.usidqw.qwerklj.Dialog.PlusDialog.access$200(r2)
                r1.<init>(r2)
                com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.MESSAGE
                r1.setType(r2)
                r2 = 0
                r1.setShowCancelButton(r2)
                java.lang.String r2 = "您已拒绝获取存储权限"
                r1.setDesc(r2)
                r1.show()
            L28:
                com.usidqw.qwerklj.Dialog.PlusDialog r1 = r0.this$0
                android.app.Dialog r1 = com.usidqw.qwerklj.Dialog.PlusDialog.access$000(r1)
                r1.dismiss()
                return
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> r2, boolean r3) {
                r1 = this;
                if (r3 == 0) goto L23
                com.usidqw.qwerklj.Dialog.PlusDialog r3 = new com.usidqw.qwerklj.Dialog.PlusDialog
                com.usidqw.qwerklj.Dialog.PlusDialog r0 = r1.this$0
                android.app.Activity r0 = com.usidqw.qwerklj.Dialog.PlusDialog.access$200(r0)
                r3.<init>(r0)
                com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.MESSAGE
                r3.setType(r0)
                java.lang.String r0 = "您已拒绝该权限，是否打开应用设置-允许应用读取和写入权限"
                r3.setDesc(r0)
                com.usidqw.qwerklj.Dialog.PlusDialog$1$$ExternalSyntheticLambda0 r0 = new com.usidqw.qwerklj.Dialog.PlusDialog$1$$ExternalSyntheticLambda0
                r0.<init>(r1, r2)
                r3.setOnClickMessage(r0)
                r3.show()
                goto L3f
            L23:
                com.usidqw.qwerklj.Dialog.PlusDialog r2 = new com.usidqw.qwerklj.Dialog.PlusDialog
                com.usidqw.qwerklj.Dialog.PlusDialog r3 = r1.this$0
                android.app.Activity r3 = com.usidqw.qwerklj.Dialog.PlusDialog.access$200(r3)
                r2.<init>(r3)
                com.usidqw.qwerklj.Dialog.DialogType r3 = com.usidqw.qwerklj.Dialog.DialogType.MESSAGE
                r2.setType(r3)
                r3 = 0
                r2.setShowCancelButton(r3)
                java.lang.String r3 = "获取存储权限失败"
                r2.setDesc(r3)
                r2.show()
            L3f:
                return
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> r1, boolean r2) {
                r0 = this;
                if (r2 != 0) goto Lc
                com.usidqw.qwerklj.Dialog.PlusDialog r1 = r0.this$0
                android.app.Dialog r1 = com.usidqw.qwerklj.Dialog.PlusDialog.access$000(r1)
                r1.dismiss()
                return
            Lc:
                com.usidqw.qwerklj.Dialog.PlusDialog r1 = r0.this$0
                com.usidqw.qwerklj.Dialog.PlusDialog.access$100(r1)
                return
        }
    }



    public interface InputClick {
        void success(java.lang.String r1);
    }

    public interface InputClickKeyValue {
        void success(java.lang.String r1, java.lang.String r2);
    }

    public interface ListOnClick {
        void onClick(com.usidqw.qwerklj.Json.DialogListItem r1, int r2);
    }

    public interface Message {
        void onClick(boolean r1);
    }

    public interface OnCancel {
        void cancel();

        void success();
    }

    public interface SelectFile {
        void success(java.io.File r1);
    }

    public PlusDialog() {
            r2 = this;
            r2.<init>()
            com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.WAIT
            r2.type = r0
            r0 = -1
            r2.gravity = r0
            r0 = 0
            r2.files = r0
            r0 = 0
            r2.WaitBackgroundType = r0
            r0 = 1
            r2.InputType = r0
            r1 = 17
            r2.descGravity = r1
            r1 = -100
            r2.viewHeight = r1
            r2.viewWidth = r1
            r2.showSuccessButton = r0
            r2.showOpenButton = r0
            r2.showCancelButton = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.dialogListItem = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.dialogListEdit = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.lastPosition = r0
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = r0.getPath()
            r2.mainPath = r0
            r2.startDirPath = r0
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
            android.app.Activity r0 = r0.getActivity()
            r2.activity = r0
            return
    }

    public PlusDialog(android.app.Activity r3) {
            r2 = this;
            r2.<init>()
            com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.WAIT
            r2.type = r0
            r0 = -1
            r2.gravity = r0
            r0 = 0
            r2.files = r0
            r0 = 0
            r2.WaitBackgroundType = r0
            r0 = 1
            r2.InputType = r0
            r1 = 17
            r2.descGravity = r1
            r1 = -100
            r2.viewHeight = r1
            r2.viewWidth = r1
            r2.showSuccessButton = r0
            r2.showOpenButton = r0
            r2.showCancelButton = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.dialogListItem = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.dialogListEdit = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.lastPosition = r0
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
            r0.getClassLoader()
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = r0.getPath()
            r2.mainPath = r0
            r2.startDirPath = r0
            r2.activity = r3
            return
    }

    private void Dialog_Input() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.inflater
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = com.usidqw.qwerklj.databinding.PlusDialogInputBinding.inflate(r0)
            r3.bind = r0
            android.view.Window r1 = r3.window
            r2 = r0
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r2 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r2
            android.widget.LinearLayout r0 = r0.getRoot()
            r1.setContentView(r0)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            r1 = 1
            r0.setFocusable(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            r0.setFocusableInTouchMode(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            r0.requestFocus()
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            r2 = 6
            r0.setImeOptions(r2)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda3 r2 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda3
            r2.<init>(r3)
            r0.setOnEditorActionListener(r2)
            android.view.Window r0 = r3.window
            r2 = 5
            r0.setSoftInputMode(r2)
            java.lang.String r0 = r3.buttonCancelTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L61
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            java.lang.String r2 = r3.buttonCancelTitle
            r0.setText(r2)
        L61:
            java.lang.String r0 = r3.buttonSuccessTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L74
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            java.lang.String r2 = r3.buttonSuccessTitle
            r0.setText(r2)
        L74:
            java.lang.String r0 = r3.value
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L87
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            java.lang.String r2 = r3.value
            r0.setText(r2)
        L87:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            int r2 = r3.InputType
            if (r2 != 0) goto L92
            goto L93
        L92:
            r1 = r2
        L93:
            r0.setInputType(r1)
            java.lang.String r0 = r3.title
            if (r0 == 0) goto Lad
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La1
            goto Lad
        La1:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            java.lang.String r1 = r3.title
            r0.setText(r1)
            goto Lb8
        Lad:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            r1 = 8
            r0.setVisibility(r1)
        Lb8:
            java.lang.String r0 = r3.hint
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lcb
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            java.lang.String r1 = r3.hint
            r0.setHint(r1)
        Lcb:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda4 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda4
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda5 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda5
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            return
    }

    private void Dialog_InputMulti() {
            r4 = this;
            android.view.LayoutInflater r0 = r4.inflater
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding.inflate(r0)
            r4.bind = r0
            r1 = r0
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r1 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r1
            android.widget.EditText r0 = r0.dialogInput
            r1 = 1
            r0.setFocusable(r1)
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            r0.setFocusableInTouchMode(r1)
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            r0.requestFocus()
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.TextView r0 = r0.dialogAdd
            r1 = 8
            r0.setVisibility(r1)
            boolean r0 = r4.isSetInputSelectImg
            r2 = 0
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.TextView r0 = r0.dialogAdd
            r0.setVisibility(r2)
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.TextView r0 = r0.dialogAdd
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda18 r3 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda18
            r3.<init>(r4)
            r0.setOnClickListener(r3)
        L4a:
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.TextView r0 = r0.dialogAddUrl
            r0.setVisibility(r1)
            boolean r0 = r4.isSetInputSelectImg
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.TextView r0 = r0.dialogAddUrl
            r0.setVisibility(r2)
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.TextView r0 = r0.dialogAddUrl
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda19 r2 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda19
            r2.<init>(r4)
            r0.setOnClickListener(r2)
        L6e:
            android.view.Window r0 = r4.window
            r2 = 5
            r0.setSoftInputMode(r2)
            android.view.Window r0 = r4.window
            java.lang.Object r2 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r2 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r2
            android.widget.LinearLayout r2 = r2.getRoot()
            r0.setContentView(r2)
            java.lang.String r0 = r4.value
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L94
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            java.lang.String r2 = r4.value
            r0.setText(r2)
        L94:
            java.lang.String r0 = r4.buttonCancelTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La7
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            java.lang.String r2 = r4.buttonCancelTitle
            r0.setText(r2)
        La7:
            java.lang.String r0 = r4.buttonSuccessTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lba
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            java.lang.String r2 = r4.buttonSuccessTitle
            r0.setText(r2)
        Lba:
            java.lang.String r0 = r4.value
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lcd
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            java.lang.String r2 = r4.value
            r0.setText(r2)
        Lcd:
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.setMaxLines(r2)
            java.lang.String r0 = r4.title
            if (r0 == 0) goto Lf0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le4
            goto Lf0
        Le4:
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            java.lang.String r1 = r4.title
            r0.setText(r1)
            goto Lf9
        Lf0:
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            r0.setVisibility(r1)
        Lf9:
            java.lang.String r0 = r4.hint
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L10c
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            java.lang.String r1 = r4.hint
            r0.setHint(r1)
        L10c:
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda20 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda20
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda21 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda21
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            return
    }

    private void Dialog_custom() {
            r4 = this;
            android.widget.BaseAdapter r0 = r4.adapter
            if (r0 != 0) goto L19
            android.app.Dialog r0 = r4.dialog
            r0.dismiss()
            android.app.Activity r0 = r4.activity
            com.usidqw.qwerklj.Utils.ToastPlus r0 = com.usidqw.qwerklj.Utils.ToastPlus.init(r0)
            com.usidqw.qwerklj.Utils.ToastPlus r0 = r0.error()
            java.lang.String r1 = "没有设置适配器"
            r0.show(r1)
            return
        L19:
            android.view.LayoutInflater r0 = r4.inflater
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = com.usidqw.qwerklj.databinding.PlusDialogListBinding.inflate(r0)
            r4.bind = r0
            android.view.Window r1 = r4.window
            r2 = r0
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r2 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r2
            android.widget.LinearLayout r0 = r0.getRoot()
            r1.setContentView(r0)
            java.lang.String r0 = r4.title
            if (r0 == 0) goto L42
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L42
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            java.lang.String r1 = r4.title
            r0.setText(r1)
        L42:
            java.lang.String r0 = r4.buttonCancelTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L55
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            java.lang.String r1 = r4.buttonCancelTitle
            r0.setText(r1)
        L55:
            java.lang.String r0 = r4.buttonSuccessTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L69
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            java.lang.String r1 = r4.buttonSuccessTitle
            r0.setText(r1)
            goto L74
        L69:
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            java.lang.String r1 = "保存"
            r0.setText(r1)
        L74:
            java.lang.String r0 = r4.desc
            r1 = 8
            if (r0 == 0) goto L8c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8c
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogDesc
            java.lang.String r2 = r4.desc
            r0.setText(r2)
            goto L95
        L8c:
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogDesc
            r0.setVisibility(r1)
        L95:
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.ListView r0 = r0.listView
            android.widget.BaseAdapter r2 = r4.adapter
            r0.setAdapter(r2)
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            boolean r2 = r4.showCancelButton
            r3 = 0
            if (r2 == 0) goto Lad
            r2 = r3
            goto Lae
        Lad:
            r2 = r1
        Lae:
            r0.setVisibility(r2)
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            boolean r2 = r4.showSuccessButton
            if (r2 == 0) goto Lbc
            goto Lbd
        Lbc:
            r3 = r1
        Lbd:
            r0.setVisibility(r3)
            boolean r0 = r4.showCancelButton
            if (r0 == 0) goto Lc8
            boolean r0 = r4.showSuccessButton
            if (r0 != 0) goto Ld1
        Lc8:
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.view.View r0 = r0.viewHide
            r0.setVisibility(r1)
        Ld1:
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda9 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda9
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r4.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda10 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda10
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            return
    }

    private void Dialog_defaultValue() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.inflater
            com.usidqw.qwerklj.databinding.PlusDialogWaitBinding r0 = com.usidqw.qwerklj.databinding.PlusDialogWaitBinding.inflate(r0)
            r3.bind = r0
            android.view.Window r1 = r3.window
            r2 = r0
            com.usidqw.qwerklj.databinding.PlusDialogWaitBinding r2 = (com.usidqw.qwerklj.databinding.PlusDialogWaitBinding) r2
            android.widget.LinearLayout r0 = r0.getRoot()
            r1.setContentView(r0)
            r0 = 17
            r3.gravity = r0
            android.app.Activity r0 = r3.activity
            r1 = -2046754785(0xffffffff8601001f, float:-2.4262292E-35)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r0, r1)
            java.lang.Object r1 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogWaitBinding r1 = (com.usidqw.qwerklj.databinding.PlusDialogWaitBinding) r1
            android.widget.ImageView r1 = r1.ivLoading
            r1.startAnimation(r0)
            int r0 = r3.WaitBackgroundType
            r1 = 1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogWaitBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogWaitBinding) r0
            android.widget.LinearLayout r0 = r0.background
            android.app.Activity r1 = r3.activity
            r2 = -2046295844(0xffffffff860800dc, float:-2.5579388E-35)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setBackground(r1)
            goto L6a
        L45:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogWaitBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogWaitBinding) r0
            android.widget.LinearLayout r0 = r0.background
            android.app.Activity r1 = r3.activity
            r2 = -2046295878(0xffffffff860800ba, float:-2.557929E-35)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setBackground(r1)
            goto L6a
        L58:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogWaitBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogWaitBinding) r0
            android.widget.LinearLayout r0 = r0.background
            android.app.Activity r1 = r3.activity
            r2 = -2046295877(0xffffffff860800bb, float:-2.5579294E-35)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setBackground(r1)
        L6a:
            java.lang.String r0 = r3.title
            if (r0 == 0) goto L8b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L75
            goto L8b
        L75:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogWaitBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogWaitBinding) r0
            android.widget.TextView r0 = r0.loadingText
            r1 = 0
            r0.setVisibility(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogWaitBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogWaitBinding) r0
            android.widget.TextView r0 = r0.loadingText
            java.lang.String r1 = r3.title
            r0.setText(r1)
            goto L96
        L8b:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogWaitBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogWaitBinding) r0
            android.widget.TextView r0 = r0.loadingText
            r1 = 8
            r0.setVisibility(r1)
        L96:
            return
    }

    private void Dialog_inputKeyOrValue() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.inflater
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r0 = com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding.inflate(r0)
            r3.bind = r0
            android.view.Window r1 = r3.window
            r2 = r0
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r2 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r2
            android.widget.LinearLayout r0 = r0.getRoot()
            r1.setContentView(r0)
            java.lang.String r0 = r3.buttonCancelTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L27
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            java.lang.String r1 = r3.buttonCancelTitle
            r0.setText(r1)
        L27:
            java.lang.String r0 = r3.buttonSuccessTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3a
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            java.lang.String r1 = r3.buttonSuccessTitle
            r0.setText(r1)
        L3a:
            java.lang.String r0 = r3.value
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4d
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r0
            android.widget.EditText r0 = r0.dialogValue
            java.lang.String r1 = r3.value
            r0.setText(r1)
        L4d:
            java.lang.String r0 = r3.key
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L60
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r0
            android.widget.EditText r0 = r0.dialogKey
            java.lang.String r1 = r3.key
            r0.setText(r1)
        L60:
            java.lang.String r0 = r3.title
            if (r0 == 0) goto L77
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L6b
            goto L77
        L6b:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            java.lang.String r1 = r3.title
            r0.setText(r1)
            goto L82
        L77:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            r1 = 8
            r0.setVisibility(r1)
        L82:
            java.lang.String r0 = r3.hint
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L95
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r0
            android.widget.EditText r0 = r0.dialogKey
            java.lang.String r1 = r3.hint
            r0.setHint(r1)
        L95:
            java.lang.String r0 = r3.hintValue
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La8
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r0
            android.widget.EditText r0 = r0.dialogValue
            java.lang.String r1 = r3.hintValue
            r0.setHint(r1)
        La8:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda39 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda39
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda1 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda1
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            return
    }

    private void Dialog_listEdit() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.inflater
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = com.usidqw.qwerklj.databinding.PlusDialogListEditBinding.inflate(r0)
            r3.bind = r0
            android.view.Window r1 = r3.window
            r2 = r0
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r2 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r2
            android.widget.LinearLayout r0 = r0.getRoot()
            r1.setContentView(r0)
            java.lang.String r0 = r3.title
            if (r0 == 0) goto L29
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            java.lang.String r1 = r3.title
            r0.setText(r1)
        L29:
            java.lang.String r0 = r3.buttonCancelTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3c
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            java.lang.String r1 = r3.buttonCancelTitle
            r0.setText(r1)
        L3c:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            java.lang.String r1 = "保存"
            r0.setText(r1)
            com.usidqw.qwerklj.Adapter.DialogListEditAdapter r0 = new com.usidqw.qwerklj.Adapter.DialogListEditAdapter
            android.app.Activity r1 = r3.activity
            java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r2 = r3.dialogListEdit
            r0.<init>(r1, r2)
            r3.dialogListEditAdapter = r0
            java.lang.String r0 = r3.desc
            if (r0 == 0) goto L68
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L68
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogDesc
            java.lang.String r1 = r3.desc
            r0.setText(r1)
            goto L73
        L68:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogDesc
            r1 = 8
            r0.setVisibility(r1)
        L73:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.ListView r0 = r0.listView
            com.usidqw.qwerklj.Adapter.DialogListEditAdapter r1 = r3.dialogListEditAdapter
            r0.setAdapter(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.ImageView r0 = r0.addItem
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda25 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda25
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.ListView r0 = r0.listView
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda26 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda26
            r1.<init>(r3)
            r0.setOnItemClickListener(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda27 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda27
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda28 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda28
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            return
    }

    private void Dialog_listEditKey() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.inflater
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = com.usidqw.qwerklj.databinding.PlusDialogListEditBinding.inflate(r0)
            r3.bind = r0
            android.view.Window r1 = r3.window
            r2 = r0
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r2 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r2
            android.widget.LinearLayout r0 = r0.getRoot()
            r1.setContentView(r0)
            java.lang.String r0 = r3.title
            if (r0 == 0) goto L29
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            java.lang.String r1 = r3.title
            r0.setText(r1)
        L29:
            java.lang.String r0 = r3.buttonCancelTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3c
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            java.lang.String r1 = r3.buttonCancelTitle
            r0.setText(r1)
        L3c:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            java.lang.String r1 = "保存"
            r0.setText(r1)
            com.usidqw.qwerklj.Adapter.DialogListEditInputAdapter r0 = new com.usidqw.qwerklj.Adapter.DialogListEditInputAdapter
            android.app.Activity r1 = r3.activity
            java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r2 = r3.dialogListEdit
            r0.<init>(r1, r2)
            r3.dialogListEditInputAdapter = r0
            java.lang.String r0 = r3.desc
            if (r0 == 0) goto L68
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L68
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogDesc
            java.lang.String r1 = r3.desc
            r0.setText(r1)
            goto L73
        L68:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogDesc
            r1 = 8
            r0.setVisibility(r1)
        L73:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.ListView r0 = r0.listView
            com.usidqw.qwerklj.Adapter.DialogListEditInputAdapter r1 = r3.dialogListEditInputAdapter
            r0.setAdapter(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.ImageView r0 = r0.addItem
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda35 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda35
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.ListView r0 = r0.listView
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda36 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda36
            r1.<init>(r3)
            r0.setOnItemClickListener(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda37 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda37
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogListEditBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListEditBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda38 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda38
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            return
    }

    private void Dialog_listItem() {
            r5 = this;
            android.view.LayoutInflater r0 = r5.inflater
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = com.usidqw.qwerklj.databinding.PlusDialogListBinding.inflate(r0)
            r5.bind = r0
            android.view.Window r1 = r5.window
            r2 = r0
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r2 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r2
            android.widget.LinearLayout r0 = r0.getRoot()
            r1.setContentView(r0)
            java.lang.String r0 = r5.title
            r1 = 8
            if (r0 == 0) goto L2d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L21
            goto L2d
        L21:
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            java.lang.String r2 = r5.title
            r0.setText(r2)
            goto L36
        L2d:
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            r0.setVisibility(r1)
        L36:
            java.lang.String r0 = r5.desc
            if (r0 == 0) goto L4d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L41
            goto L4d
        L41:
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogDesc
            java.lang.String r2 = r5.desc
            r0.setText(r2)
            goto L56
        L4d:
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogDesc
            r0.setVisibility(r1)
        L56:
            java.lang.String r0 = r5.buttonCancelTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L69
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            java.lang.String r2 = r5.buttonCancelTitle
            r0.setText(r2)
        L69:
            java.lang.String r0 = r5.buttonSuccessTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7c
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            java.lang.String r2 = r5.buttonSuccessTitle
            r0.setText(r2)
        L7c:
            boolean r0 = r5.showSuccessButton
            if (r0 != 0) goto L92
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            r0.setVisibility(r1)
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.view.View r0 = r0.viewHide
            r0.setVisibility(r1)
        L92:
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda31 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda31
            r1.<init>(r5)
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda32 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda32
            r1.<init>(r5)
            r0.setOnClickListener(r1)
            com.usidqw.qwerklj.Adapter.DialogListItemAdapter r0 = new com.usidqw.qwerklj.Adapter.DialogListItemAdapter
            android.app.Activity r1 = r5.activity
            java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r2 = r5.dialogListItem
            com.usidqw.qwerklj.Dialog.PlusDialog$ListOnClick r3 = r5.listOnClickCall
            boolean r4 = r5.showOpenButton
            r0.<init>(r1, r2, r3, r4)
            r5.dialogListItemAdapter = r0
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogListBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogListBinding) r0
            android.widget.ListView r0 = r0.listView
            com.usidqw.qwerklj.Adapter.DialogListItemAdapter r1 = r5.dialogListItemAdapter
            r0.setAdapter(r1)
            return
    }

    private void Dialog_message() {
            r4 = this;
            android.view.LayoutInflater r0 = r4.inflater
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = com.usidqw.qwerklj.databinding.PlusDialogMessageBinding.inflate(r0)
            r4.plusDialogMessageBinding = r0
            android.view.Window r1 = r4.window
            android.widget.LinearLayout r0 = r0.getRoot()
            r1.setContentView(r0)
            java.lang.String r0 = r4.title
            r1 = 8
            if (r0 == 0) goto L2c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1e
            goto L2c
        L1e:
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.widget.TextView r0 = r0.dialogTitle
            java.lang.String r2 = r4.title
            android.text.Spanned r2 = com.usidqw.qwerklj.Utils.Tools.toHtml(r2)
            r0.setText(r2)
            goto L33
        L2c:
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.widget.TextView r0 = r0.dialogTitle
            r0.setVisibility(r1)
        L33:
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.widget.TextView r0 = r0.dialogCancel
            boolean r2 = r4.showCancelButton
            r3 = 0
            if (r2 == 0) goto L3e
            r2 = r3
            goto L3f
        L3e:
            r2 = r1
        L3f:
            r0.setVisibility(r2)
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.widget.TextView r0 = r0.dialogSuccess
            boolean r2 = r4.showSuccessButton
            if (r2 == 0) goto L4b
            goto L4c
        L4b:
            r3 = r1
        L4c:
            r0.setVisibility(r3)
            boolean r0 = r4.showCancelButton
            if (r0 == 0) goto L57
            boolean r0 = r4.showSuccessButton
            if (r0 != 0) goto L5e
        L57:
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.view.View r0 = r0.viewHide
            r0.setVisibility(r1)
        L5e:
            java.lang.String r0 = r4.buttonCancelTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6f
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.widget.TextView r0 = r0.dialogCancel
            java.lang.String r1 = r4.buttonCancelTitle
            r0.setText(r1)
        L6f:
            java.lang.String r0 = r4.buttonSuccessTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L80
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.widget.TextView r0 = r0.dialogSuccess
            java.lang.String r1 = r4.buttonSuccessTitle
            r0.setText(r1)
        L80:
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.widget.TextView r0 = r0.dialogDesc
            java.lang.String r1 = r4.desc
            android.text.Spanned r1 = com.usidqw.qwerklj.Utils.Tools.toHtml(r1)
            r0.setText(r1)
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.widget.TextView r0 = r0.dialogDesc
            int r1 = r4.descGravity
            r0.setGravity(r1)
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.widget.TextView r0 = r0.dialogDesc
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.widget.TextView r0 = r0.dialogDesc
            r1 = 1
            r0.setLinksClickable(r1)
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.widget.TextView r0 = r0.dialogCancel
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda0 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda0
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            com.usidqw.qwerklj.databinding.PlusDialogMessageBinding r0 = r4.plusDialogMessageBinding
            android.widget.TextView r0 = r0.dialogSuccess
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda11 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda11
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            return
    }

    private void Dialog_selectFile() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.inflater
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r0 = com.usidqw.qwerklj.databinding.PlusDialogFileBinding.inflate(r0)
            r3.bind = r0
            android.view.Window r1 = r3.window
            r2 = r0
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r2 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r2
            android.widget.LinearLayout r0 = r0.getRoot()
            r1.setContentView(r0)
            java.lang.String r0 = r3.title
            r1 = 8
            if (r0 == 0) goto L2d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L21
            goto L2d
        L21:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            java.lang.String r2 = r3.title
            r0.setText(r2)
            goto L36
        L2d:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r0
            android.widget.TextView r0 = r0.dialogTitle
            r0.setVisibility(r1)
        L36:
            java.lang.String r0 = r3.buttonCancelTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L49
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            java.lang.String r2 = r3.buttonCancelTitle
            r0.setText(r2)
        L49:
            java.lang.String r0 = r3.buttonSuccessTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5c
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            java.lang.String r2 = r3.buttonSuccessTitle
            r0.setText(r2)
        L5c:
            java.lang.String[] r0 = r3.fileTypes
            if (r0 == 0) goto L72
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            r0.setVisibility(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r0
            android.view.View r0 = r0.viewHide
            r0.setVisibility(r1)
        L72:
            r0 = 80
            r3.gravity = r0
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r0
            android.widget.TextView r0 = r0.dialogCancel
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda15 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda15
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda16 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda16
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r0
            android.widget.TextView r0 = r0.dialogFilePath
            java.lang.String r1 = r3.startDirPath
            r0.setText(r1)
            com.usidqw.qwerklj.Adapter.DialogSelectFileAdapter r0 = new com.usidqw.qwerklj.Adapter.DialogSelectFileAdapter
            android.app.Activity r1 = r3.activity
            java.lang.String r2 = r3.startDirPath
            r0.<init>(r1, r2)
            r3.dialogSelectFileAdapter = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda17 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda17
            r1.<init>(r3)
            r0.post(r1)
            return
    }

    private void TouchListReq() {
            r3 = this;
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch1
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r1 = r3.touch_list
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.usidqw.qwerklj.Json.DialogTouchList r1 = (com.usidqw.qwerklj.Json.DialogTouchList) r1
            java.lang.String r1 = r1.getTitle()
            r0.setText(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch2
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r1 = r3.touch_list
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            com.usidqw.qwerklj.Json.DialogTouchList r1 = (com.usidqw.qwerklj.Json.DialogTouchList) r1
            java.lang.String r1 = r1.getTitle()
            r0.setText(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch3
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r1 = r3.touch_list
            r2 = 2
            java.lang.Object r1 = r1.get(r2)
            com.usidqw.qwerklj.Json.DialogTouchList r1 = (com.usidqw.qwerklj.Json.DialogTouchList) r1
            java.lang.String r1 = r1.getTitle()
            r0.setText(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch4
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r1 = r3.touch_list
            r2 = 3
            java.lang.Object r1 = r1.get(r2)
            com.usidqw.qwerklj.Json.DialogTouchList r1 = (com.usidqw.qwerklj.Json.DialogTouchList) r1
            java.lang.String r1 = r1.getTitle()
            r0.setText(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch5
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r1 = r3.touch_list
            r2 = 4
            java.lang.Object r1 = r1.get(r2)
            com.usidqw.qwerklj.Json.DialogTouchList r1 = (com.usidqw.qwerklj.Json.DialogTouchList) r1
            java.lang.String r1 = r1.getTitle()
            r0.setText(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch6
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r1 = r3.touch_list
            r2 = 5
            java.lang.Object r1 = r1.get(r2)
            com.usidqw.qwerklj.Json.DialogTouchList r1 = (com.usidqw.qwerklj.Json.DialogTouchList) r1
            java.lang.String r1 = r1.getTitle()
            r0.setText(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch7
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r1 = r3.touch_list
            r2 = 6
            java.lang.Object r1 = r1.get(r2)
            com.usidqw.qwerklj.Json.DialogTouchList r1 = (com.usidqw.qwerklj.Json.DialogTouchList) r1
            java.lang.String r1 = r1.getTitle()
            r0.setText(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch8
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r1 = r3.touch_list
            r2 = 7
            java.lang.Object r1 = r1.get(r2)
            com.usidqw.qwerklj.Json.DialogTouchList r1 = (com.usidqw.qwerklj.Json.DialogTouchList) r1
            java.lang.String r1 = r1.getTitle()
            r0.setText(r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch9
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r1 = r3.touch_list
            r2 = 8
            java.lang.Object r1 = r1.get(r2)
            com.usidqw.qwerklj.Json.DialogTouchList r1 = (com.usidqw.qwerklj.Json.DialogTouchList) r1
            java.lang.String r1 = r1.getTitle()
            r0.setText(r1)
            return
    }

    private android.app.Dialog _show() {
            r5 = this;
            android.app.Activity r0 = r5.activity
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r5.inflater = r0
            android.view.View r0 = r5.view
            if (r0 != 0) goto L95
            com.usidqw.qwerklj.Dialog.DialogType r0 = r5.type
            int r0 = r0.ordinal()
            if (r0 == 0) goto L6d
            r1 = 3
            r2 = -2
            if (r0 == r1) goto L58
            r1 = 10
            if (r0 == r1) goto L33
            android.view.WindowManager$LayoutParams r0 = r5.params
            android.app.Activity r1 = r5.activity
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r1 = r1 + (-100)
            r0.width = r1
            android.view.WindowManager$LayoutParams r0 = r5.params
            r0.height = r2
            goto L95
        L33:
            android.view.WindowManager$LayoutParams r0 = r5.params
            android.app.Activity r1 = r5.activity
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r1 = r1 + (-50)
            r0.width = r1
            android.view.WindowManager$LayoutParams r0 = r5.params
            android.app.Activity r1 = r5.activity
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r1 = r1 + (-50)
            r0.height = r1
            goto L95
        L58:
            android.view.WindowManager$LayoutParams r0 = r5.params
            android.app.Activity r1 = r5.activity
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            r0.width = r1
            android.view.WindowManager$LayoutParams r0 = r5.params
            r0.height = r2
            goto L95
        L6d:
            android.view.WindowManager$LayoutParams r0 = r5.params
            android.app.Activity r1 = r5.activity
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            double r1 = (double) r1
            r3 = 4612811918334230528(0x4004000000000000, double:2.5)
            double r1 = r1 / r3
            int r1 = (int) r1
            r0.width = r1
            android.view.WindowManager$LayoutParams r0 = r5.params
            android.app.Activity r1 = r5.activity
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            double r1 = (double) r1
            double r1 = r1 / r3
            int r1 = (int) r1
            r0.height = r1
        L95:
            android.view.Window r0 = r5.window
            android.view.WindowManager$LayoutParams r1 = r5.params
            r0.setAttributes(r1)
            android.view.View r0 = r5.view
            if (r0 == 0) goto La6
            android.view.Window r1 = r5.window
            r1.setContentView(r0)
            goto Lda
        La6:
            com.usidqw.qwerklj.Dialog.DialogType r0 = r5.type
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto Ld7;
                case 2: goto Ld3;
                case 3: goto Lcf;
                case 4: goto Lcb;
                case 5: goto Lc7;
                case 6: goto Lc3;
                case 7: goto Lbf;
                case 8: goto Lbb;
                case 9: goto Lb7;
                case 10: goto Lb3;
                default: goto Laf;
            }
        Laf:
            r5.Dialog_defaultValue()
            goto Lda
        Lb3:
            r5.Dialog_touch()
            goto Lda
        Lb7:
            r5.Dialog_custom()
            goto Lda
        Lbb:
            r5.Dialog_listEditKey()
            goto Lda
        Lbf:
            r5.Dialog_inputKeyOrValue()
            goto Lda
        Lc3:
            r5.Dialog_listEdit()
            goto Lda
        Lc7:
            r5.Dialog_listItem()
            goto Lda
        Lcb:
            r5.Dialog_message()
            goto Lda
        Lcf:
            r5.Dialog_selectFile()
            goto Lda
        Ld3:
            r5.Dialog_InputMulti()
            goto Lda
        Ld7:
            r5.Dialog_Input()
        Lda:
            android.view.Window r0 = r5.window
            r1 = 131072(0x20000, float:1.83671E-40)
            r0.clearFlags(r1)
            android.view.Window r0 = r5.window
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>()
            r0.setBackgroundDrawable(r1)
            android.view.Window r0 = r5.window
            int r1 = r5.gravity
            r2 = -1
            if (r1 != r2) goto Lf4
            r1 = 17
        Lf4:
            r0.setGravity(r1)
            android.app.Dialog r0 = r5.dialog
            return r0
    }

    static /* synthetic */ android.app.Dialog access$000(com.usidqw.qwerklj.Dialog.PlusDialog r0) {
            android.app.Dialog r0 = r0.dialog
            return r0
    }

    static /* synthetic */ android.app.Dialog access$100(com.usidqw.qwerklj.Dialog.PlusDialog r0) {
            android.app.Dialog r0 = r0._show()
            return r0
    }

    static /* synthetic */ android.app.Activity access$200(com.usidqw.qwerklj.Dialog.PlusDialog r0) {
            android.app.Activity r0 = r0.activity
            return r0
    }

    public static void dismiss() {
            android.app.Dialog r0 = com.usidqw.qwerklj.Dialog.PlusDialog.staticDialog
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            return
    }

    static /* synthetic */ void lambda$message$36(com.usidqw.qwerklj.Dialog.PlusDialog r0, boolean r1) {
            android.app.Dialog r0 = r0.getDialog()
            r0.dismiss()
            return
    }

    static /* synthetic */ void lambda$message$37(android.app.Activity r1, java.lang.String r2) {
            com.usidqw.qwerklj.Dialog.PlusDialog r0 = new com.usidqw.qwerklj.Dialog.PlusDialog
            r0.<init>(r1)
            com.usidqw.qwerklj.Dialog.DialogType r1 = com.usidqw.qwerklj.Dialog.DialogType.MESSAGE
            r0.setType(r1)
            r1 = 0
            r0.setShowCancelButton(r1)
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda23 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda23
            r1.<init>(r0)
            r0.setOnClickMessage(r1)
            r0.setDesc(r2)
            r0.show()
            return
    }

    static /* synthetic */ void lambda$message$38(com.usidqw.qwerklj.Dialog.PlusDialog r0, boolean r1) {
            android.app.Dialog r0 = r0.getDialog()
            r0.dismiss()
            return
    }

    static /* synthetic */ void lambda$message$39(android.app.Activity r1, java.lang.String r2, java.lang.String r3) {
            com.usidqw.qwerklj.Dialog.PlusDialog r0 = new com.usidqw.qwerklj.Dialog.PlusDialog
            r0.<init>(r1)
            com.usidqw.qwerklj.Dialog.DialogType r1 = com.usidqw.qwerklj.Dialog.DialogType.MESSAGE
            r0.setType(r1)
            r0.setTitle(r2)
            r1 = 0
            r0.setShowCancelButton(r1)
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda2 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda2
            r1.<init>(r0)
            r0.setOnClickMessage(r1)
            r0.setDesc(r3)
            r0.show()
            return
    }

    public static void message(android.app.Activity r2, java.lang.String r3) {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda13 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda13
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    public static void message(android.app.Activity r2, java.lang.String r3, java.lang.String r4) {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda29 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda29
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            return
    }

    public static void message(java.lang.String r1) {
            com.usidqw.qwerklj.Tools.JsonMain r0 = com.usidqw.qwerklj.Tools.Static.App
            android.app.Activity r0 = r0.getActivity()
            message(r0, r1)
            return
    }

    public static void show(android.app.Activity r1) {
            java.lang.String r0 = "请等待..."
            show(r1, r0)
            return
    }

    public static void show(android.app.Activity r1, java.lang.String r2) {
            android.app.Dialog r0 = com.usidqw.qwerklj.Dialog.PlusDialog.staticDialog
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            com.usidqw.qwerklj.Dialog.PlusDialog r0 = new com.usidqw.qwerklj.Dialog.PlusDialog
            r0.<init>(r1)
            com.usidqw.qwerklj.Dialog.DialogType r1 = com.usidqw.qwerklj.Dialog.DialogType.WAIT
            r0.setType(r1)
            r0.setTitle(r2)
            android.app.Dialog r1 = r0.show()
            com.usidqw.qwerklj.Dialog.PlusDialog.staticDialog = r1
            return
    }

    public void Dialog_touch() {
            r5 = this;
            com.usidqw.qwerklj.Json.JsonHookSettingList$DataBean r0 = r5.touchItemList
            if (r0 != 0) goto L19
            android.app.Dialog r0 = r5.dialog
            r0.dismiss()
            android.app.Activity r0 = r5.activity
            com.usidqw.qwerklj.Utils.ToastPlus r0 = com.usidqw.qwerklj.Utils.ToastPlus.init(r0)
            com.usidqw.qwerklj.Utils.ToastPlus r0 = r0.error()
            java.lang.String r1 = "没有初始列表数据"
            r0.show(r1)
            return
        L19:
            android.view.LayoutInflater r0 = r5.inflater
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = com.usidqw.qwerklj.databinding.PlusDialogTouchBinding.inflate(r0)
            r5.bind = r0
            android.view.Window r1 = r5.window
            r2 = r0
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r2 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r2
            android.widget.LinearLayout r0 = r0.getRoot()
            r1.setContentView(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda22 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda22
            r1.<init>(r5, r0)
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.dialogSuccess
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda33 r2 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda33
            r2.<init>(r5)
            r0.setOnClickListener(r2)
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r2 = r5.touchValue
            com.usidqw.qwerklj.Dialog.PlusDialog$3 r3 = new com.usidqw.qwerklj.Dialog.PlusDialog$3
            r3.<init>(r5)
            java.lang.reflect.Type r3 = r3.getType()
            java.lang.Object r0 = r0.fromJson(r2, r3)
            java.util.List r0 = (java.util.List) r0
            r5.touch_list = r0
            r2 = 9
            if (r0 == 0) goto L67
            int r0 = r0.size()
            if (r0 == r2) goto L7e
        L67:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.touch_list = r0
            r0 = 0
        L6f:
            if (r0 >= r2) goto L7e
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r3 = r5.touch_list
            com.usidqw.qwerklj.Json.DialogTouchList r4 = new com.usidqw.qwerklj.Json.DialogTouchList
            r4.<init>()
            r3.add(r4)
            int r0 = r0 + 1
            goto L6f
        L7e:
            r5.TouchListReq()
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch1
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch2
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch3
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch4
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch5
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch6
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch7
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch8
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r5.bind
            com.usidqw.qwerklj.databinding.PlusDialogTouchBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogTouchBinding) r0
            android.widget.TextView r0 = r0.touch9
            r0.setOnClickListener(r1)
            return
    }

    public void NotifyDataSetChangedItem() {
            r1 = this;
            com.usidqw.qwerklj.Adapter.DialogListItemAdapter r0 = r1.dialogListItemAdapter
            r0.notifyDataSetChanged()
            return
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog addItemOpen(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = ""
            com.usidqw.qwerklj.Dialog.PlusDialog r2 = r1.addItemOpen(r2, r0)
            return r2
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog addItemOpen(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog r1 = r0.addItemOpen(r1, r2, r1)
            return r1
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog addItemOpen(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            com.usidqw.qwerklj.Json.DialogListItem r0 = new com.usidqw.qwerklj.Json.DialogListItem
            r0.<init>()
            r0.setTitle(r2)
            r0.setDesc(r3)
            r0.setKey(r4)
            r2 = 0
            r0.setSwitch(r2)
            java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r2 = r1.dialogListItem
            r2.add(r0)
            return r1
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog addItemSwitch(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = ""
            com.usidqw.qwerklj.Dialog.PlusDialog r2 = r1.addItemSwitch(r2, r0)
            return r2
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog addItemSwitch(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            com.usidqw.qwerklj.Dialog.PlusDialog r2 = r1.addItemSwitch(r2, r3, r0)
            return r2
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog addItemSwitch(java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r1 = this;
            com.usidqw.qwerklj.Json.DialogListItem r0 = new com.usidqw.qwerklj.Json.DialogListItem
            r0.<init>()
            r0.setTitle(r2)
            r0.setDesc(r3)
            r2 = 1
            r0.setSwitch(r2)
            r0.setKey(r4)
            r0.setSelected(r5)
            java.util.List<com.usidqw.qwerklj.Json.DialogListItem> r2 = r1.dialogListItem
            r2.add(r0)
            return r1
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog addItemSwitch(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog r1 = r0.addItemSwitch(r1, r2, r1, r3)
            return r1
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog addItemSwitch(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = ""
            com.usidqw.qwerklj.Dialog.PlusDialog r2 = r1.addItemSwitch(r2, r0, r3)
            return r2
    }

    public android.app.Dialog getDialog() {
            r1 = this;
            android.app.Dialog r0 = r1.dialog
            return r0
    }

    public java.io.File[] getFiles(java.lang.String r4) {
            r3 = this;
            java.lang.String[] r0 = r3.fileTypes
            r1 = 0
            if (r0 != 0) goto Ld
            java.io.File[] r4 = com.usidqw.qwerklj.Utils.FileUtils.listDirs(r4)
            int r0 = r4.length
            if (r0 != 0) goto L1f
            return r1
        Ld:
            int r2 = r0.length
            if (r2 != 0) goto L15
            java.io.File[] r4 = com.usidqw.qwerklj.Utils.FileUtils.listDirsAndFiles(r4, r1)
            goto L19
        L15:
            java.io.File[] r4 = com.usidqw.qwerklj.Utils.FileUtils.listDirsAndFiles(r4, r0)
        L19:
            if (r4 == 0) goto L20
            int r0 = r4.length
            if (r0 != 0) goto L1f
            goto L20
        L1f:
            return r4
        L20:
            return r1
    }

    /* renamed from: lambda$Dialog_Input$0$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ boolean m143lambda$Dialog_Input$0$comusidqwqwerkljDialogPlusDialog(android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            r1 = 6
            if (r2 != r1) goto Le
            java.lang.Object r1 = r0.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r1 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r1
            android.widget.TextView r1 = r1.dialogSuccess
            r1.performClick()
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    /* renamed from: lambda$Dialog_Input$1$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m144lambda$Dialog_Input$1$comusidqwqwerkljDialogPlusDialog(android.view.View r1) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$OnCancel r1 = r0.onCancelCall
            if (r1 == 0) goto L7
            r1.cancel()
        L7:
            android.app.Dialog r1 = r0.dialog
            r1.dismiss()
            return
    }

    /* renamed from: lambda$Dialog_Input$2$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m145lambda$Dialog_Input$2$comusidqwqwerkljDialogPlusDialog(android.view.View r2) {
            r1 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$InputClick r2 = r1.inputClickCall
            if (r2 == 0) goto L15
            java.lang.Object r0 = r1.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r2.success(r0)
        L15:
            boolean r2 = r1.isDismiss
            if (r2 != 0) goto L1e
            android.app.Dialog r2 = r1.dialog
            r2.dismiss()
        L1e:
            return
    }

    /* renamed from: lambda$Dialog_InputMulti$3$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m146lambda$Dialog_InputMulti$3$comusidqwqwerkljDialogPlusDialog(java.io.File r4) {
            r3 = this;
            java.lang.String r0 = "pathImg"
            java.lang.String r1 = r4.getPath()
            com.usidqw.qwerklj.Base.HookFun.set(r0, r1)
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[img]"
            r1.<init>(r2)
            java.lang.String r4 = r4.getPath()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "[/img]"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.setText(r4)
            return
    }

    /* renamed from: lambda$Dialog_InputMulti$4$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m147lambda$Dialog_InputMulti$4$comusidqwqwerkljDialogPlusDialog(android.view.View r6) {
            r5 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog r6 = new com.usidqw.qwerklj.Dialog.PlusDialog
            r6.<init>()
            java.lang.String r0 = "选择本地图片"
            r6.setTitle(r0)
            com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.SELECT_FILE
            r6.setType(r0)
            java.lang.String r0 = "pathImg"
            java.lang.String r1 = ""
            java.lang.String r0 = com.usidqw.qwerklj.Base.HookFun.get(r0, r1)
            java.lang.String r1 = "gif"
            java.lang.String r2 = "jpeg"
            java.lang.String r3 = "jpg"
            java.lang.String r4 = "png"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r1, r2}
            r6.setSelectFileType(r0, r1)
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda34 r0 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda34
            r0.<init>(r5)
            r6.setOnClickSelectFile(r0)
            r6.show()
            return
    }

    /* renamed from: lambda$Dialog_InputMulti$5$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m148lambda$Dialog_InputMulti$5$comusidqwqwerkljDialogPlusDialog(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Object r0 = r3.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[img]"
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "[/img]"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.setText(r4)
            return
    }

    /* renamed from: lambda$Dialog_InputMulti$6$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m149lambda$Dialog_InputMulti$6$comusidqwqwerkljDialogPlusDialog(android.view.View r2) {
            r1 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog r2 = new com.usidqw.qwerklj.Dialog.PlusDialog
            r2.<init>()
            com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.INPUT
            com.usidqw.qwerklj.Dialog.PlusDialog r2 = r2.setType(r0)
            r0 = 1
            com.usidqw.qwerklj.Dialog.PlusDialog r2 = r2.setCanceledOnTouchOutside(r0)
            r0 = 0
            com.usidqw.qwerklj.Dialog.PlusDialog r2 = r2.setDismiss(r0)
            java.lang.String r0 = "输入网络图片地址"
            com.usidqw.qwerklj.Dialog.PlusDialog r2 = r2.setTitle(r0)
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda12 r0 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda12
            r0.<init>(r1)
            com.usidqw.qwerklj.Dialog.PlusDialog r2 = r2.setOnClickInput(r0)
            r2.show()
            return
    }

    /* renamed from: lambda$Dialog_InputMulti$7$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m150lambda$Dialog_InputMulti$7$comusidqwqwerkljDialogPlusDialog(android.view.View r1) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$OnCancel r1 = r0.onCancelCall
            if (r1 == 0) goto L7
            r1.cancel()
        L7:
            android.app.Dialog r1 = r0.dialog
            r1.dismiss()
            return
    }

    /* renamed from: lambda$Dialog_InputMulti$8$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m151lambda$Dialog_InputMulti$8$comusidqwqwerkljDialogPlusDialog(android.view.View r2) {
            r1 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$InputClick r2 = r1.inputClickCall
            if (r2 == 0) goto L15
            java.lang.Object r0 = r1.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputMultiBinding) r0
            android.widget.EditText r0 = r0.dialogInput
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r2.success(r0)
        L15:
            boolean r2 = r1.isDismiss
            if (r2 != 0) goto L1e
            android.app.Dialog r2 = r1.dialog
            r2.dismiss()
        L1e:
            return
    }

    /* renamed from: lambda$Dialog_custom$31$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m152lambda$Dialog_custom$31$comusidqwqwerkljDialogPlusDialog(android.view.View r1) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$OnCancel r1 = r0.onCancelCall
            if (r1 == 0) goto L7
            r1.success()
        L7:
            boolean r1 = r0.isDismiss
            if (r1 != 0) goto L10
            android.app.Dialog r1 = r0.dialog
            r1.dismiss()
        L10:
            return
    }

    /* renamed from: lambda$Dialog_custom$32$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m153lambda$Dialog_custom$32$comusidqwqwerkljDialogPlusDialog(android.view.View r1) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$OnCancel r1 = r0.onCancelCall
            if (r1 == 0) goto L7
            r1.cancel()
        L7:
            boolean r1 = r0.isDismiss
            if (r1 != 0) goto L10
            android.app.Dialog r1 = r0.dialog
            r1.dismiss()
        L10:
            return
    }

    /* renamed from: lambda$Dialog_inputKeyOrValue$17$com-usidqw-qwerklj-Dialog-PlusDialog */
    /* synthetic */ void m19xad9b68c7(android.view.View r1) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$OnCancel r1 = r0.onCancelCall
            if (r1 == 0) goto L7
            r1.cancel()
        L7:
            android.app.Dialog r1 = r0.dialog
            r1.dismiss()
            return
    }

    /* renamed from: lambda$Dialog_inputKeyOrValue$18$com-usidqw-qwerklj-Dialog-PlusDialog */
    /* synthetic */ void m20xeee0566(android.view.View r3) {
            r2 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$InputClickKeyValue r3 = r2.inputClickKeyValueCall
            if (r3 == 0) goto L23
            java.lang.Object r0 = r2.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r0
            android.widget.EditText r0 = r0.dialogKey
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.Object r1 = r2.bind
            com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding r1 = (com.usidqw.qwerklj.databinding.PlusDialogInputKeyValueBinding) r1
            android.widget.EditText r1 = r1.dialogValue
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r3.success(r0, r1)
        L23:
            boolean r3 = r2.isDismiss
            if (r3 != 0) goto L2c
            android.app.Dialog r3 = r2.dialog
            r3.dismiss()
        L2c:
            return
    }

    /* renamed from: lambda$Dialog_listEdit$19$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m154lambda$Dialog_listEdit$19$comusidqwqwerkljDialogPlusDialog(com.usidqw.qwerklj.Dialog.PlusDialog r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1a
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Ld
            goto L1a
        Ld:
            com.usidqw.qwerklj.Adapter.DialogListEditAdapter r0 = r1.dialogListEditAdapter
            r0.addItem(r3, r4)
            android.app.Dialog r2 = r2.getDialog()
            r2.dismiss()
            return
        L1a:
            android.app.Activity r2 = r1.activity
            com.usidqw.qwerklj.Utils.ToastPlus r2 = com.usidqw.qwerklj.Utils.ToastPlus.init(r2)
            com.usidqw.qwerklj.Utils.ToastPlus r2 = r2.error()
            java.lang.String r3 = "Key和Value不能为空"
            r2.show(r3)
            return
    }

    /* renamed from: lambda$Dialog_listEdit$20$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m155lambda$Dialog_listEdit$20$comusidqwqwerkljDialogPlusDialog(android.view.View r2) {
            r1 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog r2 = new com.usidqw.qwerklj.Dialog.PlusDialog
            android.app.Activity r0 = r1.activity
            r2.<init>(r0)
            com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.INPUT_KEY_OR_VALUE
            r2.setType(r0)
            java.lang.String r0 = r1.hint
            r2.setHint(r0)
            java.lang.String r0 = r1.hintValue
            r2.setValueHint(r0)
            r0 = 1
            r2.setDismiss(r0)
            java.lang.String r0 = "添加"
            r2.setButtonSuccessTitle(r0)
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda6 r0 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda6
            r0.<init>(r1, r2)
            r2.setOnInputKeyOrValue(r0)
            r2.show()
            return
    }

    /* renamed from: lambda$Dialog_listEdit$21$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m156lambda$Dialog_listEdit$21$comusidqwqwerkljDialogPlusDialog(int r2, com.usidqw.qwerklj.Dialog.PlusDialog r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L1a
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Ld
            goto L1a
        Ld:
            com.usidqw.qwerklj.Adapter.DialogListEditAdapter r0 = r1.dialogListEditAdapter
            r0.saveData(r2, r4, r5)
            android.app.Dialog r2 = r3.getDialog()
            r2.dismiss()
            return
        L1a:
            android.app.Activity r2 = r1.activity
            com.usidqw.qwerklj.Utils.ToastPlus r2 = com.usidqw.qwerklj.Utils.ToastPlus.init(r2)
            com.usidqw.qwerklj.Utils.ToastPlus r2 = r2.error()
            java.lang.String r3 = "Key和Value不能为空"
            r2.show(r3)
            return
    }

    /* renamed from: lambda$Dialog_listEdit$22$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m157lambda$Dialog_listEdit$22$comusidqwqwerkljDialogPlusDialog(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog r1 = new com.usidqw.qwerklj.Dialog.PlusDialog
            android.app.Activity r2 = r0.activity
            r1.<init>(r2)
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.INPUT_KEY_OR_VALUE
            r1.setType(r2)
            java.lang.String r2 = r0.hint
            r1.setHint(r2)
            com.usidqw.qwerklj.Adapter.DialogListEditAdapter r2 = r0.dialogListEditAdapter
            java.util.List r2 = r2.getAllData()
            java.lang.Object r2 = r2.get(r3)
            com.usidqw.qwerklj.Json.DialogListEdit r2 = (com.usidqw.qwerklj.Json.DialogListEdit) r2
            java.lang.String r2 = r2.getKey()
            r1.setKey(r2)
            com.usidqw.qwerklj.Adapter.DialogListEditAdapter r2 = r0.dialogListEditAdapter
            java.util.List r2 = r2.getAllData()
            java.lang.Object r2 = r2.get(r3)
            com.usidqw.qwerklj.Json.DialogListEdit r2 = (com.usidqw.qwerklj.Json.DialogListEdit) r2
            java.lang.String r2 = r2.getValue()
            r1.setValue(r2)
            java.lang.String r2 = r0.hintValue
            r1.setValueHint(r2)
            r2 = 1
            r1.setDismiss(r2)
            java.lang.String r2 = "修改"
            r1.setButtonSuccessTitle(r2)
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda8 r2 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda8
            r2.<init>(r0, r3, r1)
            r1.setOnInputKeyOrValue(r2)
            r1.show()
            return
    }

    /* renamed from: lambda$Dialog_listEdit$23$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m158lambda$Dialog_listEdit$23$comusidqwqwerkljDialogPlusDialog(android.view.View r3) {
            r2 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$InputClick r3 = r2.inputClickCall
            if (r3 == 0) goto L2c
            com.usidqw.qwerklj.Adapter.DialogListEditAdapter r3 = r2.dialogListEditAdapter
            java.util.List r3 = r3.getAllDataHandle()
            int r3 = r3.size()
            if (r3 != 0) goto L18
            com.usidqw.qwerklj.Dialog.PlusDialog$InputClick r3 = r2.inputClickCall
            java.lang.String r0 = ""
            r3.success(r0)
            goto L2c
        L18:
            com.usidqw.qwerklj.Dialog.PlusDialog$InputClick r3 = r2.inputClickCall
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            com.usidqw.qwerklj.Adapter.DialogListEditAdapter r1 = r2.dialogListEditAdapter
            java.util.List r1 = r1.getAllDataHandle()
            java.lang.String r0 = r0.toJson(r1)
            r3.success(r0)
        L2c:
            boolean r3 = r2.isDismiss
            if (r3 != 0) goto L35
            android.app.Dialog r3 = r2.dialog
            r3.dismiss()
        L35:
            return
    }

    /* renamed from: lambda$Dialog_listEdit$24$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m159lambda$Dialog_listEdit$24$comusidqwqwerkljDialogPlusDialog(android.view.View r1) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$OnCancel r1 = r0.onCancelCall
            if (r1 == 0) goto L7
            r1.cancel()
        L7:
            android.app.Dialog r1 = r0.dialog
            r1.dismiss()
            return
    }

    /* renamed from: lambda$Dialog_listEditKey$25$com-usidqw-qwerklj-Dialog-PlusDialog */
    /* synthetic */ void m21xdf4c67e8(com.usidqw.qwerklj.Dialog.PlusDialog r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L16
            android.app.Activity r3 = r2.activity
            com.usidqw.qwerklj.Utils.ToastPlus r3 = com.usidqw.qwerklj.Utils.ToastPlus.init(r3)
            com.usidqw.qwerklj.Utils.ToastPlus r3 = r3.error()
            java.lang.String r4 = "Key不能为空"
            r3.show(r4)
            return
        L16:
            com.usidqw.qwerklj.Adapter.DialogListEditInputAdapter r0 = r2.dialogListEditInputAdapter
            java.lang.String r1 = ""
            r0.addItem(r4, r1)
            android.app.Dialog r3 = r3.getDialog()
            r3.dismiss()
            return
    }

    /* renamed from: lambda$Dialog_listEditKey$26$com-usidqw-qwerklj-Dialog-PlusDialog */
    /* synthetic */ void m22x409f0487(android.view.View r2) {
            r1 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog r2 = new com.usidqw.qwerklj.Dialog.PlusDialog
            android.app.Activity r0 = r1.activity
            r2.<init>(r0)
            com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.INPUT_MULTI
            r2.setType(r0)
            java.lang.String r0 = r1.hint
            r2.setHint(r0)
            java.lang.String r0 = r1.hintValue
            r2.setValueHint(r0)
            r0 = 1
            r2.setDismiss(r0)
            r2.setInputSelectImg(r0)
            java.lang.String r0 = "添加"
            r2.setButtonSuccessTitle(r0)
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda30 r0 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda30
            r0.<init>(r1, r2)
            r2.setOnClickInput(r0)
            r2.show()
            return
    }

    /* renamed from: lambda$Dialog_listEditKey$27$com-usidqw-qwerklj-Dialog-PlusDialog */
    /* synthetic */ void m23xa1f1a126(int r3, com.usidqw.qwerklj.Dialog.PlusDialog r4, java.lang.String r5) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L16
            android.app.Activity r3 = r2.activity
            com.usidqw.qwerklj.Utils.ToastPlus r3 = com.usidqw.qwerklj.Utils.ToastPlus.init(r3)
            com.usidqw.qwerklj.Utils.ToastPlus r3 = r3.error()
            java.lang.String r4 = "Key不能为空"
            r3.show(r4)
            return
        L16:
            com.usidqw.qwerklj.Adapter.DialogListEditInputAdapter r0 = r2.dialogListEditInputAdapter
            java.lang.String r1 = ""
            r0.saveData(r3, r5, r1)
            android.app.Dialog r3 = r4.getDialog()
            r3.dismiss()
            return
    }

    /* renamed from: lambda$Dialog_listEditKey$28$com-usidqw-qwerklj-Dialog-PlusDialog */
    /* synthetic */ void m24x3443dc5(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog r1 = new com.usidqw.qwerklj.Dialog.PlusDialog
            android.app.Activity r2 = r0.activity
            r1.<init>(r2)
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.INPUT_MULTI
            r1.setType(r2)
            java.lang.String r2 = r0.hint
            r1.setHint(r2)
            com.usidqw.qwerklj.Adapter.DialogListEditInputAdapter r2 = r0.dialogListEditInputAdapter
            java.util.List r2 = r2.getAllData()
            java.lang.Object r2 = r2.get(r3)
            com.usidqw.qwerklj.Json.DialogListEdit r2 = (com.usidqw.qwerklj.Json.DialogListEdit) r2
            java.lang.String r2 = r2.getKey()
            r1.setValue(r2)
            java.lang.String r2 = r0.hintValue
            r1.setValueHint(r2)
            r2 = 1
            r1.setDismiss(r2)
            java.lang.String r2 = "修改"
            r1.setButtonSuccessTitle(r2)
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda24 r2 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda24
            r2.<init>(r0, r3, r1)
            r1.setOnClickInput(r2)
            r1.show()
            return
    }

    /* renamed from: lambda$Dialog_listEditKey$29$com-usidqw-qwerklj-Dialog-PlusDialog */
    /* synthetic */ void m25x6496da64(android.view.View r3) {
            r2 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$InputClick r3 = r2.inputClickCall
            if (r3 == 0) goto L2c
            com.usidqw.qwerklj.Adapter.DialogListEditInputAdapter r3 = r2.dialogListEditInputAdapter
            java.util.List r3 = r3.getAllDataHandle()
            int r3 = r3.size()
            if (r3 != 0) goto L18
            com.usidqw.qwerklj.Dialog.PlusDialog$InputClick r3 = r2.inputClickCall
            java.lang.String r0 = ""
            r3.success(r0)
            goto L2c
        L18:
            com.usidqw.qwerklj.Dialog.PlusDialog$InputClick r3 = r2.inputClickCall
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            com.usidqw.qwerklj.Adapter.DialogListEditInputAdapter r1 = r2.dialogListEditInputAdapter
            java.util.List r1 = r1.getAllDataHandle()
            java.lang.String r0 = r0.toJson(r1)
            r3.success(r0)
        L2c:
            boolean r3 = r2.isDismiss
            if (r3 != 0) goto L35
            android.app.Dialog r3 = r2.dialog
            r3.dismiss()
        L35:
            return
    }

    /* renamed from: lambda$Dialog_listEditKey$30$com-usidqw-qwerklj-Dialog-PlusDialog */
    /* synthetic */ void m26xc1b0500e(android.view.View r1) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$OnCancel r1 = r0.onCancelCall
            if (r1 == 0) goto L7
            r1.cancel()
        L7:
            android.app.Dialog r1 = r0.dialog
            r1.dismiss()
            return
    }

    /* renamed from: lambda$Dialog_listItem$15$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m160lambda$Dialog_listItem$15$comusidqwqwerkljDialogPlusDialog(android.view.View r1) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$OnCancel r1 = r0.onCancelCall
            if (r1 == 0) goto L7
            r1.success()
        L7:
            boolean r1 = r0.isDismiss
            if (r1 != 0) goto L10
            android.app.Dialog r1 = r0.dialog
            r1.dismiss()
        L10:
            return
    }

    /* renamed from: lambda$Dialog_listItem$16$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m161lambda$Dialog_listItem$16$comusidqwqwerkljDialogPlusDialog(android.view.View r1) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$OnCancel r1 = r0.onCancelCall
            if (r1 == 0) goto L7
            r1.cancel()
        L7:
            android.app.Dialog r1 = r0.dialog
            r1.dismiss()
            return
    }

    /* renamed from: lambda$Dialog_message$13$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m162lambda$Dialog_message$13$comusidqwqwerkljDialogPlusDialog(android.view.View r2) {
            r1 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$Message r2 = r1.messageCall
            if (r2 == 0) goto L8
            r0 = 0
            r2.onClick(r0)
        L8:
            boolean r2 = r1.isDismiss
            if (r2 != 0) goto L1b
            android.app.Dialog r2 = r1.dialog
            if (r2 == 0) goto L1b
            boolean r2 = r2.isShowing()
            if (r2 == 0) goto L1b
            android.app.Dialog r2 = r1.dialog
            r2.dismiss()
        L1b:
            return
    }

    /* renamed from: lambda$Dialog_message$14$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m163lambda$Dialog_message$14$comusidqwqwerkljDialogPlusDialog(android.view.View r2) {
            r1 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$Message r2 = r1.messageCall
            if (r2 == 0) goto L8
            r0 = 1
            r2.onClick(r0)
        L8:
            boolean r2 = r1.isDismiss
            if (r2 != 0) goto L1b
            android.app.Dialog r2 = r1.dialog
            if (r2 == 0) goto L1b
            boolean r2 = r2.isShowing()
            if (r2 == 0) goto L1b
            android.app.Dialog r2 = r1.dialog
            r2.dismiss()
        L1b:
            return
    }

    /* renamed from: lambda$Dialog_selectFile$10$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m164lambda$Dialog_selectFile$10$comusidqwqwerkljDialogPlusDialog(android.view.View r3) {
            r2 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$SelectFile r3 = r2.selectFileCall
            if (r3 == 0) goto Le
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.startDirPath
            r0.<init>(r1)
            r3.success(r0)
        Le:
            android.app.Dialog r3 = r2.dialog
            r3.dismiss()
            return
    }

    /* renamed from: lambda$Dialog_selectFile$11$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m165lambda$Dialog_selectFile$11$comusidqwqwerkljDialogPlusDialog(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            if (r3 != 0) goto L82
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r0.lastPosition
            java.lang.String r2 = r0.startDirPath
            r1.remove(r2)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r0.startDirPath
            r1.<init>(r2)
            java.io.File r2 = r1.getParentFile()
            if (r2 == 0) goto L2b
            java.lang.String r2 = r1.getParent()
            r0.startDirPath = r2
            java.io.File r1 = r1.getParentFile()
            boolean r1 = r1.canRead()
            if (r1 != 0) goto L2f
            java.lang.String r1 = r0.mainPath
            r0.startDirPath = r1
            goto L2f
        L2b:
            java.lang.String r1 = r0.mainPath
            r0.startDirPath = r1
        L2f:
            java.lang.Object r1 = r0.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r1 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r1
            android.widget.TextView r1 = r1.dialogFilePath
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "当前目录:"
            r2.<init>(r3)
            java.lang.String r3 = r0.startDirPath
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            java.lang.String r1 = r0.startDirPath
            java.io.File[] r1 = r0.getFiles(r1)
            r0.files = r1
            com.usidqw.qwerklj.Adapter.DialogSelectFileAdapter r2 = r0.dialogSelectFileAdapter
            r2.setData(r1)
            com.usidqw.qwerklj.Adapter.DialogSelectFileAdapter r1 = r0.dialogSelectFileAdapter
            java.lang.String r2 = r0.startDirPath
            r1.setPath(r2)
            java.lang.Object r1 = r0.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r1 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r1
            android.widget.ListView r1 = r1.listView
            com.usidqw.qwerklj.Adapter.DialogSelectFileAdapter r2 = r0.dialogSelectFileAdapter
            r1.setAdapter(r2)
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r0.lastPosition
            java.lang.String r2 = r0.startDirPath
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Le6
            java.lang.Object r2 = r0.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r2 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r2
            android.widget.ListView r2 = r2.listView
            int r1 = r1.intValue()
            r2.setSelection(r1)
            goto Le6
        L82:
            java.io.File[] r1 = r0.files
            int r3 = r3 + (-1)
            r1 = r1[r3]
            boolean r1 = r1.isDirectory()
            if (r1 == 0) goto Ld6
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r0.lastPosition
            java.lang.String r2 = r0.startDirPath
            java.lang.Object r4 = r0.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r4 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r4
            android.widget.ListView r4 = r4.listView
            int r4 = r4.getFirstVisiblePosition()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.put(r2, r4)
            java.io.File[] r1 = r0.files
            r1 = r1[r3]
            java.lang.String r1 = r1.getPath()
            r0.startDirPath = r1
            java.io.File[] r1 = r0.getFiles(r1)
            r0.files = r1
            com.usidqw.qwerklj.Adapter.DialogSelectFileAdapter r2 = r0.dialogSelectFileAdapter
            r2.setData(r1)
            com.usidqw.qwerklj.Adapter.DialogSelectFileAdapter r1 = r0.dialogSelectFileAdapter
            java.lang.String r2 = r0.startDirPath
            r1.setPath(r2)
            java.lang.Object r1 = r0.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r1 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r1
            android.widget.ListView r1 = r1.listView
            com.usidqw.qwerklj.Adapter.DialogSelectFileAdapter r2 = r0.dialogSelectFileAdapter
            r1.setAdapter(r2)
            java.lang.Object r1 = r0.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r1 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r1
            android.widget.TextView r1 = r1.dialogFilePath
            java.lang.String r2 = r0.startDirPath
            r1.setText(r2)
            goto Le6
        Ld6:
            com.usidqw.qwerklj.Dialog.PlusDialog$SelectFile r1 = r0.selectFileCall
            if (r1 == 0) goto Le1
            java.io.File[] r2 = r0.files
            r2 = r2[r3]
            r1.success(r2)
        Le1:
            android.app.Dialog r1 = r0.dialog
            r1.dismiss()
        Le6:
            return
    }

    /* renamed from: lambda$Dialog_selectFile$12$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m166lambda$Dialog_selectFile$12$comusidqwqwerkljDialogPlusDialog() {
            r2 = this;
            java.lang.String[] r0 = r2.fileTypes
            if (r0 != 0) goto Ld
            java.lang.String r0 = r2.startDirPath
            java.io.File[] r0 = com.usidqw.qwerklj.Utils.FileUtils.listDirs(r0)
            r2.files = r0
            goto L2a
        Ld:
            int r1 = r0.length
            if (r1 != 0) goto L1a
            java.lang.String r0 = r2.startDirPath
            r1 = 0
            java.io.File[] r0 = com.usidqw.qwerklj.Utils.FileUtils.listDirsAndFiles(r0, r1)
            r2.files = r0
            goto L22
        L1a:
            java.lang.String r1 = r2.startDirPath
            java.io.File[] r0 = com.usidqw.qwerklj.Utils.FileUtils.listDirsAndFiles(r1, r0)
            r2.files = r0
        L22:
            java.io.File[] r0 = r2.files
            if (r0 == 0) goto L4b
            int r0 = r0.length
            if (r0 != 0) goto L2a
            goto L4b
        L2a:
            com.usidqw.qwerklj.Adapter.DialogSelectFileAdapter r0 = r2.dialogSelectFileAdapter
            java.io.File[] r1 = r2.files
            r0.setData(r1)
            java.lang.Object r0 = r2.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r0
            android.widget.ListView r0 = r0.listView
            com.usidqw.qwerklj.Adapter.DialogSelectFileAdapter r1 = r2.dialogSelectFileAdapter
            r0.setAdapter(r1)
            java.lang.Object r0 = r2.bind
            com.usidqw.qwerklj.databinding.PlusDialogFileBinding r0 = (com.usidqw.qwerklj.databinding.PlusDialogFileBinding) r0
            android.widget.ListView r0 = r0.listView
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda7 r1 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda7
            r1.<init>(r2)
            r0.setOnItemClickListener(r1)
            return
        L4b:
            com.usidqw.qwerklj.Dialog.PlusDialog r0 = new com.usidqw.qwerklj.Dialog.PlusDialog
            android.app.Activity r1 = r2.activity
            r0.<init>(r1)
            com.usidqw.qwerklj.Dialog.DialogType r1 = com.usidqw.qwerklj.Dialog.DialogType.MESSAGE
            r0.setType(r1)
            r1 = 0
            r0.setShowCancelButton(r1)
            java.lang.String r1 = "没有发现文件"
            r0.setDesc(r1)
            r0.show()
            return
    }

    /* renamed from: lambda$Dialog_selectFile$9$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m167lambda$Dialog_selectFile$9$comusidqwqwerkljDialogPlusDialog(android.view.View r1) {
            r0 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$OnCancel r1 = r0.onCancelCall
            if (r1 == 0) goto L7
            r1.cancel()
        L7:
            android.app.Dialog r1 = r0.dialog
            r1.dismiss()
            return
    }

    /* renamed from: lambda$Dialog_touch$33$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m168lambda$Dialog_touch$33$comusidqwqwerkljDialogPlusDialog(java.util.concurrent.atomic.AtomicInteger r2, com.usidqw.qwerklj.Dialog.PlusDialog r3, com.usidqw.qwerklj.Json.DialogListItem r4, int r5) {
            r1 = this;
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r5 = r1.touch_list
            int r0 = r2.get()
            java.lang.Object r5 = r5.get(r0)
            com.usidqw.qwerklj.Json.DialogTouchList r5 = (com.usidqw.qwerklj.Json.DialogTouchList) r5
            java.lang.String r0 = r4.getTitle()
            r5.setTitle(r0)
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r5 = r1.touch_list
            int r2 = r2.get()
            java.lang.Object r2 = r5.get(r2)
            com.usidqw.qwerklj.Json.DialogTouchList r2 = (com.usidqw.qwerklj.Json.DialogTouchList) r2
            java.lang.String r4 = r4.getDesc()
            int r4 = java.lang.Integer.parseInt(r4)
            r2.setId(r4)
            android.app.Dialog r2 = r3.getDialog()
            r2.dismiss()
            r1.TouchListReq()
            return
    }

    /* renamed from: lambda$Dialog_touch$34$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m169lambda$Dialog_touch$34$comusidqwqwerkljDialogPlusDialog(java.util.concurrent.atomic.AtomicInteger r4, android.view.View r5) {
            r3 = this;
            int r5 = r5.getId()
            r0 = 0
            switch(r5) {
                case 2139488717: goto L32;
                case 2139488718: goto L2d;
                case 2139488719: goto L28;
                case 2139488720: goto L23;
                case 2139488721: goto L1e;
                case 2139488722: goto L19;
                case 2139488723: goto L14;
                case 2139488724: goto Lf;
                case 2139488725: goto L9;
                default: goto L8;
            }
        L8:
            goto L35
        L9:
            r5 = 8
            r4.set(r5)
            goto L35
        Lf:
            r5 = 7
            r4.set(r5)
            goto L35
        L14:
            r5 = 6
            r4.set(r5)
            goto L35
        L19:
            r5 = 5
            r4.set(r5)
            goto L35
        L1e:
            r5 = 4
            r4.set(r5)
            goto L35
        L23:
            r5 = 3
            r4.set(r5)
            goto L35
        L28:
            r5 = 2
            r4.set(r5)
            goto L35
        L2d:
            r5 = 1
            r4.set(r5)
            goto L35
        L32:
            r4.set(r0)
        L35:
            com.usidqw.qwerklj.Dialog.PlusDialog r5 = new com.usidqw.qwerklj.Dialog.PlusDialog
            android.app.Activity r1 = r3.activity
            r5.<init>(r1)
            com.usidqw.qwerklj.Json.JsonHookSettingList$DataBean r1 = r3.touchItemList
            java.lang.String r1 = r1.getTitle()
            r5.setTitle(r1)
            com.usidqw.qwerklj.Dialog.DialogType r1 = com.usidqw.qwerklj.Dialog.DialogType.LIST_ITEM
            r5.setType(r1)
            r5.setShowOpenButton(r0)
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            com.usidqw.qwerklj.Json.JsonHookSettingList$DataBean r1 = r3.touchItemList
            java.lang.String r1 = r1.getItemvalue()
            com.usidqw.qwerklj.Dialog.PlusDialog$2 r2 = new com.usidqw.qwerklj.Dialog.PlusDialog$2
            r2.<init>(r3)
            java.lang.reflect.Type r2 = r2.getType()
            java.lang.Object r0 = r0.fromJson(r1, r2)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L6b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r0.next()
            com.usidqw.qwerklj.Json.HookSetItemValue r1 = (com.usidqw.qwerklj.Json.HookSetItemValue) r1
            java.lang.String r2 = r1.getTitle()
            java.lang.String r1 = r1.getValue()
            r5.addItemOpen(r2, r1)
            goto L6b
        L83:
            com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda14 r0 = new com.usidqw.qwerklj.Dialog.PlusDialog$$ExternalSyntheticLambda14
            r0.<init>(r3, r4, r5)
            r5.setOnListClick(r0)
            r5.show()
            return
    }

    /* renamed from: lambda$Dialog_touch$35$com-usidqw-qwerklj-Dialog-PlusDialog, reason: not valid java name */
    /* synthetic */ void m170lambda$Dialog_touch$35$comusidqwqwerkljDialogPlusDialog(android.view.View r3) {
            r2 = this;
            com.usidqw.qwerklj.Dialog.PlusDialog$InputClick r3 = r2.inputClickCall
            if (r3 == 0) goto L12
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.util.List<com.usidqw.qwerklj.Json.DialogTouchList> r1 = r2.touch_list
            java.lang.String r0 = r0.toJson(r1)
            r3.success(r0)
        L12:
            android.app.Dialog r3 = r2.dialog
            r3.dismiss()
            return
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setAdapter(android.widget.BaseAdapter r1) {
            r0 = this;
            r0.adapter = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setButtonCancelTitle(java.lang.String r1) {
            r0 = this;
            r0.buttonCancelTitle = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setButtonSuccessTitle(java.lang.String r1) {
            r0 = this;
            r0.buttonSuccessTitle = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setCancelable(boolean r1) {
            r0 = this;
            r0.cancelable = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setCanceledOnTouchOutside(boolean r1) {
            r0 = this;
            r0.canceledOnTouchOutside = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setDesc(java.lang.String r1) {
            r0 = this;
            r0.desc = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setDescGravity(int r1) {
            r0 = this;
            r0.descGravity = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setDismiss(boolean r1) {
            r0 = this;
            r0.isDismiss = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setGravity(int r1) {
            r0 = this;
            r0.gravity = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setHint(java.lang.String r1) {
            r0 = this;
            r0.hint = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setInputSelectImg(boolean r1) {
            r0 = this;
            r0.isSetInputSelectImg = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setInputType(int r1) {
            r0 = this;
            r0.InputType = r1
            return r0
    }

    public void setItemDesc(int r2, java.lang.String r3) {
            r1 = this;
            com.usidqw.qwerklj.Adapter.DialogListItemAdapter r0 = r1.dialogListItemAdapter
            if (r0 == 0) goto L7
            r0.setItemDesc(r2, r3)
        L7:
            return
    }

    public void setItemDesc(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.usidqw.qwerklj.Adapter.DialogListItemAdapter r0 = r1.dialogListItemAdapter
            if (r0 == 0) goto L7
            r0.setItemDesc(r2, r3)
        L7:
            return
    }

    public void setItemDescNoNotifyDataSetChanged(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.usidqw.qwerklj.Adapter.DialogListItemAdapter r0 = r1.dialogListItemAdapter
            if (r0 == 0) goto L7
            r0.setItemDescNoNotifyDataSetChanged(r2, r3)
        L7:
            return
    }

    public void setItemSwitch(int r2, boolean r3) {
            r1 = this;
            com.usidqw.qwerklj.Adapter.DialogListItemAdapter r0 = r1.dialogListItemAdapter
            if (r0 == 0) goto L7
            r0.setItemSwitch(r2, r3)
        L7:
            return
    }

    public void setItemSwitchNoNotifyDataSetChanged(java.lang.String r2, boolean r3) {
            r1 = this;
            com.usidqw.qwerklj.Adapter.DialogListItemAdapter r0 = r1.dialogListItemAdapter
            if (r0 == 0) goto L7
            r0.setItemSwitchNoNotifyDataSetChanged(r2, r3)
        L7:
            return
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setKey(java.lang.String r1) {
            r0 = this;
            r0.key = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setListEdit(java.util.List<com.usidqw.qwerklj.Json.DialogListEdit> r1) {
            r0 = this;
            r0.dialogListEdit = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setOnCancel(com.usidqw.qwerklj.Dialog.PlusDialog.OnCancel r1) {
            r0 = this;
            r0.onCancelCall = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setOnClickInput(com.usidqw.qwerklj.Dialog.PlusDialog.InputClick r1) {
            r0 = this;
            r0.inputClickCall = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setOnClickMessage(com.usidqw.qwerklj.Dialog.PlusDialog.Message r1) {
            r0 = this;
            r0.messageCall = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setOnClickSelectFile(com.usidqw.qwerklj.Dialog.PlusDialog.SelectFile r1) {
            r0 = this;
            r0.selectFileCall = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setOnInputKeyOrValue(com.usidqw.qwerklj.Dialog.PlusDialog.InputClickKeyValue r1) {
            r0 = this;
            r0.inputClickKeyValueCall = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setOnListClick(com.usidqw.qwerklj.Dialog.PlusDialog.ListOnClick r1) {
            r0 = this;
            r0.listOnClickCall = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setSelectFileType(java.lang.String r3, java.lang.String[] r4) {
            r2 = this;
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L1d
            java.io.File r3 = r0.getParentFile()
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3)
            java.io.File r3 = (java.io.File) r3
            java.lang.String r3 = r3.getPath()
        L1d:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L28
            java.lang.String r3 = r2.mainPath
            r2.startDirPath = r3
            goto L2a
        L28:
            r2.startDirPath = r3
        L2a:
            java.io.File r3 = new java.io.File
            java.lang.String r0 = r2.startDirPath
            r3.<init>(r0)
            boolean r3 = r3.exists()
            if (r3 != 0) goto L3b
            java.lang.String r3 = r2.mainPath
            r2.startDirPath = r3
        L3b:
            r2.fileTypes = r4
            return r2
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setShowCancelButton(boolean r1) {
            r0 = this;
            r0.showCancelButton = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setShowOpenButton(boolean r1) {
            r0 = this;
            r0.showOpenButton = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setShowSuccessButton(boolean r1) {
            r0 = this;
            r0.showSuccessButton = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setTitle(java.lang.String r1) {
            r0 = this;
            r0.title = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setTouchItemList(com.usidqw.qwerklj.Json.JsonHookSettingList.DataBean r1, java.lang.String r2) {
            r0 = this;
            r0.touchItemList = r1
            r0.touchValue = r2
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setType(com.usidqw.qwerklj.Dialog.DialogType r2) {
            r1 = this;
            r1.type = r2
            com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.LIST_ITEM
            if (r2 != r0) goto L9
            r2 = 0
            r1.showSuccessButton = r2
        L9:
            return r1
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setValue(java.lang.String r1) {
            r0 = this;
            r0.value = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setValueHint(java.lang.String r1) {
            r0 = this;
            r0.hintValue = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setView(android.view.View r1) {
            r0 = this;
            r0.view = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setViewHeight(int r1) {
            r0 = this;
            r0.viewHeight = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setViewWidth(int r1) {
            r0 = this;
            r0.viewWidth = r1
            return r0
    }

    public com.usidqw.qwerklj.Dialog.PlusDialog setWaitBackground(int r1) {
            r0 = this;
            r0.WaitBackgroundType = r1
            return r0
    }

    public android.app.Dialog show() {
            r1 = this;
            r0 = -2
            android.app.Dialog r0 = r1.show(r0, r0)
            return r0
    }

    public android.app.Dialog show(int r3, int r4) {
            r2 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.app.Activity r1 = r2.activity
            r0.<init>(r1)
            android.app.AlertDialog r0 = r0.create()
            r2.dialog = r0
            r0.show()
            android.app.Dialog r0 = r2.dialog
            android.view.Window r0 = r0.getWindow()
            r2.window = r0
            com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.WAIT
            android.view.Window r0 = r2.window
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            r2.params = r0
            android.app.Dialog r0 = r2.dialog
            boolean r1 = r2.canceledOnTouchOutside
            r0.setCanceledOnTouchOutside(r1)
            boolean r0 = r2.canceledOnTouchOutside
            if (r0 == 0) goto L34
            android.app.Dialog r0 = r2.dialog
            r1 = 1
            r0.setCancelable(r1)
            goto L3b
        L34:
            android.app.Dialog r0 = r2.dialog
            boolean r1 = r2.cancelable
            r0.setCancelable(r1)
        L3b:
            int r0 = r2.viewHeight
            r1 = -100
            if (r0 == r1) goto L46
            android.view.WindowManager$LayoutParams r4 = r2.params
            r4.height = r0
            goto L4a
        L46:
            android.view.WindowManager$LayoutParams r0 = r2.params
            r0.height = r4
        L4a:
            int r4 = r2.viewWidth
            if (r4 == r1) goto L53
            android.view.WindowManager$LayoutParams r3 = r2.params
            r3.width = r4
            goto L57
        L53:
            android.view.WindowManager$LayoutParams r4 = r2.params
            r4.width = r3
        L57:
            android.view.View r3 = r2.view
            if (r3 != 0) goto L7f
            com.usidqw.qwerklj.Dialog.DialogType r3 = r2.type
            com.usidqw.qwerklj.Dialog.DialogType r4 = com.usidqw.qwerklj.Dialog.DialogType.MESSAGE
            if (r3 != r4) goto L7f
            android.view.WindowManager$LayoutParams r3 = r2.params
            android.app.Activity r4 = r2.activity
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.widthPixels
            android.app.Activity r0 = r2.activity
            r1 = 1117782016(0x42a00000, float:80.0)
            int r0 = com.usidqw.qwerklj.Utils.Tools.dip2px(r0, r1)
            int r4 = r4 - r0
            r3.width = r4
            android.view.WindowManager$LayoutParams r3 = r2.params
            r4 = -2
            r3.height = r4
        L7f:
            com.usidqw.qwerklj.Dialog.DialogType r3 = r2.type
            com.usidqw.qwerklj.Dialog.DialogType r4 = com.usidqw.qwerklj.Dialog.DialogType.SELECT_FILE
            if (r3 != r4) goto Ld8
            android.app.Activity r3 = r2.activity     // Catch: java.lang.IllegalStateException -> La8
            com.hjq.permissions.XXPermissions r3 = com.hjq.permissions.XXPermissions.with(r3)     // Catch: java.lang.IllegalStateException -> La8
            java.lang.String r4 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.IllegalStateException -> La8
            com.hjq.permissions.XXPermissions r3 = r3.permission(r4)     // Catch: java.lang.IllegalStateException -> La8
            java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.IllegalStateException -> La8
            com.hjq.permissions.XXPermissions r3 = r3.permission(r4)     // Catch: java.lang.IllegalStateException -> La8
            com.usidqw.qwerklj.Dialog.PlusDialog$1 r4 = new com.usidqw.qwerklj.Dialog.PlusDialog$1     // Catch: java.lang.IllegalStateException -> La8
            r4.<init>(r2)     // Catch: java.lang.IllegalStateException -> La8
            r3.request(r4)     // Catch: java.lang.IllegalStateException -> La8
            goto Ld5
        La8:
            r3 = move-exception
            r3.printStackTrace()
            com.usidqw.qwerklj.Dialog.PlusDialog r4 = new com.usidqw.qwerklj.Dialog.PlusDialog
            android.app.Activity r0 = r2.activity
            r4.<init>(r0)
            com.usidqw.qwerklj.Dialog.DialogType r0 = com.usidqw.qwerklj.Dialog.DialogType.MESSAGE
            r4.setType(r0)
            r0 = 0
            r4.setShowCancelButton(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "获取存储权限失败:\n"
            r0.<init>(r1)
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.setDesc(r3)
            r4.show()
        Ld5:
            android.app.Dialog r3 = r2.dialog
            return r3
        Ld8:
            android.app.Dialog r3 = r2._show()
            return r3
    }
}
