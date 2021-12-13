public class BajuMelayu extends TailorOrder{
    private int type;       // types of baju melayu

    public BajuMelayu(String c, String o, double d, boolean delivery, int t){
        super(c, o, d, delivery);
        this.type = t;
    }

    public int getType(){return type;}

    public double payment(){
        double total = 0;
        switch(getType()){
            case 1:
                total = 75.00;
                break;
            case 2:
                total = 95.00;
                break;
        }
        return total;
    }

    @Override
    public boolean getEmbroidery() {
        // TODO Auto-generated method stub
        return false;
    }

    /*Type        Description          Price (RM)
        ====  =========================  ==========
        1     Baju Melayu Cekak Musang   75.00
        2     Baju Melayu Teluk Belanga  95.00
        ===========================================*/

}