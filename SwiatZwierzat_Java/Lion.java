public class Lion extends Mammal implements Carnivore {  //*dziedziczenie* extends uzywamy podczas dziedziczenia klas. Zapobiega to powielaniu tych samych cech obiektow. Dzieki temu mozemy
    //możemy stworzyć oddzielną klasę, czyli Animal i odziedziczyć po niej zestaw cech które ma każde zwierzę
    //z kolei implements ma podobne znaczenie do extends jednak w tym przypadku oznajmiamy ze de facto bedziemy wykorzystywac dany interfejs,
    //korzystac i zapisywac cialo metod z interfejsu
    Lion(){
        super();  //za pomoca slowa super w tym przypadku wywolujemy konstruktor klasy, po ktorej dziedziczymy
        System.out.println("Jestem Lwem");
    }

    @Override
    public void eatMeat() {
        System.out.println("Jestem miesozerca. Poluje glownie na antylopy i gazele.");
    }

    @Override
    public void presentYourself() {
        System.out.println("Mam na imie " + getName() + " oraz zyje tu na sawannie juz od " + getAge() + " lat");
        eatMeat();
    }
}
