package org.idekerlab.PanGIAPlugin.util;

import java.util.Random;

/**
 * Created by David Welker on 2/21/14
 */
public class RandomFactory
{
	private static Long seed = null;

	public static void setSeed(long seed)
	{
		RandomFactory.seed = seed;
	}
	public static void destroySeed() { seed = null; }

	public static Random make()
	{
		if( seed != null )
			return new Random(seed);
		return new Random();
	}



}
