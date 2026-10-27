package hotelBooking;

class Hotels{
	int Id;
	String Name;
	String RoomType;
	float Price;
	public Hotels(int id, String name, String roomType, float price) {
		super();
		Id = id;
		Name = name;
		RoomType = roomType;
		Price = price;
		
		
	}
	public int getId() {
		return Id;
	}
	public String getName() {
		return Name;
	}
	public String getRoomType() {
		return RoomType;
	}
	public float getPrice() {
		return Price;
	}
	
	
}
