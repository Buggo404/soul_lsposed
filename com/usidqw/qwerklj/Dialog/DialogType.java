package com.usidqw.qwerklj.Dialog;

/* loaded from: classes.dex */
public enum DialogType extends java.lang.Enum<com.usidqw.qwerklj.Dialog.DialogType> {
    private static final /* synthetic */ com.usidqw.qwerklj.Dialog.DialogType[] $VALUES = null;
    public static final com.usidqw.qwerklj.Dialog.DialogType CUSTOM = null;
    public static final com.usidqw.qwerklj.Dialog.DialogType INPUT = null;
    public static final com.usidqw.qwerklj.Dialog.DialogType INPUT_KEY_OR_VALUE = null;
    public static final com.usidqw.qwerklj.Dialog.DialogType INPUT_MULTI = null;
    public static final com.usidqw.qwerklj.Dialog.DialogType LIST_EDIT = null;
    public static final com.usidqw.qwerklj.Dialog.DialogType LIST_EDIT_KEY = null;
    public static final com.usidqw.qwerklj.Dialog.DialogType LIST_ITEM = null;
    public static final com.usidqw.qwerklj.Dialog.DialogType MESSAGE = null;
    public static final com.usidqw.qwerklj.Dialog.DialogType SELECT_FILE = null;
    public static final com.usidqw.qwerklj.Dialog.DialogType TOUCH = null;
    public static final com.usidqw.qwerklj.Dialog.DialogType WAIT = null;
    private final java.lang.String name;
    private final int type;

    private static /* synthetic */ com.usidqw.qwerklj.Dialog.DialogType[] $values() {
            r0 = 11
            com.usidqw.qwerklj.Dialog.DialogType[] r0 = new com.usidqw.qwerklj.Dialog.DialogType[r0]
            r1 = 0
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.WAIT
            r0[r1] = r2
            r1 = 1
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.INPUT
            r0[r1] = r2
            r1 = 2
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.INPUT_MULTI
            r0[r1] = r2
            r1 = 3
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.SELECT_FILE
            r0[r1] = r2
            r1 = 4
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.MESSAGE
            r0[r1] = r2
            r1 = 5
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.LIST_ITEM
            r0[r1] = r2
            r1 = 6
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.LIST_EDIT
            r0[r1] = r2
            r1 = 7
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.INPUT_KEY_OR_VALUE
            r0[r1] = r2
            r1 = 8
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.LIST_EDIT_KEY
            r0[r1] = r2
            r1 = 9
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.CUSTOM
            r0[r1] = r2
            r1 = 10
            com.usidqw.qwerklj.Dialog.DialogType r2 = com.usidqw.qwerklj.Dialog.DialogType.TOUCH
            r0[r1] = r2
            return r0
    }

