
public class CalculatorTest2 {
    public static void main(String[] args) { 
        //Instantiate a Calculator2 object
        
        
        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party

        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */
        double person1 = 10;
        System.out.println(Calculator2.findtotal(person1));
        
        double person2 = 12;
        System.out.println(Calculator2.findtotal(person2));
        
        double person3 = 9;
        System.out.println(Calculator2.findtotal(person3));
        
        double person4 = 8;
        System.out.println(Calculator2.findtotal(person4));
        
        double person5 = 7;
        System.out.println(Calculator2.findtotal(person5));
        
        double person6 = 6;
        System.out.println(Calculator2.findtotal(person6));
        
        double person7 = 11;
        System.out.println(Calculator2.findtotal(person7));
        
        double person8 = 30;
        System.out.println(Calculator2.findtotal(person8));
    }
}
