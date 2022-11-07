public class Medicine {
    void displayLabel(){
        System.out.println("Company : Himalaya");
        System.out.println("Bangalore");
    }
}
class Tablet extends Medicine{
    @Override
    void displayLabel(){
        super.displayLabel();
        System.out.println("store in a cool dry place");
    }
}
class Syrup extends Medicine{
    @Override
    void displayLabel(){
       super.displayLabel();
        System.out.println("use it as directed by physician");
    }
}
class Ointment extends Medicine{
    @Override
    void displayLabel(){
        super.displayLabel();
        System.out.println("for external use only");
    }
}
class TestMedicine {
    public static void main(String[] args) {
        Medicine[] m = new Medicine[10];
        double r = Math.random()*4;
        int n = (int) r;
        switch (n)
        {
            case 1 : m[0] = new Tablet();
                m[0].displayLabel();
                break;
            case 2 : m[1] = new Syrup();
                m[1].displayLabel();
                break;
            case 3 : m[2] = new Ointment();
                m[2].displayLabel();
                break;

            default: System.out.println("Invalid Choice");
        }
    }
    }
