package Demo;

public class Diary {
private String name;
private String details;
public Diary() {
	super();
}
public Diary(String name, String details) {
	super();
	this.name = name;
	this.details = details;
}
private String getName() {
	return name;
}
private void setName(String name) {
	this.name = name;
}
private String getDetails() {
	return details;
}
private void setDetails(String details) {
	this.details = details;
}

}
