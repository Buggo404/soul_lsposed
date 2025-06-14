package androidx.appcompat.widget;

/* loaded from: classes.dex */
public interface ThemedSpinnerAdapter extends android.widget.SpinnerAdapter {

    public static final class Helper {
        private final android.content.Context mContext;
        private android.view.LayoutInflater mDropDownInflater;
        private final android.view.LayoutInflater mInflater;

        public Helper(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.mContext = r1
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                r0.mInflater = r1
                return
        }

        public android.view.LayoutInflater getDropDownViewInflater() {
                r1 = this;
                android.view.LayoutInflater r0 = r1.mDropDownInflater
                if (r0 == 0) goto L5
                goto L7
            L5:
                android.view.LayoutInflater r0 = r1.mInflater
            L7:
                return r0
        }

        public android.content.res.Resources.Theme getDropDownViewTheme() {
                r1 = this;
                android.view.LayoutInflater r0 = r1.mDropDownInflater
                if (r0 != 0) goto L6
                r0 = 0
                goto Le
            L6:
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources$Theme r0 = r0.getTheme()
            Le:
                return r0
        }

        public void setDropDownViewTheme(android.content.res.Resources.Theme r3) {
                r2 = this;
                if (r3 != 0) goto L6
                r3 = 0
                r2.mDropDownInflater = r3
                goto L20
            L6:
                android.content.Context r0 = r2.mContext
                android.content.res.Resources$Theme r0 = r0.getTheme()
                if (r3 != r0) goto L13
                android.view.LayoutInflater r3 = r2.mInflater
                r2.mDropDownInflater = r3
                goto L20
            L13:
                androidx.appcompat.view.ContextThemeWrapper r0 = new androidx.appcompat.view.ContextThemeWrapper
                android.content.Context r1 = r2.mContext
                r0.<init>(r1, r3)
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
                r2.mDropDownInflater = r3
            L20:
                return
        }
    }

    android.content.res.Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(android.content.res.Resources.Theme r1);
}
