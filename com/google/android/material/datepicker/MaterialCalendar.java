package com.google.android.material.datepicker;

/* loaded from: classes.dex */
public final class MaterialCalendar<S> extends com.google.android.material.datepicker.PickerFragment<S> {
    private static final java.lang.String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final java.lang.String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final java.lang.String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    static final java.lang.Object MONTHS_VIEW_GROUP_TAG = null;
    static final java.lang.Object NAVIGATION_NEXT_TAG = null;
    static final java.lang.Object NAVIGATION_PREV_TAG = null;
    static final java.lang.Object SELECTOR_TOGGLE_TAG = null;
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final java.lang.String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    private com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    private com.google.android.material.datepicker.MaterialCalendar.CalendarSelector calendarSelector;
    private com.google.android.material.datepicker.CalendarStyle calendarStyle;
    private com.google.android.material.datepicker.Month current;
    private com.google.android.material.datepicker.DateSelector<S> dateSelector;
    private android.view.View dayFrame;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private int themeResId;
    private android.view.View yearFrame;
    private androidx.recyclerview.widget.RecyclerView yearSelector;











    enum CalendarSelector extends java.lang.Enum<com.google.android.material.datepicker.MaterialCalendar.CalendarSelector> {
        private static final /* synthetic */ com.google.android.material.datepicker.MaterialCalendar.CalendarSelector[] $VALUES = null;
        public static final com.google.android.material.datepicker.MaterialCalendar.CalendarSelector DAY = null;
        public static final com.google.android.material.datepicker.MaterialCalendar.CalendarSelector YEAR = null;

        static {
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = new com.google.android.material.datepicker.MaterialCalendar$CalendarSelector
                java.lang.String r1 = "DAY"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY = r0
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r1 = new com.google.android.material.datepicker.MaterialCalendar$CalendarSelector
                java.lang.String r3 = "YEAR"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR = r1
                r3 = 2
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector[] r3 = new com.google.android.material.datepicker.MaterialCalendar.CalendarSelector[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.$VALUES = r3
                return
        }

        CalendarSelector(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.material.datepicker.MaterialCalendar.CalendarSelector valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.material.datepicker.MaterialCalendar$CalendarSelector> r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r1 = (com.google.android.material.datepicker.MaterialCalendar.CalendarSelector) r1
                return r1
        }

        public static com.google.android.material.datepicker.MaterialCalendar.CalendarSelector[] values() {
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector[] r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.material.datepicker.MaterialCalendar$CalendarSelector[] r0 = (com.google.android.material.datepicker.MaterialCalendar.CalendarSelector[]) r0
                return r0
        }
    }

    interface OnDayClickListener {
        void onDayClick(long r1);
    }

    static {
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            com.google.android.material.datepicker.MaterialCalendar.MONTHS_VIEW_GROUP_TAG = r0
            java.lang.String r0 = "NAVIGATION_PREV_TAG"
            com.google.android.material.datepicker.MaterialCalendar.NAVIGATION_PREV_TAG = r0
            java.lang.String r0 = "NAVIGATION_NEXT_TAG"
            com.google.android.material.datepicker.MaterialCalendar.NAVIGATION_NEXT_TAG = r0
            java.lang.String r0 = "SELECTOR_TOGGLE_TAG"
            com.google.android.material.datepicker.MaterialCalendar.SELECTOR_TOGGLE_TAG = r0
            return
    }

