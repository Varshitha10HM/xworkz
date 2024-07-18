lass Textiles
{
	static String addMaterials[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	public static boolean Materials(String Texture)
	{
		System.out.println("Texture added started");
		boolean isnameAdded=false
		if(Texture != null)
		{
			addMaterials[index] = Texture;
			index++;
			isnameAdded =true;
		}else
		{
			System.out.println("Texture name is not added");
		}   System.out.println("Texture added ended");
		return isnameAdded;
	}
	public static void getAllMaterialinfo()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		for(String Texture : addcMaterials)
		{
			System.out.println("The available textute are: "+ Texture);
		}
	}
	public static boolean updateTexture(String oldname, String newname)
	{
		System.out.println("--------------------------------------------------------------------------------------");
		boolean isNameUpdated = true;
		for(index=0; index < addMaterials.length; index++)
		{
			if(oldname == addMaterials[index])
			{
				addMaterials[index] = newname;
				isNameUpdated = true;
			}
		}
   
			public static boolean deleteaddMaterials(String addMaterialsTobeDeleted){
	  System.out.println();
	  boolean isaddMaterialsDelete = false;
	  int newIndex ,oldIndex;
	  for(newIndex =0,oldIndex=0; oldIndex <addMaterials.length; oldIndex++){
		  if(!addMaterials [oldIndex]!=addMaterialsTobeDeleted){
			  {
				  addMaterials[newIndex] = addMaterials[oldIndex];
				  newIndex++;
	  }
		  }
		  addMaterials = Array.copyOf(addMaterials,newIndex);
		  if(addMaterials ! =null0{
			  isaddMaterialsDeleted  = true;
		  }
		  if( isaddMaterialsDeleted == false){
			  System.out.println(addMaterialsTobeDeleted +"not found");
		  }
		  System.out.println("deleteaddMaterials ended");
	  }
  }
	}
}
	  

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}return isNameUpdated;
	}
}