package com.google.android.material.datepicker;

/* loaded from: classes.dex */
abstract class DateFormatTextWatcher extends com.google.android.material.internal.TextWatcherAdapter {
    private static final int VALIDATION_DELAY = 1000;
    private final com.google.android.material.datepicker.CalendarConstraints constraints;
    private final java.text.DateFormat dateFormat;
    private final java.lang.String outOfRange;
    private final java.lang.Runnable setErrorCallback;
    private java.lang.Runnable setRangeErrorCallback;
    private final com.google.android.material.textfield.TextInputLayout textInputLayout;



    DateFormatTextWatcher(java.lang.String r1, java.text.DateFormat r2, com.google.android.material.textfield.TextInputLayout r3, com.google.android.material.datepicker.CalendarConstraints r4) {
            r0 = this;
            r0.<init>()
            r0.dateFormat = r2
            r0.textInputLayout = r3
            r0.constraints = r4
            android.content.Context r2 = r3.getContext()
            int r3 = com.google.android.material.C0479R.string.mtrl_picker_out_of_range
            java.lang.String r2 = r2.getString(r3)
            r0.outOfRange = r2
            com.google.android.material.datepicker.DateFormatTextWatcher$1 r2 = new com.google.android.material.datepicker.DateFormatTextWatcher$1
            r2.<init>(r0, r1)
            r0.setErrorCallback = r2
            return
    }

    static /* synthetic */ com.google.android.material.textfield.TextInputLayout access$000(com.google.android.material.datepicker.DateFormatTextWatcher r0) {
            com.google.android.material.textfield.TextInputLayout r0 = r0.textInputLayout
            return r0
    }

    static /* synthetic */ java.text.DateFormat access$100(com.google.android.material.datepicker.DateFormatTextWatcher r0) {
            java.text.DateFormat r0 = r0.dateFormat
            return r0
    }

    static /* synthetic */ java.lang.String access$200(com.google.android.material.datepicker.DateFormatTextWatcher r0) {
            java.lang.String r0 = r0.outOfRange
            return r0
    }

    private java.lang.Runnable createRangeErrorCallback(long r2) {
            r1 = this;
            com.google.android.material.datepicker.DateFormatTextWatcher$2 r0 = new com.google.android.material.datepicker.DateFormatTextWatcher$2
            r0.<init>(r1, r2)
            return r0
    }

    void onInvalidDate() {
            r0 = this;
            return
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout
            java.lang.Runnable r3 = r0.setErrorCallback
            r2.removeCallbacks(r3)
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout
            java.lang.Runnable r3 = r0.setRangeErrorCallback
            r2.removeCallbacks(r3)
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout
            r3 = 0
            r2.setError(r3)
            r0.onValidDate(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L1e
            return
        L1e:
            java.text.DateFormat r2 = r0.dateFormat     // Catch: java.text.ParseException -> L5d
            java.lang.String r1 = r1.toString()     // Catch: java.text.ParseException -> L5d
            java.util.Date r1 = r2.parse(r1)     // Catch: java.text.ParseException -> L5d
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout     // Catch: java.text.ParseException -> L5d
            r2.setError(r3)     // Catch: java.text.ParseException -> L5d
            long r2 = r1.getTime()     // Catch: java.text.ParseException -> L5d
            com.google.android.material.datepicker.CalendarConstraints r4 = r0.constraints     // Catch: java.text.ParseException -> L5d
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r4 = r4.getDateValidator()     // Catch: java.text.ParseException -> L5d
            boolean r4 = r4.isValid(r2)     // Catch: java.text.ParseException -> L5d
            if (r4 == 0) goto L51
            com.google.android.material.datepicker.CalendarConstraints r4 = r0.constraints     // Catch: java.text.ParseException -> L5d
            boolean r4 = r4.isWithinBounds(r2)     // Catch: java.text.ParseException -> L5d
            if (r4 == 0) goto L51
            long r1 = r1.getTime()     // Catch: java.text.ParseException -> L5d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.text.ParseException -> L5d
            r0.onValidDate(r1)     // Catch: java.text.ParseException -> L5d
            return
        L51:
            java.lang.Runnable r1 = r0.createRangeErrorCallback(r2)     // Catch: java.text.ParseException -> L5d
            r0.setRangeErrorCallback = r1     // Catch: java.text.ParseException -> L5d
            com.google.android.material.textfield.TextInputLayout r2 = r0.textInputLayout     // Catch: java.text.ParseException -> L5d
            r0.runValidation(r2, r1)     // Catch: java.text.ParseException -> L5d
            goto L64
        L5d:
            com.google.android.material.textfield.TextInputLayout r1 = r0.textInputLayout
            java.lang.Runnable r2 = r0.setErrorCallback
            r0.runValidation(r1, r2)
        L64:
            return
    }

    abstract void onValidDate(java.lang.Long r1);

    public void runValidation(android.view.View r3, java.lang.Runnable r4) {
            r2 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r4, r0)
            return
    }
}
