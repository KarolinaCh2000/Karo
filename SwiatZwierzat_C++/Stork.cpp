#pragma once
#include "Bird.cpp"

class Stork : public Bird { //*dziedziczenie* slowo public oznacza, że dziedziczone elementy (np. zmienne lub funkcje) mają taką widoczność jak w klasie bazowej, oprocz private w bazowej. Zapobiega to powielaniu tych samych cech obiektow. Dzieki temu mozemy
				//mozemy stworzyc oddzielna klase, czyli np Bird i odziedziczyc po niej zestaw cech które ma kazdy ptak
public:
    Stork() : Bird() { //wywolujemy konstruktor klasy, po ktorej dziedziczymy, bo bocian tez jest ptakiem
        cout << "Jestem bocianem" << endl;
    }
    void fly(){
        cout << "Potrafie latac" << endl;
    }

    void presentYourself() {
        cout << "Mam na imie " << getName() << " oraz zyje juz od " << getAge() << " lat" << endl;
    }
};
