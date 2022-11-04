public abstract class Compartment {
    abstract void notice();
}
class FirstClass extends Compartment{
    @Override
    void notice(){
        System.out.println("First Compartment");
    }
}
class Ladies extends Compartment{
    @Override
    void notice(){
        System.out.println("Ladies Compartment");
    }
}
class General extends Compartment{
    @Override
    void notice(){
        System.out.println("General Compartment");
    }
}
class Luggage extends Compartment{
    @Override
    void notice(){
        System.out.println("Luggage Compartment");
    }
}
class TestCompartment {
    public static void main(String[] args) {
        Compartment[] c = new Compartment[10];
        double d = Math.random()*5;
        int n = (int) d;

        switch (n)
        {
            case 1 : c[0] = new FirstClass();
                     c[0].notice();
                     break;
            case 2 : c[1] = new Ladies();
                     c[1].notice();
                     break;
            case 3 : c[2] = new General();
                     c[2].notice();
                     break;
            case 4 : c[3] = new Luggage();
                     c[3].notice();
                     break;
            default: System.out.println("Invalid Choice");
        }
    }
}