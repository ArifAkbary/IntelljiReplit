public class CarClass {

    String Model;
    String color;
    int year;

    public static void main(String[] args) {


        CarClass toyota = new CarClass();

        toyota.Model="Toyota";
        toyota.color="whate";
        toyota.year=2019;

        System.out.println("This car year is "+(toyota.year)+ " and model is "+(toyota.Model)+ "color is "+(toyota.color));


        CarClass bmw=new CarClass();

        bmw.Model="BMW Germany";
        bmw.year=2018;
        bmw.color="Red";

        System.out.println("this car "+(bmw.Model)+ "year is"+(bmw.year)+" and color is "+(bmw.color));

    }






}
