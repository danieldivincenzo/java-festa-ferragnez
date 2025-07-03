import java.util.Scanner;
public class CheckGuest {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.print("Inserisci il tuo nome e cognome: ");
        String nomeUtente = scan.nextLine();
        boolean nomePresente = false;

        // Caso col ciclo for
        for (int i = 0; i < invitati.length; i++) {
            
            if (invitati[i].equalsIgnoreCase(nomeUtente)) {
                nomePresente = true;
                break;
            }
        }

        if(nomePresente){
            System.out.println("Sei in lista, benvenuto!");
        }else{
            System.out.println("Non sei in lista, tornatene a casa!");
        }


        // Caso col ciclo while
        int i = 0;
        while(i < invitati.length){
            if (invitati[i].equalsIgnoreCase(nomeUtente)) {
                nomePresente = true;
                break;
            }
            i++;
        }
        if(nomePresente){
            System.out.println("Sei in lista, benvenuto!");
        }else{
            System.out.println("Non sei in lista, tornatene a casa!");
        }

    }
}
