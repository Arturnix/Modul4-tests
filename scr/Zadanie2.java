public class Zadanie2 {

    public static boolean hasGoodLength(String password) {

        if(password.length() < 12) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean hasNoWhiteSpaces(String password) {
        if((password.contains("\s")) || (password.contains("\n")) || (password.contains("\t"))) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean hasNoRepetitions(String password) {

        //Aby nie przejsc do petli for kiedy metoda na sprawdzenie min. dlugosci hasla zostanie wywolana pozniej i nie iterwowac po i = 0 - 1.
        if(password.length() == 1) {
            System.out.println("Nie mozna stwierdzić powtornego wystapienia znakow, jesli haslo ma tylko 1 znak.");
            return true;
        }

        for(int i = 1; i < password.length(); i++) {
            if(password.charAt(i) == password.charAt(i-1)) {
                return false;
            }
        }

        return true;
    }
    public static boolean hasNumbers(String password) {

        if(password.matches(".*\\d.*")) {
            return false;
        }
            return true;
    }

    public static boolean hasSpecialCharacter(String password) {

        if(password.matches(".*[!.@\\-;”(){}\\[\\]?].*")) {
            return false;
        }

        return true;
    }

}
