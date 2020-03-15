import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.*;
class Person
{
	private String Title;
	private String Name;
	private String DoB;
	private String gender;
	private String Home_address;
	private long int ph_no;
	
	public Person(String Title,String Name,String DoB,String gender,String Home_address,long int ph_no);
	{
		this.Title = Title;
		this.Name = Name;
		this.DoB = DoB;
		this.gender = gender;
		this.Home_address = Home_address;
		this.ph_no = ph_no;
	}
	public String getName()
	{
		return Name;
	}
	public String getDoB()
	{
		return DoB();
	}
	public String getTitle()
	{
		return Title;
	}
}
class Patient extends Person
{
	private int patient_id;
	private String sickness;  
	private int threat_level;
	private String allergy;
	private String[] prescription;
	int no_of_bed_days;
	float bill;
	private String jdate;
	
	public Patient(String Title,String Name,String DoB,String gender,String Home_address,int patient_id,String sickness,String allergy,String[] prescription,long int ph_no,int threat_level,String jdate)
	{
		super(Title,Name, DoB,gender,Home_address,ph_no);
		this.patient_id = patient_id;
		this.sickness = sickness;
		this.allergy = allergy;
		this.prescription = prescription;
		this.threat_level = threat_level;
		this.bill = 0;
		this.no_of_bed_days =0;
		this.jdate = jdate;
	}
	public String getSickness()
	{
		return sickness;
	}
	public String getAllergy()
	{
		return allergy;
	}
	public String[] getPrescription()
	{
		return prescription;
	}
	public String getJdate()
	{
		return jdate;
	}
	public void calBill()
	{
		switch(thretlevel)
		{
			case 1: 
				bill = (1.15 * no_of_bed_days * 5000) +  (1*4000) + 500;
				break;
			case 2: 
				bill = (1.15 * no_of_bed_days * 5000) +  (2*4000) + 1500;
				break;
			case 3: 
				bill = (1.15 * no_of_bed_days * 5000) +  (3*4000) + 2500;
				break;
			case 4: 
				bill = (1.15 * no_of_bed_days * 5000) +  (4*4000) + 3500;
				break;
		}
		printBill();
	}
	public void printBill()
	{
		
		System.out.println("****************************** PATIENT REPORT *************************");
		System.out.println("Name		: " + getName());
		System.out.println("DoB		: " + getDoB());
		System.out.println("Sickness		: " + getSickness());
		System.out.println("Allergy		: " + getAllergy());
		System.out.println("Prescription	: ");
		String[] pres = getPrescription();
		for(int i=0; i< pres.length; i++)
			System.out.println( i + "." + pres[i]);
		System.out.println("Admission Date	: " + getJdate());
		System.out.println("Admitted Days	: " + no_of_bed_days);
		System.out.println("Bill Amount 	: " + bill);
	}
		
}
interface staff 
{
	String getJoiningDate();
	String getEducation();
	String getSalary();
}

class Doctor extends Person implements staff
{	
	private int experience;
	private String speciality;
	private String[] Education;
	private String JoiningDate;
	private float Salary;		
	
	public String getJoiningDate()
	{
		return Joining_Date;
	}
	public String[] getEducation()
	{
		return Education;
	}
	public float getSalary()
	{
		return Salary;
	}
	public int getExperience()
	{
		return experience;
	}
	public int setExperience(int experience)
	{
		this.experience = experience;
	}
	public void setSalary(int Salary)
	{
		this.Salary = Salary;
	}
	
	Doctor(String Title,String Name,String DoB,String gender,String Home_address,long int ph_no,int experience, String speciality,String[] Education,String JoiningDate,float Salary)
	{
		super(Title, Name, DoB, gender, Home_address, ph_no)
		this.experience = experience;
		this.speciality = speciality;
		this.Education = Education;
		this.JoiningDate = JoiningDate;
		this.salary = salary;
	}
	
}
class Technician extends Person implements staff
{
	private int experience;
	private String[] Education;
	private String JoiningDate;
	private float Salary;
	private int clearance;		
	
