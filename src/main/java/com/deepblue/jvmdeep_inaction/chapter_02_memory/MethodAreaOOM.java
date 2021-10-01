package com.deepblue.jvmdeep_inaction.chapter_02_memory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * VM args: -XX:PermSize=2M -XX:MaxPermSize=2M
 */
public class MethodAreaOOM {

	public interface Super {
		void sayHello();
	}

	public static class OOMObject implements Super{
		@Override
		public void sayHello() {
			System.out.println(this.getClass().getSimpleName() + " sayHello method invoked!");
		}
	}

	public static void main(String[] args) {
		while (true) {
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(OOMObject.class);
			enhancer.setUseCache(false);
			enhancer.setCallback(new MethodInterceptor() {
				@Override
				public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
					return methodProxy.invokeSuper(o, objects);
				}
			});

			OOMObject object = (OOMObject) enhancer.create();
			object.sayHello();
		}

	}

}
