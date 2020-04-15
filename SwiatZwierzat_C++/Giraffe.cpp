#pragma once
#include "Mammal.cpp"
#include "Herbivore.cpp"

class Giraffe : public Mammal, public Herbivore{  //*dziedziczenie* slowo public oznacza, że dziedziczone elementy (np. zmienne lub funkcje) mają taką widoczność jak w klasie bazowej, oprocz private w bazowej. Zapobiega to powielaniu tych samych cech obiektow. Dzieki temu mozemy
				//mozemy stworzyc oddzielna klase, czyli np Mammal i odziedziczyc po niej zestaw cech które ma kazdy ssak

public:
    Giraffe() : Mammal() { //wywolujemy konstruktor klasy, po ktorej dziedziczymy, bo zyrafa tez jest ssakiem
		cout << "Jestem zyrafa" << endl;
    }

    void eatPlant() {
        cout << "Jestem roslinozerca, zywie sie liscmi drzew" << endl;
    }

    void presentYourself() {
        cout << "Mam na imie " << getName() << " oraz zyje tu na sawannie juz od " << getAge() << " lat" << endl;
        eatPlant();
    }
};
