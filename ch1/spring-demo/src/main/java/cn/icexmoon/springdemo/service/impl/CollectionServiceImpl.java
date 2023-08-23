package cn.icexmoon.springdemo.service.impl;

import cn.icexmoon.springdemo.entity.Person;
import cn.icexmoon.springdemo.service.CollectionService;
import lombok.Setter;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : spring-demo
 * @Package : cn.icexmoon.springdemo.service.impl
 * @ClassName : .java
 * @createTime : 2023/8/21 14:20
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Setter
public class CollectionServiceImpl implements CollectionService {
    private Object[] array;
    private List<Object> list;
    private Set<Object> set;
    private Map<String, Object> map;
    private Properties properties;
    private List<Person> persons;

    @Override
    public void print() {
        System.out.println("array:" + Arrays.toString(array));
        System.out.println("list:" + list);
        System.out.println("set:" + set);
        System.out.println("map:" + map);
        System.out.println("properties:" + properties);
        System.out.println("persons:" + persons);
    }
}
