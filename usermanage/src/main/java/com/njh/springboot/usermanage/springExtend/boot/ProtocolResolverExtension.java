package com.njh.springboot.usermanage.springExtend.boot;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: ProtocolResolverExtension
 * @Author: njh
 * @Description: ProtocolResolver是一个策略接口，可以用于自定义协议解析， 比如spring就有一个 “classpath:”开头的特定协议（但是spring并不是自定义ProtocolResolver 实现来完成这个功能的）
 *              自定义MyProtocolResolver,加载资源时，当我们输入的资源路径以path:开头时，就会加载相对路径下的config/下相应的资源。
 */
public class ProtocolResolverExtension implements ProtocolResolver {
    public static final String PATH = "path:";

    @Override
    public Resource resolve(String location, ResourceLoader resourceLoader) {
        if (!location.startsWith(PATH))
            return null;
        String realPath = location.substring(5);
        String classPath = "classpath:config/" + realPath;

        return resourceLoader.getResource(classPath);
    }

    /*
     * 在spring上下文中测试
     **/
    public static void main(String[] args) throws IOException {
        DefaultResourceLoader resourceLoader=new DefaultResourceLoader();
        resourceLoader.addProtocolResolver(new ProtocolResolverExtension());
        Resource resource = resourceLoader.getResource("path:config.txt");
        InputStream inputStream = resource.getInputStream();
        StringBuffer out = new StringBuffer();
        byte[] b = new byte[4096];
        for (int n; (n = inputStream.read(b)) != -1; ) {
            out.append(new String(b, 0, n));
        }
        System.out.println(out);
    }
}
