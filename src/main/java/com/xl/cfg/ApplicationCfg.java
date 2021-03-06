package com.xl.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration // 用于表示当前类为容器的配置类，类似<beans/>
@ComponentScan(basePackages = "com.xl.aop.impl,com.xl.aspects") // 扫描的范围，相当于xml配置的结点<context:component-scan/>
@EnableAspectJAutoProxy(proxyTargetClass = true) // 自动代理，相当于<aop:aspectj-autoproxy
													// proxy-target-class="true"></aop:aspectj-autoproxy>
public class ApplicationCfg {

}
