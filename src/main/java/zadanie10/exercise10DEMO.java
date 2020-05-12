package zadanie10;

public class exercise10DEMO   {

    public static void main(String[] args) {
        final int x =5;
        final int y =8;
        voidWithoutParametr example1 = () ->System.out.println("HELLO");
        intWiththreeParametrs example2 = (a,b,c) ->a*b*c;
        voidWithOneParamentr example3 = (name) -> System.out.println("Moje imie " + name);
        ManyInstruction example4 = (a) -> {
            int b = x + 5 * y;
            return b;
        };

        example1.sayHello();
        System.out.println(example2.VolumeCalculator(20,30,40));
        example3.sayMyName("Karol");
        System.out.println(example4.Calculate(5));

    }

}
