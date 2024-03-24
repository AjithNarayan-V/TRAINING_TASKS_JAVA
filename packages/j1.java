package packages;
class library{
      String username;
      int collectingdate;
      int returningdate;
      private int password;  
     String bookname;
     String bookname2;

public library (String bookname, String bookname2)
{
this.bookname= bookname;
this.bookname2 =bookname2;
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
    inherited(String nam1, String name2){
        super(nam1,name2);
        // this.password=super.password;
        this.password=gtter();
    }
 }
public class j1{

public static void main(String[] args)
{
library l=new library("political science","economics");

l.details("gracy", 23,02);
l.details("divaina",04,06);
library l1= new library("Indian article 1456","Indian article 1456");
inherited b1=new inherited("gracious","gracy");
inherited a1= new inherited("yes","he is scientist");
           

}
}