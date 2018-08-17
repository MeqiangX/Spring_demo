package cn.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * 切面类
 * @author xq
 *
 */
@Aspect
public class Aspects {
	
	
	@Around(value="execution(* cn.springaop.service.UserServiceImpl.*(..))")
	public void log(ProceedingJoinPoint joinPoint){
		
		//环绕通知比较特殊 因为要控制 执行前后的 操作  所以要手动执行目标方法
		
		try{
			System.out.println("记录日志");
			joinPoint.proceed(); //执行目标方法
			System.out.println("记录完成");
		}catch(Throwable e){
			e.printStackTrace();
		}
	}
}
