package Shop;

public class Person {
    protected String ime;
    protected String prezime;
    protected int godine;
    protected double visina;

    public Person(String ime, String prezime, int godine, double visina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.visina = visina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Name is :");
        sb.append(getIme());
        sb.append(" ");
        sb.append("Last name is ");
        sb.append(getPrezime());
        sb.append(" ");
        sb.append(getGodine());
        sb.append(" ");
        return sb.toString();
    }
}
