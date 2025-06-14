package androidx.appcompat.widget;

/* loaded from: classes.dex */
class SuggestionsAdapter extends androidx.cursoradapter.widget.ResourceCursorAdapter implements android.view.View.OnClickListener {
    private static final boolean DBG = false;
    static final int INVALID_INDEX = -1;
    private static final java.lang.String LOG_TAG = "SuggestionsAdapter";
    private static final int QUERY_LIMIT = 50;
    static final int REFINE_ALL = 2;
    static final int REFINE_BY_ENTRY = 1;
    static final int REFINE_NONE = 0;
    private boolean mClosed;
    private final int mCommitIconResId;
    private int mFlagsCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> mOutsideDrawablesCache;
    private final android.content.Context mProviderContext;
    private int mQueryRefinement;
    private final androidx.appcompat.widget.SearchView mSearchView;
    private final android.app.SearchableInfo mSearchable;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private android.content.res.ColorStateList mUrlColor;

    private static final class ChildViewCache {
        public final android.widget.ImageView mIcon1;
        public final android.widget.ImageView mIcon2;
        public final android.widget.ImageView mIconRefine;
        public final android.widget.TextView mText1;
        public final android.widget.TextView mText2;

        public ChildViewCache(android.view.View r2) {
                r1 = this;
                r1.<init>()
                r0 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.mText1 = r0
                r0 = 16908309(0x1020015, float:2.3877288E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.mText2 = r0
                r0 = 16908295(0x1020007, float:2.387725E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.mIcon1 = r0
                r0 = 16908296(0x1020008, float:2.3877251E-38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1.mIcon2 = r0
                int r0 = androidx.appcompat.C0015R.id.edit_query
                android.view.View r2 = r2.findViewById(r0)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r1.mIconRefine = r2
                return
        }
    }

    public SuggestionsAdapter(android.content.Context r4, androidx.appcompat.widget.SearchView r5, android.app.SearchableInfo r6, java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> r7) {
            r3 = this;
            int r0 = r5.getSuggestionRowLayout()
            r1 = 0
            r2 = 1
            r3.<init>(r4, r0, r1, r2)
            r0 = 0
            r3.mClosed = r0
            r3.mQueryRefinement = r2
            r0 = -1
            r3.mText1Col = r0
            r3.mText2Col = r0
            r3.mText2UrlCol = r0
            r3.mIconName1Col = r0
            r3.mIconName2Col = r0
            r3.mFlagsCol = r0
            r3.mSearchView = r5
            r3.mSearchable = r6
            int r5 = r5.getSuggestionCommitIconResId()
            r3.mCommitIconResId = r5
            r3.mProviderContext = r4
            r3.mOutsideDrawablesCache = r7
            return
    }

    private android.graphics.drawable.Drawable checkIconCache(java.lang.String r2) {
            r1 = this;
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.mOutsideDrawablesCache
            java.lang.Object r2 = r0.get(r2)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
            return r2
    }

    private java.lang.CharSequence formatUrl(java.lang.CharSequence r9) {
            r8 = this;
            android.content.res.ColorStateList r0 = r8.mUrlColor
            if (r0 != 0) goto L23
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r8.mProviderContext
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r2 = androidx.appcompat.C0015R.attr.textColorSearchUrl
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            android.content.Context r1 = r8.mProviderContext
            android.content.res.Resources r1 = r1.getResources()
            int r0 = r0.resourceId
            android.content.res.ColorStateList r0 = r1.getColorStateList(r0)
            r8.mUrlColor = r0
        L23:
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r9)
            android.text.style.TextAppearanceSpan r7 = new android.text.style.TextAppearanceSpan
            r2 = 0
            r3 = 0
            r4 = 0
            android.content.res.ColorStateList r5 = r8.mUrlColor
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            int r9 = r9.length()
            r1 = 33
            r2 = 0
            r0.setSpan(r7, r2, r9, r1)
            return r0
    }

    private android.graphics.drawable.Drawable getActivityIcon(android.content.ComponentName r7) {
            r6 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            android.content.Context r1 = r6.mProviderContext
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 128(0x80, float:1.794E-43)
            r3 = 0
            android.content.pm.ActivityInfo r2 = r1.getActivityInfo(r7, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            int r4 = r2.getIconResource()
            if (r4 != 0) goto L16
            return r3
        L16:
            java.lang.String r5 = r7.getPackageName()
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r5, r4, r2)
            if (r1 != 0) goto L43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid icon resource "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " for "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r7 = r7.flattenToShortString()
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r0, r7)
            return r3
        L43:
            return r1
        L44:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r0, r7)
            return r3
    }

