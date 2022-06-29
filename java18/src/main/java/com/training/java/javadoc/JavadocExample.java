package com.training.java.javadoc;

/**
 * Default javadoc in class level
 */
public class JavadocExample {
    /**
     * Default javadoc in constructor
     */
    public JavadocExample() {
    }

    /**
     * <p>Use @code</p>
     *
     * <pre>{@code
     * final LocalDateTime ldt = LocalDateTime.now();
     * final LocalDate ld = LocalDate.now();
     * final LocalTime lt = LocalTime.now();
     * }</pre>
     */
    public void usePreCode() {

    }

    /**
     * <p>Use snippet</p>
     * {@snippet :
     * final LocalDateTime ldt = LocalDateTime.now();
     * final LocalDate ld = LocalDate.now();
     * final LocalTime lt = LocalTime.now(); // @highlight substring="LocalTime"
     *}
     */
    public void useSnippet() {
    }

    /**
     * <p>Use external snippet</p>
     * {@snippet class = "JavadocExternalExample" region = "example"}
     */
    public void useExternalSnippet() {
    }

    /**
     * <p>Use highlight</p>
     * {@snippet :
     * final LocalTime lt = LocalTime.now(); // @highlight substring="LocalTime"
     *}
     */
    public void useHighlight() {
    }

    /**
     * <p>Use @replace to replace String in a snippet code</p>
     * {@snippet :
     * System.out.println("Hello world !"); // @replace regex='".*"' replacement="..."
     *}
     */
    public void useReplacement() {
        System.out.println("Hello world !"); // @replace regex='".*"' replacement="..."
    }

    /**
     * Use link to reference a java API
     * {@snippet :
     * final LocalTime lt = LocalTime.now(); // @link substring="LocalTime" target="java.time.LocalTime"
     *}
     */
    public void useLinkText() {
    }

    /**
     * Use properties file in a code snippet
     * {@snippet file = "config.properties"}
     */
    public void usePropertiesFile() {
    }

    /**
     * Use properties in a code snippet
     * {@snippet lang = properties:
     * local.timezone=PST
     * local.zip=94123
     *}
     */
    public void useProperties() {
    }
}
