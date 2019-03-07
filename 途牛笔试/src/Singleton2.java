public class Singleton2 { //饿汉式单例:是线程安全的

    private static final Singleton2 instance=new Singleton2();

    private Singleton2(){

    }

    private static Singleton2 getInstance(){
        return instance;
    }
}
