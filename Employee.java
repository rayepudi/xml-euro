public class Employee
{
   private Integer id;
   private String firstName;
   private String lastName;
   private String location;
private String setLocation;
    
   //Setters and Getters
    
   @Override
   public String toString()
   {
      return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", location=" + location + "]";
   }

public void setId(int parseInt) {
	this.id = parseInt;
	// TODO Auto-generated method stub
	
}

public void setFirstName(String textContent) {
	this.firstName = textContent;
	// TODO Auto-generated method stub
	
}

public void setLastName(String textContent) {
	this.lastName = textContent;
	// TODO Auto-generated method stub
	
}

public void setLocation(String textContent) {
	this.setLocation = textContent;
	// TODO Auto-generated method stub
	
}
}

