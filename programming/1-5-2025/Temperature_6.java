public class Temperature_6{
    public static void main(String[] args){
        double farhenheit = 108.0;
        double celcius = (farhenheit - 32) * 5/9;

        System.out.println("Celcius : "+celcius);

        if(celcius >= 30 && celcius <= 40){
            System.out.println("Temperature is within the range");
        }
        else{
            System.out.println("Temperature is not within the range");
        }
    }
}