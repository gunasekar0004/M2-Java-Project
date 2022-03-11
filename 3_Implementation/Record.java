package Demo;
import java.util.*;
import java.Collections.*;



import java.io.Serializable;
public class Record implements Serializable {
	
	
/**
	 * 
	 */
	//private static final long serialVersionUID = -9145277044752401929L;
		private static final long serialVersionUID = 1L;
	public List<Personal> collection;

	
	public Record() {
	  collection = new ArrayList<Personal>();
		
	
	}
	public void addPersoanl(Personal p) {
	
	collection.add(p);
///	System.out.println(collection);

	}
	public void deletefiles(String rec)
	{

	int count=0;
for(Personal h1: collection)
		{
	
//	System.out.println("Record Not found");
		  
			if (rec.equals(h1.getRecord()))
		    {
				
		        collection.remove(count);
		        System.out.println("Record Deleted  Successfully");
		        break;
		    }
			 count++;
			
			
		}

	}
	
	private List<Demo.Personal> getaddPersonal() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		String total="\n";
		Iterator<Personal> i = collection.iterator();
		
		while(i.hasNext()) {
			Personal h= (Personal) i.next();
			total=total + h.toString();
		}
		return  total;


	}
 

}
