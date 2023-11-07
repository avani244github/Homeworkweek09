package inheritance01;
/*Write a Java program to create a class called codebuster with a method called
groupName(). Create a subclass called codebusterGroups() that overrides the
groupName() method.*/
public class CodebusterGroup extends CodeBuster{
    public static void main(String[] args) {
CodebusterGroup m1 = new CodebusterGroup();
m1.groupname();
    }

    @Override
    public void groupname() {
        System.out.println("Code and Code");
    }
}
