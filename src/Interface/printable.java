package Interface;

public interface printable {
    void a();
    void b();
    void d();
}


class M implements printable{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
}

class Test5{
    public static void main(String args[]){
        M a=new M();
        a.a();
        a.b();

        a.d();
    }}

