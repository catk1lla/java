class Child extends Parent {
    private int childField;

    public Child(String parentField, int childField) {
        super(parentField);
        this.childField = childField;

    }

    public void childMethod() {
        System.out.println(childField);
    }

}
