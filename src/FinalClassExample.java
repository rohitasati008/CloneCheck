
import java.util.HashMap;
import java.util.Iterator;

public final class FinalClassExample implements Cloneable{

	private final int id;
	
	private final String name;
	
	private final Address a ;
	@Override
    protected FinalClassExample clone() throws CloneNotSupportedException {
        return (FinalClassExample) super.clone();
    }


	public FinalClassExample(int id, String name, Address a) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
	}


	


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public Address getA() throws CloneNotSupportedException {
		return  a.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		City c = new City();
		c.setName("gurgaon");
		 Address a = new Address();
		 a.setName(c);
		 FinalClassExample f = new FinalClassExample(1, "mnop", a);
		 System.out.println("before change"+f.getA().getName().getName());
		 Address b  = f.getA();
		 City c2 =  b.getName();
		 c2.setName("mumbai");
		 System.out.println("After change"+f.getA().getName().getName());
		 

	}
}
