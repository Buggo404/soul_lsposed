package com.google.android.material.datepicker;

/* loaded from: classes.dex */
public final class MaterialDatePicker<S> extends androidx.fragment.app.DialogFragment {
    private static final java.lang.String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    static final java.lang.Object CANCEL_BUTTON_TAG = null;
    static final java.lang.Object CONFIRM_BUTTON_TAG = null;
    private static final java.lang.String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    public static final int INPUT_MODE_CALENDAR = 0;
    private static final java.lang.String INPUT_MODE_KEY = "INPUT_MODE_KEY";
    public static final int INPUT_MODE_TEXT = 1;
    private static final java.lang.String OVERRIDE_THEME_RES_ID = "OVERRIDE_THEME_RES_ID";
    private static final java.lang.String TITLE_TEXT_KEY = "TITLE_TEXT_KEY";
    private static final java.lang.String TITLE_TEXT_RES_ID_KEY = "TITLE_TEXT_RES_ID_KEY";
    static final java.lang.Object TOGGLE_BUTTON_TAG = null;
    private com.google.android.material.shape.MaterialShapeDrawable background;
    private com.google.android.material.datepicker.MaterialCalendar<S> calendar;
    private com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    private android.widget.Button confirmButton;
    private com.google.android.material.datepicker.DateSelector<S> dateSelector;
    private boolean fullscreen;
    private android.widget.TextView headerSelectionText;
    private com.google.android.material.internal.CheckableImageButton headerToggleButton;
    private int inputMode;
    private final java.util.LinkedHashSet<android.content.DialogInterface.OnCancelListener> onCancelListeners;
    private final java.util.LinkedHashSet<android.content.DialogInterface.OnDismissListener> onDismissListeners;
    private final java.util.LinkedHashSet<android.view.View.OnClickListener> onNegativeButtonClickListeners;
    private final java.util.LinkedHashSet<com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S>> onPositiveButtonClickListeners;
    private int overrideThemeResId;
    private com.google.android.material.datepicker.PickerFragment<S> pickerFragment;
    private java.lang.CharSequence titleText;
    private int titleTextResId;





    public static final class Builder<S> {
        com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
        final com.google.android.material.datepicker.DateSelector<S> dateSelector;
        int inputMode;
        int overrideThemeResId;
        S selection;
        java.lang.CharSequence titleText;
        int titleTextResId;

        private Builder(com.google.android.material.datepicker.DateSelector<S> r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.overrideThemeResId = r0
                r2.titleTextResId = r0
                r1 = 0
                r2.titleText = r1
                r2.selection = r1
                r2.inputMode = r0
                r2.dateSelector = r3
                return
        }

