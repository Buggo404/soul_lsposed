package androidx.appcompat.app;

/* loaded from: classes.dex */
public class AppCompatViewInflater {
    private static final java.lang.String LOG_TAG = "AppCompatViewInflater";
    private static final java.lang.String[] sClassPrefixList = null;
    private static final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> sConstructorMap = null;
    private static final java.lang.Class<?>[] sConstructorSignature = null;
    private static final int[] sOnClickAttrs = null;
    private final java.lang.Object[] mConstructorArgs;

    private static class DeclaredOnClickListener implements android.view.View.OnClickListener {
        private final android.view.View mHostView;
        private final java.lang.String mMethodName;
        private android.content.Context mResolvedContext;
        private java.lang.reflect.Method mResolvedMethod;

        public DeclaredOnClickListener(android.view.View r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.mHostView = r1
                r0.mMethodName = r2
                return
        }

        private void resolveMethod(android.content.Context r6) {
                r5 = this;
            L0:
                if (r6 == 0) goto L2e
                boolean r0 = r6.isRestricted()     // Catch: java.lang.NoSuchMethodException -> L21
                if (r0 != 0) goto L21
                java.lang.Class r0 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.String r1 = r5.mMethodName     // Catch: java.lang.NoSuchMethodException -> L21
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.Class<android.view.View> r3 = android.view.View.class
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L21
                if (r0 == 0) goto L21
                r5.mResolvedMethod = r0     // Catch: java.lang.NoSuchMethodException -> L21
                r5.mResolvedContext = r6     // Catch: java.lang.NoSuchMethodException -> L21
                return
            L21:
                boolean r0 = r6 instanceof android.content.ContextWrapper
                if (r0 == 0) goto L2c
                android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
                android.content.Context r6 = r6.getBaseContext()
                goto L0
            L2c:
                r6 = 0
                goto L0
            L2e:
                android.view.View r6 = r5.mHostView
                int r6 = r6.getId()
                r0 = -1
                if (r6 != r0) goto L3a
                java.lang.String r6 = ""
                goto L5d
            L3a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = " with id '"
                r0.<init>(r1)
                android.view.View r1 = r5.mHostView
                android.content.Context r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                java.lang.String r6 = r1.getResourceEntryName(r6)
                java.lang.StringBuilder r6 = r0.append(r6)
                java.lang.String r0 = "'"
                java.lang.StringBuilder r6 = r6.append(r0)
                java.lang.String r6 = r6.toString()
            L5d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Could not find method "
                r1.<init>(r2)
                java.lang.String r2 = r5.mMethodName
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = "(View) in a parent or ancestor Context for android:onClick attribute defined on view "
                java.lang.StringBuilder r1 = r1.append(r2)
                android.view.View r2 = r5.mHostView
                java.lang.Class r2 = r2.getClass()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r6 = r1.append(r6)
                java.lang.String r6 = r6.toString()
                r0.<init>(r6)
                throw r0
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                java.lang.reflect.Method r0 = r4.mResolvedMethod
                if (r0 != 0) goto Ld
                android.view.View r0 = r4.mHostView
                android.content.Context r0 = r0.getContext()
                r4.resolveMethod(r0)
            Ld:
                java.lang.reflect.Method r0 = r4.mResolvedMethod     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L24
                android.content.Context r1 = r4.mResolvedContext     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L24
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L24
                r3 = 0
                r2[r3] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L24
                r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L24
                return
            L1b:
                r5 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not execute method for android:onClick"
                r0.<init>(r1, r5)
                throw r0
            L24:
                r5 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not execute non-public method for android:onClick"
                r0.<init>(r1, r5)
                throw r0
        }
    }

    static {
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r2 = 0
            r0[r2] = r1
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            r3 = 1
            r0[r3] = r1
            androidx.appcompat.app.AppCompatViewInflater.sConstructorSignature = r0
            int[] r0 = new int[r3]
            r1 = 16843375(0x101026f, float:2.3695304E-38)
            r0[r2] = r1
            androidx.appcompat.app.AppCompatViewInflater.sOnClickAttrs = r0
            java.lang.String r0 = "android.view."
            java.lang.String r1 = "android.webkit."
            java.lang.String r2 = "android.widget."
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            androidx.appcompat.app.AppCompatViewInflater.sClassPrefixList = r0
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.appcompat.app.AppCompatViewInflater.sConstructorMap = r0
            return
    }

    public AppCompatViewInflater() {
            r1 = this;
            r1.<init>()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.mConstructorArgs = r0
            return
    }

