pubic static MyCacheUtil{
	
	public static String interKeys(String... keys){
		Jedis jedis = null;

		try{
			jedis = JedisPoolUtils.getJedis()
		} catch(Exception e){
			return null;
		}
		
		String k0 = "combine";

		for(int i=0; i<keys.length; i++){
			k0 = k0 + "_" + keys[i];
		}
		
	}
}
