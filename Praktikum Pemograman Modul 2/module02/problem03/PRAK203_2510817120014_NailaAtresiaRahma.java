package module02.problem03;

//di bariss ini terjadi error karnaa nama class tidak sesuai dengan nama object yg dibuat
//public class Employee {
public class PRAK203_2510817120014_NailaAtresiaRahma {
    public String name;
    //di bariss ini terjadi error karna tipee data 'char' nya cuma bisa menampung 1 karakter aja, sedangkan inputnya adalah string "Kingdom of Orvel"
    //public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    //baris ini ni terjadi error karenaa method yg setRole ga memiliki parameter, makanya variabel 'r' nya tu ga terdefinisi
    //public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}