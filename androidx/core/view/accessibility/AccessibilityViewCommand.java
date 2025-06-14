package androidx.core.view.accessibility;

/* loaded from: classes.dex */
public interface AccessibilityViewCommand {

    public static abstract class CommandArguments {
        android.os.Bundle mBundle;

        public CommandArguments() {
                r0 = this;
                r0.<init>()
                return
        }

        public void setBundle(android.os.Bundle r1) {
                r0 = this;
                r0.mBundle = r1
                return
        }
    }

    public static final class MoveAtGranularityArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public MoveAtGranularityArguments() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean getExtendSelection() {
                r2 = this;
                android.os.Bundle r0 = r2.mBundle
                java.lang.String r1 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
                boolean r0 = r0.getBoolean(r1)
                return r0
        }

        public int getGranularity() {
                r2 = this;
                android.os.Bundle r0 = r2.mBundle
                java.lang.String r1 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
                int r0 = r0.getInt(r1)
                return r0
        }
    }

    public static final class MoveHtmlArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public MoveHtmlArguments() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getHTMLElement() {
                r2 = this;
                android.os.Bundle r0 = r2.mBundle
                java.lang.String r1 = "ACTION_ARGUMENT_HTML_ELEMENT_STRING"
                java.lang.String r0 = r0.getString(r1)
                return r0
        }
    }

    public static final class MoveWindowArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public MoveWindowArguments() {
                r0 = this;
                r0.<init>()
                return
        }

        public int getX() {
                r2 = this;
                android.os.Bundle r0 = r2.mBundle
                java.lang.String r1 = "ACTION_ARGUMENT_MOVE_WINDOW_X"
                int r0 = r0.getInt(r1)
                return r0
        }

        public int getY() {
                r2 = this;
                android.os.Bundle r0 = r2.mBundle
                java.lang.String r1 = "ACTION_ARGUMENT_MOVE_WINDOW_Y"
                int r0 = r0.getInt(r1)
                return r0
        }
    }

    public static final class ScrollToPositionArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public ScrollToPositionArguments() {
                r0 = this;
                r0.<init>()
                return
        }

        public int getColumn() {
                r2 = this;
                android.os.Bundle r0 = r2.mBundle
                java.lang.String r1 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT"
                int r0 = r0.getInt(r1)
                return r0
        }

        public int getRow() {
                r2 = this;
                android.os.Bundle r0 = r2.mBundle
                java.lang.String r1 = "android.view.accessibility.action.ARGUMENT_ROW_INT"
                int r0 = r0.getInt(r1)
                return r0
        }
    }

    public static final class SetProgressArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public SetProgressArguments() {
                r0 = this;
                r0.<init>()
                return
        }

        public float getProgress() {
                r2 = this;
                android.os.Bundle r0 = r2.mBundle
                java.lang.String r1 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
                float r0 = r0.getFloat(r1)
                return r0
        }
    }

    public static final class SetSelectionArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public SetSelectionArguments() {
                r0 = this;
                r0.<init>()
                return
        }

        public int getEnd() {
                r2 = this;
                android.os.Bundle r0 = r2.mBundle
                java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_END_INT"
                int r0 = r0.getInt(r1)
                return r0
        }

        public int getStart() {
                r2 = this;
                android.os.Bundle r0 = r2.mBundle
                java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_START_INT"
                int r0 = r0.getInt(r1)
                return r0
        }
    }

    public static final class SetTextArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public SetTextArguments() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.CharSequence getText() {
                r2 = this;
                android.os.Bundle r0 = r2.mBundle
                java.lang.String r1 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
                java.lang.CharSequence r0 = r0.getCharSequence(r1)
                return r0
        }
    }

    boolean perform(android.view.View r1, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments r2);
}
