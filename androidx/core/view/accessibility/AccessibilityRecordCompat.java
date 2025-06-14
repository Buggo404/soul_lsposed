package androidx.core.view.accessibility;

/* loaded from: classes.dex */
public class AccessibilityRecordCompat {
    private final android.view.accessibility.AccessibilityRecord mRecord;

    @java.lang.Deprecated
    public AccessibilityRecordCompat(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            android.view.accessibility.AccessibilityRecord r1 = (android.view.accessibility.AccessibilityRecord) r1
            r0.mRecord = r1
            return
    }

    public static int getMaxScrollX(android.view.accessibility.AccessibilityRecord r0) {
            int r0 = r0.getMaxScrollX()
            return r0
    }

    public static int getMaxScrollY(android.view.accessibility.AccessibilityRecord r0) {
            int r0 = r0.getMaxScrollY()
            return r0
    }

    @java.lang.Deprecated
    public static androidx.core.view.accessibility.AccessibilityRecordCompat obtain() {
            androidx.core.view.accessibility.AccessibilityRecordCompat r0 = new androidx.core.view.accessibility.AccessibilityRecordCompat
            android.view.accessibility.AccessibilityRecord r1 = android.view.accessibility.AccessibilityRecord.obtain()
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static androidx.core.view.accessibility.AccessibilityRecordCompat obtain(androidx.core.view.accessibility.AccessibilityRecordCompat r1) {
            androidx.core.view.accessibility.AccessibilityRecordCompat r0 = new androidx.core.view.accessibility.AccessibilityRecordCompat
            android.view.accessibility.AccessibilityRecord r1 = r1.mRecord
            android.view.accessibility.AccessibilityRecord r1 = android.view.accessibility.AccessibilityRecord.obtain(r1)
            r0.<init>(r1)
            return r0
    }

    public static void setMaxScrollX(android.view.accessibility.AccessibilityRecord r0, int r1) {
            r0.setMaxScrollX(r1)
            return
    }

    public static void setMaxScrollY(android.view.accessibility.AccessibilityRecord r0, int r1) {
            r0.setMaxScrollY(r1)
            return
    }

    public static void setSource(android.view.accessibility.AccessibilityRecord r0, android.view.View r1, int r2) {
            r0.setSource(r1, r2)
            return
    }

    @java.lang.Deprecated
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof androidx.core.view.accessibility.AccessibilityRecordCompat
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.core.view.accessibility.AccessibilityRecordCompat r4 = (androidx.core.view.accessibility.AccessibilityRecordCompat) r4
            android.view.accessibility.AccessibilityRecord r1 = r3.mRecord
            if (r1 != 0) goto L15
            android.view.accessibility.AccessibilityRecord r4 = r4.mRecord
            if (r4 == 0) goto L1e
            return r2
        L15:
            android.view.accessibility.AccessibilityRecord r4 = r4.mRecord
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    @java.lang.Deprecated
    public int getAddedCount() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            int r0 = r0.getAddedCount()
            return r0
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getBeforeText() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            java.lang.CharSequence r0 = r0.getBeforeText()
            return r0
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getClassName() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            java.lang.CharSequence r0 = r0.getClassName()
            return r0
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @java.lang.Deprecated
    public int getCurrentItemIndex() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            int r0 = r0.getCurrentItemIndex()
            return r0
    }

