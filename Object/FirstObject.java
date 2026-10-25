package Object;

public class FirstObject {
        int MobileNum;
        String name,age;
        void setInformation(String n,String ag,int ph){
            name=n;
            age=ag;
            MobileNum=ph;
        }
        void printInformation(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(MobileNum);
            System.out.println();
        }
        FirstObject(String n,String ag,int ph){
            name=n;
            age=ag;
            MobileNum=ph;
        }
    }
   
