package cn.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * ������
 * @author xq
 *
 */
@Aspect
public class Aspects {
	
	
	@Around(value="execution(* cn.springaop.service.UserServiceImpl.*(..))")
	public void log(ProceedingJoinPoint joinPoint){
		
		//����֪ͨ�Ƚ����� ��ΪҪ���� ִ��ǰ��� ����  ����Ҫ�ֶ�ִ��Ŀ�귽��
		
		try{
			System.out.println("��¼��־");
			joinPoint.proceed(); //ִ��Ŀ�귽��
			System.out.println("��¼���");
		}catch(Throwable e){
			e.printStackTrace();
		}
	}
}
