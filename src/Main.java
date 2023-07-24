public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread("Хлеб");
        Pie pie = new Pie("Пирог");
        Pancake pancake = new Pancake("Булочка");

        Baked[] bakeds = new Baked[]{bread,pie,pancake};
        for (Baked breads:bakeds) {
        breads.Bake();
        }
    }
}