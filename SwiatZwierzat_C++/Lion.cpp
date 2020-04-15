#pragma once

#include "Mammal.cpp"
#include "Carnivore.cpp"
class Lion: public Mammal, public Carnivore  {  //*dziedziczenie* slowo public oznacza, że dziedziczone elementy (np. zmienne lub funkcje) mają taką widoczność jak w klasie bazowej, oprocz private w bazowej. Zapobiega to powielaniu tych samych cech obiektow. Dzieki temu mozemy
				//mozemy stworzyc oddzielna klase, czyli np Mammal i odziedziczyc po niej zestaw cech które ma kazdy ssak
public:

    Lion() : Mammal(){ //wywolujemy konstruktor klasy, po ktorej dziedziczymy, bo lew tez jest ssakiem
        cout << "Jestem Lwem" << endl;
    }

    void eatMeat() {
        cout << "Jestem miesozerca. Poluje glownie na antylopy i gazele." << endl;
    }

	void presentYourself() {
        cout << "Mam na imie " << getName() << " oraz zyje tu na sawannie juz od " << getAge() << " lat" << endl;
        eatMeat();
    }
};
