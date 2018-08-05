package com.coffee.orderingapp.util;

import java.util.HashMap;
import java.util.Map;

import com.coffee.orderingapp.entity.Order;

public class TokenGenerator {
	public static Order getToken(Order o) {
	Map<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
	 int random = (int )(Math. random() * 50 + 1);
	if(hm.containsKey(random) && hm.get(random)==true)
	{
		hm.put(random, false);
	}
	else
	{
		o.setTokenNo(random);
		hm.put(random, true);
	}
	return o;
	}
}
