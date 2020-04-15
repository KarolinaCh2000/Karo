abstract class Fish extends Animal{ //*dziedziczenie* extends uzywamy podczas dziedziczenia klas. Zapobiega to powielaniu tych samych cech obiektow. Dzieki temu mozemy
    //możemy stworzyć oddzielną klasę, czyli Animal i odziedziczyć po niej zestaw cech które ma każde zwierzę

    Fish(){
        super();  //za pomoca slowa super w tym przypadku wywolujemy konstruktor klasy, po ktorej dziedziczymy
        System.out.println("Jestem ryba");
    }

    abstract void swim();  //uznajac metode za abstrakcyjna uznajemy, ze cialo tej metody musi być stworzone w klasie dziedziczącej po tej klasie,
    // lecz tutaj jedynie stwierdzamy, że taka metoda ma powstać.
}
