package com.ciao.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/18 0018
 * @description https://leetcode-cn.com/problems/simple-bank-system/
 */
public class Bank {
    long[] balance;
    int n;

    public Bank(long[] balance) {
        this.balance = balance;
        n = balance.length;
    }

    public static void main(String[] args) {
        //["Bank","withdraw","transfer","deposit","transfer","withdraw"]
        //[[[10,100,20,50,30]],[3,10],[5,1,20],[5,20],[3,4,15],[10,50]]
        Bank bank = new Bank(new long[]{10, 100, 20, 50, 30});
        bank.withdraw(3, 10);
        bank.transfer(5, 1, 20);
        bank.deposit(5, 20);
        bank.transfer(3, 4, 15);
        bank.withdraw(10, 50);

    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 > n || account2 > n) {
            return false;
        }
        if (balance[account1 - 1] >= money) {
            balance[account1 - 1] -= money;
            balance[account2 - 1] += money;
            return true;
        }

        return false;
    }

    public boolean deposit(int account, long money) {
        if (account > n) {
            return false;
        }

        balance[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {

        if (account > n) {
            return false;
        }

        if (balance[account - 1] >= money) {
            balance[account - 1] -= money;
            return true;
        }
        return false;
    }
}
