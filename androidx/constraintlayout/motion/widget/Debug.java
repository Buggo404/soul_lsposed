package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class Debug {
    public Debug() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void dumpLayoutParams(android.view.ViewGroup.LayoutParams r7, java.lang.String r8) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".("
            r1.<init>(r2)
            java.lang.String r2 = r0.getFileName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r0 = r0.getLineNumber()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ") "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = "  "
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " >>>>>>>>>>>>>>>>>>. dump "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.Class r2 = r7.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.println(r0)
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Field[] r0 = r0.getFields()
            r1 = 0
        L6a:
            int r2 = r0.length
            if (r1 >= r2) goto Lb6
            r2 = r0[r1]
            java.lang.Object r3 = r2.get(r7)     // Catch: java.lang.IllegalAccessException -> Lb3
            java.lang.String r2 = r2.getName()     // Catch: java.lang.IllegalAccessException -> Lb3
            java.lang.String r4 = "To"
            boolean r4 = r2.contains(r4)     // Catch: java.lang.IllegalAccessException -> Lb3
            if (r4 != 0) goto L80
            goto Lb3
        L80:
            java.lang.String r4 = r3.toString()     // Catch: java.lang.IllegalAccessException -> Lb3
            java.lang.String r5 = "-1"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.IllegalAccessException -> Lb3
            if (r4 == 0) goto L8d
            goto Lb3
        L8d:
            java.io.PrintStream r4 = java.lang.System.out     // Catch: java.lang.IllegalAccessException -> Lb3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> Lb3
            r5.<init>()     // Catch: java.lang.IllegalAccessException -> Lb3
            java.lang.StringBuilder r5 = r5.append(r8)     // Catch: java.lang.IllegalAccessException -> Lb3
            java.lang.String r6 = "       "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.IllegalAccessException -> Lb3
            java.lang.StringBuilder r2 = r5.append(r2)     // Catch: java.lang.IllegalAccessException -> Lb3
            java.lang.String r5 = " "
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch: java.lang.IllegalAccessException -> Lb3
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.IllegalAccessException -> Lb3
            java.lang.String r2 = r2.toString()     // Catch: java.lang.IllegalAccessException -> Lb3
            r4.println(r2)     // Catch: java.lang.IllegalAccessException -> Lb3
        Lb3:
            int r1 = r1 + 1
            goto L6a
        Lb6:
            java.io.PrintStream r7 = java.lang.System.out
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " <<<<<<<<<<<<<<<<< dump "
            r0.<init>(r1)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r8 = r8.toString()
            r7.println(r8)
            return
    }

    public static void dumpLayoutParams(android.view.ViewGroup r11, java.lang.String r12) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".("
            r1.<init>(r2)
            java.lang.String r2 = r0.getFileName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r0 = r0.getLineNumber()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ") "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r1 = "  "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = r11.getChildCount()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r12 = r3.append(r12)
            java.lang.String r3 = " children "
            java.lang.StringBuilder r12 = r12.append(r3)
            java.lang.StringBuilder r12 = r12.append(r1)
            java.lang.String r12 = r12.toString()
            r2.println(r12)
            r12 = 0
            r2 = r12
        L5f:
            if (r2 >= r1) goto Le6
            android.view.View r3 = r11.getChildAt(r2)
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r6 = "     "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = getName(r3)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.println(r5)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            java.lang.Class r4 = r3.getClass()
            java.lang.reflect.Field[] r4 = r4.getFields()
            r5 = r12
        L92:
            int r6 = r4.length
            if (r5 >= r6) goto Le2
            r6 = r4[r5]
            java.lang.Object r7 = r6.get(r3)     // Catch: java.lang.IllegalAccessException -> Ldf
            java.lang.String r8 = r6.getName()     // Catch: java.lang.IllegalAccessException -> Ldf
            java.lang.String r9 = "To"
            boolean r8 = r8.contains(r9)     // Catch: java.lang.IllegalAccessException -> Ldf
            if (r8 != 0) goto La8
            goto Ldf
        La8:
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Ldf
            java.lang.String r9 = "-1"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Ldf
            if (r8 == 0) goto Lb5
            goto Ldf
        Lb5:
            java.io.PrintStream r8 = java.lang.System.out     // Catch: java.lang.IllegalAccessException -> Ldf
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> Ldf
            r9.<init>()     // Catch: java.lang.IllegalAccessException -> Ldf
            java.lang.StringBuilder r9 = r9.append(r0)     // Catch: java.lang.IllegalAccessException -> Ldf
            java.lang.String r10 = "       "
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.IllegalAccessException -> Ldf
            java.lang.String r6 = r6.getName()     // Catch: java.lang.IllegalAccessException -> Ldf
            java.lang.StringBuilder r6 = r9.append(r6)     // Catch: java.lang.IllegalAccessException -> Ldf
            java.lang.String r9 = " "
            java.lang.StringBuilder r6 = r6.append(r9)     // Catch: java.lang.IllegalAccessException -> Ldf
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.IllegalAccessException -> Ldf
            java.lang.String r6 = r6.toString()     // Catch: java.lang.IllegalAccessException -> Ldf
            r8.println(r6)     // Catch: java.lang.IllegalAccessException -> Ldf
        Ldf:
            int r5 = r5 + 1
            goto L92
        Le2:
            int r2 = r2 + 1
            goto L5f
        Le6:
            return
    }

    public static void dumpPoc(java.lang.Object r11) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".("
            r1.<init>(r2)
            java.lang.String r2 = r0.getFileName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r0 = r0.getLineNumber()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Class r1 = r11.getClass()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = "------------- "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r5 = r1.getName()
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r5 = " --------------------"
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
            java.lang.reflect.Field[] r2 = r1.getFields()
            r3 = 0
        L62:
            int r6 = r2.length
            if (r3 >= r6) goto Leb
            r6 = r2[r3]
            java.lang.Object r7 = r6.get(r11)     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.String r8 = r6.getName()     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.String r9 = "layout_constraint"
            boolean r8 = r8.startsWith(r9)     // Catch: java.lang.IllegalAccessException -> Le7
            if (r8 != 0) goto L79
            goto Le7
        L79:
            boolean r8 = r7 instanceof java.lang.Integer     // Catch: java.lang.IllegalAccessException -> Le7
            if (r8 == 0) goto L8a
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.String r9 = "-1"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Le7
            if (r8 == 0) goto L8a
            goto Le7
        L8a:
            boolean r8 = r7 instanceof java.lang.Integer     // Catch: java.lang.IllegalAccessException -> Le7
            if (r8 == 0) goto L9b
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.String r9 = "0"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Le7
            if (r8 == 0) goto L9b
            goto Le7
        L9b:
            boolean r8 = r7 instanceof java.lang.Float     // Catch: java.lang.IllegalAccessException -> Le7
            if (r8 == 0) goto Lac
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.String r9 = "1.0"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Le7
            if (r8 == 0) goto Lac
            goto Le7
        Lac:
            boolean r8 = r7 instanceof java.lang.Float     // Catch: java.lang.IllegalAccessException -> Le7
            if (r8 == 0) goto Lbd
            java.lang.String r8 = r7.toString()     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.String r9 = "0.5"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.IllegalAccessException -> Le7
            if (r8 == 0) goto Lbd
            goto Le7
        Lbd:
            java.io.PrintStream r8 = java.lang.System.out     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> Le7
            r9.<init>()     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.StringBuilder r9 = r9.append(r0)     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.String r10 = "    "
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.String r6 = r6.getName()     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.StringBuilder r6 = r9.append(r6)     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.String r9 = " "
            java.lang.StringBuilder r6 = r6.append(r9)     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.IllegalAccessException -> Le7
            java.lang.String r6 = r6.toString()     // Catch: java.lang.IllegalAccessException -> Le7
            r8.println(r6)     // Catch: java.lang.IllegalAccessException -> Le7
        Le7:
            int r3 = r3 + 1
            goto L62
        Leb:
            java.io.PrintStream r11 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r11.println(r0)
            return
    }

    public static java.lang.String getActionType(android.view.MotionEvent r5) {
            int r5 = r5.getAction()
            java.lang.Class<android.view.MotionEvent> r0 = android.view.MotionEvent.class
            java.lang.reflect.Field[] r0 = r0.getFields()
            r1 = 0
        Lb:
            int r2 = r0.length
            if (r1 >= r2) goto L35
            r2 = r0[r1]
            int r3 = r2.getModifiers()     // Catch: java.lang.IllegalAccessException -> L32
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.IllegalAccessException -> L32
            if (r3 == 0) goto L32
            java.lang.Class r3 = r2.getType()     // Catch: java.lang.IllegalAccessException -> L32
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.IllegalAccessException -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.IllegalAccessException -> L32
            if (r3 == 0) goto L32
            r3 = 0
            int r3 = r2.getInt(r3)     // Catch: java.lang.IllegalAccessException -> L32
            if (r3 != r5) goto L32
            java.lang.String r5 = r2.getName()     // Catch: java.lang.IllegalAccessException -> L32
            return r5
        L32:
            int r1 = r1 + 1
            goto Lb
        L35:
            java.lang.String r5 = "---"
            return r5
    }

    public static java.lang.String getCallFrom(int r2) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r2 = r2 + 2
            r2 = r0[r2]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ".("
            r0.<init>(r1)
            java.lang.String r1 = r2.getFileName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r2 = r2.getLineNumber()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = ")"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static java.lang.String getLoc() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".("
            r1.<init>(r2)
            java.lang.String r2 = r0.getFileName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r0.getLineNumber()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ") "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r0.getMethodName()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "()"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String getLocation() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".("
            r1.<init>(r2)
            java.lang.String r2 = r0.getFileName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r0 = r0.getLineNumber()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String getLocation2() {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 2
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".("
            r1.<init>(r2)
            java.lang.String r2 = r0.getFileName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r0 = r0.getLineNumber()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String getName(android.content.Context r1, int r2) {
            r0 = -1
            if (r2 == r0) goto Lc
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> Lf
            java.lang.String r1 = r1.getResourceEntryName(r2)     // Catch: java.lang.Exception -> Lf
            return r1
        Lc:
            java.lang.String r1 = "UNKNOWN"
            return r1
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "?"
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static java.lang.String getName(android.content.Context r5, int[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7d
            r0.<init>()     // Catch: java.lang.Exception -> L7d
            int r1 = r6.length     // Catch: java.lang.Exception -> L7d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L7d
            java.lang.String r1 = "["
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L7d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L7d
            r1 = 0
        L15:
            int r2 = r6.length     // Catch: java.lang.Exception -> L7d
            if (r1 >= r2) goto L69
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7d
            r2.<init>()     // Catch: java.lang.Exception -> L7d
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Exception -> L7d
            java.lang.String r2 = " "
            if (r1 != 0) goto L28
            java.lang.String r3 = ""
            goto L29
        L28:
            r3 = r2
        L29:
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Exception -> L7d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L7d
            android.content.res.Resources r3 = r5.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L3c java.lang.Exception -> L7d
            r4 = r6[r1]     // Catch: android.content.res.Resources.NotFoundException -> L3c java.lang.Exception -> L7d
            java.lang.String r2 = r3.getResourceEntryName(r4)     // Catch: android.content.res.Resources.NotFoundException -> L3c java.lang.Exception -> L7d
            goto L55
        L3c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7d
            r3.<init>()     // Catch: java.lang.Exception -> L7d
            java.lang.String r4 = "? "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L7d
            r4 = r6[r1]     // Catch: java.lang.Exception -> L7d
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L7d
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Exception -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L7d
        L55:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7d
            r3.<init>()     // Catch: java.lang.Exception -> L7d
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Exception -> L7d
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Exception -> L7d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L7d
            int r1 = r1 + 1
            goto L15
        L69:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7d
            r5.<init>()     // Catch: java.lang.Exception -> L7d
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.lang.Exception -> L7d
            java.lang.String r6 = "]"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Exception -> L7d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L7d
            return r5
        L7d:
            r5 = move-exception
            java.lang.String r6 = "DEBUG"
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r6, r5)
            java.lang.String r5 = "UNKNOWN"
            return r5
    }

    public static java.lang.String getName(android.view.View r1) {
            android.content.Context r0 = r1.getContext()     // Catch: java.lang.Exception -> L11
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L11
            int r1 = r1.getId()     // Catch: java.lang.Exception -> L11
            java.lang.String r1 = r0.getResourceEntryName(r1)     // Catch: java.lang.Exception -> L11
            return r1
        L11:
            java.lang.String r1 = "UNKNOWN"
            return r1
    }

    public static java.lang.String getState(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2) {
            r0 = -1
            java.lang.String r1 = getState(r1, r2, r0)
            return r1
    }

    public static java.lang.String getState(androidx.constraintlayout.motion.widget.MotionLayout r2, int r3, int r4) {
            r0 = -1
            if (r3 != r0) goto L6
            java.lang.String r2 = "UNDEFINED"
            return r2
        L6:
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getResourceEntryName(r3)
            if (r4 == r0) goto L62
            int r3 = r2.length()
            if (r3 <= r4) goto L22
            java.lang.String r3 = "([^_])[aeiou]+"
            java.lang.String r0 = "$1"
            java.lang.String r2 = r2.replaceAll(r3, r0)
        L22:
            int r3 = r2.length()
            if (r3 <= r4) goto L62
            java.lang.String r3 = "[^_]"
            java.lang.String r0 = ""
            java.lang.String r3 = r2.replaceAll(r3, r0)
            int r3 = r3.length()
            if (r3 <= 0) goto L62
            int r0 = r2.length()
            int r0 = r0 - r4
            int r0 = r0 / r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.nio.CharBuffer r4 = java.nio.CharBuffer.allocate(r0)
            java.lang.String r4 = r4.toString()
            r0 = 0
            r1 = 46
            java.lang.String r4 = r4.replace(r0, r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "_"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = r2.replaceAll(r3, r4)
        L62:
            return r2
    }

    public static void logStack(java.lang.String r6, java.lang.String r7, int r8) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            int r8 = java.lang.Math.min(r8, r1)
            java.lang.String r1 = " "
            r3 = r1
        L13:
            if (r2 > r8) goto L7c
            r4 = r0[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = ".("
            r4.<init>(r5)
            r5 = r0[r2]
            java.lang.String r5 = r5.getFileName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ":"
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = r0[r2]
            int r5 = r5.getLineNumber()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ") "
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = r0[r2]
            java.lang.String r5 = r5.getMethodName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r6, r4)
            int r2 = r2 + 1
            goto L13
        L7c:
            return
    }

    public static void printStack(java.lang.String r7, int r8) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            int r8 = java.lang.Math.min(r8, r1)
            java.lang.String r1 = " "
            r3 = r1
        L13:
            if (r2 > r8) goto L74
            r4 = r0[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = ".("
            r4.<init>(r5)
            r5 = r0[r2]
            java.lang.String r5 = r5.getFileName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ":"
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = r0[r2]
            int r5 = r5.getLineNumber()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ") "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            r5.println(r4)
            int r2 = r2 + 1
            goto L13
        L74:
            return
    }
}
