/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main{
    int age;
    String name;
    
    public void setage(int age){
        this.age=age;
    }
    
    public void setname(String name){
        this.name=name;
    }
    
    int getage(){
        return this.age;
    }
    String getname(){
        return this.name;
    }
	public static void main(String[] args) {
	    Main m1=new Main();
	    m1.setname("arpit");
	    m1.setage(21);
	    System.out.println(m1.getname()+ " " + m1.getage());
		
		}
	}
