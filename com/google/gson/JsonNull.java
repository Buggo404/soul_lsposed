package com.google.gson;

/* loaded from: classes.dex */
public final class JsonNull extends com.google.gson.JsonElement {
    public static final com.google.gson.JsonNull INSTANCE = null;

    static {
            com.google.gson.JsonNull r0 = new com.google.gson.JsonNull
            r0.<init>()
            com.google.gson.JsonNull.INSTANCE = r0
            return
    }

    @java.lang.Deprecated
    public JsonNull() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.gson.JsonElement
    public /* bridge */ /* synthetic */ com.google.gson.JsonElement deepCopy() {
            r1 = this;
            com.google.gson.JsonNull r0 = r1.deepCopy()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public com.google.gson.JsonNull deepCopy() {
            r1 = this;
            com.google.gson.JsonNull r0 = com.google.gson.JsonNull.INSTANCE
            return r0
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 == r1) goto L9
            boolean r1 = r1 instanceof com.google.gson.JsonNull
            if (r1 == 0) goto L7
            goto L9
        L7:
            r1 = 0
            goto La
        L9:
            r1 = 1
        La:
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.lang.Class<com.google.gson.JsonNull> r0 = com.google.gson.JsonNull.class
            int r0 = r0.hashCode()
            return r0
    }
}
