public class Main {
    public static void main(String[] args) {
        SuperHero sh = new SuperHero();
        sh.fly();//SuperHeroに書いた処理
        sh.run();
        sh.test();
        Hero h = new Hero();
        h.run();//Heroに書いた処理
        h.test();
    }
}