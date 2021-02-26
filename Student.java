import java.util.Random;

// the student class that creates the student object

public class Student {

	enum Courses{    
		Computing,
		Accounting,
		Business
	}
	
	enum Country{
		Home,
		Foreign
	}
	private String firstName;   // variables that contains student details
	private String surname;
	private String dob;
	private String adress;
	private String tel;
	private String email;
    private Courses course;
    private Country country;
    private Random id = new Random();
    private String idNum;
	private int fees;
	
	public void addStudent(String firstName_, String surname_, String dob_, String adress_,     // enroll students method
			String tel_, String email_, int fees_, String course_, String country_, int amount_) {
		
		this.firstName = firstName_;    				
		this.surname = surname_;
		this.dob = dob_;
		this.adress = adress_;
		this.tel = tel_;
		this.email = email_;
        this.fees = fees_ - amount_;
        
        if(surname.length() < 3) {
        	
        	this.idNum = surname_ + this.id.nextInt(999999); 
            this.idNum = this.idNum.toUpperCase();
        } else if(surname.length() > 3) {
        // creates the ID number by adding the first 3 letters from the surname and a random number
        this.idNum = surname_.substring(0, 3) + this.id.nextInt(999999); 
        this.idNum = this.idNum.toUpperCase();    // transforms the 3 surname letters from ID in capital letters
        }
        
        if(course_.equals("Computing")) {   
        	 course = Courses.Computing;
        }
        
        else if(course_.equals("Accounting")) {
        	 course = Courses.Accounting;
        }
        
        else if(course_.equals("Business")) {
        	course = Courses.Business;
        }
        
        if(country_.equals("Home")) {
        	country = Country.Home;
        }
        else if(country_.equals("Foreign")) {
        	country = Country.Foreign;
        } 
	}
	
	 public String toString()   // returns the data from the object,
	    {						//  without this the system will print just the object id from array
	        return "* Full name: " + this.firstName + " " + this.surname + "\n* Date of birth: " + this.dob + 
	               "\n* Adress: " + this.adress + "\n* Telephone number: " + this.tel +
	               "\n* Email: " + this.email + "\n* Student ID: " + this.idNum + "\n* Course: " + 
	               course.toString() + "\n* Student's country: " +  country.toString() + "\n* Fees left to pay: " + this.fees;
	    }
	 
	 public String showFees() {
		 
		 return "\n* Full name: " + this.firstName + " " + this.surname + "\n* Money left to pay: " + this.fees;
	 }
	 	/// setters and getters
	 
	 
	 
	 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(String course) {
		if(course.equals("Accounting")) 
		{
		this.course = Courses.Accounting;
		} 
		else if(course.equals("Computing")) 
		{
		this.course = Courses.Computing;
		} 
		else if(course.equals("Business")) 
		{
		this.course = Courses.Business;
		}
		}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	 
	 
	 
}
