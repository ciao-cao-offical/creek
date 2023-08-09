package cn.ccy.spi;

import com.ciao.api.Animal;

import java.util.ServiceLoader;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/9 20:02
 * @description 找到所有动物
 */
public class FindAnimals {
    public static void main(String[] args) {
        ServiceLoader<Animal> load = ServiceLoader.load(Animal.class);
        for (Animal animal : load) {
            System.out.println(animal.sing());
        }
    }
}
