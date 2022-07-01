import java.util.ArrayList;

public class Backpack {
    private ArrayList<CircleItem> circleItems = new ArrayList<>();
    private ArrayList<CylinderItem> cylinderItems = new ArrayList<>();
    private ArrayList<FlatItem> flatItems = new ArrayList<>();

    public void AddCircleItems(CircleItem product){
        circleItems.add(product);
    }
    public void AddCylinderItems(CylinderItem product){
        cylinderItems.add(product);
    }
    public void AddFlatItems(FlatItem product){
        flatItems.add(product);
    }

    public String toString(int counter) {
        return "Backpack"+counter+"{ " +
                "CircleItems=" + circleItems +
                ", CylinderItems=" + cylinderItems +
                ", FlatItems=" + flatItems +
                '}';
    }
}
