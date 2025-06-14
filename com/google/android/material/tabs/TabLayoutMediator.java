package com.google.android.material.tabs;

/* loaded from: classes.dex */
public final class TabLayoutMediator {
    private androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter;
    private boolean attached;
    private final boolean autoRefresh;
    private com.google.android.material.tabs.TabLayoutMediator.TabLayoutOnPageChangeCallback onPageChangeCallback;
    private com.google.android.material.tabs.TabLayout.OnTabSelectedListener onTabSelectedListener;
    private androidx.recyclerview.widget.RecyclerView.AdapterDataObserver pagerAdapterObserver;
    private final boolean smoothScroll;
    private final com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy tabConfigurationStrategy;
    private final com.google.android.material.tabs.TabLayout tabLayout;
    private final androidx.viewpager2.widget.ViewPager2 viewPager;

    private class PagerAdapterObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        final /* synthetic */ com.google.android.material.tabs.TabLayoutMediator this$0;

        PagerAdapterObserver(com.google.android.material.tabs.TabLayoutMediator r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
                r1 = this;
                com.google.android.material.tabs.TabLayoutMediator r0 = r1.this$0
                r0.populateTabsFromPagerAdapter()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int r1, int r2) {
                r0 = this;
                com.google.android.material.tabs.TabLayoutMediator r1 = r0.this$0
                r1.populateTabsFromPagerAdapter()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int r1, int r2, java.lang.Object r3) {
                r0 = this;
                com.google.android.material.tabs.TabLayoutMediator r1 = r0.this$0
                r1.populateTabsFromPagerAdapter()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int r1, int r2) {
                r0 = this;
                com.google.android.material.tabs.TabLayoutMediator r1 = r0.this$0
                r1.populateTabsFromPagerAdapter()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int r1, int r2, int r3) {
                r0 = this;
                com.google.android.material.tabs.TabLayoutMediator r1 = r0.this$0
                r1.populateTabsFromPagerAdapter()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int r1, int r2) {
                r0 = this;
                com.google.android.material.tabs.TabLayoutMediator r1 = r0.this$0
                r1.populateTabsFromPagerAdapter()
                return
        }
    }

    public interface TabConfigurationStrategy {
        void onConfigureTab(com.google.android.material.tabs.TabLayout.Tab r1, int r2);
    }

    private static class TabLayoutOnPageChangeCallback extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        private int previousScrollState;
        private int scrollState;
        private final java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> tabLayoutRef;

        TabLayoutOnPageChangeCallback(com.google.android.material.tabs.TabLayout r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.tabLayoutRef = r0
                r1.reset()
                return
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int r2) {
                r1 = this;
                int r0 = r1.scrollState
                r1.previousScrollState = r0
                r1.scrollState = r2
                return
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int r6, float r7, int r8) {
                r5 = this;
                java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> r8 = r5.tabLayoutRef
                java.lang.Object r8 = r8.get()
                com.google.android.material.tabs.TabLayout r8 = (com.google.android.material.tabs.TabLayout) r8
                if (r8 == 0) goto L23
                int r0 = r5.scrollState
                r1 = 0
                r2 = 2
                r3 = 1
                if (r0 != r2) goto L18
                int r4 = r5.previousScrollState
                if (r4 != r3) goto L16
                goto L18
            L16:
                r4 = r1
                goto L19
            L18:
                r4 = r3
            L19:
                if (r0 != r2) goto L1f
                int r0 = r5.previousScrollState
                if (r0 == 0) goto L20
            L1f:
                r1 = r3
            L20:
                r8.setScrollPosition(r6, r7, r4, r1)
            L23:
                return
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int r4) {
                r3 = this;
                java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> r0 = r3.tabLayoutRef
                java.lang.Object r0 = r0.get()
                com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
                if (r0 == 0) goto L2c
                int r1 = r0.getSelectedTabPosition()
                if (r1 == r4) goto L2c
                int r1 = r0.getTabCount()
                if (r4 >= r1) goto L2c
                int r1 = r3.scrollState
                if (r1 == 0) goto L24
                r2 = 2
                if (r1 != r2) goto L22
                int r1 = r3.previousScrollState
                if (r1 != 0) goto L22
                goto L24
            L22:
                r1 = 0
                goto L25
            L24:
                r1 = 1
            L25:
                com.google.android.material.tabs.TabLayout$Tab r4 = r0.getTabAt(r4)
                r0.selectTab(r4, r1)
            L2c:
                return
        }

        void reset() {
                r1 = this;
                r0 = 0
                r1.scrollState = r0
                r1.previousScrollState = r0
                return
        }
    }

    private static class ViewPagerOnTabSelectedListener implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        private final boolean smoothScroll;
        private final androidx.viewpager2.widget.ViewPager2 viewPager;

        ViewPagerOnTabSelectedListener(androidx.viewpager2.widget.ViewPager2 r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.viewPager = r1
                r0.smoothScroll = r2
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r3) {
                r2 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r2.viewPager
                int r3 = r3.getPosition()
                boolean r1 = r2.smoothScroll
                r0.setCurrentItem(r3, r1)
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    public TabLayoutMediator(com.google.android.material.tabs.TabLayout r2, androidx.viewpager2.widget.ViewPager2 r3, com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public TabLayoutMediator(com.google.android.material.tabs.TabLayout r7, androidx.viewpager2.widget.ViewPager2 r8, boolean r9, com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy r10) {
            r6 = this;
            r4 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public TabLayoutMediator(com.google.android.material.tabs.TabLayout r1, androidx.viewpager2.widget.ViewPager2 r2, boolean r3, boolean r4, com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy r5) {
            r0 = this;
            r0.<init>()
            r0.tabLayout = r1
            r0.viewPager = r2
            r0.autoRefresh = r3
            r0.smoothScroll = r4
            r0.tabConfigurationStrategy = r5
            return
    }

    public void attach() {
            r4 = this;
            boolean r0 = r4.attached
            if (r0 != 0) goto L57
            androidx.viewpager2.widget.ViewPager2 r0 = r4.viewPager
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            r4.adapter = r0
            if (r0 == 0) goto L4f
            r0 = 1
            r4.attached = r0
            com.google.android.material.tabs.TabLayoutMediator$TabLayoutOnPageChangeCallback r1 = new com.google.android.material.tabs.TabLayoutMediator$TabLayoutOnPageChangeCallback
            com.google.android.material.tabs.TabLayout r2 = r4.tabLayout
            r1.<init>(r2)
            r4.onPageChangeCallback = r1
            androidx.viewpager2.widget.ViewPager2 r2 = r4.viewPager
            r2.registerOnPageChangeCallback(r1)
            com.google.android.material.tabs.TabLayoutMediator$ViewPagerOnTabSelectedListener r1 = new com.google.android.material.tabs.TabLayoutMediator$ViewPagerOnTabSelectedListener
            androidx.viewpager2.widget.ViewPager2 r2 = r4.viewPager
            boolean r3 = r4.smoothScroll
            r1.<init>(r2, r3)
            r4.onTabSelectedListener = r1
            com.google.android.material.tabs.TabLayout r2 = r4.tabLayout
            r2.addOnTabSelectedListener(r1)
            boolean r1 = r4.autoRefresh
            if (r1 == 0) goto L3f
            com.google.android.material.tabs.TabLayoutMediator$PagerAdapterObserver r1 = new com.google.android.material.tabs.TabLayoutMediator$PagerAdapterObserver
            r1.<init>(r4)
            r4.pagerAdapterObserver = r1
            androidx.recyclerview.widget.RecyclerView$Adapter<?> r2 = r4.adapter
            r2.registerAdapterDataObserver(r1)
        L3f:
            r4.populateTabsFromPagerAdapter()
            com.google.android.material.tabs.TabLayout r1 = r4.tabLayout
            androidx.viewpager2.widget.ViewPager2 r2 = r4.viewPager
            int r2 = r2.getCurrentItem()
            r3 = 0
            r1.setScrollPosition(r2, r3, r0)
            return
        L4f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TabLayoutMediator attached before ViewPager2 has an adapter"
            r0.<init>(r1)
            throw r0
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TabLayoutMediator is already attached"
            r0.<init>(r1)
            throw r0
    }

    public void detach() {
            r3 = this;
            boolean r0 = r3.autoRefresh
            r1 = 0
            if (r0 == 0) goto L10
            androidx.recyclerview.widget.RecyclerView$Adapter<?> r0 = r3.adapter
            if (r0 == 0) goto L10
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r2 = r3.pagerAdapterObserver
            r0.unregisterAdapterDataObserver(r2)
            r3.pagerAdapterObserver = r1
        L10:
            com.google.android.material.tabs.TabLayout r0 = r3.tabLayout
            com.google.android.material.tabs.TabLayout$OnTabSelectedListener r2 = r3.onTabSelectedListener
            r0.removeOnTabSelectedListener(r2)
            androidx.viewpager2.widget.ViewPager2 r0 = r3.viewPager
            com.google.android.material.tabs.TabLayoutMediator$TabLayoutOnPageChangeCallback r2 = r3.onPageChangeCallback
            r0.unregisterOnPageChangeCallback(r2)
            r3.onTabSelectedListener = r1
            r3.onPageChangeCallback = r1
            r3.adapter = r1
            r0 = 0
            r3.attached = r0
            return
    }

    public boolean isAttached() {
            r1 = this;
            boolean r0 = r1.attached
            return r0
    }

    void populateTabsFromPagerAdapter() {
            r5 = this;
            com.google.android.material.tabs.TabLayout r0 = r5.tabLayout
            r0.removeAllTabs()
            androidx.recyclerview.widget.RecyclerView$Adapter<?> r0 = r5.adapter
            if (r0 == 0) goto L49
            int r0 = r0.getItemCount()
            r1 = 0
            r2 = r1
        Lf:
            if (r2 >= r0) goto L24
            com.google.android.material.tabs.TabLayout r3 = r5.tabLayout
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.newTab()
            com.google.android.material.tabs.TabLayoutMediator$TabConfigurationStrategy r4 = r5.tabConfigurationStrategy
            r4.onConfigureTab(r3, r2)
            com.google.android.material.tabs.TabLayout r4 = r5.tabLayout
            r4.addTab(r3, r1)
            int r2 = r2 + 1
            goto Lf
        L24:
            if (r0 <= 0) goto L49
            com.google.android.material.tabs.TabLayout r0 = r5.tabLayout
            int r0 = r0.getTabCount()
            int r0 = r0 + (-1)
            androidx.viewpager2.widget.ViewPager2 r1 = r5.viewPager
            int r1 = r1.getCurrentItem()
            int r0 = java.lang.Math.min(r1, r0)
            com.google.android.material.tabs.TabLayout r1 = r5.tabLayout
            int r1 = r1.getSelectedTabPosition()
            if (r0 == r1) goto L49
            com.google.android.material.tabs.TabLayout r1 = r5.tabLayout
            com.google.android.material.tabs.TabLayout$Tab r0 = r1.getTabAt(r0)
            r1.selectTab(r0)
        L49:
            return
    }
}
