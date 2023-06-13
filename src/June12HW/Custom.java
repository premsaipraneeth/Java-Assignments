package src.June12HW;

public class Custom {
    public static void main(String[] args) {
        int i = 11;
        try{
            if(i>10){
                throw  new Exception("Exception thrown");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class except extends Exception{
    public except(String message) {
        super(message);
    }
}
