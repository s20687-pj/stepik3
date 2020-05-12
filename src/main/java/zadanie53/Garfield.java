package zadanie53;

public class Garfield extends Cats implements FatCat {
    @Override
    public void sleep() {
        System.out.println("ZZZZ");
    }
    @Override
    public void run() {
        System.out.println("run");
    }
    @Override
    public void jump() {
        System.out.println("JUMP");
    }
    @Override
    public void eat() {
        System.out.println("eat");
    }
    @Override
    public void cook() {
        System.out.println("cook");
    }

    public static void isSleeping(Cat cat){
        cat.jump();
    };
    public static void isEating(LasagnaEater cat){
        cat.cook();
    };
    public static void fatCat(FatCat cat){
        cat.run();
    };

    public static void main(String[] args) {

        Garfield karol = new Garfield();
        isSleeping(karol);
        isEating(karol);
        fatCat(karol);
    }
}
