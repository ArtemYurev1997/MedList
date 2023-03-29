package by.pvt.mediclist;

public class Patient {

    private String id;
    private String name;
    private  String surname;
    private String data;
    private  String address;
    private int numberCard;
    private String diagnose;

    public Patient() {

    }

    public Patient(String id, String name, String surname, String data, String address, int numberCard, String diagnose) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.data = data;
        this.address = address;
        this.numberCard = numberCard;
        this.diagnose = diagnose;
    }

    public String getName() {
        return name;
    }
    public void setName(String name1) {
        name = name1;
    }

    public String  getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberCard() {
        return numberCard;
    }
    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public String getDiagnose() {
        return diagnose;
    }
    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }


    public String information() {
        return "id: " + id + ", " + "name: " + name + ", " +
                "surname: " + surname + ", " + "data: " + data +
                ", " + "address: " + address + ", " + "numberCard: " + numberCard + ", " + "diagnose: " + diagnose;

    }
}
