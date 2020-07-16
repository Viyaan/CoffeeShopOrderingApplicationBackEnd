package com.coffee.orderingapp.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.coffee.orderingapp.entity.Order;
import com.coffee.orderingapp.enums.TokenStatus;

/**
 * @author Viyaan
 * 
 *         This class will create random token within 1 to 50, when ever an
 *         order is being placed a token is assigned to that order. Once
 *         assigned it will added in an hashmap with value Active. Once the
 *         order is delivered the status will be changed to Inactive. For
 *         subsequent order, application will be able to use the same token no
 *         only when its status is inactive.
 *
 */
public class TokenGenerator {
	public static Order getToken(Order order) {
		Map<Integer, TokenStatus> tokenMap = new ConcurrentHashMap<Integer, TokenStatus>();
		int random = (int) (Math.random() * 50 + 1);
		if (tokenMap.containsKey(random) && tokenMap.get(random) == TokenStatus.ACTIVE) {
			tokenMap.put(random, TokenStatus.INACTIVE);
		} else {
			order.setTokenNo(random);
			tokenMap.put(random, TokenStatus.ACTIVE);
		}
		return order;
	}
}
