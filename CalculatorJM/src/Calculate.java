import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String virajenye = s.nextLine();
        Scanner text = new Scanner(Operation.rimToArab(virajenye));

        Chislo chislo1 = new Chislo();
        Chislo chislo2 = new Chislo();
        Znak znak1 = new Znak();

        try{

        int result = 0;
        chislo1.setNom(text.nextInt());
        znak1.setZnak(text.next());
        chislo2.setNom(text.nextInt());
        Operation.razmer(text.hasNext());

        System.out.println(Operation.arabToRim(virajenye,Operation.wichislenie(chislo1.getNom(),znak1.getZnak(),chislo2.getNom(),result)));
        }catch(InputMismatchException e){
            System.out.println("Калькулятор умеет работать только с целыми числами.");
        }
    }
}