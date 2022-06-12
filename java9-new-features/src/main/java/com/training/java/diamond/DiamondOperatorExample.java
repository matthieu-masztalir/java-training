package com.training.java.diamond;

public class DiamondOperatorExample {

    /**
     * Use InnerClass with Diamond
     *
     * @return {@link Referentiel}
     */
    public Referentiel<String> useDiamondWithInnerClass() {
        final Referentiel<String> referentiel = new Referentiel<String>() {
            @Override
            String format() {
                return String.format("%s :)", this.getLabel());
            }
        };

        referentiel.setLabel("Hello world");

        return referentiel;
    }

    /**
     * Generic class for example
     *
     * @param <T> Type of label
     */
    abstract class Referentiel<T> {
        T label;

        public T getLabel() {
            return this.label;
        }

        public void setLabel(T label) {
            this.label = label;
        }

        abstract T format();
    }
}
