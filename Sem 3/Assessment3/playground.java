
// b(i) count and display
int count = 0;
for (int i = 0; i < bicycleAL.size(); i++ )
{
    if ( bicycleAL.get(i).getMaterial() == 'B' && bicycleAL.get(i).getType().equalsIgnoreCase("folding"){
		count++;
    }
}
System.out.println("Total number of steel folding bike: " + count);


// b(ii) instatntiate

ArrayList SteelAL = new ArrayList();
ArrayList AluminiumAL = new ArrayList();
ArrayList CarbonAL = new ArrayList();

for (int i = 0; i < bicycleAL.size(); i++)
{
	if (bicycleAL.get(i).getMaterial() == 'A')
	{
		AluminiumAL.add(bicycleAL.remove(i);
	} else if (bicycleAL.get(i).getMaterial() == 'B')
	{
		SteelAL.add(bicycleAL.remove(i);
	} else if (bicycleAL.get(i).getMaterial() == 'C')
	{
		CarbonAL.add(bicycleAL.remove(i);
	}
	i--;
}


//b (iii) calculate and display the total price of polygon bike in steelAL which is more than rm3000

double total = 0;
for (int i = 0; i < SteelAL.size(); i++)
{
	if ( SteelAL.get(i).getBrand().equalsIgnoreCase("Polygon") && SteelAL.get(i).getPrice() > 30000 )
	{
		total += SteelAL.get(i).getPrice();
	}
}
System.out.println("Total price of Polygon bike in SteelAL which price is more than RM3000: " + total);



// 3 (b) (i)

Scanner scan = new Scanner(System.in);

LinkedList houseLL = new LinkedList();

    for (int i = 0; i < 50; i++){
        
        String type = scan.next();
            
		String area = scan.next();
		
		int numUnit = scan.nextInt();
		
		double price = scan.nextDouble();
		
		House data = House(type, area, numUnit, price);
        houseLL.insertAtBack(data);
    }
    scan.close();
	
// 3 (b) (ii) store semi-D and terrace from houseLL into semiDLL and teraceLL,
// 			  else store in otherLL

	LinkedList semiDLL = new LinkedList();
	LinkedList terraceLL = new LinkedList();
	LinkedList otherLL = new LinkedList();

	House data = (House) houseLL.getFirst();

	while (data != null){
		
		if (data.getType().equalsIgnoreCase("SemiD")){
			demiDLL.insertAtBack(data);
		} else if (data.getType().equalsIgnoreCase("Terrace"){
			terraceLL.insertAtBack(data);
		} else if (data.getType().equalsIgnoreCase("Bungalow"){
			otherLL.insertAtBack(data);
		}
		data = (House) houseLL.getNext();
	}
	
	
// 3 (b) (iii) Calculate and display the price after discount for each house i terraceLL

//         < 150000 = 3% discount
//  150000 - 300000 = 5% discount
//         > 300000 = 10% discount

	House data = (House) terraceLL.getFirst();
	
	double discounted = 0;
	while (data != null){
		
		if ( data.getPrice() < 150000 ){
			
			discounted = data.getPrice() * 0.97;
			data.setPrice(discounted);
			
		} else if ( data.getPrice() > 150000 && data.getPrice() < 300000){
			
			discounted = data.getPrice() * 0.95;
			data.setPrice(discounted);
			
		} else if ( data.getPrice() > 300000 ){
			
			discounted = data.getPrice() * 0.9;
			data.setPrice(discounted);
			
		}
		
		System.out.println(data.toString());
		
		data = (House) terraceLL.getNext();
	}

