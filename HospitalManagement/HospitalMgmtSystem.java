//Start of Code

import java.io.*;
import java.util.*;

public class HospitalMgmtSystem
{
    public static void main(String args[]) throws IOException
    {
        String months[] = {

                "Jan",
                "Feb",
                "Mar",
                "Apr",

                "May",
                "Jun",
                "Jul",
                "Aug",

                "Sep",
                "Oct",
                "Nov",
                "Dec"
        };

        Calendar calendar = Calendar.getInstance();

        int count1 = 1, count2 = 1, count3 = 1, count4 = 1, count5 = 1, count6 = 1;

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println(" *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
	
		
        doctor[] d = new doctor[25];
        patient[] p = new patient[100];
        lab[] l = new lab[20];
        fecility[] f = new fecility[20];
        medical[] m = new medical[100];
        staff[] s = new staff[100];

        int i;

        for (i = 0; i < 25; i++)

            d[i] = new doctor();
        
        for (i = 0; i < 100; i++)

            p[i] = new patient();
        
        for (i = 0; i < 20; i++)

            l[i] = new lab();

        for (i = 0; i < 20; i++)

            f[i] = new fecility();

        for (i = 0; i < 100; i++)

            m[i] = new medical();

        for (i = 0; i < 100; i++)

            s[i] = new staff();
	
	        Scanner input = new Scanner(System.in);
	
	        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
	
	        while (status == 1)
	
	        {
	            System.out.println("\n MAIN MENU");
	            System.out.println("-----------------------------------------------------------------------------------");
	            System.out.println("1.Doctors 2. Patients 3.Medicines 4.Laboratories 5. Facilities 6. Staff ");
	            System.out.println("-----------------------------------------------------------------------------------");
	
	            choice = input.nextInt();
	            switch (choice)
	            {
	
	                case 1:
	
	                {
	                    System.out.println("--------------------------------------------------------------------------------");
	                    System.out.println(" **DOCTOR SECTION**");
	                    System.out.println("--------------------------------------------------------------------------------");
	
	                    s1 = 1;
	
	                    while (s1 == 1)
	                    {
	                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
	                        c1 = input.nextInt();
	                        switch (c1)
	
	                        {
	                            case 1:
	                            {
	                                d[count1].new_doctor();
	                            }
	                            break;
	                            
	                            case 2:
	                            {
	                                System.out.println("--------------------------------------------------------------------------------");
	                                System.out.println("id \t Name\t Specialist \t Timing \t Qualification \t Room No.");
	                                System.out.println("--------------------------------------------------------------------------------");
	                        			
	                        			for (int doc = 0; doc < count1; doc++)
		                                {

	                        					d[doc].doctor_info();
		                                }     
	                            }
	                        }
	                            
	                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	                        s1 = input.nextInt();
	                    }
   
	                    break;
	                }
	                
	                case 2:

	                {
	                    System.out.println("--------------------------------------------------------------------------------");
	                    System.out.println(" **PATIENT SECTION**");
	                    System.out.println("--------------------------------------------------------------------------------");

	                    s2 = 1;

	                    while (s2 == 1)
	                    {
	                        System.out.println("1.Add New Entry\n2.Existing Patients List");
	                        c1 = input.nextInt();
	                        switch (c1)
	                        {
	                            case 1:
	                            {
	                                p[count2].new_patient();
	                            }
	                            break;

	                            case 2:
	                            {
	                                System.out.println("--------------------------------------------------------------------------------");
	                                System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
	                                System.out.println("--------------------------------------------------------------------------------");
	                                
	                                
                        			for (int pat = 0; pat < count1; pat++)
	                                {
	                                	p[pat].patient_info();
	                                }   
	                            }
	                        }

	                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	                        s2 = input.nextInt();
	                    }
	                    break;
	                }
	                
	                case 3:
	                {
	                    s3 = 1;

	                    System.out.println("--------------------------------------------------------------------------------");
	                    System.out.println(" **MEDICINE SECTION**");
	                    System.out.println("--------------------------------------------------------------------------------");

	                    while (s3 == 1)
	                    {
	                        System.out.println("1.Add New Entry\n2.Existing Medicines List");
	                        c1 = input.nextInt();

	                        switch (c1)
	                        {

	                            case 1:
	                            {
	                                m[count3].new_medi();
	                            }
	                            break;

	                            case 2:
	                            {
	                                System.out.println("--------------------------------------------------------------------------------");
	                                System.out.println("Name \t Company \t Expiry Date \t Cost");
	                                System.out.println("--------------------------------------------------------------------------------");

	                                for (j = 0; j < count3; j++) {
	                                    m[j].find_medi();
	                                }
	                            }

	                        }
	                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	                        s3 = input.nextInt();
	                    }
	                    break;
	                }

	                case 4:

	                {
	                    s4 = 1;

	                    System.out.println("--------------------------------------------------------------------------------");
	                    System.out.println(" **LABORATORY SECTION**");
	                    System.out.println("--------------------------------------------------------------------------------");

	                    while (s4 == 1)

	                    {
	                        System.out.println("1.Add New Entry \n2.Existing Laboratories List");
	                        c1 = input.nextInt();

	                        switch (c1)

	                        {
	                            case 1:
	                            {
	                                l[count4].new_feci();
	                            }
	                            break;

	                            case 2:

	                            {
	                                System.out.println("--------------------------------------------------------------------------------");
	                                System.out.println("Fecilities\t\t Cost");
	                                System.out.println("--------------------------------------------------------------------------------");

	                                for (j = 0; j < count4; j++) {
	                                    l[j].feci_list();
	                                }
	                                break;
	                            }
	                        }

	                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	                        s4 = input.nextInt();
	                    }
	                    break;
	                }

	                case 5:

	                {
	                    s5 = 1;

	                    System.out.println("--------------------------------------------------------------------------------");
	                    System.out.println(" **HOSPITAL FACILITY SECTION**");
	                    System.out.println("--------------------------------------------------------------------------------");

	                    while (s5 == 1)

	                    {
	                        System.out.println("1.Add New Facility\n2.Existing Fecilities List");
	                        c1 = input.nextInt();

	                        switch (c1)

	                        {
	                            case 1:
	                            {
	                                f[count5].add_feci();
	                            }
	                            break;

	                            case 2:
	                            {

	                                System.out.println("--------------------------------------------------------------------------------");
	                                System.out.println("Hospital Facility are:");
	                                System.out.println("--------------------------------------------------------------------------------");

	                                for (j = 0; j < count5; j++) {
	                                    f[j].show_feci();
	                                }
	                                break;
	                            }
	                        }
	                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	                        s5 = input.nextInt();
	                    }
	                    break;
	                }

	                case 6:

	                {
	                    s6 = 1;

	                    System.out.println("--------------------------------------------------------------------------------");
	                    System.out.println(" **STAFF SECTION**");
	                    System.out.println("--------------------------------------------------------------------------------");

	                    while (s6 == 1)

	                    {
	                        System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
	                        c1 = input.nextInt();

	                        switch (c1)

	                        {
	                            case 1:
	                            {
	                                s[count6].new_staff();
	                            }
	                            
	                            break;

	                            case 2:
	                            {
	                                System.out.println("--------------------------------------------------------------------------------");
	                                System.out.println("id \t Name \t Gender \t Salary");
	                                System.out.println("--------------------------------------------------------------------------------");

	                                for (j = 0; j < count6; j++)
	                                {
	                                        s[j].nurse_info();
	                                }
	                                
	                                
	                                break;
	                            }

	                            case 3:
	                            {
	                                System.out.println("--------------------------------------------------------------------------------");
	                                System.out.println("id \t Name \t Gender \t Salary");
	                                System.out.println("--------------------------------------------------------------------------------");

	                                for (j = 0; j < count6; j++)
	                                {
	                                        s[j].worker_info();
	                                }
	                                break;
	                            }
	                            case 4:
	                            {
	                                System.out.println("--------------------------------------------------------------------------------");
	                                System.out.println("id \t Name \t Gender \t Salary");
	                                System.out.println("--------------------------------------------------------------------------------");

	                                for (j = 0; j < count6; j++)
	                                {
	                                        s[j].security_info();
	                                }
	                                break;
	                            }
	                        }
	                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	                        s6 = input.nextInt();
	                    }
	                    break;
	                }
	
	                default:
	                {
	                    System.out.println(" You Have Enter Wrong Choice!!!");
	                }
	            }
	
	            System.out.println("\nReturn to MAIN MENU Press 1");
	
	            status = input.nextInt();
        }
    }
}

/* Hospital Management System Project in Java with Source Code PDF Visit for more https://www.programmingwithbasics.com/ */

class doctor

{
    String fileName = "HospitalLists\\doctors.txt";
    String did, dname, specilist, appoint, doc_qual, droom;
    int count1 = 1;

