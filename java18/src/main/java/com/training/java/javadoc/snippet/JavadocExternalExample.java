package com.training.java.javadoc;

import java.time.LocalDate;

/**
 * Comment in level class
 */
public class JavadocExternalExample {
    /**
     * Default javadoc in constructor
     */
    public JavadocExternalExample() {
    }

    /**
     * Default comment
     */
    public void useExternalSnippet() {
        // @start region="example"
        final LocalDate ld = LocalDate.now().minusDays(1);
        // @end
    }
}
