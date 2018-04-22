package org.ks.algorithm;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Kevin on 2016/11/29.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        ArrayList<Integer> lg = new ArrayList<Integer>();
        for (int i = 0; i < g.length; i++) {
            lg.add(g[i]);
        }
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < s.length; i++) {
            ls.add(s[i]);
        }

        Collections.sort(lg);
        Collections.sort(ls);

        int content = 0;
        int k = 0;

        for (int i = 0; i < ls.size(); i++) {
            for (int j = k; j < lg.size(); j++) {
                if (ls.get(i) < lg.get(j))
                    continue;
                else {
                    content += 1;
                    k = j + 1;
                    break;
                }
            }
        }

        return content;
    }
}
