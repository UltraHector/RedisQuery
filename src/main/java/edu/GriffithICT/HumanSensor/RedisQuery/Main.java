package edu.GriffithICT.HumanSensor.RedisQuery;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class Main {
	
	public static Jedis jedis;

	public static void main(String[] args) {
		// Connecting to Redis on localhost
		jedis = new Jedis("localhost");
		
		initializeTestData();
		
		
		Set<String> keys = jedis.keys("*1461121403184*");
		
		for(String key : keys){	
			System.out.println(key + ":" + jedis.get(key));
		}

	}
	
	
	
	/*
	 * set up test data
	 */
	private static void initializeTestData(){
		
		jedis.set("1461121403184_tips_travel", "10");
		jedis.set("1461121403184_favor_manta", "20");
		jedis.set("1461121403184_hectic_rt", "30");
		jedis.set("1461121403184_like_vacation", "40");
		jedis.set("1461121403184_following_spreading", "50");
		jedis.set("1461121403184_traveling_twin", "60");
		
		
		jedis.set("1461294203184_tips_travel", "10");
		jedis.set("1461294203184_favor_manta", "20");
		jedis.set("1461294203184_hectic_rt", "30");
		jedis.set("1461294203184_like_vacation", "40");
		jedis.set("1461294203184_following_spreading", "50");
		jedis.set("1461294203184_traveling_twin", "60");
		
		
		jedis.set("1461467003184_tips_travel", "10");
		jedis.set("1461467003184_favor_manta", "20");
		jedis.set("1461467003184_hectic_rt", "30");
		jedis.set("1461467003184_like_vacation", "40");
		jedis.set("1461467003184_following_spreading", "50");
		jedis.set("1461467003184_traveling_twin", "60");
		
		
		
	}
}
