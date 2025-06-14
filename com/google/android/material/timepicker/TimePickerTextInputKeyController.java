package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class TimePickerTextInputKeyController implements android.widget.TextView.OnEditorActionListener, android.view.View.OnKeyListener {
    private final com.google.android.material.timepicker.ChipTextInputComboView hourLayoutComboView;
    private boolean keyListenerRunning;
    private final com.google.android.material.timepicker.ChipTextInputComboView minuteLayoutComboView;
    private final com.google.android.material.timepicker.TimeModel time;

    TimePickerTextInputKeyController(com.google.android.material.timepicker.ChipTextInputComboView r2, com.google.android.material.timepicker.ChipTextInputComboView r3, com.google.android.material.timepicker.TimeModel r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.keyListenerRunning = r0
            r1.hourLayoutComboView = r2
            r1.minuteLayoutComboView = r3
            r1.time = r4
            return
    }

    private void moveSelection(int r5) {
            r4 = this;
            com.google.android.material.timepicker.ChipTextInputComboView r0 = r4.minuteLayoutComboView
            r1 = 12
            r2 = 1
            r3 = 0
            if (r5 != r1) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r3
        Lb:
            r0.setChecked(r1)
            com.google.android.material.timepicker.ChipTextInputComboView r0 = r4.hourLayoutComboView
            r1 = 10
            if (r5 != r1) goto L15
            goto L16
        L15:
            r2 = r3
        L16:
            r0.setChecked(r2)
            com.google.android.material.timepicker.TimeModel r0 = r4.time
            r0.selection = r5
            return
    }

    private boolean onHourKeyPress(int r5, android.view.KeyEvent r6, android.widget.EditText r7) {
            r4 = this;
            android.text.Editable r0 = r7.getText()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = 7
            r3 = 1
            if (r5 < r2) goto L25
            r2 = 16
            if (r5 > r2) goto L25
            int r5 = r6.getAction()
            if (r5 != r3) goto L25
            int r5 = r7.getSelectionStart()
            r6 = 2
            if (r5 != r6) goto L25
            int r5 = r0.length()
            if (r5 != r6) goto L25
            r5 = r3
            goto L26
        L25:
            r5 = r1
        L26:
            if (r5 == 0) goto L2e
            r5 = 12
            r4.moveSelection(r5)
            return r3
        L2e:
            return r1
    }

    private boolean onMinuteKeyPress(int r4, android.view.KeyEvent r5, android.widget.EditText r6) {
            r3 = this;
            r0 = 67
            r1 = 1
            r2 = 0
            if (r4 != r0) goto L18
            int r4 = r5.getAction()
            if (r4 != 0) goto L18
            android.text.Editable r4 = r6.getText()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L18
            r4 = r1
            goto L19
        L18:
            r4 = r2
        L19:
            if (r4 == 0) goto L21
            r4 = 10
            r3.moveSelection(r4)
            return r1
        L21:
            return r2
    }

    public void bind() {
            r3 = this;
            com.google.android.material.timepicker.ChipTextInputComboView r0 = r3.hourLayoutComboView
            com.google.android.material.textfield.TextInputLayout r0 = r0.getTextInput()
            com.google.android.material.timepicker.ChipTextInputComboView r1 = r3.minuteLayoutComboView
            com.google.android.material.textfield.TextInputLayout r1 = r1.getTextInput()
            android.widget.EditText r0 = r0.getEditText()
            android.widget.EditText r1 = r1.getEditText()
            r2 = 268435461(0x10000005, float:2.5243564E-29)
            r0.setImeOptions(r2)
            r2 = 268435462(0x10000006, float:2.5243567E-29)
            r1.setImeOptions(r2)
            r0.setOnEditorActionListener(r3)
            r0.setOnKeyListener(r3)
            r1.setOnKeyListener(r3)
            return
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            r1 = 5
            if (r2 != r1) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            if (r1 == 0) goto Ld
            r2 = 12
            r0.moveSelection(r2)
        Ld:
            return r1
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View r4, int r5, android.view.KeyEvent r6) {
            r3 = this;
            boolean r0 = r3.keyListenerRunning
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            r3.keyListenerRunning = r0
            android.widget.EditText r4 = (android.widget.EditText) r4
            com.google.android.material.timepicker.TimeModel r0 = r3.time
            int r0 = r0.selection
            r2 = 12
            if (r0 != r2) goto L18
            boolean r4 = r3.onMinuteKeyPress(r5, r6, r4)
            goto L1c
        L18:
            boolean r4 = r3.onHourKeyPress(r5, r6, r4)
        L1c:
            r3.keyListenerRunning = r1
            return r4
    }
}
