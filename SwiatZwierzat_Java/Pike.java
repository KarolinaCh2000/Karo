public class Pike extends Fish{ //*dziedziczenie* extends uzywamy podczas dziedziczenia klas. Zapobiega to powielaniu tych samych cech obiektow. Dzieki temu mozemy
    //możemy stworzyć oddzielną klasę, czyli Animal i odziedziczyć po niej zestaw cech które ma każde zwierzę

    Pike(){
        super(); //za pomoca slowa super w tym przypadku wywolujemy konstruktor klasy, po ktorej dziedziczymy
        System.out.println("Jestem szczupakiem");
    }

    @Override
    void swim() {
        System.out.println("Potrafie plywac");
    }

    @Override
    public void presentYourself() {
        System.out.println("Mam na imie " + getName() + " oraz zyje tu w wodzie juz od " + getAge() + " lat");
    }
}