    void new_doctor() throws IOException
    {
		
		try {
			
			FileWriter fw = new FileWriter(fileName, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("id:-");
	        did = input.nextLine();

	        System.out.print("name:-");
	        dname = input.nextLine();

	        System.out.print("specilization:-");
	        specilist = input.nextLine();

	        System.out.print("work time:-");
	        appoint = input.nextLine();

	        System.out.print("qualification:-");
	        doc_qual = input.nextLine();

	        System.out.print("room no.:-");
	        droom = input.nextLine();
	        
	        pw.println("");
			pw.print(did + " " + dname + " " + specilist + " " + appoint + " " + doc_qual + " " + droom);
			pw.flush();
			pw.close(); 
		
		}
		
		catch (Exception e) {
			System.out.println("Wrong writen file.");
		}
		
    }

    void doctor_info() throws FileNotFoundException

    {
    	
    	FileReader fr = new FileReader(fileName);
    	List<String> data= new ArrayList<>();
    	BufferedReader br= new BufferedReader(fr);

    	String row;
    	
    	try {
    		
    		while((row = br.readLine())!=null) {
    			data.add(row);	
    		}
    	}
    	catch (Exception e) {
    		
    	}
    	
    	for(int i = 0; i<data.size(); i++){
			
			String strToParse = data.get(i);
			Scanner sc = new Scanner(strToParse);
			
			sc.useDelimiter(" ");
			String[] rowData = new String[6];
			try {
				
				for(int j = 0; j<rowData.length; j++) {
					rowData[j] = sc.next();
					}
    			}
			
			catch (Exception e) {
			}
    	}
   }
}

class patient

{	
    String fileName = "HospitalLists\\patients.txt";
    String pid, pname, disease, sex, admit_status;
    String age;
    void new_patient() throws IOException

