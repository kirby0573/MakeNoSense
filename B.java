public class B{
    protected int data;

    public B(){
        this(0);
        // passing 0 as default
    }

    public B(int data){
        this.data = data;
    }

    @Override
    public String toString(){
        return new String("Values of data in B is: " + Integer.toString(data));
    }
}