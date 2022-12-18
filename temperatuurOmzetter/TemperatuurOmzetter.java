package temperatuurOmzetter;

public class TemperatuurOmzetter {
    public double celsiusNaarFarhenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
    //Cx = (Fx – 32) / 1,8
    public double farhenheitNaarCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

}
