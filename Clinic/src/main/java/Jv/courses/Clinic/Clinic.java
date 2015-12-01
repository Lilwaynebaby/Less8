package Jv.courses.Clinic;
/**
 * Created by �������� on 26.11.2015.
 * ����� ����������� �������
 */
public class Clinic {
    public Client[] clients;
    /**
     * @param numClients �������� �� ���������� ��������� � �������
     */
    public int numClients = 0;

    /**
     * @param inList �������� ���� �� ������� � �������
     */
    boolean inList = false;
    private int size = 5;

    /**
     * ����������� �������
     */
    public Clinic(){
        this.clients = new Client[this.size];
    }

    /**
     * ����� ���������� ������� � �������
     * @params  clientName - ��� ������� petName - ��� ������� petKind - ��� ���������
     */
    public void addClient(String clientName ,String petName, String petKind) throws UserException{
        if(numClients == this.size)
            throw new UserException("Clinic full");
        else {
            switch (petKind) {
                case "dog":
                    this.clients[numClients] = new Client(clientName, new Dog(new Animal(petName)));
                    break;
                case "cat":
                    this.clients[numClients] = new Client(clientName, new Cat(new Animal(petName)));
                    break;
                default:
                    throw new UserException("This clinic does not accept such clients");

            }
            numClients++;
        }
    }

    /**
     * ����� �������� ������� �� �������
     * @param listPosition -  ������� �� ������� ����� ������� �������
     */
    public void deletePatient(int listPosition){
        this.clients[listPosition] = null;
        for(int i=listPosition; i<numClients;i++){
            if(i==numClients-1)
                clients[i] = null;
            else
                clients[i] = clients[i+1];
        }
        numClients--;

    }

    /**
     * ����� ��� ��������� ����� ��������� ��� ��������� � �������
     * @param kindRename - ��� ��������� - ��������� ��� ������� 1 - ������ 2 - �������
     * @param name - ���� ������ �����
     * @param listPosition - ������ �� ������� ����� �������� ��'�
     */
    public void rename(String kindRename ,String name, int listPosition){
        switch (kindRename){
            case "1":
                if(name.equals(this.clients[listPosition].getName()))
                    System.out.println("This name used");
                else {
                    this.clients[listPosition].setName(name);
                    System.out.println("done!");
                }
                break;
            case "2":
                if(name.equals(this.clients[listPosition].getNamePet()))
                    System.out.println("This name used");
                else{
                    this.clients[listPosition].setNamePet(name);
                    System.out.println("done");
                }
                break;
            case "3":
                System.out.println("Back to menu");

        }
    }

    /**
     * ����� ��� ������ � ������ �������
     * @param name - ��� ��� ������
     * @param kindSearch - ��� ������ - �� ����� ��������� ��� ��������� 1 - ������ 2 - �������
     */
    public void search(String name , String kindSearch) throws UserException{
        switch(kindSearch){
            case "1":
                for(int i=0;i<numClients;i++){
                    if(name.equals(this.clients[i].id)){
                        inList = true;
                        break;
                    }
                }
                if(inList)
                    System.out.println("owner in the List");
                else
                    throw new UserException("owner not listed");
                break;
            case "2":
                for(int i=0;i<numClients;i++){
                    if(name.equals(this.clients[i].getNamePet())){
                        inList = true;
                        break;
                    }
                }
                if(inList){
                    System.out.println("animal in the List");
                }
                else{
                    throw new UserException("animals not listed");
                }
                break;
            case "3":
                inList =false;
                break;
        }
    }

    /**
     * ����� ��� ����������� ������ ��������� �������
     */
    public void show() throws UserException{
        System.out.println("which client you want to work?");
        if(numClients==0)
            throw  new UserException("List empty");
        else {
            for (int i = 0; i < numClients; i++) {
                System.out.print(i);
                System.out.print("  " + clients[i].getName());
                System.out.println("  " + clients[i].getNamePet());
            }
        }

    }

    /**
     * ����������� ��������� ����
     */
    public void forInput(){
        System.out.println("you want to do?");
        System.out.println("1 - input new patient");
        System.out.println("2 - rename patient name or name Pet");
        System.out.println("3 - search for patients name or name Pet");
        System.out.println("4 - delete patient from clinic");
        System.out.println("5 - show clinic List");
        System.out.println("6 - exit");
}

    /**
     *  ����������� ������� ��������� ����� ��������� ��� ��� ���������
     */
    public void forRename(){
        System.out.println("1 - rename name owner");
        System.out.println("2 - rename name Pet");
        System.out.println("3 - back to menu");
    }

    /**
     * ����������� ������� ����� �� ����� ������� ��� �� ���������
     */
    public void forSearch(){
        System.out.println("1 - search for name owner");
        System.out.println("2 - search for name Pet");
        System.out.println("3 - back to menu");
    }

}
