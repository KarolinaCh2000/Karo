
#pragma once
#include "Animal.cpp"
class Mammal : public Animal{ //*dziedziczenie* slowo public oznacza, że dziedziczone elementy (np. zmienne lub funkcje) mają taką widoczność jak w klasie bazowej, oprocz private w bazowej. Zapobiega to powielaniu tych samych cech obiektow. Dzieki temu mozemy
                                //mo¿emy stworzyc oddzielna klase, czyli Animal i odziedziczyc po niej zestaw cech które ma ka¿de zwierzê
public:
    Mammal() : Animal(){ //wywolujemy konstruktor klasy, po ktorej dziedziczymy, bo ssak tez jest zwierzeciem
        cout << "Jestem ssakiem," << endl;
    }
};
