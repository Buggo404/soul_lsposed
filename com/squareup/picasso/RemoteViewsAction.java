package com.squareup.picasso;

/* loaded from: classes.dex */
abstract class RemoteViewsAction extends com.squareup.picasso.Action<com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget> {
    final android.widget.RemoteViews remoteViews;
    private com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget target;
    final int viewId;

    static class AppWidgetAction extends com.squareup.picasso.RemoteViewsAction {
        private final int[] appWidgetIds;

        AppWidgetAction(com.squareup.picasso.Picasso r11, com.squareup.picasso.Request r12, android.widget.RemoteViews r13, int r14, int[] r15, int r16, int r17, java.lang.String r18, java.lang.Object r19, int r20) {
                r10 = this;
                r0 = r10
                r1 = r11
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r20
                r6 = r16
                r7 = r17
                r8 = r19
                r9 = r18
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r1 = r15
                r0.appWidgetIds = r1
                return
        }

        @Override // com.squareup.picasso.RemoteViewsAction, com.squareup.picasso.Action
        /* bridge */ /* synthetic */ com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget getTarget() {
                r1 = this;
                com.squareup.picasso.RemoteViewsAction$RemoteViewsTarget r0 = super.getTarget()
                return r0
        }

        @Override // com.squareup.picasso.RemoteViewsAction
        void update() {
                r3 = this;
                com.squareup.picasso.Picasso r0 = r3.picasso
                android.content.Context r0 = r0.context
                android.appwidget.AppWidgetManager r0 = android.appwidget.AppWidgetManager.getInstance(r0)
                int[] r1 = r3.appWidgetIds
                android.widget.RemoteViews r2 = r3.remoteViews
                r0.updateAppWidget(r1, r2)
                return
        }
    }

    static class NotificationAction extends com.squareup.picasso.RemoteViewsAction {
        private final android.app.Notification notification;
        private final int notificationId;

        NotificationAction(com.squareup.picasso.Picasso r12, com.squareup.picasso.Request r13, android.widget.RemoteViews r14, int r15, int r16, android.app.Notification r17, int r18, int r19, java.lang.String r20, java.lang.Object r21, int r22) {
                r11 = this;
                r10 = r11
                r0 = r11
                r1 = r12
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r22
                r6 = r18
                r7 = r19
                r8 = r21
                r9 = r20
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0 = r16
                r10.notificationId = r0
                r0 = r17
                r10.notification = r0
                return
        }

        @Override // com.squareup.picasso.RemoteViewsAction, com.squareup.picasso.Action
        /* bridge */ /* synthetic */ com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget getTarget() {
                r1 = this;
                com.squareup.picasso.RemoteViewsAction$RemoteViewsTarget r0 = super.getTarget()
                return r0
        }

        @Override // com.squareup.picasso.RemoteViewsAction
        void update() {
                r3 = this;
                com.squareup.picasso.Picasso r0 = r3.picasso
                android.content.Context r0 = r0.context
                java.lang.String r1 = "notification"
                java.lang.Object r0 = com.squareup.picasso.Utils.getService(r0, r1)
                android.app.NotificationManager r0 = (android.app.NotificationManager) r0
                int r1 = r3.notificationId
                android.app.Notification r2 = r3.notification
                r0.notify(r1, r2)
                return
        }
    }

    static class RemoteViewsTarget {
        final android.widget.RemoteViews remoteViews;
        final int viewId;

        RemoteViewsTarget(android.widget.RemoteViews r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.remoteViews = r1
                r0.viewId = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L27
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L27
            L12:
                com.squareup.picasso.RemoteViewsAction$RemoteViewsTarget r5 = (com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget) r5
                int r2 = r4.viewId
                int r3 = r5.viewId
                if (r2 != r3) goto L25
                android.widget.RemoteViews r2 = r4.remoteViews
                android.widget.RemoteViews r5 = r5.remoteViews
                boolean r5 = r2.equals(r5)
                if (r5 == 0) goto L25
                goto L26
            L25:
                r0 = r1
            L26:
                return r0
            L27:
                return r1
        }

        public int hashCode() {
                r2 = this;
                android.widget.RemoteViews r0 = r2.remoteViews
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.viewId
                int r0 = r0 + r1
                return r0
        }
    }

    RemoteViewsAction(com.squareup.picasso.Picasso r13, com.squareup.picasso.Request r14, android.widget.RemoteViews r15, int r16, int r17, int r18, int r19, java.lang.Object r20, java.lang.String r21) {
            r12 = this;
            r11 = r12
            r2 = 0
            r7 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r3 = r14
            r4 = r18
            r5 = r19
            r6 = r17
            r8 = r21
            r9 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r15
            r11.remoteViews = r0
            r0 = r16
            r11.viewId = r0
            return
    }

    @Override // com.squareup.picasso.Action
    void complete(android.graphics.Bitmap r2, com.squareup.picasso.Picasso.LoadedFrom r3) {
            r1 = this;
            android.widget.RemoteViews r3 = r1.remoteViews
            int r0 = r1.viewId
            r3.setImageViewBitmap(r0, r2)
            r1.update()
            return
    }

    @Override // com.squareup.picasso.Action
    public void error() {
            r1 = this;
            int r0 = r1.errorResId
            if (r0 == 0) goto L9
            int r0 = r1.errorResId
            r1.setImageResource(r0)
        L9:
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.picasso.Action
    com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget getTarget() {
            r3 = this;
            com.squareup.picasso.RemoteViewsAction$RemoteViewsTarget r0 = r3.target
            if (r0 != 0) goto Lf
            com.squareup.picasso.RemoteViewsAction$RemoteViewsTarget r0 = new com.squareup.picasso.RemoteViewsAction$RemoteViewsTarget
            android.widget.RemoteViews r1 = r3.remoteViews
            int r2 = r3.viewId
            r0.<init>(r1, r2)
            r3.target = r0
        Lf:
            com.squareup.picasso.RemoteViewsAction$RemoteViewsTarget r0 = r3.target
            return r0
    }

    @Override // com.squareup.picasso.Action
    /* bridge */ /* synthetic */ com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget getTarget() {
            r1 = this;
            com.squareup.picasso.RemoteViewsAction$RemoteViewsTarget r0 = r1.getTarget()
            return r0
    }

    void setImageResource(int r3) {
            r2 = this;
            android.widget.RemoteViews r0 = r2.remoteViews
            int r1 = r2.viewId
            r0.setImageViewResource(r1, r3)
            r2.update()
            return
    }

    abstract void update();
}
