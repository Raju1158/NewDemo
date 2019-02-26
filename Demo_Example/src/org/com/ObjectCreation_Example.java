package org.com;

public class ObjectCreation_Example {
   String mes="My First Best Example..!!";
   String name = "GeeksForGeeks";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectCreation_Example obj=new ObjectCreation_Example();//Using new keyword
		System.out.println(obj.mes);
		// using new Instance
		try {
			Class cls = Class.forName("ObjectCreation_Example");
			ObjectCreation_Example obj1;
			obj1 = (ObjectCreation_Example) cls.newInstance();
			System.out.println(obj1.name);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