    private void checkOnClickListener(android.view.View r3, android.util.AttributeSet r4) {
            r2 = this;
            android.content.Context r0 = r3.getContext()
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L27
            boolean r1 = androidx.core.view.ViewCompat.hasOnClickListeners(r3)
            if (r1 != 0) goto Lf
            goto L27
        Lf:
            int[] r1 = androidx.appcompat.app.AppCompatViewInflater.sOnClickAttrs
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1)
            r0 = 0
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L24
            androidx.appcompat.app.AppCompatViewInflater$DeclaredOnClickListener r1 = new androidx.appcompat.app.AppCompatViewInflater$DeclaredOnClickListener
            r1.<init>(r3, r0)
            r3.setOnClickListener(r1)
        L24:
            r4.recycle()
        L27:
            return
    }

    private android.view.View createViewByPrefix(android.content.Context r3, java.lang.String r4, java.lang.String r5) throws java.lang.ClassNotFoundException, android.view.InflateException {
            r2 = this;
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r0 = androidx.appcompat.app.AppCompatViewInflater.sConstructorMap
            java.lang.Object r1 = r0.get(r4)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            if (r1 != 0) goto L37
            if (r5 == 0) goto L1e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L44
            r1.<init>()     // Catch: java.lang.Exception -> L44
            java.lang.StringBuilder r5 = r1.append(r5)     // Catch: java.lang.Exception -> L44
            java.lang.StringBuilder r5 = r5.append(r4)     // Catch: java.lang.Exception -> L44
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L44
            goto L1f
        L1e:
            r5 = r4
        L1f:
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L44
            r1 = 0
            java.lang.Class r3 = java.lang.Class.forName(r5, r1, r3)     // Catch: java.lang.Exception -> L44
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.Class r3 = r3.asSubclass(r5)     // Catch: java.lang.Exception -> L44
            java.lang.Class<?>[] r5 = androidx.appcompat.app.AppCompatViewInflater.sConstructorSignature     // Catch: java.lang.Exception -> L44
            java.lang.reflect.Constructor r1 = r3.getConstructor(r5)     // Catch: java.lang.Exception -> L44
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L44
        L37:
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L44
            java.lang.Object[] r3 = r2.mConstructorArgs     // Catch: java.lang.Exception -> L44
            java.lang.Object r3 = r1.newInstance(r3)     // Catch: java.lang.Exception -> L44
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r3 = 0
            return r3
    }

    private android.view.View createViewFromTag(android.content.Context r6, java.lang.String r7, android.util.AttributeSet r8) {
            r5 = this;
            java.lang.String r0 = "view"
            boolean r0 = r7.equals(r0)
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r7 = "class"
            java.lang.String r7 = r8.getAttributeValue(r1, r7)
        Lf:
            r0 = 1
            r2 = 0
            java.lang.Object[] r3 = r5.mConstructorArgs     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            r3[r2] = r6     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            r3[r0] = r8     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            r8 = 46
            int r8 = r7.indexOf(r8)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            r3 = -1
            if (r3 != r8) goto L3f
            r8 = r2
        L21:
            java.lang.String[] r3 = androidx.appcompat.app.AppCompatViewInflater.sClassPrefixList     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            int r4 = r3.length     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            if (r8 >= r4) goto L38
            r3 = r3[r8]     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            android.view.View r3 = r5.createViewByPrefix(r6, r7, r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            if (r3 == 0) goto L35
            java.lang.Object[] r6 = r5.mConstructorArgs
            r6[r2] = r1
            r6[r0] = r1
            return r3
        L35:
            int r8 = r8 + 1
            goto L21
        L38:
            java.lang.Object[] r6 = r5.mConstructorArgs
            r6[r2] = r1
            r6[r0] = r1
            return r1
        L3f:
            android.view.View r6 = r5.createViewByPrefix(r6, r7, r1)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L52
            java.lang.Object[] r7 = r5.mConstructorArgs
            r7[r2] = r1
            r7[r0] = r1
            return r6
        L4a:
            r6 = move-exception
            java.lang.Object[] r7 = r5.mConstructorArgs
            r7[r2] = r1
            r7[r0] = r1
            throw r6
        L52:
            java.lang.Object[] r6 = r5.mConstructorArgs
            r6[r2] = r1
            r6[r0] = r1
            return r1
    }

    private static android.content.Context themifyContext(android.content.Context r2, android.util.AttributeSet r3, boolean r4, boolean r5) {
            int[] r0 = androidx.appcompat.C0015R.styleable.View
            r1 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r1, r1)
            if (r4 == 0) goto L10
            int r4 = androidx.appcompat.C0015R.styleable.View_android_theme
            int r4 = r3.getResourceId(r4, r1)
            goto L11
        L10:
            r4 = r1
        L11:
            if (r5 == 0) goto L24
            if (r4 != 0) goto L24
            int r4 = androidx.appcompat.C0015R.styleable.View_theme
            int r4 = r3.getResourceId(r4, r1)
            if (r4 == 0) goto L24
            java.lang.String r5 = "AppCompatViewInflater"
            java.lang.String r0 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r5, r0)
        L24:
            r3.recycle()
            if (r4 == 0) goto L3c
            boolean r3 = r2 instanceof androidx.appcompat.view.ContextThemeWrapper
            if (r3 == 0) goto L36
            r3 = r2
            androidx.appcompat.view.ContextThemeWrapper r3 = (androidx.appcompat.view.ContextThemeWrapper) r3
            int r3 = r3.getThemeResId()
            if (r3 == r4) goto L3c
        L36:
            androidx.appcompat.view.ContextThemeWrapper r3 = new androidx.appcompat.view.ContextThemeWrapper
            r3.<init>(r2, r4)
            r2 = r3
        L3c:
            return r2
    }

    private void verifyNotNull(android.view.View r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " asked to inflate view for <"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = ">, but returned null"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    protected androidx.appcompat.widget.AppCompatAutoCompleteTextView createAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatAutoCompleteTextView r0 = new androidx.appcompat.widget.AppCompatAutoCompleteTextView
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatButton createButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatButton r0 = new androidx.appcompat.widget.AppCompatButton
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatCheckBox createCheckBox(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatCheckBox r0 = new androidx.appcompat.widget.AppCompatCheckBox
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatCheckedTextView createCheckedTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatCheckedTextView r0 = new androidx.appcompat.widget.AppCompatCheckedTextView
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatEditText createEditText(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEditText r0 = new androidx.appcompat.widget.AppCompatEditText
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatImageButton createImageButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageButton r0 = new androidx.appcompat.widget.AppCompatImageButton
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatImageView createImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r0 = new androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatRadioButton createRadioButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatRadioButton r0 = new androidx.appcompat.widget.AppCompatRadioButton
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatRatingBar createRatingBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatRatingBar r0 = new androidx.appcompat.widget.AppCompatRatingBar
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatSeekBar createSeekBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSeekBar r0 = new androidx.appcompat.widget.AppCompatSeekBar
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatSpinner createSpinner(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner r0 = new androidx.appcompat.widget.AppCompatSpinner
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatTextView createTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            r0.<init>(r2, r3)
            return r0
    }

    protected androidx.appcompat.widget.AppCompatToggleButton createToggleButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatToggleButton r0 = new androidx.appcompat.widget.AppCompatToggleButton
            r0.<init>(r2, r3)
            return r0
    }

    protected android.view.View createView(android.content.Context r1, java.lang.String r2, android.util.AttributeSet r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    final android.view.View createView(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4, boolean r5, boolean r6, boolean r7, boolean r8) {
            r0 = this;
            if (r5 == 0) goto L9
            if (r1 == 0) goto L9
            android.content.Context r1 = r1.getContext()
            goto La
        L9:
            r1 = r3
        La:
            if (r6 != 0) goto Le
            if (r7 == 0) goto L12
        Le:
            android.content.Context r1 = themifyContext(r1, r4, r6, r7)
        L12:
            if (r8 == 0) goto L18
            android.content.Context r1 = androidx.appcompat.widget.TintContextWrapper.wrap(r1)
        L18:
            r2.hashCode()
            int r5 = r2.hashCode()
            r6 = -1
            switch(r5) {
                case -1946472170: goto Lc6;
                case -1455429095: goto Lbb;
                case -1346021293: goto Lb0;
                case -938935918: goto La5;
                case -937446323: goto L9a;
                case -658531749: goto L8f;
                case -339785223: goto L84;
                case 776382189: goto L79;
                case 799298502: goto L6b;
                case 1125864064: goto L5d;
                case 1413872058: goto L4f;
                case 1601505219: goto L41;
                case 1666676343: goto L33;
                case 2001146706: goto L25;
                default: goto L23;
            }
        L23:
            goto Ld0
        L25:
            java.lang.String r5 = "Button"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L2f
            goto Ld0
        L2f:
            r6 = 13
            goto Ld0
        L33:
            java.lang.String r5 = "EditText"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L3d
            goto Ld0
        L3d:
            r6 = 12
            goto Ld0
        L41:
            java.lang.String r5 = "CheckBox"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L4b
            goto Ld0
        L4b:
            r6 = 11
            goto Ld0
        L4f:
            java.lang.String r5 = "AutoCompleteTextView"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L59
            goto Ld0
        L59:
            r6 = 10
            goto Ld0
        L5d:
            java.lang.String r5 = "ImageView"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L67
            goto Ld0
        L67:
            r6 = 9
            goto Ld0
        L6b:
            java.lang.String r5 = "ToggleButton"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L75
            goto Ld0
        L75:
            r6 = 8
            goto Ld0
        L79:
            java.lang.String r5 = "RadioButton"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L82
            goto Ld0
        L82:
            r6 = 7
            goto Ld0
        L84:
            java.lang.String r5 = "Spinner"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L8d
            goto Ld0
        L8d:
            r6 = 6
            goto Ld0
        L8f:
            java.lang.String r5 = "SeekBar"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L98
            goto Ld0
        L98:
            r6 = 5
            goto Ld0
        L9a:
            java.lang.String r5 = "ImageButton"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto La3
            goto Ld0
        La3:
            r6 = 4
            goto Ld0
        La5:
            java.lang.String r5 = "TextView"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto Lae
            goto Ld0
        Lae:
            r6 = 3
            goto Ld0
        Lb0:
            java.lang.String r5 = "MultiAutoCompleteTextView"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto Lb9
            goto Ld0
        Lb9:
            r6 = 2
            goto Ld0
        Lbb:
            java.lang.String r5 = "CheckedTextView"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto Lc4
            goto Ld0
        Lc4:
            r6 = 1
            goto Ld0
        Lc6:
            java.lang.String r5 = "RatingBar"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto Lcf
            goto Ld0
        Lcf:
            r6 = 0
        Ld0:
            switch(r6) {
                case 0: goto L142;
                case 1: goto L13a;
                case 2: goto L132;
                case 3: goto L12a;
                case 4: goto L122;
                case 5: goto L11a;
                case 6: goto L112;
                case 7: goto L10a;
                case 8: goto L102;
                case 9: goto Lfa;
                case 10: goto Lf2;
                case 11: goto Lea;
                case 12: goto Le2;
                case 13: goto Ld9;
                default: goto Ld3;
            }
        Ld3:
            android.view.View r5 = r0.createView(r1, r2, r4)
            goto L149
        Ld9:
            androidx.appcompat.widget.AppCompatButton r5 = r0.createButton(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        Le2:
            androidx.appcompat.widget.AppCompatEditText r5 = r0.createEditText(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        Lea:
            androidx.appcompat.widget.AppCompatCheckBox r5 = r0.createCheckBox(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        Lf2:
            androidx.appcompat.widget.AppCompatAutoCompleteTextView r5 = r0.createAutoCompleteTextView(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        Lfa:
            androidx.appcompat.widget.AppCompatImageView r5 = r0.createImageView(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        L102:
            androidx.appcompat.widget.AppCompatToggleButton r5 = r0.createToggleButton(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        L10a:
            androidx.appcompat.widget.AppCompatRadioButton r5 = r0.createRadioButton(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        L112:
            androidx.appcompat.widget.AppCompatSpinner r5 = r0.createSpinner(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        L11a:
            androidx.appcompat.widget.AppCompatSeekBar r5 = r0.createSeekBar(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        L122:
            androidx.appcompat.widget.AppCompatImageButton r5 = r0.createImageButton(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        L12a:
            androidx.appcompat.widget.AppCompatTextView r5 = r0.createTextView(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        L132:
            androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r5 = r0.createMultiAutoCompleteTextView(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        L13a:
            androidx.appcompat.widget.AppCompatCheckedTextView r5 = r0.createCheckedTextView(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L149
        L142:
            androidx.appcompat.widget.AppCompatRatingBar r5 = r0.createRatingBar(r1, r4)
            r0.verifyNotNull(r5, r2)
        L149:
            if (r5 != 0) goto L151
            if (r3 == r1) goto L151
            android.view.View r5 = r0.createViewFromTag(r1, r2, r4)
        L151:
            if (r5 == 0) goto L156
            r0.checkOnClickListener(r5, r4)
        L156:
            return r5
    }
}
