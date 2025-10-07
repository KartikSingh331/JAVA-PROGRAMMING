package OOPs;

public class Constructor {
    static class heros {
        String name;
        int rank;
        heros(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        public String toString() {
            return "heros{name='" + name + "', rank=" + rank + "}";
        }
    }
    public static void main(String[] args) {
            heros hero1 = new heros("kartik", 44);
            System.out.println(hero1);
        }
    }
