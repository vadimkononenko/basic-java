package lab4;

import java.util.Arrays;

public class MainCosmetics {
    public static void main(String[] args) {
        Cosmetics[] cosmetics = new Cosmetics[] {
                new Cosmetics(
                        "Gentle Foaming Facial Wash",
                        "Elemis",
                        "face",
                        "famale",
                        1200
                ),
                new Cosmetics(
                        "Pro-Radiance Cream Cleanser",
                        "Elemis",
                        "face",
                        "famale",
                        1340
                ),
                new Cosmetics(
                        "Bamboo Toothbrush",
                        "Bottokan",
                        "mouth",
                        "male/famale",
                        40
                ),
                new Cosmetics(
                        "2-in-1 Intensiv-Weiss Gel",
                        "Theramed",
                        "mouth",
                        "male/famale",
                        100
                ),
                new Cosmetics(
                        "Color Line Bubble",
                        "inJoy",
                        "bathroom",
                        "male/famale",
                        125
                ),
                new Cosmetics(
                        "Laboratories Nanocare Intimate Hygiene Gel",
                        "SesDerma",
                        "bathroom",
                        "famale",
                        776
                )
        };
        // desc
        System.out.println(">");
        Arrays.sort(cosmetics, (o1, o2) -> o1.getPrice() - o2.getPrice());
        Arrays.asList(cosmetics).forEach(System.out::println);

        // asc
        System.out.println("\n<");
        Arrays.sort(cosmetics, (o1, o2) -> o2.getPrice() - o1.getPrice());
        Arrays.asList(cosmetics).forEach(System.out::println);
    }
}
