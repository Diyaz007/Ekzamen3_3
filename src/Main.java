public class Main {
    public static void main(String[] args) {
        Backpack backpack1 = new Backpack();
        Backpack backpack2 = new Backpack();
        Backpack backpack3 = new Backpack();
        FillBackpack1(backpack1);
        FillBackpack2(backpack2);
        FillBackpack3(backpack3);
        System.out.println(backpack1.toString(1));
        System.out.println(backpack2.toString(2));
        System.out.println(backpack3.toString(3));
    }

    private static void FillBackpack3(Backpack backpack3) {
        for (int i = 0; i < 10; i++) {
            backpack3.AddCircleItems(new Apple());
        }
        for (int i = 0; i < 3; i++) {
            backpack3.AddCircleItems(new TennisBall());
        }
        backpack3.AddFlatItems(new Folder());
        backpack3.AddCylinderItems(new CocaCola());

    }

    private static void FillBackpack2(Backpack backpack2) {
        for (int i = 0; i < 50; i++) {
            backpack2.AddCircleItems(new TennisBall());
        }
        backpack2.AddFlatItems(new Folder());
        backpack2.AddCylinderItems(new Water());
    }

    private static void FillBackpack1(Backpack backpack1) {
        for (int i = 0; i < 20; i++) {
            backpack1.AddCircleItems(new Apple());
        }
        backpack1.AddFlatItems(new Book());
        backpack1.AddCylinderItems(new CocaCola());
    }
}
