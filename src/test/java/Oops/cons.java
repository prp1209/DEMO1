package Oops;

public class cons {

    String name;
    Boolean result;
    int percentage = 0;

    public cons(String name, Boolean result) {
        this.name = name;
        this.result = result;
        this.percentage = 0;
    }

    public cons() {
        this.name = "";
        this.result = false;
        this.percentage = 0;
    }

    @Override
    public String toString() {
        return "cons{name='" + name + "', result=" + result + ", percentage=" + percentage + "}";
    }
}

