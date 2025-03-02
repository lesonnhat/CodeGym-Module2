import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaterialManager {
    private List<Material> materials = new ArrayList<>();

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

//    public void removeMaterial(Material material) {
//        materials.remove(material);
//    }
//
//    public void updateMaterial(Material material) {
//        materials.set(materials.indexOf(material), material);
//    }

    public boolean updateMaterial(String id, Material updatedMaterial) {
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(id)) {
                materials.set(i, updatedMaterial);
                return true; // Cập nhật thành công
            }
        }
        return false; // Không tìm thấy sản phẩm để cập nhật
    }

    public boolean removeMaterial(String id) {
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(id)) {
                materials.remove(i);
                return true; // Xóa thành công
            }
        }
        return false; // Không tìm thấy sản phẩm để xóa
    }

    public List<Material> displayMaterials() {
        List<Material> displayedMaterials = new ArrayList<>();
        for (Material material : materials) {
            displayedMaterials.add(material); // Thêm sản phẩm vào danh sách
        }
        return displayedMaterials; // Trả về danh sách sản phẩm
    }

    public double totalGetAmountMeat() {
        double sumMeat = 0;
        for (Material material : materials) {
            if (material instanceof Meat) {
                sumMeat += material.getAmount();
            }
        }
        return sumMeat;
    }

    public double totalGetAmountCrispyFlour() {
        double sumCrispy = 0;
        for (Material material : materials) {
            if (material instanceof CrispyFlour) {
                sumCrispy += material.getAmount();
            }
        }
        return sumCrispy;
    }

    public double totalGetAmount() {
        return totalGetAmountMeat() + totalGetAmountCrispyFlour();
    }

    public double totalRealMoneyMeat() {
        double sumRealMeat = 0;
        for (Material material : materials) {
            if (material instanceof Meat) {
                sumRealMeat += ((Meat) material).getRealMoney();
            }
        }
        return sumRealMeat;
    }

    public double totalRealMoneyCrispyFlour() {
        double sumRealCrispy = 0;
        for (Material material : materials) {
            if (material instanceof CrispyFlour) {
                sumRealCrispy += ((CrispyFlour) material).getRealMoney();
            }
        }
        return sumRealCrispy;
    }

    public double totalRealMoney() {
        return totalRealMoneyMeat() + totalRealMoneyCrispyFlour();
    }

    // Phương thức sắp xếp theo giá
    public void sortMaterialsByPrice() {
        Collections.sort(materials, new Comparator<Material>() {
            @Override
            public int compare(Material m1, Material m2) {
                return Integer.compare(m1.getCost(), m2.getCost());
            }
        });
    }
}