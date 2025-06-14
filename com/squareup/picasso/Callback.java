package com.squareup.picasso;

/* loaded from: classes.dex */
public interface Callback {

    public static class EmptyCallback implements com.squareup.picasso.Callback {
        public EmptyCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.squareup.picasso.Callback
        public void onError() {
                r0 = this;
                return
        }

        @Override // com.squareup.picasso.Callback
        public void onSuccess() {
                r0 = this;
                return
        }
    }

    void onError();

    void onSuccess();
}