    private android.graphics.drawable.Drawable getActivityIconWithCache(android.content.ComponentName r4) {
            r3 = this;
            java.lang.String r0 = r4.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.mOutsideDrawablesCache
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L23
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r3.mOutsideDrawablesCache
            java.lang.Object r4 = r4.get(r0)
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
            if (r4 != 0) goto L18
            goto L22
        L18:
            android.content.Context r0 = r3.mProviderContext
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r4.newDrawable(r0)
        L22:
            return r2
        L23:
            android.graphics.drawable.Drawable r4 = r3.getActivityIcon(r4)
            if (r4 != 0) goto L2a
            goto L2e
        L2a:
            android.graphics.drawable.Drawable$ConstantState r2 = r4.getConstantState()
        L2e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.mOutsideDrawablesCache
            r1.put(r0, r2)
            return r4
    }

    public static java.lang.String getColumnString(android.database.Cursor r0, java.lang.String r1) {
            int r1 = r0.getColumnIndex(r1)
            java.lang.String r0 = getStringOrNull(r0, r1)
            return r0
    }

    private android.graphics.drawable.Drawable getDefaultIcon1() {
            r1 = this;
            android.app.SearchableInfo r0 = r1.mSearchable
            android.content.ComponentName r0 = r0.getSearchActivity()
            android.graphics.drawable.Drawable r0 = r1.getActivityIconWithCache(r0)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            android.content.Context r0 = r1.mProviderContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
            return r0
    }