    static {
            com.usidqw.qwerklj.Dialog.DialogType r0 = new com.usidqw.qwerklj.Dialog.DialogType
            r1 = 0
            java.lang.String r2 = "等待"
            java.lang.String r3 = "WAIT"
            r0.<init>(r3, r1, r2, r1)
            com.usidqw.qwerklj.Dialog.DialogType.WAIT = r0
            com.usidqw.qwerklj.Dialog.DialogType r0 = new com.usidqw.qwerklj.Dialog.DialogType
            r1 = 1
            java.lang.String r2 = "单行输入框"
            java.lang.String r3 = "INPUT"
            r0.<init>(r3, r1, r2, r1)
            com.usidqw.qwerklj.Dialog.DialogType.INPUT = r0
            com.usidqw.qwerklj.Dialog.DialogType r0 = new com.usidqw.qwerklj.Dialog.DialogType
            r1 = 2
            java.lang.String r2 = "多行输入框"
            java.lang.String r3 = "INPUT_MULTI"
            r0.<init>(r3, r1, r2, r1)
            com.usidqw.qwerklj.Dialog.DialogType.INPUT_MULTI = r0
            com.usidqw.qwerklj.Dialog.DialogType r0 = new com.usidqw.qwerklj.Dialog.DialogType
            r1 = 3
            java.lang.String r2 = "选择文件"
            java.lang.String r3 = "SELECT_FILE"
            r0.<init>(r3, r1, r2, r1)
            com.usidqw.qwerklj.Dialog.DialogType.SELECT_FILE = r0
            com.usidqw.qwerklj.Dialog.DialogType r0 = new com.usidqw.qwerklj.Dialog.DialogType
            r1 = 4
            java.lang.String r2 = "提示框"
            java.lang.String r3 = "MESSAGE"
            r0.<init>(r3, r1, r2, r1)
            com.usidqw.qwerklj.Dialog.DialogType.MESSAGE = r0
            com.usidqw.qwerklj.Dialog.DialogType r0 = new com.usidqw.qwerklj.Dialog.DialogType
            r1 = 5
            java.lang.String r2 = "列表框"
            java.lang.String r3 = "LIST_ITEM"
            r0.<init>(r3, r1, r2, r1)
            com.usidqw.qwerklj.Dialog.DialogType.LIST_ITEM = r0
            com.usidqw.qwerklj.Dialog.DialogType r0 = new com.usidqw.qwerklj.Dialog.DialogType
            java.lang.String r1 = "LIST_EDIT"
            r2 = 6
            java.lang.String r3 = "可增加的编辑框"
            r0.<init>(r1, r2, r3, r2)
            com.usidqw.qwerklj.Dialog.DialogType.LIST_EDIT = r0
            com.usidqw.qwerklj.Dialog.DialogType r0 = new com.usidqw.qwerklj.Dialog.DialogType
            r1 = 7
            java.lang.String r2 = "有key和value的输入框"
            java.lang.String r4 = "INPUT_KEY_OR_VALUE"
            r0.<init>(r4, r1, r2, r1)
            com.usidqw.qwerklj.Dialog.DialogType.INPUT_KEY_OR_VALUE = r0
            com.usidqw.qwerklj.Dialog.DialogType r0 = new com.usidqw.qwerklj.Dialog.DialogType
            java.lang.String r1 = "LIST_EDIT_KEY"
            r2 = 8
            r0.<init>(r1, r2, r3, r2)
            com.usidqw.qwerklj.Dialog.DialogType.LIST_EDIT_KEY = r0
            com.usidqw.qwerklj.Dialog.DialogType r0 = new com.usidqw.qwerklj.Dialog.DialogType
            r1 = 9
            java.lang.String r2 = "自定义List"
            java.lang.String r3 = "CUSTOM"
            r0.<init>(r3, r1, r2, r1)
            com.usidqw.qwerklj.Dialog.DialogType.CUSTOM = r0
            com.usidqw.qwerklj.Dialog.DialogType r0 = new com.usidqw.qwerklj.Dialog.DialogType
            r1 = 10
            java.lang.String r2 = "触摸,九宫格"
            java.lang.String r3 = "TOUCH"
            r0.<init>(r3, r1, r2, r1)
            com.usidqw.qwerklj.Dialog.DialogType.TOUCH = r0
            com.usidqw.qwerklj.Dialog.DialogType[] r0 = $values()
            com.usidqw.qwerklj.Dialog.DialogType.$VALUES = r0
            return
    }

    DialogType(java.lang.String r1, int r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.name = r3
            r0.type = r4
            return
    }

    public static com.usidqw.qwerklj.Dialog.DialogType valueOf(java.lang.String r1) {
            java.lang.Class<com.usidqw.qwerklj.Dialog.DialogType> r0 = com.usidqw.qwerklj.Dialog.DialogType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.usidqw.qwerklj.Dialog.DialogType r1 = (com.usidqw.qwerklj.Dialog.DialogType) r1
            return r1
    }

    public static com.usidqw.qwerklj.Dialog.DialogType[] values() {
            com.usidqw.qwerklj.Dialog.DialogType[] r0 = com.usidqw.qwerklj.Dialog.DialogType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.usidqw.qwerklj.Dialog.DialogType[] r0 = (com.usidqw.qwerklj.Dialog.DialogType[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DialogType{name='"
            r0.<init>(r1)
            java.lang.String r1 = r2.name
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "', type="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.type
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
