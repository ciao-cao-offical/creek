package cn.ccy.leetcode._2026._11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/product-of-the-last-k-numbers/?envType=daily-question&envId=2026-11-23">1352. 最后 K 个数的乘积</a>
 * @since 2026/11/23 01:07
 */
public class ProductOfNumbers {
    public static void main(String[] args) {

    }

    private final List<Integer> prefixProduct;

    public ProductOfNumbers() {
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            prefixProduct.clear();
            prefixProduct.add(1);
        } else {
            prefixProduct.add(num * prefixProduct.get(prefixProduct.size() - 1));
        }
    }

    public int getProduct(int k) {
        int n = prefixProduct.size();
        if (n <= k) {
            return 0;
        }
        return prefixProduct.get(n - 1) / prefixProduct.get(n - 1 - k);
    }
}
