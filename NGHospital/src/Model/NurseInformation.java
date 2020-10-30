/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class NurseInformation
{

   
    public String Name;
    public int Age;
    public String Expirence;
    public String Hospital;
    public String Telephone;
    private String password;

    public NurseInformation( String Name, int Age, String Experience, String Hospital,String Telephone,String password)
      {
        
        this.Name = Name;
        this.Age = Age;
        this.Expirence = Experience;
        this.Hospital = Hospital;
        this.Telephone = Telephone;
        this.password = password;
      }

    @Override
    public String toString()
      {
        String Details = "Nurse Name is" + this.Name + "Age is" + this.Age + "Experoence" + this.Expirence+ "Hospital" + this.Hospital+ "Telephone" + this.Telephone+this.password;
        return Details;
      }
 

}