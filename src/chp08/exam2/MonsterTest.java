//package chp08.exam2;
//
//public class MonsterTest {
//    public static void main(String[] args) {
//        Monster orc=new Monster("오크");
//        Monster skeleton=new Monster("해골");
//        Monster.battle(orc,skeleton);
//    }
//    class Monster{
//        private String name;
//        private int hp;
//        private static int maxHP=30;
//
//        public Monster(String s){
//            this.name=name;
//        }
//
//        public void attack(Monster enemy){
//            System.out.println("[%s]의 공격 -> %의 체력:");
//        }
//
//        public static void battle(monster a,monster b){
//            while(a.hp>0&&b.hp>0){
//                Monster attacker=(Math.random()<0.5)?a: b;
//                Monster defender=(attacker==a)?b:a;
//            }
//        }
//
//    }
//}
