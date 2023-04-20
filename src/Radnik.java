public class Radnik {

        // Definisanje polja
        protected String ime;
        protected String prezime;
        protected String jmbg;
        protected String ziroRacun;
        protected double plata;

        // Definisanje konstruktora
    public Radnik(String ime, String prezime, String jmbg, String ziroRacun, double plata){
            this.ime = ime;
            this.prezime = prezime;
            this.jmbg = jmbg;
            this.ziroRacun = ziroRacun;
            this.plata = plata;
        }

        // Definisanje metode

        public void isplatiPlatu () {
            System.out.println("Radnik:" + ime + " " + prezime);
            System.out.println("JMBG:" + jmbg);
            System.out.println("Ziro racun:" + ziroRacun);
            System.out.println("Plata:" + plata + "RSD");
        }


    }