	public String getJoiningDate()
	{
		return Joining_Date;
	}
	public String[] getEducation()
	{
		return Education;
	}
	public float getSalary()
	{
		return Salary;
	}
	public int getExperience()
	{
		return experience;
	}
	public int setExperience(int experience)
	{
		this.experience = experience;
	}
	publci int getClearane()
	{
		return clearance;
	}
	Technician(String Title,String Name,String DoB,String gender,String Home_address,long int ph_no,int experience,String[] Education,String JoiningDate,float Salary,int clearance)
	{
		super(Title, Name, DoB, gender, Home_address, ph_no)
		this.experience = experience;
		this.Education = Education;
		this.JoiningDate = JoiningDate;
		this.salary = salary;
		this.clearance = clearance;
	}
}
class Hospital
{
	private String name;
	private String address;
	private long int ph_no;
	private int no_of_doctors;
	private int in_patients;
	private int no_of_tech;
	Hospital(String name, String address,long int ph_no,int no_of_doctors,int in_patients,int no_of_tech)
	{
		this.name = name;
		this.address = address;
		this.ph_no = ph_no;
		this.no_of_doctors = no_of_doctors;
		this.in_patients = in_patients;
		this.no_of_techs = no_
	}
	public String getPh()
	{
		return ph_no;
	}
	public String getAddress()
	{
		return address;
	}
	public String getAddress();
}
}

/*class drug_stock<T,S> 
{
	T[] items;
	S[] drug_name;
	update_stock(T[] items,S[] drug_name)
	{
		this.items = items;
		this.drug_name = drug_name;
	}
}   */

/* EXCEPTIONS */
class StaffNotFoundException extends Exception
{
	private int det;
	StaffNotFoundException()
	{
		det = 1;
	}
	public String toString()
	{
		return "Staff Not Found in the Database " + " \n Exception" + det;
	}
} 
		
class PatientNotFoundException extends Exception
{
	private int det;
	PatientNotFoundException()
	{
		det = 2;
	}
	public String toString()
	{
		return "Patient Not Found in the Database " + " \n Exception" + det;
	}
} 
class PatientCountException extends Exception
{	

	private int det;
	PatientCountException()
	{
		det = 3;
	}
	public String toString()
	{
		return "No more patients can be accomodated!  " + " \n Exception" + det;
	}
}
class DoctorCountException extends Exception
{	

	private int det;
	DoctorCountException()
	{
		det = 4;
	}
	public String toString()
	{
		return "No more Doctors can be hired!!  " + " \n Exception" + det;
	}
}

class TechCountException extends Exception
{	

	private int det;
	TechCountException()
	{
		det = 5;
	}
	public String toString()
	{
		return "No more Technicians can be hired!!  " + " \n Exception" + det;
	}
}




/*END OF EXCEPTION				*/

