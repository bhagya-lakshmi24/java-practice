public class Computer {
    enum Brand {
        HP(70000), DELL(80000);
        private int price;

        private Brand(int price) {
            this.price = price;   
        }
        
        public int getPrice() {
            return price;
        }
    }
    public static void main(String[] args) {
        Brand c1 = Brand.HP;
        System.out.println(c1);
        System.out.println(c1.getPrice());
    }
}