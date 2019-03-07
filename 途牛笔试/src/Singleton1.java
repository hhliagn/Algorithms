public class Singleton1 { //懒汉式单例:是线程不安全的
    private static Singleton1 s;

    private Singleton1(){

        }

        public static Singleton1 getInstance(){
            if(s==null){
                s=new Singleton1();
            }

            return s;
    }

    /**
     * 我们假设有多个线程1，线程2都需要使用这个单例对象。
     * 而恰巧，线程1在判断完s==null后突然交换了cpu的使用权，变为线程2执行，
     * 由于s仍然为null，那么线程2中就会创建这个Singleton的单例对象。之后线程1拿回cpu的使用权，
     * 而正好线程1之前暂停的位置就是判断s是否为null之后，创建对象之前。
     * 这样线程1又会创建一个新的Singleton对象。
     */
}