    public MaterialCalendar() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ androidx.recyclerview.widget.RecyclerView access$000(com.google.android.material.datepicker.MaterialCalendar r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerView
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.CalendarConstraints access$100(com.google.android.material.datepicker.MaterialCalendar r0) {
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.calendarConstraints
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.DateSelector access$200(com.google.android.material.datepicker.MaterialCalendar r0) {
            com.google.android.material.datepicker.DateSelector<S> r0 = r0.dateSelector
            return r0
    }

    static /* synthetic */ androidx.recyclerview.widget.RecyclerView access$300(com.google.android.material.datepicker.MaterialCalendar r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.yearSelector
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.CalendarStyle access$400(com.google.android.material.datepicker.MaterialCalendar r0) {
            com.google.android.material.datepicker.CalendarStyle r0 = r0.calendarStyle
            return r0
    }

    static /* synthetic */ android.view.View access$500(com.google.android.material.datepicker.MaterialCalendar r0) {
            android.view.View r0 = r0.dayFrame
            return r0
    }

    static /* synthetic */ com.google.android.material.datepicker.Month access$602(com.google.android.material.datepicker.MaterialCalendar r0, com.google.android.material.datepicker.Month r1) {
            r0.current = r1
            return r1
    }

    private void addActionsToMonthNavigation(android.view.View r5, com.google.android.material.datepicker.MonthsPagerAdapter r6) {
            r4 = this;
            int r0 = com.google.android.material.C0479R.id.month_navigation_fragment_toggle
            android.view.View r0 = r5.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.Object r1 = com.google.android.material.datepicker.MaterialCalendar.SELECTOR_TOGGLE_TAG
            r0.setTag(r1)
            com.google.android.material.datepicker.MaterialCalendar$5 r1 = new com.google.android.material.datepicker.MaterialCalendar$5
            r1.<init>(r4)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            int r1 = com.google.android.material.C0479R.id.month_navigation_previous
            android.view.View r1 = r5.findViewById(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.Object r2 = com.google.android.material.datepicker.MaterialCalendar.NAVIGATION_PREV_TAG
            r1.setTag(r2)
            int r2 = com.google.android.material.C0479R.id.month_navigation_next
            android.view.View r2 = r5.findViewById(r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            java.lang.Object r3 = com.google.android.material.datepicker.MaterialCalendar.NAVIGATION_NEXT_TAG
            r2.setTag(r3)
            int r3 = com.google.android.material.C0479R.id.mtrl_calendar_year_selector_frame
            android.view.View r3 = r5.findViewById(r3)
            r4.yearFrame = r3
            int r3 = com.google.android.material.C0479R.id.mtrl_calendar_day_selector_frame
            android.view.View r3 = r5.findViewById(r3)
            r4.dayFrame = r3
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r3 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY
            r4.setSelector(r3)
            com.google.android.material.datepicker.Month r3 = r4.current
            android.content.Context r5 = r5.getContext()
            java.lang.String r5 = r3.getLongName(r5)
            r0.setText(r5)
            androidx.recyclerview.widget.RecyclerView r5 = r4.recyclerView
            com.google.android.material.datepicker.MaterialCalendar$6 r3 = new com.google.android.material.datepicker.MaterialCalendar$6
            r3.<init>(r4, r6, r0)
            r5.addOnScrollListener(r3)
            com.google.android.material.datepicker.MaterialCalendar$7 r5 = new com.google.android.material.datepicker.MaterialCalendar$7
            r5.<init>(r4)
            r0.setOnClickListener(r5)
            com.google.android.material.datepicker.MaterialCalendar$8 r5 = new com.google.android.material.datepicker.MaterialCalendar$8
            r5.<init>(r4, r6)
            r2.setOnClickListener(r5)
            com.google.android.material.datepicker.MaterialCalendar$9 r5 = new com.google.android.material.datepicker.MaterialCalendar$9
            r5.<init>(r4, r6)
            r1.setOnClickListener(r5)
            return
    }

    private androidx.recyclerview.widget.RecyclerView.ItemDecoration createItemDecoration() {
            r1 = this;
            com.google.android.material.datepicker.MaterialCalendar$4 r0 = new com.google.android.material.datepicker.MaterialCalendar$4
            r0.<init>(r1)
            return r0
    }

    static int getDayHeight(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            int r0 = com.google.android.material.C0479R.dimen.mtrl_calendar_day_height
            int r1 = r1.getDimensionPixelSize(r0)
            return r1
    }

    public static <T> com.google.android.material.datepicker.MaterialCalendar<T> newInstance(com.google.android.material.datepicker.DateSelector<T> r3, int r4, com.google.android.material.datepicker.CalendarConstraints r5) {
            com.google.android.material.datepicker.MaterialCalendar r0 = new com.google.android.material.datepicker.MaterialCalendar
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "THEME_RES_ID_KEY"
            r1.putInt(r2, r4)
            java.lang.String r4 = "GRID_SELECTOR_KEY"
            r1.putParcelable(r4, r3)
            java.lang.String r3 = "CALENDAR_CONSTRAINTS_KEY"
            r1.putParcelable(r3, r5)
            java.lang.String r3 = "CURRENT_MONTH_KEY"
            com.google.android.material.datepicker.Month r4 = r5.getOpenAt()
            r1.putParcelable(r3, r4)
            r0.setArguments(r1)
            return r0
    }

    private void postSmoothRecyclerViewScroll(int r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.recyclerView
            com.google.android.material.datepicker.MaterialCalendar$10 r1 = new com.google.android.material.datepicker.MaterialCalendar$10
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(com.google.android.material.datepicker.OnSelectionChangedListener<S> r1) {
            r0 = this;
            boolean r1 = super.addOnSelectionChangedListener(r1)
            return r1
    }

    com.google.android.material.datepicker.CalendarConstraints getCalendarConstraints() {
            r1 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r1.calendarConstraints
            return r0
    }

    com.google.android.material.datepicker.CalendarStyle getCalendarStyle() {
            r1 = this;
            com.google.android.material.datepicker.CalendarStyle r0 = r1.calendarStyle
            return r0
    }

    com.google.android.material.datepicker.Month getCurrentMonth() {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.current
            return r0
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public com.google.android.material.datepicker.DateSelector<S> getDateSelector() {
            r1 = this;
            com.google.android.material.datepicker.DateSelector<S> r0 = r1.dateSelector
            return r0
    }

    androidx.recyclerview.widget.LinearLayoutManager getLayoutManager() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.recyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            if (r2 != 0) goto L9
            android.os.Bundle r2 = r1.getArguments()
        L9:
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.themeResId = r0
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.DateSelector r0 = (com.google.android.material.datepicker.DateSelector) r0
            r1.dateSelector = r0
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.CalendarConstraints r0 = (com.google.android.material.datepicker.CalendarConstraints) r0
            r1.calendarConstraints = r0
            java.lang.String r0 = "CURRENT_MONTH_KEY"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            com.google.android.material.datepicker.Month r2 = (com.google.android.material.datepicker.Month) r2
            r1.current = r2
            return
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
            r10 = this;
            android.view.ContextThemeWrapper r13 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r10.getContext()
            int r1 = r10.themeResId
            r13.<init>(r0, r1)
            com.google.android.material.datepicker.CalendarStyle r0 = new com.google.android.material.datepicker.CalendarStyle
            r0.<init>(r13)
            r10.calendarStyle = r0
            android.view.LayoutInflater r11 = r11.cloneInContext(r13)
            com.google.android.material.datepicker.CalendarConstraints r0 = r10.calendarConstraints
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            boolean r1 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r13)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L28
            int r1 = com.google.android.material.C0479R.layout.mtrl_calendar_vertical
            r9 = r2
            goto L2b
        L28:
            int r1 = com.google.android.material.C0479R.layout.mtrl_calendar_horizontal
            r9 = r3
        L2b:
            android.view.View r11 = r11.inflate(r1, r12, r3)
            int r12 = com.google.android.material.C0479R.id.mtrl_calendar_days_of_week
            android.view.View r12 = r11.findViewById(r12)
            android.widget.GridView r12 = (android.widget.GridView) r12
            com.google.android.material.datepicker.MaterialCalendar$1 r1 = new com.google.android.material.datepicker.MaterialCalendar$1
            r1.<init>(r10)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r12, r1)
            com.google.android.material.datepicker.DaysOfWeekAdapter r1 = new com.google.android.material.datepicker.DaysOfWeekAdapter
            r1.<init>()
            r12.setAdapter(r1)
            int r0 = r0.daysInWeek
            r12.setNumColumns(r0)
            r12.setEnabled(r3)
            int r12 = com.google.android.material.C0479R.id.mtrl_calendar_months
            android.view.View r12 = r11.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r10.recyclerView = r12
            com.google.android.material.datepicker.MaterialCalendar$2 r12 = new com.google.android.material.datepicker.MaterialCalendar$2
            android.content.Context r6 = r10.getContext()
            r8 = 0
            r4 = r12
            r5 = r10
            r7 = r9
            r4.<init>(r5, r6, r7, r8, r9)
            androidx.recyclerview.widget.RecyclerView r0 = r10.recyclerView
            r0.setLayoutManager(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.recyclerView
            java.lang.Object r0 = com.google.android.material.datepicker.MaterialCalendar.MONTHS_VIEW_GROUP_TAG
            r12.setTag(r0)
            com.google.android.material.datepicker.MonthsPagerAdapter r12 = new com.google.android.material.datepicker.MonthsPagerAdapter
            com.google.android.material.datepicker.DateSelector<S> r0 = r10.dateSelector
            com.google.android.material.datepicker.CalendarConstraints r1 = r10.calendarConstraints
            com.google.android.material.datepicker.MaterialCalendar$3 r4 = new com.google.android.material.datepicker.MaterialCalendar$3
            r4.<init>(r10)
            r12.<init>(r13, r0, r1, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r10.recyclerView
            r0.setAdapter(r12)
            android.content.res.Resources r0 = r13.getResources()
            int r1 = com.google.android.material.C0479R.integer.mtrl_calendar_year_selector_span
            int r0 = r0.getInteger(r1)
            int r1 = com.google.android.material.C0479R.id.mtrl_calendar_year_selector_frame
            android.view.View r1 = r11.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r10.yearSelector = r1
            if (r1 == 0) goto Lbb
            r1.setHasFixedSize(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r10.yearSelector
            androidx.recyclerview.widget.GridLayoutManager r4 = new androidx.recyclerview.widget.GridLayoutManager
            r4.<init>(r13, r0, r2, r3)
            r1.setLayoutManager(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r10.yearSelector
            com.google.android.material.datepicker.YearGridAdapter r1 = new com.google.android.material.datepicker.YearGridAdapter
            r1.<init>(r10)
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r10.yearSelector
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r1 = r10.createItemDecoration()
            r0.addItemDecoration(r1)
        Lbb:
            int r0 = com.google.android.material.C0479R.id.month_navigation_fragment_toggle
            android.view.View r0 = r11.findViewById(r0)
            if (r0 == 0) goto Lc6
            r10.addActionsToMonthNavigation(r11, r12)
        Lc6:
            boolean r13 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r13)
            if (r13 != 0) goto Ld6
            androidx.recyclerview.widget.PagerSnapHelper r13 = new androidx.recyclerview.widget.PagerSnapHelper
            r13.<init>()
            androidx.recyclerview.widget.RecyclerView r0 = r10.recyclerView
            r13.attachToRecyclerView(r0)
        Ld6:
            androidx.recyclerview.widget.RecyclerView r13 = r10.recyclerView
            com.google.android.material.datepicker.Month r0 = r10.current
            int r12 = r12.getPosition(r0)
            r13.scrollToPosition(r12)
            return r11
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r1 = r2.themeResId
            r3.putInt(r0, r1)
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            com.google.android.material.datepicker.DateSelector<S> r1 = r2.dateSelector
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            com.google.android.material.datepicker.CalendarConstraints r1 = r2.calendarConstraints
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "CURRENT_MONTH_KEY"
            com.google.android.material.datepicker.Month r1 = r2.current
            r3.putParcelable(r0, r1)
            return
    }

    void setCurrentMonth(com.google.android.material.datepicker.Month r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.recyclerView
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            com.google.android.material.datepicker.MonthsPagerAdapter r0 = (com.google.android.material.datepicker.MonthsPagerAdapter) r0
            int r1 = r0.getPosition(r7)
            com.google.android.material.datepicker.Month r2 = r6.current
            int r0 = r0.getPosition(r2)
            int r0 = r1 - r0
            int r2 = java.lang.Math.abs(r0)
            r3 = 3
            r4 = 1
            r5 = 0
            if (r2 <= r3) goto L1f
            r2 = r4
            goto L20
        L1f:
            r2 = r5
        L20:
            if (r0 <= 0) goto L23
            goto L24
        L23:
            r4 = r5
        L24:
            r6.current = r7
            if (r2 == 0) goto L35
            if (r4 == 0) goto L35
            androidx.recyclerview.widget.RecyclerView r7 = r6.recyclerView
            int r0 = r1 + (-3)
            r7.scrollToPosition(r0)
            r6.postSmoothRecyclerViewScroll(r1)
            goto L45
        L35:
            if (r2 == 0) goto L42
            androidx.recyclerview.widget.RecyclerView r7 = r6.recyclerView
            int r0 = r1 + 3
            r7.scrollToPosition(r0)
            r6.postSmoothRecyclerViewScroll(r1)
            goto L45
        L42:
            r6.postSmoothRecyclerViewScroll(r1)
        L45:
            return
    }

    void setSelector(com.google.android.material.datepicker.MaterialCalendar.CalendarSelector r5) {
            r4 = this;
            r4.calendarSelector = r5
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR
            r1 = 8
            r2 = 0
            if (r5 != r0) goto L2d
            androidx.recyclerview.widget.RecyclerView r5 = r4.yearSelector
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.yearSelector
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            com.google.android.material.datepicker.YearGridAdapter r0 = (com.google.android.material.datepicker.YearGridAdapter) r0
            com.google.android.material.datepicker.Month r3 = r4.current
            int r3 = r3.year
            int r0 = r0.getPositionForYear(r3)
            r5.scrollToPosition(r0)
            android.view.View r5 = r4.yearFrame
            r5.setVisibility(r2)
            android.view.View r5 = r4.dayFrame
            r5.setVisibility(r1)
            goto L40
        L2d:
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY
            if (r5 != r0) goto L40
            android.view.View r5 = r4.yearFrame
            r5.setVisibility(r1)
            android.view.View r5 = r4.dayFrame
            r5.setVisibility(r2)
            com.google.android.material.datepicker.Month r5 = r4.current
            r4.setCurrentMonth(r5)
        L40:
            return
    }

    void toggleVisibleSelector() {
            r2 = this;
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = r2.calendarSelector
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r1 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR
            if (r0 != r1) goto Lc
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY
            r2.setSelector(r0)
            goto L17
        Lc:
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = r2.calendarSelector
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r1 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY
            if (r0 != r1) goto L17
            com.google.android.material.datepicker.MaterialCalendar$CalendarSelector r0 = com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.YEAR
            r2.setSelector(r0)
        L17:
            return
    }
}
