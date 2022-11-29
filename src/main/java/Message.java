public class Message {
    private String msg ="Test Maven Java";

    public static void main(String[] args) {
        System.out.println(new Message().getMsg());
    }

    public String getMsg(){
        return this.msg;
    }
}