class project
{
	public int patient_search_details(Patient[] pat,int np, String name) throws PatientNotFoundException
	{
		int flag = 0;
		int pos =0;
		for(int i = 0 ;i <np; i++)
    		{ 
    			if(pat[i].equals(name)
    			{
    				pos = i;
    				flag =1;
    				break;
    			}
    		}
    		if flag ==0
    			throw new PatientNotFoundException();
    		else
    			return pos;
        						        	
	}	
	public int doctor_search_details(Doctor[] doc,int nd, String name) throws DoctorNotFoundException
	{
		int flag = 0;
		int pos =0;
		for(int i = 0 ;i <np; i++)
    		{ 
    			if(doc[i].equals(name)
    			{
    				pos = i;
    				flag =1;
    				break;
    			}
    		}
    		if flag ==0
    			throw new DoctorNotFoundException();
    		else
    			return pos;
        						        	
	}	
	public void patient_count(int count,int np) throws PatientCountException
	{
		if(count == np)
			throw new PatientCountException();
	}
	public void doctor_count(int count,int nd) throws DoctorCountException
	{
		if(count == nd)
			throw new DoctorCountException();
	}
	public void tech_count(int count,int nt) throws TechCountException
	{
		if(count == nt)
			throw new TechCountException();
	}
				   
	public static void main(String args[])
	{	
		Project pro;
		Person per;
		Patient[] pat;
		Doctor[] doc;
		Technician[] tech;
		Hospital h;
		long int pn;
		int ndoc;
		int n_inp;
		int ntech;
		String name,title,DoB,gender,address,sick,aller,speciality,jdate,threat,dis_date;
		int exp,clearance;
		float sal;
		int id;
		int chocice;
		int pcount =0 , dcount= 0, tcount= 0;
		Scanner det = new Scanner(System.in);
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		System.out.println("*****************************************************WELCOME ********************************************");
		System.out.println("\n\n\n\n\n\n\n");
		System.out.pritln("Enter the name of the Hospital");
		name = det.next();
		System.out.println("Enter the address ");
		address=det.next();
		System.out.println("Enter phone number");
		pn = det.nextLong();
		System.out.println("Enter the number
		System.out.println("Enter Inpatient Capacity");
		n_inp = det.nextInt();
		System.out.println("Enter Doctor Capacity");
		ndoc = det.nextInt();
		System.out.println("Enter Technicians Capacity");
		ntech = det.nextInt();
		h = new Hospital(name,address,pn,nd,n_inp,ntech);
		pat = new Patient[n_inp];
		doc = new Doctor[ndoc];
		tech = new Technician[ntech];
		System.out.println("**********************************************************************************************************")'
		do
		{	
			System.out.println(" ************************Main Menu***********************");
			System.out.println("	1. Patient");
			System.out.println("	2. Staff  ");
			System.out.println("	3. Exit   ");
			System.out.println("	Enter choice");
			System.out.println("**********************************************************");
			choice = det.nextInt();
			switch(choice)
			{
				case 1: 
					int ch;
					System.out.println("**********************************************************");
					System.out.println(" 1. InPatient");
					System.out.println(" 2. OutPatient");
					System.out.println(" 3. Exit");
					System.out.println(" Enter Choice");
					ch = det.nextInt();
					System.out.println("**********************************************************");
					switch(ch)
					{
						case 1: 
						        System.out.println("Enter Patient ID");
						        id = det.nextInt();
						        System.out.println("Enter Patient Name");
						        name = det.next();
						        System.out.println("Date Of Birth (Format dd//mm/yyyy)");
						        DoB = det.next();
						        System.out.println("Gender");
						        gender = det.next();
						        System.out.println("Residential Address");
						        address = det.next();
						        System.out.println("Contact Number");
						        pn = det.nextLong();
						        System.out.println("Title if any *");
						        title= det.next();
						        System.out.println("Symptoms / Sickness ");
						        sickness = det.next();
						        System.out.println("Allergies");
						        allergy = det.next();
						        System.out.println("Life Threat Level ( 1 - 4 )");
						        threat = det.nextInt();
						        System.out.println("Enter Admission Date (dd mm yyyy");
						        jdate = det.next();
						        int no_of_drugs;
						        System.out.println("Enter Number of drugs");
						        no_of_drugs = det.nextInt();
						        System.out.println("Prescription");
						        String[] pres = new String[no_of_drugs];
						        for(int i=0;i<no_of_drugs ; i++)
						        	pres[i] = det.next();
						        pat[pcount] = new Patient(title,name,DoB,gender,address,id,sickness,allergy,pres,pn,threat,jdate);
						        pcount+=1;
						        try
						        {
						        	pro.patient_count(pcount,n_inp);
						        }
						        catch(Exception e)
						        {
						        	System.out.println(e);
						        }
						        		
						        break;
						case 2: 
						        System.out.println("Enter the Name of the person to be discharged");
						        name = det.next();
						        try
						        {
						        	int position = pro.patient_search(pat,n_inp,name);	
						        	System.out.println("Enter Discharge Date ( dd mm yyyy)");
						       	dis_date = det.next();
						       	per = pat[position];
						       	try {
	     							  Date start = myFormat.parse(pat[i].getJdate());
	      							  Date end = myFormat.parse(dis);
	      							  long difference = start.getTime() - end.getTime();
	      							  float daysBetween = (difference / (1000*60*60*24));
            							  pat[i].no_of_bed_days = daysBetween;
            							  pcount = pcount -1 ;
            						            n_inp = n_inp +1;						  
            							  pat[i].calBill(); 
	 						}
	 						catch (Exception e)
	 						//{ System.out.println("Days Calculated ! ");
						        }
						        catch(Exception e)
						        {
						        	System.out.println(e);
						        }
						        break;
					}
				
				case 2:
					int ch;
					System.out.println("**********************************************************");
					System.out.println(" 1. Doctor");
					System.out.println(" 2. Technician");
					System.out.println(" 3. Exit");
					System.out.println(" Enter Choice");
					ch = det.nextInt();
					System.out.println("**********************************************************");
					switch (ch)
					{
						
					   case 1:
					   	System.out.println(" 1. Create profile ");
						System.out.println(" 2. Display details ");
						System.out.println(" 3. Exit");
						System.out.println("  Enter choice " );
						int c = det.nextInt();
						switch(c)
						{
							case 1:
							        System.out.println("Enter Doctor Name");
							        name = det.next();
							        System.out.println("Date Of Birth (Format dd//mm/yyyy)");
							        DoB = det.next();
							        System.out.println("Gender ");
							        gender = det.next();
							        System.out.println("Residential Address");
							        address = det.next();
							        System.out.println("Contact Number");
							        pn = det.nextLong();
							        System.out.println("Experience");
							        exp =det.nextInt();
							        System.out.println("Speciality");
							        speciality = det.next()
							        System.out.println("Joining Date");
							        jdate = det.next();
							        System.out.println("Title");
							        title = det.next();
							        System.out.println("Salary");
							        salary = det.nextFloat();
							        System.out.println("How many certificates ?");
							        int cer =det.nextInt();
							        System.out.println("Enter Education Qualifications ");
							        String[] qual = new String[cer];
							        for(int i=0;i<cer;i++)
							        	qual[i]=det.next();
							        doc[dcount] = new Doctor(title,name,DoB,gender,address,pn,exp,speciality,qual,jdate,salary);							       
							        dcount+=1;
							       try
						       	         {
						        		pro.doctor_count(dcount,ndoc);
						        	         }
						       	      catch(Exception e)
						        		{
						       		 	System.out.println(e);
						       		}
						        	       break; 	
						        	       					        
							case 2:
								System.out.println("Enter Doctor name");
								name = det.next();
								try
								{
									int position = pro.doctor_search();
									per = doc[position];
									
								}
								catch(Exception e)
								{
									System.out.println(e);
								}
								break;
						}
					case 2:
					   	System.out.println(" 1. Create profile ");
						System.out.println(" 2. Display details ");
						System.out.println(" 3. Doctor Promotion");
						System.out.println(" 3. Exit");
						System.out.println("  Enter choice " );
						int c = det.nextInt();
						switch(c)
						{
							case 1:
							        System.out.println("Enter Technician Name");
							        name = det.next();
							        System.out.println("Date Of Birth (Format dd//mm/yyyy)");
							        DoB = det.next();
							        System.out.println("Gender ");
							        gender = det.next();
							        System.out.println("Residential Address");
							        address = det.next();
							        System.out.println("Contact Number");
							        pn = det.nextLong();
							        System.out.println("Experience");
							        exp =det.nextInt();
							        System.out.println("Joining Date");
							        jdate = det.next();
							        System.out.println("Title");
							        title = det.next();
							        System.out.println("Salary");
							        salary = det.nextFloat();
							        System.out.println("How many certificates ?");
							        int cer =det.nextInt();
							        System.out.println("Enter Education Qualifications ");
							        String[] qual = new String[cer];
							        System.out.println("Clearance (1-4)");
							        int cle = det.nextInt();
							        for(int i=0;i<cer;i++)
							        	qual[i]=det.next();
							        tech[tcount] = new Doctor(title,name,DoB,gender,address,pn,exp,qual,jdate,salary,cle);							       
							        tcount+=1;
							       try
						       	         {
						        		pro.tech_count(tcount,ntech);
						        	         }
						       	      catch(Exception e)
						        		{
						       		 	System.out.println(e);
						       		}
						        	       break; 	
						        	       					        
							case 2:
								System.out.println("Enter Technician name");
								name = det.next();
								try
								{
									int position = pro.tech_search();
									per = tech[position];
									
								}
								catch(Exception e)
								{
									System.out.println(e);
								}
								break;
							case 3: 	
								System.out.println("Enter Doctor name");
								name = det.next();
								try
								{
									int position = pro.doctor_search();
									per = doc[position];
									System.out.println("New Salary ");
									int sal = det.nextInt();
									doc[position].setSalary(sal);
									
								}
								catch(Exception e)
								{
									System.out.println(e);
								}
								
							    	
						}
					}
				}
			}
			
			while(choice != 3);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
