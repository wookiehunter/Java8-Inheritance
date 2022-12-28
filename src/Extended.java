public class Extended extends Demo {
    private String job;
    public Extended(String name, int value, String job) {
        super(name, value);
        this.job = job;
    }

    public void getDetails() {
        System.out.print("Name: " + name + ", Value: " + String.valueOf(value) + ", Job: " + job);
    }
}