        private com.google.android.material.datepicker.Month createDefaultOpenAt() {
                r7 = this;
                com.google.android.material.datepicker.CalendarConstraints r0 = r7.calendarConstraints
                com.google.android.material.datepicker.Month r0 = r0.getStart()
                long r0 = r0.timeInMillis
                com.google.android.material.datepicker.CalendarConstraints r2 = r7.calendarConstraints
                com.google.android.material.datepicker.Month r2 = r2.getEnd()
                long r2 = r2.timeInMillis
                com.google.android.material.datepicker.DateSelector<S> r4 = r7.dateSelector
                java.util.Collection r4 = r4.getSelectedDays()
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L3d
                com.google.android.material.datepicker.DateSelector<S> r4 = r7.dateSelector
                java.util.Collection r4 = r4.getSelectedDays()
                java.util.Iterator r4 = r4.iterator()
                java.lang.Object r4 = r4.next()
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 < 0) goto L3d
                int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r6 > 0) goto L3d
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.create(r4)
                return r0
            L3d:
                long r4 = com.google.android.material.datepicker.MaterialDatePicker.thisMonthInUtcMilliseconds()
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 > 0) goto L4a
                int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r2 > 0) goto L4a
                r0 = r4
            L4a:
                com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.create(r0)
                return r0
        }

        public static <S> com.google.android.material.datepicker.MaterialDatePicker.Builder<S> customDatePicker(com.google.android.material.datepicker.DateSelector<S> r1) {
                com.google.android.material.datepicker.MaterialDatePicker$Builder r0 = new com.google.android.material.datepicker.MaterialDatePicker$Builder
                r0.<init>(r1)
                return r0
        }

        public static com.google.android.material.datepicker.MaterialDatePicker.Builder<java.lang.Long> datePicker() {
                com.google.android.material.datepicker.MaterialDatePicker$Builder r0 = new com.google.android.material.datepicker.MaterialDatePicker$Builder
                com.google.android.material.datepicker.SingleDateSelector r1 = new com.google.android.material.datepicker.SingleDateSelector
                r1.<init>()
                r0.<init>(r1)
                return r0
        }

        public static com.google.android.material.datepicker.MaterialDatePicker.Builder<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> dateRangePicker() {
                com.google.android.material.datepicker.MaterialDatePicker$Builder r0 = new com.google.android.material.datepicker.MaterialDatePicker$Builder
                com.google.android.material.datepicker.RangeDateSelector r1 = new com.google.android.material.datepicker.RangeDateSelector
                r1.<init>()
                r0.<init>(r1)
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker<S> build() {
                r2 = this;
                com.google.android.material.datepicker.CalendarConstraints r0 = r2.calendarConstraints
                if (r0 != 0) goto Lf
                com.google.android.material.datepicker.CalendarConstraints$Builder r0 = new com.google.android.material.datepicker.CalendarConstraints$Builder
                r0.<init>()
                com.google.android.material.datepicker.CalendarConstraints r0 = r0.build()
                r2.calendarConstraints = r0
            Lf:
                int r0 = r2.titleTextResId
                if (r0 != 0) goto L1b
                com.google.android.material.datepicker.DateSelector<S> r0 = r2.dateSelector
                int r0 = r0.getDefaultTitleResId()
                r2.titleTextResId = r0
            L1b:
                S r0 = r2.selection
                if (r0 == 0) goto L24
                com.google.android.material.datepicker.DateSelector<S> r1 = r2.dateSelector
                r1.setSelection(r0)
            L24:
                com.google.android.material.datepicker.CalendarConstraints r0 = r2.calendarConstraints
                com.google.android.material.datepicker.Month r0 = r0.getOpenAt()
                if (r0 != 0) goto L35
                com.google.android.material.datepicker.CalendarConstraints r0 = r2.calendarConstraints
                com.google.android.material.datepicker.Month r1 = r2.createDefaultOpenAt()
                r0.setOpenAt(r1)
            L35:
                com.google.android.material.datepicker.MaterialDatePicker r0 = com.google.android.material.datepicker.MaterialDatePicker.newInstance(r2)
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setCalendarConstraints(com.google.android.material.datepicker.CalendarConstraints r1) {
                r0 = this;
                r0.calendarConstraints = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setInputMode(int r1) {
                r0 = this;
                r0.inputMode = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setSelection(S r1) {
                r0 = this;
                r0.selection = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setTheme(int r1) {
                r0 = this;
                r0.overrideThemeResId = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setTitleText(int r1) {
                r0 = this;
                r0.titleTextResId = r1
                r1 = 0
                r0.titleText = r1
                return r0
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setTitleText(java.lang.CharSequence r1) {
                r0 = this;
                r0.titleText = r1
                r1 = 0
                r0.titleTextResId = r1
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InputMode {
    }

    static {
            java.lang.String r0 = "CONFIRM_BUTTON_TAG"
            com.google.android.material.datepicker.MaterialDatePicker.CONFIRM_BUTTON_TAG = r0
            java.lang.String r0 = "CANCEL_BUTTON_TAG"
            com.google.android.material.datepicker.MaterialDatePicker.CANCEL_BUTTON_TAG = r0
            java.lang.String r0 = "TOGGLE_BUTTON_TAG"
            com.google.android.material.datepicker.MaterialDatePicker.TOGGLE_BUTTON_TAG = r0
            return
    }

    public MaterialDatePicker() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.onPositiveButtonClickListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.onNegativeButtonClickListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.onCancelListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.onDismissListeners = r0
            return
    }

    static /* synthetic */ java.util.LinkedHashSet access$000(com.google.android.material.datepicker.MaterialDatePicker r0) {
            java.util.LinkedHashSet<com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S>> r0 = r0.onPositiveButtonClickListeners
            return r0
    }

    static /* synthetic */ java.util.LinkedHashSet access$100(com.google.android.material.datepicker.MaterialDatePicker r0) {
            java.util.LinkedHashSet<android.view.View$OnClickListener> r0 = r0.onNegativeButtonClickListeners
            return r0
    }

    static /* synthetic */ void access$200(com.google.android.material.datepicker.MaterialDatePicker r0) {
            r0.updateHeader()
            return
    }

    static /* synthetic */ com.google.android.material.datepicker.DateSelector access$300(com.google.android.material.datepicker.MaterialDatePicker r0) {
            com.google.android.material.datepicker.DateSelector<S> r0 = r0.dateSelector
            return r0
    }

    static /* synthetic */ android.widget.Button access$400(com.google.android.material.datepicker.MaterialDatePicker r0) {
            android.widget.Button r0 = r0.confirmButton
            return r0
    }

    static /* synthetic */ com.google.android.material.internal.CheckableImageButton access$500(com.google.android.material.datepicker.MaterialDatePicker r0) {
            com.google.android.material.internal.CheckableImageButton r0 = r0.headerToggleButton
            return r0
    }

    static /* synthetic */ void access$600(com.google.android.material.datepicker.MaterialDatePicker r0, com.google.android.material.internal.CheckableImageButton r1) {
            r0.updateToggleContentDescription(r1)
            return
    }

    static /* synthetic */ void access$700(com.google.android.material.datepicker.MaterialDatePicker r0) {
            r0.startPickerFragment()
            return
    }

    private static android.graphics.drawable.Drawable createHeaderToggleDrawable(android.content.Context r4) {
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable
            r0.<init>()
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r3 = 0
            r1[r3] = r2
            int r2 = com.google.android.material.C0479R.drawable.material_ic_calendar_black_24dp
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r4, r2)
            r0.addState(r1, r2)
            int[] r1 = new int[r3]
            int r2 = com.google.android.material.C0479R.drawable.material_ic_edit_black_24dp
            android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r4, r2)
            r0.addState(r1, r4)
            return r0
    }

    private static int getDialogPickerHeight(android.content.Context r5) {
            android.content.res.Resources r5 = r5.getResources()
            int r0 = com.google.android.material.C0479R.dimen.mtrl_calendar_navigation_height
            int r0 = r5.getDimensionPixelSize(r0)
            int r1 = com.google.android.material.C0479R.dimen.mtrl_calendar_navigation_top_padding
            int r1 = r5.getDimensionPixelOffset(r1)
            int r0 = r0 + r1
            int r1 = com.google.android.material.C0479R.dimen.mtrl_calendar_navigation_bottom_padding
            int r1 = r5.getDimensionPixelOffset(r1)
            int r0 = r0 + r1
            int r1 = com.google.android.material.C0479R.dimen.mtrl_calendar_days_of_week_height
            int r1 = r5.getDimensionPixelSize(r1)
            int r2 = com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS
            int r3 = com.google.android.material.C0479R.dimen.mtrl_calendar_day_height
            int r3 = r5.getDimensionPixelSize(r3)
            int r2 = r2 * r3
            int r3 = com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS
            int r3 = r3 + (-1)
            int r4 = com.google.android.material.C0479R.dimen.mtrl_calendar_month_vertical_padding
            int r4 = r5.getDimensionPixelOffset(r4)
            int r3 = r3 * r4
            int r2 = r2 + r3
            int r3 = com.google.android.material.C0479R.dimen.mtrl_calendar_bottom_padding
            int r5 = r5.getDimensionPixelOffset(r3)
            int r0 = r0 + r1
            int r0 = r0 + r2
            int r0 = r0 + r5
            return r0
    }

    private static int getPaddedPickerWidth(android.content.Context r4) {
            android.content.res.Resources r4 = r4.getResources()
            int r0 = com.google.android.material.C0479R.dimen.mtrl_calendar_content_padding
            int r0 = r4.getDimensionPixelOffset(r0)
            com.google.android.material.datepicker.Month r1 = com.google.android.material.datepicker.Month.current()
            int r1 = r1.daysInWeek
            int r2 = com.google.android.material.C0479R.dimen.mtrl_calendar_day_width
            int r2 = r4.getDimensionPixelSize(r2)
            int r3 = com.google.android.material.C0479R.dimen.mtrl_calendar_month_horizontal_padding
            int r4 = r4.getDimensionPixelOffset(r3)
            int r0 = r0 * 2
            int r2 = r2 * r1
            int r0 = r0 + r2
            int r1 = r1 + (-1)
            int r1 = r1 * r4
            int r0 = r0 + r1
            return r0
    }

    private int getThemeResId(android.content.Context r2) {
            r1 = this;
            int r0 = r1.overrideThemeResId
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.material.datepicker.DateSelector<S> r0 = r1.dateSelector
            int r2 = r0.getDefaultThemeResId(r2)
            return r2
    }

    private void initHeaderToggle(android.content.Context r3) {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.headerToggleButton
            java.lang.Object r1 = com.google.android.material.datepicker.MaterialDatePicker.TOGGLE_BUTTON_TAG
            r0.setTag(r1)
            com.google.android.material.internal.CheckableImageButton r0 = r2.headerToggleButton
            android.graphics.drawable.Drawable r3 = createHeaderToggleDrawable(r3)
            r0.setImageDrawable(r3)
            com.google.android.material.internal.CheckableImageButton r3 = r2.headerToggleButton
            int r0 = r2.inputMode
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            r3.setChecked(r0)
            com.google.android.material.internal.CheckableImageButton r3 = r2.headerToggleButton
            r0 = 0
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r0)
            com.google.android.material.internal.CheckableImageButton r3 = r2.headerToggleButton
            r2.updateToggleContentDescription(r3)
            com.google.android.material.internal.CheckableImageButton r3 = r2.headerToggleButton
            com.google.android.material.datepicker.MaterialDatePicker$4 r0 = new com.google.android.material.datepicker.MaterialDatePicker$4
            r0.<init>(r2)
            r3.setOnClickListener(r0)
            return
    }

    static boolean isFullscreen(android.content.Context r1) {
            r0 = 16843277(0x101020d, float:2.369503E-38)
            boolean r1 = readMaterialCalendarStyleBoolean(r1, r0)
            return r1
    }

    static boolean isNestedScrollable(android.content.Context r1) {
            int r0 = com.google.android.material.C0479R.attr.nestedScrollable
            boolean r1 = readMaterialCalendarStyleBoolean(r1, r0)
            return r1
    }

    static <S> com.google.android.material.datepicker.MaterialDatePicker<S> newInstance(com.google.android.material.datepicker.MaterialDatePicker.Builder<S> r4) {
            com.google.android.material.datepicker.MaterialDatePicker r0 = new com.google.android.material.datepicker.MaterialDatePicker
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "OVERRIDE_THEME_RES_ID"
            int r3 = r4.overrideThemeResId
            r1.putInt(r2, r3)
            java.lang.String r2 = "DATE_SELECTOR_KEY"
            com.google.android.material.datepicker.DateSelector<S> r3 = r4.dateSelector
            r1.putParcelable(r2, r3)
            java.lang.String r2 = "CALENDAR_CONSTRAINTS_KEY"
            com.google.android.material.datepicker.CalendarConstraints r3 = r4.calendarConstraints
            r1.putParcelable(r2, r3)
            java.lang.String r2 = "TITLE_TEXT_RES_ID_KEY"
            int r3 = r4.titleTextResId
            r1.putInt(r2, r3)
            java.lang.String r2 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r3 = r4.titleText
            r1.putCharSequence(r2, r3)
            java.lang.String r2 = "INPUT_MODE_KEY"
            int r4 = r4.inputMode
            r1.putInt(r2, r4)
            r0.setArguments(r1)
            return r0
    }

    static boolean readMaterialCalendarStyleBoolean(android.content.Context r3, int r4) {
            int r0 = com.google.android.material.C0479R.attr.materialCalendarStyle
            java.lang.Class<com.google.android.material.datepicker.MaterialCalendar> r1 = com.google.android.material.datepicker.MaterialCalendar.class
            java.lang.String r1 = r1.getCanonicalName()
            int r0 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r3, r0, r1)
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r4
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r0, r1)
            boolean r4 = r3.getBoolean(r2, r2)
            r3.recycle()
            return r4
    }

    private void startPickerFragment() {
            r3 = this;
            android.content.Context r0 = r3.requireContext()
            int r0 = r3.getThemeResId(r0)
            com.google.android.material.datepicker.DateSelector<S> r1 = r3.dateSelector
            com.google.android.material.datepicker.CalendarConstraints r2 = r3.calendarConstraints
            com.google.android.material.datepicker.MaterialCalendar r1 = com.google.android.material.datepicker.MaterialCalendar.newInstance(r1, r0, r2)
            r3.calendar = r1
            com.google.android.material.internal.CheckableImageButton r1 = r3.headerToggleButton
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L23
            com.google.android.material.datepicker.DateSelector<S> r1 = r3.dateSelector
            com.google.android.material.datepicker.CalendarConstraints r2 = r3.calendarConstraints
            com.google.android.material.datepicker.MaterialTextInputPicker r0 = com.google.android.material.datepicker.MaterialTextInputPicker.newInstance(r1, r0, r2)
            goto L25
        L23:
            com.google.android.material.datepicker.MaterialCalendar<S> r0 = r3.calendar
        L25:
            r3.pickerFragment = r0
            r3.updateHeader()
            androidx.fragment.app.FragmentManager r0 = r3.getChildFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            int r1 = com.google.android.material.C0479R.id.mtrl_calendar_frame
            com.google.android.material.datepicker.PickerFragment<S> r2 = r3.pickerFragment
            r0.replace(r1, r2)
            r0.commitNow()
            com.google.android.material.datepicker.PickerFragment<S> r0 = r3.pickerFragment
            com.google.android.material.datepicker.MaterialDatePicker$3 r1 = new com.google.android.material.datepicker.MaterialDatePicker$3
            r1.<init>(r3)
            r0.addOnSelectionChangedListener(r1)
            return
    }

    public static long thisMonthInUtcMilliseconds() {
            com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.current()
            long r0 = r0.timeInMillis
            return r0
    }

    public static long todayInUtcMilliseconds() {
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            long r0 = r0.getTimeInMillis()
            return r0
    }

    private void updateHeader() {
            r5 = this;
            java.lang.String r0 = r5.getHeaderText()
            android.widget.TextView r1 = r5.headerSelectionText
            int r2 = com.google.android.material.C0479R.string.mtrl_picker_announce_current_selection
            java.lang.String r2 = r5.getString(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.setContentDescription(r2)
            android.widget.TextView r1 = r5.headerSelectionText
            r1.setText(r0)
            return
    }

    private void updateToggleContentDescription(com.google.android.material.internal.CheckableImageButton r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.headerToggleButton
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L13
            android.content.Context r2 = r2.getContext()
            int r0 = com.google.android.material.C0479R.string.mtrl_picker_toggle_to_calendar_input_mode
            java.lang.String r2 = r2.getString(r0)
            goto L1d
        L13:
            android.content.Context r2 = r2.getContext()
            int r0 = com.google.android.material.C0479R.string.mtrl_picker_toggle_to_text_input_mode
            java.lang.String r2 = r2.getString(r0)
        L1d:
            com.google.android.material.internal.CheckableImageButton r0 = r1.headerToggleButton
            r0.setContentDescription(r2)
            return
    }

    public boolean addOnCancelListener(android.content.DialogInterface.OnCancelListener r2) {
            r1 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnCancelListener> r0 = r1.onCancelListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addOnDismissListener(android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnDismissListener> r0 = r1.onDismissListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addOnNegativeButtonClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            java.util.LinkedHashSet<android.view.View$OnClickListener> r0 = r1.onNegativeButtonClickListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addOnPositiveButtonClickListener(com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S> r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S>> r0 = r1.onPositiveButtonClickListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public void clearOnCancelListeners() {
            r1 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnCancelListener> r0 = r1.onCancelListeners
            r0.clear()
            return
    }

    public void clearOnDismissListeners() {
            r1 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnDismissListener> r0 = r1.onDismissListeners
            r0.clear()
            return
    }

    public void clearOnNegativeButtonClickListeners() {
            r1 = this;
            java.util.LinkedHashSet<android.view.View$OnClickListener> r0 = r1.onNegativeButtonClickListeners
            r0.clear()
            return
    }

    public void clearOnPositiveButtonClickListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S>> r0 = r1.onPositiveButtonClickListeners
            r0.clear()
            return
    }

    public java.lang.String getHeaderText() {
            r2 = this;
            com.google.android.material.datepicker.DateSelector<S> r0 = r2.dateSelector
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = r0.getSelectionDisplayString(r1)
            return r0
    }

    public final S getSelection() {
            r1 = this;
            com.google.android.material.datepicker.DateSelector<S> r0 = r1.dateSelector
            java.lang.Object r0 = r0.getSelection()
            return r0
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r3) {
            r2 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnCancelListener> r0 = r2.onCancelListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnCancelListener r1 = (android.content.DialogInterface.OnCancelListener) r1
            r1.onCancel(r3)
            goto L6
        L16:
            super.onCancel(r3)
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            if (r2 != 0) goto L9
            android.os.Bundle r2 = r1.getArguments()
        L9:
            java.lang.String r0 = "OVERRIDE_THEME_RES_ID"
            int r0 = r2.getInt(r0)
            r1.overrideThemeResId = r0
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.DateSelector r0 = (com.google.android.material.datepicker.DateSelector) r0
            r1.dateSelector = r0
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.CalendarConstraints r0 = (com.google.android.material.datepicker.CalendarConstraints) r0
            r1.calendarConstraints = r0
            java.lang.String r0 = "TITLE_TEXT_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.titleTextResId = r0
            java.lang.String r0 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r0 = r2.getCharSequence(r0)
            r1.titleText = r0
            java.lang.String r0 = "INPUT_MODE_KEY"
            int r2 = r2.getInt(r0)
            r1.inputMode = r2
            return
    }

    @Override // androidx.fragment.app.DialogFragment
    public final android.app.Dialog onCreateDialog(android.os.Bundle r7) {
            r6 = this;
            android.app.Dialog r7 = new android.app.Dialog
            android.content.Context r0 = r6.requireContext()
            android.content.Context r1 = r6.requireContext()
            int r1 = r6.getThemeResId(r1)
            r7.<init>(r0, r1)
            android.content.Context r0 = r7.getContext()
            boolean r1 = isFullscreen(r0)
            r6.fullscreen = r1
            int r1 = com.google.android.material.C0479R.attr.colorSurface
            java.lang.Class<com.google.android.material.datepicker.MaterialDatePicker> r2 = com.google.android.material.datepicker.MaterialDatePicker.class
            java.lang.String r2 = r2.getCanonicalName()
            int r1 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r0, r1, r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = new com.google.android.material.shape.MaterialShapeDrawable
            int r3 = com.google.android.material.C0479R.attr.materialCalendarStyle
            int r4 = com.google.android.material.C0479R.style.Widget_MaterialComponents_MaterialCalendar
            r5 = 0
            r2.<init>(r0, r5, r3, r4)
            r6.background = r2
            r2.initializeElevationOverlay(r0)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.background
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setFillColor(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.background
            android.view.Window r1 = r7.getWindow()
            android.view.View r1 = r1.getDecorView()
            float r1 = androidx.core.view.ViewCompat.getElevation(r1)
            r0.setElevation(r1)
            return r7
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
            r4 = this;
            boolean r7 = r4.fullscreen
            if (r7 == 0) goto L7
            int r7 = com.google.android.material.C0479R.layout.mtrl_picker_fullscreen
            goto L9
        L7:
            int r7 = com.google.android.material.C0479R.layout.mtrl_picker_dialog
        L9:
            android.view.View r5 = r5.inflate(r7, r6)
            android.content.Context r6 = r5.getContext()
            boolean r7 = r4.fullscreen
            if (r7 == 0) goto L29
            int r7 = com.google.android.material.C0479R.id.mtrl_calendar_frame
            android.view.View r7 = r5.findViewById(r7)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = getPaddedPickerWidth(r6)
            r2 = -2
            r0.<init>(r1, r2)
            r7.setLayoutParams(r0)
            goto L4d
        L29:
            int r7 = com.google.android.material.C0479R.id.mtrl_calendar_main_pane
            android.view.View r7 = r5.findViewById(r7)
            int r0 = com.google.android.material.C0479R.id.mtrl_calendar_frame
            android.view.View r0 = r5.findViewById(r0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r2 = getPaddedPickerWidth(r6)
            r3 = -1
            r1.<init>(r2, r3)
            r7.setLayoutParams(r1)
            android.content.Context r7 = r4.requireContext()
            int r7 = getDialogPickerHeight(r7)
            r0.setMinimumHeight(r7)
        L4d:
            int r7 = com.google.android.material.C0479R.id.mtrl_picker_header_selection_text
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r4.headerSelectionText = r7
            r0 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r7, r0)
            int r7 = com.google.android.material.C0479R.id.mtrl_picker_header_toggle
            android.view.View r7 = r5.findViewById(r7)
            com.google.android.material.internal.CheckableImageButton r7 = (com.google.android.material.internal.CheckableImageButton) r7
            r4.headerToggleButton = r7
            int r7 = com.google.android.material.C0479R.id.mtrl_picker_title_text
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.CharSequence r1 = r4.titleText
            if (r1 == 0) goto L75
            r7.setText(r1)
            goto L7a
        L75:
            int r1 = r4.titleTextResId
            r7.setText(r1)
        L7a:
            r4.initHeaderToggle(r6)
            int r6 = com.google.android.material.C0479R.id.confirm_button
            android.view.View r6 = r5.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            r4.confirmButton = r6
            com.google.android.material.datepicker.DateSelector<S> r6 = r4.dateSelector
            boolean r6 = r6.isSelectionComplete()
            if (r6 == 0) goto L95
            android.widget.Button r6 = r4.confirmButton
            r6.setEnabled(r0)
            goto L9b
        L95:
            android.widget.Button r6 = r4.confirmButton
            r7 = 0
            r6.setEnabled(r7)
        L9b:
            android.widget.Button r6 = r4.confirmButton
            java.lang.Object r7 = com.google.android.material.datepicker.MaterialDatePicker.CONFIRM_BUTTON_TAG
            r6.setTag(r7)
            android.widget.Button r6 = r4.confirmButton
            com.google.android.material.datepicker.MaterialDatePicker$1 r7 = new com.google.android.material.datepicker.MaterialDatePicker$1
            r7.<init>(r4)
            r6.setOnClickListener(r7)
            int r6 = com.google.android.material.C0479R.id.cancel_button
            android.view.View r6 = r5.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            java.lang.Object r7 = com.google.android.material.datepicker.MaterialDatePicker.CANCEL_BUTTON_TAG
            r6.setTag(r7)
            com.google.android.material.datepicker.MaterialDatePicker$2 r7 = new com.google.android.material.datepicker.MaterialDatePicker$2
            r7.<init>(r4)
            r6.setOnClickListener(r7)
            return r5
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnDismissListener> r0 = r2.onDismissListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            r1.onDismiss(r3)
            goto L6
        L16:
            android.view.View r0 = r2.getView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L21
            r0.removeAllViews()
        L21:
            super.onDismiss(r3)
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle r4) {
            r3 = this;
            super.onSaveInstanceState(r4)
            java.lang.String r0 = "OVERRIDE_THEME_RES_ID"
            int r1 = r3.overrideThemeResId
            r4.putInt(r0, r1)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            com.google.android.material.datepicker.DateSelector<S> r1 = r3.dateSelector
            r4.putParcelable(r0, r1)
            com.google.android.material.datepicker.CalendarConstraints$Builder r0 = new com.google.android.material.datepicker.CalendarConstraints$Builder
            com.google.android.material.datepicker.CalendarConstraints r1 = r3.calendarConstraints
            r0.<init>(r1)
            com.google.android.material.datepicker.MaterialCalendar<S> r1 = r3.calendar
            com.google.android.material.datepicker.Month r1 = r1.getCurrentMonth()
            if (r1 == 0) goto L2b
            com.google.android.material.datepicker.MaterialCalendar<S> r1 = r3.calendar
            com.google.android.material.datepicker.Month r1 = r1.getCurrentMonth()
            long r1 = r1.timeInMillis
            r0.setOpenAt(r1)
        L2b:
            java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.build()
            r4.putParcelable(r1, r0)
            java.lang.String r0 = "TITLE_TEXT_RES_ID_KEY"
            int r1 = r3.titleTextResId
            r4.putInt(r0, r1)
            java.lang.String r0 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r1 = r3.titleText
            r4.putCharSequence(r0, r1)
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
            r9 = this;
            super.onStart()
            android.app.Dialog r0 = r9.requireDialog()
            android.view.Window r0 = r0.getWindow()
            boolean r1 = r9.fullscreen
            if (r1 == 0) goto L19
            r1 = -1
            r0.setLayout(r1, r1)
            com.google.android.material.shape.MaterialShapeDrawable r1 = r9.background
            r0.setBackgroundDrawable(r1)
            goto L4a
        L19:
            r1 = -2
            r0.setLayout(r1, r1)
            android.content.res.Resources r1 = r9.getResources()
            int r2 = com.google.android.material.C0479R.dimen.mtrl_calendar_dialog_background_inset
            int r8 = r1.getDimensionPixelOffset(r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r8, r8, r8, r8)
            android.graphics.drawable.InsetDrawable r2 = new android.graphics.drawable.InsetDrawable
            com.google.android.material.shape.MaterialShapeDrawable r4 = r9.background
            r3 = r2
            r5 = r8
            r6 = r8
            r7 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r0.setBackgroundDrawable(r2)
            android.view.View r0 = r0.getDecorView()
            com.google.android.material.dialog.InsetDialogOnTouchListener r2 = new com.google.android.material.dialog.InsetDialogOnTouchListener
            android.app.Dialog r3 = r9.requireDialog()
            r2.<init>(r3, r1)
            r0.setOnTouchListener(r2)
        L4a:
            r9.startPickerFragment()
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
            r1 = this;
            com.google.android.material.datepicker.PickerFragment<S> r0 = r1.pickerFragment
            r0.clearOnSelectionChangedListeners()
            super.onStop()
            return
    }

    public boolean removeOnCancelListener(android.content.DialogInterface.OnCancelListener r2) {
            r1 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnCancelListener> r0 = r1.onCancelListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public boolean removeOnDismissListener(android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnDismissListener> r0 = r1.onDismissListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public boolean removeOnNegativeButtonClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            java.util.LinkedHashSet<android.view.View$OnClickListener> r0 = r1.onNegativeButtonClickListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public boolean removeOnPositiveButtonClickListener(com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S> r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S>> r0 = r1.onPositiveButtonClickListeners
            boolean r2 = r0.remove(r2)
            return r2
    }
}
