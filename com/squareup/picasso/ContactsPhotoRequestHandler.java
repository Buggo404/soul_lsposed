package com.squareup.picasso;

/* loaded from: classes.dex */
class ContactsPhotoRequestHandler extends com.squareup.picasso.RequestHandler {
    private static final int ID_CONTACT = 3;
    private static final int ID_DISPLAY_PHOTO = 4;
    private static final int ID_LOOKUP = 1;
    private static final int ID_THUMBNAIL = 2;
    private static final android.content.UriMatcher matcher = null;
    private final android.content.Context context;

    private static class ContactPhotoStreamIcs {
        private ContactPhotoStreamIcs() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.io.InputStream get(android.content.ContentResolver r1, android.net.Uri r2) {
                r0 = 1
                java.io.InputStream r1 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r1, r2, r0)
                return r1
        }
    }

    static {
            android.content.UriMatcher r0 = new android.content.UriMatcher
            r1 = -1
            r0.<init>(r1)
            com.squareup.picasso.ContactsPhotoRequestHandler.matcher = r0
            java.lang.String r1 = "com.android.contacts"
            java.lang.String r2 = "contacts/lookup/*/#"
            r3 = 1
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/lookup/*"
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#/photo"
            r3 = 2
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#"
            r3 = 3
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "display_photo/#"
            r3 = 4
            r0.addURI(r1, r2, r3)
            return
    }

    ContactsPhotoRequestHandler(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    private java.io.InputStream getInputStream(com.squareup.picasso.Request r4) throws java.io.IOException {
            r3 = this;
            android.content.Context r0 = r3.context
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r4 = r4.uri
            android.content.UriMatcher r1 = com.squareup.picasso.ContactsPhotoRequestHandler.matcher
            int r1 = r1.match(r4)
            r2 = 1
            if (r1 == r2) goto L35
            r2 = 2
            if (r1 == r2) goto L30
            r2 = 3
            if (r1 == r2) goto L3d
            r2 = 4
            if (r1 != r2) goto L1b
            goto L30
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid uri: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L30:
            java.io.InputStream r4 = r0.openInputStream(r4)
            return r4
        L35:
            android.net.Uri r4 = android.provider.ContactsContract.Contacts.lookupContact(r0, r4)
            if (r4 != 0) goto L3d
            r4 = 0
            return r4
        L3d:
            java.io.InputStream r4 = com.squareup.picasso.ContactsPhotoRequestHandler.ContactPhotoStreamIcs.get(r0, r4)
            return r4
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request r4) {
            r3 = this;
            android.net.Uri r0 = r4.uri
            java.lang.String r1 = "content"
            java.lang.String r2 = r0.getScheme()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2b
            android.net.Uri r1 = android.provider.ContactsContract.Contacts.CONTENT_URI
            java.lang.String r1 = r1.getHost()
            java.lang.String r0 = r0.getHost()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2b
            android.content.UriMatcher r0 = com.squareup.picasso.ContactsPhotoRequestHandler.matcher
            android.net.Uri r4 = r4.uri
            int r4 = r0.match(r4)
            r0 = -1
            if (r4 == r0) goto L2b
            r4 = 1
            goto L2c
        L2b:
            r4 = 0
        L2c:
            return r4
    }

    @Override // com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request r2, int r3) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r2 = r1.getInputStream(r2)
            if (r2 == 0) goto Le
            com.squareup.picasso.RequestHandler$Result r3 = new com.squareup.picasso.RequestHandler$Result
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r3.<init>(r2, r0)
            goto Lf
        Le:
            r3 = 0
        Lf:
            return r3
    }
}
