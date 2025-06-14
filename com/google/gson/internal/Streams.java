package com.google.gson.internal;

/* loaded from: classes.dex */
public final class Streams {

    private static final class AppendableWriter extends java.io.Writer {
        private final java.lang.Appendable appendable;
        private final com.google.gson.internal.Streams.AppendableWriter.CurrentWrite currentWrite;

        static class CurrentWrite implements java.lang.CharSequence {
            char[] chars;

            CurrentWrite() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.lang.CharSequence
            public char charAt(int r2) {
                    r1 = this;
                    char[] r0 = r1.chars
                    char r2 = r0[r2]
                    return r2
            }

            @Override // java.lang.CharSequence
            public int length() {
                    r1 = this;
                    char[] r0 = r1.chars
                    int r0 = r0.length
                    return r0
            }

            @Override // java.lang.CharSequence
            public java.lang.CharSequence subSequence(int r3, int r4) {
                    r2 = this;
                    java.lang.String r0 = new java.lang.String
                    char[] r1 = r2.chars
                    int r4 = r4 - r3
                    r0.<init>(r1, r3, r4)
                    return r0
            }
        }

        AppendableWriter(java.lang.Appendable r2) {
                r1 = this;
                r1.<init>()
                com.google.gson.internal.Streams$AppendableWriter$CurrentWrite r0 = new com.google.gson.internal.Streams$AppendableWriter$CurrentWrite
                r0.<init>()
                r1.currentWrite = r0
                r1.appendable = r2
                return
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
                r0 = this;
                return
        }

        @Override // java.io.Writer
        public void write(int r2) throws java.io.IOException {
                r1 = this;
                java.lang.Appendable r0 = r1.appendable
                char r2 = (char) r2
                r0.append(r2)
                return
        }

        @Override // java.io.Writer
        public void write(char[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                com.google.gson.internal.Streams$AppendableWriter$CurrentWrite r0 = r1.currentWrite
                r0.chars = r2
                java.lang.Appendable r2 = r1.appendable
                com.google.gson.internal.Streams$AppendableWriter$CurrentWrite r0 = r1.currentWrite
                int r4 = r4 + r3
                r2.append(r0, r3, r4)
                return
        }
    }

    private Streams() {
            r1 = this;
            r1.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public static com.google.gson.JsonElement parse(com.google.gson.stream.JsonReader r2) throws com.google.gson.JsonParseException {
            r2.peek()     // Catch: java.lang.NumberFormatException -> Lf java.io.IOException -> L16 com.google.gson.stream.MalformedJsonException -> L1d java.io.EOFException -> L24
            r0 = 0
            com.google.gson.TypeAdapter<com.google.gson.JsonElement> r1 = com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT     // Catch: java.io.EOFException -> Ld java.lang.NumberFormatException -> Lf java.io.IOException -> L16 com.google.gson.stream.MalformedJsonException -> L1d
            java.lang.Object r2 = r1.read(r2)     // Catch: java.io.EOFException -> Ld java.lang.NumberFormatException -> Lf java.io.IOException -> L16 com.google.gson.stream.MalformedJsonException -> L1d
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2     // Catch: java.io.EOFException -> Ld java.lang.NumberFormatException -> Lf java.io.IOException -> L16 com.google.gson.stream.MalformedJsonException -> L1d
            return r2
        Ld:
            r2 = move-exception
            goto L26
        Lf:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        L16:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>(r2)
            throw r0
        L1d:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        L24:
            r2 = move-exception
            r0 = 1
        L26:
            if (r0 == 0) goto L2b
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
            return r2
        L2b:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
    }

    public static void write(com.google.gson.JsonElement r1, com.google.gson.stream.JsonWriter r2) throws java.io.IOException {
            com.google.gson.TypeAdapter<com.google.gson.JsonElement> r0 = com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT
            r0.write(r2, r1)
            return
    }

    public static java.io.Writer writerForAppendable(java.lang.Appendable r1) {
            boolean r0 = r1 instanceof java.io.Writer
            if (r0 == 0) goto L7
            java.io.Writer r1 = (java.io.Writer) r1
            goto Ld
        L7:
            com.google.gson.internal.Streams$AppendableWriter r0 = new com.google.gson.internal.Streams$AppendableWriter
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }
}
