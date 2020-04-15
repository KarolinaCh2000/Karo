#pragma once
#include "Fish.cpp"
class Pike : public Fish{ //*dziedziczenie* slowo public oznacza, że dziedziczone elementy (np. zmienne lub funkcje) mają taką widoczność jak w klasie bazowej, oprocz private w bazowej. Zapobiega to powielaniu tych samych cech obiektow. Dzieki temu mozemy
				//mozemy stworzyc oddzielna klase, czyli np Fish i odziedziczyc po niej zestaw cech które ma kazda ryba
public:
    Pike() : Fish(){ //wywolujemy konstruktor klasy, po ktorej dziedziczymy, bo szczupak tez jest ryba
        cout << "Jestem szczupakiem" << endl;
    }

    void swim() {
        cout << "Potrafie plywac" << endl;
    }

    void presentYourself() {
        cout << "Mam na imie " << getName() << " oraz zyje tu w wodzie juz od " << getAge() << " lat" << endl;
    }
};
