#pragma once

class Herbivore { //swego rodzaju interfejs, wszystkie metody beda abstrakcyjne, nie trzeba pisac
				//w klasach dziedziczacych zostanie zapisane cialo metody
public:
    virtual void eatPlant() = 0;
};
