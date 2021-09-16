import java.util.Scanner;

public class Operation {
    public static int wichislenie(int a,String z,int b,int c){
        switch (z) {
            case "+" -> c=(a + b);
            case "-" -> c=(a - b);
            case "/", ":" -> c=(a / b);
            case "*" -> c=(a * b);
            default -> {
                System.out.println("Ошибка: некорректный знак.");
                System. exit(0);
            }
        }
        return c;
    }
    public static String rimToArab(String a1){

        Scanner text = new Scanner(a1);
        String [] arab = {"10","1","2","3","4","5","6","7","8","9"};
        String [] rome = {"X","I","II","III","IV","V","VI","VII","VIII","IX"};

        int b1=0;
        String a =text.next();
        String z =text.next();
        String b =text.next();
        String a0 ="";
        String b0 ="";

        for (int i=0; i< arab.length;i++){
            if (a.equals(rome[i])){
                a0 = arab[i];
                b1++;
            }
            if (b.equals(rome[i])){
                b0 = arab[i];
                b1++;
            }
        }
        if(b1==1){
            System.out.println("Ошибка: Проверьте формат ввода.");
            System. exit(0);
        }
        if (b1==2){
            a1=(a0+" "+z+" "+b0);
        }
        return a1;
    }
    public static String arabToRim(String a1,int b2){

        Scanner text = new Scanner(a1);
        String [] rome2 = {"-","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};

        String a =text.next();
        String a0 =""+b2;

        for (String s : rome2) {

            if (a.equals(s)) {
                if (b2<1){
                    System.out.println("Ошибка: Результатом работы калькулятора с римскими числами могут быть только положительные числа.");
                    System. exit(0);
                }
                a0 = rome2[b2];
                break;
            }
        }
        return a0;
    }
    public static void razmer(boolean a1){
        if (a1){
            System.out.println("Ошибка: Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *).");
            System. exit(0);
        }
    }
}
