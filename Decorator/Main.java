class Main {
  public static void main(String[] args) {
    System.out.println("Making an old fashioned: ");
    
    Liquor liquor = new Bourbon();
    liquor = new Bitters(liquor);
    liquor = new Bitters(liquor);
    liquor = new Cherry(liquor);
    liquor = new Lime(liquor);

    System.out.println(liquor.getDescription() + " calories: " + liquor.calories());
    
    System.out.println("\nMaking a vodka gimlet: ");
    Liquor vodka = new Vodka();
    vodka = new Lime(vodka);
    vodka = new LimeJuice(vodka);

    System.out.println(vodka.getDescription() + " calories: " + vodka.calories());

    System.out.println("\nMaking a Manhattan: ");
    Liquor manhattan = new Bourbon();
    manhattan = new Vermouth(manhattan);
    manhattan = new Vermouth(manhattan);
    manhattan = new Cherry(manhattan);
    manhattan = new Bitters(manhattan);

   System.out.println(manhattan.getDescription() + " calories: " + manhattan.calories());

   System.out.println("\nMaking a Tom Collins: ");
   Liquor tommy = new Gin();
   tommy = new LimeJuice(tommy);
   tommy = new LimeJuice(tommy);
   tommy = new Sugar(tommy);
   tommy = new Sugar(tommy);
   tommy = new Lime(tommy);
   System.out.println(tommy.getDescription() + " calories: " + tommy.calories());


    
  }
}