    @java.lang.Deprecated
    public int getFromIndex() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            int r0 = r0.getFromIndex()
            return r0
    }

    @java.lang.Deprecated
    public java.lang.Object getImpl() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            return r0
    }

    @java.lang.Deprecated
    public int getItemCount() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            int r0 = r0.getItemCount()
            return r0
    }

    @java.lang.Deprecated
    public int getMaxScrollX() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            int r0 = getMaxScrollX(r0)
            return r0
    }

    @java.lang.Deprecated
    public int getMaxScrollY() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            int r0 = getMaxScrollY(r0)
            return r0
    }

    @java.lang.Deprecated
    public android.os.Parcelable getParcelableData() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            android.os.Parcelable r0 = r0.getParcelableData()
            return r0
    }

    @java.lang.Deprecated
    public int getRemovedCount() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            int r0 = r0.getRemovedCount()
            return r0
    }

    @java.lang.Deprecated
    public int getScrollX() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            int r0 = r0.getScrollX()
            return r0
    }

    @java.lang.Deprecated
    public int getScrollY() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            int r0 = r0.getScrollY()
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getSource() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getSource()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(r0)
            return r0
    }

    @java.lang.Deprecated
    public java.util.List<java.lang.CharSequence> getText() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            java.util.List r0 = r0.getText()
            return r0
    }

    @java.lang.Deprecated
    public int getToIndex() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            int r0 = r0.getToIndex()
            return r0
    }

    @java.lang.Deprecated
    public int getWindowId() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            int r0 = r0.getWindowId()
            return r0
    }

    @java.lang.Deprecated
    public int hashCode() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    @java.lang.Deprecated
    public boolean isChecked() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            boolean r0 = r0.isChecked()
            return r0
    }

    @java.lang.Deprecated
    public boolean isEnabled() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            boolean r0 = r0.isEnabled()
            return r0
    }

    @java.lang.Deprecated
    public boolean isFullScreen() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            boolean r0 = r0.isFullScreen()
            return r0
    }

    @java.lang.Deprecated
    public boolean isPassword() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            boolean r0 = r0.isPassword()
            return r0
    }

    @java.lang.Deprecated
    public boolean isScrollable() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            boolean r0 = r0.isScrollable()
            return r0
    }

    @java.lang.Deprecated
    public void recycle() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.recycle()
            return
    }

    @java.lang.Deprecated
    public void setAddedCount(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setAddedCount(r2)
            return
    }

    @java.lang.Deprecated
    public void setBeforeText(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setBeforeText(r2)
            return
    }

    @java.lang.Deprecated
    public void setChecked(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setChecked(r2)
            return
    }

    @java.lang.Deprecated
    public void setClassName(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setClassName(r2)
            return
    }

    @java.lang.Deprecated
    public void setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setContentDescription(r2)
            return
    }

    @java.lang.Deprecated
    public void setCurrentItemIndex(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setCurrentItemIndex(r2)
            return
    }

    @java.lang.Deprecated
    public void setEnabled(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setEnabled(r2)
            return
    }

    @java.lang.Deprecated
    public void setFromIndex(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setFromIndex(r2)
            return
    }

    @java.lang.Deprecated
    public void setFullScreen(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setFullScreen(r2)
            return
    }

    @java.lang.Deprecated
    public void setItemCount(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setItemCount(r2)
            return
    }

    @java.lang.Deprecated
    public void setMaxScrollX(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            setMaxScrollX(r0, r2)
            return
    }

    @java.lang.Deprecated
    public void setMaxScrollY(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            setMaxScrollY(r0, r2)
            return
    }

    @java.lang.Deprecated
    public void setParcelableData(android.os.Parcelable r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setParcelableData(r2)
            return
    }

    @java.lang.Deprecated
    public void setPassword(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setPassword(r2)
            return
    }

    @java.lang.Deprecated
    public void setRemovedCount(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setRemovedCount(r2)
            return
    }

    @java.lang.Deprecated
    public void setScrollX(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setScrollX(r2)
            return
    }

    @java.lang.Deprecated
    public void setScrollY(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setScrollY(r2)
            return
    }

    @java.lang.Deprecated
    public void setScrollable(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setScrollable(r2)
            return
    }

    @java.lang.Deprecated
    public void setSource(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setSource(r2)
            return
    }

    @java.lang.Deprecated
    public void setSource(android.view.View r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            setSource(r0, r2, r3)
            return
    }

    @java.lang.Deprecated
    public void setToIndex(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.mRecord
            r0.setToIndex(r2)
            return
    }
}
