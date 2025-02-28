package cn.ccy.leetcode._2025._02;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/28 21:10
 * @description/link https://leetcode.cn/problems/design-a-food-rating-system/description/?envType=daily-question&envId=2025-02-28
 * ☆☆☆ 2025cvd
 */
public class FoodRatings {
    public static void main(String[] args) {

    }

    private Map<String, Pair<Integer, String>> foodMap;
    private Map<String, TreeSet<Pair<Integer, String>>> ratingMap;
    private int n;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        n = foods.length;
        foodMap = new HashMap<>();
        ratingMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            foodMap.put(food, new Pair<>(rating, cuisine));
            ratingMap.computeIfAbsent(cuisine, k -> new TreeSet<>((a, b) -> {
                if (!a.getKey().equals(b.getKey())) {
                    return a.getKey() - b.getKey();
                }
                return a.getValue().compareTo(b.getValue());
            })).add(new Pair<>(n - rating, food));
        }
    }

    public void changeRating(String food, int newRating) {
        Pair<Integer, String> pair = foodMap.get(food);
        int oldRating = pair.getKey();
        String cuisine = pair.getValue();
        ratingMap.get(cuisine).remove(new Pair<>(n - oldRating, food));
        ratingMap.get(cuisine).add(new Pair<>(n - newRating, food));
        foodMap.put(food, new Pair<>(newRating, cuisine));
    }

    public String highestRated(String cuisine) {
        return ratingMap.get(cuisine).first().getValue();
    }
}
