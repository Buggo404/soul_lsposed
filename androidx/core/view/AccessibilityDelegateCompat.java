package androidx.core.view;

/* loaded from: classes.dex */
public class AccessibilityDelegateCompat {
    private static final android.view.View.AccessibilityDelegate DEFAULT_DELEGATE = null;
    private final android.view.View.AccessibilityDelegate mBridge;
    private final android.view.View.AccessibilityDelegate mOriginalDelegate;

    static final class AccessibilityDelegateAdapter extends android.view.View.AccessibilityDelegate {
        final androidx.core.view.AccessibilityDelegateCompat mCompat;

        AccessibilityDelegateAdapter(androidx.core.view.AccessibilityDelegateCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mCompat = r1
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r2) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r2 = r0.getAccessibilityNodeProvider(r2)
                if (r2 == 0) goto Lf
                java.lang.Object r2 = r2.getProvider()
                android.view.accessibility.AccessibilityNodeProvider r2 = (android.view.accessibility.AccessibilityNodeProvider) r2
                goto L10
            Lf:
                r2 = 0
            L10:
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                r0.onInitializeAccessibilityEvent(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(android.view.View r3, android.view.accessibility.AccessibilityNodeInfo r4) {
                r2 = this;
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r4)
                boolean r1 = androidx.core.view.ViewCompat.isScreenReaderFocusable(r3)
                r0.setScreenReaderFocusable(r1)
                boolean r1 = androidx.core.view.ViewCompat.isAccessibilityHeading(r3)
                r0.setHeading(r1)
                java.lang.CharSequence r1 = androidx.core.view.ViewCompat.getAccessibilityPaneTitle(r3)
                r0.setPaneTitle(r1)
                java.lang.CharSequence r1 = androidx.core.view.ViewCompat.getStateDescription(r3)
                r0.setStateDescription(r1)
                androidx.core.view.AccessibilityDelegateCompat r1 = r2.mCompat
                r1.onInitializeAccessibilityNodeInfo(r3, r0)
                java.lang.CharSequence r4 = r4.getText()
                r0.addSpansToExtras(r4, r3)
                java.util.List r3 = androidx.core.view.AccessibilityDelegateCompat.getActionList(r3)
                r4 = 0
            L31:
                int r1 = r3.size()
                if (r4 >= r1) goto L43
                java.lang.Object r1 = r3.get(r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r1
                r0.addAction(r1)
                int r4 = r4 + 1
                goto L31
            L43:
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                r0.onPopulateAccessibilityEvent(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(android.view.View r2, int r3, android.os.Bundle r4) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                boolean r2 = r0.performAccessibilityAction(r2, r3, r4)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(android.view.View r2, int r3) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                r0.sendAccessibilityEvent(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = r1.mCompat
                r0.sendAccessibilityEventUnchecked(r2, r3)
                return
        }
    }

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            androidx.core.view.AccessibilityDelegateCompat.DEFAULT_DELEGATE = r0
            return
    }

    public AccessibilityDelegateCompat() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = androidx.core.view.AccessibilityDelegateCompat.DEFAULT_DELEGATE
            r1.<init>(r0)
            return
    }

    public AccessibilityDelegateCompat(android.view.View.AccessibilityDelegate r1) {
            r0 = this;
            r0.<init>()
            r0.mOriginalDelegate = r1
            androidx.core.view.AccessibilityDelegateCompat$AccessibilityDelegateAdapter r1 = new androidx.core.view.AccessibilityDelegateCompat$AccessibilityDelegateAdapter
            r1.<init>(r0)
            r0.mBridge = r1
            return
    }

    static java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(android.view.View r1) {
            int r0 = androidx.core.C0160R.id.tag_accessibility_actions
            java.lang.Object r1 = r1.getTag(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto Le
            java.util.List r1 = java.util.Collections.emptyList()
        Le:
            return r1
    }

    private boolean isSpanStillValid(android.text.style.ClickableSpan r4, android.view.View r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L22
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.createAccessibilityNodeInfo()
            java.lang.CharSequence r5 = r5.getText()
            android.text.style.ClickableSpan[] r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.getClickableSpans(r5)
            r1 = r0
        L10:
            if (r5 == 0) goto L22
            int r2 = r5.length
            if (r1 >= r2) goto L22
            r2 = r5[r1]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1f
            r4 = 1
            return r4
        L1f:
            int r1 = r1 + 1
            goto L10
        L22:
            return r0
    }

    private boolean performClickableSpanAction(int r2, android.view.View r3) {
            r1 = this;
            int r0 = androidx.core.C0160R.id.tag_accessibility_clickable_spans
            java.lang.Object r0 = r3.getTag(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 == 0) goto L23
            java.lang.Object r2 = r0.get(r2)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L23
            java.lang.Object r2 = r2.get()
            android.text.style.ClickableSpan r2 = (android.text.style.ClickableSpan) r2
            boolean r0 = r1.isSpanStillValid(r2, r3)
            if (r0 == 0) goto L23
            r2.onClick(r3)
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }

    public boolean dispatchPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
            return r2
    }

    public androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View r2) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            android.view.accessibility.AccessibilityNodeProvider r2 = r0.getAccessibilityNodeProvider(r2)
            if (r2 == 0) goto Le
            androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeProviderCompat
            r0.<init>(r2)
            return r0
        Le:
            r2 = 0
            return r2
    }

    android.view.View.AccessibilityDelegate getBridge() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mBridge
            return r0
    }

    public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            r0.onInitializeAccessibilityEvent(r2, r3)
            return
    }

    public void onInitializeAccessibilityNodeInfo(android.view.View r2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.unwrap()
            r0.onInitializeAccessibilityNodeInfo(r2, r3)
            return
    }

    public void onPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            r0.onPopulateAccessibilityEvent(r2, r3)
            return
    }

    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r2
    }

    public boolean performAccessibilityAction(android.view.View r6, int r7, android.os.Bundle r8) {
            r5 = this;
            java.util.List r0 = getActionList(r6)
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0.size()
            if (r2 >= r3) goto L20
            java.lang.Object r3 = r0.get(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r3
            int r4 = r3.getId()
            if (r4 != r7) goto L1d
            boolean r1 = r3.perform(r6, r8)
            goto L20
        L1d:
            int r2 = r2 + 1
            goto L6
        L20:
            if (r1 != 0) goto L28
            android.view.View$AccessibilityDelegate r0 = r5.mOriginalDelegate
            boolean r1 = r0.performAccessibilityAction(r6, r7, r8)
        L28:
            if (r1 != 0) goto L39
            int r0 = androidx.core.C0160R.id.accessibility_action_clickable_span
            if (r7 != r0) goto L39
            java.lang.String r7 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r0 = -1
            int r7 = r8.getInt(r7, r0)
            boolean r1 = r5.performClickableSpanAction(r7, r6)
        L39:
            return r1
    }

    public void sendAccessibilityEvent(android.view.View r2, int r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            r0.sendAccessibilityEvent(r2, r3)
            return
    }

    public void sendAccessibilityEventUnchecked(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            r0.sendAccessibilityEventUnchecked(r2, r3)
            return
    }
}