    {

		FileWriter fw = new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        pid = input.nextLine();

        System.out.print("name:-");
        pname = input.nextLine();

        System.out.print("disease:-");
        disease = input.nextLine();

        System.out.print("sex:-");
        sex = input.nextLine();

        System.out.print("admit_status:-");
        admit_status = input.nextLine();

        System.out.print("age:-");
        age = input.nextLine();
        
        pw.println("");
		pw.print(pid + " " + pname + " " + disease + " " + sex + " " + admit_status + " " + age);
		pw.flush();
		pw.close(); 

    }

    void patient_info() throws FileNotFoundException
    {
    	
		FileReader fr = new FileReader(fileName);
    	List<String> data= new ArrayList<>();
    	BufferedReader br= new BufferedReader(fr);
    	
    	String row;
    	
		try {
			
			while((row = br.readLine())!=null) {
				data.add(row);	
			}
		}
		catch (Exception e) {
			
		}
		
		for(int i = 0; i<data.size(); i++){
			
			String strToParse = data.get(i);
			Scanner sc = new Scanner(strToParse);
			
			sc.useDelimiter(" ");
			String[] rowData = new String[6];
			try {
				
				for(int j = 0; j<rowData.length; j++) {
					rowData[j] = sc.next();
					}
    			}
			
			catch (Exception e) {
			}
			
			System.out.println(rowData[0] + "\t" + rowData[1] + " \t" + rowData[2] + 
					" \t" + rowData[3] + " \t" + rowData[4] + " \t" + rowData[5]);
		}
    }
}

class medical

{
    String fileName = "HospitalLists\\medical.txt";
    String med_name, med_comp, exp_date, med_cost, count;;

