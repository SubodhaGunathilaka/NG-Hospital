
package Model;
public class PatientInformation
{
  
   public String Fname;
   public String Sname;
   public int DOB;
   public String Gender;
   public String Description;
   public int Telephone;
   public String BloodGroup;
   public String Address;
   public String Email;

    public PatientInformation(String Fname, String Sname, int DOB, String Gender,String Description, int Telephone, String BloodGroup, String Address, String Email)
      {
       
        this.Fname = Fname;
        this.Sname = Sname;
        this.DOB = DOB;
        this.Gender = Gender;
        this.Description = Description;
        this.Telephone = Telephone;
        this.BloodGroup = BloodGroup;
        this.Address = Address;
        this.Email = Email;
      }
   
   @Override
   public String toString() {
       String Details =  "First Name " + this.Fname + "Surname " + this.Sname + "Gender " +this.Gender + "Description " + this.Description + "Telephone " + this.Telephone + "Bloodgroup" + this.BloodGroup + "Address" + this.Address;
       return Details;
   }
   
}