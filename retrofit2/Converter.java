package retrofit2;

/* loaded from: classes.dex */
public interface Converter<F, T> {

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
        public retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, java.lang.annotation.Annotation[] r3, retrofit2.Retrofit r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @javax.annotation.Nullable
        public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, retrofit2.Retrofit r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @javax.annotation.Nullable
        public retrofit2.Converter<?, java.lang.String> stringConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, retrofit2.Retrofit r3) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    @javax.annotation.Nullable
    T convert(F r1) throws java.io.IOException;
}
