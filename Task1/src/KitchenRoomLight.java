public class KitchenRoomLight implements Light {
    private int brightnesslevel_Kitchen;

    @Override
    public void on(){
        brightnesslevel_Kitchen = 100;
        System.out.println("Kitchen Room Light is ON at full brightness.");
    }

    @Override
    public void off(){
        brightnesslevel_Kitchen = 0;
        System.out.println("Kitchen Room Light is OFF.");
    }

    @Override
    public void dim(int level){
        brightnesslevel_Kitchen = level;
        System.out.println("Kitchen Room Light Dimmed to " + brightnesslevel_Kitchen + "%.");
    }


    public int getBrightness(){
        return brightnesslevel_Kitchen;
    }

}
