package Demo;
import java.io.Serializable;
public class Personal implements Serializable {
	 /**
	 * 
	 */
	private String record;
	
	private String name;
	 private String dateofbirth;
	 private String message;
	 private String place;
	 
	private static final long serialVersionUID = 1L;
	
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	 
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Personal() {
		record=null;
		 name=null;
		 dateofbirth=null;
		 message=null;
		 place=null;
	 }
	 
	
	public Personal(String record,String name, String dateofbirth, String message, String place) {
		super();
		this.record=record;
		this.name = name;
		this.dateofbirth = dateofbirth;
		this.message = message;
		this.place = place;
	}
	@Override
	public String toString() {
	
		return "\nRecordfilename"+record+"\n Name : " +  name + "\n DateofBirth : "+ dateofbirth + "\n Message : " + message + "\n Place : " + place + "\n";
	}

 

}
