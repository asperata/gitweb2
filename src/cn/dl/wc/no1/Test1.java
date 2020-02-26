package cn.dl.wc.no1;
/*
 * 1、客户端必须先更新(pull)再提交（commit and push）
 * 2、再提交的时候，不要全项目一起提交，写了哪个文件，就只提交哪个文件；
 * 3、解决完冲突后，我们再次重新提交代码，就可以把自己写的代码同步到服务器了，本地库也同时得到更新；
 * 
 * 
 */
public class Test1 {
	public void show() {
		System.out.println("1111");
		System.out.println("你好");
		System.out.println("world");
		System.out.println("22222222");
		System.out.println("111111");
	}
}
