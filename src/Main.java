// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Napomena :
        // Podaci su unošeni samo za jednog korisnika, postoji mogućnost da se unese i da se kreiraju različiti korisnici

        Radnik radnik = new Radnik("Marko", " Markovic", "1502997710028","160-216125-49",70000 );
        radnik.isplatiPlatu();

        RadnikPoSatu radnikPoSatu = new RadnikPoSatu("Marko", "Markovic", "1502997710028", "160-216125-49",	70000,184 );
        radnikPoSatu.isplatiPlatu1();

        RadnikPoDanu radnikPoDanu = new RadnikPoDanu("Marko", "Markovic", "1502997710028", "160-216125-49", 70000,24);
        radnikPoDanu.isplatiPlatu2();

        RadnikFiksno radnikFiksno = new RadnikFiksno("Marko", "Markovic", "1502997710028", "160-216125-49", 70000, 70000);
        radnikFiksno.isplatiPlatu3();

        }
    }
