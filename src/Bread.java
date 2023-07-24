public class Bread implements Baked{
    private String name;

    public Bread(String name) {
        this.name = name;
    }

    @Override
    public void Bake() {
        System.out.println(name+ " испёкся. Приятного аппетита!");
    }
}
