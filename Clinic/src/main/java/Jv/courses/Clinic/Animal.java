package Jv.courses.Clinic;

/**
 * Created by �������� on 26.11.2015.
 * ���� Animal ����������� ��������� �� ����������� Pet
 */
public class Animal implements Pet {
    public String sound;
    /**
     *
     */
    public String name;

    /**
     *
     * @param name
     */
    public Animal(String name){
        this.name = name;
    }

    /**
     *
     */
    public void makeSound(){}

    /**
     *
     * @return
     */
    public String  getName(){
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

}

/**
 * ��������� Pet ��������� ����������� ������ ��� Animal
 */
interface Pet{
    void makeSound();
    String getName();
    void setName(String name);
}
