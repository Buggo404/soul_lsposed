package com.google.gson.internal;

/* loaded from: classes.dex */
public abstract class JsonReaderInternalAccess {
    public static com.google.gson.internal.JsonReaderInternalAccess INSTANCE;

    public JsonReaderInternalAccess() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void promoteNameToValue(com.google.gson.stream.JsonReader r1) throws java.io.IOException;
}
