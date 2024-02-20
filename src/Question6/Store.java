package Question6;

abstract public class Store {
   String name; // 가게상호
   String event; // 가게종목
   double price; // 가게평점 중 가격 점수

   public abstract double grade();

   public abstract String getName();
}