    void new_medi() throws IOException
    {
    	
		FileWriter fw = new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);

        Scanner input = new Scanner(System.in);

        System.out.print("name:-");
        med_name = input.nextLine();

        System.out.print("comp:-");
        med_comp = input.nextLine();

        System.out.print("exp_date:-");
        exp_date = input.nextLine();

        System.out.print("cost:-");
        med_cost = input.nextLine();

        System.out.print("no of unit:-");
        count = input.nextLine();
        
        pw.println("");
		pw.print(med_name + "," + med_comp + "," + exp_date + "," + med_cost + "," + count);
		pw.flush();
		pw.close(); 

    }

    void find_medi() throws FileNotFoundException
    {
		FileReader fr = new FileReader(fileName);
    	List<String> data= new ArrayList<>();
    	BufferedReader br= new BufferedReader(fr);
    	
    	String row;
    	
		try {
			
			while((row = br.readLine())!=null) {
				data.add(row);	
			}
		}
		catch (Exception e) {
			
		}
		
		for(int i = 0; i<data.size(); i++){
			
			String strToParse = data.get(i);
			Scanner sc = new Scanner(strToParse);
			
			sc.useDelimiter(",");
			String[] rowData = new String[6];
			try {
				
				for(int j = 0; j<rowData.length; j++) {
					rowData[j] = sc.next();
					}
    			}
			
			catch (Exception e) {
			}
			
			System.out.println(rowData[0] + "\t" + rowData[1] + " \t" + rowData[2] + 
					" \t" + rowData[3] + " \t" + rowData[4]);
		}
    }
}

class lab

{
    String fileName = "HospitalLists\\lab.txt";
    String fecility, lab_cost;
    
    void new_feci() throws IOException
    {
		FileWriter fw = new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
        Scanner input = new Scanner(System.in);

        System.out.print("fecility:-");
        fecility = input.nextLine();

        System.out.print("cost:-");
        lab_cost = input.nextLine();
        
        pw.println("");
		pw.print(fecility + "," + lab_cost);
		pw.flush();
		pw.close(); 

    }

    void feci_list() throws FileNotFoundException
    {
		FileReader fr = new FileReader(fileName);
    	List<String> data= new ArrayList<>();
    	BufferedReader br= new BufferedReader(fr);
    	
    	String row;
    	
		try {
			
			while((row = br.readLine())!=null) {
				data.add(row);	
			}
		}
		catch (Exception e) {
			
		}
		
		for(int i = 0; i<data.size(); i++){
			
			String strToParse = data.get(i);
			Scanner sc = new Scanner(strToParse);
			
			sc.useDelimiter(",");
			String[] rowData = new String[6];
			try {
				
				for(int j = 0; j<rowData.length; j++) {
					rowData[j] = sc.next();
					}
    			}
			
			catch (Exception e) {
			}
			
			System.out.println(rowData[0] + "\t\t\t" + rowData[1]);
		}

    }
}

class fecility //Sorry Facility but do not change the name

{
    String fileName = "HospitalLists\\facility.txt";
    String fec_name;
    
    void add_feci() throws IOException

    {
    	FileWriter fw = new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
        Scanner input = new Scanner(System.in);

        System.out.print("fecility:-");
        fec_name = input.nextLine();
        
        pw.println("");
		pw.print(fec_name);
		pw.flush();
		pw.close();
		
    }

    void show_feci() throws FileNotFoundException
    {
    	
		FileReader fr = new FileReader(fileName);
		List<String> data= new ArrayList<>();
		BufferedReader br= new BufferedReader(fr);
		
		String row;
		
		try {
			
			while((row = br.readLine())!=null) {
				data.add(row);	
			}
		}
		catch (Exception e) {
			
		}
		
		for(int i = 0; i<data.size(); i++){
			
			String strToParse = data.get(i);
			Scanner sc = new Scanner(strToParse);
			
//			sc.useDelimiter(",");
			String[] rowData = new String[6];
			try {
				
				for(int j = 0; j<rowData.length; j++) {
					rowData[j] = sc.next();
					}
				}
			
			catch (Exception e) {
			}
			
			System.out.println(rowData[0]);
		}
    }
}

class staff
{
    String fileName = "HospitalLists\\staff.txt";
    String sid, sname, desg, sex, salary;
    
