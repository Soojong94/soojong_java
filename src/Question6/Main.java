package Question6;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      StoreController store = new StoreController();
      store.StoreList();

      while (true) {
         System.out.println("-------------------메뉴를 선택해 주세요-----------------");
         System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
         int choice = sc.nextInt();

         if (choice == 1) {
            System.out.println("===음식점보기===");
            store.printR();
         } else if (choice == 2) {
            System.out.println("===미용실보기===");
            store.printS();
         } else if (choice == 3) {
            System.out.println("===상세보기===");
            System.out.println("가게명 입력 : ");
            String storename = sc.next();
            store.StorePoint(storename);

         } else if (choice == 4) {
            System.out.println("===평점보기===");
            store.AllPoint();

         } else if (choice == 5) {
            System.out.println("프로그램 종료!");
            break;
         } else {
            System.out.println("정확한 숫자를 입력해주세요.");
         }
      }
   }
}