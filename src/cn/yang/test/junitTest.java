package cn.yang.test;



import cn.yang.analysis.Main;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;



public class junitTest {
	Main m=new Main();
	@Before
	public void setUp() throws Exception {
		
	}

//	@Test
//	public void test() throws IOException {
//		//读取文件
//		List<String>strList= m.readTestFile("D:/1.txt");
//		String [] list=null;
//		for(int i=0;i<strList.size();i++){//按行读取
//			System.out.println("进行第"+(i+1)+"行的判断：");
//			list=m.Divide(strList.get(i));	//按行读入
//			m.Sort(list);//将读到的放到方法
//		}
//	}

}
