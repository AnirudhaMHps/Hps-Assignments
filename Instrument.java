 abstract class Instrument {
    abstract void play();
}
class Piano extends Instrument{
    @Override
    void play(){
        System.out.println("tan tan tan tan");
    }
}
class Flute extends Instrument{
    @Override
    void play(){
        System.out.println("toot toot toot toot");
    }
}
class Guitar extends Instrument{
    @Override
    void play(){
        System.out.println("tin tin tin tin ");
    }
}
class MainClass{
    public static void main(String[] args) {
        Instrument[] i = {new Flute(), new Piano(), new Guitar(), new Piano(), new Flute(), new Guitar(), new Flute(), new Guitar(), new Piano(), new Guitar()};
        for(int j =0 ; j< i.length; j++){
            if(i[j] instanceof Piano){
                i[j].play();
            }
            else if(i[j] instanceof Guitar){
                i[j].play();
            }
           else if(i[j] instanceof  Flute){
                i[j].play();
            }
        }
    }
}