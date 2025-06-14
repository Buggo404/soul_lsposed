package com.squareup.picasso;

/* loaded from: classes.dex */
class PicassoExecutorService extends java.util.concurrent.ThreadPoolExecutor {
    private static final int DEFAULT_THREAD_COUNT = 3;

    private static final class PicassoFutureTask extends java.util.concurrent.FutureTask<com.squareup.picasso.BitmapHunter> implements java.lang.Comparable<com.squareup.picasso.PicassoExecutorService.PicassoFutureTask> {
        private final com.squareup.picasso.BitmapHunter hunter;

        public PicassoFutureTask(com.squareup.picasso.BitmapHunter r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                r1.hunter = r2
                return
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.squareup.picasso.PicassoExecutorService.PicassoFutureTask r3) {
                r2 = this;
                com.squareup.picasso.BitmapHunter r0 = r2.hunter
                com.squareup.picasso.Picasso$Priority r0 = r0.getPriority()
                com.squareup.picasso.BitmapHunter r1 = r3.hunter
                com.squareup.picasso.Picasso$Priority r1 = r1.getPriority()
                if (r0 != r1) goto L18
                com.squareup.picasso.BitmapHunter r0 = r2.hunter
                int r0 = r0.sequence
                com.squareup.picasso.BitmapHunter r3 = r3.hunter
                int r3 = r3.sequence
                int r0 = r0 - r3
                goto L22
            L18:
                int r3 = r1.ordinal()
                int r0 = r0.ordinal()
                int r0 = r3 - r0
            L22:
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.squareup.picasso.PicassoExecutorService.PicassoFutureTask r1) {
                r0 = this;
                com.squareup.picasso.PicassoExecutorService$PicassoFutureTask r1 = (com.squareup.picasso.PicassoExecutorService.PicassoFutureTask) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    PicassoExecutorService() {
            r8 = this;
            r1 = 3
            r2 = 3
            r3 = 0
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.PriorityBlockingQueue r6 = new java.util.concurrent.PriorityBlockingQueue
            r6.<init>()
            com.squareup.picasso.Utils$PicassoThreadFactory r7 = new com.squareup.picasso.Utils$PicassoThreadFactory
            r7.<init>()
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
    }

    private void setThreadCount(int r1) {
            r0 = this;
            r0.setCorePoolSize(r1)
            r0.setMaximumPoolSize(r1)
            return
    }

    void adjustThreadCount(android.net.NetworkInfo r4) {
            r3 = this;
            r0 = 3
            if (r4 == 0) goto L3e
            boolean r1 = r4.isConnectedOrConnecting()
            if (r1 != 0) goto La
            goto L3e
        La:
            int r1 = r4.getType()
            r2 = 1
            if (r1 == 0) goto L23
            if (r1 == r2) goto L1e
            r4 = 6
            if (r1 == r4) goto L1e
            r4 = 9
            if (r1 == r4) goto L1e
            r3.setThreadCount(r0)
            goto L3d
        L1e:
            r4 = 4
            r3.setThreadCount(r4)
            goto L3d
        L23:
            int r4 = r4.getSubtype()
            switch(r4) {
                case 1: goto L3a;
                case 2: goto L3a;
                case 3: goto L35;
                case 4: goto L35;
                case 5: goto L35;
                case 6: goto L35;
                default: goto L2a;
            }
        L2a:
            switch(r4) {
                case 12: goto L35;
                case 13: goto L31;
                case 14: goto L31;
                case 15: goto L31;
                default: goto L2d;
            }
        L2d:
            r3.setThreadCount(r0)
            goto L3d
        L31:
            r3.setThreadCount(r0)
            goto L3d
        L35:
            r4 = 2
            r3.setThreadCount(r4)
            goto L3d
        L3a:
            r3.setThreadCount(r2)
        L3d:
            return
        L3e:
            r3.setThreadCount(r0)
            return
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable r2) {
            r1 = this;
            com.squareup.picasso.PicassoExecutorService$PicassoFutureTask r0 = new com.squareup.picasso.PicassoExecutorService$PicassoFutureTask
            com.squareup.picasso.BitmapHunter r2 = (com.squareup.picasso.BitmapHunter) r2
            r0.<init>(r2)
            r1.execute(r0)
            return r0
    }
}
