class library{
      String username;
      int collectingdate;
      int returningdate;
      private int password;  
     String bookname;
     String bookname2;

public library (String bookname, String bookname2,int pass)
{
this.bookname= bookname;
this.bookname2 =bookname2;
this.password=pass;
}
int gtter(){
    return password;
}
void details(String username,int collectingdate,int returningdate)
{
System.out.println("user details list");
this.username=username;
this.collectingdate=collectingdate;
this.returningdate=returningdate;
System.out.println(username+" "+collectingdate+" "+returningdate);
}
}
 class inherited extends library{
    int password;   
    inherited(String nam1, String name2,int pass){
        super(nam1,name2,pass);
        // this.password=super.password;
        this.password=gtter();
    }
    void print(){
        System.out.println("passwor"+password);
    }
 }
public class getter{

public static void main(String[] args)
{
library l=new library("political science","economics",12);

l.details("gracy", 23,02);
l.details("divaina",04,06);

inherited a1= new inherited("yes","he is scientist",12);
a1.print();
           

}
}