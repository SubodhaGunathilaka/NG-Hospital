
package Model;

public class DonorInformation 
{
    public String Fname;
    public String Sname;
    public int Dateofbirthday;
    public String Country;
    public String Email;
    public int Telephone;
    public String Bloodgroup;
    public String Address;

    public DonorInformation(String Fname, String Sname, int Dateofbirthday, int Age, String Country, String Email, int Telephone, String Bloodgroup, String Address) 
    {
        
        this.Fname = Fname;
        this.Sname = Sname;
        this.Dateofbirthday = Dateofbirthday;
        this.Country = Country ;
        this.Email = Email;
        this.Telephone = Telephone;
        this.Bloodgroup = Bloodgroup;
        this.Address = Address;
    }

    @Override
    public String toString() 
    {
        String details =  "First name" + this.Fname + "Surname" + this.Sname + "Date of Birthday" + this.Dateofbirthday  + "Country" +this.Country + "Email" + this.Email + "Telephone" + this.Telephone + "Bloodgroup" + this.Bloodgroup + "Address"+ this.Address;
        return details;
    }
}