    void new_staff() throws IOException
    {
    	FileWriter fw = new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
        Scanner input = new Scanner(System.in);
        
        System.out.print("id:-");
        sid = input.nextLine();

        System.out.print("name:-");
        sname = input.nextLine();

        System.out.print("desigination:-");
        desg = input.nextLine();

        System.out.print("sex:-");
        sex = input.nextLine();

        System.out.print("salary:-");
        salary = input.nextLine();
        
        pw.println("");
		pw.print(sid + "," + sname + "," + desg + "," + sex + "," + salary);
		pw.flush();
		pw.close();
		
    }

    void nurse_info() throws FileNotFoundException
    {		
    	FileReader fr = new FileReader(fileName);
		List<String> data= new ArrayList<>();
		BufferedReader br= new BufferedReader(fr);
		
		String row;
		
		try {
			
			while((row = br.readLine())!=null) {
				data.add(row);	
			}
		}
		catch (Exception e) {
			
		}
		
		for(int i = 0; i<data.size(); i++){
			
			String strToParse = data.get(i);
			Scanner sc = new Scanner(strToParse);
			
			sc.useDelimiter(",");
			String[] rowData = new String[6];
			try {
				
				for(int j = 0; j<rowData.length; j++) {
					rowData[j] = sc.next();
					}

				}
			
			catch (Exception e) {
			}
			
				sid = rowData[0];
				sname = rowData[1];
				desg = rowData[2];
				sex = rowData[3];
				salary = rowData[4];
			
				if(desg.equals("nurse") || desg.equals("Nurse")) {
					System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
				}
		}
    }

	void worker_info() throws FileNotFoundException
	{		
		FileReader fr = new FileReader(fileName);
		List<String> data= new ArrayList<>();
		BufferedReader br= new BufferedReader(fr);
		
		String row;
		
		try {
			
			while((row = br.readLine())!=null) {
				data.add(row);	
			}
		}
		catch (Exception e) {
			
		}
		
		for(int i = 0; i<data.size(); i++){
			
			String strToParse = data.get(i);
			Scanner sc = new Scanner(strToParse);
			
			sc.useDelimiter(",");
			String[] rowData = new String[6];
			try {
				
				for(int j = 0; j<rowData.length; j++) {
					rowData[j] = sc.next();
					}
	
				}
			
			catch (Exception e) {
			}
			
				sid = rowData[0];
				sname = rowData[1];
				desg = rowData[2];
				sex = rowData[3];
				salary = rowData[4];
			
				if(desg.equals("worker") || desg.equals("Worker")) {
					System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
				}
		}
	}
	
	void security_info() throws FileNotFoundException
	{		
		FileReader fr = new FileReader(fileName);
		List<String> data= new ArrayList<>();
		BufferedReader br= new BufferedReader(fr);
		
		String row;
		
		try {
			
			while((row = br.readLine())!=null) {
				data.add(row);	
			}
		}
		catch (Exception e) {
			
		}
		
		for(int i = 0; i<data.size(); i++){
			
			String strToParse = data.get(i);
			Scanner sc = new Scanner(strToParse);
			
			sc.useDelimiter(",");
			String[] rowData = new String[6];
			try {
				
				for(int j = 0; j<rowData.length; j++) {
					rowData[j] = sc.next();
					}
	
				}
			
			catch (Exception e) {
			}
			
				sid = rowData[0];
				sname = rowData[1];
				desg = rowData[2];
				sex = rowData[3];
				salary = rowData[4];
			
				if(desg.equals("security") || desg.equals("Security")) {
					System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
				}
		}
	}
}
//End of Code
