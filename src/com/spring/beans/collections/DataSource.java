package com.spring.beans.collections;

import java.util.Properties;

/**
 * @author wangxin
 * @description 测试springmap
 * @create 2020/1/23
 **/
public class DataSource {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}
