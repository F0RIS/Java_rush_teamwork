package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    String name, addr;
    int age, weight, color;

    boolean man;

    public void initialize(String s){
        name = s;
    }



    public void initialize(String s, int _age, int _weight){
        name = s;
        age = _age;
        weight = _weight;
    }

    public void initialize(String s, int _age){
        name = s;
        age = _age;
        weight = 5;
    }

    public void initialize(int _weight, int _color){
        name = null;
        age = 1;
        weight = _weight;
        color = _color;
        addr = null;

    }

    public void initialize(int _weight, int _color, String _addr){
        name = null;
        age = 1;

        weight = _weight;
        color = _color;
        addr = _addr;

    }
}
