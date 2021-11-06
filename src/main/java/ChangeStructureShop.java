import java.util.ArrayList;

public class ChangeStructureShop {
    public static Shop ChangeForJSON(Shop shop) {
        var newShop = new Shop();
        var cat = new ArrayList<Category>();
        cat.add(new Category("cost less than 2000", 0));
        cat.add(new Category("cost between 2000 and 3000", 1));
        cat.add(new Category("cost more than 3000", 2));
        for (var category : cat)
            category.Clotheses = new ArrayList<>();
        newShop.setCategories(cat);
        for (var shopCategory : shop.getCategories()) {
            for (var shopCategoryClothes : shopCategory.Clotheses) {
                if (shopCategoryClothes.Cost < 2000){
                    newShop.getCategories().get(0).Clotheses.add(shopCategoryClothes);
                }
                else if (shopCategoryClothes.Cost < 3000){
                    newShop.getCategories().get(1).Clotheses.add(shopCategoryClothes);
                }
                else {
                    newShop.getCategories().get(2).Clotheses.add(shopCategoryClothes);
                }
            }
        }
        return newShop;
    }
}
