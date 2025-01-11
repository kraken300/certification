import java.util.Scanner;

public class ShippingCost{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight(pounds) of the package : ");
        double weight = sc.nextDouble();

        System.out.print("Enter the destination zone(A, B or C) of the package : ");
        String destination = sc.next();

        double total_shipping_cost;
        double zone_A_cost = 5.00;
        double zone_B_cost = 7.00;
        double zone_C_cost = 10.00;

        switch(destination){
            
            case "A":
                if(weight >= 0 && weight <= 10){
                    // total_shipping_cost = ((weight * zone_A_cost) - ((weight * zone_A_cost) * 0.1));
                    total_shipping_cost = (weight * zone_A_cost * 0.90);
                }

                else if(weight >= 11 && weight <= 20){
                    // total_shipping_cost = ((weight * zone_A_cost) - ((weight * zone_A_cost) * 0.15));
                    total_shipping_cost = (weight * zone_A_cost * 0.85);
                }

                else{
                    // total_shipping_cost = ((weight * zone_A_cost) - ((weight * zone_A_cost) * 0.20));
                    total_shipping_cost = (weight * zone_A_cost * 0.80);
                }

                System.out.println("(Zone A) Total shipping cost before discount : $"+ (weight * zone_A_cost));
                System.out.println("(Zone A) Total shipping cost after discount : $" + total_shipping_cost);

                break;

            case "B":
                if(weight >= 0 && weight <= 10){
                    // total_shipping_cost = ((weight * zone_B_cost) - ((weight * zone_B_cost) * 0.1));
                    total_shipping_cost = (weight * zone_B_cost * 0.90);
                }

                else if(weight >= 11 && weight <= 20){
                    // total_shipping_cost = ((weight * zone_B_cost) - ((weight * zone_B_cost) * 0.15));
                    total_shipping_cost = (weight * zone_B_cost * 0.85);
                }

                else{
                    // total_shipping_cost = ((weight * zone_B_cost) - ((weight * zone_B_cost) * 0.20));
                    total_shipping_cost = (weight * zone_B_cost * 0.80);
                }

                System.out.println("(Zone B) Total shipping cost before discount : $"+ (weight * zone_B_cost));
                System.out.println("(Zone B) Total shipping cost after discount : $" + total_shipping_cost);

                break;

            case "C":
                if(weight >= 0 && weight <= 10){
                    // total_shipping_cost = ((weight * zone_C_cost) - ((weight * zone_C_cost) * 0.1));
                    total_shipping_cost = (weight * zone_C_cost * 0.90);
                }

                else if(weight >= 11 && weight <= 20){
                    // total_shipping_cost = ((weight * zone_C_cost) - ((weight * zone_C_cost) * 0.15));
                    total_shipping_cost = (weight * zone_C_cost * 0.85);
                }

                else{
                    // total_shipping_cost = ((weight * zone_C_cost) - ((weight * zone_C_cost) * 0.20));
                    total_shipping_cost = (weight * zone_C_cost * 0.80);
                }

                System.out.println("(Zone C) Total shipping cost before discount : $"+ (weight * zone_C_cost));
                System.out.println("(Zone C) Total shipping cost after discount : $" + total_shipping_cost);

                break;

            default:
                System.out.println("Wrong zone code!");
        }

        // System.out.println("Total shipping cost : " + total_shipping_cost);
        sc.close();
    }
}