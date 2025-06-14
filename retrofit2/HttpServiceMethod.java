package retrofit2;

/* loaded from: classes.dex */
abstract class HttpServiceMethod<ResponseT, ReturnT> extends retrofit2.ServiceMethod<ReturnT> {
    private final okhttp3.Call.Factory callFactory;
    private final retrofit2.RequestFactory requestFactory;
    private final retrofit2.Converter<okhttp3.ResponseBody, ResponseT> responseConverter;

    static final class CallAdapted<ResponseT, ReturnT> extends retrofit2.HttpServiceMethod<ResponseT, ReturnT> {
        private final retrofit2.CallAdapter<ResponseT, ReturnT> callAdapter;

        CallAdapted(retrofit2.RequestFactory r1, okhttp3.Call.Factory r2, retrofit2.Converter<okhttp3.ResponseBody, ResponseT> r3, retrofit2.CallAdapter<ResponseT, ReturnT> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.callAdapter = r4
                return
        }

        @Override // retrofit2.HttpServiceMethod
        protected ReturnT adapt(retrofit2.Call<ResponseT> r1, java.lang.Object[] r2) {
                r0 = this;
                retrofit2.CallAdapter<ResponseT, ReturnT> r2 = r0.callAdapter
                java.lang.Object r1 = r2.adapt(r1)
                return r1
        }
    }

    static final class SuspendForBody<ResponseT> extends retrofit2.HttpServiceMethod<ResponseT, java.lang.Object> {
        private final retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> callAdapter;
        private final boolean isNullable;

        SuspendForBody(retrofit2.RequestFactory r1, okhttp3.Call.Factory r2, retrofit2.Converter<okhttp3.ResponseBody, ResponseT> r3, retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> r4, boolean r5) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.callAdapter = r4
                r0.isNullable = r5
                return
        }

