public class Person {
	protected String name;
	protected String address;

	/**
	*Default constructor
	*/

	public Person (){
		System.out.println("Insdie Person:Constructor");
	name = "";
	address = "";
	}

	/**
	*Constructor dengan dua parameter
	*/
	public Person ( String vname, String vaddress){
		this.name = vname;
		this.address = vaddress;
	}

	/**
	*Method accessor= method yg dibuat untuk menangani pd atibut sebuah class(get and set)
	*/
	public String getName(){

		return name;
	}

	public String getAddress(){

		return address;
	}

	public void setName(String vname){
		this.name = vname;
	}

	public void setAddress(String vaddress){
		this.address = vaddress;
	}
}