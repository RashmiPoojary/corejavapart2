package java.oops;
		class Parent 
		{
		    void displayString()
		    {
		        System.out.println("Parent class called");
		    }
		}
		class Child extends Parent 
		{
		    @Override
		    void displayString()
		    {
		        System.out.println("Child class called");
		    }
		}
		public class MethodOverriding 
		{ 
		    public static void main(String[] args)
		    {
		        Parent obj1 = new Parent();
		        obj1.displayString();
		        Parent obj2 = new Child();
		        obj2.displayString();
		    }
		}
