public class nada{
    public static void main (String[] args){
        nada nada = new nada();
        nada.printName();
        nada.printMajor();
        nada.printYear();
        nada.printHobbies();
        nada.add(5, 6);
    }

    public void printName(){
        System.out.println("Nada Ahmed Elghnam");
    }

    public void printMajor(){
        System.out.println("Computer Science");
    }

    public void printYear(){
        System.out.println("Senior");
    }

    public void printHobbies(){
        System.out.println("Reading, Writing, and Drawing");
    }

    public  void add(int a, int b){
        System.out.println(a+b);
    }
}