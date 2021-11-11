 
==================(File Reader)==================

BufferedReader br = new BufferedReader(new FileReader("maintenance.txt"));
String indata = null;

while((indata=br.readLine())!=null)
{
    StringTokenizer st = new StringTokenizer(indata, ";");

    String stringType = st.nextToken();
    int intType = Integer.parseInt(st.nextToken());
    double doubleType = Double.parseDouble(st.nextToken());
    float floatType = Float.parseFloat(st.nextToken());
    boolean boolType = Boolean.parseBoolean(st.nextToken());

    //Create object first before putting into a list
    Definition obj = new Definition(stringType, intType, doubleType, floatType, boolType);
    arrList.add(obj);
}
 
==================(Algorithm for ArrayLists)==================
    
ArrayList arrList = new ArrayList(); // ---> Non-Generic, which means that you have to cast when calling its method. For example, ((Definition) arrList.get(i)).doMethod()

ArrayList <Definition> arrList = new ArrayList<Definition>(); // --> Generic, which means you don't have to cast when calling its method

// BUBBLE SORT 
    public static void BubbleSort(ArrayList arrList)
    int n = arrList.size();
    for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++)
            if (((Maintenance)arrList.get(j)).getPlateNo().compareToIgnoreCase(((Maintenance)arrList.get(j+1)).getPlateNo())>0)//ascending; <0 (descending)
            {
                Maintenance temp = (Maintenance)arrList.get(j);
                arrList.set(j,arrList.get(j+1));
                arrList.set(j+1, temp);
            }

// BINARY SEARCH
    public static void binarySearch(ArrayList arr, int first, int last, String key){  
    int mid = (first + last)/2;  
    while( first <= last ){  
        if ( ((Maintenance)arr.get(mid)).getPlateNo().compareToIgnoreCase(key)<0){  
            first = mid + 1;     
        }else if ( ((Maintenance)arr.get(mid)).getPlateNo().compareToIgnoreCase(key)==0 ){  
            System.out.println("Element is found at index: " + mid);
            break;  
        }else{  
            last = mid - 1;  
        }   
        mid = (first + last)/2;  
    }  
    if ( first > last )
        System.out.println("Element is not found!");

// INSERTION SORT
    public static void sort(ArrayList arrList){
        int n = arrList.size();
    for (int i = 1; i < n; ++i){
        int key = arrList.get(i);
        int j = i - 1;
        /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position */
            while (j >= 0 && arrList.get(j) > key) {
                arr[j + 1] = arrList.get(j);
                j = j - 1;
            }
            arrList.get(j + 1) = key;
        }

// MIN/MAX VALUE
    // loop to find minimum from ArrayList
    public static int getMin(ArrayList arr){
        int min = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
    }
    // loop to find maximum from ArrayList
    public static int getMax(ArrayList arr){
        int max = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
    }