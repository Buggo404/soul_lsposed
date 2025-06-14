package com.google.android.material.bottomsheet;

/* loaded from: classes.dex */
public class BottomSheetDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private boolean waitingForDismissAllowingStateLoss;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialogFragment$1 */
    static /* synthetic */ class C05211 {
    }

    private class BottomSheetDismissCallback extends com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback {
        final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetDialogFragment this$0;

        private BottomSheetDismissCallback(com.google.android.material.bottomsheet.BottomSheetDialogFragment r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ BottomSheetDismissCallback(com.google.android.material.bottomsheet.BottomSheetDialogFragment r1, com.google.android.material.bottomsheet.BottomSheetDialogFragment.C05211 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(android.view.View r1, float r2) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(android.view.View r1, int r2) {
                r0 = this;
                r1 = 5
                if (r2 != r1) goto L8
                com.google.android.material.bottomsheet.BottomSheetDialogFragment r1 = r0.this$0
                com.google.android.material.bottomsheet.BottomSheetDialogFragment.access$100(r1)
            L8:
                return
        }
    }

    public BottomSheetDialogFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$100(com.google.android.material.bottomsheet.BottomSheetDialogFragment r0) {
            r0.dismissAfterAnimation()
            return
    }

    private void dismissAfterAnimation() {
            r1 = this;
            boolean r0 = r1.waitingForDismissAllowingStateLoss
            if (r0 == 0) goto L8
            super.dismissAllowingStateLoss()
            goto Lb
        L8:
            super.dismiss()
        Lb:
            return
    }

    private void dismissWithAnimation(com.google.android.material.bottomsheet.BottomSheetBehavior<?> r3, boolean r4) {
            r2 = this;
            r2.waitingForDismissAllowingStateLoss = r4
            int r4 = r3.getState()
            r0 = 5
            if (r4 != r0) goto Ld
            r2.dismissAfterAnimation()
            goto L2a
        Ld:
            android.app.Dialog r4 = r2.getDialog()
            boolean r4 = r4 instanceof com.google.android.material.bottomsheet.BottomSheetDialog
            if (r4 == 0) goto L1e
            android.app.Dialog r4 = r2.getDialog()
            com.google.android.material.bottomsheet.BottomSheetDialog r4 = (com.google.android.material.bottomsheet.BottomSheetDialog) r4
            r4.removeDefaultCallback()
        L1e:
            com.google.android.material.bottomsheet.BottomSheetDialogFragment$BottomSheetDismissCallback r4 = new com.google.android.material.bottomsheet.BottomSheetDialogFragment$BottomSheetDismissCallback
            r1 = 0
            r4.<init>(r2, r1)
            r3.addBottomSheetCallback(r4)
            r3.setState(r0)
        L2a:
            return
    }

    private boolean tryDismissWithAnimation(boolean r4) {
            r3 = this;
            android.app.Dialog r0 = r3.getDialog()
            boolean r1 = r0 instanceof com.google.android.material.bottomsheet.BottomSheetDialog
            if (r1 == 0) goto L1f
            com.google.android.material.bottomsheet.BottomSheetDialog r0 = (com.google.android.material.bottomsheet.BottomSheetDialog) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.getBehavior()
            boolean r2 = r1.isHideable()
            if (r2 == 0) goto L1f
            boolean r0 = r0.getDismissWithAnimation()
            if (r0 == 0) goto L1f
            r3.dismissWithAnimation(r1, r4)
            r4 = 1
            return r4
        L1f:
            r4 = 0
            return r4
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.tryDismissWithAnimation(r0)
            if (r0 != 0) goto La
            super.dismiss()
        La:
            return
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.tryDismissWithAnimation(r0)
            if (r0 != 0) goto La
            super.dismissAllowingStateLoss()
        La:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle r3) {
            r2 = this;
            com.google.android.material.bottomsheet.BottomSheetDialog r3 = new com.google.android.material.bottomsheet.BottomSheetDialog
            android.content.Context r0 = r2.getContext()
            int r1 = r2.getTheme()
            r3.<init>(r0, r1)
            return r3
    }
}
