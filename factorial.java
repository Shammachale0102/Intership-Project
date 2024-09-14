package logicalpor;

public class factorial {

int a=6,c=1;
   void fac() {
      for (int i=1;i<=a;i++) {
	    c=c*i;
     }
System.out.println(c);
}
public static void main(String []args) {
	factorial s=new factorial();
	s.fac();
}

	

}
