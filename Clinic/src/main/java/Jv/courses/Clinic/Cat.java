package Jv.courses.Clinic;

/**
 * Created by Владимир on 26.11.2015.
 * Клас Кот реализирует питомца кота
 */
public class Cat implements Pet {

    /**
     * Обьект класа animal
     */
        public Animal animal;

    /**
     * Конструктор Cat
     * @param animal
     */
        public Cat( Animal animal){
            this.animal = animal;
        }

    /**
     * Метод позволяет животному издавать звуки
     */
        public void makeSound(){
            animal.sound ="Cat";
            System.out.println(animal.sound);
        }

    /**
     *
     * @return animal.getName - возвращает имя обьекта animal
     */
        public String getName(){
            return this.animal.getName();
        }

    /**
     *
     * @param name - устанавливает имя животному
     */
        public void setName(String name){
            this.animal.setName(name);
        }
}
