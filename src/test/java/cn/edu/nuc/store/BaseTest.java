package cn.edu.nuc.store;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//下边这个类完成了被spring扫描、并且谁要继承该类，谁就会被扫描。
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class BaseTest {
	
}
