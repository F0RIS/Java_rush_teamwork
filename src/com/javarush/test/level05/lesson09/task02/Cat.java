package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    //Напишите тут ваш код
    String name, addr;
    int age, weight, color;

    boolean man;

    public Cat(String s){
        name = s;
    }



    public Cat(String s, int _age, int _weight){
        name = s;
        age = _age;
        weight = _weight;
    }

    public Cat(String s, int _age){
        name = s;
        age = _age;
        weight = 5;
    }

    public Cat(int _weight, int _color){
        name = null;
        age = 1;
        weight = _weight;
        color = _color;
        addr = null;

    }

    public Cat(int _weight, int _color, String _addr){
        name = null;
        age = 1;

        weight = _weight;
        color = _color;
        addr = _addr;

    }
}
