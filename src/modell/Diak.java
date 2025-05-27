package modell;

public class Diak {

    private int id;
    private String targy;
    private int jegy;
    private boolean bukas;

    public Diak(String sor) {
        String[] adatok = sor.split(";");
        id = Integer.parseInt(adatok[0]);
        targy = adatok[1];
        jegy = Integer.parseInt(adatok[2]);
        bukas = Boolean.parseBoolean(adatok[3]);
    }

    public Diak(int id, String targy, int jegy, boolean bukas) {
        this.id = id;
        this.targy = targy;
        this.jegy = jegy;
        this.bukas = bukas;
    }

    public int getId() {
        return id;
    }

    public String getTargy() {
        return targy;
    }

    public int getJegy() {
        return jegy;
    }

    public boolean isBukas() {
        return bukas;
    }

    @Override
    public String toString() {
        return "Diak{" + "id=" + id + ", targy=" + targy + ", jegy=" + jegy + ", bukas=" + bukas + '}';
    }

}
