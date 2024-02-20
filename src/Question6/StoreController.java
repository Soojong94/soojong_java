package Question6;

import java.util.ArrayList;

public class StoreController {

   ArrayList<Store> StoreList;
   
   public void StoreList() {
      StoreList = new ArrayList<Store>();
      StoreList.add(new Restaurant("혜성식당", "음식점", 75, 78, 67.7, 80.3));
      StoreList.add(new Restaurant("정림이네", "음식점", 97, 87, 90.6, 80.3));
      StoreList.add(new Restaurant("왕뼈사랑", "음식점", 75, 76, 67.3, 80.6));
      StoreList.add(new Salon("박승철", "미용실", 86, 84.56, 70.98));
      StoreList.add(new Salon("이기자", "미용실", 90, 90.45, 78.456));
      StoreList.add(new Salon("윤헤어", "미용실", 78.342, 90.678, 89));
   }
   
    public void printR() {
       for(int index = 0; index < 3; index++) {
          System.out.print(index + 1 + ". " + StoreList.get(index).getName() + "\t평점 : ");
          System.out.printf("%.2f", StoreList.get(index).grade());
          System.out.println();
       }
    }
   
    public void printS() {
       for (int index = 3; index < StoreList.size(); index++) {
          System.out.print((index + 1) + ". " + StoreList.get(index).getName() + "\t평점 : ");
          System.out.printf("%.2f", StoreList.get(index).grade());
          System.out.println();
       }
    }
   
  
       public void StorePoint(String storename) {
          System.out.println("가게명 : " + storename);
          for(int i = 10; i <= 100; i += 10) {
             System.out.print(i + "\t");
          }
          
          for (int index = 0; index < StoreList.size(); index++) {
             if(storename.equals(StoreList.get(index).getName())) {
                System.out.println();
                for(int i = 1; i < StoreList.get(index).grade() / 10; i++) {
                   System.out.print("*" + "\t");
                }
                System.out.println();
                System.out.printf("평점 : " + "%.2f", StoreList.get(index).grade());
                System.out.println();
                
             }
          }   
       }
       
       public void AllPoint() {
          String[][] st = new String[7][11];
          st[0][0] = " ";
          st[0][1] = "10";
          st[0][2] = "20";
          st[0][3] = "30";
          st[0][4] = "40";
          st[0][5] = "50";
          st[0][6] = "60";
          st[0][7] = "70";
          st[0][8] = "80";
          st[0][9] = "90";
          st[0][10] = "100";
          
            for (int i = 1; i < st.length; i++) {
                st[i][0] = String.valueOf(StoreList.get(i - 1).name);
                for (int j = 1; j <= (StoreList.get(i - 1).grade() / 10); j++) {
                    st[i][j] = "*";
                }
                for (int k = (int) (StoreList.get(i - 1).grade() / 10) + 1; k < st[0].length; k++) {
                    st[i][k] = " ";
                    
                    
                }
            }
          for(int j = 10; j >= 0; j--) {
             for(int i = 0; i < st.length; i++) {
                System.out.print(st[i][j] + "\t");
                
             }
             System.out.println();
             
             
          }
          
          
       }
       
       
       
       
       
       
    }
    
    
    
