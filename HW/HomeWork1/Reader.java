package HW1;

import java.util.Scanner;

public class Reader {
    int a;
    public void Scan(){
        System.out.println("Введіть номер дії: 1 - налаштувати, 2 - грати, 3 - купити.");
        Scanner scr = new Scanner(System.in);
        a = scr.nextInt();
        switch (a){
            case 1:
                System.out.println("Можете настроїти гітару");
                break;
            case 2:
                System.out.println("Можете пограти на гітарі");
                break;
            case 3:
                System.out.println("Вітаю з покупкою");
                break;
            default:
                System.out.println("Такого ви зробити не можете ");
        }

    }
}