    private android.graphics.drawable.Drawable getDrawable(android.net.Uri r8) {
            r7 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Error closing icon stream for "
            java.lang.String r2 = "Failed to open "
            java.lang.String r3 = "Resource does not exist: "
            r4 = 0
            java.lang.String r5 = r8.getScheme()     // Catch: java.io.FileNotFoundException -> L7d
            java.lang.String r6 = "android.resource"
            boolean r5 = r6.equals(r5)     // Catch: java.io.FileNotFoundException -> L7d
            if (r5 == 0) goto L2d
            android.graphics.drawable.Drawable r8 = r7.getDrawableFromResourceUri(r8)     // Catch: android.content.res.Resources.NotFoundException -> L1a java.io.FileNotFoundException -> L7d
            return r8
        L1a:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L7d
            r2.<init>(r3)     // Catch: java.io.FileNotFoundException -> L7d
            java.lang.StringBuilder r2 = r2.append(r8)     // Catch: java.io.FileNotFoundException -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.io.FileNotFoundException -> L7d
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7d
            throw r1     // Catch: java.io.FileNotFoundException -> L7d
        L2d:
            android.content.Context r3 = r7.mProviderContext     // Catch: java.io.FileNotFoundException -> L7d
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.io.FileNotFoundException -> L7d
            java.io.InputStream r3 = r3.openInputStream(r8)     // Catch: java.io.FileNotFoundException -> L7d
            if (r3 == 0) goto L6a
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r3, r4)     // Catch: java.lang.Throwable -> L53
            r3.close()     // Catch: java.io.IOException -> L41 java.io.FileNotFoundException -> L7d
            goto L52
        L41:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L7d
            r5.<init>(r1)     // Catch: java.io.FileNotFoundException -> L7d
            java.lang.StringBuilder r1 = r5.append(r8)     // Catch: java.io.FileNotFoundException -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.io.FileNotFoundException -> L7d
            android.util.Log.e(r0, r1, r3)     // Catch: java.io.FileNotFoundException -> L7d
        L52:
            return r2
        L53:
            r2 = move-exception
            r3.close()     // Catch: java.io.IOException -> L58 java.io.FileNotFoundException -> L7d
            goto L69
        L58:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L7d
            r5.<init>(r1)     // Catch: java.io.FileNotFoundException -> L7d
            java.lang.StringBuilder r1 = r5.append(r8)     // Catch: java.io.FileNotFoundException -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.io.FileNotFoundException -> L7d
            android.util.Log.e(r0, r1, r3)     // Catch: java.io.FileNotFoundException -> L7d
        L69:
            throw r2     // Catch: java.io.FileNotFoundException -> L7d
        L6a:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L7d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L7d
            r3.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7d
            java.lang.StringBuilder r2 = r3.append(r8)     // Catch: java.io.FileNotFoundException -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.io.FileNotFoundException -> L7d
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7d
            throw r1     // Catch: java.io.FileNotFoundException -> L7d
        L7d:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Icon not found: "
            r2.<init>(r3)
            java.lang.StringBuilder r8 = r2.append(r8)
            java.lang.String r2 = ", "
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r0, r8)
            return r4
    }

    private android.graphics.drawable.Drawable getDrawableFromResourceValue(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "android.resource://"
            r1 = 0
            if (r5 == 0) goto L6e
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L6e
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L14
            goto L6e
        L14:
            int r2 = java.lang.Integer.parseInt(r5)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            r3.<init>(r0)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            android.content.Context r0 = r4.mProviderContext     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            java.lang.String r3 = "/"
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            java.lang.String r0 = r0.toString()     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            android.graphics.drawable.Drawable r3 = r4.checkIconCache(r0)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            if (r3 == 0) goto L3c
            return r3
        L3c:
            android.content.Context r3 = r4.mProviderContext     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r3, r2)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            r4.storeInIconCache(r0, r2)     // Catch: android.content.res.Resources.NotFoundException -> L46 java.lang.NumberFormatException -> L5b
            return r2
        L46:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Icon resource not found: "
            r0.<init>(r2)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "SuggestionsAdapter"
            android.util.Log.w(r0, r5)
            return r1
        L5b:
            android.graphics.drawable.Drawable r0 = r4.checkIconCache(r5)
            if (r0 == 0) goto L62
            return r0
        L62:
            android.net.Uri r0 = android.net.Uri.parse(r5)
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            r4.storeInIconCache(r5, r0)
            return r0
        L6e:
            return r1
    }

    private android.graphics.drawable.Drawable getIcon1(android.database.Cursor r3) {
            r2 = this;
            int r0 = r2.mIconName1Col
            r1 = -1
            if (r0 != r1) goto L7
            r3 = 0
            return r3
        L7:
            java.lang.String r3 = r3.getString(r0)
            android.graphics.drawable.Drawable r3 = r2.getDrawableFromResourceValue(r3)
            if (r3 == 0) goto L12
            return r3
        L12:
            android.graphics.drawable.Drawable r3 = r2.getDefaultIcon1()
            return r3
    }

    private android.graphics.drawable.Drawable getIcon2(android.database.Cursor r3) {
            r2 = this;
            int r0 = r2.mIconName2Col
            r1 = -1
            if (r0 != r1) goto L7
            r3 = 0
            return r3
        L7:
            java.lang.String r3 = r3.getString(r0)
            android.graphics.drawable.Drawable r3 = r2.getDrawableFromResourceValue(r3)
            return r3
    }

    private static java.lang.String getStringOrNull(android.database.Cursor r2, int r3) {
            r0 = -1
            r1 = 0
            if (r3 != r0) goto L5
            return r1
        L5:
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Exception -> La
            return r2
        La:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "unexpected error retrieving valid column from cursor, did the remote process die?"
            android.util.Log.e(r3, r0, r2)
            return r1
    }

    private void setViewDrawable(android.widget.ImageView r1, android.graphics.drawable.Drawable r2, int r3) {
            r0 = this;
            r1.setImageDrawable(r2)
            if (r2 != 0) goto L9
            r1.setVisibility(r3)
            goto L14
        L9:
            r3 = 0
            r1.setVisibility(r3)
            r2.setVisible(r3, r3)
            r1 = 1
            r2.setVisible(r1, r3)
        L14:
            return
    }

    private void setViewText(android.widget.TextView r1, java.lang.CharSequence r2) {
            r0 = this;
            r1.setText(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto Lf
            r2 = 8
            r1.setVisibility(r2)
            goto L13
        Lf:
            r2 = 0
            r1.setVisibility(r2)
        L13:
            return
    }

    private void storeInIconCache(java.lang.String r2, android.graphics.drawable.Drawable r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.mOutsideDrawablesCache
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            r0.put(r2, r3)
        Lb:
            return
    }

    private void updateSpinnerState(android.database.Cursor r2) {
            r1 = this;
            if (r2 == 0) goto L7
            android.os.Bundle r2 = r2.getExtras()
            goto L8
        L7:
            r2 = 0
        L8:
            if (r2 == 0) goto Lf
            java.lang.String r0 = "in_progress"
            r2.getBoolean(r0)
        Lf:
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(android.view.View r7, android.content.Context r8, android.database.Cursor r9) {
            r6 = this;
            java.lang.Object r7 = r7.getTag()
            androidx.appcompat.widget.SuggestionsAdapter$ChildViewCache r7 = (androidx.appcompat.widget.SuggestionsAdapter.ChildViewCache) r7
            int r8 = r6.mFlagsCol
            r0 = -1
            r1 = 0
            if (r8 == r0) goto L11
            int r8 = r9.getInt(r8)
            goto L12
        L11:
            r8 = r1
        L12:
            android.widget.TextView r0 = r7.mText1
            if (r0 == 0) goto L21
            int r0 = r6.mText1Col
            java.lang.String r0 = getStringOrNull(r9, r0)
            android.widget.TextView r2 = r7.mText1
            r6.setViewText(r2, r0)
        L21:
            android.widget.TextView r0 = r7.mText2
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L62
            int r0 = r6.mText2UrlCol
            java.lang.String r0 = getStringOrNull(r9, r0)
            if (r0 == 0) goto L34
            java.lang.CharSequence r0 = r6.formatUrl(r0)
            goto L3a
        L34:
            int r0 = r6.mText2Col
            java.lang.String r0 = getStringOrNull(r9, r0)
        L3a:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L4f
            android.widget.TextView r4 = r7.mText1
            if (r4 == 0) goto L5d
            android.widget.TextView r4 = r7.mText1
            r4.setSingleLine(r1)
            android.widget.TextView r4 = r7.mText1
            r4.setMaxLines(r2)
            goto L5d
        L4f:
            android.widget.TextView r4 = r7.mText1
            if (r4 == 0) goto L5d
            android.widget.TextView r4 = r7.mText1
            r4.setSingleLine(r3)
            android.widget.TextView r4 = r7.mText1
            r4.setMaxLines(r3)
        L5d:
            android.widget.TextView r4 = r7.mText2
            r6.setViewText(r4, r0)
        L62:
            android.widget.ImageView r0 = r7.mIcon1
            if (r0 == 0) goto L70
            android.widget.ImageView r0 = r7.mIcon1
            android.graphics.drawable.Drawable r4 = r6.getIcon1(r9)
            r5 = 4
            r6.setViewDrawable(r0, r4, r5)
        L70:
            android.widget.ImageView r0 = r7.mIcon2
            r4 = 8
            if (r0 == 0) goto L7f
            android.widget.ImageView r0 = r7.mIcon2
            android.graphics.drawable.Drawable r9 = r6.getIcon2(r9)
            r6.setViewDrawable(r0, r9, r4)
        L7f:
            int r9 = r6.mQueryRefinement
            if (r9 == r2) goto L8f
            if (r9 != r3) goto L89
            r8 = r8 & r3
            if (r8 == 0) goto L89
            goto L8f
        L89:
            android.widget.ImageView r7 = r7.mIconRefine
            r7.setVisibility(r4)
            goto La4
        L8f:
            android.widget.ImageView r8 = r7.mIconRefine
            r8.setVisibility(r1)
            android.widget.ImageView r8 = r7.mIconRefine
            android.widget.TextView r9 = r7.mText1
            java.lang.CharSequence r9 = r9.getText()
            r8.setTag(r9)
            android.widget.ImageView r7 = r7.mIconRefine
            r7.setOnClickListener(r6)
        La4:
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public void changeCursor(android.database.Cursor r3) {
            r2 = this;
            boolean r0 = r2.mClosed
            java.lang.String r1 = "SuggestionsAdapter"
            if (r0 == 0) goto L11
            java.lang.String r0 = "Tried to change cursor after adapter was closed."
            android.util.Log.w(r1, r0)
            if (r3 == 0) goto L10
            r3.close()
        L10:
            return
        L11:
            super.changeCursor(r3)     // Catch: java.lang.Exception -> L47
            if (r3 == 0) goto L4d
            java.lang.String r0 = "suggest_text_1"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.mText1Col = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_text_2"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.mText2Col = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_text_2_url"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.mText2UrlCol = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_icon_1"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.mIconName1Col = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_icon_2"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.mIconName2Col = r0     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "suggest_flags"
            int r3 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L47
            r2.mFlagsCol = r3     // Catch: java.lang.Exception -> L47
            goto L4d
        L47:
            r3 = move-exception
            java.lang.String r0 = "error changing cursor and caching columns"
            android.util.Log.e(r1, r0, r3)
        L4d:
            return
    }

    public void close() {
            r1 = this;
            r0 = 0
            r1.changeCursor(r0)
            r0 = 1
            r1.mClosed = r0
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public java.lang.CharSequence convertToString(android.database.Cursor r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r1 = getColumnString(r3, r1)
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.app.SearchableInfo r1 = r2.mSearchable
            boolean r1 = r1.shouldRewriteQueryFromData()
            if (r1 == 0) goto L1e
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = getColumnString(r3, r1)
            if (r1 == 0) goto L1e
            return r1
        L1e:
            android.app.SearchableInfo r1 = r2.mSearchable
            boolean r1 = r1.shouldRewriteQueryFromText()
            if (r1 == 0) goto L2f
            java.lang.String r1 = "suggest_text_1"
            java.lang.String r3 = getColumnString(r3, r1)
            if (r3 == 0) goto L2f
            return r3
        L2f:
            return r0
    }

    android.graphics.drawable.Drawable getDrawableFromResourceUri(android.net.Uri r8) throws java.io.FileNotFoundException {
            r7 = this;
            java.lang.String r0 = r8.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lb0
            android.content.Context r1 = r7.mProviderContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            android.content.res.Resources r1 = r1.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            java.util.List r2 = r8.getPathSegments()
            if (r2 == 0) goto L86
            int r3 = r2.size()
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L42
            java.lang.Object r0 = r2.get(r4)     // Catch: java.lang.NumberFormatException -> L2d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L2d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2d
            goto L55
        L2d:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Single path segment is not a resource ID: "
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L42:
            r6 = 2
            if (r3 != r6) goto L71
            java.lang.Object r3 = r2.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r1.getIdentifier(r3, r2, r0)
        L55:
            if (r0 == 0) goto L5c
            android.graphics.drawable.Drawable r8 = r1.getDrawable(r0)
            return r8
        L5c:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No resource found for: "
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L71:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "More than two path segments: "
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L86:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No path: "
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L9b:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No package found for authority: "
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        Lb0:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No authority: "
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.View r2 = super.getDropDownView(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions cursor threw exception."
            android.util.Log.w(r3, r0, r2)
            android.content.Context r3 = r1.mProviderContext
            android.database.Cursor r0 = r1.getCursor()
            android.view.View r3 = r1.newDropDownView(r3, r0, r4)
            if (r3 == 0) goto L28
            java.lang.Object r4 = r3.getTag()
            androidx.appcompat.widget.SuggestionsAdapter$ChildViewCache r4 = (androidx.appcompat.widget.SuggestionsAdapter.ChildViewCache) r4
            android.widget.TextView r4 = r4.mText1
            java.lang.String r2 = r2.toString()
            r4.setText(r2)
        L28:
            return r3
    }

    public int getQueryRefinement() {
            r1 = this;
            int r0 = r1.mQueryRefinement
            return r0
    }

    android.database.Cursor getSearchManagerSuggestions(android.app.SearchableInfo r10, java.lang.String r11, int r12) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r10.getSuggestAuthority()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r1 = r2.authority(r1)
            java.lang.String r2 = ""
            android.net.Uri$Builder r1 = r1.query(r2)
            android.net.Uri$Builder r1 = r1.fragment(r2)
            java.lang.String r2 = r10.getSuggestPath()
            if (r2 == 0) goto L2d
            r1.appendEncodedPath(r2)
        L2d:
            java.lang.String r2 = "search_suggest_query"
            r1.appendPath(r2)
            java.lang.String r6 = r10.getSuggestSelection()
            if (r6 == 0) goto L3f
            r10 = 1
            java.lang.String[] r0 = new java.lang.String[r10]
            r10 = 0
            r0[r10] = r11
            goto L42
        L3f:
            r1.appendPath(r11)
        L42:
            r7 = r0
            if (r12 <= 0) goto L4e
            java.lang.String r10 = "limit"
            java.lang.String r11 = java.lang.String.valueOf(r12)
            r1.appendQueryParameter(r10, r11)
        L4e:
            android.net.Uri r4 = r1.build()
            android.content.Context r10 = r9.mProviderContext
            android.content.ContentResolver r3 = r10.getContentResolver()
            r5 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.View r2 = super.getView(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions cursor threw exception."
            android.util.Log.w(r3, r0, r2)
            android.content.Context r3 = r1.mProviderContext
            android.database.Cursor r0 = r1.getCursor()
            android.view.View r3 = r1.newView(r3, r0, r4)
            if (r3 == 0) goto L28
            java.lang.Object r4 = r3.getTag()
            androidx.appcompat.widget.SuggestionsAdapter$ChildViewCache r4 = (androidx.appcompat.widget.SuggestionsAdapter.ChildViewCache) r4
            android.widget.TextView r4 = r4.mText1
            java.lang.String r2 = r2.toString()
            r4.setText(r2)
        L28:
            return r3
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public android.view.View newView(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.View r1 = super.newView(r1, r2, r3)
            androidx.appcompat.widget.SuggestionsAdapter$ChildViewCache r2 = new androidx.appcompat.widget.SuggestionsAdapter$ChildViewCache
            r2.<init>(r1)
            r1.setTag(r2)
            int r2 = androidx.appcompat.C0015R.id.edit_query
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r3 = r0.mCommitIconResId
            r2.setImageResource(r3)
            return r1
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r1 = this;
            super.notifyDataSetChanged()
            android.database.Cursor r0 = r1.getCursor()
            r1.updateSpinnerState(r0)
            return
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
            r1 = this;
            super.notifyDataSetInvalidated()
            android.database.Cursor r0 = r1.getCursor()
            r1.updateSpinnerState(r0)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            java.lang.Object r2 = r2.getTag()
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto Lf
            androidx.appcompat.widget.SearchView r0 = r1.mSearchView
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.onQueryRefine(r2)
        Lf:
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence r4) {
            r3 = this;
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            goto L9
        L5:
            java.lang.String r4 = r4.toString()
        L9:
            androidx.appcompat.widget.SearchView r0 = r3.mSearchView
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L31
            androidx.appcompat.widget.SearchView r0 = r3.mSearchView
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L1b
            goto L31
        L1b:
            android.app.SearchableInfo r0 = r3.mSearchable     // Catch: java.lang.RuntimeException -> L29
            r2 = 50
            android.database.Cursor r4 = r3.getSearchManagerSuggestions(r0, r4, r2)     // Catch: java.lang.RuntimeException -> L29
            if (r4 == 0) goto L31
            r4.getCount()     // Catch: java.lang.RuntimeException -> L29
            return r4
        L29:
            r4 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r2 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r2, r4)
        L31:
            return r1
    }

    public void setQueryRefinement(int r1) {
            r0 = this;
            r0.mQueryRefinement = r1
            return
    }
}
