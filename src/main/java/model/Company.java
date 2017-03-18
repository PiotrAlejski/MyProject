package model;

/**
 * Created by RENT on 2017-03-15.
 */
public class Company {
    private String id;
    private Adress adress;
    private String nip;
    private String regon;
    private String name;

    public Company() {
    }

    public Company(String id, Adress adress, String nip, String regon, String name) {
        this.id = id;
        this.adress = adress;
        this.nip = nip;
        this.regon = regon;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", adress=" + adress +
                ", nip='" + nip + '\'' +
                ", regon='" + regon + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
