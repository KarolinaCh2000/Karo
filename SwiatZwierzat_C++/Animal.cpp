#pragma once
#include <iostream>
using namespace std;
class Animal {
    std::string name;
    int age = 0; //*hermetyzacja* tzw “ukrycie” implementacji, czyli wewnêtrzne zachowanie. Dostep do pol private danej klasy
                    //bedzie mozna miec jedynie za posrednictwem tzw getterow i setterow. Nie mozna sie bezposrednio do tych pol odwolac
                    //poza klasa. Pozwala to na unikniêcie wielu potencjalnych b³êdów i u³atwia pisanie du¿ych programów
public:
    Animal(){
        cout << "Jestem zwierzeciem," << endl;
    }

    void setName(std::string name_) {
        name = name_;
    }

    std::string getName(){
        return name;
    }

    void growOld(int age_) {
        age += age_;
    }

    int getAge(){
        return age;
    }

    virtual void presentYourself() = 0; //slowo virtual wskazuje na to ze metoda jest abstrakcyjna. Uznajac metode za abstrakcyjna uznajemy, ze cialo tej metody musi byc stworzone w klasie
		//dziedziczacej po tej klasie, lecz tutaj jedynie stwierdzamy, ze taka metoda ma powstaæ.
};
