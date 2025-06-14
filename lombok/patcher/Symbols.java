package lombok.patcher;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/Symbols.SCL.lombok */
public class Symbols {
    private static final java.lang.ThreadLocal<java.util.LinkedList<java.lang.String>> stack = null;


    static {
            lombok.patcher.Symbols$1 r0 = new lombok.patcher.Symbols$1
            r1 = r0
            r1.<init>()
            lombok.patcher.Symbols.stack = r0
            return
    }

    private Symbols() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void push(java.lang.String r3) {
            java.lang.ThreadLocal<java.util.LinkedList<java.lang.String>> r0 = lombok.patcher.Symbols.stack
            java.lang.Object r0 = r0.get()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r1 = r3
            r0.addFirst(r1)
            return
    }

    public static void pop() {
            java.lang.ThreadLocal<java.util.LinkedList<java.lang.String>> r0 = lombok.patcher.Symbols.stack
            java.lang.Object r0 = r0.get()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r0 = r0.poll()
            return
    }

    public static boolean isEmpty() {
            java.lang.ThreadLocal<java.util.LinkedList<java.lang.String>> r0 = lombok.patcher.Symbols.stack
            java.lang.Object r0 = r0.get()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            boolean r0 = r0.isEmpty()
            return r0
    }

    public static int size() {
            java.lang.ThreadLocal<java.util.LinkedList<java.lang.String>> r0 = lombok.patcher.Symbols.stack
            java.lang.Object r0 = r0.get()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
            return r0
    }

    public static boolean hasSymbol(java.lang.String r4) {
            r0 = r4
            if (r0 != 0) goto Le
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "symbol"
            r1.<init>(r2)
            throw r0
        Le:
            java.lang.ThreadLocal<java.util.LinkedList<java.lang.String>> r0 = lombok.patcher.Symbols.stack
            java.lang.Object r0 = r0.get()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r1 = r4
            boolean r0 = r0.contains(r1)
            return r0
    }

    public static boolean hasTail(java.lang.String r4) {
            r0 = r4
            if (r0 != 0) goto Le
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "symbol"
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r4
            java.lang.ThreadLocal<java.util.LinkedList<java.lang.String>> r1 = lombok.patcher.Symbols.stack
            java.lang.Object r1 = r1.get()
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            java.lang.Object r1 = r1.peek()
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static java.util.List<java.lang.String> getCopy() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            java.lang.ThreadLocal<java.util.LinkedList<java.lang.String>> r2 = lombok.patcher.Symbols.stack
            java.lang.Object r2 = r2.get()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.<init>(r2)
            return r0
    }
}
