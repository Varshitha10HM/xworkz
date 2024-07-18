class GoldShop
{
	
	static String goldItems[] = {null, null, null, null, null, null, null};
	static int Index;
	public static boolean addGoldItem(String goldItem)
	{
		boolean isGoldItemCreated = false;
		System.out.println("addGoldItem started..!");
		if(goldItem != null)
		{
			goldItems[Index++] = goldItem;
			isGoldItemCreated = true;
		}else 
			System.out.println("Gold Item name is null, cannot be null");
		
		
		System.out.println("addGoldItem ended..!");
		return isGoldItemCreated;
		
	}
	
	public static void getGoldItem(){
		
		System.out.println(".........");
		
		System.out.println("Gold Item Are : ");
		for(String goldItem : goldItems) 
			System.out.println(goldItem);
		
	}
public static boolean updateGoldItem(String oldGoldItem , String newGoldItem)
{
	System.out.println("updateGoldItem Started");
	boolean isGoldItemUpdated = false;
	for(int index=0; index <goldItems.length;index++){
		if(oldGoldItem == goldItems[index]){
			goldItems[index]=newGoldItem;
			isGoldItemUpdated=true;
		}
	}
	if(isGoldItemUpdated==false){
		System.out.println(oldGoldItem+"not found");
	}
	System.out.println("updateGoldItem ended");
	return isGoldItemUpdated;
}

}

			public static boolean deletegoldItems(String goldItemsTobeDeleted){
	  System.out.println();
	  boolean isgoldItemsDelete = false;
	  int newIndex ,oldIndex;
	  for(newIndex =0,oldIndex=0; oldIndex <goldItems.length; oldIndex++){
		  if(!goldItems [oldIndex]!=goldItemsTobeDeleted){
			  {
				  goldItems[newIndex] =goldItems[oldIndex];
				  newIndex++;
	  }
		  }
		 goldItems = Array.copyOf(goldItems,newIndex);
		  if(goldItems! =null0){
			  isgoldItemsDeleted  = true;
		  }
		  if( isgoldItemsDeleted == false){
			  System.out.println(goldItemsTobeDeleted +"not found");
		  }
		  System.out.println("goldItemsended");
	  }
  }
	}
}