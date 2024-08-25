public abstract class Beverages {
    private boolean needsExtra;

    public void boilWater(){
        System.out.println("Boiling Water");
    }

    public void pourInCup(){
        System.out.println("Pouring into Cup");
    }

    public void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if(needsExtra){
            addExtra();
        }
    }

    public void setNeedsExtra(boolean needsExtra){
        this.needsExtra = needsExtra;
    }

    protected abstract void addExtra();
    protected abstract void addCondiments();
    protected abstract void brew();

}
