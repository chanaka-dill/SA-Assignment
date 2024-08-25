public class Coffee extends Beverages{

    @Override
    protected void brew() {
        System.out.println("Dripping coffe through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugur and milk");
    }

    @Override
    protected void addExtra(){
        System.out.println("Adding vanilla syrup");
    }

}
