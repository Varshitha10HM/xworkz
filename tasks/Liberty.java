class Liberty
{
	static String addShoeBrands[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	public static boolean ShoesB(String ShoeBrands)
	{
		System.out.println("Add shoe Brands started");
		boolean isShoeBrandAdded = false;
		if(ShoeBrands != null)
		{
			addShoeBrands[index] = ShoeBrands;
			index++;
			isShoeBrandAdded = true;
		}else
		{
			System.out.println("Shoe Brand is not added");
		}	System.out.println("Add Shoe Brands ended");
		return isShoeBrandAdded;
	}
	public static void getAllShoeBrands()
	{
		System.out.println("--------------------------------------------------------------------------------------------");
		for(String ShoeBrands : addShoeBrands)
		{
			System.out.println("The available shoe brands are: "+ShoeBrands);
		}
	}
	public static boolean updateShorBrands(String oldbrand, String newbrand)
	{
		System.out.println("-------------------------------------------------------------------------------------------");
		boolean isbrandNameUpdated=false;
		for(index=0; index < addShoeBrands.length; index++)
		{
			if(oldbrand == addShoeBrands[index])
			{
			addShoeBrands[index] = newbrand;
			isbrandNameUpdated = true;
			}
		}
	if(isbrandNameUpdated == false)
	{
		System.out.println(oldbrand + "Not found");
	}return isbrandNameUpdated;
	}
}

			public static boolean deleteaddShoeBrands(String addShoeBrandsTobeDeleted){
	  System.out.println();
	  boolean isaddShoeBrandsDelete = false;
	  int newIndex ,oldIndex;
	  for(newIndex =0,oldIndex=0; oldIndex <addShoeBrands.length; oldIndex++){
		  if(!addShoeBrands [oldIndex]!=addShoeBrandsTobeDeleted){
			  {
				  addShoeBrands[newIndex] = addShoeBrands[oldIndex];
				  newIndex++;
	  }
		  }
		  addShoeBrands = Array.copyOf(addShoeBrands,newIndex);
		  if(addShoeBrands! =null0){
			  isaddShoeBrandsDeleted  = true;
		  }
		  if( isaddShoeBrandsDeleted == false){
			  System.out.println(addShoeBrandsTobeDeleted +"not found");
		  }
		  System.out.println("addShoeBrands ended");
	  }
  }
	}
}
	  