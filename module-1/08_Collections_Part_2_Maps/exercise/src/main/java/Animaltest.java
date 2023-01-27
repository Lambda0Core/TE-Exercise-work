import java.util.HashMap;
import java.util.Map;

public class Animaltest {
    public static void main(String[] args) {

        Map<String, Integer> mainWarehouse = new HashMap<>();
        mainWarehouse.put("SKU1", 100);
        mainWarehouse .put("SKU2", 53);
        mainWarehouse .put("SKU3", 44);

        Map<String, Integer> remoteWarehouse = new HashMap<>();
        remoteWarehouse.put("SKU2", 11);
        remoteWarehouse.put("SKU4", 5);
        //ExercisesTest.Java
        Map<String, Integer>  consolidatedWarehouse = new HashMap<>();
        consolidatedWarehouse.putAll(mainWarehouse);
        consolidatedWarehouse.putAll(remoteWarehouse);
           for(String key : mainWarehouse.keySet()) {
                if (remoteWarehouse.containsKey(key)) {
                    consolidatedWarehouse.put(key, remoteWarehouse.get(key) + mainWarehouse.get(key));
            }
        }
        //I want remoteWarehouse's new keys
        System.out.println(consolidatedWarehouse);
    }
}
