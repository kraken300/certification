import java.util.Scanner;

public class TicketBooking{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the current occupancy percentage of the flight : ");
        int occupancy  = sc.nextInt();

        int base_price = 5500;
        double ticket_price;

        if(occupancy >= 0 && occupancy < 50){
            ticket_price = base_price;
        }

        else if(occupancy >= 50 && occupancy < 75){
            ticket_price = (base_price * 0.1) + base_price;
        }

        else if(occupancy >= 75 && occupancy < 90){
            ticket_price = (base_price * 0.2) + base_price;
        }
        
        // else if(occupancy >= 90){
        //     ticket_price = (base_price * 0.3) + base_price;
        // }

        else{
            ticket_price = (base_price * 0.3) + base_price;
        }

        System.out.println("The ticket price is $" + ticket_price);

        sc.close();
    }
}