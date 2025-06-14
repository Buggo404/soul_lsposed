package lombok.installer;

/* loaded from: com.usidqw.qwerklj.apk:lombok/installer/InstallerGUI.SCL.lombok */
public class InstallerGUI {
    private static final int INSTALLER_WINDOW_WIDTH = 662;
    static final java.util.concurrent.atomic.AtomicReference<java.lang.Integer> exitMarker = null;
    private javax.swing.JFrame appWindow;
    private javax.swing.JComponent loadingExpl;
    private java.awt.Component javacArea;
    private java.awt.Component ideArea;
    private java.awt.Component uninstallArea;
    private java.awt.Component howIWorkArea;
    private java.awt.Component successArea;
    private javax.swing.Box uninstallBox;
    private lombok.installer.InstallerGUI.JHyperLink uninstallButton;
    private javax.swing.JLabel uninstallPlaceholder;
    private javax.swing.JButton installButton;
    private java.util.List<lombok.installer.IdeLocation> toUninstall;
    private final java.util.Set<java.lang.String> installSpecificMessages;
    private javax.swing.JLabel successExplanation;
    private lombok.installer.InstallerGUI.IdesList idesList;
    private static final java.lang.String IDE_TITLE = "<html><font size=\"+1\"><b><i>IDEs </i></b></font></html>";
    private static final java.lang.String IDE_EXPLANATION = "<html>Lombok can update your Eclipse or eclipse-based IDE to fully support all Lombok features.<br>Select IDE installations below and hit 'Install/Update'.</html>";
    private static final java.lang.String IDE_LOADING_EXPLANATION = "Scanning your drives for IDE installations...";
    private static final java.lang.String JAVAC_TITLE = "<html><font size=\"+1\"><b><i>Javac </i></b></font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (and tools that invoke javac such as <i>ant</i> and <i>maven</i>)</html>";
    private static final java.lang.String JAVAC_EXPLANATION = "<html>Lombok works 'out of the box' with javac.<br>Just make sure the lombok.jar is in your classpath when you compile.";
    private static final java.lang.String JAVAC_EXAMPLE = "<html>Example: <code>javac -cp lombok.jar MyCode.java</code></html>";
    private static final java.lang.String UNINSTALL_TITLE = "<html><font size=\"+1\"><b><i>Uninstall </i></b></font></html>";
    private static final java.lang.String UNINSTALL_EXPLANATION = "<html>Uninstall Lombok from the following IDE Installations?</html>";
    private static final java.lang.String HOW_I_WORK_TITLE = "<html><font size=\"+1\"><b><i>What this installer does </i></b></font></html>";
    private static final java.lang.String HOW_I_WORK_EXPLANATION = "<html><h2>Eclipse</h2><ol><li>First, I copy myself (lombok.jar) to your Eclipse install directory.</li><li>Then, I edit the <i>eclipse.ini</i> file to add the following entry:<br><pre>-javaagent:lombok.jar</pre></li></ol>On Mac OS X, eclipse.ini is hidden in<br><code>Eclipse.app/Contents/MacOS</code> so that's where I place the jar files.</html>";
    private static final java.lang.String SUCCESS_TITLE = "<html><font size=\"+1\"><b><i>Install successful </i></b></font></html>";
    private static final java.lang.String SUCCESS_EXPLANATION = "<html>Lombok has been installed on the selected IDE installations.<br>Don't forget to:<ul><li> add <code>lombok.jar</code> to your projects,<li><b>exit and start</b> your IDE,<li><b>rebuild</b> all projects!</ul>%%%</html>";














    /* loaded from: com.usidqw.qwerklj.apk:lombok/installer/InstallerGUI$IdesList.SCL.lombok */
    private class IdesList extends javax.swing.JPanel implements javax.swing.Scrollable {
        private static final long serialVersionUID = 1;
        java.util.List<lombok.installer.IdeLocation> locations;
        final /* synthetic */ lombok.installer.InstallerGUI this$0;


        IdesList(lombok.installer.InstallerGUI r7) {
                r6 = this;
                r0 = r6
                r1 = r7
                r0.this$0 = r1
                r0 = r6
                r0.<init>()
                r0 = r6
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.locations = r1
                r0 = r6
                javax.swing.BoxLayout r1 = new javax.swing.BoxLayout
                r2 = r1
                r3 = r6
                r4 = 1
                r2.<init>(r3, r4)
                r0.setLayout(r1)
                r0 = r6
                java.awt.Color r1 = java.awt.Color.WHITE
                r0.setBackground(r1)
                return
        }

        java.util.List<lombok.installer.IdeLocation> getSelectedIdes() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r3
                java.util.List<lombok.installer.IdeLocation> r0 = r0.locations
                java.util.Iterator r0 = r0.iterator()
                r6 = r0
                goto L2e
            L15:
                r0 = r6
                java.lang.Object r0 = r0.next()
                lombok.installer.IdeLocation r0 = (lombok.installer.IdeLocation) r0
                r5 = r0
                r0 = r5
                boolean r0 = r0.selected
                if (r0 == 0) goto L2e
                r0 = r4
                r1 = r5
                boolean r0 = r0.add(r1)
            L2e:
                r0 = r6
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L15
                r0 = r4
                return r0
        }

        void fireSelectionChange() {
                r3 = this;
                r0 = r3
                lombok.installer.InstallerGUI r0 = r0.this$0
                r1 = r3
                java.util.List r1 = r1.getSelectedIdes()
                r0.selectedLomboksChanged(r1)
                return
        }

        void addLocation(lombok.installer.IdeLocation r9) {
                r8 = this;
                r0 = r8
                java.util.List<lombok.installer.IdeLocation> r0 = r0.locations
                r1 = r9
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto Le
                return
            Le:
                javax.swing.Box r0 = javax.swing.Box.createHorizontalBox()
                r10 = r0
                r0 = r10
                java.awt.Color r1 = java.awt.Color.WHITE
                r0.setBackground(r1)
                javax.swing.JCheckBox r0 = new javax.swing.JCheckBox
                r1 = r0
                r2 = r9
                java.lang.String r2 = r2.getName()
                r1.<init>(r2)
                r11 = r0
                r0 = r11
                java.awt.Color r1 = java.awt.Color.WHITE
                r0.setBackground(r1)
                r0 = r10
                javax.swing.JLabel r1 = new javax.swing.JLabel
                r2 = r1
                javax.swing.ImageIcon r3 = new javax.swing.ImageIcon
                r4 = r3
                r5 = r9
                java.net.URL r5 = r5.getIdeIcon()
                r4.<init>(r5)
                r2.<init>(r3)
                java.awt.Component r0 = r0.add(r1)
                r0 = r10
                r1 = r11
                java.awt.Component r0 = r0.add(r1)
                r0 = r11
                r1 = 1
                r0.setSelected(r1)
                r0 = r11
                lombok.installer.InstallerGUI$IdesList$1 r1 = new lombok.installer.InstallerGUI$IdesList$1
                r2 = r1
                r3 = r8
                r4 = r9
                r5 = r11
                r2.<init>(r3, r4, r5)
                r0.addActionListener(r1)
                r0 = r9
                boolean r0 = r0.hasLombok()
                if (r0 == 0) goto L7d
                r0 = r10
                javax.swing.JLabel r1 = new javax.swing.JLabel
                r2 = r1
                javax.swing.ImageIcon r3 = new javax.swing.ImageIcon
                r4 = r3
                java.lang.Class<lombok.installer.Installer> r5 = lombok.installer.Installer.class
                java.lang.String r6 = "lombokIcon.png"
                java.net.URL r5 = r5.getResource(r6)
                r4.<init>(r5)
                r2.<init>(r3)
                java.awt.Component r0 = r0.add(r1)
            L7d:
                r0 = r10
                java.awt.Component r1 = javax.swing.Box.createHorizontalGlue()
                java.awt.Component r0 = r0.add(r1)
                r0 = r8
                java.util.List<lombok.installer.IdeLocation> r0 = r0.locations
                r1 = r9
                boolean r0 = r0.add(r1)
                r0 = r8
                r1 = r10
                java.awt.Component r0 = r0.add(r1)
                r0 = r8
                java.awt.Container r0 = r0.getParent()
                r0.doLayout()
                r0 = r8
                r0.fireSelectionChange()
                return
        }

