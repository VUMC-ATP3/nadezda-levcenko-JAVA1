package classroom;

public class MainTwo {
    public static void main(String[] args) {
        String  vards = "Nadežda";
        String uzvards = "Ļevčenko";
        int vecums = 38;
        boolean isPresent = true;

        System.out.println("Vārs: " + vards + "\n" + "Uzvārs: " + uzvards + "\n"
        + "Vecums: " + vecums + "\n"  + "Vai biju nodarbībā? " + isPresent);

        String teikums = String.format("Vārds: %s \n Uzvārds: %s \n Vecums: %s \n isPresent %s", vards, uzvards,vecums, isPresent);

        System.out.println(teikums);
        System.out.println(((2*(2+2)/2)*2));
    }
}
