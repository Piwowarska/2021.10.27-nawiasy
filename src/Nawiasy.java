public class Nawiasy {

    public static void main(String[] args) {

        String string = "((Ala)) ((ma((((()k))))))((o ))ta(kot) ma (mysz)";
        char[] znak = string.toCharArray();
        int licznik = 0;

        for (char znaki : znak) {
            if ((znaki == '(')) {
                licznik++;
            } else if ((znaki == ')')) {
                licznik--;
            }
            if (licznik < 0) {
                System.out.println("Nieprawidłowe zmknięcie nawiasów");
                return;
            }
        }
        if (licznik == 0) {
            System.out.println("Poprawna ilość nawiasów");
        }
    }
}









