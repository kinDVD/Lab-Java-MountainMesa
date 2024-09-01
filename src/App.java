import java.util.ArrayList;
import co.mountainmesa.iFormation;
import co.mountainmesa.Mountain;
import co.mountainmesa.Mesa;
public class App {
    public static void main(String[] args) throws Exception {
    
    //creating instances for each geological formation
    Mountain mo1 = new Mountain(8611, "Chogori");
    Mountain mo2 = new Mountain(7708, "Tirich Mir");
    Mountain mo3 = new Mountain(7649, "Kongur Tagh");
    Mountain mo4 = new Mountain(7224, "Hinhan Kaga");
    Mesa me1 = new Mesa(3400,1300, "Grand Mesa");
    Mesa me2 = new Mesa(244, 20, "Artilla");
    Mesa me3 = new Mesa(724, 960000, "Decinsky Sneznik");
    Mesa me4 = new Mesa(1200,1, "Amedi");
    
    //ArrayList populated with the above instances
    ArrayList<iFormation> formations = new ArrayList<>();
    formations.add(mo1);
    formations.add(mo2);
    formations.add(mo3);
    formations.add(mo4);
    formations.add(me1);
    formations.add(me2);
    formations.add(me3);
    formations.add(me4);
    
    //method 1: loops through ArrayList and list the information for each formation
    showInfo(formations);

    //method 2 loops through ArrayList and declare the tallest formation
    findTallest(formations);

    //method 3: loops through ArrayList and declare the tallest mesa
    tallestMesa(formations);

    }

    //method 1
    public static void showInfo(ArrayList<iFormation> formations){
        for(iFormation Formation: formations){
                System.out.println("The formation is " + Formation.getInfo());
        }
    }

    //method 2
    public static void findTallest(ArrayList<iFormation> formations){
        String tallest = "";
        int maxHeight = 0;
        for(iFormation Formation: formations){
            if(Formation.getHeight() > maxHeight){
                maxHeight = Formation.getHeight();
                tallest = "The tallest formation in this list is " + Formation.getInfo();
            }
        }
        System.out.println(tallest);
    }

    //method 3
    public static void tallestMesa(ArrayList<iFormation> formations){
        int maxHeight = 0;
        String tallest = "";
        for(iFormation Formation: formations){
            if(Mesa.class.isInstance(Formation)){
                if(Formation.getHeight() > maxHeight){
                    maxHeight = Formation.getHeight();
                    tallest = "The tallest mesa in this list is " + Formation.getInfo();
                }
            }
        }
        System.out.println(tallest);
    }

}