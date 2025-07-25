package oops.Interfaces;

interface Member{
    void callBack();
}

class Store{
    Member members[]= new Member[10];
    int count=0;

    void register(Member m){
        members[count++]=m;
    }

    void inviteSale(){
        for(int i=0; i<count; i++){
            members[i].callBack();
        }
    }
}

class Customer implements Member{
    String name;

    public Customer(String name){
        this.name=name;
    }
    @Override
    public void callBack(){
        System.out.println("Ok, I will visit, "+name);
    }
}

public class InterfaceDemo3 {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Mayank");
        Customer c2 = new Customer("Keshav");

        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }
}
