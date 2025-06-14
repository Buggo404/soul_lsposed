package com.google.gson;

/* loaded from: classes.dex */
public final class JsonObject extends com.google.gson.JsonElement {
    private final com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> members;

    public JsonObject() {
            r1 = this;
            r1.<init>()
            com.google.gson.internal.LinkedTreeMap r0 = new com.google.gson.internal.LinkedTreeMap
            r0.<init>()
            r1.members = r0
            return
    }

    public void add(java.lang.String r2, com.google.gson.JsonElement r3) {
            r1 = this;
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r0 = r1.members
            if (r3 != 0) goto L6
            com.google.gson.JsonNull r3 = com.google.gson.JsonNull.INSTANCE
        L6:
            r0.put(r2, r3)
            return
    }

    public void addProperty(java.lang.String r2, java.lang.Boolean r3) {
            r1 = this;
            if (r3 != 0) goto L5
            com.google.gson.JsonNull r3 = com.google.gson.JsonNull.INSTANCE
            goto Lb
        L5:
            com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
            r0.<init>(r3)
            r3 = r0
        Lb:
            r1.add(r2, r3)
            return
    }

    public void addProperty(java.lang.String r2, java.lang.Character r3) {
            r1 = this;
            if (r3 != 0) goto L5
            com.google.gson.JsonNull r3 = com.google.gson.JsonNull.INSTANCE
            goto Lb
        L5:
            com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
            r0.<init>(r3)
            r3 = r0
        Lb:
            r1.add(r2, r3)
            return
    }

    public void addProperty(java.lang.String r2, java.lang.Number r3) {
            r1 = this;
            if (r3 != 0) goto L5
            com.google.gson.JsonNull r3 = com.google.gson.JsonNull.INSTANCE
            goto Lb
        L5:
            com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
            r0.<init>(r3)
            r3 = r0
        Lb:
            r1.add(r2, r3)
            return
    }

    public void addProperty(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            if (r3 != 0) goto L5
            com.google.gson.JsonNull r3 = com.google.gson.JsonNull.INSTANCE
            goto Lb
        L5:
            com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
            r0.<init>(r3)
            r3 = r0
        Lb:
            r1.add(r2, r3)
            return
    }

    @Override // com.google.gson.JsonElement
    public /* bridge */ /* synthetic */ com.google.gson.JsonElement deepCopy() {
            r1 = this;
            com.google.gson.JsonObject r0 = r1.deepCopy()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public com.google.gson.JsonObject deepCopy() {
            r4 = this;
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r0.<init>()
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r1 = r4.members
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2
            com.google.gson.JsonElement r2 = r2.deepCopy()
            r0.add(r3, r2)
            goto Lf
        L2f:
            return r0
    }

    public java.util.Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> entrySet() {
            r1 = this;
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r0 = r1.members
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof com.google.gson.JsonObject
            if (r0 == 0) goto L13
            com.google.gson.JsonObject r2 = (com.google.gson.JsonObject) r2
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r2 = r2.members
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r0 = r1.members
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = 0
            goto L16
        L15:
            r2 = 1
        L16:
            return r2
    }

    public com.google.gson.JsonElement get(java.lang.String r2) {
            r1 = this;
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r0 = r1.members
            java.lang.Object r2 = r0.get(r2)
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2
            return r2
    }

    public com.google.gson.JsonArray getAsJsonArray(java.lang.String r2) {
            r1 = this;
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r0 = r1.members
            java.lang.Object r2 = r0.get(r2)
            com.google.gson.JsonArray r2 = (com.google.gson.JsonArray) r2
            return r2
    }

    public com.google.gson.JsonObject getAsJsonObject(java.lang.String r2) {
            r1 = this;
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r0 = r1.members
            java.lang.Object r2 = r0.get(r2)
            com.google.gson.JsonObject r2 = (com.google.gson.JsonObject) r2
            return r2
    }

    public com.google.gson.JsonPrimitive getAsJsonPrimitive(java.lang.String r2) {
            r1 = this;
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r0 = r1.members
            java.lang.Object r2 = r0.get(r2)
            com.google.gson.JsonPrimitive r2 = (com.google.gson.JsonPrimitive) r2
            return r2
    }

    public boolean has(java.lang.String r2) {
            r1 = this;
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r0 = r1.members
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r0 = r1.members
            int r0 = r0.hashCode()
            return r0
    }

    public java.util.Set<java.lang.String> keySet() {
            r1 = this;
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r0 = r1.members
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public com.google.gson.JsonElement remove(java.lang.String r2) {
            r1 = this;
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r0 = r1.members
            java.lang.Object r2 = r0.remove(r2)
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2
            return r2
    }

    public int size() {
            r1 = this;
            com.google.gson.internal.LinkedTreeMap<java.lang.String, com.google.gson.JsonElement> r0 = r1.members
            int r0 = r0.size()
            return r0
    }
}
