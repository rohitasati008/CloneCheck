
public class Address implements Cloneable {
	City name ;

	 
	public City getName() {
		return name;
	}


	public void setName(City name) {
		this.name = name;
	}


	@Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }


 
}
