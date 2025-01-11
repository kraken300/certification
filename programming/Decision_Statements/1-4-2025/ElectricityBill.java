public class ElectricityBill{
    public static void main(String[] args){
        int units = 164;
        int rate = 7;
        int base_price = 220;
        double bill;

        if(units >= 0 && units <= 100){
            bill = base_price;
        }

        else if(units >=101 && units <= 200){
            bill = (rate * units) * 0.5 + base_price;
        }

        else if(units >= 201 && units <= 400){
            bill = (rate * units) + base_price;
        }

        // else if(units >= 401){
        //     bill = (rate * units) + (0.50 * units) + base_price;
        // }

        else{
            bill = (rate * units) + (0.50 * units) + base_price;
        }

        System.out.println("The bill is "+bill);
    }
}