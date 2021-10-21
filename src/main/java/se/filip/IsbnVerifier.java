package se.filip;

public class IsbnVerifier {

    public void run(){
        System.out.println("skriv isbn kod. x-xxx-xxxxx-x");
        String code = System.console().readLine();
        if (isValidFormat(code)) {
            if (calculateCheckTest(code)) {
                System.out.println("true");
            }
            else{
                System.out.println("false :/");
            }
        }
        else{
            System.out.println("false sadge");
        }

    }
    public boolean calculateCheckTest(String isbn){

        int total = 0;
        int count = 10;
        int num = 0;
        for (int i = 0; i < isbn.length(); i++) {
            char tecken = isbn.charAt(i);
            if (isbn.charAt(i) == '-') {
                
            }
            else{
                if (tecken == 'x' || tecken == 'X') {
                     num = 10;
                }
                else{
                String numberInString = String.valueOf(tecken);
                 num = Integer.parseInt(numberInString);
                }
                total += num * count;
                count--;
            }
        }
        if (total % 11==0) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isValidFormat(String isbn){
        if (isbn.length() !=13) {
            return false;
        }
        if (isbn.charAt(1) == '-'&& isbn.charAt(5) == '-'&& isbn.charAt(11)=='-') {
            for (int i = 0; i < 13; i++) {
                char tecken = isbn.charAt(i);
                if (validChars(tecken)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean validChars(char tecken){
        switch (tecken) {
            case '0':
                return true;
            case '1':
                return true;
            case '2':
                return true;
            case '3':
                return true;
            case '4':
                return true;
            case '5':
                return true;
            case '6':
                return true;
            case '7':
                return true;
            case '8':
                return true;
            case '9':
                return true;
            case '-':
                return true;
            case 'x','X':
                return true;
            default:
                return false;
        }
    }
}
