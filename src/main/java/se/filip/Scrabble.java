package se.filip;

public class Scrabble {
    public void run(){
        while (true) {
            System.out.println("Skriv ett ord! \"x\" för att avsluta");
            String ord = System.console().readLine();
            if (ord.equalsIgnoreCase("x")) {
                break;
            }
            else{
                int points = score(ord);
                System.out.println(ord + " är värt " + points + " poäng!");
            }
        }
    }

    public int score(String ord){
        int score = 0;
        for (int i = 0; i < ord.length(); i++) {
            char tecken = ord.toLowerCase().charAt(i);
            score += scoreCalc(tecken);
        }
        return score;
    }
    public int scoreCalc(char tecken){
        switch (tecken) {
            case 'a','e','i','o','u','l','n','r','s','t':
                return 1;
            case 'd','g':
                return 2;
            case 'b','c','m','p':
                return 3;
            case 'f','h','v','w','y':
                return 4;
            case 'k':
                return 5;
            case 'j','x':
                return 8;
            case 'q','z':
                return 10;
            default:
            return 0;
        }
    }
}