        public java.awt.Dimension getPreferredScrollableViewportSize() {
                r5 = this;
                java.awt.Dimension r0 = new java.awt.Dimension
                r1 = r0
                r2 = 1
                r3 = 100
                r1.<init>(r2, r3)
                return r0
        }

        public int getScrollableBlockIncrement(java.awt.Rectangle r3, int r4, int r5) {
                r2 = this;
                r0 = 12
                return r0
        }

        public boolean getScrollableTracksViewportHeight() {
                r2 = this;
                r0 = 0
                return r0
        }

        public boolean getScrollableTracksViewportWidth() {
                r2 = this;
                r0 = 1
                return r0
        }

        public int getScrollableUnitIncrement(java.awt.Rectangle r3, int r4, int r5) {
                r2 = this;
                r0 = 1
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/installer/InstallerGUI$JHyperLink.SCL.lombok */
    private static class JHyperLink extends javax.swing.JButton {
        private static final long serialVersionUID = 1;

        public JHyperLink(java.lang.String r9) {
                r8 = this;
                r0 = r8
                r0.<init>()
                r0 = r8
                r1 = r8
                java.awt.Font r1 = r1.getFont()
                java.awt.font.TextAttribute r2 = java.awt.font.TextAttribute.UNDERLINE
                r3 = 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.util.Map r2 = java.util.Collections.singletonMap(r2, r3)
                java.awt.Font r1 = r1.deriveFont(r2)
                r0.setFont(r1)
                r0 = r8
                r1 = r9
                r0.setText(r1)
                r0 = r8
                r1 = 0
                r0.setBorder(r1)
                r0 = r8
                r1 = 0
                r0.setContentAreaFilled(r1)
                r0 = r8
                java.awt.Color r1 = java.awt.Color.BLUE
                r0.setForeground(r1)
                r0 = r8
                r1 = 12
                java.awt.Cursor r1 = java.awt.Cursor.getPredefinedCursor(r1)
                r0.setCursor(r1)
                r0 = r8
                java.awt.Insets r1 = new java.awt.Insets
                r2 = r1
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r2.<init>(r3, r4, r5, r6)
                r0.setMargin(r1)
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = r0
            r1.<init>()
            lombok.installer.InstallerGUI.exitMarker = r0
            return
    }

    public InstallerGUI() {
            r9 = this;
            r0 = r9
            r0.<init>()
            r0 = r9
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r2 = r1
            r2.<init>()
            r0.installSpecificMessages = r1
            r0 = r9
            lombok.installer.InstallerGUI$IdesList r1 = new lombok.installer.InstallerGUI$IdesList
            r2 = r1
            r3 = r9
            r2.<init>(r3)
            r0.idesList = r1
            r0 = r9
            javax.swing.JFrame r1 = new javax.swing.JFrame
            r2 = r1
            java.lang.String r3 = "Project Lombok v%s - Installer"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = lombok.core.Version.getVersion()
            r5[r6] = r7
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r2.<init>(r3)
            r0.appWindow = r1
            r0 = r9
            javax.swing.JFrame r0 = r0.appWindow
            r1 = 1
            r0.setLocationByPlatform(r1)
            r0 = r9
            javax.swing.JFrame r0 = r0.appWindow
            r1 = 3
            r0.setDefaultCloseOperation(r1)
            r0 = r9
            javax.swing.JFrame r0 = r0.appWindow
            r1 = 0
            r0.setResizable(r1)
            r0 = r9
            javax.swing.JFrame r0 = r0.appWindow
            java.awt.Toolkit r1 = java.awt.Toolkit.getDefaultToolkit()
            java.lang.Class<lombok.installer.Installer> r2 = lombok.installer.Installer.class
            java.lang.String r3 = "lombokIcon.png"
            java.net.URL r2 = r2.getResource(r3)
            java.awt.Image r1 = r1.getImage(r2)
            r0.setIconImage(r1)
            r0 = r9
            r1 = r9
            java.awt.Component r1 = r1.buildJavacArea()     // Catch: java.lang.Throwable -> Lb6
            r0.javacArea = r1     // Catch: java.lang.Throwable -> Lb6
            r0 = r9
            r1 = r9
            java.awt.Component r1 = r1.buildIdeArea()     // Catch: java.lang.Throwable -> Lb6
            r0.ideArea = r1     // Catch: java.lang.Throwable -> Lb6
            r0 = r9
            r1 = r9
            java.awt.Component r1 = r1.buildUninstallArea()     // Catch: java.lang.Throwable -> Lb6
            r0.uninstallArea = r1     // Catch: java.lang.Throwable -> Lb6
            r0 = r9
            java.awt.Component r0 = r0.uninstallArea     // Catch: java.lang.Throwable -> Lb6
            r1 = 0
            r0.setVisible(r1)     // Catch: java.lang.Throwable -> Lb6
            r0 = r9
            r1 = r9
            java.awt.Component r1 = r1.buildHowIWorkArea()     // Catch: java.lang.Throwable -> Lb6
            r0.howIWorkArea = r1     // Catch: java.lang.Throwable -> Lb6
            r0 = r9
            java.awt.Component r0 = r0.howIWorkArea     // Catch: java.lang.Throwable -> Lb6
            r1 = 0
            r0.setVisible(r1)     // Catch: java.lang.Throwable -> Lb6
            r0 = r9
            r1 = r9
            java.awt.Component r1 = r1.buildSuccessArea()     // Catch: java.lang.Throwable -> Lb6
            r0.successArea = r1     // Catch: java.lang.Throwable -> Lb6
            r0 = r9
            java.awt.Component r0 = r0.successArea     // Catch: java.lang.Throwable -> Lb6
            r1 = 0
            r0.setVisible(r1)     // Catch: java.lang.Throwable -> Lb6
            r0 = r9
            r1 = r9
            javax.swing.JFrame r1 = r1.appWindow     // Catch: java.lang.Throwable -> Lb6
            java.awt.Container r1 = r1.getContentPane()     // Catch: java.lang.Throwable -> Lb6
            r0.buildChrome(r1)     // Catch: java.lang.Throwable -> Lb6
            r0 = r9
            javax.swing.JFrame r0 = r0.appWindow     // Catch: java.lang.Throwable -> Lb6
            r0.pack()     // Catch: java.lang.Throwable -> Lb6
            goto Lbc
        Lb6:
            r10 = move-exception
            r0 = r9
            r1 = r10
            r0.handleException(r1)
        Lbc:
            return
    }

    private void handleException(java.lang.Throwable r6) {
            r5 = this;
            lombok.installer.InstallerGUI$1 r0 = new lombok.installer.InstallerGUI$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            javax.swing.SwingUtilities.invokeLater(r0)
            return
    }

    private java.awt.Component buildHowIWorkArea() {
            r9 = this;
            javax.swing.JPanel r0 = new javax.swing.JPanel
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            java.awt.GridBagLayout r1 = new java.awt.GridBagLayout
            r2 = r1
            r2.<init>()
            r0.setLayout(r1)
            java.awt.GridBagConstraints r0 = new java.awt.GridBagConstraints
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            r1 = 17
            r0.anchor = r1
            r0 = r10
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            java.lang.String r3 = "<html><font size=\"+1\"><b><i>What this installer does </i></b></font></html>"
            r2.<init>(r3)
            r2 = r11
            r0.add(r1, r2)
            r0 = r11
            r1 = 1
            r0.gridy = r1
            r0 = r11
            java.awt.Insets r1 = new java.awt.Insets
            r2 = r1
            r3 = 8
            r4 = 0
            r5 = 0
            r6 = 16
            r2.<init>(r3, r4, r5, r6)
            r0.insets = r1
            r0 = r10
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            java.lang.String r3 = "<html><h2>Eclipse</h2><ol><li>First, I copy myself (lombok.jar) to your Eclipse install directory.</li><li>Then, I edit the <i>eclipse.ini</i> file to add the following entry:<br><pre>-javaagent:lombok.jar</pre></li></ol>On Mac OS X, eclipse.ini is hidden in<br><code>Eclipse.app/Contents/MacOS</code> so that's where I place the jar files.</html>"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = java.io.File.separator
            r5[r6] = r7
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r2.<init>(r3)
            r2 = r11
            r0.add(r1, r2)
            javax.swing.Box r0 = javax.swing.Box.createHorizontalBox()
            r12 = r0
            javax.swing.JButton r0 = new javax.swing.JButton
            r1 = r0
            java.lang.String r2 = "Okay - Good to know!"
            r1.<init>(r2)
            r13 = r0
            r0 = r12
            java.awt.Component r1 = javax.swing.Box.createHorizontalGlue()
            java.awt.Component r0 = r0.add(r1)
            r0 = r12
            r1 = r13
            java.awt.Component r0 = r0.add(r1)
            r0 = r13
            lombok.installer.InstallerGUI$2 r1 = new lombok.installer.InstallerGUI$2
            r2 = r1
            r3 = r9
            r2.<init>(r3)
            r0.addActionListener(r1)
            r0 = r11
            r1 = 2
            r0.gridy = r1
            r0 = r10
            r1 = r12
            r2 = r11
            r0.add(r1, r2)
            r0 = r10
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 662(0x296, float:9.28E-43)
            r4 = 415(0x19f, float:5.82E-43)
            r2.<init>(r3, r4)
            r0.setPreferredSize(r1)
            r0 = r10
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 662(0x296, float:9.28E-43)
            r4 = 415(0x19f, float:5.82E-43)
            r2.<init>(r3, r4)
            r0.setMinimumSize(r1)
            r0 = r10
            return r0
    }

    private void showSuccess(java.lang.String r6) {
            r5 = this;
            r0 = r5
            javax.swing.JLabel r0 = r0.successExplanation
            java.lang.String r1 = "<html>Lombok has been installed on the selected IDE installations.<br>Don't forget to:<ul><li> add <code>lombok.jar</code> to your projects,<li><b>exit and start</b> your IDE,<li><b>rebuild</b> all projects!</ul>%%%</html>"
            java.lang.String r2 = "%%%"
            r3 = r6
            java.lang.String r1 = r1.replace(r2, r3)
            r0.setText(r1)
            r0 = r5
            java.awt.Component r0 = r0.howIWorkArea
            r1 = 0
            r0.setVisible(r1)
            r0 = r5
            java.awt.Component r0 = r0.javacArea
            r1 = 0
            r0.setVisible(r1)
            r0 = r5
            java.awt.Component r0 = r0.ideArea
            r1 = 0
            r0.setVisible(r1)
            r0 = r5
            java.awt.Component r0 = r0.successArea
            r1 = 1
            r0.setVisible(r1)
            r0 = r5
            javax.swing.JFrame r0 = r0.appWindow
            r0.pack()
            return
    }

    private java.awt.Component buildSuccessArea() {
            r8 = this;
            javax.swing.JPanel r0 = new javax.swing.JPanel
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            java.awt.GridBagLayout r1 = new java.awt.GridBagLayout
            r2 = r1
            r2.<init>()
            r0.setLayout(r1)
            java.awt.GridBagConstraints r0 = new java.awt.GridBagConstraints
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = 17
            r0.anchor = r1
            r0 = r9
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            java.lang.String r3 = "<html><font size=\"+1\"><b><i>Install successful </i></b></font></html>"
            r2.<init>(r3)
            r2 = r1
            r11 = r2
            r2 = r10
            r0.add(r1, r2)
            r0 = r11
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 580(0x244, float:8.13E-43)
            r4 = 20
            r2.<init>(r3, r4)
            r0.setPreferredSize(r1)
            r0 = r11
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 580(0x244, float:8.13E-43)
            r4 = 20
            r2.<init>(r3, r4)
            r0.setMinimumSize(r1)
            r0 = r10
            r1 = 1
            r0.gridy = r1
            r0 = r10
            java.awt.Insets r1 = new java.awt.Insets
            r2 = r1
            r3 = 8
            r4 = 0
            r5 = 0
            r6 = 16
            r2.<init>(r3, r4, r5, r6)
            r0.insets = r1
            r0 = r9
            r1 = r8
            javax.swing.JLabel r2 = new javax.swing.JLabel
            r3 = r2
            java.lang.String r4 = "<html>Lombok has been installed on the selected IDE installations.<br>Don't forget to:<ul><li> add <code>lombok.jar</code> to your projects,<li><b>exit and start</b> your IDE,<li><b>rebuild</b> all projects!</ul>%%%</html>"
            r3.<init>(r4)
            r3 = r2; r2 = r1; r1 = r3; 
            r2.successExplanation = r3
            r2 = r10
            r0.add(r1, r2)
            r0 = r8
            javax.swing.JLabel r0 = r0.successExplanation
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 580(0x244, float:8.13E-43)
            r4 = 175(0xaf, float:2.45E-43)
            r2.<init>(r3, r4)
            r0.setPreferredSize(r1)
            r0 = r8
            javax.swing.JLabel r0 = r0.successExplanation
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 580(0x244, float:8.13E-43)
            r4 = 175(0xaf, float:2.45E-43)
            r2.<init>(r3, r4)
            r0.setMinimumSize(r1)
            r0 = r10
            r1 = r0
            int r1 = r1.gridy
            r2 = 1
            int r1 = r1 + r2
            r0.gridy = r1
            r0 = r10
            r1 = 1
            r0.fill = r1
            javax.swing.JTextPane r0 = new javax.swing.JTextPane
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r12
            java.lang.String r1 = "text/html"
            r0.setContentType(r1)
            r0 = r12
            r1 = r8
            java.lang.String r1 = r1.readChangeLog()
            r0.setText(r1)
            r0 = r12
            r1 = 0
            r0.setEditable(r1)
            r0 = r12
            r1 = 0
            r0.setOpaque(r1)
            r0 = r12
            r1 = 0
            r0.setBorder(r1)
            r0 = r12
            r1 = 0
            r0.setSelectionStart(r1)
            r0 = r12
            r1 = 0
            r0.setSelectionEnd(r1)
            java.lang.String r0 = "Label.font"
            java.awt.Font r0 = javax.swing.UIManager.getFont(r0)
            r13 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "body { font-family: "
            r1.<init>(r2)
            r1 = r13
            java.lang.String r1 = r1.getFamily()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "; font-size: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r13
            int r1 = r1.getSize()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "pt; }"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14 = r0
            r0 = r12
            javax.swing.text.Document r0 = r0.getDocument()
            javax.swing.text.html.HTMLDocument r0 = (javax.swing.text.html.HTMLDocument) r0
            javax.swing.text.html.StyleSheet r0 = r0.getStyleSheet()
            r1 = r14
            r0.addRule(r1)
            javax.swing.JScrollPane r0 = new javax.swing.JScrollPane
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            r15 = r0
            r0 = r9
            r1 = r15
            r2 = r10
            r0.add(r1, r2)
            r0 = r15
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 580(0x244, float:8.13E-43)
            r4 = 200(0xc8, float:2.8E-43)
            r2.<init>(r3, r4)
            r0.setPreferredSize(r1)
            r0 = r15
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 580(0x244, float:8.13E-43)
            r4 = 200(0xc8, float:2.8E-43)
            r2.<init>(r3, r4)
            r0.setMinimumSize(r1)
            r0 = r9
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 662(0x296, float:9.28E-43)
            r4 = 415(0x19f, float:5.82E-43)
            r2.<init>(r3, r4)
            r0.setPreferredSize(r1)
            r0 = r9
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 662(0x296, float:9.28E-43)
            r4 = 415(0x19f, float:5.82E-43)
            r2.<init>(r3, r4)
            r0.setMinimumSize(r1)
            r0 = r9
            return r0
    }

    private java.lang.String readChangeLog() {
            r5 = this;
            java.lang.Class<lombok.installer.Installer> r0 = lombok.installer.Installer.class
            java.lang.String r1 = "/latestchanges.html"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            r6 = r0
            r0 = 8192(0x2000, float:1.14794E-41)
            char[] r0 = new char[r0]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L72
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L72
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L72
            r8 = r0
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L72
            r1 = r0
            r2 = r6
            java.lang.String r3 = "UTF-8"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L72
            r9 = r0
        L24:
            r0 = r9
            r1 = r7
            int r0 = r0.read(r1)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L72
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 != r1) goto L35
            goto L41
        L35:
            r0 = r8
            r1 = r7
            r2 = 0
            r3 = r10
            java.lang.StringBuilder r0 = r0.append(r1, r2, r3)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L72
            goto L24
        L41:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L72
            r1 = r0
            java.lang.String r2 = "<html>"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L72
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L72
            java.lang.String r1 = "</html>"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L72
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L72
            r12 = r0
            r0 = r6
            r0.close()     // Catch: java.lang.Exception -> L61
            goto L62
        L61:
        L62:
            r0 = r12
            return r0
        L65:
            r0 = r6
            r0.close()     // Catch: java.lang.Exception -> L6d
            goto L6e
        L6d:
        L6e:
            java.lang.String r0 = "No Changelog available"
            return r0
        L72:
            r11 = move-exception
            r0 = r6
            r0.close()     // Catch: java.lang.Exception -> L7b
            goto L7c
        L7b:
        L7c:
            r0 = r11
            throw r0
    }

    private java.awt.Component buildUninstallArea() {
            r8 = this;
            javax.swing.JPanel r0 = new javax.swing.JPanel
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            java.awt.GridBagLayout r1 = new java.awt.GridBagLayout
            r2 = r1
            r2.<init>()
            r0.setLayout(r1)
            java.awt.GridBagConstraints r0 = new java.awt.GridBagConstraints
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = 17
            r0.anchor = r1
            r0 = r9
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            java.lang.String r3 = "<html><font size=\"+1\"><b><i>Uninstall </i></b></font></html>"
            r2.<init>(r3)
            r2 = r10
            r0.add(r1, r2)
            r0 = r10
            r1 = 1
            r0.gridy = r1
            r0 = r10
            java.awt.Insets r1 = new java.awt.Insets
            r2 = r1
            r3 = 8
            r4 = 0
            r5 = 0
            r6 = 16
            r2.<init>(r3, r4, r5, r6)
            r0.insets = r1
            r0 = r9
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            java.lang.String r3 = "<html>Uninstall Lombok from the following IDE Installations?</html>"
            r2.<init>(r3)
            r2 = r10
            r0.add(r1, r2)
            r0 = r8
            javax.swing.Box r1 = javax.swing.Box.createVerticalBox()
            r0.uninstallBox = r1
            r0 = r10
            r1 = 2
            r0.gridy = r1
            r0 = r10
            r1 = 2
            r0.fill = r1
            r0 = r9
            r1 = r8
            javax.swing.Box r1 = r1.uninstallBox
            r2 = r10
            r0.add(r1, r2)
            r0 = r10
            r1 = 2
            r0.fill = r1
            r0 = r10
            r1 = 3
            r0.gridy = r1
            r0 = r9
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            java.lang.String r3 = "Are you sure?"
            r2.<init>(r3)
            r2 = r10
            r0.add(r1, r2)
            javax.swing.Box r0 = javax.swing.Box.createHorizontalBox()
            r11 = r0
            javax.swing.JButton r0 = new javax.swing.JButton
            r1 = r0
            java.lang.String r2 = "No - Don't uninstall"
            r1.<init>(r2)
            r12 = r0
            r0 = r11
            r1 = r12
            java.awt.Component r0 = r0.add(r1)
            r0 = r11
            java.awt.Component r1 = javax.swing.Box.createHorizontalGlue()
            java.awt.Component r0 = r0.add(r1)
            javax.swing.JButton r0 = new javax.swing.JButton
            r1 = r0
            java.lang.String r2 = "Yes - uninstall Lombok"
            r1.<init>(r2)
            r13 = r0
            r0 = r11
            r1 = r13
            java.awt.Component r0 = r0.add(r1)
            r0 = r12
            lombok.installer.InstallerGUI$3 r1 = new lombok.installer.InstallerGUI$3
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.addActionListener(r1)
            r0 = r13
            lombok.installer.InstallerGUI$4 r1 = new lombok.installer.InstallerGUI$4
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.addActionListener(r1)
            r0 = r10
            r1 = 4
            r0.gridy = r1
            r0 = r9
            r1 = r11
            r2 = r10
            r0.add(r1, r2)
            r0 = r9
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 662(0x296, float:9.28E-43)
            r4 = 415(0x19f, float:5.82E-43)
            r2.<init>(r3, r4)
            r0.setPreferredSize(r1)
            r0 = r9
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 662(0x296, float:9.28E-43)
            r4 = 415(0x19f, float:5.82E-43)
            r2.<init>(r3, r4)
            r0.setMinimumSize(r1)
            r0 = r9
            return r0
    }

    private java.awt.Component buildJavacArea() {
            r8 = this;
            javax.swing.JPanel r0 = new javax.swing.JPanel
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            java.awt.GridBagLayout r1 = new java.awt.GridBagLayout
            r2 = r1
            r2.<init>()
            r0.setLayout(r1)
            java.awt.GridBagConstraints r0 = new java.awt.GridBagConstraints
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = 17
            r0.anchor = r1
            r0 = r10
            java.awt.Insets r1 = new java.awt.Insets
            r2 = r1
            r3 = 8
            r4 = 0
            r5 = 0
            r6 = 16
            r2.<init>(r3, r4, r5, r6)
            r0.insets = r1
            r0 = r9
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            java.lang.String r3 = "<html><font size=\"+1\"><b><i>Javac </i></b></font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (and tools that invoke javac such as <i>ant</i> and <i>maven</i>)</html>"
            r2.<init>(r3)
            r2 = r10
            r0.add(r1, r2)
            r0 = r10
            r1 = 1
            r0.gridy = r1
            r0 = r10
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.weightx = r1
            r0 = r10
            r1 = 2
            r0.fill = r1
            r0 = r9
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            java.lang.String r3 = "<html>Lombok works 'out of the box' with javac.<br>Just make sure the lombok.jar is in your classpath when you compile."
            r2.<init>(r3)
            r2 = r10
            r0.add(r1, r2)
            javax.swing.JLabel r0 = new javax.swing.JLabel
            r1 = r0
            java.lang.String r2 = "<html>Example: <code>javac -cp lombok.jar MyCode.java</code></html>"
            r1.<init>(r2)
            r11 = r0
            r0 = r10
            r1 = 2
            r0.gridy = r1
            r0 = r9
            r1 = r11
            r2 = r10
            r0.add(r1, r2)
            r0 = r9
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 662(0x296, float:9.28E-43)
            r4 = 105(0x69, float:1.47E-43)
            r2.<init>(r3, r4)
            r0.setPreferredSize(r1)
            r0 = r9
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 662(0x296, float:9.28E-43)
            r4 = 105(0x69, float:1.47E-43)
            r2.<init>(r3, r4)
            r0.setMinimumSize(r1)
            r0 = r9
            return r0
    }

    private java.awt.Component buildIdeArea() {
            r8 = this;
            javax.swing.JPanel r0 = new javax.swing.JPanel
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            java.awt.GridBagLayout r1 = new java.awt.GridBagLayout
            r2 = r1
            r2.<init>()
            r0.setLayout(r1)
            java.awt.GridBagConstraints r0 = new java.awt.GridBagConstraints
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = 17
            r0.anchor = r1
            r0 = r10
            java.awt.Insets r1 = new java.awt.Insets
            r2 = r1
            r3 = 8
            r4 = 0
            r5 = 0
            r6 = 16
            r2.<init>(r3, r4, r5, r6)
            r0.insets = r1
            r0 = r9
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            java.lang.String r3 = "<html><font size=\"+1\"><b><i>IDEs </i></b></font></html>"
            r2.<init>(r3)
            r2 = r10
            r0.add(r1, r2)
            r0 = r10
            r1 = 1
            r0.gridy = r1
            r0 = r9
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            java.lang.String r3 = "<html>Lombok can update your Eclipse or eclipse-based IDE to fully support all Lombok features.<br>Select IDE installations below and hit 'Install/Update'.</html>"
            r2.<init>(r3)
            r2 = r10
            r0.add(r1, r2)
            r0 = r10
            r1 = 2
            r0.gridy = r1
            r0 = r8
            javax.swing.Box r1 = javax.swing.Box.createHorizontalBox()
            r0.loadingExpl = r1
            r0 = r8
            javax.swing.JComponent r0 = r0.loadingExpl
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            javax.swing.ImageIcon r3 = new javax.swing.ImageIcon
            r4 = r3
            java.lang.Class<lombok.installer.Installer> r5 = lombok.installer.Installer.class
            java.lang.String r6 = "loading.gif"
            java.net.URL r5 = r5.getResource(r6)
            r4.<init>(r5)
            r2.<init>(r3)
            java.awt.Component r0 = r0.add(r1)
            r0 = r8
            javax.swing.JComponent r0 = r0.loadingExpl
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            java.lang.String r3 = "Scanning your drives for IDE installations..."
            r2.<init>(r3)
            java.awt.Component r0 = r0.add(r1)
            r0 = r9
            r1 = r8
            javax.swing.JComponent r1 = r1.loadingExpl
            r2 = r10
            r0.add(r1, r2)
            r0 = r10
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.weightx = r1
            r0 = r10
            r1 = 3
            r0.gridy = r1
            r0 = r10
            r1 = 2
            r0.fill = r1
            r0 = r8
            lombok.installer.InstallerGUI$IdesList r1 = new lombok.installer.InstallerGUI$IdesList
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.idesList = r1
            javax.swing.JScrollPane r0 = new javax.swing.JScrollPane
            r1 = r0
            r2 = r8
            lombok.installer.InstallerGUI$IdesList r2 = r2.idesList
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            java.awt.Color r1 = java.awt.Color.WHITE
            r0.setBackground(r1)
            r0 = r11
            javax.swing.JViewport r0 = r0.getViewport()
            java.awt.Color r1 = java.awt.Color.WHITE
            r0.setBackground(r1)
            r0 = r9
            r1 = r11
            r2 = r10
            r0.add(r1, r2)
            lombok.installer.InstallerGUI$5 r0 = new lombok.installer.InstallerGUI$5
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            r0.start()
            javax.swing.Box r0 = javax.swing.Box.createHorizontalBox()
            r13 = r0
            javax.swing.JButton r0 = new javax.swing.JButton
            r1 = r0
            java.lang.String r2 = "Specify location..."
            r1.<init>(r2)
            r14 = r0
            r0 = r13
            r1 = r14
            java.awt.Component r0 = r0.add(r1)
            r0 = r14
            lombok.installer.InstallerGUI$6 r1 = new lombok.installer.InstallerGUI$6
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.addActionListener(r1)
            r0 = r13
            java.awt.Component r1 = javax.swing.Box.createHorizontalGlue()
            java.awt.Component r0 = r0.add(r1)
            r0 = r8
            javax.swing.JButton r1 = new javax.swing.JButton
            r2 = r1
            java.lang.String r3 = "Install / Update"
            r2.<init>(r3)
            r0.installButton = r1
            r0 = r13
            r1 = r8
            javax.swing.JButton r1 = r1.installButton
            java.awt.Component r0 = r0.add(r1)
            r0 = r8
            javax.swing.JButton r0 = r0.installButton
            lombok.installer.InstallerGUI$7 r1 = new lombok.installer.InstallerGUI$7
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.addActionListener(r1)
            r0 = r10
            r1 = 4
            r0.gridy = r1
            r0 = r10
            r1 = 0
            r0.weightx = r1
            r0 = r9
            r1 = r13
            r2 = r10
            r0.add(r1, r2)
            r0 = r10
            r1 = 5
            r0.gridy = r1
            r0 = r10
            r1 = 0
            r0.fill = r1
            lombok.installer.InstallerGUI$JHyperLink r0 = new lombok.installer.InstallerGUI$JHyperLink
            r1 = r0
            java.lang.String r2 = "Show me what this installer will do to my IDE installation."
            r1.<init>(r2)
            r15 = r0
            r0 = r9
            r1 = r15
            r2 = r10
            r0.add(r1, r2)
            r0 = r15
            lombok.installer.InstallerGUI$8 r1 = new lombok.installer.InstallerGUI$8
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.addActionListener(r1)
            r0 = r10
            r1 = 6
            r0.gridy = r1
            r0 = r8
            lombok.installer.InstallerGUI$JHyperLink r1 = new lombok.installer.InstallerGUI$JHyperLink
            r2 = r1
            java.lang.String r3 = "Uninstall lombok from selected IDE installations."
            r2.<init>(r3)
            r0.uninstallButton = r1
            r0 = r8
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            java.lang.String r3 = "<html>&nbsp;</html>"
            r2.<init>(r3)
            r0.uninstallPlaceholder = r1
            r0 = r8
            lombok.installer.InstallerGUI$JHyperLink r0 = r0.uninstallButton
            lombok.installer.InstallerGUI$9 r1 = new lombok.installer.InstallerGUI$9
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.addActionListener(r1)
            r0 = r9
            r1 = r8
            lombok.installer.InstallerGUI$JHyperLink r1 = r1.uninstallButton
            r2 = r10
            r0.add(r1, r2)
            r0 = r8
            javax.swing.JLabel r0 = r0.uninstallPlaceholder
            r1 = 0
            r0.setVisible(r1)
            r0 = r9
            r1 = r8
            javax.swing.JLabel r1 = r1.uninstallPlaceholder
            r2 = r10
            r0.add(r1, r2)
            r0 = r9
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 662(0x296, float:9.28E-43)
            r4 = 296(0x128, float:4.15E-43)
            r2.<init>(r3, r4)
            r0.setPreferredSize(r1)
            r0 = r9
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 662(0x296, float:9.28E-43)
            r4 = 296(0x128, float:4.15E-43)
            r2.<init>(r3, r4)
            r0.setMinimumSize(r1)
            r0 = r9
            return r0
    }

    private void showWhatIDo() {
            r3 = this;
            r0 = r3
            java.awt.Component r0 = r0.javacArea
            r1 = 0
            r0.setVisible(r1)
            r0 = r3
            java.awt.Component r0 = r0.ideArea
            r1 = 0
            r0.setVisible(r1)
            r0 = r3
            java.awt.Component r0 = r0.howIWorkArea
            r1 = 1
            r0.setVisible(r1)
            r0 = r3
            java.awt.Component r0 = r0.successArea
            r1 = 0
            r0.setVisible(r1)
            r0 = r3
            javax.swing.JFrame r0 = r0.appWindow
            r0.pack()
            return
    }

    private void uninstall(java.util.List<lombok.installer.IdeLocation> r7) {
            r6 = this;
            r0 = r6
            java.awt.Component r0 = r0.javacArea
            r1 = 0
            r0.setVisible(r1)
            r0 = r6
            java.awt.Component r0 = r0.ideArea
            r1 = 0
            r0.setVisible(r1)
            r0 = r6
            javax.swing.Box r0 = r0.uninstallBox
            r0.removeAll()
            r0 = r6
            javax.swing.Box r0 = r0.uninstallBox
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 1
            r4 = 16
            r2.<init>(r3, r4)
            java.awt.Component r1 = javax.swing.Box.createRigidArea(r1)
            java.awt.Component r0 = r0.add(r1)
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L65
        L36:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.installer.IdeLocation r0 = (lombok.installer.IdeLocation) r0
            r8 = r0
            javax.swing.JLabel r0 = new javax.swing.JLabel
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.getName()
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r10
            java.awt.Font r1 = r1.getFont()
            r2 = 1
            java.awt.Font r1 = r1.deriveFont(r2)
            r0.setFont(r1)
            r0 = r6
            javax.swing.Box r0 = r0.uninstallBox
            r1 = r10
            java.awt.Component r0 = r0.add(r1)
        L65:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L36
            r0 = r6
            javax.swing.Box r0 = r0.uninstallBox
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 1
            r4 = 16
            r2.<init>(r3, r4)
            java.awt.Component r1 = javax.swing.Box.createRigidArea(r1)
            java.awt.Component r0 = r0.add(r1)
            r0 = r6
            r1 = r7
            r0.toUninstall = r1
            r0 = r6
            java.awt.Component r0 = r0.uninstallArea
            r1 = 1
            r0.setVisible(r1)
            r0 = r6
            javax.swing.JFrame r0 = r0.appWindow
            r0.pack()
            return
    }

    private void install(java.util.List<lombok.installer.IdeLocation> r9) {
            r8 = this;
            javax.swing.JPanel r0 = new javax.swing.JPanel
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = 1
            r0.setOpaque(r1)
            r0 = r10
            java.awt.FlowLayout r1 = new java.awt.FlowLayout
            r2 = r1
            r2.<init>()
            r0.setLayout(r1)
            r0 = r10
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            javax.swing.ImageIcon r3 = new javax.swing.ImageIcon
            r4 = r3
            java.lang.Class<lombok.installer.Installer> r5 = lombok.installer.Installer.class
            java.lang.String r6 = "loading.gif"
            java.net.URL r5 = r5.getResource(r6)
            r4.<init>(r5)
            r2.<init>(r3)
            java.awt.Component r0 = r0.add(r1)
            r0 = r8
            javax.swing.JFrame r0 = r0.appWindow
            java.awt.Container r0 = r0.getContentPane()
            r11 = r0
            r0 = r8
            javax.swing.JFrame r0 = r0.appWindow
            r1 = r10
            r0.setContentPane(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = r0
            r1.<init>()
            r12 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = r0
            r1.<init>()
            r13 = r0
            lombok.installer.InstallerGUI$10 r0 = new lombok.installer.InstallerGUI$10
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r12
            r5 = r13
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.start()
            return
    }

    private void doUninstall() {
            r8 = this;
            javax.swing.JPanel r0 = new javax.swing.JPanel
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = 1
            r0.setOpaque(r1)
            r0 = r9
            java.awt.FlowLayout r1 = new java.awt.FlowLayout
            r2 = r1
            r2.<init>()
            r0.setLayout(r1)
            r0 = r9
            javax.swing.JLabel r1 = new javax.swing.JLabel
            r2 = r1
            javax.swing.ImageIcon r3 = new javax.swing.ImageIcon
            r4 = r3
            java.lang.Class<lombok.installer.Installer> r5 = lombok.installer.Installer.class
            java.lang.String r6 = "/lombok/installer/loading.gif"
            java.net.URL r5 = r5.getResource(r6)
            r4.<init>(r5)
            r2.<init>(r3)
            java.awt.Component r0 = r0.add(r1)
            r0 = r8
            javax.swing.JFrame r0 = r0.appWindow
            java.awt.Container r0 = r0.getContentPane()
            r10 = r0
            r0 = r8
            javax.swing.JFrame r0 = r0.appWindow
            r1 = r9
            r0.setContentPane(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = r0
            r1.<init>()
            r11 = r0
            java.lang.Thread r0 = new java.lang.Thread
            r1 = r0
            lombok.installer.InstallerGUI$11 r2 = new lombok.installer.InstallerGUI$11
            r3 = r2
            r4 = r8
            r5 = r11
            r6 = r10
            r3.<init>(r4, r5, r6)
            r1.<init>(r2)
            r0.start()
            return
    }

    void selectedLomboksChanged(java.util.List<lombok.installer.IdeLocation> r4) {
            r3 = this;
            r0 = 0
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L27
        Lf:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.installer.IdeLocation r0 = (lombok.installer.IdeLocation) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0.hasLombok()
            if (r0 == 0) goto L25
            r0 = 1
            r5 = r0
        L25:
            r0 = 1
            r6 = r0
        L27:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lf
            r0 = r3
            lombok.installer.InstallerGUI$JHyperLink r0 = r0.uninstallButton
            r1 = r5
            r0.setVisible(r1)
            r0 = r3
            javax.swing.JLabel r0 = r0.uninstallPlaceholder
            r1 = r5
            if (r1 == 0) goto L45
            r1 = 0
            goto L46
        L45:
            r1 = 1
        L46:
            r0.setVisible(r1)
            r0 = r3
            javax.swing.JButton r0 = r0.installButton
            r1 = r6
            r0.setEnabled(r1)
            return
    }

    private void buildChrome(java.awt.Container r9) {
            r8 = this;
            javax.swing.JLabel r0 = new javax.swing.JLabel
            r1 = r0
            javax.swing.ImageIcon r2 = new javax.swing.ImageIcon
            r3 = r2
            java.lang.Class<lombok.installer.Installer> r4 = lombok.installer.Installer.class
            java.lang.String r5 = "lombok.png"
            java.net.URL r4 = r4.getResource(r5)
            r3.<init>(r4)
            r1.<init>(r2)
            r10 = r0
            java.awt.GridBagConstraints r0 = new java.awt.GridBagConstraints
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r9
            java.awt.GridBagLayout r1 = new java.awt.GridBagLayout
            r2 = r1
            r2.<init>()
            r0.setLayout(r1)
            r0 = r11
            r1 = 3
            r0.gridheight = r1
            r0 = r11
            r1 = 1
            r0.gridwidth = r1
            r0 = r11
            r1 = 0
            r0.gridx = r1
            r0 = r11
            r1 = 0
            r0.gridy = r1
            r0 = r11
            java.awt.Insets r1 = new java.awt.Insets
            r2 = r1
            r3 = 8
            r4 = 8
            r5 = 8
            r6 = 8
            r2.<init>(r3, r4, r5, r6)
            r0.insets = r1
            r0 = r9
            r1 = r10
            r2 = r11
            r0.add(r1, r2)
            r0 = r11
            java.awt.Insets r1 = new java.awt.Insets
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.insets = r1
            r0 = r11
            r1 = r0
            int r1 = r1.gridx
            r2 = 1
            int r1 = r1 + r2
            r0.gridx = r1
            r0 = r11
            r1 = r0
            int r1 = r1.gridy
            r2 = 1
            int r1 = r1 + r2
            r0.gridy = r1
            r0 = r11
            r1 = 1
            r0.gridheight = r1
            r0 = r11
            r1 = 2
            r0.fill = r1
            r0 = r11
            r1 = 16
            r0.ipadx = r1
            r0 = r11
            r1 = 14
            r0.ipady = r1
            r0 = r9
            r1 = r8
            java.awt.Component r1 = r1.javacArea
            r2 = r11
            r0.add(r1, r2)
            r0 = r11
            r1 = r0
            int r1 = r1.gridy
            r2 = 1
            int r1 = r1 + r2
            r0.gridy = r1
            r0 = r9
            r1 = r8
            java.awt.Component r1 = r1.ideArea
            r2 = r11
            r0.add(r1, r2)
            r0 = r9
            r1 = r8
            java.awt.Component r1 = r1.uninstallArea
            r2 = r11
            r0.add(r1, r2)
            r0 = r9
            r1 = r8
            java.awt.Component r1 = r1.howIWorkArea
            r2 = r11
            r0.add(r1, r2)
            r0 = r9
            r1 = r8
            java.awt.Component r1 = r1.successArea
            r2 = r11
            r0.add(r1, r2)
            r0 = r11
            r1 = r0
            int r1 = r1.gridy
            r2 = 1
            int r1 = r1 + r2
            r0.gridy = r1
            r0 = r11
            r1 = 2
            r0.gridwidth = r1
            r0 = r11
            r1 = 0
            r0.gridx = r1
            r0 = r11
            r1 = 0
            r0.weightx = r1
            r0 = r11
            r1 = 0
            r0.weighty = r1
            r0 = r11
            r1 = 0
            r0.ipadx = r1
            r0 = r11
            r1 = 0
            r0.ipady = r1
            r0 = r11
            r1 = 2
            r0.fill = r1
            r0 = r11
            r1 = 16
            r0.anchor = r1
            r0 = r11
            java.awt.Insets r1 = new java.awt.Insets
            r2 = r1
            r3 = 0
            r4 = 16
            r5 = 8
            r6 = 8
            r2.<init>(r3, r4, r5, r6)
            r0.insets = r1
            r0 = r8
            javax.swing.JFrame r0 = r0.appWindow
            r1 = r8
            javax.swing.Box r1 = r1.buildButtonBar()
            r2 = r11
            r0.add(r1, r2)
            return
    }

    private javax.swing.Box buildButtonBar() {
            r6 = this;
            javax.swing.Box r0 = javax.swing.Box.createHorizontalBox()
            r7 = r0
            lombok.installer.InstallerGUI$JHyperLink r0 = new lombok.installer.InstallerGUI$JHyperLink
            r1 = r0
            java.net.URI r2 = lombok.installer.Installer.ABOUT_LOMBOK_URL
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r6
            r2 = r8
            java.net.URI r3 = lombok.installer.Installer.ABOUT_LOMBOK_URL
            java.awt.event.ActionListener r1 = r1.openBrowser(r2, r3)
            r0.addActionListener(r1)
            r0 = r7
            r1 = r8
            java.awt.Component r0 = r0.add(r1)
            r0 = r7
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 16
            r4 = 1
            r2.<init>(r3, r4)
            java.awt.Component r1 = javax.swing.Box.createRigidArea(r1)
            java.awt.Component r0 = r0.add(r1)
            javax.swing.JLabel r0 = new javax.swing.JLabel
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "v"
            r2.<init>(r3)
            java.lang.String r2 = lombok.core.Version.getVersion()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            r0 = r7
            r1 = r9
            java.awt.Component r0 = r0.add(r1)
            r0 = r7
            java.awt.Dimension r1 = new java.awt.Dimension
            r2 = r1
            r3 = 16
            r4 = 1
            r2.<init>(r3, r4)
            java.awt.Component r1 = javax.swing.Box.createRigidArea(r1)
            java.awt.Component r0 = r0.add(r1)
            lombok.installer.InstallerGUI$JHyperLink r0 = new lombok.installer.InstallerGUI$JHyperLink
            r1 = r0
            java.lang.String r2 = "View full changelog"
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r6
            r2 = r10
            java.net.URI r3 = lombok.installer.Installer.ABOUT_LOMBOK_URL
            java.lang.String r4 = "/changelog.html"
            java.net.URI r3 = r3.resolve(r4)
            java.awt.event.ActionListener r1 = r1.openBrowser(r2, r3)
            r0.addActionListener(r1)
            r0 = r7
            r1 = r10
            java.awt.Component r0 = r0.add(r1)
            r0 = r7
            java.awt.Component r1 = javax.swing.Box.createHorizontalGlue()
            java.awt.Component r0 = r0.add(r1)
            javax.swing.JButton r0 = new javax.swing.JButton
            r1 = r0
            java.lang.String r2 = "Quit Installer"
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            lombok.installer.InstallerGUI$12 r1 = new lombok.installer.InstallerGUI$12
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.addActionListener(r1)
            r0 = r7
            r1 = r11
            java.awt.Component r0 = r0.add(r1)
            r0 = r7
            return r0
    }

    private java.awt.event.ActionListener openBrowser(lombok.installer.InstallerGUI.JHyperLink r7, java.net.URI r8) {
            r6 = this;
            lombok.installer.InstallerGUI$13 r0 = new lombok.installer.InstallerGUI$13
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    public void show() {
            r3 = this;
            r0 = r3
            javax.swing.JFrame r0 = r0.appWindow
            r1 = 1
            r0.setVisible(r1)
            lombok.installer.OsUtils$OS r0 = lombok.installer.OsUtils.getOS()
            lombok.installer.OsUtils$OS r1 = lombok.installer.OsUtils.EnumC1123OS.MAC_OS_X
            if (r0 != r1) goto L18
            lombok.installer.AppleNativeLook.m79go()     // Catch: java.lang.Throwable -> L17
            goto L18
        L17:
        L18:
            return
    }

    static /* synthetic */ javax.swing.JFrame access$0(lombok.installer.InstallerGUI r2) {
            r0 = r2
            javax.swing.JFrame r0 = r0.appWindow
            return r0
    }

    static /* synthetic */ java.awt.Component access$1(lombok.installer.InstallerGUI r2) {
            r0 = r2
            java.awt.Component r0 = r0.howIWorkArea
            return r0
    }

    static /* synthetic */ java.awt.Component access$2(lombok.installer.InstallerGUI r2) {
            r0 = r2
            java.awt.Component r0 = r0.javacArea
            return r0
    }

    static /* synthetic */ java.awt.Component access$3(lombok.installer.InstallerGUI r2) {
            r0 = r2
            java.awt.Component r0 = r0.ideArea
            return r0
    }

    static /* synthetic */ java.awt.Component access$4(lombok.installer.InstallerGUI r2) {
            r0 = r2
            java.awt.Component r0 = r0.successArea
            return r0
    }

    static /* synthetic */ java.awt.Component access$5(lombok.installer.InstallerGUI r2) {
            r0 = r2
            java.awt.Component r0 = r0.uninstallArea
            return r0
    }

    static /* synthetic */ void access$6(lombok.installer.InstallerGUI r2) {
            r0 = r2
            r0.doUninstall()
            return
    }

    static /* synthetic */ lombok.installer.InstallerGUI.IdesList access$7(lombok.installer.InstallerGUI r2) {
            r0 = r2
            lombok.installer.InstallerGUI$IdesList r0 = r0.idesList
            return r0
    }

    static /* synthetic */ void access$8(lombok.installer.InstallerGUI r3, java.lang.Throwable r4) {
            r0 = r3
            r1 = r4
            r0.handleException(r1)
            return
    }

    static /* synthetic */ javax.swing.JComponent access$9(lombok.installer.InstallerGUI r2) {
            r0 = r2
            javax.swing.JComponent r0 = r0.loadingExpl
            return r0
    }

    static /* synthetic */ void access$10(lombok.installer.InstallerGUI r3, java.util.List r4) {
            r0 = r3
            r1 = r4
            r0.install(r1)
            return
    }

    static /* synthetic */ void access$11(lombok.installer.InstallerGUI r2) {
            r0 = r2
            r0.showWhatIDo()
            return
    }

    static /* synthetic */ void access$12(lombok.installer.InstallerGUI r3, java.util.List r4) {
            r0 = r3
            r1 = r4
            r0.uninstall(r1)
            return
    }

    static /* synthetic */ java.util.Set access$13(lombok.installer.InstallerGUI r2) {
            r0 = r2
            java.util.Set<java.lang.String> r0 = r0.installSpecificMessages
            return r0
    }

    static /* synthetic */ void access$14(lombok.installer.InstallerGUI r3, java.lang.String r4) {
            r0 = r3
            r1 = r4
            r0.showSuccess(r1)
            return
    }

    static /* synthetic */ java.util.List access$15(lombok.installer.InstallerGUI r2) {
            r0 = r2
            java.util.List<lombok.installer.IdeLocation> r0 = r0.toUninstall
            return r0
    }
}
