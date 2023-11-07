package inheritance01;
/*Write a Java program to create a class called codebuster with a method called
groupName(). Create a subclass called codebusterGroups() that overrides the
groupName() method.*/

public class CodeBuster {
    public void groupname(){
        String a = "Codebuster";
        System.out.println(a);
    }

    public static void main(String[] args) {
        CodeBuster x1 = new CodeBuster();
        x1.groupname();
    }
}
