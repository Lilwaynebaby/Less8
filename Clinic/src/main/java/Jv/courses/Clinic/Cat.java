package Jv.courses.Clinic;

/**
 * Created by �������� on 26.11.2015.
 * ���� ��� ����������� ������� ����
 */
public class Cat implements Pet {

    /**
     * ������ ����� animal
     */
        public Animal animal;

    /**
     * ����������� Cat
     * @param animal
     */
        public Cat( Animal animal){
            this.animal = animal;
        }

    /**
     * ����� ��������� ��������� �������� �����
     */
        public void makeSound(){
            animal.sound ="Cat";
            System.out.println(animal.sound);
        }

    /**
     *
     * @return animal.getName - ���������� ��� ������� animal
     */
        public String getName(){
            return this.animal.getName();
        }

    /**
     *
     * @param name - ������������� ��� ���������
     */
        public void setName(String name){
            this.animal.setName(name);
        }
}
