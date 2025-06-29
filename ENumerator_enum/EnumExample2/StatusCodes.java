package EnumExample2;

public enum StatusCodes {
	
	SUCCESS(200), NOTFOUND(404), BADREQUEST(400);
	
	//gives a error as we are assigning the value or sending the value we has to assign the value inside the things -> write a constructor to give a value for it 
	
	private int code;
	
	private StatusCodes(int code) {
		this.code=code;
	}
	
	public int getCode() {
		return code;
	}
	
	
}
