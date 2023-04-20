public class RadnikPoDanu extends Radnik{

    // Definisanje polja
    private int brojDana;
    public RadnikPoDanu(String ime, String prezime, String jmbg, String ziroRacun, double plata, int brojDana) {
        super(ime, prezime, jmbg, ziroRacun, plata);
        this.brojDana = brojDana;
    }
        public void isplatiPlatu2(){
            super.isplatiPlatu();
            double iznosPoDanu = plata / brojDana;
            System.out.println("Iznos po danu je  : " + iznosPoDanu);
            System.out.println("Iznos plate : " + plata + "RSD");
        }


    }

