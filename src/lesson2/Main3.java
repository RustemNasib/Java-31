package lesson2;

public class Main3 {
    public static void main(String[] args) {
        int mark = 4;
       switch (mark){
            case 5:
                System.out.println("otlichno");
                break;
            case 4:
                System.out.println("Horosho");
                break;
            case 3:
                System.out.println("Ne ochen");
                break;
            case 2:
                System.out.println("Ploho");
                break;
            default:
                System.out.println("Eto ne ocenka");
        }
    }
}
