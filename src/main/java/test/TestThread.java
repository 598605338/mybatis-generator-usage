package test;

/** 
 * @author  lixinling: 
 * @date 2016年8月11日 下午4:08:35 
 * @version 1.0 
*/
public class TestThread {

	public static void main(String[] args) {
		T2 t2 = new T2();
		new T(t2,"lxl0").start();
		new T(t2,"lxl0").start();
		new T(t2,"lxl2").start();
		new T(t2,"lxl3").start();
	}
}

class T extends Thread {
	T2 t2;
	String userId;

	public T(T2 t2,String userId){
		this.t2 = t2;
		this.userId = userId;
	}
	public void run() {
		t2.m(userId);
	}
}

class T2{
	public void m(String userId) {
		System.out.println("m................");
		synchronized (this) {
			try {
				System.out.println("userId:" + userId);
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}