package com.example.demo;
/* Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
        Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
        Создать массив из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).
        1.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
        не было человека весом 3 кг и ростом 180 итд.*/
public class Person {
    String name;
    String surname;
    int age;
    int weight;
    int height;
    //Class constructor
    public Person(String name, String surname, int age, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    //To string to have the view that human can read
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        //Array with Male names
        String[] MaleNames = {"Ivan", "John", "Carl", "Kolya", "Bob"};
        //Array with surnames
        String[] Surnames = {"Jonson", "Berger", "Kotovich", "Sobakevich", "Korovech"};
        //Array with Female names
        String[] FemaleNames = {"Anna", "Alina", "Maryna", "Phiona", "Nina"};
        //Array where person objects will be stored
        String[] PeopleContainer = new String [100];

        for (int c = 0; c < PeopleContainer.length; c++) {
            //Calling SexRandom() method from PersonRandomizer class to randomize sex (0-1)
            int sexRandom = PersonRandomizer.SexRandom();
            // if 0 - Male
            if (sexRandom == 0) {
                //Choosing random name from MaleNames array
                String MaleName = MaleNames[(int) (Math.random() * 4)];
                //Choosing random Surname from Surnames array
                String MaleSurname = Surnames[(int) (Math.random() * 4)];
                //Calling method from PersonRandomizer class to randomize age
                int ages = PersonRandomizer.AgesRandom();
                //Calling method from PersonRandomizer class to randomize weight
                int weights = PersonRandomizer.MaleWeightsRandom();
                //Calling method from PersonRandomizer class to randomize height
                int heights = PersonRandomizer.MaleHeightsRandom();
                //object creation with parameters above
                Person person = new Person(MaleName, MaleSurname, ages, weights, heights);
                //Putting created objects into PeopleContainer array
                PeopleContainer[c] = String.valueOf(person);
            } else {
                //Choosing random name from FemaleNames array
                String FemaleName = FemaleNames[(int) (Math.random() * 4)];
                //Choosing random Surname from Surnames array
                String FemaleSurname = Surnames[(int) (Math.random() * 4)];
                //Calling method from PersonRandomizer class to randomize age
                int ages = PersonRandomizer.AgesRandom();
                //Calling method from PersonRandomizer class to randomize weight
                int weights = PersonRandomizer.FemaleWeightsRandom();
                //Calling method from PersonRandomizer class to randomize height
                int heights = PersonRandomizer.FemaleHeightsRandom();
                //object creation with parameters above
                Person person = new Person(FemaleName, FemaleSurname, ages, weights, heights);
                //Putting created objects into PeopleContainer array
                PeopleContainer[c] = String.valueOf(person);
            }
        }
        //Calling arrayDisplay() method to display array
        arrayDisplay(PeopleContainer);
    }
    //method to display array
    public static void arrayDisplay (String[] PeopleContainer) {
        for (String s : PeopleContainer) {
            System.out.println(s);
        }
    }
}