        @Override // retrofit2.HttpServiceMethod
        protected java.lang.Object adapt(retrofit2.Call<ResponseT> r2, java.lang.Object[] r3) {
                r1 = this;
                retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> r0 = r1.callAdapter
                java.lang.Object r2 = r0.adapt(r2)
                retrofit2.Call r2 = (retrofit2.Call) r2
                int r0 = r3.length
                int r0 = r0 + (-1)
                r3 = r3[r0]
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                boolean r0 = r1.isNullable     // Catch: java.lang.Exception -> L1d
                if (r0 == 0) goto L18
                java.lang.Object r2 = retrofit2.KotlinExtensions.awaitNullable(r2, r3)     // Catch: java.lang.Exception -> L1d
                goto L1c
            L18:
                java.lang.Object r2 = retrofit2.KotlinExtensions.await(r2, r3)     // Catch: java.lang.Exception -> L1d
            L1c:
                return r2
            L1d:
                r2 = move-exception
                java.lang.Object r2 = retrofit2.KotlinExtensions.suspendAndThrow(r2, r3)
                return r2
        }
    }

    static final class SuspendForResponse<ResponseT> extends retrofit2.HttpServiceMethod<ResponseT, java.lang.Object> {
        private final retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> callAdapter;

        SuspendForResponse(retrofit2.RequestFactory r1, okhttp3.Call.Factory r2, retrofit2.Converter<okhttp3.ResponseBody, ResponseT> r3, retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.callAdapter = r4
                return
        }

        @Override // retrofit2.HttpServiceMethod
        protected java.lang.Object adapt(retrofit2.Call<ResponseT> r2, java.lang.Object[] r3) {
                r1 = this;
                retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> r0 = r1.callAdapter
                java.lang.Object r2 = r0.adapt(r2)
                retrofit2.Call r2 = (retrofit2.Call) r2
                int r0 = r3.length
                int r0 = r0 + (-1)
                r3 = r3[r0]
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r2 = retrofit2.KotlinExtensions.awaitResponse(r2, r3)     // Catch: java.lang.Exception -> L14
                return r2
            L14:
                r2 = move-exception
                java.lang.Object r2 = retrofit2.KotlinExtensions.suspendAndThrow(r2, r3)
                return r2
        }
    }

    HttpServiceMethod(retrofit2.RequestFactory r1, okhttp3.Call.Factory r2, retrofit2.Converter<okhttp3.ResponseBody, ResponseT> r3) {
            r0 = this;
            r0.<init>()
            r0.requestFactory = r1
            r0.callFactory = r2
            r0.responseConverter = r3
            return
    }

    private static <ResponseT, ReturnT> retrofit2.CallAdapter<ResponseT, ReturnT> createCallAdapter(retrofit2.Retrofit r1, java.lang.reflect.Method r2, java.lang.reflect.Type r3, java.lang.annotation.Annotation[] r4) {
            retrofit2.CallAdapter r1 = r1.callAdapter(r3, r4)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L5:
            r1 = move-exception
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r3
            java.lang.String r3 = "Unable to create call adapter for %s"
            java.lang.RuntimeException r1 = retrofit2.Utils.methodError(r2, r1, r3, r4)
            throw r1
    }

    private static <ResponseT> retrofit2.Converter<okhttp3.ResponseBody, ResponseT> createResponseConverter(retrofit2.Retrofit r2, java.lang.reflect.Method r3, java.lang.reflect.Type r4) {
            java.lang.annotation.Annotation[] r0 = r3.getAnnotations()
            retrofit2.Converter r2 = r2.responseBodyConverter(r4, r0)     // Catch: java.lang.RuntimeException -> L9
            return r2
        L9:
            r2 = move-exception
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "Unable to create converter for %s"
            java.lang.RuntimeException r2 = retrofit2.Utils.methodError(r3, r2, r4, r0)
            throw r2
    }

    static <ResponseT, ReturnT> retrofit2.HttpServiceMethod<ResponseT, ReturnT> parseAnnotations(retrofit2.Retrofit r9, java.lang.reflect.Method r10, retrofit2.RequestFactory r11) {
            boolean r0 = r11.isKotlinSuspendFunction
            r6 = 0
            java.lang.annotation.Annotation[] r1 = r10.getAnnotations()
            r2 = 0
            if (r0 == 0) goto L3f
            java.lang.reflect.Type[] r3 = r10.getGenericParameterTypes()
            int r4 = r3.length
            r5 = 1
            int r4 = r4 - r5
            r3 = r3[r4]
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = retrofit2.Utils.getParameterLowerBound(r2, r3)
            java.lang.Class r4 = retrofit2.Utils.getRawType(r3)
            java.lang.Class<retrofit2.Response> r7 = retrofit2.Response.class
            if (r4 != r7) goto L2d
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L2d
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = retrofit2.Utils.getParameterUpperBound(r2, r3)
            r4 = r5
            goto L2e
        L2d:
            r4 = r2
        L2e:
            retrofit2.Utils$ParameterizedTypeImpl r7 = new retrofit2.Utils$ParameterizedTypeImpl
            java.lang.Class<retrofit2.Call> r8 = retrofit2.Call.class
            java.lang.reflect.Type[] r5 = new java.lang.reflect.Type[r5]
            r5[r2] = r3
            r3 = 0
            r7.<init>(r3, r8, r5)
            java.lang.annotation.Annotation[] r1 = retrofit2.SkipCallbackExecutorImpl.ensurePresent(r1)
            goto L44
        L3f:
            java.lang.reflect.Type r7 = r10.getGenericReturnType()
            r4 = r2
        L44:
            retrofit2.CallAdapter r5 = createCallAdapter(r9, r10, r7, r1)
            java.lang.reflect.Type r1 = r5.responseType()
            java.lang.Class<okhttp3.Response> r3 = okhttp3.Response.class
            if (r1 == r3) goto L98
            java.lang.Class<retrofit2.Response> r3 = retrofit2.Response.class
            if (r1 == r3) goto L8f
            java.lang.String r3 = r11.httpMethod
            java.lang.String r7 = "HEAD"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L70
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L67
            goto L70
        L67:
            java.lang.String r9 = "HEAD method must use Void as response type."
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.RuntimeException r9 = retrofit2.Utils.methodError(r10, r9, r11)
            throw r9
        L70:
            retrofit2.Converter r10 = createResponseConverter(r9, r10, r1)
            okhttp3.Call$Factory r3 = r9.callFactory
            if (r0 != 0) goto L7e
            retrofit2.HttpServiceMethod$CallAdapted r9 = new retrofit2.HttpServiceMethod$CallAdapted
            r9.<init>(r11, r3, r10, r5)
            return r9
        L7e:
            if (r4 == 0) goto L86
            retrofit2.HttpServiceMethod$SuspendForResponse r9 = new retrofit2.HttpServiceMethod$SuspendForResponse
            r9.<init>(r11, r3, r10, r5)
            return r9
        L86:
            retrofit2.HttpServiceMethod$SuspendForBody r9 = new retrofit2.HttpServiceMethod$SuspendForBody
            r1 = r9
            r2 = r11
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r9
        L8f:
            java.lang.String r9 = "Response must include generic type (e.g., Response<String>)"
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.RuntimeException r9 = retrofit2.Utils.methodError(r10, r9, r11)
            throw r9
        L98:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "'"
            r9.<init>(r11)
            java.lang.Class r11 = retrofit2.Utils.getRawType(r1)
            java.lang.String r11 = r11.getName()
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = "' is not a valid response body type. Did you mean ResponseBody?"
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.RuntimeException r9 = retrofit2.Utils.methodError(r10, r9, r11)
            throw r9
    }

    @javax.annotation.Nullable
    protected abstract ReturnT adapt(retrofit2.Call<ResponseT> r1, java.lang.Object[] r2);

    @Override // retrofit2.ServiceMethod
    @javax.annotation.Nullable
    final ReturnT invoke(java.lang.Object[] r5) {
            r4 = this;
            retrofit2.OkHttpCall r0 = new retrofit2.OkHttpCall
            retrofit2.RequestFactory r1 = r4.requestFactory
            okhttp3.Call$Factory r2 = r4.callFactory
            retrofit2.Converter<okhttp3.ResponseBody, ResponseT> r3 = r4.responseConverter
            r0.<init>(r1, r5, r2, r3)
            java.lang.Object r5 = r4.adapt(r0, r5)
            return r5
    }
}
