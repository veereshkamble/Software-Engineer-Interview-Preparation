public class Main {

    public static void main(String[] args) {
        Insect insect = new Insect(5, 6);
        Spider spider = new Spider(13, true);
        Cricket cricket = new Cricket(2, 1.25);

        Insect butterfly = new Spider(7, false);

        insect.crawl();
        insect.says();

        spider.crawl();
        spider.says();

        cricket.crawl();
        cricket.says();
        cricket.jump();

        butterfly.crawl();
        butterfly.says();

        if (spider instanceof  Insect && spider instanceof  Spider) {
            System.out.println("Spider is an insect and a spider");
        }
    }
}
