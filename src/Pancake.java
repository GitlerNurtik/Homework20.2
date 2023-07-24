public class Pancake implements Baked{
    private String name;
    @Override
    public void Bake() {
        System.out.println(name+ " испёкся. Приятного аппетита!");
    }

    public Pancake(String name) {
        this.name = name;
    }
}
