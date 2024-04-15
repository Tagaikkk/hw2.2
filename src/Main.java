class Main {
    public static Parent createObject(String className) {
        switch (className) {
            case "2й":
                return new Child2("common property of Child2", 42);
            case "3й":
                return new Child3("common property of Child3", 3.14);
            case "4й":
                return new Child4("common property of Child4", true);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Parent obj2 = createObject("2й");
        Parent obj3 = createObject("3й");
        Parent obj4 = createObject("4й");

        Printable[] objects = { (Printable)obj2, (Printable)obj3, (Printable)obj4 };

        for (Printable obj : objects) {
            obj.print();
        }
    }
}
