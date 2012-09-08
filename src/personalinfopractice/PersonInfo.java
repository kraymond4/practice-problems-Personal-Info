/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personalinfopractice;

/**
 *
 * @author Kyle Raymond
 */
public class PersonInfo 
{
    private String name;
    private String address;
    private int age;
    private String phoneNum;
    
    public PersonInfo ()
    {
        name = "";
        address = "";
        age = 0;
        phoneNum = "000-000-0000";
        
    }
    
    public void SetName(String name)
    {
        this.name = name;
    }
    
    public String GetName()
    {
        return name;
    }
    
    
    public void SetAddress(String address)
    {
        this.address = address;
    }
    
    public String GetAddress()
    {
        return address;
    }
    
    
    public void SetAge(int age)
    {
        this.age = age;
    }
    
    public int GetAge()
    {
        return age;
    }
    
    
    public void SetPhoneNumber(String phone)
    {
        this.phoneNum = phone;
    }
    
    public String GetPhoneNumber()
    {
        return phoneNum;
    }
}
