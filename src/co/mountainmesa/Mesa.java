package co.mountainmesa;
public class Mesa implements iFormation{
private int height;
private int area;
private String name;
public Mesa(int height, int area, String name){
    this.height = height;
    this.area = area;
    this.name = name;
}
@Override
public int getHeight(){
    return this.height;
}
public String getInfo(){
    return "a mesa called " + this.name + " that is " + this.height + " meters tall, and has a surface area of " + this.area + " square kilometers.";
}

}
