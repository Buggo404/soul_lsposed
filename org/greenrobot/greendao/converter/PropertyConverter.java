package org.greenrobot.greendao.converter;

/* loaded from: classes.dex */
public interface PropertyConverter<P, D> {
    D convertToDatabaseValue(P r1);

    P convertToEntityProperty(D r1);
}
