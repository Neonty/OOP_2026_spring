package Lab1;

public class Data{
    private double maximum;
    private double sum;
    private int count;
    

    public Data(){
        this.maximum = -Double.MAX_VALUE;
        this.sum = 0;
        this.count = 0;
    }

    public void add(double number){
        this.sum+=number;
        this.maximum = Math.max(this.maximum,number);
        this.count++;
    }

    public double getAverage(){
        if (this.count==0){
            return 0;
        }

        return this.sum/this.count;
    }

    public double getMaximum(){
        if (count==0){
            return 0;
        }

        return this.maximum;
    }
}