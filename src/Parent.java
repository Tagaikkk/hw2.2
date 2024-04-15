public class Parent {
    String commonProperty;

    public Parent(String commonProperty) {
        this.commonProperty = commonProperty;
    }
}


class Child2 extends Parent implements Printable {
    int child2Property;

    public Child2(String commonProperty, int child2Property) {
        super(commonProperty);
        this.child2Property = child2Property;
    }

    @Override
    public void print() {
        System.out.println("Child2: commonProperty=" + commonProperty + ", child2Property=" + child2Property);
    }
}

class Child3 extends Parent implements Printable {
    double child3Property;

    public Child3(String commonProperty, double child3Property) {
        super(commonProperty);
        this.child3Property = child3Property;
    }

    @Override
    public void print() {
        System.out.println("Child3: commonProperty=" + commonProperty + ", child3Property=" + child3Property);
    }
}


class Child4 extends Parent implements Printable {
    boolean child4Property;

    public Child4(String commonProperty, boolean child4Property) {
        super(commonProperty);
        this.child4Property = child4Property;
    }

    @Override
    public void print() {
        System.out.println("Child4: commonProperty=" + commonProperty + ", child4Property=" + child4Property);
    }
}


