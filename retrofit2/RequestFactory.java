package retrofit2;

/* loaded from: classes.dex */
final class RequestFactory {
    private final okhttp3.HttpUrl baseUrl;

    @javax.annotation.Nullable
    private final okhttp3.MediaType contentType;
    private final boolean hasBody;

    @javax.annotation.Nullable
    private final okhttp3.Headers headers;
    final java.lang.String httpMethod;
    private final boolean isFormEncoded;
    final boolean isKotlinSuspendFunction;
    private final boolean isMultipart;
    private final java.lang.reflect.Method method;
    private final retrofit2.ParameterHandler<?>[] parameterHandlers;

    @javax.annotation.Nullable
    private final java.lang.String relativeUrl;

    static final class Builder {
        private static final java.lang.String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final java.util.regex.Pattern PARAM_NAME_REGEX = null;
        private static final java.util.regex.Pattern PARAM_URL_REGEX = null;

        @javax.annotation.Nullable
        okhttp3.MediaType contentType;
        boolean gotBody;
        boolean gotField;
        boolean gotPart;
        boolean gotPath;
        boolean gotQuery;
        boolean gotQueryMap;
        boolean gotQueryName;
        boolean gotUrl;
        boolean hasBody;

        @javax.annotation.Nullable
        okhttp3.Headers headers;

        @javax.annotation.Nullable
        java.lang.String httpMethod;
        boolean isFormEncoded;
        boolean isKotlinSuspendFunction;
        boolean isMultipart;
        final java.lang.reflect.Method method;
        final java.lang.annotation.Annotation[] methodAnnotations;
        final java.lang.annotation.Annotation[][] parameterAnnotationsArray;

        @javax.annotation.Nullable
        retrofit2.ParameterHandler<?>[] parameterHandlers;
        final java.lang.reflect.Type[] parameterTypes;

        @javax.annotation.Nullable
        java.lang.String relativeUrl;

        @javax.annotation.Nullable
        java.util.Set<java.lang.String> relativeUrlParamNames;
        final retrofit2.Retrofit retrofit;

        static {
                java.lang.String r0 = "\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                retrofit2.RequestFactory.Builder.PARAM_URL_REGEX = r0
                java.lang.String r0 = "[a-zA-Z][a-zA-Z0-9_-]*"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                retrofit2.RequestFactory.Builder.PARAM_NAME_REGEX = r0
                return
        }

        Builder(retrofit2.Retrofit r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.retrofit = r1
                r0.method = r2
                java.lang.annotation.Annotation[] r1 = r2.getAnnotations()
                r0.methodAnnotations = r1
                java.lang.reflect.Type[] r1 = r2.getGenericParameterTypes()
                r0.parameterTypes = r1
                java.lang.annotation.Annotation[][] r1 = r2.getParameterAnnotations()
                r0.parameterAnnotationsArray = r1
                return
        }

        private static java.lang.Class<?> boxIfPrimitive(java.lang.Class<?> r1) {
                java.lang.Class r0 = java.lang.Boolean.TYPE
                if (r0 != r1) goto L7
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                return r1
            L7:
                java.lang.Class r0 = java.lang.Byte.TYPE
                if (r0 != r1) goto Le
                java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
                return r1
            Le:
                java.lang.Class r0 = java.lang.Character.TYPE
                if (r0 != r1) goto L15
                java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
                return r1
            L15:
                java.lang.Class r0 = java.lang.Double.TYPE
                if (r0 != r1) goto L1c
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                return r1
            L1c:
                java.lang.Class r0 = java.lang.Float.TYPE
                if (r0 != r1) goto L23
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                return r1
            L23:
                java.lang.Class r0 = java.lang.Integer.TYPE
                if (r0 != r1) goto L2a
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                return r1
            L2a:
                java.lang.Class r0 = java.lang.Long.TYPE
                if (r0 != r1) goto L31
                java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                return r1
            L31:
                java.lang.Class r0 = java.lang.Short.TYPE
                if (r0 != r1) goto L37
                java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            L37:
                return r1
        }

        private okhttp3.Headers parseHeaders(java.lang.String[] r9) {
                r8 = this;
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                int r1 = r9.length
                r2 = 0
                r3 = r2
            L8:
                if (r3 >= r1) goto L5d
                r4 = r9[r3]
                r5 = 58
                int r5 = r4.indexOf(r5)
                r6 = -1
                r7 = 1
                if (r5 == r6) goto L50
                if (r5 == 0) goto L50
                int r6 = r4.length()
                int r6 = r6 - r7
                if (r5 == r6) goto L50
                java.lang.String r6 = r4.substring(r2, r5)
                int r5 = r5 + 1
                java.lang.String r4 = r4.substring(r5)
                java.lang.String r4 = r4.trim()
                java.lang.String r5 = "Content-Type"
                boolean r5 = r5.equalsIgnoreCase(r6)
                if (r5 == 0) goto L4a
                okhttp3.MediaType r5 = okhttp3.MediaType.get(r4)     // Catch: java.lang.IllegalArgumentException -> L3c
                r8.contentType = r5     // Catch: java.lang.IllegalArgumentException -> L3c
                goto L4d
            L3c:
                r9 = move-exception
                java.lang.reflect.Method r0 = r8.method
                java.lang.Object[] r1 = new java.lang.Object[r7]
                r1[r2] = r4
                java.lang.String r2 = "Malformed content type: %s"
                java.lang.RuntimeException r9 = retrofit2.Utils.methodError(r0, r9, r2, r1)
                throw r9
            L4a:
                r0.add(r6, r4)
            L4d:
                int r3 = r3 + 1
                goto L8
            L50:
                java.lang.reflect.Method r9 = r8.method
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r2] = r4
                java.lang.String r1 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
                java.lang.RuntimeException r9 = retrofit2.Utils.methodError(r9, r1, r0)
                throw r9
            L5d:
                okhttp3.Headers r9 = r0.build()
                return r9
        }

