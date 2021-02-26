import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

import java.util.ArrayList;

public class StudentTest {
	
	private JFrame frame;
	static TextArea textArea = new TextArea();
	static ArrayList<Student> students = new ArrayList<Student>();
	


	public static void main(String[] args) {
		
		Student student = new Student();
		student.addStudent("Liam", "Nelson", "13.08.1994", "10 Wilbraham Road WS29PT Walsall", "07770519893", "liam@gmail.com", 6000, "Computing", "Foreign", 2000);
		students.add(student);
		
		Student student1 = new Student();
		student1.addStudent("Mark", "Harris", "19.04.1992", "22 Walsall Road WS110BE Cannock", "07732543322", "mark@gmail.com", 3000, "Accounting", "Home", 1000);
		students.add(student1);
		
		Student student2 = new Student();
		student2.addStudent("Andrew", "Johnson", "12.02.1995", "24 Walsall Road WS29PT Walsall", "07770519893", "andrew@gmail.com", 6000, "Business", "Foreign", 6000);
		students.add(student2);
		
		Student student3 = new Student();
		student3.addStudent("Mike", "Newton", "25.02.1991", "22 Wolverhampton Road WS14BP Walsall", "07742234323", "mike@gmail.com", 6000, "Computing", "Foreign", 3000);
		students.add(student3);
		
		Student student4 = new Student();
		student4.addStudent("Robert", "Hill", "11.06.1993", "41 Anson Road WS20DH Walsall", "07737887645", "robert@gmail.com", 3000, "Accounting", "Home", 1000);
		students.add(student4);
		
		Student student5 = new Student();
		student5.addStudent("William", "Shaw", "19.11.1995", "25 Manor Road WS11DE Walsall", "07739998324", "william@gmail.com", 3000, "Computing", "Home", 1500);
		students.add(student5);
		
		Student student6 = new Student();
		student6.addStudent("Martin", "Hodor", "22.12.1992", "44 Bentley Lane WW113 Walsall", "07770519893", "martin@gmail.com", 6000, "Business", "Foreign", 6000);
		students.add(student6);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentTest window = new StudentTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public StudentTest() {
		initialize();
	}


	private void initialize() {
		
		// the frame
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// title label
		JLabel lblNewLabel = new JLabel("Bright - Future College");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 33));
		lblNewLabel.setBounds(186, 6, 373, 47);
		frame.getContentPane().add(lblNewLabel);
		// text label
		JLabel lblNewLabel_1 = new JLabel("What would you like to do");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(229, 58, 310, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		// pay fees button
		JButton btnPayFees = new JButton("Pay fees");
		btnPayFees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				payFees();				
			}
		});
		btnPayFees.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnPayFees.setBounds(90, 183, 269, 39);
		frame.getContentPane().add(btnPayFees);
		
		// list students on a course button
		JButton btnListStudentsOn = new JButton("List students on a course");
		btnListStudentsOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				listStudents();
			}
		});
		btnListStudentsOn.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnListStudentsOn.setBounds(90, 142, 269, 39);
		frame.getContentPane().add(btnListStudentsOn);
		
		
		//change course button
		JButton btnChangeCourse = new JButton("Change course");
		btnChangeCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				changeCourse();
			}
		});
		btnChangeCourse.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnChangeCourse.setBounds(371, 183, 268, 39);
		frame.getContentPane().add(btnChangeCourse);
		
		
		
		// view student profile button
		JButton btnViewStudentsProfile = new JButton("View student's profile");
		btnViewStudentsProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewProfile();	
			}
		});
		btnViewStudentsProfile.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnViewStudentsProfile.setBounds(371, 102, 268, 39);
		frame.getContentPane().add(btnViewStudentsProfile);
		
		
		
		// remove student button
		JButton btnRemoveStudent = new JButton("Remove student");
		btnRemoveStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeStudent();			
			}
		});
		btnRemoveStudent.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnRemoveStudent.setBounds(371, 141, 269, 40);
		frame.getContentPane().add(btnRemoveStudent);
		
		
		// enroll student button
		JButton button_5 = new JButton("Enroll student");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				enroll();
			}
		});
		button_5.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		button_5.setBounds(90, 102, 269, 39);
		frame.getContentPane().add(button_5);
		textArea.setEditable(false);
		textArea.setBounds(10, 336, 730, 232);
		frame.getContentPane().add(textArea);
	
		
		// text label
		JLabel lblManagementReporting = new JLabel("Management reporting");
		lblManagementReporting.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblManagementReporting.setBounds(252, 260, 222, 26);
		frame.getContentPane().add(lblManagementReporting);
		
		
		// courses popularity button
		JButton btnCoursesPopularity = new JButton("Courses popularity");
		btnCoursesPopularity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				coursesPopularity();			
			}
		});
		btnCoursesPopularity.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnCoursesPopularity.setBounds(31, 291, 209, 39);
		frame.getContentPane().add(btnCoursesPopularity);
		
		
		
		// total paid fees button
		JButton btnTotalFees = new JButton("Total paid fees");
		btnTotalFees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalPaidFees();
			}
		});
		btnTotalFees.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnTotalFees.setBounds(252, 291, 241, 39);
		frame.getContentPane().add(btnTotalFees);
		
		
		// total fees to be paid button
		JButton btnTotalFeesTo = new JButton("Total fees to be paid");
		btnTotalFeesTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				totalFeesToBePaid();
			}
		});
		btnTotalFeesTo.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnTotalFeesTo.setBounds(505, 291, 209, 39);
		frame.getContentPane().add(btnTotalFeesTo);
		
		
		// exit button
		JButton exitButton = new JButton("Exit");
		exitButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				System.exit(0);
			}
		});
		exitButton.setBounds(371, 221, 268, 39);
		frame.getContentPane().add(exitButton);
		
		
		
		// search student by name button
		JButton btnNewButton = new JButton("Search student by name");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
					searchStudent();			
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton.setBounds(90, 221, 269, 39);
		frame.getContentPane().add(btnNewButton);	
	}
	
	
	private static void enroll() {
		
		
		String fn = JOptionPane.showInputDialog(null, "Enter student's first name");
		String sn = JOptionPane.showInputDialog(null, "Enter student's surname");
		String dob = JOptionPane.showInputDialog(null, "Enter student's date of birth");
		String adr = JOptionPane.showInputDialog(null, "Enter student's full adress");
		String tel = JOptionPane.showInputDialog(null, "Enter student's telephone number");
		String mail = JOptionPane.showInputDialog(null, "Enter student's email");

		String course;
		do {
			 course = JOptionPane.showInputDialog(null, "Enter the course to study (Computing, Accounting or Business)");
		} while (!"Computing".equals(course) && !"Accounting".equals(course) && !"Business".equals(course));
		
	
		String country;
		do {
			 country = JOptionPane.showInputDialog(null, "Enter the student's country(Home or Foreign)");
		} while (!"Home".equals(country) && !"Foreign".equals(country));
		
		  int fees = 0;
	      int amount = 0;
	       
	      if(country.equals("Home")) {  
	        	do {
	        		fees = 3000;
	        		amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Because you are a home country student your tuition fees are 3000£. \n" + 
	        				" You can pay the full amount or at least 1/3 of it \n" + 
	        	
	        				" Please enter the amount you would like to pay"));
	        		
	        		if(amount < 1000) {
		        		JOptionPane.showMessageDialog(null, "You have to pay at least £1000 to enroll");
	        		}
	        		
	                if(amount > 3000) {
	        			JOptionPane.showMessageDialog(null, "The tuition fee is £3000, you can not pay more than that");

	                }

	        	}while(amount < 1000 || amount > 3000);
	      }
	      
	      if(country.equals("Foreign")) {  
	        	do {
	        		fees = 6000;
	        		amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Because you are a foreign country student your tuition fees are 6000£. \n" + 
	        				" You can pay the full amount or at least 1/3 of it \n" + 
	        	
	        				" Please enter the amount you would like to pay"));
	        		
	        		if(amount < 2000) {
		        		JOptionPane.showMessageDialog(null, "You have to pay at least £2000 to enroll");
	        		}
	        		
	                if(amount > 6000) {
	        			JOptionPane.showMessageDialog(null, "The tuition fee is £6000, you can not pay more than that");

	                }

	        	}while(amount < 2000 || amount > 6000);
	      }
	      
	      
	      Student student = new Student();  // creates a new student object with all the required details 
	        student.addStudent(fn, sn, dob, adr, tel, mail, fees, course, country, amount );
	        
	        //stores the object in the arraylist
	        students.add(student);
	        
			JOptionPane.showMessageDialog(null, "Student successfully enrolled!");

	
	
		
		
    

		
	}
	
	private static void viewProfile() {

		int i = 0;
		int c = JOptionPane.showConfirmDialog(null, "If you want to view a student profile you have to enter the student's ID.\n"
				+ "If you don't know it, the student can be found in search student by name section.\n"
				+ "Do you want to continue", "Confirmation message", JOptionPane.YES_NO_OPTION); 
		if(c == JOptionPane.YES_OPTION) {
			String id = JOptionPane.showInputDialog(null, "Please enter the student's ID :");

			for(int a = 0; a < students.size(); a++)      //    goes through the entire arraylist
	  		{
	  			Student student = students.get(a); 
	  		
	  			if(student.getIdNum().equals(id)) {
	  			textArea.setText(null);
  				textArea.append(student.toString());
  				i = 1;
  			} 
  		}	
  		if(i == 0) {
  			textArea.setText("");
  			JOptionPane.showMessageDialog(null, "Student not found!");
  		}
  		}
		
	}
	
	private static void removeStudent() { 					/// remove student method

		
		int i = 0;
		int c = JOptionPane.showConfirmDialog(null, "If you want to remove the student you have to enter the student's ID.\n"
				+ "If you don't know it, the student can be found in search student by name section.\n" 
				+ "Do you want to continue", "Confirmation message", JOptionPane.YES_NO_OPTION); 
		if(c == JOptionPane.YES_OPTION) {
			String id = JOptionPane.showInputDialog(null, "Please enter the student's ID :");
			
			for(int a = 0; a < students.size(); a++)      //    goes through the entire arraylist
	  		{
	  			Student student = students.get(a); 
	  		
	  			if(student.getIdNum().equals(id)) {
	  				textArea.setText("");
	  				textArea.append(student.toString());
	  				i = 1;
	  				
	  				int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove the student ?","Removal confirmation", JOptionPane.YES_NO_OPTION);
	  				
	  				if(n == JOptionPane.YES_OPTION){
	  		  			textArea.setText("");
	  						students.remove(a);													// removes the student from the arraylist
	  		  				JOptionPane.showMessageDialog(null, "Student successfully removed!");
	  				} else {JOptionPane.showMessageDialog(null, "Student has not been removed!");
	  				}
	  			}
	  		}
			if(i == 0) {
				textArea.setText("");
				JOptionPane.showMessageDialog(null, "Student not found!");
			}	
		} 
		
	
	}  // end of method
	
	private static void payFees() {

		int i = 0;
		int c = JOptionPane.showConfirmDialog(null, "If you want to pay student fees you have to enter the student's ID.\n"
				+ "If you don't know it, the student can be found in search student by name section.\n" 
				+ "Do you want to continue", "Confirmation message", JOptionPane.YES_NO_OPTION); 
		if(c == JOptionPane.YES_OPTION) {
			String id = JOptionPane.showInputDialog(null, "Please enter the student's ID :");
			
			for(int a = 0; a < students.size(); a++)      //    goes through the entire arraylist
	  		{
	  			Student student = students.get(a); 
	  		
	  			if(student.getIdNum().equals(id)) {
	  				
	  				if(student.getFees() == 0) {
	  					JOptionPane.showMessageDialog(null, "Student "+student.getFirstName() +" "+ student.getSurname()+" has paid all the fees");
	  					return;
	  				}
	  				textArea.setText("");
	  				textArea.append(student.toString());
	  				i = 1;
	  			
	  				int amount = Integer.parseInt(JOptionPane.showInputDialog(null, "The student " + student.getFirstName() + " " + student.getSurname() + 
	  						" has to pay " + student.getFees() + "\nEnter the amount you would like to pay"));
	  	  			int fees = student.getFees() - amount;	  			

	  	  			while(amount > student.getFees()) {
	  	  				amount = Integer.parseInt(JOptionPane.showInputDialog(null, "The maximum you can enter is " + student.getFees() 
	  	  				+ "\nEnter the amount you would like to pay"));
	  	  				fees = student.getFees() - amount;
	  	  		}			
	  	  			student.setFees(fees);					// set the new fee in the object
	  	  			
	  	  			JOptionPane.showMessageDialog(null, "Amount successfully paid. The student has got left to pay " + student.getFees());
	  	  			textArea.setText("");
	  	  			textArea.append(student.toString());				
	  	  			}	
	  		}
	  			if(i == 0) {
	  				textArea.setText("");
	  					JOptionPane.showMessageDialog(null, "Student not found!");
	  			}		
	  	}	
	}

	private static void changeCourse() {
		
		
		int i = 0;
		int c = JOptionPane.showConfirmDialog(null, "If you want to change a student's course you have to enter the student's ID.\n"
				+ "If you don't know it, the student can be found in search student by name section.\n"
				+ "Do you want to continue", "Confirmation message", JOptionPane.YES_NO_OPTION); 
		if(c == JOptionPane.YES_OPTION) {
			String id = JOptionPane.showInputDialog(null, "Please enter the student's ID :");
	
			for(int a = 0; a < students.size(); a++)      //    goes through the entire arraylist
	  		{
	  			Student student = students.get(a); 
	  		
	  			if(student.getIdNum().equals(id)) {
	  				textArea.setText("");
	  				textArea.append(student.toString());
	  				i = 1;
		  			
	  	  			String course;  	  	
	  	  			do {
	  	  				 course = JOptionPane.showInputDialog(null, "The student is currently registered on " + student.getCourse() + 
	  	  	  					"\nEnter the new course name(Computing, Accounting or Business)");
	  	  			} while (!"Computing".equals(course) && !"Accounting".equals(course) && !"Business".equals(course));
	  				JOptionPane.showMessageDialog(null, "Course successfully changed");

	  	  			student.setCourse(course);
	  	  			textArea.setText("");
	  	  			textArea.append(student.toString());		
	  	  			}
	  	  		}	  			
	  			if(i == 0) {
	  				JOptionPane.showMessageDialog(null, "Student not found!");
	  			}		
		}
	} // end of method

	private static void listStudents() {

			textArea.setText("");

		
		String course = JOptionPane.showInputDialog(null, "Enter the course name to see the registered students(Computing, Business, Accounting)");
		
		if(course.equals("Computing") || course.equals("Business") || course.equals("Accounting")) {
			textArea.setText("---------------------------------------------------------"
					+ "\n|                  Name                     |                Email               |         ID       |"
					+ "\n---------------------------------------------------------");
		for(int a = 0; a < students.size(); a++) {
  			Student student = students.get(a); 

  			
  			if(course.equals(student.getCourse().toString())) {   
  				textArea.append("\n"+ String.format("%-40s",student.getFirstName() +" "+ student.getSurname() ) +" " 
  			+ String.format("%-30s", student.getEmail()) + " "+ student.getIdNum());
  				
  			}
		}

	}else {
		JOptionPane.showMessageDialog(null, "Please enter a valid course name");
	}
	}

	private static void coursesPopularity() {
		
		int comp = 0;
		int buss = 0;
		int acc = 0;
		
		textArea.setText("");

		for(int a = 0; a < students.size(); a++) {        
  			Student student = students.get(a); 
		
  		if("Computing".equals(student.getCourse().toString())) {  
  			comp++;
  		}
  		if("Accounting".equals(student.getCourse().toString())) {
  			acc++;
  		}
  		
  		if("Business".equals(student.getCourse().toString())) {
  			buss++;
  		}
		}
		
		textArea.append("Students enrolled on computing course: " + comp + 
				"\nStudents enrolled on accounting course: " + acc +
				"\nStudents enrolled on business course: " + buss);
		
		
	}
	
	private static void totalPaidFees() {
			
		int totalFees = 0;

		for(int a = 0; a < students.size(); a++) {        
  		Student student = students.get(a); 
  		
  		if("Home".equals(student.getCountry().toString())) {  
  			totalFees = totalFees + (3000 - student.getFees());
  		}
  		if("Foreign".equals(student.getCountry().toString())) {  
  	  		totalFees = totalFees + (6000 - student.getFees());
  		}
		
		}
		
		textArea.setText("");
		JOptionPane.showMessageDialog(null, "Total fees paid until now: " + totalFees);

		
		}// end of method
	
	private static void totalFeesToBePaid() {
		
	int totalFees = 0;
		
		for(int a = 0; a < students.size(); a++) {        
  			Student student = students.get(a); 
  			
  		totalFees = totalFees + student.getFees();
  		
  		
	}
		JOptionPane.showMessageDialog(null, "Total amount of fees that needs to be paid: " + totalFees);
	}
	
	private static void searchStudent() {
		String fn = JOptionPane.showInputDialog(null, "Enter student's first name");
		String sn = JOptionPane.showInputDialog(null, "Enter student's surname");
		int i = 0;
		for(int a = 0; a < students.size(); a++)  //    goes through the entire arraylist
  		{
  			Student student = students.get(a);
  			
  			if(student.getFirstName().contains(fn) && student.getSurname().contains(sn) ) {
	  			textArea.setText(null);
  				textArea.append(student.toString());
  				i = 1;
  			} 
  		}	
  		if(i == 0) {
  			textArea.setText("");
  			JOptionPane.showMessageDialog(null, "Student not found!");
  		}
		
	}

}// end of class
