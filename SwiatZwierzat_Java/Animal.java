public abstract class Animal { //*abstrakcja* dzieki temu ze klasa jest abstrakcyjna to zabrania to
                        // stworzenia obiektu klasy Animal, poniewaz nie powinno tak być, gdyż nie ma w przyrodzie
                        // po prostu “zwierząt”, są za to lwy, psy, koty itd
    private String name;
    private int age; //*hermetyzacja* tzw “ukrycie” implementacji, czyli wewnętrzne zachowanie. Dostep do pol private danej klasy
                    //bedzie mozna miec jedynie za posrednictwem tzw getterow i setterow. Nie mozna sie bezposrednio do tych pol odwolac
                    //poza klasa. Pozwala to na uniknięcie wielu potencjalnych błędów i ułatwia pisanie dużych programów
    Animal(){
        System.out.println("Jestem zwierzeciem,");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName(){
        return name;
    }

    void growOld(int age) {
        this.age += age;
    }

    int getAge(){
        return age;
    }

    public abstract void presentYourself(); //uznajac metode za abstrakcyjna uznajemy, ze cialo tej metody musi być stworzone w klasie dziedziczącej po tej klasie,
                // lecz tutaj jedynie stwierdzamy, że taka metoda ma powstać.
}
