package androidx.coordinatorlayout.widget;

/* loaded from: classes.dex */
public final class DirectedAcyclicGraph<T> {
    private final androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> mGraph;
    private final androidx.core.util.Pools.Pool<java.util.ArrayList<T>> mListPool;
    private final java.util.ArrayList<T> mSortResult;
    private final java.util.HashSet<T> mSortTmpMarked;

    public DirectedAcyclicGraph() {
            r2 = this;
            r2.<init>()
            androidx.core.util.Pools$SimplePool r0 = new androidx.core.util.Pools$SimplePool
            r1 = 10
            r0.<init>(r1)
            r2.mListPool = r0
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r2.mGraph = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mSortResult = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.mSortTmpMarked = r0
            return
    }

    private void dfs(T r5, java.util.ArrayList<T> r6, java.util.HashSet<T> r7) {
            r4 = this;
            boolean r0 = r6.contains(r5)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r7.contains(r5)
            if (r0 != 0) goto L32
            r7.add(r5)
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r4.mGraph
            java.lang.Object r0 = r0.get(r5)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L2b
            int r1 = r0.size()
            r2 = 0
        L1f:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            r4.dfs(r3, r6, r7)
            int r2 = r2 + 1
            goto L1f
        L2b:
            r7.remove(r5)
            r6.add(r5)
            return
        L32:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "This graph contains cyclic dependencies"
            r5.<init>(r6)
            throw r5
    }

    private java.util.ArrayList<T> getEmptyList() {
            r1 = this;
            androidx.core.util.Pools$Pool<java.util.ArrayList<T>> r0 = r1.mListPool
            java.lang.Object r0 = r0.acquire()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Lf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lf:
            return r0
    }

    private void poolList(java.util.ArrayList<T> r2) {
            r1 = this;
            r2.clear()
            androidx.core.util.Pools$Pool<java.util.ArrayList<T>> r0 = r1.mListPool
            r0.release(r2)
            return
    }

    public void addEdge(T r3, T r4) {
            r2 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r2.mGraph
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L27
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r2.mGraph
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L27
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r2.mGraph
            java.lang.Object r0 = r0.get(r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L23
            java.util.ArrayList r0 = r2.getEmptyList()
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r1 = r2.mGraph
            r1.put(r3, r0)
        L23:
            r0.add(r4)
            return
        L27:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "All nodes must be present in the graph before being added as an edge"
            r3.<init>(r4)
            throw r3
    }

    public void addNode(T r3) {
            r2 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r2.mGraph
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto Le
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r2.mGraph
            r1 = 0
            r0.put(r3, r1)
        Le:
            return
    }

    public void clear() {
            r3 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r3.mGraph
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r2 = r3.mGraph
            java.lang.Object r2 = r2.valueAt(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L16
            r3.poolList(r2)
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r3.mGraph
            r0.clear()
            return
    }

    public boolean contains(T r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r1.mGraph
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public java.util.List getIncomingEdges(T r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r1.mGraph
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public java.util.List<T> getOutgoingEdges(T r5) {
            r4 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r4.mGraph
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L2d
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r3 = r4.mGraph
            java.lang.Object r3 = r3.valueAt(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L2a
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L2a
            if (r1 != 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L21:
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r3 = r4.mGraph
            java.lang.Object r3 = r3.keyAt(r2)
            r1.add(r3)
        L2a:
            int r2 = r2 + 1
            goto L8
        L2d:
            return r1
    }

    public java.util.ArrayList<T> getSortedList() {
            r5 = this;
            java.util.ArrayList<T> r0 = r5.mSortResult
            r0.clear()
            java.util.HashSet<T> r0 = r5.mSortTmpMarked
            r0.clear()
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r5.mGraph
            int r0 = r0.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L23
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r2 = r5.mGraph
            java.lang.Object r2 = r2.keyAt(r1)
            java.util.ArrayList<T> r3 = r5.mSortResult
            java.util.HashSet<T> r4 = r5.mSortTmpMarked
            r5.dfs(r2, r3, r4)
            int r1 = r1 + 1
            goto L11
        L23:
            java.util.ArrayList<T> r0 = r5.mSortResult
            return r0
    }

    public boolean hasOutgoingEdges(T r5) {
            r4 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r4.mGraph
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1f
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r3 = r4.mGraph
            java.lang.Object r3 = r3.valueAt(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L1c
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L1c
            r5 = 1
            return r5
        L1c:
            int r2 = r2 + 1
            goto L8
        L1f:
            return r1
    }

    int size() {
            r1 = this;
            androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> r0 = r1.mGraph
            int r0 = r0.size()
            return r0
    }
}
