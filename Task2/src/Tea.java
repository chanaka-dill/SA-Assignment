public class Tea extends Beverages{

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void addExtra(){
        //System.out.println("Adding extra");
    }
}
