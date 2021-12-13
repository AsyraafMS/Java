public class LongJump
{
    private String id;
    private String name;
    private String teamCode; 
    private double[] distance = new double[2];

// NORMAL CONSTRUCTOR
    public LongJump(String id, String name, String teamCode, double[] distance){
        this.id = id;
        this.name = name;
        this.teamCode = teamCode;
        this.distance = distance;
    }

// DEFAULT CONSTRUCTOR
    public LongJump(){
        id = null;
        name = null;
        teamCode = null;
        distance = new double[2];
    }

// MUTATOR
    public void setData(String id, String name, String teamCode, double[] distance){
        this.id = id;
        this.name = name;
        this.teamCode = teamCode;
        this.distance = distance;
    }

// ACCESSOR
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getTeamCode(){
        return teamCode;
    }
    public double[] getDistance(){
        return distance;
    }

// PROCESSOR 
    public double calcAverage(){
        double average = (distance[0] + distance[1]) / 2 ;
        return average;
    }

    public String getStatus(){
        String status = null;
        if (calcAverage() >= 7.00 ){
            status = "Qualified";
        } else if (calcAverage() >= 5.00 && calcAverage() < 7.00){
            status = "Reserve";
        } else if (calcAverage() < 5.00){
            status = "Disqualified";
        }
        return status;
    }

    public String toString(){
        return "The athelete details is :\n"
        +"   Athelete ID      Athlete Name      Team Code      Jum 1      Jum 2      Average Distance        Status\n"
        +"      "+id+"          "+name+"         "+teamCode+"         "+distance[0]+"       "+distance[1]+"             "+calcAverage()+"             "+getStatus();
    }

}   
