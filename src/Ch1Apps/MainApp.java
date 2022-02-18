/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch1Apps;

/**
 *
 * @author aashgar
 */
public class MainApp {
    public static void main(String[] args) {
        Double data[]= {1.0, 3.0, 5.0 , 7.0 , 9.0};
        show(data);
        Person persons[] = {
            new Student("Ahmad", "SE", 90.0),
            new Employee("Ali", "Sales", 1200.0),
            new Student("Huda", "CS", 88.8)
            
        };
        show(persons);
        
        Authenticate<Boolean, String> authenticate = 
                (userName, password) -> {
                    if(userName.equals("aashgar") && password.equals("12345"))
                        return true;
                    else 
                        return false;
                };
        
        System.out.println(authenticate.check("aashgar", "12345"));
    }
    
    private static <T> void show(T data[]){
        for(T d: data)
            System.out.println(d);
    }
    
    private interface Authenticate<B,T>{
        B check(T value1, T value2);
    }
}
