import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

do {

    try{
        System.out.println("==Menu Program==");
        System.out.println("1. Square");
        System.out.println("1. Circle");
        System.out.println("1. Trapezoid");
        Scanner input = new Scanner(System.in);

        Calculation machine = new Calculation();
        int menu, length, side,upper_side, height,radius,;

        System.out.println("Select menu : ");
        menu = input.nextInt();

    switch (){

    }

        case 1:
        System.out.println("Enter the lenght of the side of the square : ");
        length = input.nextInt();
            break;

        case 2:
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextInt();

            break;
            
        case 3:
        System.out.println("Enter the lenght of the side of the square : ");
        side = input.nextInt();
        System.out.println("Enter the upper side   : ");
        upper_side = input.nextInt();
        System.out.println("Enter the height of the trapezoid : ");
        height = input.nextInt();



            break;    
    

        }


         }    

        } catch (Exception e) {
            System.out.println("Data type yang dimasukkan harus Integer");
        }

    }
}