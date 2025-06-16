public class SuperHero extends Hero {
    boolean flying;

    //追加の処理
    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった!");
    }

    public void land() {
        this.flying = false;
        System.out.println("着地した!");
    }

    //オーバーライド
    public void run() {
        System.out.println(this.name + "撤退した");
    }

    //オーバーライド
    public void attack(Matango m) {
        super.attack(m);
        if (this.flying) {
            super.attack(m);
        }
    }
    public void test() {
    test();
    System.out.println("子test");
    }
}