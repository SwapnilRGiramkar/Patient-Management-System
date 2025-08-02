//In this proggram we create blue-print of patient with Constructor and getter nd setter methods
//exampe--->


public class Patient
{
   private int id;
   private String name;
   private int age;
   private double eeg;
   private String symtoms;

   //No argument Constructor
   public Patient()
   {

   }
   //parameterized Constructor
   public Patient(int id,String name,int age,double eeg,String symtoms)
   {
       this.id=id;
       this.name=name;
       this.age=age;
       this.eeg=eeg;
       this.symtoms=symtoms;
   }

   //setter methods
   public int getId()
   {
       return id;
   }
   public String getName()
   {
       return name;
   }
   public int getAge()
   {
       return age;
   }
   public double getEeg()
   {
       return eeg;
   }
   public String getSymtoms()
   {
       return symtoms;
   }

   //setter methods

    public double setEeg(double eeg)
    {
        this.eeg=eeg;
        return eeg;
    }
    public int setId(int id)
    {
        this.id=id;
        return id;
    }
    public String setName(String name)
    {
        this.name=name;
        return name;
    }
    public int  setAge(int age)
    {
        this.age=age;
        return age;
    }

    public String setSymtoms(String symtoms)
    {
        this.symtoms=symtoms;
        return symtoms;
    }
}
