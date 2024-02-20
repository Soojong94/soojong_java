package Question6;

public class Restaurant extends Store {

   double service; // 서비스 점수 저장
   double flavor; // 맛 점수
   double clean; // 청결 점수

   public Restaurant(String name, String event, double price, double service, double flavor, double clean) {
      this.name = name;
      this.event = event;
      this.price = price;
      this.service = service;
      this.flavor = flavor;
      this.clean = clean;

   }

   public double grade() {
      return (service + flavor + clean + price) / 4;
   }

   public String getName() {
      return name;
   }
}