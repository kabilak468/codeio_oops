package Advanced;

class cake implements Runnable{
    public void run(){
        System.out.println("Mixing"+Thread.currentThread().getId());
        System.out.println("Baking"+Thread.currentThread().getId());
        System.out.println("Frosting"+Thread.currentThread().getId());
    }
}
class ThreadBaking{
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            cake c=new cake();
            Thread thread=new Thread(c);
            thread.start();
        }
       
    }
}
