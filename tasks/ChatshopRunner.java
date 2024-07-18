class ChatshopRunner
{
	public static void main(String[] chat)
	{
		boolean name=chatShop.createChatNames("Sev Puri");
		System.out.println(name);
		boolean price=chatShop.createprice(20.0);
		System.out.println(price);
		
		name=chatShop.createChatNames("Masal Puri");
		System.out.println(name);
		price=chatShop.createprice(40.0);
		System.out.println(price);

		name=chatShop.createChatNames("Pav Bajji");
		System.out.println(name);
		price=chatShop.createprice(25.0);
		System.out.println(price);

		name=chatShop.createChatNames("Potato twister");
		System.out.println(name);
		price=chatShop.createprice(80.0);
		System.out.println(price);

		name=chatShop.createChatNames("Nippat Masala");
		System.out.println(name);
		price=chatShop.createprice(40.0);
		System.out.println(price);
		
		name=chatShop.createChatNames("Dahi puri");
		System.out.println(name);
		price=chatShop.createprice(40.0);
		System.out.println(price);
		
		chatShop.getChat();
		chathop.deleteChatNames("sev puri");
		chatShop.getChat();
		
