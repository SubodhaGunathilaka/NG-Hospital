package Model;

public class DoctorInformation
{
    
    public String Name;
    public int Age;
    public String Experience;
    public String Specialization;
    public String Hospital;
    public String Telephone;
    public String Email ;
    private String password;

    public DoctorInformation(String ID, String Name, int Age, String Experience, String Specialization, String Hospital, String Telephone,String Email, String password)
      {
        
        this.Name = Name;
        this.Age = Age;
        this.Experience = Experience;
        this.Specialization = Specialization;
        this.Hospital = Hospital;
        this.Telephone = Telephone;
        this.Email = Email ;
        this.password = password;
      }

    public DoctorInformation(String Name, int Age, String Expirence, String Specialization, String Hospital, String Telephone, String Email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString()
      {
        String Details = "Doctor is " + this.Name + "Specialization is " + this.Specialization + "Hospital is " + this.Hospital + "Contact number is " + this.Telephone;
        return Details;
      }
    
    
}