package Question6;

public class Salon extends Store {
   double technology; // 기술 점수
   double kindness; // 친절 점수

   public Salon(String name, String event, double price, double technology, double kindness) {
      this.name = name;
      this.event = event;
      this.price = price;
      this.technology = technology;
      this.kindness = kindness;

   }

   public double grade() {
      return (technology + kindness + price) / 3;
   }

   public String getName() {
      return name;
   }
}