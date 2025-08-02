//In This program has main class of our project which has all object creation mutliple cases present 
//example--->

import java.util.Scanner;
public class MainApp
{
    public static void main (String[] args)
    {
        PatientDAO dao=new PatientDAO();
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("\n 1.Add Patient \n 2.View Patient \n 3.Update Patient \n 4.Delete Patient \n 5.Exit");
            int choice =sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter Your Name : ");
                    String name=sc.next();
                    System.out.print("Enter Your Age : ");
                    int age=sc.nextInt();
                    System.out.print("Enter EEG of Patient : ");
                    double eeg=sc.nextDouble();

                    System.out.print("Enter Symtoms of Patients : ");
                    String symtoms=sc.next();

                    Patient p=new Patient();

                    p.setName(name);
                    p.setAge(age);
                    p.setEeg(eeg);
                    p.setSymtoms(symtoms);
                    dao.addPatient(p);
                    break;
                }
                case 2:
                {
                    dao.viewPatient();
                    break;
                }
                case 3:
                {
                    System.out.print("Enter which id you want to update : ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter your Updated name : ");
                    String newNew=sc.next();
                    System.out.print("Enter your Upadated Age : ");
                    int newAge=sc.nextInt();
                    System.out.print("Enter your Updated Eeg of Patient : ");
                    double newEeg=sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Your New Symtoms of Patients : ");
                    String newSymtoms=sc.nextLine();

                    Patient p=new Patient();

                    p.setId(id);
                    p.setName(newNew);
                    p.setAge(newAge);
                    p.setEeg(newEeg);
                    p.setSymtoms(newSymtoms);


                    dao.updatePatient(p);
                    break;
                }
                case 4:
                {
                    System.out.print("Enter Which id you want to Delete : ");
                    int id =sc.nextInt();
                    sc.nextLine();
                    dao.deletePatient(id);
                    break;
                }
                case 5:
                {
                    System.out.println("Are you want to EXIT (Y/N)");
                    String ip=sc.next();
                    if(ip.equalsIgnoreCase("N"))
                    {
                       continue;
                    }
                    return;
                }
                default:
                {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}

