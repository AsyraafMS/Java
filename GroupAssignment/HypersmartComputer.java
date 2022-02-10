/**
 * Group Assignment Hypersmart Computer Shop Class HypersmartComputer.
 *
 * @author (Akif Irfan & Adib Fikri & Ilyas)
 * @version (6/12/2021)
 */
import java.text.DecimalFormat;
public class HypersmartComputer
{
    private String computerBrand;
    private String computerModel;
    private String computerCPU;
    private int cpuNumberOfCores;
    private int computerRam;
    private int computerStorage;
    private String computerGPU;
    private double computerPrice;
    
    /**Normal Constructor*/
    public HypersmartComputer (String b, String m, String c, int n, int r, int s, String g, double p)
    {
        this.computerBrand = b;
        this.computerModel = m;
        this.computerCPU = c;
        this.cpuNumberOfCores = n;
        this.computerRam = r;
        this.computerStorage = s;
        this.computerGPU = g;
        this.computerPrice = p;
    }
    
    /**Mutators*/
    public void setComputerBrand(String brand)
    {
        this.computerBrand  = brand;
    }
    
    public void setComputerModel(String model)
    {
        this.computerModel = model;
    }
    
    public void setComputerCPU(String cpu)
    {
        this.computerCPU = cpu;
    }
    
    public void setCpuNumberOfCores(int cores)
    {
        this.cpuNumberOfCores = cores;
    }
    
    public void setComputerRam(int ram)
    {
        this.computerRam = ram;
    }
    
    public void setComputerStorage(int storage)
    {
        this.computerStorage = storage;
    }
    
    public void setComputerGPU(String gpu)
    {
        this.computerGPU = gpu;
    }
    
    public void setComputerPrice(double price)
    {
        this.computerPrice = price;
    }
    
    /**Accessor*/
    public String getComputerBrand()
    {
        return computerBrand;
    }
    
    public String getComputerModel()
    {
        return computerModel;
    }
    
    public String getComputerCPU()
    {
        return computerCPU;
    }
    
    public int getCpuNumberOfCores()
    {
        return cpuNumberOfCores;
    }
    
    public int getComputerRam()
    {
        return computerRam;
    }
    
    public int getComputerStorage()
    {
        return computerStorage;
    }
    
    public String getComputerGPU()
    {
        return computerGPU;
    }
    
    public double getComputerPrice()
    {
        return computerPrice;
    }
    
    /**toString*/
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        return (computerBrand + "\t\t" + computerModel + "\t\t" + computerCPU + "\t\t" + cpuNumberOfCores + 
                "\t\t" + computerRam + "GB" + "\t\t" + computerStorage + "GB" + "\t\t" + computerGPU + "\t\t" + df.format(computerPrice));
    }
}
