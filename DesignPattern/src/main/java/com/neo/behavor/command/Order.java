package com.neo.behavor.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : neo
 * @Date 2021/3/27 15:31
 * @Description : 订单类
 */
public class Order {

    //餐桌号
    private int diningTable;
    //所点食物清单
    private Map<String, Integer> foodDic = new HashMap<String, Integer>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name, int num) {
        foodDic.put(name, num);
    }
}
