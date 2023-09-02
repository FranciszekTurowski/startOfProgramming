public class ShirtShop {
    public static void main(String[] args) {



        Size[] values = Size.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].toString());
            
        }
        

        String size = "SMALL";
      Size shirtSize =   Size.valueOf(size);
      Tshirt tshirt = new Tshirt();
      tshirt.setSize(shirtSize);

        System.out.println(tshirt.getSize().getDescription());
    }
}
