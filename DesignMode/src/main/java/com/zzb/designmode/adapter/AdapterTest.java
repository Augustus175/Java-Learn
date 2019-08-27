package com.zzb.designmode.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        DualPin myTV = new TV();
        Adapter adapter = new Adapter(myTV);
        adapter.electricfy(1, 2, 3);
    }
}
