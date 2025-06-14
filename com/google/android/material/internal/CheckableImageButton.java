package com.google.android.material.internal;

/* loaded from: classes.dex */
public class CheckableImageButton extends androidx.appcompat.widget.AppCompatImageButton implements android.widget.Checkable {
    private static final int[] DRAWABLE_STATE_CHECKED = null;
    private boolean checkable;
    private boolean checked;
    private boolean pressable;


    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.internal.CheckableImageButton.SavedState> CREATOR = null;
        boolean checked;


        static {
                com.google.android.material.internal.CheckableImageButton$SavedState$1 r0 = new com.google.android.material.internal.CheckableImageButton$SavedState$1
                r0.<init>()
                com.google.android.material.internal.CheckableImageButton.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.readFromParcel(r1)
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void readFromParcel(android.os.Parcel r2) {
                r1 = this;
                int r2 = r2.readInt()
                r0 = 1
                if (r2 != r0) goto L8
                goto L9
            L8:
                r0 = 0
            L9:
                r1.checked = r0
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.checked
                r1.writeInt(r2)
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            com.google.android.material.internal.CheckableImageButton.DRAWABLE_STATE_CHECKED = r0
            return
    }

    public CheckableImageButton(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CheckableImageButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.C0015R.attr.imageButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CheckableImageButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.checkable = r1
            r0.pressable = r1
            com.google.android.material.internal.CheckableImageButton$1 r1 = new com.google.android.material.internal.CheckableImageButton$1
            r1.<init>(r0)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            return
    }

    public boolean isCheckable() {
            r1 = this;
            boolean r0 = r1.checkable
            return r0
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
            r1 = this;
            boolean r0 = r1.checked
            return r0
    }

    public boolean isPressable() {
            r1 = this;
            boolean r0 = r1.pressable
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int r3) {
            r2 = this;
            boolean r0 = r2.checked
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.internal.CheckableImageButton.DRAWABLE_STATE_CHECKED
            int r1 = r0.length
            int r3 = r3 + r1
            int[] r3 = super.onCreateDrawableState(r3)
            int[] r3 = mergeDrawableStates(r3, r0)
            return r3
        L11:
            int[] r3 = super.onCreateDrawableState(r3)
            return r3
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.internal.CheckableImageButton.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.internal.CheckableImageButton$SavedState r2 = (com.google.android.material.internal.CheckableImageButton.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.checked
            r1.setChecked(r2)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.internal.CheckableImageButton$SavedState r1 = new com.google.android.material.internal.CheckableImageButton$SavedState
            r1.<init>(r0)
            boolean r0 = r2.checked
            r1.checked = r0
            return r1
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            boolean r0 = r1.checkable
            if (r0 == r2) goto La
            r1.checkable = r2
            r2 = 0
            r1.sendAccessibilityEvent(r2)
        La:
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.checkable
            if (r0 == 0) goto L12
            boolean r0 = r1.checked
            if (r0 == r2) goto L12
            r1.checked = r2
            r1.refreshDrawableState()
            r2 = 2048(0x800, float:2.87E-42)
            r1.sendAccessibilityEvent(r2)
        L12:
            return
    }

    public void setPressable(boolean r1) {
            r0 = this;
            r0.pressable = r1
            return
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
            r1 = this;
            boolean r0 = r1.pressable
            if (r0 == 0) goto L7
            super.setPressed(r2)
        L7:
            return
    }

    @Override // android.widget.Checkable
    public void toggle() {
            r1 = this;
            boolean r0 = r1.checked
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
