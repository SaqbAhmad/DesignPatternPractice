package designPattern.singletonPattern;
class SingletonClass {
	// This is the case of Lazy initialization.....For Single thread it is okay but with multiple thread its not okay because each thread will create its own object everytime.
	private static SingletonClass singletonClass;
	private SingletonClass() {
		
	}
	public  static SingletonClass getInstance() {
		if(singletonClass==null) {
			// singletonClass = new SingletonClass();
			synchronized(SingletonClass.class) {
				if(singletonClass==null) {
					singletonClass = new SingletonClass();
				}
			}
		}
		return singletonClass;
	}
//	
	// This is called eager way of initialization. Here instance will create whether we use it or not.
//	private static SingletonClass singletonClass = new SingletonClass();
//	
//	public static SingletonClass getInstance() {
//		return singletonClass;
//	}
	
	public void sayHello() {
		System.out.println("Welcome to singleton design pattern. ");
	}
}
public class Practice1 {
		
	public static void main(String[] args) {
       
	//	SingletonClass obj1 = new SingletonClass();
//		SingletonClass obj1 = SingletonClass.getInstance();
//		SingletonClass obj2 = SingletonClass.getInstance();
//		SingletonClass obj3 = SingletonClass.getInstance();
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
//		System.out.println(obj3.hashCode());
//        obj1.sayHello();
//        obj2.sayHello();
//        obj3.sayHello();
	//	SingletonClass obj1 = new SingletonClass();
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		obj1.sayHello();
		obj2.sayHello();
		
         
	}

}
