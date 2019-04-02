public class JedisPoolUtils{

	public static JedisPoolCofig c = new JedisPoolConfig();
	public static JedisPool jedisPool = null;

	static {
		etLifo(true); // 后进先出
		c.setMaxIdle(10); // 最大空闲连接数为10
		c.setMinIdle(0); // 最小空闲连接数为0
		c.setMaxTotal(100); // 最大连接数为100
		c.setMaxWaitMillis(-1); // 设置最大等待毫秒数：无限制
		c.setMinEvictableIdleTimeMillis(180); // 逐出连接的最小空闲时间：30分钟
		c.setTestOnBorrow(true); // 获取连接时是否检查连接的有效性：是
		c.setTestWhileIdle(true); // 空闲时是否检查连接的有效性：是

		jedisPool = new JedisPool(c, "39.96.39.7", 6379);
	}
	
	public static Jedis getJedis(){
		return jedisPool.getResource();
	}

}

