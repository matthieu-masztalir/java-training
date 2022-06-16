package com.training.java.nestedclasses;

public class OuterExample {
    public void outerPublic() {

    }

    private void outerPrivate() {
    }

    class Inner {
        public void innerPublic() {
            outerPrivate();
        }
    }
}
