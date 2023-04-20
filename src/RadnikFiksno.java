public class RadnikFiksno extends Radnik{

    // Definisanje polja
    private int fiksno;
    public RadnikFiksno(String ime, String prezime, String jmbg, String ziroRacun, double plata, int fiksno) {
        super(ime, prezime, jmbg, ziroRacun, plata);
        this.fiksno = fiksno;
    }

    public void isplatiPlatu3(){
        super.isplatiPlatu();
        double iznosPlate = fiksno;
        System.out.println("Radnik fiksno ima : " + fiksno);
        System.out.println("Iznos plate : " + iznosPlate + "RSD");
    }
}
