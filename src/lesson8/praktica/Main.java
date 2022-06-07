package lesson8.praktica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // вызов конструктора. Это метод, который является тем методом,
        // который рождает сам объект и вызывается только после слова new
        Student Vasya = new Student("Иванов", "Вася", "Москва, Шлюзовая", "89873455231");
        Student Petya = new Student();

        Otlichnik Sveta = new Otlichnik();
        Sveta.setName("Света");
        Sveta.setAdress("Нижний новгород");
        Sveta.setPhoneNumber("82625567882");
        Sveta.setSurname("Петрова");

        ArrayList<Student> students = new ArrayList<>();
        students.add(Vasya);
        students.add(Sveta);
        students.add(Petya);

        // for each (когда нужно пройти по всем объектам внутри одного
        // хранилища)
        for (Student st:students){
        st.doDomashka(); // полиморфизм (3-я основа ООП) - свойство джавы
            // работать с разными типами как с одним и тем же, но в тоже время
            // программа действует, как с разными типами


    }
    }


}
