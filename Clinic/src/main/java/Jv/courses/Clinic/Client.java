package Jv.courses.Clinic;

/**
 * Created by �������� on 26.11.2015.
 * ����� ������ ����������� ������� �������
 */
public class Client{
    /**
     *@param id - ��� �������
     */
    public String id;

    /**
     *@param pet  - ������ ���������
     */
    public Pet pet;

    /**
     * ����������� �������
     * @param id - ��������� ��� �������
     * @param pet - ��������� ������ ���������
     */
    public Client(String id ,Pet pet){

        this.pet = pet;
        this.id = id;
    }

    /**
     * ����� set  ������������� ��� �������
     * @param name - ��������� ��� �������
     */
    public void setName(String name){

        this.id = name;
    }

    /**
     * ����� get ���������� ��� �������
     * @return id  - ���������� ��� �������
     */
    public String getName(){

        return id;
    }

    /**
     * ����� ����������� ����� ���������
     */
    public void makeSound(){

        this.pet.makeSound();
    }

    /**
     *  ����� set ������������� ��� �������
     * @param name - ��� �������
     */
    public void setNamePet(String name){

        this.pet.setName(name);
    }

    /**
     * ����� get ���������� ��� ���������
     * @return ���������� ��� �������
     */
    public String getNamePet(){

        return this.pet.getName();
    }

}