        private void parseHttpMethodAndPath(java.lang.String r4, java.lang.String r5, boolean r6) {
                r3 = this;
                java.lang.String r0 = r3.httpMethod
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L49
                r3.httpMethod = r4
                r3.hasBody = r6
                boolean r4 = r5.isEmpty()
                if (r4 == 0) goto L11
                return
            L11:
                r4 = 63
                int r4 = r5.indexOf(r4)
                r6 = -1
                if (r4 == r6) goto L40
                int r6 = r5.length()
                int r6 = r6 - r2
                if (r4 >= r6) goto L40
                int r4 = r4 + r2
                java.lang.String r4 = r5.substring(r4)
                java.util.regex.Pattern r6 = retrofit2.RequestFactory.Builder.PARAM_URL_REGEX
                java.util.regex.Matcher r6 = r6.matcher(r4)
                boolean r6 = r6.find()
                if (r6 != 0) goto L33
                goto L40
            L33:
                java.lang.reflect.Method r5 = r3.method
                java.lang.Object[] r6 = new java.lang.Object[r2]
                r6[r1] = r4
                java.lang.String r4 = "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query."
                java.lang.RuntimeException r4 = retrofit2.Utils.methodError(r5, r4, r6)
                throw r4
            L40:
                r3.relativeUrl = r5
                java.util.Set r4 = parsePathParameters(r5)
                r3.relativeUrlParamNames = r4
                return
            L49:
                java.lang.reflect.Method r5 = r3.method
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r1] = r0
                r6[r2] = r4
                java.lang.String r4 = "Only one HTTP method is allowed. Found: %s and %s."
                java.lang.RuntimeException r4 = retrofit2.Utils.methodError(r5, r4, r6)
                throw r4
        }

        private void parseMethodAnnotation(java.lang.annotation.Annotation r5) {
                r4 = this;
                boolean r0 = r5 instanceof retrofit2.http.DELETE
                r1 = 0
                if (r0 == 0) goto L12
                retrofit2.http.DELETE r5 = (retrofit2.http.DELETE) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "DELETE"
                r4.parseHttpMethodAndPath(r0, r5, r1)
                goto Ld7
            L12:
                boolean r0 = r5 instanceof retrofit2.http.GET
                if (r0 == 0) goto L23
                retrofit2.http.GET r5 = (retrofit2.http.GET) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "GET"
                r4.parseHttpMethodAndPath(r0, r5, r1)
                goto Ld7
            L23:
                boolean r0 = r5 instanceof retrofit2.http.HEAD
                if (r0 == 0) goto L34
                retrofit2.http.HEAD r5 = (retrofit2.http.HEAD) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "HEAD"
                r4.parseHttpMethodAndPath(r0, r5, r1)
                goto Ld7
            L34:
                boolean r0 = r5 instanceof retrofit2.http.PATCH
                r2 = 1
                if (r0 == 0) goto L46
                retrofit2.http.PATCH r5 = (retrofit2.http.PATCH) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "PATCH"
                r4.parseHttpMethodAndPath(r0, r5, r2)
                goto Ld7
            L46:
                boolean r0 = r5 instanceof retrofit2.http.POST
                if (r0 == 0) goto L57
                retrofit2.http.POST r5 = (retrofit2.http.POST) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "POST"
                r4.parseHttpMethodAndPath(r0, r5, r2)
                goto Ld7
            L57:
                boolean r0 = r5 instanceof retrofit2.http.PUT
                if (r0 == 0) goto L68
                retrofit2.http.PUT r5 = (retrofit2.http.PUT) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "PUT"
                r4.parseHttpMethodAndPath(r0, r5, r2)
                goto Ld7
            L68:
                boolean r0 = r5 instanceof retrofit2.http.OPTIONS
                if (r0 == 0) goto L78
                retrofit2.http.OPTIONS r5 = (retrofit2.http.OPTIONS) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "OPTIONS"
                r4.parseHttpMethodAndPath(r0, r5, r1)
                goto Ld7
            L78:
                boolean r0 = r5 instanceof retrofit2.http.HTTP
                if (r0 == 0) goto L8e
                retrofit2.http.HTTP r5 = (retrofit2.http.HTTP) r5
                java.lang.String r0 = r5.method()
                java.lang.String r1 = r5.path()
                boolean r5 = r5.hasBody()
                r4.parseHttpMethodAndPath(r0, r1, r5)
                goto Ld7
            L8e:
                boolean r0 = r5 instanceof retrofit2.http.Headers
                if (r0 == 0) goto Lad
                retrofit2.http.Headers r5 = (retrofit2.http.Headers) r5
                java.lang.String[] r5 = r5.value()
                int r0 = r5.length
                if (r0 == 0) goto La2
                okhttp3.Headers r5 = r4.parseHeaders(r5)
                r4.headers = r5
                goto Ld7
            La2:
                java.lang.reflect.Method r5 = r4.method
                java.lang.String r0 = "@Headers annotation is empty."
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.RuntimeException r5 = retrofit2.Utils.methodError(r5, r0, r1)
                throw r5
            Lad:
                boolean r0 = r5 instanceof retrofit2.http.Multipart
                java.lang.String r3 = "Only one encoding annotation is allowed."
                if (r0 == 0) goto Lc3
                boolean r5 = r4.isFormEncoded
                if (r5 != 0) goto Lba
                r4.isMultipart = r2
                goto Ld7
            Lba:
                java.lang.reflect.Method r5 = r4.method
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.RuntimeException r5 = retrofit2.Utils.methodError(r5, r3, r0)
                throw r5
            Lc3:
                boolean r5 = r5 instanceof retrofit2.http.FormUrlEncoded
                if (r5 == 0) goto Ld7
                boolean r5 = r4.isMultipart
                if (r5 != 0) goto Lce
                r4.isFormEncoded = r2
                goto Ld7
            Lce:
                java.lang.reflect.Method r5 = r4.method
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.RuntimeException r5 = retrofit2.Utils.methodError(r5, r3, r0)
                throw r5
            Ld7:
                return
        }

        @javax.annotation.Nullable
        private retrofit2.ParameterHandler<?> parseParameter(int r7, java.lang.reflect.Type r8, @javax.annotation.Nullable java.lang.annotation.Annotation[] r9, boolean r10) {
                r6 = this;
                r0 = 0
                r1 = 0
                if (r9 == 0) goto L23
                int r2 = r9.length
                r3 = r0
                r4 = r1
            L7:
                if (r3 >= r2) goto L24
                r5 = r9[r3]
                retrofit2.ParameterHandler r5 = r6.parseParameterAnnotation(r7, r8, r9, r5)
                if (r5 != 0) goto L12
                goto L15
            L12:
                if (r4 != 0) goto L18
                r4 = r5
            L15:
                int r3 = r3 + 1
                goto L7
            L18:
                java.lang.reflect.Method r8 = r6.method
                java.lang.String r9 = "Multiple Retrofit annotations found, only one allowed."
                java.lang.Object[] r10 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r8, r7, r9, r10)
                throw r7
            L23:
                r4 = r1
            L24:
                if (r4 != 0) goto L3f
                if (r10 == 0) goto L34
                java.lang.Class r8 = retrofit2.Utils.getRawType(r8)     // Catch: java.lang.NoClassDefFoundError -> L34
                java.lang.Class<kotlin.coroutines.Continuation> r9 = kotlin.coroutines.Continuation.class
                if (r8 != r9) goto L34
                r8 = 1
                r6.isKotlinSuspendFunction = r8     // Catch: java.lang.NoClassDefFoundError -> L34
                return r1
            L34:
                java.lang.reflect.Method r8 = r6.method
                java.lang.String r9 = "No Retrofit annotation found."
                java.lang.Object[] r10 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r8, r7, r9, r10)
                throw r7
            L3f:
                return r4
        }

        @javax.annotation.Nullable
        private retrofit2.ParameterHandler<?> parseParameterAnnotation(int r10, java.lang.reflect.Type r11, java.lang.annotation.Annotation[] r12, java.lang.annotation.Annotation r13) {
                r9 = this;
                boolean r0 = r13 instanceof retrofit2.http.Url
                java.lang.String r1 = "@Path parameters may not be used with @Url."
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L9b
                r9.validateResolvableType(r10, r11)
                boolean r12 = r9.gotUrl
                if (r12 != 0) goto L90
                boolean r12 = r9.gotPath
                if (r12 != 0) goto L87
                boolean r12 = r9.gotQuery
                if (r12 != 0) goto L7c
                boolean r12 = r9.gotQueryName
                if (r12 != 0) goto L71
                boolean r12 = r9.gotQueryMap
                if (r12 != 0) goto L66
                java.lang.String r12 = r9.relativeUrl
                if (r12 != 0) goto L57
                r9.gotUrl = r2
                java.lang.Class<okhttp3.HttpUrl> r12 = okhttp3.HttpUrl.class
                if (r11 == r12) goto L4f
                java.lang.Class<java.lang.String> r12 = java.lang.String.class
                if (r11 == r12) goto L4f
                java.lang.Class<java.net.URI> r12 = java.net.URI.class
                if (r11 == r12) goto L4f
                boolean r12 = r11 instanceof java.lang.Class
                if (r12 == 0) goto L44
                java.lang.Class r11 = (java.lang.Class) r11
                java.lang.String r11 = r11.getName()
                java.lang.String r12 = "android.net.Uri"
                boolean r11 = r12.equals(r11)
                if (r11 == 0) goto L44
                goto L4f
            L44:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L4f:
                retrofit2.ParameterHandler$RelativeUrl r11 = new retrofit2.ParameterHandler$RelativeUrl
                java.lang.reflect.Method r12 = r9.method
                r11.<init>(r12, r10)
                return r11
            L57:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r2]
                java.lang.String r13 = r9.httpMethod
                r12[r3] = r13
                java.lang.String r13 = "@Url cannot be used with @%s URL"
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r13, r12)
                throw r10
            L66:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "A @Url parameter must not come after a @QueryMap."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L71:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "A @Url parameter must not come after a @QueryName."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L7c:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "A @Url parameter must not come after a @Query."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L87:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r1, r12)
                throw r10
            L90:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "Multiple @Url method annotations found."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L9b:
                boolean r0 = r13 instanceof retrofit2.http.Path
                if (r0 == 0) goto L10e
                r9.validateResolvableType(r10, r11)
                boolean r0 = r9.gotQuery
                if (r0 != 0) goto L103
                boolean r0 = r9.gotQueryName
                if (r0 != 0) goto Lf8
                boolean r0 = r9.gotQueryMap
                if (r0 != 0) goto Led
                boolean r0 = r9.gotUrl
                if (r0 != 0) goto Le4
                java.lang.String r0 = r9.relativeUrl
                if (r0 == 0) goto Ld5
                r9.gotPath = r2
                retrofit2.http.Path r13 = (retrofit2.http.Path) r13
                java.lang.String r3 = r13.value()
                r9.validatePathName(r10, r3)
                retrofit2.Retrofit r0 = r9.retrofit
                retrofit2.Converter r4 = r0.stringConverter(r11, r12)
                retrofit2.ParameterHandler$Path r11 = new retrofit2.ParameterHandler$Path
                java.lang.reflect.Method r1 = r9.method
                boolean r5 = r13.encoded()
                r0 = r11
                r2 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                return r11
            Ld5:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r2]
                java.lang.String r13 = r9.httpMethod
                r12[r3] = r13
                java.lang.String r13 = "@Path can only be used with relative url on @%s"
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r13, r12)
                throw r10
            Le4:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r1, r12)
                throw r10
            Led:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "A @Path parameter must not come after a @QueryMap."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            Lf8:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "A @Path parameter must not come after a @QueryName."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L103:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "A @Path parameter must not come after a @Query."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L10e:
                boolean r0 = r13 instanceof retrofit2.http.Query
                java.lang.String r1 = "<String>)"
                java.lang.String r4 = " must include generic type (e.g., "
                if (r0 == 0) goto L19f
                r9.validateResolvableType(r10, r11)
                retrofit2.http.Query r13 = (retrofit2.http.Query) r13
                java.lang.String r0 = r13.value()
                boolean r13 = r13.encoded()
                java.lang.Class r5 = retrofit2.Utils.getRawType(r11)
                r9.gotQuery = r2
                java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
                boolean r2 = r2.isAssignableFrom(r5)
                if (r2 == 0) goto L175
                boolean r2 = r11 instanceof java.lang.reflect.ParameterizedType
                if (r2 == 0) goto L14b
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                java.lang.reflect.Type r10 = retrofit2.Utils.getParameterUpperBound(r3, r11)
                retrofit2.Retrofit r11 = r9.retrofit
                retrofit2.Converter r10 = r11.stringConverter(r10, r12)
                retrofit2.ParameterHandler$Query r11 = new retrofit2.ParameterHandler$Query
                r11.<init>(r0, r10, r13)
                retrofit2.ParameterHandler r10 = r11.iterable()
                return r10
            L14b:
                java.lang.reflect.Method r11 = r9.method
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = r5.getSimpleName()
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.StringBuilder r12 = r12.append(r4)
                java.lang.String r13 = r5.getSimpleName()
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.StringBuilder r12 = r12.append(r1)
                java.lang.String r12 = r12.toString()
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L175:
                boolean r10 = r5.isArray()
                if (r10 == 0) goto L193
                java.lang.Class r10 = r5.getComponentType()
                java.lang.Class r10 = boxIfPrimitive(r10)
                retrofit2.Retrofit r11 = r9.retrofit
                retrofit2.Converter r10 = r11.stringConverter(r10, r12)
                retrofit2.ParameterHandler$Query r11 = new retrofit2.ParameterHandler$Query
                r11.<init>(r0, r10, r13)
                retrofit2.ParameterHandler r10 = r11.array()
                return r10
            L193:
                retrofit2.Retrofit r10 = r9.retrofit
                retrofit2.Converter r10 = r10.stringConverter(r11, r12)
                retrofit2.ParameterHandler$Query r11 = new retrofit2.ParameterHandler$Query
                r11.<init>(r0, r10, r13)
                return r11
            L19f:
                boolean r0 = r13 instanceof retrofit2.http.QueryName
                if (r0 == 0) goto L228
                r9.validateResolvableType(r10, r11)
                retrofit2.http.QueryName r13 = (retrofit2.http.QueryName) r13
                boolean r13 = r13.encoded()
                java.lang.Class r0 = retrofit2.Utils.getRawType(r11)
                r9.gotQueryName = r2
                java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
                boolean r2 = r2.isAssignableFrom(r0)
                if (r2 == 0) goto L1fe
                boolean r2 = r11 instanceof java.lang.reflect.ParameterizedType
                if (r2 == 0) goto L1d4
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                java.lang.reflect.Type r10 = retrofit2.Utils.getParameterUpperBound(r3, r11)
                retrofit2.Retrofit r11 = r9.retrofit
                retrofit2.Converter r10 = r11.stringConverter(r10, r12)
                retrofit2.ParameterHandler$QueryName r11 = new retrofit2.ParameterHandler$QueryName
                r11.<init>(r10, r13)
                retrofit2.ParameterHandler r10 = r11.iterable()
                return r10
            L1d4:
                java.lang.reflect.Method r11 = r9.method
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = r0.getSimpleName()
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.StringBuilder r12 = r12.append(r4)
                java.lang.String r13 = r0.getSimpleName()
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.StringBuilder r12 = r12.append(r1)
                java.lang.String r12 = r12.toString()
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L1fe:
                boolean r10 = r0.isArray()
                if (r10 == 0) goto L21c
                java.lang.Class r10 = r0.getComponentType()
                java.lang.Class r10 = boxIfPrimitive(r10)
                retrofit2.Retrofit r11 = r9.retrofit
                retrofit2.Converter r10 = r11.stringConverter(r10, r12)
                retrofit2.ParameterHandler$QueryName r11 = new retrofit2.ParameterHandler$QueryName
                r11.<init>(r10, r13)
                retrofit2.ParameterHandler r10 = r11.array()
                return r10
            L21c:
                retrofit2.Retrofit r10 = r9.retrofit
                retrofit2.Converter r10 = r10.stringConverter(r11, r12)
                retrofit2.ParameterHandler$QueryName r11 = new retrofit2.ParameterHandler$QueryName
                r11.<init>(r10, r13)
                return r11
            L228:
                boolean r0 = r13 instanceof retrofit2.http.QueryMap
                java.lang.String r5 = "Map must include generic types (e.g., Map<String, String>)"
                if (r0 == 0) goto L297
                r9.validateResolvableType(r10, r11)
                java.lang.Class r0 = retrofit2.Utils.getRawType(r11)
                r9.gotQueryMap = r2
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                boolean r1 = r1.isAssignableFrom(r0)
                if (r1 == 0) goto L28c
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                java.lang.reflect.Type r11 = retrofit2.Utils.getSupertype(r11, r0, r1)
                boolean r0 = r11 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L283
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                java.lang.reflect.Type r0 = retrofit2.Utils.getParameterUpperBound(r3, r11)
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r1 != r0) goto L26b
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r2, r11)
                retrofit2.Retrofit r0 = r9.retrofit
                retrofit2.Converter r11 = r0.stringConverter(r11, r12)
                retrofit2.ParameterHandler$QueryMap r12 = new retrofit2.ParameterHandler$QueryMap
                java.lang.reflect.Method r0 = r9.method
                retrofit2.http.QueryMap r13 = (retrofit2.http.QueryMap) r13
                boolean r13 = r13.encoded()
                r12.<init>(r0, r10, r11, r13)
                return r12
            L26b:
                java.lang.reflect.Method r11 = r9.method
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                java.lang.String r13 = "@QueryMap keys must be of type String: "
                r12.<init>(r13)
                java.lang.StringBuilder r12 = r12.append(r0)
                java.lang.String r12 = r12.toString()
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L283:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r5, r12)
                throw r10
            L28c:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "@QueryMap parameter type must be Map."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L297:
                boolean r0 = r13 instanceof retrofit2.http.Header
                if (r0 == 0) goto L31e
                r9.validateResolvableType(r10, r11)
                retrofit2.http.Header r13 = (retrofit2.http.Header) r13
                java.lang.String r13 = r13.value()
                java.lang.Class r0 = retrofit2.Utils.getRawType(r11)
                java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
                boolean r2 = r2.isAssignableFrom(r0)
                if (r2 == 0) goto L2f4
                boolean r2 = r11 instanceof java.lang.reflect.ParameterizedType
                if (r2 == 0) goto L2ca
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                java.lang.reflect.Type r10 = retrofit2.Utils.getParameterUpperBound(r3, r11)
                retrofit2.Retrofit r11 = r9.retrofit
                retrofit2.Converter r10 = r11.stringConverter(r10, r12)
                retrofit2.ParameterHandler$Header r11 = new retrofit2.ParameterHandler$Header
                r11.<init>(r13, r10)
                retrofit2.ParameterHandler r10 = r11.iterable()
                return r10
            L2ca:
                java.lang.reflect.Method r11 = r9.method
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = r0.getSimpleName()
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.StringBuilder r12 = r12.append(r4)
                java.lang.String r13 = r0.getSimpleName()
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.StringBuilder r12 = r12.append(r1)
                java.lang.String r12 = r12.toString()
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L2f4:
                boolean r10 = r0.isArray()
                if (r10 == 0) goto L312
                java.lang.Class r10 = r0.getComponentType()
                java.lang.Class r10 = boxIfPrimitive(r10)
                retrofit2.Retrofit r11 = r9.retrofit
                retrofit2.Converter r10 = r11.stringConverter(r10, r12)
                retrofit2.ParameterHandler$Header r11 = new retrofit2.ParameterHandler$Header
                r11.<init>(r13, r10)
                retrofit2.ParameterHandler r10 = r11.array()
                return r10
            L312:
                retrofit2.Retrofit r10 = r9.retrofit
                retrofit2.Converter r10 = r10.stringConverter(r11, r12)
                retrofit2.ParameterHandler$Header r11 = new retrofit2.ParameterHandler$Header
                r11.<init>(r13, r10)
                return r11
            L31e:
                boolean r0 = r13 instanceof retrofit2.http.HeaderMap
                if (r0 == 0) goto L38f
                java.lang.Class<okhttp3.Headers> r13 = okhttp3.Headers.class
                if (r11 != r13) goto L32e
                retrofit2.ParameterHandler$Headers r11 = new retrofit2.ParameterHandler$Headers
                java.lang.reflect.Method r12 = r9.method
                r11.<init>(r12, r10)
                return r11
            L32e:
                r9.validateResolvableType(r10, r11)
                java.lang.Class r13 = retrofit2.Utils.getRawType(r11)
                java.lang.Class<java.util.Map> r0 = java.util.Map.class
                boolean r0 = r0.isAssignableFrom(r13)
                if (r0 == 0) goto L384
                java.lang.Class<java.util.Map> r0 = java.util.Map.class
                java.lang.reflect.Type r11 = retrofit2.Utils.getSupertype(r11, r13, r0)
                boolean r13 = r11 instanceof java.lang.reflect.ParameterizedType
                if (r13 == 0) goto L37b
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                java.lang.reflect.Type r13 = retrofit2.Utils.getParameterUpperBound(r3, r11)
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                if (r0 != r13) goto L363
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r2, r11)
                retrofit2.Retrofit r13 = r9.retrofit
                retrofit2.Converter r11 = r13.stringConverter(r11, r12)
                retrofit2.ParameterHandler$HeaderMap r12 = new retrofit2.ParameterHandler$HeaderMap
                java.lang.reflect.Method r13 = r9.method
                r12.<init>(r13, r10, r11)
                return r12
            L363:
                java.lang.reflect.Method r11 = r9.method
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                java.lang.String r0 = "@HeaderMap keys must be of type String: "
                r12.<init>(r0)
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L37b:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r5, r12)
                throw r10
            L384:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "@HeaderMap parameter type must be Map."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L38f:
                boolean r0 = r13 instanceof retrofit2.http.Field
                if (r0 == 0) goto L42b
                r9.validateResolvableType(r10, r11)
                boolean r0 = r9.isFormEncoded
                if (r0 == 0) goto L420
                retrofit2.http.Field r13 = (retrofit2.http.Field) r13
                java.lang.String r0 = r13.value()
                boolean r13 = r13.encoded()
                r9.gotField = r2
                java.lang.Class r2 = retrofit2.Utils.getRawType(r11)
                java.lang.Class<java.lang.Iterable> r5 = java.lang.Iterable.class
                boolean r5 = r5.isAssignableFrom(r2)
                if (r5 == 0) goto L3f6
                boolean r5 = r11 instanceof java.lang.reflect.ParameterizedType
                if (r5 == 0) goto L3cc
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                java.lang.reflect.Type r10 = retrofit2.Utils.getParameterUpperBound(r3, r11)
                retrofit2.Retrofit r11 = r9.retrofit
                retrofit2.Converter r10 = r11.stringConverter(r10, r12)
                retrofit2.ParameterHandler$Field r11 = new retrofit2.ParameterHandler$Field
                r11.<init>(r0, r10, r13)
                retrofit2.ParameterHandler r10 = r11.iterable()
                return r10
            L3cc:
                java.lang.reflect.Method r11 = r9.method
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = r2.getSimpleName()
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.StringBuilder r12 = r12.append(r4)
                java.lang.String r13 = r2.getSimpleName()
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.StringBuilder r12 = r12.append(r1)
                java.lang.String r12 = r12.toString()
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L3f6:
                boolean r10 = r2.isArray()
                if (r10 == 0) goto L414
                java.lang.Class r10 = r2.getComponentType()
                java.lang.Class r10 = boxIfPrimitive(r10)
                retrofit2.Retrofit r11 = r9.retrofit
                retrofit2.Converter r10 = r11.stringConverter(r10, r12)
                retrofit2.ParameterHandler$Field r11 = new retrofit2.ParameterHandler$Field
                r11.<init>(r0, r10, r13)
                retrofit2.ParameterHandler r10 = r11.array()
                return r10
            L414:
                retrofit2.Retrofit r10 = r9.retrofit
                retrofit2.Converter r10 = r10.stringConverter(r11, r12)
                retrofit2.ParameterHandler$Field r11 = new retrofit2.ParameterHandler$Field
                r11.<init>(r0, r10, r13)
                return r11
            L420:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "@Field parameters can only be used with form encoding."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L42b:
                boolean r0 = r13 instanceof retrofit2.http.FieldMap
                if (r0 == 0) goto L4a7
                r9.validateResolvableType(r10, r11)
                boolean r0 = r9.isFormEncoded
                if (r0 == 0) goto L49c
                java.lang.Class r0 = retrofit2.Utils.getRawType(r11)
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                boolean r1 = r1.isAssignableFrom(r0)
                if (r1 == 0) goto L491
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                java.lang.reflect.Type r11 = retrofit2.Utils.getSupertype(r11, r0, r1)
                boolean r0 = r11 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L488
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                java.lang.reflect.Type r0 = retrofit2.Utils.getParameterUpperBound(r3, r11)
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r1 != r0) goto L470
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r2, r11)
                retrofit2.Retrofit r0 = r9.retrofit
                retrofit2.Converter r11 = r0.stringConverter(r11, r12)
                r9.gotField = r2
                retrofit2.ParameterHandler$FieldMap r12 = new retrofit2.ParameterHandler$FieldMap
                java.lang.reflect.Method r0 = r9.method
                retrofit2.http.FieldMap r13 = (retrofit2.http.FieldMap) r13
                boolean r13 = r13.encoded()
                r12.<init>(r0, r10, r11, r13)
                return r12
            L470:
                java.lang.reflect.Method r11 = r9.method
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                java.lang.String r13 = "@FieldMap keys must be of type String: "
                r12.<init>(r13)
                java.lang.StringBuilder r12 = r12.append(r0)
                java.lang.String r12 = r12.toString()
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L488:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r5, r12)
                throw r10
            L491:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "@FieldMap parameter type must be Map."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L49c:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "@FieldMap parameters can only be used with form encoding."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L4a7:
                boolean r0 = r13 instanceof retrofit2.http.Part
                if (r0 == 0) goto L648
                r9.validateResolvableType(r10, r11)
                boolean r0 = r9.isMultipart
                if (r0 == 0) goto L63d
                retrofit2.http.Part r13 = (retrofit2.http.Part) r13
                r9.gotPart = r2
                java.lang.String r0 = r13.value()
                java.lang.Class r5 = retrofit2.Utils.getRawType(r11)
                boolean r6 = r0.isEmpty()
                if (r6 == 0) goto L554
                java.lang.Class<java.lang.Iterable> r12 = java.lang.Iterable.class
                boolean r12 = r12.isAssignableFrom(r5)
                java.lang.String r13 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
                if (r12 == 0) goto L51e
                boolean r12 = r11 instanceof java.lang.reflect.ParameterizedType
                if (r12 == 0) goto L4f4
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r3, r11)
                java.lang.Class<okhttp3.MultipartBody$Part> r12 = okhttp3.MultipartBody.Part.class
                java.lang.Class r11 = retrofit2.Utils.getRawType(r11)
                boolean r11 = r12.isAssignableFrom(r11)
                if (r11 == 0) goto L4eb
                retrofit2.ParameterHandler$RawPart r10 = retrofit2.ParameterHandler.RawPart.INSTANCE
                retrofit2.ParameterHandler r10 = r10.iterable()
                return r10
            L4eb:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r13, r12)
                throw r10
            L4f4:
                java.lang.reflect.Method r11 = r9.method
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = r5.getSimpleName()
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.StringBuilder r12 = r12.append(r4)
                java.lang.String r13 = r5.getSimpleName()
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.StringBuilder r12 = r12.append(r1)
                java.lang.String r12 = r12.toString()
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L51e:
                boolean r11 = r5.isArray()
                if (r11 == 0) goto L540
                java.lang.Class r11 = r5.getComponentType()
                java.lang.Class<okhttp3.MultipartBody$Part> r12 = okhttp3.MultipartBody.Part.class
                boolean r11 = r12.isAssignableFrom(r11)
                if (r11 == 0) goto L537
                retrofit2.ParameterHandler$RawPart r10 = retrofit2.ParameterHandler.RawPart.INSTANCE
                retrofit2.ParameterHandler r10 = r10.array()
                return r10
            L537:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r13, r12)
                throw r10
            L540:
                java.lang.Class<okhttp3.MultipartBody$Part> r11 = okhttp3.MultipartBody.Part.class
                boolean r11 = r11.isAssignableFrom(r5)
                if (r11 == 0) goto L54b
                retrofit2.ParameterHandler$RawPart r10 = retrofit2.ParameterHandler.RawPart.INSTANCE
                return r10
            L54b:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r13, r12)
                throw r10
            L554:
                r6 = 4
                java.lang.String[] r6 = new java.lang.String[r6]
                java.lang.String r7 = "Content-Disposition"
                r6[r3] = r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r8 = "form-data; name=\""
                r7.<init>(r8)
                java.lang.StringBuilder r0 = r7.append(r0)
                java.lang.String r7 = "\""
                java.lang.StringBuilder r0 = r0.append(r7)
                java.lang.String r0 = r0.toString()
                r6[r2] = r0
                r0 = 2
                java.lang.String r2 = "Content-Transfer-Encoding"
                r6[r0] = r2
                r0 = 3
                java.lang.String r13 = r13.encoding()
                r6[r0] = r13
                okhttp3.Headers r13 = okhttp3.Headers.m94of(r6)
                java.lang.Class<java.lang.Iterable> r0 = java.lang.Iterable.class
                boolean r0 = r0.isAssignableFrom(r5)
                java.lang.String r2 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
                if (r0 == 0) goto L5e9
                boolean r0 = r11 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L5bf
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r3, r11)
                java.lang.Class<okhttp3.MultipartBody$Part> r0 = okhttp3.MultipartBody.Part.class
                java.lang.Class r1 = retrofit2.Utils.getRawType(r11)
                boolean r0 = r0.isAssignableFrom(r1)
                if (r0 != 0) goto L5b6
                retrofit2.Retrofit r0 = r9.retrofit
                java.lang.annotation.Annotation[] r1 = r9.methodAnnotations
                retrofit2.Converter r11 = r0.requestBodyConverter(r11, r12, r1)
                retrofit2.ParameterHandler$Part r12 = new retrofit2.ParameterHandler$Part
                java.lang.reflect.Method r0 = r9.method
                r12.<init>(r0, r10, r13, r11)
                retrofit2.ParameterHandler r10 = r12.iterable()
                return r10
            L5b6:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r2, r12)
                throw r10
            L5bf:
                java.lang.reflect.Method r11 = r9.method
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = r5.getSimpleName()
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.StringBuilder r12 = r12.append(r4)
                java.lang.String r13 = r5.getSimpleName()
                java.lang.StringBuilder r12 = r12.append(r13)
                java.lang.StringBuilder r12 = r12.append(r1)
                java.lang.String r12 = r12.toString()
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L5e9:
                boolean r0 = r5.isArray()
                if (r0 == 0) goto L61c
                java.lang.Class r11 = r5.getComponentType()
                java.lang.Class r11 = boxIfPrimitive(r11)
                java.lang.Class<okhttp3.MultipartBody$Part> r0 = okhttp3.MultipartBody.Part.class
                boolean r0 = r0.isAssignableFrom(r11)
                if (r0 != 0) goto L613
                retrofit2.Retrofit r0 = r9.retrofit
                java.lang.annotation.Annotation[] r1 = r9.methodAnnotations
                retrofit2.Converter r11 = r0.requestBodyConverter(r11, r12, r1)
                retrofit2.ParameterHandler$Part r12 = new retrofit2.ParameterHandler$Part
                java.lang.reflect.Method r0 = r9.method
                r12.<init>(r0, r10, r13, r11)
                retrofit2.ParameterHandler r10 = r12.array()
                return r10
            L613:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r2, r12)
                throw r10
            L61c:
                java.lang.Class<okhttp3.MultipartBody$Part> r0 = okhttp3.MultipartBody.Part.class
                boolean r0 = r0.isAssignableFrom(r5)
                if (r0 != 0) goto L634
                retrofit2.Retrofit r0 = r9.retrofit
                java.lang.annotation.Annotation[] r1 = r9.methodAnnotations
                retrofit2.Converter r11 = r0.requestBodyConverter(r11, r12, r1)
                retrofit2.ParameterHandler$Part r12 = new retrofit2.ParameterHandler$Part
                java.lang.reflect.Method r0 = r9.method
                r12.<init>(r0, r10, r13, r11)
                return r12
            L634:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r2, r12)
                throw r10
            L63d:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "@Part parameters can only be used with multipart encoding."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L648:
                boolean r0 = r13 instanceof retrofit2.http.PartMap
                if (r0 == 0) goto L6dd
                r9.validateResolvableType(r10, r11)
                boolean r0 = r9.isMultipart
                if (r0 == 0) goto L6d2
                r9.gotPart = r2
                java.lang.Class r0 = retrofit2.Utils.getRawType(r11)
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                boolean r1 = r1.isAssignableFrom(r0)
                if (r1 == 0) goto L6c7
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                java.lang.reflect.Type r11 = retrofit2.Utils.getSupertype(r11, r0, r1)
                boolean r0 = r11 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L6be
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                java.lang.reflect.Type r0 = retrofit2.Utils.getParameterUpperBound(r3, r11)
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r1 != r0) goto L6a6
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r2, r11)
                java.lang.Class<okhttp3.MultipartBody$Part> r0 = okhttp3.MultipartBody.Part.class
                java.lang.Class r1 = retrofit2.Utils.getRawType(r11)
                boolean r0 = r0.isAssignableFrom(r1)
                if (r0 != 0) goto L69b
                retrofit2.Retrofit r0 = r9.retrofit
                java.lang.annotation.Annotation[] r1 = r9.methodAnnotations
                retrofit2.Converter r11 = r0.requestBodyConverter(r11, r12, r1)
                retrofit2.http.PartMap r13 = (retrofit2.http.PartMap) r13
                retrofit2.ParameterHandler$PartMap r12 = new retrofit2.ParameterHandler$PartMap
                java.lang.reflect.Method r0 = r9.method
                java.lang.String r13 = r13.encoding()
                r12.<init>(r0, r10, r11, r13)
                return r12
            L69b:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L6a6:
                java.lang.reflect.Method r11 = r9.method
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                java.lang.String r13 = "@PartMap keys must be of type String: "
                r12.<init>(r13)
                java.lang.StringBuilder r12 = r12.append(r0)
                java.lang.String r12 = r12.toString()
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L6be:
                java.lang.reflect.Method r11 = r9.method
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r5, r12)
                throw r10
            L6c7:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "@PartMap parameter type must be Map."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L6d2:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "@PartMap parameters can only be used with multipart encoding."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L6dd:
                boolean r0 = r13 instanceof retrofit2.http.Body
                if (r0 == 0) goto L726
                r9.validateResolvableType(r10, r11)
                boolean r13 = r9.isFormEncoded
                if (r13 != 0) goto L71b
                boolean r13 = r9.isMultipart
                if (r13 != 0) goto L71b
                boolean r13 = r9.gotBody
                if (r13 != 0) goto L710
                retrofit2.Retrofit r13 = r9.retrofit     // Catch: java.lang.RuntimeException -> L702
                java.lang.annotation.Annotation[] r0 = r9.methodAnnotations     // Catch: java.lang.RuntimeException -> L702
                retrofit2.Converter r11 = r13.requestBodyConverter(r11, r12, r0)     // Catch: java.lang.RuntimeException -> L702
                r9.gotBody = r2
                retrofit2.ParameterHandler$Body r12 = new retrofit2.ParameterHandler$Body
                java.lang.reflect.Method r13 = r9.method
                r12.<init>(r13, r10, r11)
                return r12
            L702:
                r12 = move-exception
                java.lang.reflect.Method r13 = r9.method
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r3] = r11
                java.lang.String r11 = "Unable to create @Body converter for %s"
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r13, r12, r10, r11, r0)
                throw r10
            L710:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "Multiple @Body method annotations found."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L71b:
                java.lang.reflect.Method r11 = r9.method
                java.lang.String r12 = "@Body parameters cannot be used with form or multi-part encoding."
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r11, r10, r12, r13)
                throw r10
            L726:
                boolean r12 = r13 instanceof retrofit2.http.Tag
                if (r12 == 0) goto L77e
                r9.validateResolvableType(r10, r11)
                java.lang.Class r11 = retrofit2.Utils.getRawType(r11)
                int r12 = r10 + (-1)
            L733:
                if (r12 < 0) goto L778
                retrofit2.ParameterHandler<?>[] r13 = r9.parameterHandlers
                r13 = r13[r12]
                boolean r0 = r13 instanceof retrofit2.ParameterHandler.Tag
                if (r0 == 0) goto L775
                retrofit2.ParameterHandler$Tag r13 = (retrofit2.ParameterHandler.Tag) r13
                java.lang.Class<T> r13 = r13.cls
                boolean r13 = r13.equals(r11)
                if (r13 != 0) goto L748
                goto L775
            L748:
                java.lang.reflect.Method r13 = r9.method
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "@Tag type "
                r0.<init>(r1)
                java.lang.String r11 = r11.getName()
                java.lang.StringBuilder r11 = r0.append(r11)
                java.lang.String r0 = " is duplicate of parameter #"
                java.lang.StringBuilder r11 = r11.append(r0)
                int r12 = r12 + r2
                java.lang.StringBuilder r11 = r11.append(r12)
                java.lang.String r12 = " and would always overwrite its value."
                java.lang.StringBuilder r11 = r11.append(r12)
                java.lang.String r11 = r11.toString()
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.RuntimeException r10 = retrofit2.Utils.parameterError(r13, r10, r11, r12)
                throw r10
            L775:
                int r12 = r12 + (-1)
                goto L733
            L778:
                retrofit2.ParameterHandler$Tag r10 = new retrofit2.ParameterHandler$Tag
                r10.<init>(r11)
                return r10
            L77e:
                r10 = 0
                return r10
        }

        static java.util.Set<java.lang.String> parsePathParameters(java.lang.String r2) {
                java.util.regex.Pattern r0 = retrofit2.RequestFactory.Builder.PARAM_URL_REGEX
                java.util.regex.Matcher r2 = r0.matcher(r2)
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
            Lb:
                boolean r1 = r2.find()
                if (r1 == 0) goto L1a
                r1 = 1
                java.lang.String r1 = r2.group(r1)
                r0.add(r1)
                goto Lb
            L1a:
                return r0
        }

        private void validatePathName(int r6, java.lang.String r7) {
                r5 = this;
                java.util.regex.Pattern r0 = retrofit2.RequestFactory.Builder.PARAM_NAME_REGEX
                java.util.regex.Matcher r0 = r0.matcher(r7)
                boolean r0 = r0.matches()
                r1 = 1
                r2 = 0
                r3 = 2
                if (r0 == 0) goto L29
                java.util.Set<java.lang.String> r0 = r5.relativeUrlParamNames
                boolean r0 = r0.contains(r7)
                if (r0 == 0) goto L18
                return
            L18:
                java.lang.reflect.Method r0 = r5.method
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = r5.relativeUrl
                r3[r2] = r4
                r3[r1] = r7
                java.lang.String r7 = "URL \"%s\" does not contain \"{%s}\"."
                java.lang.RuntimeException r6 = retrofit2.Utils.parameterError(r0, r6, r7, r3)
                throw r6
            L29:
                java.lang.reflect.Method r0 = r5.method
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.util.regex.Pattern r4 = retrofit2.RequestFactory.Builder.PARAM_URL_REGEX
                java.lang.String r4 = r4.pattern()
                r3[r2] = r4
                r3[r1] = r7
                java.lang.String r7 = "@Path parameter name must match %s. Found: %s"
                java.lang.RuntimeException r6 = retrofit2.Utils.parameterError(r0, r6, r7, r3)
                throw r6
        }

        private void validateResolvableType(int r4, java.lang.reflect.Type r5) {
                r3 = this;
                boolean r0 = retrofit2.Utils.hasUnresolvableType(r5)
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.reflect.Method r0 = r3.method
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r5
                java.lang.String r5 = "Parameter type must not include a type variable or wildcard: %s"
                java.lang.RuntimeException r4 = retrofit2.Utils.parameterError(r0, r4, r5, r1)
                throw r4
        }

        retrofit2.RequestFactory build() {
                r8 = this;
                java.lang.annotation.Annotation[] r0 = r8.methodAnnotations
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L5:
                if (r3 >= r1) goto Lf
                r4 = r0[r3]
                r8.parseMethodAnnotation(r4)
                int r3 = r3 + 1
                goto L5
            Lf:
                java.lang.String r0 = r8.httpMethod
                if (r0 == 0) goto Lba
                boolean r0 = r8.hasBody
                if (r0 != 0) goto L36
                boolean r0 = r8.isMultipart
                if (r0 != 0) goto L2b
                boolean r0 = r8.isFormEncoded
                if (r0 != 0) goto L20
                goto L36
            L20:
                java.lang.reflect.Method r0 = r8.method
                java.lang.String r1 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r2)
                throw r0
            L2b:
                java.lang.reflect.Method r0 = r8.method
                java.lang.String r1 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r2)
                throw r0
            L36:
                java.lang.annotation.Annotation[][] r0 = r8.parameterAnnotationsArray
                int r0 = r0.length
                retrofit2.ParameterHandler[] r1 = new retrofit2.ParameterHandler[r0]
                r8.parameterHandlers = r1
                int r1 = r0 + (-1)
                r3 = r2
            L40:
                r4 = 1
                if (r3 >= r0) goto L5a
                retrofit2.ParameterHandler<?>[] r5 = r8.parameterHandlers
                java.lang.reflect.Type[] r6 = r8.parameterTypes
                r6 = r6[r3]
                java.lang.annotation.Annotation[][] r7 = r8.parameterAnnotationsArray
                r7 = r7[r3]
                if (r3 != r1) goto L50
                goto L51
            L50:
                r4 = r2
            L51:
                retrofit2.ParameterHandler r4 = r8.parseParameter(r3, r6, r7, r4)
                r5[r3] = r4
                int r3 = r3 + 1
                goto L40
            L5a:
                java.lang.String r0 = r8.relativeUrl
                if (r0 != 0) goto L72
                boolean r0 = r8.gotUrl
                if (r0 == 0) goto L63
                goto L72
            L63:
                java.lang.reflect.Method r0 = r8.method
                java.lang.Object[] r1 = new java.lang.Object[r4]
                java.lang.String r3 = r8.httpMethod
                r1[r2] = r3
                java.lang.String r2 = "Missing either @%s URL or @Url parameter."
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r2, r1)
                throw r0
            L72:
                boolean r0 = r8.isFormEncoded
                if (r0 != 0) goto L8e
                boolean r1 = r8.isMultipart
                if (r1 != 0) goto L8e
                boolean r1 = r8.hasBody
                if (r1 != 0) goto L8e
                boolean r1 = r8.gotBody
                if (r1 != 0) goto L83
                goto L8e
            L83:
                java.lang.reflect.Method r0 = r8.method
                java.lang.String r1 = "Non-body HTTP method cannot contain @Body."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r2)
                throw r0
            L8e:
                if (r0 == 0) goto La0
                boolean r0 = r8.gotField
                if (r0 == 0) goto L95
                goto La0
            L95:
                java.lang.reflect.Method r0 = r8.method
                java.lang.String r1 = "Form-encoded method must contain at least one @Field."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r2)
                throw r0
            La0:
                boolean r0 = r8.isMultipart
                if (r0 == 0) goto Lb4
                boolean r0 = r8.gotPart
                if (r0 == 0) goto La9
                goto Lb4
            La9:
                java.lang.reflect.Method r0 = r8.method
                java.lang.String r1 = "Multipart method must contain at least one @Part."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r2)
                throw r0
            Lb4:
                retrofit2.RequestFactory r0 = new retrofit2.RequestFactory
                r0.<init>(r8)
                return r0
            Lba:
                java.lang.reflect.Method r0 = r8.method
                java.lang.String r1 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r2)
                throw r0
        }
    }

    RequestFactory(retrofit2.RequestFactory.Builder r2) {
            r1 = this;
            r1.<init>()
            java.lang.reflect.Method r0 = r2.method
            r1.method = r0
            retrofit2.Retrofit r0 = r2.retrofit
            okhttp3.HttpUrl r0 = r0.baseUrl
            r1.baseUrl = r0
            java.lang.String r0 = r2.httpMethod
            r1.httpMethod = r0
            java.lang.String r0 = r2.relativeUrl
            r1.relativeUrl = r0
            okhttp3.Headers r0 = r2.headers
            r1.headers = r0
            okhttp3.MediaType r0 = r2.contentType
            r1.contentType = r0
            boolean r0 = r2.hasBody
            r1.hasBody = r0
            boolean r0 = r2.isFormEncoded
            r1.isFormEncoded = r0
            boolean r0 = r2.isMultipart
            r1.isMultipart = r0
            retrofit2.ParameterHandler<?>[] r0 = r2.parameterHandlers
            r1.parameterHandlers = r0
            boolean r2 = r2.isKotlinSuspendFunction
            r1.isKotlinSuspendFunction = r2
            return
    }

    static retrofit2.RequestFactory parseAnnotations(retrofit2.Retrofit r1, java.lang.reflect.Method r2) {
            retrofit2.RequestFactory$Builder r0 = new retrofit2.RequestFactory$Builder
            r0.<init>(r1, r2)
            retrofit2.RequestFactory r1 = r0.build()
            return r1
    }

    okhttp3.Request create(java.lang.Object[] r13) throws java.io.IOException {
            r12 = this;
            retrofit2.ParameterHandler<?>[] r0 = r12.parameterHandlers
            int r1 = r13.length
            int r2 = r0.length
            if (r1 != r2) goto L4f
            retrofit2.RequestBuilder r2 = new retrofit2.RequestBuilder
            java.lang.String r4 = r12.httpMethod
            okhttp3.HttpUrl r5 = r12.baseUrl
            java.lang.String r6 = r12.relativeUrl
            okhttp3.Headers r7 = r12.headers
            okhttp3.MediaType r8 = r12.contentType
            boolean r9 = r12.hasBody
            boolean r10 = r12.isFormEncoded
            boolean r11 = r12.isMultipart
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r3 = r12.isKotlinSuspendFunction
            if (r3 == 0) goto L22
            int r1 = r1 + (-1)
        L22:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r4 = 0
        L28:
            if (r4 >= r1) goto L39
            r5 = r13[r4]
            r3.add(r5)
            r5 = r0[r4]
            r6 = r13[r4]
            r5.apply(r2, r6)
            int r4 = r4 + 1
            goto L28
        L39:
            okhttp3.Request$Builder r13 = r2.get()
            java.lang.Class<retrofit2.Invocation> r0 = retrofit2.Invocation.class
            retrofit2.Invocation r1 = new retrofit2.Invocation
            java.lang.reflect.Method r2 = r12.method
            r1.<init>(r2, r3)
            okhttp3.Request$Builder r13 = r13.tag(r0, r1)
            okhttp3.Request r13 = r13.build()
            return r13
        L4f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Argument count ("
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = ") doesn't match expected count ("
            java.lang.StringBuilder r1 = r1.append(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
    }
}
