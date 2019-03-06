package com.ushiro.demo.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 * @author Kripath
 * @date Created in 16:48 2019/3/6
 */
public class FilterChain extends Filter {

    private List<Filter> filters = new ArrayList<>();

    void addFilter(Filter filter) {
        filters.add(filter);
    }

    @Override
    boolean isKeep(Person person) {
        for (Filter filter: filters) {
            if(!filter.isKeep(person)) {
                // 有一个过滤器不过滤就直接返回失败
                return false;
            }
        }
        return true;
    }
}
