package test.ioc;

public class IOC {

    public static void main(String args[]) {

        IOC ioc = new IOC();

        User user1 = new User(new MYSQL());
        User user2 = new User(new POSTGRESS());

        System.out.println("method end");
    }
}

class User{

    Database database;

    public User(Database database){
        this.database = database;
    }
}

interface Database{

}

class MYSQL implements Database{
    public MYSQL(){
        System.out.println("MYSQL Created");
    }
}

class POSTGRESS implements Database{
    public POSTGRESS(){
        System.out.println("POSTGRESS Created");
    }
}