package org.ks.algorithm;

/**
 * Created by Kevin on 2017/3/23.
 */

import java.util.HashMap;

/***
 * TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it
 * returns a short URL such as http://tinyurl.com/4e9iAk.
 * Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode
 * algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be
 * decoded to the original URL.
 * Subscribe to see which companies asked this question.
 */
public class EncodeAndDecodeTinyURL {
    private static HashMap cache = new HashMap();
    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        cache.put(longUrl.hashCode(), longUrl);
        return String.valueOf(longUrl.hashCode());
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        return cache.get(Integer.valueOf(shortUrl)).toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("https://leetcode.com/problems/design-tinyurl"));
        System.out.println(decode(encode("https://leetcode.com/problems/design-tinyurl")));
    }
}
