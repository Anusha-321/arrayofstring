package forLoopDemo;

import java.util.*;

public class loopForMap {
    public static void main(String[] args) {

        Map<String, Integer> maps = new HashMap<>();
        maps.put("A", 10);
        maps.put("B", 20);
        maps.put("c", 30);
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            if (entry.getKey().equals("A")) {
                System.out.println("Key::" + entry.getKey() + ",value:" + entry.getValue());
            }
        }


        Map<String, List<String>> provinceDistrictMap = new HashMap<>();
        provinceDistrictMap.put("Bagmati", Arrays.asList("Kathmandu", "Lalitpur", "Bhaktapur"));
        provinceDistrictMap.put("Lumbini", Arrays.asList("Gulmi", "Palpa"));
        provinceDistrictMap.put("Gandaki", Arrays.asList("Pokhara", "Gorkha"));
        System.out.println("enter district");
        Scanner scanner1 = new Scanner(System.in);
        String inputProvince = scanner1.next();

        do {
            System.out.println("Enter province as an input::");
            inputProvince = scanner1.next();
        } while (!provinceDistrictMap.containsKey(inputProvince));

        for (Map.Entry<String, List<String>> province : provinceDistrictMap.entrySet()) {
            if (province.getKey().equalsIgnoreCase(inputProvince)) {

                System.out.println("Districts::" + province.getValue());
            }
        }
    }
}

