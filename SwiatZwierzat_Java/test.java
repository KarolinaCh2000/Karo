public class test {
    public static void main(String[] Args){
        Lion lew = new Lion();
        lew.setName("Simba");
        lew.growOld(12);
        lew.presentYourself();
        System.out.println();

        Giraffe zyrafa = new Giraffe();
        zyrafa.setName("Clara");
        zyrafa.growOld(11);
        zyrafa.presentYourself();
        System.out.println();

        Stork bocian = new Stork();
        bocian.setName("Kajtek");
        bocian.growOld(6);
        bocian.presentYourself();
        bocian.fly();
        System.out.println();

        Pike szczupak = new Pike();
        szczupak.setName("Borys");
        szczupak.growOld(4);
        szczupak.presentYourself();
        szczupak.swim();
        System.out.println();

        //*Polimorfizm*, czyli wielopostaciowosc. Dzieje się tak dlatego, że obiekty zyrafa1 i zyrafa są jednocześnie obiektami klasy Giraffe ale także obiektami klasy Animal.
        // Inaczej mówiąc, mają cechy z każdej z tych klas i można je w naszym programie traktować zarówno jako obiekty typu Giraffe jak i Animal.
        Animal zyrafa1 = zyrafa;
        System.out.println(zyrafa1.getName());

        //Lion lew1 = zyrafa;  //tak nie mozna zrobic, bo obiekt klasy Lion to nie to samo co obiekt klasy Giraffe

        //Mammal gepard = new Mammal(); (error) *abstrakcja* dzieki temu, ze klasa Mammal jest abstrakcyjna zapobiegamy tworzeniu
                                        //ssaka, bez okreslenia jakim zwierzeciem jest
        //Animal wiewiorka = new Animal();  to samo co wyzej, zapobiegamy tworzeniu samego obiektu zwierze, bez konkretow
    }
}
