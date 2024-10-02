public class Parent {
    protected String parentField;

    public Parent(String parentField) {
        this.parentField = parentField;

    }

    public void parentMethod() {
        System.out.println(parentField);
    }
}
