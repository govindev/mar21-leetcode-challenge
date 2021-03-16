package com.govindev.leetcode.challenge.mar21;

import java.util.Map;
import java.util.Random;
import java.util.HashMap;

/***
 * Encode and Decode Tiny URL
 * 
 * https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/590/week-3-march-15th-march-21st/3673/
 * 
 * @author Govind
 *
 */

public class EncodeAndDecodeTinyURL {
	Map<Integer, String> urls = new HashMap<Integer, String>();
	int i = 0;

	// Encodes a URL to a shortened URL.
	public String encode1(String longUrl) {
		urls.put(i, longUrl);
		return "http://tinyurl.com/" + i++;
	}

	// Decodes a shortened URL to its original URL.
	public String decode1(String shortUrl) {
		shortUrl = shortUrl.replace("http://tinyurl.com/", "");
		return urls.get(Integer.parseInt(shortUrl));
	}

	// Using Hashcode
	public String encode2(String longUrl) {
		urls.put(longUrl.hashCode(), longUrl);
		return "http://tinyurl.com/" + longUrl.hashCode();
	}

	public String decode2(String shortUrl) {
		shortUrl = shortUrl.replace("http://tinyurl.com/", "");
		return urls.get(Integer.parseInt(shortUrl));
	}

	// Using Randome Number
	Random r = new Random();
	int key = r.nextInt(Integer.MAX_VALUE);

	public String encode(String longUrl) {
		if (urls.containsKey(key)) {
			key = r.nextInt(Integer.MAX_VALUE);
		}
		urls.put(key, longUrl);
		return "http://tinyurl.com/" + key;
	}

	public String decode(String shortUrl) {
		shortUrl = shortUrl.replace("http://tinyurl.com/", "");
		return urls.get(Integer.parseInt(shortUrl));
	}
}
//Your Codec object will be instantiated and called as such:
//Codec codec = new Codec();
//codec.decode(codec.encode(url));