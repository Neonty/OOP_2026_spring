package Lab1;

public class Temperature{
    private double value;
    private char scale;

    public Temperature(){
        this.value = 0.0;
        this.scale = 'C';
    }

    public Temperature(double value){
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale){
        if (scale != 'C' && scale != 'F'){
            throw new IllegalArgumentException("Incrrect scale");
        }

        this.value = 0.0;
        this.scale = scale;
    }

    public Temperature(double value, char scale){
        if (scale != 'C' && scale != 'F'){
            throw new IllegalArgumentException("Incrrect scale");
        }

        this.value = value;
        this.scale = scale;
    }

    public double getCelsius(){
        if (scale == 'C'){
            return value;
        }

        return 5 * (value - 32) / 9;
    }

    public double getFahrenheit(){
        if (scale == 'F'){
            return value;
        }

        return (9 * (value / 5)) + 32;
    }

    public void setValue(double value){
        this.value = value;
    }

    public void setScale(char scale){
        if (scale != 'C' && scale != 'F'){
            throw new IllegalArgumentException("Incrrect scale");
        }

        this.scale = scale;
    }

    public void setAll(double value, char scale){
        if (scale != 'C' && scale != 'F'){
            throw new IllegalArgumentException("Incrrect scale");
        }

        this.value = value;
        this.scale = scale;
    }

    public char getScale(){
        return scale;
    }
}