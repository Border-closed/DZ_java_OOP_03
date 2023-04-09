//Создать класс Notebook с полями:
// 1. Стоимость (int)                                                           +
// 2. Оперативная память (int)                                                  +
// 3. Нагенерить объектов этого класса, создать список                          +
// 4. Отсортировать его в трех вариантах:
//  4.1 По возрастанию цены                                                     +
//  4.2 По убыванию цены
//  4.3 По оперативке по убыванию. Если оперативки равны - по убыванию цены.

import java.util.*;

public class notebook {

    public static void main(String[] args){
        List <notes> Arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            notes n = new notes(random.nextInt(500,10000),random.nextInt(8,64));
            Arr.add(n);
        }
        System.out.println(Arr);
        Collections.sort(Arr);
        System.out.println(Arr);

    }
    
    static class notes implements Comparable<notes>{
        private int price;
        private int ram;

        public notes (int price, int ram){
            this.price = price;
            this.ram = ram;
        }

        public String toString() {
            return "цена = " + this.price + " / память = " + this.ram + "";
        }

        public int getPrice(){
            return price;
        }

        public int getRam() {
            return ram;
        }

        @Override
        public int compareTo (notes o) {
            return this.price - o.getPrice();
        }
    }
}