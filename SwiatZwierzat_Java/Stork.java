public class Stork extends Bird{ //*dziedziczenie* extends uzywamy podczas dziedziczenia klas. Zapobiega to powielaniu tych samych cech obiektow. Dzieki temu mozemy
    //możemy stworzyć oddzielną klasę, czyli Animal i odziedziczyć po niej zestaw cech które ma każde zwierzę

    Stork(){
        super(); //za pomoca slowa super w tym przypadku wywolujemy konstruktor klasy, po ktorej dziedziczymy
        System.out.println("Jestem bocianem");
    }
    void fly(){
        System.out.println("Potrafie latac");
    }

    @Override
    public void presentYourself() {
        System.out.println("Mam na imie " + getName() + " oraz zyje juz od " + getAge() + " lat");
    }
}
