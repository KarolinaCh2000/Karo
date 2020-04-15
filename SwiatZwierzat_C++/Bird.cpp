#pragma once
#include "Animal.cpp"

class Bird : public Animal{ //*dziedziczenie* slowo public oznacza, że dziedziczone elementy (np. zmienne lub funkcje) mają taką widoczność jak w klasie bazowej, oprocz private w bazowej. Zapobiega to powielaniu tych samych cech obiektow. Dzieki temu mozemy
                                //mo¿emy stworzyc oddzielna klase, czyli Animal i odziedziczyc po niej zestaw cech które ma ka¿de zwierzê
public:
    Bird() : Animal(){ //wywolujemy konstruktor klasy, po ktorej dziedziczymy, bo ptak tez jest zwierzeciem
        cout << "Jestem ptakiem" << endl;
    }

    virtual void fly() = 0;  //slowo virtual wskazuje na to ze metoda jest abstrakcyjna. Uznajac metode za abstrakcyjna uznajemy, ze cialo tej metody musi byc stworzone w klasie
		//dziedziczacej po tej klasie, lecz tutaj jedynie stwierdzamy, ze taka metoda ma powstac.
};
