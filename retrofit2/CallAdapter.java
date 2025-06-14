package retrofit2;

/* loaded from: classes.dex */
public interface CallAdapter<R, T> {

    public static abstract class Factory {
        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        protected static java.lang.reflect.Type getParameterUpperBound(int r0, java.lang.reflect.ParameterizedType r1) {
                java.lang.reflect.Type r0 = retrofit2.Utils.getParameterUpperBound(r0, r1)
                return r0
        }

        protected static java.lang.Class<?> getRawType(java.lang.reflect.Type r0) {
                java.lang.Class r0 = retrofit2.Utils.getRawType(r0)
                return r0
        }

        @javax.annotation.Nullable
        public abstract retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, retrofit2.Retrofit r3);
    }

    T adapt(retrofit2.Call<R> r1);

    java.lang.reflect.Type responseType();
}
