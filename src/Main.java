import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*   Задание 5
        Напишите метод, который изменяет значение переменной типа int.
        Объявите метод changeValue, который принимает параметр типа int под названием value.
        Внутри метода с помощью оператора присваивания запишите в параметр значение 22.
        В методе main объявите переменную типа int под названием value и запишите туда значение 33.
        В следующей строке вызовите метод changeValue и передайте в него эту переменную
         */

        int value = 33;
        value = changeValue(value);



        /*   Задание 6
        Напишите метод, который изменяет значение переменной типа Integer.
        Объявите метод changeValue, который принимает параметр типа Integer под названием value.
        Внутри метода с помощью оператора присваивания запишите в параметр значение 22.
        В методе main объявите переменную типа Integer под названием value и запишите туда значение 33.
        В следующей строке вызовите метод changeValue и передайте в него эту переменную.
         */

        Integer value1 = 33;
        value1 = changeValue(value1);



        /*  Задание 7
        Напишите метод, который изменяет значение массива типа Integer.
        Объявите метод changeValue, который принимает параметр массива типа Integer под названием value.
        Внутри метода с помощью оператора присваивания запишите в параметр новый массив {1,2}.
        В методе main объявите массив типа Integer под названием value и запишите туда значение {3,4}.
        В следующей строке вызовите метод changeValue и передайте в него этот массив.
         */

        Integer[] value2 = {3, 4};
        for (int i = 0; i < value2.length; i++) {
            System.out.println(value2[i]);
        }
        value2 = changeValue1();


        /*  Задание 8
        Напишите метод, который изменяет значение массива типа Integer.
        Объявите метод changeValue, который принимает параметр массива типа Integer под названием value.
        Внутри метода с помощью оператора присваивания запишите в первую ячейку параметра цифру 99.
        В методе main объявите массив типа Integer под названием value и запишите туда значение {3,4}.
        В следующей строке вызовите метод changeValue и передайте в него этот массив.
         */

        Integer[] value3 = {3, 4};
        for (int i = 0; i < value3.length; i++) {
            System.out.println(value3[i]);
        }
        value3 = changeValue2();


        /*  Задание 9
        Объявите объект класса person с полями name и surname. Переопределите у него метод toString так,
        чтобы он возвращал строку из name и surname. Объявите метод changePerson, который принимает параметр
        типа Person под названием person. Внутри метода с помощью оператора присваивания запишите в параметр новый
        объект типа Person. Присвойте строке name значение Ilya, строке surname — значение Lagutenko.
        В методе main объявите переменную типа Person под названием person и запишите новый объект типа Person.
        Присвойте строке name значение Lyapis, строке surname значение — Trubetskoy.
        В следующей строке вызовите метод changePerson и передайте в него эту переменную.
         */
        Person person = new Person();
        person.name = "Lyapis";
        person.surname = "Trubetskoy";
        System.out.println(person.toString());
        Person person1 = changePerson(person);
        System.out.println(person1);




        /*  Задание 10
        Объявите объект класса person с полями name и surname. Переопределите у него метод toString так,
        чтобы он возвращал строку из name и surname. Объявите метод changePerson, который принимает параметр типа Person
        под названием person. Внутри метода запишите в поле name строку “Ilya”, а в строку surname — “Lagutenko”.
        В методе main объявите переменную типа Person под названием person и запишите новый объект типа Person.
        Присвойте значение имени Lyapis, фамилии — Trubetskoy.
        В следующей строке вызовите метод changePerson и передайте в него эту переменную
         */

        Person person2 = new Person();
        person.name = "Lyapis";
        person.surname = "Trubetskoy";
        person = changePerson(person);
        System.out.println(person);
    }

    public static int changeValue(int value) {
        value = 22;
        System.out.println(value);
        return value;
    }

    public static Integer changeValue(Integer value1) {
        value1 = 22;
        System.out.println(value1);
        return value1;
    }

    public static Integer[] changeValue1() {
        Integer[] value = {1, 2};
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
        return value;
    }

    public static Integer[] changeValue2() {
        Integer[] value = {99};
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
        return value;
    }

    public static Person changePerson(Person person) {
        person = new Person();
        person.name = "Ilya";
        person.surname = "Lagutenko";
        return person;
    }





}