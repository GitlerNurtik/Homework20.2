public class Pie implements Baked{
    private String name;
    @Override
    public void Bake() {
        System.out.println(name+ " испёкся. Приятного аппетита!");
    }

    public Pie(String name) {
        this.name = name;
    }
}
