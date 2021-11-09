import Clothes.*;
import Clothes.Short;

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
    public static Shop ChangeForXml(Shop shop){
        Shop newShop = new Shop();
        var cat = new ArrayList<Category>();
        cat.add(new Category("t-shirts", 0));
        cat.add(new Category("sweatshirts", 1));
        cat.add(new Category("pants-shorts", 2));
        cat.add(new Category("shirts", 3));
        cat.add(new Category("polo", 4));
        for (var category : cat)
            category.Clotheses = new ArrayList<>();
        newShop.setCategories(cat);
        for (var shopCategory : shop.getCategories()) {
            for (var shopCategoryClothes : shopCategory.Clotheses) {
                if (shopCategoryClothes.getClass() == T_shirt.class){
                    newShop.getCategories().get(0).Clotheses.add(shopCategoryClothes);
                }
                else if (shopCategoryClothes.getClass() == Sweatshirt.class){
                    newShop.getCategories().get(1).Clotheses.add(shopCategoryClothes);
                }
                else if (shopCategoryClothes.getClass() == Pant.class || shopCategoryClothes.getClass() == Short.class){
                    newShop.getCategories().get(2).Clotheses.add(shopCategoryClothes);
                }
                else if (shopCategoryClothes.getClass() == Shirt.class){
                    newShop.getCategories().get(3).Clotheses.add(shopCategoryClothes);
                }
                else if (shopCategoryClothes.getClass() == Polo.class){
                    newShop.getCategories().get(4).Clotheses.add(shopCategoryClothes);
                }
            }
        }
        return newShop;
    }
}
