package com.google.android.material.datepicker;

/* loaded from: classes.dex */
public class RangeDateSelector implements com.google.android.material.datepicker.DateSelector<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.RangeDateSelector> CREATOR = null;
    private final java.lang.String invalidRangeEndError;
    private java.lang.String invalidRangeStartError;
    private java.lang.Long proposedTextEnd;
    private java.lang.Long proposedTextStart;
    private java.lang.Long selectedEndItem;
    private java.lang.Long selectedStartItem;




    static {
            com.google.android.material.datepicker.RangeDateSelector$3 r0 = new com.google.android.material.datepicker.RangeDateSelector$3
            r0.<init>()
            com.google.android.material.datepicker.RangeDateSelector.CREATOR = r0
            return
    }

    public RangeDateSelector() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = " "
            r1.invalidRangeEndError = r0
            r0 = 0
            r1.selectedStartItem = r0
            r1.selectedEndItem = r0
            r1.proposedTextStart = r0
            r1.proposedTextEnd = r0
            return
    }

    static /* synthetic */ java.lang.Long access$002(com.google.android.material.datepicker.RangeDateSelector r0, java.lang.Long r1) {
            r0.proposedTextStart = r1
            return r1
    }

    static /* synthetic */ void access$100(com.google.android.material.datepicker.RangeDateSelector r0, com.google.android.material.textfield.TextInputLayout r1, com.google.android.material.textfield.TextInputLayout r2, com.google.android.material.datepicker.OnSelectionChangedListener r3) {
            r0.updateIfValidTextProposal(r1, r2, r3)
            return
    }

    static /* synthetic */ java.lang.Long access$202(com.google.android.material.datepicker.RangeDateSelector r0, java.lang.Long r1) {
            r0.proposedTextEnd = r1
            return r1
    }

    static /* synthetic */ java.lang.Long access$302(com.google.android.material.datepicker.RangeDateSelector r0, java.lang.Long r1) {
            r0.selectedStartItem = r1
            return r1
    }

    static /* synthetic */ java.lang.Long access$402(com.google.android.material.datepicker.RangeDateSelector r0, java.lang.Long r1) {
            r0.selectedEndItem = r1
            return r1
    }

    private void clearInvalidRange(com.google.android.material.textfield.TextInputLayout r4, com.google.android.material.textfield.TextInputLayout r5) {
            r3 = this;
            java.lang.CharSequence r0 = r4.getError()
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.String r0 = r3.invalidRangeStartError
            java.lang.CharSequence r2 = r4.getError()
            boolean r0 = r0.contentEquals(r2)
            if (r0 == 0) goto L16
            r4.setError(r1)
        L16:
            java.lang.CharSequence r4 = r5.getError()
            if (r4 == 0) goto L2b
            java.lang.String r4 = " "
            java.lang.CharSequence r0 = r5.getError()
            boolean r4 = r4.contentEquals(r0)
            if (r4 == 0) goto L2b
            r5.setError(r1)
        L2b:
            return
    }

    private boolean isValidRange(long r1, long r3) {
            r0 = this;
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    private void setInvalidRange(com.google.android.material.textfield.TextInputLayout r2, com.google.android.material.textfield.TextInputLayout r3) {
            r1 = this;
            java.lang.String r0 = r1.invalidRangeStartError
            r2.setError(r0)
            java.lang.String r2 = " "
            r3.setError(r2)
            return
    }

    private void updateIfValidTextProposal(com.google.android.material.textfield.TextInputLayout r5, com.google.android.material.textfield.TextInputLayout r6, com.google.android.material.datepicker.OnSelectionChangedListener<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> r7) {
            r4 = this;
            java.lang.Long r0 = r4.proposedTextStart
            if (r0 == 0) goto L30
            java.lang.Long r1 = r4.proposedTextEnd
            if (r1 != 0) goto L9
            goto L30
        L9:
            long r0 = r0.longValue()
            java.lang.Long r2 = r4.proposedTextEnd
            long r2 = r2.longValue()
            boolean r0 = r4.isValidRange(r0, r2)
            if (r0 == 0) goto L29
            java.lang.Long r5 = r4.proposedTextStart
            r4.selectedStartItem = r5
            java.lang.Long r5 = r4.proposedTextEnd
            r4.selectedEndItem = r5
            androidx.core.util.Pair r5 = r4.getSelection()
            r7.onSelectionChanged(r5)
            goto L2f
        L29:
            r4.setInvalidRange(r5, r6)
            r7.onIncompleteSelectionChanged()
        L2f:
            return
        L30:
            r4.clearInvalidRange(r5, r6)
            r7.onIncompleteSelectionChanged()
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(android.content.Context r4) {
            r3 = this;
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r2 = com.google.android.material.C0479R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis
            int r0 = r0.getDimensionPixelSize(r2)
            int r2 = r1.widthPixels
            int r1 = r1.heightPixels
            int r1 = java.lang.Math.min(r2, r1)
            if (r1 <= r0) goto L1b
            int r0 = com.google.android.material.C0479R.attr.materialCalendarTheme
            goto L1d
        L1b:
            int r0 = com.google.android.material.C0479R.attr.materialCalendarFullscreenTheme
        L1d:
            java.lang.Class<com.google.android.material.datepicker.MaterialDatePicker> r1 = com.google.android.material.datepicker.MaterialDatePicker.class
            java.lang.String r1 = r1.getCanonicalName()
            int r4 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r4, r0, r1)
            return r4
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
            r1 = this;
            int r0 = com.google.android.material.C0479R.string.mtrl_picker_range_header_title
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.util.Collection<java.lang.Long> getSelectedDays() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Long r1 = r2.selectedStartItem
            if (r1 == 0) goto Lc
            r0.add(r1)
        Lc:
            java.lang.Long r1 = r2.selectedEndItem
            if (r1 == 0) goto L13
            r0.add(r1)
        L13:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges() {
            r4 = this;
            java.lang.Long r0 = r4.selectedStartItem
            if (r0 == 0) goto L1b
            java.lang.Long r0 = r4.selectedEndItem
            if (r0 != 0) goto L9
            goto L1b
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.core.util.Pair r1 = new androidx.core.util.Pair
            java.lang.Long r2 = r4.selectedStartItem
            java.lang.Long r3 = r4.selectedEndItem
            r1.<init>(r2, r3)
            r0.add(r1)
            return r0
        L1b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    public androidx.core.util.Pair<java.lang.Long, java.lang.Long> getSelection() {
            r3 = this;
            androidx.core.util.Pair r0 = new androidx.core.util.Pair
            java.lang.Long r1 = r3.selectedStartItem
            java.lang.Long r2 = r3.selectedEndItem
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ androidx.core.util.Pair<java.lang.Long, java.lang.Long> getSelection() {
            r1 = this;
            androidx.core.util.Pair r0 = r1.getSelection()
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.String getSelectionDisplayString(android.content.Context r7) {
            r6 = this;
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Long r0 = r6.selectedStartItem
            if (r0 != 0) goto L13
            java.lang.Long r1 = r6.selectedEndItem
            if (r1 != 0) goto L13
            int r0 = com.google.android.material.C0479R.string.mtrl_picker_range_header_unselected
            java.lang.String r7 = r7.getString(r0)
            return r7
        L13:
            java.lang.Long r1 = r6.selectedEndItem
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2e
            int r0 = com.google.android.material.C0479R.string.mtrl_picker_range_header_only_start_selected
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Long r3 = r6.selectedStartItem
            long r3 = r3.longValue()
            java.lang.String r3 = com.google.android.material.datepicker.DateStrings.getDateString(r3)
            r1[r2] = r3
            java.lang.String r7 = r7.getString(r0, r1)
            return r7
        L2e:
            if (r0 != 0) goto L45
            int r0 = com.google.android.material.C0479R.string.mtrl_picker_range_header_only_end_selected
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Long r3 = r6.selectedEndItem
            long r3 = r3.longValue()
            java.lang.String r3 = com.google.android.material.datepicker.DateStrings.getDateString(r3)
            r1[r2] = r3
            java.lang.String r7 = r7.getString(r0, r1)
            return r7
        L45:
            androidx.core.util.Pair r0 = com.google.android.material.datepicker.DateStrings.getDateRangeString(r0, r1)
            int r1 = com.google.android.material.C0479R.string.mtrl_picker_range_header_selected
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            F r5 = r0.first
            r4[r2] = r5
            S r0 = r0.second
            r4[r3] = r0
            java.lang.String r7 = r7.getString(r1, r4)
            return r7
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
            r4 = this;
            java.lang.Long r0 = r4.selectedStartItem
            if (r0 == 0) goto L1a
            java.lang.Long r1 = r4.selectedEndItem
            if (r1 == 0) goto L1a
            long r0 = r0.longValue()
            java.lang.Long r2 = r4.selectedEndItem
            long r2 = r2.longValue()
            boolean r0 = r4.isValidRange(r0, r2)
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public android.view.View onCreateTextInputView(android.view.LayoutInflater r18, android.view.ViewGroup r19, android.os.Bundle r20, com.google.android.material.datepicker.CalendarConstraints r21, com.google.android.material.datepicker.OnSelectionChangedListener<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> r22) {
            r17 = this;
            r9 = r17
            int r0 = com.google.android.material.C0479R.layout.mtrl_picker_text_input_date_range
            r1 = 0
            r2 = r18
            r3 = r19
            android.view.View r10 = r2.inflate(r0, r3, r1)
            int r0 = com.google.android.material.C0479R.id.mtrl_picker_text_input_range_start
            android.view.View r0 = r10.findViewById(r0)
            r11 = r0
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            int r0 = com.google.android.material.C0479R.id.mtrl_picker_text_input_range_end
            android.view.View r0 = r10.findViewById(r0)
            r12 = r0
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            android.widget.EditText r13 = r11.getEditText()
            android.widget.EditText r14 = r12.getEditText()
            boolean r0 = com.google.android.material.internal.ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()
            if (r0 == 0) goto L35
            r0 = 17
            r13.setInputType(r0)
            r14.setInputType(r0)
        L35:
            android.content.res.Resources r0 = r10.getResources()
            int r1 = com.google.android.material.C0479R.string.mtrl_picker_invalid_range
            java.lang.String r0 = r0.getString(r1)
            r9.invalidRangeStartError = r0
            java.text.SimpleDateFormat r15 = com.google.android.material.datepicker.UtcDates.getTextInputFormat()
            java.lang.Long r0 = r9.selectedStartItem
            if (r0 == 0) goto L54
            java.lang.String r0 = r15.format(r0)
            r13.setText(r0)
            java.lang.Long r0 = r9.selectedStartItem
            r9.proposedTextStart = r0
        L54:
            java.lang.Long r0 = r9.selectedEndItem
            if (r0 == 0) goto L63
            java.lang.String r0 = r15.format(r0)
            r14.setText(r0)
            java.lang.Long r0 = r9.selectedEndItem
            r9.proposedTextEnd = r0
        L63:
            android.content.res.Resources r0 = r10.getResources()
            java.lang.String r8 = com.google.android.material.datepicker.UtcDates.getTextInputHint(r0, r15)
            r11.setPlaceholderText(r8)
            r12.setPlaceholderText(r8)
            com.google.android.material.datepicker.RangeDateSelector$1 r7 = new com.google.android.material.datepicker.RangeDateSelector$1
            r0 = r7
            r1 = r17
            r2 = r8
            r3 = r15
            r4 = r11
            r5 = r21
            r6 = r11
            r9 = r7
            r7 = r12
            r16 = r8
            r8 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.addTextChangedListener(r9)
            com.google.android.material.datepicker.RangeDateSelector$2 r9 = new com.google.android.material.datepicker.RangeDateSelector$2
            r0 = r9
            r2 = r16
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.addTextChangedListener(r9)
            com.google.android.material.internal.ViewUtils.requestFocusAndShowKeyboard(r13)
            return r10
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long r3) {
            r2 = this;
            java.lang.Long r0 = r2.selectedStartItem
            if (r0 != 0) goto Lb
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.selectedStartItem = r3
            goto L29
        Lb:
            java.lang.Long r1 = r2.selectedEndItem
            if (r1 != 0) goto L20
            long r0 = r0.longValue()
            boolean r0 = r2.isValidRange(r0, r3)
            if (r0 == 0) goto L20
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.selectedEndItem = r3
            goto L29
        L20:
            r0 = 0
            r2.selectedEndItem = r0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.selectedStartItem = r3
        L29:
            return
    }

    /* renamed from: setSelection, reason: avoid collision after fix types in other method */
    public void setSelection2(androidx.core.util.Pair<java.lang.Long, java.lang.Long> r5) {
            r4 = this;
            F r0 = r5.first
            if (r0 == 0) goto L1f
            S r0 = r5.second
            if (r0 == 0) goto L1f
            F r0 = r5.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            S r2 = r5.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            boolean r0 = r4.isValidRange(r0, r2)
            androidx.core.util.Preconditions.checkArgument(r0)
        L1f:
            F r0 = r5.first
            r1 = 0
            if (r0 != 0) goto L26
            r0 = r1
            goto L36
        L26:
            F r0 = r5.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r2 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
        L36:
            r4.selectedStartItem = r0
            S r0 = r5.second
            if (r0 != 0) goto L3d
            goto L4d
        L3d:
            S r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            long r0 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L4d:
            r4.selectedEndItem = r1
            return
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ void setSelection(androidx.core.util.Pair<java.lang.Long, java.lang.Long> r1) {
            r0 = this;
            androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
            r0.setSelection2(r1)
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.Long r2 = r0.selectedStartItem
            r1.writeValue(r2)
            java.lang.Long r2 = r0.selectedEndItem
            r1.writeValue(r2)
            return
    }
}
