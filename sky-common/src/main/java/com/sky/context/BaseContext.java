package com.sky.context;

/**
 * ThreadLocal工具类
 * 作用：对当前线程进行“id”的增删改操作
 *
 * 由于需要在不同的层次共享ThreadLocal
 * 因此，将创建当前线程的实例副本，交给外部以实现在不同层次|包下的共享
 *
 * 任何需要在多个包或层次之间共享的对象，
 * 你都需要设计一种机制来确保这些对象可以被安全、有效地访问和管理。
 * 这通常涉及到封装、依赖注入、服务定位器模式或其他相关设计模式的使用。
 *
 */
public class BaseContext {

    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }

    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
