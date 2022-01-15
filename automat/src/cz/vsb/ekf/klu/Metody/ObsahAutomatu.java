package cz.vsb.ekf.klu.Metody;

import cz.vsb.ekf.klu.Produkty.VlastProduktu;
import cz.vsb.ekf.klu.Produkty.VycetProdukty;

import java.util.ArrayList;
import java.util.Scanner;

public class ObsahAutomatu {

    public static void nabidkaProduktu() {
        ArrayList<VlastProduktu> listProduktu = new ArrayList<>();
        Integer mnozstviPenez;
        Integer zustatekPenez = 0;
        String input;
        Integer volbaCisla;

        listProduktu.add(new VlastProduktu(1,"Bageta Šunková", 38, 580, 78, 47, 54, 200, VycetProdukty.Jidlo));
        listProduktu.add(new VlastProduktu(2,"Bageta Kuřecí", 40, 568, 31, 64, 24, 220, VycetProdukty.Jidlo));
        listProduktu.add(new VlastProduktu(3,"Bageta Sýrová", 36, 576, 28, 52, 27, 190, VycetProdukty.Jidlo));
        listProduktu.add(new VlastProduktu(4,"Pepsi 500ml", 22, 217, 0, 55, 0, 500, VycetProdukty.Limonada ));
        listProduktu.add(new VlastProduktu(5,"CocaCola 500ml", 23, 227, 0, 56, 0, 500, VycetProdukty.Limonada ));
        listProduktu.add(new VlastProduktu(6,"Mirinda 500ml", 20, 241, 0, 64, 0, 500, VycetProdukty.Limonada ));
        listProduktu.add(new VlastProduktu(7,"SevenUp 500ml", 20, 146, 0, 35, 0, 500, VycetProdukty.Limonada ));
        listProduktu.add(new VlastProduktu(8,"Relax Pomeranč 300ml", 23, 159, 0, 39, 0, 300, VycetProdukty.Dzus ));
        listProduktu.add(new VlastProduktu(9,"Relax Jablko 300ml", 23, 129, 0, 33, 0, 300, VycetProdukty.Dzus ));
        listProduktu.add(new VlastProduktu(10,"Bon-Aqua perlivá", 18, 81, 0, 19, 0, 500, VycetProdukty.Voda ));
        listProduktu.add(new VlastProduktu(11,"Bon-Aqua neperlivá", 18, 81, 0, 19, 0, 500, VycetProdukty.Voda ));
        listProduktu.add(new VlastProduktu(12,"Nestea čaj", 27, 94, 0, 22, 0, 500, VycetProdukty.Caj ));
        listProduktu.add(new VlastProduktu(13,"Tatranka oříšek", 15, 269, 15, 28, 4, 50, VycetProdukty.Sladkost ));
        listProduktu.add(new VlastProduktu(14,"Tatranka čokoláda", 15, 267, 16, 29, 3, 50, VycetProdukty.Sladkost ));
        listProduktu.add(new VlastProduktu(15,"Miňonky", 13, 269, 3, 29, 15, 50, VycetProdukty.Sladkost ));
        listProduktu.add(new VlastProduktu(16,"Snickers", 15, 242, 4, 30, 12, 50, VycetProdukty.Sladkost ));
        listProduktu.add(new VlastProduktu(17,"Twix", 16, 246, 2, 33, 12, 50, VycetProdukty.Sladkost ));
        listProduktu.add(new VlastProduktu(18,"Kinder Bueno", 17, 245, 16, 21, 4, 43, VycetProdukty.Sladkost ));
        listProduktu.add(new VlastProduktu(19,"Big Corny Čokoláda", 14, 220, 7, 34, 3, 50, VycetProdukty.Sladkost ));
        listProduktu.add(new VlastProduktu(20,"Big Corny Banán", 14, 217, 6, 36, 4, 50, VycetProdukty.Sladkost ));
        listProduktu.add(new VlastProduktu(21,"Dupetky med", 21, 313, 6, 49, 10, 70, VycetProdukty.Svacinka ));
        listProduktu.add(new VlastProduktu(22,"Bake Rolls Slanina", 23, 347, 9, 51, 12, 80, VycetProdukty.Svacinka ));
        listProduktu.add(new VlastProduktu(23,"Bake Rolls Solené", 23, 364, 11, 51, 12, 80, VycetProdukty.Svacinka ));
        listProduktu.add(new VlastProduktu(24,"Tyčinky Havlíky", 18, 388, 9, 55, 15, 90, VycetProdukty.Svacinka ));
        listProduktu.add(new VlastProduktu(25,"JoJo vexty", 18, 566, 9, 129, 1, 170, VycetProdukty.Bonbony ));


        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Vítejte ve školním automatu");
        System.out.println("---------------------------");
        System.out.println("Zde je seznam prodůktů: ");

        for (VlastProduktu vl : listProduktu) {

            System.out.println(vl.getId() + ". " + vl.getNazev() + " - " + vl.getCena() + " Kč");

        }

        while (true) {
            System.out.println("Přejete si něco koupit? ano/ne");
            String anoNe = scanner.nextLine().toLowerCase();

            if (anoNe.equals("ano") || anoNe.equals("a")) {
                while(true){
                System.out.println("Vložte peněžní prostředky: ");
                input = scanner.nextLine();
                    if((mnozstviPenez = ObsahAutomatu.tryParse(input)) == null){
                        System.out.println(input + " " + "není číslo, zadejte prosím číslo.");
                    }else break;
                }
                System.out.println("Vložená suma: " + mnozstviPenez);
                break;

            } else if (anoNe.equals("ne") || anoNe.equals("n") ) {
                System.out.println("Tak zatím .. :)");
                System.exit(0);

            } else {
                System.out.println("Zadejte pouze hodnoty ano/ne");
            }
        }
        while(true) {
            System.out.println("Zadejte číslo položky: ");
            input = scanner.nextLine();
            if ((volbaCisla = tryParse(input)) == null || volbaCisla < 1 || volbaCisla > 25) {
                System.out.println(input + " " + "není číslo produktu, zadejte prosím číslo produktu (1-25)");
            } else break;
        }

        for (VlastProduktu vl : listProduktu) {
            if (volbaCisla == vl.getId()) {
                zustatekPenez = mnozstviPenez - vl.getCena();
                if (zustatekPenez < 0){
                    System.out.println("Nemáte dostatek prostředků pro nákup " + vl.getNazev() + "." + " Peníze Vám byly vráceny.");
                    break;
                } else {
                    System.out.println("Zakoupili jste si: ");
                    System.out.println(vl);
                    System.out.println("Zůstatek: " + zustatekPenez);
                }

            }
        }

    }
    public static Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
