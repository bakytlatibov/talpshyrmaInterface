public class Main {
    public static void main(String[] args) {
        Bread bread=new Bread();
        Bun bun=new Bun();
        Pie pie=new Pie();
        bread.baket();
        bread.price();
        bun.baket();
        bun.price();
        pie.baket();
        pie.price();




    Baked[] baked={new Bread(),new Bun(),new Pie()};
        for (Baked baked1:baked) {
            baked1.baket();
            baked1.price();

        }

}}
