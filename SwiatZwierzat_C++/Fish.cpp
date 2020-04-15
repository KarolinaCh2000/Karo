#pragma once
#include "Animal.cpp"
class Fish : public Animal{ //*dziedziczenie* slowo public oznacza, że dziedziczone elementy (np. zmienne lub funkcje) mają taką widoczność jak w klasie bazowej, oprocz private w bazowej. Zapobiega to powielaniu tych samych cech obiektow. Dzieki temu mozemy
				//mozemy stworzyc oddzielna klase, czyli Animal i odziedziczyc po niej zestaw cech które ma kazde zwierze

public:
    Fish() : Animal(){ //wywolujemy konstruktor klasy, po ktorej dziedziczymy, bo ryba tez jest zwierzeciem
        cout << "Jestem ryba" << endl;
    }

    virtual void swim() = 0;  //slowo virtual wskazuje na to ze metoda jest abstrakcyjna. Uznajac metode za abstrakcyjna uznajemy, ze cialo tej metody musi byc stworzone w klasie
		//dziedziczacej po tej klasie, lecz tutaj jedynie stwierdzamy, ze taka metoda ma powstac.

};
