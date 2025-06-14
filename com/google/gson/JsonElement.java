package com.google.gson;

/* loaded from: classes.dex */
public abstract class JsonElement {
    public JsonElement() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract com.google.gson.JsonElement deepCopy();

    public java.math.BigDecimal getAsBigDecimal() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public java.math.BigInteger getAsBigInteger() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public boolean getAsBoolean() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public byte getAsByte() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public char getAsCharacter() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public double getAsDouble() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public float getAsFloat() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public int getAsInt() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public com.google.gson.JsonArray getAsJsonArray() {
            r3 = this;
            boolean r0 = r3.isJsonArray()
            if (r0 == 0) goto La
            r0 = r3
            com.google.gson.JsonArray r0 = (com.google.gson.JsonArray) r0
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Not a JSON Array: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public com.google.gson.JsonNull getAsJsonNull() {
            r3 = this;
            boolean r0 = r3.isJsonNull()
            if (r0 == 0) goto La
            r0 = r3
            com.google.gson.JsonNull r0 = (com.google.gson.JsonNull) r0
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Not a JSON Null: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public com.google.gson.JsonObject getAsJsonObject() {
            r3 = this;
            boolean r0 = r3.isJsonObject()
            if (r0 == 0) goto La
            r0 = r3
            com.google.gson.JsonObject r0 = (com.google.gson.JsonObject) r0
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Not a JSON Object: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public com.google.gson.JsonPrimitive getAsJsonPrimitive() {
            r3 = this;
            boolean r0 = r3.isJsonPrimitive()
            if (r0 == 0) goto La
            r0 = r3
            com.google.gson.JsonPrimitive r0 = (com.google.gson.JsonPrimitive) r0
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Not a JSON Primitive: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public long getAsLong() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.Number getAsNumber() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public short getAsShort() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getAsString() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public boolean isJsonArray() {
            r1 = this;
            boolean r0 = r1 instanceof com.google.gson.JsonArray
            return r0
    }

    public boolean isJsonNull() {
            r1 = this;
            boolean r0 = r1 instanceof com.google.gson.JsonNull
            return r0
    }

    public boolean isJsonObject() {
            r1 = this;
            boolean r0 = r1 instanceof com.google.gson.JsonObject
            return r0
    }

    public boolean isJsonPrimitive() {
            r1 = this;
            boolean r0 = r1 instanceof com.google.gson.JsonPrimitive
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.io.IOException -> L16
            r0.<init>()     // Catch: java.io.IOException -> L16
            com.google.gson.stream.JsonWriter r1 = new com.google.gson.stream.JsonWriter     // Catch: java.io.IOException -> L16
            r1.<init>(r0)     // Catch: java.io.IOException -> L16
            r2 = 1
            r1.setLenient(r2)     // Catch: java.io.IOException -> L16
            com.google.gson.internal.Streams.write(r3, r1)     // Catch: java.io.IOException -> L16
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L16
            return r0
        L16:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }
}
