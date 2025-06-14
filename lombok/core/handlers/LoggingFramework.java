package lombok.core.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/handlers/LoggingFramework.SCL.lombok */
public class LoggingFramework {
    public static final lombok.core.handlers.LoggingFramework COMMONS = null;
    public static final lombok.core.handlers.LoggingFramework JUL = null;
    public static final lombok.core.handlers.LoggingFramework LOG4J = null;
    public static final lombok.core.handlers.LoggingFramework LOG4J2 = null;
    public static final lombok.core.handlers.LoggingFramework SLF4J = null;
    public static final lombok.core.handlers.LoggingFramework XSLF4J = null;
    public static final lombok.core.handlers.LoggingFramework JBOSSLOG = null;
    public static final lombok.core.handlers.LoggingFramework FLOGGER = null;
    private final java.lang.Class<? extends java.lang.annotation.Annotation> annotationClass;
    private final java.lang.String annotationAsString;
    private final lombok.core.configuration.LogDeclaration declaration;

    static {
            lombok.core.handlers.LoggingFramework r0 = new lombok.core.handlers.LoggingFramework
            r1 = r0
            java.lang.Class<lombok.extern.apachecommons.CommonsLog> r2 = lombok.extern.apachecommons.CommonsLog.class
            java.lang.String r3 = "org.apache.commons.logging.Log org.apache.commons.logging.LogFactory.getLog(TYPE)(TOPIC)"
            lombok.core.configuration.LogDeclaration r3 = lombok.core.configuration.LogDeclaration.valueOf(r3)
            r1.<init>(r2, r3)
            lombok.core.handlers.LoggingFramework.COMMONS = r0
            lombok.core.handlers.LoggingFramework r0 = new lombok.core.handlers.LoggingFramework
            r1 = r0
            java.lang.Class<lombok.extern.java.Log> r2 = lombok.extern.java.Log.class
            java.lang.String r3 = "java.util.logging.Logger java.util.logging.Logger.getLogger(NAME)(TOPIC)"
            lombok.core.configuration.LogDeclaration r3 = lombok.core.configuration.LogDeclaration.valueOf(r3)
            r1.<init>(r2, r3)
            lombok.core.handlers.LoggingFramework.JUL = r0
            lombok.core.handlers.LoggingFramework r0 = new lombok.core.handlers.LoggingFramework
            r1 = r0
            java.lang.Class<lombok.extern.log4j.Log4j> r2 = lombok.extern.log4j.Log4j.class
            java.lang.String r3 = "org.apache.log4j.Logger org.apache.log4j.Logger.getLogger(TYPE)(TOPIC)"
            lombok.core.configuration.LogDeclaration r3 = lombok.core.configuration.LogDeclaration.valueOf(r3)
            r1.<init>(r2, r3)
            lombok.core.handlers.LoggingFramework.LOG4J = r0
            lombok.core.handlers.LoggingFramework r0 = new lombok.core.handlers.LoggingFramework
            r1 = r0
            java.lang.Class<lombok.extern.log4j.Log4j2> r2 = lombok.extern.log4j.Log4j2.class
            java.lang.String r3 = "org.apache.logging.log4j.Logger org.apache.logging.log4j.LogManager.getLogger(TYPE)(TOPIC)"
            lombok.core.configuration.LogDeclaration r3 = lombok.core.configuration.LogDeclaration.valueOf(r3)
            r1.<init>(r2, r3)
            lombok.core.handlers.LoggingFramework.LOG4J2 = r0
            lombok.core.handlers.LoggingFramework r0 = new lombok.core.handlers.LoggingFramework
            r1 = r0
            java.lang.Class<lombok.extern.slf4j.Slf4j> r2 = lombok.extern.slf4j.Slf4j.class
            java.lang.String r3 = "org.slf4j.Logger org.slf4j.LoggerFactory.getLogger(TYPE)(TOPIC)"
            lombok.core.configuration.LogDeclaration r3 = lombok.core.configuration.LogDeclaration.valueOf(r3)
            r1.<init>(r2, r3)
            lombok.core.handlers.LoggingFramework.SLF4J = r0
            lombok.core.handlers.LoggingFramework r0 = new lombok.core.handlers.LoggingFramework
            r1 = r0
            java.lang.Class<lombok.extern.slf4j.XSlf4j> r2 = lombok.extern.slf4j.XSlf4j.class
            java.lang.String r3 = "org.slf4j.ext.XLogger org.slf4j.ext.XLoggerFactory.getXLogger(TYPE)(TOPIC)"
            lombok.core.configuration.LogDeclaration r3 = lombok.core.configuration.LogDeclaration.valueOf(r3)
            r1.<init>(r2, r3)
            lombok.core.handlers.LoggingFramework.XSLF4J = r0
            lombok.core.handlers.LoggingFramework r0 = new lombok.core.handlers.LoggingFramework
            r1 = r0
            java.lang.Class<lombok.extern.jbosslog.JBossLog> r2 = lombok.extern.jbosslog.JBossLog.class
            java.lang.String r3 = "org.jboss.logging.Logger org.jboss.logging.Logger.getLogger(TYPE)(TOPIC)"
            lombok.core.configuration.LogDeclaration r3 = lombok.core.configuration.LogDeclaration.valueOf(r3)
            r1.<init>(r2, r3)
            lombok.core.handlers.LoggingFramework.JBOSSLOG = r0
            lombok.core.handlers.LoggingFramework r0 = new lombok.core.handlers.LoggingFramework
            r1 = r0
            java.lang.Class<lombok.extern.flogger.Flogger> r2 = lombok.extern.flogger.Flogger.class
            java.lang.String r3 = "com.google.common.flogger.FluentLogger com.google.common.flogger.FluentLogger.forEnclosingClass()"
            lombok.core.configuration.LogDeclaration r3 = lombok.core.configuration.LogDeclaration.valueOf(r3)
            r1.<init>(r2, r3)
            lombok.core.handlers.LoggingFramework.FLOGGER = r0
            return
    }

    public LoggingFramework(java.lang.Class<? extends java.lang.annotation.Annotation> r6, lombok.core.configuration.LogDeclaration r7) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            r0.annotationClass = r1
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "@"
            r2.<init>(r3)
            r2 = r6
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.annotationAsString = r1
            r0 = r5
            r1 = r7
            r0.declaration = r1
            return
    }

    public java.lang.Class<? extends java.lang.annotation.Annotation> getAnnotationClass() {
            r2 = this;
            r0 = r2
            java.lang.Class<? extends java.lang.annotation.Annotation> r0 = r0.annotationClass
            return r0
    }

    public java.lang.String getAnnotationAsString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.annotationAsString
            return r0
    }

    public lombok.core.configuration.LogDeclaration getDeclaration() {
            r2 = this;
            r0 = r2
            lombok.core.configuration.LogDeclaration r0 = r0.declaration
            return r0
    }
}
