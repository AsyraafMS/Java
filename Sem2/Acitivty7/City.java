public class City{
    
    private String name;
    
    private double [] monthlyRain = new double [12];
    
    //default constructor
    public City(){
        name = null;
        monthlyRain = new double[12];
    }
    
    //normal or parametrize constructor
    public City(String name, double monthlyRain[]){
        this.name = name;
        this.monthlyRain = monthlyRain;
    }

    //accessor method
    public String getName(){
        return name;
    }
    public double [] getMonthlyRain(){
        return monthlyRain;
    }
    
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setMonthlyRain(double [] rain){
        monthlyRain = rain;
    }
    
    
    public double yearlyRainAverage(){
        double sum = 0;
        for (int i = 0; i < monthlyRain.length; i++){
            sum = sum + monthlyRain[i];
        }
        return (sum / monthlyRain.length);
    }
    
    public String toString(){
        return "\nCity Name: " + name + "\nAverage value of rain : " + yearlyRainAverage();
    }
}
