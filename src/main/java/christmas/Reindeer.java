package christmas;

public class Reindeer {

    protected String name;

    public Reindeer(String name) {
        this.name = name;
        System.out.printf("The reindeer created is %s%n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
