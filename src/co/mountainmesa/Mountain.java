package co.mountainmesa;
public class Mountain implements iFormation{
    private int height;
    private String name;
    public Mountain(int height, String name){
        this.height = height;
        this.name = name;
    }
    @Override
    public int getHeight(){
        return this.height;
    }
    @Override
    public String getInfo(){
        return "a mountain called " + this.name + " that is " + this.height + " meters tall.";
    }
    
}

