package DesignPatterns.ProxyDesignPattern;

public class ProxyMainClass {
    public static void mainCl(){
        try{
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.create("USER", new EmployeeDo());
            System.out.println("Operation successful");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
