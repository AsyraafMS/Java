public class BajuKurung extends TailorOrder{
    private int type;               // type of baju kurung
    private boolean embroidery;     // add-on embroidery (yes/no)

    // sets all data members
    public BajuKurung(String c, String o, double d, boolean delivery, int t, boolean e){
        super(c, o ,d ,delivery);
        this.type = t;
        this.embroidery = e;
    }

    public boolean getEmbroidery(){return embroidery;}

    // if customer adds embroidery, RM25.00 is charged. Returns the additional charge
    public double addEmbroidery(){
        if(embroidery == true){
            return 25.00;
        } else if (embroidery == false){
            return 0.00;
        } else {
            return 0;
        }
    }

    public int getType(){return type;}
    
    public double payment(){
        double total = 0;
        switch(getType()){
            case 1:
                total = 30.00;
                break;
            case 2:
                total = 60.00;
                break;
            case 3:
                total = 55.00;
                break;
            case 4:
                total = 110.00;
                break;
        }
        return total + addEmbroidery();
    }

    /*The rate is as follows:
    Type      Description     Price (RM)
    ====  ==================  ==========
    1     Normal Baju Kurung  30.00
    2     Baju Kurung Lining  60.00
    3     Normal Baju Kebaya  55.00
    4     Baju Kebaya Lining  110.00
    ====================================
    Total payment is calculated after adding embroidery charge.*/
}
