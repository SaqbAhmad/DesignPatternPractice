package designPattern.singletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

class SingletonClass implements Cloneable{
	private static SingletonClass singletonClass;
	private SingletonClass() {
		if(singletonClass!=null) {
			throw new RuntimeException("You are trying to break the singleton pattern.. ");
		}
	}
	public static SingletonClass getInstance() {
		if(singletonClass==null) {
			singletonClass= new SingletonClass();
		}
		return singletonClass;
	}
	public void sayHello() {
		System.out.println("Welcome to design pattern learning saquib bro... ");
	}
	
	public Object clone() throws CloneNotSupportedException{
	    return singletonClass;
	}
	
}
//enum SingletonClass{
//	INSTANCE
//}



public class BreakSingletonPattern {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
        
//		SingletonClass obj1 = SingletonClass.getInstance();
//		SingletonClass obj2 = SingletonClass.getInstance();
//
//	    System.out.println(obj1.hashCode());
//	    System.out.println(obj2.hashCode());
//	    // We can break the singleton desing pattern using reflection api. 
//	    Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
//	    constructor.setAccessible(true);
//	    SingletonClass obj3 = constructor.newInstance();
//	    System.out.println(obj3.hashCode());
////        obj1.sayHello();
////        obj2.sayHello();
////        obj3.sayHello();
//		SingletonClass obj = SingletonClass.INSTANCE;
//		System.out.println(obj);
//	    Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
//	    constructor.setAccessible(true);
//	    SingletonClass obj3 = constructor.newInstance();
//	    System.out.println(obj3.hashCode());
				        
		SingletonClass obj1 = SingletonClass.getInstance();
	//	System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
		
		SingletonClass obj2 = SingletonClass.getInstance();
		
	//	System.out.println(obj2.toString());
		System.out.println(obj2.hashCode());
		
		SingletonClass obj3 =(SingletonClass)obj1.clone();
		
	//	System.out.println(obj3.toString());
		System.out.println(obj3.hashCode());
		
	}

}
