/*
 * "Starting out with java"
 * chapter 3  Page 178
 * Problem 3
 * 
 * for practice
 */
package personalinfopractice;

/**
 *
 * @author Kyle Raymond
 */
public class PersonalInfoPractice 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        PersonInfo dude = new PersonInfo();
        
        dude.SetName("Johnny S. Toner");
        dude.SetAddress("404 Whatever Street");
        dude.SetAge(26);
        dude.SetPhoneNumber("343-555-6969");
        
        PersonInfo oldFart = new PersonInfo("Mr. Crabby B. Ottum", 
                "105 Gitoffmylawn Avenue", 75, "111-222-1234");
        
        dude.SetCatchPhrase("Whoa, Dude.");
        
        oldFart.SetCatchPhrase("Why in my day...");
        
        System.out.println("Let me tell you a story.");
        System.out.println("There was once an elderly man named " + oldFart.GetName() +".");
        System.out.println("He lived on " + oldFart.GetAddress() + ", and was busy trying to solve a crossword puzzle.");
        System.out.println("Meanwhile, in the distant land called " + dude.GetAddress() + ", a crazy, impossible plot was being hatched to order ");
        
    }
}
