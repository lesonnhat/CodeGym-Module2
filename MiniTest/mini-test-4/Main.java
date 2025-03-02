import java.util.List;

public class Main {
    public static void main(String[] args) {
        MaterialManager manager = new MaterialManager();

        // Thêm sản phẩm
        manager.addMaterial(new Meat("M001", "Chicken", "02/03/2025", 80000, 1.5));
        manager.addMaterial(new Meat("M002", "Beef", "03/03/2025", 120000, 1.8));
        manager.addMaterial(new Meat("M003", "Pork", "03/03/2025", 65000, 2.4));
        manager.addMaterial(new Meat("M004", "Fish", "04/03/2025", 55000, 3.6));
        manager.addMaterial(new Meat("M005", "Chicken", "04/03/2025", 80000, 1.4));

        manager.addMaterial(new CrispyFlour("C001", "Flour A", "01/03/2025", 40000, 1));
        manager.addMaterial(new CrispyFlour("C002", "Flour B", "01/03/2025", 75000, 1));
        manager.addMaterial(new CrispyFlour("C003", "Flour C", "02/03/2025", 115000, 1));
        manager.addMaterial(new CrispyFlour("C004", "Flour B", "03/03/2025", 75000, 1));
        manager.addMaterial(new CrispyFlour("C005", "Flour A", "03/03/2025", 40000, 1));

        // Hiển thị sản phẩm
        System.out.println("DANH SÁCH SẢN PHẨM: \n");
        List<Material> materials = manager.displayMaterials();
        for (Material material : materials) {
            System.out.println(material);
        }

        // Cập nhật sản phẩm
        boolean updated = manager.updateMaterial("M001", new Meat("M001", "Pork", "02/03/2025", 65000, 1.5));
        System.out.println("\nCập nhật sản phẩm M001: " + (updated ? "Thành công!" : "Thất bại!"));

        // Xóa sản phẩm
        boolean removed = manager.removeMaterial("C004");
        System.out.println("\nXóa sản phẩm C004: " + (removed ? "Thành công!" : "Thất bại!"));

        // Hiển thị sản phẩm sau update, remove
        System.out.println("\nDANH SÁCH SẢN PHẨM SAU KHI UPDATE: \n");
        List<Material> materialsAfter = manager.displayMaterials();
        for (Material materialAfter : materialsAfter) {
            System.out.println(materialAfter);
        }

        // Tổng tiền của 10 sản phẩm
        System.out.println("\nTỔNG TIỀN CỦA 10 SẢN PHẨM = " + manager.totalGetAmount() + " VNĐ");

        // Số tiền chênh lệch khi chiết khấu
        System.out.println("\nSỐ TIỀN CHÊNH LỆCH KHI CHIẾT KHẤU = " + (manager.totalGetAmount() - manager.totalRealMoney()) + " VNĐ");

        // Sắp xếp sản phẩm theo giá
        manager.sortMaterialsByPrice();
        System.out.println("\nDANH SÁCH SẢN PHẨM THEO GIÁ: \n");
        for (Material material : manager.displayMaterials()) {
            System.out.println(material);
        }
    }
}
