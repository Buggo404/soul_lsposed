package com.google.android.material.datepicker;

/* loaded from: classes.dex */
public class SingleDateSelector implements com.google.android.material.datepicker.DateSelector<java.lang.Long> {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.SingleDateSelector> CREATOR = null;
    private java.lang.Long selectedItem;



    static {
            com.google.android.material.datepicker.SingleDateSelector$2 r0 = new com.google.android.material.datepicker.SingleDateSelector$2
            r0.<init>()
            com.google.android.material.datepicker.SingleDateSelector.CREATOR = r0
            return
    }

    public SingleDateSelector() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(com.google.android.material.datepicker.SingleDateSelector r0) {
            r0.clearSelection()
            return
    }

    static /* synthetic */ java.lang.Long access$102(com.google.android.material.datepicker.SingleDateSelector r0, java.lang.Long r1) {
            r0.selectedItem = r1
            return r1
    }

    private void clearSelection() {
            r1 = this;
            r0 = 0
            r1.selectedItem = r0
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(android.content.Context r3) {
            r2 = this;
            int r0 = com.google.android.material.C0479R.attr.materialCalendarTheme
            java.lang.Class<com.google.android.material.datepicker.MaterialDatePicker> r1 = com.google.android.material.datepicker.MaterialDatePicker.class
            java.lang.String r1 = r1.getCanonicalName()
            int r3 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r3, r0, r1)
            return r3
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
            r1 = this;
            int r0 = com.google.android.material.C0479R.string.mtrl_picker_date_header_title
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.util.Collection<java.lang.Long> getSelectedDays() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Long r1 = r2.selectedItem
            if (r1 == 0) goto Lc
            r0.add(r1)
        Lc:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges() {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.Long getSelection() {
            r1 = this;
            java.lang.Long r0 = r1.selectedItem
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ java.lang.Long getSelection() {
            r1 = this;
            java.lang.Long r0 = r1.getSelection()
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.String getSelectionDisplayString(android.content.Context r5) {
            r4 = this;
            android.content.res.Resources r5 = r5.getResources()
            java.lang.Long r0 = r4.selectedItem
            if (r0 != 0) goto Lf
            int r0 = com.google.android.material.C0479R.string.mtrl_picker_date_header_unselected
            java.lang.String r5 = r5.getString(r0)
            return r5
        Lf:
            long r0 = r0.longValue()
            java.lang.String r0 = com.google.android.material.datepicker.DateStrings.getYearMonthDay(r0)
            int r1 = com.google.android.material.C0479R.string.mtrl_picker_date_header_selected
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r5 = r5.getString(r1, r2)
            return r5
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
            r1 = this;
            java.lang.Long r0 = r1.selectedItem
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public android.view.View onCreateTextInputView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10, com.google.android.material.datepicker.CalendarConstraints r11, com.google.android.material.datepicker.OnSelectionChangedListener<java.lang.Long> r12) {
            r7 = this;
            int r10 = com.google.android.material.C0479R.layout.mtrl_picker_text_input_date
            r0 = 0
            android.view.View r8 = r8.inflate(r10, r9, r0)
            int r9 = com.google.android.material.C0479R.id.mtrl_picker_text_input_date
            android.view.View r9 = r8.findViewById(r9)
            r4 = r9
            com.google.android.material.textfield.TextInputLayout r4 = (com.google.android.material.textfield.TextInputLayout) r4
            android.widget.EditText r9 = r4.getEditText()
            boolean r10 = com.google.android.material.internal.ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()
            if (r10 == 0) goto L1f
            r10 = 17
            r9.setInputType(r10)
        L1f:
            java.text.SimpleDateFormat r3 = com.google.android.material.datepicker.UtcDates.getTextInputFormat()
            android.content.res.Resources r10 = r8.getResources()
            java.lang.String r2 = com.google.android.material.datepicker.UtcDates.getTextInputHint(r10, r3)
            r4.setPlaceholderText(r2)
            java.lang.Long r10 = r7.selectedItem
            if (r10 == 0) goto L39
            java.lang.String r10 = r3.format(r10)
            r9.setText(r10)
        L39:
            com.google.android.material.datepicker.SingleDateSelector$1 r10 = new com.google.android.material.datepicker.SingleDateSelector$1
            r0 = r10
            r1 = r7
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.addTextChangedListener(r10)
            com.google.android.material.internal.ViewUtils.requestFocusAndShowKeyboard(r9)
            return r8
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long r1) {
            r0 = this;
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.selectedItem = r1
            return
    }

    /* renamed from: setSelection, reason: avoid collision after fix types in other method */
    public void setSelection2(java.lang.Long r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L10
        L4:
            long r0 = r3.longValue()
            long r0 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L10:
            r2.selectedItem = r3
            return
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ void setSelection(java.lang.Long r1) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            r0.setSelection2(r1)
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.Long r2 = r0.selectedItem
            r1.writeValue(r2)
            return
    }
}
