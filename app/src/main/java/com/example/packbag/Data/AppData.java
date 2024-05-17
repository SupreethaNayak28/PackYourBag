package com.example.packbag.Data;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.example.packbag.Constants.MyConstants;
import com.example.packbag.Database.RoomDB;
import com.example.packbag.Models.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData extends Application {
    RoomDB database;
    String category;
    Context context;
    public static final String LAST_VERSION = "LAST_VERSION";
    public static final int NEW_VERSION = 3;

    public AppData(RoomDB database) {
        this.database = database;
    }

    public AppData(RoomDB database, Context context) {
        this.database = database;
        this.context = context;
    }

    public List<Items> getBasicData() {
        category = "Basic Needs";
        List<Items> basicItem = new ArrayList<Items>();
        basicItem.clear();
        basicItem.add(new Items("Visa", category, false));
        basicItem.add(new Items("Passport", category, false));
        basicItem.add(new Items("Tickets", category, false));
        basicItem.add(new Items("Wallet", category, false));
        basicItem.add(new Items("Driving License", category, false));
        basicItem.add(new Items("Currency", category, false));
        basicItem.add(new Items("House Key", category, false));
        basicItem.add(new Items("Book", category, false));
        basicItem.add(new Items("Travel Pillow", category, false));
        basicItem.add(new Items("Eye Patch", category, false));
        basicItem.add(new Items("Umbrella", category, false));
        basicItem.add(new Items("Note Book", category, false));
        return basicItem;
    }

    public List<Items> getPersonalCareData() {
        String[] data = {"Tooth-brush", "Tooth-paste", "Floss", "Mouthwash", "Shaving Cream", "Razor Blade",
                "Soap", "Fiber", "Shampoo", "Hair Conditioner", "Brush", "Comb", "Hair Dryer", "Curling Iron",
                "Hair Moulder", "Hair Clip", "Moisturizer", "Lip Cream", "Contact Lens", "Perfume", "Deodorant",
                "Makeup Materials", "Makeup Remover", "Wet Wipes", "Pad", "Ear Stick", "Cotton", "Nail Polish",
                "Nail Polish Remover", "Tweezers", "Nail Scissors", "Nail Files", "Suntan Cream"};
        return prepareItemsList(MyConstants.PERSONAL_CARE_CAMEL_CASE, data);
    }

    public List<Items> getClothingData() {
        String[] data = {"Stockings", "Underwear", "Pajamas", "T-Shirts", "Casual Dress", "Evening Dress",
                "Shirt", "Cardigan", "Vest", "Jacket", "Skirt", "Trousers", "Jeans", "Shorts", "Suit",
                "Coat", "Rain Coat", "Glove", "Hat", "Scarf", "Bikini", "Belt", "Slipper", "Sneakers", "Casual Shoes",
                "Heeled Shoes", "Sports Wear"};
        return prepareItemsList(MyConstants.CLOTHING_CAMEL_CASE, data);
    }

    public List<Items> getBabyNeedsData() {
        String[] data = {"Snapsuit", "Outfit", "Jumpsuit", "Baby Socks", "Baby Hat", "Baby Pyjamas",
                "Baby Bath Towel", "Muslin", "Blanket", "Dribble Bibs", "Baby Laundry Detergent",
                "Baby Bottles", "Baby Food Thermos", "Baby Bottle Brushes", "Brest-feeding Cover",
                "Breast Pump", "Water Bottle", "Storage Container", "Baby Food Spoon",
                "Highchairs", "Diaper", "Wet Wipes", "Baby Cotton",
                "Baby Care Cover", "Baby Shampoo", "Baby soap", "Baby Nail Scissors",
                "Body Moisturizer", "Potty", "diaper Rash Cream", "Serum Physiological",
                "Nasal Aspirator", "Fly Repellent Lotion", "Pyrometer", "Antipyretic Syrup", "Probiotic Power"
                , "Baby Backpack", "Stroller", "Baby Carrier", "Toys", "Teether", "Playpen", "Playpen", "Baby Radio",
                "Non-slip Sea Shoes", "Baby Sunglasses"};
        return prepareItemsList(MyConstants.BABY_NEEDS_CAMEL_CASE, data);
    }

    public List<Items> getHealthData() {
        String[] data = {"Aspirin", "Drugs Used", "Vitamins Used", "Lens Solutions", "Condom",
                "Hot Water Bag", "Tincture Of Lodine", "Adhesive Plaster",
                "First Aid Kit", "Replacement Lens", "Pain Reliever", "Fever Reducer", "Diarrhea Stopper",
                "Pain Relieve Spray"};
        return prepareItemsList(MyConstants.HEALTH_CAMEL_CASE, data);
    }

    public List<Items> getTechnologyData() {
        String[] data = {"Mobile Phone", "Phone Cover", "E-Book Reader", "Camera", "Camera Charger",
                "Portable Speaker", "IPad (Tab)", "Headphone",
                "Laptop", "Laptop Charger", "Mouse", "Extension Cable", "Data Transfer Cable",
                "Battery", "Power Bank", "DVD Player", "Flash-Light", "MP3 Player", "MP3 Player Charger"
                , "Voltage Adapter", "SD Card"};
        return prepareItemsList(MyConstants.TECHNOLOGY_CAMEL_CASE, data);
    }

    public List<Items> getFoodData() {
        String[] data = {"Snack", "Sandwich", "Juice", "Tea Bags", "Coffee", "Water", "Thermos", "Chips", "Baby Food"};
        return prepareItemsList(MyConstants.FOOD_CAMEL_CASE, data);
    }

    public List<Items> getBeachSuppliesData() {
        String[] data = {"Sea Glasses", "Sea Bed", "Suntan Cream", "Beach Umbrella", "Swim Fins",
                "Beach Bag", "Beach Towel", "Beach Slippers"
                , "Sunbed", "Snorkel", "Waterproof Clock"};
        return prepareItemsList(MyConstants.BEACH_SUPPLIES_CAMEL_CASE, data);
    }

    public List<Items> getCarSuppliesData() {
        String[] data = {"Pump", "Car Jack", "Spare Car Key", "Accident Record Set", "Auto Refrigerator"
                , "Car Cover", "Car Charger", "Window Sun Shades"};
        return prepareItemsList(MyConstants.CAR_SUPPLIES_CAMEL_CASE, data);
    }

    public List<Items> getNeedsData() {
        String[] data = {"Backpack", "Daily Bags", "Laundry Bag", "Sewing Kit",
                "Travel Lock", "Luggage Tag", "Magazine",
                "Sports Equipment", "Important Numbers"};
        return prepareItemsList(MyConstants.NEEDS_CAMEL_CASE, data);
    }

    public List<Items> prepareItemsList(String category, String[] data) {
        List<String> list = Arrays.asList(data);
        List<Items> dataList = new ArrayList<>();
        dataList.clear();

        for (int i = 0; i < list.size(); i++) {
            dataList.add(new Items(list.get(i), category, false));
        }
        return dataList;
    }

    public List<List<Items>> getAllData() {
        List<List<Items>> listOfAllItems = new ArrayList<>();
        listOfAllItems.clear();
        listOfAllItems.add(getBasicData());
        listOfAllItems.add(getCarSuppliesData());
        listOfAllItems.add(getClothingData());
        listOfAllItems.add(getFoodData());
        listOfAllItems.add(getHealthData());
        listOfAllItems.add(getTechnologyData());
        listOfAllItems.add(getBabyNeedsData());
        listOfAllItems.add(getNeedsData());
        listOfAllItems.add(getPersonalCareData());
        listOfAllItems.add(getBeachSuppliesData());
        return listOfAllItems;
    }

    public void persistAllData() {
        List<List<Items>> listOfAllItems = getAllData();
        for (List<Items> list : listOfAllItems) {
            for (Items items : list) {
                database.mainDao().saveItem(items);
            }
        }
        System.out.println("Data added.");
    }

    public void persistDataByCategory(String category, Boolean onlyDelete) {
        try {
            List<Items> list = deleteAndGetListByCategory(category, onlyDelete);
            if (!onlyDelete) {
                for (Items item : list) {
                    database.mainDao().saveItem(item);
                }
                Toast.makeText(context, category + " data reset successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, category + " data deleted successfully", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Toast.makeText(context, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private List<Items> deleteAndGetListByCategory(String category, Boolean onlyDelete) {
        if (onlyDelete) {
            database.mainDao().deleteAllByCategoryAndAddedBy(category, MyConstants.SYSTEM_SMALL);
        } else {
            database.mainDao().deleteAllByCategory(category);
        }
        if (MyConstants.BASIC_NEEDS_CAMEL_CASE.equals(category)) {
            return getBasicData();
        } else if (MyConstants.CLOTHING_CAMEL_CASE.equals(category)) {
            return getClothingData();
        } else if (MyConstants.BABY_NEEDS_CAMEL_CASE.equals(category)) {
            return getBabyNeedsData();
        } else if (MyConstants.HEALTH_CAMEL_CASE.equals(category)) {
            return getHealthData();
        } else if (MyConstants.TECHNOLOGY_CAMEL_CASE.equals(category)) {
            return getTechnologyData();
        } else if (MyConstants.FOOD_CAMEL_CASE.equals(category)) {
            return getFoodData();
        } else if (MyConstants.BEACH_SUPPLIES_CAMEL_CASE.equals(category)) {
            return getBeachSuppliesData();
        } else if (MyConstants.CAR_SUPPLIES_CAMEL_CASE.equals(category)) {
            return getCarSuppliesData();
        } else if (MyConstants.NEEDS_CAMEL_CASE.equals(category)) {
            return getNeedsData();
        } else {
            return new ArrayList<>();
        }


    }

}
