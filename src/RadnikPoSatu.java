public class RadnikPoSatu extends Radnik{

    // Definisanje polja
    private int brojSati;

    public RadnikPoSatu(String ime, String prezime, String jmbg, String ziroRacun, double plata,int brojSati) {
        super(ime, prezime, jmbg, ziroRacun, plata);
        this.brojSati = brojSati;
    }
        public void isplatiPlatu1(){
            super.isplatiPlatu();
            double iznosPoSatu = plata / brojSati;
            System.out.println("Iznos po satu je : " + iznosPoSatu);
            System.out.println("Iznos plate : " + plata + "RSD");
        }

    }

