#include "Animal.cpp"
#include "Carnivore.cpp"
#include "Mammal.cpp"
#include "Lion.cpp"
#include "Herbivore.cpp"
#include "Fish.cpp"
#include "Bird.cpp"
#include "Giraffe.cpp"
#include "Pike.cpp"
#include "Stork.cpp"
#include <iostream>

using namespace std;

int main()
{
		Lion lew;
        lew.setName("Simba");
        lew.growOld(12);
        lew.presentYourself();
		cout << endl;

        Giraffe zyrafa;
        zyrafa.setName("Clara");
        zyrafa.growOld(11);
        zyrafa.presentYourself();
		cout << endl;

        Stork bocian;
        bocian.setName("Kajtek");
        bocian.growOld(6);
        bocian.presentYourself();
        bocian.fly();
		cout << endl;

        Pike szczupak;
        szczupak.setName("Borys");
        szczupak.growOld(4);
        szczupak.presentYourself();
        szczupak.swim();
		cout << endl;

        //*Polimorfizm*, czyli wielopostaciowosc. Dzieje siê tak dlatego, ¿e obiekty animal, zyrafa i bocian s¹ jednoczeœnie obiektami klasy Giraffe lub Bocian ale tak¿e obiektami klasy Animal.
        // Inaczej mówi¹c, maj¹ cechy z ka¿dej z tych klas i mo¿na je w naszym programie traktowaæ zarówno jako obiekty typu Giraffe/Stork jak i Animal.
		Animal* animal;
        animal = &zyrafa;
        cout << animal->getName() << endl;
        animal = &bocian;
        cout << animal->getName();

        //Lion* lew1;
        //lew1 = &zyrafa; //tak nie mozemy zrobic, bo obiekt klasy Giraffe nie jest obiektem klasy Lion

		//Mammal gepard; (error) *abstrakcja* dzieki temu, ze klasa Mammal jest abstrakcyjna zapobiegamy tworzeniu
                                        //ssaka, bez okreslenia jakim zwierzeciem jest
        //Animal wiewiorka;  to samo co wyzej, zapobiegamy tworzeniu samego obiektu zwierze, bez konkretow
}
